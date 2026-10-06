package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wcconsultaalmacentejidoencrudo_producciongetfilterdata extends GXProcedure
{
   public wcconsultaalmacentejidoencrudo_producciongetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultaalmacentejidoencrudo_producciongetfilterdata.class ), "" );
   }

   public wcconsultaalmacentejidoencrudo_producciongetfilterdata( int remoteHandle ,
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
      wcconsultaalmacentejidoencrudo_producciongetfilterdata.this.aP5 = new String[] {""};
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
      wcconsultaalmacentejidoencrudo_producciongetfilterdata.this.AV14DDOName = aP0;
      wcconsultaalmacentejidoencrudo_producciongetfilterdata.this.AV12SearchTxt = aP1;
      wcconsultaalmacentejidoencrudo_producciongetfilterdata.this.AV13SearchTxtTo = aP2;
      wcconsultaalmacentejidoencrudo_producciongetfilterdata.this.aP3 = aP3;
      wcconsultaalmacentejidoencrudo_producciongetfilterdata.this.aP4 = aP4;
      wcconsultaalmacentejidoencrudo_producciongetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_BARNOMCLI") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_BARAGREST") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV14DDOName), "DDO_BARFASCOD") == 0 )
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
      AV18OptionsJson = AV17Options.toJSonString(false) ;
      AV21OptionsDescJson = AV20OptionsDesc.toJSonString(false) ;
      AV23OptionIndexesJson = AV22OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue("core.WCConsultaAlmacenTejidoencrudo_ProduccionGridState"), "") == 0 )
      {
         AV27GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "core.WCConsultaAlmacenTejidoencrudo_ProduccionGridState"), null, null);
      }
      else
      {
         AV27GridState.fromxml(AV25Session.getValue("core.WCConsultaAlmacenTejidoencrudo_ProduccionGridState"), null, null);
      }
      AV59GXV1 = 1 ;
      while ( AV59GXV1 <= AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV28GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV27GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV59GXV1));
         if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV35TFBarSer = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV36TFBarSer_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV37TFBarSerDsc = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV38TFBarSerDsc_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV39TFBarColNom = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV40TFBarColNom_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV41TFBarColNum = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV42TFBarColNum_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV43TFBarNomCli = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV44TFBarNomCli_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV45TFBarPieKil = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFBarPieKil_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV47TFBarPieMet = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFBarPieMet_To = CommonUtil.decimalVal( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEPIE") == 0 )
         {
            AV49TFBarPiePie = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFBarPiePie_To = (int)(GXutil.lval( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV51TFBarAgrEst = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV52TFBarAgrEst_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV53TFBarFasCod = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV54TFBarFasCod_Sel = AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCUM") == 0 )
         {
            AV55TFBarFecCum = localUtil.ctod( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV56TFBarFecCum_To = localUtil.ctod( AV28GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV59GXV1 = (int)(AV59GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV12SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = AV30FilterFullText ;
      AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = AV35TFBarSer ;
      AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel = AV36TFBarSer_Sel ;
      AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = AV37TFBarSerDsc ;
      AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = AV39TFBarColNom ;
      AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel = AV40TFBarColNom_Sel ;
      AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum = AV41TFBarColNum ;
      AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to = AV42TFBarColNum_To ;
      AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = AV43TFBarNomCli ;
      AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel = AV44TFBarNomCli_Sel ;
      AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil = AV45TFBarPieKil ;
      AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to = AV46TFBarPieKil_To ;
      AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet = AV47TFBarPieMet ;
      AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to = AV48TFBarPieMet_To ;
      AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie = AV49TFBarPiePie ;
      AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to = AV50TFBarPiePie_To ;
      AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = AV51TFBarAgrEst ;
      AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel = AV52TFBarAgrEst_Sel ;
      AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = AV53TFBarFasCod ;
      AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel = AV54TFBarFasCod_Sel ;
      AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum = AV55TFBarFecCum ;
      AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to = AV56TFBarFecCum_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) ,
                                           AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) ,
                                           AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           AV31Emprcod ,
                                           Integer.valueOf(AV32ALbrecCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod), 8, "%") ;
      lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr), 11, "%") ;
      lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser), 16, "%") ;
      lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc), 26, "%") ;
      lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom), 13, "%") ;
      lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli), 13, "%") ;
      lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P08ZW8 */
      pr_default.execute(0, new Object[] {AV31Emprcod, Integer.valueOf(AV32ALbrecCod), AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr, AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel, lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser, AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel, lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc, AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel, lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom, AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel, Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum), Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to), lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli, AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to, Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie), Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to), lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest, AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P08ZW8_A44AlbRecCod[0] ;
         A396EmprCod = P08ZW8_A396EmprCod[0] ;
         A120BarAgrEst = P08ZW8_A120BarAgrEst[0] ;
         A1501BarPiePie = P08ZW8_A1501BarPiePie[0] ;
         A205BarPieMet = P08ZW8_A205BarPieMet[0] ;
         A203BarPieKil = P08ZW8_A203BarPieKil[0] ;
         A1234BarNomCli = P08ZW8_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW8_A136BarColNum[0] ;
         A135BarColNom = P08ZW8_A135BarColNom[0] ;
         A1652BarSerDsc = P08ZW8_A1652BarSerDsc[0] ;
         A212BarSer = P08ZW8_A212BarSer[0] ;
         A13696BarNHdr = P08ZW8_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW8_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW8_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW8_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW8_n151BarFasCod[0] ;
         A129BarCod = P08ZW8_A129BarCod[0] ;
         A132BarCodReo = P08ZW8_A132BarCodReo[0] ;
         A130BarCodPar = P08ZW8_A130BarCodPar[0] ;
         A200BarPieCod = P08ZW8_A200BarPieCod[0] ;
         A120BarAgrEst = P08ZW8_A120BarAgrEst[0] ;
         A1234BarNomCli = P08ZW8_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW8_A136BarColNum[0] ;
         A135BarColNom = P08ZW8_A135BarColNom[0] ;
         A1652BarSerDsc = P08ZW8_A1652BarSerDsc[0] ;
         A212BarSer = P08ZW8_A212BarSer[0] ;
         A13696BarNHdr = P08ZW8_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW8_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW8_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW8_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW8_n151BarFasCod[0] ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV16Option = A13696BarNHdr ;
            AV15InsertIndex = 1 ;
            while ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) < 0 ) )
            {
               AV15InsertIndex = (int)(AV15InsertIndex+1) ;
            }
            if ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) == 0 ) )
            {
               AV24count = GXutil.lval( (String)AV22OptionIndexes.elementAt(-1+AV15InsertIndex)) ;
               AV24count = (long)(AV24count+1) ;
               AV22OptionIndexes.removeItem(AV15InsertIndex);
               AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), AV15InsertIndex);
            }
            else
            {
               AV17Options.add(AV16Option, AV15InsertIndex);
               AV22OptionIndexes.add("1", AV15InsertIndex);
            }
         }
         if ( AV17Options.size() == 50 )
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
      AV35TFBarSer = AV12SearchTxt ;
      AV36TFBarSer_Sel = "" ;
      AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = AV30FilterFullText ;
      AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = AV35TFBarSer ;
      AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel = AV36TFBarSer_Sel ;
      AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = AV37TFBarSerDsc ;
      AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = AV39TFBarColNom ;
      AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel = AV40TFBarColNom_Sel ;
      AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum = AV41TFBarColNum ;
      AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to = AV42TFBarColNum_To ;
      AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = AV43TFBarNomCli ;
      AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel = AV44TFBarNomCli_Sel ;
      AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil = AV45TFBarPieKil ;
      AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to = AV46TFBarPieKil_To ;
      AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet = AV47TFBarPieMet ;
      AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to = AV48TFBarPieMet_To ;
      AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie = AV49TFBarPiePie ;
      AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to = AV50TFBarPiePie_To ;
      AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = AV51TFBarAgrEst ;
      AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel = AV52TFBarAgrEst_Sel ;
      AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = AV53TFBarFasCod ;
      AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel = AV54TFBarFasCod_Sel ;
      AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum = AV55TFBarFecCum ;
      AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to = AV56TFBarFecCum_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) ,
                                           AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) ,
                                           AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           A396EmprCod ,
                                           AV31Emprcod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV32ALbrecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod), 8, "%") ;
      lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr), 11, "%") ;
      lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser), 16, "%") ;
      lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc), 26, "%") ;
      lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom), 13, "%") ;
      lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli), 13, "%") ;
      lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P08ZW15 */
      pr_default.execute(1, new Object[] {AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV31Emprcod, Integer.valueOf(AV32ALbrecCod), lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr, AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel, lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser, AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel, lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc, AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel, lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom, AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel, Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum), Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to), lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli, AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to, Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie), Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to), lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest, AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8ZW3 = false ;
         A396EmprCod = P08ZW15_A396EmprCod[0] ;
         A44AlbRecCod = P08ZW15_A44AlbRecCod[0] ;
         A212BarSer = P08ZW15_A212BarSer[0] ;
         A120BarAgrEst = P08ZW15_A120BarAgrEst[0] ;
         A1501BarPiePie = P08ZW15_A1501BarPiePie[0] ;
         A205BarPieMet = P08ZW15_A205BarPieMet[0] ;
         A203BarPieKil = P08ZW15_A203BarPieKil[0] ;
         A1234BarNomCli = P08ZW15_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW15_A136BarColNum[0] ;
         A135BarColNom = P08ZW15_A135BarColNom[0] ;
         A1652BarSerDsc = P08ZW15_A1652BarSerDsc[0] ;
         A13696BarNHdr = P08ZW15_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW15_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW15_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW15_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW15_n151BarFasCod[0] ;
         A129BarCod = P08ZW15_A129BarCod[0] ;
         A132BarCodReo = P08ZW15_A132BarCodReo[0] ;
         A130BarCodPar = P08ZW15_A130BarCodPar[0] ;
         A200BarPieCod = P08ZW15_A200BarPieCod[0] ;
         A212BarSer = P08ZW15_A212BarSer[0] ;
         A120BarAgrEst = P08ZW15_A120BarAgrEst[0] ;
         A1234BarNomCli = P08ZW15_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW15_A136BarColNum[0] ;
         A135BarColNom = P08ZW15_A135BarColNom[0] ;
         A1652BarSerDsc = P08ZW15_A1652BarSerDsc[0] ;
         A13696BarNHdr = P08ZW15_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW15_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW15_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW15_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW15_n151BarFasCod[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08ZW15_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk8ZW3 = false ;
            A396EmprCod = P08ZW15_A396EmprCod[0] ;
            A129BarCod = P08ZW15_A129BarCod[0] ;
            A132BarCodReo = P08ZW15_A132BarCodReo[0] ;
            A130BarCodPar = P08ZW15_A130BarCodPar[0] ;
            A200BarPieCod = P08ZW15_A200BarPieCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk8ZW3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV16Option = A212BarSer ;
            AV17Options.add(AV16Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV17Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZW3 )
         {
            brk8ZW3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV37TFBarSerDsc = AV12SearchTxt ;
      AV38TFBarSerDsc_Sel = "" ;
      AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = AV30FilterFullText ;
      AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = AV35TFBarSer ;
      AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel = AV36TFBarSer_Sel ;
      AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = AV37TFBarSerDsc ;
      AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = AV39TFBarColNom ;
      AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel = AV40TFBarColNom_Sel ;
      AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum = AV41TFBarColNum ;
      AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to = AV42TFBarColNum_To ;
      AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = AV43TFBarNomCli ;
      AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel = AV44TFBarNomCli_Sel ;
      AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil = AV45TFBarPieKil ;
      AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to = AV46TFBarPieKil_To ;
      AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet = AV47TFBarPieMet ;
      AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to = AV48TFBarPieMet_To ;
      AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie = AV49TFBarPiePie ;
      AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to = AV50TFBarPiePie_To ;
      AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = AV51TFBarAgrEst ;
      AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel = AV52TFBarAgrEst_Sel ;
      AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = AV53TFBarFasCod ;
      AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel = AV54TFBarFasCod_Sel ;
      AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum = AV55TFBarFecCum ;
      AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to = AV56TFBarFecCum_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) ,
                                           AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) ,
                                           AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           A396EmprCod ,
                                           AV31Emprcod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV32ALbrecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod), 8, "%") ;
      lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr), 11, "%") ;
      lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser), 16, "%") ;
      lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc), 26, "%") ;
      lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom), 13, "%") ;
      lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli), 13, "%") ;
      lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P08ZW22 */
      pr_default.execute(2, new Object[] {AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV31Emprcod, Integer.valueOf(AV32ALbrecCod), lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr, AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel, lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser, AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel, lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc, AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel, lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom, AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel, Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum), Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to), lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli, AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to, Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie), Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to), lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest, AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8ZW5 = false ;
         A396EmprCod = P08ZW22_A396EmprCod[0] ;
         A44AlbRecCod = P08ZW22_A44AlbRecCod[0] ;
         A1652BarSerDsc = P08ZW22_A1652BarSerDsc[0] ;
         A120BarAgrEst = P08ZW22_A120BarAgrEst[0] ;
         A1501BarPiePie = P08ZW22_A1501BarPiePie[0] ;
         A205BarPieMet = P08ZW22_A205BarPieMet[0] ;
         A203BarPieKil = P08ZW22_A203BarPieKil[0] ;
         A1234BarNomCli = P08ZW22_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW22_A136BarColNum[0] ;
         A135BarColNom = P08ZW22_A135BarColNom[0] ;
         A212BarSer = P08ZW22_A212BarSer[0] ;
         A13696BarNHdr = P08ZW22_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW22_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW22_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW22_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW22_n151BarFasCod[0] ;
         A129BarCod = P08ZW22_A129BarCod[0] ;
         A132BarCodReo = P08ZW22_A132BarCodReo[0] ;
         A130BarCodPar = P08ZW22_A130BarCodPar[0] ;
         A200BarPieCod = P08ZW22_A200BarPieCod[0] ;
         A1652BarSerDsc = P08ZW22_A1652BarSerDsc[0] ;
         A120BarAgrEst = P08ZW22_A120BarAgrEst[0] ;
         A1234BarNomCli = P08ZW22_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW22_A136BarColNum[0] ;
         A135BarColNom = P08ZW22_A135BarColNom[0] ;
         A212BarSer = P08ZW22_A212BarSer[0] ;
         A13696BarNHdr = P08ZW22_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW22_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW22_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW22_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW22_n151BarFasCod[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08ZW22_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk8ZW5 = false ;
            A396EmprCod = P08ZW22_A396EmprCod[0] ;
            A129BarCod = P08ZW22_A129BarCod[0] ;
            A132BarCodReo = P08ZW22_A132BarCodReo[0] ;
            A130BarCodPar = P08ZW22_A130BarCodPar[0] ;
            A200BarPieCod = P08ZW22_A200BarPieCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk8ZW5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV16Option = A1652BarSerDsc ;
            AV17Options.add(AV16Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV17Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZW5 )
         {
            brk8ZW5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV39TFBarColNom = AV12SearchTxt ;
      AV40TFBarColNom_Sel = "" ;
      AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = AV30FilterFullText ;
      AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = AV35TFBarSer ;
      AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel = AV36TFBarSer_Sel ;
      AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = AV37TFBarSerDsc ;
      AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = AV39TFBarColNom ;
      AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel = AV40TFBarColNom_Sel ;
      AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum = AV41TFBarColNum ;
      AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to = AV42TFBarColNum_To ;
      AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = AV43TFBarNomCli ;
      AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel = AV44TFBarNomCli_Sel ;
      AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil = AV45TFBarPieKil ;
      AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to = AV46TFBarPieKil_To ;
      AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet = AV47TFBarPieMet ;
      AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to = AV48TFBarPieMet_To ;
      AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie = AV49TFBarPiePie ;
      AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to = AV50TFBarPiePie_To ;
      AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = AV51TFBarAgrEst ;
      AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel = AV52TFBarAgrEst_Sel ;
      AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = AV53TFBarFasCod ;
      AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel = AV54TFBarFasCod_Sel ;
      AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum = AV55TFBarFecCum ;
      AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to = AV56TFBarFecCum_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) ,
                                           AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) ,
                                           AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           A396EmprCod ,
                                           AV31Emprcod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV32ALbrecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod), 8, "%") ;
      lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr), 11, "%") ;
      lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser), 16, "%") ;
      lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc), 26, "%") ;
      lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom), 13, "%") ;
      lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli), 13, "%") ;
      lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P08ZW29 */
      pr_default.execute(3, new Object[] {AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV31Emprcod, Integer.valueOf(AV32ALbrecCod), lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr, AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel, lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser, AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel, lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc, AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel, lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom, AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel, Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum), Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to), lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli, AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to, Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie), Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to), lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest, AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8ZW7 = false ;
         A396EmprCod = P08ZW29_A396EmprCod[0] ;
         A44AlbRecCod = P08ZW29_A44AlbRecCod[0] ;
         A135BarColNom = P08ZW29_A135BarColNom[0] ;
         A120BarAgrEst = P08ZW29_A120BarAgrEst[0] ;
         A1501BarPiePie = P08ZW29_A1501BarPiePie[0] ;
         A205BarPieMet = P08ZW29_A205BarPieMet[0] ;
         A203BarPieKil = P08ZW29_A203BarPieKil[0] ;
         A1234BarNomCli = P08ZW29_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW29_A136BarColNum[0] ;
         A1652BarSerDsc = P08ZW29_A1652BarSerDsc[0] ;
         A212BarSer = P08ZW29_A212BarSer[0] ;
         A13696BarNHdr = P08ZW29_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW29_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW29_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW29_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW29_n151BarFasCod[0] ;
         A129BarCod = P08ZW29_A129BarCod[0] ;
         A132BarCodReo = P08ZW29_A132BarCodReo[0] ;
         A130BarCodPar = P08ZW29_A130BarCodPar[0] ;
         A200BarPieCod = P08ZW29_A200BarPieCod[0] ;
         A135BarColNom = P08ZW29_A135BarColNom[0] ;
         A120BarAgrEst = P08ZW29_A120BarAgrEst[0] ;
         A1234BarNomCli = P08ZW29_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW29_A136BarColNum[0] ;
         A1652BarSerDsc = P08ZW29_A1652BarSerDsc[0] ;
         A212BarSer = P08ZW29_A212BarSer[0] ;
         A13696BarNHdr = P08ZW29_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW29_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW29_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW29_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW29_n151BarFasCod[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08ZW29_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk8ZW7 = false ;
            A396EmprCod = P08ZW29_A396EmprCod[0] ;
            A129BarCod = P08ZW29_A129BarCod[0] ;
            A132BarCodReo = P08ZW29_A132BarCodReo[0] ;
            A130BarCodPar = P08ZW29_A130BarCodPar[0] ;
            A200BarPieCod = P08ZW29_A200BarPieCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk8ZW7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV16Option = A135BarColNom ;
            AV17Options.add(AV16Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV17Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZW7 )
         {
            brk8ZW7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV43TFBarNomCli = AV12SearchTxt ;
      AV44TFBarNomCli_Sel = "" ;
      AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = AV30FilterFullText ;
      AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = AV35TFBarSer ;
      AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel = AV36TFBarSer_Sel ;
      AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = AV37TFBarSerDsc ;
      AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = AV39TFBarColNom ;
      AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel = AV40TFBarColNom_Sel ;
      AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum = AV41TFBarColNum ;
      AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to = AV42TFBarColNum_To ;
      AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = AV43TFBarNomCli ;
      AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel = AV44TFBarNomCli_Sel ;
      AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil = AV45TFBarPieKil ;
      AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to = AV46TFBarPieKil_To ;
      AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet = AV47TFBarPieMet ;
      AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to = AV48TFBarPieMet_To ;
      AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie = AV49TFBarPiePie ;
      AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to = AV50TFBarPiePie_To ;
      AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = AV51TFBarAgrEst ;
      AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel = AV52TFBarAgrEst_Sel ;
      AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = AV53TFBarFasCod ;
      AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel = AV54TFBarFasCod_Sel ;
      AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum = AV55TFBarFecCum ;
      AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to = AV56TFBarFecCum_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) ,
                                           AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) ,
                                           AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           A396EmprCod ,
                                           AV31Emprcod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV32ALbrecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod), 8, "%") ;
      lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr), 11, "%") ;
      lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser), 16, "%") ;
      lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc), 26, "%") ;
      lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom), 13, "%") ;
      lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli), 13, "%") ;
      lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P08ZW36 */
      pr_default.execute(4, new Object[] {AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV31Emprcod, Integer.valueOf(AV32ALbrecCod), lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr, AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel, lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser, AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel, lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc, AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel, lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom, AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel, Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum), Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to), lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli, AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to, Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie), Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to), lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest, AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8ZW9 = false ;
         A396EmprCod = P08ZW36_A396EmprCod[0] ;
         A44AlbRecCod = P08ZW36_A44AlbRecCod[0] ;
         A1234BarNomCli = P08ZW36_A1234BarNomCli[0] ;
         A120BarAgrEst = P08ZW36_A120BarAgrEst[0] ;
         A1501BarPiePie = P08ZW36_A1501BarPiePie[0] ;
         A205BarPieMet = P08ZW36_A205BarPieMet[0] ;
         A203BarPieKil = P08ZW36_A203BarPieKil[0] ;
         A136BarColNum = P08ZW36_A136BarColNum[0] ;
         A135BarColNom = P08ZW36_A135BarColNom[0] ;
         A1652BarSerDsc = P08ZW36_A1652BarSerDsc[0] ;
         A212BarSer = P08ZW36_A212BarSer[0] ;
         A13696BarNHdr = P08ZW36_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW36_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW36_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW36_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW36_n151BarFasCod[0] ;
         A129BarCod = P08ZW36_A129BarCod[0] ;
         A132BarCodReo = P08ZW36_A132BarCodReo[0] ;
         A130BarCodPar = P08ZW36_A130BarCodPar[0] ;
         A200BarPieCod = P08ZW36_A200BarPieCod[0] ;
         A1234BarNomCli = P08ZW36_A1234BarNomCli[0] ;
         A120BarAgrEst = P08ZW36_A120BarAgrEst[0] ;
         A136BarColNum = P08ZW36_A136BarColNum[0] ;
         A135BarColNom = P08ZW36_A135BarColNom[0] ;
         A1652BarSerDsc = P08ZW36_A1652BarSerDsc[0] ;
         A212BarSer = P08ZW36_A212BarSer[0] ;
         A13696BarNHdr = P08ZW36_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW36_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW36_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW36_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW36_n151BarFasCod[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08ZW36_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk8ZW9 = false ;
            A396EmprCod = P08ZW36_A396EmprCod[0] ;
            A129BarCod = P08ZW36_A129BarCod[0] ;
            A132BarCodReo = P08ZW36_A132BarCodReo[0] ;
            A130BarCodPar = P08ZW36_A130BarCodPar[0] ;
            A200BarPieCod = P08ZW36_A200BarPieCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk8ZW9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV16Option = A1234BarNomCli ;
            AV17Options.add(AV16Option, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV17Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZW9 )
         {
            brk8ZW9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARAGRESTOPTIONS' Routine */
      returnInSub = false ;
      AV51TFBarAgrEst = AV12SearchTxt ;
      AV52TFBarAgrEst_Sel = "" ;
      AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = AV30FilterFullText ;
      AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = AV35TFBarSer ;
      AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel = AV36TFBarSer_Sel ;
      AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = AV37TFBarSerDsc ;
      AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = AV39TFBarColNom ;
      AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel = AV40TFBarColNom_Sel ;
      AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum = AV41TFBarColNum ;
      AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to = AV42TFBarColNum_To ;
      AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = AV43TFBarNomCli ;
      AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel = AV44TFBarNomCli_Sel ;
      AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil = AV45TFBarPieKil ;
      AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to = AV46TFBarPieKil_To ;
      AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet = AV47TFBarPieMet ;
      AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to = AV48TFBarPieMet_To ;
      AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie = AV49TFBarPiePie ;
      AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to = AV50TFBarPiePie_To ;
      AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = AV51TFBarAgrEst ;
      AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel = AV52TFBarAgrEst_Sel ;
      AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = AV53TFBarFasCod ;
      AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel = AV54TFBarFasCod_Sel ;
      AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum = AV55TFBarFecCum ;
      AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to = AV56TFBarFecCum_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) ,
                                           AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) ,
                                           AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           A396EmprCod ,
                                           AV31Emprcod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Integer.valueOf(AV32ALbrecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT
                                           }
      });
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod), 8, "%") ;
      lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr), 11, "%") ;
      lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser), 16, "%") ;
      lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc), 26, "%") ;
      lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom), 13, "%") ;
      lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli), 13, "%") ;
      lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P08ZW43 */
      pr_default.execute(5, new Object[] {AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV31Emprcod, Integer.valueOf(AV32ALbrecCod), lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr, AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel, lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser, AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel, lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc, AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel, lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom, AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel, Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum), Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to), lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli, AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to, Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie), Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to), lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest, AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8ZW11 = false ;
         A396EmprCod = P08ZW43_A396EmprCod[0] ;
         A44AlbRecCod = P08ZW43_A44AlbRecCod[0] ;
         A120BarAgrEst = P08ZW43_A120BarAgrEst[0] ;
         A1501BarPiePie = P08ZW43_A1501BarPiePie[0] ;
         A205BarPieMet = P08ZW43_A205BarPieMet[0] ;
         A203BarPieKil = P08ZW43_A203BarPieKil[0] ;
         A1234BarNomCli = P08ZW43_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW43_A136BarColNum[0] ;
         A135BarColNom = P08ZW43_A135BarColNom[0] ;
         A1652BarSerDsc = P08ZW43_A1652BarSerDsc[0] ;
         A212BarSer = P08ZW43_A212BarSer[0] ;
         A13696BarNHdr = P08ZW43_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW43_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW43_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW43_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW43_n151BarFasCod[0] ;
         A129BarCod = P08ZW43_A129BarCod[0] ;
         A132BarCodReo = P08ZW43_A132BarCodReo[0] ;
         A130BarCodPar = P08ZW43_A130BarCodPar[0] ;
         A200BarPieCod = P08ZW43_A200BarPieCod[0] ;
         A120BarAgrEst = P08ZW43_A120BarAgrEst[0] ;
         A1234BarNomCli = P08ZW43_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW43_A136BarColNum[0] ;
         A135BarColNom = P08ZW43_A135BarColNom[0] ;
         A1652BarSerDsc = P08ZW43_A1652BarSerDsc[0] ;
         A212BarSer = P08ZW43_A212BarSer[0] ;
         A13696BarNHdr = P08ZW43_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW43_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW43_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW43_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW43_n151BarFasCod[0] ;
         AV24count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08ZW43_A120BarAgrEst[0], A120BarAgrEst) == 0 ) )
         {
            brk8ZW11 = false ;
            A396EmprCod = P08ZW43_A396EmprCod[0] ;
            A129BarCod = P08ZW43_A129BarCod[0] ;
            A132BarCodReo = P08ZW43_A132BarCodReo[0] ;
            A130BarCodPar = P08ZW43_A130BarCodPar[0] ;
            A200BarPieCod = P08ZW43_A200BarPieCod[0] ;
            AV24count = (long)(AV24count+1) ;
            brk8ZW11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A120BarAgrEst)==0) )
         {
            AV16Option = A120BarAgrEst ;
            AV19OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))) ;
            AV17Options.add(AV16Option, 0);
            AV20OptionsDesc.add(AV19OptionDesc, 0);
            AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV17Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8ZW11 )
         {
            brk8ZW11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARFASCODOPTIONS' Routine */
      returnInSub = false ;
      AV53TFBarFasCod = AV12SearchTxt ;
      AV54TFBarFasCod_Sel = "" ;
      AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = AV30FilterFullText ;
      AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = AV35TFBarSer ;
      AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel = AV36TFBarSer_Sel ;
      AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = AV37TFBarSerDsc ;
      AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = AV39TFBarColNom ;
      AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel = AV40TFBarColNom_Sel ;
      AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum = AV41TFBarColNum ;
      AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to = AV42TFBarColNum_To ;
      AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = AV43TFBarNomCli ;
      AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel = AV44TFBarNomCli_Sel ;
      AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil = AV45TFBarPieKil ;
      AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to = AV46TFBarPieKil_To ;
      AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet = AV47TFBarPieMet ;
      AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to = AV48TFBarPieMet_To ;
      AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie = AV49TFBarPiePie ;
      AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to = AV50TFBarPiePie_To ;
      AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = AV51TFBarAgrEst ;
      AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel = AV52TFBarAgrEst_Sel ;
      AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = AV53TFBarFasCod ;
      AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel = AV54TFBarFasCod_Sel ;
      AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum = AV55TFBarFecCum ;
      AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to = AV56TFBarFecCum_To ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) ,
                                           Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) ,
                                           AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) ,
                                           Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) ,
                                           AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           A156BarFecCum ,
                                           AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           AV31Emprcod ,
                                           Integer.valueOf(AV32ALbrecCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A44AlbRecCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext), "%", "") ;
      lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = GXutil.padr( GXutil.rtrim( AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod), 8, "%") ;
      lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr), 11, "%") ;
      lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = GXutil.padr( GXutil.rtrim( AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser), 16, "%") ;
      lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc), 26, "%") ;
      lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom), 13, "%") ;
      lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli), 13, "%") ;
      lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest), 1, "%") ;
      /* Using cursor P08ZW50 */
      pr_default.execute(6, new Object[] {AV31Emprcod, Integer.valueOf(AV32ALbrecCod), AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to, lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr, AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel, lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser, AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel, lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc, AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel, lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom, AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel, Integer.valueOf(AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum), Integer.valueOf(AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to), lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli, AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to, Integer.valueOf(AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie), Integer.valueOf(AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to), lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest, AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A44AlbRecCod = P08ZW50_A44AlbRecCod[0] ;
         A396EmprCod = P08ZW50_A396EmprCod[0] ;
         A120BarAgrEst = P08ZW50_A120BarAgrEst[0] ;
         A1501BarPiePie = P08ZW50_A1501BarPiePie[0] ;
         A205BarPieMet = P08ZW50_A205BarPieMet[0] ;
         A203BarPieKil = P08ZW50_A203BarPieKil[0] ;
         A1234BarNomCli = P08ZW50_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW50_A136BarColNum[0] ;
         A135BarColNom = P08ZW50_A135BarColNom[0] ;
         A1652BarSerDsc = P08ZW50_A1652BarSerDsc[0] ;
         A212BarSer = P08ZW50_A212BarSer[0] ;
         A13696BarNHdr = P08ZW50_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW50_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW50_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW50_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW50_n151BarFasCod[0] ;
         A129BarCod = P08ZW50_A129BarCod[0] ;
         A132BarCodReo = P08ZW50_A132BarCodReo[0] ;
         A130BarCodPar = P08ZW50_A130BarCodPar[0] ;
         A200BarPieCod = P08ZW50_A200BarPieCod[0] ;
         A120BarAgrEst = P08ZW50_A120BarAgrEst[0] ;
         A1234BarNomCli = P08ZW50_A1234BarNomCli[0] ;
         A136BarColNum = P08ZW50_A136BarColNum[0] ;
         A135BarColNom = P08ZW50_A135BarColNom[0] ;
         A1652BarSerDsc = P08ZW50_A1652BarSerDsc[0] ;
         A212BarSer = P08ZW50_A212BarSer[0] ;
         A13696BarNHdr = P08ZW50_A13696BarNHdr[0] ;
         A156BarFecCum = P08ZW50_A156BarFecCum[0] ;
         n156BarFecCum = P08ZW50_n156BarFecCum[0] ;
         A151BarFasCod = P08ZW50_A151BarFasCod[0] ;
         n151BarFasCod = P08ZW50_n151BarFasCod[0] ;
         if ( ! (GXutil.strcmp("", A151BarFasCod)==0) )
         {
            AV16Option = A151BarFasCod ;
            AV15InsertIndex = 1 ;
            while ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) < 0 ) )
            {
               AV15InsertIndex = (int)(AV15InsertIndex+1) ;
            }
            if ( ( AV15InsertIndex <= AV17Options.size() ) && ( GXutil.strcmp((String)AV17Options.elementAt(-1+AV15InsertIndex), AV16Option) == 0 ) )
            {
               AV24count = GXutil.lval( (String)AV22OptionIndexes.elementAt(-1+AV15InsertIndex)) ;
               AV24count = (long)(AV24count+1) ;
               AV22OptionIndexes.removeItem(AV15InsertIndex);
               AV22OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV24count), "Z,ZZZ,ZZZ,ZZ9")), AV15InsertIndex);
            }
            else
            {
               AV17Options.add(AV16Option, AV15InsertIndex);
               AV22OptionIndexes.add("1", AV15InsertIndex);
            }
         }
         if ( AV17Options.size() == 50 )
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
      this.aP3[0] = wcconsultaalmacentejidoencrudo_producciongetfilterdata.this.AV18OptionsJson;
      this.aP4[0] = wcconsultaalmacentejidoencrudo_producciongetfilterdata.this.AV21OptionsDescJson;
      this.aP5[0] = wcconsultaalmacentejidoencrudo_producciongetfilterdata.this.AV23OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18OptionsJson = "" ;
      AV21OptionsDescJson = "" ;
      AV23OptionIndexesJson = "" ;
      AV17Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV20OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV27GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV28GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV30FilterFullText = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV35TFBarSer = "" ;
      AV36TFBarSer_Sel = "" ;
      AV37TFBarSerDsc = "" ;
      AV38TFBarSerDsc_Sel = "" ;
      AV39TFBarColNom = "" ;
      AV40TFBarColNom_Sel = "" ;
      AV43TFBarNomCli = "" ;
      AV44TFBarNomCli_Sel = "" ;
      AV45TFBarPieKil = DecimalUtil.ZERO ;
      AV46TFBarPieKil_To = DecimalUtil.ZERO ;
      AV47TFBarPieMet = DecimalUtil.ZERO ;
      AV48TFBarPieMet_To = DecimalUtil.ZERO ;
      AV51TFBarAgrEst = "" ;
      AV52TFBarAgrEst_Sel = "" ;
      AV53TFBarFasCod = "" ;
      AV54TFBarFasCod_Sel = "" ;
      AV55TFBarFecCum = GXutil.nullDate() ;
      AV56TFBarFecCum_To = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = "" ;
      AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = "" ;
      AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel = "" ;
      AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = "" ;
      AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel = "" ;
      AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = "" ;
      AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel = "" ;
      AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = "" ;
      AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel = "" ;
      AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = "" ;
      AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel = "" ;
      AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil = DecimalUtil.ZERO ;
      AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet = DecimalUtil.ZERO ;
      AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to = DecimalUtil.ZERO ;
      AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = "" ;
      AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel = "" ;
      AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = "" ;
      AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel = "" ;
      AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum = GXutil.nullDate() ;
      AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to = GXutil.nullDate() ;
      lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext = "" ;
      lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod = "" ;
      scmdbuf = "" ;
      lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr = "" ;
      lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser = "" ;
      lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc = "" ;
      lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom = "" ;
      lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli = "" ;
      lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest = "" ;
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
      AV31Emprcod = "" ;
      A396EmprCod = "" ;
      P08ZW8_A44AlbRecCod = new int[1] ;
      P08ZW8_A396EmprCod = new String[] {""} ;
      P08ZW8_A120BarAgrEst = new String[] {""} ;
      P08ZW8_A1501BarPiePie = new int[1] ;
      P08ZW8_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW8_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW8_A1234BarNomCli = new String[] {""} ;
      P08ZW8_A136BarColNum = new int[1] ;
      P08ZW8_A135BarColNom = new String[] {""} ;
      P08ZW8_A1652BarSerDsc = new String[] {""} ;
      P08ZW8_A212BarSer = new String[] {""} ;
      P08ZW8_A13696BarNHdr = new String[] {""} ;
      P08ZW8_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZW8_n156BarFecCum = new boolean[] {false} ;
      P08ZW8_A151BarFasCod = new String[] {""} ;
      P08ZW8_n151BarFasCod = new boolean[] {false} ;
      P08ZW8_A129BarCod = new int[1] ;
      P08ZW8_A132BarCodReo = new byte[1] ;
      P08ZW8_A130BarCodPar = new String[] {""} ;
      P08ZW8_A200BarPieCod = new String[] {""} ;
      A200BarPieCod = "" ;
      AV16Option = "" ;
      P08ZW15_A396EmprCod = new String[] {""} ;
      P08ZW15_A44AlbRecCod = new int[1] ;
      P08ZW15_A212BarSer = new String[] {""} ;
      P08ZW15_A120BarAgrEst = new String[] {""} ;
      P08ZW15_A1501BarPiePie = new int[1] ;
      P08ZW15_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW15_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW15_A1234BarNomCli = new String[] {""} ;
      P08ZW15_A136BarColNum = new int[1] ;
      P08ZW15_A135BarColNom = new String[] {""} ;
      P08ZW15_A1652BarSerDsc = new String[] {""} ;
      P08ZW15_A13696BarNHdr = new String[] {""} ;
      P08ZW15_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZW15_n156BarFecCum = new boolean[] {false} ;
      P08ZW15_A151BarFasCod = new String[] {""} ;
      P08ZW15_n151BarFasCod = new boolean[] {false} ;
      P08ZW15_A129BarCod = new int[1] ;
      P08ZW15_A132BarCodReo = new byte[1] ;
      P08ZW15_A130BarCodPar = new String[] {""} ;
      P08ZW15_A200BarPieCod = new String[] {""} ;
      P08ZW22_A396EmprCod = new String[] {""} ;
      P08ZW22_A44AlbRecCod = new int[1] ;
      P08ZW22_A1652BarSerDsc = new String[] {""} ;
      P08ZW22_A120BarAgrEst = new String[] {""} ;
      P08ZW22_A1501BarPiePie = new int[1] ;
      P08ZW22_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW22_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW22_A1234BarNomCli = new String[] {""} ;
      P08ZW22_A136BarColNum = new int[1] ;
      P08ZW22_A135BarColNom = new String[] {""} ;
      P08ZW22_A212BarSer = new String[] {""} ;
      P08ZW22_A13696BarNHdr = new String[] {""} ;
      P08ZW22_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZW22_n156BarFecCum = new boolean[] {false} ;
      P08ZW22_A151BarFasCod = new String[] {""} ;
      P08ZW22_n151BarFasCod = new boolean[] {false} ;
      P08ZW22_A129BarCod = new int[1] ;
      P08ZW22_A132BarCodReo = new byte[1] ;
      P08ZW22_A130BarCodPar = new String[] {""} ;
      P08ZW22_A200BarPieCod = new String[] {""} ;
      P08ZW29_A396EmprCod = new String[] {""} ;
      P08ZW29_A44AlbRecCod = new int[1] ;
      P08ZW29_A135BarColNom = new String[] {""} ;
      P08ZW29_A120BarAgrEst = new String[] {""} ;
      P08ZW29_A1501BarPiePie = new int[1] ;
      P08ZW29_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW29_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW29_A1234BarNomCli = new String[] {""} ;
      P08ZW29_A136BarColNum = new int[1] ;
      P08ZW29_A1652BarSerDsc = new String[] {""} ;
      P08ZW29_A212BarSer = new String[] {""} ;
      P08ZW29_A13696BarNHdr = new String[] {""} ;
      P08ZW29_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZW29_n156BarFecCum = new boolean[] {false} ;
      P08ZW29_A151BarFasCod = new String[] {""} ;
      P08ZW29_n151BarFasCod = new boolean[] {false} ;
      P08ZW29_A129BarCod = new int[1] ;
      P08ZW29_A132BarCodReo = new byte[1] ;
      P08ZW29_A130BarCodPar = new String[] {""} ;
      P08ZW29_A200BarPieCod = new String[] {""} ;
      P08ZW36_A396EmprCod = new String[] {""} ;
      P08ZW36_A44AlbRecCod = new int[1] ;
      P08ZW36_A1234BarNomCli = new String[] {""} ;
      P08ZW36_A120BarAgrEst = new String[] {""} ;
      P08ZW36_A1501BarPiePie = new int[1] ;
      P08ZW36_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW36_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW36_A136BarColNum = new int[1] ;
      P08ZW36_A135BarColNom = new String[] {""} ;
      P08ZW36_A1652BarSerDsc = new String[] {""} ;
      P08ZW36_A212BarSer = new String[] {""} ;
      P08ZW36_A13696BarNHdr = new String[] {""} ;
      P08ZW36_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZW36_n156BarFecCum = new boolean[] {false} ;
      P08ZW36_A151BarFasCod = new String[] {""} ;
      P08ZW36_n151BarFasCod = new boolean[] {false} ;
      P08ZW36_A129BarCod = new int[1] ;
      P08ZW36_A132BarCodReo = new byte[1] ;
      P08ZW36_A130BarCodPar = new String[] {""} ;
      P08ZW36_A200BarPieCod = new String[] {""} ;
      P08ZW43_A396EmprCod = new String[] {""} ;
      P08ZW43_A44AlbRecCod = new int[1] ;
      P08ZW43_A120BarAgrEst = new String[] {""} ;
      P08ZW43_A1501BarPiePie = new int[1] ;
      P08ZW43_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW43_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW43_A1234BarNomCli = new String[] {""} ;
      P08ZW43_A136BarColNum = new int[1] ;
      P08ZW43_A135BarColNom = new String[] {""} ;
      P08ZW43_A1652BarSerDsc = new String[] {""} ;
      P08ZW43_A212BarSer = new String[] {""} ;
      P08ZW43_A13696BarNHdr = new String[] {""} ;
      P08ZW43_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZW43_n156BarFecCum = new boolean[] {false} ;
      P08ZW43_A151BarFasCod = new String[] {""} ;
      P08ZW43_n151BarFasCod = new boolean[] {false} ;
      P08ZW43_A129BarCod = new int[1] ;
      P08ZW43_A132BarCodReo = new byte[1] ;
      P08ZW43_A130BarCodPar = new String[] {""} ;
      P08ZW43_A200BarPieCod = new String[] {""} ;
      AV19OptionDesc = "" ;
      P08ZW50_A44AlbRecCod = new int[1] ;
      P08ZW50_A396EmprCod = new String[] {""} ;
      P08ZW50_A120BarAgrEst = new String[] {""} ;
      P08ZW50_A1501BarPiePie = new int[1] ;
      P08ZW50_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW50_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZW50_A1234BarNomCli = new String[] {""} ;
      P08ZW50_A136BarColNum = new int[1] ;
      P08ZW50_A135BarColNom = new String[] {""} ;
      P08ZW50_A1652BarSerDsc = new String[] {""} ;
      P08ZW50_A212BarSer = new String[] {""} ;
      P08ZW50_A13696BarNHdr = new String[] {""} ;
      P08ZW50_A156BarFecCum = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZW50_n156BarFecCum = new boolean[] {false} ;
      P08ZW50_A151BarFasCod = new String[] {""} ;
      P08ZW50_n151BarFasCod = new boolean[] {false} ;
      P08ZW50_A129BarCod = new int[1] ;
      P08ZW50_A132BarCodReo = new byte[1] ;
      P08ZW50_A130BarCodPar = new String[] {""} ;
      P08ZW50_A200BarPieCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultaalmacentejidoencrudo_producciongetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08ZW8_A44AlbRecCod, P08ZW8_A396EmprCod, P08ZW8_A120BarAgrEst, P08ZW8_A1501BarPiePie, P08ZW8_A205BarPieMet, P08ZW8_A203BarPieKil, P08ZW8_A1234BarNomCli, P08ZW8_A136BarColNum, P08ZW8_A135BarColNom, P08ZW8_A1652BarSerDsc,
            P08ZW8_A212BarSer, P08ZW8_A13696BarNHdr, P08ZW8_A156BarFecCum, P08ZW8_n156BarFecCum, P08ZW8_A151BarFasCod, P08ZW8_n151BarFasCod, P08ZW8_A129BarCod, P08ZW8_A132BarCodReo, P08ZW8_A130BarCodPar, P08ZW8_A200BarPieCod
            }
            , new Object[] {
            P08ZW15_A396EmprCod, P08ZW15_A44AlbRecCod, P08ZW15_A212BarSer, P08ZW15_A120BarAgrEst, P08ZW15_A1501BarPiePie, P08ZW15_A205BarPieMet, P08ZW15_A203BarPieKil, P08ZW15_A1234BarNomCli, P08ZW15_A136BarColNum, P08ZW15_A135BarColNom,
            P08ZW15_A1652BarSerDsc, P08ZW15_A13696BarNHdr, P08ZW15_A156BarFecCum, P08ZW15_n156BarFecCum, P08ZW15_A151BarFasCod, P08ZW15_n151BarFasCod, P08ZW15_A129BarCod, P08ZW15_A132BarCodReo, P08ZW15_A130BarCodPar, P08ZW15_A200BarPieCod
            }
            , new Object[] {
            P08ZW22_A396EmprCod, P08ZW22_A44AlbRecCod, P08ZW22_A1652BarSerDsc, P08ZW22_A120BarAgrEst, P08ZW22_A1501BarPiePie, P08ZW22_A205BarPieMet, P08ZW22_A203BarPieKil, P08ZW22_A1234BarNomCli, P08ZW22_A136BarColNum, P08ZW22_A135BarColNom,
            P08ZW22_A212BarSer, P08ZW22_A13696BarNHdr, P08ZW22_A156BarFecCum, P08ZW22_n156BarFecCum, P08ZW22_A151BarFasCod, P08ZW22_n151BarFasCod, P08ZW22_A129BarCod, P08ZW22_A132BarCodReo, P08ZW22_A130BarCodPar, P08ZW22_A200BarPieCod
            }
            , new Object[] {
            P08ZW29_A396EmprCod, P08ZW29_A44AlbRecCod, P08ZW29_A135BarColNom, P08ZW29_A120BarAgrEst, P08ZW29_A1501BarPiePie, P08ZW29_A205BarPieMet, P08ZW29_A203BarPieKil, P08ZW29_A1234BarNomCli, P08ZW29_A136BarColNum, P08ZW29_A1652BarSerDsc,
            P08ZW29_A212BarSer, P08ZW29_A13696BarNHdr, P08ZW29_A156BarFecCum, P08ZW29_n156BarFecCum, P08ZW29_A151BarFasCod, P08ZW29_n151BarFasCod, P08ZW29_A129BarCod, P08ZW29_A132BarCodReo, P08ZW29_A130BarCodPar, P08ZW29_A200BarPieCod
            }
            , new Object[] {
            P08ZW36_A396EmprCod, P08ZW36_A44AlbRecCod, P08ZW36_A1234BarNomCli, P08ZW36_A120BarAgrEst, P08ZW36_A1501BarPiePie, P08ZW36_A205BarPieMet, P08ZW36_A203BarPieKil, P08ZW36_A136BarColNum, P08ZW36_A135BarColNom, P08ZW36_A1652BarSerDsc,
            P08ZW36_A212BarSer, P08ZW36_A13696BarNHdr, P08ZW36_A156BarFecCum, P08ZW36_n156BarFecCum, P08ZW36_A151BarFasCod, P08ZW36_n151BarFasCod, P08ZW36_A129BarCod, P08ZW36_A132BarCodReo, P08ZW36_A130BarCodPar, P08ZW36_A200BarPieCod
            }
            , new Object[] {
            P08ZW43_A396EmprCod, P08ZW43_A44AlbRecCod, P08ZW43_A120BarAgrEst, P08ZW43_A1501BarPiePie, P08ZW43_A205BarPieMet, P08ZW43_A203BarPieKil, P08ZW43_A1234BarNomCli, P08ZW43_A136BarColNum, P08ZW43_A135BarColNom, P08ZW43_A1652BarSerDsc,
            P08ZW43_A212BarSer, P08ZW43_A13696BarNHdr, P08ZW43_A156BarFecCum, P08ZW43_n156BarFecCum, P08ZW43_A151BarFasCod, P08ZW43_n151BarFasCod, P08ZW43_A129BarCod, P08ZW43_A132BarCodReo, P08ZW43_A130BarCodPar, P08ZW43_A200BarPieCod
            }
            , new Object[] {
            P08ZW50_A44AlbRecCod, P08ZW50_A396EmprCod, P08ZW50_A120BarAgrEst, P08ZW50_A1501BarPiePie, P08ZW50_A205BarPieMet, P08ZW50_A203BarPieKil, P08ZW50_A1234BarNomCli, P08ZW50_A136BarColNum, P08ZW50_A135BarColNom, P08ZW50_A1652BarSerDsc,
            P08ZW50_A212BarSer, P08ZW50_A13696BarNHdr, P08ZW50_A156BarFecCum, P08ZW50_n156BarFecCum, P08ZW50_A151BarFasCod, P08ZW50_n151BarFasCod, P08ZW50_A129BarCod, P08ZW50_A132BarCodReo, P08ZW50_A130BarCodPar, P08ZW50_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short Gx_err ;
   private int AV59GXV1 ;
   private int AV41TFBarColNum ;
   private int AV42TFBarColNum_To ;
   private int AV49TFBarPiePie ;
   private int AV50TFBarPiePie_To ;
   private int AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum ;
   private int AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to ;
   private int AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie ;
   private int AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1501BarPiePie ;
   private int AV32ALbrecCod ;
   private int A44AlbRecCod ;
   private int AV15InsertIndex ;
   private long AV24count ;
   private java.math.BigDecimal AV45TFBarPieKil ;
   private java.math.BigDecimal AV46TFBarPieKil_To ;
   private java.math.BigDecimal AV47TFBarPieMet ;
   private java.math.BigDecimal AV48TFBarPieMet_To ;
   private java.math.BigDecimal AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ;
   private java.math.BigDecimal AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ;
   private java.math.BigDecimal AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ;
   private java.math.BigDecimal AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV35TFBarSer ;
   private String AV36TFBarSer_Sel ;
   private String AV37TFBarSerDsc ;
   private String AV38TFBarSerDsc_Sel ;
   private String AV39TFBarColNom ;
   private String AV40TFBarColNom_Sel ;
   private String AV43TFBarNomCli ;
   private String AV44TFBarNomCli_Sel ;
   private String AV51TFBarAgrEst ;
   private String AV52TFBarAgrEst_Sel ;
   private String AV53TFBarFasCod ;
   private String AV54TFBarFasCod_Sel ;
   private String A13696BarNHdr ;
   private String AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ;
   private String AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ;
   private String AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ;
   private String AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ;
   private String AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ;
   private String AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ;
   private String AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ;
   private String AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ;
   private String AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ;
   private String AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ;
   private String AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ;
   private String AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ;
   private String AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ;
   private String AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ;
   private String lV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ;
   private String scmdbuf ;
   private String lV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ;
   private String lV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ;
   private String lV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ;
   private String lV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ;
   private String lV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ;
   private String lV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A120BarAgrEst ;
   private String A151BarFasCod ;
   private String AV31Emprcod ;
   private String A396EmprCod ;
   private String A200BarPieCod ;
   private java.util.Date AV55TFBarFecCum ;
   private java.util.Date AV56TFBarFecCum_To ;
   private java.util.Date AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ;
   private java.util.Date AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ;
   private java.util.Date A156BarFecCum ;
   private boolean returnInSub ;
   private boolean n156BarFecCum ;
   private boolean n151BarFasCod ;
   private boolean brk8ZW3 ;
   private boolean brk8ZW5 ;
   private boolean brk8ZW7 ;
   private boolean brk8ZW9 ;
   private boolean brk8ZW11 ;
   private String AV18OptionsJson ;
   private String AV21OptionsDescJson ;
   private String AV23OptionIndexesJson ;
   private String AV14DDOName ;
   private String AV12SearchTxt ;
   private String AV13SearchTxtTo ;
   private String AV30FilterFullText ;
   private String AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ;
   private String lV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ;
   private String AV16Option ;
   private String AV19OptionDesc ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private int[] P08ZW8_A44AlbRecCod ;
   private String[] P08ZW8_A396EmprCod ;
   private String[] P08ZW8_A120BarAgrEst ;
   private int[] P08ZW8_A1501BarPiePie ;
   private java.math.BigDecimal[] P08ZW8_A205BarPieMet ;
   private java.math.BigDecimal[] P08ZW8_A203BarPieKil ;
   private String[] P08ZW8_A1234BarNomCli ;
   private int[] P08ZW8_A136BarColNum ;
   private String[] P08ZW8_A135BarColNom ;
   private String[] P08ZW8_A1652BarSerDsc ;
   private String[] P08ZW8_A212BarSer ;
   private String[] P08ZW8_A13696BarNHdr ;
   private java.util.Date[] P08ZW8_A156BarFecCum ;
   private boolean[] P08ZW8_n156BarFecCum ;
   private String[] P08ZW8_A151BarFasCod ;
   private boolean[] P08ZW8_n151BarFasCod ;
   private int[] P08ZW8_A129BarCod ;
   private byte[] P08ZW8_A132BarCodReo ;
   private String[] P08ZW8_A130BarCodPar ;
   private String[] P08ZW8_A200BarPieCod ;
   private String[] P08ZW15_A396EmprCod ;
   private int[] P08ZW15_A44AlbRecCod ;
   private String[] P08ZW15_A212BarSer ;
   private String[] P08ZW15_A120BarAgrEst ;
   private int[] P08ZW15_A1501BarPiePie ;
   private java.math.BigDecimal[] P08ZW15_A205BarPieMet ;
   private java.math.BigDecimal[] P08ZW15_A203BarPieKil ;
   private String[] P08ZW15_A1234BarNomCli ;
   private int[] P08ZW15_A136BarColNum ;
   private String[] P08ZW15_A135BarColNom ;
   private String[] P08ZW15_A1652BarSerDsc ;
   private String[] P08ZW15_A13696BarNHdr ;
   private java.util.Date[] P08ZW15_A156BarFecCum ;
   private boolean[] P08ZW15_n156BarFecCum ;
   private String[] P08ZW15_A151BarFasCod ;
   private boolean[] P08ZW15_n151BarFasCod ;
   private int[] P08ZW15_A129BarCod ;
   private byte[] P08ZW15_A132BarCodReo ;
   private String[] P08ZW15_A130BarCodPar ;
   private String[] P08ZW15_A200BarPieCod ;
   private String[] P08ZW22_A396EmprCod ;
   private int[] P08ZW22_A44AlbRecCod ;
   private String[] P08ZW22_A1652BarSerDsc ;
   private String[] P08ZW22_A120BarAgrEst ;
   private int[] P08ZW22_A1501BarPiePie ;
   private java.math.BigDecimal[] P08ZW22_A205BarPieMet ;
   private java.math.BigDecimal[] P08ZW22_A203BarPieKil ;
   private String[] P08ZW22_A1234BarNomCli ;
   private int[] P08ZW22_A136BarColNum ;
   private String[] P08ZW22_A135BarColNom ;
   private String[] P08ZW22_A212BarSer ;
   private String[] P08ZW22_A13696BarNHdr ;
   private java.util.Date[] P08ZW22_A156BarFecCum ;
   private boolean[] P08ZW22_n156BarFecCum ;
   private String[] P08ZW22_A151BarFasCod ;
   private boolean[] P08ZW22_n151BarFasCod ;
   private int[] P08ZW22_A129BarCod ;
   private byte[] P08ZW22_A132BarCodReo ;
   private String[] P08ZW22_A130BarCodPar ;
   private String[] P08ZW22_A200BarPieCod ;
   private String[] P08ZW29_A396EmprCod ;
   private int[] P08ZW29_A44AlbRecCod ;
   private String[] P08ZW29_A135BarColNom ;
   private String[] P08ZW29_A120BarAgrEst ;
   private int[] P08ZW29_A1501BarPiePie ;
   private java.math.BigDecimal[] P08ZW29_A205BarPieMet ;
   private java.math.BigDecimal[] P08ZW29_A203BarPieKil ;
   private String[] P08ZW29_A1234BarNomCli ;
   private int[] P08ZW29_A136BarColNum ;
   private String[] P08ZW29_A1652BarSerDsc ;
   private String[] P08ZW29_A212BarSer ;
   private String[] P08ZW29_A13696BarNHdr ;
   private java.util.Date[] P08ZW29_A156BarFecCum ;
   private boolean[] P08ZW29_n156BarFecCum ;
   private String[] P08ZW29_A151BarFasCod ;
   private boolean[] P08ZW29_n151BarFasCod ;
   private int[] P08ZW29_A129BarCod ;
   private byte[] P08ZW29_A132BarCodReo ;
   private String[] P08ZW29_A130BarCodPar ;
   private String[] P08ZW29_A200BarPieCod ;
   private String[] P08ZW36_A396EmprCod ;
   private int[] P08ZW36_A44AlbRecCod ;
   private String[] P08ZW36_A1234BarNomCli ;
   private String[] P08ZW36_A120BarAgrEst ;
   private int[] P08ZW36_A1501BarPiePie ;
   private java.math.BigDecimal[] P08ZW36_A205BarPieMet ;
   private java.math.BigDecimal[] P08ZW36_A203BarPieKil ;
   private int[] P08ZW36_A136BarColNum ;
   private String[] P08ZW36_A135BarColNom ;
   private String[] P08ZW36_A1652BarSerDsc ;
   private String[] P08ZW36_A212BarSer ;
   private String[] P08ZW36_A13696BarNHdr ;
   private java.util.Date[] P08ZW36_A156BarFecCum ;
   private boolean[] P08ZW36_n156BarFecCum ;
   private String[] P08ZW36_A151BarFasCod ;
   private boolean[] P08ZW36_n151BarFasCod ;
   private int[] P08ZW36_A129BarCod ;
   private byte[] P08ZW36_A132BarCodReo ;
   private String[] P08ZW36_A130BarCodPar ;
   private String[] P08ZW36_A200BarPieCod ;
   private String[] P08ZW43_A396EmprCod ;
   private int[] P08ZW43_A44AlbRecCod ;
   private String[] P08ZW43_A120BarAgrEst ;
   private int[] P08ZW43_A1501BarPiePie ;
   private java.math.BigDecimal[] P08ZW43_A205BarPieMet ;
   private java.math.BigDecimal[] P08ZW43_A203BarPieKil ;
   private String[] P08ZW43_A1234BarNomCli ;
   private int[] P08ZW43_A136BarColNum ;
   private String[] P08ZW43_A135BarColNom ;
   private String[] P08ZW43_A1652BarSerDsc ;
   private String[] P08ZW43_A212BarSer ;
   private String[] P08ZW43_A13696BarNHdr ;
   private java.util.Date[] P08ZW43_A156BarFecCum ;
   private boolean[] P08ZW43_n156BarFecCum ;
   private String[] P08ZW43_A151BarFasCod ;
   private boolean[] P08ZW43_n151BarFasCod ;
   private int[] P08ZW43_A129BarCod ;
   private byte[] P08ZW43_A132BarCodReo ;
   private String[] P08ZW43_A130BarCodPar ;
   private String[] P08ZW43_A200BarPieCod ;
   private int[] P08ZW50_A44AlbRecCod ;
   private String[] P08ZW50_A396EmprCod ;
   private String[] P08ZW50_A120BarAgrEst ;
   private int[] P08ZW50_A1501BarPiePie ;
   private java.math.BigDecimal[] P08ZW50_A205BarPieMet ;
   private java.math.BigDecimal[] P08ZW50_A203BarPieKil ;
   private String[] P08ZW50_A1234BarNomCli ;
   private int[] P08ZW50_A136BarColNum ;
   private String[] P08ZW50_A135BarColNom ;
   private String[] P08ZW50_A1652BarSerDsc ;
   private String[] P08ZW50_A212BarSer ;
   private String[] P08ZW50_A13696BarNHdr ;
   private java.util.Date[] P08ZW50_A156BarFecCum ;
   private boolean[] P08ZW50_n156BarFecCum ;
   private String[] P08ZW50_A151BarFasCod ;
   private boolean[] P08ZW50_n151BarFasCod ;
   private int[] P08ZW50_A129BarCod ;
   private byte[] P08ZW50_A132BarCodReo ;
   private String[] P08ZW50_A130BarCodPar ;
   private String[] P08ZW50_A200BarPieCod ;
   private GXSimpleCollection<String> AV17Options ;
   private GXSimpleCollection<String> AV20OptionsDesc ;
   private GXSimpleCollection<String> AV22OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV27GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV28GridStateFilterValue ;
}

