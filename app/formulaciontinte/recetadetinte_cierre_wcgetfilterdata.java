package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte_cierre_wcgetfilterdata extends GXProcedure
{
   public recetadetinte_cierre_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_cierre_wcgetfilterdata.class ), "" );
   }

   public recetadetinte_cierre_wcgetfilterdata( int remoteHandle ,
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
      recetadetinte_cierre_wcgetfilterdata.this.aP5 = new String[] {""};
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
      recetadetinte_cierre_wcgetfilterdata.this.AV42DDOName = aP0;
      recetadetinte_cierre_wcgetfilterdata.this.AV40SearchTxt = aP1;
      recetadetinte_cierre_wcgetfilterdata.this.AV41SearchTxtTo = aP2;
      recetadetinte_cierre_wcgetfilterdata.this.aP3 = aP3;
      recetadetinte_cierre_wcgetfilterdata.this.aP4 = aP4;
      recetadetinte_cierre_wcgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV45Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV50OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_BARNOMCLI") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV42DDOName), "DDO_MAQCOD") == 0 )
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
      AV46OptionsJson = AV45Options.toJSonString(false) ;
      AV49OptionsDescJson = AV48OptionsDesc.toJSonString(false) ;
      AV51OptionIndexesJson = AV50OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV53Session.getValue("FormulacionTinte.RecetadeTinte_Cierre_WCGridState"), "") == 0 )
      {
         AV55GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.RecetadeTinte_Cierre_WCGridState"), null, null);
      }
      else
      {
         AV55GridState.fromxml(AV53Session.getValue("FormulacionTinte.RecetadeTinte_Cierre_WCGridState"), null, null);
      }
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV56GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV58FilterFullText = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV12TFRecLinMaq = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFRecLinMaq_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV14TFBarSit = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV15TFBarSit_To = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV16TFBarSer = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV17TFBarSer_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV18TFBarSerDsc = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV19TFBarSerDsc_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV20TFBarColNom = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV21TFBarColNom_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV22TFBarColNum = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFBarColNum_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV24TFBarTipCol = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFBarTipCol_To = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV26TFBarNomCli = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV27TFBarNomCli_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV28TFBarNumCli = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV29TFBarNumCli_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV30TFMaqCod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV31TFMaqCod_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV32TFRecVolPrd = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFRecVolPrd_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGM") == 0 )
         {
            AV34TFRecTotKgm = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFRecTotKgm_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV36TFRecFecAlt = localUtil.ctot( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANY") == 0 )
         {
            AV38TFBarNumAny = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarNumAny_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV59Emprcod = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV60Barcod = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV61Barcodreo = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV62Barcodpar = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHACIERRE") == 0 )
         {
            AV63FechaCierre = localUtil.ctod( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECACAB") == 0 )
         {
            AV64RecAcab = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV40SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV58FilterFullText ;
      AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV14TFBarSit ;
      AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV16TFBarSer ;
      AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV34TFRecTotKgm ;
      AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV36TFRecFecAlt ;
      AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV38TFBarNumAny ;
      AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) ,
                                           AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) ,
                                           AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) ,
                                           AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) ,
                                           Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) ,
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
                                           AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
                                           A6039RecAcab ,
                                           AV64RecAcab ,
                                           AV59Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr), 11, "%") ;
      lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser), 16, "%") ;
      lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc), 26, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom), 13, "%") ;
      lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09GY5 */
      pr_default.execute(0, new Object[] {AV59Emprcod, AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, Integer.valueOf(AV60Barcod), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), Byte.valueOf(AV61Barcodreo), AV62Barcodpar, AV62Barcodpar, AV64RecAcab, lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr, AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel, Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq), Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to), Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit), Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to), lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser, AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel, lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc, AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel, lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom, AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum), Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to), Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol), Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to), lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli, AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli), Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to), lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod, AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt, Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany), Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6039RecAcab = P09GY5_A6039RecAcab[0] ;
         n6039RecAcab = P09GY5_n6039RecAcab[0] ;
         A396EmprCod = P09GY5_A396EmprCod[0] ;
         A189BarNumAny = P09GY5_A189BarNumAny[0] ;
         A4866RecFecAlt = P09GY5_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09GY5_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09GY5_A2805RecVolPrd[0] ;
         A602MaqCod = P09GY5_A602MaqCod[0] ;
         A1235BarNumCli = P09GY5_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GY5_A1234BarNomCli[0] ;
         A218BarTipCol = P09GY5_A218BarTipCol[0] ;
         A136BarColNum = P09GY5_A136BarColNum[0] ;
         A135BarColNom = P09GY5_A135BarColNom[0] ;
         A1652BarSerDsc = P09GY5_A1652BarSerDsc[0] ;
         A212BarSer = P09GY5_A212BarSer[0] ;
         A213BarSit = P09GY5_A213BarSit[0] ;
         A2804RecLinMaq = P09GY5_A2804RecLinMaq[0] ;
         A13696BarNHdr = P09GY5_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY5_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY5_n812RecTotKgm[0] ;
         A129BarCod = P09GY5_A129BarCod[0] ;
         A132BarCodReo = P09GY5_A132BarCodReo[0] ;
         A130BarCodPar = P09GY5_A130BarCodPar[0] ;
         A189BarNumAny = P09GY5_A189BarNumAny[0] ;
         A1235BarNumCli = P09GY5_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GY5_A1234BarNomCli[0] ;
         A218BarTipCol = P09GY5_A218BarTipCol[0] ;
         A136BarColNum = P09GY5_A136BarColNum[0] ;
         A135BarColNom = P09GY5_A135BarColNom[0] ;
         A1652BarSerDsc = P09GY5_A1652BarSerDsc[0] ;
         A212BarSer = P09GY5_A212BarSer[0] ;
         A213BarSit = P09GY5_A213BarSit[0] ;
         A13696BarNHdr = P09GY5_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY5_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY5_n812RecTotKgm[0] ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV44Option = A13696BarNHdr ;
            AV43InsertIndex = 1 ;
            while ( ( AV43InsertIndex <= AV45Options.size() ) && ( GXutil.strcmp((String)AV45Options.elementAt(-1+AV43InsertIndex), AV44Option) < 0 ) )
            {
               AV43InsertIndex = (int)(AV43InsertIndex+1) ;
            }
            if ( ( AV43InsertIndex <= AV45Options.size() ) && ( GXutil.strcmp((String)AV45Options.elementAt(-1+AV43InsertIndex), AV44Option) == 0 ) )
            {
               AV52count = GXutil.lval( (String)AV50OptionIndexes.elementAt(-1+AV43InsertIndex)) ;
               AV52count = (long)(AV52count+1) ;
               AV50OptionIndexes.removeItem(AV43InsertIndex);
               AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), AV43InsertIndex);
            }
            else
            {
               AV45Options.add(AV44Option, AV43InsertIndex);
               AV50OptionIndexes.add("1", AV43InsertIndex);
            }
         }
         if ( AV45Options.size() == 50 )
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
      AV16TFBarSer = AV40SearchTxt ;
      AV17TFBarSer_Sel = "" ;
      AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV58FilterFullText ;
      AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV14TFBarSit ;
      AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV16TFBarSer ;
      AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV34TFRecTotKgm ;
      AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV36TFRecFecAlt ;
      AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV38TFBarNumAny ;
      AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) ,
                                           AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) ,
                                           AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) ,
                                           AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) ,
                                           Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) ,
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
                                           AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           A6039RecAcab ,
                                           AV64RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr), 11, "%") ;
      lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser), 16, "%") ;
      lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc), 26, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom), 13, "%") ;
      lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09GY9 */
      pr_default.execute(1, new Object[] {AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, Integer.valueOf(AV60Barcod), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), Byte.valueOf(AV61Barcodreo), AV62Barcodpar, AV62Barcodpar, AV59Emprcod, AV64RecAcab, lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr, AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel, Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq), Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to), Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit), Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to), lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser, AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel, lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc, AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel, lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom, AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum), Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to), Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol), Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to), lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli, AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli), Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to), lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod, AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt, Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany), Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9GY3 = false ;
         A396EmprCod = P09GY9_A396EmprCod[0] ;
         A6039RecAcab = P09GY9_A6039RecAcab[0] ;
         n6039RecAcab = P09GY9_n6039RecAcab[0] ;
         A212BarSer = P09GY9_A212BarSer[0] ;
         A189BarNumAny = P09GY9_A189BarNumAny[0] ;
         A4866RecFecAlt = P09GY9_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09GY9_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09GY9_A2805RecVolPrd[0] ;
         A602MaqCod = P09GY9_A602MaqCod[0] ;
         A1235BarNumCli = P09GY9_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GY9_A1234BarNomCli[0] ;
         A218BarTipCol = P09GY9_A218BarTipCol[0] ;
         A136BarColNum = P09GY9_A136BarColNum[0] ;
         A135BarColNom = P09GY9_A135BarColNom[0] ;
         A1652BarSerDsc = P09GY9_A1652BarSerDsc[0] ;
         A213BarSit = P09GY9_A213BarSit[0] ;
         A2804RecLinMaq = P09GY9_A2804RecLinMaq[0] ;
         A13696BarNHdr = P09GY9_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY9_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY9_n812RecTotKgm[0] ;
         A129BarCod = P09GY9_A129BarCod[0] ;
         A132BarCodReo = P09GY9_A132BarCodReo[0] ;
         A130BarCodPar = P09GY9_A130BarCodPar[0] ;
         A212BarSer = P09GY9_A212BarSer[0] ;
         A189BarNumAny = P09GY9_A189BarNumAny[0] ;
         A1235BarNumCli = P09GY9_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GY9_A1234BarNomCli[0] ;
         A218BarTipCol = P09GY9_A218BarTipCol[0] ;
         A136BarColNum = P09GY9_A136BarColNum[0] ;
         A135BarColNom = P09GY9_A135BarColNom[0] ;
         A1652BarSerDsc = P09GY9_A1652BarSerDsc[0] ;
         A213BarSit = P09GY9_A213BarSit[0] ;
         A13696BarNHdr = P09GY9_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY9_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY9_n812RecTotKgm[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09GY9_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk9GY3 = false ;
            A396EmprCod = P09GY9_A396EmprCod[0] ;
            A2804RecLinMaq = P09GY9_A2804RecLinMaq[0] ;
            A129BarCod = P09GY9_A129BarCod[0] ;
            A132BarCodReo = P09GY9_A132BarCodReo[0] ;
            A130BarCodPar = P09GY9_A130BarCodPar[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9GY3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV44Option = A212BarSer ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GY3 )
         {
            brk9GY3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarSerDsc = AV40SearchTxt ;
      AV19TFBarSerDsc_Sel = "" ;
      AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV58FilterFullText ;
      AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV14TFBarSit ;
      AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV16TFBarSer ;
      AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV34TFRecTotKgm ;
      AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV36TFRecFecAlt ;
      AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV38TFBarNumAny ;
      AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) ,
                                           AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) ,
                                           AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) ,
                                           AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) ,
                                           Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) ,
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
                                           AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           A6039RecAcab ,
                                           AV64RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr), 11, "%") ;
      lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser), 16, "%") ;
      lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc), 26, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom), 13, "%") ;
      lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09GY13 */
      pr_default.execute(2, new Object[] {AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, Integer.valueOf(AV60Barcod), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), Byte.valueOf(AV61Barcodreo), AV62Barcodpar, AV62Barcodpar, AV59Emprcod, AV64RecAcab, lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr, AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel, Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq), Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to), Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit), Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to), lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser, AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel, lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc, AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel, lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom, AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum), Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to), Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol), Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to), lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli, AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli), Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to), lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod, AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt, Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany), Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9GY5 = false ;
         A396EmprCod = P09GY13_A396EmprCod[0] ;
         A6039RecAcab = P09GY13_A6039RecAcab[0] ;
         n6039RecAcab = P09GY13_n6039RecAcab[0] ;
         A1652BarSerDsc = P09GY13_A1652BarSerDsc[0] ;
         A189BarNumAny = P09GY13_A189BarNumAny[0] ;
         A4866RecFecAlt = P09GY13_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09GY13_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09GY13_A2805RecVolPrd[0] ;
         A602MaqCod = P09GY13_A602MaqCod[0] ;
         A1235BarNumCli = P09GY13_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GY13_A1234BarNomCli[0] ;
         A218BarTipCol = P09GY13_A218BarTipCol[0] ;
         A136BarColNum = P09GY13_A136BarColNum[0] ;
         A135BarColNom = P09GY13_A135BarColNom[0] ;
         A212BarSer = P09GY13_A212BarSer[0] ;
         A213BarSit = P09GY13_A213BarSit[0] ;
         A2804RecLinMaq = P09GY13_A2804RecLinMaq[0] ;
         A13696BarNHdr = P09GY13_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY13_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY13_n812RecTotKgm[0] ;
         A129BarCod = P09GY13_A129BarCod[0] ;
         A132BarCodReo = P09GY13_A132BarCodReo[0] ;
         A130BarCodPar = P09GY13_A130BarCodPar[0] ;
         A1652BarSerDsc = P09GY13_A1652BarSerDsc[0] ;
         A189BarNumAny = P09GY13_A189BarNumAny[0] ;
         A1235BarNumCli = P09GY13_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GY13_A1234BarNomCli[0] ;
         A218BarTipCol = P09GY13_A218BarTipCol[0] ;
         A136BarColNum = P09GY13_A136BarColNum[0] ;
         A135BarColNom = P09GY13_A135BarColNom[0] ;
         A212BarSer = P09GY13_A212BarSer[0] ;
         A213BarSit = P09GY13_A213BarSit[0] ;
         A13696BarNHdr = P09GY13_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY13_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY13_n812RecTotKgm[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09GY13_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk9GY5 = false ;
            A396EmprCod = P09GY13_A396EmprCod[0] ;
            A2804RecLinMaq = P09GY13_A2804RecLinMaq[0] ;
            A129BarCod = P09GY13_A129BarCod[0] ;
            A132BarCodReo = P09GY13_A132BarCodReo[0] ;
            A130BarCodPar = P09GY13_A130BarCodPar[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9GY5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV44Option = A1652BarSerDsc ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GY5 )
         {
            brk9GY5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarColNom = AV40SearchTxt ;
      AV21TFBarColNom_Sel = "" ;
      AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV58FilterFullText ;
      AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV14TFBarSit ;
      AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV16TFBarSer ;
      AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV34TFRecTotKgm ;
      AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV36TFRecFecAlt ;
      AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV38TFBarNumAny ;
      AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) ,
                                           AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) ,
                                           AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) ,
                                           AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) ,
                                           Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) ,
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
                                           AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           A6039RecAcab ,
                                           AV64RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr), 11, "%") ;
      lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser), 16, "%") ;
      lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc), 26, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom), 13, "%") ;
      lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09GY17 */
      pr_default.execute(3, new Object[] {AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, Integer.valueOf(AV60Barcod), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), Byte.valueOf(AV61Barcodreo), AV62Barcodpar, AV62Barcodpar, AV59Emprcod, AV64RecAcab, lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr, AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel, Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq), Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to), Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit), Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to), lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser, AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel, lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc, AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel, lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom, AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum), Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to), Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol), Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to), lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli, AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli), Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to), lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod, AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt, Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany), Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9GY7 = false ;
         A396EmprCod = P09GY17_A396EmprCod[0] ;
         A6039RecAcab = P09GY17_A6039RecAcab[0] ;
         n6039RecAcab = P09GY17_n6039RecAcab[0] ;
         A135BarColNom = P09GY17_A135BarColNom[0] ;
         A189BarNumAny = P09GY17_A189BarNumAny[0] ;
         A4866RecFecAlt = P09GY17_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09GY17_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09GY17_A2805RecVolPrd[0] ;
         A602MaqCod = P09GY17_A602MaqCod[0] ;
         A1235BarNumCli = P09GY17_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GY17_A1234BarNomCli[0] ;
         A218BarTipCol = P09GY17_A218BarTipCol[0] ;
         A136BarColNum = P09GY17_A136BarColNum[0] ;
         A1652BarSerDsc = P09GY17_A1652BarSerDsc[0] ;
         A212BarSer = P09GY17_A212BarSer[0] ;
         A213BarSit = P09GY17_A213BarSit[0] ;
         A2804RecLinMaq = P09GY17_A2804RecLinMaq[0] ;
         A13696BarNHdr = P09GY17_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY17_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY17_n812RecTotKgm[0] ;
         A129BarCod = P09GY17_A129BarCod[0] ;
         A132BarCodReo = P09GY17_A132BarCodReo[0] ;
         A130BarCodPar = P09GY17_A130BarCodPar[0] ;
         A135BarColNom = P09GY17_A135BarColNom[0] ;
         A189BarNumAny = P09GY17_A189BarNumAny[0] ;
         A1235BarNumCli = P09GY17_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GY17_A1234BarNomCli[0] ;
         A218BarTipCol = P09GY17_A218BarTipCol[0] ;
         A136BarColNum = P09GY17_A136BarColNum[0] ;
         A1652BarSerDsc = P09GY17_A1652BarSerDsc[0] ;
         A212BarSer = P09GY17_A212BarSer[0] ;
         A213BarSit = P09GY17_A213BarSit[0] ;
         A13696BarNHdr = P09GY17_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY17_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY17_n812RecTotKgm[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09GY17_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk9GY7 = false ;
            A396EmprCod = P09GY17_A396EmprCod[0] ;
            A2804RecLinMaq = P09GY17_A2804RecLinMaq[0] ;
            A129BarCod = P09GY17_A129BarCod[0] ;
            A132BarCodReo = P09GY17_A132BarCodReo[0] ;
            A130BarCodPar = P09GY17_A130BarCodPar[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9GY7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV44Option = A135BarColNom ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GY7 )
         {
            brk9GY7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV26TFBarNomCli = AV40SearchTxt ;
      AV27TFBarNomCli_Sel = "" ;
      AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV58FilterFullText ;
      AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV14TFBarSit ;
      AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV16TFBarSer ;
      AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV34TFRecTotKgm ;
      AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV36TFRecFecAlt ;
      AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV38TFBarNumAny ;
      AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) ,
                                           AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) ,
                                           AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) ,
                                           AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) ,
                                           Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) ,
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
                                           AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
                                           A396EmprCod ,
                                           AV59Emprcod ,
                                           A6039RecAcab ,
                                           AV64RecAcab } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr), 11, "%") ;
      lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser), 16, "%") ;
      lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc), 26, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom), 13, "%") ;
      lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09GY21 */
      pr_default.execute(4, new Object[] {AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, Integer.valueOf(AV60Barcod), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), Byte.valueOf(AV61Barcodreo), AV62Barcodpar, AV62Barcodpar, AV59Emprcod, AV64RecAcab, lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr, AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel, Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq), Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to), Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit), Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to), lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser, AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel, lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc, AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel, lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom, AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum), Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to), Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol), Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to), lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli, AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli), Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to), lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod, AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt, Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany), Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9GY9 = false ;
         A396EmprCod = P09GY21_A396EmprCod[0] ;
         A6039RecAcab = P09GY21_A6039RecAcab[0] ;
         n6039RecAcab = P09GY21_n6039RecAcab[0] ;
         A1234BarNomCli = P09GY21_A1234BarNomCli[0] ;
         A189BarNumAny = P09GY21_A189BarNumAny[0] ;
         A4866RecFecAlt = P09GY21_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09GY21_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09GY21_A2805RecVolPrd[0] ;
         A602MaqCod = P09GY21_A602MaqCod[0] ;
         A1235BarNumCli = P09GY21_A1235BarNumCli[0] ;
         A218BarTipCol = P09GY21_A218BarTipCol[0] ;
         A136BarColNum = P09GY21_A136BarColNum[0] ;
         A135BarColNom = P09GY21_A135BarColNom[0] ;
         A1652BarSerDsc = P09GY21_A1652BarSerDsc[0] ;
         A212BarSer = P09GY21_A212BarSer[0] ;
         A213BarSit = P09GY21_A213BarSit[0] ;
         A2804RecLinMaq = P09GY21_A2804RecLinMaq[0] ;
         A13696BarNHdr = P09GY21_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY21_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY21_n812RecTotKgm[0] ;
         A129BarCod = P09GY21_A129BarCod[0] ;
         A132BarCodReo = P09GY21_A132BarCodReo[0] ;
         A130BarCodPar = P09GY21_A130BarCodPar[0] ;
         A1234BarNomCli = P09GY21_A1234BarNomCli[0] ;
         A189BarNumAny = P09GY21_A189BarNumAny[0] ;
         A1235BarNumCli = P09GY21_A1235BarNumCli[0] ;
         A218BarTipCol = P09GY21_A218BarTipCol[0] ;
         A136BarColNum = P09GY21_A136BarColNum[0] ;
         A135BarColNom = P09GY21_A135BarColNom[0] ;
         A1652BarSerDsc = P09GY21_A1652BarSerDsc[0] ;
         A212BarSer = P09GY21_A212BarSer[0] ;
         A213BarSit = P09GY21_A213BarSit[0] ;
         A13696BarNHdr = P09GY21_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY21_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY21_n812RecTotKgm[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09GY21_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk9GY9 = false ;
            A396EmprCod = P09GY21_A396EmprCod[0] ;
            A2804RecLinMaq = P09GY21_A2804RecLinMaq[0] ;
            A129BarCod = P09GY21_A129BarCod[0] ;
            A132BarCodReo = P09GY21_A132BarCodReo[0] ;
            A130BarCodPar = P09GY21_A130BarCodPar[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9GY9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV44Option = A1234BarNomCli ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GY9 )
         {
            brk9GY9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV30TFMaqCod = AV40SearchTxt ;
      AV31TFMaqCod_Sel = "" ;
      AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = AV58FilterFullText ;
      AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit = AV14TFBarSit ;
      AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = AV16TFBarSer ;
      AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = AV34TFRecTotKgm ;
      AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = AV36TFRecFecAlt ;
      AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany = AV38TFBarNumAny ;
      AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) ,
                                           AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) ,
                                           AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) ,
                                           AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) ,
                                           Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) ,
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
                                           AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
                                           A6039RecAcab ,
                                           AV64RecAcab ,
                                           AV59Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext), "%", "") ;
      lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr), 11, "%") ;
      lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser), 16, "%") ;
      lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc), 26, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom), 13, "%") ;
      lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09GY25 */
      pr_default.execute(5, new Object[] {AV59Emprcod, AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to, Integer.valueOf(AV60Barcod), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), Byte.valueOf(AV61Barcodreo), AV62Barcodpar, AV62Barcodpar, AV64RecAcab, lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr, AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel, Short.valueOf(AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq), Short.valueOf(AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to), Byte.valueOf(AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit), Byte.valueOf(AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to), lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser, AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel, lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc, AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel, lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom, AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum), Integer.valueOf(AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to), Byte.valueOf(AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol), Byte.valueOf(AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to), lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli, AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli), Integer.valueOf(AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to), lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod, AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt, Short.valueOf(AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany), Short.valueOf(AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9GY11 = false ;
         A396EmprCod = P09GY25_A396EmprCod[0] ;
         A602MaqCod = P09GY25_A602MaqCod[0] ;
         A6039RecAcab = P09GY25_A6039RecAcab[0] ;
         n6039RecAcab = P09GY25_n6039RecAcab[0] ;
         A189BarNumAny = P09GY25_A189BarNumAny[0] ;
         A4866RecFecAlt = P09GY25_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09GY25_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09GY25_A2805RecVolPrd[0] ;
         A1235BarNumCli = P09GY25_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GY25_A1234BarNomCli[0] ;
         A218BarTipCol = P09GY25_A218BarTipCol[0] ;
         A136BarColNum = P09GY25_A136BarColNum[0] ;
         A135BarColNom = P09GY25_A135BarColNom[0] ;
         A1652BarSerDsc = P09GY25_A1652BarSerDsc[0] ;
         A212BarSer = P09GY25_A212BarSer[0] ;
         A213BarSit = P09GY25_A213BarSit[0] ;
         A2804RecLinMaq = P09GY25_A2804RecLinMaq[0] ;
         A13696BarNHdr = P09GY25_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY25_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY25_n812RecTotKgm[0] ;
         A129BarCod = P09GY25_A129BarCod[0] ;
         A132BarCodReo = P09GY25_A132BarCodReo[0] ;
         A130BarCodPar = P09GY25_A130BarCodPar[0] ;
         A189BarNumAny = P09GY25_A189BarNumAny[0] ;
         A1235BarNumCli = P09GY25_A1235BarNumCli[0] ;
         A1234BarNomCli = P09GY25_A1234BarNomCli[0] ;
         A218BarTipCol = P09GY25_A218BarTipCol[0] ;
         A136BarColNum = P09GY25_A136BarColNum[0] ;
         A135BarColNom = P09GY25_A135BarColNom[0] ;
         A1652BarSerDsc = P09GY25_A1652BarSerDsc[0] ;
         A212BarSer = P09GY25_A212BarSer[0] ;
         A213BarSit = P09GY25_A213BarSit[0] ;
         A13696BarNHdr = P09GY25_A13696BarNHdr[0] ;
         A812RecTotKgm = P09GY25_A812RecTotKgm[0] ;
         n812RecTotKgm = P09GY25_n812RecTotKgm[0] ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09GY25_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09GY25_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk9GY11 = false ;
            A2804RecLinMaq = P09GY25_A2804RecLinMaq[0] ;
            A129BarCod = P09GY25_A129BarCod[0] ;
            A132BarCodReo = P09GY25_A132BarCodReo[0] ;
            A130BarCodPar = P09GY25_A130BarCodPar[0] ;
            AV52count = (long)(AV52count+1) ;
            brk9GY11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV44Option = A602MaqCod ;
            AV45Options.add(AV44Option, 0);
            AV50OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV45Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9GY11 )
         {
            brk9GY11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetadetinte_cierre_wcgetfilterdata.this.AV46OptionsJson;
      this.aP4[0] = recetadetinte_cierre_wcgetfilterdata.this.AV49OptionsDescJson;
      this.aP5[0] = recetadetinte_cierre_wcgetfilterdata.this.AV51OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV46OptionsJson = "" ;
      AV49OptionsDescJson = "" ;
      AV51OptionIndexesJson = "" ;
      AV45Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV53Session = httpContext.getWebSession();
      AV55GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV56GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV58FilterFullText = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV16TFBarSer = "" ;
      AV17TFBarSer_Sel = "" ;
      AV18TFBarSerDsc = "" ;
      AV19TFBarSerDsc_Sel = "" ;
      AV20TFBarColNom = "" ;
      AV21TFBarColNom_Sel = "" ;
      AV26TFBarNomCli = "" ;
      AV27TFBarNomCli_Sel = "" ;
      AV30TFMaqCod = "" ;
      AV31TFMaqCod_Sel = "" ;
      AV34TFRecTotKgm = DecimalUtil.ZERO ;
      AV35TFRecTotKgm_To = DecimalUtil.ZERO ;
      AV36TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV59Emprcod = "" ;
      AV62Barcodpar = "" ;
      AV63FechaCierre = GXutil.nullDate() ;
      AV64RecAcab = "" ;
      A13696BarNHdr = "" ;
      AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = "" ;
      AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = "" ;
      AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel = "" ;
      AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = "" ;
      AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel = "" ;
      AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = "" ;
      AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel = "" ;
      AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = "" ;
      AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel = "" ;
      AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = "" ;
      AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel = "" ;
      AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = "" ;
      AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel = "" ;
      AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm = DecimalUtil.ZERO ;
      AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to = DecimalUtil.ZERO ;
      AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr = "" ;
      lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser = "" ;
      lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc = "" ;
      lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom = "" ;
      lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli = "" ;
      lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod = "" ;
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
      P09GY5_A6039RecAcab = new String[] {""} ;
      P09GY5_n6039RecAcab = new boolean[] {false} ;
      P09GY5_A396EmprCod = new String[] {""} ;
      P09GY5_A189BarNumAny = new short[1] ;
      P09GY5_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09GY5_n4866RecFecAlt = new boolean[] {false} ;
      P09GY5_A2805RecVolPrd = new int[1] ;
      P09GY5_A602MaqCod = new String[] {""} ;
      P09GY5_A1235BarNumCli = new int[1] ;
      P09GY5_A1234BarNomCli = new String[] {""} ;
      P09GY5_A218BarTipCol = new byte[1] ;
      P09GY5_A136BarColNum = new int[1] ;
      P09GY5_A135BarColNom = new String[] {""} ;
      P09GY5_A1652BarSerDsc = new String[] {""} ;
      P09GY5_A212BarSer = new String[] {""} ;
      P09GY5_A213BarSit = new byte[1] ;
      P09GY5_A2804RecLinMaq = new short[1] ;
      P09GY5_A13696BarNHdr = new String[] {""} ;
      P09GY5_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GY5_n812RecTotKgm = new boolean[] {false} ;
      P09GY5_A129BarCod = new int[1] ;
      P09GY5_A132BarCodReo = new byte[1] ;
      P09GY5_A130BarCodPar = new String[] {""} ;
      AV44Option = "" ;
      P09GY9_A396EmprCod = new String[] {""} ;
      P09GY9_A6039RecAcab = new String[] {""} ;
      P09GY9_n6039RecAcab = new boolean[] {false} ;
      P09GY9_A212BarSer = new String[] {""} ;
      P09GY9_A189BarNumAny = new short[1] ;
      P09GY9_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09GY9_n4866RecFecAlt = new boolean[] {false} ;
      P09GY9_A2805RecVolPrd = new int[1] ;
      P09GY9_A602MaqCod = new String[] {""} ;
      P09GY9_A1235BarNumCli = new int[1] ;
      P09GY9_A1234BarNomCli = new String[] {""} ;
      P09GY9_A218BarTipCol = new byte[1] ;
      P09GY9_A136BarColNum = new int[1] ;
      P09GY9_A135BarColNom = new String[] {""} ;
      P09GY9_A1652BarSerDsc = new String[] {""} ;
      P09GY9_A213BarSit = new byte[1] ;
      P09GY9_A2804RecLinMaq = new short[1] ;
      P09GY9_A13696BarNHdr = new String[] {""} ;
      P09GY9_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GY9_n812RecTotKgm = new boolean[] {false} ;
      P09GY9_A129BarCod = new int[1] ;
      P09GY9_A132BarCodReo = new byte[1] ;
      P09GY9_A130BarCodPar = new String[] {""} ;
      P09GY13_A396EmprCod = new String[] {""} ;
      P09GY13_A6039RecAcab = new String[] {""} ;
      P09GY13_n6039RecAcab = new boolean[] {false} ;
      P09GY13_A1652BarSerDsc = new String[] {""} ;
      P09GY13_A189BarNumAny = new short[1] ;
      P09GY13_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09GY13_n4866RecFecAlt = new boolean[] {false} ;
      P09GY13_A2805RecVolPrd = new int[1] ;
      P09GY13_A602MaqCod = new String[] {""} ;
      P09GY13_A1235BarNumCli = new int[1] ;
      P09GY13_A1234BarNomCli = new String[] {""} ;
      P09GY13_A218BarTipCol = new byte[1] ;
      P09GY13_A136BarColNum = new int[1] ;
      P09GY13_A135BarColNom = new String[] {""} ;
      P09GY13_A212BarSer = new String[] {""} ;
      P09GY13_A213BarSit = new byte[1] ;
      P09GY13_A2804RecLinMaq = new short[1] ;
      P09GY13_A13696BarNHdr = new String[] {""} ;
      P09GY13_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GY13_n812RecTotKgm = new boolean[] {false} ;
      P09GY13_A129BarCod = new int[1] ;
      P09GY13_A132BarCodReo = new byte[1] ;
      P09GY13_A130BarCodPar = new String[] {""} ;
      P09GY17_A396EmprCod = new String[] {""} ;
      P09GY17_A6039RecAcab = new String[] {""} ;
      P09GY17_n6039RecAcab = new boolean[] {false} ;
      P09GY17_A135BarColNom = new String[] {""} ;
      P09GY17_A189BarNumAny = new short[1] ;
      P09GY17_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09GY17_n4866RecFecAlt = new boolean[] {false} ;
      P09GY17_A2805RecVolPrd = new int[1] ;
      P09GY17_A602MaqCod = new String[] {""} ;
      P09GY17_A1235BarNumCli = new int[1] ;
      P09GY17_A1234BarNomCli = new String[] {""} ;
      P09GY17_A218BarTipCol = new byte[1] ;
      P09GY17_A136BarColNum = new int[1] ;
      P09GY17_A1652BarSerDsc = new String[] {""} ;
      P09GY17_A212BarSer = new String[] {""} ;
      P09GY17_A213BarSit = new byte[1] ;
      P09GY17_A2804RecLinMaq = new short[1] ;
      P09GY17_A13696BarNHdr = new String[] {""} ;
      P09GY17_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GY17_n812RecTotKgm = new boolean[] {false} ;
      P09GY17_A129BarCod = new int[1] ;
      P09GY17_A132BarCodReo = new byte[1] ;
      P09GY17_A130BarCodPar = new String[] {""} ;
      P09GY21_A396EmprCod = new String[] {""} ;
      P09GY21_A6039RecAcab = new String[] {""} ;
      P09GY21_n6039RecAcab = new boolean[] {false} ;
      P09GY21_A1234BarNomCli = new String[] {""} ;
      P09GY21_A189BarNumAny = new short[1] ;
      P09GY21_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09GY21_n4866RecFecAlt = new boolean[] {false} ;
      P09GY21_A2805RecVolPrd = new int[1] ;
      P09GY21_A602MaqCod = new String[] {""} ;
      P09GY21_A1235BarNumCli = new int[1] ;
      P09GY21_A218BarTipCol = new byte[1] ;
      P09GY21_A136BarColNum = new int[1] ;
      P09GY21_A135BarColNom = new String[] {""} ;
      P09GY21_A1652BarSerDsc = new String[] {""} ;
      P09GY21_A212BarSer = new String[] {""} ;
      P09GY21_A213BarSit = new byte[1] ;
      P09GY21_A2804RecLinMaq = new short[1] ;
      P09GY21_A13696BarNHdr = new String[] {""} ;
      P09GY21_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GY21_n812RecTotKgm = new boolean[] {false} ;
      P09GY21_A129BarCod = new int[1] ;
      P09GY21_A132BarCodReo = new byte[1] ;
      P09GY21_A130BarCodPar = new String[] {""} ;
      P09GY25_A396EmprCod = new String[] {""} ;
      P09GY25_A602MaqCod = new String[] {""} ;
      P09GY25_A6039RecAcab = new String[] {""} ;
      P09GY25_n6039RecAcab = new boolean[] {false} ;
      P09GY25_A189BarNumAny = new short[1] ;
      P09GY25_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09GY25_n4866RecFecAlt = new boolean[] {false} ;
      P09GY25_A2805RecVolPrd = new int[1] ;
      P09GY25_A1235BarNumCli = new int[1] ;
      P09GY25_A1234BarNomCli = new String[] {""} ;
      P09GY25_A218BarTipCol = new byte[1] ;
      P09GY25_A136BarColNum = new int[1] ;
      P09GY25_A135BarColNom = new String[] {""} ;
      P09GY25_A1652BarSerDsc = new String[] {""} ;
      P09GY25_A212BarSer = new String[] {""} ;
      P09GY25_A213BarSit = new byte[1] ;
      P09GY25_A2804RecLinMaq = new short[1] ;
      P09GY25_A13696BarNHdr = new String[] {""} ;
      P09GY25_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GY25_n812RecTotKgm = new boolean[] {false} ;
      P09GY25_A129BarCod = new int[1] ;
      P09GY25_A132BarCodReo = new byte[1] ;
      P09GY25_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_cierre_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09GY5_A6039RecAcab, P09GY5_n6039RecAcab, P09GY5_A396EmprCod, P09GY5_A189BarNumAny, P09GY5_A4866RecFecAlt, P09GY5_n4866RecFecAlt, P09GY5_A2805RecVolPrd, P09GY5_A602MaqCod, P09GY5_A1235BarNumCli, P09GY5_A1234BarNomCli,
            P09GY5_A218BarTipCol, P09GY5_A136BarColNum, P09GY5_A135BarColNom, P09GY5_A1652BarSerDsc, P09GY5_A212BarSer, P09GY5_A213BarSit, P09GY5_A2804RecLinMaq, P09GY5_A13696BarNHdr, P09GY5_A812RecTotKgm, P09GY5_n812RecTotKgm,
            P09GY5_A129BarCod, P09GY5_A132BarCodReo, P09GY5_A130BarCodPar
            }
            , new Object[] {
            P09GY9_A396EmprCod, P09GY9_A6039RecAcab, P09GY9_n6039RecAcab, P09GY9_A212BarSer, P09GY9_A189BarNumAny, P09GY9_A4866RecFecAlt, P09GY9_n4866RecFecAlt, P09GY9_A2805RecVolPrd, P09GY9_A602MaqCod, P09GY9_A1235BarNumCli,
            P09GY9_A1234BarNomCli, P09GY9_A218BarTipCol, P09GY9_A136BarColNum, P09GY9_A135BarColNom, P09GY9_A1652BarSerDsc, P09GY9_A213BarSit, P09GY9_A2804RecLinMaq, P09GY9_A13696BarNHdr, P09GY9_A812RecTotKgm, P09GY9_n812RecTotKgm,
            P09GY9_A129BarCod, P09GY9_A132BarCodReo, P09GY9_A130BarCodPar
            }
            , new Object[] {
            P09GY13_A396EmprCod, P09GY13_A6039RecAcab, P09GY13_n6039RecAcab, P09GY13_A1652BarSerDsc, P09GY13_A189BarNumAny, P09GY13_A4866RecFecAlt, P09GY13_n4866RecFecAlt, P09GY13_A2805RecVolPrd, P09GY13_A602MaqCod, P09GY13_A1235BarNumCli,
            P09GY13_A1234BarNomCli, P09GY13_A218BarTipCol, P09GY13_A136BarColNum, P09GY13_A135BarColNom, P09GY13_A212BarSer, P09GY13_A213BarSit, P09GY13_A2804RecLinMaq, P09GY13_A13696BarNHdr, P09GY13_A812RecTotKgm, P09GY13_n812RecTotKgm,
            P09GY13_A129BarCod, P09GY13_A132BarCodReo, P09GY13_A130BarCodPar
            }
            , new Object[] {
            P09GY17_A396EmprCod, P09GY17_A6039RecAcab, P09GY17_n6039RecAcab, P09GY17_A135BarColNom, P09GY17_A189BarNumAny, P09GY17_A4866RecFecAlt, P09GY17_n4866RecFecAlt, P09GY17_A2805RecVolPrd, P09GY17_A602MaqCod, P09GY17_A1235BarNumCli,
            P09GY17_A1234BarNomCli, P09GY17_A218BarTipCol, P09GY17_A136BarColNum, P09GY17_A1652BarSerDsc, P09GY17_A212BarSer, P09GY17_A213BarSit, P09GY17_A2804RecLinMaq, P09GY17_A13696BarNHdr, P09GY17_A812RecTotKgm, P09GY17_n812RecTotKgm,
            P09GY17_A129BarCod, P09GY17_A132BarCodReo, P09GY17_A130BarCodPar
            }
            , new Object[] {
            P09GY21_A396EmprCod, P09GY21_A6039RecAcab, P09GY21_n6039RecAcab, P09GY21_A1234BarNomCli, P09GY21_A189BarNumAny, P09GY21_A4866RecFecAlt, P09GY21_n4866RecFecAlt, P09GY21_A2805RecVolPrd, P09GY21_A602MaqCod, P09GY21_A1235BarNumCli,
            P09GY21_A218BarTipCol, P09GY21_A136BarColNum, P09GY21_A135BarColNom, P09GY21_A1652BarSerDsc, P09GY21_A212BarSer, P09GY21_A213BarSit, P09GY21_A2804RecLinMaq, P09GY21_A13696BarNHdr, P09GY21_A812RecTotKgm, P09GY21_n812RecTotKgm,
            P09GY21_A129BarCod, P09GY21_A132BarCodReo, P09GY21_A130BarCodPar
            }
            , new Object[] {
            P09GY25_A396EmprCod, P09GY25_A602MaqCod, P09GY25_A6039RecAcab, P09GY25_n6039RecAcab, P09GY25_A189BarNumAny, P09GY25_A4866RecFecAlt, P09GY25_n4866RecFecAlt, P09GY25_A2805RecVolPrd, P09GY25_A1235BarNumCli, P09GY25_A1234BarNomCli,
            P09GY25_A218BarTipCol, P09GY25_A136BarColNum, P09GY25_A135BarColNom, P09GY25_A1652BarSerDsc, P09GY25_A212BarSer, P09GY25_A213BarSit, P09GY25_A2804RecLinMaq, P09GY25_A13696BarNHdr, P09GY25_A812RecTotKgm, P09GY25_n812RecTotKgm,
            P09GY25_A129BarCod, P09GY25_A132BarCodReo, P09GY25_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14TFBarSit ;
   private byte AV15TFBarSit_To ;
   private byte AV24TFBarTipCol ;
   private byte AV25TFBarTipCol_To ;
   private byte AV61Barcodreo ;
   private byte AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ;
   private byte AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ;
   private byte AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ;
   private byte AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private short AV12TFRecLinMaq ;
   private short AV13TFRecLinMaq_To ;
   private short AV38TFBarNumAny ;
   private short AV39TFBarNumAny_To ;
   private short AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ;
   private short AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ;
   private short AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ;
   private short AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ;
   private short A2804RecLinMaq ;
   private short A189BarNumAny ;
   private short Gx_err ;
   private int AV67GXV1 ;
   private int AV22TFBarColNum ;
   private int AV23TFBarColNum_To ;
   private int AV28TFBarNumCli ;
   private int AV29TFBarNumCli_To ;
   private int AV32TFRecVolPrd ;
   private int AV33TFRecVolPrd_To ;
   private int AV60Barcod ;
   private int AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ;
   private int AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ;
   private int AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ;
   private int AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ;
   private int AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ;
   private int AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int AV43InsertIndex ;
   private long AV52count ;
   private java.math.BigDecimal AV34TFRecTotKgm ;
   private java.math.BigDecimal AV35TFRecTotKgm_To ;
   private java.math.BigDecimal AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ;
   private java.math.BigDecimal AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ;
   private java.math.BigDecimal A812RecTotKgm ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV16TFBarSer ;
   private String AV17TFBarSer_Sel ;
   private String AV18TFBarSerDsc ;
   private String AV19TFBarSerDsc_Sel ;
   private String AV20TFBarColNom ;
   private String AV21TFBarColNom_Sel ;
   private String AV26TFBarNomCli ;
   private String AV27TFBarNomCli_Sel ;
   private String AV30TFMaqCod ;
   private String AV31TFMaqCod_Sel ;
   private String AV59Emprcod ;
   private String AV62Barcodpar ;
   private String AV64RecAcab ;
   private String A13696BarNHdr ;
   private String AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ;
   private String AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ;
   private String AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ;
   private String AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ;
   private String AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ;
   private String AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ;
   private String AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ;
   private String AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ;
   private String AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ;
   private String AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ;
   private String AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ;
   private String AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ;
   private String lV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ;
   private String lV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ;
   private String lV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ;
   private String lV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ;
   private String lV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A602MaqCod ;
   private String A6039RecAcab ;
   private String A396EmprCod ;
   private java.util.Date AV36TFRecFecAlt ;
   private java.util.Date AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV63FechaCierre ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean n812RecTotKgm ;
   private boolean brk9GY3 ;
   private boolean brk9GY5 ;
   private boolean brk9GY7 ;
   private boolean brk9GY9 ;
   private boolean brk9GY11 ;
   private String AV46OptionsJson ;
   private String AV49OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV40SearchTxt ;
   private String AV41SearchTxtTo ;
   private String AV58FilterFullText ;
   private String AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ;
   private String lV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ;
   private String AV44Option ;
   private com.genexus.webpanels.WebSession AV53Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09GY5_A6039RecAcab ;
   private boolean[] P09GY5_n6039RecAcab ;
   private String[] P09GY5_A396EmprCod ;
   private short[] P09GY5_A189BarNumAny ;
   private java.util.Date[] P09GY5_A4866RecFecAlt ;
   private boolean[] P09GY5_n4866RecFecAlt ;
   private int[] P09GY5_A2805RecVolPrd ;
   private String[] P09GY5_A602MaqCod ;
   private int[] P09GY5_A1235BarNumCli ;
   private String[] P09GY5_A1234BarNomCli ;
   private byte[] P09GY5_A218BarTipCol ;
   private int[] P09GY5_A136BarColNum ;
   private String[] P09GY5_A135BarColNom ;
   private String[] P09GY5_A1652BarSerDsc ;
   private String[] P09GY5_A212BarSer ;
   private byte[] P09GY5_A213BarSit ;
   private short[] P09GY5_A2804RecLinMaq ;
   private String[] P09GY5_A13696BarNHdr ;
   private java.math.BigDecimal[] P09GY5_A812RecTotKgm ;
   private boolean[] P09GY5_n812RecTotKgm ;
   private int[] P09GY5_A129BarCod ;
   private byte[] P09GY5_A132BarCodReo ;
   private String[] P09GY5_A130BarCodPar ;
   private String[] P09GY9_A396EmprCod ;
   private String[] P09GY9_A6039RecAcab ;
   private boolean[] P09GY9_n6039RecAcab ;
   private String[] P09GY9_A212BarSer ;
   private short[] P09GY9_A189BarNumAny ;
   private java.util.Date[] P09GY9_A4866RecFecAlt ;
   private boolean[] P09GY9_n4866RecFecAlt ;
   private int[] P09GY9_A2805RecVolPrd ;
   private String[] P09GY9_A602MaqCod ;
   private int[] P09GY9_A1235BarNumCli ;
   private String[] P09GY9_A1234BarNomCli ;
   private byte[] P09GY9_A218BarTipCol ;
   private int[] P09GY9_A136BarColNum ;
   private String[] P09GY9_A135BarColNom ;
   private String[] P09GY9_A1652BarSerDsc ;
   private byte[] P09GY9_A213BarSit ;
   private short[] P09GY9_A2804RecLinMaq ;
   private String[] P09GY9_A13696BarNHdr ;
   private java.math.BigDecimal[] P09GY9_A812RecTotKgm ;
   private boolean[] P09GY9_n812RecTotKgm ;
   private int[] P09GY9_A129BarCod ;
   private byte[] P09GY9_A132BarCodReo ;
   private String[] P09GY9_A130BarCodPar ;
   private String[] P09GY13_A396EmprCod ;
   private String[] P09GY13_A6039RecAcab ;
   private boolean[] P09GY13_n6039RecAcab ;
   private String[] P09GY13_A1652BarSerDsc ;
   private short[] P09GY13_A189BarNumAny ;
   private java.util.Date[] P09GY13_A4866RecFecAlt ;
   private boolean[] P09GY13_n4866RecFecAlt ;
   private int[] P09GY13_A2805RecVolPrd ;
   private String[] P09GY13_A602MaqCod ;
   private int[] P09GY13_A1235BarNumCli ;
   private String[] P09GY13_A1234BarNomCli ;
   private byte[] P09GY13_A218BarTipCol ;
   private int[] P09GY13_A136BarColNum ;
   private String[] P09GY13_A135BarColNom ;
   private String[] P09GY13_A212BarSer ;
   private byte[] P09GY13_A213BarSit ;
   private short[] P09GY13_A2804RecLinMaq ;
   private String[] P09GY13_A13696BarNHdr ;
   private java.math.BigDecimal[] P09GY13_A812RecTotKgm ;
   private boolean[] P09GY13_n812RecTotKgm ;
   private int[] P09GY13_A129BarCod ;
   private byte[] P09GY13_A132BarCodReo ;
   private String[] P09GY13_A130BarCodPar ;
   private String[] P09GY17_A396EmprCod ;
   private String[] P09GY17_A6039RecAcab ;
   private boolean[] P09GY17_n6039RecAcab ;
   private String[] P09GY17_A135BarColNom ;
   private short[] P09GY17_A189BarNumAny ;
   private java.util.Date[] P09GY17_A4866RecFecAlt ;
   private boolean[] P09GY17_n4866RecFecAlt ;
   private int[] P09GY17_A2805RecVolPrd ;
   private String[] P09GY17_A602MaqCod ;
   private int[] P09GY17_A1235BarNumCli ;
   private String[] P09GY17_A1234BarNomCli ;
   private byte[] P09GY17_A218BarTipCol ;
   private int[] P09GY17_A136BarColNum ;
   private String[] P09GY17_A1652BarSerDsc ;
   private String[] P09GY17_A212BarSer ;
   private byte[] P09GY17_A213BarSit ;
   private short[] P09GY17_A2804RecLinMaq ;
   private String[] P09GY17_A13696BarNHdr ;
   private java.math.BigDecimal[] P09GY17_A812RecTotKgm ;
   private boolean[] P09GY17_n812RecTotKgm ;
   private int[] P09GY17_A129BarCod ;
   private byte[] P09GY17_A132BarCodReo ;
   private String[] P09GY17_A130BarCodPar ;
   private String[] P09GY21_A396EmprCod ;
   private String[] P09GY21_A6039RecAcab ;
   private boolean[] P09GY21_n6039RecAcab ;
   private String[] P09GY21_A1234BarNomCli ;
   private short[] P09GY21_A189BarNumAny ;
   private java.util.Date[] P09GY21_A4866RecFecAlt ;
   private boolean[] P09GY21_n4866RecFecAlt ;
   private int[] P09GY21_A2805RecVolPrd ;
   private String[] P09GY21_A602MaqCod ;
   private int[] P09GY21_A1235BarNumCli ;
   private byte[] P09GY21_A218BarTipCol ;
   private int[] P09GY21_A136BarColNum ;
   private String[] P09GY21_A135BarColNom ;
   private String[] P09GY21_A1652BarSerDsc ;
   private String[] P09GY21_A212BarSer ;
   private byte[] P09GY21_A213BarSit ;
   private short[] P09GY21_A2804RecLinMaq ;
   private String[] P09GY21_A13696BarNHdr ;
   private java.math.BigDecimal[] P09GY21_A812RecTotKgm ;
   private boolean[] P09GY21_n812RecTotKgm ;
   private int[] P09GY21_A129BarCod ;
   private byte[] P09GY21_A132BarCodReo ;
   private String[] P09GY21_A130BarCodPar ;
   private String[] P09GY25_A396EmprCod ;
   private String[] P09GY25_A602MaqCod ;
   private String[] P09GY25_A6039RecAcab ;
   private boolean[] P09GY25_n6039RecAcab ;
   private short[] P09GY25_A189BarNumAny ;
   private java.util.Date[] P09GY25_A4866RecFecAlt ;
   private boolean[] P09GY25_n4866RecFecAlt ;
   private int[] P09GY25_A2805RecVolPrd ;
   private int[] P09GY25_A1235BarNumCli ;
   private String[] P09GY25_A1234BarNomCli ;
   private byte[] P09GY25_A218BarTipCol ;
   private int[] P09GY25_A136BarColNum ;
   private String[] P09GY25_A135BarColNom ;
   private String[] P09GY25_A1652BarSerDsc ;
   private String[] P09GY25_A212BarSer ;
   private byte[] P09GY25_A213BarSit ;
   private short[] P09GY25_A2804RecLinMaq ;
   private String[] P09GY25_A13696BarNHdr ;
   private java.math.BigDecimal[] P09GY25_A812RecTotKgm ;
   private boolean[] P09GY25_n812RecTotKgm ;
   private int[] P09GY25_A129BarCod ;
   private byte[] P09GY25_A132BarCodReo ;
   private String[] P09GY25_A130BarCodPar ;
   private GXSimpleCollection<String> AV45Options ;
   private GXSimpleCollection<String> AV48OptionsDesc ;
   private GXSimpleCollection<String> AV50OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV55GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV56GridStateFilterValue ;
}

