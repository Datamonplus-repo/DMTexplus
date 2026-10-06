package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwtrarecgetfilterdata extends GXProcedure
{
   public webwtrarecgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwtrarecgetfilterdata.class ), "" );
   }

   public webwtrarecgetfilterdata( int remoteHandle ,
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
      webwtrarecgetfilterdata.this.aP5 = new String[] {""};
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
      webwtrarecgetfilterdata.this.AV16DDOName = aP0;
      webwtrarecgetfilterdata.this.AV14SearchTxt = aP1;
      webwtrarecgetfilterdata.this.AV15SearchTxtTo = aP2;
      webwtrarecgetfilterdata.this.aP3 = aP3;
      webwtrarecgetfilterdata.this.aP4 = aP4;
      webwtrarecgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_MAQCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADMAQCODOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARAGREST") == 0 )
      {
         /* Execute user subroutine: 'LOADBARAGRESTOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_BARNOMCLI") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_RECNUMPRG") == 0 )
      {
         /* Execute user subroutine: 'LOADRECNUMPRGOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_RECUSRCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADRECUSRCODOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV16DDOName), "DDO_RECUSRMOD") == 0 )
      {
         /* Execute user subroutine: 'LOADRECUSRMODOPTIONS' */
         S211 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV20OptionsJson = AV19Options.toJSonString(false) ;
      AV23OptionsDescJson = AV22OptionsDesc.toJSonString(false) ;
      AV25OptionIndexesJson = AV24OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV27Session.getValue("WebWtrarecGridState"), "") == 0 )
      {
         AV29GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWtrarecGridState"), null, null);
      }
      else
      {
         AV29GridState.fromxml(AV27Session.getValue("WebWtrarecGridState"), null, null);
      }
      AV71GXV1 = 1 ;
      while ( AV71GXV1 <= AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV30GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV29GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV1));
         if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV68FilterFullText = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV12TFRecLinMaq = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFRecLinMaq_To = (short)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV32TFMaqCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV33TFMaqCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV50TFBarAgrEst = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV51TFBarAgrEst_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV52TFBarSer = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV53TFBarSer_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV54TFBarSerDsc = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV55TFBarSerDsc_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV56TFBarColNom = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV57TFBarColNom_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV58TFBarNomCli = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV59TFBarNomCli_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGM") == 0 )
         {
            AV34TFRecTotKgm = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFRecTotKgm_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTMTR") == 0 )
         {
            AV36TFRecTotMtr = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFRecTotMtr_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFA") == 0 )
         {
            AV42TFRecFA = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFRecFA_To = CommonUtil.decimalVal( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECNUMPRG") == 0 )
         {
            AV44TFRecNumPrg = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECNUMPRG_SEL") == 0 )
         {
            AV45TFRecNumPrg_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV40TFRecVolPrd = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFRecVolPrd_To = (int)(GXutil.lval( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV60TFRecFecAlt = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV61TFRecFecAlt_To = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRCOD") == 0 )
         {
            AV62TFRecUsrCod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRCOD_SEL") == 0 )
         {
            AV63TFRecUsrCod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECMOD") == 0 )
         {
            AV64TFRecFecMod = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV65TFRecFecMod_To = localUtil.ctot( AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRMOD") == 0 )
         {
            AV66TFRecUsrMod = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECUSRMOD_SEL") == 0 )
         {
            AV67TFRecUsrMod_Sel = AV30GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV71GXV1 = (int)(AV71GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV14SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV73Webwtrarecds_1_filterfulltext = AV68FilterFullText ;
      AV74Webwtrarecds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Webwtrarecds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Webwtrarecds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Webwtrarecds_6_tfmaqcod = AV32TFMaqCod ;
      AV79Webwtrarecds_7_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV80Webwtrarecds_8_tfbaragrest = AV50TFBarAgrEst ;
      AV81Webwtrarecds_9_tfbaragrest_sel = AV51TFBarAgrEst_Sel ;
      AV82Webwtrarecds_10_tfbarser = AV52TFBarSer ;
      AV83Webwtrarecds_11_tfbarser_sel = AV53TFBarSer_Sel ;
      AV84Webwtrarecds_12_tfbarserdsc = AV54TFBarSerDsc ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = AV55TFBarSerDsc_Sel ;
      AV86Webwtrarecds_14_tfbarcolnom = AV56TFBarColNom ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = AV57TFBarColNom_Sel ;
      AV88Webwtrarecds_16_tfbarnomcli = AV58TFBarNomCli ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV90Webwtrarecds_18_tfrectotkgm = AV34TFRecTotKgm ;
      AV91Webwtrarecds_19_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV92Webwtrarecds_20_tfrectotmtr = AV36TFRecTotMtr ;
      AV93Webwtrarecds_21_tfrectotmtr_to = AV37TFRecTotMtr_To ;
      AV94Webwtrarecds_22_tfrecfa = AV42TFRecFA ;
      AV95Webwtrarecds_23_tfrecfa_to = AV43TFRecFA_To ;
      AV96Webwtrarecds_24_tfrecnumprg = AV44TFRecNumPrg ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = AV45TFRecNumPrg_Sel ;
      AV98Webwtrarecds_26_tfrecvolprd = AV40TFRecVolPrd ;
      AV99Webwtrarecds_27_tfrecvolprd_to = AV41TFRecVolPrd_To ;
      AV100Webwtrarecds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV101Webwtrarecds_29_tfrecfecalt_to = AV61TFRecFecAlt_To ;
      AV102Webwtrarecds_30_tfrecusrcod = AV62TFRecUsrCod ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = AV63TFRecUsrCod_Sel ;
      AV104Webwtrarecds_32_tfrecfecmod = AV64TFRecFecMod ;
      AV105Webwtrarecds_33_tfrecfecmod_to = AV65TFRecFecMod_To ;
      AV106Webwtrarecds_34_tfrecusrmod = AV66TFRecUsrMod ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = AV67TFRecUsrMod_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           AV74Webwtrarecds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Webwtrarecds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Webwtrarecds_5_tfreclinmaq_to) ,
                                           AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           AV78Webwtrarecds_6_tfmaqcod ,
                                           AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           AV80Webwtrarecds_8_tfbaragrest ,
                                           AV83Webwtrarecds_11_tfbarser_sel ,
                                           AV82Webwtrarecds_10_tfbarser ,
                                           AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           AV84Webwtrarecds_12_tfbarserdsc ,
                                           AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           AV86Webwtrarecds_14_tfbarcolnom ,
                                           AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           AV88Webwtrarecds_16_tfbarnomcli ,
                                           AV94Webwtrarecds_22_tfrecfa ,
                                           AV95Webwtrarecds_23_tfrecfa_to ,
                                           AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           AV96Webwtrarecds_24_tfrecnumprg ,
                                           Integer.valueOf(AV98Webwtrarecds_26_tfrecvolprd) ,
                                           Integer.valueOf(AV99Webwtrarecds_27_tfrecvolprd_to) ,
                                           AV100Webwtrarecds_28_tfrecfecalt ,
                                           AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           AV102Webwtrarecds_30_tfrecusrcod ,
                                           AV104Webwtrarecds_32_tfrecfecmod ,
                                           AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           AV106Webwtrarecds_34_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A2806RecFA ,
                                           A5110RecNumPrg ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV73Webwtrarecds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           A871RecTotMtr ,
                                           AV90Webwtrarecds_18_tfrectotkgm ,
                                           AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           AV92Webwtrarecds_20_tfrectotmtr ,
                                           AV93Webwtrarecds_21_tfrectotmtr_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV74Webwtrarecds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Webwtrarecds_2_tfbarnhdr), 11, "%") ;
      lV80Webwtrarecds_8_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Webwtrarecds_8_tfbaragrest), 1, "%") ;
      lV82Webwtrarecds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV82Webwtrarecds_10_tfbarser), 16, "%") ;
      lV84Webwtrarecds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Webwtrarecds_12_tfbarserdsc), 26, "%") ;
      lV86Webwtrarecds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV86Webwtrarecds_14_tfbarcolnom), 13, "%") ;
      lV88Webwtrarecds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV88Webwtrarecds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P08RZ7 */
      pr_default.execute(0, new Object[] {AV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, Short.valueOf(A2804RecLinMaq), lV73Webwtrarecds_1_filterfulltext, A602MaqCod, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, A2806RecFA, lV73Webwtrarecds_1_filterfulltext, A5110RecNumPrg, lV73Webwtrarecds_1_filterfulltext, Integer.valueOf(A2805RecVolPrd), lV73Webwtrarecds_1_filterfulltext, A4402RecUsrCod, lV73Webwtrarecds_1_filterfulltext, A4868RecUsrMod, lV73Webwtrarecds_1_filterfulltext, AV90Webwtrarecds_18_tfrectotkgm, AV90Webwtrarecds_18_tfrectotkgm, AV91Webwtrarecds_19_tfrectotkgm_to, AV91Webwtrarecds_19_tfrectotkgm_to, AV92Webwtrarecds_20_tfrectotmtr, AV92Webwtrarecds_20_tfrectotmtr, AV93Webwtrarecds_21_tfrectotmtr_to, AV93Webwtrarecds_21_tfrectotmtr_to, lV74Webwtrarecds_2_tfbarnhdr, AV75Webwtrarecds_3_tfbarnhdr_sel, lV80Webwtrarecds_8_tfbaragrest, AV81Webwtrarecds_9_tfbaragrest_sel, lV82Webwtrarecds_10_tfbarser, AV83Webwtrarecds_11_tfbarser_sel, lV84Webwtrarecds_12_tfbarserdsc, AV85Webwtrarecds_13_tfbarserdsc_sel, lV86Webwtrarecds_14_tfbarcolnom, AV87Webwtrarecds_15_tfbarcolnom_sel, lV88Webwtrarecds_16_tfbarnomcli, AV89Webwtrarecds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08RZ7_A396EmprCod[0] ;
         A1234BarNomCli = P08RZ7_A1234BarNomCli[0] ;
         A135BarColNom = P08RZ7_A135BarColNom[0] ;
         A1652BarSerDsc = P08RZ7_A1652BarSerDsc[0] ;
         A212BarSer = P08RZ7_A212BarSer[0] ;
         A120BarAgrEst = P08RZ7_A120BarAgrEst[0] ;
         A13696BarNHdr = P08RZ7_A13696BarNHdr[0] ;
         A871RecTotMtr = P08RZ7_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ7_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ7_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ7_n812RecTotKgm[0] ;
         A129BarCod = P08RZ7_A129BarCod[0] ;
         A132BarCodReo = P08RZ7_A132BarCodReo[0] ;
         A130BarCodPar = P08RZ7_A130BarCodPar[0] ;
         A871RecTotMtr = P08RZ7_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ7_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ7_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ7_n812RecTotKgm[0] ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV18Option = A13696BarNHdr ;
            AV17InsertIndex = 1 ;
            while ( ( AV17InsertIndex <= AV19Options.size() ) && ( GXutil.strcmp((String)AV19Options.elementAt(-1+AV17InsertIndex), AV18Option) < 0 ) )
            {
               AV17InsertIndex = (int)(AV17InsertIndex+1) ;
            }
            if ( ( AV17InsertIndex <= AV19Options.size() ) && ( GXutil.strcmp((String)AV19Options.elementAt(-1+AV17InsertIndex), AV18Option) == 0 ) )
            {
               AV26count = GXutil.lval( (String)AV24OptionIndexes.elementAt(-1+AV17InsertIndex)) ;
               AV26count = (long)(AV26count+1) ;
               AV24OptionIndexes.removeItem(AV17InsertIndex);
               AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), AV17InsertIndex);
            }
            else
            {
               AV19Options.add(AV18Option, AV17InsertIndex);
               AV24OptionIndexes.add("1", AV17InsertIndex);
            }
         }
         if ( AV19Options.size() == 50 )
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
      /* 'LOADMAQCODOPTIONS' Routine */
      returnInSub = false ;
      AV32TFMaqCod = AV14SearchTxt ;
      AV33TFMaqCod_Sel = "" ;
      AV73Webwtrarecds_1_filterfulltext = AV68FilterFullText ;
      AV74Webwtrarecds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Webwtrarecds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Webwtrarecds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Webwtrarecds_6_tfmaqcod = AV32TFMaqCod ;
      AV79Webwtrarecds_7_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV80Webwtrarecds_8_tfbaragrest = AV50TFBarAgrEst ;
      AV81Webwtrarecds_9_tfbaragrest_sel = AV51TFBarAgrEst_Sel ;
      AV82Webwtrarecds_10_tfbarser = AV52TFBarSer ;
      AV83Webwtrarecds_11_tfbarser_sel = AV53TFBarSer_Sel ;
      AV84Webwtrarecds_12_tfbarserdsc = AV54TFBarSerDsc ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = AV55TFBarSerDsc_Sel ;
      AV86Webwtrarecds_14_tfbarcolnom = AV56TFBarColNom ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = AV57TFBarColNom_Sel ;
      AV88Webwtrarecds_16_tfbarnomcli = AV58TFBarNomCli ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV90Webwtrarecds_18_tfrectotkgm = AV34TFRecTotKgm ;
      AV91Webwtrarecds_19_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV92Webwtrarecds_20_tfrectotmtr = AV36TFRecTotMtr ;
      AV93Webwtrarecds_21_tfrectotmtr_to = AV37TFRecTotMtr_To ;
      AV94Webwtrarecds_22_tfrecfa = AV42TFRecFA ;
      AV95Webwtrarecds_23_tfrecfa_to = AV43TFRecFA_To ;
      AV96Webwtrarecds_24_tfrecnumprg = AV44TFRecNumPrg ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = AV45TFRecNumPrg_Sel ;
      AV98Webwtrarecds_26_tfrecvolprd = AV40TFRecVolPrd ;
      AV99Webwtrarecds_27_tfrecvolprd_to = AV41TFRecVolPrd_To ;
      AV100Webwtrarecds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV101Webwtrarecds_29_tfrecfecalt_to = AV61TFRecFecAlt_To ;
      AV102Webwtrarecds_30_tfrecusrcod = AV62TFRecUsrCod ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = AV63TFRecUsrCod_Sel ;
      AV104Webwtrarecds_32_tfrecfecmod = AV64TFRecFecMod ;
      AV105Webwtrarecds_33_tfrecfecmod_to = AV65TFRecFecMod_To ;
      AV106Webwtrarecds_34_tfrecusrmod = AV66TFRecUsrMod ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = AV67TFRecUsrMod_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           AV74Webwtrarecds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Webwtrarecds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Webwtrarecds_5_tfreclinmaq_to) ,
                                           AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           AV78Webwtrarecds_6_tfmaqcod ,
                                           AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           AV80Webwtrarecds_8_tfbaragrest ,
                                           AV83Webwtrarecds_11_tfbarser_sel ,
                                           AV82Webwtrarecds_10_tfbarser ,
                                           AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           AV84Webwtrarecds_12_tfbarserdsc ,
                                           AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           AV86Webwtrarecds_14_tfbarcolnom ,
                                           AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           AV88Webwtrarecds_16_tfbarnomcli ,
                                           AV94Webwtrarecds_22_tfrecfa ,
                                           AV95Webwtrarecds_23_tfrecfa_to ,
                                           AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           AV96Webwtrarecds_24_tfrecnumprg ,
                                           Integer.valueOf(AV98Webwtrarecds_26_tfrecvolprd) ,
                                           Integer.valueOf(AV99Webwtrarecds_27_tfrecvolprd_to) ,
                                           AV100Webwtrarecds_28_tfrecfecalt ,
                                           AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           AV102Webwtrarecds_30_tfrecusrcod ,
                                           AV104Webwtrarecds_32_tfrecfecmod ,
                                           AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           AV106Webwtrarecds_34_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A2806RecFA ,
                                           A5110RecNumPrg ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV73Webwtrarecds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           A871RecTotMtr ,
                                           AV90Webwtrarecds_18_tfrectotkgm ,
                                           AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           AV92Webwtrarecds_20_tfrectotmtr ,
                                           AV93Webwtrarecds_21_tfrectotmtr_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV74Webwtrarecds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Webwtrarecds_2_tfbarnhdr), 11, "%") ;
      lV80Webwtrarecds_8_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Webwtrarecds_8_tfbaragrest), 1, "%") ;
      lV82Webwtrarecds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV82Webwtrarecds_10_tfbarser), 16, "%") ;
      lV84Webwtrarecds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Webwtrarecds_12_tfbarserdsc), 26, "%") ;
      lV86Webwtrarecds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV86Webwtrarecds_14_tfbarcolnom), 13, "%") ;
      lV88Webwtrarecds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV88Webwtrarecds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P08RZ13 */
      pr_default.execute(1, new Object[] {AV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, Short.valueOf(A2804RecLinMaq), lV73Webwtrarecds_1_filterfulltext, A602MaqCod, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, A2806RecFA, lV73Webwtrarecds_1_filterfulltext, A5110RecNumPrg, lV73Webwtrarecds_1_filterfulltext, Integer.valueOf(A2805RecVolPrd), lV73Webwtrarecds_1_filterfulltext, A4402RecUsrCod, lV73Webwtrarecds_1_filterfulltext, A4868RecUsrMod, lV73Webwtrarecds_1_filterfulltext, AV90Webwtrarecds_18_tfrectotkgm, AV90Webwtrarecds_18_tfrectotkgm, AV91Webwtrarecds_19_tfrectotkgm_to, AV91Webwtrarecds_19_tfrectotkgm_to, AV92Webwtrarecds_20_tfrectotmtr, AV92Webwtrarecds_20_tfrectotmtr, AV93Webwtrarecds_21_tfrectotmtr_to, AV93Webwtrarecds_21_tfrectotmtr_to, lV74Webwtrarecds_2_tfbarnhdr, AV75Webwtrarecds_3_tfbarnhdr_sel, lV80Webwtrarecds_8_tfbaragrest, AV81Webwtrarecds_9_tfbaragrest_sel, lV82Webwtrarecds_10_tfbarser, AV83Webwtrarecds_11_tfbarser_sel, lV84Webwtrarecds_12_tfbarserdsc, AV85Webwtrarecds_13_tfbarserdsc_sel, lV86Webwtrarecds_14_tfbarcolnom, AV87Webwtrarecds_15_tfbarcolnom_sel, lV88Webwtrarecds_16_tfbarnomcli, AV89Webwtrarecds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8RZ3 = false ;
         A396EmprCod = P08RZ13_A396EmprCod[0] ;
         A1234BarNomCli = P08RZ13_A1234BarNomCli[0] ;
         A135BarColNom = P08RZ13_A135BarColNom[0] ;
         A1652BarSerDsc = P08RZ13_A1652BarSerDsc[0] ;
         A212BarSer = P08RZ13_A212BarSer[0] ;
         A120BarAgrEst = P08RZ13_A120BarAgrEst[0] ;
         A13696BarNHdr = P08RZ13_A13696BarNHdr[0] ;
         A871RecTotMtr = P08RZ13_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ13_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ13_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ13_n812RecTotKgm[0] ;
         A129BarCod = P08RZ13_A129BarCod[0] ;
         A132BarCodReo = P08RZ13_A132BarCodReo[0] ;
         A130BarCodPar = P08RZ13_A130BarCodPar[0] ;
         A871RecTotMtr = P08RZ13_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ13_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ13_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ13_n812RecTotKgm[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(1) != 101) )
         {
            brk8RZ3 = false ;
            A396EmprCod = P08RZ13_A396EmprCod[0] ;
            A129BarCod = P08RZ13_A129BarCod[0] ;
            A132BarCodReo = P08RZ13_A132BarCodReo[0] ;
            A130BarCodPar = P08RZ13_A130BarCodPar[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8RZ3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A602MaqCod)==0) )
         {
            AV18Option = A602MaqCod ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RZ3 )
         {
            brk8RZ3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARAGRESTOPTIONS' Routine */
      returnInSub = false ;
      AV50TFBarAgrEst = AV14SearchTxt ;
      AV51TFBarAgrEst_Sel = "" ;
      AV73Webwtrarecds_1_filterfulltext = AV68FilterFullText ;
      AV74Webwtrarecds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Webwtrarecds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Webwtrarecds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Webwtrarecds_6_tfmaqcod = AV32TFMaqCod ;
      AV79Webwtrarecds_7_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV80Webwtrarecds_8_tfbaragrest = AV50TFBarAgrEst ;
      AV81Webwtrarecds_9_tfbaragrest_sel = AV51TFBarAgrEst_Sel ;
      AV82Webwtrarecds_10_tfbarser = AV52TFBarSer ;
      AV83Webwtrarecds_11_tfbarser_sel = AV53TFBarSer_Sel ;
      AV84Webwtrarecds_12_tfbarserdsc = AV54TFBarSerDsc ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = AV55TFBarSerDsc_Sel ;
      AV86Webwtrarecds_14_tfbarcolnom = AV56TFBarColNom ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = AV57TFBarColNom_Sel ;
      AV88Webwtrarecds_16_tfbarnomcli = AV58TFBarNomCli ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV90Webwtrarecds_18_tfrectotkgm = AV34TFRecTotKgm ;
      AV91Webwtrarecds_19_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV92Webwtrarecds_20_tfrectotmtr = AV36TFRecTotMtr ;
      AV93Webwtrarecds_21_tfrectotmtr_to = AV37TFRecTotMtr_To ;
      AV94Webwtrarecds_22_tfrecfa = AV42TFRecFA ;
      AV95Webwtrarecds_23_tfrecfa_to = AV43TFRecFA_To ;
      AV96Webwtrarecds_24_tfrecnumprg = AV44TFRecNumPrg ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = AV45TFRecNumPrg_Sel ;
      AV98Webwtrarecds_26_tfrecvolprd = AV40TFRecVolPrd ;
      AV99Webwtrarecds_27_tfrecvolprd_to = AV41TFRecVolPrd_To ;
      AV100Webwtrarecds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV101Webwtrarecds_29_tfrecfecalt_to = AV61TFRecFecAlt_To ;
      AV102Webwtrarecds_30_tfrecusrcod = AV62TFRecUsrCod ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = AV63TFRecUsrCod_Sel ;
      AV104Webwtrarecds_32_tfrecfecmod = AV64TFRecFecMod ;
      AV105Webwtrarecds_33_tfrecfecmod_to = AV65TFRecFecMod_To ;
      AV106Webwtrarecds_34_tfrecusrmod = AV66TFRecUsrMod ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = AV67TFRecUsrMod_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           AV74Webwtrarecds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Webwtrarecds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Webwtrarecds_5_tfreclinmaq_to) ,
                                           AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           AV78Webwtrarecds_6_tfmaqcod ,
                                           AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           AV80Webwtrarecds_8_tfbaragrest ,
                                           AV83Webwtrarecds_11_tfbarser_sel ,
                                           AV82Webwtrarecds_10_tfbarser ,
                                           AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           AV84Webwtrarecds_12_tfbarserdsc ,
                                           AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           AV86Webwtrarecds_14_tfbarcolnom ,
                                           AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           AV88Webwtrarecds_16_tfbarnomcli ,
                                           AV94Webwtrarecds_22_tfrecfa ,
                                           AV95Webwtrarecds_23_tfrecfa_to ,
                                           AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           AV96Webwtrarecds_24_tfrecnumprg ,
                                           Integer.valueOf(AV98Webwtrarecds_26_tfrecvolprd) ,
                                           Integer.valueOf(AV99Webwtrarecds_27_tfrecvolprd_to) ,
                                           AV100Webwtrarecds_28_tfrecfecalt ,
                                           AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           AV102Webwtrarecds_30_tfrecusrcod ,
                                           AV104Webwtrarecds_32_tfrecfecmod ,
                                           AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           AV106Webwtrarecds_34_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A2806RecFA ,
                                           A5110RecNumPrg ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV73Webwtrarecds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           A871RecTotMtr ,
                                           AV90Webwtrarecds_18_tfrectotkgm ,
                                           AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           AV92Webwtrarecds_20_tfrectotmtr ,
                                           AV93Webwtrarecds_21_tfrectotmtr_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV74Webwtrarecds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Webwtrarecds_2_tfbarnhdr), 11, "%") ;
      lV80Webwtrarecds_8_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Webwtrarecds_8_tfbaragrest), 1, "%") ;
      lV82Webwtrarecds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV82Webwtrarecds_10_tfbarser), 16, "%") ;
      lV84Webwtrarecds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Webwtrarecds_12_tfbarserdsc), 26, "%") ;
      lV86Webwtrarecds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV86Webwtrarecds_14_tfbarcolnom), 13, "%") ;
      lV88Webwtrarecds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV88Webwtrarecds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P08RZ19 */
      pr_default.execute(2, new Object[] {AV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, Short.valueOf(A2804RecLinMaq), lV73Webwtrarecds_1_filterfulltext, A602MaqCod, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, A2806RecFA, lV73Webwtrarecds_1_filterfulltext, A5110RecNumPrg, lV73Webwtrarecds_1_filterfulltext, Integer.valueOf(A2805RecVolPrd), lV73Webwtrarecds_1_filterfulltext, A4402RecUsrCod, lV73Webwtrarecds_1_filterfulltext, A4868RecUsrMod, lV73Webwtrarecds_1_filterfulltext, AV90Webwtrarecds_18_tfrectotkgm, AV90Webwtrarecds_18_tfrectotkgm, AV91Webwtrarecds_19_tfrectotkgm_to, AV91Webwtrarecds_19_tfrectotkgm_to, AV92Webwtrarecds_20_tfrectotmtr, AV92Webwtrarecds_20_tfrectotmtr, AV93Webwtrarecds_21_tfrectotmtr_to, AV93Webwtrarecds_21_tfrectotmtr_to, lV74Webwtrarecds_2_tfbarnhdr, AV75Webwtrarecds_3_tfbarnhdr_sel, lV80Webwtrarecds_8_tfbaragrest, AV81Webwtrarecds_9_tfbaragrest_sel, lV82Webwtrarecds_10_tfbarser, AV83Webwtrarecds_11_tfbarser_sel, lV84Webwtrarecds_12_tfbarserdsc, AV85Webwtrarecds_13_tfbarserdsc_sel, lV86Webwtrarecds_14_tfbarcolnom, AV87Webwtrarecds_15_tfbarcolnom_sel, lV88Webwtrarecds_16_tfbarnomcli, AV89Webwtrarecds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8RZ5 = false ;
         A396EmprCod = P08RZ19_A396EmprCod[0] ;
         A120BarAgrEst = P08RZ19_A120BarAgrEst[0] ;
         A1234BarNomCli = P08RZ19_A1234BarNomCli[0] ;
         A135BarColNom = P08RZ19_A135BarColNom[0] ;
         A1652BarSerDsc = P08RZ19_A1652BarSerDsc[0] ;
         A212BarSer = P08RZ19_A212BarSer[0] ;
         A13696BarNHdr = P08RZ19_A13696BarNHdr[0] ;
         A871RecTotMtr = P08RZ19_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ19_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ19_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ19_n812RecTotKgm[0] ;
         A129BarCod = P08RZ19_A129BarCod[0] ;
         A132BarCodReo = P08RZ19_A132BarCodReo[0] ;
         A130BarCodPar = P08RZ19_A130BarCodPar[0] ;
         A871RecTotMtr = P08RZ19_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ19_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ19_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ19_n812RecTotKgm[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08RZ19_A120BarAgrEst[0], A120BarAgrEst) == 0 ) )
         {
            brk8RZ5 = false ;
            A396EmprCod = P08RZ19_A396EmprCod[0] ;
            A129BarCod = P08RZ19_A129BarCod[0] ;
            A132BarCodReo = P08RZ19_A132BarCodReo[0] ;
            A130BarCodPar = P08RZ19_A130BarCodPar[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8RZ5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A120BarAgrEst)==0) )
         {
            AV18Option = A120BarAgrEst ;
            AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!"))) ;
            AV19Options.add(AV18Option, 0);
            AV22OptionsDesc.add(AV21OptionDesc, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RZ5 )
         {
            brk8RZ5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV52TFBarSer = AV14SearchTxt ;
      AV53TFBarSer_Sel = "" ;
      AV73Webwtrarecds_1_filterfulltext = AV68FilterFullText ;
      AV74Webwtrarecds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Webwtrarecds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Webwtrarecds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Webwtrarecds_6_tfmaqcod = AV32TFMaqCod ;
      AV79Webwtrarecds_7_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV80Webwtrarecds_8_tfbaragrest = AV50TFBarAgrEst ;
      AV81Webwtrarecds_9_tfbaragrest_sel = AV51TFBarAgrEst_Sel ;
      AV82Webwtrarecds_10_tfbarser = AV52TFBarSer ;
      AV83Webwtrarecds_11_tfbarser_sel = AV53TFBarSer_Sel ;
      AV84Webwtrarecds_12_tfbarserdsc = AV54TFBarSerDsc ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = AV55TFBarSerDsc_Sel ;
      AV86Webwtrarecds_14_tfbarcolnom = AV56TFBarColNom ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = AV57TFBarColNom_Sel ;
      AV88Webwtrarecds_16_tfbarnomcli = AV58TFBarNomCli ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV90Webwtrarecds_18_tfrectotkgm = AV34TFRecTotKgm ;
      AV91Webwtrarecds_19_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV92Webwtrarecds_20_tfrectotmtr = AV36TFRecTotMtr ;
      AV93Webwtrarecds_21_tfrectotmtr_to = AV37TFRecTotMtr_To ;
      AV94Webwtrarecds_22_tfrecfa = AV42TFRecFA ;
      AV95Webwtrarecds_23_tfrecfa_to = AV43TFRecFA_To ;
      AV96Webwtrarecds_24_tfrecnumprg = AV44TFRecNumPrg ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = AV45TFRecNumPrg_Sel ;
      AV98Webwtrarecds_26_tfrecvolprd = AV40TFRecVolPrd ;
      AV99Webwtrarecds_27_tfrecvolprd_to = AV41TFRecVolPrd_To ;
      AV100Webwtrarecds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV101Webwtrarecds_29_tfrecfecalt_to = AV61TFRecFecAlt_To ;
      AV102Webwtrarecds_30_tfrecusrcod = AV62TFRecUsrCod ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = AV63TFRecUsrCod_Sel ;
      AV104Webwtrarecds_32_tfrecfecmod = AV64TFRecFecMod ;
      AV105Webwtrarecds_33_tfrecfecmod_to = AV65TFRecFecMod_To ;
      AV106Webwtrarecds_34_tfrecusrmod = AV66TFRecUsrMod ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = AV67TFRecUsrMod_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           AV74Webwtrarecds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Webwtrarecds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Webwtrarecds_5_tfreclinmaq_to) ,
                                           AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           AV78Webwtrarecds_6_tfmaqcod ,
                                           AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           AV80Webwtrarecds_8_tfbaragrest ,
                                           AV83Webwtrarecds_11_tfbarser_sel ,
                                           AV82Webwtrarecds_10_tfbarser ,
                                           AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           AV84Webwtrarecds_12_tfbarserdsc ,
                                           AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           AV86Webwtrarecds_14_tfbarcolnom ,
                                           AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           AV88Webwtrarecds_16_tfbarnomcli ,
                                           AV94Webwtrarecds_22_tfrecfa ,
                                           AV95Webwtrarecds_23_tfrecfa_to ,
                                           AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           AV96Webwtrarecds_24_tfrecnumprg ,
                                           Integer.valueOf(AV98Webwtrarecds_26_tfrecvolprd) ,
                                           Integer.valueOf(AV99Webwtrarecds_27_tfrecvolprd_to) ,
                                           AV100Webwtrarecds_28_tfrecfecalt ,
                                           AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           AV102Webwtrarecds_30_tfrecusrcod ,
                                           AV104Webwtrarecds_32_tfrecfecmod ,
                                           AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           AV106Webwtrarecds_34_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A2806RecFA ,
                                           A5110RecNumPrg ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV73Webwtrarecds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           A871RecTotMtr ,
                                           AV90Webwtrarecds_18_tfrectotkgm ,
                                           AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           AV92Webwtrarecds_20_tfrectotmtr ,
                                           AV93Webwtrarecds_21_tfrectotmtr_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV74Webwtrarecds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Webwtrarecds_2_tfbarnhdr), 11, "%") ;
      lV80Webwtrarecds_8_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Webwtrarecds_8_tfbaragrest), 1, "%") ;
      lV82Webwtrarecds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV82Webwtrarecds_10_tfbarser), 16, "%") ;
      lV84Webwtrarecds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Webwtrarecds_12_tfbarserdsc), 26, "%") ;
      lV86Webwtrarecds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV86Webwtrarecds_14_tfbarcolnom), 13, "%") ;
      lV88Webwtrarecds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV88Webwtrarecds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P08RZ25 */
      pr_default.execute(3, new Object[] {AV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, Short.valueOf(A2804RecLinMaq), lV73Webwtrarecds_1_filterfulltext, A602MaqCod, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, A2806RecFA, lV73Webwtrarecds_1_filterfulltext, A5110RecNumPrg, lV73Webwtrarecds_1_filterfulltext, Integer.valueOf(A2805RecVolPrd), lV73Webwtrarecds_1_filterfulltext, A4402RecUsrCod, lV73Webwtrarecds_1_filterfulltext, A4868RecUsrMod, lV73Webwtrarecds_1_filterfulltext, AV90Webwtrarecds_18_tfrectotkgm, AV90Webwtrarecds_18_tfrectotkgm, AV91Webwtrarecds_19_tfrectotkgm_to, AV91Webwtrarecds_19_tfrectotkgm_to, AV92Webwtrarecds_20_tfrectotmtr, AV92Webwtrarecds_20_tfrectotmtr, AV93Webwtrarecds_21_tfrectotmtr_to, AV93Webwtrarecds_21_tfrectotmtr_to, lV74Webwtrarecds_2_tfbarnhdr, AV75Webwtrarecds_3_tfbarnhdr_sel, lV80Webwtrarecds_8_tfbaragrest, AV81Webwtrarecds_9_tfbaragrest_sel, lV82Webwtrarecds_10_tfbarser, AV83Webwtrarecds_11_tfbarser_sel, lV84Webwtrarecds_12_tfbarserdsc, AV85Webwtrarecds_13_tfbarserdsc_sel, lV86Webwtrarecds_14_tfbarcolnom, AV87Webwtrarecds_15_tfbarcolnom_sel, lV88Webwtrarecds_16_tfbarnomcli, AV89Webwtrarecds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8RZ7 = false ;
         A396EmprCod = P08RZ25_A396EmprCod[0] ;
         A212BarSer = P08RZ25_A212BarSer[0] ;
         A1234BarNomCli = P08RZ25_A1234BarNomCli[0] ;
         A135BarColNom = P08RZ25_A135BarColNom[0] ;
         A1652BarSerDsc = P08RZ25_A1652BarSerDsc[0] ;
         A120BarAgrEst = P08RZ25_A120BarAgrEst[0] ;
         A13696BarNHdr = P08RZ25_A13696BarNHdr[0] ;
         A871RecTotMtr = P08RZ25_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ25_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ25_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ25_n812RecTotKgm[0] ;
         A129BarCod = P08RZ25_A129BarCod[0] ;
         A132BarCodReo = P08RZ25_A132BarCodReo[0] ;
         A130BarCodPar = P08RZ25_A130BarCodPar[0] ;
         A871RecTotMtr = P08RZ25_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ25_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ25_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ25_n812RecTotKgm[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08RZ25_A212BarSer[0], A212BarSer) == 0 ) )
         {
            brk8RZ7 = false ;
            A396EmprCod = P08RZ25_A396EmprCod[0] ;
            A129BarCod = P08RZ25_A129BarCod[0] ;
            A132BarCodReo = P08RZ25_A132BarCodReo[0] ;
            A130BarCodPar = P08RZ25_A130BarCodPar[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8RZ7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV18Option = A212BarSer ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RZ7 )
         {
            brk8RZ7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV54TFBarSerDsc = AV14SearchTxt ;
      AV55TFBarSerDsc_Sel = "" ;
      AV73Webwtrarecds_1_filterfulltext = AV68FilterFullText ;
      AV74Webwtrarecds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Webwtrarecds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Webwtrarecds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Webwtrarecds_6_tfmaqcod = AV32TFMaqCod ;
      AV79Webwtrarecds_7_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV80Webwtrarecds_8_tfbaragrest = AV50TFBarAgrEst ;
      AV81Webwtrarecds_9_tfbaragrest_sel = AV51TFBarAgrEst_Sel ;
      AV82Webwtrarecds_10_tfbarser = AV52TFBarSer ;
      AV83Webwtrarecds_11_tfbarser_sel = AV53TFBarSer_Sel ;
      AV84Webwtrarecds_12_tfbarserdsc = AV54TFBarSerDsc ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = AV55TFBarSerDsc_Sel ;
      AV86Webwtrarecds_14_tfbarcolnom = AV56TFBarColNom ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = AV57TFBarColNom_Sel ;
      AV88Webwtrarecds_16_tfbarnomcli = AV58TFBarNomCli ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV90Webwtrarecds_18_tfrectotkgm = AV34TFRecTotKgm ;
      AV91Webwtrarecds_19_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV92Webwtrarecds_20_tfrectotmtr = AV36TFRecTotMtr ;
      AV93Webwtrarecds_21_tfrectotmtr_to = AV37TFRecTotMtr_To ;
      AV94Webwtrarecds_22_tfrecfa = AV42TFRecFA ;
      AV95Webwtrarecds_23_tfrecfa_to = AV43TFRecFA_To ;
      AV96Webwtrarecds_24_tfrecnumprg = AV44TFRecNumPrg ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = AV45TFRecNumPrg_Sel ;
      AV98Webwtrarecds_26_tfrecvolprd = AV40TFRecVolPrd ;
      AV99Webwtrarecds_27_tfrecvolprd_to = AV41TFRecVolPrd_To ;
      AV100Webwtrarecds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV101Webwtrarecds_29_tfrecfecalt_to = AV61TFRecFecAlt_To ;
      AV102Webwtrarecds_30_tfrecusrcod = AV62TFRecUsrCod ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = AV63TFRecUsrCod_Sel ;
      AV104Webwtrarecds_32_tfrecfecmod = AV64TFRecFecMod ;
      AV105Webwtrarecds_33_tfrecfecmod_to = AV65TFRecFecMod_To ;
      AV106Webwtrarecds_34_tfrecusrmod = AV66TFRecUsrMod ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = AV67TFRecUsrMod_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           AV74Webwtrarecds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Webwtrarecds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Webwtrarecds_5_tfreclinmaq_to) ,
                                           AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           AV78Webwtrarecds_6_tfmaqcod ,
                                           AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           AV80Webwtrarecds_8_tfbaragrest ,
                                           AV83Webwtrarecds_11_tfbarser_sel ,
                                           AV82Webwtrarecds_10_tfbarser ,
                                           AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           AV84Webwtrarecds_12_tfbarserdsc ,
                                           AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           AV86Webwtrarecds_14_tfbarcolnom ,
                                           AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           AV88Webwtrarecds_16_tfbarnomcli ,
                                           AV94Webwtrarecds_22_tfrecfa ,
                                           AV95Webwtrarecds_23_tfrecfa_to ,
                                           AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           AV96Webwtrarecds_24_tfrecnumprg ,
                                           Integer.valueOf(AV98Webwtrarecds_26_tfrecvolprd) ,
                                           Integer.valueOf(AV99Webwtrarecds_27_tfrecvolprd_to) ,
                                           AV100Webwtrarecds_28_tfrecfecalt ,
                                           AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           AV102Webwtrarecds_30_tfrecusrcod ,
                                           AV104Webwtrarecds_32_tfrecfecmod ,
                                           AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           AV106Webwtrarecds_34_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A2806RecFA ,
                                           A5110RecNumPrg ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV73Webwtrarecds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           A871RecTotMtr ,
                                           AV90Webwtrarecds_18_tfrectotkgm ,
                                           AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           AV92Webwtrarecds_20_tfrectotmtr ,
                                           AV93Webwtrarecds_21_tfrectotmtr_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV74Webwtrarecds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Webwtrarecds_2_tfbarnhdr), 11, "%") ;
      lV80Webwtrarecds_8_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Webwtrarecds_8_tfbaragrest), 1, "%") ;
      lV82Webwtrarecds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV82Webwtrarecds_10_tfbarser), 16, "%") ;
      lV84Webwtrarecds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Webwtrarecds_12_tfbarserdsc), 26, "%") ;
      lV86Webwtrarecds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV86Webwtrarecds_14_tfbarcolnom), 13, "%") ;
      lV88Webwtrarecds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV88Webwtrarecds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P08RZ31 */
      pr_default.execute(4, new Object[] {AV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, Short.valueOf(A2804RecLinMaq), lV73Webwtrarecds_1_filterfulltext, A602MaqCod, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, A2806RecFA, lV73Webwtrarecds_1_filterfulltext, A5110RecNumPrg, lV73Webwtrarecds_1_filterfulltext, Integer.valueOf(A2805RecVolPrd), lV73Webwtrarecds_1_filterfulltext, A4402RecUsrCod, lV73Webwtrarecds_1_filterfulltext, A4868RecUsrMod, lV73Webwtrarecds_1_filterfulltext, AV90Webwtrarecds_18_tfrectotkgm, AV90Webwtrarecds_18_tfrectotkgm, AV91Webwtrarecds_19_tfrectotkgm_to, AV91Webwtrarecds_19_tfrectotkgm_to, AV92Webwtrarecds_20_tfrectotmtr, AV92Webwtrarecds_20_tfrectotmtr, AV93Webwtrarecds_21_tfrectotmtr_to, AV93Webwtrarecds_21_tfrectotmtr_to, lV74Webwtrarecds_2_tfbarnhdr, AV75Webwtrarecds_3_tfbarnhdr_sel, lV80Webwtrarecds_8_tfbaragrest, AV81Webwtrarecds_9_tfbaragrest_sel, lV82Webwtrarecds_10_tfbarser, AV83Webwtrarecds_11_tfbarser_sel, lV84Webwtrarecds_12_tfbarserdsc, AV85Webwtrarecds_13_tfbarserdsc_sel, lV86Webwtrarecds_14_tfbarcolnom, AV87Webwtrarecds_15_tfbarcolnom_sel, lV88Webwtrarecds_16_tfbarnomcli, AV89Webwtrarecds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8RZ9 = false ;
         A396EmprCod = P08RZ31_A396EmprCod[0] ;
         A1652BarSerDsc = P08RZ31_A1652BarSerDsc[0] ;
         A1234BarNomCli = P08RZ31_A1234BarNomCli[0] ;
         A135BarColNom = P08RZ31_A135BarColNom[0] ;
         A212BarSer = P08RZ31_A212BarSer[0] ;
         A120BarAgrEst = P08RZ31_A120BarAgrEst[0] ;
         A13696BarNHdr = P08RZ31_A13696BarNHdr[0] ;
         A871RecTotMtr = P08RZ31_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ31_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ31_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ31_n812RecTotKgm[0] ;
         A129BarCod = P08RZ31_A129BarCod[0] ;
         A132BarCodReo = P08RZ31_A132BarCodReo[0] ;
         A130BarCodPar = P08RZ31_A130BarCodPar[0] ;
         A871RecTotMtr = P08RZ31_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ31_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ31_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ31_n812RecTotKgm[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08RZ31_A1652BarSerDsc[0], A1652BarSerDsc) == 0 ) )
         {
            brk8RZ9 = false ;
            A396EmprCod = P08RZ31_A396EmprCod[0] ;
            A129BarCod = P08RZ31_A129BarCod[0] ;
            A132BarCodReo = P08RZ31_A132BarCodReo[0] ;
            A130BarCodPar = P08RZ31_A130BarCodPar[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8RZ9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV18Option = A1652BarSerDsc ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RZ9 )
         {
            brk8RZ9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV56TFBarColNom = AV14SearchTxt ;
      AV57TFBarColNom_Sel = "" ;
      AV73Webwtrarecds_1_filterfulltext = AV68FilterFullText ;
      AV74Webwtrarecds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Webwtrarecds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Webwtrarecds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Webwtrarecds_6_tfmaqcod = AV32TFMaqCod ;
      AV79Webwtrarecds_7_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV80Webwtrarecds_8_tfbaragrest = AV50TFBarAgrEst ;
      AV81Webwtrarecds_9_tfbaragrest_sel = AV51TFBarAgrEst_Sel ;
      AV82Webwtrarecds_10_tfbarser = AV52TFBarSer ;
      AV83Webwtrarecds_11_tfbarser_sel = AV53TFBarSer_Sel ;
      AV84Webwtrarecds_12_tfbarserdsc = AV54TFBarSerDsc ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = AV55TFBarSerDsc_Sel ;
      AV86Webwtrarecds_14_tfbarcolnom = AV56TFBarColNom ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = AV57TFBarColNom_Sel ;
      AV88Webwtrarecds_16_tfbarnomcli = AV58TFBarNomCli ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV90Webwtrarecds_18_tfrectotkgm = AV34TFRecTotKgm ;
      AV91Webwtrarecds_19_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV92Webwtrarecds_20_tfrectotmtr = AV36TFRecTotMtr ;
      AV93Webwtrarecds_21_tfrectotmtr_to = AV37TFRecTotMtr_To ;
      AV94Webwtrarecds_22_tfrecfa = AV42TFRecFA ;
      AV95Webwtrarecds_23_tfrecfa_to = AV43TFRecFA_To ;
      AV96Webwtrarecds_24_tfrecnumprg = AV44TFRecNumPrg ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = AV45TFRecNumPrg_Sel ;
      AV98Webwtrarecds_26_tfrecvolprd = AV40TFRecVolPrd ;
      AV99Webwtrarecds_27_tfrecvolprd_to = AV41TFRecVolPrd_To ;
      AV100Webwtrarecds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV101Webwtrarecds_29_tfrecfecalt_to = AV61TFRecFecAlt_To ;
      AV102Webwtrarecds_30_tfrecusrcod = AV62TFRecUsrCod ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = AV63TFRecUsrCod_Sel ;
      AV104Webwtrarecds_32_tfrecfecmod = AV64TFRecFecMod ;
      AV105Webwtrarecds_33_tfrecfecmod_to = AV65TFRecFecMod_To ;
      AV106Webwtrarecds_34_tfrecusrmod = AV66TFRecUsrMod ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = AV67TFRecUsrMod_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           AV74Webwtrarecds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Webwtrarecds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Webwtrarecds_5_tfreclinmaq_to) ,
                                           AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           AV78Webwtrarecds_6_tfmaqcod ,
                                           AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           AV80Webwtrarecds_8_tfbaragrest ,
                                           AV83Webwtrarecds_11_tfbarser_sel ,
                                           AV82Webwtrarecds_10_tfbarser ,
                                           AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           AV84Webwtrarecds_12_tfbarserdsc ,
                                           AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           AV86Webwtrarecds_14_tfbarcolnom ,
                                           AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           AV88Webwtrarecds_16_tfbarnomcli ,
                                           AV94Webwtrarecds_22_tfrecfa ,
                                           AV95Webwtrarecds_23_tfrecfa_to ,
                                           AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           AV96Webwtrarecds_24_tfrecnumprg ,
                                           Integer.valueOf(AV98Webwtrarecds_26_tfrecvolprd) ,
                                           Integer.valueOf(AV99Webwtrarecds_27_tfrecvolprd_to) ,
                                           AV100Webwtrarecds_28_tfrecfecalt ,
                                           AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           AV102Webwtrarecds_30_tfrecusrcod ,
                                           AV104Webwtrarecds_32_tfrecfecmod ,
                                           AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           AV106Webwtrarecds_34_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A2806RecFA ,
                                           A5110RecNumPrg ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV73Webwtrarecds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           A871RecTotMtr ,
                                           AV90Webwtrarecds_18_tfrectotkgm ,
                                           AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           AV92Webwtrarecds_20_tfrectotmtr ,
                                           AV93Webwtrarecds_21_tfrectotmtr_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV74Webwtrarecds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Webwtrarecds_2_tfbarnhdr), 11, "%") ;
      lV80Webwtrarecds_8_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Webwtrarecds_8_tfbaragrest), 1, "%") ;
      lV82Webwtrarecds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV82Webwtrarecds_10_tfbarser), 16, "%") ;
      lV84Webwtrarecds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Webwtrarecds_12_tfbarserdsc), 26, "%") ;
      lV86Webwtrarecds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV86Webwtrarecds_14_tfbarcolnom), 13, "%") ;
      lV88Webwtrarecds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV88Webwtrarecds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P08RZ37 */
      pr_default.execute(5, new Object[] {AV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, Short.valueOf(A2804RecLinMaq), lV73Webwtrarecds_1_filterfulltext, A602MaqCod, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, A2806RecFA, lV73Webwtrarecds_1_filterfulltext, A5110RecNumPrg, lV73Webwtrarecds_1_filterfulltext, Integer.valueOf(A2805RecVolPrd), lV73Webwtrarecds_1_filterfulltext, A4402RecUsrCod, lV73Webwtrarecds_1_filterfulltext, A4868RecUsrMod, lV73Webwtrarecds_1_filterfulltext, AV90Webwtrarecds_18_tfrectotkgm, AV90Webwtrarecds_18_tfrectotkgm, AV91Webwtrarecds_19_tfrectotkgm_to, AV91Webwtrarecds_19_tfrectotkgm_to, AV92Webwtrarecds_20_tfrectotmtr, AV92Webwtrarecds_20_tfrectotmtr, AV93Webwtrarecds_21_tfrectotmtr_to, AV93Webwtrarecds_21_tfrectotmtr_to, lV74Webwtrarecds_2_tfbarnhdr, AV75Webwtrarecds_3_tfbarnhdr_sel, lV80Webwtrarecds_8_tfbaragrest, AV81Webwtrarecds_9_tfbaragrest_sel, lV82Webwtrarecds_10_tfbarser, AV83Webwtrarecds_11_tfbarser_sel, lV84Webwtrarecds_12_tfbarserdsc, AV85Webwtrarecds_13_tfbarserdsc_sel, lV86Webwtrarecds_14_tfbarcolnom, AV87Webwtrarecds_15_tfbarcolnom_sel, lV88Webwtrarecds_16_tfbarnomcli, AV89Webwtrarecds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8RZ11 = false ;
         A396EmprCod = P08RZ37_A396EmprCod[0] ;
         A135BarColNom = P08RZ37_A135BarColNom[0] ;
         A1234BarNomCli = P08RZ37_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08RZ37_A1652BarSerDsc[0] ;
         A212BarSer = P08RZ37_A212BarSer[0] ;
         A120BarAgrEst = P08RZ37_A120BarAgrEst[0] ;
         A13696BarNHdr = P08RZ37_A13696BarNHdr[0] ;
         A871RecTotMtr = P08RZ37_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ37_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ37_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ37_n812RecTotKgm[0] ;
         A129BarCod = P08RZ37_A129BarCod[0] ;
         A132BarCodReo = P08RZ37_A132BarCodReo[0] ;
         A130BarCodPar = P08RZ37_A130BarCodPar[0] ;
         A871RecTotMtr = P08RZ37_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ37_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ37_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ37_n812RecTotKgm[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08RZ37_A135BarColNom[0], A135BarColNom) == 0 ) )
         {
            brk8RZ11 = false ;
            A396EmprCod = P08RZ37_A396EmprCod[0] ;
            A129BarCod = P08RZ37_A129BarCod[0] ;
            A132BarCodReo = P08RZ37_A132BarCodReo[0] ;
            A130BarCodPar = P08RZ37_A130BarCodPar[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8RZ11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV18Option = A135BarColNom ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RZ11 )
         {
            brk8RZ11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV58TFBarNomCli = AV14SearchTxt ;
      AV59TFBarNomCli_Sel = "" ;
      AV73Webwtrarecds_1_filterfulltext = AV68FilterFullText ;
      AV74Webwtrarecds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Webwtrarecds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Webwtrarecds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Webwtrarecds_6_tfmaqcod = AV32TFMaqCod ;
      AV79Webwtrarecds_7_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV80Webwtrarecds_8_tfbaragrest = AV50TFBarAgrEst ;
      AV81Webwtrarecds_9_tfbaragrest_sel = AV51TFBarAgrEst_Sel ;
      AV82Webwtrarecds_10_tfbarser = AV52TFBarSer ;
      AV83Webwtrarecds_11_tfbarser_sel = AV53TFBarSer_Sel ;
      AV84Webwtrarecds_12_tfbarserdsc = AV54TFBarSerDsc ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = AV55TFBarSerDsc_Sel ;
      AV86Webwtrarecds_14_tfbarcolnom = AV56TFBarColNom ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = AV57TFBarColNom_Sel ;
      AV88Webwtrarecds_16_tfbarnomcli = AV58TFBarNomCli ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV90Webwtrarecds_18_tfrectotkgm = AV34TFRecTotKgm ;
      AV91Webwtrarecds_19_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV92Webwtrarecds_20_tfrectotmtr = AV36TFRecTotMtr ;
      AV93Webwtrarecds_21_tfrectotmtr_to = AV37TFRecTotMtr_To ;
      AV94Webwtrarecds_22_tfrecfa = AV42TFRecFA ;
      AV95Webwtrarecds_23_tfrecfa_to = AV43TFRecFA_To ;
      AV96Webwtrarecds_24_tfrecnumprg = AV44TFRecNumPrg ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = AV45TFRecNumPrg_Sel ;
      AV98Webwtrarecds_26_tfrecvolprd = AV40TFRecVolPrd ;
      AV99Webwtrarecds_27_tfrecvolprd_to = AV41TFRecVolPrd_To ;
      AV100Webwtrarecds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV101Webwtrarecds_29_tfrecfecalt_to = AV61TFRecFecAlt_To ;
      AV102Webwtrarecds_30_tfrecusrcod = AV62TFRecUsrCod ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = AV63TFRecUsrCod_Sel ;
      AV104Webwtrarecds_32_tfrecfecmod = AV64TFRecFecMod ;
      AV105Webwtrarecds_33_tfrecfecmod_to = AV65TFRecFecMod_To ;
      AV106Webwtrarecds_34_tfrecusrmod = AV66TFRecUsrMod ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = AV67TFRecUsrMod_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           AV74Webwtrarecds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Webwtrarecds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Webwtrarecds_5_tfreclinmaq_to) ,
                                           AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           AV78Webwtrarecds_6_tfmaqcod ,
                                           AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           AV80Webwtrarecds_8_tfbaragrest ,
                                           AV83Webwtrarecds_11_tfbarser_sel ,
                                           AV82Webwtrarecds_10_tfbarser ,
                                           AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           AV84Webwtrarecds_12_tfbarserdsc ,
                                           AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           AV86Webwtrarecds_14_tfbarcolnom ,
                                           AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           AV88Webwtrarecds_16_tfbarnomcli ,
                                           AV94Webwtrarecds_22_tfrecfa ,
                                           AV95Webwtrarecds_23_tfrecfa_to ,
                                           AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           AV96Webwtrarecds_24_tfrecnumprg ,
                                           Integer.valueOf(AV98Webwtrarecds_26_tfrecvolprd) ,
                                           Integer.valueOf(AV99Webwtrarecds_27_tfrecvolprd_to) ,
                                           AV100Webwtrarecds_28_tfrecfecalt ,
                                           AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           AV102Webwtrarecds_30_tfrecusrcod ,
                                           AV104Webwtrarecds_32_tfrecfecmod ,
                                           AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           AV106Webwtrarecds_34_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A2806RecFA ,
                                           A5110RecNumPrg ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV73Webwtrarecds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           A871RecTotMtr ,
                                           AV90Webwtrarecds_18_tfrectotkgm ,
                                           AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           AV92Webwtrarecds_20_tfrectotmtr ,
                                           AV93Webwtrarecds_21_tfrectotmtr_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV74Webwtrarecds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Webwtrarecds_2_tfbarnhdr), 11, "%") ;
      lV80Webwtrarecds_8_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Webwtrarecds_8_tfbaragrest), 1, "%") ;
      lV82Webwtrarecds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV82Webwtrarecds_10_tfbarser), 16, "%") ;
      lV84Webwtrarecds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Webwtrarecds_12_tfbarserdsc), 26, "%") ;
      lV86Webwtrarecds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV86Webwtrarecds_14_tfbarcolnom), 13, "%") ;
      lV88Webwtrarecds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV88Webwtrarecds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P08RZ43 */
      pr_default.execute(6, new Object[] {AV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, Short.valueOf(A2804RecLinMaq), lV73Webwtrarecds_1_filterfulltext, A602MaqCod, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, A2806RecFA, lV73Webwtrarecds_1_filterfulltext, A5110RecNumPrg, lV73Webwtrarecds_1_filterfulltext, Integer.valueOf(A2805RecVolPrd), lV73Webwtrarecds_1_filterfulltext, A4402RecUsrCod, lV73Webwtrarecds_1_filterfulltext, A4868RecUsrMod, lV73Webwtrarecds_1_filterfulltext, AV90Webwtrarecds_18_tfrectotkgm, AV90Webwtrarecds_18_tfrectotkgm, AV91Webwtrarecds_19_tfrectotkgm_to, AV91Webwtrarecds_19_tfrectotkgm_to, AV92Webwtrarecds_20_tfrectotmtr, AV92Webwtrarecds_20_tfrectotmtr, AV93Webwtrarecds_21_tfrectotmtr_to, AV93Webwtrarecds_21_tfrectotmtr_to, lV74Webwtrarecds_2_tfbarnhdr, AV75Webwtrarecds_3_tfbarnhdr_sel, lV80Webwtrarecds_8_tfbaragrest, AV81Webwtrarecds_9_tfbaragrest_sel, lV82Webwtrarecds_10_tfbarser, AV83Webwtrarecds_11_tfbarser_sel, lV84Webwtrarecds_12_tfbarserdsc, AV85Webwtrarecds_13_tfbarserdsc_sel, lV86Webwtrarecds_14_tfbarcolnom, AV87Webwtrarecds_15_tfbarcolnom_sel, lV88Webwtrarecds_16_tfbarnomcli, AV89Webwtrarecds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8RZ13 = false ;
         A396EmprCod = P08RZ43_A396EmprCod[0] ;
         A1234BarNomCli = P08RZ43_A1234BarNomCli[0] ;
         A135BarColNom = P08RZ43_A135BarColNom[0] ;
         A1652BarSerDsc = P08RZ43_A1652BarSerDsc[0] ;
         A212BarSer = P08RZ43_A212BarSer[0] ;
         A120BarAgrEst = P08RZ43_A120BarAgrEst[0] ;
         A13696BarNHdr = P08RZ43_A13696BarNHdr[0] ;
         A871RecTotMtr = P08RZ43_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ43_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ43_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ43_n812RecTotKgm[0] ;
         A129BarCod = P08RZ43_A129BarCod[0] ;
         A132BarCodReo = P08RZ43_A132BarCodReo[0] ;
         A130BarCodPar = P08RZ43_A130BarCodPar[0] ;
         A871RecTotMtr = P08RZ43_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ43_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ43_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ43_n812RecTotKgm[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08RZ43_A1234BarNomCli[0], A1234BarNomCli) == 0 ) )
         {
            brk8RZ13 = false ;
            A396EmprCod = P08RZ43_A396EmprCod[0] ;
            A129BarCod = P08RZ43_A129BarCod[0] ;
            A132BarCodReo = P08RZ43_A132BarCodReo[0] ;
            A130BarCodPar = P08RZ43_A130BarCodPar[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8RZ13 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV18Option = A1234BarNomCli ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RZ13 )
         {
            brk8RZ13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADRECNUMPRGOPTIONS' Routine */
      returnInSub = false ;
      AV44TFRecNumPrg = AV14SearchTxt ;
      AV45TFRecNumPrg_Sel = "" ;
      AV73Webwtrarecds_1_filterfulltext = AV68FilterFullText ;
      AV74Webwtrarecds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Webwtrarecds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Webwtrarecds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Webwtrarecds_6_tfmaqcod = AV32TFMaqCod ;
      AV79Webwtrarecds_7_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV80Webwtrarecds_8_tfbaragrest = AV50TFBarAgrEst ;
      AV81Webwtrarecds_9_tfbaragrest_sel = AV51TFBarAgrEst_Sel ;
      AV82Webwtrarecds_10_tfbarser = AV52TFBarSer ;
      AV83Webwtrarecds_11_tfbarser_sel = AV53TFBarSer_Sel ;
      AV84Webwtrarecds_12_tfbarserdsc = AV54TFBarSerDsc ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = AV55TFBarSerDsc_Sel ;
      AV86Webwtrarecds_14_tfbarcolnom = AV56TFBarColNom ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = AV57TFBarColNom_Sel ;
      AV88Webwtrarecds_16_tfbarnomcli = AV58TFBarNomCli ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV90Webwtrarecds_18_tfrectotkgm = AV34TFRecTotKgm ;
      AV91Webwtrarecds_19_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV92Webwtrarecds_20_tfrectotmtr = AV36TFRecTotMtr ;
      AV93Webwtrarecds_21_tfrectotmtr_to = AV37TFRecTotMtr_To ;
      AV94Webwtrarecds_22_tfrecfa = AV42TFRecFA ;
      AV95Webwtrarecds_23_tfrecfa_to = AV43TFRecFA_To ;
      AV96Webwtrarecds_24_tfrecnumprg = AV44TFRecNumPrg ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = AV45TFRecNumPrg_Sel ;
      AV98Webwtrarecds_26_tfrecvolprd = AV40TFRecVolPrd ;
      AV99Webwtrarecds_27_tfrecvolprd_to = AV41TFRecVolPrd_To ;
      AV100Webwtrarecds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV101Webwtrarecds_29_tfrecfecalt_to = AV61TFRecFecAlt_To ;
      AV102Webwtrarecds_30_tfrecusrcod = AV62TFRecUsrCod ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = AV63TFRecUsrCod_Sel ;
      AV104Webwtrarecds_32_tfrecfecmod = AV64TFRecFecMod ;
      AV105Webwtrarecds_33_tfrecfecmod_to = AV65TFRecFecMod_To ;
      AV106Webwtrarecds_34_tfrecusrmod = AV66TFRecUsrMod ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = AV67TFRecUsrMod_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           AV74Webwtrarecds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Webwtrarecds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Webwtrarecds_5_tfreclinmaq_to) ,
                                           AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           AV78Webwtrarecds_6_tfmaqcod ,
                                           AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           AV80Webwtrarecds_8_tfbaragrest ,
                                           AV83Webwtrarecds_11_tfbarser_sel ,
                                           AV82Webwtrarecds_10_tfbarser ,
                                           AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           AV84Webwtrarecds_12_tfbarserdsc ,
                                           AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           AV86Webwtrarecds_14_tfbarcolnom ,
                                           AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           AV88Webwtrarecds_16_tfbarnomcli ,
                                           AV94Webwtrarecds_22_tfrecfa ,
                                           AV95Webwtrarecds_23_tfrecfa_to ,
                                           AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           AV96Webwtrarecds_24_tfrecnumprg ,
                                           Integer.valueOf(AV98Webwtrarecds_26_tfrecvolprd) ,
                                           Integer.valueOf(AV99Webwtrarecds_27_tfrecvolprd_to) ,
                                           AV100Webwtrarecds_28_tfrecfecalt ,
                                           AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           AV102Webwtrarecds_30_tfrecusrcod ,
                                           AV104Webwtrarecds_32_tfrecfecmod ,
                                           AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           AV106Webwtrarecds_34_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A2806RecFA ,
                                           A5110RecNumPrg ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV73Webwtrarecds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           A871RecTotMtr ,
                                           AV90Webwtrarecds_18_tfrectotkgm ,
                                           AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           AV92Webwtrarecds_20_tfrectotmtr ,
                                           AV93Webwtrarecds_21_tfrectotmtr_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV74Webwtrarecds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Webwtrarecds_2_tfbarnhdr), 11, "%") ;
      lV80Webwtrarecds_8_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Webwtrarecds_8_tfbaragrest), 1, "%") ;
      lV82Webwtrarecds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV82Webwtrarecds_10_tfbarser), 16, "%") ;
      lV84Webwtrarecds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Webwtrarecds_12_tfbarserdsc), 26, "%") ;
      lV86Webwtrarecds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV86Webwtrarecds_14_tfbarcolnom), 13, "%") ;
      lV88Webwtrarecds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV88Webwtrarecds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P08RZ49 */
      pr_default.execute(7, new Object[] {AV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, Short.valueOf(A2804RecLinMaq), lV73Webwtrarecds_1_filterfulltext, A602MaqCod, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, A2806RecFA, lV73Webwtrarecds_1_filterfulltext, A5110RecNumPrg, lV73Webwtrarecds_1_filterfulltext, Integer.valueOf(A2805RecVolPrd), lV73Webwtrarecds_1_filterfulltext, A4402RecUsrCod, lV73Webwtrarecds_1_filterfulltext, A4868RecUsrMod, lV73Webwtrarecds_1_filterfulltext, AV90Webwtrarecds_18_tfrectotkgm, AV90Webwtrarecds_18_tfrectotkgm, AV91Webwtrarecds_19_tfrectotkgm_to, AV91Webwtrarecds_19_tfrectotkgm_to, AV92Webwtrarecds_20_tfrectotmtr, AV92Webwtrarecds_20_tfrectotmtr, AV93Webwtrarecds_21_tfrectotmtr_to, AV93Webwtrarecds_21_tfrectotmtr_to, lV74Webwtrarecds_2_tfbarnhdr, AV75Webwtrarecds_3_tfbarnhdr_sel, lV80Webwtrarecds_8_tfbaragrest, AV81Webwtrarecds_9_tfbaragrest_sel, lV82Webwtrarecds_10_tfbarser, AV83Webwtrarecds_11_tfbarser_sel, lV84Webwtrarecds_12_tfbarserdsc, AV85Webwtrarecds_13_tfbarserdsc_sel, lV86Webwtrarecds_14_tfbarcolnom, AV87Webwtrarecds_15_tfbarcolnom_sel, lV88Webwtrarecds_16_tfbarnomcli, AV89Webwtrarecds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8RZ15 = false ;
         A396EmprCod = P08RZ49_A396EmprCod[0] ;
         A1234BarNomCli = P08RZ49_A1234BarNomCli[0] ;
         A135BarColNom = P08RZ49_A135BarColNom[0] ;
         A1652BarSerDsc = P08RZ49_A1652BarSerDsc[0] ;
         A212BarSer = P08RZ49_A212BarSer[0] ;
         A120BarAgrEst = P08RZ49_A120BarAgrEst[0] ;
         A13696BarNHdr = P08RZ49_A13696BarNHdr[0] ;
         A871RecTotMtr = P08RZ49_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ49_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ49_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ49_n812RecTotKgm[0] ;
         A129BarCod = P08RZ49_A129BarCod[0] ;
         A132BarCodReo = P08RZ49_A132BarCodReo[0] ;
         A130BarCodPar = P08RZ49_A130BarCodPar[0] ;
         A871RecTotMtr = P08RZ49_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ49_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ49_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ49_n812RecTotKgm[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(7) != 101) )
         {
            brk8RZ15 = false ;
            A396EmprCod = P08RZ49_A396EmprCod[0] ;
            A129BarCod = P08RZ49_A129BarCod[0] ;
            A132BarCodReo = P08RZ49_A132BarCodReo[0] ;
            A130BarCodPar = P08RZ49_A130BarCodPar[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8RZ15 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A5110RecNumPrg)==0) )
         {
            AV18Option = A5110RecNumPrg ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RZ15 )
         {
            brk8RZ15 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADRECUSRCODOPTIONS' Routine */
      returnInSub = false ;
      AV62TFRecUsrCod = AV14SearchTxt ;
      AV63TFRecUsrCod_Sel = "" ;
      AV73Webwtrarecds_1_filterfulltext = AV68FilterFullText ;
      AV74Webwtrarecds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Webwtrarecds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Webwtrarecds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Webwtrarecds_6_tfmaqcod = AV32TFMaqCod ;
      AV79Webwtrarecds_7_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV80Webwtrarecds_8_tfbaragrest = AV50TFBarAgrEst ;
      AV81Webwtrarecds_9_tfbaragrest_sel = AV51TFBarAgrEst_Sel ;
      AV82Webwtrarecds_10_tfbarser = AV52TFBarSer ;
      AV83Webwtrarecds_11_tfbarser_sel = AV53TFBarSer_Sel ;
      AV84Webwtrarecds_12_tfbarserdsc = AV54TFBarSerDsc ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = AV55TFBarSerDsc_Sel ;
      AV86Webwtrarecds_14_tfbarcolnom = AV56TFBarColNom ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = AV57TFBarColNom_Sel ;
      AV88Webwtrarecds_16_tfbarnomcli = AV58TFBarNomCli ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV90Webwtrarecds_18_tfrectotkgm = AV34TFRecTotKgm ;
      AV91Webwtrarecds_19_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV92Webwtrarecds_20_tfrectotmtr = AV36TFRecTotMtr ;
      AV93Webwtrarecds_21_tfrectotmtr_to = AV37TFRecTotMtr_To ;
      AV94Webwtrarecds_22_tfrecfa = AV42TFRecFA ;
      AV95Webwtrarecds_23_tfrecfa_to = AV43TFRecFA_To ;
      AV96Webwtrarecds_24_tfrecnumprg = AV44TFRecNumPrg ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = AV45TFRecNumPrg_Sel ;
      AV98Webwtrarecds_26_tfrecvolprd = AV40TFRecVolPrd ;
      AV99Webwtrarecds_27_tfrecvolprd_to = AV41TFRecVolPrd_To ;
      AV100Webwtrarecds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV101Webwtrarecds_29_tfrecfecalt_to = AV61TFRecFecAlt_To ;
      AV102Webwtrarecds_30_tfrecusrcod = AV62TFRecUsrCod ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = AV63TFRecUsrCod_Sel ;
      AV104Webwtrarecds_32_tfrecfecmod = AV64TFRecFecMod ;
      AV105Webwtrarecds_33_tfrecfecmod_to = AV65TFRecFecMod_To ;
      AV106Webwtrarecds_34_tfrecusrmod = AV66TFRecUsrMod ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = AV67TFRecUsrMod_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           AV74Webwtrarecds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Webwtrarecds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Webwtrarecds_5_tfreclinmaq_to) ,
                                           AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           AV78Webwtrarecds_6_tfmaqcod ,
                                           AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           AV80Webwtrarecds_8_tfbaragrest ,
                                           AV83Webwtrarecds_11_tfbarser_sel ,
                                           AV82Webwtrarecds_10_tfbarser ,
                                           AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           AV84Webwtrarecds_12_tfbarserdsc ,
                                           AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           AV86Webwtrarecds_14_tfbarcolnom ,
                                           AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           AV88Webwtrarecds_16_tfbarnomcli ,
                                           AV94Webwtrarecds_22_tfrecfa ,
                                           AV95Webwtrarecds_23_tfrecfa_to ,
                                           AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           AV96Webwtrarecds_24_tfrecnumprg ,
                                           Integer.valueOf(AV98Webwtrarecds_26_tfrecvolprd) ,
                                           Integer.valueOf(AV99Webwtrarecds_27_tfrecvolprd_to) ,
                                           AV100Webwtrarecds_28_tfrecfecalt ,
                                           AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           AV102Webwtrarecds_30_tfrecusrcod ,
                                           AV104Webwtrarecds_32_tfrecfecmod ,
                                           AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           AV106Webwtrarecds_34_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A2806RecFA ,
                                           A5110RecNumPrg ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV73Webwtrarecds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           A871RecTotMtr ,
                                           AV90Webwtrarecds_18_tfrectotkgm ,
                                           AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           AV92Webwtrarecds_20_tfrectotmtr ,
                                           AV93Webwtrarecds_21_tfrectotmtr_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV74Webwtrarecds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Webwtrarecds_2_tfbarnhdr), 11, "%") ;
      lV80Webwtrarecds_8_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Webwtrarecds_8_tfbaragrest), 1, "%") ;
      lV82Webwtrarecds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV82Webwtrarecds_10_tfbarser), 16, "%") ;
      lV84Webwtrarecds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Webwtrarecds_12_tfbarserdsc), 26, "%") ;
      lV86Webwtrarecds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV86Webwtrarecds_14_tfbarcolnom), 13, "%") ;
      lV88Webwtrarecds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV88Webwtrarecds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P08RZ55 */
      pr_default.execute(8, new Object[] {AV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, Short.valueOf(A2804RecLinMaq), lV73Webwtrarecds_1_filterfulltext, A602MaqCod, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, A2806RecFA, lV73Webwtrarecds_1_filterfulltext, A5110RecNumPrg, lV73Webwtrarecds_1_filterfulltext, Integer.valueOf(A2805RecVolPrd), lV73Webwtrarecds_1_filterfulltext, A4402RecUsrCod, lV73Webwtrarecds_1_filterfulltext, A4868RecUsrMod, lV73Webwtrarecds_1_filterfulltext, AV90Webwtrarecds_18_tfrectotkgm, AV90Webwtrarecds_18_tfrectotkgm, AV91Webwtrarecds_19_tfrectotkgm_to, AV91Webwtrarecds_19_tfrectotkgm_to, AV92Webwtrarecds_20_tfrectotmtr, AV92Webwtrarecds_20_tfrectotmtr, AV93Webwtrarecds_21_tfrectotmtr_to, AV93Webwtrarecds_21_tfrectotmtr_to, lV74Webwtrarecds_2_tfbarnhdr, AV75Webwtrarecds_3_tfbarnhdr_sel, lV80Webwtrarecds_8_tfbaragrest, AV81Webwtrarecds_9_tfbaragrest_sel, lV82Webwtrarecds_10_tfbarser, AV83Webwtrarecds_11_tfbarser_sel, lV84Webwtrarecds_12_tfbarserdsc, AV85Webwtrarecds_13_tfbarserdsc_sel, lV86Webwtrarecds_14_tfbarcolnom, AV87Webwtrarecds_15_tfbarcolnom_sel, lV88Webwtrarecds_16_tfbarnomcli, AV89Webwtrarecds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk8RZ17 = false ;
         A396EmprCod = P08RZ55_A396EmprCod[0] ;
         A1234BarNomCli = P08RZ55_A1234BarNomCli[0] ;
         A135BarColNom = P08RZ55_A135BarColNom[0] ;
         A1652BarSerDsc = P08RZ55_A1652BarSerDsc[0] ;
         A212BarSer = P08RZ55_A212BarSer[0] ;
         A120BarAgrEst = P08RZ55_A120BarAgrEst[0] ;
         A13696BarNHdr = P08RZ55_A13696BarNHdr[0] ;
         A871RecTotMtr = P08RZ55_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ55_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ55_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ55_n812RecTotKgm[0] ;
         A129BarCod = P08RZ55_A129BarCod[0] ;
         A132BarCodReo = P08RZ55_A132BarCodReo[0] ;
         A130BarCodPar = P08RZ55_A130BarCodPar[0] ;
         A871RecTotMtr = P08RZ55_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ55_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ55_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ55_n812RecTotKgm[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(8) != 101) )
         {
            brk8RZ17 = false ;
            A396EmprCod = P08RZ55_A396EmprCod[0] ;
            A129BarCod = P08RZ55_A129BarCod[0] ;
            A132BarCodReo = P08RZ55_A132BarCodReo[0] ;
            A130BarCodPar = P08RZ55_A130BarCodPar[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8RZ17 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A4402RecUsrCod)==0) )
         {
            AV18Option = A4402RecUsrCod ;
            AV19Options.add(AV18Option, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RZ17 )
         {
            brk8RZ17 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   public void S211( )
   {
      /* 'LOADRECUSRMODOPTIONS' Routine */
      returnInSub = false ;
      AV66TFRecUsrMod = AV14SearchTxt ;
      AV67TFRecUsrMod_Sel = "" ;
      AV73Webwtrarecds_1_filterfulltext = AV68FilterFullText ;
      AV74Webwtrarecds_2_tfbarnhdr = AV10TFBarNHdr ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV76Webwtrarecds_4_tfreclinmaq = AV12TFRecLinMaq ;
      AV77Webwtrarecds_5_tfreclinmaq_to = AV13TFRecLinMaq_To ;
      AV78Webwtrarecds_6_tfmaqcod = AV32TFMaqCod ;
      AV79Webwtrarecds_7_tfmaqcod_sel = AV33TFMaqCod_Sel ;
      AV80Webwtrarecds_8_tfbaragrest = AV50TFBarAgrEst ;
      AV81Webwtrarecds_9_tfbaragrest_sel = AV51TFBarAgrEst_Sel ;
      AV82Webwtrarecds_10_tfbarser = AV52TFBarSer ;
      AV83Webwtrarecds_11_tfbarser_sel = AV53TFBarSer_Sel ;
      AV84Webwtrarecds_12_tfbarserdsc = AV54TFBarSerDsc ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = AV55TFBarSerDsc_Sel ;
      AV86Webwtrarecds_14_tfbarcolnom = AV56TFBarColNom ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = AV57TFBarColNom_Sel ;
      AV88Webwtrarecds_16_tfbarnomcli = AV58TFBarNomCli ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV90Webwtrarecds_18_tfrectotkgm = AV34TFRecTotKgm ;
      AV91Webwtrarecds_19_tfrectotkgm_to = AV35TFRecTotKgm_To ;
      AV92Webwtrarecds_20_tfrectotmtr = AV36TFRecTotMtr ;
      AV93Webwtrarecds_21_tfrectotmtr_to = AV37TFRecTotMtr_To ;
      AV94Webwtrarecds_22_tfrecfa = AV42TFRecFA ;
      AV95Webwtrarecds_23_tfrecfa_to = AV43TFRecFA_To ;
      AV96Webwtrarecds_24_tfrecnumprg = AV44TFRecNumPrg ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = AV45TFRecNumPrg_Sel ;
      AV98Webwtrarecds_26_tfrecvolprd = AV40TFRecVolPrd ;
      AV99Webwtrarecds_27_tfrecvolprd_to = AV41TFRecVolPrd_To ;
      AV100Webwtrarecds_28_tfrecfecalt = AV60TFRecFecAlt ;
      AV101Webwtrarecds_29_tfrecfecalt_to = AV61TFRecFecAlt_To ;
      AV102Webwtrarecds_30_tfrecusrcod = AV62TFRecUsrCod ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = AV63TFRecUsrCod_Sel ;
      AV104Webwtrarecds_32_tfrecfecmod = AV64TFRecFecMod ;
      AV105Webwtrarecds_33_tfrecfecmod_to = AV65TFRecFecMod_To ;
      AV106Webwtrarecds_34_tfrecusrmod = AV66TFRecUsrMod ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = AV67TFRecUsrMod_Sel ;
      pr_default.dynParam(9, new Object[]{ new Object[]{
                                           AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           AV74Webwtrarecds_2_tfbarnhdr ,
                                           Short.valueOf(AV76Webwtrarecds_4_tfreclinmaq) ,
                                           Short.valueOf(AV77Webwtrarecds_5_tfreclinmaq_to) ,
                                           AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           AV78Webwtrarecds_6_tfmaqcod ,
                                           AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           AV80Webwtrarecds_8_tfbaragrest ,
                                           AV83Webwtrarecds_11_tfbarser_sel ,
                                           AV82Webwtrarecds_10_tfbarser ,
                                           AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           AV84Webwtrarecds_12_tfbarserdsc ,
                                           AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           AV86Webwtrarecds_14_tfbarcolnom ,
                                           AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           AV88Webwtrarecds_16_tfbarnomcli ,
                                           AV94Webwtrarecds_22_tfrecfa ,
                                           AV95Webwtrarecds_23_tfrecfa_to ,
                                           AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           AV96Webwtrarecds_24_tfrecnumprg ,
                                           Integer.valueOf(AV98Webwtrarecds_26_tfrecvolprd) ,
                                           Integer.valueOf(AV99Webwtrarecds_27_tfrecvolprd_to) ,
                                           AV100Webwtrarecds_28_tfrecfecalt ,
                                           AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           AV102Webwtrarecds_30_tfrecusrcod ,
                                           AV104Webwtrarecds_32_tfrecfecmod ,
                                           AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           AV106Webwtrarecds_34_tfrecusrmod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           A602MaqCod ,
                                           A120BarAgrEst ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A2806RecFA ,
                                           A5110RecNumPrg ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4402RecUsrCod ,
                                           A4868RecUsrMod ,
                                           AV73Webwtrarecds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A812RecTotKgm ,
                                           A871RecTotMtr ,
                                           AV90Webwtrarecds_18_tfrectotkgm ,
                                           AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           AV92Webwtrarecds_20_tfrectotmtr ,
                                           AV93Webwtrarecds_21_tfrectotmtr_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV73Webwtrarecds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Webwtrarecds_1_filterfulltext), "%", "") ;
      lV74Webwtrarecds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Webwtrarecds_2_tfbarnhdr), 11, "%") ;
      lV80Webwtrarecds_8_tfbaragrest = GXutil.padr( GXutil.rtrim( AV80Webwtrarecds_8_tfbaragrest), 1, "%") ;
      lV82Webwtrarecds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV82Webwtrarecds_10_tfbarser), 16, "%") ;
      lV84Webwtrarecds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV84Webwtrarecds_12_tfbarserdsc), 26, "%") ;
      lV86Webwtrarecds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV86Webwtrarecds_14_tfbarcolnom), 13, "%") ;
      lV88Webwtrarecds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV88Webwtrarecds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P08RZ61 */
      pr_default.execute(9, new Object[] {AV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, Short.valueOf(A2804RecLinMaq), lV73Webwtrarecds_1_filterfulltext, A602MaqCod, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, lV73Webwtrarecds_1_filterfulltext, A2806RecFA, lV73Webwtrarecds_1_filterfulltext, A5110RecNumPrg, lV73Webwtrarecds_1_filterfulltext, Integer.valueOf(A2805RecVolPrd), lV73Webwtrarecds_1_filterfulltext, A4402RecUsrCod, lV73Webwtrarecds_1_filterfulltext, A4868RecUsrMod, lV73Webwtrarecds_1_filterfulltext, AV90Webwtrarecds_18_tfrectotkgm, AV90Webwtrarecds_18_tfrectotkgm, AV91Webwtrarecds_19_tfrectotkgm_to, AV91Webwtrarecds_19_tfrectotkgm_to, AV92Webwtrarecds_20_tfrectotmtr, AV92Webwtrarecds_20_tfrectotmtr, AV93Webwtrarecds_21_tfrectotmtr_to, AV93Webwtrarecds_21_tfrectotmtr_to, lV74Webwtrarecds_2_tfbarnhdr, AV75Webwtrarecds_3_tfbarnhdr_sel, lV80Webwtrarecds_8_tfbaragrest, AV81Webwtrarecds_9_tfbaragrest_sel, lV82Webwtrarecds_10_tfbarser, AV83Webwtrarecds_11_tfbarser_sel, lV84Webwtrarecds_12_tfbarserdsc, AV85Webwtrarecds_13_tfbarserdsc_sel, lV86Webwtrarecds_14_tfbarcolnom, AV87Webwtrarecds_15_tfbarcolnom_sel, lV88Webwtrarecds_16_tfbarnomcli, AV89Webwtrarecds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(9) != 101) )
      {
         brk8RZ19 = false ;
         A396EmprCod = P08RZ61_A396EmprCod[0] ;
         A1234BarNomCli = P08RZ61_A1234BarNomCli[0] ;
         A135BarColNom = P08RZ61_A135BarColNom[0] ;
         A1652BarSerDsc = P08RZ61_A1652BarSerDsc[0] ;
         A212BarSer = P08RZ61_A212BarSer[0] ;
         A120BarAgrEst = P08RZ61_A120BarAgrEst[0] ;
         A13696BarNHdr = P08RZ61_A13696BarNHdr[0] ;
         A871RecTotMtr = P08RZ61_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ61_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ61_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ61_n812RecTotKgm[0] ;
         A129BarCod = P08RZ61_A129BarCod[0] ;
         A132BarCodReo = P08RZ61_A132BarCodReo[0] ;
         A130BarCodPar = P08RZ61_A130BarCodPar[0] ;
         A871RecTotMtr = P08RZ61_A871RecTotMtr[0] ;
         n871RecTotMtr = P08RZ61_n871RecTotMtr[0] ;
         A812RecTotKgm = P08RZ61_A812RecTotKgm[0] ;
         n812RecTotKgm = P08RZ61_n812RecTotKgm[0] ;
         AV26count = 0 ;
         while ( (pr_default.getStatus(9) != 101) )
         {
            brk8RZ19 = false ;
            A396EmprCod = P08RZ61_A396EmprCod[0] ;
            A129BarCod = P08RZ61_A129BarCod[0] ;
            A132BarCodReo = P08RZ61_A132BarCodReo[0] ;
            A130BarCodPar = P08RZ61_A130BarCodPar[0] ;
            AV26count = (long)(AV26count+1) ;
            brk8RZ19 = true ;
            pr_default.readNext(9);
         }
         if ( ! (GXutil.strcmp("", A4868RecUsrMod)==0) )
         {
            AV18Option = A4868RecUsrMod ;
            AV21OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A4868RecUsrMod, "@!"))) ;
            AV19Options.add(AV18Option, 0);
            AV22OptionsDesc.add(AV21OptionDesc, 0);
            AV24OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV26count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV19Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8RZ19 )
         {
            brk8RZ19 = true ;
            pr_default.readNext(9);
         }
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwtrarecgetfilterdata.this.AV20OptionsJson;
      this.aP4[0] = webwtrarecgetfilterdata.this.AV23OptionsDescJson;
      this.aP5[0] = webwtrarecgetfilterdata.this.AV25OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20OptionsJson = "" ;
      AV23OptionsDescJson = "" ;
      AV25OptionIndexesJson = "" ;
      AV19Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV22OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV24OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV29GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV30GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV68FilterFullText = "" ;
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV32TFMaqCod = "" ;
      AV33TFMaqCod_Sel = "" ;
      AV50TFBarAgrEst = "" ;
      AV51TFBarAgrEst_Sel = "" ;
      AV52TFBarSer = "" ;
      AV53TFBarSer_Sel = "" ;
      AV54TFBarSerDsc = "" ;
      AV55TFBarSerDsc_Sel = "" ;
      AV56TFBarColNom = "" ;
      AV57TFBarColNom_Sel = "" ;
      AV58TFBarNomCli = "" ;
      AV59TFBarNomCli_Sel = "" ;
      AV34TFRecTotKgm = DecimalUtil.ZERO ;
      AV35TFRecTotKgm_To = DecimalUtil.ZERO ;
      AV36TFRecTotMtr = DecimalUtil.ZERO ;
      AV37TFRecTotMtr_To = DecimalUtil.ZERO ;
      AV42TFRecFA = DecimalUtil.ZERO ;
      AV43TFRecFA_To = DecimalUtil.ZERO ;
      AV44TFRecNumPrg = "" ;
      AV45TFRecNumPrg_Sel = "" ;
      AV60TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV61TFRecFecAlt_To = GXutil.resetTime( GXutil.nullDate() );
      AV62TFRecUsrCod = "" ;
      AV63TFRecUsrCod_Sel = "" ;
      AV64TFRecFecMod = GXutil.resetTime( GXutil.nullDate() );
      AV65TFRecFecMod_To = GXutil.resetTime( GXutil.nullDate() );
      AV66TFRecUsrMod = "" ;
      AV67TFRecUsrMod_Sel = "" ;
      A13696BarNHdr = "" ;
      AV73Webwtrarecds_1_filterfulltext = "" ;
      AV74Webwtrarecds_2_tfbarnhdr = "" ;
      AV75Webwtrarecds_3_tfbarnhdr_sel = "" ;
      AV78Webwtrarecds_6_tfmaqcod = "" ;
      AV79Webwtrarecds_7_tfmaqcod_sel = "" ;
      AV80Webwtrarecds_8_tfbaragrest = "" ;
      AV81Webwtrarecds_9_tfbaragrest_sel = "" ;
      AV82Webwtrarecds_10_tfbarser = "" ;
      AV83Webwtrarecds_11_tfbarser_sel = "" ;
      AV84Webwtrarecds_12_tfbarserdsc = "" ;
      AV85Webwtrarecds_13_tfbarserdsc_sel = "" ;
      AV86Webwtrarecds_14_tfbarcolnom = "" ;
      AV87Webwtrarecds_15_tfbarcolnom_sel = "" ;
      AV88Webwtrarecds_16_tfbarnomcli = "" ;
      AV89Webwtrarecds_17_tfbarnomcli_sel = "" ;
      AV90Webwtrarecds_18_tfrectotkgm = DecimalUtil.ZERO ;
      AV91Webwtrarecds_19_tfrectotkgm_to = DecimalUtil.ZERO ;
      AV92Webwtrarecds_20_tfrectotmtr = DecimalUtil.ZERO ;
      AV93Webwtrarecds_21_tfrectotmtr_to = DecimalUtil.ZERO ;
      AV94Webwtrarecds_22_tfrecfa = DecimalUtil.ZERO ;
      AV95Webwtrarecds_23_tfrecfa_to = DecimalUtil.ZERO ;
      AV96Webwtrarecds_24_tfrecnumprg = "" ;
      AV97Webwtrarecds_25_tfrecnumprg_sel = "" ;
      AV100Webwtrarecds_28_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      AV101Webwtrarecds_29_tfrecfecalt_to = GXutil.resetTime( GXutil.nullDate() );
      AV102Webwtrarecds_30_tfrecusrcod = "" ;
      AV103Webwtrarecds_31_tfrecusrcod_sel = "" ;
      AV104Webwtrarecds_32_tfrecfecmod = GXutil.resetTime( GXutil.nullDate() );
      AV105Webwtrarecds_33_tfrecfecmod_to = GXutil.resetTime( GXutil.nullDate() );
      AV106Webwtrarecds_34_tfrecusrmod = "" ;
      AV107Webwtrarecds_35_tfrecusrmod_sel = "" ;
      lV73Webwtrarecds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV74Webwtrarecds_2_tfbarnhdr = "" ;
      lV80Webwtrarecds_8_tfbaragrest = "" ;
      lV82Webwtrarecds_10_tfbarser = "" ;
      lV84Webwtrarecds_12_tfbarserdsc = "" ;
      lV86Webwtrarecds_14_tfbarcolnom = "" ;
      lV88Webwtrarecds_16_tfbarnomcli = "" ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A2806RecFA = DecimalUtil.ZERO ;
      A5110RecNumPrg = "" ;
      A4402RecUsrCod = "" ;
      A4868RecUsrMod = "" ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      P08RZ7_A396EmprCod = new String[] {""} ;
      P08RZ7_A1234BarNomCli = new String[] {""} ;
      P08RZ7_A135BarColNom = new String[] {""} ;
      P08RZ7_A1652BarSerDsc = new String[] {""} ;
      P08RZ7_A212BarSer = new String[] {""} ;
      P08RZ7_A120BarAgrEst = new String[] {""} ;
      P08RZ7_A13696BarNHdr = new String[] {""} ;
      P08RZ7_A871RecTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ7_n871RecTotMtr = new boolean[] {false} ;
      P08RZ7_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ7_n812RecTotKgm = new boolean[] {false} ;
      P08RZ7_A129BarCod = new int[1] ;
      P08RZ7_A132BarCodReo = new byte[1] ;
      P08RZ7_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      AV18Option = "" ;
      P08RZ13_A396EmprCod = new String[] {""} ;
      P08RZ13_A1234BarNomCli = new String[] {""} ;
      P08RZ13_A135BarColNom = new String[] {""} ;
      P08RZ13_A1652BarSerDsc = new String[] {""} ;
      P08RZ13_A212BarSer = new String[] {""} ;
      P08RZ13_A120BarAgrEst = new String[] {""} ;
      P08RZ13_A13696BarNHdr = new String[] {""} ;
      P08RZ13_A871RecTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ13_n871RecTotMtr = new boolean[] {false} ;
      P08RZ13_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ13_n812RecTotKgm = new boolean[] {false} ;
      P08RZ13_A129BarCod = new int[1] ;
      P08RZ13_A132BarCodReo = new byte[1] ;
      P08RZ13_A130BarCodPar = new String[] {""} ;
      P08RZ19_A396EmprCod = new String[] {""} ;
      P08RZ19_A120BarAgrEst = new String[] {""} ;
      P08RZ19_A1234BarNomCli = new String[] {""} ;
      P08RZ19_A135BarColNom = new String[] {""} ;
      P08RZ19_A1652BarSerDsc = new String[] {""} ;
      P08RZ19_A212BarSer = new String[] {""} ;
      P08RZ19_A13696BarNHdr = new String[] {""} ;
      P08RZ19_A871RecTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ19_n871RecTotMtr = new boolean[] {false} ;
      P08RZ19_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ19_n812RecTotKgm = new boolean[] {false} ;
      P08RZ19_A129BarCod = new int[1] ;
      P08RZ19_A132BarCodReo = new byte[1] ;
      P08RZ19_A130BarCodPar = new String[] {""} ;
      AV21OptionDesc = "" ;
      P08RZ25_A396EmprCod = new String[] {""} ;
      P08RZ25_A212BarSer = new String[] {""} ;
      P08RZ25_A1234BarNomCli = new String[] {""} ;
      P08RZ25_A135BarColNom = new String[] {""} ;
      P08RZ25_A1652BarSerDsc = new String[] {""} ;
      P08RZ25_A120BarAgrEst = new String[] {""} ;
      P08RZ25_A13696BarNHdr = new String[] {""} ;
      P08RZ25_A871RecTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ25_n871RecTotMtr = new boolean[] {false} ;
      P08RZ25_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ25_n812RecTotKgm = new boolean[] {false} ;
      P08RZ25_A129BarCod = new int[1] ;
      P08RZ25_A132BarCodReo = new byte[1] ;
      P08RZ25_A130BarCodPar = new String[] {""} ;
      P08RZ31_A396EmprCod = new String[] {""} ;
      P08RZ31_A1652BarSerDsc = new String[] {""} ;
      P08RZ31_A1234BarNomCli = new String[] {""} ;
      P08RZ31_A135BarColNom = new String[] {""} ;
      P08RZ31_A212BarSer = new String[] {""} ;
      P08RZ31_A120BarAgrEst = new String[] {""} ;
      P08RZ31_A13696BarNHdr = new String[] {""} ;
      P08RZ31_A871RecTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ31_n871RecTotMtr = new boolean[] {false} ;
      P08RZ31_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ31_n812RecTotKgm = new boolean[] {false} ;
      P08RZ31_A129BarCod = new int[1] ;
      P08RZ31_A132BarCodReo = new byte[1] ;
      P08RZ31_A130BarCodPar = new String[] {""} ;
      P08RZ37_A396EmprCod = new String[] {""} ;
      P08RZ37_A135BarColNom = new String[] {""} ;
      P08RZ37_A1234BarNomCli = new String[] {""} ;
      P08RZ37_A1652BarSerDsc = new String[] {""} ;
      P08RZ37_A212BarSer = new String[] {""} ;
      P08RZ37_A120BarAgrEst = new String[] {""} ;
      P08RZ37_A13696BarNHdr = new String[] {""} ;
      P08RZ37_A871RecTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ37_n871RecTotMtr = new boolean[] {false} ;
      P08RZ37_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ37_n812RecTotKgm = new boolean[] {false} ;
      P08RZ37_A129BarCod = new int[1] ;
      P08RZ37_A132BarCodReo = new byte[1] ;
      P08RZ37_A130BarCodPar = new String[] {""} ;
      P08RZ43_A396EmprCod = new String[] {""} ;
      P08RZ43_A1234BarNomCli = new String[] {""} ;
      P08RZ43_A135BarColNom = new String[] {""} ;
      P08RZ43_A1652BarSerDsc = new String[] {""} ;
      P08RZ43_A212BarSer = new String[] {""} ;
      P08RZ43_A120BarAgrEst = new String[] {""} ;
      P08RZ43_A13696BarNHdr = new String[] {""} ;
      P08RZ43_A871RecTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ43_n871RecTotMtr = new boolean[] {false} ;
      P08RZ43_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ43_n812RecTotKgm = new boolean[] {false} ;
      P08RZ43_A129BarCod = new int[1] ;
      P08RZ43_A132BarCodReo = new byte[1] ;
      P08RZ43_A130BarCodPar = new String[] {""} ;
      P08RZ49_A396EmprCod = new String[] {""} ;
      P08RZ49_A1234BarNomCli = new String[] {""} ;
      P08RZ49_A135BarColNom = new String[] {""} ;
      P08RZ49_A1652BarSerDsc = new String[] {""} ;
      P08RZ49_A212BarSer = new String[] {""} ;
      P08RZ49_A120BarAgrEst = new String[] {""} ;
      P08RZ49_A13696BarNHdr = new String[] {""} ;
      P08RZ49_A871RecTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ49_n871RecTotMtr = new boolean[] {false} ;
      P08RZ49_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ49_n812RecTotKgm = new boolean[] {false} ;
      P08RZ49_A129BarCod = new int[1] ;
      P08RZ49_A132BarCodReo = new byte[1] ;
      P08RZ49_A130BarCodPar = new String[] {""} ;
      P08RZ55_A396EmprCod = new String[] {""} ;
      P08RZ55_A1234BarNomCli = new String[] {""} ;
      P08RZ55_A135BarColNom = new String[] {""} ;
      P08RZ55_A1652BarSerDsc = new String[] {""} ;
      P08RZ55_A212BarSer = new String[] {""} ;
      P08RZ55_A120BarAgrEst = new String[] {""} ;
      P08RZ55_A13696BarNHdr = new String[] {""} ;
      P08RZ55_A871RecTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ55_n871RecTotMtr = new boolean[] {false} ;
      P08RZ55_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ55_n812RecTotKgm = new boolean[] {false} ;
      P08RZ55_A129BarCod = new int[1] ;
      P08RZ55_A132BarCodReo = new byte[1] ;
      P08RZ55_A130BarCodPar = new String[] {""} ;
      P08RZ61_A396EmprCod = new String[] {""} ;
      P08RZ61_A1234BarNomCli = new String[] {""} ;
      P08RZ61_A135BarColNom = new String[] {""} ;
      P08RZ61_A1652BarSerDsc = new String[] {""} ;
      P08RZ61_A212BarSer = new String[] {""} ;
      P08RZ61_A120BarAgrEst = new String[] {""} ;
      P08RZ61_A13696BarNHdr = new String[] {""} ;
      P08RZ61_A871RecTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ61_n871RecTotMtr = new boolean[] {false} ;
      P08RZ61_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08RZ61_n812RecTotKgm = new boolean[] {false} ;
      P08RZ61_A129BarCod = new int[1] ;
      P08RZ61_A132BarCodReo = new byte[1] ;
      P08RZ61_A130BarCodPar = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwtrarecgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08RZ7_A396EmprCod, P08RZ7_A1234BarNomCli, P08RZ7_A135BarColNom, P08RZ7_A1652BarSerDsc, P08RZ7_A212BarSer, P08RZ7_A120BarAgrEst, P08RZ7_A13696BarNHdr, P08RZ7_A871RecTotMtr, P08RZ7_n871RecTotMtr, P08RZ7_A812RecTotKgm,
            P08RZ7_n812RecTotKgm, P08RZ7_A129BarCod, P08RZ7_A132BarCodReo, P08RZ7_A130BarCodPar
            }
            , new Object[] {
            P08RZ13_A396EmprCod, P08RZ13_A1234BarNomCli, P08RZ13_A135BarColNom, P08RZ13_A1652BarSerDsc, P08RZ13_A212BarSer, P08RZ13_A120BarAgrEst, P08RZ13_A13696BarNHdr, P08RZ13_A871RecTotMtr, P08RZ13_n871RecTotMtr, P08RZ13_A812RecTotKgm,
            P08RZ13_n812RecTotKgm, P08RZ13_A129BarCod, P08RZ13_A132BarCodReo, P08RZ13_A130BarCodPar
            }
            , new Object[] {
            P08RZ19_A396EmprCod, P08RZ19_A120BarAgrEst, P08RZ19_A1234BarNomCli, P08RZ19_A135BarColNom, P08RZ19_A1652BarSerDsc, P08RZ19_A212BarSer, P08RZ19_A13696BarNHdr, P08RZ19_A871RecTotMtr, P08RZ19_n871RecTotMtr, P08RZ19_A812RecTotKgm,
            P08RZ19_n812RecTotKgm, P08RZ19_A129BarCod, P08RZ19_A132BarCodReo, P08RZ19_A130BarCodPar
            }
            , new Object[] {
            P08RZ25_A396EmprCod, P08RZ25_A212BarSer, P08RZ25_A1234BarNomCli, P08RZ25_A135BarColNom, P08RZ25_A1652BarSerDsc, P08RZ25_A120BarAgrEst, P08RZ25_A13696BarNHdr, P08RZ25_A871RecTotMtr, P08RZ25_n871RecTotMtr, P08RZ25_A812RecTotKgm,
            P08RZ25_n812RecTotKgm, P08RZ25_A129BarCod, P08RZ25_A132BarCodReo, P08RZ25_A130BarCodPar
            }
            , new Object[] {
            P08RZ31_A396EmprCod, P08RZ31_A1652BarSerDsc, P08RZ31_A1234BarNomCli, P08RZ31_A135BarColNom, P08RZ31_A212BarSer, P08RZ31_A120BarAgrEst, P08RZ31_A13696BarNHdr, P08RZ31_A871RecTotMtr, P08RZ31_n871RecTotMtr, P08RZ31_A812RecTotKgm,
            P08RZ31_n812RecTotKgm, P08RZ31_A129BarCod, P08RZ31_A132BarCodReo, P08RZ31_A130BarCodPar
            }
            , new Object[] {
            P08RZ37_A396EmprCod, P08RZ37_A135BarColNom, P08RZ37_A1234BarNomCli, P08RZ37_A1652BarSerDsc, P08RZ37_A212BarSer, P08RZ37_A120BarAgrEst, P08RZ37_A13696BarNHdr, P08RZ37_A871RecTotMtr, P08RZ37_n871RecTotMtr, P08RZ37_A812RecTotKgm,
            P08RZ37_n812RecTotKgm, P08RZ37_A129BarCod, P08RZ37_A132BarCodReo, P08RZ37_A130BarCodPar
            }
            , new Object[] {
            P08RZ43_A396EmprCod, P08RZ43_A1234BarNomCli, P08RZ43_A135BarColNom, P08RZ43_A1652BarSerDsc, P08RZ43_A212BarSer, P08RZ43_A120BarAgrEst, P08RZ43_A13696BarNHdr, P08RZ43_A871RecTotMtr, P08RZ43_n871RecTotMtr, P08RZ43_A812RecTotKgm,
            P08RZ43_n812RecTotKgm, P08RZ43_A129BarCod, P08RZ43_A132BarCodReo, P08RZ43_A130BarCodPar
            }
            , new Object[] {
            P08RZ49_A396EmprCod, P08RZ49_A1234BarNomCli, P08RZ49_A135BarColNom, P08RZ49_A1652BarSerDsc, P08RZ49_A212BarSer, P08RZ49_A120BarAgrEst, P08RZ49_A13696BarNHdr, P08RZ49_A871RecTotMtr, P08RZ49_n871RecTotMtr, P08RZ49_A812RecTotKgm,
            P08RZ49_n812RecTotKgm, P08RZ49_A129BarCod, P08RZ49_A132BarCodReo, P08RZ49_A130BarCodPar
            }
            , new Object[] {
            P08RZ55_A396EmprCod, P08RZ55_A1234BarNomCli, P08RZ55_A135BarColNom, P08RZ55_A1652BarSerDsc, P08RZ55_A212BarSer, P08RZ55_A120BarAgrEst, P08RZ55_A13696BarNHdr, P08RZ55_A871RecTotMtr, P08RZ55_n871RecTotMtr, P08RZ55_A812RecTotKgm,
            P08RZ55_n812RecTotKgm, P08RZ55_A129BarCod, P08RZ55_A132BarCodReo, P08RZ55_A130BarCodPar
            }
            , new Object[] {
            P08RZ61_A396EmprCod, P08RZ61_A1234BarNomCli, P08RZ61_A135BarColNom, P08RZ61_A1652BarSerDsc, P08RZ61_A212BarSer, P08RZ61_A120BarAgrEst, P08RZ61_A13696BarNHdr, P08RZ61_A871RecTotMtr, P08RZ61_n871RecTotMtr, P08RZ61_A812RecTotKgm,
            P08RZ61_n812RecTotKgm, P08RZ61_A129BarCod, P08RZ61_A132BarCodReo, P08RZ61_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV12TFRecLinMaq ;
   private short AV13TFRecLinMaq_To ;
   private short AV76Webwtrarecds_4_tfreclinmaq ;
   private short AV77Webwtrarecds_5_tfreclinmaq_to ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV71GXV1 ;
   private int AV40TFRecVolPrd ;
   private int AV41TFRecVolPrd_To ;
   private int AV98Webwtrarecds_26_tfrecvolprd ;
   private int AV99Webwtrarecds_27_tfrecvolprd_to ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int AV17InsertIndex ;
   private long AV26count ;
   private java.math.BigDecimal AV34TFRecTotKgm ;
   private java.math.BigDecimal AV35TFRecTotKgm_To ;
   private java.math.BigDecimal AV36TFRecTotMtr ;
   private java.math.BigDecimal AV37TFRecTotMtr_To ;
   private java.math.BigDecimal AV42TFRecFA ;
   private java.math.BigDecimal AV43TFRecFA_To ;
   private java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ;
   private java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ;
   private java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ;
   private java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to ;
   private java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ;
   private java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal A871RecTotMtr ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV32TFMaqCod ;
   private String AV33TFMaqCod_Sel ;
   private String AV50TFBarAgrEst ;
   private String AV51TFBarAgrEst_Sel ;
   private String AV52TFBarSer ;
   private String AV53TFBarSer_Sel ;
   private String AV54TFBarSerDsc ;
   private String AV55TFBarSerDsc_Sel ;
   private String AV56TFBarColNom ;
   private String AV57TFBarColNom_Sel ;
   private String AV58TFBarNomCli ;
   private String AV59TFBarNomCli_Sel ;
   private String AV44TFRecNumPrg ;
   private String AV45TFRecNumPrg_Sel ;
   private String AV62TFRecUsrCod ;
   private String AV63TFRecUsrCod_Sel ;
   private String AV66TFRecUsrMod ;
   private String AV67TFRecUsrMod_Sel ;
   private String A13696BarNHdr ;
   private String AV74Webwtrarecds_2_tfbarnhdr ;
   private String AV75Webwtrarecds_3_tfbarnhdr_sel ;
   private String AV78Webwtrarecds_6_tfmaqcod ;
   private String AV79Webwtrarecds_7_tfmaqcod_sel ;
   private String AV80Webwtrarecds_8_tfbaragrest ;
   private String AV81Webwtrarecds_9_tfbaragrest_sel ;
   private String AV82Webwtrarecds_10_tfbarser ;
   private String AV83Webwtrarecds_11_tfbarser_sel ;
   private String AV84Webwtrarecds_12_tfbarserdsc ;
   private String AV85Webwtrarecds_13_tfbarserdsc_sel ;
   private String AV86Webwtrarecds_14_tfbarcolnom ;
   private String AV87Webwtrarecds_15_tfbarcolnom_sel ;
   private String AV88Webwtrarecds_16_tfbarnomcli ;
   private String AV89Webwtrarecds_17_tfbarnomcli_sel ;
   private String AV96Webwtrarecds_24_tfrecnumprg ;
   private String AV97Webwtrarecds_25_tfrecnumprg_sel ;
   private String AV102Webwtrarecds_30_tfrecusrcod ;
   private String AV103Webwtrarecds_31_tfrecusrcod_sel ;
   private String AV106Webwtrarecds_34_tfrecusrmod ;
   private String AV107Webwtrarecds_35_tfrecusrmod_sel ;
   private String scmdbuf ;
   private String lV74Webwtrarecds_2_tfbarnhdr ;
   private String lV80Webwtrarecds_8_tfbaragrest ;
   private String lV82Webwtrarecds_10_tfbarser ;
   private String lV84Webwtrarecds_12_tfbarserdsc ;
   private String lV86Webwtrarecds_14_tfbarcolnom ;
   private String lV88Webwtrarecds_16_tfbarnomcli ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String A120BarAgrEst ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A5110RecNumPrg ;
   private String A4402RecUsrCod ;
   private String A4868RecUsrMod ;
   private String A396EmprCod ;
   private java.util.Date AV60TFRecFecAlt ;
   private java.util.Date AV61TFRecFecAlt_To ;
   private java.util.Date AV64TFRecFecMod ;
   private java.util.Date AV65TFRecFecMod_To ;
   private java.util.Date AV100Webwtrarecds_28_tfrecfecalt ;
   private java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ;
   private java.util.Date AV104Webwtrarecds_32_tfrecfecmod ;
   private java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ;
   private boolean returnInSub ;
   private boolean n871RecTotMtr ;
   private boolean n812RecTotKgm ;
   private boolean brk8RZ3 ;
   private boolean brk8RZ5 ;
   private boolean brk8RZ7 ;
   private boolean brk8RZ9 ;
   private boolean brk8RZ11 ;
   private boolean brk8RZ13 ;
   private boolean brk8RZ15 ;
   private boolean brk8RZ17 ;
   private boolean brk8RZ19 ;
   private String AV20OptionsJson ;
   private String AV23OptionsDescJson ;
   private String AV25OptionIndexesJson ;
   private String AV16DDOName ;
   private String AV14SearchTxt ;
   private String AV15SearchTxtTo ;
   private String AV68FilterFullText ;
   private String AV73Webwtrarecds_1_filterfulltext ;
   private String lV73Webwtrarecds_1_filterfulltext ;
   private String AV18Option ;
   private String AV21OptionDesc ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08RZ7_A396EmprCod ;
   private String[] P08RZ7_A1234BarNomCli ;
   private String[] P08RZ7_A135BarColNom ;
   private String[] P08RZ7_A1652BarSerDsc ;
   private String[] P08RZ7_A212BarSer ;
   private String[] P08RZ7_A120BarAgrEst ;
   private String[] P08RZ7_A13696BarNHdr ;
   private java.math.BigDecimal[] P08RZ7_A871RecTotMtr ;
   private boolean[] P08RZ7_n871RecTotMtr ;
   private java.math.BigDecimal[] P08RZ7_A812RecTotKgm ;
   private boolean[] P08RZ7_n812RecTotKgm ;
   private int[] P08RZ7_A129BarCod ;
   private byte[] P08RZ7_A132BarCodReo ;
   private String[] P08RZ7_A130BarCodPar ;
   private String[] P08RZ13_A396EmprCod ;
   private String[] P08RZ13_A1234BarNomCli ;
   private String[] P08RZ13_A135BarColNom ;
   private String[] P08RZ13_A1652BarSerDsc ;
   private String[] P08RZ13_A212BarSer ;
   private String[] P08RZ13_A120BarAgrEst ;
   private String[] P08RZ13_A13696BarNHdr ;
   private java.math.BigDecimal[] P08RZ13_A871RecTotMtr ;
   private boolean[] P08RZ13_n871RecTotMtr ;
   private java.math.BigDecimal[] P08RZ13_A812RecTotKgm ;
   private boolean[] P08RZ13_n812RecTotKgm ;
   private int[] P08RZ13_A129BarCod ;
   private byte[] P08RZ13_A132BarCodReo ;
   private String[] P08RZ13_A130BarCodPar ;
   private String[] P08RZ19_A396EmprCod ;
   private String[] P08RZ19_A120BarAgrEst ;
   private String[] P08RZ19_A1234BarNomCli ;
   private String[] P08RZ19_A135BarColNom ;
   private String[] P08RZ19_A1652BarSerDsc ;
   private String[] P08RZ19_A212BarSer ;
   private String[] P08RZ19_A13696BarNHdr ;
   private java.math.BigDecimal[] P08RZ19_A871RecTotMtr ;
   private boolean[] P08RZ19_n871RecTotMtr ;
   private java.math.BigDecimal[] P08RZ19_A812RecTotKgm ;
   private boolean[] P08RZ19_n812RecTotKgm ;
   private int[] P08RZ19_A129BarCod ;
   private byte[] P08RZ19_A132BarCodReo ;
   private String[] P08RZ19_A130BarCodPar ;
   private String[] P08RZ25_A396EmprCod ;
   private String[] P08RZ25_A212BarSer ;
   private String[] P08RZ25_A1234BarNomCli ;
   private String[] P08RZ25_A135BarColNom ;
   private String[] P08RZ25_A1652BarSerDsc ;
   private String[] P08RZ25_A120BarAgrEst ;
   private String[] P08RZ25_A13696BarNHdr ;
   private java.math.BigDecimal[] P08RZ25_A871RecTotMtr ;
   private boolean[] P08RZ25_n871RecTotMtr ;
   private java.math.BigDecimal[] P08RZ25_A812RecTotKgm ;
   private boolean[] P08RZ25_n812RecTotKgm ;
   private int[] P08RZ25_A129BarCod ;
   private byte[] P08RZ25_A132BarCodReo ;
   private String[] P08RZ25_A130BarCodPar ;
   private String[] P08RZ31_A396EmprCod ;
   private String[] P08RZ31_A1652BarSerDsc ;
   private String[] P08RZ31_A1234BarNomCli ;
   private String[] P08RZ31_A135BarColNom ;
   private String[] P08RZ31_A212BarSer ;
   private String[] P08RZ31_A120BarAgrEst ;
   private String[] P08RZ31_A13696BarNHdr ;
   private java.math.BigDecimal[] P08RZ31_A871RecTotMtr ;
   private boolean[] P08RZ31_n871RecTotMtr ;
   private java.math.BigDecimal[] P08RZ31_A812RecTotKgm ;
   private boolean[] P08RZ31_n812RecTotKgm ;
   private int[] P08RZ31_A129BarCod ;
   private byte[] P08RZ31_A132BarCodReo ;
   private String[] P08RZ31_A130BarCodPar ;
   private String[] P08RZ37_A396EmprCod ;
   private String[] P08RZ37_A135BarColNom ;
   private String[] P08RZ37_A1234BarNomCli ;
   private String[] P08RZ37_A1652BarSerDsc ;
   private String[] P08RZ37_A212BarSer ;
   private String[] P08RZ37_A120BarAgrEst ;
   private String[] P08RZ37_A13696BarNHdr ;
   private java.math.BigDecimal[] P08RZ37_A871RecTotMtr ;
   private boolean[] P08RZ37_n871RecTotMtr ;
   private java.math.BigDecimal[] P08RZ37_A812RecTotKgm ;
   private boolean[] P08RZ37_n812RecTotKgm ;
   private int[] P08RZ37_A129BarCod ;
   private byte[] P08RZ37_A132BarCodReo ;
   private String[] P08RZ37_A130BarCodPar ;
   private String[] P08RZ43_A396EmprCod ;
   private String[] P08RZ43_A1234BarNomCli ;
   private String[] P08RZ43_A135BarColNom ;
   private String[] P08RZ43_A1652BarSerDsc ;
   private String[] P08RZ43_A212BarSer ;
   private String[] P08RZ43_A120BarAgrEst ;
   private String[] P08RZ43_A13696BarNHdr ;
   private java.math.BigDecimal[] P08RZ43_A871RecTotMtr ;
   private boolean[] P08RZ43_n871RecTotMtr ;
   private java.math.BigDecimal[] P08RZ43_A812RecTotKgm ;
   private boolean[] P08RZ43_n812RecTotKgm ;
   private int[] P08RZ43_A129BarCod ;
   private byte[] P08RZ43_A132BarCodReo ;
   private String[] P08RZ43_A130BarCodPar ;
   private String[] P08RZ49_A396EmprCod ;
   private String[] P08RZ49_A1234BarNomCli ;
   private String[] P08RZ49_A135BarColNom ;
   private String[] P08RZ49_A1652BarSerDsc ;
   private String[] P08RZ49_A212BarSer ;
   private String[] P08RZ49_A120BarAgrEst ;
   private String[] P08RZ49_A13696BarNHdr ;
   private java.math.BigDecimal[] P08RZ49_A871RecTotMtr ;
   private boolean[] P08RZ49_n871RecTotMtr ;
   private java.math.BigDecimal[] P08RZ49_A812RecTotKgm ;
   private boolean[] P08RZ49_n812RecTotKgm ;
   private int[] P08RZ49_A129BarCod ;
   private byte[] P08RZ49_A132BarCodReo ;
   private String[] P08RZ49_A130BarCodPar ;
   private String[] P08RZ55_A396EmprCod ;
   private String[] P08RZ55_A1234BarNomCli ;
   private String[] P08RZ55_A135BarColNom ;
   private String[] P08RZ55_A1652BarSerDsc ;
   private String[] P08RZ55_A212BarSer ;
   private String[] P08RZ55_A120BarAgrEst ;
   private String[] P08RZ55_A13696BarNHdr ;
   private java.math.BigDecimal[] P08RZ55_A871RecTotMtr ;
   private boolean[] P08RZ55_n871RecTotMtr ;
   private java.math.BigDecimal[] P08RZ55_A812RecTotKgm ;
   private boolean[] P08RZ55_n812RecTotKgm ;
   private int[] P08RZ55_A129BarCod ;
   private byte[] P08RZ55_A132BarCodReo ;
   private String[] P08RZ55_A130BarCodPar ;
   private String[] P08RZ61_A396EmprCod ;
   private String[] P08RZ61_A1234BarNomCli ;
   private String[] P08RZ61_A135BarColNom ;
   private String[] P08RZ61_A1652BarSerDsc ;
   private String[] P08RZ61_A212BarSer ;
   private String[] P08RZ61_A120BarAgrEst ;
   private String[] P08RZ61_A13696BarNHdr ;
   private java.math.BigDecimal[] P08RZ61_A871RecTotMtr ;
   private boolean[] P08RZ61_n871RecTotMtr ;
   private java.math.BigDecimal[] P08RZ61_A812RecTotKgm ;
   private boolean[] P08RZ61_n812RecTotKgm ;
   private int[] P08RZ61_A129BarCod ;
   private byte[] P08RZ61_A132BarCodReo ;
   private String[] P08RZ61_A130BarCodPar ;
   private GXSimpleCollection<String> AV19Options ;
   private GXSimpleCollection<String> AV22OptionsDesc ;
   private GXSimpleCollection<String> AV24OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV29GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV30GridStateFilterValue ;
}

