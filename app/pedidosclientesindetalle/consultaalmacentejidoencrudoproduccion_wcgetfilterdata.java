package app.pedidosclientesindetalle ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class consultaalmacentejidoencrudoproduccion_wcgetfilterdata extends GXProcedure
{
   public consultaalmacentejidoencrudoproduccion_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaalmacentejidoencrudoproduccion_wcgetfilterdata.class ), "" );
   }

   public consultaalmacentejidoencrudoproduccion_wcgetfilterdata( int remoteHandle ,
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
      consultaalmacentejidoencrudoproduccion_wcgetfilterdata.this.aP5 = new String[] {""};
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
      consultaalmacentejidoencrudoproduccion_wcgetfilterdata.this.AV36DDOName = aP0;
      consultaalmacentejidoencrudoproduccion_wcgetfilterdata.this.AV34SearchTxt = aP1;
      consultaalmacentejidoencrudoproduccion_wcgetfilterdata.this.AV35SearchTxtTo = aP2;
      consultaalmacentejidoencrudoproduccion_wcgetfilterdata.this.aP3 = aP3;
      consultaalmacentejidoencrudoproduccion_wcgetfilterdata.this.aP4 = aP4;
      consultaalmacentejidoencrudoproduccion_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARAGREST") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRESTOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV36DDOName), "DDO_BARFASCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADBARFASCODOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV40OptionsJson = AV39Options.toJSonString(false) ;
      AV43OptionsDescJson = AV42OptionsDesc.toJSonString(false) ;
      AV45OptionIndexesJson = AV44OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue("PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV47Session.getValue("PedidosClienteSinDetalle.ConsultaAlmacenTejidoencrudoProduccion_WCGridState"), null, null);
      }
      AV57GXV1 = 1 ;
      while ( AV57GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV57GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV12TFBarSer = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV13TFBarSer_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV14TFBarSerDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV15TFBarSerDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV16TFBarColNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV17TFBarColNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV18TFBarColNum = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFBarColNum_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV20TFBarNomCli = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV21TFBarNomCli_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV22TFBarPieKil = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFBarPieKil_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV24TFBarPieMet = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFBarPieMet_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEPIE") == 0 )
         {
            AV26TFBarPiePie = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFBarPiePie_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV28TFBarAgrEst = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV29TFBarAgrEst_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV30TFBarFasCod = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV31TFBarFasCod_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCUM") == 0 )
         {
            AV32TFBarFecCum = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV57GXV1 = (int)(AV57GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV34SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV52FilterFullText ;
      AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV12TFBarSer ;
      AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV16TFBarColNom ;
      AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV18TFBarColNum ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV19TFBarColNum_To ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV20TFBarNomCli ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV21TFBarNomCli_Sel ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV22TFBarPieKil ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV23TFBarPieKil_To ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV24TFBarPieMet ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV25TFBarPieMet_To ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV26TFBarPiePie ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV27TFBarPiePie_To ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV28TFBarAgrEst ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV29TFBarAgrEst_Sel ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV30TFBarFasCod ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV31TFBarFasCod_Sel ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV32TFBarFecCum ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) ,
                                           AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) ,
                                           AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           A120BarAgrEst ,
                                           AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV53Emprcod ,
                                           Integer.valueOf(AV54ALbrecCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod), 8, "%") ;
      lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr), 11, "%") ;
      lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser), 16, "%") ;
      lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc), 26, "%") ;
      lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom), 13, "%") ;
      lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli), 13, "%") ;
      lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P09K18 */
      pr_default.execute(0, new Object[] {AV53Emprcod, Integer.valueOf(AV54ALbrecCod), AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr, AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel, lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser, AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel, lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc, AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel, lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom, AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel, Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum), Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to), lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli, AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to, Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie), Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to), lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest, AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P09K18_A44AlbRecCod[0] ;
         A396EmprCod = P09K18_A396EmprCod[0] ;
         A120BarAgrEst = P09K18_A120BarAgrEst[0] ;
         A1501BarPiePie = P09K18_A1501BarPiePie[0] ;
         A205BarPieMet = P09K18_A205BarPieMet[0] ;
         A203BarPieKil = P09K18_A203BarPieKil[0] ;
         A1234BarNomCli = P09K18_A1234BarNomCli[0] ;
         A136BarColNum = P09K18_A136BarColNum[0] ;
         A135BarColNom = P09K18_A135BarColNom[0] ;
         A1652BarSerDsc = P09K18_A1652BarSerDsc[0] ;
         A212BarSer = P09K18_A212BarSer[0] ;
         A13696BarNHdr = P09K18_A13696BarNHdr[0] ;
         A156BarFecCum = P09K18_A156BarFecCum[0] ;
         n156BarFecCum = P09K18_n156BarFecCum[0] ;
         A151BarFasCod = P09K18_A151BarFasCod[0] ;
         n151BarFasCod = P09K18_n151BarFasCod[0] ;
         A129BarCod = P09K18_A129BarCod[0] ;
         A132BarCodReo = P09K18_A132BarCodReo[0] ;
         A130BarCodPar = P09K18_A130BarCodPar[0] ;
         A200BarPieCod = P09K18_A200BarPieCod[0] ;
         A120BarAgrEst = P09K18_A120BarAgrEst[0] ;
         A1234BarNomCli = P09K18_A1234BarNomCli[0] ;
         A136BarColNum = P09K18_A136BarColNum[0] ;
         A135BarColNom = P09K18_A135BarColNom[0] ;
         A1652BarSerDsc = P09K18_A1652BarSerDsc[0] ;
         A212BarSer = P09K18_A212BarSer[0] ;
         A13696BarNHdr = P09K18_A13696BarNHdr[0] ;
         A156BarFecCum = P09K18_A156BarFecCum[0] ;
         n156BarFecCum = P09K18_n156BarFecCum[0] ;
         A151BarFasCod = P09K18_A151BarFasCod[0] ;
         n151BarFasCod = P09K18_n151BarFasCod[0] ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV38Option = A13696BarNHdr ;
            AV37InsertIndex = 1 ;
            while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
            {
               AV37InsertIndex = (int)(AV37InsertIndex+1) ;
            }
            if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
            {
               AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
               AV46count = (long)(AV46count+1) ;
               AV44OptionIndexes.removeItem(AV37InsertIndex);
               AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
            }
            else
            {
               AV39Options.add(AV38Option, AV37InsertIndex);
               AV44OptionIndexes.add("1", AV37InsertIndex);
            }
         }
         if ( AV39Options.size() == 50 )
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
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV12TFBarSer = AV34SearchTxt ;
      AV13TFBarSer_Sel = "" ;
      AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV52FilterFullText ;
      AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV12TFBarSer ;
      AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV16TFBarColNom ;
      AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV18TFBarColNum ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV19TFBarColNum_To ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV20TFBarNomCli ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV21TFBarNomCli_Sel ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV22TFBarPieKil ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV23TFBarPieKil_To ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV24TFBarPieMet ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV25TFBarPieMet_To ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV26TFBarPiePie ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV27TFBarPiePie_To ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV28TFBarAgrEst ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV29TFBarAgrEst_Sel ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV30TFBarFasCod ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV31TFBarFasCod_Sel ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV32TFBarFecCum ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) ,
                                           AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) ,
                                           AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           A120BarAgrEst ,
                                           AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV54ALbrecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod), 8, "%") ;
      lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr), 11, "%") ;
      lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser), 16, "%") ;
      lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc), 26, "%") ;
      lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom), 13, "%") ;
      lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli), 13, "%") ;
      lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P09K115 */
      pr_default.execute(1, new Object[] {AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV53Emprcod, Integer.valueOf(AV54ALbrecCod), lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr, AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel, lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser, AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel, lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc, AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel, lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom, AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel, Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum), Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to), lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli, AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to, Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie), Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to), lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest, AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9K13 = false ;
         A396EmprCod = P09K115_A396EmprCod[0] ;
         A44AlbRecCod = P09K115_A44AlbRecCod[0] ;
         A212BarSer = P09K115_A212BarSer[0] ;
         A120BarAgrEst = P09K115_A120BarAgrEst[0] ;
         A1501BarPiePie = P09K115_A1501BarPiePie[0] ;
         A205BarPieMet = P09K115_A205BarPieMet[0] ;
         A203BarPieKil = P09K115_A203BarPieKil[0] ;
         A1234BarNomCli = P09K115_A1234BarNomCli[0] ;
         A136BarColNum = P09K115_A136BarColNum[0] ;
         A135BarColNom = P09K115_A135BarColNom[0] ;
         A1652BarSerDsc = P09K115_A1652BarSerDsc[0] ;
         A13696BarNHdr = P09K115_A13696BarNHdr[0] ;
         A156BarFecCum = P09K115_A156BarFecCum[0] ;
         n156BarFecCum = P09K115_n156BarFecCum[0] ;
         A151BarFasCod = P09K115_A151BarFasCod[0] ;
         n151BarFasCod = P09K115_n151BarFasCod[0] ;
         A129BarCod = P09K115_A129BarCod[0] ;
         A132BarCodReo = P09K115_A132BarCodReo[0] ;
         A130BarCodPar = P09K115_A130BarCodPar[0] ;
         A200BarPieCod = P09K115_A200BarPieCod[0] ;
         A212BarSer = P09K115_A212BarSer[0] ;
         A120BarAgrEst = P09K115_A120BarAgrEst[0] ;
         A1234BarNomCli = P09K115_A1234BarNomCli[0] ;
         A136BarColNum = P09K115_A136BarColNum[0] ;
         A135BarColNom = P09K115_A135BarColNom[0] ;
         A1652BarSerDsc = P09K115_A1652BarSerDsc[0] ;
         A13696BarNHdr = P09K115_A13696BarNHdr[0] ;
         A156BarFecCum = P09K115_A156BarFecCum[0] ;
         n156BarFecCum = P09K115_n156BarFecCum[0] ;
         A151BarFasCod = P09K115_A151BarFasCod[0] ;
         n151BarFasCod = P09K115_n151BarFasCod[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09K115_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk9K13 = false ;
            A396EmprCod = P09K115_A396EmprCod[0] ;
            A129BarCod = P09K115_A129BarCod[0] ;
            A132BarCodReo = P09K115_A132BarCodReo[0] ;
            A130BarCodPar = P09K115_A130BarCodPar[0] ;
            A200BarPieCod = P09K115_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9K13 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV38Option = A212BarSer ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9K13 )
         {
            brk9K13 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarSerDsc = AV34SearchTxt ;
      AV15TFBarSerDsc_Sel = "" ;
      AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV52FilterFullText ;
      AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV12TFBarSer ;
      AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV16TFBarColNom ;
      AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV18TFBarColNum ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV19TFBarColNum_To ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV20TFBarNomCli ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV21TFBarNomCli_Sel ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV22TFBarPieKil ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV23TFBarPieKil_To ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV24TFBarPieMet ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV25TFBarPieMet_To ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV26TFBarPiePie ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV27TFBarPiePie_To ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV28TFBarAgrEst ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV29TFBarAgrEst_Sel ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV30TFBarFasCod ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV31TFBarFasCod_Sel ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV32TFBarFecCum ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) ,
                                           AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) ,
                                           AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           A120BarAgrEst ,
                                           AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV54ALbrecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod), 8, "%") ;
      lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr), 11, "%") ;
      lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser), 16, "%") ;
      lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc), 26, "%") ;
      lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom), 13, "%") ;
      lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli), 13, "%") ;
      lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P09K122 */
      pr_default.execute(2, new Object[] {AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV53Emprcod, Integer.valueOf(AV54ALbrecCod), lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr, AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel, lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser, AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel, lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc, AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel, lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom, AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel, Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum), Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to), lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli, AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to, Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie), Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to), lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest, AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9K15 = false ;
         A396EmprCod = P09K122_A396EmprCod[0] ;
         A44AlbRecCod = P09K122_A44AlbRecCod[0] ;
         A1652BarSerDsc = P09K122_A1652BarSerDsc[0] ;
         A120BarAgrEst = P09K122_A120BarAgrEst[0] ;
         A1501BarPiePie = P09K122_A1501BarPiePie[0] ;
         A205BarPieMet = P09K122_A205BarPieMet[0] ;
         A203BarPieKil = P09K122_A203BarPieKil[0] ;
         A1234BarNomCli = P09K122_A1234BarNomCli[0] ;
         A136BarColNum = P09K122_A136BarColNum[0] ;
         A135BarColNom = P09K122_A135BarColNom[0] ;
         A212BarSer = P09K122_A212BarSer[0] ;
         A13696BarNHdr = P09K122_A13696BarNHdr[0] ;
         A156BarFecCum = P09K122_A156BarFecCum[0] ;
         n156BarFecCum = P09K122_n156BarFecCum[0] ;
         A151BarFasCod = P09K122_A151BarFasCod[0] ;
         n151BarFasCod = P09K122_n151BarFasCod[0] ;
         A129BarCod = P09K122_A129BarCod[0] ;
         A132BarCodReo = P09K122_A132BarCodReo[0] ;
         A130BarCodPar = P09K122_A130BarCodPar[0] ;
         A200BarPieCod = P09K122_A200BarPieCod[0] ;
         A1652BarSerDsc = P09K122_A1652BarSerDsc[0] ;
         A120BarAgrEst = P09K122_A120BarAgrEst[0] ;
         A1234BarNomCli = P09K122_A1234BarNomCli[0] ;
         A136BarColNum = P09K122_A136BarColNum[0] ;
         A135BarColNom = P09K122_A135BarColNom[0] ;
         A212BarSer = P09K122_A212BarSer[0] ;
         A13696BarNHdr = P09K122_A13696BarNHdr[0] ;
         A156BarFecCum = P09K122_A156BarFecCum[0] ;
         n156BarFecCum = P09K122_n156BarFecCum[0] ;
         A151BarFasCod = P09K122_A151BarFasCod[0] ;
         n151BarFasCod = P09K122_n151BarFasCod[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09K122_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk9K15 = false ;
            A396EmprCod = P09K122_A396EmprCod[0] ;
            A129BarCod = P09K122_A129BarCod[0] ;
            A132BarCodReo = P09K122_A132BarCodReo[0] ;
            A130BarCodPar = P09K122_A130BarCodPar[0] ;
            A200BarPieCod = P09K122_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9K15 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV38Option = A1652BarSerDsc ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9K15 )
         {
            brk9K15 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarColNom = AV34SearchTxt ;
      AV17TFBarColNom_Sel = "" ;
      AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV52FilterFullText ;
      AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV12TFBarSer ;
      AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV16TFBarColNom ;
      AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV18TFBarColNum ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV19TFBarColNum_To ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV20TFBarNomCli ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV21TFBarNomCli_Sel ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV22TFBarPieKil ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV23TFBarPieKil_To ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV24TFBarPieMet ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV25TFBarPieMet_To ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV26TFBarPiePie ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV27TFBarPiePie_To ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV28TFBarAgrEst ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV29TFBarAgrEst_Sel ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV30TFBarFasCod ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV31TFBarFasCod_Sel ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV32TFBarFecCum ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) ,
                                           AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) ,
                                           AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           A120BarAgrEst ,
                                           AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV54ALbrecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod), 8, "%") ;
      lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr), 11, "%") ;
      lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser), 16, "%") ;
      lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc), 26, "%") ;
      lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom), 13, "%") ;
      lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli), 13, "%") ;
      lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P09K129 */
      pr_default.execute(3, new Object[] {AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV53Emprcod, Integer.valueOf(AV54ALbrecCod), lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr, AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel, lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser, AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel, lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc, AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel, lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom, AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel, Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum), Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to), lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli, AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to, Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie), Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to), lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest, AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9K17 = false ;
         A396EmprCod = P09K129_A396EmprCod[0] ;
         A44AlbRecCod = P09K129_A44AlbRecCod[0] ;
         A135BarColNom = P09K129_A135BarColNom[0] ;
         A120BarAgrEst = P09K129_A120BarAgrEst[0] ;
         A1501BarPiePie = P09K129_A1501BarPiePie[0] ;
         A205BarPieMet = P09K129_A205BarPieMet[0] ;
         A203BarPieKil = P09K129_A203BarPieKil[0] ;
         A1234BarNomCli = P09K129_A1234BarNomCli[0] ;
         A136BarColNum = P09K129_A136BarColNum[0] ;
         A1652BarSerDsc = P09K129_A1652BarSerDsc[0] ;
         A212BarSer = P09K129_A212BarSer[0] ;
         A13696BarNHdr = P09K129_A13696BarNHdr[0] ;
         A156BarFecCum = P09K129_A156BarFecCum[0] ;
         n156BarFecCum = P09K129_n156BarFecCum[0] ;
         A151BarFasCod = P09K129_A151BarFasCod[0] ;
         n151BarFasCod = P09K129_n151BarFasCod[0] ;
         A129BarCod = P09K129_A129BarCod[0] ;
         A132BarCodReo = P09K129_A132BarCodReo[0] ;
         A130BarCodPar = P09K129_A130BarCodPar[0] ;
         A200BarPieCod = P09K129_A200BarPieCod[0] ;
         A135BarColNom = P09K129_A135BarColNom[0] ;
         A120BarAgrEst = P09K129_A120BarAgrEst[0] ;
         A1234BarNomCli = P09K129_A1234BarNomCli[0] ;
         A136BarColNum = P09K129_A136BarColNum[0] ;
         A1652BarSerDsc = P09K129_A1652BarSerDsc[0] ;
         A212BarSer = P09K129_A212BarSer[0] ;
         A13696BarNHdr = P09K129_A13696BarNHdr[0] ;
         A156BarFecCum = P09K129_A156BarFecCum[0] ;
         n156BarFecCum = P09K129_n156BarFecCum[0] ;
         A151BarFasCod = P09K129_A151BarFasCod[0] ;
         n151BarFasCod = P09K129_n151BarFasCod[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09K129_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk9K17 = false ;
            A396EmprCod = P09K129_A396EmprCod[0] ;
            A129BarCod = P09K129_A129BarCod[0] ;
            A132BarCodReo = P09K129_A132BarCodReo[0] ;
            A130BarCodPar = P09K129_A130BarCodPar[0] ;
            A200BarPieCod = P09K129_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9K17 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV38Option = A135BarColNom ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9K17 )
         {
            brk9K17 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarNomCli = AV34SearchTxt ;
      AV21TFBarNomCli_Sel = "" ;
      AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV52FilterFullText ;
      AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV12TFBarSer ;
      AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV16TFBarColNom ;
      AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV18TFBarColNum ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV19TFBarColNum_To ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV20TFBarNomCli ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV21TFBarNomCli_Sel ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV22TFBarPieKil ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV23TFBarPieKil_To ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV24TFBarPieMet ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV25TFBarPieMet_To ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV26TFBarPiePie ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV27TFBarPiePie_To ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV28TFBarAgrEst ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV29TFBarAgrEst_Sel ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV30TFBarFasCod ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV31TFBarFasCod_Sel ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV32TFBarFecCum ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) ,
                                           AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) ,
                                           AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           A120BarAgrEst ,
                                           AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV54ALbrecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod), 8, "%") ;
      lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr), 11, "%") ;
      lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser), 16, "%") ;
      lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc), 26, "%") ;
      lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom), 13, "%") ;
      lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli), 13, "%") ;
      lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P09K136 */
      pr_default.execute(4, new Object[] {AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV53Emprcod, Integer.valueOf(AV54ALbrecCod), lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr, AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel, lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser, AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel, lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc, AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel, lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom, AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel, Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum), Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to), lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli, AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to, Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie), Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to), lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest, AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9K19 = false ;
         A396EmprCod = P09K136_A396EmprCod[0] ;
         A44AlbRecCod = P09K136_A44AlbRecCod[0] ;
         A1234BarNomCli = P09K136_A1234BarNomCli[0] ;
         A120BarAgrEst = P09K136_A120BarAgrEst[0] ;
         A1501BarPiePie = P09K136_A1501BarPiePie[0] ;
         A205BarPieMet = P09K136_A205BarPieMet[0] ;
         A203BarPieKil = P09K136_A203BarPieKil[0] ;
         A136BarColNum = P09K136_A136BarColNum[0] ;
         A135BarColNom = P09K136_A135BarColNom[0] ;
         A1652BarSerDsc = P09K136_A1652BarSerDsc[0] ;
         A212BarSer = P09K136_A212BarSer[0] ;
         A13696BarNHdr = P09K136_A13696BarNHdr[0] ;
         A156BarFecCum = P09K136_A156BarFecCum[0] ;
         n156BarFecCum = P09K136_n156BarFecCum[0] ;
         A151BarFasCod = P09K136_A151BarFasCod[0] ;
         n151BarFasCod = P09K136_n151BarFasCod[0] ;
         A129BarCod = P09K136_A129BarCod[0] ;
         A132BarCodReo = P09K136_A132BarCodReo[0] ;
         A130BarCodPar = P09K136_A130BarCodPar[0] ;
         A200BarPieCod = P09K136_A200BarPieCod[0] ;
         A1234BarNomCli = P09K136_A1234BarNomCli[0] ;
         A120BarAgrEst = P09K136_A120BarAgrEst[0] ;
         A136BarColNum = P09K136_A136BarColNum[0] ;
         A135BarColNom = P09K136_A135BarColNom[0] ;
         A1652BarSerDsc = P09K136_A1652BarSerDsc[0] ;
         A212BarSer = P09K136_A212BarSer[0] ;
         A13696BarNHdr = P09K136_A13696BarNHdr[0] ;
         A156BarFecCum = P09K136_A156BarFecCum[0] ;
         n156BarFecCum = P09K136_n156BarFecCum[0] ;
         A151BarFasCod = P09K136_A151BarFasCod[0] ;
         n151BarFasCod = P09K136_n151BarFasCod[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09K136_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk9K19 = false ;
            A396EmprCod = P09K136_A396EmprCod[0] ;
            A129BarCod = P09K136_A129BarCod[0] ;
            A132BarCodReo = P09K136_A132BarCodReo[0] ;
            A130BarCodPar = P09K136_A130BarCodPar[0] ;
            A200BarPieCod = P09K136_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9K19 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV38Option = A1234BarNomCli ;
            AV39Options.add(AV38Option, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9K19 )
         {
            brk9K19 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARAGRESTOPTIONS' Routine */
      returnInSub = false ;
      AV28TFBarAgrEst = AV34SearchTxt ;
      AV29TFBarAgrEst_Sel = "" ;
      AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV52FilterFullText ;
      AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV12TFBarSer ;
      AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV16TFBarColNom ;
      AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV18TFBarColNum ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV19TFBarColNum_To ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV20TFBarNomCli ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV21TFBarNomCli_Sel ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV22TFBarPieKil ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV23TFBarPieKil_To ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV24TFBarPieMet ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV25TFBarPieMet_To ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV26TFBarPiePie ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV27TFBarPiePie_To ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV28TFBarAgrEst ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV29TFBarAgrEst_Sel ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV30TFBarFasCod ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV31TFBarFasCod_Sel ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV32TFBarFecCum ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) ,
                                           AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) ,
                                           AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           A120BarAgrEst ,
                                           AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           A396EmprCod ,
                                           AV53Emprcod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV54ALbrecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod), 8, "%") ;
      lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr), 11, "%") ;
      lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser), 16, "%") ;
      lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc), 26, "%") ;
      lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom), 13, "%") ;
      lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli), 13, "%") ;
      lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P09K143 */
      pr_default.execute(5, new Object[] {AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV53Emprcod, Integer.valueOf(AV54ALbrecCod), lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr, AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel, lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser, AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel, lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc, AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel, lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom, AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel, Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum), Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to), lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli, AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to, Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie), Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to), lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest, AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9K111 = false ;
         A396EmprCod = P09K143_A396EmprCod[0] ;
         A44AlbRecCod = P09K143_A44AlbRecCod[0] ;
         A120BarAgrEst = P09K143_A120BarAgrEst[0] ;
         A1501BarPiePie = P09K143_A1501BarPiePie[0] ;
         A205BarPieMet = P09K143_A205BarPieMet[0] ;
         A203BarPieKil = P09K143_A203BarPieKil[0] ;
         A1234BarNomCli = P09K143_A1234BarNomCli[0] ;
         A136BarColNum = P09K143_A136BarColNum[0] ;
         A135BarColNom = P09K143_A135BarColNom[0] ;
         A1652BarSerDsc = P09K143_A1652BarSerDsc[0] ;
         A212BarSer = P09K143_A212BarSer[0] ;
         A13696BarNHdr = P09K143_A13696BarNHdr[0] ;
         A156BarFecCum = P09K143_A156BarFecCum[0] ;
         n156BarFecCum = P09K143_n156BarFecCum[0] ;
         A151BarFasCod = P09K143_A151BarFasCod[0] ;
         n151BarFasCod = P09K143_n151BarFasCod[0] ;
         A129BarCod = P09K143_A129BarCod[0] ;
         A132BarCodReo = P09K143_A132BarCodReo[0] ;
         A130BarCodPar = P09K143_A130BarCodPar[0] ;
         A200BarPieCod = P09K143_A200BarPieCod[0] ;
         A120BarAgrEst = P09K143_A120BarAgrEst[0] ;
         A1234BarNomCli = P09K143_A1234BarNomCli[0] ;
         A136BarColNum = P09K143_A136BarColNum[0] ;
         A135BarColNom = P09K143_A135BarColNom[0] ;
         A1652BarSerDsc = P09K143_A1652BarSerDsc[0] ;
         A212BarSer = P09K143_A212BarSer[0] ;
         A13696BarNHdr = P09K143_A13696BarNHdr[0] ;
         A156BarFecCum = P09K143_A156BarFecCum[0] ;
         n156BarFecCum = P09K143_n156BarFecCum[0] ;
         A151BarFasCod = P09K143_A151BarFasCod[0] ;
         n151BarFasCod = P09K143_n151BarFasCod[0] ;
         AV46count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09K143_A120BarAgrEst[0], A120BarAgrEst) == 0 ) )
         {
            brk9K111 = false ;
            A396EmprCod = P09K143_A396EmprCod[0] ;
            A129BarCod = P09K143_A129BarCod[0] ;
            A132BarCodReo = P09K143_A132BarCodReo[0] ;
            A130BarCodPar = P09K143_A130BarCodPar[0] ;
            A200BarPieCod = P09K143_A200BarPieCod[0] ;
            AV46count = (long)(AV46count+1) ;
            brk9K111 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A120BarAgrEst)==0) )
         {
            AV38Option = A120BarAgrEst ;
            AV41OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))) ;
            AV39Options.add(AV38Option, 0);
            AV42OptionsDesc.add(AV41OptionDesc, 0);
            AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9K111 )
         {
            brk9K111 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV30TFBarFasCod = AV34SearchTxt ;
      AV31TFBarFasCod_Sel = "" ;
      AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = AV52FilterFullText ;
      AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = AV12TFBarSer ;
      AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = AV13TFBarSer_Sel ;
      AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = AV14TFBarSerDsc ;
      AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = AV15TFBarSerDsc_Sel ;
      AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = AV16TFBarColNom ;
      AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum = AV18TFBarColNum ;
      AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to = AV19TFBarColNum_To ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = AV20TFBarNomCli ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = AV21TFBarNomCli_Sel ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = AV22TFBarPieKil ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = AV23TFBarPieKil_To ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = AV24TFBarPieMet ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = AV25TFBarPieMet_To ;
      AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie = AV26TFBarPiePie ;
      AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to = AV27TFBarPiePie_To ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = AV28TFBarAgrEst ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = AV29TFBarAgrEst_Sel ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = AV30TFBarFasCod ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = AV31TFBarFasCod_Sel ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = AV32TFBarFecCum ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) ,
                                           AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) ,
                                           AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Integer.valueOf(A1501BarPiePie) ,
                                           A120BarAgrEst ,
                                           AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV53Emprcod ,
                                           Integer.valueOf(AV54ALbrecCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext), "%", "") ;
      lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod), 8, "%") ;
      lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr), 11, "%") ;
      lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser), 16, "%") ;
      lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc), 26, "%") ;
      lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom), 13, "%") ;
      lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli), 13, "%") ;
      lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P09K150 */
      pr_default.execute(6, new Object[] {AV53Emprcod, Integer.valueOf(AV54ALbrecCod), AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum, lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr, AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel, lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser, AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel, lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc, AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel, lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom, AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel, Integer.valueOf(AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum), Integer.valueOf(AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to), lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli, AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to, Integer.valueOf(AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie), Integer.valueOf(AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to), lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest, AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A44AlbRecCod = P09K150_A44AlbRecCod[0] ;
         A396EmprCod = P09K150_A396EmprCod[0] ;
         A120BarAgrEst = P09K150_A120BarAgrEst[0] ;
         A1501BarPiePie = P09K150_A1501BarPiePie[0] ;
         A205BarPieMet = P09K150_A205BarPieMet[0] ;
         A203BarPieKil = P09K150_A203BarPieKil[0] ;
         A1234BarNomCli = P09K150_A1234BarNomCli[0] ;
         A136BarColNum = P09K150_A136BarColNum[0] ;
         A135BarColNom = P09K150_A135BarColNom[0] ;
         A1652BarSerDsc = P09K150_A1652BarSerDsc[0] ;
         A212BarSer = P09K150_A212BarSer[0] ;
         A13696BarNHdr = P09K150_A13696BarNHdr[0] ;
         A156BarFecCum = P09K150_A156BarFecCum[0] ;
         n156BarFecCum = P09K150_n156BarFecCum[0] ;
         A151BarFasCod = P09K150_A151BarFasCod[0] ;
         n151BarFasCod = P09K150_n151BarFasCod[0] ;
         A129BarCod = P09K150_A129BarCod[0] ;
         A132BarCodReo = P09K150_A132BarCodReo[0] ;
         A130BarCodPar = P09K150_A130BarCodPar[0] ;
         A200BarPieCod = P09K150_A200BarPieCod[0] ;
         A120BarAgrEst = P09K150_A120BarAgrEst[0] ;
         A1234BarNomCli = P09K150_A1234BarNomCli[0] ;
         A136BarColNum = P09K150_A136BarColNum[0] ;
         A135BarColNom = P09K150_A135BarColNom[0] ;
         A1652BarSerDsc = P09K150_A1652BarSerDsc[0] ;
         A212BarSer = P09K150_A212BarSer[0] ;
         A13696BarNHdr = P09K150_A13696BarNHdr[0] ;
         A156BarFecCum = P09K150_A156BarFecCum[0] ;
         n156BarFecCum = P09K150_n156BarFecCum[0] ;
         A151BarFasCod = P09K150_A151BarFasCod[0] ;
         n151BarFasCod = P09K150_n151BarFasCod[0] ;
         if ( ! (GXutil.strcmp("", A151BarFasCod)==0) )
         {
            AV38Option = A151BarFasCod ;
            AV37InsertIndex = 1 ;
            while ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) < 0 ) )
            {
               AV37InsertIndex = (int)(AV37InsertIndex+1) ;
            }
            if ( ( AV37InsertIndex <= AV39Options.size() ) && ( GXutil.strcmp((String)AV39Options.elementAt(-1+AV37InsertIndex), AV38Option) == 0 ) )
            {
               AV46count = GXutil.lval( (String)AV44OptionIndexes.elementAt(-1+AV37InsertIndex)) ;
               AV46count = (long)(AV46count+1) ;
               AV44OptionIndexes.removeItem(AV37InsertIndex);
               AV44OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV46count), "Z,ZZZ,ZZZ,ZZ9")), AV37InsertIndex);
            }
            else
            {
               AV39Options.add(AV38Option, AV37InsertIndex);
               AV44OptionIndexes.add("1", AV37InsertIndex);
            }
         }
         if ( AV39Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = consultaalmacentejidoencrudoproduccion_wcgetfilterdata.this.AV40OptionsJson;
      this.aP4[0] = consultaalmacentejidoencrudoproduccion_wcgetfilterdata.this.AV43OptionsDescJson;
      this.aP5[0] = consultaalmacentejidoencrudoproduccion_wcgetfilterdata.this.AV45OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV40OptionsJson = "" ;
      AV43OptionsDescJson = "" ;
      AV45OptionIndexesJson = "" ;
      AV39Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV42OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV44OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52FilterFullText = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV12TFBarSer = "" ;
      AV13TFBarSer_Sel = "" ;
      AV14TFBarSerDsc = "" ;
      AV15TFBarSerDsc_Sel = "" ;
      AV16TFBarColNom = "" ;
      AV17TFBarColNom_Sel = "" ;
      AV20TFBarNomCli = "" ;
      AV21TFBarNomCli_Sel = "" ;
      AV22TFBarPieKil = DecimalUtil.ZERO ;
      AV23TFBarPieKil_To = DecimalUtil.ZERO ;
      AV24TFBarPieMet = DecimalUtil.ZERO ;
      AV25TFBarPieMet_To = DecimalUtil.ZERO ;
      AV28TFBarAgrEst = "" ;
      AV29TFBarAgrEst_Sel = "" ;
      AV30TFBarFasCod = "" ;
      AV31TFBarFasCod_Sel = "" ;
      AV32TFBarFecCum = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = "" ;
      AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = "" ;
      AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel = "" ;
      AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = "" ;
      AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel = "" ;
      AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = "" ;
      AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel = "" ;
      AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = "" ;
      AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel = "" ;
      AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = "" ;
      AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel = "" ;
      AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil = DecimalUtil.ZERO ;
      AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet = DecimalUtil.ZERO ;
      AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to = DecimalUtil.ZERO ;
      AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = "" ;
      AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel = "" ;
      AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = "" ;
      AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel = "" ;
      AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum = GXutil.nullDate() ;
      lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext = "" ;
      lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod = "" ;
      scmdbuf = "" ;
      lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr = "" ;
      lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser = "" ;
      lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc = "" ;
      lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom = "" ;
      lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli = "" ;
      lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A151BarFasCod = "" ;
      A156BarFecCum = GXutil.nullDate() ;
      AV53Emprcod = "" ;
      A396EmprCod = "" ;
      P09K18_A44AlbRecCod = new int[1] ;
      P09K18_A396EmprCod = new String[] {""} ;
      P09K18_A120BarAgrEst = new String[] {""} ;
      P09K18_A1501BarPiePie = new int[1] ;
      P09K18_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K18_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K18_A1234BarNomCli = new String[] {""} ;
      P09K18_A136BarColNum = new int[1] ;
      P09K18_A135BarColNom = new String[] {""} ;
      P09K18_A1652BarSerDsc = new String[] {""} ;
      P09K18_A212BarSer = new String[] {""} ;
      P09K18_A13696BarNHdr = new String[] {""} ;
      P09K18_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P09K18_n156BarFecCum = new boolean[] {false} ;
      P09K18_A151BarFasCod = new String[] {""} ;
      P09K18_n151BarFasCod = new boolean[] {false} ;
      P09K18_A129BarCod = new int[1] ;
      P09K18_A132BarCodReo = new byte[1] ;
      P09K18_A130BarCodPar = new String[] {""} ;
      P09K18_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      AV38Option = "" ;
      P09K115_A396EmprCod = new String[] {""} ;
      P09K115_A44AlbRecCod = new int[1] ;
      P09K115_A212BarSer = new String[] {""} ;
      P09K115_A120BarAgrEst = new String[] {""} ;
      P09K115_A1501BarPiePie = new int[1] ;
      P09K115_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K115_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K115_A1234BarNomCli = new String[] {""} ;
      P09K115_A136BarColNum = new int[1] ;
      P09K115_A135BarColNom = new String[] {""} ;
      P09K115_A1652BarSerDsc = new String[] {""} ;
      P09K115_A13696BarNHdr = new String[] {""} ;
      P09K115_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P09K115_n156BarFecCum = new boolean[] {false} ;
      P09K115_A151BarFasCod = new String[] {""} ;
      P09K115_n151BarFasCod = new boolean[] {false} ;
      P09K115_A129BarCod = new int[1] ;
      P09K115_A132BarCodReo = new byte[1] ;
      P09K115_A130BarCodPar = new String[] {""} ;
      P09K115_A200BarPieCod = new String[] {""} ;
      P09K122_A396EmprCod = new String[] {""} ;
      P09K122_A44AlbRecCod = new int[1] ;
      P09K122_A1652BarSerDsc = new String[] {""} ;
      P09K122_A120BarAgrEst = new String[] {""} ;
      P09K122_A1501BarPiePie = new int[1] ;
      P09K122_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K122_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K122_A1234BarNomCli = new String[] {""} ;
      P09K122_A136BarColNum = new int[1] ;
      P09K122_A135BarColNom = new String[] {""} ;
      P09K122_A212BarSer = new String[] {""} ;
      P09K122_A13696BarNHdr = new String[] {""} ;
      P09K122_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P09K122_n156BarFecCum = new boolean[] {false} ;
      P09K122_A151BarFasCod = new String[] {""} ;
      P09K122_n151BarFasCod = new boolean[] {false} ;
      P09K122_A129BarCod = new int[1] ;
      P09K122_A132BarCodReo = new byte[1] ;
      P09K122_A130BarCodPar = new String[] {""} ;
      P09K122_A200BarPieCod = new String[] {""} ;
      P09K129_A396EmprCod = new String[] {""} ;
      P09K129_A44AlbRecCod = new int[1] ;
      P09K129_A135BarColNom = new String[] {""} ;
      P09K129_A120BarAgrEst = new String[] {""} ;
      P09K129_A1501BarPiePie = new int[1] ;
      P09K129_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K129_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K129_A1234BarNomCli = new String[] {""} ;
      P09K129_A136BarColNum = new int[1] ;
      P09K129_A1652BarSerDsc = new String[] {""} ;
      P09K129_A212BarSer = new String[] {""} ;
      P09K129_A13696BarNHdr = new String[] {""} ;
      P09K129_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P09K129_n156BarFecCum = new boolean[] {false} ;
      P09K129_A151BarFasCod = new String[] {""} ;
      P09K129_n151BarFasCod = new boolean[] {false} ;
      P09K129_A129BarCod = new int[1] ;
      P09K129_A132BarCodReo = new byte[1] ;
      P09K129_A130BarCodPar = new String[] {""} ;
      P09K129_A200BarPieCod = new String[] {""} ;
      P09K136_A396EmprCod = new String[] {""} ;
      P09K136_A44AlbRecCod = new int[1] ;
      P09K136_A1234BarNomCli = new String[] {""} ;
      P09K136_A120BarAgrEst = new String[] {""} ;
      P09K136_A1501BarPiePie = new int[1] ;
      P09K136_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K136_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K136_A136BarColNum = new int[1] ;
      P09K136_A135BarColNom = new String[] {""} ;
      P09K136_A1652BarSerDsc = new String[] {""} ;
      P09K136_A212BarSer = new String[] {""} ;
      P09K136_A13696BarNHdr = new String[] {""} ;
      P09K136_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P09K136_n156BarFecCum = new boolean[] {false} ;
      P09K136_A151BarFasCod = new String[] {""} ;
      P09K136_n151BarFasCod = new boolean[] {false} ;
      P09K136_A129BarCod = new int[1] ;
      P09K136_A132BarCodReo = new byte[1] ;
      P09K136_A130BarCodPar = new String[] {""} ;
      P09K136_A200BarPieCod = new String[] {""} ;
      P09K143_A396EmprCod = new String[] {""} ;
      P09K143_A44AlbRecCod = new int[1] ;
      P09K143_A120BarAgrEst = new String[] {""} ;
      P09K143_A1501BarPiePie = new int[1] ;
      P09K143_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K143_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K143_A1234BarNomCli = new String[] {""} ;
      P09K143_A136BarColNum = new int[1] ;
      P09K143_A135BarColNom = new String[] {""} ;
      P09K143_A1652BarSerDsc = new String[] {""} ;
      P09K143_A212BarSer = new String[] {""} ;
      P09K143_A13696BarNHdr = new String[] {""} ;
      P09K143_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P09K143_n156BarFecCum = new boolean[] {false} ;
      P09K143_A151BarFasCod = new String[] {""} ;
      P09K143_n151BarFasCod = new boolean[] {false} ;
      P09K143_A129BarCod = new int[1] ;
      P09K143_A132BarCodReo = new byte[1] ;
      P09K143_A130BarCodPar = new String[] {""} ;
      P09K143_A200BarPieCod = new String[] {""} ;
      AV41OptionDesc = "" ;
      P09K150_A44AlbRecCod = new int[1] ;
      P09K150_A396EmprCod = new String[] {""} ;
      P09K150_A120BarAgrEst = new String[] {""} ;
      P09K150_A1501BarPiePie = new int[1] ;
      P09K150_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K150_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09K150_A1234BarNomCli = new String[] {""} ;
      P09K150_A136BarColNum = new int[1] ;
      P09K150_A135BarColNom = new String[] {""} ;
      P09K150_A1652BarSerDsc = new String[] {""} ;
      P09K150_A212BarSer = new String[] {""} ;
      P09K150_A13696BarNHdr = new String[] {""} ;
      P09K150_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P09K150_n156BarFecCum = new boolean[] {false} ;
      P09K150_A151BarFasCod = new String[] {""} ;
      P09K150_n151BarFasCod = new boolean[] {false} ;
      P09K150_A129BarCod = new int[1] ;
      P09K150_A132BarCodReo = new byte[1] ;
      P09K150_A130BarCodPar = new String[] {""} ;
      P09K150_A200BarPieCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.consultaalmacentejidoencrudoproduccion_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09K18_A44AlbRecCod, P09K18_A396EmprCod, P09K18_A120BarAgrEst, P09K18_A1501BarPiePie, P09K18_A205BarPieMet, P09K18_A203BarPieKil, P09K18_A1234BarNomCli, P09K18_A136BarColNum, P09K18_A135BarColNom, P09K18_A1652BarSerDsc,
            P09K18_A212BarSer, P09K18_A13696BarNHdr, P09K18_A156BarFecCum, P09K18_n156BarFecCum, P09K18_A151BarFasCod, P09K18_n151BarFasCod, P09K18_A129BarCod, P09K18_A132BarCodReo, P09K18_A130BarCodPar, P09K18_A200BarPieCod
            }
            , new Object[] {
            P09K115_A396EmprCod, P09K115_A44AlbRecCod, P09K115_A212BarSer, P09K115_A120BarAgrEst, P09K115_A1501BarPiePie, P09K115_A205BarPieMet, P09K115_A203BarPieKil, P09K115_A1234BarNomCli, P09K115_A136BarColNum, P09K115_A135BarColNom,
            P09K115_A1652BarSerDsc, P09K115_A13696BarNHdr, P09K115_A156BarFecCum, P09K115_n156BarFecCum, P09K115_A151BarFasCod, P09K115_n151BarFasCod, P09K115_A129BarCod, P09K115_A132BarCodReo, P09K115_A130BarCodPar, P09K115_A200BarPieCod
            }
            , new Object[] {
            P09K122_A396EmprCod, P09K122_A44AlbRecCod, P09K122_A1652BarSerDsc, P09K122_A120BarAgrEst, P09K122_A1501BarPiePie, P09K122_A205BarPieMet, P09K122_A203BarPieKil, P09K122_A1234BarNomCli, P09K122_A136BarColNum, P09K122_A135BarColNom,
            P09K122_A212BarSer, P09K122_A13696BarNHdr, P09K122_A156BarFecCum, P09K122_n156BarFecCum, P09K122_A151BarFasCod, P09K122_n151BarFasCod, P09K122_A129BarCod, P09K122_A132BarCodReo, P09K122_A130BarCodPar, P09K122_A200BarPieCod
            }
            , new Object[] {
            P09K129_A396EmprCod, P09K129_A44AlbRecCod, P09K129_A135BarColNom, P09K129_A120BarAgrEst, P09K129_A1501BarPiePie, P09K129_A205BarPieMet, P09K129_A203BarPieKil, P09K129_A1234BarNomCli, P09K129_A136BarColNum, P09K129_A1652BarSerDsc,
            P09K129_A212BarSer, P09K129_A13696BarNHdr, P09K129_A156BarFecCum, P09K129_n156BarFecCum, P09K129_A151BarFasCod, P09K129_n151BarFasCod, P09K129_A129BarCod, P09K129_A132BarCodReo, P09K129_A130BarCodPar, P09K129_A200BarPieCod
            }
            , new Object[] {
            P09K136_A396EmprCod, P09K136_A44AlbRecCod, P09K136_A1234BarNomCli, P09K136_A120BarAgrEst, P09K136_A1501BarPiePie, P09K136_A205BarPieMet, P09K136_A203BarPieKil, P09K136_A136BarColNum, P09K136_A135BarColNom, P09K136_A1652BarSerDsc,
            P09K136_A212BarSer, P09K136_A13696BarNHdr, P09K136_A156BarFecCum, P09K136_n156BarFecCum, P09K136_A151BarFasCod, P09K136_n151BarFasCod, P09K136_A129BarCod, P09K136_A132BarCodReo, P09K136_A130BarCodPar, P09K136_A200BarPieCod
            }
            , new Object[] {
            P09K143_A396EmprCod, P09K143_A44AlbRecCod, P09K143_A120BarAgrEst, P09K143_A1501BarPiePie, P09K143_A205BarPieMet, P09K143_A203BarPieKil, P09K143_A1234BarNomCli, P09K143_A136BarColNum, P09K143_A135BarColNom, P09K143_A1652BarSerDsc,
            P09K143_A212BarSer, P09K143_A13696BarNHdr, P09K143_A156BarFecCum, P09K143_n156BarFecCum, P09K143_A151BarFasCod, P09K143_n151BarFasCod, P09K143_A129BarCod, P09K143_A132BarCodReo, P09K143_A130BarCodPar, P09K143_A200BarPieCod
            }
            , new Object[] {
            P09K150_A44AlbRecCod, P09K150_A396EmprCod, P09K150_A120BarAgrEst, P09K150_A1501BarPiePie, P09K150_A205BarPieMet, P09K150_A203BarPieKil, P09K150_A1234BarNomCli, P09K150_A136BarColNum, P09K150_A135BarColNom, P09K150_A1652BarSerDsc,
            P09K150_A212BarSer, P09K150_A13696BarNHdr, P09K150_A156BarFecCum, P09K150_n156BarFecCum, P09K150_A151BarFasCod, P09K150_n151BarFasCod, P09K150_A129BarCod, P09K150_A132BarCodReo, P09K150_A130BarCodPar, P09K150_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV57GXV1 ;
   private int AV18TFBarColNum ;
   private int AV19TFBarColNum_To ;
   private int AV26TFBarPiePie ;
   private int AV27TFBarPiePie_To ;
   private int AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ;
   private int AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ;
   private int AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ;
   private int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1501BarPiePie ;
   private int AV54ALbrecCod ;
   private int A44AlbRecCod ;
   private int AV37InsertIndex ;
   private long AV46count ;
   private java.math.BigDecimal AV22TFBarPieKil ;
   private java.math.BigDecimal AV23TFBarPieKil_To ;
   private java.math.BigDecimal AV24TFBarPieMet ;
   private java.math.BigDecimal AV25TFBarPieMet_To ;
   private java.math.BigDecimal AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ;
   private java.math.BigDecimal AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ;
   private java.math.BigDecimal AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ;
   private java.math.BigDecimal AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV12TFBarSer ;
   private String AV13TFBarSer_Sel ;
   private String AV14TFBarSerDsc ;
   private String AV15TFBarSerDsc_Sel ;
   private String AV16TFBarColNom ;
   private String AV17TFBarColNom_Sel ;
   private String AV20TFBarNomCli ;
   private String AV21TFBarNomCli_Sel ;
   private String AV28TFBarAgrEst ;
   private String AV29TFBarAgrEst_Sel ;
   private String AV30TFBarFasCod ;
   private String AV31TFBarFasCod_Sel ;
   private String A13696BarNHdr ;
   private String AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ;
   private String AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ;
   private String AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ;
   private String AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ;
   private String AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ;
   private String AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ;
   private String AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ;
   private String AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ;
   private String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ;
   private String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ;
   private String AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ;
   private String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ;
   private String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ;
   private String AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ;
   private String lV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ;
   private String scmdbuf ;
   private String lV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ;
   private String lV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ;
   private String lV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ;
   private String lV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ;
   private String lV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ;
   private String lV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A120BarAgrEst ;
   private String A151BarFasCod ;
   private String AV53Emprcod ;
   private String A396EmprCod ;
   private String A200BarPieCod ;
   private java.util.Date AV32TFBarFecCum ;
   private java.util.Date AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ;
   private java.util.Date A156BarFecCum ;
   private boolean returnInSub ;
   private boolean n156BarFecCum ;
   private boolean n151BarFasCod ;
   private boolean brk9K13 ;
   private boolean brk9K15 ;
   private boolean brk9K17 ;
   private boolean brk9K19 ;
   private boolean brk9K111 ;
   private String AV40OptionsJson ;
   private String AV43OptionsDescJson ;
   private String AV45OptionIndexesJson ;
   private String AV36DDOName ;
   private String AV34SearchTxt ;
   private String AV35SearchTxtTo ;
   private String AV52FilterFullText ;
   private String AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ;
   private String lV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ;
   private String AV38Option ;
   private String AV41OptionDesc ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09K18_A44AlbRecCod ;
   private String[] P09K18_A396EmprCod ;
   private String[] P09K18_A120BarAgrEst ;
   private int[] P09K18_A1501BarPiePie ;
   private java.math.BigDecimal[] P09K18_A205BarPieMet ;
   private java.math.BigDecimal[] P09K18_A203BarPieKil ;
   private String[] P09K18_A1234BarNomCli ;
   private int[] P09K18_A136BarColNum ;
   private String[] P09K18_A135BarColNom ;
   private String[] P09K18_A1652BarSerDsc ;
   private String[] P09K18_A212BarSer ;
   private String[] P09K18_A13696BarNHdr ;
   private java.util.Date[] P09K18_A156BarFecCum ;
   private boolean[] P09K18_n156BarFecCum ;
   private String[] P09K18_A151BarFasCod ;
   private boolean[] P09K18_n151BarFasCod ;
   private int[] P09K18_A129BarCod ;
   private byte[] P09K18_A132BarCodReo ;
   private String[] P09K18_A130BarCodPar ;
   private String[] P09K18_A200BarPieCod ;
   private String[] P09K115_A396EmprCod ;
   private int[] P09K115_A44AlbRecCod ;
   private String[] P09K115_A212BarSer ;
   private String[] P09K115_A120BarAgrEst ;
   private int[] P09K115_A1501BarPiePie ;
   private java.math.BigDecimal[] P09K115_A205BarPieMet ;
   private java.math.BigDecimal[] P09K115_A203BarPieKil ;
   private String[] P09K115_A1234BarNomCli ;
   private int[] P09K115_A136BarColNum ;
   private String[] P09K115_A135BarColNom ;
   private String[] P09K115_A1652BarSerDsc ;
   private String[] P09K115_A13696BarNHdr ;
   private java.util.Date[] P09K115_A156BarFecCum ;
   private boolean[] P09K115_n156BarFecCum ;
   private String[] P09K115_A151BarFasCod ;
   private boolean[] P09K115_n151BarFasCod ;
   private int[] P09K115_A129BarCod ;
   private byte[] P09K115_A132BarCodReo ;
   private String[] P09K115_A130BarCodPar ;
   private String[] P09K115_A200BarPieCod ;
   private String[] P09K122_A396EmprCod ;
   private int[] P09K122_A44AlbRecCod ;
   private String[] P09K122_A1652BarSerDsc ;
   private String[] P09K122_A120BarAgrEst ;
   private int[] P09K122_A1501BarPiePie ;
   private java.math.BigDecimal[] P09K122_A205BarPieMet ;
   private java.math.BigDecimal[] P09K122_A203BarPieKil ;
   private String[] P09K122_A1234BarNomCli ;
   private int[] P09K122_A136BarColNum ;
   private String[] P09K122_A135BarColNom ;
   private String[] P09K122_A212BarSer ;
   private String[] P09K122_A13696BarNHdr ;
   private java.util.Date[] P09K122_A156BarFecCum ;
   private boolean[] P09K122_n156BarFecCum ;
   private String[] P09K122_A151BarFasCod ;
   private boolean[] P09K122_n151BarFasCod ;
   private int[] P09K122_A129BarCod ;
   private byte[] P09K122_A132BarCodReo ;
   private String[] P09K122_A130BarCodPar ;
   private String[] P09K122_A200BarPieCod ;
   private String[] P09K129_A396EmprCod ;
   private int[] P09K129_A44AlbRecCod ;
   private String[] P09K129_A135BarColNom ;
   private String[] P09K129_A120BarAgrEst ;
   private int[] P09K129_A1501BarPiePie ;
   private java.math.BigDecimal[] P09K129_A205BarPieMet ;
   private java.math.BigDecimal[] P09K129_A203BarPieKil ;
   private String[] P09K129_A1234BarNomCli ;
   private int[] P09K129_A136BarColNum ;
   private String[] P09K129_A1652BarSerDsc ;
   private String[] P09K129_A212BarSer ;
   private String[] P09K129_A13696BarNHdr ;
   private java.util.Date[] P09K129_A156BarFecCum ;
   private boolean[] P09K129_n156BarFecCum ;
   private String[] P09K129_A151BarFasCod ;
   private boolean[] P09K129_n151BarFasCod ;
   private int[] P09K129_A129BarCod ;
   private byte[] P09K129_A132BarCodReo ;
   private String[] P09K129_A130BarCodPar ;
   private String[] P09K129_A200BarPieCod ;
   private String[] P09K136_A396EmprCod ;
   private int[] P09K136_A44AlbRecCod ;
   private String[] P09K136_A1234BarNomCli ;
   private String[] P09K136_A120BarAgrEst ;
   private int[] P09K136_A1501BarPiePie ;
   private java.math.BigDecimal[] P09K136_A205BarPieMet ;
   private java.math.BigDecimal[] P09K136_A203BarPieKil ;
   private int[] P09K136_A136BarColNum ;
   private String[] P09K136_A135BarColNom ;
   private String[] P09K136_A1652BarSerDsc ;
   private String[] P09K136_A212BarSer ;
   private String[] P09K136_A13696BarNHdr ;
   private java.util.Date[] P09K136_A156BarFecCum ;
   private boolean[] P09K136_n156BarFecCum ;
   private String[] P09K136_A151BarFasCod ;
   private boolean[] P09K136_n151BarFasCod ;
   private int[] P09K136_A129BarCod ;
   private byte[] P09K136_A132BarCodReo ;
   private String[] P09K136_A130BarCodPar ;
   private String[] P09K136_A200BarPieCod ;
   private String[] P09K143_A396EmprCod ;
   private int[] P09K143_A44AlbRecCod ;
   private String[] P09K143_A120BarAgrEst ;
   private int[] P09K143_A1501BarPiePie ;
   private java.math.BigDecimal[] P09K143_A205BarPieMet ;
   private java.math.BigDecimal[] P09K143_A203BarPieKil ;
   private String[] P09K143_A1234BarNomCli ;
   private int[] P09K143_A136BarColNum ;
   private String[] P09K143_A135BarColNom ;
   private String[] P09K143_A1652BarSerDsc ;
   private String[] P09K143_A212BarSer ;
   private String[] P09K143_A13696BarNHdr ;
   private java.util.Date[] P09K143_A156BarFecCum ;
   private boolean[] P09K143_n156BarFecCum ;
   private String[] P09K143_A151BarFasCod ;
   private boolean[] P09K143_n151BarFasCod ;
   private int[] P09K143_A129BarCod ;
   private byte[] P09K143_A132BarCodReo ;
   private String[] P09K143_A130BarCodPar ;
   private String[] P09K143_A200BarPieCod ;
   private int[] P09K150_A44AlbRecCod ;
   private String[] P09K150_A396EmprCod ;
   private String[] P09K150_A120BarAgrEst ;
   private int[] P09K150_A1501BarPiePie ;
   private java.math.BigDecimal[] P09K150_A205BarPieMet ;
   private java.math.BigDecimal[] P09K150_A203BarPieKil ;
   private String[] P09K150_A1234BarNomCli ;
   private int[] P09K150_A136BarColNum ;
   private String[] P09K150_A135BarColNom ;
   private String[] P09K150_A1652BarSerDsc ;
   private String[] P09K150_A212BarSer ;
   private String[] P09K150_A13696BarNHdr ;
   private java.util.Date[] P09K150_A156BarFecCum ;
   private boolean[] P09K150_n156BarFecCum ;
   private String[] P09K150_A151BarFasCod ;
   private boolean[] P09K150_n151BarFasCod ;
   private int[] P09K150_A129BarCod ;
   private byte[] P09K150_A132BarCodReo ;
   private String[] P09K150_A130BarCodPar ;
   private String[] P09K150_A200BarPieCod ;
   private GXSimpleCollection<String> AV39Options ;
   private GXSimpleCollection<String> AV42OptionsDesc ;
   private GXSimpleCollection<String> AV44OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class consultaalmacentejidoencrudoproduccion_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09K18( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                          String AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                          String AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                          String AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                          String AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                          String AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                          String AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                          String AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                          int AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ,
                                          int AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ,
                                          String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                          String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                          java.math.BigDecimal AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                          java.math.BigDecimal AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                          java.math.BigDecimal AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                          java.math.BigDecimal AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                          int AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ,
                                          int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ,
                                          String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                          String AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          int A1501BarPiePie ,
                                          String A120BarAgrEst ,
                                          String AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A151BarFasCod ,
                                          String AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                          String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                          java.util.Date AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                          java.util.Date A156BarFecCum ,
                                          String AV53Emprcod ,
                                          int AV54ALbrecCod ,
                                          String A396EmprCod ,
                                          int A44AlbRecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[41];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.AlbRecCod, T1.EmprCod, T2.BarAgrEst, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum," ;
      scmdbuf += " COALESCE( T4.BarFasCod, ' ') AS BarFasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod FROM (((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.BarFecRea) AS BarFecCum, COALESCE( T6.BarProCod," ;
      scmdbuf += " '') AS BarProCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM ((TXPBARFAS T5 LEFT JOIN (SELECT MIN(T8.ProCod)" ;
      scmdbuf += " AS BarProCod, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE T8.BarOrdLin = COALESCE( T9.BarFasLin, 0) GROUP BY T9.BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T5.EmprCod AND T7.BarCod = T5.BarCod AND T7.BarCodReo = T5.BarCodReo AND T7.BarCodPar = T5.BarCodPar) WHERE T5.ProCod = COALESCE( T6.BarProCod," ;
      scmdbuf += " '') and T5.BarOrdLin = COALESCE( T7.BarFasLin, 0) GROUP BY T6.BarProCod, T7.BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <>" ;
      scmdbuf += " 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " WHERE (T5.BarOrdLin = T6.GXC1) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod" ;
      scmdbuf += " = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbRecCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPiePie,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      if ( (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09K115( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           String AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           String AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           String AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           String AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           String AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           String AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           String AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           int AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ,
                                           int AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ,
                                           String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           int AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ,
                                           int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ,
                                           String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           String AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A203BarPieKil ,
                                           java.math.BigDecimal A205BarPieMet ,
                                           int A1501BarPiePie ,
                                           String A120BarAgrEst ,
                                           String AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           java.util.Date AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String A396EmprCod ,
                                           String AV53Emprcod ,
                                           int A44AlbRecCod ,
                                           int AV54ALbrecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[41];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRecCod, T2.BarSer, T2.BarAgrEst, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum," ;
      scmdbuf += " COALESCE( T4.BarFasCod, ' ') AS BarFasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod FROM (((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.BarFecRea) AS BarFecCum, COALESCE( T6.BarProCod," ;
      scmdbuf += " '') AS BarProCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM ((TXPBARFAS T5 LEFT JOIN (SELECT MIN(T8.ProCod)" ;
      scmdbuf += " AS BarProCod, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE T8.BarOrdLin = COALESCE( T9.BarFasLin, 0) GROUP BY T9.BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T5.EmprCod AND T7.BarCod = T5.BarCod AND T7.BarCodReo = T5.BarCodReo AND T7.BarCodPar = T5.BarCodPar) WHERE T5.ProCod = COALESCE( T6.BarProCod," ;
      scmdbuf += " '') and T5.BarOrdLin = COALESCE( T7.BarFasLin, 0) GROUP BY T6.BarProCod, T7.BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <>" ;
      scmdbuf += " 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " WHERE (T5.BarOrdLin = T6.GXC1) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod" ;
      scmdbuf += " = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPiePie,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09K122( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           String AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           String AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           String AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           String AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           String AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           String AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           String AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           int AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ,
                                           int AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ,
                                           String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           int AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ,
                                           int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ,
                                           String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           String AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A203BarPieKil ,
                                           java.math.BigDecimal A205BarPieMet ,
                                           int A1501BarPiePie ,
                                           String A120BarAgrEst ,
                                           String AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           java.util.Date AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String A396EmprCod ,
                                           String AV53Emprcod ,
                                           int A44AlbRecCod ,
                                           int AV54ALbrecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[41];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRecCod, T2.BarSerDsc, T2.BarAgrEst, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum," ;
      scmdbuf += " COALESCE( T4.BarFasCod, ' ') AS BarFasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod FROM (((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.BarFecRea) AS BarFecCum, COALESCE( T6.BarProCod," ;
      scmdbuf += " '') AS BarProCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM ((TXPBARFAS T5 LEFT JOIN (SELECT MIN(T8.ProCod)" ;
      scmdbuf += " AS BarProCod, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE T8.BarOrdLin = COALESCE( T9.BarFasLin, 0) GROUP BY T9.BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T5.EmprCod AND T7.BarCod = T5.BarCod AND T7.BarCodReo = T5.BarCodReo AND T7.BarCodPar = T5.BarCodPar) WHERE T5.ProCod = COALESCE( T6.BarProCod," ;
      scmdbuf += " '') and T5.BarOrdLin = COALESCE( T7.BarFasLin, 0) GROUP BY T6.BarProCod, T7.BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <>" ;
      scmdbuf += " 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " WHERE (T5.BarOrdLin = T6.GXC1) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod" ;
      scmdbuf += " = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPiePie,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09K129( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           String AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           String AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           String AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           String AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           String AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           String AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           String AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           int AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ,
                                           int AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ,
                                           String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           int AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ,
                                           int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ,
                                           String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           String AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A203BarPieKil ,
                                           java.math.BigDecimal A205BarPieMet ,
                                           int A1501BarPiePie ,
                                           String A120BarAgrEst ,
                                           String AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           java.util.Date AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String A396EmprCod ,
                                           String AV53Emprcod ,
                                           int A44AlbRecCod ,
                                           int AV54ALbrecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[41];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRecCod, T2.BarColNom, T2.BarAgrEst, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.BarNomCli, T2.BarColNum, T2.BarSerDsc, T2.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum," ;
      scmdbuf += " COALESCE( T4.BarFasCod, ' ') AS BarFasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod FROM (((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.BarFecRea) AS BarFecCum, COALESCE( T6.BarProCod," ;
      scmdbuf += " '') AS BarProCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM ((TXPBARFAS T5 LEFT JOIN (SELECT MIN(T8.ProCod)" ;
      scmdbuf += " AS BarProCod, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE T8.BarOrdLin = COALESCE( T9.BarFasLin, 0) GROUP BY T9.BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T5.EmprCod AND T7.BarCod = T5.BarCod AND T7.BarCodReo = T5.BarCodReo AND T7.BarCodPar = T5.BarCodPar) WHERE T5.ProCod = COALESCE( T6.BarProCod," ;
      scmdbuf += " '') and T5.BarOrdLin = COALESCE( T7.BarFasLin, 0) GROUP BY T6.BarProCod, T7.BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <>" ;
      scmdbuf += " 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " WHERE (T5.BarOrdLin = T6.GXC1) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod" ;
      scmdbuf += " = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPiePie,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09K136( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           String AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           String AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           String AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           String AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           String AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           String AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           String AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           int AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ,
                                           int AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ,
                                           String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           int AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ,
                                           int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ,
                                           String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           String AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A203BarPieKil ,
                                           java.math.BigDecimal A205BarPieMet ,
                                           int A1501BarPiePie ,
                                           String A120BarAgrEst ,
                                           String AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           java.util.Date AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String A396EmprCod ,
                                           String AV53Emprcod ,
                                           int A44AlbRecCod ,
                                           int AV54ALbrecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[41];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRecCod, T2.BarNomCli, T2.BarAgrEst, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum," ;
      scmdbuf += " COALESCE( T4.BarFasCod, ' ') AS BarFasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod FROM (((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.BarFecRea) AS BarFecCum, COALESCE( T6.BarProCod," ;
      scmdbuf += " '') AS BarProCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM ((TXPBARFAS T5 LEFT JOIN (SELECT MIN(T8.ProCod)" ;
      scmdbuf += " AS BarProCod, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE T8.BarOrdLin = COALESCE( T9.BarFasLin, 0) GROUP BY T9.BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T5.EmprCod AND T7.BarCod = T5.BarCod AND T7.BarCodReo = T5.BarCodReo AND T7.BarCodPar = T5.BarCodPar) WHERE T5.ProCod = COALESCE( T6.BarProCod," ;
      scmdbuf += " '') and T5.BarOrdLin = COALESCE( T7.BarFasLin, 0) GROUP BY T6.BarProCod, T7.BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <>" ;
      scmdbuf += " 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " WHERE (T5.BarOrdLin = T6.GXC1) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod" ;
      scmdbuf += " = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPiePie,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarNomCli" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09K143( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           String AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           String AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           String AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           String AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           String AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           String AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           String AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           int AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ,
                                           int AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ,
                                           String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           int AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ,
                                           int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ,
                                           String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           String AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A203BarPieKil ,
                                           java.math.BigDecimal A205BarPieMet ,
                                           int A1501BarPiePie ,
                                           String A120BarAgrEst ,
                                           String AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           java.util.Date AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String A396EmprCod ,
                                           String AV53Emprcod ,
                                           int A44AlbRecCod ,
                                           int AV54ALbrecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[41];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRecCod, T2.BarAgrEst, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum," ;
      scmdbuf += " COALESCE( T4.BarFasCod, ' ') AS BarFasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod FROM (((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.BarFecRea) AS BarFecCum, COALESCE( T6.BarProCod," ;
      scmdbuf += " '') AS BarProCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM ((TXPBARFAS T5 LEFT JOIN (SELECT MIN(T8.ProCod)" ;
      scmdbuf += " AS BarProCod, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE T8.BarOrdLin = COALESCE( T9.BarFasLin, 0) GROUP BY T9.BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T5.EmprCod AND T7.BarCod = T5.BarCod AND T7.BarCodReo = T5.BarCodReo AND T7.BarCodPar = T5.BarCodPar) WHERE T5.ProCod = COALESCE( T6.BarProCod," ;
      scmdbuf += " '') and T5.BarOrdLin = COALESCE( T7.BarFasLin, 0) GROUP BY T6.BarProCod, T7.BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <>" ;
      scmdbuf += " 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " WHERE (T5.BarOrdLin = T6.GXC1) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod" ;
      scmdbuf += " = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPiePie,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarAgrEst" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09K150( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel ,
                                           String AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr ,
                                           String AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel ,
                                           String AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser ,
                                           String AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel ,
                                           String AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc ,
                                           String AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel ,
                                           String AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom ,
                                           int AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum ,
                                           int AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to ,
                                           String AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel ,
                                           String AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to ,
                                           int AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie ,
                                           int AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to ,
                                           String AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel ,
                                           String AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A203BarPieKil ,
                                           java.math.BigDecimal A205BarPieMet ,
                                           int A1501BarPiePie ,
                                           String A120BarAgrEst ,
                                           String AV59Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV81Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_23_tfbarfascod_sel ,
                                           String AV80Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_22_tfbarfascod ,
                                           java.util.Date AV82Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           String AV53Emprcod ,
                                           int AV54ALbrecCod ,
                                           String A396EmprCod ,
                                           int A44AlbRecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[41];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.AlbRecCod, T1.EmprCod, T2.BarAgrEst, T1.BarPiePie, T1.BarPieMet, T1.BarPieKil, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) AS BarFecCum," ;
      scmdbuf += " COALESCE( T4.BarFasCod, ' ') AS BarFasCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod FROM (((TXPBARPIE T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.BarFecRea) AS BarFecCum, COALESCE( T6.BarProCod," ;
      scmdbuf += " '') AS BarProCod, COALESCE( T7.BarFasLin, 0) AS BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar FROM ((TXPBARFAS T5 LEFT JOIN (SELECT MIN(T8.ProCod)" ;
      scmdbuf += " AS BarProCod, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod" ;
      scmdbuf += " AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE T8.BarOrdLin = COALESCE( T9.BarFasLin, 0) GROUP BY T9.BarFasLin," ;
      scmdbuf += " T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T5.EmprCod AND T7.BarCod = T5.BarCod AND T7.BarCodReo = T5.BarCodReo AND T7.BarCodPar = T5.BarCodPar) WHERE T5.ProCod = COALESCE( T6.BarProCod," ;
      scmdbuf += " '') and T5.BarOrdLin = COALESCE( T7.BarFasLin, 0) GROUP BY T6.BarProCod, T7.BarFasLin, T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T5.FasCod) AS BarFasCod, T5.EmprCod, T5.BarCod," ;
      scmdbuf += " T5.BarCodReo, T5.BarCodPar FROM (TXPBARFAS T5 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <>" ;
      scmdbuf += " 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T5.EmprCod AND T6.BarCod = T5.BarCod AND T6.BarCodReo = T5.BarCodReo AND T6.BarCodPar = T5.BarCodPar)" ;
      scmdbuf += " WHERE (T5.BarOrdLin = T6.GXC1) AND (T5.BarFasEst <> 0) GROUP BY T5.EmprCod, T5.BarCod, T5.BarCodReo, T5.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod" ;
      scmdbuf += " = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbRecCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarPiePie,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) >= ?))");
      if ( (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV60Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV62Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV64Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV68Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV69Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (0==AV77Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_consultaalmacentejidoencrudoproduccion_wcds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
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
                  return conditional_P09K18(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() );
            case 1 :
                  return conditional_P09K115(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() );
            case 2 :
                  return conditional_P09K122(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() );
            case 3 :
                  return conditional_P09K129(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() );
            case 4 :
                  return conditional_P09K136(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() );
            case 5 :
                  return conditional_P09K143(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() );
            case 6 :
                  return conditional_P09K150(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09K18", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09K115", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09K122", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09K129", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09K136", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09K143", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09K150", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 9);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 9);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((String[]) buf[19])[0] = rslt.getString(18, 9);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[58]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 1);
               }
               return;
      }
   }

}