final  class wcconsultaalmacentejidoencrudo_producciongetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZW8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                          String AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                          String AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                          String AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                          String AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                          String AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                          String AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                          String AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                          int AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum ,
                                          int AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to ,
                                          String AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                          String AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                          java.math.BigDecimal AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                          java.math.BigDecimal AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                          java.math.BigDecimal AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                          java.math.BigDecimal AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                          int AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie ,
                                          int AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to ,
                                          String AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                          String AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                          String AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A151BarFasCod ,
                                          String AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                          String AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                          java.util.Date AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                          java.util.Date A156BarFecCum ,
                                          java.util.Date AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                          String AV31Emprcod ,
                                          int AV32ALbrecCod ,
                                          String A396EmprCod ,
                                          int A44AlbRecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[43];
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
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      if ( (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08ZW15( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           String AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           String AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           String AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           String AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           String AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           String AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           String AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           int AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum ,
                                           int AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to ,
                                           String AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           String AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           int AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie ,
                                           int AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to ,
                                           String AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           String AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           String AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           String AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           java.util.Date AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           String A396EmprCod ,
                                           String AV31Emprcod ,
                                           int A44AlbRecCod ,
                                           int AV32ALbrecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[43];
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
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int4[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int4[30] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSer" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08ZW22( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           String AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           String AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           String AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           String AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           String AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           String AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           String AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           int AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum ,
                                           int AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to ,
                                           String AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           String AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           int AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie ,
                                           int AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to ,
                                           String AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           String AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           String AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           String AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           java.util.Date AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           String A396EmprCod ,
                                           String AV31Emprcod ,
                                           int A44AlbRecCod ,
                                           int AV32ALbrecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[43];
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
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarSerDsc" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08ZW29( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           String AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           String AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           String AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           String AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           String AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           String AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           String AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           int AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum ,
                                           int AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to ,
                                           String AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           String AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           int AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie ,
                                           int AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to ,
                                           String AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           String AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           String AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           String AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           java.util.Date AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           String A396EmprCod ,
                                           String AV31Emprcod ,
                                           int A44AlbRecCod ,
                                           int AV32ALbrecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[43];
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
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarColNom" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08ZW36( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           String AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           String AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           String AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           String AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           String AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           String AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           String AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           int AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum ,
                                           int AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to ,
                                           String AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           String AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           int AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie ,
                                           int AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to ,
                                           String AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           String AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           String AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           String AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           java.util.Date AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           String A396EmprCod ,
                                           String AV31Emprcod ,
                                           int A44AlbRecCod ,
                                           int AV32ALbrecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[43];
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
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarNomCli" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08ZW43( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           String AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           String AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           String AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           String AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           String AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           String AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           String AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           int AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum ,
                                           int AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to ,
                                           String AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           String AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           int AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie ,
                                           int AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to ,
                                           String AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           String AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           String AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           String AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           java.util.Date AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           String A396EmprCod ,
                                           String AV31Emprcod ,
                                           int A44AlbRecCod ,
                                           int AV32ALbrecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[43];
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
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      if ( (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int12[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int12[30] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.BarAgrEst" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08ZW50( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel ,
                                           String AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr ,
                                           String AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel ,
                                           String AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser ,
                                           String AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel ,
                                           String AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc ,
                                           String AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel ,
                                           String AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom ,
                                           int AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum ,
                                           int AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to ,
                                           String AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel ,
                                           String AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli ,
                                           java.math.BigDecimal AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil ,
                                           java.math.BigDecimal AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to ,
                                           java.math.BigDecimal AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet ,
                                           java.math.BigDecimal AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to ,
                                           int AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie ,
                                           int AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to ,
                                           String AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel ,
                                           String AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest ,
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
                                           String AV61Wcconsultaalmacentejidoencrudo_produccionds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           String AV83Wcconsultaalmacentejidoencrudo_produccionds_23_tfbarfascod_sel ,
                                           String AV82Wcconsultaalmacentejidoencrudo_produccionds_22_tfbarfascod ,
                                           java.util.Date AV84Wcconsultaalmacentejidoencrudo_produccionds_24_tfbarfeccum ,
                                           java.util.Date A156BarFecCum ,
                                           java.util.Date AV85Wcconsultaalmacentejidoencrudo_produccionds_25_tfbarfeccum_to ,
                                           String AV31Emprcod ,
                                           int AV32ALbrecCod ,
                                           String A396EmprCod ,
                                           int A44AlbRecCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[43];
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
      addWhere(sWhereString, "((? = TO_DATE('0001-01-01', 'YYYY-MM-DD')) or ( COALESCE( T3.BarFecCum, TO_DATE('0001-01-01', 'YYYY-MM-DD')) <= ?))");
      if ( (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV62Wcconsultaalmacentejidoencrudo_produccionds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Wcconsultaalmacentejidoencrudo_produccionds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV64Wcconsultaalmacentejidoencrudo_produccionds_4_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Wcconsultaalmacentejidoencrudo_produccionds_5_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Wcconsultaalmacentejidoencrudo_produccionds_6_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Wcconsultaalmacentejidoencrudo_produccionds_7_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Wcconsultaalmacentejidoencrudo_produccionds_8_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Wcconsultaalmacentejidoencrudo_produccionds_9_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV70Wcconsultaalmacentejidoencrudo_produccionds_10_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV71Wcconsultaalmacentejidoencrudo_produccionds_11_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Wcconsultaalmacentejidoencrudo_produccionds_12_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Wcconsultaalmacentejidoencrudo_produccionds_13_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Wcconsultaalmacentejidoencrudo_produccionds_14_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Wcconsultaalmacentejidoencrudo_produccionds_15_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Wcconsultaalmacentejidoencrudo_produccionds_16_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Wcconsultaalmacentejidoencrudo_produccionds_17_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (0==AV78Wcconsultaalmacentejidoencrudo_produccionds_18_tfbarpiepie) )
      {
         addWhere(sWhereString, "(T1.BarPiePie >= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (0==AV79Wcconsultaalmacentejidoencrudo_produccionds_19_tfbarpiepie_to) )
      {
         addWhere(sWhereString, "(T1.BarPiePie <= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultaalmacentejidoencrudo_produccionds_20_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultaalmacentejidoencrudo_produccionds_21_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarAgrEst = ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
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
                  return conditional_P08ZW8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() );
            case 1 :
                  return conditional_P08ZW15(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() );
            case 2 :
                  return conditional_P08ZW22(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() );
            case 3 :
                  return conditional_P08ZW29(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() );
            case 4 :
                  return conditional_P08ZW36(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() );
            case 5 :
                  return conditional_P08ZW43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() );
            case 6 :
                  return conditional_P08ZW50(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZW8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZW15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZW22", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZW29", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZW36", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZW43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08ZW50", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 11);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 11);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 11);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 11);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 11);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[60]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 11);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 11);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 1);
               }
               return;
      }
   }

}

