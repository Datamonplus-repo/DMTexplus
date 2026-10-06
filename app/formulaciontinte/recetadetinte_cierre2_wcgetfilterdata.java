package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class recetadetinte_cierre2_wcgetfilterdata extends GXProcedure
{
   public recetadetinte_cierre2_wcgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte_cierre2_wcgetfilterdata.class ), "" );
   }

   public recetadetinte_cierre2_wcgetfilterdata( int remoteHandle ,
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
      recetadetinte_cierre2_wcgetfilterdata.this.aP5 = new String[] {""};
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
      recetadetinte_cierre2_wcgetfilterdata.this.AV42DDOName = aP0;
      recetadetinte_cierre2_wcgetfilterdata.this.AV40SearchTxt = aP1;
      recetadetinte_cierre2_wcgetfilterdata.this.AV41SearchTxtTo = aP2;
      recetadetinte_cierre2_wcgetfilterdata.this.aP3 = aP3;
      recetadetinte_cierre2_wcgetfilterdata.this.aP4 = aP4;
      recetadetinte_cierre2_wcgetfilterdata.this.aP5 = aP5;
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
      if ( GXutil.strcmp(AV53Session.getValue("FormulacionTinte.RecetadeTinte_Cierre2_WCGridState"), "") == 0 )
      {
         AV55GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.RecetadeTinte_Cierre2_WCGridState"), null, null);
      }
      else
      {
         AV55GridState.fromxml(AV53Session.getValue("FormulacionTinte.RecetadeTinte_Cierre2_WCGridState"), null, null);
      }
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV56GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
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
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV40SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = AV58FilterFullText ;
      AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit = AV14TFBarSit ;
      AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = AV16TFBarSer ;
      AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = AV36TFRecFecAlt ;
      AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany = AV38TFBarNumAny ;
      AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                           AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) ,
                                           AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                           AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                           AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                           AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                           AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) ,
                                           AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                           AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) ,
                                           AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                           Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) ,
                                           Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
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
                                           AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                           A14372RecHayAny ,
                                           A13696BarNHdr ,
                                           A6039RecAcab ,
                                           Byte.valueOf(A4700RecEnvio) ,
                                           AV59Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr), 11, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser), 16, "%") ;
      lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc), 26, "%") ;
      lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli), 13, "%") ;
      lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09HJ2 */
      pr_default.execute(0, new Object[] {AV59Emprcod, lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr, AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel, Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq), Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to), Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit), Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to), lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser, AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel, lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc, AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel, lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom, AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum), Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to), Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol), Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to), lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli, AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to), lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod, AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel, Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd), Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt, Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany), Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), AV62Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4700RecEnvio = P09HJ2_A4700RecEnvio[0] ;
         A6039RecAcab = P09HJ2_A6039RecAcab[0] ;
         n6039RecAcab = P09HJ2_n6039RecAcab[0] ;
         A189BarNumAny = P09HJ2_A189BarNumAny[0] ;
         A4866RecFecAlt = P09HJ2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09HJ2_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09HJ2_A2805RecVolPrd[0] ;
         A602MaqCod = P09HJ2_A602MaqCod[0] ;
         A1235BarNumCli = P09HJ2_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HJ2_A1234BarNomCli[0] ;
         A218BarTipCol = P09HJ2_A218BarTipCol[0] ;
         A136BarColNum = P09HJ2_A136BarColNum[0] ;
         A135BarColNom = P09HJ2_A135BarColNom[0] ;
         A1652BarSerDsc = P09HJ2_A1652BarSerDsc[0] ;
         A212BarSer = P09HJ2_A212BarSer[0] ;
         A213BarSit = P09HJ2_A213BarSit[0] ;
         A13696BarNHdr = P09HJ2_A13696BarNHdr[0] ;
         A2804RecLinMaq = P09HJ2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09HJ2_A130BarCodPar[0] ;
         A132BarCodReo = P09HJ2_A132BarCodReo[0] ;
         A129BarCod = P09HJ2_A129BarCod[0] ;
         A396EmprCod = P09HJ2_A396EmprCod[0] ;
         A189BarNumAny = P09HJ2_A189BarNumAny[0] ;
         A1235BarNumCli = P09HJ2_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HJ2_A1234BarNomCli[0] ;
         A218BarTipCol = P09HJ2_A218BarTipCol[0] ;
         A136BarColNum = P09HJ2_A136BarColNum[0] ;
         A135BarColNom = P09HJ2_A135BarColNom[0] ;
         A1652BarSerDsc = P09HJ2_A1652BarSerDsc[0] ;
         A212BarSer = P09HJ2_A212BarSer[0] ;
         A213BarSit = P09HJ2_A213BarSit[0] ;
         A13696BarNHdr = P09HJ2_A13696BarNHdr[0] ;
         GXt_char2 = A14372RecHayAny ;
         GXv_char3[0] = GXt_char2 ;
         new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char3) ;
         recetadetinte_cierre2_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14372RecHayAny = GXt_char2 ;
         if ( (GXutil.strcmp("", AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A14372RecHayAny) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2804RecLinMaq, 4, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2805RecVolPrd, 5, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A189BarNumAny, 3, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
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
      AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = AV58FilterFullText ;
      AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit = AV14TFBarSit ;
      AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = AV16TFBarSer ;
      AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = AV36TFRecFecAlt ;
      AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany = AV38TFBarNumAny ;
      AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                           AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) ,
                                           AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                           AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                           AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                           AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                           AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) ,
                                           AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                           AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) ,
                                           AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                           Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) ,
                                           Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
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
                                           AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                           A14372RecHayAny ,
                                           A13696BarNHdr ,
                                           A6039RecAcab ,
                                           Byte.valueOf(A4700RecEnvio) ,
                                           A396EmprCod ,
                                           AV59Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr), 11, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser), 16, "%") ;
      lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc), 26, "%") ;
      lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli), 13, "%") ;
      lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09HJ3 */
      pr_default.execute(1, new Object[] {AV59Emprcod, lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr, AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel, Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq), Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to), Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit), Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to), lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser, AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel, lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc, AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel, lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom, AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum), Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to), Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol), Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to), lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli, AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to), lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod, AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel, Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd), Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt, Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany), Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), AV62Barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9HJ3 = false ;
         A212BarSer = P09HJ3_A212BarSer[0] ;
         A4700RecEnvio = P09HJ3_A4700RecEnvio[0] ;
         A6039RecAcab = P09HJ3_A6039RecAcab[0] ;
         n6039RecAcab = P09HJ3_n6039RecAcab[0] ;
         A189BarNumAny = P09HJ3_A189BarNumAny[0] ;
         A4866RecFecAlt = P09HJ3_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09HJ3_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09HJ3_A2805RecVolPrd[0] ;
         A602MaqCod = P09HJ3_A602MaqCod[0] ;
         A1235BarNumCli = P09HJ3_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HJ3_A1234BarNomCli[0] ;
         A218BarTipCol = P09HJ3_A218BarTipCol[0] ;
         A136BarColNum = P09HJ3_A136BarColNum[0] ;
         A135BarColNom = P09HJ3_A135BarColNom[0] ;
         A1652BarSerDsc = P09HJ3_A1652BarSerDsc[0] ;
         A213BarSit = P09HJ3_A213BarSit[0] ;
         A13696BarNHdr = P09HJ3_A13696BarNHdr[0] ;
         A2804RecLinMaq = P09HJ3_A2804RecLinMaq[0] ;
         A130BarCodPar = P09HJ3_A130BarCodPar[0] ;
         A132BarCodReo = P09HJ3_A132BarCodReo[0] ;
         A129BarCod = P09HJ3_A129BarCod[0] ;
         A396EmprCod = P09HJ3_A396EmprCod[0] ;
         A212BarSer = P09HJ3_A212BarSer[0] ;
         A189BarNumAny = P09HJ3_A189BarNumAny[0] ;
         A1235BarNumCli = P09HJ3_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HJ3_A1234BarNomCli[0] ;
         A218BarTipCol = P09HJ3_A218BarTipCol[0] ;
         A136BarColNum = P09HJ3_A136BarColNum[0] ;
         A135BarColNom = P09HJ3_A135BarColNom[0] ;
         A1652BarSerDsc = P09HJ3_A1652BarSerDsc[0] ;
         A213BarSit = P09HJ3_A213BarSit[0] ;
         A13696BarNHdr = P09HJ3_A13696BarNHdr[0] ;
         GXt_char2 = A14372RecHayAny ;
         GXv_char3[0] = GXt_char2 ;
         new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char3) ;
         recetadetinte_cierre2_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14372RecHayAny = GXt_char2 ;
         if ( (GXutil.strcmp("", AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A14372RecHayAny) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2804RecLinMaq, 4, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2805RecVolPrd, 5, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A189BarNumAny, 3, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV52count = 0 ;
            while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09HJ3_A212BarSer[0], A212BarSer) == 0 ) )
            {
               brk9HJ3 = false ;
               A2804RecLinMaq = P09HJ3_A2804RecLinMaq[0] ;
               A130BarCodPar = P09HJ3_A130BarCodPar[0] ;
               A132BarCodReo = P09HJ3_A132BarCodReo[0] ;
               A129BarCod = P09HJ3_A129BarCod[0] ;
               A396EmprCod = P09HJ3_A396EmprCod[0] ;
               AV52count = (long)(AV52count+1) ;
               brk9HJ3 = true ;
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
         }
         if ( ! brk9HJ3 )
         {
            brk9HJ3 = true ;
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
      AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = AV58FilterFullText ;
      AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit = AV14TFBarSit ;
      AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = AV16TFBarSer ;
      AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = AV36TFRecFecAlt ;
      AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany = AV38TFBarNumAny ;
      AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                           AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) ,
                                           AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                           AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                           AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                           AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                           AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) ,
                                           AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                           AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) ,
                                           AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                           Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) ,
                                           Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
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
                                           AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                           A14372RecHayAny ,
                                           A13696BarNHdr ,
                                           A6039RecAcab ,
                                           Byte.valueOf(A4700RecEnvio) ,
                                           A396EmprCod ,
                                           AV59Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr), 11, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser), 16, "%") ;
      lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc), 26, "%") ;
      lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli), 13, "%") ;
      lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09HJ4 */
      pr_default.execute(2, new Object[] {AV59Emprcod, lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr, AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel, Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq), Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to), Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit), Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to), lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser, AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel, lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc, AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel, lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom, AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum), Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to), Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol), Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to), lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli, AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to), lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod, AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel, Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd), Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt, Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany), Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), AV62Barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9HJ5 = false ;
         A1652BarSerDsc = P09HJ4_A1652BarSerDsc[0] ;
         A4700RecEnvio = P09HJ4_A4700RecEnvio[0] ;
         A6039RecAcab = P09HJ4_A6039RecAcab[0] ;
         n6039RecAcab = P09HJ4_n6039RecAcab[0] ;
         A189BarNumAny = P09HJ4_A189BarNumAny[0] ;
         A4866RecFecAlt = P09HJ4_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09HJ4_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09HJ4_A2805RecVolPrd[0] ;
         A602MaqCod = P09HJ4_A602MaqCod[0] ;
         A1235BarNumCli = P09HJ4_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HJ4_A1234BarNomCli[0] ;
         A218BarTipCol = P09HJ4_A218BarTipCol[0] ;
         A136BarColNum = P09HJ4_A136BarColNum[0] ;
         A135BarColNom = P09HJ4_A135BarColNom[0] ;
         A212BarSer = P09HJ4_A212BarSer[0] ;
         A213BarSit = P09HJ4_A213BarSit[0] ;
         A13696BarNHdr = P09HJ4_A13696BarNHdr[0] ;
         A2804RecLinMaq = P09HJ4_A2804RecLinMaq[0] ;
         A130BarCodPar = P09HJ4_A130BarCodPar[0] ;
         A132BarCodReo = P09HJ4_A132BarCodReo[0] ;
         A129BarCod = P09HJ4_A129BarCod[0] ;
         A396EmprCod = P09HJ4_A396EmprCod[0] ;
         A1652BarSerDsc = P09HJ4_A1652BarSerDsc[0] ;
         A189BarNumAny = P09HJ4_A189BarNumAny[0] ;
         A1235BarNumCli = P09HJ4_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HJ4_A1234BarNomCli[0] ;
         A218BarTipCol = P09HJ4_A218BarTipCol[0] ;
         A136BarColNum = P09HJ4_A136BarColNum[0] ;
         A135BarColNom = P09HJ4_A135BarColNom[0] ;
         A212BarSer = P09HJ4_A212BarSer[0] ;
         A213BarSit = P09HJ4_A213BarSit[0] ;
         A13696BarNHdr = P09HJ4_A13696BarNHdr[0] ;
         GXt_char2 = A14372RecHayAny ;
         GXv_char3[0] = GXt_char2 ;
         new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char3) ;
         recetadetinte_cierre2_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14372RecHayAny = GXt_char2 ;
         if ( (GXutil.strcmp("", AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A14372RecHayAny) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2804RecLinMaq, 4, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2805RecVolPrd, 5, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A189BarNumAny, 3, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV52count = 0 ;
            while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09HJ4_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
            {
               brk9HJ5 = false ;
               A2804RecLinMaq = P09HJ4_A2804RecLinMaq[0] ;
               A130BarCodPar = P09HJ4_A130BarCodPar[0] ;
               A132BarCodReo = P09HJ4_A132BarCodReo[0] ;
               A129BarCod = P09HJ4_A129BarCod[0] ;
               A396EmprCod = P09HJ4_A396EmprCod[0] ;
               AV52count = (long)(AV52count+1) ;
               brk9HJ5 = true ;
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
         }
         if ( ! brk9HJ5 )
         {
            brk9HJ5 = true ;
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
      AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = AV58FilterFullText ;
      AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit = AV14TFBarSit ;
      AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = AV16TFBarSer ;
      AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = AV36TFRecFecAlt ;
      AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany = AV38TFBarNumAny ;
      AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                           AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) ,
                                           AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                           AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                           AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                           AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                           AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) ,
                                           AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                           AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) ,
                                           AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                           Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) ,
                                           Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
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
                                           AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                           A14372RecHayAny ,
                                           A13696BarNHdr ,
                                           A6039RecAcab ,
                                           Byte.valueOf(A4700RecEnvio) ,
                                           A396EmprCod ,
                                           AV59Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr), 11, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser), 16, "%") ;
      lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc), 26, "%") ;
      lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli), 13, "%") ;
      lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09HJ5 */
      pr_default.execute(3, new Object[] {AV59Emprcod, lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr, AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel, Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq), Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to), Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit), Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to), lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser, AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel, lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc, AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel, lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom, AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum), Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to), Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol), Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to), lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli, AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to), lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod, AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel, Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd), Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt, Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany), Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), AV62Barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9HJ7 = false ;
         A135BarColNom = P09HJ5_A135BarColNom[0] ;
         A4700RecEnvio = P09HJ5_A4700RecEnvio[0] ;
         A6039RecAcab = P09HJ5_A6039RecAcab[0] ;
         n6039RecAcab = P09HJ5_n6039RecAcab[0] ;
         A189BarNumAny = P09HJ5_A189BarNumAny[0] ;
         A4866RecFecAlt = P09HJ5_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09HJ5_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09HJ5_A2805RecVolPrd[0] ;
         A602MaqCod = P09HJ5_A602MaqCod[0] ;
         A1235BarNumCli = P09HJ5_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HJ5_A1234BarNomCli[0] ;
         A218BarTipCol = P09HJ5_A218BarTipCol[0] ;
         A136BarColNum = P09HJ5_A136BarColNum[0] ;
         A1652BarSerDsc = P09HJ5_A1652BarSerDsc[0] ;
         A212BarSer = P09HJ5_A212BarSer[0] ;
         A213BarSit = P09HJ5_A213BarSit[0] ;
         A13696BarNHdr = P09HJ5_A13696BarNHdr[0] ;
         A2804RecLinMaq = P09HJ5_A2804RecLinMaq[0] ;
         A130BarCodPar = P09HJ5_A130BarCodPar[0] ;
         A132BarCodReo = P09HJ5_A132BarCodReo[0] ;
         A129BarCod = P09HJ5_A129BarCod[0] ;
         A396EmprCod = P09HJ5_A396EmprCod[0] ;
         A135BarColNom = P09HJ5_A135BarColNom[0] ;
         A189BarNumAny = P09HJ5_A189BarNumAny[0] ;
         A1235BarNumCli = P09HJ5_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HJ5_A1234BarNomCli[0] ;
         A218BarTipCol = P09HJ5_A218BarTipCol[0] ;
         A136BarColNum = P09HJ5_A136BarColNum[0] ;
         A1652BarSerDsc = P09HJ5_A1652BarSerDsc[0] ;
         A212BarSer = P09HJ5_A212BarSer[0] ;
         A213BarSit = P09HJ5_A213BarSit[0] ;
         A13696BarNHdr = P09HJ5_A13696BarNHdr[0] ;
         GXt_char2 = A14372RecHayAny ;
         GXv_char3[0] = GXt_char2 ;
         new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char3) ;
         recetadetinte_cierre2_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14372RecHayAny = GXt_char2 ;
         if ( (GXutil.strcmp("", AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A14372RecHayAny) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2804RecLinMaq, 4, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2805RecVolPrd, 5, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A189BarNumAny, 3, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV52count = 0 ;
            while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09HJ5_A135BarColNom[0], A135BarColNom) == 0 ) )
            {
               brk9HJ7 = false ;
               A2804RecLinMaq = P09HJ5_A2804RecLinMaq[0] ;
               A130BarCodPar = P09HJ5_A130BarCodPar[0] ;
               A132BarCodReo = P09HJ5_A132BarCodReo[0] ;
               A129BarCod = P09HJ5_A129BarCod[0] ;
               A396EmprCod = P09HJ5_A396EmprCod[0] ;
               AV52count = (long)(AV52count+1) ;
               brk9HJ7 = true ;
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
         }
         if ( ! brk9HJ7 )
         {
            brk9HJ7 = true ;
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
      AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = AV58FilterFullText ;
      AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit = AV14TFBarSit ;
      AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = AV16TFBarSer ;
      AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = AV36TFRecFecAlt ;
      AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany = AV38TFBarNumAny ;
      AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                           AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) ,
                                           AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                           AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                           AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                           AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                           AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) ,
                                           AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                           AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) ,
                                           AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                           Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) ,
                                           Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
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
                                           AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                           A14372RecHayAny ,
                                           A13696BarNHdr ,
                                           A6039RecAcab ,
                                           Byte.valueOf(A4700RecEnvio) ,
                                           A396EmprCod ,
                                           AV59Emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr), 11, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser), 16, "%") ;
      lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc), 26, "%") ;
      lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli), 13, "%") ;
      lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09HJ6 */
      pr_default.execute(4, new Object[] {AV59Emprcod, lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr, AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel, Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq), Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to), Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit), Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to), lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser, AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel, lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc, AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel, lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom, AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum), Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to), Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol), Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to), lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli, AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to), lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod, AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel, Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd), Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt, Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany), Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), AV62Barcodpar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9HJ9 = false ;
         A1234BarNomCli = P09HJ6_A1234BarNomCli[0] ;
         A4700RecEnvio = P09HJ6_A4700RecEnvio[0] ;
         A6039RecAcab = P09HJ6_A6039RecAcab[0] ;
         n6039RecAcab = P09HJ6_n6039RecAcab[0] ;
         A189BarNumAny = P09HJ6_A189BarNumAny[0] ;
         A4866RecFecAlt = P09HJ6_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09HJ6_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09HJ6_A2805RecVolPrd[0] ;
         A602MaqCod = P09HJ6_A602MaqCod[0] ;
         A1235BarNumCli = P09HJ6_A1235BarNumCli[0] ;
         A218BarTipCol = P09HJ6_A218BarTipCol[0] ;
         A136BarColNum = P09HJ6_A136BarColNum[0] ;
         A135BarColNom = P09HJ6_A135BarColNom[0] ;
         A1652BarSerDsc = P09HJ6_A1652BarSerDsc[0] ;
         A212BarSer = P09HJ6_A212BarSer[0] ;
         A213BarSit = P09HJ6_A213BarSit[0] ;
         A13696BarNHdr = P09HJ6_A13696BarNHdr[0] ;
         A2804RecLinMaq = P09HJ6_A2804RecLinMaq[0] ;
         A130BarCodPar = P09HJ6_A130BarCodPar[0] ;
         A132BarCodReo = P09HJ6_A132BarCodReo[0] ;
         A129BarCod = P09HJ6_A129BarCod[0] ;
         A396EmprCod = P09HJ6_A396EmprCod[0] ;
         A1234BarNomCli = P09HJ6_A1234BarNomCli[0] ;
         A189BarNumAny = P09HJ6_A189BarNumAny[0] ;
         A1235BarNumCli = P09HJ6_A1235BarNumCli[0] ;
         A218BarTipCol = P09HJ6_A218BarTipCol[0] ;
         A136BarColNum = P09HJ6_A136BarColNum[0] ;
         A135BarColNom = P09HJ6_A135BarColNom[0] ;
         A1652BarSerDsc = P09HJ6_A1652BarSerDsc[0] ;
         A212BarSer = P09HJ6_A212BarSer[0] ;
         A213BarSit = P09HJ6_A213BarSit[0] ;
         A13696BarNHdr = P09HJ6_A13696BarNHdr[0] ;
         GXt_char2 = A14372RecHayAny ;
         GXv_char3[0] = GXt_char2 ;
         new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char3) ;
         recetadetinte_cierre2_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14372RecHayAny = GXt_char2 ;
         if ( (GXutil.strcmp("", AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A14372RecHayAny) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2804RecLinMaq, 4, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2805RecVolPrd, 5, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A189BarNumAny, 3, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV52count = 0 ;
            while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09HJ6_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
            {
               brk9HJ9 = false ;
               A2804RecLinMaq = P09HJ6_A2804RecLinMaq[0] ;
               A130BarCodPar = P09HJ6_A130BarCodPar[0] ;
               A132BarCodReo = P09HJ6_A132BarCodReo[0] ;
               A129BarCod = P09HJ6_A129BarCod[0] ;
               A396EmprCod = P09HJ6_A396EmprCod[0] ;
               AV52count = (long)(AV52count+1) ;
               brk9HJ9 = true ;
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
         }
         if ( ! brk9HJ9 )
         {
            brk9HJ9 = true ;
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
      AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = AV58FilterFullText ;
      AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit = AV14TFBarSit ;
      AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to = AV15TFBarSit_To ;
      AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = AV16TFBarSer ;
      AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = AV20TFBarColNom ;
      AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum = AV22TFBarColNum ;
      AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to = AV23TFBarColNum_To ;
      AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol = AV24TFBarTipCol ;
      AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to = AV25TFBarTipCol_To ;
      AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = AV26TFBarNomCli ;
      AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = AV27TFBarNomCli_Sel ;
      AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli = AV28TFBarNumCli ;
      AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to = AV29TFBarNumCli_To ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = AV30TFMaqCod ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = AV31TFMaqCod_Sel ;
      AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd = AV32TFRecVolPrd ;
      AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to = AV33TFRecVolPrd_To ;
      AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = AV36TFRecFecAlt ;
      AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany = AV38TFBarNumAny ;
      AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to = AV39TFBarNumAny_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                           AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) ,
                                           AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                           AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                           AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                           AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                           AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                           AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) ,
                                           AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                           AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) ,
                                           AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                           AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) ,
                                           AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                           Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) ,
                                           Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) ,
                                           Integer.valueOf(AV60Barcod) ,
                                           Byte.valueOf(AV61Barcodreo) ,
                                           AV62Barcodpar ,
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
                                           AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                           A14372RecHayAny ,
                                           A13696BarNHdr ,
                                           A6039RecAcab ,
                                           Byte.valueOf(A4700RecEnvio) ,
                                           AV59Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr), 11, "%") ;
      lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser), 16, "%") ;
      lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc), 26, "%") ;
      lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom), 13, "%") ;
      lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli), 13, "%") ;
      lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09HJ7 */
      pr_default.execute(5, new Object[] {AV59Emprcod, lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr, AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel, Short.valueOf(AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq), Short.valueOf(AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to), Byte.valueOf(AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit), Byte.valueOf(AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to), lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser, AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel, lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc, AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel, lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom, AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum), Integer.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to), Byte.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol), Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to), lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli, AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli), Integer.valueOf(AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to), lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod, AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel, Integer.valueOf(AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd), Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt, Short.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany), Short.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to), Integer.valueOf(AV60Barcod), Byte.valueOf(AV61Barcodreo), AV62Barcodpar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9HJ11 = false ;
         A602MaqCod = P09HJ7_A602MaqCod[0] ;
         A4700RecEnvio = P09HJ7_A4700RecEnvio[0] ;
         A6039RecAcab = P09HJ7_A6039RecAcab[0] ;
         n6039RecAcab = P09HJ7_n6039RecAcab[0] ;
         A189BarNumAny = P09HJ7_A189BarNumAny[0] ;
         A4866RecFecAlt = P09HJ7_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09HJ7_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09HJ7_A2805RecVolPrd[0] ;
         A1235BarNumCli = P09HJ7_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HJ7_A1234BarNomCli[0] ;
         A218BarTipCol = P09HJ7_A218BarTipCol[0] ;
         A136BarColNum = P09HJ7_A136BarColNum[0] ;
         A135BarColNom = P09HJ7_A135BarColNom[0] ;
         A1652BarSerDsc = P09HJ7_A1652BarSerDsc[0] ;
         A212BarSer = P09HJ7_A212BarSer[0] ;
         A213BarSit = P09HJ7_A213BarSit[0] ;
         A13696BarNHdr = P09HJ7_A13696BarNHdr[0] ;
         A2804RecLinMaq = P09HJ7_A2804RecLinMaq[0] ;
         A130BarCodPar = P09HJ7_A130BarCodPar[0] ;
         A132BarCodReo = P09HJ7_A132BarCodReo[0] ;
         A129BarCod = P09HJ7_A129BarCod[0] ;
         A396EmprCod = P09HJ7_A396EmprCod[0] ;
         A189BarNumAny = P09HJ7_A189BarNumAny[0] ;
         A1235BarNumCli = P09HJ7_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HJ7_A1234BarNomCli[0] ;
         A218BarTipCol = P09HJ7_A218BarTipCol[0] ;
         A136BarColNum = P09HJ7_A136BarColNum[0] ;
         A135BarColNom = P09HJ7_A135BarColNom[0] ;
         A1652BarSerDsc = P09HJ7_A1652BarSerDsc[0] ;
         A212BarSer = P09HJ7_A212BarSer[0] ;
         A213BarSit = P09HJ7_A213BarSit[0] ;
         A13696BarNHdr = P09HJ7_A13696BarNHdr[0] ;
         GXt_char2 = A14372RecHayAny ;
         GXv_char3[0] = GXt_char2 ;
         new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char3) ;
         recetadetinte_cierre2_wcgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14372RecHayAny = GXt_char2 ;
         if ( (GXutil.strcmp("", AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A14372RecHayAny) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2804RecLinMaq, 4, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2805RecVolPrd, 5, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A189BarNumAny, 3, 0) , GXutil.padr( "%" + AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV52count = 0 ;
            while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09HJ7_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P09HJ7_A602MaqCod[0], A602MaqCod) == 0 ) )
            {
               brk9HJ11 = false ;
               A2804RecLinMaq = P09HJ7_A2804RecLinMaq[0] ;
               A130BarCodPar = P09HJ7_A130BarCodPar[0] ;
               A132BarCodReo = P09HJ7_A132BarCodReo[0] ;
               A129BarCod = P09HJ7_A129BarCod[0] ;
               AV52count = (long)(AV52count+1) ;
               brk9HJ11 = true ;
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
         }
         if ( ! brk9HJ11 )
         {
            brk9HJ11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = recetadetinte_cierre2_wcgetfilterdata.this.AV46OptionsJson;
      this.aP4[0] = recetadetinte_cierre2_wcgetfilterdata.this.AV49OptionsDescJson;
      this.aP5[0] = recetadetinte_cierre2_wcgetfilterdata.this.AV51OptionIndexesJson;
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
      AV36TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV59Emprcod = "" ;
      AV62Barcodpar = "" ;
      AV63FechaCierre = GXutil.nullDate() ;
      AV64RecAcab = "" ;
      A13696BarNHdr = "" ;
      AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = "" ;
      AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = "" ;
      AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = "" ;
      AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = "" ;
      AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = "" ;
      AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = "" ;
      AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = "" ;
      AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = "" ;
      AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = "" ;
      AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = "" ;
      AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = "" ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = "" ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = "" ;
      AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      lV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = "" ;
      lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = "" ;
      lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = "" ;
      lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = "" ;
      lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = "" ;
      lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A602MaqCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A14372RecHayAny = "" ;
      A6039RecAcab = "" ;
      A396EmprCod = "" ;
      P09HJ2_A4700RecEnvio = new byte[1] ;
      P09HJ2_A6039RecAcab = new String[] {""} ;
      P09HJ2_n6039RecAcab = new boolean[] {false} ;
      P09HJ2_A189BarNumAny = new short[1] ;
      P09HJ2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09HJ2_n4866RecFecAlt = new boolean[] {false} ;
      P09HJ2_A2805RecVolPrd = new int[1] ;
      P09HJ2_A602MaqCod = new String[] {""} ;
      P09HJ2_A1235BarNumCli = new int[1] ;
      P09HJ2_A1234BarNomCli = new String[] {""} ;
      P09HJ2_A218BarTipCol = new byte[1] ;
      P09HJ2_A136BarColNum = new int[1] ;
      P09HJ2_A135BarColNom = new String[] {""} ;
      P09HJ2_A1652BarSerDsc = new String[] {""} ;
      P09HJ2_A212BarSer = new String[] {""} ;
      P09HJ2_A213BarSit = new byte[1] ;
      P09HJ2_A13696BarNHdr = new String[] {""} ;
      P09HJ2_A2804RecLinMaq = new short[1] ;
      P09HJ2_A130BarCodPar = new String[] {""} ;
      P09HJ2_A132BarCodReo = new byte[1] ;
      P09HJ2_A129BarCod = new int[1] ;
      P09HJ2_A396EmprCod = new String[] {""} ;
      AV44Option = "" ;
      P09HJ3_A212BarSer = new String[] {""} ;
      P09HJ3_A4700RecEnvio = new byte[1] ;
      P09HJ3_A6039RecAcab = new String[] {""} ;
      P09HJ3_n6039RecAcab = new boolean[] {false} ;
      P09HJ3_A189BarNumAny = new short[1] ;
      P09HJ3_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09HJ3_n4866RecFecAlt = new boolean[] {false} ;
      P09HJ3_A2805RecVolPrd = new int[1] ;
      P09HJ3_A602MaqCod = new String[] {""} ;
      P09HJ3_A1235BarNumCli = new int[1] ;
      P09HJ3_A1234BarNomCli = new String[] {""} ;
      P09HJ3_A218BarTipCol = new byte[1] ;
      P09HJ3_A136BarColNum = new int[1] ;
      P09HJ3_A135BarColNom = new String[] {""} ;
      P09HJ3_A1652BarSerDsc = new String[] {""} ;
      P09HJ3_A213BarSit = new byte[1] ;
      P09HJ3_A13696BarNHdr = new String[] {""} ;
      P09HJ3_A2804RecLinMaq = new short[1] ;
      P09HJ3_A130BarCodPar = new String[] {""} ;
      P09HJ3_A132BarCodReo = new byte[1] ;
      P09HJ3_A129BarCod = new int[1] ;
      P09HJ3_A396EmprCod = new String[] {""} ;
      P09HJ4_A1652BarSerDsc = new String[] {""} ;
      P09HJ4_A4700RecEnvio = new byte[1] ;
      P09HJ4_A6039RecAcab = new String[] {""} ;
      P09HJ4_n6039RecAcab = new boolean[] {false} ;
      P09HJ4_A189BarNumAny = new short[1] ;
      P09HJ4_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09HJ4_n4866RecFecAlt = new boolean[] {false} ;
      P09HJ4_A2805RecVolPrd = new int[1] ;
      P09HJ4_A602MaqCod = new String[] {""} ;
      P09HJ4_A1235BarNumCli = new int[1] ;
      P09HJ4_A1234BarNomCli = new String[] {""} ;
      P09HJ4_A218BarTipCol = new byte[1] ;
      P09HJ4_A136BarColNum = new int[1] ;
      P09HJ4_A135BarColNom = new String[] {""} ;
      P09HJ4_A212BarSer = new String[] {""} ;
      P09HJ4_A213BarSit = new byte[1] ;
      P09HJ4_A13696BarNHdr = new String[] {""} ;
      P09HJ4_A2804RecLinMaq = new short[1] ;
      P09HJ4_A130BarCodPar = new String[] {""} ;
      P09HJ4_A132BarCodReo = new byte[1] ;
      P09HJ4_A129BarCod = new int[1] ;
      P09HJ4_A396EmprCod = new String[] {""} ;
      P09HJ5_A135BarColNom = new String[] {""} ;
      P09HJ5_A4700RecEnvio = new byte[1] ;
      P09HJ5_A6039RecAcab = new String[] {""} ;
      P09HJ5_n6039RecAcab = new boolean[] {false} ;
      P09HJ5_A189BarNumAny = new short[1] ;
      P09HJ5_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09HJ5_n4866RecFecAlt = new boolean[] {false} ;
      P09HJ5_A2805RecVolPrd = new int[1] ;
      P09HJ5_A602MaqCod = new String[] {""} ;
      P09HJ5_A1235BarNumCli = new int[1] ;
      P09HJ5_A1234BarNomCli = new String[] {""} ;
      P09HJ5_A218BarTipCol = new byte[1] ;
      P09HJ5_A136BarColNum = new int[1] ;
      P09HJ5_A1652BarSerDsc = new String[] {""} ;
      P09HJ5_A212BarSer = new String[] {""} ;
      P09HJ5_A213BarSit = new byte[1] ;
      P09HJ5_A13696BarNHdr = new String[] {""} ;
      P09HJ5_A2804RecLinMaq = new short[1] ;
      P09HJ5_A130BarCodPar = new String[] {""} ;
      P09HJ5_A132BarCodReo = new byte[1] ;
      P09HJ5_A129BarCod = new int[1] ;
      P09HJ5_A396EmprCod = new String[] {""} ;
      P09HJ6_A1234BarNomCli = new String[] {""} ;
      P09HJ6_A4700RecEnvio = new byte[1] ;
      P09HJ6_A6039RecAcab = new String[] {""} ;
      P09HJ6_n6039RecAcab = new boolean[] {false} ;
      P09HJ6_A189BarNumAny = new short[1] ;
      P09HJ6_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09HJ6_n4866RecFecAlt = new boolean[] {false} ;
      P09HJ6_A2805RecVolPrd = new int[1] ;
      P09HJ6_A602MaqCod = new String[] {""} ;
      P09HJ6_A1235BarNumCli = new int[1] ;
      P09HJ6_A218BarTipCol = new byte[1] ;
      P09HJ6_A136BarColNum = new int[1] ;
      P09HJ6_A135BarColNom = new String[] {""} ;
      P09HJ6_A1652BarSerDsc = new String[] {""} ;
      P09HJ6_A212BarSer = new String[] {""} ;
      P09HJ6_A213BarSit = new byte[1] ;
      P09HJ6_A13696BarNHdr = new String[] {""} ;
      P09HJ6_A2804RecLinMaq = new short[1] ;
      P09HJ6_A130BarCodPar = new String[] {""} ;
      P09HJ6_A132BarCodReo = new byte[1] ;
      P09HJ6_A129BarCod = new int[1] ;
      P09HJ6_A396EmprCod = new String[] {""} ;
      P09HJ7_A602MaqCod = new String[] {""} ;
      P09HJ7_A4700RecEnvio = new byte[1] ;
      P09HJ7_A6039RecAcab = new String[] {""} ;
      P09HJ7_n6039RecAcab = new boolean[] {false} ;
      P09HJ7_A189BarNumAny = new short[1] ;
      P09HJ7_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09HJ7_n4866RecFecAlt = new boolean[] {false} ;
      P09HJ7_A2805RecVolPrd = new int[1] ;
      P09HJ7_A1235BarNumCli = new int[1] ;
      P09HJ7_A1234BarNomCli = new String[] {""} ;
      P09HJ7_A218BarTipCol = new byte[1] ;
      P09HJ7_A136BarColNum = new int[1] ;
      P09HJ7_A135BarColNom = new String[] {""} ;
      P09HJ7_A1652BarSerDsc = new String[] {""} ;
      P09HJ7_A212BarSer = new String[] {""} ;
      P09HJ7_A213BarSit = new byte[1] ;
      P09HJ7_A13696BarNHdr = new String[] {""} ;
      P09HJ7_A2804RecLinMaq = new short[1] ;
      P09HJ7_A130BarCodPar = new String[] {""} ;
      P09HJ7_A132BarCodReo = new byte[1] ;
      P09HJ7_A129BarCod = new int[1] ;
      P09HJ7_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_cierre2_wcgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09HJ2_A4700RecEnvio, P09HJ2_A6039RecAcab, P09HJ2_n6039RecAcab, P09HJ2_A189BarNumAny, P09HJ2_A4866RecFecAlt, P09HJ2_n4866RecFecAlt, P09HJ2_A2805RecVolPrd, P09HJ2_A602MaqCod, P09HJ2_A1235BarNumCli, P09HJ2_A1234BarNomCli,
            P09HJ2_A218BarTipCol, P09HJ2_A136BarColNum, P09HJ2_A135BarColNom, P09HJ2_A1652BarSerDsc, P09HJ2_A212BarSer, P09HJ2_A213BarSit, P09HJ2_A13696BarNHdr, P09HJ2_A2804RecLinMaq, P09HJ2_A130BarCodPar, P09HJ2_A132BarCodReo,
            P09HJ2_A129BarCod, P09HJ2_A396EmprCod
            }
            , new Object[] {
            P09HJ3_A212BarSer, P09HJ3_A4700RecEnvio, P09HJ3_A6039RecAcab, P09HJ3_n6039RecAcab, P09HJ3_A189BarNumAny, P09HJ3_A4866RecFecAlt, P09HJ3_n4866RecFecAlt, P09HJ3_A2805RecVolPrd, P09HJ3_A602MaqCod, P09HJ3_A1235BarNumCli,
            P09HJ3_A1234BarNomCli, P09HJ3_A218BarTipCol, P09HJ3_A136BarColNum, P09HJ3_A135BarColNom, P09HJ3_A1652BarSerDsc, P09HJ3_A213BarSit, P09HJ3_A13696BarNHdr, P09HJ3_A2804RecLinMaq, P09HJ3_A130BarCodPar, P09HJ3_A132BarCodReo,
            P09HJ3_A129BarCod, P09HJ3_A396EmprCod
            }
            , new Object[] {
            P09HJ4_A1652BarSerDsc, P09HJ4_A4700RecEnvio, P09HJ4_A6039RecAcab, P09HJ4_n6039RecAcab, P09HJ4_A189BarNumAny, P09HJ4_A4866RecFecAlt, P09HJ4_n4866RecFecAlt, P09HJ4_A2805RecVolPrd, P09HJ4_A602MaqCod, P09HJ4_A1235BarNumCli,
            P09HJ4_A1234BarNomCli, P09HJ4_A218BarTipCol, P09HJ4_A136BarColNum, P09HJ4_A135BarColNom, P09HJ4_A212BarSer, P09HJ4_A213BarSit, P09HJ4_A13696BarNHdr, P09HJ4_A2804RecLinMaq, P09HJ4_A130BarCodPar, P09HJ4_A132BarCodReo,
            P09HJ4_A129BarCod, P09HJ4_A396EmprCod
            }
            , new Object[] {
            P09HJ5_A135BarColNom, P09HJ5_A4700RecEnvio, P09HJ5_A6039RecAcab, P09HJ5_n6039RecAcab, P09HJ5_A189BarNumAny, P09HJ5_A4866RecFecAlt, P09HJ5_n4866RecFecAlt, P09HJ5_A2805RecVolPrd, P09HJ5_A602MaqCod, P09HJ5_A1235BarNumCli,
            P09HJ5_A1234BarNomCli, P09HJ5_A218BarTipCol, P09HJ5_A136BarColNum, P09HJ5_A1652BarSerDsc, P09HJ5_A212BarSer, P09HJ5_A213BarSit, P09HJ5_A13696BarNHdr, P09HJ5_A2804RecLinMaq, P09HJ5_A130BarCodPar, P09HJ5_A132BarCodReo,
            P09HJ5_A129BarCod, P09HJ5_A396EmprCod
            }
            , new Object[] {
            P09HJ6_A1234BarNomCli, P09HJ6_A4700RecEnvio, P09HJ6_A6039RecAcab, P09HJ6_n6039RecAcab, P09HJ6_A189BarNumAny, P09HJ6_A4866RecFecAlt, P09HJ6_n4866RecFecAlt, P09HJ6_A2805RecVolPrd, P09HJ6_A602MaqCod, P09HJ6_A1235BarNumCli,
            P09HJ6_A218BarTipCol, P09HJ6_A136BarColNum, P09HJ6_A135BarColNom, P09HJ6_A1652BarSerDsc, P09HJ6_A212BarSer, P09HJ6_A213BarSit, P09HJ6_A13696BarNHdr, P09HJ6_A2804RecLinMaq, P09HJ6_A130BarCodPar, P09HJ6_A132BarCodReo,
            P09HJ6_A129BarCod, P09HJ6_A396EmprCod
            }
            , new Object[] {
            P09HJ7_A602MaqCod, P09HJ7_A4700RecEnvio, P09HJ7_A6039RecAcab, P09HJ7_n6039RecAcab, P09HJ7_A189BarNumAny, P09HJ7_A4866RecFecAlt, P09HJ7_n4866RecFecAlt, P09HJ7_A2805RecVolPrd, P09HJ7_A1235BarNumCli, P09HJ7_A1234BarNomCli,
            P09HJ7_A218BarTipCol, P09HJ7_A136BarColNum, P09HJ7_A135BarColNom, P09HJ7_A1652BarSerDsc, P09HJ7_A212BarSer, P09HJ7_A213BarSit, P09HJ7_A13696BarNHdr, P09HJ7_A2804RecLinMaq, P09HJ7_A130BarCodPar, P09HJ7_A132BarCodReo,
            P09HJ7_A129BarCod, P09HJ7_A396EmprCod
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
   private byte AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ;
   private byte AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ;
   private byte AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ;
   private byte AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte A4700RecEnvio ;
   private short AV12TFRecLinMaq ;
   private short AV13TFRecLinMaq_To ;
   private short AV38TFBarNumAny ;
   private short AV39TFBarNumAny_To ;
   private short AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ;
   private short AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ;
   private short AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ;
   private short AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ;
   private short A2804RecLinMaq ;
   private short A189BarNumAny ;
   private short Gx_err ;
   private int AV71GXV1 ;
   private int AV22TFBarColNum ;
   private int AV23TFBarColNum_To ;
   private int AV28TFBarNumCli ;
   private int AV29TFBarNumCli_To ;
   private int AV32TFRecVolPrd ;
   private int AV33TFRecVolPrd_To ;
   private int AV60Barcod ;
   private int AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ;
   private int AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ;
   private int AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ;
   private int AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ;
   private int AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ;
   private int AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int AV43InsertIndex ;
   private long AV52count ;
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
   private String AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ;
   private String AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ;
   private String AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ;
   private String AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ;
   private String AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ;
   private String AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ;
   private String AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ;
   private String AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ;
   private String AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ;
   private String AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ;
   private String AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ;
   private String AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ;
   private String scmdbuf ;
   private String lV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ;
   private String lV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ;
   private String lV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ;
   private String lV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ;
   private String lV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ;
   private String lV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A602MaqCod ;
   private String A14372RecHayAny ;
   private String A6039RecAcab ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV36TFRecFecAlt ;
   private java.util.Date AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV63FechaCierre ;
   private boolean returnInSub ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean brk9HJ3 ;
   private boolean brk9HJ5 ;
   private boolean brk9HJ7 ;
   private boolean brk9HJ9 ;
   private boolean brk9HJ11 ;
   private String AV46OptionsJson ;
   private String AV49OptionsDescJson ;
   private String AV51OptionIndexesJson ;
   private String AV42DDOName ;
   private String AV40SearchTxt ;
   private String AV41SearchTxtTo ;
   private String AV58FilterFullText ;
   private String AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ;
   private String lV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ;
   private String AV44Option ;
   private com.genexus.webpanels.WebSession AV53Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private byte[] P09HJ2_A4700RecEnvio ;
   private String[] P09HJ2_A6039RecAcab ;
   private boolean[] P09HJ2_n6039RecAcab ;
   private short[] P09HJ2_A189BarNumAny ;
   private java.util.Date[] P09HJ2_A4866RecFecAlt ;
   private boolean[] P09HJ2_n4866RecFecAlt ;
   private int[] P09HJ2_A2805RecVolPrd ;
   private String[] P09HJ2_A602MaqCod ;
   private int[] P09HJ2_A1235BarNumCli ;
   private String[] P09HJ2_A1234BarNomCli ;
   private byte[] P09HJ2_A218BarTipCol ;
   private int[] P09HJ2_A136BarColNum ;
   private String[] P09HJ2_A135BarColNom ;
   private String[] P09HJ2_A1652BarSerDsc ;
   private String[] P09HJ2_A212BarSer ;
   private byte[] P09HJ2_A213BarSit ;
   private String[] P09HJ2_A13696BarNHdr ;
   private short[] P09HJ2_A2804RecLinMaq ;
   private String[] P09HJ2_A130BarCodPar ;
   private byte[] P09HJ2_A132BarCodReo ;
   private int[] P09HJ2_A129BarCod ;
   private String[] P09HJ2_A396EmprCod ;
   private String[] P09HJ3_A212BarSer ;
   private byte[] P09HJ3_A4700RecEnvio ;
   private String[] P09HJ3_A6039RecAcab ;
   private boolean[] P09HJ3_n6039RecAcab ;
   private short[] P09HJ3_A189BarNumAny ;
   private java.util.Date[] P09HJ3_A4866RecFecAlt ;
   private boolean[] P09HJ3_n4866RecFecAlt ;
   private int[] P09HJ3_A2805RecVolPrd ;
   private String[] P09HJ3_A602MaqCod ;
   private int[] P09HJ3_A1235BarNumCli ;
   private String[] P09HJ3_A1234BarNomCli ;
   private byte[] P09HJ3_A218BarTipCol ;
   private int[] P09HJ3_A136BarColNum ;
   private String[] P09HJ3_A135BarColNom ;
   private String[] P09HJ3_A1652BarSerDsc ;
   private byte[] P09HJ3_A213BarSit ;
   private String[] P09HJ3_A13696BarNHdr ;
   private short[] P09HJ3_A2804RecLinMaq ;
   private String[] P09HJ3_A130BarCodPar ;
   private byte[] P09HJ3_A132BarCodReo ;
   private int[] P09HJ3_A129BarCod ;
   private String[] P09HJ3_A396EmprCod ;
   private String[] P09HJ4_A1652BarSerDsc ;
   private byte[] P09HJ4_A4700RecEnvio ;
   private String[] P09HJ4_A6039RecAcab ;
   private boolean[] P09HJ4_n6039RecAcab ;
   private short[] P09HJ4_A189BarNumAny ;
   private java.util.Date[] P09HJ4_A4866RecFecAlt ;
   private boolean[] P09HJ4_n4866RecFecAlt ;
   private int[] P09HJ4_A2805RecVolPrd ;
   private String[] P09HJ4_A602MaqCod ;
   private int[] P09HJ4_A1235BarNumCli ;
   private String[] P09HJ4_A1234BarNomCli ;
   private byte[] P09HJ4_A218BarTipCol ;
   private int[] P09HJ4_A136BarColNum ;
   private String[] P09HJ4_A135BarColNom ;
   private String[] P09HJ4_A212BarSer ;
   private byte[] P09HJ4_A213BarSit ;
   private String[] P09HJ4_A13696BarNHdr ;
   private short[] P09HJ4_A2804RecLinMaq ;
   private String[] P09HJ4_A130BarCodPar ;
   private byte[] P09HJ4_A132BarCodReo ;
   private int[] P09HJ4_A129BarCod ;
   private String[] P09HJ4_A396EmprCod ;
   private String[] P09HJ5_A135BarColNom ;
   private byte[] P09HJ5_A4700RecEnvio ;
   private String[] P09HJ5_A6039RecAcab ;
   private boolean[] P09HJ5_n6039RecAcab ;
   private short[] P09HJ5_A189BarNumAny ;
   private java.util.Date[] P09HJ5_A4866RecFecAlt ;
   private boolean[] P09HJ5_n4866RecFecAlt ;
   private int[] P09HJ5_A2805RecVolPrd ;
   private String[] P09HJ5_A602MaqCod ;
   private int[] P09HJ5_A1235BarNumCli ;
   private String[] P09HJ5_A1234BarNomCli ;
   private byte[] P09HJ5_A218BarTipCol ;
   private int[] P09HJ5_A136BarColNum ;
   private String[] P09HJ5_A1652BarSerDsc ;
   private String[] P09HJ5_A212BarSer ;
   private byte[] P09HJ5_A213BarSit ;
   private String[] P09HJ5_A13696BarNHdr ;
   private short[] P09HJ5_A2804RecLinMaq ;
   private String[] P09HJ5_A130BarCodPar ;
   private byte[] P09HJ5_A132BarCodReo ;
   private int[] P09HJ5_A129BarCod ;
   private String[] P09HJ5_A396EmprCod ;
   private String[] P09HJ6_A1234BarNomCli ;
   private byte[] P09HJ6_A4700RecEnvio ;
   private String[] P09HJ6_A6039RecAcab ;
   private boolean[] P09HJ6_n6039RecAcab ;
   private short[] P09HJ6_A189BarNumAny ;
   private java.util.Date[] P09HJ6_A4866RecFecAlt ;
   private boolean[] P09HJ6_n4866RecFecAlt ;
   private int[] P09HJ6_A2805RecVolPrd ;
   private String[] P09HJ6_A602MaqCod ;
   private int[] P09HJ6_A1235BarNumCli ;
   private byte[] P09HJ6_A218BarTipCol ;
   private int[] P09HJ6_A136BarColNum ;
   private String[] P09HJ6_A135BarColNom ;
   private String[] P09HJ6_A1652BarSerDsc ;
   private String[] P09HJ6_A212BarSer ;
   private byte[] P09HJ6_A213BarSit ;
   private String[] P09HJ6_A13696BarNHdr ;
   private short[] P09HJ6_A2804RecLinMaq ;
   private String[] P09HJ6_A130BarCodPar ;
   private byte[] P09HJ6_A132BarCodReo ;
   private int[] P09HJ6_A129BarCod ;
   private String[] P09HJ6_A396EmprCod ;
   private String[] P09HJ7_A602MaqCod ;
   private byte[] P09HJ7_A4700RecEnvio ;
   private String[] P09HJ7_A6039RecAcab ;
   private boolean[] P09HJ7_n6039RecAcab ;
   private short[] P09HJ7_A189BarNumAny ;
   private java.util.Date[] P09HJ7_A4866RecFecAlt ;
   private boolean[] P09HJ7_n4866RecFecAlt ;
   private int[] P09HJ7_A2805RecVolPrd ;
   private int[] P09HJ7_A1235BarNumCli ;
   private String[] P09HJ7_A1234BarNomCli ;
   private byte[] P09HJ7_A218BarTipCol ;
   private int[] P09HJ7_A136BarColNum ;
   private String[] P09HJ7_A135BarColNom ;
   private String[] P09HJ7_A1652BarSerDsc ;
   private String[] P09HJ7_A212BarSer ;
   private byte[] P09HJ7_A213BarSit ;
   private String[] P09HJ7_A13696BarNHdr ;
   private short[] P09HJ7_A2804RecLinMaq ;
   private String[] P09HJ7_A130BarCodPar ;
   private byte[] P09HJ7_A132BarCodReo ;
   private int[] P09HJ7_A129BarCod ;
   private String[] P09HJ7_A396EmprCod ;
   private GXSimpleCollection<String> AV45Options ;
   private GXSimpleCollection<String> AV48OptionsDesc ;
   private GXSimpleCollection<String> AV50OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV55GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV56GridStateFilterValue ;
}

