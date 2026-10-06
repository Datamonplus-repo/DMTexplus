package app.recetasdeacabados ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadeacabado_cierre_wcgetfilterdata extends GXProcedure
{
   public recetadeacabado_cierre_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadeacabado_cierre_wcgetfilterdata.class ), "" );
   }

   public recetadeacabado_cierre_wcgetfilterdata( int remoteHandle ,
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
      recetadeacabado_cierre_wcgetfilterdata.this.aP5 = new String[] {""};
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
      recetadeacabado_cierre_wcgetfilterdata.this.AV130DDOName = aP0;
      recetadeacabado_cierre_wcgetfilterdata.this.AV128SearchTxt = aP1;
      recetadeacabado_cierre_wcgetfilterdata.this.AV129SearchTxtTo = aP2;
      recetadeacabado_cierre_wcgetfilterdata.this.aP3 = aP3;
      recetadeacabado_cierre_wcgetfilterdata.this.aP4 = aP4;
      recetadeacabado_cierre_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV133Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV136OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV138OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV130DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV130DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV130DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV130DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV130DDOName), "DDO_BARNOMCLI") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV130DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV134OptionsJson = AV133Options.toJSonString(false) ;
      AV137OptionsDescJson = AV136OptionsDesc.toJSonString(false) ;
      AV139OptionIndexesJson = AV138OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV141Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCGridState"), "") == 0 )
      {
         AV143GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasDeAcabados.RecetadeAcabado_Cierre_WCGridState"), null, null);
      }
      else
      {
         AV143GridState.fromxml(AV141Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCGridState"), null, null);
      }
      AV163GXV1 = 1 ;
      while ( AV163GXV1 <= AV143GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV144GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV143GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV163GXV1));
         if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV18TFBarNHdr = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV19TFBarNHdr_Sel = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV34TFRecLinMaq = (short)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFRecLinMaq_To = (short)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV147TFBarSit = (byte)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV148TFBarSit_To = (byte)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV20TFBarSer = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV21TFBarSer_Sel = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV22TFBarSerDsc = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV23TFBarSerDsc_Sel = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV24TFBarColNom = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV25TFBarColNom_Sel = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV26TFBarColNum = (int)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFBarColNum_To = (int)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV28TFBarTipCol = (byte)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFBarTipCol_To = (byte)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV30TFBarNomCli = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV31TFBarNomCli_Sel = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV32TFBarNumCli = (int)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFBarNumCli_To = (int)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV36TFMaqCod = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV37TFMaqCod_Sel = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV38TFRecVolPrd = (int)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFRecVolPrd_To = (int)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGM") == 0 )
         {
            AV149TFRecTotKgm = CommonUtil.decimalVal( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV150TFRecTotKgm_To = CommonUtil.decimalVal( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV151TFRecFecAlt = localUtil.ctot( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANY") == 0 )
         {
            AV153TFBarNumAny = (short)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV154TFBarNumAny_To = (short)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV155Emprcod = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV156Barcod = (int)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV157Barcodreo = (byte)(GXutil.lval( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV158Barcodpar = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHACIERRE") == 0 )
         {
            AV159FechaCierre = localUtil.ctod( AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECACAB") == 0 )
         {
            AV160RecAcab = AV144GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV163GXV1 = (int)(AV163GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarNHdr = AV128SearchTxt ;
      AV19TFBarNHdr_Sel = "" ;
      AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV34TFRecLinMaq ;
      AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV35TFRecLinMaq_To ;
      AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV147TFBarSit ;
      AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV148TFBarSit_To ;
      AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV20TFBarSer ;
      AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV21TFBarSer_Sel ;
      AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV22TFBarSerDsc ;
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV24TFBarColNom ;
      AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV26TFBarColNum ;
      AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV28TFBarTipCol ;
      AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV29TFBarTipCol_To ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV30TFBarNomCli ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV32TFBarNumCli ;
      AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV33TFBarNumCli_To ;
      AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV36TFMaqCod ;
      AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV37TFMaqCod_Sel ;
      AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV38TFRecVolPrd ;
      AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV39TFRecVolPrd_To ;
      AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV149TFRecTotKgm ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV150TFRecTotKgm_To ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV151TFRecFecAlt ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV153TFBarNumAny ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV154TFBarNumAny_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) ,
                                           Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) ,
                                           Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) ,
                                           Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) ,
                                           AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) ,
                                           Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) ,
                                           Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) ,
                                           Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) ,
                                           AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) ,
                                           Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) ,
                                           AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) ,
                                           Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) ,
                                           AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) ,
                                           Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) ,
                                           Integer.valueOf(AV156Barcod) ,
                                           Byte.valueOf(AV157Barcodreo) ,
                                           AV158Barcodpar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(A189BarNumAny) ,
                                           AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           A812RecTotKgm ,
                                           AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           A6039RecAcab ,
                                           AV160RecAcab ,
                                           AV155Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr), 11, "%") ;
      lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = GXutil.padr( GXutil.rtrim( AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser), 16, "%") ;
      lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc), 26, "%") ;
      lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom), 13, "%") ;
      lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli), 13, "%") ;
      lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod), 6, "%") ;
      /* Using cursor P09H25 */
      pr_default.execute(0, new Object[] {AV155Emprcod, AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV160RecAcab, lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr, AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel, Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq), Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to), Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit), Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to), lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser, AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel, lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc, AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel, lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom, AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel, Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum), Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to), Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol), Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to), lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli, AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel, Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli), Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to), lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod, AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel, Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd), Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt, Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany), Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to), Integer.valueOf(AV156Barcod), Byte.valueOf(AV157Barcodreo), AV158Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P09H25_A6039RecAcab[0] ;
         n6039RecAcab = P09H25_n6039RecAcab[0] ;
         A396EmprCod = P09H25_A396EmprCod[0] ;
         A189BarNumAny = P09H25_A189BarNumAny[0] ;
         A4866RecFecAlt = P09H25_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09H25_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09H25_A2805RecVolPrd[0] ;
         A602MaqCod = P09H25_A602MaqCod[0] ;
         A1235BarNumCli = P09H25_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H25_A1234BarNomCli[0] ;
         A218BarTipCol = P09H25_A218BarTipCol[0] ;
         A136BarColNum = P09H25_A136BarColNum[0] ;
         A135BarColNom = P09H25_A135BarColNom[0] ;
         A1652BarSerDsc = P09H25_A1652BarSerDsc[0] ;
         A212BarSer = P09H25_A212BarSer[0] ;
         A213BarSit = P09H25_A213BarSit[0] ;
         A2804RecLinMaq = P09H25_A2804RecLinMaq[0] ;
         A812RecTotKgm = P09H25_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H25_n812RecTotKgm[0] ;
         A130BarCodPar = P09H25_A130BarCodPar[0] ;
         A132BarCodReo = P09H25_A132BarCodReo[0] ;
         A129BarCod = P09H25_A129BarCod[0] ;
         A189BarNumAny = P09H25_A189BarNumAny[0] ;
         A1235BarNumCli = P09H25_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H25_A1234BarNomCli[0] ;
         A218BarTipCol = P09H25_A218BarTipCol[0] ;
         A136BarColNum = P09H25_A136BarColNum[0] ;
         A135BarColNom = P09H25_A135BarColNom[0] ;
         A1652BarSerDsc = P09H25_A1652BarSerDsc[0] ;
         A212BarSer = P09H25_A212BarSer[0] ;
         A213BarSit = P09H25_A213BarSit[0] ;
         A812RecTotKgm = P09H25_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H25_n812RecTotKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV132Option = A13696BarNHdr ;
            AV131InsertIndex = 1 ;
            while ( ( AV131InsertIndex <= AV133Options.size() ) && ( GXutil.strcmp((String)AV133Options.elementAt(-1+AV131InsertIndex), AV132Option) < 0 ) )
            {
               AV131InsertIndex = (int)(AV131InsertIndex+1) ;
            }
            if ( ( AV131InsertIndex <= AV133Options.size() ) && ( GXutil.strcmp((String)AV133Options.elementAt(-1+AV131InsertIndex), AV132Option) == 0 ) )
            {
               AV140count = GXutil.lval( (String)AV138OptionIndexes.elementAt(-1+AV131InsertIndex)) ;
               AV140count = (long)(AV140count+1) ;
               AV138OptionIndexes.removeItem(AV131InsertIndex);
               AV138OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV140count), "Z,ZZZ,ZZZ,ZZ9")), AV131InsertIndex);
            }
            else
            {
               AV133Options.add(AV132Option, AV131InsertIndex);
               AV138OptionIndexes.add("1", AV131InsertIndex);
            }
         }
         if ( AV133Options.size() == 50 )
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
      AV20TFBarSer = AV128SearchTxt ;
      AV21TFBarSer_Sel = "" ;
      AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV34TFRecLinMaq ;
      AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV35TFRecLinMaq_To ;
      AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV147TFBarSit ;
      AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV148TFBarSit_To ;
      AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV20TFBarSer ;
      AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV21TFBarSer_Sel ;
      AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV22TFBarSerDsc ;
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV24TFBarColNom ;
      AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV26TFBarColNum ;
      AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV28TFBarTipCol ;
      AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV29TFBarTipCol_To ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV30TFBarNomCli ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV32TFBarNumCli ;
      AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV33TFBarNumCli_To ;
      AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV36TFMaqCod ;
      AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV37TFMaqCod_Sel ;
      AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV38TFRecVolPrd ;
      AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV39TFRecVolPrd_To ;
      AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV149TFRecTotKgm ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV150TFRecTotKgm_To ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV151TFRecFecAlt ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV153TFBarNumAny ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV154TFBarNumAny_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) ,
                                           Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) ,
                                           Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) ,
                                           Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) ,
                                           AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) ,
                                           Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) ,
                                           Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) ,
                                           Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) ,
                                           AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) ,
                                           Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) ,
                                           AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) ,
                                           Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) ,
                                           AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) ,
                                           Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) ,
                                           Integer.valueOf(AV156Barcod) ,
                                           Byte.valueOf(AV157Barcodreo) ,
                                           AV158Barcodpar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(A189BarNumAny) ,
                                           AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           A812RecTotKgm ,
                                           AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           A396EmprCod ,
                                           AV155Emprcod ,
                                           A6039RecAcab ,
                                           AV160RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr), 11, "%") ;
      lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = GXutil.padr( GXutil.rtrim( AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser), 16, "%") ;
      lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc), 26, "%") ;
      lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom), 13, "%") ;
      lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli), 13, "%") ;
      lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod), 6, "%") ;
      /* Using cursor P09H29 */
      pr_default.execute(1, new Object[] {AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV155Emprcod, AV160RecAcab, lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr, AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel, Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq), Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to), Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit), Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to), lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser, AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel, lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc, AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel, lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom, AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel, Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum), Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to), Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol), Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to), lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli, AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel, Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli), Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to), lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod, AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel, Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd), Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt, Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany), Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to), Integer.valueOf(AV156Barcod), Byte.valueOf(AV157Barcodreo), AV158Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9H23 = false ;
         A396EmprCod = P09H29_A396EmprCod[0] ;
         A6039RecAcab = P09H29_A6039RecAcab[0] ;
         n6039RecAcab = P09H29_n6039RecAcab[0] ;
         A212BarSer = P09H29_A212BarSer[0] ;
         A189BarNumAny = P09H29_A189BarNumAny[0] ;
         A4866RecFecAlt = P09H29_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09H29_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09H29_A2805RecVolPrd[0] ;
         A602MaqCod = P09H29_A602MaqCod[0] ;
         A1235BarNumCli = P09H29_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H29_A1234BarNomCli[0] ;
         A218BarTipCol = P09H29_A218BarTipCol[0] ;
         A136BarColNum = P09H29_A136BarColNum[0] ;
         A135BarColNom = P09H29_A135BarColNom[0] ;
         A1652BarSerDsc = P09H29_A1652BarSerDsc[0] ;
         A213BarSit = P09H29_A213BarSit[0] ;
         A2804RecLinMaq = P09H29_A2804RecLinMaq[0] ;
         A812RecTotKgm = P09H29_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H29_n812RecTotKgm[0] ;
         A130BarCodPar = P09H29_A130BarCodPar[0] ;
         A132BarCodReo = P09H29_A132BarCodReo[0] ;
         A129BarCod = P09H29_A129BarCod[0] ;
         A212BarSer = P09H29_A212BarSer[0] ;
         A189BarNumAny = P09H29_A189BarNumAny[0] ;
         A1235BarNumCli = P09H29_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H29_A1234BarNomCli[0] ;
         A218BarTipCol = P09H29_A218BarTipCol[0] ;
         A136BarColNum = P09H29_A136BarColNum[0] ;
         A135BarColNom = P09H29_A135BarColNom[0] ;
         A1652BarSerDsc = P09H29_A1652BarSerDsc[0] ;
         A213BarSit = P09H29_A213BarSit[0] ;
         A812RecTotKgm = P09H29_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H29_n812RecTotKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV140count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09H29_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk9H23 = false ;
            A396EmprCod = P09H29_A396EmprCod[0] ;
            A2804RecLinMaq = P09H29_A2804RecLinMaq[0] ;
            A130BarCodPar = P09H29_A130BarCodPar[0] ;
            A132BarCodReo = P09H29_A132BarCodReo[0] ;
            A129BarCod = P09H29_A129BarCod[0] ;
            AV140count = (long)(AV140count+1) ;
            brk9H23 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV132Option = A212BarSer ;
            AV133Options.add(AV132Option, 0);
            AV138OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV140count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV133Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9H23 )
         {
            brk9H23 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarSerDsc = AV128SearchTxt ;
      AV23TFBarSerDsc_Sel = "" ;
      AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV34TFRecLinMaq ;
      AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV35TFRecLinMaq_To ;
      AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV147TFBarSit ;
      AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV148TFBarSit_To ;
      AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV20TFBarSer ;
      AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV21TFBarSer_Sel ;
      AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV22TFBarSerDsc ;
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV24TFBarColNom ;
      AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV26TFBarColNum ;
      AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV28TFBarTipCol ;
      AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV29TFBarTipCol_To ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV30TFBarNomCli ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV32TFBarNumCli ;
      AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV33TFBarNumCli_To ;
      AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV36TFMaqCod ;
      AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV37TFMaqCod_Sel ;
      AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV38TFRecVolPrd ;
      AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV39TFRecVolPrd_To ;
      AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV149TFRecTotKgm ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV150TFRecTotKgm_To ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV151TFRecFecAlt ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV153TFBarNumAny ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV154TFBarNumAny_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) ,
                                           Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) ,
                                           Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) ,
                                           Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) ,
                                           AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) ,
                                           Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) ,
                                           Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) ,
                                           Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) ,
                                           AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) ,
                                           Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) ,
                                           AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) ,
                                           Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) ,
                                           AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) ,
                                           Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) ,
                                           Integer.valueOf(AV156Barcod) ,
                                           Byte.valueOf(AV157Barcodreo) ,
                                           AV158Barcodpar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(A189BarNumAny) ,
                                           AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           A812RecTotKgm ,
                                           AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           A396EmprCod ,
                                           AV155Emprcod ,
                                           A6039RecAcab ,
                                           AV160RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr), 11, "%") ;
      lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = GXutil.padr( GXutil.rtrim( AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser), 16, "%") ;
      lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc), 26, "%") ;
      lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom), 13, "%") ;
      lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli), 13, "%") ;
      lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod), 6, "%") ;
      /* Using cursor P09H213 */
      pr_default.execute(2, new Object[] {AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV155Emprcod, AV160RecAcab, lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr, AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel, Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq), Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to), Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit), Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to), lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser, AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel, lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc, AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel, lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom, AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel, Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum), Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to), Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol), Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to), lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli, AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel, Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli), Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to), lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod, AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel, Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd), Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt, Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany), Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to), Integer.valueOf(AV156Barcod), Byte.valueOf(AV157Barcodreo), AV158Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9H25 = false ;
         A396EmprCod = P09H213_A396EmprCod[0] ;
         A6039RecAcab = P09H213_A6039RecAcab[0] ;
         n6039RecAcab = P09H213_n6039RecAcab[0] ;
         A1652BarSerDsc = P09H213_A1652BarSerDsc[0] ;
         A189BarNumAny = P09H213_A189BarNumAny[0] ;
         A4866RecFecAlt = P09H213_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09H213_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09H213_A2805RecVolPrd[0] ;
         A602MaqCod = P09H213_A602MaqCod[0] ;
         A1235BarNumCli = P09H213_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H213_A1234BarNomCli[0] ;
         A218BarTipCol = P09H213_A218BarTipCol[0] ;
         A136BarColNum = P09H213_A136BarColNum[0] ;
         A135BarColNom = P09H213_A135BarColNom[0] ;
         A212BarSer = P09H213_A212BarSer[0] ;
         A213BarSit = P09H213_A213BarSit[0] ;
         A2804RecLinMaq = P09H213_A2804RecLinMaq[0] ;
         A812RecTotKgm = P09H213_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H213_n812RecTotKgm[0] ;
         A130BarCodPar = P09H213_A130BarCodPar[0] ;
         A132BarCodReo = P09H213_A132BarCodReo[0] ;
         A129BarCod = P09H213_A129BarCod[0] ;
         A1652BarSerDsc = P09H213_A1652BarSerDsc[0] ;
         A189BarNumAny = P09H213_A189BarNumAny[0] ;
         A1235BarNumCli = P09H213_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H213_A1234BarNomCli[0] ;
         A218BarTipCol = P09H213_A218BarTipCol[0] ;
         A136BarColNum = P09H213_A136BarColNum[0] ;
         A135BarColNom = P09H213_A135BarColNom[0] ;
         A212BarSer = P09H213_A212BarSer[0] ;
         A213BarSit = P09H213_A213BarSit[0] ;
         A812RecTotKgm = P09H213_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H213_n812RecTotKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV140count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09H213_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk9H25 = false ;
            A396EmprCod = P09H213_A396EmprCod[0] ;
            A2804RecLinMaq = P09H213_A2804RecLinMaq[0] ;
            A130BarCodPar = P09H213_A130BarCodPar[0] ;
            A132BarCodReo = P09H213_A132BarCodReo[0] ;
            A129BarCod = P09H213_A129BarCod[0] ;
            AV140count = (long)(AV140count+1) ;
            brk9H25 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV132Option = A1652BarSerDsc ;
            AV133Options.add(AV132Option, 0);
            AV138OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV140count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV133Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9H25 )
         {
            brk9H25 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarColNom = AV128SearchTxt ;
      AV25TFBarColNom_Sel = "" ;
      AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV34TFRecLinMaq ;
      AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV35TFRecLinMaq_To ;
      AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV147TFBarSit ;
      AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV148TFBarSit_To ;
      AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV20TFBarSer ;
      AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV21TFBarSer_Sel ;
      AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV22TFBarSerDsc ;
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV24TFBarColNom ;
      AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV26TFBarColNum ;
      AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV28TFBarTipCol ;
      AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV29TFBarTipCol_To ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV30TFBarNomCli ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV32TFBarNumCli ;
      AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV33TFBarNumCli_To ;
      AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV36TFMaqCod ;
      AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV37TFMaqCod_Sel ;
      AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV38TFRecVolPrd ;
      AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV39TFRecVolPrd_To ;
      AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV149TFRecTotKgm ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV150TFRecTotKgm_To ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV151TFRecFecAlt ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV153TFBarNumAny ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV154TFBarNumAny_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) ,
                                           Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) ,
                                           Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) ,
                                           Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) ,
                                           AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) ,
                                           Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) ,
                                           Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) ,
                                           Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) ,
                                           AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) ,
                                           Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) ,
                                           AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) ,
                                           Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) ,
                                           AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) ,
                                           Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) ,
                                           Integer.valueOf(AV156Barcod) ,
                                           Byte.valueOf(AV157Barcodreo) ,
                                           AV158Barcodpar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(A189BarNumAny) ,
                                           AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           A812RecTotKgm ,
                                           AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           A396EmprCod ,
                                           AV155Emprcod ,
                                           A6039RecAcab ,
                                           AV160RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr), 11, "%") ;
      lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = GXutil.padr( GXutil.rtrim( AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser), 16, "%") ;
      lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc), 26, "%") ;
      lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom), 13, "%") ;
      lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli), 13, "%") ;
      lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod), 6, "%") ;
      /* Using cursor P09H217 */
      pr_default.execute(3, new Object[] {AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV155Emprcod, AV160RecAcab, lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr, AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel, Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq), Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to), Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit), Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to), lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser, AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel, lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc, AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel, lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom, AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel, Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum), Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to), Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol), Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to), lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli, AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel, Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli), Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to), lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod, AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel, Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd), Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt, Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany), Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to), Integer.valueOf(AV156Barcod), Byte.valueOf(AV157Barcodreo), AV158Barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9H27 = false ;
         A396EmprCod = P09H217_A396EmprCod[0] ;
         A6039RecAcab = P09H217_A6039RecAcab[0] ;
         n6039RecAcab = P09H217_n6039RecAcab[0] ;
         A135BarColNom = P09H217_A135BarColNom[0] ;
         A189BarNumAny = P09H217_A189BarNumAny[0] ;
         A4866RecFecAlt = P09H217_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09H217_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09H217_A2805RecVolPrd[0] ;
         A602MaqCod = P09H217_A602MaqCod[0] ;
         A1235BarNumCli = P09H217_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H217_A1234BarNomCli[0] ;
         A218BarTipCol = P09H217_A218BarTipCol[0] ;
         A136BarColNum = P09H217_A136BarColNum[0] ;
         A1652BarSerDsc = P09H217_A1652BarSerDsc[0] ;
         A212BarSer = P09H217_A212BarSer[0] ;
         A213BarSit = P09H217_A213BarSit[0] ;
         A2804RecLinMaq = P09H217_A2804RecLinMaq[0] ;
         A812RecTotKgm = P09H217_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H217_n812RecTotKgm[0] ;
         A130BarCodPar = P09H217_A130BarCodPar[0] ;
         A132BarCodReo = P09H217_A132BarCodReo[0] ;
         A129BarCod = P09H217_A129BarCod[0] ;
         A135BarColNom = P09H217_A135BarColNom[0] ;
         A189BarNumAny = P09H217_A189BarNumAny[0] ;
         A1235BarNumCli = P09H217_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H217_A1234BarNomCli[0] ;
         A218BarTipCol = P09H217_A218BarTipCol[0] ;
         A136BarColNum = P09H217_A136BarColNum[0] ;
         A1652BarSerDsc = P09H217_A1652BarSerDsc[0] ;
         A212BarSer = P09H217_A212BarSer[0] ;
         A213BarSit = P09H217_A213BarSit[0] ;
         A812RecTotKgm = P09H217_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H217_n812RecTotKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV140count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09H217_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk9H27 = false ;
            A396EmprCod = P09H217_A396EmprCod[0] ;
            A2804RecLinMaq = P09H217_A2804RecLinMaq[0] ;
            A130BarCodPar = P09H217_A130BarCodPar[0] ;
            A132BarCodReo = P09H217_A132BarCodReo[0] ;
            A129BarCod = P09H217_A129BarCod[0] ;
            AV140count = (long)(AV140count+1) ;
            brk9H27 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV132Option = A135BarColNom ;
            AV133Options.add(AV132Option, 0);
            AV138OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV140count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV133Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9H27 )
         {
            brk9H27 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV30TFBarNomCli = AV128SearchTxt ;
      AV31TFBarNomCli_Sel = "" ;
      AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV34TFRecLinMaq ;
      AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV35TFRecLinMaq_To ;
      AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV147TFBarSit ;
      AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV148TFBarSit_To ;
      AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV20TFBarSer ;
      AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV21TFBarSer_Sel ;
      AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV22TFBarSerDsc ;
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV24TFBarColNom ;
      AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV26TFBarColNum ;
      AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV28TFBarTipCol ;
      AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV29TFBarTipCol_To ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV30TFBarNomCli ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV32TFBarNumCli ;
      AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV33TFBarNumCli_To ;
      AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV36TFMaqCod ;
      AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV37TFMaqCod_Sel ;
      AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV38TFRecVolPrd ;
      AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV39TFRecVolPrd_To ;
      AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV149TFRecTotKgm ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV150TFRecTotKgm_To ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV151TFRecFecAlt ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV153TFBarNumAny ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV154TFBarNumAny_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) ,
                                           Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) ,
                                           Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) ,
                                           Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) ,
                                           AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) ,
                                           Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) ,
                                           Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) ,
                                           Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) ,
                                           AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) ,
                                           Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) ,
                                           AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) ,
                                           Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) ,
                                           AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) ,
                                           Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) ,
                                           Integer.valueOf(AV156Barcod) ,
                                           Byte.valueOf(AV157Barcodreo) ,
                                           AV158Barcodpar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(A189BarNumAny) ,
                                           AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           A812RecTotKgm ,
                                           AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           A396EmprCod ,
                                           AV155Emprcod ,
                                           A6039RecAcab ,
                                           AV160RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr), 11, "%") ;
      lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = GXutil.padr( GXutil.rtrim( AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser), 16, "%") ;
      lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc), 26, "%") ;
      lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom), 13, "%") ;
      lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli), 13, "%") ;
      lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod), 6, "%") ;
      /* Using cursor P09H221 */
      pr_default.execute(4, new Object[] {AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV155Emprcod, AV160RecAcab, lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr, AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel, Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq), Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to), Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit), Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to), lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser, AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel, lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc, AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel, lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom, AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel, Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum), Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to), Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol), Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to), lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli, AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel, Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli), Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to), lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod, AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel, Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd), Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt, Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany), Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to), Integer.valueOf(AV156Barcod), Byte.valueOf(AV157Barcodreo), AV158Barcodpar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9H29 = false ;
         A396EmprCod = P09H221_A396EmprCod[0] ;
         A6039RecAcab = P09H221_A6039RecAcab[0] ;
         n6039RecAcab = P09H221_n6039RecAcab[0] ;
         A1234BarNomCli = P09H221_A1234BarNomCli[0] ;
         A189BarNumAny = P09H221_A189BarNumAny[0] ;
         A4866RecFecAlt = P09H221_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09H221_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09H221_A2805RecVolPrd[0] ;
         A602MaqCod = P09H221_A602MaqCod[0] ;
         A1235BarNumCli = P09H221_A1235BarNumCli[0] ;
         A218BarTipCol = P09H221_A218BarTipCol[0] ;
         A136BarColNum = P09H221_A136BarColNum[0] ;
         A135BarColNom = P09H221_A135BarColNom[0] ;
         A1652BarSerDsc = P09H221_A1652BarSerDsc[0] ;
         A212BarSer = P09H221_A212BarSer[0] ;
         A213BarSit = P09H221_A213BarSit[0] ;
         A2804RecLinMaq = P09H221_A2804RecLinMaq[0] ;
         A812RecTotKgm = P09H221_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H221_n812RecTotKgm[0] ;
         A130BarCodPar = P09H221_A130BarCodPar[0] ;
         A132BarCodReo = P09H221_A132BarCodReo[0] ;
         A129BarCod = P09H221_A129BarCod[0] ;
         A1234BarNomCli = P09H221_A1234BarNomCli[0] ;
         A189BarNumAny = P09H221_A189BarNumAny[0] ;
         A1235BarNumCli = P09H221_A1235BarNumCli[0] ;
         A218BarTipCol = P09H221_A218BarTipCol[0] ;
         A136BarColNum = P09H221_A136BarColNum[0] ;
         A135BarColNom = P09H221_A135BarColNom[0] ;
         A1652BarSerDsc = P09H221_A1652BarSerDsc[0] ;
         A212BarSer = P09H221_A212BarSer[0] ;
         A213BarSit = P09H221_A213BarSit[0] ;
         A812RecTotKgm = P09H221_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H221_n812RecTotKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV140count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09H221_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk9H29 = false ;
            A396EmprCod = P09H221_A396EmprCod[0] ;
            A2804RecLinMaq = P09H221_A2804RecLinMaq[0] ;
            A130BarCodPar = P09H221_A130BarCodPar[0] ;
            A132BarCodReo = P09H221_A132BarCodReo[0] ;
            A129BarCod = P09H221_A129BarCod[0] ;
            AV140count = (long)(AV140count+1) ;
            brk9H29 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV132Option = A1234BarNomCli ;
            AV133Options.add(AV132Option, 0);
            AV138OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV140count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV133Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9H29 )
         {
            brk9H29 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV36TFMaqCod = AV128SearchTxt ;
      AV37TFMaqCod_Sel = "" ;
      AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV18TFBarNHdr ;
      AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV19TFBarNHdr_Sel ;
      AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV34TFRecLinMaq ;
      AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV35TFRecLinMaq_To ;
      AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV147TFBarSit ;
      AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV148TFBarSit_To ;
      AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV20TFBarSer ;
      AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV21TFBarSer_Sel ;
      AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV22TFBarSerDsc ;
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV24TFBarColNom ;
      AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV25TFBarColNom_Sel ;
      AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV26TFBarColNum ;
      AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV27TFBarColNum_To ;
      AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV28TFBarTipCol ;
      AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV29TFBarTipCol_To ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV30TFBarNomCli ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV32TFBarNumCli ;
      AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV33TFBarNumCli_To ;
      AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV36TFMaqCod ;
      AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV37TFMaqCod_Sel ;
      AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV38TFRecVolPrd ;
      AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV39TFRecVolPrd_To ;
      AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV149TFRecTotKgm ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV150TFRecTotKgm_To ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV151TFRecFecAlt ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV153TFBarNumAny ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV154TFBarNumAny_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) ,
                                           Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) ,
                                           Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) ,
                                           Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) ,
                                           AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) ,
                                           Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) ,
                                           Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) ,
                                           Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) ,
                                           AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) ,
                                           Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) ,
                                           AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) ,
                                           Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) ,
                                           AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) ,
                                           Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) ,
                                           Integer.valueOf(AV156Barcod) ,
                                           Byte.valueOf(AV157Barcodreo) ,
                                           AV158Barcodpar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(A189BarNumAny) ,
                                           AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           A812RecTotKgm ,
                                           AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           A6039RecAcab ,
                                           AV160RecAcab ,
                                           AV155Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr), 11, "%") ;
      lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = GXutil.padr( GXutil.rtrim( AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser), 16, "%") ;
      lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc), 26, "%") ;
      lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom), 13, "%") ;
      lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli), 13, "%") ;
      lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod), 6, "%") ;
      /* Using cursor P09H225 */
      pr_default.execute(5, new Object[] {AV155Emprcod, AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV160RecAcab, lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr, AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel, Short.valueOf(AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq), Short.valueOf(AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to), Byte.valueOf(AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit), Byte.valueOf(AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to), lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser, AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel, lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc, AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel, lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom, AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel, Integer.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum), Integer.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to), Byte.valueOf(AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol), Byte.valueOf(AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to), lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli, AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel, Integer.valueOf(AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli), Integer.valueOf(AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to), lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod, AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel, Integer.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd), Integer.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt, Short.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany), Short.valueOf(AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to), Integer.valueOf(AV156Barcod), Byte.valueOf(AV157Barcodreo), AV158Barcodpar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9H211 = false ;
         A396EmprCod = P09H225_A396EmprCod[0] ;
         A602MaqCod = P09H225_A602MaqCod[0] ;
         A6039RecAcab = P09H225_A6039RecAcab[0] ;
         n6039RecAcab = P09H225_n6039RecAcab[0] ;
         A189BarNumAny = P09H225_A189BarNumAny[0] ;
         A4866RecFecAlt = P09H225_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09H225_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09H225_A2805RecVolPrd[0] ;
         A1235BarNumCli = P09H225_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H225_A1234BarNomCli[0] ;
         A218BarTipCol = P09H225_A218BarTipCol[0] ;
         A136BarColNum = P09H225_A136BarColNum[0] ;
         A135BarColNom = P09H225_A135BarColNom[0] ;
         A1652BarSerDsc = P09H225_A1652BarSerDsc[0] ;
         A212BarSer = P09H225_A212BarSer[0] ;
         A213BarSit = P09H225_A213BarSit[0] ;
         A2804RecLinMaq = P09H225_A2804RecLinMaq[0] ;
         A812RecTotKgm = P09H225_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H225_n812RecTotKgm[0] ;
         A130BarCodPar = P09H225_A130BarCodPar[0] ;
         A132BarCodReo = P09H225_A132BarCodReo[0] ;
         A129BarCod = P09H225_A129BarCod[0] ;
         A189BarNumAny = P09H225_A189BarNumAny[0] ;
         A1235BarNumCli = P09H225_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H225_A1234BarNomCli[0] ;
         A218BarTipCol = P09H225_A218BarTipCol[0] ;
         A136BarColNum = P09H225_A136BarColNum[0] ;
         A135BarColNom = P09H225_A135BarColNom[0] ;
         A1652BarSerDsc = P09H225_A1652BarSerDsc[0] ;
         A212BarSer = P09H225_A212BarSer[0] ;
         A213BarSit = P09H225_A213BarSit[0] ;
         A812RecTotKgm = P09H225_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H225_n812RecTotKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV140count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09H225_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09H225_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk9H211 = false ;
            A2804RecLinMaq = P09H225_A2804RecLinMaq[0] ;
            A130BarCodPar = P09H225_A130BarCodPar[0] ;
            A132BarCodReo = P09H225_A132BarCodReo[0] ;
            A129BarCod = P09H225_A129BarCod[0] ;
            AV140count = (long)(AV140count+1) ;
            brk9H211 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV132Option = A602MaqCod ;
            AV133Options.add(AV132Option, 0);
            AV138OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV140count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV133Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9H211 )
         {
            brk9H211 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetadeacabado_cierre_wcgetfilterdata.this.AV134OptionsJson;
      this.aP4[0] = recetadeacabado_cierre_wcgetfilterdata.this.AV137OptionsDescJson;
      this.aP5[0] = recetadeacabado_cierre_wcgetfilterdata.this.AV139OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV134OptionsJson = "" ;
      AV137OptionsDescJson = "" ;
      AV139OptionIndexesJson = "" ;
      AV133Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV136OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV138OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV141Session = httpContext.getWebSession();
      AV143GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV144GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV18TFBarNHdr = "" ;
      AV19TFBarNHdr_Sel = "" ;
      AV20TFBarSer = "" ;
      AV21TFBarSer_Sel = "" ;
      AV22TFBarSerDsc = "" ;
      AV23TFBarSerDsc_Sel = "" ;
      AV24TFBarColNom = "" ;
      AV25TFBarColNom_Sel = "" ;
      AV30TFBarNomCli = "" ;
      AV31TFBarNomCli_Sel = "" ;
      AV36TFMaqCod = "" ;
      AV37TFMaqCod_Sel = "" ;
      AV149TFRecTotKgm = DecimalUtil.ZERO ;
      AV150TFRecTotKgm_To = DecimalUtil.ZERO ;
      AV151TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV155Emprcod = "" ;
      AV158Barcodpar = "" ;
      AV159FechaCierre = GXutil.nullDate() ;
      AV160RecAcab = "" ;
      A13696BarNHdr = "" ;
      AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = "" ;
      AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = "" ;
      AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = "" ;
      AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = "" ;
      AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = "" ;
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = "" ;
      AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = "" ;
      AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = "" ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = "" ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = "" ;
      AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = "" ;
      AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = "" ;
      AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = DecimalUtil.ZERO ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = DecimalUtil.ZERO ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = "" ;
      lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = "" ;
      lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = "" ;
      lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = "" ;
      lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = "" ;
      lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A602MaqCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A812RecTotKgm = DecimalUtil.ZERO ;
      A6039RecAcab = "" ;
      A396EmprCod = "" ;
      P09H25_A6039RecAcab = new String[] {""} ;
      P09H25_n6039RecAcab = new boolean[] {false} ;
      P09H25_A396EmprCod = new String[] {""} ;
      P09H25_A189BarNumAny = new short[1] ;
      P09H25_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09H25_n4866RecFecAlt = new boolean[] {false} ;
      P09H25_A2805RecVolPrd = new int[1] ;
      P09H25_A602MaqCod = new String[] {""} ;
      P09H25_A1235BarNumCli = new int[1] ;
      P09H25_A1234BarNomCli = new String[] {""} ;
      P09H25_A218BarTipCol = new byte[1] ;
      P09H25_A136BarColNum = new int[1] ;
      P09H25_A135BarColNom = new String[] {""} ;
      P09H25_A1652BarSerDsc = new String[] {""} ;
      P09H25_A212BarSer = new String[] {""} ;
      P09H25_A213BarSit = new byte[1] ;
      P09H25_A2804RecLinMaq = new short[1] ;
      P09H25_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H25_n812RecTotKgm = new boolean[] {false} ;
      P09H25_A130BarCodPar = new String[] {""} ;
      P09H25_A132BarCodReo = new byte[1] ;
      P09H25_A129BarCod = new int[1] ;
      AV132Option = "" ;
      P09H29_A396EmprCod = new String[] {""} ;
      P09H29_A6039RecAcab = new String[] {""} ;
      P09H29_n6039RecAcab = new boolean[] {false} ;
      P09H29_A212BarSer = new String[] {""} ;
      P09H29_A189BarNumAny = new short[1] ;
      P09H29_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09H29_n4866RecFecAlt = new boolean[] {false} ;
      P09H29_A2805RecVolPrd = new int[1] ;
      P09H29_A602MaqCod = new String[] {""} ;
      P09H29_A1235BarNumCli = new int[1] ;
      P09H29_A1234BarNomCli = new String[] {""} ;
      P09H29_A218BarTipCol = new byte[1] ;
      P09H29_A136BarColNum = new int[1] ;
      P09H29_A135BarColNom = new String[] {""} ;
      P09H29_A1652BarSerDsc = new String[] {""} ;
      P09H29_A213BarSit = new byte[1] ;
      P09H29_A2804RecLinMaq = new short[1] ;
      P09H29_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H29_n812RecTotKgm = new boolean[] {false} ;
      P09H29_A130BarCodPar = new String[] {""} ;
      P09H29_A132BarCodReo = new byte[1] ;
      P09H29_A129BarCod = new int[1] ;
      P09H213_A396EmprCod = new String[] {""} ;
      P09H213_A6039RecAcab = new String[] {""} ;
      P09H213_n6039RecAcab = new boolean[] {false} ;
      P09H213_A1652BarSerDsc = new String[] {""} ;
      P09H213_A189BarNumAny = new short[1] ;
      P09H213_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09H213_n4866RecFecAlt = new boolean[] {false} ;
      P09H213_A2805RecVolPrd = new int[1] ;
      P09H213_A602MaqCod = new String[] {""} ;
      P09H213_A1235BarNumCli = new int[1] ;
      P09H213_A1234BarNomCli = new String[] {""} ;
      P09H213_A218BarTipCol = new byte[1] ;
      P09H213_A136BarColNum = new int[1] ;
      P09H213_A135BarColNom = new String[] {""} ;
      P09H213_A212BarSer = new String[] {""} ;
      P09H213_A213BarSit = new byte[1] ;
      P09H213_A2804RecLinMaq = new short[1] ;
      P09H213_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H213_n812RecTotKgm = new boolean[] {false} ;
      P09H213_A130BarCodPar = new String[] {""} ;
      P09H213_A132BarCodReo = new byte[1] ;
      P09H213_A129BarCod = new int[1] ;
      P09H217_A396EmprCod = new String[] {""} ;
      P09H217_A6039RecAcab = new String[] {""} ;
      P09H217_n6039RecAcab = new boolean[] {false} ;
      P09H217_A135BarColNom = new String[] {""} ;
      P09H217_A189BarNumAny = new short[1] ;
      P09H217_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09H217_n4866RecFecAlt = new boolean[] {false} ;
      P09H217_A2805RecVolPrd = new int[1] ;
      P09H217_A602MaqCod = new String[] {""} ;
      P09H217_A1235BarNumCli = new int[1] ;
      P09H217_A1234BarNomCli = new String[] {""} ;
      P09H217_A218BarTipCol = new byte[1] ;
      P09H217_A136BarColNum = new int[1] ;
      P09H217_A1652BarSerDsc = new String[] {""} ;
      P09H217_A212BarSer = new String[] {""} ;
      P09H217_A213BarSit = new byte[1] ;
      P09H217_A2804RecLinMaq = new short[1] ;
      P09H217_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H217_n812RecTotKgm = new boolean[] {false} ;
      P09H217_A130BarCodPar = new String[] {""} ;
      P09H217_A132BarCodReo = new byte[1] ;
      P09H217_A129BarCod = new int[1] ;
      P09H221_A396EmprCod = new String[] {""} ;
      P09H221_A6039RecAcab = new String[] {""} ;
      P09H221_n6039RecAcab = new boolean[] {false} ;
      P09H221_A1234BarNomCli = new String[] {""} ;
      P09H221_A189BarNumAny = new short[1] ;
      P09H221_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09H221_n4866RecFecAlt = new boolean[] {false} ;
      P09H221_A2805RecVolPrd = new int[1] ;
      P09H221_A602MaqCod = new String[] {""} ;
      P09H221_A1235BarNumCli = new int[1] ;
      P09H221_A218BarTipCol = new byte[1] ;
      P09H221_A136BarColNum = new int[1] ;
      P09H221_A135BarColNom = new String[] {""} ;
      P09H221_A1652BarSerDsc = new String[] {""} ;
      P09H221_A212BarSer = new String[] {""} ;
      P09H221_A213BarSit = new byte[1] ;
      P09H221_A2804RecLinMaq = new short[1] ;
      P09H221_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H221_n812RecTotKgm = new boolean[] {false} ;
      P09H221_A130BarCodPar = new String[] {""} ;
      P09H221_A132BarCodReo = new byte[1] ;
      P09H221_A129BarCod = new int[1] ;
      P09H225_A396EmprCod = new String[] {""} ;
      P09H225_A602MaqCod = new String[] {""} ;
      P09H225_A6039RecAcab = new String[] {""} ;
      P09H225_n6039RecAcab = new boolean[] {false} ;
      P09H225_A189BarNumAny = new short[1] ;
      P09H225_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09H225_n4866RecFecAlt = new boolean[] {false} ;
      P09H225_A2805RecVolPrd = new int[1] ;
      P09H225_A1235BarNumCli = new int[1] ;
      P09H225_A1234BarNomCli = new String[] {""} ;
      P09H225_A218BarTipCol = new byte[1] ;
      P09H225_A136BarColNum = new int[1] ;
      P09H225_A135BarColNom = new String[] {""} ;
      P09H225_A1652BarSerDsc = new String[] {""} ;
      P09H225_A212BarSer = new String[] {""} ;
      P09H225_A213BarSit = new byte[1] ;
      P09H225_A2804RecLinMaq = new short[1] ;
      P09H225_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H225_n812RecTotKgm = new boolean[] {false} ;
      P09H225_A130BarCodPar = new String[] {""} ;
      P09H225_A132BarCodReo = new byte[1] ;
      P09H225_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.recetadeacabado_cierre_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09H25_A6039RecAcab, P09H25_n6039RecAcab, P09H25_A396EmprCod, P09H25_A189BarNumAny, P09H25_A4866RecFecAlt, P09H25_n4866RecFecAlt, P09H25_A2805RecVolPrd, P09H25_A602MaqCod, P09H25_A1235BarNumCli, P09H25_A1234BarNomCli,
            P09H25_A218BarTipCol, P09H25_A136BarColNum, P09H25_A135BarColNom, P09H25_A1652BarSerDsc, P09H25_A212BarSer, P09H25_A213BarSit, P09H25_A2804RecLinMaq, P09H25_A812RecTotKgm, P09H25_n812RecTotKgm, P09H25_A130BarCodPar,
            P09H25_A132BarCodReo, P09H25_A129BarCod
            }
            , new Object[] {
            P09H29_A396EmprCod, P09H29_A6039RecAcab, P09H29_n6039RecAcab, P09H29_A212BarSer, P09H29_A189BarNumAny, P09H29_A4866RecFecAlt, P09H29_n4866RecFecAlt, P09H29_A2805RecVolPrd, P09H29_A602MaqCod, P09H29_A1235BarNumCli,
            P09H29_A1234BarNomCli, P09H29_A218BarTipCol, P09H29_A136BarColNum, P09H29_A135BarColNom, P09H29_A1652BarSerDsc, P09H29_A213BarSit, P09H29_A2804RecLinMaq, P09H29_A812RecTotKgm, P09H29_n812RecTotKgm, P09H29_A130BarCodPar,
            P09H29_A132BarCodReo, P09H29_A129BarCod
            }
            , new Object[] {
            P09H213_A396EmprCod, P09H213_A6039RecAcab, P09H213_n6039RecAcab, P09H213_A1652BarSerDsc, P09H213_A189BarNumAny, P09H213_A4866RecFecAlt, P09H213_n4866RecFecAlt, P09H213_A2805RecVolPrd, P09H213_A602MaqCod, P09H213_A1235BarNumCli,
            P09H213_A1234BarNomCli, P09H213_A218BarTipCol, P09H213_A136BarColNum, P09H213_A135BarColNom, P09H213_A212BarSer, P09H213_A213BarSit, P09H213_A2804RecLinMaq, P09H213_A812RecTotKgm, P09H213_n812RecTotKgm, P09H213_A130BarCodPar,
            P09H213_A132BarCodReo, P09H213_A129BarCod
            }
            , new Object[] {
            P09H217_A396EmprCod, P09H217_A6039RecAcab, P09H217_n6039RecAcab, P09H217_A135BarColNom, P09H217_A189BarNumAny, P09H217_A4866RecFecAlt, P09H217_n4866RecFecAlt, P09H217_A2805RecVolPrd, P09H217_A602MaqCod, P09H217_A1235BarNumCli,
            P09H217_A1234BarNomCli, P09H217_A218BarTipCol, P09H217_A136BarColNum, P09H217_A1652BarSerDsc, P09H217_A212BarSer, P09H217_A213BarSit, P09H217_A2804RecLinMaq, P09H217_A812RecTotKgm, P09H217_n812RecTotKgm, P09H217_A130BarCodPar,
            P09H217_A132BarCodReo, P09H217_A129BarCod
            }
            , new Object[] {
            P09H221_A396EmprCod, P09H221_A6039RecAcab, P09H221_n6039RecAcab, P09H221_A1234BarNomCli, P09H221_A189BarNumAny, P09H221_A4866RecFecAlt, P09H221_n4866RecFecAlt, P09H221_A2805RecVolPrd, P09H221_A602MaqCod, P09H221_A1235BarNumCli,
            P09H221_A218BarTipCol, P09H221_A136BarColNum, P09H221_A135BarColNom, P09H221_A1652BarSerDsc, P09H221_A212BarSer, P09H221_A213BarSit, P09H221_A2804RecLinMaq, P09H221_A812RecTotKgm, P09H221_n812RecTotKgm, P09H221_A130BarCodPar,
            P09H221_A132BarCodReo, P09H221_A129BarCod
            }
            , new Object[] {
            P09H225_A396EmprCod, P09H225_A602MaqCod, P09H225_A6039RecAcab, P09H225_n6039RecAcab, P09H225_A189BarNumAny, P09H225_A4866RecFecAlt, P09H225_n4866RecFecAlt, P09H225_A2805RecVolPrd, P09H225_A1235BarNumCli, P09H225_A1234BarNomCli,
            P09H225_A218BarTipCol, P09H225_A136BarColNum, P09H225_A135BarColNom, P09H225_A1652BarSerDsc, P09H225_A212BarSer, P09H225_A213BarSit, P09H225_A2804RecLinMaq, P09H225_A812RecTotKgm, P09H225_n812RecTotKgm, P09H225_A130BarCodPar,
            P09H225_A132BarCodReo, P09H225_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV147TFBarSit ;
   private byte AV148TFBarSit_To ;
   private byte AV28TFBarTipCol ;
   private byte AV29TFBarTipCol_To ;
   private byte AV157Barcodreo ;
   private byte AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ;
   private byte AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ;
   private byte AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ;
   private byte AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private short AV34TFRecLinMaq ;
   private short AV35TFRecLinMaq_To ;
   private short AV153TFBarNumAny ;
   private short AV154TFBarNumAny_To ;
   private short AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ;
   private short AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ;
   private short AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ;
   private short AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ;
   private short A2804RecLinMaq ;
   private short A189BarNumAny ;
   private short Gx_err ;
   private int AV163GXV1 ;
   private int AV26TFBarColNum ;
   private int AV27TFBarColNum_To ;
   private int AV32TFBarNumCli ;
   private int AV33TFBarNumCli_To ;
   private int AV38TFRecVolPrd ;
   private int AV39TFRecVolPrd_To ;
   private int AV156Barcod ;
   private int AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ;
   private int AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ;
   private int AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ;
   private int AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ;
   private int AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ;
   private int AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int AV131InsertIndex ;
   private long AV140count ;
   private java.math.BigDecimal AV149TFRecTotKgm ;
   private java.math.BigDecimal AV150TFRecTotKgm_To ;
   private java.math.BigDecimal AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ;
   private java.math.BigDecimal AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ;
   private java.math.BigDecimal A812RecTotKgm ;
   private String AV18TFBarNHdr ;
   private String AV19TFBarNHdr_Sel ;
   private String AV20TFBarSer ;
   private String AV21TFBarSer_Sel ;
   private String AV22TFBarSerDsc ;
   private String AV23TFBarSerDsc_Sel ;
   private String AV24TFBarColNom ;
   private String AV25TFBarColNom_Sel ;
   private String AV30TFBarNomCli ;
   private String AV31TFBarNomCli_Sel ;
   private String AV36TFMaqCod ;
   private String AV37TFMaqCod_Sel ;
   private String AV155Emprcod ;
   private String AV158Barcodpar ;
   private String AV160RecAcab ;
   private String A13696BarNHdr ;
   private String AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ;
   private String AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ;
   private String AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ;
   private String AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ;
   private String AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ;
   private String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ;
   private String AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ;
   private String AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ;
   private String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ;
   private String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ;
   private String AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ;
   private String AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ;
   private String lV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ;
   private String lV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ;
   private String lV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ;
   private String lV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ;
   private String lV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A602MaqCod ;
   private String A6039RecAcab ;
   private String A396EmprCod ;
   private java.util.Date AV151TFRecFecAlt ;
   private java.util.Date AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV159FechaCierre ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean n812RecTotKgm ;
   private boolean brk9H23 ;
   private boolean brk9H25 ;
   private boolean brk9H27 ;
   private boolean brk9H29 ;
   private boolean brk9H211 ;
   private String AV134OptionsJson ;
   private String AV137OptionsDescJson ;
   private String AV139OptionIndexesJson ;
   private String AV130DDOName ;
   private String AV128SearchTxt ;
   private String AV129SearchTxtTo ;
   private String AV132Option ;
   private com.genexus.webpanels.WebSession AV141Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09H25_A6039RecAcab ;
   private boolean[] P09H25_n6039RecAcab ;
   private String[] P09H25_A396EmprCod ;
   private short[] P09H25_A189BarNumAny ;
   private java.util.Date[] P09H25_A4866RecFecAlt ;
   private boolean[] P09H25_n4866RecFecAlt ;
   private int[] P09H25_A2805RecVolPrd ;
   private String[] P09H25_A602MaqCod ;
   private int[] P09H25_A1235BarNumCli ;
   private String[] P09H25_A1234BarNomCli ;
   private byte[] P09H25_A218BarTipCol ;
   private int[] P09H25_A136BarColNum ;
   private String[] P09H25_A135BarColNom ;
   private String[] P09H25_A1652BarSerDsc ;
   private String[] P09H25_A212BarSer ;
   private byte[] P09H25_A213BarSit ;
   private short[] P09H25_A2804RecLinMaq ;
   private java.math.BigDecimal[] P09H25_A812RecTotKgm ;
   private boolean[] P09H25_n812RecTotKgm ;
   private String[] P09H25_A130BarCodPar ;
   private byte[] P09H25_A132BarCodReo ;
   private int[] P09H25_A129BarCod ;
   private String[] P09H29_A396EmprCod ;
   private String[] P09H29_A6039RecAcab ;
   private boolean[] P09H29_n6039RecAcab ;
   private String[] P09H29_A212BarSer ;
   private short[] P09H29_A189BarNumAny ;
   private java.util.Date[] P09H29_A4866RecFecAlt ;
   private boolean[] P09H29_n4866RecFecAlt ;
   private int[] P09H29_A2805RecVolPrd ;
   private String[] P09H29_A602MaqCod ;
   private int[] P09H29_A1235BarNumCli ;
   private String[] P09H29_A1234BarNomCli ;
   private byte[] P09H29_A218BarTipCol ;
   private int[] P09H29_A136BarColNum ;
   private String[] P09H29_A135BarColNom ;
   private String[] P09H29_A1652BarSerDsc ;
   private byte[] P09H29_A213BarSit ;
   private short[] P09H29_A2804RecLinMaq ;
   private java.math.BigDecimal[] P09H29_A812RecTotKgm ;
   private boolean[] P09H29_n812RecTotKgm ;
   private String[] P09H29_A130BarCodPar ;
   private byte[] P09H29_A132BarCodReo ;
   private int[] P09H29_A129BarCod ;
   private String[] P09H213_A396EmprCod ;
   private String[] P09H213_A6039RecAcab ;
   private boolean[] P09H213_n6039RecAcab ;
   private String[] P09H213_A1652BarSerDsc ;
   private short[] P09H213_A189BarNumAny ;
   private java.util.Date[] P09H213_A4866RecFecAlt ;
   private boolean[] P09H213_n4866RecFecAlt ;
   private int[] P09H213_A2805RecVolPrd ;
   private String[] P09H213_A602MaqCod ;
   private int[] P09H213_A1235BarNumCli ;
   private String[] P09H213_A1234BarNomCli ;
   private byte[] P09H213_A218BarTipCol ;
   private int[] P09H213_A136BarColNum ;
   private String[] P09H213_A135BarColNom ;
   private String[] P09H213_A212BarSer ;
   private byte[] P09H213_A213BarSit ;
   private short[] P09H213_A2804RecLinMaq ;
   private java.math.BigDecimal[] P09H213_A812RecTotKgm ;
   private boolean[] P09H213_n812RecTotKgm ;
   private String[] P09H213_A130BarCodPar ;
   private byte[] P09H213_A132BarCodReo ;
   private int[] P09H213_A129BarCod ;
   private String[] P09H217_A396EmprCod ;
   private String[] P09H217_A6039RecAcab ;
   private boolean[] P09H217_n6039RecAcab ;
   private String[] P09H217_A135BarColNom ;
   private short[] P09H217_A189BarNumAny ;
   private java.util.Date[] P09H217_A4866RecFecAlt ;
   private boolean[] P09H217_n4866RecFecAlt ;
   private int[] P09H217_A2805RecVolPrd ;
   private String[] P09H217_A602MaqCod ;
   private int[] P09H217_A1235BarNumCli ;
   private String[] P09H217_A1234BarNomCli ;
   private byte[] P09H217_A218BarTipCol ;
   private int[] P09H217_A136BarColNum ;
   private String[] P09H217_A1652BarSerDsc ;
   private String[] P09H217_A212BarSer ;
   private byte[] P09H217_A213BarSit ;
   private short[] P09H217_A2804RecLinMaq ;
   private java.math.BigDecimal[] P09H217_A812RecTotKgm ;
   private boolean[] P09H217_n812RecTotKgm ;
   private String[] P09H217_A130BarCodPar ;
   private byte[] P09H217_A132BarCodReo ;
   private int[] P09H217_A129BarCod ;
   private String[] P09H221_A396EmprCod ;
   private String[] P09H221_A6039RecAcab ;
   private boolean[] P09H221_n6039RecAcab ;
   private String[] P09H221_A1234BarNomCli ;
   private short[] P09H221_A189BarNumAny ;
   private java.util.Date[] P09H221_A4866RecFecAlt ;
   private boolean[] P09H221_n4866RecFecAlt ;
   private int[] P09H221_A2805RecVolPrd ;
   private String[] P09H221_A602MaqCod ;
   private int[] P09H221_A1235BarNumCli ;
   private byte[] P09H221_A218BarTipCol ;
   private int[] P09H221_A136BarColNum ;
   private String[] P09H221_A135BarColNom ;
   private String[] P09H221_A1652BarSerDsc ;
   private String[] P09H221_A212BarSer ;
   private byte[] P09H221_A213BarSit ;
   private short[] P09H221_A2804RecLinMaq ;
   private java.math.BigDecimal[] P09H221_A812RecTotKgm ;
   private boolean[] P09H221_n812RecTotKgm ;
   private String[] P09H221_A130BarCodPar ;
   private byte[] P09H221_A132BarCodReo ;
   private int[] P09H221_A129BarCod ;
   private String[] P09H225_A396EmprCod ;
   private String[] P09H225_A602MaqCod ;
   private String[] P09H225_A6039RecAcab ;
   private boolean[] P09H225_n6039RecAcab ;
   private short[] P09H225_A189BarNumAny ;
   private java.util.Date[] P09H225_A4866RecFecAlt ;
   private boolean[] P09H225_n4866RecFecAlt ;
   private int[] P09H225_A2805RecVolPrd ;
   private int[] P09H225_A1235BarNumCli ;
   private String[] P09H225_A1234BarNomCli ;
   private byte[] P09H225_A218BarTipCol ;
   private int[] P09H225_A136BarColNum ;
   private String[] P09H225_A135BarColNom ;
   private String[] P09H225_A1652BarSerDsc ;
   private String[] P09H225_A212BarSer ;
   private byte[] P09H225_A213BarSit ;
   private short[] P09H225_A2804RecLinMaq ;
   private java.math.BigDecimal[] P09H225_A812RecTotKgm ;
   private boolean[] P09H225_n812RecTotKgm ;
   private String[] P09H225_A130BarCodPar ;
   private byte[] P09H225_A132BarCodReo ;
   private int[] P09H225_A129BarCod ;
   private GXSimpleCollection<String> AV133Options ;
   private GXSimpleCollection<String> AV136OptionsDesc ;
   private GXSimpleCollection<String> AV138OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV143GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV144GridStateFilterValue ;
}

