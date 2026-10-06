package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class mantenimientodelapartidagetfilterdata extends GXProcedure
{
   public mantenimientodelapartidagetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientodelapartidagetfilterdata.class ), "" );
   }

   public mantenimientodelapartidagetfilterdata( int remoteHandle ,
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
      mantenimientodelapartidagetfilterdata.this.aP5 = new String[] {""};
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
      mantenimientodelapartidagetfilterdata.this.AV26DDOName = aP0;
      mantenimientodelapartidagetfilterdata.this.AV24SearchTxt = aP1;
      mantenimientodelapartidagetfilterdata.this.AV25SearchTxtTo = aP2;
      mantenimientodelapartidagetfilterdata.this.aP3 = aP3;
      mantenimientodelapartidagetfilterdata.this.aP4 = aP4;
      mantenimientodelapartidagetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARENCCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADBARENCCLIOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARNPED") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNPEDOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARNOMCLI") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARSER") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSEROPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARSERDSC") == 0 )
      {
         /* Execute user subroutine: 'LOADBARSERDSCOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV30OptionsJson = AV29Options.toJSonString(false) ;
      AV33OptionsDescJson = AV32OptionsDesc.toJSonString(false) ;
      AV35OptionIndexesJson = AV34OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue("MantenimientodelaPartidaGridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientodelaPartidaGridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV37Session.getValue("MantenimientodelaPartidaGridState"), null, null);
      }
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV48GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV42FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV10TFBarEncCli = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV11TFBarEncCli_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNPED") == 0 )
         {
            AV12TFBarNPed = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNPED_SEL") == 0 )
         {
            AV13TFBarNPed_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV14TFBarNHdr = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV15TFBarNHdr_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV16TFBarColNom = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV17TFBarColNom_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV18TFBarNomCli = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV19TFBarNomCli_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV20TFBarSer = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV21TFBarSer_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV22TFBarSerDsc = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV23TFBarSerDsc_Sel = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARENCCLIOPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarEncCli = AV24SearchTxt ;
      AV11TFBarEncCli_Sel = "" ;
      AV50Mantenimientodelapartidads_1_filterfulltext = AV42FilterFullText ;
      AV51Mantenimientodelapartidads_2_tfbarenccli = AV10TFBarEncCli ;
      AV52Mantenimientodelapartidads_3_tfbarenccli_sel = AV11TFBarEncCli_Sel ;
      AV53Mantenimientodelapartidads_4_tfbarnped = AV12TFBarNPed ;
      AV54Mantenimientodelapartidads_5_tfbarnped_sel = AV13TFBarNPed_Sel ;
      AV55Mantenimientodelapartidads_6_tfbarnhdr = AV14TFBarNHdr ;
      AV56Mantenimientodelapartidads_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV57Mantenimientodelapartidads_8_tfbarcolnom = AV16TFBarColNom ;
      AV58Mantenimientodelapartidads_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV59Mantenimientodelapartidads_10_tfbarnomcli = AV18TFBarNomCli ;
      AV60Mantenimientodelapartidads_11_tfbarnomcli_sel = AV19TFBarNomCli_Sel ;
      AV61Mantenimientodelapartidads_12_tfbarser = AV20TFBarSer ;
      AV62Mantenimientodelapartidads_13_tfbarser_sel = AV21TFBarSer_Sel ;
      AV63Mantenimientodelapartidads_14_tfbarserdsc = AV22TFBarSerDsc ;
      AV64Mantenimientodelapartidads_15_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV50Mantenimientodelapartidads_1_filterfulltext ,
                                           AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                           AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                           AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                           AV53Mantenimientodelapartidads_4_tfbarnped ,
                                           AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                           AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                           AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                           AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                           AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                           AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                           AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                           AV61Mantenimientodelapartidads_12_tfbarser ,
                                           AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                           AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                           A4812BarEncCli ,
                                           A3746BarNPed ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A396EmprCod ,
                                           AV43EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV44Clicod) ,
                                           AV45BarEnccli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV51Mantenimientodelapartidads_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV51Mantenimientodelapartidads_2_tfbarenccli), 20, "%") ;
      lV53Mantenimientodelapartidads_4_tfbarnped = GXutil.padr( GXutil.rtrim( AV53Mantenimientodelapartidads_4_tfbarnped), 20, "%") ;
      lV55Mantenimientodelapartidads_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Mantenimientodelapartidads_6_tfbarnhdr), 11, "%") ;
      lV57Mantenimientodelapartidads_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV57Mantenimientodelapartidads_8_tfbarcolnom), 13, "%") ;
      lV59Mantenimientodelapartidads_10_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV59Mantenimientodelapartidads_10_tfbarnomcli), 13, "%") ;
      lV61Mantenimientodelapartidads_12_tfbarser = GXutil.padr( GXutil.rtrim( AV61Mantenimientodelapartidads_12_tfbarser), 16, "%") ;
      lV63Mantenimientodelapartidads_14_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Mantenimientodelapartidads_14_tfbarserdsc), 26, "%") ;
      /* Using cursor P097W2 */
      pr_default.execute(0, new Object[] {AV45BarEnccli, AV43EmprCod, Integer.valueOf(AV44Clicod), lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV51Mantenimientodelapartidads_2_tfbarenccli, AV52Mantenimientodelapartidads_3_tfbarenccli_sel, lV53Mantenimientodelapartidads_4_tfbarnped, AV54Mantenimientodelapartidads_5_tfbarnped_sel, lV55Mantenimientodelapartidads_6_tfbarnhdr, AV56Mantenimientodelapartidads_7_tfbarnhdr_sel, lV57Mantenimientodelapartidads_8_tfbarcolnom, AV58Mantenimientodelapartidads_9_tfbarcolnom_sel, lV59Mantenimientodelapartidads_10_tfbarnomcli, AV60Mantenimientodelapartidads_11_tfbarnomcli_sel, lV61Mantenimientodelapartidads_12_tfbarser, AV62Mantenimientodelapartidads_13_tfbarser_sel, lV63Mantenimientodelapartidads_14_tfbarserdsc, AV64Mantenimientodelapartidads_15_tfbarserdsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk97W2 = false ;
         A396EmprCod = P097W2_A396EmprCod[0] ;
         A252CliCod = P097W2_A252CliCod[0] ;
         n252CliCod = P097W2_n252CliCod[0] ;
         A4812BarEncCli = P097W2_A4812BarEncCli[0] ;
         A1652BarSerDsc = P097W2_A1652BarSerDsc[0] ;
         A212BarSer = P097W2_A212BarSer[0] ;
         A1234BarNomCli = P097W2_A1234BarNomCli[0] ;
         A135BarColNom = P097W2_A135BarColNom[0] ;
         A3746BarNPed = P097W2_A3746BarNPed[0] ;
         A130BarCodPar = P097W2_A130BarCodPar[0] ;
         A132BarCodReo = P097W2_A132BarCodReo[0] ;
         A129BarCod = P097W2_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P097W2_A4812BarEncCli[0], A4812BarEncCli) == 0 ) )
         {
            brk97W2 = false ;
            A396EmprCod = P097W2_A396EmprCod[0] ;
            A130BarCodPar = P097W2_A130BarCodPar[0] ;
            A132BarCodReo = P097W2_A132BarCodReo[0] ;
            A129BarCod = P097W2_A129BarCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk97W2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A4812BarEncCli)==0) )
         {
            AV28Option = A4812BarEncCli ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97W2 )
         {
            brk97W2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARNPEDOPTIONS' Routine */
      returnInSub = false ;
      AV12TFBarNPed = AV24SearchTxt ;
      AV13TFBarNPed_Sel = "" ;
      AV50Mantenimientodelapartidads_1_filterfulltext = AV42FilterFullText ;
      AV51Mantenimientodelapartidads_2_tfbarenccli = AV10TFBarEncCli ;
      AV52Mantenimientodelapartidads_3_tfbarenccli_sel = AV11TFBarEncCli_Sel ;
      AV53Mantenimientodelapartidads_4_tfbarnped = AV12TFBarNPed ;
      AV54Mantenimientodelapartidads_5_tfbarnped_sel = AV13TFBarNPed_Sel ;
      AV55Mantenimientodelapartidads_6_tfbarnhdr = AV14TFBarNHdr ;
      AV56Mantenimientodelapartidads_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV57Mantenimientodelapartidads_8_tfbarcolnom = AV16TFBarColNom ;
      AV58Mantenimientodelapartidads_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV59Mantenimientodelapartidads_10_tfbarnomcli = AV18TFBarNomCli ;
      AV60Mantenimientodelapartidads_11_tfbarnomcli_sel = AV19TFBarNomCli_Sel ;
      AV61Mantenimientodelapartidads_12_tfbarser = AV20TFBarSer ;
      AV62Mantenimientodelapartidads_13_tfbarser_sel = AV21TFBarSer_Sel ;
      AV63Mantenimientodelapartidads_14_tfbarserdsc = AV22TFBarSerDsc ;
      AV64Mantenimientodelapartidads_15_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV50Mantenimientodelapartidads_1_filterfulltext ,
                                           AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                           AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                           AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                           AV53Mantenimientodelapartidads_4_tfbarnped ,
                                           AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                           AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                           AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                           AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                           AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                           AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                           AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                           AV61Mantenimientodelapartidads_12_tfbarser ,
                                           AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                           AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                           A4812BarEncCli ,
                                           A3746BarNPed ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A396EmprCod ,
                                           AV43EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV44Clicod) ,
                                           AV45BarEnccli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV51Mantenimientodelapartidads_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV51Mantenimientodelapartidads_2_tfbarenccli), 20, "%") ;
      lV53Mantenimientodelapartidads_4_tfbarnped = GXutil.padr( GXutil.rtrim( AV53Mantenimientodelapartidads_4_tfbarnped), 20, "%") ;
      lV55Mantenimientodelapartidads_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Mantenimientodelapartidads_6_tfbarnhdr), 11, "%") ;
      lV57Mantenimientodelapartidads_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV57Mantenimientodelapartidads_8_tfbarcolnom), 13, "%") ;
      lV59Mantenimientodelapartidads_10_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV59Mantenimientodelapartidads_10_tfbarnomcli), 13, "%") ;
      lV61Mantenimientodelapartidads_12_tfbarser = GXutil.padr( GXutil.rtrim( AV61Mantenimientodelapartidads_12_tfbarser), 16, "%") ;
      lV63Mantenimientodelapartidads_14_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Mantenimientodelapartidads_14_tfbarserdsc), 26, "%") ;
      /* Using cursor P097W3 */
      pr_default.execute(1, new Object[] {AV43EmprCod, Integer.valueOf(AV44Clicod), AV45BarEnccli, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV51Mantenimientodelapartidads_2_tfbarenccli, AV52Mantenimientodelapartidads_3_tfbarenccli_sel, lV53Mantenimientodelapartidads_4_tfbarnped, AV54Mantenimientodelapartidads_5_tfbarnped_sel, lV55Mantenimientodelapartidads_6_tfbarnhdr, AV56Mantenimientodelapartidads_7_tfbarnhdr_sel, lV57Mantenimientodelapartidads_8_tfbarcolnom, AV58Mantenimientodelapartidads_9_tfbarcolnom_sel, lV59Mantenimientodelapartidads_10_tfbarnomcli, AV60Mantenimientodelapartidads_11_tfbarnomcli_sel, lV61Mantenimientodelapartidads_12_tfbarser, AV62Mantenimientodelapartidads_13_tfbarser_sel, lV63Mantenimientodelapartidads_14_tfbarserdsc, AV64Mantenimientodelapartidads_15_tfbarserdsc_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk97W4 = false ;
         A396EmprCod = P097W3_A396EmprCod[0] ;
         A252CliCod = P097W3_A252CliCod[0] ;
         n252CliCod = P097W3_n252CliCod[0] ;
         A4812BarEncCli = P097W3_A4812BarEncCli[0] ;
         A3746BarNPed = P097W3_A3746BarNPed[0] ;
         A1652BarSerDsc = P097W3_A1652BarSerDsc[0] ;
         A212BarSer = P097W3_A212BarSer[0] ;
         A1234BarNomCli = P097W3_A1234BarNomCli[0] ;
         A135BarColNom = P097W3_A135BarColNom[0] ;
         A130BarCodPar = P097W3_A130BarCodPar[0] ;
         A132BarCodReo = P097W3_A132BarCodReo[0] ;
         A129BarCod = P097W3_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P097W3_A3746BarNPed[0], A3746BarNPed) == 0 ) )
         {
            brk97W4 = false ;
            A396EmprCod = P097W3_A396EmprCod[0] ;
            A130BarCodPar = P097W3_A130BarCodPar[0] ;
            A132BarCodReo = P097W3_A132BarCodReo[0] ;
            A129BarCod = P097W3_A129BarCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk97W4 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A3746BarNPed)==0) )
         {
            AV28Option = A3746BarNPed ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97W4 )
         {
            brk97W4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarNHdr = AV24SearchTxt ;
      AV15TFBarNHdr_Sel = "" ;
      AV50Mantenimientodelapartidads_1_filterfulltext = AV42FilterFullText ;
      AV51Mantenimientodelapartidads_2_tfbarenccli = AV10TFBarEncCli ;
      AV52Mantenimientodelapartidads_3_tfbarenccli_sel = AV11TFBarEncCli_Sel ;
      AV53Mantenimientodelapartidads_4_tfbarnped = AV12TFBarNPed ;
      AV54Mantenimientodelapartidads_5_tfbarnped_sel = AV13TFBarNPed_Sel ;
      AV55Mantenimientodelapartidads_6_tfbarnhdr = AV14TFBarNHdr ;
      AV56Mantenimientodelapartidads_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV57Mantenimientodelapartidads_8_tfbarcolnom = AV16TFBarColNom ;
      AV58Mantenimientodelapartidads_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV59Mantenimientodelapartidads_10_tfbarnomcli = AV18TFBarNomCli ;
      AV60Mantenimientodelapartidads_11_tfbarnomcli_sel = AV19TFBarNomCli_Sel ;
      AV61Mantenimientodelapartidads_12_tfbarser = AV20TFBarSer ;
      AV62Mantenimientodelapartidads_13_tfbarser_sel = AV21TFBarSer_Sel ;
      AV63Mantenimientodelapartidads_14_tfbarserdsc = AV22TFBarSerDsc ;
      AV64Mantenimientodelapartidads_15_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV50Mantenimientodelapartidads_1_filterfulltext ,
                                           AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                           AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                           AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                           AV53Mantenimientodelapartidads_4_tfbarnped ,
                                           AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                           AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                           AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                           AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                           AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                           AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                           AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                           AV61Mantenimientodelapartidads_12_tfbarser ,
                                           AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                           AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                           A4812BarEncCli ,
                                           A3746BarNPed ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           AV45BarEnccli ,
                                           AV43EmprCod ,
                                           Integer.valueOf(AV44Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV51Mantenimientodelapartidads_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV51Mantenimientodelapartidads_2_tfbarenccli), 20, "%") ;
      lV53Mantenimientodelapartidads_4_tfbarnped = GXutil.padr( GXutil.rtrim( AV53Mantenimientodelapartidads_4_tfbarnped), 20, "%") ;
      lV55Mantenimientodelapartidads_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Mantenimientodelapartidads_6_tfbarnhdr), 11, "%") ;
      lV57Mantenimientodelapartidads_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV57Mantenimientodelapartidads_8_tfbarcolnom), 13, "%") ;
      lV59Mantenimientodelapartidads_10_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV59Mantenimientodelapartidads_10_tfbarnomcli), 13, "%") ;
      lV61Mantenimientodelapartidads_12_tfbarser = GXutil.padr( GXutil.rtrim( AV61Mantenimientodelapartidads_12_tfbarser), 16, "%") ;
      lV63Mantenimientodelapartidads_14_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Mantenimientodelapartidads_14_tfbarserdsc), 26, "%") ;
      /* Using cursor P097W4 */
      pr_default.execute(2, new Object[] {AV43EmprCod, Integer.valueOf(AV44Clicod), AV45BarEnccli, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV51Mantenimientodelapartidads_2_tfbarenccli, AV52Mantenimientodelapartidads_3_tfbarenccli_sel, lV53Mantenimientodelapartidads_4_tfbarnped, AV54Mantenimientodelapartidads_5_tfbarnped_sel, lV55Mantenimientodelapartidads_6_tfbarnhdr, AV56Mantenimientodelapartidads_7_tfbarnhdr_sel, lV57Mantenimientodelapartidads_8_tfbarcolnom, AV58Mantenimientodelapartidads_9_tfbarcolnom_sel, lV59Mantenimientodelapartidads_10_tfbarnomcli, AV60Mantenimientodelapartidads_11_tfbarnomcli_sel, lV61Mantenimientodelapartidads_12_tfbarser, AV62Mantenimientodelapartidads_13_tfbarser_sel, lV63Mantenimientodelapartidads_14_tfbarserdsc, AV64Mantenimientodelapartidads_15_tfbarserdsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A252CliCod = P097W4_A252CliCod[0] ;
         n252CliCod = P097W4_n252CliCod[0] ;
         A396EmprCod = P097W4_A396EmprCod[0] ;
         A1652BarSerDsc = P097W4_A1652BarSerDsc[0] ;
         A212BarSer = P097W4_A212BarSer[0] ;
         A1234BarNomCli = P097W4_A1234BarNomCli[0] ;
         A135BarColNom = P097W4_A135BarColNom[0] ;
         A3746BarNPed = P097W4_A3746BarNPed[0] ;
         A4812BarEncCli = P097W4_A4812BarEncCli[0] ;
         A130BarCodPar = P097W4_A130BarCodPar[0] ;
         A132BarCodReo = P097W4_A132BarCodReo[0] ;
         A129BarCod = P097W4_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV28Option = A13696BarNHdr ;
            AV27InsertIndex = 1 ;
            while ( ( AV27InsertIndex <= AV29Options.size() ) && ( GXutil.strcmp((String)AV29Options.elementAt(-1+AV27InsertIndex), AV28Option) < 0 ) )
            {
               AV27InsertIndex = (int)(AV27InsertIndex+1) ;
            }
            if ( ( AV27InsertIndex <= AV29Options.size() ) && ( GXutil.strcmp((String)AV29Options.elementAt(-1+AV27InsertIndex), AV28Option) == 0 ) )
            {
               AV36count = GXutil.lval( (String)AV34OptionIndexes.elementAt(-1+AV27InsertIndex)) ;
               AV36count = (long)(AV36count+1) ;
               AV34OptionIndexes.removeItem(AV27InsertIndex);
               AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), AV27InsertIndex);
            }
            else
            {
               AV29Options.add(AV28Option, AV27InsertIndex);
               AV34OptionIndexes.add("1", AV27InsertIndex);
            }
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFBarColNom = AV24SearchTxt ;
      AV17TFBarColNom_Sel = "" ;
      AV50Mantenimientodelapartidads_1_filterfulltext = AV42FilterFullText ;
      AV51Mantenimientodelapartidads_2_tfbarenccli = AV10TFBarEncCli ;
      AV52Mantenimientodelapartidads_3_tfbarenccli_sel = AV11TFBarEncCli_Sel ;
      AV53Mantenimientodelapartidads_4_tfbarnped = AV12TFBarNPed ;
      AV54Mantenimientodelapartidads_5_tfbarnped_sel = AV13TFBarNPed_Sel ;
      AV55Mantenimientodelapartidads_6_tfbarnhdr = AV14TFBarNHdr ;
      AV56Mantenimientodelapartidads_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV57Mantenimientodelapartidads_8_tfbarcolnom = AV16TFBarColNom ;
      AV58Mantenimientodelapartidads_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV59Mantenimientodelapartidads_10_tfbarnomcli = AV18TFBarNomCli ;
      AV60Mantenimientodelapartidads_11_tfbarnomcli_sel = AV19TFBarNomCli_Sel ;
      AV61Mantenimientodelapartidads_12_tfbarser = AV20TFBarSer ;
      AV62Mantenimientodelapartidads_13_tfbarser_sel = AV21TFBarSer_Sel ;
      AV63Mantenimientodelapartidads_14_tfbarserdsc = AV22TFBarSerDsc ;
      AV64Mantenimientodelapartidads_15_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV50Mantenimientodelapartidads_1_filterfulltext ,
                                           AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                           AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                           AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                           AV53Mantenimientodelapartidads_4_tfbarnped ,
                                           AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                           AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                           AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                           AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                           AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                           AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                           AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                           AV61Mantenimientodelapartidads_12_tfbarser ,
                                           AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                           AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                           A4812BarEncCli ,
                                           A3746BarNPed ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A396EmprCod ,
                                           AV43EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV44Clicod) ,
                                           AV45BarEnccli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV51Mantenimientodelapartidads_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV51Mantenimientodelapartidads_2_tfbarenccli), 20, "%") ;
      lV53Mantenimientodelapartidads_4_tfbarnped = GXutil.padr( GXutil.rtrim( AV53Mantenimientodelapartidads_4_tfbarnped), 20, "%") ;
      lV55Mantenimientodelapartidads_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Mantenimientodelapartidads_6_tfbarnhdr), 11, "%") ;
      lV57Mantenimientodelapartidads_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV57Mantenimientodelapartidads_8_tfbarcolnom), 13, "%") ;
      lV59Mantenimientodelapartidads_10_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV59Mantenimientodelapartidads_10_tfbarnomcli), 13, "%") ;
      lV61Mantenimientodelapartidads_12_tfbarser = GXutil.padr( GXutil.rtrim( AV61Mantenimientodelapartidads_12_tfbarser), 16, "%") ;
      lV63Mantenimientodelapartidads_14_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Mantenimientodelapartidads_14_tfbarserdsc), 26, "%") ;
      /* Using cursor P097W5 */
      pr_default.execute(3, new Object[] {AV43EmprCod, Integer.valueOf(AV44Clicod), AV45BarEnccli, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV51Mantenimientodelapartidads_2_tfbarenccli, AV52Mantenimientodelapartidads_3_tfbarenccli_sel, lV53Mantenimientodelapartidads_4_tfbarnped, AV54Mantenimientodelapartidads_5_tfbarnped_sel, lV55Mantenimientodelapartidads_6_tfbarnhdr, AV56Mantenimientodelapartidads_7_tfbarnhdr_sel, lV57Mantenimientodelapartidads_8_tfbarcolnom, AV58Mantenimientodelapartidads_9_tfbarcolnom_sel, lV59Mantenimientodelapartidads_10_tfbarnomcli, AV60Mantenimientodelapartidads_11_tfbarnomcli_sel, lV61Mantenimientodelapartidads_12_tfbarser, AV62Mantenimientodelapartidads_13_tfbarser_sel, lV63Mantenimientodelapartidads_14_tfbarserdsc, AV64Mantenimientodelapartidads_15_tfbarserdsc_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk97W7 = false ;
         A396EmprCod = P097W5_A396EmprCod[0] ;
         A252CliCod = P097W5_A252CliCod[0] ;
         n252CliCod = P097W5_n252CliCod[0] ;
         A4812BarEncCli = P097W5_A4812BarEncCli[0] ;
         A135BarColNom = P097W5_A135BarColNom[0] ;
         A1652BarSerDsc = P097W5_A1652BarSerDsc[0] ;
         A212BarSer = P097W5_A212BarSer[0] ;
         A1234BarNomCli = P097W5_A1234BarNomCli[0] ;
         A3746BarNPed = P097W5_A3746BarNPed[0] ;
         A130BarCodPar = P097W5_A130BarCodPar[0] ;
         A132BarCodReo = P097W5_A132BarCodReo[0] ;
         A129BarCod = P097W5_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P097W5_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk97W7 = false ;
            A396EmprCod = P097W5_A396EmprCod[0] ;
            A130BarCodPar = P097W5_A130BarCodPar[0] ;
            A132BarCodReo = P097W5_A132BarCodReo[0] ;
            A129BarCod = P097W5_A129BarCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk97W7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV28Option = A135BarColNom ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97W7 )
         {
            brk97W7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV18TFBarNomCli = AV24SearchTxt ;
      AV19TFBarNomCli_Sel = "" ;
      AV50Mantenimientodelapartidads_1_filterfulltext = AV42FilterFullText ;
      AV51Mantenimientodelapartidads_2_tfbarenccli = AV10TFBarEncCli ;
      AV52Mantenimientodelapartidads_3_tfbarenccli_sel = AV11TFBarEncCli_Sel ;
      AV53Mantenimientodelapartidads_4_tfbarnped = AV12TFBarNPed ;
      AV54Mantenimientodelapartidads_5_tfbarnped_sel = AV13TFBarNPed_Sel ;
      AV55Mantenimientodelapartidads_6_tfbarnhdr = AV14TFBarNHdr ;
      AV56Mantenimientodelapartidads_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV57Mantenimientodelapartidads_8_tfbarcolnom = AV16TFBarColNom ;
      AV58Mantenimientodelapartidads_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV59Mantenimientodelapartidads_10_tfbarnomcli = AV18TFBarNomCli ;
      AV60Mantenimientodelapartidads_11_tfbarnomcli_sel = AV19TFBarNomCli_Sel ;
      AV61Mantenimientodelapartidads_12_tfbarser = AV20TFBarSer ;
      AV62Mantenimientodelapartidads_13_tfbarser_sel = AV21TFBarSer_Sel ;
      AV63Mantenimientodelapartidads_14_tfbarserdsc = AV22TFBarSerDsc ;
      AV64Mantenimientodelapartidads_15_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV50Mantenimientodelapartidads_1_filterfulltext ,
                                           AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                           AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                           AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                           AV53Mantenimientodelapartidads_4_tfbarnped ,
                                           AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                           AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                           AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                           AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                           AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                           AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                           AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                           AV61Mantenimientodelapartidads_12_tfbarser ,
                                           AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                           AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                           A4812BarEncCli ,
                                           A3746BarNPed ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A396EmprCod ,
                                           AV43EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV44Clicod) ,
                                           AV45BarEnccli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV51Mantenimientodelapartidads_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV51Mantenimientodelapartidads_2_tfbarenccli), 20, "%") ;
      lV53Mantenimientodelapartidads_4_tfbarnped = GXutil.padr( GXutil.rtrim( AV53Mantenimientodelapartidads_4_tfbarnped), 20, "%") ;
      lV55Mantenimientodelapartidads_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Mantenimientodelapartidads_6_tfbarnhdr), 11, "%") ;
      lV57Mantenimientodelapartidads_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV57Mantenimientodelapartidads_8_tfbarcolnom), 13, "%") ;
      lV59Mantenimientodelapartidads_10_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV59Mantenimientodelapartidads_10_tfbarnomcli), 13, "%") ;
      lV61Mantenimientodelapartidads_12_tfbarser = GXutil.padr( GXutil.rtrim( AV61Mantenimientodelapartidads_12_tfbarser), 16, "%") ;
      lV63Mantenimientodelapartidads_14_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Mantenimientodelapartidads_14_tfbarserdsc), 26, "%") ;
      /* Using cursor P097W6 */
      pr_default.execute(4, new Object[] {AV43EmprCod, Integer.valueOf(AV44Clicod), AV45BarEnccli, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV51Mantenimientodelapartidads_2_tfbarenccli, AV52Mantenimientodelapartidads_3_tfbarenccli_sel, lV53Mantenimientodelapartidads_4_tfbarnped, AV54Mantenimientodelapartidads_5_tfbarnped_sel, lV55Mantenimientodelapartidads_6_tfbarnhdr, AV56Mantenimientodelapartidads_7_tfbarnhdr_sel, lV57Mantenimientodelapartidads_8_tfbarcolnom, AV58Mantenimientodelapartidads_9_tfbarcolnom_sel, lV59Mantenimientodelapartidads_10_tfbarnomcli, AV60Mantenimientodelapartidads_11_tfbarnomcli_sel, lV61Mantenimientodelapartidads_12_tfbarser, AV62Mantenimientodelapartidads_13_tfbarser_sel, lV63Mantenimientodelapartidads_14_tfbarserdsc, AV64Mantenimientodelapartidads_15_tfbarserdsc_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk97W9 = false ;
         A396EmprCod = P097W6_A396EmprCod[0] ;
         A252CliCod = P097W6_A252CliCod[0] ;
         n252CliCod = P097W6_n252CliCod[0] ;
         A4812BarEncCli = P097W6_A4812BarEncCli[0] ;
         A1234BarNomCli = P097W6_A1234BarNomCli[0] ;
         A1652BarSerDsc = P097W6_A1652BarSerDsc[0] ;
         A212BarSer = P097W6_A212BarSer[0] ;
         A135BarColNom = P097W6_A135BarColNom[0] ;
         A3746BarNPed = P097W6_A3746BarNPed[0] ;
         A130BarCodPar = P097W6_A130BarCodPar[0] ;
         A132BarCodReo = P097W6_A132BarCodReo[0] ;
         A129BarCod = P097W6_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P097W6_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk97W9 = false ;
            A396EmprCod = P097W6_A396EmprCod[0] ;
            A130BarCodPar = P097W6_A130BarCodPar[0] ;
            A132BarCodReo = P097W6_A132BarCodReo[0] ;
            A129BarCod = P097W6_A129BarCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk97W9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV28Option = A1234BarNomCli ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97W9 )
         {
            brk97W9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV20TFBarSer = AV24SearchTxt ;
      AV21TFBarSer_Sel = "" ;
      AV50Mantenimientodelapartidads_1_filterfulltext = AV42FilterFullText ;
      AV51Mantenimientodelapartidads_2_tfbarenccli = AV10TFBarEncCli ;
      AV52Mantenimientodelapartidads_3_tfbarenccli_sel = AV11TFBarEncCli_Sel ;
      AV53Mantenimientodelapartidads_4_tfbarnped = AV12TFBarNPed ;
      AV54Mantenimientodelapartidads_5_tfbarnped_sel = AV13TFBarNPed_Sel ;
      AV55Mantenimientodelapartidads_6_tfbarnhdr = AV14TFBarNHdr ;
      AV56Mantenimientodelapartidads_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV57Mantenimientodelapartidads_8_tfbarcolnom = AV16TFBarColNom ;
      AV58Mantenimientodelapartidads_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV59Mantenimientodelapartidads_10_tfbarnomcli = AV18TFBarNomCli ;
      AV60Mantenimientodelapartidads_11_tfbarnomcli_sel = AV19TFBarNomCli_Sel ;
      AV61Mantenimientodelapartidads_12_tfbarser = AV20TFBarSer ;
      AV62Mantenimientodelapartidads_13_tfbarser_sel = AV21TFBarSer_Sel ;
      AV63Mantenimientodelapartidads_14_tfbarserdsc = AV22TFBarSerDsc ;
      AV64Mantenimientodelapartidads_15_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV50Mantenimientodelapartidads_1_filterfulltext ,
                                           AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                           AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                           AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                           AV53Mantenimientodelapartidads_4_tfbarnped ,
                                           AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                           AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                           AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                           AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                           AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                           AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                           AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                           AV61Mantenimientodelapartidads_12_tfbarser ,
                                           AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                           AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                           A4812BarEncCli ,
                                           A3746BarNPed ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           AV45BarEnccli ,
                                           AV43EmprCod ,
                                           Integer.valueOf(AV44Clicod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV51Mantenimientodelapartidads_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV51Mantenimientodelapartidads_2_tfbarenccli), 20, "%") ;
      lV53Mantenimientodelapartidads_4_tfbarnped = GXutil.padr( GXutil.rtrim( AV53Mantenimientodelapartidads_4_tfbarnped), 20, "%") ;
      lV55Mantenimientodelapartidads_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Mantenimientodelapartidads_6_tfbarnhdr), 11, "%") ;
      lV57Mantenimientodelapartidads_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV57Mantenimientodelapartidads_8_tfbarcolnom), 13, "%") ;
      lV59Mantenimientodelapartidads_10_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV59Mantenimientodelapartidads_10_tfbarnomcli), 13, "%") ;
      lV61Mantenimientodelapartidads_12_tfbarser = GXutil.padr( GXutil.rtrim( AV61Mantenimientodelapartidads_12_tfbarser), 16, "%") ;
      lV63Mantenimientodelapartidads_14_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Mantenimientodelapartidads_14_tfbarserdsc), 26, "%") ;
      /* Using cursor P097W7 */
      pr_default.execute(5, new Object[] {AV43EmprCod, Integer.valueOf(AV44Clicod), AV45BarEnccli, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV51Mantenimientodelapartidads_2_tfbarenccli, AV52Mantenimientodelapartidads_3_tfbarenccli_sel, lV53Mantenimientodelapartidads_4_tfbarnped, AV54Mantenimientodelapartidads_5_tfbarnped_sel, lV55Mantenimientodelapartidads_6_tfbarnhdr, AV56Mantenimientodelapartidads_7_tfbarnhdr_sel, lV57Mantenimientodelapartidads_8_tfbarcolnom, AV58Mantenimientodelapartidads_9_tfbarcolnom_sel, lV59Mantenimientodelapartidads_10_tfbarnomcli, AV60Mantenimientodelapartidads_11_tfbarnomcli_sel, lV61Mantenimientodelapartidads_12_tfbarser, AV62Mantenimientodelapartidads_13_tfbarser_sel, lV63Mantenimientodelapartidads_14_tfbarserdsc, AV64Mantenimientodelapartidads_15_tfbarserdsc_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk97W11 = false ;
         A252CliCod = P097W7_A252CliCod[0] ;
         n252CliCod = P097W7_n252CliCod[0] ;
         A396EmprCod = P097W7_A396EmprCod[0] ;
         A212BarSer = P097W7_A212BarSer[0] ;
         A1652BarSerDsc = P097W7_A1652BarSerDsc[0] ;
         A1234BarNomCli = P097W7_A1234BarNomCli[0] ;
         A135BarColNom = P097W7_A135BarColNom[0] ;
         A3746BarNPed = P097W7_A3746BarNPed[0] ;
         A4812BarEncCli = P097W7_A4812BarEncCli[0] ;
         A130BarCodPar = P097W7_A130BarCodPar[0] ;
         A132BarCodReo = P097W7_A132BarCodReo[0] ;
         A129BarCod = P097W7_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P097W7_A396EmprCod[0], A396EmprCod) == 0 ) && ( P097W7_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(P097W7_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk97W11 = false ;
            A130BarCodPar = P097W7_A130BarCodPar[0] ;
            A132BarCodReo = P097W7_A132BarCodReo[0] ;
            A129BarCod = P097W7_A129BarCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk97W11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV28Option = A212BarSer ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97W11 )
         {
            brk97W11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV22TFBarSerDsc = AV24SearchTxt ;
      AV23TFBarSerDsc_Sel = "" ;
      AV50Mantenimientodelapartidads_1_filterfulltext = AV42FilterFullText ;
      AV51Mantenimientodelapartidads_2_tfbarenccli = AV10TFBarEncCli ;
      AV52Mantenimientodelapartidads_3_tfbarenccli_sel = AV11TFBarEncCli_Sel ;
      AV53Mantenimientodelapartidads_4_tfbarnped = AV12TFBarNPed ;
      AV54Mantenimientodelapartidads_5_tfbarnped_sel = AV13TFBarNPed_Sel ;
      AV55Mantenimientodelapartidads_6_tfbarnhdr = AV14TFBarNHdr ;
      AV56Mantenimientodelapartidads_7_tfbarnhdr_sel = AV15TFBarNHdr_Sel ;
      AV57Mantenimientodelapartidads_8_tfbarcolnom = AV16TFBarColNom ;
      AV58Mantenimientodelapartidads_9_tfbarcolnom_sel = AV17TFBarColNom_Sel ;
      AV59Mantenimientodelapartidads_10_tfbarnomcli = AV18TFBarNomCli ;
      AV60Mantenimientodelapartidads_11_tfbarnomcli_sel = AV19TFBarNomCli_Sel ;
      AV61Mantenimientodelapartidads_12_tfbarser = AV20TFBarSer ;
      AV62Mantenimientodelapartidads_13_tfbarser_sel = AV21TFBarSer_Sel ;
      AV63Mantenimientodelapartidads_14_tfbarserdsc = AV22TFBarSerDsc ;
      AV64Mantenimientodelapartidads_15_tfbarserdsc_sel = AV23TFBarSerDsc_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV50Mantenimientodelapartidads_1_filterfulltext ,
                                           AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                           AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                           AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                           AV53Mantenimientodelapartidads_4_tfbarnped ,
                                           AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                           AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                           AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                           AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                           AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                           AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                           AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                           AV61Mantenimientodelapartidads_12_tfbarser ,
                                           AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                           AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                           A4812BarEncCli ,
                                           A3746BarNPed ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A396EmprCod ,
                                           AV43EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV44Clicod) ,
                                           AV45BarEnccli } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING
                                           }
      });
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV50Mantenimientodelapartidads_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV50Mantenimientodelapartidads_1_filterfulltext), "%", "") ;
      lV51Mantenimientodelapartidads_2_tfbarenccli = GXutil.padr( GXutil.rtrim( AV51Mantenimientodelapartidads_2_tfbarenccli), 20, "%") ;
      lV53Mantenimientodelapartidads_4_tfbarnped = GXutil.padr( GXutil.rtrim( AV53Mantenimientodelapartidads_4_tfbarnped), 20, "%") ;
      lV55Mantenimientodelapartidads_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV55Mantenimientodelapartidads_6_tfbarnhdr), 11, "%") ;
      lV57Mantenimientodelapartidads_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV57Mantenimientodelapartidads_8_tfbarcolnom), 13, "%") ;
      lV59Mantenimientodelapartidads_10_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV59Mantenimientodelapartidads_10_tfbarnomcli), 13, "%") ;
      lV61Mantenimientodelapartidads_12_tfbarser = GXutil.padr( GXutil.rtrim( AV61Mantenimientodelapartidads_12_tfbarser), 16, "%") ;
      lV63Mantenimientodelapartidads_14_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV63Mantenimientodelapartidads_14_tfbarserdsc), 26, "%") ;
      /* Using cursor P097W8 */
      pr_default.execute(6, new Object[] {AV43EmprCod, Integer.valueOf(AV44Clicod), AV45BarEnccli, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV50Mantenimientodelapartidads_1_filterfulltext, lV51Mantenimientodelapartidads_2_tfbarenccli, AV52Mantenimientodelapartidads_3_tfbarenccli_sel, lV53Mantenimientodelapartidads_4_tfbarnped, AV54Mantenimientodelapartidads_5_tfbarnped_sel, lV55Mantenimientodelapartidads_6_tfbarnhdr, AV56Mantenimientodelapartidads_7_tfbarnhdr_sel, lV57Mantenimientodelapartidads_8_tfbarcolnom, AV58Mantenimientodelapartidads_9_tfbarcolnom_sel, lV59Mantenimientodelapartidads_10_tfbarnomcli, AV60Mantenimientodelapartidads_11_tfbarnomcli_sel, lV61Mantenimientodelapartidads_12_tfbarser, AV62Mantenimientodelapartidads_13_tfbarser_sel, lV63Mantenimientodelapartidads_14_tfbarserdsc, AV64Mantenimientodelapartidads_15_tfbarserdsc_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk97W13 = false ;
         A396EmprCod = P097W8_A396EmprCod[0] ;
         A252CliCod = P097W8_A252CliCod[0] ;
         n252CliCod = P097W8_n252CliCod[0] ;
         A4812BarEncCli = P097W8_A4812BarEncCli[0] ;
         A1652BarSerDsc = P097W8_A1652BarSerDsc[0] ;
         A212BarSer = P097W8_A212BarSer[0] ;
         A1234BarNomCli = P097W8_A1234BarNomCli[0] ;
         A135BarColNom = P097W8_A135BarColNom[0] ;
         A3746BarNPed = P097W8_A3746BarNPed[0] ;
         A130BarCodPar = P097W8_A130BarCodPar[0] ;
         A132BarCodReo = P097W8_A132BarCodReo[0] ;
         A129BarCod = P097W8_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV36count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P097W8_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk97W13 = false ;
            A396EmprCod = P097W8_A396EmprCod[0] ;
            A130BarCodPar = P097W8_A130BarCodPar[0] ;
            A132BarCodReo = P097W8_A132BarCodReo[0] ;
            A129BarCod = P097W8_A129BarCod[0] ;
            AV36count = (long)(AV36count+1) ;
            brk97W13 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV28Option = A1652BarSerDsc ;
            AV29Options.add(AV28Option, 0);
            AV34OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV36count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV29Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk97W13 )
         {
            brk97W13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = mantenimientodelapartidagetfilterdata.this.AV30OptionsJson;
      this.aP4[0] = mantenimientodelapartidagetfilterdata.this.AV33OptionsDescJson;
      this.aP5[0] = mantenimientodelapartidagetfilterdata.this.AV35OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV30OptionsJson = "" ;
      AV33OptionsDescJson = "" ;
      AV35OptionIndexesJson = "" ;
      AV29Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV32OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV34OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV37Session = httpContext.getWebSession();
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV42FilterFullText = "" ;
      AV10TFBarEncCli = "" ;
      AV11TFBarEncCli_Sel = "" ;
      AV12TFBarNPed = "" ;
      AV13TFBarNPed_Sel = "" ;
      AV14TFBarNHdr = "" ;
      AV15TFBarNHdr_Sel = "" ;
      AV16TFBarColNom = "" ;
      AV17TFBarColNom_Sel = "" ;
      AV18TFBarNomCli = "" ;
      AV19TFBarNomCli_Sel = "" ;
      AV20TFBarSer = "" ;
      AV21TFBarSer_Sel = "" ;
      AV22TFBarSerDsc = "" ;
      AV23TFBarSerDsc_Sel = "" ;
      A4812BarEncCli = "" ;
      AV50Mantenimientodelapartidads_1_filterfulltext = "" ;
      AV51Mantenimientodelapartidads_2_tfbarenccli = "" ;
      AV52Mantenimientodelapartidads_3_tfbarenccli_sel = "" ;
      AV53Mantenimientodelapartidads_4_tfbarnped = "" ;
      AV54Mantenimientodelapartidads_5_tfbarnped_sel = "" ;
      AV55Mantenimientodelapartidads_6_tfbarnhdr = "" ;
      AV56Mantenimientodelapartidads_7_tfbarnhdr_sel = "" ;
      AV57Mantenimientodelapartidads_8_tfbarcolnom = "" ;
      AV58Mantenimientodelapartidads_9_tfbarcolnom_sel = "" ;
      AV59Mantenimientodelapartidads_10_tfbarnomcli = "" ;
      AV60Mantenimientodelapartidads_11_tfbarnomcli_sel = "" ;
      AV61Mantenimientodelapartidads_12_tfbarser = "" ;
      AV62Mantenimientodelapartidads_13_tfbarser_sel = "" ;
      AV63Mantenimientodelapartidads_14_tfbarserdsc = "" ;
      AV64Mantenimientodelapartidads_15_tfbarserdsc_sel = "" ;
      scmdbuf = "" ;
      lV50Mantenimientodelapartidads_1_filterfulltext = "" ;
      lV51Mantenimientodelapartidads_2_tfbarenccli = "" ;
      lV53Mantenimientodelapartidads_4_tfbarnped = "" ;
      lV55Mantenimientodelapartidads_6_tfbarnhdr = "" ;
      lV57Mantenimientodelapartidads_8_tfbarcolnom = "" ;
      lV59Mantenimientodelapartidads_10_tfbarnomcli = "" ;
      lV61Mantenimientodelapartidads_12_tfbarser = "" ;
      lV63Mantenimientodelapartidads_14_tfbarserdsc = "" ;
      A3746BarNPed = "" ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A396EmprCod = "" ;
      AV43EmprCod = "" ;
      AV45BarEnccli = "" ;
      P097W2_A396EmprCod = new String[] {""} ;
      P097W2_A252CliCod = new int[1] ;
      P097W2_n252CliCod = new boolean[] {false} ;
      P097W2_A4812BarEncCli = new String[] {""} ;
      P097W2_A1652BarSerDsc = new String[] {""} ;
      P097W2_A212BarSer = new String[] {""} ;
      P097W2_A1234BarNomCli = new String[] {""} ;
      P097W2_A135BarColNom = new String[] {""} ;
      P097W2_A3746BarNPed = new String[] {""} ;
      P097W2_A130BarCodPar = new String[] {""} ;
      P097W2_A132BarCodReo = new byte[1] ;
      P097W2_A129BarCod = new int[1] ;
      A13696BarNHdr = "" ;
      AV28Option = "" ;
      P097W3_A396EmprCod = new String[] {""} ;
      P097W3_A252CliCod = new int[1] ;
      P097W3_n252CliCod = new boolean[] {false} ;
      P097W3_A4812BarEncCli = new String[] {""} ;
      P097W3_A3746BarNPed = new String[] {""} ;
      P097W3_A1652BarSerDsc = new String[] {""} ;
      P097W3_A212BarSer = new String[] {""} ;
      P097W3_A1234BarNomCli = new String[] {""} ;
      P097W3_A135BarColNom = new String[] {""} ;
      P097W3_A130BarCodPar = new String[] {""} ;
      P097W3_A132BarCodReo = new byte[1] ;
      P097W3_A129BarCod = new int[1] ;
      P097W4_A252CliCod = new int[1] ;
      P097W4_n252CliCod = new boolean[] {false} ;
      P097W4_A396EmprCod = new String[] {""} ;
      P097W4_A1652BarSerDsc = new String[] {""} ;
      P097W4_A212BarSer = new String[] {""} ;
      P097W4_A1234BarNomCli = new String[] {""} ;
      P097W4_A135BarColNom = new String[] {""} ;
      P097W4_A3746BarNPed = new String[] {""} ;
      P097W4_A4812BarEncCli = new String[] {""} ;
      P097W4_A130BarCodPar = new String[] {""} ;
      P097W4_A132BarCodReo = new byte[1] ;
      P097W4_A129BarCod = new int[1] ;
      P097W5_A396EmprCod = new String[] {""} ;
      P097W5_A252CliCod = new int[1] ;
      P097W5_n252CliCod = new boolean[] {false} ;
      P097W5_A4812BarEncCli = new String[] {""} ;
      P097W5_A135BarColNom = new String[] {""} ;
      P097W5_A1652BarSerDsc = new String[] {""} ;
      P097W5_A212BarSer = new String[] {""} ;
      P097W5_A1234BarNomCli = new String[] {""} ;
      P097W5_A3746BarNPed = new String[] {""} ;
      P097W5_A130BarCodPar = new String[] {""} ;
      P097W5_A132BarCodReo = new byte[1] ;
      P097W5_A129BarCod = new int[1] ;
      P097W6_A396EmprCod = new String[] {""} ;
      P097W6_A252CliCod = new int[1] ;
      P097W6_n252CliCod = new boolean[] {false} ;
      P097W6_A4812BarEncCli = new String[] {""} ;
      P097W6_A1234BarNomCli = new String[] {""} ;
      P097W6_A1652BarSerDsc = new String[] {""} ;
      P097W6_A212BarSer = new String[] {""} ;
      P097W6_A135BarColNom = new String[] {""} ;
      P097W6_A3746BarNPed = new String[] {""} ;
      P097W6_A130BarCodPar = new String[] {""} ;
      P097W6_A132BarCodReo = new byte[1] ;
      P097W6_A129BarCod = new int[1] ;
      P097W7_A252CliCod = new int[1] ;
      P097W7_n252CliCod = new boolean[] {false} ;
      P097W7_A396EmprCod = new String[] {""} ;
      P097W7_A212BarSer = new String[] {""} ;
      P097W7_A1652BarSerDsc = new String[] {""} ;
      P097W7_A1234BarNomCli = new String[] {""} ;
      P097W7_A135BarColNom = new String[] {""} ;
      P097W7_A3746BarNPed = new String[] {""} ;
      P097W7_A4812BarEncCli = new String[] {""} ;
      P097W7_A130BarCodPar = new String[] {""} ;
      P097W7_A132BarCodReo = new byte[1] ;
      P097W7_A129BarCod = new int[1] ;
      P097W8_A396EmprCod = new String[] {""} ;
      P097W8_A252CliCod = new int[1] ;
      P097W8_n252CliCod = new boolean[] {false} ;
      P097W8_A4812BarEncCli = new String[] {""} ;
      P097W8_A1652BarSerDsc = new String[] {""} ;
      P097W8_A212BarSer = new String[] {""} ;
      P097W8_A1234BarNomCli = new String[] {""} ;
      P097W8_A135BarColNom = new String[] {""} ;
      P097W8_A3746BarNPed = new String[] {""} ;
      P097W8_A130BarCodPar = new String[] {""} ;
      P097W8_A132BarCodReo = new byte[1] ;
      P097W8_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientodelapartidagetfilterdata__default(),
         new Object[] {
             new Object[] {
            P097W2_A396EmprCod, P097W2_A252CliCod, P097W2_n252CliCod, P097W2_A4812BarEncCli, P097W2_A1652BarSerDsc, P097W2_A212BarSer, P097W2_A1234BarNomCli, P097W2_A135BarColNom, P097W2_A3746BarNPed, P097W2_A130BarCodPar,
            P097W2_A132BarCodReo, P097W2_A129BarCod
            }
            , new Object[] {
            P097W3_A396EmprCod, P097W3_A252CliCod, P097W3_n252CliCod, P097W3_A4812BarEncCli, P097W3_A3746BarNPed, P097W3_A1652BarSerDsc, P097W3_A212BarSer, P097W3_A1234BarNomCli, P097W3_A135BarColNom, P097W3_A130BarCodPar,
            P097W3_A132BarCodReo, P097W3_A129BarCod
            }
            , new Object[] {
            P097W4_A252CliCod, P097W4_n252CliCod, P097W4_A396EmprCod, P097W4_A1652BarSerDsc, P097W4_A212BarSer, P097W4_A1234BarNomCli, P097W4_A135BarColNom, P097W4_A3746BarNPed, P097W4_A4812BarEncCli, P097W4_A130BarCodPar,
            P097W4_A132BarCodReo, P097W4_A129BarCod
            }
            , new Object[] {
            P097W5_A396EmprCod, P097W5_A252CliCod, P097W5_n252CliCod, P097W5_A4812BarEncCli, P097W5_A135BarColNom, P097W5_A1652BarSerDsc, P097W5_A212BarSer, P097W5_A1234BarNomCli, P097W5_A3746BarNPed, P097W5_A130BarCodPar,
            P097W5_A132BarCodReo, P097W5_A129BarCod
            }
            , new Object[] {
            P097W6_A396EmprCod, P097W6_A252CliCod, P097W6_n252CliCod, P097W6_A4812BarEncCli, P097W6_A1234BarNomCli, P097W6_A1652BarSerDsc, P097W6_A212BarSer, P097W6_A135BarColNom, P097W6_A3746BarNPed, P097W6_A130BarCodPar,
            P097W6_A132BarCodReo, P097W6_A129BarCod
            }
            , new Object[] {
            P097W7_A252CliCod, P097W7_n252CliCod, P097W7_A396EmprCod, P097W7_A212BarSer, P097W7_A1652BarSerDsc, P097W7_A1234BarNomCli, P097W7_A135BarColNom, P097W7_A3746BarNPed, P097W7_A4812BarEncCli, P097W7_A130BarCodPar,
            P097W7_A132BarCodReo, P097W7_A129BarCod
            }
            , new Object[] {
            P097W8_A396EmprCod, P097W8_A252CliCod, P097W8_n252CliCod, P097W8_A4812BarEncCli, P097W8_A1652BarSerDsc, P097W8_A212BarSer, P097W8_A1234BarNomCli, P097W8_A135BarColNom, P097W8_A3746BarNPed, P097W8_A130BarCodPar,
            P097W8_A132BarCodReo, P097W8_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV48GXV1 ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV44Clicod ;
   private int AV27InsertIndex ;
   private long AV36count ;
   private String AV10TFBarEncCli ;
   private String AV11TFBarEncCli_Sel ;
   private String AV12TFBarNPed ;
   private String AV13TFBarNPed_Sel ;
   private String AV14TFBarNHdr ;
   private String AV15TFBarNHdr_Sel ;
   private String AV16TFBarColNom ;
   private String AV17TFBarColNom_Sel ;
   private String AV18TFBarNomCli ;
   private String AV19TFBarNomCli_Sel ;
   private String AV20TFBarSer ;
   private String AV21TFBarSer_Sel ;
   private String AV22TFBarSerDsc ;
   private String AV23TFBarSerDsc_Sel ;
   private String A4812BarEncCli ;
   private String AV51Mantenimientodelapartidads_2_tfbarenccli ;
   private String AV52Mantenimientodelapartidads_3_tfbarenccli_sel ;
   private String AV53Mantenimientodelapartidads_4_tfbarnped ;
   private String AV54Mantenimientodelapartidads_5_tfbarnped_sel ;
   private String AV55Mantenimientodelapartidads_6_tfbarnhdr ;
   private String AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ;
   private String AV57Mantenimientodelapartidads_8_tfbarcolnom ;
   private String AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ;
   private String AV59Mantenimientodelapartidads_10_tfbarnomcli ;
   private String AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ;
   private String AV61Mantenimientodelapartidads_12_tfbarser ;
   private String AV62Mantenimientodelapartidads_13_tfbarser_sel ;
   private String AV63Mantenimientodelapartidads_14_tfbarserdsc ;
   private String AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ;
   private String scmdbuf ;
   private String lV51Mantenimientodelapartidads_2_tfbarenccli ;
   private String lV53Mantenimientodelapartidads_4_tfbarnped ;
   private String lV55Mantenimientodelapartidads_6_tfbarnhdr ;
   private String lV57Mantenimientodelapartidads_8_tfbarcolnom ;
   private String lV59Mantenimientodelapartidads_10_tfbarnomcli ;
   private String lV61Mantenimientodelapartidads_12_tfbarser ;
   private String lV63Mantenimientodelapartidads_14_tfbarserdsc ;
   private String A3746BarNPed ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A396EmprCod ;
   private String AV43EmprCod ;
   private String AV45BarEnccli ;
   private String A13696BarNHdr ;
   private boolean returnInSub ;
   private boolean brk97W2 ;
   private boolean n252CliCod ;
   private boolean brk97W4 ;
   private boolean brk97W7 ;
   private boolean brk97W9 ;
   private boolean brk97W11 ;
   private boolean brk97W13 ;
   private String AV30OptionsJson ;
   private String AV33OptionsDescJson ;
   private String AV35OptionIndexesJson ;
   private String AV26DDOName ;
   private String AV24SearchTxt ;
   private String AV25SearchTxtTo ;
   private String AV42FilterFullText ;
   private String AV50Mantenimientodelapartidads_1_filterfulltext ;
   private String lV50Mantenimientodelapartidads_1_filterfulltext ;
   private String AV28Option ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P097W2_A396EmprCod ;
   private int[] P097W2_A252CliCod ;
   private boolean[] P097W2_n252CliCod ;
   private String[] P097W2_A4812BarEncCli ;
   private String[] P097W2_A1652BarSerDsc ;
   private String[] P097W2_A212BarSer ;
   private String[] P097W2_A1234BarNomCli ;
   private String[] P097W2_A135BarColNom ;
   private String[] P097W2_A3746BarNPed ;
   private String[] P097W2_A130BarCodPar ;
   private byte[] P097W2_A132BarCodReo ;
   private int[] P097W2_A129BarCod ;
   private String[] P097W3_A396EmprCod ;
   private int[] P097W3_A252CliCod ;
   private boolean[] P097W3_n252CliCod ;
   private String[] P097W3_A4812BarEncCli ;
   private String[] P097W3_A3746BarNPed ;
   private String[] P097W3_A1652BarSerDsc ;
   private String[] P097W3_A212BarSer ;
   private String[] P097W3_A1234BarNomCli ;
   private String[] P097W3_A135BarColNom ;
   private String[] P097W3_A130BarCodPar ;
   private byte[] P097W3_A132BarCodReo ;
   private int[] P097W3_A129BarCod ;
   private int[] P097W4_A252CliCod ;
   private boolean[] P097W4_n252CliCod ;
   private String[] P097W4_A396EmprCod ;
   private String[] P097W4_A1652BarSerDsc ;
   private String[] P097W4_A212BarSer ;
   private String[] P097W4_A1234BarNomCli ;
   private String[] P097W4_A135BarColNom ;
   private String[] P097W4_A3746BarNPed ;
   private String[] P097W4_A4812BarEncCli ;
   private String[] P097W4_A130BarCodPar ;
   private byte[] P097W4_A132BarCodReo ;
   private int[] P097W4_A129BarCod ;
   private String[] P097W5_A396EmprCod ;
   private int[] P097W5_A252CliCod ;
   private boolean[] P097W5_n252CliCod ;
   private String[] P097W5_A4812BarEncCli ;
   private String[] P097W5_A135BarColNom ;
   private String[] P097W5_A1652BarSerDsc ;
   private String[] P097W5_A212BarSer ;
   private String[] P097W5_A1234BarNomCli ;
   private String[] P097W5_A3746BarNPed ;
   private String[] P097W5_A130BarCodPar ;
   private byte[] P097W5_A132BarCodReo ;
   private int[] P097W5_A129BarCod ;
   private String[] P097W6_A396EmprCod ;
   private int[] P097W6_A252CliCod ;
   private boolean[] P097W6_n252CliCod ;
   private String[] P097W6_A4812BarEncCli ;
   private String[] P097W6_A1234BarNomCli ;
   private String[] P097W6_A1652BarSerDsc ;
   private String[] P097W6_A212BarSer ;
   private String[] P097W6_A135BarColNom ;
   private String[] P097W6_A3746BarNPed ;
   private String[] P097W6_A130BarCodPar ;
   private byte[] P097W6_A132BarCodReo ;
   private int[] P097W6_A129BarCod ;
   private int[] P097W7_A252CliCod ;
   private boolean[] P097W7_n252CliCod ;
   private String[] P097W7_A396EmprCod ;
   private String[] P097W7_A212BarSer ;
   private String[] P097W7_A1652BarSerDsc ;
   private String[] P097W7_A1234BarNomCli ;
   private String[] P097W7_A135BarColNom ;
   private String[] P097W7_A3746BarNPed ;
   private String[] P097W7_A4812BarEncCli ;
   private String[] P097W7_A130BarCodPar ;
   private byte[] P097W7_A132BarCodReo ;
   private int[] P097W7_A129BarCod ;
   private String[] P097W8_A396EmprCod ;
   private int[] P097W8_A252CliCod ;
   private boolean[] P097W8_n252CliCod ;
   private String[] P097W8_A4812BarEncCli ;
   private String[] P097W8_A1652BarSerDsc ;
   private String[] P097W8_A212BarSer ;
   private String[] P097W8_A1234BarNomCli ;
   private String[] P097W8_A135BarColNom ;
   private String[] P097W8_A3746BarNPed ;
   private String[] P097W8_A130BarCodPar ;
   private byte[] P097W8_A132BarCodReo ;
   private int[] P097W8_A129BarCod ;
   private GXSimpleCollection<String> AV29Options ;
   private GXSimpleCollection<String> AV32OptionsDesc ;
   private GXSimpleCollection<String> AV34OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
}

final  class mantenimientodelapartidagetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Mantenimientodelapartidads_1_filterfulltext ,
                                          String AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                          String AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                          String AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                          String AV53Mantenimientodelapartidads_4_tfbarnped ,
                                          String AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                          String AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                          String AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                          String AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                          String AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                          String AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                          String AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                          String AV61Mantenimientodelapartidads_12_tfbarser ,
                                          String AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                          String AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                          String A4812BarEncCli ,
                                          String A3746BarNPed ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A396EmprCod ,
                                          String AV43EmprCod ,
                                          int A252CliCod ,
                                          int AV44Clicod ,
                                          String AV45BarEnccli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, BarEncCli, BarSerDsc, BarSer, BarNomCli, BarColNom, BarNPed, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD" ;
      addWhere(sWhereString, "(BarEncCli = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      if ( ! (GXutil.strcmp("", AV50Mantenimientodelapartidads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarEncCli) like '%' || UPPER(?)) or ( UPPER(BarNPed) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarColNom) like '%' || UPPER(?)) or ( UPPER(BarNomCli) like '%' || UPPER(?)) or ( UPPER(BarSer) like '%' || UPPER(?)) or ( UPPER(BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
         GXv_int2[4] = (byte)(1) ;
         GXv_int2[5] = (byte)(1) ;
         GXv_int2[6] = (byte)(1) ;
         GXv_int2[7] = (byte)(1) ;
         GXv_int2[8] = (byte)(1) ;
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV51Mantenimientodelapartidads_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV53Mantenimientodelapartidads_4_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNPed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(BarNPed = ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Mantenimientodelapartidads_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Mantenimientodelapartidads_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(BarColNom = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV59Mantenimientodelapartidads_10_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(BarNomCli = ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientodelapartidads_12_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(BarSer = ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientodelapartidads_14_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarEncCli" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P097W3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Mantenimientodelapartidads_1_filterfulltext ,
                                          String AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                          String AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                          String AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                          String AV53Mantenimientodelapartidads_4_tfbarnped ,
                                          String AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                          String AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                          String AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                          String AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                          String AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                          String AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                          String AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                          String AV61Mantenimientodelapartidads_12_tfbarser ,
                                          String AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                          String AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                          String A4812BarEncCli ,
                                          String A3746BarNPed ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A396EmprCod ,
                                          String AV43EmprCod ,
                                          int A252CliCod ,
                                          int AV44Clicod ,
                                          String AV45BarEnccli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[24];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, BarEncCli, BarNPed, BarSerDsc, BarSer, BarNomCli, BarColNom, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      addWhere(sWhereString, "(BarEncCli = ?)");
      if ( ! (GXutil.strcmp("", AV50Mantenimientodelapartidads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarEncCli) like '%' || UPPER(?)) or ( UPPER(BarNPed) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarColNom) like '%' || UPPER(?)) or ( UPPER(BarNomCli) like '%' || UPPER(?)) or ( UPPER(BarSer) like '%' || UPPER(?)) or ( UPPER(BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
         GXv_int4[4] = (byte)(1) ;
         GXv_int4[5] = (byte)(1) ;
         GXv_int4[6] = (byte)(1) ;
         GXv_int4[7] = (byte)(1) ;
         GXv_int4[8] = (byte)(1) ;
         GXv_int4[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV51Mantenimientodelapartidads_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV53Mantenimientodelapartidads_4_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNPed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(BarNPed = ?)");
      }
      else
      {
         GXv_int4[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Mantenimientodelapartidads_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int4[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Mantenimientodelapartidads_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(BarColNom = ?)");
      }
      else
      {
         GXv_int4[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV59Mantenimientodelapartidads_10_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(BarNomCli = ?)");
      }
      else
      {
         GXv_int4[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientodelapartidads_12_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(BarSer = ?)");
      }
      else
      {
         GXv_int4[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientodelapartidads_14_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarNPed" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P097W4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Mantenimientodelapartidads_1_filterfulltext ,
                                          String AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                          String AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                          String AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                          String AV53Mantenimientodelapartidads_4_tfbarnped ,
                                          String AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                          String AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                          String AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                          String AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                          String AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                          String AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                          String AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                          String AV61Mantenimientodelapartidads_12_tfbarser ,
                                          String AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                          String AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                          String A4812BarEncCli ,
                                          String A3746BarNPed ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String AV45BarEnccli ,
                                          String AV43EmprCod ,
                                          int AV44Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT CliCod, EmprCod, BarSerDsc, BarSer, BarNomCli, BarColNom, BarNPed, BarEncCli, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      addWhere(sWhereString, "(BarEncCli = ?)");
      if ( ! (GXutil.strcmp("", AV50Mantenimientodelapartidads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarEncCli) like '%' || UPPER(?)) or ( UPPER(BarNPed) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarColNom) like '%' || UPPER(?)) or ( UPPER(BarNomCli) like '%' || UPPER(?)) or ( UPPER(BarSer) like '%' || UPPER(?)) or ( UPPER(BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV51Mantenimientodelapartidads_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV53Mantenimientodelapartidads_4_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNPed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(BarNPed = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Mantenimientodelapartidads_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Mantenimientodelapartidads_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(BarColNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV59Mantenimientodelapartidads_10_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(BarNomCli = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientodelapartidads_12_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(BarSer = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientodelapartidads_14_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P097W5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Mantenimientodelapartidads_1_filterfulltext ,
                                          String AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                          String AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                          String AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                          String AV53Mantenimientodelapartidads_4_tfbarnped ,
                                          String AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                          String AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                          String AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                          String AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                          String AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                          String AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                          String AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                          String AV61Mantenimientodelapartidads_12_tfbarser ,
                                          String AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                          String AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                          String A4812BarEncCli ,
                                          String A3746BarNPed ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A396EmprCod ,
                                          String AV43EmprCod ,
                                          int A252CliCod ,
                                          int AV44Clicod ,
                                          String AV45BarEnccli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[24];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, BarEncCli, BarColNom, BarSerDsc, BarSer, BarNomCli, BarNPed, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      addWhere(sWhereString, "(BarEncCli = ?)");
      if ( ! (GXutil.strcmp("", AV50Mantenimientodelapartidads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarEncCli) like '%' || UPPER(?)) or ( UPPER(BarNPed) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarColNom) like '%' || UPPER(?)) or ( UPPER(BarNomCli) like '%' || UPPER(?)) or ( UPPER(BarSer) like '%' || UPPER(?)) or ( UPPER(BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV51Mantenimientodelapartidads_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV53Mantenimientodelapartidads_4_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNPed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(BarNPed = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Mantenimientodelapartidads_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Mantenimientodelapartidads_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(BarColNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV59Mantenimientodelapartidads_10_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(BarNomCli = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientodelapartidads_12_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(BarSer = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientodelapartidads_14_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P097W6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Mantenimientodelapartidads_1_filterfulltext ,
                                          String AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                          String AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                          String AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                          String AV53Mantenimientodelapartidads_4_tfbarnped ,
                                          String AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                          String AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                          String AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                          String AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                          String AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                          String AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                          String AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                          String AV61Mantenimientodelapartidads_12_tfbarser ,
                                          String AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                          String AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                          String A4812BarEncCli ,
                                          String A3746BarNPed ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A396EmprCod ,
                                          String AV43EmprCod ,
                                          int A252CliCod ,
                                          int AV44Clicod ,
                                          String AV45BarEnccli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[24];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, BarEncCli, BarNomCli, BarSerDsc, BarSer, BarColNom, BarNPed, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      addWhere(sWhereString, "(BarEncCli = ?)");
      if ( ! (GXutil.strcmp("", AV50Mantenimientodelapartidads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarEncCli) like '%' || UPPER(?)) or ( UPPER(BarNPed) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarColNom) like '%' || UPPER(?)) or ( UPPER(BarNomCli) like '%' || UPPER(?)) or ( UPPER(BarSer) like '%' || UPPER(?)) or ( UPPER(BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
         GXv_int10[4] = (byte)(1) ;
         GXv_int10[5] = (byte)(1) ;
         GXv_int10[6] = (byte)(1) ;
         GXv_int10[7] = (byte)(1) ;
         GXv_int10[8] = (byte)(1) ;
         GXv_int10[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV51Mantenimientodelapartidads_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV53Mantenimientodelapartidads_4_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNPed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(BarNPed = ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Mantenimientodelapartidads_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Mantenimientodelapartidads_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(BarColNom = ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV59Mantenimientodelapartidads_10_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(BarNomCli = ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientodelapartidads_12_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(BarSer = ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientodelapartidads_14_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarNomCli" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P097W7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Mantenimientodelapartidads_1_filterfulltext ,
                                          String AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                          String AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                          String AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                          String AV53Mantenimientodelapartidads_4_tfbarnped ,
                                          String AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                          String AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                          String AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                          String AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                          String AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                          String AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                          String AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                          String AV61Mantenimientodelapartidads_12_tfbarser ,
                                          String AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                          String AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                          String A4812BarEncCli ,
                                          String A3746BarNPed ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String AV45BarEnccli ,
                                          String AV43EmprCod ,
                                          int AV44Clicod ,
                                          String A396EmprCod ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[24];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT CliCod, EmprCod, BarSer, BarSerDsc, BarNomCli, BarColNom, BarNPed, BarEncCli, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ?)");
      addWhere(sWhereString, "(BarEncCli = ?)");
      if ( ! (GXutil.strcmp("", AV50Mantenimientodelapartidads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarEncCli) like '%' || UPPER(?)) or ( UPPER(BarNPed) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarColNom) like '%' || UPPER(?)) or ( UPPER(BarNomCli) like '%' || UPPER(?)) or ( UPPER(BarSer) like '%' || UPPER(?)) or ( UPPER(BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
         GXv_int12[4] = (byte)(1) ;
         GXv_int12[5] = (byte)(1) ;
         GXv_int12[6] = (byte)(1) ;
         GXv_int12[7] = (byte)(1) ;
         GXv_int12[8] = (byte)(1) ;
         GXv_int12[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV51Mantenimientodelapartidads_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV53Mantenimientodelapartidads_4_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNPed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(BarNPed = ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Mantenimientodelapartidads_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Mantenimientodelapartidads_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(BarColNom = ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV59Mantenimientodelapartidads_10_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(BarNomCli = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientodelapartidads_12_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(BarSer = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientodelapartidads_14_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, CliCod, BarSer" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P097W8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV50Mantenimientodelapartidads_1_filterfulltext ,
                                          String AV52Mantenimientodelapartidads_3_tfbarenccli_sel ,
                                          String AV51Mantenimientodelapartidads_2_tfbarenccli ,
                                          String AV54Mantenimientodelapartidads_5_tfbarnped_sel ,
                                          String AV53Mantenimientodelapartidads_4_tfbarnped ,
                                          String AV56Mantenimientodelapartidads_7_tfbarnhdr_sel ,
                                          String AV55Mantenimientodelapartidads_6_tfbarnhdr ,
                                          String AV58Mantenimientodelapartidads_9_tfbarcolnom_sel ,
                                          String AV57Mantenimientodelapartidads_8_tfbarcolnom ,
                                          String AV60Mantenimientodelapartidads_11_tfbarnomcli_sel ,
                                          String AV59Mantenimientodelapartidads_10_tfbarnomcli ,
                                          String AV62Mantenimientodelapartidads_13_tfbarser_sel ,
                                          String AV61Mantenimientodelapartidads_12_tfbarser ,
                                          String AV64Mantenimientodelapartidads_15_tfbarserdsc_sel ,
                                          String AV63Mantenimientodelapartidads_14_tfbarserdsc ,
                                          String A4812BarEncCli ,
                                          String A3746BarNPed ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A396EmprCod ,
                                          String AV43EmprCod ,
                                          int A252CliCod ,
                                          int AV44Clicod ,
                                          String AV45BarEnccli )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[24];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT EmprCod, CliCod, BarEncCli, BarSerDsc, BarSer, BarNomCli, BarColNom, BarNPed, BarCodPar, BarCodReo, BarCod FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(CliCod = ?)");
      addWhere(sWhereString, "(BarEncCli = ?)");
      if ( ! (GXutil.strcmp("", AV50Mantenimientodelapartidads_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarEncCli) like '%' || UPPER(?)) or ( UPPER(BarNPed) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?)) or ( UPPER(BarColNom) like '%' || UPPER(?)) or ( UPPER(BarNomCli) like '%' || UPPER(?)) or ( UPPER(BarSer) like '%' || UPPER(?)) or ( UPPER(BarSerDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
         GXv_int14[4] = (byte)(1) ;
         GXv_int14[5] = (byte)(1) ;
         GXv_int14[6] = (byte)(1) ;
         GXv_int14[7] = (byte)(1) ;
         GXv_int14[8] = (byte)(1) ;
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV51Mantenimientodelapartidads_2_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52Mantenimientodelapartidads_3_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(BarEncCli = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) && ( ! (GXutil.strcmp("", AV53Mantenimientodelapartidads_4_tfbarnped)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNPed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Mantenimientodelapartidads_5_tfbarnped_sel)==0) )
      {
         addWhere(sWhereString, "(BarNPed = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV55Mantenimientodelapartidads_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV56Mantenimientodelapartidads_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV57Mantenimientodelapartidads_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Mantenimientodelapartidads_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(BarColNom = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV59Mantenimientodelapartidads_10_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60Mantenimientodelapartidads_11_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(BarNomCli = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV61Mantenimientodelapartidads_12_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Mantenimientodelapartidads_13_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(BarSer = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV63Mantenimientodelapartidads_14_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Mantenimientodelapartidads_15_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarSerDsc" ;
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
                  return conditional_P097W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] );
            case 1 :
                  return conditional_P097W3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] );
            case 2 :
                  return conditional_P097W4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() );
            case 3 :
                  return conditional_P097W5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] );
            case 4 :
                  return conditional_P097W6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] );
            case 5 :
                  return conditional_P097W7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() );
            case 6 :
                  return conditional_P097W8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097W3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097W4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097W5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097W6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097W7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P097W8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 20);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               return;
      }
   }

}