final  class recetadetinte_cierre2_wcgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09HJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                          String AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                          short AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ,
                                          short AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ,
                                          byte AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ,
                                          byte AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ,
                                          String AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                          String AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                          String AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                          String AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                          String AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                          String AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                          int AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ,
                                          int AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ,
                                          byte AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ,
                                          byte AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ,
                                          String AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                          String AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                          int AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ,
                                          int AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ,
                                          String AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                          String AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                          int AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ,
                                          int AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                          short AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ,
                                          short AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ,
                                          int AV60Barcod ,
                                          byte AV61Barcodreo ,
                                          String AV62Barcodpar ,
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
                                          String AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                          String A14372RecHayAny ,
                                          String A13696BarNHdr ,
                                          String A6039RecAcab ,
                                          byte A4700RecEnvio ,
                                          String AV59Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[31];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.RecEnvio, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      scmdbuf += " T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab <> 'S')");
      addWhere(sWhereString, "(T1.RecEnvio > 0)");
      if ( (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (0==AV60Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! (0==AV61Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09HJ3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                          String AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                          short AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ,
                                          short AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ,
                                          byte AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ,
                                          byte AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ,
                                          String AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                          String AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                          String AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                          String AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                          String AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                          String AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                          int AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ,
                                          int AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ,
                                          byte AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ,
                                          byte AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ,
                                          String AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                          String AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                          int AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ,
                                          int AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ,
                                          String AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                          String AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                          int AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ,
                                          int AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                          short AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ,
                                          short AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ,
                                          int AV60Barcod ,
                                          byte AV61Barcodreo ,
                                          String AV62Barcodpar ,
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
                                          String AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                          String A14372RecHayAny ,
                                          String A13696BarNHdr ,
                                          String A6039RecAcab ,
                                          byte A4700RecEnvio ,
                                          String A396EmprCod ,
                                          String AV59Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[31];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.BarSer, T1.RecEnvio, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSerDsc, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS" ;
      scmdbuf += " BarNHdr, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab <> 'S')");
      addWhere(sWhereString, "(T1.RecEnvio > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV60Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV61Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09HJ4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                          String AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                          short AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ,
                                          short AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ,
                                          byte AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ,
                                          byte AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ,
                                          String AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                          String AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                          String AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                          String AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                          String AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                          String AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                          int AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ,
                                          int AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ,
                                          byte AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ,
                                          byte AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ,
                                          String AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                          String AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                          int AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ,
                                          int AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ,
                                          String AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                          String AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                          int AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ,
                                          int AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                          short AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ,
                                          short AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ,
                                          int AV60Barcod ,
                                          byte AV61Barcodreo ,
                                          String AV62Barcodpar ,
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
                                          String AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                          String A14372RecHayAny ,
                                          String A13696BarNHdr ,
                                          String A6039RecAcab ,
                                          byte A4700RecEnvio ,
                                          String A396EmprCod ,
                                          String AV59Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[31];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T2.BarSerDsc, T1.RecEnvio, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom," ;
      scmdbuf += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      scmdbuf += " T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab <> 'S')");
      addWhere(sWhereString, "(T1.RecEnvio > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV60Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV61Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09HJ5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                          String AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                          short AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ,
                                          short AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ,
                                          byte AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ,
                                          byte AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ,
                                          String AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                          String AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                          String AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                          String AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                          String AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                          String AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                          int AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ,
                                          int AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ,
                                          byte AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ,
                                          byte AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ,
                                          String AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                          String AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                          int AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ,
                                          int AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ,
                                          String AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                          String AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                          int AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ,
                                          int AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                          short AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ,
                                          short AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ,
                                          int AV60Barcod ,
                                          byte AV61Barcodreo ,
                                          String AV62Barcodpar ,
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
                                          String AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                          String A14372RecHayAny ,
                                          String A13696BarNHdr ,
                                          String A6039RecAcab ,
                                          byte A4700RecEnvio ,
                                          String A396EmprCod ,
                                          String AV59Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[31];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T2.BarColNom, T1.RecEnvio, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      scmdbuf += " T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab <> 'S')");
      addWhere(sWhereString, "(T1.RecEnvio > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV60Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV61Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P09HJ6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                          String AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                          short AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ,
                                          short AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ,
                                          byte AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ,
                                          byte AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ,
                                          String AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                          String AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                          String AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                          String AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                          String AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                          String AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                          int AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ,
                                          int AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ,
                                          byte AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ,
                                          byte AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ,
                                          String AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                          String AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                          int AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ,
                                          int AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ,
                                          String AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                          String AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                          int AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ,
                                          int AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                          short AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ,
                                          short AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ,
                                          int AV60Barcod ,
                                          byte AV61Barcodreo ,
                                          String AV62Barcodpar ,
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
                                          String AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                          String A14372RecHayAny ,
                                          String A13696BarNHdr ,
                                          String A6039RecAcab ,
                                          byte A4700RecEnvio ,
                                          String A396EmprCod ,
                                          String AV59Emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[31];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T2.BarNomCli, T1.RecEnvio, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      scmdbuf += " T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.RecAcab <> 'S')");
      addWhere(sWhereString, "(T1.RecEnvio > 0)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (0==AV60Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! (0==AV61Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarNomCli" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P09HJ7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                          String AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                          short AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ,
                                          short AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ,
                                          byte AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ,
                                          byte AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ,
                                          String AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                          String AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                          String AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                          String AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                          String AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                          String AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                          int AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ,
                                          int AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ,
                                          byte AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ,
                                          byte AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ,
                                          String AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                          String AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                          int AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ,
                                          int AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ,
                                          String AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                          String AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                          int AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ,
                                          int AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                          short AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ,
                                          short AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ,
                                          int AV60Barcod ,
                                          byte AV61Barcodreo ,
                                          String AV62Barcodpar ,
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
                                          String AV73Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                          String A14372RecHayAny ,
                                          String A13696BarNHdr ,
                                          String A6039RecAcab ,
                                          byte A4700RecEnvio ,
                                          String AV59Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[31];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.MaqCod, T1.RecEnvio, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      scmdbuf += " T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab <> 'S')");
      addWhere(sWhereString, "(T1.RecEnvio > 0)");
      if ( (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV78Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (0==AV79Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV80Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV82Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV86Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV92Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV93Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV96Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV98Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV60Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV61Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod" ;
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
                  return conditional_P09HJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 1 :
                  return conditional_P09HJ3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 2 :
                  return conditional_P09HJ4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 3 :
                  return conditional_P09HJ5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 4 :
                  return conditional_P09HJ6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
            case 5 :
                  return conditional_P09HJ7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09HJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HJ3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HJ4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HJ5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HJ6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09HJ7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 1);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 3);
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
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               return;
      }
   }

}