final  class recetadeacabado_cierre_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09H25( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                          String AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                          short AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ,
                                          short AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ,
                                          byte AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ,
                                          byte AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ,
                                          String AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                          String AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                          String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                          String AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                          String AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                          String AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                          int AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ,
                                          int AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ,
                                          byte AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ,
                                          byte AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ,
                                          String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                          String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                          int AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ,
                                          int AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ,
                                          String AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                          String AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                          int AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ,
                                          int AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ,
                                          java.util.Date AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                          short AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ,
                                          short AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ,
                                          int AV156Barcod ,
                                          byte AV157Barcodreo ,
                                          String AV158Barcodpar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          short A189BarNumAny ,
                                          java.math.BigDecimal AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                          String A6039RecAcab ,
                                          String AV160RecAcab ,
                                          String AV155Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[36];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.RecAcab, T1.EmprCod, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr," ;
      scmdbuf += " 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND" ;
      scmdbuf += " T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (0==AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV156Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV157Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09H29( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                          String AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                          short AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ,
                                          short AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ,
                                          byte AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ,
                                          byte AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ,
                                          String AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                          String AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                          String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                          String AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                          String AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                          String AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                          int AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ,
                                          int AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ,
                                          byte AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ,
                                          byte AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ,
                                          String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                          String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                          int AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ,
                                          int AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ,
                                          String AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                          String AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                          int AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ,
                                          int AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ,
                                          java.util.Date AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                          short AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ,
                                          short AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ,
                                          int AV156Barcod ,
                                          byte AV157Barcodreo ,
                                          String AV158Barcodpar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          short A189BarNumAny ,
                                          java.math.BigDecimal AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                          String A396EmprCod ,
                                          String AV155Emprcod ,
                                          String A6039RecAcab ,
                                          String AV160RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[36];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarSer, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSerDsc, T2.BarSit, T1.RecLinMaq, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr," ;
      scmdbuf += " 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND" ;
      scmdbuf += " T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (0==AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (0==AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (0==AV156Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (0==AV157Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09H213( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           String AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           short AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ,
                                           short AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ,
                                           byte AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ,
                                           byte AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ,
                                           String AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           String AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           String AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           String AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           String AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           int AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ,
                                           int AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ,
                                           byte AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ,
                                           byte AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ,
                                           String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           int AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ,
                                           int AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ,
                                           String AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           String AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           int AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ,
                                           int AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ,
                                           java.util.Date AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           short AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ,
                                           short AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ,
                                           int AV156Barcod ,
                                           byte AV157Barcodreo ,
                                           String AV158Barcodpar ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           String A602MaqCod ,
                                           int A2805RecVolPrd ,
                                           java.util.Date A4866RecFecAlt ,
                                           short A189BarNumAny ,
                                           java.math.BigDecimal AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           String A396EmprCod ,
                                           String AV155Emprcod ,
                                           String A6039RecAcab ,
                                           String AV160RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[36];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarSerDsc, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr," ;
      scmdbuf += " 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND" ;
      scmdbuf += " T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV156Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV157Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09H217( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           String AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           short AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ,
                                           short AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ,
                                           byte AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ,
                                           byte AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ,
                                           String AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           String AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           String AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           String AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           String AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           int AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ,
                                           int AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ,
                                           byte AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ,
                                           byte AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ,
                                           String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           int AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ,
                                           int AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ,
                                           String AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           String AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           int AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ,
                                           int AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ,
                                           java.util.Date AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           short AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ,
                                           short AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ,
                                           int AV156Barcod ,
                                           byte AV157Barcodreo ,
                                           String AV158Barcodpar ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           String A602MaqCod ,
                                           int A2805RecVolPrd ,
                                           java.util.Date A4866RecFecAlt ,
                                           short A189BarNumAny ,
                                           java.math.BigDecimal AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           String A396EmprCod ,
                                           String AV155Emprcod ,
                                           String A6039RecAcab ,
                                           String AV160RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[36];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarColNom, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr," ;
      scmdbuf += " 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND" ;
      scmdbuf += " T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV156Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV157Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09H221( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           String AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           short AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ,
                                           short AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ,
                                           byte AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ,
                                           byte AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ,
                                           String AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           String AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           String AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           String AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           String AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           int AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ,
                                           int AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ,
                                           byte AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ,
                                           byte AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ,
                                           String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           int AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ,
                                           int AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ,
                                           String AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           String AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           int AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ,
                                           int AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ,
                                           java.util.Date AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           short AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ,
                                           short AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ,
                                           int AV156Barcod ,
                                           byte AV157Barcodreo ,
                                           String AV158Barcodpar ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           String A602MaqCod ,
                                           int A2805RecVolPrd ,
                                           java.util.Date A4866RecFecAlt ,
                                           short A189BarNumAny ,
                                           java.math.BigDecimal AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           String A396EmprCod ,
                                           String AV155Emprcod ,
                                           String A6039RecAcab ,
                                           String AV160RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[36];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarNomCli, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr," ;
      scmdbuf += " 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND" ;
      scmdbuf += " T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (0==AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (0==AV156Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (0==AV157Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarNomCli" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09H225( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           String AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           short AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ,
                                           short AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ,
                                           byte AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ,
                                           byte AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ,
                                           String AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           String AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           String AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           String AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           String AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           int AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ,
                                           int AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ,
                                           byte AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ,
                                           byte AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ,
                                           String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           int AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ,
                                           int AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ,
                                           String AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           String AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           int AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ,
                                           int AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ,
                                           java.util.Date AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           short AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ,
                                           short AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ,
                                           int AV156Barcod ,
                                           byte AV157Barcodreo ,
                                           String AV158Barcodpar ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           String A602MaqCod ,
                                           int A2805RecVolPrd ,
                                           java.util.Date A4866RecFecAlt ,
                                           short A189BarNumAny ,
                                           java.math.BigDecimal AV189Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal AV190Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           String A6039RecAcab ,
                                           String AV160RecAcab ,
                                           String AV155Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[36];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr," ;
      scmdbuf += " 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND" ;
      scmdbuf += " T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV165Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (0==AV167Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV168Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV169Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV170Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV171Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV173Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV175Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV176Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (0==AV177Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (0==AV178Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV179Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV180Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV181Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV183Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV184Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV185Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV187Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV188Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV191Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV192Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV193Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (0==AV156Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (0==AV157Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
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
                  return conditional_P09H25(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 1 :
                  return conditional_P09H29(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 2 :
                  return conditional_P09H213(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 3 :
                  return conditional_P09H217(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 4 :
                  return conditional_P09H221(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 5 :
                  return conditional_P09H225(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09H25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09H29", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09H213", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09H217", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09H221", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09H225", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 13);
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 13);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 13);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
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
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
      }
   }

}

