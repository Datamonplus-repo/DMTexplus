package app.produccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class test_v01getfilterdata extends GXProcedure
{
   public test_v01getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( test_v01getfilterdata.class ), "" );
   }

   public test_v01getfilterdata( int remoteHandle ,
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
      test_v01getfilterdata.this.aP5 = new String[] {""};
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
      test_v01getfilterdata.this.AV41DDOName = aP0;
      test_v01getfilterdata.this.AV42SearchTxt = aP1;
      test_v01getfilterdata.this.AV43SearchTxtTo = aP2;
      test_v01getfilterdata.this.aP3 = aP3;
      test_v01getfilterdata.this.aP4 = aP4;
      test_v01getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV33OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_BARCODPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCODPAROPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_BARDISNUM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARDISNUMOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_CLINOM") == 0 )
      {
         /* Execute user subroutine: 'LOADCLINOMOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV41DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV44OptionsJson = AV31Options.toJSonString(false) ;
      AV45OptionsDescJson = AV33OptionsDesc.toJSonString(false) ;
      AV46OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue("Produccion.Test_v01GridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.Test_v01GridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV36Session.getValue("Produccion.Test_v01GridState"), null, null);
      }
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV1));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV10TFBarCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV12TFBarCodReo = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFBarCodReo_To = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV14TFBarCodPar = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV15TFBarCodPar_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISNUM") == 0 )
         {
            AV16TFBarDisNum = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISNUM_SEL") == 0 )
         {
            AV17TFBarDisNum_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV18TFCliCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFCliCod_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV20TFCliNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV21TFCliNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV22TFBarSer = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV23TFBarSer_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV24TFBarSerDsc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV25TFBarSerDsc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV57TFBarColNom = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV58TFBarColNom_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV59TFBarColNum = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFBarColNum_To = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV61TFBarNomCli = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV62TFBarNomCli_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV26TFBarSit = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFBarSit_To = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV28TFBarFecGen = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV54TFBarFecCli = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV67TFBarFecFpr = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV56TFBarFecSal = localUtil.ctod( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV100GXV1 = (int)(AV100GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarCodPar = AV42SearchTxt ;
      AV15TFBarCodPar_Sel = "" ;
      AV102Produccion_test_v01ds_1_tfbarcod = AV10TFBarCod ;
      AV103Produccion_test_v01ds_2_tfbarcod_to = AV11TFBarCod_To ;
      AV104Produccion_test_v01ds_3_tfbarcodreo = AV12TFBarCodReo ;
      AV105Produccion_test_v01ds_4_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV106Produccion_test_v01ds_5_tfbarcodpar = AV14TFBarCodPar ;
      AV107Produccion_test_v01ds_6_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV108Produccion_test_v01ds_7_tfbardisnum = AV16TFBarDisNum ;
      AV109Produccion_test_v01ds_8_tfbardisnum_sel = AV17TFBarDisNum_Sel ;
      AV110Produccion_test_v01ds_9_tfclicod = AV18TFCliCod ;
      AV111Produccion_test_v01ds_10_tfclicod_to = AV19TFCliCod_To ;
      AV112Produccion_test_v01ds_11_tfclinom = AV20TFCliNom ;
      AV113Produccion_test_v01ds_12_tfclinom_sel = AV21TFCliNom_Sel ;
      AV114Produccion_test_v01ds_13_tfbarser = AV22TFBarSer ;
      AV115Produccion_test_v01ds_14_tfbarser_sel = AV23TFBarSer_Sel ;
      AV116Produccion_test_v01ds_15_tfbarserdsc = AV24TFBarSerDsc ;
      AV117Produccion_test_v01ds_16_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV118Produccion_test_v01ds_17_tfbarcolnom = AV57TFBarColNom ;
      AV119Produccion_test_v01ds_18_tfbarcolnom_sel = AV58TFBarColNom_Sel ;
      AV120Produccion_test_v01ds_19_tfbarcolnum = AV59TFBarColNum ;
      AV121Produccion_test_v01ds_20_tfbarcolnum_to = AV60TFBarColNum_To ;
      AV122Produccion_test_v01ds_21_tfbarnomcli = AV61TFBarNomCli ;
      AV123Produccion_test_v01ds_22_tfbarnomcli_sel = AV62TFBarNomCli_Sel ;
      AV124Produccion_test_v01ds_23_tfbarsit = AV26TFBarSit ;
      AV125Produccion_test_v01ds_24_tfbarsit_to = AV27TFBarSit_To ;
      AV126Produccion_test_v01ds_25_tfbarfecgen = AV28TFBarFecGen ;
      AV127Produccion_test_v01ds_26_tfbarfeccli = AV54TFBarFecCli ;
      AV128Produccion_test_v01ds_27_tfbarfecfpr = AV67TFBarFecFpr ;
      AV129Produccion_test_v01ds_28_tfbarfecsal = AV56TFBarFecSal ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod) ,
                                           Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to) ,
                                           AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                           AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           AV108Produccion_test_v01ds_7_tfbardisnum ,
                                           Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod) ,
                                           Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to) ,
                                           AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                           AV112Produccion_test_v01ds_11_tfclinom ,
                                           AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                           AV114Produccion_test_v01ds_13_tfbarser ,
                                           AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                           AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to) ,
                                           AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit) ,
                                           Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to) ,
                                           AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                           AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                           AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                           AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV50CliCod) ,
                                           Integer.valueOf(AV51CliCodTo) ,
                                           AV63bardisnum ,
                                           AV65BarDisNumTo ,
                                           AV52BarFecGen ,
                                           AV53BarFecGenTo ,
                                           AV64BarFecCli ,
                                           AV66barfecclito ,
                                           AV68barfecsal ,
                                           AV69barfecsalto ,
                                           AV70BarFecFpr ,
                                           AV71barfecfprto ,
                                           AV72BarColNom ,
                                           AV76BarColNomto ,
                                           Integer.valueOf(AV73BarColnum) ,
                                           Integer.valueOf(AV77BarColNumto) ,
                                           AV74BarNomCli ,
                                           AV78BarNomClito ,
                                           Integer.valueOf(AV75BarNumCli) ,
                                           Integer.valueOf(AV79Barnumclito) ,
                                           Integer.valueOf(AV80BarCod) ,
                                           Integer.valueOf(AV84BarCodto) ,
                                           Byte.valueOf(AV81BarCodreo) ,
                                           Byte.valueOf(AV85BarCodreoto) ,
                                           AV82BarCodpar ,
                                           AV86BarCodparto ,
                                           AV83Cod_idtx ,
                                           AV87BarGirar ,
                                           Short.valueOf(AV94BarTipArt) ,
                                           Short.valueOf(AV95BarTipArtto) ,
                                           AV96BarSer ,
                                           AV97BarSerto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Byte.valueOf(AV48BarSit) ,
                                           Byte.valueOf(AV49BarSitTo) ,
                                           A396EmprCod ,
                                           AV47EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Produccion_test_v01ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV106Produccion_test_v01ds_5_tfbarcodpar), 1, "%") ;
      lV108Produccion_test_v01ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV108Produccion_test_v01ds_7_tfbardisnum), 8, "%") ;
      lV112Produccion_test_v01ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV112Produccion_test_v01ds_11_tfclinom), 30, "%") ;
      lV114Produccion_test_v01ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV114Produccion_test_v01ds_13_tfbarser), 16, "%") ;
      lV116Produccion_test_v01ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV116Produccion_test_v01ds_15_tfbarserdsc), 26, "%") ;
      lV118Produccion_test_v01ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV118Produccion_test_v01ds_17_tfbarcolnom), 13, "%") ;
      lV122Produccion_test_v01ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV122Produccion_test_v01ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor P0ACL2 */
      pr_default.execute(0, new Object[] {Byte.valueOf(AV48BarSit), Byte.valueOf(AV49BarSitTo), AV47EmprCod, Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod), Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to), Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo), Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to), lV106Produccion_test_v01ds_5_tfbarcodpar, AV107Produccion_test_v01ds_6_tfbarcodpar_sel, lV108Produccion_test_v01ds_7_tfbardisnum, AV109Produccion_test_v01ds_8_tfbardisnum_sel, Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod), Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to), lV112Produccion_test_v01ds_11_tfclinom, AV113Produccion_test_v01ds_12_tfclinom_sel, lV114Produccion_test_v01ds_13_tfbarser, AV115Produccion_test_v01ds_14_tfbarser_sel, lV116Produccion_test_v01ds_15_tfbarserdsc, AV117Produccion_test_v01ds_16_tfbarserdsc_sel, lV118Produccion_test_v01ds_17_tfbarcolnom, AV119Produccion_test_v01ds_18_tfbarcolnom_sel, Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum), Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to), lV122Produccion_test_v01ds_21_tfbarnomcli, AV123Produccion_test_v01ds_22_tfbarnomcli_sel, Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit), Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to), AV126Produccion_test_v01ds_25_tfbarfecgen, AV127Produccion_test_v01ds_26_tfbarfeccli, AV128Produccion_test_v01ds_27_tfbarfecfpr, AV129Produccion_test_v01ds_28_tfbarfecsal, Integer.valueOf(AV50CliCod), Integer.valueOf(AV51CliCodTo), AV63bardisnum, AV65BarDisNumTo, AV52BarFecGen, AV53BarFecGenTo, AV64BarFecCli, AV66barfecclito, AV68barfecsal, AV69barfecsalto, AV70BarFecFpr, AV71barfecfprto, AV72BarColNom, AV76BarColNomto, Integer.valueOf(AV73BarColnum), Integer.valueOf(AV77BarColNumto), AV74BarNomCli, AV78BarNomClito, Integer.valueOf(AV75BarNumCli), Integer.valueOf(AV79Barnumclito), Integer.valueOf(AV80BarCod), Integer.valueOf(AV84BarCodto), Byte.valueOf(AV81BarCodreo), Byte.valueOf(AV85BarCodreoto), AV82BarCodpar, AV86BarCodparto, AV83Cod_idtx, AV87BarGirar, Short.valueOf(AV94BarTipArt), Short.valueOf(AV95BarTipArtto), AV96BarSer, AV97BarSerto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brkACL2 = false ;
         A396EmprCod = P0ACL2_A396EmprCod[0] ;
         A130BarCodPar = P0ACL2_A130BarCodPar[0] ;
         A217BarTipArt = P0ACL2_A217BarTipArt[0] ;
         n217BarTipArt = P0ACL2_n217BarTipArt[0] ;
         A2454BarGirar = P0ACL2_A2454BarGirar[0] ;
         A2829BarProPer = P0ACL2_A2829BarProPer[0] ;
         A1235BarNumCli = P0ACL2_A1235BarNumCli[0] ;
         A161BarFecSal = P0ACL2_A161BarFecSal[0] ;
         A158BarFecFpr = P0ACL2_A158BarFecFpr[0] ;
         A155BarFecCli = P0ACL2_A155BarFecCli[0] ;
         A159BarFecGen = P0ACL2_A159BarFecGen[0] ;
         A213BarSit = P0ACL2_A213BarSit[0] ;
         A1234BarNomCli = P0ACL2_A1234BarNomCli[0] ;
         A136BarColNum = P0ACL2_A136BarColNum[0] ;
         A135BarColNom = P0ACL2_A135BarColNom[0] ;
         A1652BarSerDsc = P0ACL2_A1652BarSerDsc[0] ;
         A212BarSer = P0ACL2_A212BarSer[0] ;
         A279CliNom = P0ACL2_A279CliNom[0] ;
         A252CliCod = P0ACL2_A252CliCod[0] ;
         n252CliCod = P0ACL2_n252CliCod[0] ;
         A143BarDisNum = P0ACL2_A143BarDisNum[0] ;
         A132BarCodReo = P0ACL2_A132BarCodReo[0] ;
         A129BarCod = P0ACL2_A129BarCod[0] ;
         A279CliNom = P0ACL2_A279CliNom[0] ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P0ACL2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            brkACL2 = false ;
            A396EmprCod = P0ACL2_A396EmprCod[0] ;
            A132BarCodReo = P0ACL2_A132BarCodReo[0] ;
            A129BarCod = P0ACL2_A129BarCod[0] ;
            AV35count = (long)(AV35count+1) ;
            brkACL2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A130BarCodPar)==0) )
         {
            AV30Option = A130BarCodPar ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACL2 )
         {
            brkACL2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARDISNUMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarDisNum = AV42SearchTxt ;
      AV17TFBarDisNum_Sel = "" ;
      AV102Produccion_test_v01ds_1_tfbarcod = AV10TFBarCod ;
      AV103Produccion_test_v01ds_2_tfbarcod_to = AV11TFBarCod_To ;
      AV104Produccion_test_v01ds_3_tfbarcodreo = AV12TFBarCodReo ;
      AV105Produccion_test_v01ds_4_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV106Produccion_test_v01ds_5_tfbarcodpar = AV14TFBarCodPar ;
      AV107Produccion_test_v01ds_6_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV108Produccion_test_v01ds_7_tfbardisnum = AV16TFBarDisNum ;
      AV109Produccion_test_v01ds_8_tfbardisnum_sel = AV17TFBarDisNum_Sel ;
      AV110Produccion_test_v01ds_9_tfclicod = AV18TFCliCod ;
      AV111Produccion_test_v01ds_10_tfclicod_to = AV19TFCliCod_To ;
      AV112Produccion_test_v01ds_11_tfclinom = AV20TFCliNom ;
      AV113Produccion_test_v01ds_12_tfclinom_sel = AV21TFCliNom_Sel ;
      AV114Produccion_test_v01ds_13_tfbarser = AV22TFBarSer ;
      AV115Produccion_test_v01ds_14_tfbarser_sel = AV23TFBarSer_Sel ;
      AV116Produccion_test_v01ds_15_tfbarserdsc = AV24TFBarSerDsc ;
      AV117Produccion_test_v01ds_16_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV118Produccion_test_v01ds_17_tfbarcolnom = AV57TFBarColNom ;
      AV119Produccion_test_v01ds_18_tfbarcolnom_sel = AV58TFBarColNom_Sel ;
      AV120Produccion_test_v01ds_19_tfbarcolnum = AV59TFBarColNum ;
      AV121Produccion_test_v01ds_20_tfbarcolnum_to = AV60TFBarColNum_To ;
      AV122Produccion_test_v01ds_21_tfbarnomcli = AV61TFBarNomCli ;
      AV123Produccion_test_v01ds_22_tfbarnomcli_sel = AV62TFBarNomCli_Sel ;
      AV124Produccion_test_v01ds_23_tfbarsit = AV26TFBarSit ;
      AV125Produccion_test_v01ds_24_tfbarsit_to = AV27TFBarSit_To ;
      AV126Produccion_test_v01ds_25_tfbarfecgen = AV28TFBarFecGen ;
      AV127Produccion_test_v01ds_26_tfbarfeccli = AV54TFBarFecCli ;
      AV128Produccion_test_v01ds_27_tfbarfecfpr = AV67TFBarFecFpr ;
      AV129Produccion_test_v01ds_28_tfbarfecsal = AV56TFBarFecSal ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod) ,
                                           Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to) ,
                                           AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                           AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           AV108Produccion_test_v01ds_7_tfbardisnum ,
                                           Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod) ,
                                           Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to) ,
                                           AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                           AV112Produccion_test_v01ds_11_tfclinom ,
                                           AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                           AV114Produccion_test_v01ds_13_tfbarser ,
                                           AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                           AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to) ,
                                           AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit) ,
                                           Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to) ,
                                           AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                           AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                           AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                           AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV50CliCod) ,
                                           Integer.valueOf(AV51CliCodTo) ,
                                           AV63bardisnum ,
                                           AV65BarDisNumTo ,
                                           AV52BarFecGen ,
                                           AV53BarFecGenTo ,
                                           AV64BarFecCli ,
                                           AV66barfecclito ,
                                           AV68barfecsal ,
                                           AV69barfecsalto ,
                                           AV70BarFecFpr ,
                                           AV71barfecfprto ,
                                           AV72BarColNom ,
                                           AV76BarColNomto ,
                                           Integer.valueOf(AV73BarColnum) ,
                                           Integer.valueOf(AV77BarColNumto) ,
                                           AV74BarNomCli ,
                                           AV78BarNomClito ,
                                           Integer.valueOf(AV75BarNumCli) ,
                                           Integer.valueOf(AV79Barnumclito) ,
                                           Integer.valueOf(AV80BarCod) ,
                                           Integer.valueOf(AV84BarCodto) ,
                                           Byte.valueOf(AV81BarCodreo) ,
                                           Byte.valueOf(AV85BarCodreoto) ,
                                           AV82BarCodpar ,
                                           AV86BarCodparto ,
                                           AV83Cod_idtx ,
                                           AV87BarGirar ,
                                           Short.valueOf(AV94BarTipArt) ,
                                           Short.valueOf(AV95BarTipArtto) ,
                                           AV96BarSer ,
                                           AV97BarSerto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Byte.valueOf(AV48BarSit) ,
                                           Byte.valueOf(AV49BarSitTo) ,
                                           A396EmprCod ,
                                           AV47EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Produccion_test_v01ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV106Produccion_test_v01ds_5_tfbarcodpar), 1, "%") ;
      lV108Produccion_test_v01ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV108Produccion_test_v01ds_7_tfbardisnum), 8, "%") ;
      lV112Produccion_test_v01ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV112Produccion_test_v01ds_11_tfclinom), 30, "%") ;
      lV114Produccion_test_v01ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV114Produccion_test_v01ds_13_tfbarser), 16, "%") ;
      lV116Produccion_test_v01ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV116Produccion_test_v01ds_15_tfbarserdsc), 26, "%") ;
      lV118Produccion_test_v01ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV118Produccion_test_v01ds_17_tfbarcolnom), 13, "%") ;
      lV122Produccion_test_v01ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV122Produccion_test_v01ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor P0ACL3 */
      pr_default.execute(1, new Object[] {Byte.valueOf(AV48BarSit), Byte.valueOf(AV49BarSitTo), AV47EmprCod, Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod), Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to), Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo), Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to), lV106Produccion_test_v01ds_5_tfbarcodpar, AV107Produccion_test_v01ds_6_tfbarcodpar_sel, lV108Produccion_test_v01ds_7_tfbardisnum, AV109Produccion_test_v01ds_8_tfbardisnum_sel, Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod), Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to), lV112Produccion_test_v01ds_11_tfclinom, AV113Produccion_test_v01ds_12_tfclinom_sel, lV114Produccion_test_v01ds_13_tfbarser, AV115Produccion_test_v01ds_14_tfbarser_sel, lV116Produccion_test_v01ds_15_tfbarserdsc, AV117Produccion_test_v01ds_16_tfbarserdsc_sel, lV118Produccion_test_v01ds_17_tfbarcolnom, AV119Produccion_test_v01ds_18_tfbarcolnom_sel, Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum), Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to), lV122Produccion_test_v01ds_21_tfbarnomcli, AV123Produccion_test_v01ds_22_tfbarnomcli_sel, Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit), Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to), AV126Produccion_test_v01ds_25_tfbarfecgen, AV127Produccion_test_v01ds_26_tfbarfeccli, AV128Produccion_test_v01ds_27_tfbarfecfpr, AV129Produccion_test_v01ds_28_tfbarfecsal, Integer.valueOf(AV50CliCod), Integer.valueOf(AV51CliCodTo), AV63bardisnum, AV65BarDisNumTo, AV52BarFecGen, AV53BarFecGenTo, AV64BarFecCli, AV66barfecclito, AV68barfecsal, AV69barfecsalto, AV70BarFecFpr, AV71barfecfprto, AV72BarColNom, AV76BarColNomto, Integer.valueOf(AV73BarColnum), Integer.valueOf(AV77BarColNumto), AV74BarNomCli, AV78BarNomClito, Integer.valueOf(AV75BarNumCli), Integer.valueOf(AV79Barnumclito), Integer.valueOf(AV80BarCod), Integer.valueOf(AV84BarCodto), Byte.valueOf(AV81BarCodreo), Byte.valueOf(AV85BarCodreoto), AV82BarCodpar, AV86BarCodparto, AV83Cod_idtx, AV87BarGirar, Short.valueOf(AV94BarTipArt), Short.valueOf(AV95BarTipArtto), AV96BarSer, AV97BarSerto});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkACL4 = false ;
         A396EmprCod = P0ACL3_A396EmprCod[0] ;
         A143BarDisNum = P0ACL3_A143BarDisNum[0] ;
         A217BarTipArt = P0ACL3_A217BarTipArt[0] ;
         n217BarTipArt = P0ACL3_n217BarTipArt[0] ;
         A2454BarGirar = P0ACL3_A2454BarGirar[0] ;
         A2829BarProPer = P0ACL3_A2829BarProPer[0] ;
         A1235BarNumCli = P0ACL3_A1235BarNumCli[0] ;
         A161BarFecSal = P0ACL3_A161BarFecSal[0] ;
         A158BarFecFpr = P0ACL3_A158BarFecFpr[0] ;
         A155BarFecCli = P0ACL3_A155BarFecCli[0] ;
         A159BarFecGen = P0ACL3_A159BarFecGen[0] ;
         A213BarSit = P0ACL3_A213BarSit[0] ;
         A1234BarNomCli = P0ACL3_A1234BarNomCli[0] ;
         A136BarColNum = P0ACL3_A136BarColNum[0] ;
         A135BarColNom = P0ACL3_A135BarColNom[0] ;
         A1652BarSerDsc = P0ACL3_A1652BarSerDsc[0] ;
         A212BarSer = P0ACL3_A212BarSer[0] ;
         A279CliNom = P0ACL3_A279CliNom[0] ;
         A252CliCod = P0ACL3_A252CliCod[0] ;
         n252CliCod = P0ACL3_n252CliCod[0] ;
         A130BarCodPar = P0ACL3_A130BarCodPar[0] ;
         A132BarCodReo = P0ACL3_A132BarCodReo[0] ;
         A129BarCod = P0ACL3_A129BarCod[0] ;
         A279CliNom = P0ACL3_A279CliNom[0] ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ACL3_A143BarDisNum[0], A143BarDisNum) == 0 ) )
         {
            brkACL4 = false ;
            A396EmprCod = P0ACL3_A396EmprCod[0] ;
            A130BarCodPar = P0ACL3_A130BarCodPar[0] ;
            A132BarCodReo = P0ACL3_A132BarCodReo[0] ;
            A129BarCod = P0ACL3_A129BarCod[0] ;
            AV35count = (long)(AV35count+1) ;
            brkACL4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A143BarDisNum)==0) )
         {
            AV30Option = A143BarDisNum ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACL4 )
         {
            brkACL4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADCLINOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFCliNom = AV42SearchTxt ;
      AV21TFCliNom_Sel = "" ;
      AV102Produccion_test_v01ds_1_tfbarcod = AV10TFBarCod ;
      AV103Produccion_test_v01ds_2_tfbarcod_to = AV11TFBarCod_To ;
      AV104Produccion_test_v01ds_3_tfbarcodreo = AV12TFBarCodReo ;
      AV105Produccion_test_v01ds_4_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV106Produccion_test_v01ds_5_tfbarcodpar = AV14TFBarCodPar ;
      AV107Produccion_test_v01ds_6_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV108Produccion_test_v01ds_7_tfbardisnum = AV16TFBarDisNum ;
      AV109Produccion_test_v01ds_8_tfbardisnum_sel = AV17TFBarDisNum_Sel ;
      AV110Produccion_test_v01ds_9_tfclicod = AV18TFCliCod ;
      AV111Produccion_test_v01ds_10_tfclicod_to = AV19TFCliCod_To ;
      AV112Produccion_test_v01ds_11_tfclinom = AV20TFCliNom ;
      AV113Produccion_test_v01ds_12_tfclinom_sel = AV21TFCliNom_Sel ;
      AV114Produccion_test_v01ds_13_tfbarser = AV22TFBarSer ;
      AV115Produccion_test_v01ds_14_tfbarser_sel = AV23TFBarSer_Sel ;
      AV116Produccion_test_v01ds_15_tfbarserdsc = AV24TFBarSerDsc ;
      AV117Produccion_test_v01ds_16_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV118Produccion_test_v01ds_17_tfbarcolnom = AV57TFBarColNom ;
      AV119Produccion_test_v01ds_18_tfbarcolnom_sel = AV58TFBarColNom_Sel ;
      AV120Produccion_test_v01ds_19_tfbarcolnum = AV59TFBarColNum ;
      AV121Produccion_test_v01ds_20_tfbarcolnum_to = AV60TFBarColNum_To ;
      AV122Produccion_test_v01ds_21_tfbarnomcli = AV61TFBarNomCli ;
      AV123Produccion_test_v01ds_22_tfbarnomcli_sel = AV62TFBarNomCli_Sel ;
      AV124Produccion_test_v01ds_23_tfbarsit = AV26TFBarSit ;
      AV125Produccion_test_v01ds_24_tfbarsit_to = AV27TFBarSit_To ;
      AV126Produccion_test_v01ds_25_tfbarfecgen = AV28TFBarFecGen ;
      AV127Produccion_test_v01ds_26_tfbarfeccli = AV54TFBarFecCli ;
      AV128Produccion_test_v01ds_27_tfbarfecfpr = AV67TFBarFecFpr ;
      AV129Produccion_test_v01ds_28_tfbarfecsal = AV56TFBarFecSal ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod) ,
                                           Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to) ,
                                           AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                           AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           AV108Produccion_test_v01ds_7_tfbardisnum ,
                                           Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod) ,
                                           Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to) ,
                                           AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                           AV112Produccion_test_v01ds_11_tfclinom ,
                                           AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                           AV114Produccion_test_v01ds_13_tfbarser ,
                                           AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                           AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to) ,
                                           AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit) ,
                                           Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to) ,
                                           AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                           AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                           AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                           AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV50CliCod) ,
                                           Integer.valueOf(AV51CliCodTo) ,
                                           AV63bardisnum ,
                                           AV65BarDisNumTo ,
                                           AV52BarFecGen ,
                                           AV53BarFecGenTo ,
                                           AV64BarFecCli ,
                                           AV66barfecclito ,
                                           AV68barfecsal ,
                                           AV69barfecsalto ,
                                           AV70BarFecFpr ,
                                           AV71barfecfprto ,
                                           AV72BarColNom ,
                                           AV76BarColNomto ,
                                           Integer.valueOf(AV73BarColnum) ,
                                           Integer.valueOf(AV77BarColNumto) ,
                                           AV74BarNomCli ,
                                           AV78BarNomClito ,
                                           Integer.valueOf(AV75BarNumCli) ,
                                           Integer.valueOf(AV79Barnumclito) ,
                                           Integer.valueOf(AV80BarCod) ,
                                           Integer.valueOf(AV84BarCodto) ,
                                           Byte.valueOf(AV81BarCodreo) ,
                                           Byte.valueOf(AV85BarCodreoto) ,
                                           AV82BarCodpar ,
                                           AV86BarCodparto ,
                                           AV83Cod_idtx ,
                                           AV87BarGirar ,
                                           Short.valueOf(AV94BarTipArt) ,
                                           Short.valueOf(AV95BarTipArtto) ,
                                           AV96BarSer ,
                                           AV97BarSerto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Byte.valueOf(AV48BarSit) ,
                                           Byte.valueOf(AV49BarSitTo) ,
                                           A396EmprCod ,
                                           AV47EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Produccion_test_v01ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV106Produccion_test_v01ds_5_tfbarcodpar), 1, "%") ;
      lV108Produccion_test_v01ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV108Produccion_test_v01ds_7_tfbardisnum), 8, "%") ;
      lV112Produccion_test_v01ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV112Produccion_test_v01ds_11_tfclinom), 30, "%") ;
      lV114Produccion_test_v01ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV114Produccion_test_v01ds_13_tfbarser), 16, "%") ;
      lV116Produccion_test_v01ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV116Produccion_test_v01ds_15_tfbarserdsc), 26, "%") ;
      lV118Produccion_test_v01ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV118Produccion_test_v01ds_17_tfbarcolnom), 13, "%") ;
      lV122Produccion_test_v01ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV122Produccion_test_v01ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor P0ACL4 */
      pr_default.execute(2, new Object[] {Byte.valueOf(AV48BarSit), Byte.valueOf(AV49BarSitTo), AV47EmprCod, Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod), Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to), Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo), Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to), lV106Produccion_test_v01ds_5_tfbarcodpar, AV107Produccion_test_v01ds_6_tfbarcodpar_sel, lV108Produccion_test_v01ds_7_tfbardisnum, AV109Produccion_test_v01ds_8_tfbardisnum_sel, Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod), Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to), lV112Produccion_test_v01ds_11_tfclinom, AV113Produccion_test_v01ds_12_tfclinom_sel, lV114Produccion_test_v01ds_13_tfbarser, AV115Produccion_test_v01ds_14_tfbarser_sel, lV116Produccion_test_v01ds_15_tfbarserdsc, AV117Produccion_test_v01ds_16_tfbarserdsc_sel, lV118Produccion_test_v01ds_17_tfbarcolnom, AV119Produccion_test_v01ds_18_tfbarcolnom_sel, Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum), Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to), lV122Produccion_test_v01ds_21_tfbarnomcli, AV123Produccion_test_v01ds_22_tfbarnomcli_sel, Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit), Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to), AV126Produccion_test_v01ds_25_tfbarfecgen, AV127Produccion_test_v01ds_26_tfbarfeccli, AV128Produccion_test_v01ds_27_tfbarfecfpr, AV129Produccion_test_v01ds_28_tfbarfecsal, Integer.valueOf(AV50CliCod), Integer.valueOf(AV51CliCodTo), AV63bardisnum, AV65BarDisNumTo, AV52BarFecGen, AV53BarFecGenTo, AV64BarFecCli, AV66barfecclito, AV68barfecsal, AV69barfecsalto, AV70BarFecFpr, AV71barfecfprto, AV72BarColNom, AV76BarColNomto, Integer.valueOf(AV73BarColnum), Integer.valueOf(AV77BarColNumto), AV74BarNomCli, AV78BarNomClito, Integer.valueOf(AV75BarNumCli), Integer.valueOf(AV79Barnumclito), Integer.valueOf(AV80BarCod), Integer.valueOf(AV84BarCodto), Byte.valueOf(AV81BarCodreo), Byte.valueOf(AV85BarCodreoto), AV82BarCodpar, AV86BarCodparto, AV83Cod_idtx, AV87BarGirar, Short.valueOf(AV94BarTipArt), Short.valueOf(AV95BarTipArtto), AV96BarSer, AV97BarSerto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkACL6 = false ;
         A396EmprCod = P0ACL4_A396EmprCod[0] ;
         A279CliNom = P0ACL4_A279CliNom[0] ;
         A217BarTipArt = P0ACL4_A217BarTipArt[0] ;
         n217BarTipArt = P0ACL4_n217BarTipArt[0] ;
         A2454BarGirar = P0ACL4_A2454BarGirar[0] ;
         A2829BarProPer = P0ACL4_A2829BarProPer[0] ;
         A1235BarNumCli = P0ACL4_A1235BarNumCli[0] ;
         A161BarFecSal = P0ACL4_A161BarFecSal[0] ;
         A158BarFecFpr = P0ACL4_A158BarFecFpr[0] ;
         A155BarFecCli = P0ACL4_A155BarFecCli[0] ;
         A159BarFecGen = P0ACL4_A159BarFecGen[0] ;
         A213BarSit = P0ACL4_A213BarSit[0] ;
         A1234BarNomCli = P0ACL4_A1234BarNomCli[0] ;
         A136BarColNum = P0ACL4_A136BarColNum[0] ;
         A135BarColNom = P0ACL4_A135BarColNom[0] ;
         A1652BarSerDsc = P0ACL4_A1652BarSerDsc[0] ;
         A212BarSer = P0ACL4_A212BarSer[0] ;
         A252CliCod = P0ACL4_A252CliCod[0] ;
         n252CliCod = P0ACL4_n252CliCod[0] ;
         A143BarDisNum = P0ACL4_A143BarDisNum[0] ;
         A130BarCodPar = P0ACL4_A130BarCodPar[0] ;
         A132BarCodReo = P0ACL4_A132BarCodReo[0] ;
         A129BarCod = P0ACL4_A129BarCod[0] ;
         A279CliNom = P0ACL4_A279CliNom[0] ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ACL4_A279CliNom[0], A279CliNom) == 0 ) )
         {
            brkACL6 = false ;
            A396EmprCod = P0ACL4_A396EmprCod[0] ;
            A252CliCod = P0ACL4_A252CliCod[0] ;
            n252CliCod = P0ACL4_n252CliCod[0] ;
            A130BarCodPar = P0ACL4_A130BarCodPar[0] ;
            A132BarCodReo = P0ACL4_A132BarCodReo[0] ;
            A129BarCod = P0ACL4_A129BarCod[0] ;
            AV35count = (long)(AV35count+1) ;
            brkACL6 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A279CliNom)==0) )
         {
            AV30Option = A279CliNom ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACL6 )
         {
            brkACL6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarSer = AV42SearchTxt ;
      AV23TFBarSer_Sel = "" ;
      AV102Produccion_test_v01ds_1_tfbarcod = AV10TFBarCod ;
      AV103Produccion_test_v01ds_2_tfbarcod_to = AV11TFBarCod_To ;
      AV104Produccion_test_v01ds_3_tfbarcodreo = AV12TFBarCodReo ;
      AV105Produccion_test_v01ds_4_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV106Produccion_test_v01ds_5_tfbarcodpar = AV14TFBarCodPar ;
      AV107Produccion_test_v01ds_6_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV108Produccion_test_v01ds_7_tfbardisnum = AV16TFBarDisNum ;
      AV109Produccion_test_v01ds_8_tfbardisnum_sel = AV17TFBarDisNum_Sel ;
      AV110Produccion_test_v01ds_9_tfclicod = AV18TFCliCod ;
      AV111Produccion_test_v01ds_10_tfclicod_to = AV19TFCliCod_To ;
      AV112Produccion_test_v01ds_11_tfclinom = AV20TFCliNom ;
      AV113Produccion_test_v01ds_12_tfclinom_sel = AV21TFCliNom_Sel ;
      AV114Produccion_test_v01ds_13_tfbarser = AV22TFBarSer ;
      AV115Produccion_test_v01ds_14_tfbarser_sel = AV23TFBarSer_Sel ;
      AV116Produccion_test_v01ds_15_tfbarserdsc = AV24TFBarSerDsc ;
      AV117Produccion_test_v01ds_16_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV118Produccion_test_v01ds_17_tfbarcolnom = AV57TFBarColNom ;
      AV119Produccion_test_v01ds_18_tfbarcolnom_sel = AV58TFBarColNom_Sel ;
      AV120Produccion_test_v01ds_19_tfbarcolnum = AV59TFBarColNum ;
      AV121Produccion_test_v01ds_20_tfbarcolnum_to = AV60TFBarColNum_To ;
      AV122Produccion_test_v01ds_21_tfbarnomcli = AV61TFBarNomCli ;
      AV123Produccion_test_v01ds_22_tfbarnomcli_sel = AV62TFBarNomCli_Sel ;
      AV124Produccion_test_v01ds_23_tfbarsit = AV26TFBarSit ;
      AV125Produccion_test_v01ds_24_tfbarsit_to = AV27TFBarSit_To ;
      AV126Produccion_test_v01ds_25_tfbarfecgen = AV28TFBarFecGen ;
      AV127Produccion_test_v01ds_26_tfbarfeccli = AV54TFBarFecCli ;
      AV128Produccion_test_v01ds_27_tfbarfecfpr = AV67TFBarFecFpr ;
      AV129Produccion_test_v01ds_28_tfbarfecsal = AV56TFBarFecSal ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod) ,
                                           Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to) ,
                                           AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                           AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           AV108Produccion_test_v01ds_7_tfbardisnum ,
                                           Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod) ,
                                           Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to) ,
                                           AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                           AV112Produccion_test_v01ds_11_tfclinom ,
                                           AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                           AV114Produccion_test_v01ds_13_tfbarser ,
                                           AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                           AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to) ,
                                           AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit) ,
                                           Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to) ,
                                           AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                           AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                           AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                           AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV50CliCod) ,
                                           Integer.valueOf(AV51CliCodTo) ,
                                           AV63bardisnum ,
                                           AV65BarDisNumTo ,
                                           AV52BarFecGen ,
                                           AV53BarFecGenTo ,
                                           AV64BarFecCli ,
                                           AV66barfecclito ,
                                           AV68barfecsal ,
                                           AV69barfecsalto ,
                                           AV70BarFecFpr ,
                                           AV71barfecfprto ,
                                           AV72BarColNom ,
                                           AV76BarColNomto ,
                                           Integer.valueOf(AV73BarColnum) ,
                                           Integer.valueOf(AV77BarColNumto) ,
                                           AV74BarNomCli ,
                                           AV78BarNomClito ,
                                           Integer.valueOf(AV75BarNumCli) ,
                                           Integer.valueOf(AV79Barnumclito) ,
                                           Integer.valueOf(AV80BarCod) ,
                                           Integer.valueOf(AV84BarCodto) ,
                                           Byte.valueOf(AV81BarCodreo) ,
                                           Byte.valueOf(AV85BarCodreoto) ,
                                           AV82BarCodpar ,
                                           AV86BarCodparto ,
                                           AV83Cod_idtx ,
                                           AV87BarGirar ,
                                           Short.valueOf(AV94BarTipArt) ,
                                           Short.valueOf(AV95BarTipArtto) ,
                                           AV96BarSer ,
                                           AV97BarSerto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Byte.valueOf(AV48BarSit) ,
                                           Byte.valueOf(AV49BarSitTo) ,
                                           AV47EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Produccion_test_v01ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV106Produccion_test_v01ds_5_tfbarcodpar), 1, "%") ;
      lV108Produccion_test_v01ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV108Produccion_test_v01ds_7_tfbardisnum), 8, "%") ;
      lV112Produccion_test_v01ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV112Produccion_test_v01ds_11_tfclinom), 30, "%") ;
      lV114Produccion_test_v01ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV114Produccion_test_v01ds_13_tfbarser), 16, "%") ;
      lV116Produccion_test_v01ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV116Produccion_test_v01ds_15_tfbarserdsc), 26, "%") ;
      lV118Produccion_test_v01ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV118Produccion_test_v01ds_17_tfbarcolnom), 13, "%") ;
      lV122Produccion_test_v01ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV122Produccion_test_v01ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor P0ACL5 */
      pr_default.execute(3, new Object[] {AV47EmprCod, Byte.valueOf(AV48BarSit), Byte.valueOf(AV49BarSitTo), Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod), Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to), Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo), Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to), lV106Produccion_test_v01ds_5_tfbarcodpar, AV107Produccion_test_v01ds_6_tfbarcodpar_sel, lV108Produccion_test_v01ds_7_tfbardisnum, AV109Produccion_test_v01ds_8_tfbardisnum_sel, Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod), Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to), lV112Produccion_test_v01ds_11_tfclinom, AV113Produccion_test_v01ds_12_tfclinom_sel, lV114Produccion_test_v01ds_13_tfbarser, AV115Produccion_test_v01ds_14_tfbarser_sel, lV116Produccion_test_v01ds_15_tfbarserdsc, AV117Produccion_test_v01ds_16_tfbarserdsc_sel, lV118Produccion_test_v01ds_17_tfbarcolnom, AV119Produccion_test_v01ds_18_tfbarcolnom_sel, Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum), Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to), lV122Produccion_test_v01ds_21_tfbarnomcli, AV123Produccion_test_v01ds_22_tfbarnomcli_sel, Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit), Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to), AV126Produccion_test_v01ds_25_tfbarfecgen, AV127Produccion_test_v01ds_26_tfbarfeccli, AV128Produccion_test_v01ds_27_tfbarfecfpr, AV129Produccion_test_v01ds_28_tfbarfecsal, Integer.valueOf(AV50CliCod), Integer.valueOf(AV51CliCodTo), AV63bardisnum, AV65BarDisNumTo, AV52BarFecGen, AV53BarFecGenTo, AV64BarFecCli, AV66barfecclito, AV68barfecsal, AV69barfecsalto, AV70BarFecFpr, AV71barfecfprto, AV72BarColNom, AV76BarColNomto, Integer.valueOf(AV73BarColnum), Integer.valueOf(AV77BarColNumto), AV74BarNomCli, AV78BarNomClito, Integer.valueOf(AV75BarNumCli), Integer.valueOf(AV79Barnumclito), Integer.valueOf(AV80BarCod), Integer.valueOf(AV84BarCodto), Byte.valueOf(AV81BarCodreo), Byte.valueOf(AV85BarCodreoto), AV82BarCodpar, AV86BarCodparto, AV83Cod_idtx, AV87BarGirar, Short.valueOf(AV94BarTipArt), Short.valueOf(AV95BarTipArtto), AV96BarSer, AV97BarSerto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkACL8 = false ;
         A396EmprCod = P0ACL5_A396EmprCod[0] ;
         A212BarSer = P0ACL5_A212BarSer[0] ;
         A217BarTipArt = P0ACL5_A217BarTipArt[0] ;
         n217BarTipArt = P0ACL5_n217BarTipArt[0] ;
         A2454BarGirar = P0ACL5_A2454BarGirar[0] ;
         A2829BarProPer = P0ACL5_A2829BarProPer[0] ;
         A1235BarNumCli = P0ACL5_A1235BarNumCli[0] ;
         A161BarFecSal = P0ACL5_A161BarFecSal[0] ;
         A158BarFecFpr = P0ACL5_A158BarFecFpr[0] ;
         A155BarFecCli = P0ACL5_A155BarFecCli[0] ;
         A159BarFecGen = P0ACL5_A159BarFecGen[0] ;
         A213BarSit = P0ACL5_A213BarSit[0] ;
         A1234BarNomCli = P0ACL5_A1234BarNomCli[0] ;
         A136BarColNum = P0ACL5_A136BarColNum[0] ;
         A135BarColNom = P0ACL5_A135BarColNom[0] ;
         A1652BarSerDsc = P0ACL5_A1652BarSerDsc[0] ;
         A279CliNom = P0ACL5_A279CliNom[0] ;
         A252CliCod = P0ACL5_A252CliCod[0] ;
         n252CliCod = P0ACL5_n252CliCod[0] ;
         A143BarDisNum = P0ACL5_A143BarDisNum[0] ;
         A130BarCodPar = P0ACL5_A130BarCodPar[0] ;
         A132BarCodReo = P0ACL5_A132BarCodReo[0] ;
         A129BarCod = P0ACL5_A129BarCod[0] ;
         A279CliNom = P0ACL5_A279CliNom[0] ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0ACL5_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P0ACL5_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brkACL8 = false ;
            A130BarCodPar = P0ACL5_A130BarCodPar[0] ;
            A132BarCodReo = P0ACL5_A132BarCodReo[0] ;
            A129BarCod = P0ACL5_A129BarCod[0] ;
            AV35count = (long)(AV35count+1) ;
            brkACL8 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV30Option = A212BarSer ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACL8 )
         {
            brkACL8 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV24TFBarSerDsc = AV42SearchTxt ;
      AV25TFBarSerDsc_Sel = "" ;
      AV102Produccion_test_v01ds_1_tfbarcod = AV10TFBarCod ;
      AV103Produccion_test_v01ds_2_tfbarcod_to = AV11TFBarCod_To ;
      AV104Produccion_test_v01ds_3_tfbarcodreo = AV12TFBarCodReo ;
      AV105Produccion_test_v01ds_4_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV106Produccion_test_v01ds_5_tfbarcodpar = AV14TFBarCodPar ;
      AV107Produccion_test_v01ds_6_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV108Produccion_test_v01ds_7_tfbardisnum = AV16TFBarDisNum ;
      AV109Produccion_test_v01ds_8_tfbardisnum_sel = AV17TFBarDisNum_Sel ;
      AV110Produccion_test_v01ds_9_tfclicod = AV18TFCliCod ;
      AV111Produccion_test_v01ds_10_tfclicod_to = AV19TFCliCod_To ;
      AV112Produccion_test_v01ds_11_tfclinom = AV20TFCliNom ;
      AV113Produccion_test_v01ds_12_tfclinom_sel = AV21TFCliNom_Sel ;
      AV114Produccion_test_v01ds_13_tfbarser = AV22TFBarSer ;
      AV115Produccion_test_v01ds_14_tfbarser_sel = AV23TFBarSer_Sel ;
      AV116Produccion_test_v01ds_15_tfbarserdsc = AV24TFBarSerDsc ;
      AV117Produccion_test_v01ds_16_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV118Produccion_test_v01ds_17_tfbarcolnom = AV57TFBarColNom ;
      AV119Produccion_test_v01ds_18_tfbarcolnom_sel = AV58TFBarColNom_Sel ;
      AV120Produccion_test_v01ds_19_tfbarcolnum = AV59TFBarColNum ;
      AV121Produccion_test_v01ds_20_tfbarcolnum_to = AV60TFBarColNum_To ;
      AV122Produccion_test_v01ds_21_tfbarnomcli = AV61TFBarNomCli ;
      AV123Produccion_test_v01ds_22_tfbarnomcli_sel = AV62TFBarNomCli_Sel ;
      AV124Produccion_test_v01ds_23_tfbarsit = AV26TFBarSit ;
      AV125Produccion_test_v01ds_24_tfbarsit_to = AV27TFBarSit_To ;
      AV126Produccion_test_v01ds_25_tfbarfecgen = AV28TFBarFecGen ;
      AV127Produccion_test_v01ds_26_tfbarfeccli = AV54TFBarFecCli ;
      AV128Produccion_test_v01ds_27_tfbarfecfpr = AV67TFBarFecFpr ;
      AV129Produccion_test_v01ds_28_tfbarfecsal = AV56TFBarFecSal ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod) ,
                                           Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to) ,
                                           AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                           AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           AV108Produccion_test_v01ds_7_tfbardisnum ,
                                           Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod) ,
                                           Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to) ,
                                           AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                           AV112Produccion_test_v01ds_11_tfclinom ,
                                           AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                           AV114Produccion_test_v01ds_13_tfbarser ,
                                           AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                           AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to) ,
                                           AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit) ,
                                           Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to) ,
                                           AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                           AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                           AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                           AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV50CliCod) ,
                                           Integer.valueOf(AV51CliCodTo) ,
                                           AV63bardisnum ,
                                           AV65BarDisNumTo ,
                                           AV52BarFecGen ,
                                           AV53BarFecGenTo ,
                                           AV64BarFecCli ,
                                           AV66barfecclito ,
                                           AV68barfecsal ,
                                           AV69barfecsalto ,
                                           AV70BarFecFpr ,
                                           AV71barfecfprto ,
                                           AV72BarColNom ,
                                           AV76BarColNomto ,
                                           Integer.valueOf(AV73BarColnum) ,
                                           Integer.valueOf(AV77BarColNumto) ,
                                           AV74BarNomCli ,
                                           AV78BarNomClito ,
                                           Integer.valueOf(AV75BarNumCli) ,
                                           Integer.valueOf(AV79Barnumclito) ,
                                           Integer.valueOf(AV80BarCod) ,
                                           Integer.valueOf(AV84BarCodto) ,
                                           Byte.valueOf(AV81BarCodreo) ,
                                           Byte.valueOf(AV85BarCodreoto) ,
                                           AV82BarCodpar ,
                                           AV86BarCodparto ,
                                           AV83Cod_idtx ,
                                           AV87BarGirar ,
                                           Short.valueOf(AV94BarTipArt) ,
                                           Short.valueOf(AV95BarTipArtto) ,
                                           AV96BarSer ,
                                           AV97BarSerto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Byte.valueOf(AV48BarSit) ,
                                           Byte.valueOf(AV49BarSitTo) ,
                                           A396EmprCod ,
                                           AV47EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Produccion_test_v01ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV106Produccion_test_v01ds_5_tfbarcodpar), 1, "%") ;
      lV108Produccion_test_v01ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV108Produccion_test_v01ds_7_tfbardisnum), 8, "%") ;
      lV112Produccion_test_v01ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV112Produccion_test_v01ds_11_tfclinom), 30, "%") ;
      lV114Produccion_test_v01ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV114Produccion_test_v01ds_13_tfbarser), 16, "%") ;
      lV116Produccion_test_v01ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV116Produccion_test_v01ds_15_tfbarserdsc), 26, "%") ;
      lV118Produccion_test_v01ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV118Produccion_test_v01ds_17_tfbarcolnom), 13, "%") ;
      lV122Produccion_test_v01ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV122Produccion_test_v01ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor P0ACL6 */
      pr_default.execute(4, new Object[] {Byte.valueOf(AV48BarSit), Byte.valueOf(AV49BarSitTo), AV47EmprCod, Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod), Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to), Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo), Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to), lV106Produccion_test_v01ds_5_tfbarcodpar, AV107Produccion_test_v01ds_6_tfbarcodpar_sel, lV108Produccion_test_v01ds_7_tfbardisnum, AV109Produccion_test_v01ds_8_tfbardisnum_sel, Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod), Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to), lV112Produccion_test_v01ds_11_tfclinom, AV113Produccion_test_v01ds_12_tfclinom_sel, lV114Produccion_test_v01ds_13_tfbarser, AV115Produccion_test_v01ds_14_tfbarser_sel, lV116Produccion_test_v01ds_15_tfbarserdsc, AV117Produccion_test_v01ds_16_tfbarserdsc_sel, lV118Produccion_test_v01ds_17_tfbarcolnom, AV119Produccion_test_v01ds_18_tfbarcolnom_sel, Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum), Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to), lV122Produccion_test_v01ds_21_tfbarnomcli, AV123Produccion_test_v01ds_22_tfbarnomcli_sel, Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit), Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to), AV126Produccion_test_v01ds_25_tfbarfecgen, AV127Produccion_test_v01ds_26_tfbarfeccli, AV128Produccion_test_v01ds_27_tfbarfecfpr, AV129Produccion_test_v01ds_28_tfbarfecsal, Integer.valueOf(AV50CliCod), Integer.valueOf(AV51CliCodTo), AV63bardisnum, AV65BarDisNumTo, AV52BarFecGen, AV53BarFecGenTo, AV64BarFecCli, AV66barfecclito, AV68barfecsal, AV69barfecsalto, AV70BarFecFpr, AV71barfecfprto, AV72BarColNom, AV76BarColNomto, Integer.valueOf(AV73BarColnum), Integer.valueOf(AV77BarColNumto), AV74BarNomCli, AV78BarNomClito, Integer.valueOf(AV75BarNumCli), Integer.valueOf(AV79Barnumclito), Integer.valueOf(AV80BarCod), Integer.valueOf(AV84BarCodto), Byte.valueOf(AV81BarCodreo), Byte.valueOf(AV85BarCodreoto), AV82BarCodpar, AV86BarCodparto, AV83Cod_idtx, AV87BarGirar, Short.valueOf(AV94BarTipArt), Short.valueOf(AV95BarTipArtto), AV96BarSer, AV97BarSerto});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkACL10 = false ;
         A396EmprCod = P0ACL6_A396EmprCod[0] ;
         A1652BarSerDsc = P0ACL6_A1652BarSerDsc[0] ;
         A217BarTipArt = P0ACL6_A217BarTipArt[0] ;
         n217BarTipArt = P0ACL6_n217BarTipArt[0] ;
         A2454BarGirar = P0ACL6_A2454BarGirar[0] ;
         A2829BarProPer = P0ACL6_A2829BarProPer[0] ;
         A1235BarNumCli = P0ACL6_A1235BarNumCli[0] ;
         A161BarFecSal = P0ACL6_A161BarFecSal[0] ;
         A158BarFecFpr = P0ACL6_A158BarFecFpr[0] ;
         A155BarFecCli = P0ACL6_A155BarFecCli[0] ;
         A159BarFecGen = P0ACL6_A159BarFecGen[0] ;
         A213BarSit = P0ACL6_A213BarSit[0] ;
         A1234BarNomCli = P0ACL6_A1234BarNomCli[0] ;
         A136BarColNum = P0ACL6_A136BarColNum[0] ;
         A135BarColNom = P0ACL6_A135BarColNom[0] ;
         A212BarSer = P0ACL6_A212BarSer[0] ;
         A279CliNom = P0ACL6_A279CliNom[0] ;
         A252CliCod = P0ACL6_A252CliCod[0] ;
         n252CliCod = P0ACL6_n252CliCod[0] ;
         A143BarDisNum = P0ACL6_A143BarDisNum[0] ;
         A130BarCodPar = P0ACL6_A130BarCodPar[0] ;
         A132BarCodReo = P0ACL6_A132BarCodReo[0] ;
         A129BarCod = P0ACL6_A129BarCod[0] ;
         A279CliNom = P0ACL6_A279CliNom[0] ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0ACL6_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brkACL10 = false ;
            A396EmprCod = P0ACL6_A396EmprCod[0] ;
            A130BarCodPar = P0ACL6_A130BarCodPar[0] ;
            A132BarCodReo = P0ACL6_A132BarCodReo[0] ;
            A129BarCod = P0ACL6_A129BarCod[0] ;
            AV35count = (long)(AV35count+1) ;
            brkACL10 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV30Option = A1652BarSerDsc ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACL10 )
         {
            brkACL10 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV57TFBarColNom = AV42SearchTxt ;
      AV58TFBarColNom_Sel = "" ;
      AV102Produccion_test_v01ds_1_tfbarcod = AV10TFBarCod ;
      AV103Produccion_test_v01ds_2_tfbarcod_to = AV11TFBarCod_To ;
      AV104Produccion_test_v01ds_3_tfbarcodreo = AV12TFBarCodReo ;
      AV105Produccion_test_v01ds_4_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV106Produccion_test_v01ds_5_tfbarcodpar = AV14TFBarCodPar ;
      AV107Produccion_test_v01ds_6_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV108Produccion_test_v01ds_7_tfbardisnum = AV16TFBarDisNum ;
      AV109Produccion_test_v01ds_8_tfbardisnum_sel = AV17TFBarDisNum_Sel ;
      AV110Produccion_test_v01ds_9_tfclicod = AV18TFCliCod ;
      AV111Produccion_test_v01ds_10_tfclicod_to = AV19TFCliCod_To ;
      AV112Produccion_test_v01ds_11_tfclinom = AV20TFCliNom ;
      AV113Produccion_test_v01ds_12_tfclinom_sel = AV21TFCliNom_Sel ;
      AV114Produccion_test_v01ds_13_tfbarser = AV22TFBarSer ;
      AV115Produccion_test_v01ds_14_tfbarser_sel = AV23TFBarSer_Sel ;
      AV116Produccion_test_v01ds_15_tfbarserdsc = AV24TFBarSerDsc ;
      AV117Produccion_test_v01ds_16_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV118Produccion_test_v01ds_17_tfbarcolnom = AV57TFBarColNom ;
      AV119Produccion_test_v01ds_18_tfbarcolnom_sel = AV58TFBarColNom_Sel ;
      AV120Produccion_test_v01ds_19_tfbarcolnum = AV59TFBarColNum ;
      AV121Produccion_test_v01ds_20_tfbarcolnum_to = AV60TFBarColNum_To ;
      AV122Produccion_test_v01ds_21_tfbarnomcli = AV61TFBarNomCli ;
      AV123Produccion_test_v01ds_22_tfbarnomcli_sel = AV62TFBarNomCli_Sel ;
      AV124Produccion_test_v01ds_23_tfbarsit = AV26TFBarSit ;
      AV125Produccion_test_v01ds_24_tfbarsit_to = AV27TFBarSit_To ;
      AV126Produccion_test_v01ds_25_tfbarfecgen = AV28TFBarFecGen ;
      AV127Produccion_test_v01ds_26_tfbarfeccli = AV54TFBarFecCli ;
      AV128Produccion_test_v01ds_27_tfbarfecfpr = AV67TFBarFecFpr ;
      AV129Produccion_test_v01ds_28_tfbarfecsal = AV56TFBarFecSal ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod) ,
                                           Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to) ,
                                           AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                           AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           AV108Produccion_test_v01ds_7_tfbardisnum ,
                                           Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod) ,
                                           Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to) ,
                                           AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                           AV112Produccion_test_v01ds_11_tfclinom ,
                                           AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                           AV114Produccion_test_v01ds_13_tfbarser ,
                                           AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                           AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to) ,
                                           AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit) ,
                                           Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to) ,
                                           AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                           AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                           AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                           AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV50CliCod) ,
                                           Integer.valueOf(AV51CliCodTo) ,
                                           AV63bardisnum ,
                                           AV65BarDisNumTo ,
                                           AV52BarFecGen ,
                                           AV53BarFecGenTo ,
                                           AV64BarFecCli ,
                                           AV66barfecclito ,
                                           AV68barfecsal ,
                                           AV69barfecsalto ,
                                           AV70BarFecFpr ,
                                           AV71barfecfprto ,
                                           AV72BarColNom ,
                                           AV76BarColNomto ,
                                           Integer.valueOf(AV73BarColnum) ,
                                           Integer.valueOf(AV77BarColNumto) ,
                                           AV74BarNomCli ,
                                           AV78BarNomClito ,
                                           Integer.valueOf(AV75BarNumCli) ,
                                           Integer.valueOf(AV79Barnumclito) ,
                                           Integer.valueOf(AV80BarCod) ,
                                           Integer.valueOf(AV84BarCodto) ,
                                           Byte.valueOf(AV81BarCodreo) ,
                                           Byte.valueOf(AV85BarCodreoto) ,
                                           AV82BarCodpar ,
                                           AV86BarCodparto ,
                                           AV83Cod_idtx ,
                                           AV87BarGirar ,
                                           Short.valueOf(AV94BarTipArt) ,
                                           Short.valueOf(AV95BarTipArtto) ,
                                           AV96BarSer ,
                                           AV97BarSerto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Byte.valueOf(AV48BarSit) ,
                                           Byte.valueOf(AV49BarSitTo) ,
                                           A396EmprCod ,
                                           AV47EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Produccion_test_v01ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV106Produccion_test_v01ds_5_tfbarcodpar), 1, "%") ;
      lV108Produccion_test_v01ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV108Produccion_test_v01ds_7_tfbardisnum), 8, "%") ;
      lV112Produccion_test_v01ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV112Produccion_test_v01ds_11_tfclinom), 30, "%") ;
      lV114Produccion_test_v01ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV114Produccion_test_v01ds_13_tfbarser), 16, "%") ;
      lV116Produccion_test_v01ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV116Produccion_test_v01ds_15_tfbarserdsc), 26, "%") ;
      lV118Produccion_test_v01ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV118Produccion_test_v01ds_17_tfbarcolnom), 13, "%") ;
      lV122Produccion_test_v01ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV122Produccion_test_v01ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor P0ACL7 */
      pr_default.execute(5, new Object[] {Byte.valueOf(AV48BarSit), Byte.valueOf(AV49BarSitTo), AV47EmprCod, Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod), Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to), Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo), Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to), lV106Produccion_test_v01ds_5_tfbarcodpar, AV107Produccion_test_v01ds_6_tfbarcodpar_sel, lV108Produccion_test_v01ds_7_tfbardisnum, AV109Produccion_test_v01ds_8_tfbardisnum_sel, Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod), Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to), lV112Produccion_test_v01ds_11_tfclinom, AV113Produccion_test_v01ds_12_tfclinom_sel, lV114Produccion_test_v01ds_13_tfbarser, AV115Produccion_test_v01ds_14_tfbarser_sel, lV116Produccion_test_v01ds_15_tfbarserdsc, AV117Produccion_test_v01ds_16_tfbarserdsc_sel, lV118Produccion_test_v01ds_17_tfbarcolnom, AV119Produccion_test_v01ds_18_tfbarcolnom_sel, Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum), Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to), lV122Produccion_test_v01ds_21_tfbarnomcli, AV123Produccion_test_v01ds_22_tfbarnomcli_sel, Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit), Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to), AV126Produccion_test_v01ds_25_tfbarfecgen, AV127Produccion_test_v01ds_26_tfbarfeccli, AV128Produccion_test_v01ds_27_tfbarfecfpr, AV129Produccion_test_v01ds_28_tfbarfecsal, Integer.valueOf(AV50CliCod), Integer.valueOf(AV51CliCodTo), AV63bardisnum, AV65BarDisNumTo, AV52BarFecGen, AV53BarFecGenTo, AV64BarFecCli, AV66barfecclito, AV68barfecsal, AV69barfecsalto, AV70BarFecFpr, AV71barfecfprto, AV72BarColNom, AV76BarColNomto, Integer.valueOf(AV73BarColnum), Integer.valueOf(AV77BarColNumto), AV74BarNomCli, AV78BarNomClito, Integer.valueOf(AV75BarNumCli), Integer.valueOf(AV79Barnumclito), Integer.valueOf(AV80BarCod), Integer.valueOf(AV84BarCodto), Byte.valueOf(AV81BarCodreo), Byte.valueOf(AV85BarCodreoto), AV82BarCodpar, AV86BarCodparto, AV83Cod_idtx, AV87BarGirar, Short.valueOf(AV94BarTipArt), Short.valueOf(AV95BarTipArtto), AV96BarSer, AV97BarSerto});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkACL12 = false ;
         A396EmprCod = P0ACL7_A396EmprCod[0] ;
         A135BarColNom = P0ACL7_A135BarColNom[0] ;
         A217BarTipArt = P0ACL7_A217BarTipArt[0] ;
         n217BarTipArt = P0ACL7_n217BarTipArt[0] ;
         A2454BarGirar = P0ACL7_A2454BarGirar[0] ;
         A2829BarProPer = P0ACL7_A2829BarProPer[0] ;
         A1235BarNumCli = P0ACL7_A1235BarNumCli[0] ;
         A161BarFecSal = P0ACL7_A161BarFecSal[0] ;
         A158BarFecFpr = P0ACL7_A158BarFecFpr[0] ;
         A155BarFecCli = P0ACL7_A155BarFecCli[0] ;
         A159BarFecGen = P0ACL7_A159BarFecGen[0] ;
         A213BarSit = P0ACL7_A213BarSit[0] ;
         A1234BarNomCli = P0ACL7_A1234BarNomCli[0] ;
         A136BarColNum = P0ACL7_A136BarColNum[0] ;
         A1652BarSerDsc = P0ACL7_A1652BarSerDsc[0] ;
         A212BarSer = P0ACL7_A212BarSer[0] ;
         A279CliNom = P0ACL7_A279CliNom[0] ;
         A252CliCod = P0ACL7_A252CliCod[0] ;
         n252CliCod = P0ACL7_n252CliCod[0] ;
         A143BarDisNum = P0ACL7_A143BarDisNum[0] ;
         A130BarCodPar = P0ACL7_A130BarCodPar[0] ;
         A132BarCodReo = P0ACL7_A132BarCodReo[0] ;
         A129BarCod = P0ACL7_A129BarCod[0] ;
         A279CliNom = P0ACL7_A279CliNom[0] ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0ACL7_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brkACL12 = false ;
            A396EmprCod = P0ACL7_A396EmprCod[0] ;
            A130BarCodPar = P0ACL7_A130BarCodPar[0] ;
            A132BarCodReo = P0ACL7_A132BarCodReo[0] ;
            A129BarCod = P0ACL7_A129BarCod[0] ;
            AV35count = (long)(AV35count+1) ;
            brkACL12 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV30Option = A135BarColNom ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACL12 )
         {
            brkACL12 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV61TFBarNomCli = AV42SearchTxt ;
      AV62TFBarNomCli_Sel = "" ;
      AV102Produccion_test_v01ds_1_tfbarcod = AV10TFBarCod ;
      AV103Produccion_test_v01ds_2_tfbarcod_to = AV11TFBarCod_To ;
      AV104Produccion_test_v01ds_3_tfbarcodreo = AV12TFBarCodReo ;
      AV105Produccion_test_v01ds_4_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV106Produccion_test_v01ds_5_tfbarcodpar = AV14TFBarCodPar ;
      AV107Produccion_test_v01ds_6_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV108Produccion_test_v01ds_7_tfbardisnum = AV16TFBarDisNum ;
      AV109Produccion_test_v01ds_8_tfbardisnum_sel = AV17TFBarDisNum_Sel ;
      AV110Produccion_test_v01ds_9_tfclicod = AV18TFCliCod ;
      AV111Produccion_test_v01ds_10_tfclicod_to = AV19TFCliCod_To ;
      AV112Produccion_test_v01ds_11_tfclinom = AV20TFCliNom ;
      AV113Produccion_test_v01ds_12_tfclinom_sel = AV21TFCliNom_Sel ;
      AV114Produccion_test_v01ds_13_tfbarser = AV22TFBarSer ;
      AV115Produccion_test_v01ds_14_tfbarser_sel = AV23TFBarSer_Sel ;
      AV116Produccion_test_v01ds_15_tfbarserdsc = AV24TFBarSerDsc ;
      AV117Produccion_test_v01ds_16_tfbarserdsc_sel = AV25TFBarSerDsc_Sel ;
      AV118Produccion_test_v01ds_17_tfbarcolnom = AV57TFBarColNom ;
      AV119Produccion_test_v01ds_18_tfbarcolnom_sel = AV58TFBarColNom_Sel ;
      AV120Produccion_test_v01ds_19_tfbarcolnum = AV59TFBarColNum ;
      AV121Produccion_test_v01ds_20_tfbarcolnum_to = AV60TFBarColNum_To ;
      AV122Produccion_test_v01ds_21_tfbarnomcli = AV61TFBarNomCli ;
      AV123Produccion_test_v01ds_22_tfbarnomcli_sel = AV62TFBarNomCli_Sel ;
      AV124Produccion_test_v01ds_23_tfbarsit = AV26TFBarSit ;
      AV125Produccion_test_v01ds_24_tfbarsit_to = AV27TFBarSit_To ;
      AV126Produccion_test_v01ds_25_tfbarfecgen = AV28TFBarFecGen ;
      AV127Produccion_test_v01ds_26_tfbarfeccli = AV54TFBarFecCli ;
      AV128Produccion_test_v01ds_27_tfbarfecfpr = AV67TFBarFecFpr ;
      AV129Produccion_test_v01ds_28_tfbarfecsal = AV56TFBarFecSal ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod) ,
                                           Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to) ,
                                           AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                           AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           AV108Produccion_test_v01ds_7_tfbardisnum ,
                                           Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod) ,
                                           Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to) ,
                                           AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                           AV112Produccion_test_v01ds_11_tfclinom ,
                                           AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                           AV114Produccion_test_v01ds_13_tfbarser ,
                                           AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                           AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to) ,
                                           AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit) ,
                                           Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to) ,
                                           AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                           AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                           AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                           AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV50CliCod) ,
                                           Integer.valueOf(AV51CliCodTo) ,
                                           AV63bardisnum ,
                                           AV65BarDisNumTo ,
                                           AV52BarFecGen ,
                                           AV53BarFecGenTo ,
                                           AV64BarFecCli ,
                                           AV66barfecclito ,
                                           AV68barfecsal ,
                                           AV69barfecsalto ,
                                           AV70BarFecFpr ,
                                           AV71barfecfprto ,
                                           AV72BarColNom ,
                                           AV76BarColNomto ,
                                           Integer.valueOf(AV73BarColnum) ,
                                           Integer.valueOf(AV77BarColNumto) ,
                                           AV74BarNomCli ,
                                           AV78BarNomClito ,
                                           Integer.valueOf(AV75BarNumCli) ,
                                           Integer.valueOf(AV79Barnumclito) ,
                                           Integer.valueOf(AV80BarCod) ,
                                           Integer.valueOf(AV84BarCodto) ,
                                           Byte.valueOf(AV81BarCodreo) ,
                                           Byte.valueOf(AV85BarCodreoto) ,
                                           AV82BarCodpar ,
                                           AV86BarCodparto ,
                                           AV83Cod_idtx ,
                                           AV87BarGirar ,
                                           Short.valueOf(AV94BarTipArt) ,
                                           Short.valueOf(AV95BarTipArtto) ,
                                           AV96BarSer ,
                                           AV97BarSerto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Byte.valueOf(AV48BarSit) ,
                                           Byte.valueOf(AV49BarSitTo) ,
                                           A396EmprCod ,
                                           AV47EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Produccion_test_v01ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV106Produccion_test_v01ds_5_tfbarcodpar), 1, "%") ;
      lV108Produccion_test_v01ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV108Produccion_test_v01ds_7_tfbardisnum), 8, "%") ;
      lV112Produccion_test_v01ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV112Produccion_test_v01ds_11_tfclinom), 30, "%") ;
      lV114Produccion_test_v01ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV114Produccion_test_v01ds_13_tfbarser), 16, "%") ;
      lV116Produccion_test_v01ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV116Produccion_test_v01ds_15_tfbarserdsc), 26, "%") ;
      lV118Produccion_test_v01ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV118Produccion_test_v01ds_17_tfbarcolnom), 13, "%") ;
      lV122Produccion_test_v01ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV122Produccion_test_v01ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor P0ACL8 */
      pr_default.execute(6, new Object[] {Byte.valueOf(AV48BarSit), Byte.valueOf(AV49BarSitTo), AV47EmprCod, Integer.valueOf(AV102Produccion_test_v01ds_1_tfbarcod), Integer.valueOf(AV103Produccion_test_v01ds_2_tfbarcod_to), Byte.valueOf(AV104Produccion_test_v01ds_3_tfbarcodreo), Byte.valueOf(AV105Produccion_test_v01ds_4_tfbarcodreo_to), lV106Produccion_test_v01ds_5_tfbarcodpar, AV107Produccion_test_v01ds_6_tfbarcodpar_sel, lV108Produccion_test_v01ds_7_tfbardisnum, AV109Produccion_test_v01ds_8_tfbardisnum_sel, Integer.valueOf(AV110Produccion_test_v01ds_9_tfclicod), Integer.valueOf(AV111Produccion_test_v01ds_10_tfclicod_to), lV112Produccion_test_v01ds_11_tfclinom, AV113Produccion_test_v01ds_12_tfclinom_sel, lV114Produccion_test_v01ds_13_tfbarser, AV115Produccion_test_v01ds_14_tfbarser_sel, lV116Produccion_test_v01ds_15_tfbarserdsc, AV117Produccion_test_v01ds_16_tfbarserdsc_sel, lV118Produccion_test_v01ds_17_tfbarcolnom, AV119Produccion_test_v01ds_18_tfbarcolnom_sel, Integer.valueOf(AV120Produccion_test_v01ds_19_tfbarcolnum), Integer.valueOf(AV121Produccion_test_v01ds_20_tfbarcolnum_to), lV122Produccion_test_v01ds_21_tfbarnomcli, AV123Produccion_test_v01ds_22_tfbarnomcli_sel, Byte.valueOf(AV124Produccion_test_v01ds_23_tfbarsit), Byte.valueOf(AV125Produccion_test_v01ds_24_tfbarsit_to), AV126Produccion_test_v01ds_25_tfbarfecgen, AV127Produccion_test_v01ds_26_tfbarfeccli, AV128Produccion_test_v01ds_27_tfbarfecfpr, AV129Produccion_test_v01ds_28_tfbarfecsal, Integer.valueOf(AV50CliCod), Integer.valueOf(AV51CliCodTo), AV63bardisnum, AV65BarDisNumTo, AV52BarFecGen, AV53BarFecGenTo, AV64BarFecCli, AV66barfecclito, AV68barfecsal, AV69barfecsalto, AV70BarFecFpr, AV71barfecfprto, AV72BarColNom, AV76BarColNomto, Integer.valueOf(AV73BarColnum), Integer.valueOf(AV77BarColNumto), AV74BarNomCli, AV78BarNomClito, Integer.valueOf(AV75BarNumCli), Integer.valueOf(AV79Barnumclito), Integer.valueOf(AV80BarCod), Integer.valueOf(AV84BarCodto), Byte.valueOf(AV81BarCodreo), Byte.valueOf(AV85BarCodreoto), AV82BarCodpar, AV86BarCodparto, AV83Cod_idtx, AV87BarGirar, Short.valueOf(AV94BarTipArt), Short.valueOf(AV95BarTipArtto), AV96BarSer, AV97BarSerto});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkACL14 = false ;
         A396EmprCod = P0ACL8_A396EmprCod[0] ;
         A1234BarNomCli = P0ACL8_A1234BarNomCli[0] ;
         A217BarTipArt = P0ACL8_A217BarTipArt[0] ;
         n217BarTipArt = P0ACL8_n217BarTipArt[0] ;
         A2454BarGirar = P0ACL8_A2454BarGirar[0] ;
         A2829BarProPer = P0ACL8_A2829BarProPer[0] ;
         A1235BarNumCli = P0ACL8_A1235BarNumCli[0] ;
         A161BarFecSal = P0ACL8_A161BarFecSal[0] ;
         A158BarFecFpr = P0ACL8_A158BarFecFpr[0] ;
         A155BarFecCli = P0ACL8_A155BarFecCli[0] ;
         A159BarFecGen = P0ACL8_A159BarFecGen[0] ;
         A213BarSit = P0ACL8_A213BarSit[0] ;
         A136BarColNum = P0ACL8_A136BarColNum[0] ;
         A135BarColNom = P0ACL8_A135BarColNom[0] ;
         A1652BarSerDsc = P0ACL8_A1652BarSerDsc[0] ;
         A212BarSer = P0ACL8_A212BarSer[0] ;
         A279CliNom = P0ACL8_A279CliNom[0] ;
         A252CliCod = P0ACL8_A252CliCod[0] ;
         n252CliCod = P0ACL8_n252CliCod[0] ;
         A143BarDisNum = P0ACL8_A143BarDisNum[0] ;
         A130BarCodPar = P0ACL8_A130BarCodPar[0] ;
         A132BarCodReo = P0ACL8_A132BarCodReo[0] ;
         A129BarCod = P0ACL8_A129BarCod[0] ;
         A279CliNom = P0ACL8_A279CliNom[0] ;
         AV35count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0ACL8_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brkACL14 = false ;
            A396EmprCod = P0ACL8_A396EmprCod[0] ;
            A130BarCodPar = P0ACL8_A130BarCodPar[0] ;
            A132BarCodReo = P0ACL8_A132BarCodReo[0] ;
            A129BarCod = P0ACL8_A129BarCod[0] ;
            AV35count = (long)(AV35count+1) ;
            brkACL14 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV30Option = A1234BarNomCli ;
            AV31Options.add(AV30Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV35count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV31Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACL14 )
         {
            brkACL14 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = test_v01getfilterdata.this.AV44OptionsJson;
      this.aP4[0] = test_v01getfilterdata.this.AV45OptionsDescJson;
      this.aP5[0] = test_v01getfilterdata.this.AV46OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV44OptionsJson = "" ;
      AV45OptionsDescJson = "" ;
      AV46OptionIndexesJson = "" ;
      AV31Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV33OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV14TFBarCodPar = "" ;
      AV15TFBarCodPar_Sel = "" ;
      AV16TFBarDisNum = "" ;
      AV17TFBarDisNum_Sel = "" ;
      AV20TFCliNom = "" ;
      AV21TFCliNom_Sel = "" ;
      AV22TFBarSer = "" ;
      AV23TFBarSer_Sel = "" ;
      AV24TFBarSerDsc = "" ;
      AV25TFBarSerDsc_Sel = "" ;
      AV57TFBarColNom = "" ;
      AV58TFBarColNom_Sel = "" ;
      AV61TFBarNomCli = "" ;
      AV62TFBarNomCli_Sel = "" ;
      AV28TFBarFecGen = GXutil.nullDate() ;
      AV54TFBarFecCli = GXutil.nullDate() ;
      AV67TFBarFecFpr = GXutil.nullDate() ;
      AV56TFBarFecSal = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      AV106Produccion_test_v01ds_5_tfbarcodpar = "" ;
      AV107Produccion_test_v01ds_6_tfbarcodpar_sel = "" ;
      AV108Produccion_test_v01ds_7_tfbardisnum = "" ;
      AV109Produccion_test_v01ds_8_tfbardisnum_sel = "" ;
      AV112Produccion_test_v01ds_11_tfclinom = "" ;
      AV113Produccion_test_v01ds_12_tfclinom_sel = "" ;
      AV114Produccion_test_v01ds_13_tfbarser = "" ;
      AV115Produccion_test_v01ds_14_tfbarser_sel = "" ;
      AV116Produccion_test_v01ds_15_tfbarserdsc = "" ;
      AV117Produccion_test_v01ds_16_tfbarserdsc_sel = "" ;
      AV118Produccion_test_v01ds_17_tfbarcolnom = "" ;
      AV119Produccion_test_v01ds_18_tfbarcolnom_sel = "" ;
      AV122Produccion_test_v01ds_21_tfbarnomcli = "" ;
      AV123Produccion_test_v01ds_22_tfbarnomcli_sel = "" ;
      AV126Produccion_test_v01ds_25_tfbarfecgen = GXutil.nullDate() ;
      AV127Produccion_test_v01ds_26_tfbarfeccli = GXutil.nullDate() ;
      AV128Produccion_test_v01ds_27_tfbarfecfpr = GXutil.nullDate() ;
      AV129Produccion_test_v01ds_28_tfbarfecsal = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV106Produccion_test_v01ds_5_tfbarcodpar = "" ;
      lV108Produccion_test_v01ds_7_tfbardisnum = "" ;
      lV112Produccion_test_v01ds_11_tfclinom = "" ;
      lV114Produccion_test_v01ds_13_tfbarser = "" ;
      lV116Produccion_test_v01ds_15_tfbarserdsc = "" ;
      lV118Produccion_test_v01ds_17_tfbarcolnom = "" ;
      lV122Produccion_test_v01ds_21_tfbarnomcli = "" ;
      AV63bardisnum = "" ;
      AV65BarDisNumTo = "" ;
      AV52BarFecGen = GXutil.nullDate() ;
      AV53BarFecGenTo = GXutil.nullDate() ;
      AV64BarFecCli = GXutil.nullDate() ;
      AV66barfecclito = GXutil.nullDate() ;
      AV68barfecsal = GXutil.nullDate() ;
      AV69barfecsalto = GXutil.nullDate() ;
      AV70BarFecFpr = GXutil.nullDate() ;
      AV71barfecfprto = GXutil.nullDate() ;
      AV72BarColNom = "" ;
      AV76BarColNomto = "" ;
      AV74BarNomCli = "" ;
      AV78BarNomClito = "" ;
      AV82BarCodpar = "" ;
      AV86BarCodparto = "" ;
      AV83Cod_idtx = "" ;
      AV87BarGirar = "" ;
      AV96BarSer = "" ;
      AV97BarSerto = "" ;
      A143BarDisNum = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A2829BarProPer = "" ;
      A2454BarGirar = "" ;
      A396EmprCod = "" ;
      AV47EmprCod = "" ;
      P0ACL2_A396EmprCod = new String[] {""} ;
      P0ACL2_A130BarCodPar = new String[] {""} ;
      P0ACL2_A217BarTipArt = new short[1] ;
      P0ACL2_n217BarTipArt = new boolean[] {false} ;
      P0ACL2_A2454BarGirar = new String[] {""} ;
      P0ACL2_A2829BarProPer = new String[] {""} ;
      P0ACL2_A1235BarNumCli = new int[1] ;
      P0ACL2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL2_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL2_A213BarSit = new byte[1] ;
      P0ACL2_A1234BarNomCli = new String[] {""} ;
      P0ACL2_A136BarColNum = new int[1] ;
      P0ACL2_A135BarColNom = new String[] {""} ;
      P0ACL2_A1652BarSerDsc = new String[] {""} ;
      P0ACL2_A212BarSer = new String[] {""} ;
      P0ACL2_A279CliNom = new String[] {""} ;
      P0ACL2_A252CliCod = new int[1] ;
      P0ACL2_n252CliCod = new boolean[] {false} ;
      P0ACL2_A143BarDisNum = new String[] {""} ;
      P0ACL2_A132BarCodReo = new byte[1] ;
      P0ACL2_A129BarCod = new int[1] ;
      AV30Option = "" ;
      P0ACL3_A396EmprCod = new String[] {""} ;
      P0ACL3_A143BarDisNum = new String[] {""} ;
      P0ACL3_A217BarTipArt = new short[1] ;
      P0ACL3_n217BarTipArt = new boolean[] {false} ;
      P0ACL3_A2454BarGirar = new String[] {""} ;
      P0ACL3_A2829BarProPer = new String[] {""} ;
      P0ACL3_A1235BarNumCli = new int[1] ;
      P0ACL3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL3_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL3_A213BarSit = new byte[1] ;
      P0ACL3_A1234BarNomCli = new String[] {""} ;
      P0ACL3_A136BarColNum = new int[1] ;
      P0ACL3_A135BarColNom = new String[] {""} ;
      P0ACL3_A1652BarSerDsc = new String[] {""} ;
      P0ACL3_A212BarSer = new String[] {""} ;
      P0ACL3_A279CliNom = new String[] {""} ;
      P0ACL3_A252CliCod = new int[1] ;
      P0ACL3_n252CliCod = new boolean[] {false} ;
      P0ACL3_A130BarCodPar = new String[] {""} ;
      P0ACL3_A132BarCodReo = new byte[1] ;
      P0ACL3_A129BarCod = new int[1] ;
      P0ACL4_A396EmprCod = new String[] {""} ;
      P0ACL4_A279CliNom = new String[] {""} ;
      P0ACL4_A217BarTipArt = new short[1] ;
      P0ACL4_n217BarTipArt = new boolean[] {false} ;
      P0ACL4_A2454BarGirar = new String[] {""} ;
      P0ACL4_A2829BarProPer = new String[] {""} ;
      P0ACL4_A1235BarNumCli = new int[1] ;
      P0ACL4_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL4_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL4_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL4_A213BarSit = new byte[1] ;
      P0ACL4_A1234BarNomCli = new String[] {""} ;
      P0ACL4_A136BarColNum = new int[1] ;
      P0ACL4_A135BarColNom = new String[] {""} ;
      P0ACL4_A1652BarSerDsc = new String[] {""} ;
      P0ACL4_A212BarSer = new String[] {""} ;
      P0ACL4_A252CliCod = new int[1] ;
      P0ACL4_n252CliCod = new boolean[] {false} ;
      P0ACL4_A143BarDisNum = new String[] {""} ;
      P0ACL4_A130BarCodPar = new String[] {""} ;
      P0ACL4_A132BarCodReo = new byte[1] ;
      P0ACL4_A129BarCod = new int[1] ;
      P0ACL5_A396EmprCod = new String[] {""} ;
      P0ACL5_A212BarSer = new String[] {""} ;
      P0ACL5_A217BarTipArt = new short[1] ;
      P0ACL5_n217BarTipArt = new boolean[] {false} ;
      P0ACL5_A2454BarGirar = new String[] {""} ;
      P0ACL5_A2829BarProPer = new String[] {""} ;
      P0ACL5_A1235BarNumCli = new int[1] ;
      P0ACL5_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL5_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL5_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL5_A213BarSit = new byte[1] ;
      P0ACL5_A1234BarNomCli = new String[] {""} ;
      P0ACL5_A136BarColNum = new int[1] ;
      P0ACL5_A135BarColNom = new String[] {""} ;
      P0ACL5_A1652BarSerDsc = new String[] {""} ;
      P0ACL5_A279CliNom = new String[] {""} ;
      P0ACL5_A252CliCod = new int[1] ;
      P0ACL5_n252CliCod = new boolean[] {false} ;
      P0ACL5_A143BarDisNum = new String[] {""} ;
      P0ACL5_A130BarCodPar = new String[] {""} ;
      P0ACL5_A132BarCodReo = new byte[1] ;
      P0ACL5_A129BarCod = new int[1] ;
      P0ACL6_A396EmprCod = new String[] {""} ;
      P0ACL6_A1652BarSerDsc = new String[] {""} ;
      P0ACL6_A217BarTipArt = new short[1] ;
      P0ACL6_n217BarTipArt = new boolean[] {false} ;
      P0ACL6_A2454BarGirar = new String[] {""} ;
      P0ACL6_A2829BarProPer = new String[] {""} ;
      P0ACL6_A1235BarNumCli = new int[1] ;
      P0ACL6_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL6_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL6_A213BarSit = new byte[1] ;
      P0ACL6_A1234BarNomCli = new String[] {""} ;
      P0ACL6_A136BarColNum = new int[1] ;
      P0ACL6_A135BarColNom = new String[] {""} ;
      P0ACL6_A212BarSer = new String[] {""} ;
      P0ACL6_A279CliNom = new String[] {""} ;
      P0ACL6_A252CliCod = new int[1] ;
      P0ACL6_n252CliCod = new boolean[] {false} ;
      P0ACL6_A143BarDisNum = new String[] {""} ;
      P0ACL6_A130BarCodPar = new String[] {""} ;
      P0ACL6_A132BarCodReo = new byte[1] ;
      P0ACL6_A129BarCod = new int[1] ;
      P0ACL7_A396EmprCod = new String[] {""} ;
      P0ACL7_A135BarColNom = new String[] {""} ;
      P0ACL7_A217BarTipArt = new short[1] ;
      P0ACL7_n217BarTipArt = new boolean[] {false} ;
      P0ACL7_A2454BarGirar = new String[] {""} ;
      P0ACL7_A2829BarProPer = new String[] {""} ;
      P0ACL7_A1235BarNumCli = new int[1] ;
      P0ACL7_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL7_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL7_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL7_A213BarSit = new byte[1] ;
      P0ACL7_A1234BarNomCli = new String[] {""} ;
      P0ACL7_A136BarColNum = new int[1] ;
      P0ACL7_A1652BarSerDsc = new String[] {""} ;
      P0ACL7_A212BarSer = new String[] {""} ;
      P0ACL7_A279CliNom = new String[] {""} ;
      P0ACL7_A252CliCod = new int[1] ;
      P0ACL7_n252CliCod = new boolean[] {false} ;
      P0ACL7_A143BarDisNum = new String[] {""} ;
      P0ACL7_A130BarCodPar = new String[] {""} ;
      P0ACL7_A132BarCodReo = new byte[1] ;
      P0ACL7_A129BarCod = new int[1] ;
      P0ACL8_A396EmprCod = new String[] {""} ;
      P0ACL8_A1234BarNomCli = new String[] {""} ;
      P0ACL8_A217BarTipArt = new short[1] ;
      P0ACL8_n217BarTipArt = new boolean[] {false} ;
      P0ACL8_A2454BarGirar = new String[] {""} ;
      P0ACL8_A2829BarProPer = new String[] {""} ;
      P0ACL8_A1235BarNumCli = new int[1] ;
      P0ACL8_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL8_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL8_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL8_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ACL8_A213BarSit = new byte[1] ;
      P0ACL8_A136BarColNum = new int[1] ;
      P0ACL8_A135BarColNom = new String[] {""} ;
      P0ACL8_A1652BarSerDsc = new String[] {""} ;
      P0ACL8_A212BarSer = new String[] {""} ;
      P0ACL8_A279CliNom = new String[] {""} ;
      P0ACL8_A252CliCod = new int[1] ;
      P0ACL8_n252CliCod = new boolean[] {false} ;
      P0ACL8_A143BarDisNum = new String[] {""} ;
      P0ACL8_A130BarCodPar = new String[] {""} ;
      P0ACL8_A132BarCodReo = new byte[1] ;
      P0ACL8_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.test_v01getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ACL2_A396EmprCod, P0ACL2_A130BarCodPar, P0ACL2_A217BarTipArt, P0ACL2_n217BarTipArt, P0ACL2_A2454BarGirar, P0ACL2_A2829BarProPer, P0ACL2_A1235BarNumCli, P0ACL2_A161BarFecSal, P0ACL2_A158BarFecFpr, P0ACL2_A155BarFecCli,
            P0ACL2_A159BarFecGen, P0ACL2_A213BarSit, P0ACL2_A1234BarNomCli, P0ACL2_A136BarColNum, P0ACL2_A135BarColNom, P0ACL2_A1652BarSerDsc, P0ACL2_A212BarSer, P0ACL2_A279CliNom, P0ACL2_A252CliCod, P0ACL2_n252CliCod,
            P0ACL2_A143BarDisNum, P0ACL2_A132BarCodReo, P0ACL2_A129BarCod
            }
            , new Object[] {
            P0ACL3_A396EmprCod, P0ACL3_A143BarDisNum, P0ACL3_A217BarTipArt, P0ACL3_n217BarTipArt, P0ACL3_A2454BarGirar, P0ACL3_A2829BarProPer, P0ACL3_A1235BarNumCli, P0ACL3_A161BarFecSal, P0ACL3_A158BarFecFpr, P0ACL3_A155BarFecCli,
            P0ACL3_A159BarFecGen, P0ACL3_A213BarSit, P0ACL3_A1234BarNomCli, P0ACL3_A136BarColNum, P0ACL3_A135BarColNom, P0ACL3_A1652BarSerDsc, P0ACL3_A212BarSer, P0ACL3_A279CliNom, P0ACL3_A252CliCod, P0ACL3_n252CliCod,
            P0ACL3_A130BarCodPar, P0ACL3_A132BarCodReo, P0ACL3_A129BarCod
            }
            , new Object[] {
            P0ACL4_A396EmprCod, P0ACL4_A279CliNom, P0ACL4_A217BarTipArt, P0ACL4_n217BarTipArt, P0ACL4_A2454BarGirar, P0ACL4_A2829BarProPer, P0ACL4_A1235BarNumCli, P0ACL4_A161BarFecSal, P0ACL4_A158BarFecFpr, P0ACL4_A155BarFecCli,
            P0ACL4_A159BarFecGen, P0ACL4_A213BarSit, P0ACL4_A1234BarNomCli, P0ACL4_A136BarColNum, P0ACL4_A135BarColNom, P0ACL4_A1652BarSerDsc, P0ACL4_A212BarSer, P0ACL4_A252CliCod, P0ACL4_n252CliCod, P0ACL4_A143BarDisNum,
            P0ACL4_A130BarCodPar, P0ACL4_A132BarCodReo, P0ACL4_A129BarCod
            }
            , new Object[] {
            P0ACL5_A396EmprCod, P0ACL5_A212BarSer, P0ACL5_A217BarTipArt, P0ACL5_n217BarTipArt, P0ACL5_A2454BarGirar, P0ACL5_A2829BarProPer, P0ACL5_A1235BarNumCli, P0ACL5_A161BarFecSal, P0ACL5_A158BarFecFpr, P0ACL5_A155BarFecCli,
            P0ACL5_A159BarFecGen, P0ACL5_A213BarSit, P0ACL5_A1234BarNomCli, P0ACL5_A136BarColNum, P0ACL5_A135BarColNom, P0ACL5_A1652BarSerDsc, P0ACL5_A279CliNom, P0ACL5_A252CliCod, P0ACL5_n252CliCod, P0ACL5_A143BarDisNum,
            P0ACL5_A130BarCodPar, P0ACL5_A132BarCodReo, P0ACL5_A129BarCod
            }
            , new Object[] {
            P0ACL6_A396EmprCod, P0ACL6_A1652BarSerDsc, P0ACL6_A217BarTipArt, P0ACL6_n217BarTipArt, P0ACL6_A2454BarGirar, P0ACL6_A2829BarProPer, P0ACL6_A1235BarNumCli, P0ACL6_A161BarFecSal, P0ACL6_A158BarFecFpr, P0ACL6_A155BarFecCli,
            P0ACL6_A159BarFecGen, P0ACL6_A213BarSit, P0ACL6_A1234BarNomCli, P0ACL6_A136BarColNum, P0ACL6_A135BarColNom, P0ACL6_A212BarSer, P0ACL6_A279CliNom, P0ACL6_A252CliCod, P0ACL6_n252CliCod, P0ACL6_A143BarDisNum,
            P0ACL6_A130BarCodPar, P0ACL6_A132BarCodReo, P0ACL6_A129BarCod
            }
            , new Object[] {
            P0ACL7_A396EmprCod, P0ACL7_A135BarColNom, P0ACL7_A217BarTipArt, P0ACL7_n217BarTipArt, P0ACL7_A2454BarGirar, P0ACL7_A2829BarProPer, P0ACL7_A1235BarNumCli, P0ACL7_A161BarFecSal, P0ACL7_A158BarFecFpr, P0ACL7_A155BarFecCli,
            P0ACL7_A159BarFecGen, P0ACL7_A213BarSit, P0ACL7_A1234BarNomCli, P0ACL7_A136BarColNum, P0ACL7_A1652BarSerDsc, P0ACL7_A212BarSer, P0ACL7_A279CliNom, P0ACL7_A252CliCod, P0ACL7_n252CliCod, P0ACL7_A143BarDisNum,
            P0ACL7_A130BarCodPar, P0ACL7_A132BarCodReo, P0ACL7_A129BarCod
            }
            , new Object[] {
            P0ACL8_A396EmprCod, P0ACL8_A1234BarNomCli, P0ACL8_A217BarTipArt, P0ACL8_n217BarTipArt, P0ACL8_A2454BarGirar, P0ACL8_A2829BarProPer, P0ACL8_A1235BarNumCli, P0ACL8_A161BarFecSal, P0ACL8_A158BarFecFpr, P0ACL8_A155BarFecCli,
            P0ACL8_A159BarFecGen, P0ACL8_A213BarSit, P0ACL8_A136BarColNum, P0ACL8_A135BarColNom, P0ACL8_A1652BarSerDsc, P0ACL8_A212BarSer, P0ACL8_A279CliNom, P0ACL8_A252CliCod, P0ACL8_n252CliCod, P0ACL8_A143BarDisNum,
            P0ACL8_A130BarCodPar, P0ACL8_A132BarCodReo, P0ACL8_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TFBarCodReo ;
   private byte AV13TFBarCodReo_To ;
   private byte AV26TFBarSit ;
   private byte AV27TFBarSit_To ;
   private byte AV104Produccion_test_v01ds_3_tfbarcodreo ;
   private byte AV105Produccion_test_v01ds_4_tfbarcodreo_to ;
   private byte AV124Produccion_test_v01ds_23_tfbarsit ;
   private byte AV125Produccion_test_v01ds_24_tfbarsit_to ;
   private byte AV81BarCodreo ;
   private byte AV85BarCodreoto ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV48BarSit ;
   private byte AV49BarSitTo ;
   private short AV94BarTipArt ;
   private short AV95BarTipArtto ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV100GXV1 ;
   private int AV10TFBarCod ;
   private int AV11TFBarCod_To ;
   private int AV18TFCliCod ;
   private int AV19TFCliCod_To ;
   private int AV59TFBarColNum ;
   private int AV60TFBarColNum_To ;
   private int AV102Produccion_test_v01ds_1_tfbarcod ;
   private int AV103Produccion_test_v01ds_2_tfbarcod_to ;
   private int AV110Produccion_test_v01ds_9_tfclicod ;
   private int AV111Produccion_test_v01ds_10_tfclicod_to ;
   private int AV120Produccion_test_v01ds_19_tfbarcolnum ;
   private int AV121Produccion_test_v01ds_20_tfbarcolnum_to ;
   private int AV50CliCod ;
   private int AV51CliCodTo ;
   private int AV73BarColnum ;
   private int AV77BarColNumto ;
   private int AV75BarNumCli ;
   private int AV79Barnumclito ;
   private int AV80BarCod ;
   private int AV84BarCodto ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private long AV35count ;
   private String AV14TFBarCodPar ;
   private String AV15TFBarCodPar_Sel ;
   private String AV16TFBarDisNum ;
   private String AV17TFBarDisNum_Sel ;
   private String AV20TFCliNom ;
   private String AV21TFCliNom_Sel ;
   private String AV22TFBarSer ;
   private String AV23TFBarSer_Sel ;
   private String AV24TFBarSerDsc ;
   private String AV25TFBarSerDsc_Sel ;
   private String AV57TFBarColNom ;
   private String AV58TFBarColNom_Sel ;
   private String AV61TFBarNomCli ;
   private String AV62TFBarNomCli_Sel ;
   private String A130BarCodPar ;
   private String AV106Produccion_test_v01ds_5_tfbarcodpar ;
   private String AV107Produccion_test_v01ds_6_tfbarcodpar_sel ;
   private String AV108Produccion_test_v01ds_7_tfbardisnum ;
   private String AV109Produccion_test_v01ds_8_tfbardisnum_sel ;
   private String AV112Produccion_test_v01ds_11_tfclinom ;
   private String AV113Produccion_test_v01ds_12_tfclinom_sel ;
   private String AV114Produccion_test_v01ds_13_tfbarser ;
   private String AV115Produccion_test_v01ds_14_tfbarser_sel ;
   private String AV116Produccion_test_v01ds_15_tfbarserdsc ;
   private String AV117Produccion_test_v01ds_16_tfbarserdsc_sel ;
   private String AV118Produccion_test_v01ds_17_tfbarcolnom ;
   private String AV119Produccion_test_v01ds_18_tfbarcolnom_sel ;
   private String AV122Produccion_test_v01ds_21_tfbarnomcli ;
   private String AV123Produccion_test_v01ds_22_tfbarnomcli_sel ;
   private String scmdbuf ;
   private String lV106Produccion_test_v01ds_5_tfbarcodpar ;
   private String lV108Produccion_test_v01ds_7_tfbardisnum ;
   private String lV112Produccion_test_v01ds_11_tfclinom ;
   private String lV114Produccion_test_v01ds_13_tfbarser ;
   private String lV116Produccion_test_v01ds_15_tfbarserdsc ;
   private String lV118Produccion_test_v01ds_17_tfbarcolnom ;
   private String lV122Produccion_test_v01ds_21_tfbarnomcli ;
   private String AV63bardisnum ;
   private String AV65BarDisNumTo ;
   private String AV72BarColNom ;
   private String AV76BarColNomto ;
   private String AV74BarNomCli ;
   private String AV78BarNomClito ;
   private String AV82BarCodpar ;
   private String AV86BarCodparto ;
   private String AV83Cod_idtx ;
   private String AV87BarGirar ;
   private String AV96BarSer ;
   private String AV97BarSerto ;
   private String A143BarDisNum ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A2829BarProPer ;
   private String A2454BarGirar ;
   private String A396EmprCod ;
   private String AV47EmprCod ;
   private java.util.Date AV28TFBarFecGen ;
   private java.util.Date AV54TFBarFecCli ;
   private java.util.Date AV67TFBarFecFpr ;
   private java.util.Date AV56TFBarFecSal ;
   private java.util.Date AV126Produccion_test_v01ds_25_tfbarfecgen ;
   private java.util.Date AV127Produccion_test_v01ds_26_tfbarfeccli ;
   private java.util.Date AV128Produccion_test_v01ds_27_tfbarfecfpr ;
   private java.util.Date AV129Produccion_test_v01ds_28_tfbarfecsal ;
   private java.util.Date AV52BarFecGen ;
   private java.util.Date AV53BarFecGenTo ;
   private java.util.Date AV64BarFecCli ;
   private java.util.Date AV66barfecclito ;
   private java.util.Date AV68barfecsal ;
   private java.util.Date AV69barfecsalto ;
   private java.util.Date AV70BarFecFpr ;
   private java.util.Date AV71barfecfprto ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A161BarFecSal ;
   private boolean returnInSub ;
   private boolean brkACL2 ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean brkACL4 ;
   private boolean brkACL6 ;
   private boolean brkACL8 ;
   private boolean brkACL10 ;
   private boolean brkACL12 ;
   private boolean brkACL14 ;
   private String AV44OptionsJson ;
   private String AV45OptionsDescJson ;
   private String AV46OptionIndexesJson ;
   private String AV41DDOName ;
   private String AV42SearchTxt ;
   private String AV43SearchTxtTo ;
   private String AV30Option ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ACL2_A396EmprCod ;
   private String[] P0ACL2_A130BarCodPar ;
   private short[] P0ACL2_A217BarTipArt ;
   private boolean[] P0ACL2_n217BarTipArt ;
   private String[] P0ACL2_A2454BarGirar ;
   private String[] P0ACL2_A2829BarProPer ;
   private int[] P0ACL2_A1235BarNumCli ;
   private java.util.Date[] P0ACL2_A161BarFecSal ;
   private java.util.Date[] P0ACL2_A158BarFecFpr ;
   private java.util.Date[] P0ACL2_A155BarFecCli ;
   private java.util.Date[] P0ACL2_A159BarFecGen ;
   private byte[] P0ACL2_A213BarSit ;
   private String[] P0ACL2_A1234BarNomCli ;
   private int[] P0ACL2_A136BarColNum ;
   private String[] P0ACL2_A135BarColNom ;
   private String[] P0ACL2_A1652BarSerDsc ;
   private String[] P0ACL2_A212BarSer ;
   private String[] P0ACL2_A279CliNom ;
   private int[] P0ACL2_A252CliCod ;
   private boolean[] P0ACL2_n252CliCod ;
   private String[] P0ACL2_A143BarDisNum ;
   private byte[] P0ACL2_A132BarCodReo ;
   private int[] P0ACL2_A129BarCod ;
   private String[] P0ACL3_A396EmprCod ;
   private String[] P0ACL3_A143BarDisNum ;
   private short[] P0ACL3_A217BarTipArt ;
   private boolean[] P0ACL3_n217BarTipArt ;
   private String[] P0ACL3_A2454BarGirar ;
   private String[] P0ACL3_A2829BarProPer ;
   private int[] P0ACL3_A1235BarNumCli ;
   private java.util.Date[] P0ACL3_A161BarFecSal ;
   private java.util.Date[] P0ACL3_A158BarFecFpr ;
   private java.util.Date[] P0ACL3_A155BarFecCli ;
   private java.util.Date[] P0ACL3_A159BarFecGen ;
   private byte[] P0ACL3_A213BarSit ;
   private String[] P0ACL3_A1234BarNomCli ;
   private int[] P0ACL3_A136BarColNum ;
   private String[] P0ACL3_A135BarColNom ;
   private String[] P0ACL3_A1652BarSerDsc ;
   private String[] P0ACL3_A212BarSer ;
   private String[] P0ACL3_A279CliNom ;
   private int[] P0ACL3_A252CliCod ;
   private boolean[] P0ACL3_n252CliCod ;
   private String[] P0ACL3_A130BarCodPar ;
   private byte[] P0ACL3_A132BarCodReo ;
   private int[] P0ACL3_A129BarCod ;
   private String[] P0ACL4_A396EmprCod ;
   private String[] P0ACL4_A279CliNom ;
   private short[] P0ACL4_A217BarTipArt ;
   private boolean[] P0ACL4_n217BarTipArt ;
   private String[] P0ACL4_A2454BarGirar ;
   private String[] P0ACL4_A2829BarProPer ;
   private int[] P0ACL4_A1235BarNumCli ;
   private java.util.Date[] P0ACL4_A161BarFecSal ;
   private java.util.Date[] P0ACL4_A158BarFecFpr ;
   private java.util.Date[] P0ACL4_A155BarFecCli ;
   private java.util.Date[] P0ACL4_A159BarFecGen ;
   private byte[] P0ACL4_A213BarSit ;
   private String[] P0ACL4_A1234BarNomCli ;
   private int[] P0ACL4_A136BarColNum ;
   private String[] P0ACL4_A135BarColNom ;
   private String[] P0ACL4_A1652BarSerDsc ;
   private String[] P0ACL4_A212BarSer ;
   private int[] P0ACL4_A252CliCod ;
   private boolean[] P0ACL4_n252CliCod ;
   private String[] P0ACL4_A143BarDisNum ;
   private String[] P0ACL4_A130BarCodPar ;
   private byte[] P0ACL4_A132BarCodReo ;
   private int[] P0ACL4_A129BarCod ;
   private String[] P0ACL5_A396EmprCod ;
   private String[] P0ACL5_A212BarSer ;
   private short[] P0ACL5_A217BarTipArt ;
   private boolean[] P0ACL5_n217BarTipArt ;
   private String[] P0ACL5_A2454BarGirar ;
   private String[] P0ACL5_A2829BarProPer ;
   private int[] P0ACL5_A1235BarNumCli ;
   private java.util.Date[] P0ACL5_A161BarFecSal ;
   private java.util.Date[] P0ACL5_A158BarFecFpr ;
   private java.util.Date[] P0ACL5_A155BarFecCli ;
   private java.util.Date[] P0ACL5_A159BarFecGen ;
   private byte[] P0ACL5_A213BarSit ;
   private String[] P0ACL5_A1234BarNomCli ;
   private int[] P0ACL5_A136BarColNum ;
   private String[] P0ACL5_A135BarColNom ;
   private String[] P0ACL5_A1652BarSerDsc ;
   private String[] P0ACL5_A279CliNom ;
   private int[] P0ACL5_A252CliCod ;
   private boolean[] P0ACL5_n252CliCod ;
   private String[] P0ACL5_A143BarDisNum ;
   private String[] P0ACL5_A130BarCodPar ;
   private byte[] P0ACL5_A132BarCodReo ;
   private int[] P0ACL5_A129BarCod ;
   private String[] P0ACL6_A396EmprCod ;
   private String[] P0ACL6_A1652BarSerDsc ;
   private short[] P0ACL6_A217BarTipArt ;
   private boolean[] P0ACL6_n217BarTipArt ;
   private String[] P0ACL6_A2454BarGirar ;
   private String[] P0ACL6_A2829BarProPer ;
   private int[] P0ACL6_A1235BarNumCli ;
   private java.util.Date[] P0ACL6_A161BarFecSal ;
   private java.util.Date[] P0ACL6_A158BarFecFpr ;
   private java.util.Date[] P0ACL6_A155BarFecCli ;
   private java.util.Date[] P0ACL6_A159BarFecGen ;
   private byte[] P0ACL6_A213BarSit ;
   private String[] P0ACL6_A1234BarNomCli ;
   private int[] P0ACL6_A136BarColNum ;
   private String[] P0ACL6_A135BarColNom ;
   private String[] P0ACL6_A212BarSer ;
   private String[] P0ACL6_A279CliNom ;
   private int[] P0ACL6_A252CliCod ;
   private boolean[] P0ACL6_n252CliCod ;
   private String[] P0ACL6_A143BarDisNum ;
   private String[] P0ACL6_A130BarCodPar ;
   private byte[] P0ACL6_A132BarCodReo ;
   private int[] P0ACL6_A129BarCod ;
   private String[] P0ACL7_A396EmprCod ;
   private String[] P0ACL7_A135BarColNom ;
   private short[] P0ACL7_A217BarTipArt ;
   private boolean[] P0ACL7_n217BarTipArt ;
   private String[] P0ACL7_A2454BarGirar ;
   private String[] P0ACL7_A2829BarProPer ;
   private int[] P0ACL7_A1235BarNumCli ;
   private java.util.Date[] P0ACL7_A161BarFecSal ;
   private java.util.Date[] P0ACL7_A158BarFecFpr ;
   private java.util.Date[] P0ACL7_A155BarFecCli ;
   private java.util.Date[] P0ACL7_A159BarFecGen ;
   private byte[] P0ACL7_A213BarSit ;
   private String[] P0ACL7_A1234BarNomCli ;
   private int[] P0ACL7_A136BarColNum ;
   private String[] P0ACL7_A1652BarSerDsc ;
   private String[] P0ACL7_A212BarSer ;
   private String[] P0ACL7_A279CliNom ;
   private int[] P0ACL7_A252CliCod ;
   private boolean[] P0ACL7_n252CliCod ;
   private String[] P0ACL7_A143BarDisNum ;
   private String[] P0ACL7_A130BarCodPar ;
   private byte[] P0ACL7_A132BarCodReo ;
   private int[] P0ACL7_A129BarCod ;
   private String[] P0ACL8_A396EmprCod ;
   private String[] P0ACL8_A1234BarNomCli ;
   private short[] P0ACL8_A217BarTipArt ;
   private boolean[] P0ACL8_n217BarTipArt ;
   private String[] P0ACL8_A2454BarGirar ;
   private String[] P0ACL8_A2829BarProPer ;
   private int[] P0ACL8_A1235BarNumCli ;
   private java.util.Date[] P0ACL8_A161BarFecSal ;
   private java.util.Date[] P0ACL8_A158BarFecFpr ;
   private java.util.Date[] P0ACL8_A155BarFecCli ;
   private java.util.Date[] P0ACL8_A159BarFecGen ;
   private byte[] P0ACL8_A213BarSit ;
   private int[] P0ACL8_A136BarColNum ;
   private String[] P0ACL8_A135BarColNom ;
   private String[] P0ACL8_A1652BarSerDsc ;
   private String[] P0ACL8_A212BarSer ;
   private String[] P0ACL8_A279CliNom ;
   private int[] P0ACL8_A252CliCod ;
   private boolean[] P0ACL8_n252CliCod ;
   private String[] P0ACL8_A143BarDisNum ;
   private String[] P0ACL8_A130BarCodPar ;
   private byte[] P0ACL8_A132BarCodReo ;
   private int[] P0ACL8_A129BarCod ;
   private GXSimpleCollection<String> AV31Options ;
   private GXSimpleCollection<String> AV33OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class test_v01getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ACL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV102Produccion_test_v01ds_1_tfbarcod ,
                                          int AV103Produccion_test_v01ds_2_tfbarcod_to ,
                                          byte AV104Produccion_test_v01ds_3_tfbarcodreo ,
                                          byte AV105Produccion_test_v01ds_4_tfbarcodreo_to ,
                                          String AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                          String AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                          String AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                          String AV108Produccion_test_v01ds_7_tfbardisnum ,
                                          int AV110Produccion_test_v01ds_9_tfclicod ,
                                          int AV111Produccion_test_v01ds_10_tfclicod_to ,
                                          String AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                          String AV112Produccion_test_v01ds_11_tfclinom ,
                                          String AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                          String AV114Produccion_test_v01ds_13_tfbarser ,
                                          String AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                          String AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                          String AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                          String AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                          int AV120Produccion_test_v01ds_19_tfbarcolnum ,
                                          int AV121Produccion_test_v01ds_20_tfbarcolnum_to ,
                                          String AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                          String AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                          byte AV124Produccion_test_v01ds_23_tfbarsit ,
                                          byte AV125Produccion_test_v01ds_24_tfbarsit_to ,
                                          java.util.Date AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                          java.util.Date AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                          java.util.Date AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                          java.util.Date AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                          int AV50CliCod ,
                                          int AV51CliCodTo ,
                                          String AV63bardisnum ,
                                          String AV65BarDisNumTo ,
                                          java.util.Date AV52BarFecGen ,
                                          java.util.Date AV53BarFecGenTo ,
                                          java.util.Date AV64BarFecCli ,
                                          java.util.Date AV66barfecclito ,
                                          java.util.Date AV68barfecsal ,
                                          java.util.Date AV69barfecsalto ,
                                          java.util.Date AV70BarFecFpr ,
                                          java.util.Date AV71barfecfprto ,
                                          String AV72BarColNom ,
                                          String AV76BarColNomto ,
                                          int AV73BarColnum ,
                                          int AV77BarColNumto ,
                                          String AV74BarNomCli ,
                                          String AV78BarNomClito ,
                                          int AV75BarNumCli ,
                                          int AV79Barnumclito ,
                                          int AV80BarCod ,
                                          int AV84BarCodto ,
                                          byte AV81BarCodreo ,
                                          byte AV85BarCodreoto ,
                                          String AV82BarCodpar ,
                                          String AV86BarCodparto ,
                                          String AV83Cod_idtx ,
                                          String AV87BarGirar ,
                                          short AV94BarTipArt ,
                                          short AV95BarTipArtto ,
                                          String AV96BarSer ,
                                          String AV97BarSerto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A143BarDisNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          int A1235BarNumCli ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          short A217BarTipArt ,
                                          byte AV48BarSit ,
                                          byte AV49BarSitTo ,
                                          String A396EmprCod ,
                                          String AV47EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[63];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCodPar, T1.BarTipArt, T1.BarGirar, T1.BarProPer, T1.BarNumCli, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV102Produccion_test_v01ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV103Produccion_test_v01ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV104Produccion_test_v01ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV105Produccion_test_v01ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV106Produccion_test_v01ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV108Produccion_test_v01ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV110Produccion_test_v01ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV111Produccion_test_v01ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Produccion_test_v01ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_test_v01ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Produccion_test_v01ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Produccion_test_v01ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Produccion_test_v01ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV121Produccion_test_v01ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV122Produccion_test_v01ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Produccion_test_v01ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV125Produccion_test_v01ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Produccion_test_v01ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Produccion_test_v01ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128Produccion_test_v01ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Produccion_test_v01ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV50CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV51CliCodTo) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63bardisnum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71barfecfprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int2[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int2[44] = (byte)(1) ;
      }
      if ( ! (0==AV73BarColnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[45] = (byte)(1) ;
      }
      if ( ! (0==AV77BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int2[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int2[48] = (byte)(1) ;
      }
      if ( ! (0==AV75BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int2[49] = (byte)(1) ;
      }
      if ( ! (0==AV79Barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int2[50] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int2[51] = (byte)(1) ;
      }
      if ( ! (0==AV84BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int2[52] = (byte)(1) ;
      }
      if ( ! (0==AV81BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int2[53] = (byte)(1) ;
      }
      if ( ! (0==AV85BarCodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int2[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int2[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarCodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int2[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int2[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int2[58] = (byte)(1) ;
      }
      if ( ! (0==AV94BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int2[59] = (byte)(1) ;
      }
      if ( ! (0==AV95BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int2[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int2[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int2[62] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ACL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV102Produccion_test_v01ds_1_tfbarcod ,
                                          int AV103Produccion_test_v01ds_2_tfbarcod_to ,
                                          byte AV104Produccion_test_v01ds_3_tfbarcodreo ,
                                          byte AV105Produccion_test_v01ds_4_tfbarcodreo_to ,
                                          String AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                          String AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                          String AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                          String AV108Produccion_test_v01ds_7_tfbardisnum ,
                                          int AV110Produccion_test_v01ds_9_tfclicod ,
                                          int AV111Produccion_test_v01ds_10_tfclicod_to ,
                                          String AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                          String AV112Produccion_test_v01ds_11_tfclinom ,
                                          String AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                          String AV114Produccion_test_v01ds_13_tfbarser ,
                                          String AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                          String AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                          String AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                          String AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                          int AV120Produccion_test_v01ds_19_tfbarcolnum ,
                                          int AV121Produccion_test_v01ds_20_tfbarcolnum_to ,
                                          String AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                          String AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                          byte AV124Produccion_test_v01ds_23_tfbarsit ,
                                          byte AV125Produccion_test_v01ds_24_tfbarsit_to ,
                                          java.util.Date AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                          java.util.Date AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                          java.util.Date AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                          java.util.Date AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                          int AV50CliCod ,
                                          int AV51CliCodTo ,
                                          String AV63bardisnum ,
                                          String AV65BarDisNumTo ,
                                          java.util.Date AV52BarFecGen ,
                                          java.util.Date AV53BarFecGenTo ,
                                          java.util.Date AV64BarFecCli ,
                                          java.util.Date AV66barfecclito ,
                                          java.util.Date AV68barfecsal ,
                                          java.util.Date AV69barfecsalto ,
                                          java.util.Date AV70BarFecFpr ,
                                          java.util.Date AV71barfecfprto ,
                                          String AV72BarColNom ,
                                          String AV76BarColNomto ,
                                          int AV73BarColnum ,
                                          int AV77BarColNumto ,
                                          String AV74BarNomCli ,
                                          String AV78BarNomClito ,
                                          int AV75BarNumCli ,
                                          int AV79Barnumclito ,
                                          int AV80BarCod ,
                                          int AV84BarCodto ,
                                          byte AV81BarCodreo ,
                                          byte AV85BarCodreoto ,
                                          String AV82BarCodpar ,
                                          String AV86BarCodparto ,
                                          String AV83Cod_idtx ,
                                          String AV87BarGirar ,
                                          short AV94BarTipArt ,
                                          short AV95BarTipArtto ,
                                          String AV96BarSer ,
                                          String AV97BarSerto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A143BarDisNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          int A1235BarNumCli ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          short A217BarTipArt ,
                                          byte AV48BarSit ,
                                          byte AV49BarSitTo ,
                                          String A396EmprCod ,
                                          String AV47EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[63];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarDisNum, T1.BarTipArt, T1.BarGirar, T1.BarProPer, T1.BarNumCli, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV102Produccion_test_v01ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV103Produccion_test_v01ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV104Produccion_test_v01ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( ! (0==AV105Produccion_test_v01ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV106Produccion_test_v01ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV108Produccion_test_v01ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV110Produccion_test_v01ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV111Produccion_test_v01ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Produccion_test_v01ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_test_v01ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Produccion_test_v01ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Produccion_test_v01ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Produccion_test_v01ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (0==AV121Produccion_test_v01ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV122Produccion_test_v01ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Produccion_test_v01ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (0==AV125Produccion_test_v01ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Produccion_test_v01ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Produccion_test_v01ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128Produccion_test_v01ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Produccion_test_v01ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV50CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV51CliCodTo) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63bardisnum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71barfecfprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int4[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int4[44] = (byte)(1) ;
      }
      if ( ! (0==AV73BarColnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[45] = (byte)(1) ;
      }
      if ( ! (0==AV77BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int4[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int4[48] = (byte)(1) ;
      }
      if ( ! (0==AV75BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int4[49] = (byte)(1) ;
      }
      if ( ! (0==AV79Barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int4[50] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int4[51] = (byte)(1) ;
      }
      if ( ! (0==AV84BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int4[52] = (byte)(1) ;
      }
      if ( ! (0==AV81BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int4[53] = (byte)(1) ;
      }
      if ( ! (0==AV85BarCodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int4[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int4[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarCodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int4[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int4[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int4[58] = (byte)(1) ;
      }
      if ( ! (0==AV94BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int4[59] = (byte)(1) ;
      }
      if ( ! (0==AV95BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int4[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int4[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int4[62] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarDisNum" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P0ACL4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV102Produccion_test_v01ds_1_tfbarcod ,
                                          int AV103Produccion_test_v01ds_2_tfbarcod_to ,
                                          byte AV104Produccion_test_v01ds_3_tfbarcodreo ,
                                          byte AV105Produccion_test_v01ds_4_tfbarcodreo_to ,
                                          String AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                          String AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                          String AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                          String AV108Produccion_test_v01ds_7_tfbardisnum ,
                                          int AV110Produccion_test_v01ds_9_tfclicod ,
                                          int AV111Produccion_test_v01ds_10_tfclicod_to ,
                                          String AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                          String AV112Produccion_test_v01ds_11_tfclinom ,
                                          String AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                          String AV114Produccion_test_v01ds_13_tfbarser ,
                                          String AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                          String AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                          String AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                          String AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                          int AV120Produccion_test_v01ds_19_tfbarcolnum ,
                                          int AV121Produccion_test_v01ds_20_tfbarcolnum_to ,
                                          String AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                          String AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                          byte AV124Produccion_test_v01ds_23_tfbarsit ,
                                          byte AV125Produccion_test_v01ds_24_tfbarsit_to ,
                                          java.util.Date AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                          java.util.Date AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                          java.util.Date AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                          java.util.Date AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                          int AV50CliCod ,
                                          int AV51CliCodTo ,
                                          String AV63bardisnum ,
                                          String AV65BarDisNumTo ,
                                          java.util.Date AV52BarFecGen ,
                                          java.util.Date AV53BarFecGenTo ,
                                          java.util.Date AV64BarFecCli ,
                                          java.util.Date AV66barfecclito ,
                                          java.util.Date AV68barfecsal ,
                                          java.util.Date AV69barfecsalto ,
                                          java.util.Date AV70BarFecFpr ,
                                          java.util.Date AV71barfecfprto ,
                                          String AV72BarColNom ,
                                          String AV76BarColNomto ,
                                          int AV73BarColnum ,
                                          int AV77BarColNumto ,
                                          String AV74BarNomCli ,
                                          String AV78BarNomClito ,
                                          int AV75BarNumCli ,
                                          int AV79Barnumclito ,
                                          int AV80BarCod ,
                                          int AV84BarCodto ,
                                          byte AV81BarCodreo ,
                                          byte AV85BarCodreoto ,
                                          String AV82BarCodpar ,
                                          String AV86BarCodparto ,
                                          String AV83Cod_idtx ,
                                          String AV87BarGirar ,
                                          short AV94BarTipArt ,
                                          short AV95BarTipArtto ,
                                          String AV96BarSer ,
                                          String AV97BarSerto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A143BarDisNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          int A1235BarNumCli ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          short A217BarTipArt ,
                                          byte AV48BarSit ,
                                          byte AV49BarSitTo ,
                                          String A396EmprCod ,
                                          String AV47EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[63];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T2.CliNom, T1.BarTipArt, T1.BarGirar, T1.BarProPer, T1.BarNumCli, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.CliCod, T1.BarDisNum, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV102Produccion_test_v01ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV103Produccion_test_v01ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV104Produccion_test_v01ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV105Produccion_test_v01ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV106Produccion_test_v01ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV108Produccion_test_v01ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV110Produccion_test_v01ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV111Produccion_test_v01ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Produccion_test_v01ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_test_v01ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Produccion_test_v01ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Produccion_test_v01ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Produccion_test_v01ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV121Produccion_test_v01ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV122Produccion_test_v01ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Produccion_test_v01ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV125Produccion_test_v01ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Produccion_test_v01ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Produccion_test_v01ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128Produccion_test_v01ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Produccion_test_v01ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV50CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV51CliCodTo) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63bardisnum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71barfecfprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (0==AV73BarColnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (0==AV77BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV75BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (0==AV79Barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (0==AV84BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! (0==AV81BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (0==AV85BarCodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarCodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( ! (0==AV94BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( ! (0==AV95BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int6[62] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P0ACL5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV102Produccion_test_v01ds_1_tfbarcod ,
                                          int AV103Produccion_test_v01ds_2_tfbarcod_to ,
                                          byte AV104Produccion_test_v01ds_3_tfbarcodreo ,
                                          byte AV105Produccion_test_v01ds_4_tfbarcodreo_to ,
                                          String AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                          String AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                          String AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                          String AV108Produccion_test_v01ds_7_tfbardisnum ,
                                          int AV110Produccion_test_v01ds_9_tfclicod ,
                                          int AV111Produccion_test_v01ds_10_tfclicod_to ,
                                          String AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                          String AV112Produccion_test_v01ds_11_tfclinom ,
                                          String AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                          String AV114Produccion_test_v01ds_13_tfbarser ,
                                          String AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                          String AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                          String AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                          String AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                          int AV120Produccion_test_v01ds_19_tfbarcolnum ,
                                          int AV121Produccion_test_v01ds_20_tfbarcolnum_to ,
                                          String AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                          String AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                          byte AV124Produccion_test_v01ds_23_tfbarsit ,
                                          byte AV125Produccion_test_v01ds_24_tfbarsit_to ,
                                          java.util.Date AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                          java.util.Date AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                          java.util.Date AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                          java.util.Date AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                          int AV50CliCod ,
                                          int AV51CliCodTo ,
                                          String AV63bardisnum ,
                                          String AV65BarDisNumTo ,
                                          java.util.Date AV52BarFecGen ,
                                          java.util.Date AV53BarFecGenTo ,
                                          java.util.Date AV64BarFecCli ,
                                          java.util.Date AV66barfecclito ,
                                          java.util.Date AV68barfecsal ,
                                          java.util.Date AV69barfecsalto ,
                                          java.util.Date AV70BarFecFpr ,
                                          java.util.Date AV71barfecfprto ,
                                          String AV72BarColNom ,
                                          String AV76BarColNomto ,
                                          int AV73BarColnum ,
                                          int AV77BarColNumto ,
                                          String AV74BarNomCli ,
                                          String AV78BarNomClito ,
                                          int AV75BarNumCli ,
                                          int AV79Barnumclito ,
                                          int AV80BarCod ,
                                          int AV84BarCodto ,
                                          byte AV81BarCodreo ,
                                          byte AV85BarCodreoto ,
                                          String AV82BarCodpar ,
                                          String AV86BarCodparto ,
                                          String AV83Cod_idtx ,
                                          String AV87BarGirar ,
                                          short AV94BarTipArt ,
                                          short AV95BarTipArtto ,
                                          String AV96BarSer ,
                                          String AV97BarSerto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A143BarDisNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          int A1235BarNumCli ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          short A217BarTipArt ,
                                          byte AV48BarSit ,
                                          byte AV49BarSitTo ,
                                          String AV47EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[63];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarSer, T1.BarTipArt, T1.BarGirar, T1.BarProPer, T1.BarNumCli, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV102Produccion_test_v01ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV103Produccion_test_v01ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV104Produccion_test_v01ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV105Produccion_test_v01ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV106Produccion_test_v01ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV108Produccion_test_v01ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV110Produccion_test_v01ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV111Produccion_test_v01ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Produccion_test_v01ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_test_v01ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Produccion_test_v01ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Produccion_test_v01ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Produccion_test_v01ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV121Produccion_test_v01ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV122Produccion_test_v01ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Produccion_test_v01ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV125Produccion_test_v01ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Produccion_test_v01ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Produccion_test_v01ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128Produccion_test_v01ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Produccion_test_v01ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV50CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV51CliCodTo) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63bardisnum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71barfecfprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (0==AV73BarColnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( ! (0==AV77BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int8[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int8[48] = (byte)(1) ;
      }
      if ( ! (0==AV75BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int8[49] = (byte)(1) ;
      }
      if ( ! (0==AV79Barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int8[50] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int8[51] = (byte)(1) ;
      }
      if ( ! (0==AV84BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int8[52] = (byte)(1) ;
      }
      if ( ! (0==AV81BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[53] = (byte)(1) ;
      }
      if ( ! (0==AV85BarCodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int8[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarCodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int8[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int8[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int8[58] = (byte)(1) ;
      }
      if ( ! (0==AV94BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int8[59] = (byte)(1) ;
      }
      if ( ! (0==AV95BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int8[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int8[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int8[62] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarSer" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0ACL6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV102Produccion_test_v01ds_1_tfbarcod ,
                                          int AV103Produccion_test_v01ds_2_tfbarcod_to ,
                                          byte AV104Produccion_test_v01ds_3_tfbarcodreo ,
                                          byte AV105Produccion_test_v01ds_4_tfbarcodreo_to ,
                                          String AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                          String AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                          String AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                          String AV108Produccion_test_v01ds_7_tfbardisnum ,
                                          int AV110Produccion_test_v01ds_9_tfclicod ,
                                          int AV111Produccion_test_v01ds_10_tfclicod_to ,
                                          String AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                          String AV112Produccion_test_v01ds_11_tfclinom ,
                                          String AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                          String AV114Produccion_test_v01ds_13_tfbarser ,
                                          String AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                          String AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                          String AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                          String AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                          int AV120Produccion_test_v01ds_19_tfbarcolnum ,
                                          int AV121Produccion_test_v01ds_20_tfbarcolnum_to ,
                                          String AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                          String AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                          byte AV124Produccion_test_v01ds_23_tfbarsit ,
                                          byte AV125Produccion_test_v01ds_24_tfbarsit_to ,
                                          java.util.Date AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                          java.util.Date AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                          java.util.Date AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                          java.util.Date AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                          int AV50CliCod ,
                                          int AV51CliCodTo ,
                                          String AV63bardisnum ,
                                          String AV65BarDisNumTo ,
                                          java.util.Date AV52BarFecGen ,
                                          java.util.Date AV53BarFecGenTo ,
                                          java.util.Date AV64BarFecCli ,
                                          java.util.Date AV66barfecclito ,
                                          java.util.Date AV68barfecsal ,
                                          java.util.Date AV69barfecsalto ,
                                          java.util.Date AV70BarFecFpr ,
                                          java.util.Date AV71barfecfprto ,
                                          String AV72BarColNom ,
                                          String AV76BarColNomto ,
                                          int AV73BarColnum ,
                                          int AV77BarColNumto ,
                                          String AV74BarNomCli ,
                                          String AV78BarNomClito ,
                                          int AV75BarNumCli ,
                                          int AV79Barnumclito ,
                                          int AV80BarCod ,
                                          int AV84BarCodto ,
                                          byte AV81BarCodreo ,
                                          byte AV85BarCodreoto ,
                                          String AV82BarCodpar ,
                                          String AV86BarCodparto ,
                                          String AV83Cod_idtx ,
                                          String AV87BarGirar ,
                                          short AV94BarTipArt ,
                                          short AV95BarTipArtto ,
                                          String AV96BarSer ,
                                          String AV97BarSerto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A143BarDisNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          int A1235BarNumCli ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          short A217BarTipArt ,
                                          byte AV48BarSit ,
                                          byte AV49BarSitTo ,
                                          String A396EmprCod ,
                                          String AV47EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[63];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarSerDsc, T1.BarTipArt, T1.BarGirar, T1.BarProPer, T1.BarNumCli, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV102Produccion_test_v01ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV103Produccion_test_v01ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV104Produccion_test_v01ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( ! (0==AV105Produccion_test_v01ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV106Produccion_test_v01ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV108Produccion_test_v01ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV110Produccion_test_v01ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV111Produccion_test_v01ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Produccion_test_v01ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_test_v01ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Produccion_test_v01ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Produccion_test_v01ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Produccion_test_v01ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (0==AV121Produccion_test_v01ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV122Produccion_test_v01ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Produccion_test_v01ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV125Produccion_test_v01ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Produccion_test_v01ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Produccion_test_v01ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128Produccion_test_v01ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Produccion_test_v01ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV50CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV51CliCodTo) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63bardisnum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71barfecfprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int10[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int10[44] = (byte)(1) ;
      }
      if ( ! (0==AV73BarColnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[45] = (byte)(1) ;
      }
      if ( ! (0==AV77BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int10[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int10[48] = (byte)(1) ;
      }
      if ( ! (0==AV75BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int10[49] = (byte)(1) ;
      }
      if ( ! (0==AV79Barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int10[50] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int10[51] = (byte)(1) ;
      }
      if ( ! (0==AV84BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int10[52] = (byte)(1) ;
      }
      if ( ! (0==AV81BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int10[53] = (byte)(1) ;
      }
      if ( ! (0==AV85BarCodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int10[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int10[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarCodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int10[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int10[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int10[58] = (byte)(1) ;
      }
      if ( ! (0==AV94BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int10[59] = (byte)(1) ;
      }
      if ( ! (0==AV95BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int10[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int10[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int10[62] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0ACL7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV102Produccion_test_v01ds_1_tfbarcod ,
                                          int AV103Produccion_test_v01ds_2_tfbarcod_to ,
                                          byte AV104Produccion_test_v01ds_3_tfbarcodreo ,
                                          byte AV105Produccion_test_v01ds_4_tfbarcodreo_to ,
                                          String AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                          String AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                          String AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                          String AV108Produccion_test_v01ds_7_tfbardisnum ,
                                          int AV110Produccion_test_v01ds_9_tfclicod ,
                                          int AV111Produccion_test_v01ds_10_tfclicod_to ,
                                          String AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                          String AV112Produccion_test_v01ds_11_tfclinom ,
                                          String AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                          String AV114Produccion_test_v01ds_13_tfbarser ,
                                          String AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                          String AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                          String AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                          String AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                          int AV120Produccion_test_v01ds_19_tfbarcolnum ,
                                          int AV121Produccion_test_v01ds_20_tfbarcolnum_to ,
                                          String AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                          String AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                          byte AV124Produccion_test_v01ds_23_tfbarsit ,
                                          byte AV125Produccion_test_v01ds_24_tfbarsit_to ,
                                          java.util.Date AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                          java.util.Date AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                          java.util.Date AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                          java.util.Date AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                          int AV50CliCod ,
                                          int AV51CliCodTo ,
                                          String AV63bardisnum ,
                                          String AV65BarDisNumTo ,
                                          java.util.Date AV52BarFecGen ,
                                          java.util.Date AV53BarFecGenTo ,
                                          java.util.Date AV64BarFecCli ,
                                          java.util.Date AV66barfecclito ,
                                          java.util.Date AV68barfecsal ,
                                          java.util.Date AV69barfecsalto ,
                                          java.util.Date AV70BarFecFpr ,
                                          java.util.Date AV71barfecfprto ,
                                          String AV72BarColNom ,
                                          String AV76BarColNomto ,
                                          int AV73BarColnum ,
                                          int AV77BarColNumto ,
                                          String AV74BarNomCli ,
                                          String AV78BarNomClito ,
                                          int AV75BarNumCli ,
                                          int AV79Barnumclito ,
                                          int AV80BarCod ,
                                          int AV84BarCodto ,
                                          byte AV81BarCodreo ,
                                          byte AV85BarCodreoto ,
                                          String AV82BarCodpar ,
                                          String AV86BarCodparto ,
                                          String AV83Cod_idtx ,
                                          String AV87BarGirar ,
                                          short AV94BarTipArt ,
                                          short AV95BarTipArtto ,
                                          String AV96BarSer ,
                                          String AV97BarSerto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A143BarDisNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          int A1235BarNumCli ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          short A217BarTipArt ,
                                          byte AV48BarSit ,
                                          byte AV49BarSitTo ,
                                          String A396EmprCod ,
                                          String AV47EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[63];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarColNom, T1.BarTipArt, T1.BarGirar, T1.BarProPer, T1.BarNumCli, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV102Produccion_test_v01ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV103Produccion_test_v01ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV104Produccion_test_v01ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV105Produccion_test_v01ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV106Produccion_test_v01ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV108Produccion_test_v01ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV110Produccion_test_v01ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV111Produccion_test_v01ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Produccion_test_v01ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_test_v01ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Produccion_test_v01ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Produccion_test_v01ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Produccion_test_v01ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (0==AV121Produccion_test_v01ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV122Produccion_test_v01ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Produccion_test_v01ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (0==AV125Produccion_test_v01ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Produccion_test_v01ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Produccion_test_v01ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128Produccion_test_v01ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Produccion_test_v01ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV50CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV51CliCodTo) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63bardisnum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71barfecfprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int12[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int12[44] = (byte)(1) ;
      }
      if ( ! (0==AV73BarColnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[45] = (byte)(1) ;
      }
      if ( ! (0==AV77BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int12[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int12[48] = (byte)(1) ;
      }
      if ( ! (0==AV75BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int12[49] = (byte)(1) ;
      }
      if ( ! (0==AV79Barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int12[50] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int12[51] = (byte)(1) ;
      }
      if ( ! (0==AV84BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int12[52] = (byte)(1) ;
      }
      if ( ! (0==AV81BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int12[53] = (byte)(1) ;
      }
      if ( ! (0==AV85BarCodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int12[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int12[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarCodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int12[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int12[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int12[58] = (byte)(1) ;
      }
      if ( ! (0==AV94BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int12[59] = (byte)(1) ;
      }
      if ( ! (0==AV95BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int12[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int12[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int12[62] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P0ACL8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV102Produccion_test_v01ds_1_tfbarcod ,
                                          int AV103Produccion_test_v01ds_2_tfbarcod_to ,
                                          byte AV104Produccion_test_v01ds_3_tfbarcodreo ,
                                          byte AV105Produccion_test_v01ds_4_tfbarcodreo_to ,
                                          String AV107Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                          String AV106Produccion_test_v01ds_5_tfbarcodpar ,
                                          String AV109Produccion_test_v01ds_8_tfbardisnum_sel ,
                                          String AV108Produccion_test_v01ds_7_tfbardisnum ,
                                          int AV110Produccion_test_v01ds_9_tfclicod ,
                                          int AV111Produccion_test_v01ds_10_tfclicod_to ,
                                          String AV113Produccion_test_v01ds_12_tfclinom_sel ,
                                          String AV112Produccion_test_v01ds_11_tfclinom ,
                                          String AV115Produccion_test_v01ds_14_tfbarser_sel ,
                                          String AV114Produccion_test_v01ds_13_tfbarser ,
                                          String AV117Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                          String AV116Produccion_test_v01ds_15_tfbarserdsc ,
                                          String AV119Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                          String AV118Produccion_test_v01ds_17_tfbarcolnom ,
                                          int AV120Produccion_test_v01ds_19_tfbarcolnum ,
                                          int AV121Produccion_test_v01ds_20_tfbarcolnum_to ,
                                          String AV123Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                          String AV122Produccion_test_v01ds_21_tfbarnomcli ,
                                          byte AV124Produccion_test_v01ds_23_tfbarsit ,
                                          byte AV125Produccion_test_v01ds_24_tfbarsit_to ,
                                          java.util.Date AV126Produccion_test_v01ds_25_tfbarfecgen ,
                                          java.util.Date AV127Produccion_test_v01ds_26_tfbarfeccli ,
                                          java.util.Date AV128Produccion_test_v01ds_27_tfbarfecfpr ,
                                          java.util.Date AV129Produccion_test_v01ds_28_tfbarfecsal ,
                                          int AV50CliCod ,
                                          int AV51CliCodTo ,
                                          String AV63bardisnum ,
                                          String AV65BarDisNumTo ,
                                          java.util.Date AV52BarFecGen ,
                                          java.util.Date AV53BarFecGenTo ,
                                          java.util.Date AV64BarFecCli ,
                                          java.util.Date AV66barfecclito ,
                                          java.util.Date AV68barfecsal ,
                                          java.util.Date AV69barfecsalto ,
                                          java.util.Date AV70BarFecFpr ,
                                          java.util.Date AV71barfecfprto ,
                                          String AV72BarColNom ,
                                          String AV76BarColNomto ,
                                          int AV73BarColnum ,
                                          int AV77BarColNumto ,
                                          String AV74BarNomCli ,
                                          String AV78BarNomClito ,
                                          int AV75BarNumCli ,
                                          int AV79Barnumclito ,
                                          int AV80BarCod ,
                                          int AV84BarCodto ,
                                          byte AV81BarCodreo ,
                                          byte AV85BarCodreoto ,
                                          String AV82BarCodpar ,
                                          String AV86BarCodparto ,
                                          String AV83Cod_idtx ,
                                          String AV87BarGirar ,
                                          short AV94BarTipArt ,
                                          short AV95BarTipArtto ,
                                          String AV96BarSer ,
                                          String AV97BarSerto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A143BarDisNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          int A1235BarNumCli ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          short A217BarTipArt ,
                                          byte AV48BarSit ,
                                          byte AV49BarSitTo ,
                                          String A396EmprCod ,
                                          String AV47EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[63];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarTipArt, T1.BarGirar, T1.BarProPer, T1.BarNumCli, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarColNum," ;
      scmdbuf += " T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV102Produccion_test_v01ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV103Produccion_test_v01ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV104Produccion_test_v01ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (0==AV105Produccion_test_v01ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV106Produccion_test_v01ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Produccion_test_v01ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV108Produccion_test_v01ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Produccion_test_v01ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV110Produccion_test_v01ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV111Produccion_test_v01ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV112Produccion_test_v01ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Produccion_test_v01ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_test_v01ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_test_v01ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV116Produccion_test_v01ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Produccion_test_v01ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV118Produccion_test_v01ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Produccion_test_v01ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV120Produccion_test_v01ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV121Produccion_test_v01ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV122Produccion_test_v01ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Produccion_test_v01ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV124Produccion_test_v01ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV125Produccion_test_v01ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Produccion_test_v01ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Produccion_test_v01ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV128Produccion_test_v01ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV129Produccion_test_v01ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV50CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV51CliCodTo) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63bardisnum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV52BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66barfecclito)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV68barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV69barfecsalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV70BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV71barfecfprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (0==AV73BarColnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( ! (0==AV77BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int14[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int14[48] = (byte)(1) ;
      }
      if ( ! (0==AV75BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int14[49] = (byte)(1) ;
      }
      if ( ! (0==AV79Barnumclito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int14[50] = (byte)(1) ;
      }
      if ( ! (0==AV80BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int14[51] = (byte)(1) ;
      }
      if ( ! (0==AV84BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int14[52] = (byte)(1) ;
      }
      if ( ! (0==AV81BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int14[53] = (byte)(1) ;
      }
      if ( ! (0==AV85BarCodreoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int14[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int14[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarCodparto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int14[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int14[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int14[58] = (byte)(1) ;
      }
      if ( ! (0==AV94BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int14[59] = (byte)(1) ;
      }
      if ( ! (0==AV95BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int14[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int14[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int14[62] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNomCli" ;
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
                  return conditional_P0ACL2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).byteValue() , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , (String)dynConstraints[83] );
            case 1 :
                  return conditional_P0ACL3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).byteValue() , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , (String)dynConstraints[83] );
            case 2 :
                  return conditional_P0ACL4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).byteValue() , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , (String)dynConstraints[83] );
            case 3 :
                  return conditional_P0ACL5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).byteValue() , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , (String)dynConstraints[83] );
            case 4 :
                  return conditional_P0ACL6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).byteValue() , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , (String)dynConstraints[83] );
            case 5 :
                  return conditional_P0ACL7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).byteValue() , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , (String)dynConstraints[83] );
            case 6 :
                  return conditional_P0ACL8(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).byteValue() , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , (String)dynConstraints[83] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACL4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACL5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACL6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACL7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACL8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 30);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((int[]) buf[22])[0] = rslt.getInt(21);
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
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[90]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 16);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[90]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 16);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[90]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 16);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[90]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 16);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[90]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 16);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[90]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 16);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[90]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 16);
               }
               return;
      }
   }

}