final  class webwtrarecgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08RZ7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                          String AV74Webwtrarecds_2_tfbarnhdr ,
                                          short AV76Webwtrarecds_4_tfreclinmaq ,
                                          short AV77Webwtrarecds_5_tfreclinmaq_to ,
                                          String AV79Webwtrarecds_7_tfmaqcod_sel ,
                                          String AV78Webwtrarecds_6_tfmaqcod ,
                                          String AV81Webwtrarecds_9_tfbaragrest_sel ,
                                          String AV80Webwtrarecds_8_tfbaragrest ,
                                          String AV83Webwtrarecds_11_tfbarser_sel ,
                                          String AV82Webwtrarecds_10_tfbarser ,
                                          String AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                          String AV84Webwtrarecds_12_tfbarserdsc ,
                                          String AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                          String AV86Webwtrarecds_14_tfbarcolnom ,
                                          String AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                          String AV88Webwtrarecds_16_tfbarnomcli ,
                                          java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ,
                                          java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ,
                                          String AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                          String AV96Webwtrarecds_24_tfrecnumprg ,
                                          int AV98Webwtrarecds_26_tfrecvolprd ,
                                          int AV99Webwtrarecds_27_tfrecvolprd_to ,
                                          java.util.Date AV100Webwtrarecds_28_tfrecfecalt ,
                                          java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ,
                                          String AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                          String AV102Webwtrarecds_30_tfrecusrcod ,
                                          java.util.Date AV104Webwtrarecds_32_tfrecfecmod ,
                                          java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ,
                                          String AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                          String AV106Webwtrarecds_34_tfrecusrmod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          String A602MaqCod ,
                                          String A120BarAgrEst ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A2806RecFA ,
                                          String A5110RecNumPrg ,
                                          int A2805RecVolPrd ,
                                          String A4402RecUsrCod ,
                                          String A4868RecUsrMod ,
                                          String AV73Webwtrarecds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal A871RecTotMtr ,
                                          java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ,
                                          java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ,
                                          java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ,
                                          java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[43];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.RecTotMtr, 0) AS RecTotMtr, COALESCE( T2.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD" ;
      scmdbuf += " T1 INNER JOIN (SELECT CASE  WHEN COALESCE( T4.BarTotAgr, 0) <> 0 THEN COALESCE( T4.BarTotAgr, 0) + COALESCE( T5.BarKgm, 0) ELSE COALESCE( T5.BarKgm, 0) END AS RecTotKgm," ;
      scmdbuf += " T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, CASE  WHEN COALESCE( T6.BarTotMtr, 0) <> 0 THEN COALESCE( T6.BarTotMtr, 0) + COALESCE( T7.BarMtr, 0) ELSE COALESCE(" ;
      scmdbuf += " T7.BarMtr, 0) END AS RecTotMtr FROM ((((TXPBARCAD T3 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T3.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T3.BarCod AND T5.BarCodReo = T3.BarCodReo AND T5.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T3.EmprCod AND T6.BarCod = T3.BarCod AND T6.BarCodReo = T3.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T3.EmprCod AND T7.BarCod = T3.BarCod AND T7.BarCodReo = T3.BarCodReo AND T7.BarCodPar = T3.BarCodPar) ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotMtr, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) <= ?))");
      if ( (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Webwtrarecds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwtrarecds_8_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwtrarecds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwtrarecds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwtrarecds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwtrarecds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int2[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08RZ13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           String AV74Webwtrarecds_2_tfbarnhdr ,
                                           short AV76Webwtrarecds_4_tfreclinmaq ,
                                           short AV77Webwtrarecds_5_tfreclinmaq_to ,
                                           String AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           String AV78Webwtrarecds_6_tfmaqcod ,
                                           String AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           String AV80Webwtrarecds_8_tfbaragrest ,
                                           String AV83Webwtrarecds_11_tfbarser_sel ,
                                           String AV82Webwtrarecds_10_tfbarser ,
                                           String AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           String AV84Webwtrarecds_12_tfbarserdsc ,
                                           String AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           String AV86Webwtrarecds_14_tfbarcolnom ,
                                           String AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           String AV88Webwtrarecds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ,
                                           java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ,
                                           String AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           String AV96Webwtrarecds_24_tfrecnumprg ,
                                           int AV98Webwtrarecds_26_tfrecvolprd ,
                                           int AV99Webwtrarecds_27_tfrecvolprd_to ,
                                           java.util.Date AV100Webwtrarecds_28_tfrecfecalt ,
                                           java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           String AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           String AV102Webwtrarecds_30_tfrecusrcod ,
                                           java.util.Date AV104Webwtrarecds_32_tfrecfecmod ,
                                           java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           String AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           String AV106Webwtrarecds_34_tfrecusrmod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           String A602MaqCod ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A2806RecFA ,
                                           String A5110RecNumPrg ,
                                           int A2805RecVolPrd ,
                                           String A4402RecUsrCod ,
                                           String A4868RecUsrMod ,
                                           String AV73Webwtrarecds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal A871RecTotMtr ,
                                           java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ,
                                           java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ,
                                           java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[43];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.RecTotMtr, 0) AS RecTotMtr, COALESCE( T2.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD" ;
      scmdbuf += " T1 INNER JOIN (SELECT CASE  WHEN COALESCE( T4.BarTotAgr, 0) <> 0 THEN COALESCE( T4.BarTotAgr, 0) + COALESCE( T5.BarKgm, 0) ELSE COALESCE( T5.BarKgm, 0) END AS RecTotKgm," ;
      scmdbuf += " T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, CASE  WHEN COALESCE( T6.BarTotMtr, 0) <> 0 THEN COALESCE( T6.BarTotMtr, 0) + COALESCE( T7.BarMtr, 0) ELSE COALESCE(" ;
      scmdbuf += " T7.BarMtr, 0) END AS RecTotMtr FROM ((((TXPBARCAD T3 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T3.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T3.BarCod AND T5.BarCodReo = T3.BarCodReo AND T5.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T3.EmprCod AND T6.BarCod = T3.BarCod AND T6.BarCodReo = T3.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T3.EmprCod AND T7.BarCod = T3.BarCod AND T7.BarCodReo = T3.BarCodReo AND T7.BarCodPar = T3.BarCodPar) ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotMtr, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) <= ?))");
      if ( (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Webwtrarecds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int4[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwtrarecds_8_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int4[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwtrarecds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int4[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwtrarecds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int4[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwtrarecds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int4[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwtrarecds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int4[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08RZ19( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           String AV74Webwtrarecds_2_tfbarnhdr ,
                                           short AV76Webwtrarecds_4_tfreclinmaq ,
                                           short AV77Webwtrarecds_5_tfreclinmaq_to ,
                                           String AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           String AV78Webwtrarecds_6_tfmaqcod ,
                                           String AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           String AV80Webwtrarecds_8_tfbaragrest ,
                                           String AV83Webwtrarecds_11_tfbarser_sel ,
                                           String AV82Webwtrarecds_10_tfbarser ,
                                           String AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           String AV84Webwtrarecds_12_tfbarserdsc ,
                                           String AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           String AV86Webwtrarecds_14_tfbarcolnom ,
                                           String AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           String AV88Webwtrarecds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ,
                                           java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ,
                                           String AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           String AV96Webwtrarecds_24_tfrecnumprg ,
                                           int AV98Webwtrarecds_26_tfrecvolprd ,
                                           int AV99Webwtrarecds_27_tfrecvolprd_to ,
                                           java.util.Date AV100Webwtrarecds_28_tfrecfecalt ,
                                           java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           String AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           String AV102Webwtrarecds_30_tfrecusrcod ,
                                           java.util.Date AV104Webwtrarecds_32_tfrecfecmod ,
                                           java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           String AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           String AV106Webwtrarecds_34_tfrecusrmod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           String A602MaqCod ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A2806RecFA ,
                                           String A5110RecNumPrg ,
                                           int A2805RecVolPrd ,
                                           String A4402RecUsrCod ,
                                           String A4868RecUsrMod ,
                                           String AV73Webwtrarecds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal A871RecTotMtr ,
                                           java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ,
                                           java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ,
                                           java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[43];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarAgrEst, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.RecTotMtr, 0) AS RecTotMtr, COALESCE( T2.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD" ;
      scmdbuf += " T1 INNER JOIN (SELECT CASE  WHEN COALESCE( T4.BarTotAgr, 0) <> 0 THEN COALESCE( T4.BarTotAgr, 0) + COALESCE( T5.BarKgm, 0) ELSE COALESCE( T5.BarKgm, 0) END AS RecTotKgm," ;
      scmdbuf += " T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, CASE  WHEN COALESCE( T6.BarTotMtr, 0) <> 0 THEN COALESCE( T6.BarTotMtr, 0) + COALESCE( T7.BarMtr, 0) ELSE COALESCE(" ;
      scmdbuf += " T7.BarMtr, 0) END AS RecTotMtr FROM ((((TXPBARCAD T3 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T3.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T3.BarCod AND T5.BarCodReo = T3.BarCodReo AND T5.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T3.EmprCod AND T6.BarCod = T3.BarCod AND T6.BarCodReo = T3.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T3.EmprCod AND T7.BarCod = T3.BarCod AND T7.BarCodReo = T3.BarCodReo AND T7.BarCodPar = T3.BarCodPar) ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotMtr, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) <= ?))");
      if ( (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Webwtrarecds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwtrarecds_8_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwtrarecds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwtrarecds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwtrarecds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwtrarecds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarAgrEst" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08RZ25( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           String AV74Webwtrarecds_2_tfbarnhdr ,
                                           short AV76Webwtrarecds_4_tfreclinmaq ,
                                           short AV77Webwtrarecds_5_tfreclinmaq_to ,
                                           String AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           String AV78Webwtrarecds_6_tfmaqcod ,
                                           String AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           String AV80Webwtrarecds_8_tfbaragrest ,
                                           String AV83Webwtrarecds_11_tfbarser_sel ,
                                           String AV82Webwtrarecds_10_tfbarser ,
                                           String AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           String AV84Webwtrarecds_12_tfbarserdsc ,
                                           String AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           String AV86Webwtrarecds_14_tfbarcolnom ,
                                           String AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           String AV88Webwtrarecds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ,
                                           java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ,
                                           String AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           String AV96Webwtrarecds_24_tfrecnumprg ,
                                           int AV98Webwtrarecds_26_tfrecvolprd ,
                                           int AV99Webwtrarecds_27_tfrecvolprd_to ,
                                           java.util.Date AV100Webwtrarecds_28_tfrecfecalt ,
                                           java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           String AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           String AV102Webwtrarecds_30_tfrecusrcod ,
                                           java.util.Date AV104Webwtrarecds_32_tfrecfecmod ,
                                           java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           String AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           String AV106Webwtrarecds_34_tfrecusrmod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           String A602MaqCod ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A2806RecFA ,
                                           String A5110RecNumPrg ,
                                           int A2805RecVolPrd ,
                                           String A4402RecUsrCod ,
                                           String A4868RecUsrMod ,
                                           String AV73Webwtrarecds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal A871RecTotMtr ,
                                           java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ,
                                           java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ,
                                           java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[43];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarSer, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.RecTotMtr, 0) AS RecTotMtr, COALESCE( T2.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD" ;
      scmdbuf += " T1 INNER JOIN (SELECT CASE  WHEN COALESCE( T4.BarTotAgr, 0) <> 0 THEN COALESCE( T4.BarTotAgr, 0) + COALESCE( T5.BarKgm, 0) ELSE COALESCE( T5.BarKgm, 0) END AS RecTotKgm," ;
      scmdbuf += " T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, CASE  WHEN COALESCE( T6.BarTotMtr, 0) <> 0 THEN COALESCE( T6.BarTotMtr, 0) + COALESCE( T7.BarMtr, 0) ELSE COALESCE(" ;
      scmdbuf += " T7.BarMtr, 0) END AS RecTotMtr FROM ((((TXPBARCAD T3 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T3.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T3.BarCod AND T5.BarCodReo = T3.BarCodReo AND T5.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T3.EmprCod AND T6.BarCod = T3.BarCod AND T6.BarCodReo = T3.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T3.EmprCod AND T7.BarCod = T3.BarCod AND T7.BarCodReo = T3.BarCodReo AND T7.BarCodPar = T3.BarCodPar) ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotMtr, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) <= ?))");
      if ( (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Webwtrarecds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwtrarecds_8_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwtrarecds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwtrarecds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwtrarecds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwtrarecds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSer" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08RZ31( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           String AV74Webwtrarecds_2_tfbarnhdr ,
                                           short AV76Webwtrarecds_4_tfreclinmaq ,
                                           short AV77Webwtrarecds_5_tfreclinmaq_to ,
                                           String AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           String AV78Webwtrarecds_6_tfmaqcod ,
                                           String AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           String AV80Webwtrarecds_8_tfbaragrest ,
                                           String AV83Webwtrarecds_11_tfbarser_sel ,
                                           String AV82Webwtrarecds_10_tfbarser ,
                                           String AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           String AV84Webwtrarecds_12_tfbarserdsc ,
                                           String AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           String AV86Webwtrarecds_14_tfbarcolnom ,
                                           String AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           String AV88Webwtrarecds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ,
                                           java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ,
                                           String AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           String AV96Webwtrarecds_24_tfrecnumprg ,
                                           int AV98Webwtrarecds_26_tfrecvolprd ,
                                           int AV99Webwtrarecds_27_tfrecvolprd_to ,
                                           java.util.Date AV100Webwtrarecds_28_tfrecfecalt ,
                                           java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           String AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           String AV102Webwtrarecds_30_tfrecusrcod ,
                                           java.util.Date AV104Webwtrarecds_32_tfrecfecmod ,
                                           java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           String AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           String AV106Webwtrarecds_34_tfrecusrmod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           String A602MaqCod ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A2806RecFA ,
                                           String A5110RecNumPrg ,
                                           int A2805RecVolPrd ,
                                           String A4402RecUsrCod ,
                                           String A4868RecUsrMod ,
                                           String AV73Webwtrarecds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal A871RecTotMtr ,
                                           java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ,
                                           java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ,
                                           java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[43];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarSerDsc, T1.BarNomCli, T1.BarColNom, T1.BarSer, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.RecTotMtr, 0) AS RecTotMtr, COALESCE( T2.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD" ;
      scmdbuf += " T1 INNER JOIN (SELECT CASE  WHEN COALESCE( T4.BarTotAgr, 0) <> 0 THEN COALESCE( T4.BarTotAgr, 0) + COALESCE( T5.BarKgm, 0) ELSE COALESCE( T5.BarKgm, 0) END AS RecTotKgm," ;
      scmdbuf += " T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, CASE  WHEN COALESCE( T6.BarTotMtr, 0) <> 0 THEN COALESCE( T6.BarTotMtr, 0) + COALESCE( T7.BarMtr, 0) ELSE COALESCE(" ;
      scmdbuf += " T7.BarMtr, 0) END AS RecTotMtr FROM ((((TXPBARCAD T3 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T3.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T3.BarCod AND T5.BarCodReo = T3.BarCodReo AND T5.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T3.EmprCod AND T6.BarCod = T3.BarCod AND T6.BarCodReo = T3.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T3.EmprCod AND T7.BarCod = T3.BarCod AND T7.BarCodReo = T3.BarCodReo AND T7.BarCodPar = T3.BarCodPar) ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotMtr, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) <= ?))");
      if ( (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Webwtrarecds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwtrarecds_8_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int10[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwtrarecds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int10[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwtrarecds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int10[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwtrarecds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int10[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwtrarecds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int10[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarSerDsc" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08RZ37( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           String AV74Webwtrarecds_2_tfbarnhdr ,
                                           short AV76Webwtrarecds_4_tfreclinmaq ,
                                           short AV77Webwtrarecds_5_tfreclinmaq_to ,
                                           String AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           String AV78Webwtrarecds_6_tfmaqcod ,
                                           String AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           String AV80Webwtrarecds_8_tfbaragrest ,
                                           String AV83Webwtrarecds_11_tfbarser_sel ,
                                           String AV82Webwtrarecds_10_tfbarser ,
                                           String AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           String AV84Webwtrarecds_12_tfbarserdsc ,
                                           String AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           String AV86Webwtrarecds_14_tfbarcolnom ,
                                           String AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           String AV88Webwtrarecds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ,
                                           java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ,
                                           String AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           String AV96Webwtrarecds_24_tfrecnumprg ,
                                           int AV98Webwtrarecds_26_tfrecvolprd ,
                                           int AV99Webwtrarecds_27_tfrecvolprd_to ,
                                           java.util.Date AV100Webwtrarecds_28_tfrecfecalt ,
                                           java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           String AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           String AV102Webwtrarecds_30_tfrecusrcod ,
                                           java.util.Date AV104Webwtrarecds_32_tfrecfecmod ,
                                           java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           String AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           String AV106Webwtrarecds_34_tfrecusrmod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           String A602MaqCod ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A2806RecFA ,
                                           String A5110RecNumPrg ,
                                           int A2805RecVolPrd ,
                                           String A4402RecUsrCod ,
                                           String A4868RecUsrMod ,
                                           String AV73Webwtrarecds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal A871RecTotMtr ,
                                           java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ,
                                           java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ,
                                           java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[43];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarColNom, T1.BarNomCli, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.RecTotMtr, 0) AS RecTotMtr, COALESCE( T2.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD" ;
      scmdbuf += " T1 INNER JOIN (SELECT CASE  WHEN COALESCE( T4.BarTotAgr, 0) <> 0 THEN COALESCE( T4.BarTotAgr, 0) + COALESCE( T5.BarKgm, 0) ELSE COALESCE( T5.BarKgm, 0) END AS RecTotKgm," ;
      scmdbuf += " T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, CASE  WHEN COALESCE( T6.BarTotMtr, 0) <> 0 THEN COALESCE( T6.BarTotMtr, 0) + COALESCE( T7.BarMtr, 0) ELSE COALESCE(" ;
      scmdbuf += " T7.BarMtr, 0) END AS RecTotMtr FROM ((((TXPBARCAD T3 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T3.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T3.BarCod AND T5.BarCodReo = T3.BarCodReo AND T5.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T3.EmprCod AND T6.BarCod = T3.BarCod AND T6.BarCodReo = T3.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T3.EmprCod AND T7.BarCod = T3.BarCod AND T7.BarCodReo = T3.BarCodReo AND T7.BarCodPar = T3.BarCodPar) ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotMtr, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) <= ?))");
      if ( (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Webwtrarecds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int12[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwtrarecds_8_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int12[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwtrarecds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int12[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwtrarecds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int12[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwtrarecds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int12[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwtrarecds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int12[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarColNom" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08RZ43( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           String AV74Webwtrarecds_2_tfbarnhdr ,
                                           short AV76Webwtrarecds_4_tfreclinmaq ,
                                           short AV77Webwtrarecds_5_tfreclinmaq_to ,
                                           String AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           String AV78Webwtrarecds_6_tfmaqcod ,
                                           String AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           String AV80Webwtrarecds_8_tfbaragrest ,
                                           String AV83Webwtrarecds_11_tfbarser_sel ,
                                           String AV82Webwtrarecds_10_tfbarser ,
                                           String AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           String AV84Webwtrarecds_12_tfbarserdsc ,
                                           String AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           String AV86Webwtrarecds_14_tfbarcolnom ,
                                           String AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           String AV88Webwtrarecds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ,
                                           java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ,
                                           String AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           String AV96Webwtrarecds_24_tfrecnumprg ,
                                           int AV98Webwtrarecds_26_tfrecvolprd ,
                                           int AV99Webwtrarecds_27_tfrecvolprd_to ,
                                           java.util.Date AV100Webwtrarecds_28_tfrecfecalt ,
                                           java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           String AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           String AV102Webwtrarecds_30_tfrecusrcod ,
                                           java.util.Date AV104Webwtrarecds_32_tfrecfecmod ,
                                           java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           String AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           String AV106Webwtrarecds_34_tfrecusrmod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           String A602MaqCod ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A2806RecFA ,
                                           String A5110RecNumPrg ,
                                           int A2805RecVolPrd ,
                                           String A4402RecUsrCod ,
                                           String A4868RecUsrMod ,
                                           String AV73Webwtrarecds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal A871RecTotMtr ,
                                           java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ,
                                           java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ,
                                           java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[43];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.RecTotMtr, 0) AS RecTotMtr, COALESCE( T2.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD" ;
      scmdbuf += " T1 INNER JOIN (SELECT CASE  WHEN COALESCE( T4.BarTotAgr, 0) <> 0 THEN COALESCE( T4.BarTotAgr, 0) + COALESCE( T5.BarKgm, 0) ELSE COALESCE( T5.BarKgm, 0) END AS RecTotKgm," ;
      scmdbuf += " T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, CASE  WHEN COALESCE( T6.BarTotMtr, 0) <> 0 THEN COALESCE( T6.BarTotMtr, 0) + COALESCE( T7.BarMtr, 0) ELSE COALESCE(" ;
      scmdbuf += " T7.BarMtr, 0) END AS RecTotMtr FROM ((((TXPBARCAD T3 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T3.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T3.BarCod AND T5.BarCodReo = T3.BarCodReo AND T5.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T3.EmprCod AND T6.BarCod = T3.BarCod AND T6.BarCodReo = T3.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T3.EmprCod AND T7.BarCod = T3.BarCod AND T7.BarCodReo = T3.BarCodReo AND T7.BarCodPar = T3.BarCodPar) ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotMtr, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) <= ?))");
      if ( (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Webwtrarecds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwtrarecds_8_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwtrarecds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwtrarecds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwtrarecds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwtrarecds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.BarNomCli" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08RZ49( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           String AV74Webwtrarecds_2_tfbarnhdr ,
                                           short AV76Webwtrarecds_4_tfreclinmaq ,
                                           short AV77Webwtrarecds_5_tfreclinmaq_to ,
                                           String AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           String AV78Webwtrarecds_6_tfmaqcod ,
                                           String AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           String AV80Webwtrarecds_8_tfbaragrest ,
                                           String AV83Webwtrarecds_11_tfbarser_sel ,
                                           String AV82Webwtrarecds_10_tfbarser ,
                                           String AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           String AV84Webwtrarecds_12_tfbarserdsc ,
                                           String AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           String AV86Webwtrarecds_14_tfbarcolnom ,
                                           String AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           String AV88Webwtrarecds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ,
                                           java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ,
                                           String AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           String AV96Webwtrarecds_24_tfrecnumprg ,
                                           int AV98Webwtrarecds_26_tfrecvolprd ,
                                           int AV99Webwtrarecds_27_tfrecvolprd_to ,
                                           java.util.Date AV100Webwtrarecds_28_tfrecfecalt ,
                                           java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           String AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           String AV102Webwtrarecds_30_tfrecusrcod ,
                                           java.util.Date AV104Webwtrarecds_32_tfrecfecmod ,
                                           java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           String AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           String AV106Webwtrarecds_34_tfrecusrmod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           String A602MaqCod ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A2806RecFA ,
                                           String A5110RecNumPrg ,
                                           int A2805RecVolPrd ,
                                           String A4402RecUsrCod ,
                                           String A4868RecUsrMod ,
                                           String AV73Webwtrarecds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal A871RecTotMtr ,
                                           java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ,
                                           java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ,
                                           java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[43];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.RecTotMtr, 0) AS RecTotMtr, COALESCE( T2.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD" ;
      scmdbuf += " T1 INNER JOIN (SELECT CASE  WHEN COALESCE( T4.BarTotAgr, 0) <> 0 THEN COALESCE( T4.BarTotAgr, 0) + COALESCE( T5.BarKgm, 0) ELSE COALESCE( T5.BarKgm, 0) END AS RecTotKgm," ;
      scmdbuf += " T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, CASE  WHEN COALESCE( T6.BarTotMtr, 0) <> 0 THEN COALESCE( T6.BarTotMtr, 0) + COALESCE( T7.BarMtr, 0) ELSE COALESCE(" ;
      scmdbuf += " T7.BarMtr, 0) END AS RecTotMtr FROM ((((TXPBARCAD T3 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T3.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T3.BarCod AND T5.BarCodReo = T3.BarCodReo AND T5.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T3.EmprCod AND T6.BarCod = T3.BarCod AND T6.BarCodReo = T3.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T3.EmprCod AND T7.BarCod = T3.BarCod AND T7.BarCodReo = T3.BarCodReo AND T7.BarCodPar = T3.BarCodPar) ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotMtr, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) <= ?))");
      if ( (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Webwtrarecds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwtrarecds_8_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int16[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwtrarecds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int16[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwtrarecds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int16[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwtrarecds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int16[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwtrarecds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int16[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P08RZ55( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           String AV74Webwtrarecds_2_tfbarnhdr ,
                                           short AV76Webwtrarecds_4_tfreclinmaq ,
                                           short AV77Webwtrarecds_5_tfreclinmaq_to ,
                                           String AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           String AV78Webwtrarecds_6_tfmaqcod ,
                                           String AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           String AV80Webwtrarecds_8_tfbaragrest ,
                                           String AV83Webwtrarecds_11_tfbarser_sel ,
                                           String AV82Webwtrarecds_10_tfbarser ,
                                           String AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           String AV84Webwtrarecds_12_tfbarserdsc ,
                                           String AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           String AV86Webwtrarecds_14_tfbarcolnom ,
                                           String AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           String AV88Webwtrarecds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ,
                                           java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ,
                                           String AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           String AV96Webwtrarecds_24_tfrecnumprg ,
                                           int AV98Webwtrarecds_26_tfrecvolprd ,
                                           int AV99Webwtrarecds_27_tfrecvolprd_to ,
                                           java.util.Date AV100Webwtrarecds_28_tfrecfecalt ,
                                           java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           String AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           String AV102Webwtrarecds_30_tfrecusrcod ,
                                           java.util.Date AV104Webwtrarecds_32_tfrecfecmod ,
                                           java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           String AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           String AV106Webwtrarecds_34_tfrecusrmod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           String A602MaqCod ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A2806RecFA ,
                                           String A5110RecNumPrg ,
                                           int A2805RecVolPrd ,
                                           String A4402RecUsrCod ,
                                           String A4868RecUsrMod ,
                                           String AV73Webwtrarecds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal A871RecTotMtr ,
                                           java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ,
                                           java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ,
                                           java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[43];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.RecTotMtr, 0) AS RecTotMtr, COALESCE( T2.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD" ;
      scmdbuf += " T1 INNER JOIN (SELECT CASE  WHEN COALESCE( T4.BarTotAgr, 0) <> 0 THEN COALESCE( T4.BarTotAgr, 0) + COALESCE( T5.BarKgm, 0) ELSE COALESCE( T5.BarKgm, 0) END AS RecTotKgm," ;
      scmdbuf += " T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, CASE  WHEN COALESCE( T6.BarTotMtr, 0) <> 0 THEN COALESCE( T6.BarTotMtr, 0) + COALESCE( T7.BarMtr, 0) ELSE COALESCE(" ;
      scmdbuf += " T7.BarMtr, 0) END AS RecTotMtr FROM ((((TXPBARCAD T3 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T3.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T3.BarCod AND T5.BarCodReo = T3.BarCodReo AND T5.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T3.EmprCod AND T6.BarCod = T3.BarCod AND T6.BarCodReo = T3.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T3.EmprCod AND T7.BarCod = T3.BarCod AND T7.BarCodReo = T3.BarCodReo AND T7.BarCodPar = T3.BarCodPar) ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotMtr, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) <= ?))");
      if ( (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Webwtrarecds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int18[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwtrarecds_8_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int18[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwtrarecds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int18[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwtrarecds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int18[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwtrarecds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int18[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwtrarecds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int18[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_P08RZ61( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV75Webwtrarecds_3_tfbarnhdr_sel ,
                                           String AV74Webwtrarecds_2_tfbarnhdr ,
                                           short AV76Webwtrarecds_4_tfreclinmaq ,
                                           short AV77Webwtrarecds_5_tfreclinmaq_to ,
                                           String AV79Webwtrarecds_7_tfmaqcod_sel ,
                                           String AV78Webwtrarecds_6_tfmaqcod ,
                                           String AV81Webwtrarecds_9_tfbaragrest_sel ,
                                           String AV80Webwtrarecds_8_tfbaragrest ,
                                           String AV83Webwtrarecds_11_tfbarser_sel ,
                                           String AV82Webwtrarecds_10_tfbarser ,
                                           String AV85Webwtrarecds_13_tfbarserdsc_sel ,
                                           String AV84Webwtrarecds_12_tfbarserdsc ,
                                           String AV87Webwtrarecds_15_tfbarcolnom_sel ,
                                           String AV86Webwtrarecds_14_tfbarcolnom ,
                                           String AV89Webwtrarecds_17_tfbarnomcli_sel ,
                                           String AV88Webwtrarecds_16_tfbarnomcli ,
                                           java.math.BigDecimal AV94Webwtrarecds_22_tfrecfa ,
                                           java.math.BigDecimal AV95Webwtrarecds_23_tfrecfa_to ,
                                           String AV97Webwtrarecds_25_tfrecnumprg_sel ,
                                           String AV96Webwtrarecds_24_tfrecnumprg ,
                                           int AV98Webwtrarecds_26_tfrecvolprd ,
                                           int AV99Webwtrarecds_27_tfrecvolprd_to ,
                                           java.util.Date AV100Webwtrarecds_28_tfrecfecalt ,
                                           java.util.Date AV101Webwtrarecds_29_tfrecfecalt_to ,
                                           String AV103Webwtrarecds_31_tfrecusrcod_sel ,
                                           String AV102Webwtrarecds_30_tfrecusrcod ,
                                           java.util.Date AV104Webwtrarecds_32_tfrecfecmod ,
                                           java.util.Date AV105Webwtrarecds_33_tfrecfecmod_to ,
                                           String AV107Webwtrarecds_35_tfrecusrmod_sel ,
                                           String AV106Webwtrarecds_34_tfrecusrmod ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           short A2804RecLinMaq ,
                                           String A602MaqCod ,
                                           String A120BarAgrEst ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A2806RecFA ,
                                           String A5110RecNumPrg ,
                                           int A2805RecVolPrd ,
                                           String A4402RecUsrCod ,
                                           String A4868RecUsrMod ,
                                           String AV73Webwtrarecds_1_filterfulltext ,
                                           String A13696BarNHdr ,
                                           java.math.BigDecimal A812RecTotKgm ,
                                           java.math.BigDecimal A871RecTotMtr ,
                                           java.math.BigDecimal AV90Webwtrarecds_18_tfrectotkgm ,
                                           java.math.BigDecimal AV91Webwtrarecds_19_tfrectotkgm_to ,
                                           java.math.BigDecimal AV92Webwtrarecds_20_tfrectotmtr ,
                                           java.math.BigDecimal AV93Webwtrarecds_21_tfrectotmtr_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[43];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarAgrEst, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, COALESCE( T2.RecTotMtr, 0) AS RecTotMtr, COALESCE( T2.RecTotKgm, 0) AS RecTotKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPBARCAD" ;
      scmdbuf += " T1 INNER JOIN (SELECT CASE  WHEN COALESCE( T4.BarTotAgr, 0) <> 0 THEN COALESCE( T4.BarTotAgr, 0) + COALESCE( T5.BarKgm, 0) ELSE COALESCE( T5.BarKgm, 0) END AS RecTotKgm," ;
      scmdbuf += " T3.EmprCod, T3.BarCod, T3.BarCodReo, T3.BarCodPar, CASE  WHEN COALESCE( T6.BarTotMtr, 0) <> 0 THEN COALESCE( T6.BarTotMtr, 0) + COALESCE( T7.BarMtr, 0) ELSE COALESCE(" ;
      scmdbuf += " T7.BarMtr, 0) END AS RecTotMtr FROM ((((TXPBARCAD T3 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T3.EmprCod AND T4.BarCod = T3.BarCod AND T4.BarCodReo = T3.BarCodReo AND T4.BarCodPar = T3.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T3.EmprCod" ;
      scmdbuf += " AND T5.BarCod = T3.BarCod AND T5.BarCodReo = T3.BarCodReo AND T5.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(MtrAgr) AS BarTotMtr, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T3.EmprCod AND T6.BarCod = T3.BarCod AND T6.BarCodReo = T3.BarCodReo" ;
      scmdbuf += " AND T6.BarCodPar = T3.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar ) T7 ON T7.EmprCod = T3.EmprCod AND T7.BarCod = T3.BarCod AND T7.BarCodReo = T3.BarCodReo AND T7.BarCodPar = T3.BarCodPar) ) T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrEst) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotKgm, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T2.RecTotMtr, 0),'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'990.99'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.RecTotMtr, 0) <= ?))");
      if ( (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Webwtrarecds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Webwtrarecds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV80Webwtrarecds_8_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Webwtrarecds_9_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV82Webwtrarecds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Webwtrarecds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Webwtrarecds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Webwtrarecds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV86Webwtrarecds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Webwtrarecds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV88Webwtrarecds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Webwtrarecds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_P08RZ7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] );
            case 1 :
                  return conditional_P08RZ13(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] );
            case 2 :
                  return conditional_P08RZ19(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] );
            case 3 :
                  return conditional_P08RZ25(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] );
            case 4 :
                  return conditional_P08RZ31(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] );
            case 5 :
                  return conditional_P08RZ37(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] );
            case 6 :
                  return conditional_P08RZ43(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] );
            case 7 :
                  return conditional_P08RZ49(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] );
            case 8 :
                  return conditional_P08RZ55(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] );
            case 9 :
                  return conditional_P08RZ61(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (java.math.BigDecimal)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , (java.math.BigDecimal)dynConstraints[53] , (java.math.BigDecimal)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08RZ7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RZ13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RZ19", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RZ25", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RZ31", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RZ37", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RZ43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RZ49", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RZ55", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08RZ61", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 11);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
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
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
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
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
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
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
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
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
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
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
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
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               return;
            case 6 :
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
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               return;
            case 7 :
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
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               return;
            case 8 :
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
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               return;
            case 9 :
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
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 11);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               return;
      }
   }

}

