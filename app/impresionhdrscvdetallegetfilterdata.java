package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class impresionhdrscvdetallegetfilterdata extends GXProcedure
{
   public impresionhdrscvdetallegetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionhdrscvdetallegetfilterdata.class ), "" );
   }

   public impresionhdrscvdetallegetfilterdata( int remoteHandle ,
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
      impresionhdrscvdetallegetfilterdata.this.aP5 = new String[] {""};
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
      impresionhdrscvdetallegetfilterdata.this.AV31DDOName = aP0;
      impresionhdrscvdetallegetfilterdata.this.AV29SearchTxt = aP1;
      impresionhdrscvdetallegetfilterdata.this.AV30SearchTxtTo = aP2;
      impresionhdrscvdetallegetfilterdata.this.aP3 = aP3;
      impresionhdrscvdetallegetfilterdata.this.aP4 = aP4;
      impresionhdrscvdetallegetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV34Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV37OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV39OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV31DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV31DDOName), "DDO_BARENCCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARENCCLIOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV31DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV31DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV31DDOName), "DDO_BARCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV31DDOName), "DDO_BARNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNOMCLIOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV31DDOName), "DDO_BARAGREST") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRESTOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV35OptionsJson = AV34Options.toJSonString(false) ;
      AV38OptionsDescJson = AV37OptionsDesc.toJSonString(false) ;
      AV40OptionIndexesJson = AV39OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV42Session.getValue("ImpresionHDRsCvDetalleGridState"), "") == 0 )
      {
         AV44GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ImpresionHDRsCvDetalleGridState"), null, null);
      }
      else
      {
         AV44GridState.fromxml(AV42Session.getValue("ImpresionHDRsCvDetalleGridState"), null, null);
      }
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV44GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV45GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV44GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV54GXV1));
         if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV47FilterFullText = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV12TFBarFecGen = localUtil.ctod( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV13TFBarFecGen_To = localUtil.ctod( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV14TFBarEncCli = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV15TFBarEncCli_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV16TFBarSer = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV17TFBarSer_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV18TFBarSerDsc = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV19TFBarSerDsc_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV20TFBarColNom = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV21TFBarColNom_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV22TFBarNomCli = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV23TFBarNomCli_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV24TFBarKgm = CommonUtil.decimalVal( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV25TFBarKgm_To = CommonUtil.decimalVal( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV51TFBarAgrEst = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV26TFBarAgrEst_Sel = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPART") == 0 )
         {
            AV27TFBarPart = (short)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV28TFBarPart_To = (short)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48Emprcod = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV49Clicod = (int)(GXutil.lval( AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARENCCLI") == 0 )
         {
            AV50BarencCli = AV45GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV29SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV56Impresionhdrscvdetalleds_1_filterfulltext = AV47FilterFullText ;
      AV57Impresionhdrscvdetalleds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Impresionhdrscvdetalleds_4_tfbarfecgen = AV12TFBarFecGen ;
      AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to = AV13TFBarFecGen_To ;
      AV61Impresionhdrscvdetalleds_6_tfbarenccli = AV14TFBarEncCli ;
      AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel = AV15TFBarEncCli_Sel ;
      AV63Impresionhdrscvdetalleds_8_tfbarser = AV16TFBarSer ;
      AV64Impresionhdrscvdetalleds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV65Impresionhdrscvdetalleds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV67Impresionhdrscvdetalleds_12_tfbarcolnom = AV20TFBarColNom ;
      AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV69Impresionhdrscvdetalleds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV71Impresionhdrscvdetalleds_16_tfbarkgm = AV24TFBarKgm ;
      AV72Impresionhdrscvdetalleds_17_tfbarkgm_to = AV25TFBarKgm_To ;
      AV73Impresionhdrscvdetalleds_18_tfbaragrest = AV51TFBarAgrEst ;
      AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel = AV26TFBarAgrEst_Sel ;
      AV75Impresionhdrscvdetalleds_20_tfbarpart = AV27TFBarPart ;
      AV76Impresionhdrscvdetalleds_21_tfbarpart_to = AV28TFBarPart_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                           AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                           AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                           AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                           AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                           AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                           AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                           AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                           AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                           AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                           AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                           AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                           AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                           AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                           AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                           AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                           AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                           AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                           Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart) ,
                                           Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A159BarFecGen ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A120BarAgrEst ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           AV50BarencCli ,
                                           AV48Emprcod ,
                                           Integer.valueOf(AV49Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV57Impresionhdrscvdetalleds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Impresionhdrscvdetalleds_2_tfbarnhdr), 11, "%") ;
      lV61Impresionhdrscvdetalleds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV61Impresionhdrscvdetalleds_6_tfbarenccli), 20, "%") ;
      lV63Impresionhdrscvdetalleds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV63Impresionhdrscvdetalleds_8_tfbarser), 16, "%") ;
      lV65Impresionhdrscvdetalleds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV65Impresionhdrscvdetalleds_10_tfbarserdsc), 26, "%") ;
      lV67Impresionhdrscvdetalleds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV67Impresionhdrscvdetalleds_12_tfbarcolnom), 13, "%") ;
      lV69Impresionhdrscvdetalleds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV69Impresionhdrscvdetalleds_14_tfbarnomcli), 13, "%") ;
      lV73Impresionhdrscvdetalleds_18_tfbaragrest = GXutil.padr( GXutil.rtrim( AV73Impresionhdrscvdetalleds_18_tfbaragrest), 1, "%") ;
      /* Using cursor P09333 */
      pr_default.execute(0, new Object[] {AV48Emprcod, Integer.valueOf(AV49Clicod), AV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, AV50BarencCli, lV57Impresionhdrscvdetalleds_2_tfbarnhdr, AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel, AV59Impresionhdrscvdetalleds_4_tfbarfecgen, AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to, lV61Impresionhdrscvdetalleds_6_tfbarenccli, AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel, lV63Impresionhdrscvdetalleds_8_tfbarser, AV64Impresionhdrscvdetalleds_9_tfbarser_sel, lV65Impresionhdrscvdetalleds_10_tfbarserdsc, AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel, lV67Impresionhdrscvdetalleds_12_tfbarcolnom, AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel, lV69Impresionhdrscvdetalleds_14_tfbarnomcli, AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel, AV71Impresionhdrscvdetalleds_16_tfbarkgm, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to, lV73Impresionhdrscvdetalleds_18_tfbaragrest, AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel, Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart), Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P09333_A252CliCod[0] ;
         n252CliCod = P09333_n252CliCod[0] ;
         A396EmprCod = P09333_A396EmprCod[0] ;
         A1503BarPart = P09333_A1503BarPart[0] ;
         A120BarAgrEst = P09333_A120BarAgrEst[0] ;
         A1234BarNomCli = P09333_A1234BarNomCli[0] ;
         A135BarColNom = P09333_A135BarColNom[0] ;
         A1652BarSerDsc = P09333_A1652BarSerDsc[0] ;
         A212BarSer = P09333_A212BarSer[0] ;
         A4812BarEncCli = P09333_A4812BarEncCli[0] ;
         A159BarFecGen = P09333_A159BarFecGen[0] ;
         A13696BarNHdr = P09333_A13696BarNHdr[0] ;
         A166BarKgm = P09333_A166BarKgm[0] ;
         n166BarKgm = P09333_n166BarKgm[0] ;
         A129BarCod = P09333_A129BarCod[0] ;
         A132BarCodReo = P09333_A132BarCodReo[0] ;
         A130BarCodPar = P09333_A130BarCodPar[0] ;
         A166BarKgm = P09333_A166BarKgm[0] ;
         n166BarKgm = P09333_n166BarKgm[0] ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV33Option = A13696BarNHdr ;
            AV32InsertIndex = 1 ;
            while ( ( AV32InsertIndex <= AV34Options.size() ) && ( GXutil.strcmp((String)AV34Options.elementAt(-1+AV32InsertIndex), AV33Option) < 0 ) )
            {
               AV32InsertIndex = (int)(AV32InsertIndex+1) ;
            }
            if ( ( AV32InsertIndex <= AV34Options.size() ) && ( GXutil.strcmp((String)AV34Options.elementAt(-1+AV32InsertIndex), AV33Option) == 0 ) )
            {
               AV41count = (short)(GXutil.lval( (String)AV39OptionIndexes.elementAt(-1+AV32InsertIndex))) ;
               AV41count = (short)(AV41count+1) ;
               AV39OptionIndexes.removeItem(AV32InsertIndex);
               AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZ9")), AV32InsertIndex);
            }
            else
            {
               AV34Options.add(AV33Option, AV32InsertIndex);
               AV39OptionIndexes.add("1", AV32InsertIndex);
            }
         }
         if ( AV34Options.size() == 50 )
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
      /* 'LOADBARENCCLIOPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarEncCli = AV29SearchTxt ;
      AV15TFBarEncCli_Sel = "" ;
      AV56Impresionhdrscvdetalleds_1_filterfulltext = AV47FilterFullText ;
      AV57Impresionhdrscvdetalleds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Impresionhdrscvdetalleds_4_tfbarfecgen = AV12TFBarFecGen ;
      AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to = AV13TFBarFecGen_To ;
      AV61Impresionhdrscvdetalleds_6_tfbarenccli = AV14TFBarEncCli ;
      AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel = AV15TFBarEncCli_Sel ;
      AV63Impresionhdrscvdetalleds_8_tfbarser = AV16TFBarSer ;
      AV64Impresionhdrscvdetalleds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV65Impresionhdrscvdetalleds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV67Impresionhdrscvdetalleds_12_tfbarcolnom = AV20TFBarColNom ;
      AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV69Impresionhdrscvdetalleds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV71Impresionhdrscvdetalleds_16_tfbarkgm = AV24TFBarKgm ;
      AV72Impresionhdrscvdetalleds_17_tfbarkgm_to = AV25TFBarKgm_To ;
      AV73Impresionhdrscvdetalleds_18_tfbaragrest = AV51TFBarAgrEst ;
      AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel = AV26TFBarAgrEst_Sel ;
      AV75Impresionhdrscvdetalleds_20_tfbarpart = AV27TFBarPart ;
      AV76Impresionhdrscvdetalleds_21_tfbarpart_to = AV28TFBarPart_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                           AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                           AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                           AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                           AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                           AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                           AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                           AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                           AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                           AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                           AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                           AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                           AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                           AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                           AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                           AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                           AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                           AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                           Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart) ,
                                           Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A159BarFecGen ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A120BarAgrEst ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A396EmprCod ,
                                           AV48Emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV49Clicod) ,
                                           AV50BarencCli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING
                                           }
      });
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV57Impresionhdrscvdetalleds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Impresionhdrscvdetalleds_2_tfbarnhdr), 11, "%") ;
      lV61Impresionhdrscvdetalleds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV61Impresionhdrscvdetalleds_6_tfbarenccli), 20, "%") ;
      lV63Impresionhdrscvdetalleds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV63Impresionhdrscvdetalleds_8_tfbarser), 16, "%") ;
      lV65Impresionhdrscvdetalleds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV65Impresionhdrscvdetalleds_10_tfbarserdsc), 26, "%") ;
      lV67Impresionhdrscvdetalleds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV67Impresionhdrscvdetalleds_12_tfbarcolnom), 13, "%") ;
      lV69Impresionhdrscvdetalleds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV69Impresionhdrscvdetalleds_14_tfbarnomcli), 13, "%") ;
      lV73Impresionhdrscvdetalleds_18_tfbaragrest = GXutil.padr( GXutil.rtrim( AV73Impresionhdrscvdetalleds_18_tfbaragrest), 1, "%") ;
      /* Using cursor P09335 */
      pr_default.execute(1, new Object[] {AV50BarencCli, AV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, AV48Emprcod, Integer.valueOf(AV49Clicod), lV57Impresionhdrscvdetalleds_2_tfbarnhdr, AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel, AV59Impresionhdrscvdetalleds_4_tfbarfecgen, AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to, lV61Impresionhdrscvdetalleds_6_tfbarenccli, AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel, lV63Impresionhdrscvdetalleds_8_tfbarser, AV64Impresionhdrscvdetalleds_9_tfbarser_sel, lV65Impresionhdrscvdetalleds_10_tfbarserdsc, AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel, lV67Impresionhdrscvdetalleds_12_tfbarcolnom, AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel, lV69Impresionhdrscvdetalleds_14_tfbarnomcli, AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel, AV71Impresionhdrscvdetalleds_16_tfbarkgm, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to, lV73Impresionhdrscvdetalleds_18_tfbaragrest, AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel, Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart), Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9333 = false ;
         A396EmprCod = P09335_A396EmprCod[0] ;
         A252CliCod = P09335_A252CliCod[0] ;
         n252CliCod = P09335_n252CliCod[0] ;
         A4812BarEncCli = P09335_A4812BarEncCli[0] ;
         A1503BarPart = P09335_A1503BarPart[0] ;
         A120BarAgrEst = P09335_A120BarAgrEst[0] ;
         A1234BarNomCli = P09335_A1234BarNomCli[0] ;
         A135BarColNom = P09335_A135BarColNom[0] ;
         A1652BarSerDsc = P09335_A1652BarSerDsc[0] ;
         A212BarSer = P09335_A212BarSer[0] ;
         A159BarFecGen = P09335_A159BarFecGen[0] ;
         A13696BarNHdr = P09335_A13696BarNHdr[0] ;
         A166BarKgm = P09335_A166BarKgm[0] ;
         n166BarKgm = P09335_n166BarKgm[0] ;
         A129BarCod = P09335_A129BarCod[0] ;
         A132BarCodReo = P09335_A132BarCodReo[0] ;
         A130BarCodPar = P09335_A130BarCodPar[0] ;
         A166BarKgm = P09335_A166BarKgm[0] ;
         n166BarKgm = P09335_n166BarKgm[0] ;
         AV41count = (short)(0) ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09335_A4812BarEncCli[0], A4812BarEncCli) == 0 ) )
         {
            brk9333 = false ;
            A396EmprCod = P09335_A396EmprCod[0] ;
            A129BarCod = P09335_A129BarCod[0] ;
            A132BarCodReo = P09335_A132BarCodReo[0] ;
            A130BarCodPar = P09335_A130BarCodPar[0] ;
            AV41count = (short)(AV41count+1) ;
            brk9333 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4812BarEncCli)==0) )
         {
            AV33Option = A4812BarEncCli ;
            AV34Options.add(AV33Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9333 )
         {
            brk9333 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarSer = AV29SearchTxt ;
      AV17TFBarSer_Sel = "" ;
      AV56Impresionhdrscvdetalleds_1_filterfulltext = AV47FilterFullText ;
      AV57Impresionhdrscvdetalleds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Impresionhdrscvdetalleds_4_tfbarfecgen = AV12TFBarFecGen ;
      AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to = AV13TFBarFecGen_To ;
      AV61Impresionhdrscvdetalleds_6_tfbarenccli = AV14TFBarEncCli ;
      AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel = AV15TFBarEncCli_Sel ;
      AV63Impresionhdrscvdetalleds_8_tfbarser = AV16TFBarSer ;
      AV64Impresionhdrscvdetalleds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV65Impresionhdrscvdetalleds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV67Impresionhdrscvdetalleds_12_tfbarcolnom = AV20TFBarColNom ;
      AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV69Impresionhdrscvdetalleds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV71Impresionhdrscvdetalleds_16_tfbarkgm = AV24TFBarKgm ;
      AV72Impresionhdrscvdetalleds_17_tfbarkgm_to = AV25TFBarKgm_To ;
      AV73Impresionhdrscvdetalleds_18_tfbaragrest = AV51TFBarAgrEst ;
      AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel = AV26TFBarAgrEst_Sel ;
      AV75Impresionhdrscvdetalleds_20_tfbarpart = AV27TFBarPart ;
      AV76Impresionhdrscvdetalleds_21_tfbarpart_to = AV28TFBarPart_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                           AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                           AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                           AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                           AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                           AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                           AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                           AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                           AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                           AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                           AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                           AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                           AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                           AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                           AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                           AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                           AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                           AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                           Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart) ,
                                           Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A159BarFecGen ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A120BarAgrEst ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           AV50BarencCli ,
                                           AV48Emprcod ,
                                           Integer.valueOf(AV49Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN
                                           }
      });
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV57Impresionhdrscvdetalleds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Impresionhdrscvdetalleds_2_tfbarnhdr), 11, "%") ;
      lV61Impresionhdrscvdetalleds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV61Impresionhdrscvdetalleds_6_tfbarenccli), 20, "%") ;
      lV63Impresionhdrscvdetalleds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV63Impresionhdrscvdetalleds_8_tfbarser), 16, "%") ;
      lV65Impresionhdrscvdetalleds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV65Impresionhdrscvdetalleds_10_tfbarserdsc), 26, "%") ;
      lV67Impresionhdrscvdetalleds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV67Impresionhdrscvdetalleds_12_tfbarcolnom), 13, "%") ;
      lV69Impresionhdrscvdetalleds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV69Impresionhdrscvdetalleds_14_tfbarnomcli), 13, "%") ;
      lV73Impresionhdrscvdetalleds_18_tfbaragrest = GXutil.padr( GXutil.rtrim( AV73Impresionhdrscvdetalleds_18_tfbaragrest), 1, "%") ;
      /* Using cursor P09337 */
      pr_default.execute(2, new Object[] {AV48Emprcod, Integer.valueOf(AV49Clicod), AV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, AV50BarencCli, lV57Impresionhdrscvdetalleds_2_tfbarnhdr, AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel, AV59Impresionhdrscvdetalleds_4_tfbarfecgen, AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to, lV61Impresionhdrscvdetalleds_6_tfbarenccli, AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel, lV63Impresionhdrscvdetalleds_8_tfbarser, AV64Impresionhdrscvdetalleds_9_tfbarser_sel, lV65Impresionhdrscvdetalleds_10_tfbarserdsc, AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel, lV67Impresionhdrscvdetalleds_12_tfbarcolnom, AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel, lV69Impresionhdrscvdetalleds_14_tfbarnomcli, AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel, AV71Impresionhdrscvdetalleds_16_tfbarkgm, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to, lV73Impresionhdrscvdetalleds_18_tfbaragrest, AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel, Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart), Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk9335 = false ;
         A252CliCod = P09337_A252CliCod[0] ;
         n252CliCod = P09337_n252CliCod[0] ;
         A396EmprCod = P09337_A396EmprCod[0] ;
         A212BarSer = P09337_A212BarSer[0] ;
         A1503BarPart = P09337_A1503BarPart[0] ;
         A120BarAgrEst = P09337_A120BarAgrEst[0] ;
         A1234BarNomCli = P09337_A1234BarNomCli[0] ;
         A135BarColNom = P09337_A135BarColNom[0] ;
         A1652BarSerDsc = P09337_A1652BarSerDsc[0] ;
         A4812BarEncCli = P09337_A4812BarEncCli[0] ;
         A159BarFecGen = P09337_A159BarFecGen[0] ;
         A13696BarNHdr = P09337_A13696BarNHdr[0] ;
         A166BarKgm = P09337_A166BarKgm[0] ;
         n166BarKgm = P09337_n166BarKgm[0] ;
         A129BarCod = P09337_A129BarCod[0] ;
         A132BarCodReo = P09337_A132BarCodReo[0] ;
         A130BarCodPar = P09337_A130BarCodPar[0] ;
         A166BarKgm = P09337_A166BarKgm[0] ;
         n166BarKgm = P09337_n166BarKgm[0] ;
         AV41count = (short)(0) ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P09337_A396EmprCod[0], A396EmprCod) == 0 ) && ( P09337_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P09337_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk9335 = false ;
            A129BarCod = P09337_A129BarCod[0] ;
            A132BarCodReo = P09337_A132BarCodReo[0] ;
            A130BarCodPar = P09337_A130BarCodPar[0] ;
            AV41count = (short)(AV41count+1) ;
            brk9335 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV33Option = A212BarSer ;
            AV34Options.add(AV33Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9335 )
         {
            brk9335 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarSerDsc = AV29SearchTxt ;
      AV19TFBarSerDsc_Sel = "" ;
      AV56Impresionhdrscvdetalleds_1_filterfulltext = AV47FilterFullText ;
      AV57Impresionhdrscvdetalleds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Impresionhdrscvdetalleds_4_tfbarfecgen = AV12TFBarFecGen ;
      AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to = AV13TFBarFecGen_To ;
      AV61Impresionhdrscvdetalleds_6_tfbarenccli = AV14TFBarEncCli ;
      AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel = AV15TFBarEncCli_Sel ;
      AV63Impresionhdrscvdetalleds_8_tfbarser = AV16TFBarSer ;
      AV64Impresionhdrscvdetalleds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV65Impresionhdrscvdetalleds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV67Impresionhdrscvdetalleds_12_tfbarcolnom = AV20TFBarColNom ;
      AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV69Impresionhdrscvdetalleds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV71Impresionhdrscvdetalleds_16_tfbarkgm = AV24TFBarKgm ;
      AV72Impresionhdrscvdetalleds_17_tfbarkgm_to = AV25TFBarKgm_To ;
      AV73Impresionhdrscvdetalleds_18_tfbaragrest = AV51TFBarAgrEst ;
      AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel = AV26TFBarAgrEst_Sel ;
      AV75Impresionhdrscvdetalleds_20_tfbarpart = AV27TFBarPart ;
      AV76Impresionhdrscvdetalleds_21_tfbarpart_to = AV28TFBarPart_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                           AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                           AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                           AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                           AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                           AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                           AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                           AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                           AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                           AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                           AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                           AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                           AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                           AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                           AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                           AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                           AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                           AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                           Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart) ,
                                           Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A159BarFecGen ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A120BarAgrEst ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A396EmprCod ,
                                           AV48Emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV49Clicod) ,
                                           AV50BarencCli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING
                                           }
      });
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV57Impresionhdrscvdetalleds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Impresionhdrscvdetalleds_2_tfbarnhdr), 11, "%") ;
      lV61Impresionhdrscvdetalleds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV61Impresionhdrscvdetalleds_6_tfbarenccli), 20, "%") ;
      lV63Impresionhdrscvdetalleds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV63Impresionhdrscvdetalleds_8_tfbarser), 16, "%") ;
      lV65Impresionhdrscvdetalleds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV65Impresionhdrscvdetalleds_10_tfbarserdsc), 26, "%") ;
      lV67Impresionhdrscvdetalleds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV67Impresionhdrscvdetalleds_12_tfbarcolnom), 13, "%") ;
      lV69Impresionhdrscvdetalleds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV69Impresionhdrscvdetalleds_14_tfbarnomcli), 13, "%") ;
      lV73Impresionhdrscvdetalleds_18_tfbaragrest = GXutil.padr( GXutil.rtrim( AV73Impresionhdrscvdetalleds_18_tfbaragrest), 1, "%") ;
      /* Using cursor P09339 */
      pr_default.execute(3, new Object[] {AV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, AV48Emprcod, Integer.valueOf(AV49Clicod), AV50BarencCli, lV57Impresionhdrscvdetalleds_2_tfbarnhdr, AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel, AV59Impresionhdrscvdetalleds_4_tfbarfecgen, AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to, lV61Impresionhdrscvdetalleds_6_tfbarenccli, AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel, lV63Impresionhdrscvdetalleds_8_tfbarser, AV64Impresionhdrscvdetalleds_9_tfbarser_sel, lV65Impresionhdrscvdetalleds_10_tfbarserdsc, AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel, lV67Impresionhdrscvdetalleds_12_tfbarcolnom, AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel, lV69Impresionhdrscvdetalleds_14_tfbarnomcli, AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel, AV71Impresionhdrscvdetalleds_16_tfbarkgm, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to, lV73Impresionhdrscvdetalleds_18_tfbaragrest, AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel, Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart), Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9337 = false ;
         A396EmprCod = P09339_A396EmprCod[0] ;
         A252CliCod = P09339_A252CliCod[0] ;
         n252CliCod = P09339_n252CliCod[0] ;
         A4812BarEncCli = P09339_A4812BarEncCli[0] ;
         A1652BarSerDsc = P09339_A1652BarSerDsc[0] ;
         A1503BarPart = P09339_A1503BarPart[0] ;
         A120BarAgrEst = P09339_A120BarAgrEst[0] ;
         A1234BarNomCli = P09339_A1234BarNomCli[0] ;
         A135BarColNom = P09339_A135BarColNom[0] ;
         A212BarSer = P09339_A212BarSer[0] ;
         A159BarFecGen = P09339_A159BarFecGen[0] ;
         A13696BarNHdr = P09339_A13696BarNHdr[0] ;
         A166BarKgm = P09339_A166BarKgm[0] ;
         n166BarKgm = P09339_n166BarKgm[0] ;
         A129BarCod = P09339_A129BarCod[0] ;
         A132BarCodReo = P09339_A132BarCodReo[0] ;
         A130BarCodPar = P09339_A130BarCodPar[0] ;
         A166BarKgm = P09339_A166BarKgm[0] ;
         n166BarKgm = P09339_n166BarKgm[0] ;
         AV41count = (short)(0) ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09339_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk9337 = false ;
            A396EmprCod = P09339_A396EmprCod[0] ;
            A129BarCod = P09339_A129BarCod[0] ;
            A132BarCodReo = P09339_A132BarCodReo[0] ;
            A130BarCodPar = P09339_A130BarCodPar[0] ;
            AV41count = (short)(AV41count+1) ;
            brk9337 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV33Option = A1652BarSerDsc ;
            AV34Options.add(AV33Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9337 )
         {
            brk9337 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarColNom = AV29SearchTxt ;
      AV21TFBarColNom_Sel = "" ;
      AV56Impresionhdrscvdetalleds_1_filterfulltext = AV47FilterFullText ;
      AV57Impresionhdrscvdetalleds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Impresionhdrscvdetalleds_4_tfbarfecgen = AV12TFBarFecGen ;
      AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to = AV13TFBarFecGen_To ;
      AV61Impresionhdrscvdetalleds_6_tfbarenccli = AV14TFBarEncCli ;
      AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel = AV15TFBarEncCli_Sel ;
      AV63Impresionhdrscvdetalleds_8_tfbarser = AV16TFBarSer ;
      AV64Impresionhdrscvdetalleds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV65Impresionhdrscvdetalleds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV67Impresionhdrscvdetalleds_12_tfbarcolnom = AV20TFBarColNom ;
      AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV69Impresionhdrscvdetalleds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV71Impresionhdrscvdetalleds_16_tfbarkgm = AV24TFBarKgm ;
      AV72Impresionhdrscvdetalleds_17_tfbarkgm_to = AV25TFBarKgm_To ;
      AV73Impresionhdrscvdetalleds_18_tfbaragrest = AV51TFBarAgrEst ;
      AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel = AV26TFBarAgrEst_Sel ;
      AV75Impresionhdrscvdetalleds_20_tfbarpart = AV27TFBarPart ;
      AV76Impresionhdrscvdetalleds_21_tfbarpart_to = AV28TFBarPart_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                           AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                           AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                           AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                           AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                           AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                           AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                           AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                           AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                           AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                           AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                           AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                           AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                           AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                           AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                           AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                           AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                           AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                           Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart) ,
                                           Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A159BarFecGen ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A120BarAgrEst ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A396EmprCod ,
                                           AV48Emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV49Clicod) ,
                                           AV50BarencCli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING
                                           }
      });
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV57Impresionhdrscvdetalleds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Impresionhdrscvdetalleds_2_tfbarnhdr), 11, "%") ;
      lV61Impresionhdrscvdetalleds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV61Impresionhdrscvdetalleds_6_tfbarenccli), 20, "%") ;
      lV63Impresionhdrscvdetalleds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV63Impresionhdrscvdetalleds_8_tfbarser), 16, "%") ;
      lV65Impresionhdrscvdetalleds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV65Impresionhdrscvdetalleds_10_tfbarserdsc), 26, "%") ;
      lV67Impresionhdrscvdetalleds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV67Impresionhdrscvdetalleds_12_tfbarcolnom), 13, "%") ;
      lV69Impresionhdrscvdetalleds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV69Impresionhdrscvdetalleds_14_tfbarnomcli), 13, "%") ;
      lV73Impresionhdrscvdetalleds_18_tfbaragrest = GXutil.padr( GXutil.rtrim( AV73Impresionhdrscvdetalleds_18_tfbaragrest), 1, "%") ;
      /* Using cursor P093311 */
      pr_default.execute(4, new Object[] {AV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, AV48Emprcod, Integer.valueOf(AV49Clicod), AV50BarencCli, lV57Impresionhdrscvdetalleds_2_tfbarnhdr, AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel, AV59Impresionhdrscvdetalleds_4_tfbarfecgen, AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to, lV61Impresionhdrscvdetalleds_6_tfbarenccli, AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel, lV63Impresionhdrscvdetalleds_8_tfbarser, AV64Impresionhdrscvdetalleds_9_tfbarser_sel, lV65Impresionhdrscvdetalleds_10_tfbarserdsc, AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel, lV67Impresionhdrscvdetalleds_12_tfbarcolnom, AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel, lV69Impresionhdrscvdetalleds_14_tfbarnomcli, AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel, AV71Impresionhdrscvdetalleds_16_tfbarkgm, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to, lV73Impresionhdrscvdetalleds_18_tfbaragrest, AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel, Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart), Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9339 = false ;
         A396EmprCod = P093311_A396EmprCod[0] ;
         A252CliCod = P093311_A252CliCod[0] ;
         n252CliCod = P093311_n252CliCod[0] ;
         A4812BarEncCli = P093311_A4812BarEncCli[0] ;
         A135BarColNom = P093311_A135BarColNom[0] ;
         A1503BarPart = P093311_A1503BarPart[0] ;
         A120BarAgrEst = P093311_A120BarAgrEst[0] ;
         A1234BarNomCli = P093311_A1234BarNomCli[0] ;
         A1652BarSerDsc = P093311_A1652BarSerDsc[0] ;
         A212BarSer = P093311_A212BarSer[0] ;
         A159BarFecGen = P093311_A159BarFecGen[0] ;
         A13696BarNHdr = P093311_A13696BarNHdr[0] ;
         A166BarKgm = P093311_A166BarKgm[0] ;
         n166BarKgm = P093311_n166BarKgm[0] ;
         A129BarCod = P093311_A129BarCod[0] ;
         A132BarCodReo = P093311_A132BarCodReo[0] ;
         A130BarCodPar = P093311_A130BarCodPar[0] ;
         A166BarKgm = P093311_A166BarKgm[0] ;
         n166BarKgm = P093311_n166BarKgm[0] ;
         AV41count = (short)(0) ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P093311_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk9339 = false ;
            A396EmprCod = P093311_A396EmprCod[0] ;
            A129BarCod = P093311_A129BarCod[0] ;
            A132BarCodReo = P093311_A132BarCodReo[0] ;
            A130BarCodPar = P093311_A130BarCodPar[0] ;
            AV41count = (short)(AV41count+1) ;
            brk9339 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV33Option = A135BarColNom ;
            AV34Options.add(AV33Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk9339 )
         {
            brk9339 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarNomCli = AV29SearchTxt ;
      AV23TFBarNomCli_Sel = "" ;
      AV56Impresionhdrscvdetalleds_1_filterfulltext = AV47FilterFullText ;
      AV57Impresionhdrscvdetalleds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Impresionhdrscvdetalleds_4_tfbarfecgen = AV12TFBarFecGen ;
      AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to = AV13TFBarFecGen_To ;
      AV61Impresionhdrscvdetalleds_6_tfbarenccli = AV14TFBarEncCli ;
      AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel = AV15TFBarEncCli_Sel ;
      AV63Impresionhdrscvdetalleds_8_tfbarser = AV16TFBarSer ;
      AV64Impresionhdrscvdetalleds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV65Impresionhdrscvdetalleds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV67Impresionhdrscvdetalleds_12_tfbarcolnom = AV20TFBarColNom ;
      AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV69Impresionhdrscvdetalleds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV71Impresionhdrscvdetalleds_16_tfbarkgm = AV24TFBarKgm ;
      AV72Impresionhdrscvdetalleds_17_tfbarkgm_to = AV25TFBarKgm_To ;
      AV73Impresionhdrscvdetalleds_18_tfbaragrest = AV51TFBarAgrEst ;
      AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel = AV26TFBarAgrEst_Sel ;
      AV75Impresionhdrscvdetalleds_20_tfbarpart = AV27TFBarPart ;
      AV76Impresionhdrscvdetalleds_21_tfbarpart_to = AV28TFBarPart_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                           AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                           AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                           AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                           AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                           AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                           AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                           AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                           AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                           AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                           AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                           AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                           AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                           AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                           AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                           AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                           AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                           AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                           Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart) ,
                                           Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A159BarFecGen ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A120BarAgrEst ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A396EmprCod ,
                                           AV48Emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV49Clicod) ,
                                           AV50BarencCli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING
                                           }
      });
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV57Impresionhdrscvdetalleds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Impresionhdrscvdetalleds_2_tfbarnhdr), 11, "%") ;
      lV61Impresionhdrscvdetalleds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV61Impresionhdrscvdetalleds_6_tfbarenccli), 20, "%") ;
      lV63Impresionhdrscvdetalleds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV63Impresionhdrscvdetalleds_8_tfbarser), 16, "%") ;
      lV65Impresionhdrscvdetalleds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV65Impresionhdrscvdetalleds_10_tfbarserdsc), 26, "%") ;
      lV67Impresionhdrscvdetalleds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV67Impresionhdrscvdetalleds_12_tfbarcolnom), 13, "%") ;
      lV69Impresionhdrscvdetalleds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV69Impresionhdrscvdetalleds_14_tfbarnomcli), 13, "%") ;
      lV73Impresionhdrscvdetalleds_18_tfbaragrest = GXutil.padr( GXutil.rtrim( AV73Impresionhdrscvdetalleds_18_tfbaragrest), 1, "%") ;
      /* Using cursor P093313 */
      pr_default.execute(5, new Object[] {AV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, AV48Emprcod, Integer.valueOf(AV49Clicod), AV50BarencCli, lV57Impresionhdrscvdetalleds_2_tfbarnhdr, AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel, AV59Impresionhdrscvdetalleds_4_tfbarfecgen, AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to, lV61Impresionhdrscvdetalleds_6_tfbarenccli, AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel, lV63Impresionhdrscvdetalleds_8_tfbarser, AV64Impresionhdrscvdetalleds_9_tfbarser_sel, lV65Impresionhdrscvdetalleds_10_tfbarserdsc, AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel, lV67Impresionhdrscvdetalleds_12_tfbarcolnom, AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel, lV69Impresionhdrscvdetalleds_14_tfbarnomcli, AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel, AV71Impresionhdrscvdetalleds_16_tfbarkgm, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to, lV73Impresionhdrscvdetalleds_18_tfbaragrest, AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel, Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart), Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk93311 = false ;
         A396EmprCod = P093313_A396EmprCod[0] ;
         A252CliCod = P093313_A252CliCod[0] ;
         n252CliCod = P093313_n252CliCod[0] ;
         A4812BarEncCli = P093313_A4812BarEncCli[0] ;
         A1234BarNomCli = P093313_A1234BarNomCli[0] ;
         A1503BarPart = P093313_A1503BarPart[0] ;
         A120BarAgrEst = P093313_A120BarAgrEst[0] ;
         A135BarColNom = P093313_A135BarColNom[0] ;
         A1652BarSerDsc = P093313_A1652BarSerDsc[0] ;
         A212BarSer = P093313_A212BarSer[0] ;
         A159BarFecGen = P093313_A159BarFecGen[0] ;
         A13696BarNHdr = P093313_A13696BarNHdr[0] ;
         A166BarKgm = P093313_A166BarKgm[0] ;
         n166BarKgm = P093313_n166BarKgm[0] ;
         A129BarCod = P093313_A129BarCod[0] ;
         A132BarCodReo = P093313_A132BarCodReo[0] ;
         A130BarCodPar = P093313_A130BarCodPar[0] ;
         A166BarKgm = P093313_A166BarKgm[0] ;
         n166BarKgm = P093313_n166BarKgm[0] ;
         AV41count = (short)(0) ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P093313_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk93311 = false ;
            A396EmprCod = P093313_A396EmprCod[0] ;
            A129BarCod = P093313_A129BarCod[0] ;
            A132BarCodReo = P093313_A132BarCodReo[0] ;
            A130BarCodPar = P093313_A130BarCodPar[0] ;
            AV41count = (short)(AV41count+1) ;
            brk93311 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV33Option = A1234BarNomCli ;
            AV34Options.add(AV33Option, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93311 )
         {
            brk93311 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARAGRESTOPTIONS' Routine */
      returnInSub = false ;
      AV51TFBarAgrEst = AV29SearchTxt ;
      AV26TFBarAgrEst_Sel = "" ;
      AV56Impresionhdrscvdetalleds_1_filterfulltext = AV47FilterFullText ;
      AV57Impresionhdrscvdetalleds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV59Impresionhdrscvdetalleds_4_tfbarfecgen = AV12TFBarFecGen ;
      AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to = AV13TFBarFecGen_To ;
      AV61Impresionhdrscvdetalleds_6_tfbarenccli = AV14TFBarEncCli ;
      AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel = AV15TFBarEncCli_Sel ;
      AV63Impresionhdrscvdetalleds_8_tfbarser = AV16TFBarSer ;
      AV64Impresionhdrscvdetalleds_9_tfbarser_sel = AV17TFBarSer_Sel ;
      AV65Impresionhdrscvdetalleds_10_tfbarserdsc = AV18TFBarSerDsc ;
      AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel = AV19TFBarSerDsc_Sel ;
      AV67Impresionhdrscvdetalleds_12_tfbarcolnom = AV20TFBarColNom ;
      AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel = AV21TFBarColNom_Sel ;
      AV69Impresionhdrscvdetalleds_14_tfbarnomcli = AV22TFBarNomCli ;
      AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel = AV23TFBarNomCli_Sel ;
      AV71Impresionhdrscvdetalleds_16_tfbarkgm = AV24TFBarKgm ;
      AV72Impresionhdrscvdetalleds_17_tfbarkgm_to = AV25TFBarKgm_To ;
      AV73Impresionhdrscvdetalleds_18_tfbaragrest = AV51TFBarAgrEst ;
      AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel = AV26TFBarAgrEst_Sel ;
      AV75Impresionhdrscvdetalleds_20_tfbarpart = AV27TFBarPart ;
      AV76Impresionhdrscvdetalleds_21_tfbarpart_to = AV28TFBarPart_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                           AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                           AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                           AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                           AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                           AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                           AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                           AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                           AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                           AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                           AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                           AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                           AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                           AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                           AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                           AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                           AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                           AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                           Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart) ,
                                           Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A159BarFecGen ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A120BarAgrEst ,
                                           Short.valueOf(A1503BarPart) ,
                                           AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A396EmprCod ,
                                           AV48Emprcod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV49Clicod) ,
                                           AV50BarencCli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.STRING
                                           }
      });
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV56Impresionhdrscvdetalleds_1_filterfulltext), "%", "") ;
      lV57Impresionhdrscvdetalleds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV57Impresionhdrscvdetalleds_2_tfbarnhdr), 11, "%") ;
      lV61Impresionhdrscvdetalleds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV61Impresionhdrscvdetalleds_6_tfbarenccli), 20, "%") ;
      lV63Impresionhdrscvdetalleds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV63Impresionhdrscvdetalleds_8_tfbarser), 16, "%") ;
      lV65Impresionhdrscvdetalleds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV65Impresionhdrscvdetalleds_10_tfbarserdsc), 26, "%") ;
      lV67Impresionhdrscvdetalleds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV67Impresionhdrscvdetalleds_12_tfbarcolnom), 13, "%") ;
      lV69Impresionhdrscvdetalleds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV69Impresionhdrscvdetalleds_14_tfbarnomcli), 13, "%") ;
      lV73Impresionhdrscvdetalleds_18_tfbaragrest = GXutil.padr( GXutil.rtrim( AV73Impresionhdrscvdetalleds_18_tfbaragrest), 1, "%") ;
      /* Using cursor P093315 */
      pr_default.execute(6, new Object[] {AV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, lV56Impresionhdrscvdetalleds_1_filterfulltext, AV48Emprcod, Integer.valueOf(AV49Clicod), AV50BarencCli, lV57Impresionhdrscvdetalleds_2_tfbarnhdr, AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel, AV59Impresionhdrscvdetalleds_4_tfbarfecgen, AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to, lV61Impresionhdrscvdetalleds_6_tfbarenccli, AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel, lV63Impresionhdrscvdetalleds_8_tfbarser, AV64Impresionhdrscvdetalleds_9_tfbarser_sel, lV65Impresionhdrscvdetalleds_10_tfbarserdsc, AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel, lV67Impresionhdrscvdetalleds_12_tfbarcolnom, AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel, lV69Impresionhdrscvdetalleds_14_tfbarnomcli, AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel, AV71Impresionhdrscvdetalleds_16_tfbarkgm, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to, lV73Impresionhdrscvdetalleds_18_tfbaragrest, AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel, Short.valueOf(AV75Impresionhdrscvdetalleds_20_tfbarpart), Short.valueOf(AV76Impresionhdrscvdetalleds_21_tfbarpart_to)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk93313 = false ;
         A396EmprCod = P093315_A396EmprCod[0] ;
         A252CliCod = P093315_A252CliCod[0] ;
         n252CliCod = P093315_n252CliCod[0] ;
         A4812BarEncCli = P093315_A4812BarEncCli[0] ;
         A120BarAgrEst = P093315_A120BarAgrEst[0] ;
         A1503BarPart = P093315_A1503BarPart[0] ;
         A1234BarNomCli = P093315_A1234BarNomCli[0] ;
         A135BarColNom = P093315_A135BarColNom[0] ;
         A1652BarSerDsc = P093315_A1652BarSerDsc[0] ;
         A212BarSer = P093315_A212BarSer[0] ;
         A159BarFecGen = P093315_A159BarFecGen[0] ;
         A13696BarNHdr = P093315_A13696BarNHdr[0] ;
         A166BarKgm = P093315_A166BarKgm[0] ;
         n166BarKgm = P093315_n166BarKgm[0] ;
         A129BarCod = P093315_A129BarCod[0] ;
         A132BarCodReo = P093315_A132BarCodReo[0] ;
         A130BarCodPar = P093315_A130BarCodPar[0] ;
         A166BarKgm = P093315_A166BarKgm[0] ;
         n166BarKgm = P093315_n166BarKgm[0] ;
         AV41count = (short)(0) ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P093315_A120BarAgrEst[0], A120BarAgrEst) == 0 ) )
         {
            brk93313 = false ;
            A396EmprCod = P093315_A396EmprCod[0] ;
            A129BarCod = P093315_A129BarCod[0] ;
            A132BarCodReo = P093315_A132BarCodReo[0] ;
            A130BarCodPar = P093315_A130BarCodPar[0] ;
            AV41count = (short)(AV41count+1) ;
            brk93313 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A120BarAgrEst)==0) )
         {
            AV33Option = A120BarAgrEst ;
            AV36OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))) ;
            AV34Options.add(AV33Option, 0);
            AV37OptionsDesc.add(AV36OptionDesc, 0);
            AV39OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV41count), "Z,ZZ9")), 0);
         }
         if ( AV34Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk93313 )
         {
            brk93313 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = impresionhdrscvdetallegetfilterdata.this.AV35OptionsJson;
      this.aP4[0] = impresionhdrscvdetallegetfilterdata.this.AV38OptionsDescJson;
      this.aP5[0] = impresionhdrscvdetallegetfilterdata.this.AV40OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35OptionsJson = "" ;
      AV38OptionsDescJson = "" ;
      AV40OptionIndexesJson = "" ;
      AV34Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV37OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV42Session = httpContext.getWebSession();
      AV44GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV45GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV47FilterFullText = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV12TFBarFecGen = GXutil.nullDate() ;
      AV13TFBarFecGen_To = GXutil.nullDate() ;
      AV14TFBarEncCli = "" ;
      AV15TFBarEncCli_Sel = "" ;
      AV16TFBarSer = "" ;
      AV17TFBarSer_Sel = "" ;
      AV18TFBarSerDsc = "" ;
      AV19TFBarSerDsc_Sel = "" ;
      AV20TFBarColNom = "" ;
      AV21TFBarColNom_Sel = "" ;
      AV22TFBarNomCli = "" ;
      AV23TFBarNomCli_Sel = "" ;
      AV24TFBarKgm = DecimalUtil.ZERO ;
      AV25TFBarKgm_To = DecimalUtil.ZERO ;
      AV51TFBarAgrEst = "" ;
      AV26TFBarAgrEst_Sel = "" ;
      AV48Emprcod = "" ;
      AV50BarencCli = "" ;
      A13696BarNHdr = "" ;
      AV56Impresionhdrscvdetalleds_1_filterfulltext = "" ;
      AV57Impresionhdrscvdetalleds_2_tfbarnhdr = "" ;
      AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel = "" ;
      AV59Impresionhdrscvdetalleds_4_tfbarfecgen = GXutil.nullDate() ;
      AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to = GXutil.nullDate() ;
      AV61Impresionhdrscvdetalleds_6_tfbarenccli = "" ;
      AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel = "" ;
      AV63Impresionhdrscvdetalleds_8_tfbarser = "" ;
      AV64Impresionhdrscvdetalleds_9_tfbarser_sel = "" ;
      AV65Impresionhdrscvdetalleds_10_tfbarserdsc = "" ;
      AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel = "" ;
      AV67Impresionhdrscvdetalleds_12_tfbarcolnom = "" ;
      AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel = "" ;
      AV69Impresionhdrscvdetalleds_14_tfbarnomcli = "" ;
      AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel = "" ;
      AV71Impresionhdrscvdetalleds_16_tfbarkgm = DecimalUtil.ZERO ;
      AV72Impresionhdrscvdetalleds_17_tfbarkgm_to = DecimalUtil.ZERO ;
      AV73Impresionhdrscvdetalleds_18_tfbaragrest = "" ;
      AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel = "" ;
      lV56Impresionhdrscvdetalleds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV57Impresionhdrscvdetalleds_2_tfbarnhdr = "" ;
      lV61Impresionhdrscvdetalleds_6_tfbarenccli = "" ;
      lV63Impresionhdrscvdetalleds_8_tfbarser = "" ;
      lV65Impresionhdrscvdetalleds_10_tfbarserdsc = "" ;
      lV67Impresionhdrscvdetalleds_12_tfbarcolnom = "" ;
      lV69Impresionhdrscvdetalleds_14_tfbarnomcli = "" ;
      lV73Impresionhdrscvdetalleds_18_tfbaragrest = "" ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A396EmprCod = "" ;
      P09333_A252CliCod = new int[1] ;
      P09333_n252CliCod = new boolean[] {false} ;
      P09333_A396EmprCod = new String[] {""} ;
      P09333_A1503BarPart = new short[1] ;
      P09333_A120BarAgrEst = new String[] {""} ;
      P09333_A1234BarNomCli = new String[] {""} ;
      P09333_A135BarColNom = new String[] {""} ;
      P09333_A1652BarSerDsc = new String[] {""} ;
      P09333_A212BarSer = new String[] {""} ;
      P09333_A4812BarEncCli = new String[] {""} ;
      P09333_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09333_A13696BarNHdr = new String[] {""} ;
      P09333_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09333_n166BarKgm = new boolean[] {false} ;
      P09333_A129BarCod = new int[1] ;
      P09333_A132BarCodReo = new byte[1] ;
      P09333_A130BarCodPar = new String[] {""} ;
      AV33Option = "" ;
      P09335_A396EmprCod = new String[] {""} ;
      P09335_A252CliCod = new int[1] ;
      P09335_n252CliCod = new boolean[] {false} ;
      P09335_A4812BarEncCli = new String[] {""} ;
      P09335_A1503BarPart = new short[1] ;
      P09335_A120BarAgrEst = new String[] {""} ;
      P09335_A1234BarNomCli = new String[] {""} ;
      P09335_A135BarColNom = new String[] {""} ;
      P09335_A1652BarSerDsc = new String[] {""} ;
      P09335_A212BarSer = new String[] {""} ;
      P09335_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09335_A13696BarNHdr = new String[] {""} ;
      P09335_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09335_n166BarKgm = new boolean[] {false} ;
      P09335_A129BarCod = new int[1] ;
      P09335_A132BarCodReo = new byte[1] ;
      P09335_A130BarCodPar = new String[] {""} ;
      P09337_A252CliCod = new int[1] ;
      P09337_n252CliCod = new boolean[] {false} ;
      P09337_A396EmprCod = new String[] {""} ;
      P09337_A212BarSer = new String[] {""} ;
      P09337_A1503BarPart = new short[1] ;
      P09337_A120BarAgrEst = new String[] {""} ;
      P09337_A1234BarNomCli = new String[] {""} ;
      P09337_A135BarColNom = new String[] {""} ;
      P09337_A1652BarSerDsc = new String[] {""} ;
      P09337_A4812BarEncCli = new String[] {""} ;
      P09337_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09337_A13696BarNHdr = new String[] {""} ;
      P09337_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09337_n166BarKgm = new boolean[] {false} ;
      P09337_A129BarCod = new int[1] ;
      P09337_A132BarCodReo = new byte[1] ;
      P09337_A130BarCodPar = new String[] {""} ;
      P09339_A396EmprCod = new String[] {""} ;
      P09339_A252CliCod = new int[1] ;
      P09339_n252CliCod = new boolean[] {false} ;
      P09339_A4812BarEncCli = new String[] {""} ;
      P09339_A1652BarSerDsc = new String[] {""} ;
      P09339_A1503BarPart = new short[1] ;
      P09339_A120BarAgrEst = new String[] {""} ;
      P09339_A1234BarNomCli = new String[] {""} ;
      P09339_A135BarColNom = new String[] {""} ;
      P09339_A212BarSer = new String[] {""} ;
      P09339_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09339_A13696BarNHdr = new String[] {""} ;
      P09339_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09339_n166BarKgm = new boolean[] {false} ;
      P09339_A129BarCod = new int[1] ;
      P09339_A132BarCodReo = new byte[1] ;
      P09339_A130BarCodPar = new String[] {""} ;
      P093311_A396EmprCod = new String[] {""} ;
      P093311_A252CliCod = new int[1] ;
      P093311_n252CliCod = new boolean[] {false} ;
      P093311_A4812BarEncCli = new String[] {""} ;
      P093311_A135BarColNom = new String[] {""} ;
      P093311_A1503BarPart = new short[1] ;
      P093311_A120BarAgrEst = new String[] {""} ;
      P093311_A1234BarNomCli = new String[] {""} ;
      P093311_A1652BarSerDsc = new String[] {""} ;
      P093311_A212BarSer = new String[] {""} ;
      P093311_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093311_A13696BarNHdr = new String[] {""} ;
      P093311_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093311_n166BarKgm = new boolean[] {false} ;
      P093311_A129BarCod = new int[1] ;
      P093311_A132BarCodReo = new byte[1] ;
      P093311_A130BarCodPar = new String[] {""} ;
      P093313_A396EmprCod = new String[] {""} ;
      P093313_A252CliCod = new int[1] ;
      P093313_n252CliCod = new boolean[] {false} ;
      P093313_A4812BarEncCli = new String[] {""} ;
      P093313_A1234BarNomCli = new String[] {""} ;
      P093313_A1503BarPart = new short[1] ;
      P093313_A120BarAgrEst = new String[] {""} ;
      P093313_A135BarColNom = new String[] {""} ;
      P093313_A1652BarSerDsc = new String[] {""} ;
      P093313_A212BarSer = new String[] {""} ;
      P093313_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093313_A13696BarNHdr = new String[] {""} ;
      P093313_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093313_n166BarKgm = new boolean[] {false} ;
      P093313_A129BarCod = new int[1] ;
      P093313_A132BarCodReo = new byte[1] ;
      P093313_A130BarCodPar = new String[] {""} ;
      P093315_A396EmprCod = new String[] {""} ;
      P093315_A252CliCod = new int[1] ;
      P093315_n252CliCod = new boolean[] {false} ;
      P093315_A4812BarEncCli = new String[] {""} ;
      P093315_A120BarAgrEst = new String[] {""} ;
      P093315_A1503BarPart = new short[1] ;
      P093315_A1234BarNomCli = new String[] {""} ;
      P093315_A135BarColNom = new String[] {""} ;
      P093315_A1652BarSerDsc = new String[] {""} ;
      P093315_A212BarSer = new String[] {""} ;
      P093315_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093315_A13696BarNHdr = new String[] {""} ;
      P093315_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093315_n166BarKgm = new boolean[] {false} ;
      P093315_A129BarCod = new int[1] ;
      P093315_A132BarCodReo = new byte[1] ;
      P093315_A130BarCodPar = new String[] {""} ;
      AV36OptionDesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.impresionhdrscvdetallegetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09333_A252CliCod, P09333_n252CliCod, P09333_A396EmprCod, P09333_A1503BarPart, P09333_A120BarAgrEst, P09333_A1234BarNomCli, P09333_A135BarColNom, P09333_A1652BarSerDsc, P09333_A212BarSer, P09333_A4812BarEncCli,
            P09333_A159BarFecGen, P09333_A13696BarNHdr, P09333_A166BarKgm, P09333_n166BarKgm, P09333_A129BarCod, P09333_A132BarCodReo, P09333_A130BarCodPar
            }
            , new Object[] {
            P09335_A396EmprCod, P09335_A252CliCod, P09335_n252CliCod, P09335_A4812BarEncCli, P09335_A1503BarPart, P09335_A120BarAgrEst, P09335_A1234BarNomCli, P09335_A135BarColNom, P09335_A1652BarSerDsc, P09335_A212BarSer,
            P09335_A159BarFecGen, P09335_A13696BarNHdr, P09335_A166BarKgm, P09335_n166BarKgm, P09335_A129BarCod, P09335_A132BarCodReo, P09335_A130BarCodPar
            }
            , new Object[] {
            P09337_A252CliCod, P09337_n252CliCod, P09337_A396EmprCod, P09337_A212BarSer, P09337_A1503BarPart, P09337_A120BarAgrEst, P09337_A1234BarNomCli, P09337_A135BarColNom, P09337_A1652BarSerDsc, P09337_A4812BarEncCli,
            P09337_A159BarFecGen, P09337_A13696BarNHdr, P09337_A166BarKgm, P09337_n166BarKgm, P09337_A129BarCod, P09337_A132BarCodReo, P09337_A130BarCodPar
            }
            , new Object[] {
            P09339_A396EmprCod, P09339_A252CliCod, P09339_n252CliCod, P09339_A4812BarEncCli, P09339_A1652BarSerDsc, P09339_A1503BarPart, P09339_A120BarAgrEst, P09339_A1234BarNomCli, P09339_A135BarColNom, P09339_A212BarSer,
            P09339_A159BarFecGen, P09339_A13696BarNHdr, P09339_A166BarKgm, P09339_n166BarKgm, P09339_A129BarCod, P09339_A132BarCodReo, P09339_A130BarCodPar
            }
            , new Object[] {
            P093311_A396EmprCod, P093311_A252CliCod, P093311_n252CliCod, P093311_A4812BarEncCli, P093311_A135BarColNom, P093311_A1503BarPart, P093311_A120BarAgrEst, P093311_A1234BarNomCli, P093311_A1652BarSerDsc, P093311_A212BarSer,
            P093311_A159BarFecGen, P093311_A13696BarNHdr, P093311_A166BarKgm, P093311_n166BarKgm, P093311_A129BarCod, P093311_A132BarCodReo, P093311_A130BarCodPar
            }
            , new Object[] {
            P093313_A396EmprCod, P093313_A252CliCod, P093313_n252CliCod, P093313_A4812BarEncCli, P093313_A1234BarNomCli, P093313_A1503BarPart, P093313_A120BarAgrEst, P093313_A135BarColNom, P093313_A1652BarSerDsc, P093313_A212BarSer,
            P093313_A159BarFecGen, P093313_A13696BarNHdr, P093313_A166BarKgm, P093313_n166BarKgm, P093313_A129BarCod, P093313_A132BarCodReo, P093313_A130BarCodPar
            }
            , new Object[] {
            P093315_A396EmprCod, P093315_A252CliCod, P093315_n252CliCod, P093315_A4812BarEncCli, P093315_A120BarAgrEst, P093315_A1503BarPart, P093315_A1234BarNomCli, P093315_A135BarColNom, P093315_A1652BarSerDsc, P093315_A212BarSer,
            P093315_A159BarFecGen, P093315_A13696BarNHdr, P093315_A166BarKgm, P093315_n166BarKgm, P093315_A129BarCod, P093315_A132BarCodReo, P093315_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV27TFBarPart ;
   private short AV28TFBarPart_To ;
   private short AV75Impresionhdrscvdetalleds_20_tfbarpart ;
   private short AV76Impresionhdrscvdetalleds_21_tfbarpart_to ;
   private short A1503BarPart ;
   private short AV41count ;
   private short Gx_err ;
   private int AV54GXV1 ;
   private int AV49Clicod ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV32InsertIndex ;
   private java.math.BigDecimal AV24TFBarKgm ;
   private java.math.BigDecimal AV25TFBarKgm_To ;
   private java.math.BigDecimal AV71Impresionhdrscvdetalleds_16_tfbarkgm ;
   private java.math.BigDecimal AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ;
   private java.math.BigDecimal A166BarKgm ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV14TFBarEncCli ;
   private String AV15TFBarEncCli_Sel ;
   private String AV16TFBarSer ;
   private String AV17TFBarSer_Sel ;
   private String AV18TFBarSerDsc ;
   private String AV19TFBarSerDsc_Sel ;
   private String AV20TFBarColNom ;
   private String AV21TFBarColNom_Sel ;
   private String AV22TFBarNomCli ;
   private String AV23TFBarNomCli_Sel ;
   private String AV51TFBarAgrEst ;
   private String AV26TFBarAgrEst_Sel ;
   private String AV48Emprcod ;
   private String AV50BarencCli ;
   private String A13696BarNHdr ;
   private String AV57Impresionhdrscvdetalleds_2_tfbarnhdr ;
   private String AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ;
   private String AV61Impresionhdrscvdetalleds_6_tfbarenccli ;
   private String AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ;
   private String AV63Impresionhdrscvdetalleds_8_tfbarser ;
   private String AV64Impresionhdrscvdetalleds_9_tfbarser_sel ;
   private String AV65Impresionhdrscvdetalleds_10_tfbarserdsc ;
   private String AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ;
   private String AV67Impresionhdrscvdetalleds_12_tfbarcolnom ;
   private String AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ;
   private String AV69Impresionhdrscvdetalleds_14_tfbarnomcli ;
   private String AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ;
   private String AV73Impresionhdrscvdetalleds_18_tfbaragrest ;
   private String AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ;
   private String scmdbuf ;
   private String lV57Impresionhdrscvdetalleds_2_tfbarnhdr ;
   private String lV61Impresionhdrscvdetalleds_6_tfbarenccli ;
   private String lV63Impresionhdrscvdetalleds_8_tfbarser ;
   private String lV65Impresionhdrscvdetalleds_10_tfbarserdsc ;
   private String lV67Impresionhdrscvdetalleds_12_tfbarcolnom ;
   private String lV69Impresionhdrscvdetalleds_14_tfbarnomcli ;
   private String lV73Impresionhdrscvdetalleds_18_tfbaragrest ;
   private String A130BarCodPar ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A120BarAgrEst ;
   private String A396EmprCod ;
   private java.util.Date AV12TFBarFecGen ;
   private java.util.Date AV13TFBarFecGen_To ;
   private java.util.Date AV59Impresionhdrscvdetalleds_4_tfbarfecgen ;
   private java.util.Date AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ;
   private java.util.Date A159BarFecGen ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n166BarKgm ;
   private boolean brk9333 ;
   private boolean brk9335 ;
   private boolean brk9337 ;
   private boolean brk9339 ;
   private boolean brk93311 ;
   private boolean brk93313 ;
   private String AV35OptionsJson ;
   private String AV38OptionsDescJson ;
   private String AV40OptionIndexesJson ;
   private String AV31DDOName ;
   private String AV29SearchTxt ;
   private String AV30SearchTxtTo ;
   private String AV47FilterFullText ;
   private String AV56Impresionhdrscvdetalleds_1_filterfulltext ;
   private String lV56Impresionhdrscvdetalleds_1_filterfulltext ;
   private String AV33Option ;
   private String AV36OptionDesc ;
   private com.genexus.webpanels.WebSession AV42Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P09333_A252CliCod ;
   private boolean[] P09333_n252CliCod ;
   private String[] P09333_A396EmprCod ;
   private short[] P09333_A1503BarPart ;
   private String[] P09333_A120BarAgrEst ;
   private String[] P09333_A1234BarNomCli ;
   private String[] P09333_A135BarColNom ;
   private String[] P09333_A1652BarSerDsc ;
   private String[] P09333_A212BarSer ;
   private String[] P09333_A4812BarEncCli ;
   private java.util.Date[] P09333_A159BarFecGen ;
   private String[] P09333_A13696BarNHdr ;
   private java.math.BigDecimal[] P09333_A166BarKgm ;
   private boolean[] P09333_n166BarKgm ;
   private int[] P09333_A129BarCod ;
   private byte[] P09333_A132BarCodReo ;
   private String[] P09333_A130BarCodPar ;
   private String[] P09335_A396EmprCod ;
   private int[] P09335_A252CliCod ;
   private boolean[] P09335_n252CliCod ;
   private String[] P09335_A4812BarEncCli ;
   private short[] P09335_A1503BarPart ;
   private String[] P09335_A120BarAgrEst ;
   private String[] P09335_A1234BarNomCli ;
   private String[] P09335_A135BarColNom ;
   private String[] P09335_A1652BarSerDsc ;
   private String[] P09335_A212BarSer ;
   private java.util.Date[] P09335_A159BarFecGen ;
   private String[] P09335_A13696BarNHdr ;
   private java.math.BigDecimal[] P09335_A166BarKgm ;
   private boolean[] P09335_n166BarKgm ;
   private int[] P09335_A129BarCod ;
   private byte[] P09335_A132BarCodReo ;
   private String[] P09335_A130BarCodPar ;
   private int[] P09337_A252CliCod ;
   private boolean[] P09337_n252CliCod ;
   private String[] P09337_A396EmprCod ;
   private String[] P09337_A212BarSer ;
   private short[] P09337_A1503BarPart ;
   private String[] P09337_A120BarAgrEst ;
   private String[] P09337_A1234BarNomCli ;
   private String[] P09337_A135BarColNom ;
   private String[] P09337_A1652BarSerDsc ;
   private String[] P09337_A4812BarEncCli ;
   private java.util.Date[] P09337_A159BarFecGen ;
   private String[] P09337_A13696BarNHdr ;
   private java.math.BigDecimal[] P09337_A166BarKgm ;
   private boolean[] P09337_n166BarKgm ;
   private int[] P09337_A129BarCod ;
   private byte[] P09337_A132BarCodReo ;
   private String[] P09337_A130BarCodPar ;
   private String[] P09339_A396EmprCod ;
   private int[] P09339_A252CliCod ;
   private boolean[] P09339_n252CliCod ;
   private String[] P09339_A4812BarEncCli ;
   private String[] P09339_A1652BarSerDsc ;
   private short[] P09339_A1503BarPart ;
   private String[] P09339_A120BarAgrEst ;
   private String[] P09339_A1234BarNomCli ;
   private String[] P09339_A135BarColNom ;
   private String[] P09339_A212BarSer ;
   private java.util.Date[] P09339_A159BarFecGen ;
   private String[] P09339_A13696BarNHdr ;
   private java.math.BigDecimal[] P09339_A166BarKgm ;
   private boolean[] P09339_n166BarKgm ;
   private int[] P09339_A129BarCod ;
   private byte[] P09339_A132BarCodReo ;
   private String[] P09339_A130BarCodPar ;
   private String[] P093311_A396EmprCod ;
   private int[] P093311_A252CliCod ;
   private boolean[] P093311_n252CliCod ;
   private String[] P093311_A4812BarEncCli ;
   private String[] P093311_A135BarColNom ;
   private short[] P093311_A1503BarPart ;
   private String[] P093311_A120BarAgrEst ;
   private String[] P093311_A1234BarNomCli ;
   private String[] P093311_A1652BarSerDsc ;
   private String[] P093311_A212BarSer ;
   private java.util.Date[] P093311_A159BarFecGen ;
   private String[] P093311_A13696BarNHdr ;
   private java.math.BigDecimal[] P093311_A166BarKgm ;
   private boolean[] P093311_n166BarKgm ;
   private int[] P093311_A129BarCod ;
   private byte[] P093311_A132BarCodReo ;
   private String[] P093311_A130BarCodPar ;
   private String[] P093313_A396EmprCod ;
   private int[] P093313_A252CliCod ;
   private boolean[] P093313_n252CliCod ;
   private String[] P093313_A4812BarEncCli ;
   private String[] P093313_A1234BarNomCli ;
   private short[] P093313_A1503BarPart ;
   private String[] P093313_A120BarAgrEst ;
   private String[] P093313_A135BarColNom ;
   private String[] P093313_A1652BarSerDsc ;
   private String[] P093313_A212BarSer ;
   private java.util.Date[] P093313_A159BarFecGen ;
   private String[] P093313_A13696BarNHdr ;
   private java.math.BigDecimal[] P093313_A166BarKgm ;
   private boolean[] P093313_n166BarKgm ;
   private int[] P093313_A129BarCod ;
   private byte[] P093313_A132BarCodReo ;
   private String[] P093313_A130BarCodPar ;
   private String[] P093315_A396EmprCod ;
   private int[] P093315_A252CliCod ;
   private boolean[] P093315_n252CliCod ;
   private String[] P093315_A4812BarEncCli ;
   private String[] P093315_A120BarAgrEst ;
   private short[] P093315_A1503BarPart ;
   private String[] P093315_A1234BarNomCli ;
   private String[] P093315_A135BarColNom ;
   private String[] P093315_A1652BarSerDsc ;
   private String[] P093315_A212BarSer ;
   private java.util.Date[] P093315_A159BarFecGen ;
   private String[] P093315_A13696BarNHdr ;
   private java.math.BigDecimal[] P093315_A166BarKgm ;
   private boolean[] P093315_n166BarKgm ;
   private int[] P093315_A129BarCod ;
   private byte[] P093315_A132BarCodReo ;
   private String[] P093315_A130BarCodPar ;
   private GXSimpleCollection<String> AV34Options ;
   private GXSimpleCollection<String> AV37OptionsDesc ;
   private GXSimpleCollection<String> AV39OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV44GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV45GridStateFilterValue ;
}

final  class impresionhdrscvdetallegetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09333( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                          String AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                          java.util.Date AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                          java.util.Date AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                          String AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                          String AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                          String AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                          String AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                          String AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                          String AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                          String AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                          String AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                          String AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                          String AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                          java.math.BigDecimal AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                          java.math.BigDecimal AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                          String AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                          String AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                          short AV75Impresionhdrscvdetalleds_20_tfbarpart ,
                                          short AV76Impresionhdrscvdetalleds_21_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          java.util.Date A159BarFecGen ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          String A120BarAgrEst ,
                                          short A1503BarPart ,
                                          String AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String AV50BarencCli ,
                                          String AV48Emprcod ,
                                          int AV49Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[33];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.EmprCod, T1.BarPart, T1.BarAgrEst, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarEncCli, T1.BarFecGen, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      scmdbuf += " FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPart,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.BarEncCli = ?)");
      if ( (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Impresionhdrscvdetalleds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Impresionhdrscvdetalleds_4_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV61Impresionhdrscvdetalleds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV63Impresionhdrscvdetalleds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Impresionhdrscvdetalleds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Impresionhdrscvdetalleds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV69Impresionhdrscvdetalleds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Impresionhdrscvdetalleds_16_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV73Impresionhdrscvdetalleds_18_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV75Impresionhdrscvdetalleds_20_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Impresionhdrscvdetalleds_21_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P09335( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                          String AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                          java.util.Date AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                          java.util.Date AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                          String AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                          String AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                          String AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                          String AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                          String AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                          String AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                          String AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                          String AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                          String AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                          String AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                          java.math.BigDecimal AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                          java.math.BigDecimal AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                          String AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                          String AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                          short AV75Impresionhdrscvdetalleds_20_tfbarpart ,
                                          short AV76Impresionhdrscvdetalleds_21_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          java.util.Date A159BarFecGen ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          String A120BarAgrEst ,
                                          short A1503BarPart ,
                                          String AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A396EmprCod ,
                                          String AV48Emprcod ,
                                          int A252CliCod ,
                                          int AV49Clicod ,
                                          String AV50BarencCli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[33];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.BarEncCli, T1.BarPart, T1.BarAgrEst, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarFecGen, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      scmdbuf += " FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.BarEncCli = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPart,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      if ( (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Impresionhdrscvdetalleds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Impresionhdrscvdetalleds_4_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV61Impresionhdrscvdetalleds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV63Impresionhdrscvdetalleds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Impresionhdrscvdetalleds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Impresionhdrscvdetalleds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV69Impresionhdrscvdetalleds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Impresionhdrscvdetalleds_16_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV73Impresionhdrscvdetalleds_18_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV75Impresionhdrscvdetalleds_20_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Impresionhdrscvdetalleds_21_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarEncCli" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P09337( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                          String AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                          java.util.Date AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                          java.util.Date AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                          String AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                          String AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                          String AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                          String AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                          String AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                          String AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                          String AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                          String AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                          String AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                          String AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                          java.math.BigDecimal AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                          java.math.BigDecimal AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                          String AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                          String AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                          short AV75Impresionhdrscvdetalleds_20_tfbarpart ,
                                          short AV76Impresionhdrscvdetalleds_21_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          java.util.Date A159BarFecGen ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          String A120BarAgrEst ,
                                          short A1503BarPart ,
                                          String AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String AV50BarencCli ,
                                          String AV48Emprcod ,
                                          int AV49Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.CliCod, T1.EmprCod, T1.BarSer, T1.BarPart, T1.BarAgrEst, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarEncCli, T1.BarFecGen, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      scmdbuf += " FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPart,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.BarEncCli = ?)");
      if ( (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Impresionhdrscvdetalleds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Impresionhdrscvdetalleds_4_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV61Impresionhdrscvdetalleds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV63Impresionhdrscvdetalleds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Impresionhdrscvdetalleds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Impresionhdrscvdetalleds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV69Impresionhdrscvdetalleds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Impresionhdrscvdetalleds_16_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV73Impresionhdrscvdetalleds_18_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV75Impresionhdrscvdetalleds_20_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Impresionhdrscvdetalleds_21_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarSer" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P09339( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                          String AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                          java.util.Date AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                          java.util.Date AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                          String AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                          String AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                          String AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                          String AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                          String AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                          String AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                          String AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                          String AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                          String AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                          String AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                          java.math.BigDecimal AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                          java.math.BigDecimal AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                          String AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                          String AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                          short AV75Impresionhdrscvdetalleds_20_tfbarpart ,
                                          short AV76Impresionhdrscvdetalleds_21_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          java.util.Date A159BarFecGen ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          String A120BarAgrEst ,
                                          short A1503BarPart ,
                                          String AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A396EmprCod ,
                                          String AV48Emprcod ,
                                          int A252CliCod ,
                                          int AV49Clicod ,
                                          String AV50BarencCli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.BarEncCli, T1.BarSerDsc, T1.BarPart, T1.BarAgrEst, T1.BarNomCli, T1.BarColNom, T1.BarSer, T1.BarFecGen, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      scmdbuf += " FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPart,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ?)");
      if ( (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Impresionhdrscvdetalleds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Impresionhdrscvdetalleds_4_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV61Impresionhdrscvdetalleds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV63Impresionhdrscvdetalleds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Impresionhdrscvdetalleds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Impresionhdrscvdetalleds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV69Impresionhdrscvdetalleds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Impresionhdrscvdetalleds_16_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV73Impresionhdrscvdetalleds_18_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV75Impresionhdrscvdetalleds_20_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Impresionhdrscvdetalleds_21_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P093311( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                           String AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                           java.util.Date AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                           java.util.Date AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                           String AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                           String AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                           String AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                           String AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                           String AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                           String AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                           String AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                           String AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                           String AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                           String AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                           java.math.BigDecimal AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                           java.math.BigDecimal AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                           String AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                           String AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                           short AV75Impresionhdrscvdetalleds_20_tfbarpart ,
                                           short AV76Impresionhdrscvdetalleds_21_tfbarpart_to ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           java.util.Date A159BarFecGen ,
                                           String A4812BarEncCli ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           String A120BarAgrEst ,
                                           short A1503BarPart ,
                                           String AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A396EmprCod ,
                                           String AV48Emprcod ,
                                           int A252CliCod ,
                                           int AV49Clicod ,
                                           String AV50BarencCli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[33];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.BarEncCli, T1.BarColNom, T1.BarPart, T1.BarAgrEst, T1.BarNomCli, T1.BarSerDsc, T1.BarSer, T1.BarFecGen, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      scmdbuf += " FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPart,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ?)");
      if ( (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Impresionhdrscvdetalleds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Impresionhdrscvdetalleds_4_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV61Impresionhdrscvdetalleds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV63Impresionhdrscvdetalleds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Impresionhdrscvdetalleds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Impresionhdrscvdetalleds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV69Impresionhdrscvdetalleds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Impresionhdrscvdetalleds_16_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV73Impresionhdrscvdetalleds_18_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV75Impresionhdrscvdetalleds_20_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Impresionhdrscvdetalleds_21_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P093313( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                           String AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                           java.util.Date AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                           java.util.Date AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                           String AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                           String AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                           String AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                           String AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                           String AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                           String AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                           String AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                           String AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                           String AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                           String AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                           java.math.BigDecimal AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                           java.math.BigDecimal AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                           String AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                           String AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                           short AV75Impresionhdrscvdetalleds_20_tfbarpart ,
                                           short AV76Impresionhdrscvdetalleds_21_tfbarpart_to ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           java.util.Date A159BarFecGen ,
                                           String A4812BarEncCli ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           String A120BarAgrEst ,
                                           short A1503BarPart ,
                                           String AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A396EmprCod ,
                                           String AV48Emprcod ,
                                           int A252CliCod ,
                                           int AV49Clicod ,
                                           String AV50BarencCli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[33];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.BarEncCli, T1.BarNomCli, T1.BarPart, T1.BarAgrEst, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarFecGen, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      scmdbuf += " FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPart,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ?)");
      if ( (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Impresionhdrscvdetalleds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Impresionhdrscvdetalleds_4_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV61Impresionhdrscvdetalleds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV63Impresionhdrscvdetalleds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Impresionhdrscvdetalleds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Impresionhdrscvdetalleds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV69Impresionhdrscvdetalleds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Impresionhdrscvdetalleds_16_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV73Impresionhdrscvdetalleds_18_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV75Impresionhdrscvdetalleds_20_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Impresionhdrscvdetalleds_21_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNomCli" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P093315( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel ,
                                           String AV57Impresionhdrscvdetalleds_2_tfbarnhdr ,
                                           java.util.Date AV59Impresionhdrscvdetalleds_4_tfbarfecgen ,
                                           java.util.Date AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to ,
                                           String AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel ,
                                           String AV61Impresionhdrscvdetalleds_6_tfbarenccli ,
                                           String AV64Impresionhdrscvdetalleds_9_tfbarser_sel ,
                                           String AV63Impresionhdrscvdetalleds_8_tfbarser ,
                                           String AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel ,
                                           String AV65Impresionhdrscvdetalleds_10_tfbarserdsc ,
                                           String AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel ,
                                           String AV67Impresionhdrscvdetalleds_12_tfbarcolnom ,
                                           String AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel ,
                                           String AV69Impresionhdrscvdetalleds_14_tfbarnomcli ,
                                           java.math.BigDecimal AV71Impresionhdrscvdetalleds_16_tfbarkgm ,
                                           java.math.BigDecimal AV72Impresionhdrscvdetalleds_17_tfbarkgm_to ,
                                           String AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel ,
                                           String AV73Impresionhdrscvdetalleds_18_tfbaragrest ,
                                           short AV75Impresionhdrscvdetalleds_20_tfbarpart ,
                                           short AV76Impresionhdrscvdetalleds_21_tfbarpart_to ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           java.util.Date A159BarFecGen ,
                                           String A4812BarEncCli ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           String A120BarAgrEst ,
                                           short A1503BarPart ,
                                           String AV56Impresionhdrscvdetalleds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A396EmprCod ,
                                           String AV48Emprcod ,
                                           int A252CliCod ,
                                           int AV49Clicod ,
                                           String AV50BarencCli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[33];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.BarEncCli, T1.BarAgrEst, T1.BarPart, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarFecGen, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      scmdbuf += " FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarPart,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ?)");
      if ( (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV57Impresionhdrscvdetalleds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Impresionhdrscvdetalleds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV59Impresionhdrscvdetalleds_4_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV60Impresionhdrscvdetalleds_5_tfbarfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV61Impresionhdrscvdetalleds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Impresionhdrscvdetalleds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV63Impresionhdrscvdetalleds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Impresionhdrscvdetalleds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV65Impresionhdrscvdetalleds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Impresionhdrscvdetalleds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV67Impresionhdrscvdetalleds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Impresionhdrscvdetalleds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV69Impresionhdrscvdetalleds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Impresionhdrscvdetalleds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Impresionhdrscvdetalleds_16_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Impresionhdrscvdetalleds_17_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T2.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV73Impresionhdrscvdetalleds_18_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Impresionhdrscvdetalleds_19_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV75Impresionhdrscvdetalleds_20_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV76Impresionhdrscvdetalleds_21_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarAgrEst" ;
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
                  return conditional_P09333(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() );
            case 1 :
                  return conditional_P09335(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] );
            case 2 :
                  return conditional_P09337(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() );
            case 3 :
                  return conditional_P09339(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] );
            case 4 :
                  return conditional_P093311(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] );
            case 5 :
                  return conditional_P093313(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] );
            case 6 :
                  return conditional_P093315(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09333", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09335", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09337", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09339", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093311", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093313", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P093315", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 11);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
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
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 3);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 11);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               return;
      }
   }

}