final  class recetadetinte_cierre_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09GY5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                          String AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                          short AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ,
                                          short AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ,
                                          byte AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ,
                                          byte AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ,
                                          String AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                          String AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                          String AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                          String AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                          String AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                          String AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                          int AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ,
                                          int AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ,
                                          byte AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ,
                                          byte AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ,
                                          String AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                          String AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                          int AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ,
                                          int AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ,
                                          String AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                          String AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                          int AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ,
                                          int AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                          short AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ,
                                          short AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ,
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
                                          String AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                          java.math.BigDecimal AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                          int AV60Barcod ,
                                          byte AV61Barcodreo ,
                                          String AV62Barcodpar ,
                                          String A6039RecAcab ,
                                          String AV64RecAcab ,
                                          String AV59Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[54];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.RecAcab, T1.EmprCod, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar" ;
      scmdbuf += " AS BarNHdr, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0) <> 0 THEN COALESCE(" ;
      scmdbuf += " T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM ((TXPBARCAD T4" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod" ;
      scmdbuf += " = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND T6.BarCodReo =" ;
      scmdbuf += " T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarNumCli,'999990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarNumAny,'990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09GY9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                          String AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                          short AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ,
                                          short AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ,
                                          byte AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ,
                                          byte AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ,
                                          String AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                          String AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                          String AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                          String AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                          String AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                          String AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                          int AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ,
                                          int AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ,
                                          byte AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ,
                                          byte AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ,
                                          String AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                          String AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                          int AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ,
                                          int AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ,
                                          String AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                          String AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                          int AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ,
                                          int AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                          short AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ,
                                          short AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ,
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
                                          String AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                          java.math.BigDecimal AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                          int AV60Barcod ,
                                          byte AV61Barcodreo ,
                                          String AV62Barcodpar ,
                                          String A396EmprCod ,
                                          String AV59Emprcod ,
                                          String A6039RecAcab ,
                                          String AV64RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[54];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarSer, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSerDsc, T2.BarSit, T1.RecLinMaq, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar" ;
      scmdbuf += " AS BarNHdr, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0) <> 0 THEN COALESCE(" ;
      scmdbuf += " T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM ((TXPBARCAD T4" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod" ;
      scmdbuf += " = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND T6.BarCodReo =" ;
      scmdbuf += " T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarNumCli,'999990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarNumAny,'990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[48] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int4[49] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int4[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int4[51] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int4[52] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int4[53] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09GY13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           String AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           short AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ,
                                           short AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ,
                                           byte AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ,
                                           byte AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ,
                                           String AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           String AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           String AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           String AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           String AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           String AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           int AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ,
                                           int AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ,
                                           byte AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ,
                                           byte AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ,
                                           String AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           String AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           int AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ,
                                           int AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ,
                                           String AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           String AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           int AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ,
                                           int AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ,
                                           java.util.Date AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           short AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ,
                                           short AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ,
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
                                           String AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           java.math.BigDecimal AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           int AV60Barcod ,
                                           byte AV61Barcodreo ,
                                           String AV62Barcodpar ,
                                           String A396EmprCod ,
                                           String AV59Emprcod ,
                                           String A6039RecAcab ,
                                           String AV64RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[54];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarSerDsc, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar" ;
      scmdbuf += " AS BarNHdr, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0) <> 0 THEN COALESCE(" ;
      scmdbuf += " T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM ((TXPBARCAD T4" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod" ;
      scmdbuf += " = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND T6.BarCodReo =" ;
      scmdbuf += " T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarNumCli,'999990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarNumAny,'990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09GY17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           String AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           short AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ,
                                           short AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ,
                                           byte AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ,
                                           byte AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ,
                                           String AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           String AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           String AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           String AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           String AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           String AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           int AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ,
                                           int AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ,
                                           byte AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ,
                                           byte AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ,
                                           String AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           String AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           int AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ,
                                           int AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ,
                                           String AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           String AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           int AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ,
                                           int AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ,
                                           java.util.Date AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           short AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ,
                                           short AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ,
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
                                           String AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           java.math.BigDecimal AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           int AV60Barcod ,
                                           byte AV61Barcodreo ,
                                           String AV62Barcodpar ,
                                           String A396EmprCod ,
                                           String AV59Emprcod ,
                                           String A6039RecAcab ,
                                           String AV64RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[54];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarColNom, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar" ;
      scmdbuf += " AS BarNHdr, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0) <> 0 THEN COALESCE(" ;
      scmdbuf += " T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM ((TXPBARCAD T4" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod" ;
      scmdbuf += " = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND T6.BarCodReo =" ;
      scmdbuf += " T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarNumCli,'999990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarNumAny,'990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09GY21( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           String AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           short AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ,
                                           short AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ,
                                           byte AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ,
                                           byte AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ,
                                           String AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           String AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           String AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           String AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           String AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           String AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           int AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ,
                                           int AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ,
                                           byte AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ,
                                           byte AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ,
                                           String AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           String AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           int AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ,
                                           int AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ,
                                           String AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           String AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           int AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ,
                                           int AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ,
                                           java.util.Date AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           short AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ,
                                           short AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ,
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
                                           String AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           java.math.BigDecimal AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           int AV60Barcod ,
                                           byte AV61Barcodreo ,
                                           String AV62Barcodpar ,
                                           String A396EmprCod ,
                                           String AV59Emprcod ,
                                           String A6039RecAcab ,
                                           String AV64RecAcab )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[54];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarNomCli, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar" ;
      scmdbuf += " AS BarNHdr, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0) <> 0 THEN COALESCE(" ;
      scmdbuf += " T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM ((TXPBARCAD T4" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod" ;
      scmdbuf += " = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND T6.BarCodReo =" ;
      scmdbuf += " T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarNumCli,'999990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarNumAny,'990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int10[51] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int10[52] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int10[53] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarNomCli" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09GY25( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel ,
                                           String AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr ,
                                           short AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq ,
                                           short AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to ,
                                           byte AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit ,
                                           byte AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to ,
                                           String AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel ,
                                           String AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser ,
                                           String AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel ,
                                           String AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc ,
                                           String AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel ,
                                           String AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom ,
                                           int AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum ,
                                           int AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to ,
                                           byte AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol ,
                                           byte AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to ,
                                           String AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel ,
                                           String AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli ,
                                           int AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli ,
                                           int AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to ,
                                           String AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel ,
                                           String AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod ,
                                           int AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd ,
                                           int AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to ,
                                           java.util.Date AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt ,
                                           short AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany ,
                                           short AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to ,
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
                                           String AV69Formulaciontinte_recetadetinte_cierre_wcds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal AV94Formulaciontinte_recetadetinte_cierre_wcds_26_tfrectotkgm ,
                                           java.math.BigDecimal AV95Formulaciontinte_recetadetinte_cierre_wcds_27_tfrectotkgm_to ,
                                           int AV60Barcod ,
                                           byte AV61Barcodreo ,
                                           String AV62Barcodpar ,
                                           String A6039RecAcab ,
                                           String AV64RecAcab ,
                                           String AV59Emprcod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[54];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.MaqCod, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar" ;
      scmdbuf += " AS BarNHdr, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr, 0) <> 0 THEN COALESCE(" ;
      scmdbuf += " T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar FROM ((TXPBARCAD T4" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod" ;
      scmdbuf += " = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND T6.BarCodReo =" ;
      scmdbuf += " T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarNumCli,'999990'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarNumAny,'990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_recetadetinte_cierre_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_recetadetinte_cierre_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_recetadetinte_cierre_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (0==AV73Formulaciontinte_recetadetinte_cierre_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV74Formulaciontinte_recetadetinte_cierre_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV75Formulaciontinte_recetadetinte_cierre_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV76Formulaciontinte_recetadetinte_cierre_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Formulaciontinte_recetadetinte_cierre_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_recetadetinte_cierre_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_recetadetinte_cierre_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_recetadetinte_cierre_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (0==AV83Formulaciontinte_recetadetinte_cierre_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! (0==AV84Formulaciontinte_recetadetinte_cierre_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (0==AV85Formulaciontinte_recetadetinte_cierre_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadetinte_cierre_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_recetadetinte_cierre_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int12[50] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Formulaciontinte_recetadetinte_cierre_wcds_28_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int12[51] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre_wcds_29_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int12[52] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_recetadetinte_cierre_wcds_30_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int12[53] = (byte)(1) ;
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
                  return conditional_P09GY5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 1 :
                  return conditional_P09GY9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 2 :
                  return conditional_P09GY13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 3 :
                  return conditional_P09GY17(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 4 :
                  return conditional_P09GY21(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] );
            case 5 :
                  return conditional_P09GY25(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GY5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GY9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GY13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GY17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GY21", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GY25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[17])[0] = rslt.getString(16, 11);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
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
               ((String[]) buf[17])[0] = rslt.getString(16, 11);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
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
               ((String[]) buf[17])[0] = rslt.getString(16, 11);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
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
               ((String[]) buf[17])[0] = rslt.getString(16, 11);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
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
               ((String[]) buf[17])[0] = rslt.getString(16, 11);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
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
               ((String[]) buf[17])[0] = rslt.getString(16, 11);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
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
                  stmt.setString(sIdx, (String)parms[54], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[84]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[105], false);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[84]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[105], false);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[84]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[105], false);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[84]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[105], false);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[84]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[105], false);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[84]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[104]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[105], false);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[106]).shortValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               return;
      }
   }

}

