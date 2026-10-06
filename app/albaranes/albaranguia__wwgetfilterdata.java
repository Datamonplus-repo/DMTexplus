package app.albaranes ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class albaranguia__wwgetfilterdata extends GXProcedure
{
   public albaranguia__wwgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaranguia__wwgetfilterdata.class ), "" );
   }

   public albaranguia__wwgetfilterdata( int remoteHandle ,
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
      albaranguia__wwgetfilterdata.this.aP5 = new String[] {""};
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
      albaranguia__wwgetfilterdata.this.AV76DDOName = aP0;
      albaranguia__wwgetfilterdata.this.AV77SearchTxt = aP1;
      albaranguia__wwgetfilterdata.this.AV78SearchTxtTo = aP2;
      albaranguia__wwgetfilterdata.this.aP3 = aP3;
      albaranguia__wwgetfilterdata.this.aP4 = aP4;
      albaranguia__wwgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV66Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV69OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV76DDOName), "DDO_BARCODPAR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV76DDOName), "DDO_ALBSER") == 0 )
      {
         /* Execute user subroutine: 'LOADALBSEROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV76DDOName), "DDO_ALBCOLORCV") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOLORCVOPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV76DDOName), "DDO_ALBNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADALBNOMCLIOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV76DDOName), "DDO_CODCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADCODCODOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV76DDOName), "DDO_ALBTIRAS") == 0 )
      {
         /* Execute user subroutine: 'LOADALBTIRASOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV76DDOName), "DDO_ALBSINTEST") == 0 )
      {
         /* Execute user subroutine: 'LOADALBSINTESTOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV76DDOName), "DDO_ALBHDROBS") == 0 )
      {
         /* Execute user subroutine: 'LOADALBHDROBSOPTIONS' */
         S191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV79OptionsJson = AV66Options.toJSonString(false) ;
      AV80OptionsDescJson = AV68OptionsDesc.toJSonString(false) ;
      AV81OptionIndexesJson = AV69OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV71Session.getValue("Albaranes.AlbaranGuia__WWGridState"), "") == 0 )
      {
         AV73GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Albaranes.AlbaranGuia__WWGridState"), null, null);
      }
      else
      {
         AV73GridState.fromxml(AV71Session.getValue("Albaranes.AlbaranGuia__WWGridState"), null, null);
      }
      AV85GXV1 = 1 ;
      while ( AV85GXV1 <= AV73GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV74GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV73GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV85GXV1));
         if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV82FilterFullText = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV10TFBarCod = (int)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarCod_To = (int)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV12TFBarCodReo = (byte)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFBarCodReo_To = (byte)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV14TFBarCodPar = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV15TFBarCodPar_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER") == 0 )
         {
            AV16TFAlbSer = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER_SEL") == 0 )
         {
            AV17TFAlbSer_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLORCV") == 0 )
         {
            AV18TFAlbColorCv = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLORCV_SEL") == 0 )
         {
            AV19TFAlbColorCv_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI") == 0 )
         {
            AV20TFAlbNomCli = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI_SEL") == 0 )
         {
            AV21TFAlbNomCli_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNUM") == 0 )
         {
            AV22TFAlbColNum = (int)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV23TFAlbColNum_To = (int)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCODCOD") == 0 )
         {
            AV24TFCodCod = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCODCOD_SEL") == 0 )
         {
            AV25TFCodCod_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV26TFBarAlbKgmE = CommonUtil.decimalVal( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV27TFBarAlbKgmE_To = CommonUtil.decimalVal( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPREKGM") == 0 )
         {
            AV28TFBarPreKgm = CommonUtil.decimalVal( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFBarPreKgm_To = CommonUtil.decimalVal( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV30TFAlbHdrAnc = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFAlbHdrAnc_To = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV32TFAlbHdrgm2 = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFAlbHdrgm2_To = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV34TFBarAlbMtrE = CommonUtil.decimalVal( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV35TFBarAlbMtrE_To = CommonUtil.decimalVal( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPREMTR") == 0 )
         {
            AV36TFBarPreMtr = CommonUtil.decimalVal( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFBarPreMtr_To = CommonUtil.decimalVal( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV38TFBarAlbPie = (int)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarAlbPie_To = (int)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIRAS") == 0 )
         {
            AV40TFAlbTiras = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIRAS_SEL") == 0 )
         {
            AV41TFAlbTiras_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIRASKG") == 0 )
         {
            AV42TFAlbTirasKg = CommonUtil.decimalVal( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV43TFAlbTirasKg_To = CommonUtil.decimalVal( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSINTEST") == 0 )
         {
            AV44TFAlbSinTest = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSINTEST_SEL") == 0 )
         {
            AV45TFAlbSinTest_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV46TFTubCod = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFTubCod_To = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV48TFBarAlbTub = (int)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFBarAlbTub_To = (int)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV50TFAlbHdrObs = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV51TFAlbHdrObs_Sel = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPLASCOD") == 0 )
         {
            AV52TFPlasCod = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFPlasCod_To = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPLAS") == 0 )
         {
            AV54TFBarAlbPlas = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFBarAlbPlas_To = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPACACOD") == 0 )
         {
            AV56TFTipAcaCod = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFTipAcaCod_To = (short)(GXutil.lval( AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV58TFAlbProVal_SelsJson = AV74GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV59TFAlbProVal_Sels.fromJSonString(AV58TFAlbProVal_SelsJson, null);
         }
         AV85GXV1 = (int)(AV85GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarCodPar = AV77SearchTxt ;
      AV15TFBarCodPar_Sel = "" ;
      AV87Albaranes_albaranguia__wwds_1_filterfulltext = AV82FilterFullText ;
      AV88Albaranes_albaranguia__wwds_2_tfbarcod = AV10TFBarCod ;
      AV89Albaranes_albaranguia__wwds_3_tfbarcod_to = AV11TFBarCod_To ;
      AV90Albaranes_albaranguia__wwds_4_tfbarcodreo = AV12TFBarCodReo ;
      AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV92Albaranes_albaranguia__wwds_6_tfbarcodpar = AV14TFBarCodPar ;
      AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV94Albaranes_albaranguia__wwds_8_tfalbser = AV16TFAlbSer ;
      AV95Albaranes_albaranguia__wwds_9_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV18TFAlbColorCv ;
      AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV19TFAlbColorCv_Sel ;
      AV98Albaranes_albaranguia__wwds_12_tfalbnomcli = AV20TFAlbNomCli ;
      AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV100Albaranes_albaranguia__wwds_14_tfalbcolnum = AV22TFAlbColNum ;
      AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV23TFAlbColNum_To ;
      AV102Albaranes_albaranguia__wwds_16_tfcodcod = AV24TFCodCod ;
      AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV25TFCodCod_Sel ;
      AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV26TFBarAlbKgmE ;
      AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV27TFBarAlbKgmE_To ;
      AV106Albaranes_albaranguia__wwds_20_tfbarprekgm = AV28TFBarPreKgm ;
      AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV29TFBarPreKgm_To ;
      AV108Albaranes_albaranguia__wwds_22_tfalbhdranc = AV30TFAlbHdrAnc ;
      AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV31TFAlbHdrAnc_To ;
      AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV32TFAlbHdrgm2 ;
      AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV33TFAlbHdrgm2_To ;
      AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV114Albaranes_albaranguia__wwds_28_tfbarpremtr = AV36TFBarPreMtr ;
      AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV37TFBarPreMtr_To ;
      AV116Albaranes_albaranguia__wwds_30_tfbaralbpie = AV38TFBarAlbPie ;
      AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV118Albaranes_albaranguia__wwds_32_tfalbtiras = AV40TFAlbTiras ;
      AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV41TFAlbTiras_Sel ;
      AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV42TFAlbTirasKg ;
      AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV43TFAlbTirasKg_To ;
      AV122Albaranes_albaranguia__wwds_36_tfalbsintest = AV44TFAlbSinTest ;
      AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV45TFAlbSinTest_Sel ;
      AV124Albaranes_albaranguia__wwds_38_tftubcod = AV46TFTubCod ;
      AV125Albaranes_albaranguia__wwds_39_tftubcod_to = AV47TFTubCod_To ;
      AV126Albaranes_albaranguia__wwds_40_tfbaralbtub = AV48TFBarAlbTub ;
      AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV49TFBarAlbTub_To ;
      AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV130Albaranes_albaranguia__wwds_44_tfplascod = AV52TFPlasCod ;
      AV131Albaranes_albaranguia__wwds_45_tfplascod_to = AV53TFPlasCod_To ;
      AV132Albaranes_albaranguia__wwds_46_tfbaralbplas = AV54TFBarAlbPlas ;
      AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV55TFBarAlbPlas_To ;
      AV134Albaranes_albaranguia__wwds_48_tftipacacod = AV56TFTipAcaCod ;
      AV135Albaranes_albaranguia__wwds_49_tftipacacod_to = AV57TFTipAcaCod_To ;
      AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                           Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod) ,
                                           Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) ,
                                           AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                           AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                           AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                           AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                           AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                           AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                           Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) ,
                                           Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) ,
                                           AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                           AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                           AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                           AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                           AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                           AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                           Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) ,
                                           Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) ,
                                           AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                           AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                           AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                           AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) ,
                                           Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) ,
                                           AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                           AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                           AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                           AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                           AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                           AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                           Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod) ,
                                           Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to) ,
                                           Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) ,
                                           Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) ,
                                           AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                           AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                           Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod) ,
                                           Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to) ,
                                           Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) ,
                                           Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) ,
                                           Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod) ,
                                           Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) ,
                                           Integer.valueOf(AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A12232AlbNomCli ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A3153CodCod ,
                                           A1261BarAlbKgmE ,
                                           A1262BarPreKgm ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           A1264BarPreMtr ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           A14057AlbTiras ,
                                           A14058AlbTirasKg ,
                                           A14059AlbSinTest ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           A2441AlbHdrObs ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           Short.valueOf(A5051TipAcaCod) ,
                                           AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                           A14056AlbColorCv ,
                                           AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                           AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Albaranes_albaranguia__wwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV92Albaranes_albaranguia__wwds_6_tfbarcodpar), 1, "%") ;
      lV94Albaranes_albaranguia__wwds_8_tfalbser = GXutil.padr( GXutil.rtrim( AV94Albaranes_albaranguia__wwds_8_tfalbser), 16, "%") ;
      lV98Albaranes_albaranguia__wwds_12_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV98Albaranes_albaranguia__wwds_12_tfalbnomcli), 13, "%") ;
      lV102Albaranes_albaranguia__wwds_16_tfcodcod = GXutil.padr( GXutil.rtrim( AV102Albaranes_albaranguia__wwds_16_tfcodcod), 6, "%") ;
      lV118Albaranes_albaranguia__wwds_32_tfalbtiras = GXutil.padr( GXutil.rtrim( AV118Albaranes_albaranguia__wwds_32_tfalbtiras), 1, "%") ;
      lV122Albaranes_albaranguia__wwds_36_tfalbsintest = GXutil.padr( GXutil.rtrim( AV122Albaranes_albaranguia__wwds_36_tfalbsintest), 1, "%") ;
      lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs), 60, "%") ;
      /* Using cursor P09UR2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod), Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to), Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo), Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to), lV92Albaranes_albaranguia__wwds_6_tfbarcodpar, AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel, lV94Albaranes_albaranguia__wwds_8_tfalbser, AV95Albaranes_albaranguia__wwds_9_tfalbser_sel, lV98Albaranes_albaranguia__wwds_12_tfalbnomcli, AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel, Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum), Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to), lV102Albaranes_albaranguia__wwds_16_tfcodcod, AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to, Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc), Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to), Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2), Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to), AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to, Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie), Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to), lV118Albaranes_albaranguia__wwds_32_tfalbtiras, AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to, lV122Albaranes_albaranguia__wwds_36_tfalbsintest, AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel, Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod), Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to), Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub), Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to), lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs, AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel, Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod), Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to), Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas), Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to), Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod), Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk9UR2 = false ;
         A5051TipAcaCod = P09UR2_A5051TipAcaCod[0] ;
         A6467BarAlbPlas = P09UR2_A6467BarAlbPlas[0] ;
         A6466PlasCod = P09UR2_A6466PlasCod[0] ;
         n6466PlasCod = P09UR2_n6466PlasCod[0] ;
         A2441AlbHdrObs = P09UR2_A2441AlbHdrObs[0] ;
         A1266BarAlbTub = P09UR2_A1266BarAlbTub[0] ;
         A1206TubCod = P09UR2_A1206TubCod[0] ;
         n1206TubCod = P09UR2_n1206TubCod[0] ;
         A14059AlbSinTest = P09UR2_A14059AlbSinTest[0] ;
         A14058AlbTirasKg = P09UR2_A14058AlbTirasKg[0] ;
         A14057AlbTiras = P09UR2_A14057AlbTiras[0] ;
         A1265BarAlbPie = P09UR2_A1265BarAlbPie[0] ;
         A1264BarPreMtr = P09UR2_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P09UR2_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P09UR2_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P09UR2_A3271AlbHdrAnc[0] ;
         A1262BarPreKgm = P09UR2_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P09UR2_A1261BarAlbKgmE[0] ;
         A3153CodCod = P09UR2_A3153CodCod[0] ;
         n3153CodCod = P09UR2_n3153CodCod[0] ;
         A3393AlbColNum = P09UR2_A3393AlbColNum[0] ;
         A12232AlbNomCli = P09UR2_A12232AlbNomCli[0] ;
         A3391AlbSer = P09UR2_A3391AlbSer[0] ;
         A2839AlbProVal = P09UR2_A2839AlbProVal[0] ;
         A130BarCodPar = P09UR2_A130BarCodPar[0] ;
         A132BarCodReo = P09UR2_A132BarCodReo[0] ;
         A129BarCod = P09UR2_A129BarCod[0] ;
         A396EmprCod = P09UR2_A396EmprCod[0] ;
         A30AlbProCod = P09UR2_A30AlbProCod[0] ;
         GXt_char2 = A14056AlbColorCv ;
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_char7[0] = GXt_char2 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char6, GXv_char7) ;
         albaranguia__wwgetfilterdata.this.A396EmprCod = GXv_char3[0] ;
         albaranguia__wwgetfilterdata.this.A129BarCod = GXv_int4[0] ;
         albaranguia__wwgetfilterdata.this.A132BarCodReo = GXv_int5[0] ;
         albaranguia__wwgetfilterdata.this.A130BarCodPar = GXv_char6[0] ;
         albaranguia__wwgetfilterdata.this.GXt_char2 = GXv_char7[0] ;
         A14056AlbColorCv = GXt_char2 ;
         if ( (GXutil.strcmp("", AV87Albaranes_albaranguia__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3391AlbSer) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A12232AlbNomCli) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3393AlbColNum, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3153CodCod) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1261BarAlbKgmE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1262BarPreKgm, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3271AlbHdrAnc, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5019AlbHdrgm2, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1263BarAlbMtrE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1264BarPreMtr, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1265BarAlbPie, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14057AlbTiras) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14058AlbTirasKg, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14059AlbSinTest) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1206TubCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1266BarAlbTub, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2441AlbHdrObs) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6466PlasCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6467BarAlbPlas, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5051TipAcaCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "N", "")) == 0 ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) && ( ! (GXutil.strcmp("", AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv)==0) ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) || ( ( GXutil.strcmp(A14056AlbColorCv, AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel) == 0 ) ) )
               {
                  AV70count = 0 ;
                  while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P09UR2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
                  {
                     brk9UR2 = false ;
                     A132BarCodReo = P09UR2_A132BarCodReo[0] ;
                     A129BarCod = P09UR2_A129BarCod[0] ;
                     A396EmprCod = P09UR2_A396EmprCod[0] ;
                     A30AlbProCod = P09UR2_A30AlbProCod[0] ;
                     AV70count = (long)(AV70count+1) ;
                     brk9UR2 = true ;
                     pr_default.readNext(0);
                  }
                  if ( ! (GXutil.strcmp("", A130BarCodPar)==0) )
                  {
                     AV65Option = A130BarCodPar ;
                     AV66Options.add(AV65Option, 0);
                     AV69OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV66Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9UR2 )
         {
            brk9UR2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADALBSEROPTIONS' Routine */
      returnInSub = false ;
      AV16TFAlbSer = AV77SearchTxt ;
      AV17TFAlbSer_Sel = "" ;
      AV87Albaranes_albaranguia__wwds_1_filterfulltext = AV82FilterFullText ;
      AV88Albaranes_albaranguia__wwds_2_tfbarcod = AV10TFBarCod ;
      AV89Albaranes_albaranguia__wwds_3_tfbarcod_to = AV11TFBarCod_To ;
      AV90Albaranes_albaranguia__wwds_4_tfbarcodreo = AV12TFBarCodReo ;
      AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV92Albaranes_albaranguia__wwds_6_tfbarcodpar = AV14TFBarCodPar ;
      AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV94Albaranes_albaranguia__wwds_8_tfalbser = AV16TFAlbSer ;
      AV95Albaranes_albaranguia__wwds_9_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV18TFAlbColorCv ;
      AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV19TFAlbColorCv_Sel ;
      AV98Albaranes_albaranguia__wwds_12_tfalbnomcli = AV20TFAlbNomCli ;
      AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV100Albaranes_albaranguia__wwds_14_tfalbcolnum = AV22TFAlbColNum ;
      AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV23TFAlbColNum_To ;
      AV102Albaranes_albaranguia__wwds_16_tfcodcod = AV24TFCodCod ;
      AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV25TFCodCod_Sel ;
      AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV26TFBarAlbKgmE ;
      AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV27TFBarAlbKgmE_To ;
      AV106Albaranes_albaranguia__wwds_20_tfbarprekgm = AV28TFBarPreKgm ;
      AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV29TFBarPreKgm_To ;
      AV108Albaranes_albaranguia__wwds_22_tfalbhdranc = AV30TFAlbHdrAnc ;
      AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV31TFAlbHdrAnc_To ;
      AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV32TFAlbHdrgm2 ;
      AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV33TFAlbHdrgm2_To ;
      AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV114Albaranes_albaranguia__wwds_28_tfbarpremtr = AV36TFBarPreMtr ;
      AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV37TFBarPreMtr_To ;
      AV116Albaranes_albaranguia__wwds_30_tfbaralbpie = AV38TFBarAlbPie ;
      AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV118Albaranes_albaranguia__wwds_32_tfalbtiras = AV40TFAlbTiras ;
      AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV41TFAlbTiras_Sel ;
      AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV42TFAlbTirasKg ;
      AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV43TFAlbTirasKg_To ;
      AV122Albaranes_albaranguia__wwds_36_tfalbsintest = AV44TFAlbSinTest ;
      AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV45TFAlbSinTest_Sel ;
      AV124Albaranes_albaranguia__wwds_38_tftubcod = AV46TFTubCod ;
      AV125Albaranes_albaranguia__wwds_39_tftubcod_to = AV47TFTubCod_To ;
      AV126Albaranes_albaranguia__wwds_40_tfbaralbtub = AV48TFBarAlbTub ;
      AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV49TFBarAlbTub_To ;
      AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV130Albaranes_albaranguia__wwds_44_tfplascod = AV52TFPlasCod ;
      AV131Albaranes_albaranguia__wwds_45_tfplascod_to = AV53TFPlasCod_To ;
      AV132Albaranes_albaranguia__wwds_46_tfbaralbplas = AV54TFBarAlbPlas ;
      AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV55TFBarAlbPlas_To ;
      AV134Albaranes_albaranguia__wwds_48_tftipacacod = AV56TFTipAcaCod ;
      AV135Albaranes_albaranguia__wwds_49_tftipacacod_to = AV57TFTipAcaCod_To ;
      AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                           Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod) ,
                                           Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) ,
                                           AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                           AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                           AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                           AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                           AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                           AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                           Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) ,
                                           Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) ,
                                           AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                           AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                           AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                           AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                           AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                           AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                           Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) ,
                                           Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) ,
                                           AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                           AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                           AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                           AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) ,
                                           Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) ,
                                           AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                           AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                           AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                           AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                           AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                           AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                           Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod) ,
                                           Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to) ,
                                           Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) ,
                                           Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) ,
                                           AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                           AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                           Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod) ,
                                           Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to) ,
                                           Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) ,
                                           Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) ,
                                           Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod) ,
                                           Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) ,
                                           Integer.valueOf(AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A12232AlbNomCli ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A3153CodCod ,
                                           A1261BarAlbKgmE ,
                                           A1262BarPreKgm ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           A1264BarPreMtr ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           A14057AlbTiras ,
                                           A14058AlbTirasKg ,
                                           A14059AlbSinTest ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           A2441AlbHdrObs ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           Short.valueOf(A5051TipAcaCod) ,
                                           AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                           A14056AlbColorCv ,
                                           AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                           AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Albaranes_albaranguia__wwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV92Albaranes_albaranguia__wwds_6_tfbarcodpar), 1, "%") ;
      lV94Albaranes_albaranguia__wwds_8_tfalbser = GXutil.padr( GXutil.rtrim( AV94Albaranes_albaranguia__wwds_8_tfalbser), 16, "%") ;
      lV98Albaranes_albaranguia__wwds_12_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV98Albaranes_albaranguia__wwds_12_tfalbnomcli), 13, "%") ;
      lV102Albaranes_albaranguia__wwds_16_tfcodcod = GXutil.padr( GXutil.rtrim( AV102Albaranes_albaranguia__wwds_16_tfcodcod), 6, "%") ;
      lV118Albaranes_albaranguia__wwds_32_tfalbtiras = GXutil.padr( GXutil.rtrim( AV118Albaranes_albaranguia__wwds_32_tfalbtiras), 1, "%") ;
      lV122Albaranes_albaranguia__wwds_36_tfalbsintest = GXutil.padr( GXutil.rtrim( AV122Albaranes_albaranguia__wwds_36_tfalbsintest), 1, "%") ;
      lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs), 60, "%") ;
      /* Using cursor P09UR3 */
      pr_default.execute(1, new Object[] {Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod), Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to), Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo), Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to), lV92Albaranes_albaranguia__wwds_6_tfbarcodpar, AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel, lV94Albaranes_albaranguia__wwds_8_tfalbser, AV95Albaranes_albaranguia__wwds_9_tfalbser_sel, lV98Albaranes_albaranguia__wwds_12_tfalbnomcli, AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel, Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum), Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to), lV102Albaranes_albaranguia__wwds_16_tfcodcod, AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to, Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc), Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to), Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2), Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to), AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to, Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie), Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to), lV118Albaranes_albaranguia__wwds_32_tfalbtiras, AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to, lV122Albaranes_albaranguia__wwds_36_tfalbsintest, AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel, Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod), Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to), Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub), Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to), lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs, AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel, Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod), Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to), Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas), Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to), Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod), Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk9UR4 = false ;
         A3391AlbSer = P09UR3_A3391AlbSer[0] ;
         A5051TipAcaCod = P09UR3_A5051TipAcaCod[0] ;
         A6467BarAlbPlas = P09UR3_A6467BarAlbPlas[0] ;
         A6466PlasCod = P09UR3_A6466PlasCod[0] ;
         n6466PlasCod = P09UR3_n6466PlasCod[0] ;
         A2441AlbHdrObs = P09UR3_A2441AlbHdrObs[0] ;
         A1266BarAlbTub = P09UR3_A1266BarAlbTub[0] ;
         A1206TubCod = P09UR3_A1206TubCod[0] ;
         n1206TubCod = P09UR3_n1206TubCod[0] ;
         A14059AlbSinTest = P09UR3_A14059AlbSinTest[0] ;
         A14058AlbTirasKg = P09UR3_A14058AlbTirasKg[0] ;
         A14057AlbTiras = P09UR3_A14057AlbTiras[0] ;
         A1265BarAlbPie = P09UR3_A1265BarAlbPie[0] ;
         A1264BarPreMtr = P09UR3_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P09UR3_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P09UR3_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P09UR3_A3271AlbHdrAnc[0] ;
         A1262BarPreKgm = P09UR3_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P09UR3_A1261BarAlbKgmE[0] ;
         A3153CodCod = P09UR3_A3153CodCod[0] ;
         n3153CodCod = P09UR3_n3153CodCod[0] ;
         A3393AlbColNum = P09UR3_A3393AlbColNum[0] ;
         A12232AlbNomCli = P09UR3_A12232AlbNomCli[0] ;
         A2839AlbProVal = P09UR3_A2839AlbProVal[0] ;
         A130BarCodPar = P09UR3_A130BarCodPar[0] ;
         A132BarCodReo = P09UR3_A132BarCodReo[0] ;
         A129BarCod = P09UR3_A129BarCod[0] ;
         A396EmprCod = P09UR3_A396EmprCod[0] ;
         A30AlbProCod = P09UR3_A30AlbProCod[0] ;
         GXt_char2 = A14056AlbColorCv ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_char3[0] = GXt_char2 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int5, GXv_char6, GXv_char3) ;
         albaranguia__wwgetfilterdata.this.A396EmprCod = GXv_char7[0] ;
         albaranguia__wwgetfilterdata.this.A129BarCod = GXv_int4[0] ;
         albaranguia__wwgetfilterdata.this.A132BarCodReo = GXv_int5[0] ;
         albaranguia__wwgetfilterdata.this.A130BarCodPar = GXv_char6[0] ;
         albaranguia__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14056AlbColorCv = GXt_char2 ;
         if ( (GXutil.strcmp("", AV87Albaranes_albaranguia__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3391AlbSer) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A12232AlbNomCli) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3393AlbColNum, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3153CodCod) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1261BarAlbKgmE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1262BarPreKgm, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3271AlbHdrAnc, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5019AlbHdrgm2, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1263BarAlbMtrE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1264BarPreMtr, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1265BarAlbPie, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14057AlbTiras) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14058AlbTirasKg, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14059AlbSinTest) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1206TubCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1266BarAlbTub, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2441AlbHdrObs) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6466PlasCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6467BarAlbPlas, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5051TipAcaCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "N", "")) == 0 ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) && ( ! (GXutil.strcmp("", AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv)==0) ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) || ( ( GXutil.strcmp(A14056AlbColorCv, AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel) == 0 ) ) )
               {
                  AV70count = 0 ;
                  while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P09UR3_A3391AlbSer[0], A3391AlbSer) == 0 ) )
                  {
                     brk9UR4 = false ;
                     A130BarCodPar = P09UR3_A130BarCodPar[0] ;
                     A132BarCodReo = P09UR3_A132BarCodReo[0] ;
                     A129BarCod = P09UR3_A129BarCod[0] ;
                     A396EmprCod = P09UR3_A396EmprCod[0] ;
                     A30AlbProCod = P09UR3_A30AlbProCod[0] ;
                     AV70count = (long)(AV70count+1) ;
                     brk9UR4 = true ;
                     pr_default.readNext(1);
                  }
                  if ( ! (GXutil.strcmp("", A3391AlbSer)==0) )
                  {
                     AV65Option = A3391AlbSer ;
                     AV66Options.add(AV65Option, 0);
                     AV69OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV66Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9UR4 )
         {
            brk9UR4 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBCOLORCVOPTIONS' Routine */
      returnInSub = false ;
      AV18TFAlbColorCv = AV77SearchTxt ;
      AV19TFAlbColorCv_Sel = "" ;
      AV87Albaranes_albaranguia__wwds_1_filterfulltext = AV82FilterFullText ;
      AV88Albaranes_albaranguia__wwds_2_tfbarcod = AV10TFBarCod ;
      AV89Albaranes_albaranguia__wwds_3_tfbarcod_to = AV11TFBarCod_To ;
      AV90Albaranes_albaranguia__wwds_4_tfbarcodreo = AV12TFBarCodReo ;
      AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV92Albaranes_albaranguia__wwds_6_tfbarcodpar = AV14TFBarCodPar ;
      AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV94Albaranes_albaranguia__wwds_8_tfalbser = AV16TFAlbSer ;
      AV95Albaranes_albaranguia__wwds_9_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV18TFAlbColorCv ;
      AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV19TFAlbColorCv_Sel ;
      AV98Albaranes_albaranguia__wwds_12_tfalbnomcli = AV20TFAlbNomCli ;
      AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV100Albaranes_albaranguia__wwds_14_tfalbcolnum = AV22TFAlbColNum ;
      AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV23TFAlbColNum_To ;
      AV102Albaranes_albaranguia__wwds_16_tfcodcod = AV24TFCodCod ;
      AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV25TFCodCod_Sel ;
      AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV26TFBarAlbKgmE ;
      AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV27TFBarAlbKgmE_To ;
      AV106Albaranes_albaranguia__wwds_20_tfbarprekgm = AV28TFBarPreKgm ;
      AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV29TFBarPreKgm_To ;
      AV108Albaranes_albaranguia__wwds_22_tfalbhdranc = AV30TFAlbHdrAnc ;
      AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV31TFAlbHdrAnc_To ;
      AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV32TFAlbHdrgm2 ;
      AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV33TFAlbHdrgm2_To ;
      AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV114Albaranes_albaranguia__wwds_28_tfbarpremtr = AV36TFBarPreMtr ;
      AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV37TFBarPreMtr_To ;
      AV116Albaranes_albaranguia__wwds_30_tfbaralbpie = AV38TFBarAlbPie ;
      AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV118Albaranes_albaranguia__wwds_32_tfalbtiras = AV40TFAlbTiras ;
      AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV41TFAlbTiras_Sel ;
      AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV42TFAlbTirasKg ;
      AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV43TFAlbTirasKg_To ;
      AV122Albaranes_albaranguia__wwds_36_tfalbsintest = AV44TFAlbSinTest ;
      AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV45TFAlbSinTest_Sel ;
      AV124Albaranes_albaranguia__wwds_38_tftubcod = AV46TFTubCod ;
      AV125Albaranes_albaranguia__wwds_39_tftubcod_to = AV47TFTubCod_To ;
      AV126Albaranes_albaranguia__wwds_40_tfbaralbtub = AV48TFBarAlbTub ;
      AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV49TFBarAlbTub_To ;
      AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV130Albaranes_albaranguia__wwds_44_tfplascod = AV52TFPlasCod ;
      AV131Albaranes_albaranguia__wwds_45_tfplascod_to = AV53TFPlasCod_To ;
      AV132Albaranes_albaranguia__wwds_46_tfbaralbplas = AV54TFBarAlbPlas ;
      AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV55TFBarAlbPlas_To ;
      AV134Albaranes_albaranguia__wwds_48_tftipacacod = AV56TFTipAcaCod ;
      AV135Albaranes_albaranguia__wwds_49_tftipacacod_to = AV57TFTipAcaCod_To ;
      AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                           Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod) ,
                                           Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) ,
                                           AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                           AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                           AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                           AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                           AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                           AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                           Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) ,
                                           Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) ,
                                           AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                           AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                           AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                           AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                           AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                           AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                           Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) ,
                                           Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) ,
                                           AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                           AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                           AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                           AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) ,
                                           Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) ,
                                           AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                           AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                           AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                           AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                           AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                           AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                           Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod) ,
                                           Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to) ,
                                           Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) ,
                                           Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) ,
                                           AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                           AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                           Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod) ,
                                           Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to) ,
                                           Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) ,
                                           Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) ,
                                           Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod) ,
                                           Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) ,
                                           Integer.valueOf(AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A12232AlbNomCli ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A3153CodCod ,
                                           A1261BarAlbKgmE ,
                                           A1262BarPreKgm ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           A1264BarPreMtr ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           A14057AlbTiras ,
                                           A14058AlbTirasKg ,
                                           A14059AlbSinTest ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           A2441AlbHdrObs ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           Short.valueOf(A5051TipAcaCod) ,
                                           AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                           A14056AlbColorCv ,
                                           AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                           AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Albaranes_albaranguia__wwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV92Albaranes_albaranguia__wwds_6_tfbarcodpar), 1, "%") ;
      lV94Albaranes_albaranguia__wwds_8_tfalbser = GXutil.padr( GXutil.rtrim( AV94Albaranes_albaranguia__wwds_8_tfalbser), 16, "%") ;
      lV98Albaranes_albaranguia__wwds_12_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV98Albaranes_albaranguia__wwds_12_tfalbnomcli), 13, "%") ;
      lV102Albaranes_albaranguia__wwds_16_tfcodcod = GXutil.padr( GXutil.rtrim( AV102Albaranes_albaranguia__wwds_16_tfcodcod), 6, "%") ;
      lV118Albaranes_albaranguia__wwds_32_tfalbtiras = GXutil.padr( GXutil.rtrim( AV118Albaranes_albaranguia__wwds_32_tfalbtiras), 1, "%") ;
      lV122Albaranes_albaranguia__wwds_36_tfalbsintest = GXutil.padr( GXutil.rtrim( AV122Albaranes_albaranguia__wwds_36_tfalbsintest), 1, "%") ;
      lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs), 60, "%") ;
      /* Using cursor P09UR4 */
      pr_default.execute(2, new Object[] {Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod), Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to), Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo), Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to), lV92Albaranes_albaranguia__wwds_6_tfbarcodpar, AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel, lV94Albaranes_albaranguia__wwds_8_tfalbser, AV95Albaranes_albaranguia__wwds_9_tfalbser_sel, lV98Albaranes_albaranguia__wwds_12_tfalbnomcli, AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel, Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum), Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to), lV102Albaranes_albaranguia__wwds_16_tfcodcod, AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to, Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc), Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to), Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2), Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to), AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to, Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie), Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to), lV118Albaranes_albaranguia__wwds_32_tfalbtiras, AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to, lV122Albaranes_albaranguia__wwds_36_tfalbsintest, AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel, Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod), Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to), Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub), Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to), lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs, AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel, Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod), Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to), Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas), Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to), Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod), Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A5051TipAcaCod = P09UR4_A5051TipAcaCod[0] ;
         A6467BarAlbPlas = P09UR4_A6467BarAlbPlas[0] ;
         A6466PlasCod = P09UR4_A6466PlasCod[0] ;
         n6466PlasCod = P09UR4_n6466PlasCod[0] ;
         A2441AlbHdrObs = P09UR4_A2441AlbHdrObs[0] ;
         A1266BarAlbTub = P09UR4_A1266BarAlbTub[0] ;
         A1206TubCod = P09UR4_A1206TubCod[0] ;
         n1206TubCod = P09UR4_n1206TubCod[0] ;
         A14059AlbSinTest = P09UR4_A14059AlbSinTest[0] ;
         A14058AlbTirasKg = P09UR4_A14058AlbTirasKg[0] ;
         A14057AlbTiras = P09UR4_A14057AlbTiras[0] ;
         A1265BarAlbPie = P09UR4_A1265BarAlbPie[0] ;
         A1264BarPreMtr = P09UR4_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P09UR4_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P09UR4_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P09UR4_A3271AlbHdrAnc[0] ;
         A1262BarPreKgm = P09UR4_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P09UR4_A1261BarAlbKgmE[0] ;
         A3153CodCod = P09UR4_A3153CodCod[0] ;
         n3153CodCod = P09UR4_n3153CodCod[0] ;
         A3393AlbColNum = P09UR4_A3393AlbColNum[0] ;
         A12232AlbNomCli = P09UR4_A12232AlbNomCli[0] ;
         A3391AlbSer = P09UR4_A3391AlbSer[0] ;
         A2839AlbProVal = P09UR4_A2839AlbProVal[0] ;
         A130BarCodPar = P09UR4_A130BarCodPar[0] ;
         A132BarCodReo = P09UR4_A132BarCodReo[0] ;
         A129BarCod = P09UR4_A129BarCod[0] ;
         A396EmprCod = P09UR4_A396EmprCod[0] ;
         A30AlbProCod = P09UR4_A30AlbProCod[0] ;
         GXt_char2 = A14056AlbColorCv ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_char3[0] = GXt_char2 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int5, GXv_char6, GXv_char3) ;
         albaranguia__wwgetfilterdata.this.A396EmprCod = GXv_char7[0] ;
         albaranguia__wwgetfilterdata.this.A129BarCod = GXv_int4[0] ;
         albaranguia__wwgetfilterdata.this.A132BarCodReo = GXv_int5[0] ;
         albaranguia__wwgetfilterdata.this.A130BarCodPar = GXv_char6[0] ;
         albaranguia__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14056AlbColorCv = GXt_char2 ;
         if ( (GXutil.strcmp("", AV87Albaranes_albaranguia__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3391AlbSer) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A12232AlbNomCli) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3393AlbColNum, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3153CodCod) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1261BarAlbKgmE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1262BarPreKgm, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3271AlbHdrAnc, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5019AlbHdrgm2, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1263BarAlbMtrE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1264BarPreMtr, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1265BarAlbPie, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14057AlbTiras) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14058AlbTirasKg, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14059AlbSinTest) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1206TubCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1266BarAlbTub, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2441AlbHdrObs) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6466PlasCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6467BarAlbPlas, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5051TipAcaCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "N", "")) == 0 ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) && ( ! (GXutil.strcmp("", AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv)==0) ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) || ( ( GXutil.strcmp(A14056AlbColorCv, AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel) == 0 ) ) )
               {
                  if ( ! (GXutil.strcmp("", A14056AlbColorCv)==0) )
                  {
                     AV65Option = A14056AlbColorCv ;
                     AV64InsertIndex = 1 ;
                     while ( ( AV64InsertIndex <= AV66Options.size() ) && ( GXutil.strcmp((String)AV66Options.elementAt(-1+AV64InsertIndex), AV65Option) < 0 ) )
                     {
                        AV64InsertIndex = (int)(AV64InsertIndex+1) ;
                     }
                     if ( ( AV64InsertIndex <= AV66Options.size() ) && ( GXutil.strcmp((String)AV66Options.elementAt(-1+AV64InsertIndex), AV65Option) == 0 ) )
                     {
                        AV70count = GXutil.lval( (String)AV69OptionIndexes.elementAt(-1+AV64InsertIndex)) ;
                        AV70count = (long)(AV70count+1) ;
                        AV69OptionIndexes.removeItem(AV64InsertIndex);
                        AV69OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), AV64InsertIndex);
                     }
                     else
                     {
                        AV66Options.add(AV65Option, AV64InsertIndex);
                        AV69OptionIndexes.add("1", AV64InsertIndex);
                     }
                  }
                  if ( AV66Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV20TFAlbNomCli = AV77SearchTxt ;
      AV21TFAlbNomCli_Sel = "" ;
      AV87Albaranes_albaranguia__wwds_1_filterfulltext = AV82FilterFullText ;
      AV88Albaranes_albaranguia__wwds_2_tfbarcod = AV10TFBarCod ;
      AV89Albaranes_albaranguia__wwds_3_tfbarcod_to = AV11TFBarCod_To ;
      AV90Albaranes_albaranguia__wwds_4_tfbarcodreo = AV12TFBarCodReo ;
      AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV92Albaranes_albaranguia__wwds_6_tfbarcodpar = AV14TFBarCodPar ;
      AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV94Albaranes_albaranguia__wwds_8_tfalbser = AV16TFAlbSer ;
      AV95Albaranes_albaranguia__wwds_9_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV18TFAlbColorCv ;
      AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV19TFAlbColorCv_Sel ;
      AV98Albaranes_albaranguia__wwds_12_tfalbnomcli = AV20TFAlbNomCli ;
      AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV100Albaranes_albaranguia__wwds_14_tfalbcolnum = AV22TFAlbColNum ;
      AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV23TFAlbColNum_To ;
      AV102Albaranes_albaranguia__wwds_16_tfcodcod = AV24TFCodCod ;
      AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV25TFCodCod_Sel ;
      AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV26TFBarAlbKgmE ;
      AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV27TFBarAlbKgmE_To ;
      AV106Albaranes_albaranguia__wwds_20_tfbarprekgm = AV28TFBarPreKgm ;
      AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV29TFBarPreKgm_To ;
      AV108Albaranes_albaranguia__wwds_22_tfalbhdranc = AV30TFAlbHdrAnc ;
      AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV31TFAlbHdrAnc_To ;
      AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV32TFAlbHdrgm2 ;
      AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV33TFAlbHdrgm2_To ;
      AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV114Albaranes_albaranguia__wwds_28_tfbarpremtr = AV36TFBarPreMtr ;
      AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV37TFBarPreMtr_To ;
      AV116Albaranes_albaranguia__wwds_30_tfbaralbpie = AV38TFBarAlbPie ;
      AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV118Albaranes_albaranguia__wwds_32_tfalbtiras = AV40TFAlbTiras ;
      AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV41TFAlbTiras_Sel ;
      AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV42TFAlbTirasKg ;
      AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV43TFAlbTirasKg_To ;
      AV122Albaranes_albaranguia__wwds_36_tfalbsintest = AV44TFAlbSinTest ;
      AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV45TFAlbSinTest_Sel ;
      AV124Albaranes_albaranguia__wwds_38_tftubcod = AV46TFTubCod ;
      AV125Albaranes_albaranguia__wwds_39_tftubcod_to = AV47TFTubCod_To ;
      AV126Albaranes_albaranguia__wwds_40_tfbaralbtub = AV48TFBarAlbTub ;
      AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV49TFBarAlbTub_To ;
      AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV130Albaranes_albaranguia__wwds_44_tfplascod = AV52TFPlasCod ;
      AV131Albaranes_albaranguia__wwds_45_tfplascod_to = AV53TFPlasCod_To ;
      AV132Albaranes_albaranguia__wwds_46_tfbaralbplas = AV54TFBarAlbPlas ;
      AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV55TFBarAlbPlas_To ;
      AV134Albaranes_albaranguia__wwds_48_tftipacacod = AV56TFTipAcaCod ;
      AV135Albaranes_albaranguia__wwds_49_tftipacacod_to = AV57TFTipAcaCod_To ;
      AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                           Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod) ,
                                           Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) ,
                                           AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                           AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                           AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                           AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                           AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                           AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                           Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) ,
                                           Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) ,
                                           AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                           AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                           AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                           AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                           AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                           AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                           Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) ,
                                           Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) ,
                                           AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                           AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                           AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                           AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) ,
                                           Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) ,
                                           AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                           AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                           AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                           AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                           AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                           AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                           Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod) ,
                                           Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to) ,
                                           Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) ,
                                           Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) ,
                                           AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                           AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                           Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod) ,
                                           Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to) ,
                                           Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) ,
                                           Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) ,
                                           Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod) ,
                                           Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) ,
                                           Integer.valueOf(AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A12232AlbNomCli ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A3153CodCod ,
                                           A1261BarAlbKgmE ,
                                           A1262BarPreKgm ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           A1264BarPreMtr ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           A14057AlbTiras ,
                                           A14058AlbTirasKg ,
                                           A14059AlbSinTest ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           A2441AlbHdrObs ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           Short.valueOf(A5051TipAcaCod) ,
                                           AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                           A14056AlbColorCv ,
                                           AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                           AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Albaranes_albaranguia__wwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV92Albaranes_albaranguia__wwds_6_tfbarcodpar), 1, "%") ;
      lV94Albaranes_albaranguia__wwds_8_tfalbser = GXutil.padr( GXutil.rtrim( AV94Albaranes_albaranguia__wwds_8_tfalbser), 16, "%") ;
      lV98Albaranes_albaranguia__wwds_12_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV98Albaranes_albaranguia__wwds_12_tfalbnomcli), 13, "%") ;
      lV102Albaranes_albaranguia__wwds_16_tfcodcod = GXutil.padr( GXutil.rtrim( AV102Albaranes_albaranguia__wwds_16_tfcodcod), 6, "%") ;
      lV118Albaranes_albaranguia__wwds_32_tfalbtiras = GXutil.padr( GXutil.rtrim( AV118Albaranes_albaranguia__wwds_32_tfalbtiras), 1, "%") ;
      lV122Albaranes_albaranguia__wwds_36_tfalbsintest = GXutil.padr( GXutil.rtrim( AV122Albaranes_albaranguia__wwds_36_tfalbsintest), 1, "%") ;
      lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs), 60, "%") ;
      /* Using cursor P09UR5 */
      pr_default.execute(3, new Object[] {Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod), Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to), Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo), Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to), lV92Albaranes_albaranguia__wwds_6_tfbarcodpar, AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel, lV94Albaranes_albaranguia__wwds_8_tfalbser, AV95Albaranes_albaranguia__wwds_9_tfalbser_sel, lV98Albaranes_albaranguia__wwds_12_tfalbnomcli, AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel, Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum), Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to), lV102Albaranes_albaranguia__wwds_16_tfcodcod, AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to, Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc), Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to), Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2), Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to), AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to, Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie), Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to), lV118Albaranes_albaranguia__wwds_32_tfalbtiras, AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to, lV122Albaranes_albaranguia__wwds_36_tfalbsintest, AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel, Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod), Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to), Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub), Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to), lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs, AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel, Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod), Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to), Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas), Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to), Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod), Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk9UR7 = false ;
         A12232AlbNomCli = P09UR5_A12232AlbNomCli[0] ;
         A5051TipAcaCod = P09UR5_A5051TipAcaCod[0] ;
         A6467BarAlbPlas = P09UR5_A6467BarAlbPlas[0] ;
         A6466PlasCod = P09UR5_A6466PlasCod[0] ;
         n6466PlasCod = P09UR5_n6466PlasCod[0] ;
         A2441AlbHdrObs = P09UR5_A2441AlbHdrObs[0] ;
         A1266BarAlbTub = P09UR5_A1266BarAlbTub[0] ;
         A1206TubCod = P09UR5_A1206TubCod[0] ;
         n1206TubCod = P09UR5_n1206TubCod[0] ;
         A14059AlbSinTest = P09UR5_A14059AlbSinTest[0] ;
         A14058AlbTirasKg = P09UR5_A14058AlbTirasKg[0] ;
         A14057AlbTiras = P09UR5_A14057AlbTiras[0] ;
         A1265BarAlbPie = P09UR5_A1265BarAlbPie[0] ;
         A1264BarPreMtr = P09UR5_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P09UR5_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P09UR5_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P09UR5_A3271AlbHdrAnc[0] ;
         A1262BarPreKgm = P09UR5_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P09UR5_A1261BarAlbKgmE[0] ;
         A3153CodCod = P09UR5_A3153CodCod[0] ;
         n3153CodCod = P09UR5_n3153CodCod[0] ;
         A3393AlbColNum = P09UR5_A3393AlbColNum[0] ;
         A3391AlbSer = P09UR5_A3391AlbSer[0] ;
         A2839AlbProVal = P09UR5_A2839AlbProVal[0] ;
         A130BarCodPar = P09UR5_A130BarCodPar[0] ;
         A132BarCodReo = P09UR5_A132BarCodReo[0] ;
         A129BarCod = P09UR5_A129BarCod[0] ;
         A396EmprCod = P09UR5_A396EmprCod[0] ;
         A30AlbProCod = P09UR5_A30AlbProCod[0] ;
         GXt_char2 = A14056AlbColorCv ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_char3[0] = GXt_char2 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int5, GXv_char6, GXv_char3) ;
         albaranguia__wwgetfilterdata.this.A396EmprCod = GXv_char7[0] ;
         albaranguia__wwgetfilterdata.this.A129BarCod = GXv_int4[0] ;
         albaranguia__wwgetfilterdata.this.A132BarCodReo = GXv_int5[0] ;
         albaranguia__wwgetfilterdata.this.A130BarCodPar = GXv_char6[0] ;
         albaranguia__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14056AlbColorCv = GXt_char2 ;
         if ( (GXutil.strcmp("", AV87Albaranes_albaranguia__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3391AlbSer) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A12232AlbNomCli) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3393AlbColNum, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3153CodCod) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1261BarAlbKgmE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1262BarPreKgm, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3271AlbHdrAnc, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5019AlbHdrgm2, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1263BarAlbMtrE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1264BarPreMtr, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1265BarAlbPie, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14057AlbTiras) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14058AlbTirasKg, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14059AlbSinTest) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1206TubCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1266BarAlbTub, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2441AlbHdrObs) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6466PlasCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6467BarAlbPlas, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5051TipAcaCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "N", "")) == 0 ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) && ( ! (GXutil.strcmp("", AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv)==0) ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) || ( ( GXutil.strcmp(A14056AlbColorCv, AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel) == 0 ) ) )
               {
                  AV70count = 0 ;
                  while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P09UR5_A12232AlbNomCli[0], A12232AlbNomCli) == 0 ) )
                  {
                     brk9UR7 = false ;
                     A130BarCodPar = P09UR5_A130BarCodPar[0] ;
                     A132BarCodReo = P09UR5_A132BarCodReo[0] ;
                     A129BarCod = P09UR5_A129BarCod[0] ;
                     A396EmprCod = P09UR5_A396EmprCod[0] ;
                     A30AlbProCod = P09UR5_A30AlbProCod[0] ;
                     AV70count = (long)(AV70count+1) ;
                     brk9UR7 = true ;
                     pr_default.readNext(3);
                  }
                  if ( ! (GXutil.strcmp("", A12232AlbNomCli)==0) )
                  {
                     AV65Option = A12232AlbNomCli ;
                     AV66Options.add(AV65Option, 0);
                     AV69OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV66Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9UR7 )
         {
            brk9UR7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADCODCODOPTIONS' Routine */
      returnInSub = false ;
      AV24TFCodCod = AV77SearchTxt ;
      AV25TFCodCod_Sel = "" ;
      AV87Albaranes_albaranguia__wwds_1_filterfulltext = AV82FilterFullText ;
      AV88Albaranes_albaranguia__wwds_2_tfbarcod = AV10TFBarCod ;
      AV89Albaranes_albaranguia__wwds_3_tfbarcod_to = AV11TFBarCod_To ;
      AV90Albaranes_albaranguia__wwds_4_tfbarcodreo = AV12TFBarCodReo ;
      AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV92Albaranes_albaranguia__wwds_6_tfbarcodpar = AV14TFBarCodPar ;
      AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV94Albaranes_albaranguia__wwds_8_tfalbser = AV16TFAlbSer ;
      AV95Albaranes_albaranguia__wwds_9_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV18TFAlbColorCv ;
      AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV19TFAlbColorCv_Sel ;
      AV98Albaranes_albaranguia__wwds_12_tfalbnomcli = AV20TFAlbNomCli ;
      AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV100Albaranes_albaranguia__wwds_14_tfalbcolnum = AV22TFAlbColNum ;
      AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV23TFAlbColNum_To ;
      AV102Albaranes_albaranguia__wwds_16_tfcodcod = AV24TFCodCod ;
      AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV25TFCodCod_Sel ;
      AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV26TFBarAlbKgmE ;
      AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV27TFBarAlbKgmE_To ;
      AV106Albaranes_albaranguia__wwds_20_tfbarprekgm = AV28TFBarPreKgm ;
      AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV29TFBarPreKgm_To ;
      AV108Albaranes_albaranguia__wwds_22_tfalbhdranc = AV30TFAlbHdrAnc ;
      AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV31TFAlbHdrAnc_To ;
      AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV32TFAlbHdrgm2 ;
      AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV33TFAlbHdrgm2_To ;
      AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV114Albaranes_albaranguia__wwds_28_tfbarpremtr = AV36TFBarPreMtr ;
      AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV37TFBarPreMtr_To ;
      AV116Albaranes_albaranguia__wwds_30_tfbaralbpie = AV38TFBarAlbPie ;
      AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV118Albaranes_albaranguia__wwds_32_tfalbtiras = AV40TFAlbTiras ;
      AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV41TFAlbTiras_Sel ;
      AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV42TFAlbTirasKg ;
      AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV43TFAlbTirasKg_To ;
      AV122Albaranes_albaranguia__wwds_36_tfalbsintest = AV44TFAlbSinTest ;
      AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV45TFAlbSinTest_Sel ;
      AV124Albaranes_albaranguia__wwds_38_tftubcod = AV46TFTubCod ;
      AV125Albaranes_albaranguia__wwds_39_tftubcod_to = AV47TFTubCod_To ;
      AV126Albaranes_albaranguia__wwds_40_tfbaralbtub = AV48TFBarAlbTub ;
      AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV49TFBarAlbTub_To ;
      AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV130Albaranes_albaranguia__wwds_44_tfplascod = AV52TFPlasCod ;
      AV131Albaranes_albaranguia__wwds_45_tfplascod_to = AV53TFPlasCod_To ;
      AV132Albaranes_albaranguia__wwds_46_tfbaralbplas = AV54TFBarAlbPlas ;
      AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV55TFBarAlbPlas_To ;
      AV134Albaranes_albaranguia__wwds_48_tftipacacod = AV56TFTipAcaCod ;
      AV135Albaranes_albaranguia__wwds_49_tftipacacod_to = AV57TFTipAcaCod_To ;
      AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                           Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod) ,
                                           Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) ,
                                           AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                           AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                           AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                           AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                           AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                           AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                           Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) ,
                                           Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) ,
                                           AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                           AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                           AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                           AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                           AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                           AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                           Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) ,
                                           Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) ,
                                           AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                           AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                           AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                           AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) ,
                                           Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) ,
                                           AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                           AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                           AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                           AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                           AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                           AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                           Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod) ,
                                           Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to) ,
                                           Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) ,
                                           Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) ,
                                           AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                           AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                           Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod) ,
                                           Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to) ,
                                           Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) ,
                                           Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) ,
                                           Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod) ,
                                           Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) ,
                                           Integer.valueOf(AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A12232AlbNomCli ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A3153CodCod ,
                                           A1261BarAlbKgmE ,
                                           A1262BarPreKgm ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           A1264BarPreMtr ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           A14057AlbTiras ,
                                           A14058AlbTirasKg ,
                                           A14059AlbSinTest ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           A2441AlbHdrObs ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           Short.valueOf(A5051TipAcaCod) ,
                                           AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                           A14056AlbColorCv ,
                                           AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                           AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Albaranes_albaranguia__wwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV92Albaranes_albaranguia__wwds_6_tfbarcodpar), 1, "%") ;
      lV94Albaranes_albaranguia__wwds_8_tfalbser = GXutil.padr( GXutil.rtrim( AV94Albaranes_albaranguia__wwds_8_tfalbser), 16, "%") ;
      lV98Albaranes_albaranguia__wwds_12_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV98Albaranes_albaranguia__wwds_12_tfalbnomcli), 13, "%") ;
      lV102Albaranes_albaranguia__wwds_16_tfcodcod = GXutil.padr( GXutil.rtrim( AV102Albaranes_albaranguia__wwds_16_tfcodcod), 6, "%") ;
      lV118Albaranes_albaranguia__wwds_32_tfalbtiras = GXutil.padr( GXutil.rtrim( AV118Albaranes_albaranguia__wwds_32_tfalbtiras), 1, "%") ;
      lV122Albaranes_albaranguia__wwds_36_tfalbsintest = GXutil.padr( GXutil.rtrim( AV122Albaranes_albaranguia__wwds_36_tfalbsintest), 1, "%") ;
      lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs), 60, "%") ;
      /* Using cursor P09UR6 */
      pr_default.execute(4, new Object[] {Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod), Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to), Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo), Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to), lV92Albaranes_albaranguia__wwds_6_tfbarcodpar, AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel, lV94Albaranes_albaranguia__wwds_8_tfalbser, AV95Albaranes_albaranguia__wwds_9_tfalbser_sel, lV98Albaranes_albaranguia__wwds_12_tfalbnomcli, AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel, Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum), Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to), lV102Albaranes_albaranguia__wwds_16_tfcodcod, AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to, Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc), Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to), Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2), Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to), AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to, Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie), Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to), lV118Albaranes_albaranguia__wwds_32_tfalbtiras, AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to, lV122Albaranes_albaranguia__wwds_36_tfalbsintest, AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel, Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod), Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to), Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub), Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to), lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs, AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel, Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod), Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to), Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas), Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to), Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod), Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk9UR9 = false ;
         A3153CodCod = P09UR6_A3153CodCod[0] ;
         n3153CodCod = P09UR6_n3153CodCod[0] ;
         A5051TipAcaCod = P09UR6_A5051TipAcaCod[0] ;
         A6467BarAlbPlas = P09UR6_A6467BarAlbPlas[0] ;
         A6466PlasCod = P09UR6_A6466PlasCod[0] ;
         n6466PlasCod = P09UR6_n6466PlasCod[0] ;
         A2441AlbHdrObs = P09UR6_A2441AlbHdrObs[0] ;
         A1266BarAlbTub = P09UR6_A1266BarAlbTub[0] ;
         A1206TubCod = P09UR6_A1206TubCod[0] ;
         n1206TubCod = P09UR6_n1206TubCod[0] ;
         A14059AlbSinTest = P09UR6_A14059AlbSinTest[0] ;
         A14058AlbTirasKg = P09UR6_A14058AlbTirasKg[0] ;
         A14057AlbTiras = P09UR6_A14057AlbTiras[0] ;
         A1265BarAlbPie = P09UR6_A1265BarAlbPie[0] ;
         A1264BarPreMtr = P09UR6_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P09UR6_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P09UR6_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P09UR6_A3271AlbHdrAnc[0] ;
         A1262BarPreKgm = P09UR6_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P09UR6_A1261BarAlbKgmE[0] ;
         A3393AlbColNum = P09UR6_A3393AlbColNum[0] ;
         A12232AlbNomCli = P09UR6_A12232AlbNomCli[0] ;
         A3391AlbSer = P09UR6_A3391AlbSer[0] ;
         A2839AlbProVal = P09UR6_A2839AlbProVal[0] ;
         A130BarCodPar = P09UR6_A130BarCodPar[0] ;
         A132BarCodReo = P09UR6_A132BarCodReo[0] ;
         A129BarCod = P09UR6_A129BarCod[0] ;
         A396EmprCod = P09UR6_A396EmprCod[0] ;
         A30AlbProCod = P09UR6_A30AlbProCod[0] ;
         GXt_char2 = A14056AlbColorCv ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_char3[0] = GXt_char2 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int5, GXv_char6, GXv_char3) ;
         albaranguia__wwgetfilterdata.this.A396EmprCod = GXv_char7[0] ;
         albaranguia__wwgetfilterdata.this.A129BarCod = GXv_int4[0] ;
         albaranguia__wwgetfilterdata.this.A132BarCodReo = GXv_int5[0] ;
         albaranguia__wwgetfilterdata.this.A130BarCodPar = GXv_char6[0] ;
         albaranguia__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14056AlbColorCv = GXt_char2 ;
         if ( (GXutil.strcmp("", AV87Albaranes_albaranguia__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3391AlbSer) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A12232AlbNomCli) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3393AlbColNum, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3153CodCod) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1261BarAlbKgmE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1262BarPreKgm, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3271AlbHdrAnc, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5019AlbHdrgm2, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1263BarAlbMtrE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1264BarPreMtr, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1265BarAlbPie, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14057AlbTiras) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14058AlbTirasKg, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14059AlbSinTest) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1206TubCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1266BarAlbTub, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2441AlbHdrObs) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6466PlasCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6467BarAlbPlas, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5051TipAcaCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "N", "")) == 0 ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) && ( ! (GXutil.strcmp("", AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv)==0) ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) || ( ( GXutil.strcmp(A14056AlbColorCv, AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel) == 0 ) ) )
               {
                  AV70count = 0 ;
                  while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P09UR6_A3153CodCod[0], A3153CodCod) == 0 ) )
                  {
                     brk9UR9 = false ;
                     A130BarCodPar = P09UR6_A130BarCodPar[0] ;
                     A132BarCodReo = P09UR6_A132BarCodReo[0] ;
                     A129BarCod = P09UR6_A129BarCod[0] ;
                     A396EmprCod = P09UR6_A396EmprCod[0] ;
                     A30AlbProCod = P09UR6_A30AlbProCod[0] ;
                     AV70count = (long)(AV70count+1) ;
                     brk9UR9 = true ;
                     pr_default.readNext(4);
                  }
                  if ( ! (GXutil.strcmp("", A3153CodCod)==0) )
                  {
                     AV65Option = A3153CodCod ;
                     AV67OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A3153CodCod, "XXXXXX"))) ;
                     AV66Options.add(AV65Option, 0);
                     AV68OptionsDesc.add(AV67OptionDesc, 0);
                     AV69OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV66Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9UR9 )
         {
            brk9UR9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADALBTIRASOPTIONS' Routine */
      returnInSub = false ;
      AV40TFAlbTiras = AV77SearchTxt ;
      AV41TFAlbTiras_Sel = "" ;
      AV87Albaranes_albaranguia__wwds_1_filterfulltext = AV82FilterFullText ;
      AV88Albaranes_albaranguia__wwds_2_tfbarcod = AV10TFBarCod ;
      AV89Albaranes_albaranguia__wwds_3_tfbarcod_to = AV11TFBarCod_To ;
      AV90Albaranes_albaranguia__wwds_4_tfbarcodreo = AV12TFBarCodReo ;
      AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV92Albaranes_albaranguia__wwds_6_tfbarcodpar = AV14TFBarCodPar ;
      AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV94Albaranes_albaranguia__wwds_8_tfalbser = AV16TFAlbSer ;
      AV95Albaranes_albaranguia__wwds_9_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV18TFAlbColorCv ;
      AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV19TFAlbColorCv_Sel ;
      AV98Albaranes_albaranguia__wwds_12_tfalbnomcli = AV20TFAlbNomCli ;
      AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV100Albaranes_albaranguia__wwds_14_tfalbcolnum = AV22TFAlbColNum ;
      AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV23TFAlbColNum_To ;
      AV102Albaranes_albaranguia__wwds_16_tfcodcod = AV24TFCodCod ;
      AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV25TFCodCod_Sel ;
      AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV26TFBarAlbKgmE ;
      AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV27TFBarAlbKgmE_To ;
      AV106Albaranes_albaranguia__wwds_20_tfbarprekgm = AV28TFBarPreKgm ;
      AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV29TFBarPreKgm_To ;
      AV108Albaranes_albaranguia__wwds_22_tfalbhdranc = AV30TFAlbHdrAnc ;
      AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV31TFAlbHdrAnc_To ;
      AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV32TFAlbHdrgm2 ;
      AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV33TFAlbHdrgm2_To ;
      AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV114Albaranes_albaranguia__wwds_28_tfbarpremtr = AV36TFBarPreMtr ;
      AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV37TFBarPreMtr_To ;
      AV116Albaranes_albaranguia__wwds_30_tfbaralbpie = AV38TFBarAlbPie ;
      AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV118Albaranes_albaranguia__wwds_32_tfalbtiras = AV40TFAlbTiras ;
      AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV41TFAlbTiras_Sel ;
      AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV42TFAlbTirasKg ;
      AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV43TFAlbTirasKg_To ;
      AV122Albaranes_albaranguia__wwds_36_tfalbsintest = AV44TFAlbSinTest ;
      AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV45TFAlbSinTest_Sel ;
      AV124Albaranes_albaranguia__wwds_38_tftubcod = AV46TFTubCod ;
      AV125Albaranes_albaranguia__wwds_39_tftubcod_to = AV47TFTubCod_To ;
      AV126Albaranes_albaranguia__wwds_40_tfbaralbtub = AV48TFBarAlbTub ;
      AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV49TFBarAlbTub_To ;
      AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV130Albaranes_albaranguia__wwds_44_tfplascod = AV52TFPlasCod ;
      AV131Albaranes_albaranguia__wwds_45_tfplascod_to = AV53TFPlasCod_To ;
      AV132Albaranes_albaranguia__wwds_46_tfbaralbplas = AV54TFBarAlbPlas ;
      AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV55TFBarAlbPlas_To ;
      AV134Albaranes_albaranguia__wwds_48_tftipacacod = AV56TFTipAcaCod ;
      AV135Albaranes_albaranguia__wwds_49_tftipacacod_to = AV57TFTipAcaCod_To ;
      AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                           Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod) ,
                                           Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) ,
                                           AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                           AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                           AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                           AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                           AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                           AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                           Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) ,
                                           Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) ,
                                           AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                           AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                           AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                           AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                           AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                           AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                           Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) ,
                                           Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) ,
                                           AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                           AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                           AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                           AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) ,
                                           Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) ,
                                           AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                           AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                           AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                           AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                           AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                           AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                           Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod) ,
                                           Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to) ,
                                           Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) ,
                                           Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) ,
                                           AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                           AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                           Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod) ,
                                           Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to) ,
                                           Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) ,
                                           Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) ,
                                           Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod) ,
                                           Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) ,
                                           Integer.valueOf(AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A12232AlbNomCli ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A3153CodCod ,
                                           A1261BarAlbKgmE ,
                                           A1262BarPreKgm ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           A1264BarPreMtr ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           A14057AlbTiras ,
                                           A14058AlbTirasKg ,
                                           A14059AlbSinTest ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           A2441AlbHdrObs ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           Short.valueOf(A5051TipAcaCod) ,
                                           AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                           A14056AlbColorCv ,
                                           AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                           AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Albaranes_albaranguia__wwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV92Albaranes_albaranguia__wwds_6_tfbarcodpar), 1, "%") ;
      lV94Albaranes_albaranguia__wwds_8_tfalbser = GXutil.padr( GXutil.rtrim( AV94Albaranes_albaranguia__wwds_8_tfalbser), 16, "%") ;
      lV98Albaranes_albaranguia__wwds_12_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV98Albaranes_albaranguia__wwds_12_tfalbnomcli), 13, "%") ;
      lV102Albaranes_albaranguia__wwds_16_tfcodcod = GXutil.padr( GXutil.rtrim( AV102Albaranes_albaranguia__wwds_16_tfcodcod), 6, "%") ;
      lV118Albaranes_albaranguia__wwds_32_tfalbtiras = GXutil.padr( GXutil.rtrim( AV118Albaranes_albaranguia__wwds_32_tfalbtiras), 1, "%") ;
      lV122Albaranes_albaranguia__wwds_36_tfalbsintest = GXutil.padr( GXutil.rtrim( AV122Albaranes_albaranguia__wwds_36_tfalbsintest), 1, "%") ;
      lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs), 60, "%") ;
      /* Using cursor P09UR7 */
      pr_default.execute(5, new Object[] {Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod), Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to), Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo), Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to), lV92Albaranes_albaranguia__wwds_6_tfbarcodpar, AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel, lV94Albaranes_albaranguia__wwds_8_tfalbser, AV95Albaranes_albaranguia__wwds_9_tfalbser_sel, lV98Albaranes_albaranguia__wwds_12_tfalbnomcli, AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel, Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum), Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to), lV102Albaranes_albaranguia__wwds_16_tfcodcod, AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to, Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc), Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to), Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2), Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to), AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to, Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie), Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to), lV118Albaranes_albaranguia__wwds_32_tfalbtiras, AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to, lV122Albaranes_albaranguia__wwds_36_tfalbsintest, AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel, Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod), Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to), Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub), Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to), lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs, AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel, Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod), Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to), Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas), Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to), Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod), Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk9UR11 = false ;
         A14057AlbTiras = P09UR7_A14057AlbTiras[0] ;
         A5051TipAcaCod = P09UR7_A5051TipAcaCod[0] ;
         A6467BarAlbPlas = P09UR7_A6467BarAlbPlas[0] ;
         A6466PlasCod = P09UR7_A6466PlasCod[0] ;
         n6466PlasCod = P09UR7_n6466PlasCod[0] ;
         A2441AlbHdrObs = P09UR7_A2441AlbHdrObs[0] ;
         A1266BarAlbTub = P09UR7_A1266BarAlbTub[0] ;
         A1206TubCod = P09UR7_A1206TubCod[0] ;
         n1206TubCod = P09UR7_n1206TubCod[0] ;
         A14059AlbSinTest = P09UR7_A14059AlbSinTest[0] ;
         A14058AlbTirasKg = P09UR7_A14058AlbTirasKg[0] ;
         A1265BarAlbPie = P09UR7_A1265BarAlbPie[0] ;
         A1264BarPreMtr = P09UR7_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P09UR7_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P09UR7_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P09UR7_A3271AlbHdrAnc[0] ;
         A1262BarPreKgm = P09UR7_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P09UR7_A1261BarAlbKgmE[0] ;
         A3153CodCod = P09UR7_A3153CodCod[0] ;
         n3153CodCod = P09UR7_n3153CodCod[0] ;
         A3393AlbColNum = P09UR7_A3393AlbColNum[0] ;
         A12232AlbNomCli = P09UR7_A12232AlbNomCli[0] ;
         A3391AlbSer = P09UR7_A3391AlbSer[0] ;
         A2839AlbProVal = P09UR7_A2839AlbProVal[0] ;
         A130BarCodPar = P09UR7_A130BarCodPar[0] ;
         A132BarCodReo = P09UR7_A132BarCodReo[0] ;
         A129BarCod = P09UR7_A129BarCod[0] ;
         A396EmprCod = P09UR7_A396EmprCod[0] ;
         A30AlbProCod = P09UR7_A30AlbProCod[0] ;
         GXt_char2 = A14056AlbColorCv ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_char3[0] = GXt_char2 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int5, GXv_char6, GXv_char3) ;
         albaranguia__wwgetfilterdata.this.A396EmprCod = GXv_char7[0] ;
         albaranguia__wwgetfilterdata.this.A129BarCod = GXv_int4[0] ;
         albaranguia__wwgetfilterdata.this.A132BarCodReo = GXv_int5[0] ;
         albaranguia__wwgetfilterdata.this.A130BarCodPar = GXv_char6[0] ;
         albaranguia__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14056AlbColorCv = GXt_char2 ;
         if ( (GXutil.strcmp("", AV87Albaranes_albaranguia__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3391AlbSer) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A12232AlbNomCli) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3393AlbColNum, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3153CodCod) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1261BarAlbKgmE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1262BarPreKgm, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3271AlbHdrAnc, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5019AlbHdrgm2, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1263BarAlbMtrE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1264BarPreMtr, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1265BarAlbPie, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14057AlbTiras) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14058AlbTirasKg, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14059AlbSinTest) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1206TubCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1266BarAlbTub, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2441AlbHdrObs) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6466PlasCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6467BarAlbPlas, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5051TipAcaCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "N", "")) == 0 ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) && ( ! (GXutil.strcmp("", AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv)==0) ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) || ( ( GXutil.strcmp(A14056AlbColorCv, AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel) == 0 ) ) )
               {
                  AV70count = 0 ;
                  while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P09UR7_A14057AlbTiras[0], A14057AlbTiras) == 0 ) )
                  {
                     brk9UR11 = false ;
                     A130BarCodPar = P09UR7_A130BarCodPar[0] ;
                     A132BarCodReo = P09UR7_A132BarCodReo[0] ;
                     A129BarCod = P09UR7_A129BarCod[0] ;
                     A396EmprCod = P09UR7_A396EmprCod[0] ;
                     A30AlbProCod = P09UR7_A30AlbProCod[0] ;
                     AV70count = (long)(AV70count+1) ;
                     brk9UR11 = true ;
                     pr_default.readNext(5);
                  }
                  if ( ! (GXutil.strcmp("", A14057AlbTiras)==0) )
                  {
                     AV65Option = A14057AlbTiras ;
                     AV66Options.add(AV65Option, 0);
                     AV69OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV66Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9UR11 )
         {
            brk9UR11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADALBSINTESTOPTIONS' Routine */
      returnInSub = false ;
      AV44TFAlbSinTest = AV77SearchTxt ;
      AV45TFAlbSinTest_Sel = "" ;
      AV87Albaranes_albaranguia__wwds_1_filterfulltext = AV82FilterFullText ;
      AV88Albaranes_albaranguia__wwds_2_tfbarcod = AV10TFBarCod ;
      AV89Albaranes_albaranguia__wwds_3_tfbarcod_to = AV11TFBarCod_To ;
      AV90Albaranes_albaranguia__wwds_4_tfbarcodreo = AV12TFBarCodReo ;
      AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV92Albaranes_albaranguia__wwds_6_tfbarcodpar = AV14TFBarCodPar ;
      AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV94Albaranes_albaranguia__wwds_8_tfalbser = AV16TFAlbSer ;
      AV95Albaranes_albaranguia__wwds_9_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV18TFAlbColorCv ;
      AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV19TFAlbColorCv_Sel ;
      AV98Albaranes_albaranguia__wwds_12_tfalbnomcli = AV20TFAlbNomCli ;
      AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV100Albaranes_albaranguia__wwds_14_tfalbcolnum = AV22TFAlbColNum ;
      AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV23TFAlbColNum_To ;
      AV102Albaranes_albaranguia__wwds_16_tfcodcod = AV24TFCodCod ;
      AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV25TFCodCod_Sel ;
      AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV26TFBarAlbKgmE ;
      AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV27TFBarAlbKgmE_To ;
      AV106Albaranes_albaranguia__wwds_20_tfbarprekgm = AV28TFBarPreKgm ;
      AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV29TFBarPreKgm_To ;
      AV108Albaranes_albaranguia__wwds_22_tfalbhdranc = AV30TFAlbHdrAnc ;
      AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV31TFAlbHdrAnc_To ;
      AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV32TFAlbHdrgm2 ;
      AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV33TFAlbHdrgm2_To ;
      AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV114Albaranes_albaranguia__wwds_28_tfbarpremtr = AV36TFBarPreMtr ;
      AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV37TFBarPreMtr_To ;
      AV116Albaranes_albaranguia__wwds_30_tfbaralbpie = AV38TFBarAlbPie ;
      AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV118Albaranes_albaranguia__wwds_32_tfalbtiras = AV40TFAlbTiras ;
      AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV41TFAlbTiras_Sel ;
      AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV42TFAlbTirasKg ;
      AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV43TFAlbTirasKg_To ;
      AV122Albaranes_albaranguia__wwds_36_tfalbsintest = AV44TFAlbSinTest ;
      AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV45TFAlbSinTest_Sel ;
      AV124Albaranes_albaranguia__wwds_38_tftubcod = AV46TFTubCod ;
      AV125Albaranes_albaranguia__wwds_39_tftubcod_to = AV47TFTubCod_To ;
      AV126Albaranes_albaranguia__wwds_40_tfbaralbtub = AV48TFBarAlbTub ;
      AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV49TFBarAlbTub_To ;
      AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV130Albaranes_albaranguia__wwds_44_tfplascod = AV52TFPlasCod ;
      AV131Albaranes_albaranguia__wwds_45_tfplascod_to = AV53TFPlasCod_To ;
      AV132Albaranes_albaranguia__wwds_46_tfbaralbplas = AV54TFBarAlbPlas ;
      AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV55TFBarAlbPlas_To ;
      AV134Albaranes_albaranguia__wwds_48_tftipacacod = AV56TFTipAcaCod ;
      AV135Albaranes_albaranguia__wwds_49_tftipacacod_to = AV57TFTipAcaCod_To ;
      AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                           Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod) ,
                                           Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) ,
                                           AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                           AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                           AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                           AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                           AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                           AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                           Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) ,
                                           Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) ,
                                           AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                           AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                           AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                           AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                           AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                           AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                           Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) ,
                                           Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) ,
                                           AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                           AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                           AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                           AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) ,
                                           Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) ,
                                           AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                           AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                           AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                           AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                           AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                           AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                           Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod) ,
                                           Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to) ,
                                           Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) ,
                                           Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) ,
                                           AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                           AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                           Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod) ,
                                           Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to) ,
                                           Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) ,
                                           Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) ,
                                           Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod) ,
                                           Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) ,
                                           Integer.valueOf(AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A12232AlbNomCli ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A3153CodCod ,
                                           A1261BarAlbKgmE ,
                                           A1262BarPreKgm ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           A1264BarPreMtr ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           A14057AlbTiras ,
                                           A14058AlbTirasKg ,
                                           A14059AlbSinTest ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           A2441AlbHdrObs ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           Short.valueOf(A5051TipAcaCod) ,
                                           AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                           A14056AlbColorCv ,
                                           AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                           AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Albaranes_albaranguia__wwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV92Albaranes_albaranguia__wwds_6_tfbarcodpar), 1, "%") ;
      lV94Albaranes_albaranguia__wwds_8_tfalbser = GXutil.padr( GXutil.rtrim( AV94Albaranes_albaranguia__wwds_8_tfalbser), 16, "%") ;
      lV98Albaranes_albaranguia__wwds_12_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV98Albaranes_albaranguia__wwds_12_tfalbnomcli), 13, "%") ;
      lV102Albaranes_albaranguia__wwds_16_tfcodcod = GXutil.padr( GXutil.rtrim( AV102Albaranes_albaranguia__wwds_16_tfcodcod), 6, "%") ;
      lV118Albaranes_albaranguia__wwds_32_tfalbtiras = GXutil.padr( GXutil.rtrim( AV118Albaranes_albaranguia__wwds_32_tfalbtiras), 1, "%") ;
      lV122Albaranes_albaranguia__wwds_36_tfalbsintest = GXutil.padr( GXutil.rtrim( AV122Albaranes_albaranguia__wwds_36_tfalbsintest), 1, "%") ;
      lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs), 60, "%") ;
      /* Using cursor P09UR8 */
      pr_default.execute(6, new Object[] {Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod), Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to), Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo), Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to), lV92Albaranes_albaranguia__wwds_6_tfbarcodpar, AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel, lV94Albaranes_albaranguia__wwds_8_tfalbser, AV95Albaranes_albaranguia__wwds_9_tfalbser_sel, lV98Albaranes_albaranguia__wwds_12_tfalbnomcli, AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel, Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum), Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to), lV102Albaranes_albaranguia__wwds_16_tfcodcod, AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to, Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc), Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to), Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2), Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to), AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to, Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie), Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to), lV118Albaranes_albaranguia__wwds_32_tfalbtiras, AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to, lV122Albaranes_albaranguia__wwds_36_tfalbsintest, AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel, Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod), Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to), Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub), Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to), lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs, AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel, Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod), Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to), Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas), Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to), Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod), Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to)});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk9UR13 = false ;
         A14059AlbSinTest = P09UR8_A14059AlbSinTest[0] ;
         A5051TipAcaCod = P09UR8_A5051TipAcaCod[0] ;
         A6467BarAlbPlas = P09UR8_A6467BarAlbPlas[0] ;
         A6466PlasCod = P09UR8_A6466PlasCod[0] ;
         n6466PlasCod = P09UR8_n6466PlasCod[0] ;
         A2441AlbHdrObs = P09UR8_A2441AlbHdrObs[0] ;
         A1266BarAlbTub = P09UR8_A1266BarAlbTub[0] ;
         A1206TubCod = P09UR8_A1206TubCod[0] ;
         n1206TubCod = P09UR8_n1206TubCod[0] ;
         A14058AlbTirasKg = P09UR8_A14058AlbTirasKg[0] ;
         A14057AlbTiras = P09UR8_A14057AlbTiras[0] ;
         A1265BarAlbPie = P09UR8_A1265BarAlbPie[0] ;
         A1264BarPreMtr = P09UR8_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P09UR8_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P09UR8_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P09UR8_A3271AlbHdrAnc[0] ;
         A1262BarPreKgm = P09UR8_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P09UR8_A1261BarAlbKgmE[0] ;
         A3153CodCod = P09UR8_A3153CodCod[0] ;
         n3153CodCod = P09UR8_n3153CodCod[0] ;
         A3393AlbColNum = P09UR8_A3393AlbColNum[0] ;
         A12232AlbNomCli = P09UR8_A12232AlbNomCli[0] ;
         A3391AlbSer = P09UR8_A3391AlbSer[0] ;
         A2839AlbProVal = P09UR8_A2839AlbProVal[0] ;
         A130BarCodPar = P09UR8_A130BarCodPar[0] ;
         A132BarCodReo = P09UR8_A132BarCodReo[0] ;
         A129BarCod = P09UR8_A129BarCod[0] ;
         A396EmprCod = P09UR8_A396EmprCod[0] ;
         A30AlbProCod = P09UR8_A30AlbProCod[0] ;
         GXt_char2 = A14056AlbColorCv ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_char3[0] = GXt_char2 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int5, GXv_char6, GXv_char3) ;
         albaranguia__wwgetfilterdata.this.A396EmprCod = GXv_char7[0] ;
         albaranguia__wwgetfilterdata.this.A129BarCod = GXv_int4[0] ;
         albaranguia__wwgetfilterdata.this.A132BarCodReo = GXv_int5[0] ;
         albaranguia__wwgetfilterdata.this.A130BarCodPar = GXv_char6[0] ;
         albaranguia__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14056AlbColorCv = GXt_char2 ;
         if ( (GXutil.strcmp("", AV87Albaranes_albaranguia__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3391AlbSer) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A12232AlbNomCli) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3393AlbColNum, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3153CodCod) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1261BarAlbKgmE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1262BarPreKgm, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3271AlbHdrAnc, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5019AlbHdrgm2, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1263BarAlbMtrE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1264BarPreMtr, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1265BarAlbPie, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14057AlbTiras) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14058AlbTirasKg, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14059AlbSinTest) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1206TubCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1266BarAlbTub, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2441AlbHdrObs) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6466PlasCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6467BarAlbPlas, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5051TipAcaCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "N", "")) == 0 ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) && ( ! (GXutil.strcmp("", AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv)==0) ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) || ( ( GXutil.strcmp(A14056AlbColorCv, AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel) == 0 ) ) )
               {
                  AV70count = 0 ;
                  while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P09UR8_A14059AlbSinTest[0], A14059AlbSinTest) == 0 ) )
                  {
                     brk9UR13 = false ;
                     A130BarCodPar = P09UR8_A130BarCodPar[0] ;
                     A132BarCodReo = P09UR8_A132BarCodReo[0] ;
                     A129BarCod = P09UR8_A129BarCod[0] ;
                     A396EmprCod = P09UR8_A396EmprCod[0] ;
                     A30AlbProCod = P09UR8_A30AlbProCod[0] ;
                     AV70count = (long)(AV70count+1) ;
                     brk9UR13 = true ;
                     pr_default.readNext(6);
                  }
                  if ( ! (GXutil.strcmp("", A14059AlbSinTest)==0) )
                  {
                     AV65Option = A14059AlbSinTest ;
                     AV66Options.add(AV65Option, 0);
                     AV69OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV66Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9UR13 )
         {
            brk9UR13 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADALBHDROBSOPTIONS' Routine */
      returnInSub = false ;
      AV50TFAlbHdrObs = AV77SearchTxt ;
      AV51TFAlbHdrObs_Sel = "" ;
      AV87Albaranes_albaranguia__wwds_1_filterfulltext = AV82FilterFullText ;
      AV88Albaranes_albaranguia__wwds_2_tfbarcod = AV10TFBarCod ;
      AV89Albaranes_albaranguia__wwds_3_tfbarcod_to = AV11TFBarCod_To ;
      AV90Albaranes_albaranguia__wwds_4_tfbarcodreo = AV12TFBarCodReo ;
      AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV92Albaranes_albaranguia__wwds_6_tfbarcodpar = AV14TFBarCodPar ;
      AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV94Albaranes_albaranguia__wwds_8_tfalbser = AV16TFAlbSer ;
      AV95Albaranes_albaranguia__wwds_9_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv = AV18TFAlbColorCv ;
      AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = AV19TFAlbColorCv_Sel ;
      AV98Albaranes_albaranguia__wwds_12_tfalbnomcli = AV20TFAlbNomCli ;
      AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV100Albaranes_albaranguia__wwds_14_tfalbcolnum = AV22TFAlbColNum ;
      AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to = AV23TFAlbColNum_To ;
      AV102Albaranes_albaranguia__wwds_16_tfcodcod = AV24TFCodCod ;
      AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel = AV25TFCodCod_Sel ;
      AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme = AV26TFBarAlbKgmE ;
      AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = AV27TFBarAlbKgmE_To ;
      AV106Albaranes_albaranguia__wwds_20_tfbarprekgm = AV28TFBarPreKgm ;
      AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to = AV29TFBarPreKgm_To ;
      AV108Albaranes_albaranguia__wwds_22_tfalbhdranc = AV30TFAlbHdrAnc ;
      AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to = AV31TFAlbHdrAnc_To ;
      AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 = AV32TFAlbHdrgm2 ;
      AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to = AV33TFAlbHdrgm2_To ;
      AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre = AV34TFBarAlbMtrE ;
      AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = AV35TFBarAlbMtrE_To ;
      AV114Albaranes_albaranguia__wwds_28_tfbarpremtr = AV36TFBarPreMtr ;
      AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to = AV37TFBarPreMtr_To ;
      AV116Albaranes_albaranguia__wwds_30_tfbaralbpie = AV38TFBarAlbPie ;
      AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to = AV39TFBarAlbPie_To ;
      AV118Albaranes_albaranguia__wwds_32_tfalbtiras = AV40TFAlbTiras ;
      AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel = AV41TFAlbTiras_Sel ;
      AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg = AV42TFAlbTirasKg ;
      AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = AV43TFAlbTirasKg_To ;
      AV122Albaranes_albaranguia__wwds_36_tfalbsintest = AV44TFAlbSinTest ;
      AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel = AV45TFAlbSinTest_Sel ;
      AV124Albaranes_albaranguia__wwds_38_tftubcod = AV46TFTubCod ;
      AV125Albaranes_albaranguia__wwds_39_tftubcod_to = AV47TFTubCod_To ;
      AV126Albaranes_albaranguia__wwds_40_tfbaralbtub = AV48TFBarAlbTub ;
      AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to = AV49TFBarAlbTub_To ;
      AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV130Albaranes_albaranguia__wwds_44_tfplascod = AV52TFPlasCod ;
      AV131Albaranes_albaranguia__wwds_45_tfplascod_to = AV53TFPlasCod_To ;
      AV132Albaranes_albaranguia__wwds_46_tfbaralbplas = AV54TFBarAlbPlas ;
      AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to = AV55TFBarAlbPlas_To ;
      AV134Albaranes_albaranguia__wwds_48_tftipacacod = AV56TFTipAcaCod ;
      AV135Albaranes_albaranguia__wwds_49_tftipacacod_to = AV57TFTipAcaCod_To ;
      AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                           Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod) ,
                                           Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) ,
                                           Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) ,
                                           Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) ,
                                           AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                           AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                           AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                           AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                           AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                           AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                           Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) ,
                                           Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) ,
                                           AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                           AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                           AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                           AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                           AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                           AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                           Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) ,
                                           Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) ,
                                           AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                           AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                           AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                           AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) ,
                                           Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) ,
                                           AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                           AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                           AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                           AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                           AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                           AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                           Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod) ,
                                           Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to) ,
                                           Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) ,
                                           Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) ,
                                           AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                           AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                           Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod) ,
                                           Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to) ,
                                           Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) ,
                                           Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) ,
                                           Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod) ,
                                           Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) ,
                                           Integer.valueOf(AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A12232AlbNomCli ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A3153CodCod ,
                                           A1261BarAlbKgmE ,
                                           A1262BarPreKgm ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           A1264BarPreMtr ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           A14057AlbTiras ,
                                           A14058AlbTirasKg ,
                                           A14059AlbSinTest ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           A2441AlbHdrObs ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           Short.valueOf(A5051TipAcaCod) ,
                                           AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                           A14056AlbColorCv ,
                                           AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                           AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV92Albaranes_albaranguia__wwds_6_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV92Albaranes_albaranguia__wwds_6_tfbarcodpar), 1, "%") ;
      lV94Albaranes_albaranguia__wwds_8_tfalbser = GXutil.padr( GXutil.rtrim( AV94Albaranes_albaranguia__wwds_8_tfalbser), 16, "%") ;
      lV98Albaranes_albaranguia__wwds_12_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV98Albaranes_albaranguia__wwds_12_tfalbnomcli), 13, "%") ;
      lV102Albaranes_albaranguia__wwds_16_tfcodcod = GXutil.padr( GXutil.rtrim( AV102Albaranes_albaranguia__wwds_16_tfcodcod), 6, "%") ;
      lV118Albaranes_albaranguia__wwds_32_tfalbtiras = GXutil.padr( GXutil.rtrim( AV118Albaranes_albaranguia__wwds_32_tfalbtiras), 1, "%") ;
      lV122Albaranes_albaranguia__wwds_36_tfalbsintest = GXutil.padr( GXutil.rtrim( AV122Albaranes_albaranguia__wwds_36_tfalbsintest), 1, "%") ;
      lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs), 60, "%") ;
      /* Using cursor P09UR9 */
      pr_default.execute(7, new Object[] {Integer.valueOf(AV88Albaranes_albaranguia__wwds_2_tfbarcod), Integer.valueOf(AV89Albaranes_albaranguia__wwds_3_tfbarcod_to), Byte.valueOf(AV90Albaranes_albaranguia__wwds_4_tfbarcodreo), Byte.valueOf(AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to), lV92Albaranes_albaranguia__wwds_6_tfbarcodpar, AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel, lV94Albaranes_albaranguia__wwds_8_tfalbser, AV95Albaranes_albaranguia__wwds_9_tfalbser_sel, lV98Albaranes_albaranguia__wwds_12_tfalbnomcli, AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel, Integer.valueOf(AV100Albaranes_albaranguia__wwds_14_tfalbcolnum), Integer.valueOf(AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to), lV102Albaranes_albaranguia__wwds_16_tfcodcod, AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to, Short.valueOf(AV108Albaranes_albaranguia__wwds_22_tfalbhdranc), Short.valueOf(AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to), Short.valueOf(AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2), Short.valueOf(AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to), AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to, Integer.valueOf(AV116Albaranes_albaranguia__wwds_30_tfbaralbpie), Integer.valueOf(AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to), lV118Albaranes_albaranguia__wwds_32_tfalbtiras, AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to, lV122Albaranes_albaranguia__wwds_36_tfalbsintest, AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel, Short.valueOf(AV124Albaranes_albaranguia__wwds_38_tftubcod), Short.valueOf(AV125Albaranes_albaranguia__wwds_39_tftubcod_to), Integer.valueOf(AV126Albaranes_albaranguia__wwds_40_tfbaralbtub), Integer.valueOf(AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to), lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs, AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel, Short.valueOf(AV130Albaranes_albaranguia__wwds_44_tfplascod), Short.valueOf(AV131Albaranes_albaranguia__wwds_45_tfplascod_to), Short.valueOf(AV132Albaranes_albaranguia__wwds_46_tfbaralbplas), Short.valueOf(AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to), Short.valueOf(AV134Albaranes_albaranguia__wwds_48_tftipacacod), Short.valueOf(AV135Albaranes_albaranguia__wwds_49_tftipacacod_to)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk9UR15 = false ;
         A2441AlbHdrObs = P09UR9_A2441AlbHdrObs[0] ;
         A5051TipAcaCod = P09UR9_A5051TipAcaCod[0] ;
         A6467BarAlbPlas = P09UR9_A6467BarAlbPlas[0] ;
         A6466PlasCod = P09UR9_A6466PlasCod[0] ;
         n6466PlasCod = P09UR9_n6466PlasCod[0] ;
         A1266BarAlbTub = P09UR9_A1266BarAlbTub[0] ;
         A1206TubCod = P09UR9_A1206TubCod[0] ;
         n1206TubCod = P09UR9_n1206TubCod[0] ;
         A14059AlbSinTest = P09UR9_A14059AlbSinTest[0] ;
         A14058AlbTirasKg = P09UR9_A14058AlbTirasKg[0] ;
         A14057AlbTiras = P09UR9_A14057AlbTiras[0] ;
         A1265BarAlbPie = P09UR9_A1265BarAlbPie[0] ;
         A1264BarPreMtr = P09UR9_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P09UR9_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P09UR9_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P09UR9_A3271AlbHdrAnc[0] ;
         A1262BarPreKgm = P09UR9_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P09UR9_A1261BarAlbKgmE[0] ;
         A3153CodCod = P09UR9_A3153CodCod[0] ;
         n3153CodCod = P09UR9_n3153CodCod[0] ;
         A3393AlbColNum = P09UR9_A3393AlbColNum[0] ;
         A12232AlbNomCli = P09UR9_A12232AlbNomCli[0] ;
         A3391AlbSer = P09UR9_A3391AlbSer[0] ;
         A2839AlbProVal = P09UR9_A2839AlbProVal[0] ;
         A130BarCodPar = P09UR9_A130BarCodPar[0] ;
         A132BarCodReo = P09UR9_A132BarCodReo[0] ;
         A129BarCod = P09UR9_A129BarCod[0] ;
         A396EmprCod = P09UR9_A396EmprCod[0] ;
         A30AlbProCod = P09UR9_A30AlbProCod[0] ;
         GXt_char2 = A14056AlbColorCv ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int4[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_char3[0] = GXt_char2 ;
         new app.pnortt(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_int5, GXv_char6, GXv_char3) ;
         albaranguia__wwgetfilterdata.this.A396EmprCod = GXv_char7[0] ;
         albaranguia__wwgetfilterdata.this.A129BarCod = GXv_int4[0] ;
         albaranguia__wwgetfilterdata.this.A132BarCodReo = GXv_int5[0] ;
         albaranguia__wwgetfilterdata.this.A130BarCodPar = GXv_char6[0] ;
         albaranguia__wwgetfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A14056AlbColorCv = GXt_char2 ;
         if ( (GXutil.strcmp("", AV87Albaranes_albaranguia__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A129BarCod, 8, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A132BarCodReo, 1, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A130BarCodPar) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3391AlbSer) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A12232AlbNomCli) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3393AlbColNum, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3153CodCod) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1261BarAlbKgmE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1262BarPreKgm, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3271AlbHdrAnc, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5019AlbHdrgm2, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1263BarAlbMtrE, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1264BarPreMtr, 13, 5) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1265BarAlbPie, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14057AlbTiras) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14058AlbTirasKg, 9, 2) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14059AlbSinTest) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1206TubCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1266BarAlbTub, 6, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2441AlbHdrObs) , GXutil.padr( "%" + GXutil.upper( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6466PlasCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6467BarAlbPlas, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5051TipAcaCod, 4, 0) , GXutil.padr( "%" + AV87Albaranes_albaranguia__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV87Albaranes_albaranguia__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A2839AlbProVal, httpContext.getMessage( "N", "")) == 0 ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) && ( ! (GXutil.strcmp("", AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv)==0) ) ) || ( GXutil.like( GXutil.upper( A14056AlbColorCv) , GXutil.padr( "%" + GXutil.upper( AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel)==0) || ( ( GXutil.strcmp(A14056AlbColorCv, AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel) == 0 ) ) )
               {
                  AV70count = 0 ;
                  while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P09UR9_A2441AlbHdrObs[0], A2441AlbHdrObs) == 0 ) )
                  {
                     brk9UR15 = false ;
                     A130BarCodPar = P09UR9_A130BarCodPar[0] ;
                     A132BarCodReo = P09UR9_A132BarCodReo[0] ;
                     A129BarCod = P09UR9_A129BarCod[0] ;
                     A396EmprCod = P09UR9_A396EmprCod[0] ;
                     A30AlbProCod = P09UR9_A30AlbProCod[0] ;
                     AV70count = (long)(AV70count+1) ;
                     brk9UR15 = true ;
                     pr_default.readNext(7);
                  }
                  if ( ! (GXutil.strcmp("", A2441AlbHdrObs)==0) )
                  {
                     AV65Option = A2441AlbHdrObs ;
                     AV66Options.add(AV65Option, 0);
                     AV69OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV70count), "Z,ZZZ,ZZZ,ZZ9")), 0);
                  }
                  if ( AV66Options.size() == 50 )
                  {
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
         }
         if ( ! brk9UR15 )
         {
            brk9UR15 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   protected void cleanup( )
   {
      this.aP3[0] = albaranguia__wwgetfilterdata.this.AV79OptionsJson;
      this.aP4[0] = albaranguia__wwgetfilterdata.this.AV80OptionsDescJson;
      this.aP5[0] = albaranguia__wwgetfilterdata.this.AV81OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV79OptionsJson = "" ;
      AV80OptionsDescJson = "" ;
      AV81OptionIndexesJson = "" ;
      AV66Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV68OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV69OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV71Session = httpContext.getWebSession();
      AV73GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV74GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV82FilterFullText = "" ;
      AV14TFBarCodPar = "" ;
      AV15TFBarCodPar_Sel = "" ;
      AV16TFAlbSer = "" ;
      AV17TFAlbSer_Sel = "" ;
      AV18TFAlbColorCv = "" ;
      AV19TFAlbColorCv_Sel = "" ;
      AV20TFAlbNomCli = "" ;
      AV21TFAlbNomCli_Sel = "" ;
      AV24TFCodCod = "" ;
      AV25TFCodCod_Sel = "" ;
      AV26TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV27TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV28TFBarPreKgm = DecimalUtil.ZERO ;
      AV29TFBarPreKgm_To = DecimalUtil.ZERO ;
      AV34TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV35TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV36TFBarPreMtr = DecimalUtil.ZERO ;
      AV37TFBarPreMtr_To = DecimalUtil.ZERO ;
      AV40TFAlbTiras = "" ;
      AV41TFAlbTiras_Sel = "" ;
      AV42TFAlbTirasKg = DecimalUtil.ZERO ;
      AV43TFAlbTirasKg_To = DecimalUtil.ZERO ;
      AV44TFAlbSinTest = "" ;
      AV45TFAlbSinTest_Sel = "" ;
      AV50TFAlbHdrObs = "" ;
      AV51TFAlbHdrObs_Sel = "" ;
      AV58TFAlbProVal_SelsJson = "" ;
      AV59TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A130BarCodPar = "" ;
      AV87Albaranes_albaranguia__wwds_1_filterfulltext = "" ;
      AV92Albaranes_albaranguia__wwds_6_tfbarcodpar = "" ;
      AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel = "" ;
      AV94Albaranes_albaranguia__wwds_8_tfalbser = "" ;
      AV95Albaranes_albaranguia__wwds_9_tfalbser_sel = "" ;
      AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv = "" ;
      AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel = "" ;
      AV98Albaranes_albaranguia__wwds_12_tfalbnomcli = "" ;
      AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel = "" ;
      AV102Albaranes_albaranguia__wwds_16_tfcodcod = "" ;
      AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel = "" ;
      AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme = DecimalUtil.ZERO ;
      AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV106Albaranes_albaranguia__wwds_20_tfbarprekgm = DecimalUtil.ZERO ;
      AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to = DecimalUtil.ZERO ;
      AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre = DecimalUtil.ZERO ;
      AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV114Albaranes_albaranguia__wwds_28_tfbarpremtr = DecimalUtil.ZERO ;
      AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to = DecimalUtil.ZERO ;
      AV118Albaranes_albaranguia__wwds_32_tfalbtiras = "" ;
      AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel = "" ;
      AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg = DecimalUtil.ZERO ;
      AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to = DecimalUtil.ZERO ;
      AV122Albaranes_albaranguia__wwds_36_tfalbsintest = "" ;
      AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel = "" ;
      AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = "" ;
      AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel = "" ;
      AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV92Albaranes_albaranguia__wwds_6_tfbarcodpar = "" ;
      lV94Albaranes_albaranguia__wwds_8_tfalbser = "" ;
      lV98Albaranes_albaranguia__wwds_12_tfalbnomcli = "" ;
      lV102Albaranes_albaranguia__wwds_16_tfcodcod = "" ;
      lV118Albaranes_albaranguia__wwds_32_tfalbtiras = "" ;
      lV122Albaranes_albaranguia__wwds_36_tfalbsintest = "" ;
      lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs = "" ;
      A2839AlbProVal = "" ;
      A3391AlbSer = "" ;
      A12232AlbNomCli = "" ;
      A3153CodCod = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A14057AlbTiras = "" ;
      A14058AlbTirasKg = DecimalUtil.ZERO ;
      A14059AlbSinTest = "" ;
      A2441AlbHdrObs = "" ;
      A14056AlbColorCv = "" ;
      P09UR2_A5051TipAcaCod = new short[1] ;
      P09UR2_A6467BarAlbPlas = new short[1] ;
      P09UR2_A6466PlasCod = new short[1] ;
      P09UR2_n6466PlasCod = new boolean[] {false} ;
      P09UR2_A2441AlbHdrObs = new String[] {""} ;
      P09UR2_A1266BarAlbTub = new int[1] ;
      P09UR2_A1206TubCod = new short[1] ;
      P09UR2_n1206TubCod = new boolean[] {false} ;
      P09UR2_A14059AlbSinTest = new String[] {""} ;
      P09UR2_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR2_A14057AlbTiras = new String[] {""} ;
      P09UR2_A1265BarAlbPie = new int[1] ;
      P09UR2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR2_A5019AlbHdrgm2 = new short[1] ;
      P09UR2_A3271AlbHdrAnc = new short[1] ;
      P09UR2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR2_A3153CodCod = new String[] {""} ;
      P09UR2_n3153CodCod = new boolean[] {false} ;
      P09UR2_A3393AlbColNum = new int[1] ;
      P09UR2_A12232AlbNomCli = new String[] {""} ;
      P09UR2_A3391AlbSer = new String[] {""} ;
      P09UR2_A2839AlbProVal = new String[] {""} ;
      P09UR2_A130BarCodPar = new String[] {""} ;
      P09UR2_A132BarCodReo = new byte[1] ;
      P09UR2_A129BarCod = new int[1] ;
      P09UR2_A396EmprCod = new String[] {""} ;
      P09UR2_A30AlbProCod = new long[1] ;
      A396EmprCod = "" ;
      AV65Option = "" ;
      P09UR3_A3391AlbSer = new String[] {""} ;
      P09UR3_A5051TipAcaCod = new short[1] ;
      P09UR3_A6467BarAlbPlas = new short[1] ;
      P09UR3_A6466PlasCod = new short[1] ;
      P09UR3_n6466PlasCod = new boolean[] {false} ;
      P09UR3_A2441AlbHdrObs = new String[] {""} ;
      P09UR3_A1266BarAlbTub = new int[1] ;
      P09UR3_A1206TubCod = new short[1] ;
      P09UR3_n1206TubCod = new boolean[] {false} ;
      P09UR3_A14059AlbSinTest = new String[] {""} ;
      P09UR3_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR3_A14057AlbTiras = new String[] {""} ;
      P09UR3_A1265BarAlbPie = new int[1] ;
      P09UR3_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR3_A5019AlbHdrgm2 = new short[1] ;
      P09UR3_A3271AlbHdrAnc = new short[1] ;
      P09UR3_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR3_A3153CodCod = new String[] {""} ;
      P09UR3_n3153CodCod = new boolean[] {false} ;
      P09UR3_A3393AlbColNum = new int[1] ;
      P09UR3_A12232AlbNomCli = new String[] {""} ;
      P09UR3_A2839AlbProVal = new String[] {""} ;
      P09UR3_A130BarCodPar = new String[] {""} ;
      P09UR3_A132BarCodReo = new byte[1] ;
      P09UR3_A129BarCod = new int[1] ;
      P09UR3_A396EmprCod = new String[] {""} ;
      P09UR3_A30AlbProCod = new long[1] ;
      P09UR4_A5051TipAcaCod = new short[1] ;
      P09UR4_A6467BarAlbPlas = new short[1] ;
      P09UR4_A6466PlasCod = new short[1] ;
      P09UR4_n6466PlasCod = new boolean[] {false} ;
      P09UR4_A2441AlbHdrObs = new String[] {""} ;
      P09UR4_A1266BarAlbTub = new int[1] ;
      P09UR4_A1206TubCod = new short[1] ;
      P09UR4_n1206TubCod = new boolean[] {false} ;
      P09UR4_A14059AlbSinTest = new String[] {""} ;
      P09UR4_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR4_A14057AlbTiras = new String[] {""} ;
      P09UR4_A1265BarAlbPie = new int[1] ;
      P09UR4_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR4_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR4_A5019AlbHdrgm2 = new short[1] ;
      P09UR4_A3271AlbHdrAnc = new short[1] ;
      P09UR4_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR4_A3153CodCod = new String[] {""} ;
      P09UR4_n3153CodCod = new boolean[] {false} ;
      P09UR4_A3393AlbColNum = new int[1] ;
      P09UR4_A12232AlbNomCli = new String[] {""} ;
      P09UR4_A3391AlbSer = new String[] {""} ;
      P09UR4_A2839AlbProVal = new String[] {""} ;
      P09UR4_A130BarCodPar = new String[] {""} ;
      P09UR4_A132BarCodReo = new byte[1] ;
      P09UR4_A129BarCod = new int[1] ;
      P09UR4_A396EmprCod = new String[] {""} ;
      P09UR4_A30AlbProCod = new long[1] ;
      P09UR5_A12232AlbNomCli = new String[] {""} ;
      P09UR5_A5051TipAcaCod = new short[1] ;
      P09UR5_A6467BarAlbPlas = new short[1] ;
      P09UR5_A6466PlasCod = new short[1] ;
      P09UR5_n6466PlasCod = new boolean[] {false} ;
      P09UR5_A2441AlbHdrObs = new String[] {""} ;
      P09UR5_A1266BarAlbTub = new int[1] ;
      P09UR5_A1206TubCod = new short[1] ;
      P09UR5_n1206TubCod = new boolean[] {false} ;
      P09UR5_A14059AlbSinTest = new String[] {""} ;
      P09UR5_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR5_A14057AlbTiras = new String[] {""} ;
      P09UR5_A1265BarAlbPie = new int[1] ;
      P09UR5_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR5_A5019AlbHdrgm2 = new short[1] ;
      P09UR5_A3271AlbHdrAnc = new short[1] ;
      P09UR5_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR5_A3153CodCod = new String[] {""} ;
      P09UR5_n3153CodCod = new boolean[] {false} ;
      P09UR5_A3393AlbColNum = new int[1] ;
      P09UR5_A3391AlbSer = new String[] {""} ;
      P09UR5_A2839AlbProVal = new String[] {""} ;
      P09UR5_A130BarCodPar = new String[] {""} ;
      P09UR5_A132BarCodReo = new byte[1] ;
      P09UR5_A129BarCod = new int[1] ;
      P09UR5_A396EmprCod = new String[] {""} ;
      P09UR5_A30AlbProCod = new long[1] ;
      P09UR6_A3153CodCod = new String[] {""} ;
      P09UR6_n3153CodCod = new boolean[] {false} ;
      P09UR6_A5051TipAcaCod = new short[1] ;
      P09UR6_A6467BarAlbPlas = new short[1] ;
      P09UR6_A6466PlasCod = new short[1] ;
      P09UR6_n6466PlasCod = new boolean[] {false} ;
      P09UR6_A2441AlbHdrObs = new String[] {""} ;
      P09UR6_A1266BarAlbTub = new int[1] ;
      P09UR6_A1206TubCod = new short[1] ;
      P09UR6_n1206TubCod = new boolean[] {false} ;
      P09UR6_A14059AlbSinTest = new String[] {""} ;
      P09UR6_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR6_A14057AlbTiras = new String[] {""} ;
      P09UR6_A1265BarAlbPie = new int[1] ;
      P09UR6_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR6_A5019AlbHdrgm2 = new short[1] ;
      P09UR6_A3271AlbHdrAnc = new short[1] ;
      P09UR6_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR6_A3393AlbColNum = new int[1] ;
      P09UR6_A12232AlbNomCli = new String[] {""} ;
      P09UR6_A3391AlbSer = new String[] {""} ;
      P09UR6_A2839AlbProVal = new String[] {""} ;
      P09UR6_A130BarCodPar = new String[] {""} ;
      P09UR6_A132BarCodReo = new byte[1] ;
      P09UR6_A129BarCod = new int[1] ;
      P09UR6_A396EmprCod = new String[] {""} ;
      P09UR6_A30AlbProCod = new long[1] ;
      AV67OptionDesc = "" ;
      P09UR7_A14057AlbTiras = new String[] {""} ;
      P09UR7_A5051TipAcaCod = new short[1] ;
      P09UR7_A6467BarAlbPlas = new short[1] ;
      P09UR7_A6466PlasCod = new short[1] ;
      P09UR7_n6466PlasCod = new boolean[] {false} ;
      P09UR7_A2441AlbHdrObs = new String[] {""} ;
      P09UR7_A1266BarAlbTub = new int[1] ;
      P09UR7_A1206TubCod = new short[1] ;
      P09UR7_n1206TubCod = new boolean[] {false} ;
      P09UR7_A14059AlbSinTest = new String[] {""} ;
      P09UR7_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR7_A1265BarAlbPie = new int[1] ;
      P09UR7_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR7_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR7_A5019AlbHdrgm2 = new short[1] ;
      P09UR7_A3271AlbHdrAnc = new short[1] ;
      P09UR7_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR7_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR7_A3153CodCod = new String[] {""} ;
      P09UR7_n3153CodCod = new boolean[] {false} ;
      P09UR7_A3393AlbColNum = new int[1] ;
      P09UR7_A12232AlbNomCli = new String[] {""} ;
      P09UR7_A3391AlbSer = new String[] {""} ;
      P09UR7_A2839AlbProVal = new String[] {""} ;
      P09UR7_A130BarCodPar = new String[] {""} ;
      P09UR7_A132BarCodReo = new byte[1] ;
      P09UR7_A129BarCod = new int[1] ;
      P09UR7_A396EmprCod = new String[] {""} ;
      P09UR7_A30AlbProCod = new long[1] ;
      P09UR8_A14059AlbSinTest = new String[] {""} ;
      P09UR8_A5051TipAcaCod = new short[1] ;
      P09UR8_A6467BarAlbPlas = new short[1] ;
      P09UR8_A6466PlasCod = new short[1] ;
      P09UR8_n6466PlasCod = new boolean[] {false} ;
      P09UR8_A2441AlbHdrObs = new String[] {""} ;
      P09UR8_A1266BarAlbTub = new int[1] ;
      P09UR8_A1206TubCod = new short[1] ;
      P09UR8_n1206TubCod = new boolean[] {false} ;
      P09UR8_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR8_A14057AlbTiras = new String[] {""} ;
      P09UR8_A1265BarAlbPie = new int[1] ;
      P09UR8_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR8_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR8_A5019AlbHdrgm2 = new short[1] ;
      P09UR8_A3271AlbHdrAnc = new short[1] ;
      P09UR8_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR8_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR8_A3153CodCod = new String[] {""} ;
      P09UR8_n3153CodCod = new boolean[] {false} ;
      P09UR8_A3393AlbColNum = new int[1] ;
      P09UR8_A12232AlbNomCli = new String[] {""} ;
      P09UR8_A3391AlbSer = new String[] {""} ;
      P09UR8_A2839AlbProVal = new String[] {""} ;
      P09UR8_A130BarCodPar = new String[] {""} ;
      P09UR8_A132BarCodReo = new byte[1] ;
      P09UR8_A129BarCod = new int[1] ;
      P09UR8_A396EmprCod = new String[] {""} ;
      P09UR8_A30AlbProCod = new long[1] ;
      P09UR9_A2441AlbHdrObs = new String[] {""} ;
      P09UR9_A5051TipAcaCod = new short[1] ;
      P09UR9_A6467BarAlbPlas = new short[1] ;
      P09UR9_A6466PlasCod = new short[1] ;
      P09UR9_n6466PlasCod = new boolean[] {false} ;
      P09UR9_A1266BarAlbTub = new int[1] ;
      P09UR9_A1206TubCod = new short[1] ;
      P09UR9_n1206TubCod = new boolean[] {false} ;
      P09UR9_A14059AlbSinTest = new String[] {""} ;
      P09UR9_A14058AlbTirasKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR9_A14057AlbTiras = new String[] {""} ;
      P09UR9_A1265BarAlbPie = new int[1] ;
      P09UR9_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR9_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR9_A5019AlbHdrgm2 = new short[1] ;
      P09UR9_A3271AlbHdrAnc = new short[1] ;
      P09UR9_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR9_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09UR9_A3153CodCod = new String[] {""} ;
      P09UR9_n3153CodCod = new boolean[] {false} ;
      P09UR9_A3393AlbColNum = new int[1] ;
      P09UR9_A12232AlbNomCli = new String[] {""} ;
      P09UR9_A3391AlbSer = new String[] {""} ;
      P09UR9_A2839AlbProVal = new String[] {""} ;
      P09UR9_A130BarCodPar = new String[] {""} ;
      P09UR9_A132BarCodReo = new byte[1] ;
      P09UR9_A129BarCod = new int[1] ;
      P09UR9_A396EmprCod = new String[] {""} ;
      P09UR9_A30AlbProCod = new long[1] ;
      GXt_char2 = "" ;
      GXv_char7 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char6 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaranguia__wwgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P09UR2_A5051TipAcaCod, P09UR2_A6467BarAlbPlas, P09UR2_A6466PlasCod, P09UR2_n6466PlasCod, P09UR2_A2441AlbHdrObs, P09UR2_A1266BarAlbTub, P09UR2_A1206TubCod, P09UR2_n1206TubCod, P09UR2_A14059AlbSinTest, P09UR2_A14058AlbTirasKg,
            P09UR2_A14057AlbTiras, P09UR2_A1265BarAlbPie, P09UR2_A1264BarPreMtr, P09UR2_A1263BarAlbMtrE, P09UR2_A5019AlbHdrgm2, P09UR2_A3271AlbHdrAnc, P09UR2_A1262BarPreKgm, P09UR2_A1261BarAlbKgmE, P09UR2_A3153CodCod, P09UR2_n3153CodCod,
            P09UR2_A3393AlbColNum, P09UR2_A12232AlbNomCli, P09UR2_A3391AlbSer, P09UR2_A2839AlbProVal, P09UR2_A130BarCodPar, P09UR2_A132BarCodReo, P09UR2_A129BarCod, P09UR2_A396EmprCod, P09UR2_A30AlbProCod
            }
            , new Object[] {
            P09UR3_A3391AlbSer, P09UR3_A5051TipAcaCod, P09UR3_A6467BarAlbPlas, P09UR3_A6466PlasCod, P09UR3_n6466PlasCod, P09UR3_A2441AlbHdrObs, P09UR3_A1266BarAlbTub, P09UR3_A1206TubCod, P09UR3_n1206TubCod, P09UR3_A14059AlbSinTest,
            P09UR3_A14058AlbTirasKg, P09UR3_A14057AlbTiras, P09UR3_A1265BarAlbPie, P09UR3_A1264BarPreMtr, P09UR3_A1263BarAlbMtrE, P09UR3_A5019AlbHdrgm2, P09UR3_A3271AlbHdrAnc, P09UR3_A1262BarPreKgm, P09UR3_A1261BarAlbKgmE, P09UR3_A3153CodCod,
            P09UR3_n3153CodCod, P09UR3_A3393AlbColNum, P09UR3_A12232AlbNomCli, P09UR3_A2839AlbProVal, P09UR3_A130BarCodPar, P09UR3_A132BarCodReo, P09UR3_A129BarCod, P09UR3_A396EmprCod, P09UR3_A30AlbProCod
            }
            , new Object[] {
            P09UR4_A5051TipAcaCod, P09UR4_A6467BarAlbPlas, P09UR4_A6466PlasCod, P09UR4_n6466PlasCod, P09UR4_A2441AlbHdrObs, P09UR4_A1266BarAlbTub, P09UR4_A1206TubCod, P09UR4_n1206TubCod, P09UR4_A14059AlbSinTest, P09UR4_A14058AlbTirasKg,
            P09UR4_A14057AlbTiras, P09UR4_A1265BarAlbPie, P09UR4_A1264BarPreMtr, P09UR4_A1263BarAlbMtrE, P09UR4_A5019AlbHdrgm2, P09UR4_A3271AlbHdrAnc, P09UR4_A1262BarPreKgm, P09UR4_A1261BarAlbKgmE, P09UR4_A3153CodCod, P09UR4_n3153CodCod,
            P09UR4_A3393AlbColNum, P09UR4_A12232AlbNomCli, P09UR4_A3391AlbSer, P09UR4_A2839AlbProVal, P09UR4_A130BarCodPar, P09UR4_A132BarCodReo, P09UR4_A129BarCod, P09UR4_A396EmprCod, P09UR4_A30AlbProCod
            }
            , new Object[] {
            P09UR5_A12232AlbNomCli, P09UR5_A5051TipAcaCod, P09UR5_A6467BarAlbPlas, P09UR5_A6466PlasCod, P09UR5_n6466PlasCod, P09UR5_A2441AlbHdrObs, P09UR5_A1266BarAlbTub, P09UR5_A1206TubCod, P09UR5_n1206TubCod, P09UR5_A14059AlbSinTest,
            P09UR5_A14058AlbTirasKg, P09UR5_A14057AlbTiras, P09UR5_A1265BarAlbPie, P09UR5_A1264BarPreMtr, P09UR5_A1263BarAlbMtrE, P09UR5_A5019AlbHdrgm2, P09UR5_A3271AlbHdrAnc, P09UR5_A1262BarPreKgm, P09UR5_A1261BarAlbKgmE, P09UR5_A3153CodCod,
            P09UR5_n3153CodCod, P09UR5_A3393AlbColNum, P09UR5_A3391AlbSer, P09UR5_A2839AlbProVal, P09UR5_A130BarCodPar, P09UR5_A132BarCodReo, P09UR5_A129BarCod, P09UR5_A396EmprCod, P09UR5_A30AlbProCod
            }
            , new Object[] {
            P09UR6_A3153CodCod, P09UR6_n3153CodCod, P09UR6_A5051TipAcaCod, P09UR6_A6467BarAlbPlas, P09UR6_A6466PlasCod, P09UR6_n6466PlasCod, P09UR6_A2441AlbHdrObs, P09UR6_A1266BarAlbTub, P09UR6_A1206TubCod, P09UR6_n1206TubCod,
            P09UR6_A14059AlbSinTest, P09UR6_A14058AlbTirasKg, P09UR6_A14057AlbTiras, P09UR6_A1265BarAlbPie, P09UR6_A1264BarPreMtr, P09UR6_A1263BarAlbMtrE, P09UR6_A5019AlbHdrgm2, P09UR6_A3271AlbHdrAnc, P09UR6_A1262BarPreKgm, P09UR6_A1261BarAlbKgmE,
            P09UR6_A3393AlbColNum, P09UR6_A12232AlbNomCli, P09UR6_A3391AlbSer, P09UR6_A2839AlbProVal, P09UR6_A130BarCodPar, P09UR6_A132BarCodReo, P09UR6_A129BarCod, P09UR6_A396EmprCod, P09UR6_A30AlbProCod
            }
            , new Object[] {
            P09UR7_A14057AlbTiras, P09UR7_A5051TipAcaCod, P09UR7_A6467BarAlbPlas, P09UR7_A6466PlasCod, P09UR7_n6466PlasCod, P09UR7_A2441AlbHdrObs, P09UR7_A1266BarAlbTub, P09UR7_A1206TubCod, P09UR7_n1206TubCod, P09UR7_A14059AlbSinTest,
            P09UR7_A14058AlbTirasKg, P09UR7_A1265BarAlbPie, P09UR7_A1264BarPreMtr, P09UR7_A1263BarAlbMtrE, P09UR7_A5019AlbHdrgm2, P09UR7_A3271AlbHdrAnc, P09UR7_A1262BarPreKgm, P09UR7_A1261BarAlbKgmE, P09UR7_A3153CodCod, P09UR7_n3153CodCod,
            P09UR7_A3393AlbColNum, P09UR7_A12232AlbNomCli, P09UR7_A3391AlbSer, P09UR7_A2839AlbProVal, P09UR7_A130BarCodPar, P09UR7_A132BarCodReo, P09UR7_A129BarCod, P09UR7_A396EmprCod, P09UR7_A30AlbProCod
            }
            , new Object[] {
            P09UR8_A14059AlbSinTest, P09UR8_A5051TipAcaCod, P09UR8_A6467BarAlbPlas, P09UR8_A6466PlasCod, P09UR8_n6466PlasCod, P09UR8_A2441AlbHdrObs, P09UR8_A1266BarAlbTub, P09UR8_A1206TubCod, P09UR8_n1206TubCod, P09UR8_A14058AlbTirasKg,
            P09UR8_A14057AlbTiras, P09UR8_A1265BarAlbPie, P09UR8_A1264BarPreMtr, P09UR8_A1263BarAlbMtrE, P09UR8_A5019AlbHdrgm2, P09UR8_A3271AlbHdrAnc, P09UR8_A1262BarPreKgm, P09UR8_A1261BarAlbKgmE, P09UR8_A3153CodCod, P09UR8_n3153CodCod,
            P09UR8_A3393AlbColNum, P09UR8_A12232AlbNomCli, P09UR8_A3391AlbSer, P09UR8_A2839AlbProVal, P09UR8_A130BarCodPar, P09UR8_A132BarCodReo, P09UR8_A129BarCod, P09UR8_A396EmprCod, P09UR8_A30AlbProCod
            }
            , new Object[] {
            P09UR9_A2441AlbHdrObs, P09UR9_A5051TipAcaCod, P09UR9_A6467BarAlbPlas, P09UR9_A6466PlasCod, P09UR9_n6466PlasCod, P09UR9_A1266BarAlbTub, P09UR9_A1206TubCod, P09UR9_n1206TubCod, P09UR9_A14059AlbSinTest, P09UR9_A14058AlbTirasKg,
            P09UR9_A14057AlbTiras, P09UR9_A1265BarAlbPie, P09UR9_A1264BarPreMtr, P09UR9_A1263BarAlbMtrE, P09UR9_A5019AlbHdrgm2, P09UR9_A3271AlbHdrAnc, P09UR9_A1262BarPreKgm, P09UR9_A1261BarAlbKgmE, P09UR9_A3153CodCod, P09UR9_n3153CodCod,
            P09UR9_A3393AlbColNum, P09UR9_A12232AlbNomCli, P09UR9_A3391AlbSer, P09UR9_A2839AlbProVal, P09UR9_A130BarCodPar, P09UR9_A132BarCodReo, P09UR9_A129BarCod, P09UR9_A396EmprCod, P09UR9_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TFBarCodReo ;
   private byte AV13TFBarCodReo_To ;
   private byte AV90Albaranes_albaranguia__wwds_4_tfbarcodreo ;
   private byte AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to ;
   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short AV30TFAlbHdrAnc ;
   private short AV31TFAlbHdrAnc_To ;
   private short AV32TFAlbHdrgm2 ;
   private short AV33TFAlbHdrgm2_To ;
   private short AV46TFTubCod ;
   private short AV47TFTubCod_To ;
   private short AV52TFPlasCod ;
   private short AV53TFPlasCod_To ;
   private short AV54TFBarAlbPlas ;
   private short AV55TFBarAlbPlas_To ;
   private short AV56TFTipAcaCod ;
   private short AV57TFTipAcaCod_To ;
   private short AV108Albaranes_albaranguia__wwds_22_tfalbhdranc ;
   private short AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to ;
   private short AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ;
   private short AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ;
   private short AV124Albaranes_albaranguia__wwds_38_tftubcod ;
   private short AV125Albaranes_albaranguia__wwds_39_tftubcod_to ;
   private short AV130Albaranes_albaranguia__wwds_44_tfplascod ;
   private short AV131Albaranes_albaranguia__wwds_45_tfplascod_to ;
   private short AV132Albaranes_albaranguia__wwds_46_tfbaralbplas ;
   private short AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to ;
   private short AV134Albaranes_albaranguia__wwds_48_tftipacacod ;
   private short AV135Albaranes_albaranguia__wwds_49_tftipacacod_to ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short A5051TipAcaCod ;
   private short Gx_err ;
   private int AV85GXV1 ;
   private int AV10TFBarCod ;
   private int AV11TFBarCod_To ;
   private int AV22TFAlbColNum ;
   private int AV23TFAlbColNum_To ;
   private int AV38TFBarAlbPie ;
   private int AV39TFBarAlbPie_To ;
   private int AV48TFBarAlbTub ;
   private int AV49TFBarAlbTub_To ;
   private int AV88Albaranes_albaranguia__wwds_2_tfbarcod ;
   private int AV89Albaranes_albaranguia__wwds_3_tfbarcod_to ;
   private int AV100Albaranes_albaranguia__wwds_14_tfalbcolnum ;
   private int AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to ;
   private int AV116Albaranes_albaranguia__wwds_30_tfbaralbpie ;
   private int AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to ;
   private int AV126Albaranes_albaranguia__wwds_40_tfbaralbtub ;
   private int AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to ;
   private int AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ;
   private int A129BarCod ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int AV64InsertIndex ;
   private int GXv_int4[] ;
   private long A30AlbProCod ;
   private long AV70count ;
   private java.math.BigDecimal AV26TFBarAlbKgmE ;
   private java.math.BigDecimal AV27TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV28TFBarPreKgm ;
   private java.math.BigDecimal AV29TFBarPreKgm_To ;
   private java.math.BigDecimal AV34TFBarAlbMtrE ;
   private java.math.BigDecimal AV35TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV36TFBarPreMtr ;
   private java.math.BigDecimal AV37TFBarPreMtr_To ;
   private java.math.BigDecimal AV42TFAlbTirasKg ;
   private java.math.BigDecimal AV43TFAlbTirasKg_To ;
   private java.math.BigDecimal AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ;
   private java.math.BigDecimal AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ;
   private java.math.BigDecimal AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ;
   private java.math.BigDecimal AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ;
   private java.math.BigDecimal AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ;
   private java.math.BigDecimal AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ;
   private java.math.BigDecimal AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ;
   private java.math.BigDecimal AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ;
   private java.math.BigDecimal AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ;
   private java.math.BigDecimal AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A14058AlbTirasKg ;
   private String AV14TFBarCodPar ;
   private String AV15TFBarCodPar_Sel ;
   private String AV16TFAlbSer ;
   private String AV17TFAlbSer_Sel ;
   private String AV18TFAlbColorCv ;
   private String AV19TFAlbColorCv_Sel ;
   private String AV20TFAlbNomCli ;
   private String AV21TFAlbNomCli_Sel ;
   private String AV24TFCodCod ;
   private String AV25TFCodCod_Sel ;
   private String AV40TFAlbTiras ;
   private String AV41TFAlbTiras_Sel ;
   private String AV44TFAlbSinTest ;
   private String AV45TFAlbSinTest_Sel ;
   private String AV50TFAlbHdrObs ;
   private String AV51TFAlbHdrObs_Sel ;
   private String A130BarCodPar ;
   private String AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ;
   private String AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ;
   private String AV94Albaranes_albaranguia__wwds_8_tfalbser ;
   private String AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ;
   private String AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv ;
   private String AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ;
   private String AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ;
   private String AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ;
   private String AV102Albaranes_albaranguia__wwds_16_tfcodcod ;
   private String AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ;
   private String AV118Albaranes_albaranguia__wwds_32_tfalbtiras ;
   private String AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ;
   private String AV122Albaranes_albaranguia__wwds_36_tfalbsintest ;
   private String AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ;
   private String AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ;
   private String AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ;
   private String scmdbuf ;
   private String lV92Albaranes_albaranguia__wwds_6_tfbarcodpar ;
   private String lV94Albaranes_albaranguia__wwds_8_tfalbser ;
   private String lV98Albaranes_albaranguia__wwds_12_tfalbnomcli ;
   private String lV102Albaranes_albaranguia__wwds_16_tfcodcod ;
   private String lV118Albaranes_albaranguia__wwds_32_tfalbtiras ;
   private String lV122Albaranes_albaranguia__wwds_36_tfalbsintest ;
   private String lV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ;
   private String A2839AlbProVal ;
   private String A3391AlbSer ;
   private String A12232AlbNomCli ;
   private String A3153CodCod ;
   private String A14057AlbTiras ;
   private String A14059AlbSinTest ;
   private String A2441AlbHdrObs ;
   private String A14056AlbColorCv ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean brk9UR2 ;
   private boolean n6466PlasCod ;
   private boolean n1206TubCod ;
   private boolean n3153CodCod ;
   private boolean brk9UR4 ;
   private boolean brk9UR7 ;
   private boolean brk9UR9 ;
   private boolean brk9UR11 ;
   private boolean brk9UR13 ;
   private boolean brk9UR15 ;
   private String AV79OptionsJson ;
   private String AV80OptionsDescJson ;
   private String AV81OptionIndexesJson ;
   private String AV58TFAlbProVal_SelsJson ;
   private String AV76DDOName ;
   private String AV77SearchTxt ;
   private String AV78SearchTxtTo ;
   private String AV82FilterFullText ;
   private String AV87Albaranes_albaranguia__wwds_1_filterfulltext ;
   private String AV65Option ;
   private String AV67OptionDesc ;
   private com.genexus.webpanels.WebSession AV71Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P09UR2_A5051TipAcaCod ;
   private short[] P09UR2_A6467BarAlbPlas ;
   private short[] P09UR2_A6466PlasCod ;
   private boolean[] P09UR2_n6466PlasCod ;
   private String[] P09UR2_A2441AlbHdrObs ;
   private int[] P09UR2_A1266BarAlbTub ;
   private short[] P09UR2_A1206TubCod ;
   private boolean[] P09UR2_n1206TubCod ;
   private String[] P09UR2_A14059AlbSinTest ;
   private java.math.BigDecimal[] P09UR2_A14058AlbTirasKg ;
   private String[] P09UR2_A14057AlbTiras ;
   private int[] P09UR2_A1265BarAlbPie ;
   private java.math.BigDecimal[] P09UR2_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09UR2_A1263BarAlbMtrE ;
   private short[] P09UR2_A5019AlbHdrgm2 ;
   private short[] P09UR2_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P09UR2_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09UR2_A1261BarAlbKgmE ;
   private String[] P09UR2_A3153CodCod ;
   private boolean[] P09UR2_n3153CodCod ;
   private int[] P09UR2_A3393AlbColNum ;
   private String[] P09UR2_A12232AlbNomCli ;
   private String[] P09UR2_A3391AlbSer ;
   private String[] P09UR2_A2839AlbProVal ;
   private String[] P09UR2_A130BarCodPar ;
   private byte[] P09UR2_A132BarCodReo ;
   private int[] P09UR2_A129BarCod ;
   private String[] P09UR2_A396EmprCod ;
   private long[] P09UR2_A30AlbProCod ;
   private String[] P09UR3_A3391AlbSer ;
   private short[] P09UR3_A5051TipAcaCod ;
   private short[] P09UR3_A6467BarAlbPlas ;
   private short[] P09UR3_A6466PlasCod ;
   private boolean[] P09UR3_n6466PlasCod ;
   private String[] P09UR3_A2441AlbHdrObs ;
   private int[] P09UR3_A1266BarAlbTub ;
   private short[] P09UR3_A1206TubCod ;
   private boolean[] P09UR3_n1206TubCod ;
   private String[] P09UR3_A14059AlbSinTest ;
   private java.math.BigDecimal[] P09UR3_A14058AlbTirasKg ;
   private String[] P09UR3_A14057AlbTiras ;
   private int[] P09UR3_A1265BarAlbPie ;
   private java.math.BigDecimal[] P09UR3_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09UR3_A1263BarAlbMtrE ;
   private short[] P09UR3_A5019AlbHdrgm2 ;
   private short[] P09UR3_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P09UR3_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09UR3_A1261BarAlbKgmE ;
   private String[] P09UR3_A3153CodCod ;
   private boolean[] P09UR3_n3153CodCod ;
   private int[] P09UR3_A3393AlbColNum ;
   private String[] P09UR3_A12232AlbNomCli ;
   private String[] P09UR3_A2839AlbProVal ;
   private String[] P09UR3_A130BarCodPar ;
   private byte[] P09UR3_A132BarCodReo ;
   private int[] P09UR3_A129BarCod ;
   private String[] P09UR3_A396EmprCod ;
   private long[] P09UR3_A30AlbProCod ;
   private short[] P09UR4_A5051TipAcaCod ;
   private short[] P09UR4_A6467BarAlbPlas ;
   private short[] P09UR4_A6466PlasCod ;
   private boolean[] P09UR4_n6466PlasCod ;
   private String[] P09UR4_A2441AlbHdrObs ;
   private int[] P09UR4_A1266BarAlbTub ;
   private short[] P09UR4_A1206TubCod ;
   private boolean[] P09UR4_n1206TubCod ;
   private String[] P09UR4_A14059AlbSinTest ;
   private java.math.BigDecimal[] P09UR4_A14058AlbTirasKg ;
   private String[] P09UR4_A14057AlbTiras ;
   private int[] P09UR4_A1265BarAlbPie ;
   private java.math.BigDecimal[] P09UR4_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09UR4_A1263BarAlbMtrE ;
   private short[] P09UR4_A5019AlbHdrgm2 ;
   private short[] P09UR4_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P09UR4_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09UR4_A1261BarAlbKgmE ;
   private String[] P09UR4_A3153CodCod ;
   private boolean[] P09UR4_n3153CodCod ;
   private int[] P09UR4_A3393AlbColNum ;
   private String[] P09UR4_A12232AlbNomCli ;
   private String[] P09UR4_A3391AlbSer ;
   private String[] P09UR4_A2839AlbProVal ;
   private String[] P09UR4_A130BarCodPar ;
   private byte[] P09UR4_A132BarCodReo ;
   private int[] P09UR4_A129BarCod ;
   private String[] P09UR4_A396EmprCod ;
   private long[] P09UR4_A30AlbProCod ;
   private String[] P09UR5_A12232AlbNomCli ;
   private short[] P09UR5_A5051TipAcaCod ;
   private short[] P09UR5_A6467BarAlbPlas ;
   private short[] P09UR5_A6466PlasCod ;
   private boolean[] P09UR5_n6466PlasCod ;
   private String[] P09UR5_A2441AlbHdrObs ;
   private int[] P09UR5_A1266BarAlbTub ;
   private short[] P09UR5_A1206TubCod ;
   private boolean[] P09UR5_n1206TubCod ;
   private String[] P09UR5_A14059AlbSinTest ;
   private java.math.BigDecimal[] P09UR5_A14058AlbTirasKg ;
   private String[] P09UR5_A14057AlbTiras ;
   private int[] P09UR5_A1265BarAlbPie ;
   private java.math.BigDecimal[] P09UR5_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09UR5_A1263BarAlbMtrE ;
   private short[] P09UR5_A5019AlbHdrgm2 ;
   private short[] P09UR5_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P09UR5_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09UR5_A1261BarAlbKgmE ;
   private String[] P09UR5_A3153CodCod ;
   private boolean[] P09UR5_n3153CodCod ;
   private int[] P09UR5_A3393AlbColNum ;
   private String[] P09UR5_A3391AlbSer ;
   private String[] P09UR5_A2839AlbProVal ;
   private String[] P09UR5_A130BarCodPar ;
   private byte[] P09UR5_A132BarCodReo ;
   private int[] P09UR5_A129BarCod ;
   private String[] P09UR5_A396EmprCod ;
   private long[] P09UR5_A30AlbProCod ;
   private String[] P09UR6_A3153CodCod ;
   private boolean[] P09UR6_n3153CodCod ;
   private short[] P09UR6_A5051TipAcaCod ;
   private short[] P09UR6_A6467BarAlbPlas ;
   private short[] P09UR6_A6466PlasCod ;
   private boolean[] P09UR6_n6466PlasCod ;
   private String[] P09UR6_A2441AlbHdrObs ;
   private int[] P09UR6_A1266BarAlbTub ;
   private short[] P09UR6_A1206TubCod ;
   private boolean[] P09UR6_n1206TubCod ;
   private String[] P09UR6_A14059AlbSinTest ;
   private java.math.BigDecimal[] P09UR6_A14058AlbTirasKg ;
   private String[] P09UR6_A14057AlbTiras ;
   private int[] P09UR6_A1265BarAlbPie ;
   private java.math.BigDecimal[] P09UR6_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09UR6_A1263BarAlbMtrE ;
   private short[] P09UR6_A5019AlbHdrgm2 ;
   private short[] P09UR6_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P09UR6_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09UR6_A1261BarAlbKgmE ;
   private int[] P09UR6_A3393AlbColNum ;
   private String[] P09UR6_A12232AlbNomCli ;
   private String[] P09UR6_A3391AlbSer ;
   private String[] P09UR6_A2839AlbProVal ;
   private String[] P09UR6_A130BarCodPar ;
   private byte[] P09UR6_A132BarCodReo ;
   private int[] P09UR6_A129BarCod ;
   private String[] P09UR6_A396EmprCod ;
   private long[] P09UR6_A30AlbProCod ;
   private String[] P09UR7_A14057AlbTiras ;
   private short[] P09UR7_A5051TipAcaCod ;
   private short[] P09UR7_A6467BarAlbPlas ;
   private short[] P09UR7_A6466PlasCod ;
   private boolean[] P09UR7_n6466PlasCod ;
   private String[] P09UR7_A2441AlbHdrObs ;
   private int[] P09UR7_A1266BarAlbTub ;
   private short[] P09UR7_A1206TubCod ;
   private boolean[] P09UR7_n1206TubCod ;
   private String[] P09UR7_A14059AlbSinTest ;
   private java.math.BigDecimal[] P09UR7_A14058AlbTirasKg ;
   private int[] P09UR7_A1265BarAlbPie ;
   private java.math.BigDecimal[] P09UR7_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09UR7_A1263BarAlbMtrE ;
   private short[] P09UR7_A5019AlbHdrgm2 ;
   private short[] P09UR7_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P09UR7_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09UR7_A1261BarAlbKgmE ;
   private String[] P09UR7_A3153CodCod ;
   private boolean[] P09UR7_n3153CodCod ;
   private int[] P09UR7_A3393AlbColNum ;
   private String[] P09UR7_A12232AlbNomCli ;
   private String[] P09UR7_A3391AlbSer ;
   private String[] P09UR7_A2839AlbProVal ;
   private String[] P09UR7_A130BarCodPar ;
   private byte[] P09UR7_A132BarCodReo ;
   private int[] P09UR7_A129BarCod ;
   private String[] P09UR7_A396EmprCod ;
   private long[] P09UR7_A30AlbProCod ;
   private String[] P09UR8_A14059AlbSinTest ;
   private short[] P09UR8_A5051TipAcaCod ;
   private short[] P09UR8_A6467BarAlbPlas ;
   private short[] P09UR8_A6466PlasCod ;
   private boolean[] P09UR8_n6466PlasCod ;
   private String[] P09UR8_A2441AlbHdrObs ;
   private int[] P09UR8_A1266BarAlbTub ;
   private short[] P09UR8_A1206TubCod ;
   private boolean[] P09UR8_n1206TubCod ;
   private java.math.BigDecimal[] P09UR8_A14058AlbTirasKg ;
   private String[] P09UR8_A14057AlbTiras ;
   private int[] P09UR8_A1265BarAlbPie ;
   private java.math.BigDecimal[] P09UR8_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09UR8_A1263BarAlbMtrE ;
   private short[] P09UR8_A5019AlbHdrgm2 ;
   private short[] P09UR8_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P09UR8_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09UR8_A1261BarAlbKgmE ;
   private String[] P09UR8_A3153CodCod ;
   private boolean[] P09UR8_n3153CodCod ;
   private int[] P09UR8_A3393AlbColNum ;
   private String[] P09UR8_A12232AlbNomCli ;
   private String[] P09UR8_A3391AlbSer ;
   private String[] P09UR8_A2839AlbProVal ;
   private String[] P09UR8_A130BarCodPar ;
   private byte[] P09UR8_A132BarCodReo ;
   private int[] P09UR8_A129BarCod ;
   private String[] P09UR8_A396EmprCod ;
   private long[] P09UR8_A30AlbProCod ;
   private String[] P09UR9_A2441AlbHdrObs ;
   private short[] P09UR9_A5051TipAcaCod ;
   private short[] P09UR9_A6467BarAlbPlas ;
   private short[] P09UR9_A6466PlasCod ;
   private boolean[] P09UR9_n6466PlasCod ;
   private int[] P09UR9_A1266BarAlbTub ;
   private short[] P09UR9_A1206TubCod ;
   private boolean[] P09UR9_n1206TubCod ;
   private String[] P09UR9_A14059AlbSinTest ;
   private java.math.BigDecimal[] P09UR9_A14058AlbTirasKg ;
   private String[] P09UR9_A14057AlbTiras ;
   private int[] P09UR9_A1265BarAlbPie ;
   private java.math.BigDecimal[] P09UR9_A1264BarPreMtr ;
   private java.math.BigDecimal[] P09UR9_A1263BarAlbMtrE ;
   private short[] P09UR9_A5019AlbHdrgm2 ;
   private short[] P09UR9_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P09UR9_A1262BarPreKgm ;
   private java.math.BigDecimal[] P09UR9_A1261BarAlbKgmE ;
   private String[] P09UR9_A3153CodCod ;
   private boolean[] P09UR9_n3153CodCod ;
   private int[] P09UR9_A3393AlbColNum ;
   private String[] P09UR9_A12232AlbNomCli ;
   private String[] P09UR9_A3391AlbSer ;
   private String[] P09UR9_A2839AlbProVal ;
   private String[] P09UR9_A130BarCodPar ;
   private byte[] P09UR9_A132BarCodReo ;
   private int[] P09UR9_A129BarCod ;
   private String[] P09UR9_A396EmprCod ;
   private long[] P09UR9_A30AlbProCod ;
   private GXSimpleCollection<String> AV59TFAlbProVal_Sels ;
   private GXSimpleCollection<String> AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ;
   private GXSimpleCollection<String> AV66Options ;
   private GXSimpleCollection<String> AV68OptionsDesc ;
   private GXSimpleCollection<String> AV69OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV73GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV74GridStateFilterValue ;
}

final  class albaranguia__wwgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09UR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                          int AV88Albaranes_albaranguia__wwds_2_tfbarcod ,
                                          int AV89Albaranes_albaranguia__wwds_3_tfbarcod_to ,
                                          byte AV90Albaranes_albaranguia__wwds_4_tfbarcodreo ,
                                          byte AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to ,
                                          String AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                          String AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                          String AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                          String AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                          String AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                          String AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                          int AV100Albaranes_albaranguia__wwds_14_tfalbcolnum ,
                                          int AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to ,
                                          String AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                          String AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                          java.math.BigDecimal AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                          java.math.BigDecimal AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                          short AV108Albaranes_albaranguia__wwds_22_tfalbhdranc ,
                                          short AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to ,
                                          short AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ,
                                          short AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                          java.math.BigDecimal AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                          int AV116Albaranes_albaranguia__wwds_30_tfbaralbpie ,
                                          int AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to ,
                                          String AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                          String AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                          java.math.BigDecimal AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                          java.math.BigDecimal AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                          String AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                          String AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                          short AV124Albaranes_albaranguia__wwds_38_tftubcod ,
                                          short AV125Albaranes_albaranguia__wwds_39_tftubcod_to ,
                                          int AV126Albaranes_albaranguia__wwds_40_tfbaralbtub ,
                                          int AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to ,
                                          String AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                          String AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                          short AV130Albaranes_albaranguia__wwds_44_tfplascod ,
                                          short AV131Albaranes_albaranguia__wwds_45_tfplascod_to ,
                                          short AV132Albaranes_albaranguia__wwds_46_tfbaralbplas ,
                                          short AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to ,
                                          short AV134Albaranes_albaranguia__wwds_48_tftipacacod ,
                                          short AV135Albaranes_albaranguia__wwds_49_tftipacacod_to ,
                                          int AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          String A14057AlbTiras ,
                                          java.math.BigDecimal A14058AlbTirasKg ,
                                          String A14059AlbSinTest ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          String A2441AlbHdrObs ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          short A5051TipAcaCod ,
                                          String AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                          String A14056AlbColorCv ,
                                          String AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                          String AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[46];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT TipAcaCod, BarAlbPlas, PlasCod, AlbHdrObs, BarAlbTub, TubCod, AlbSinTest, AlbTirasKg, AlbTiras, BarAlbPie, BarPreMtr, BarAlbMtrE, AlbHdrgm2, AlbHdrAnc, BarPreKgm," ;
      scmdbuf += " BarAlbKgmE, CodCod, AlbColNum, AlbNomCli, AlbSer, AlbProVal, BarCodPar, BarCodReo, BarCod, EmprCod, AlbProCod FROM TXPALBBAR" ;
      if ( ! (0==AV88Albaranes_albaranguia__wwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (0==AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV92Albaranes_albaranguia__wwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV94Albaranes_albaranguia__wwds_8_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSer = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV98Albaranes_albaranguia__wwds_12_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(AlbNomCli = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) )
      {
         addWhere(sWhereString, "(AlbColNum >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(AlbColNum <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Albaranes_albaranguia__wwds_16_tfcodcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CodCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) )
      {
         addWhere(sWhereString, "(CodCod = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) )
      {
         addWhere(sWhereString, "(AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) )
      {
         addWhere(sWhereString, "(BarAlbPie >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(BarAlbPie <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) && ( ! (GXutil.strcmp("", AV118Albaranes_albaranguia__wwds_32_tfalbtiras)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbTiras) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) )
      {
         addWhere(sWhereString, "(AlbTiras = ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) && ( ! (GXutil.strcmp("", AV122Albaranes_albaranguia__wwds_36_tfalbsintest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSinTest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSinTest = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV124Albaranes_albaranguia__wwds_38_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV125Albaranes_albaranguia__wwds_39_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (0==AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) )
      {
         addWhere(sWhereString, "(BarAlbTub >= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (0==AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(BarAlbTub <= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHdrObs = ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (0==AV130Albaranes_albaranguia__wwds_44_tfplascod) )
      {
         addWhere(sWhereString, "(PlasCod >= ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      if ( ! (0==AV131Albaranes_albaranguia__wwds_45_tfplascod_to) )
      {
         addWhere(sWhereString, "(PlasCod <= ?)");
      }
      else
      {
         GXv_int8[41] = (byte)(1) ;
      }
      if ( ! (0==AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) )
      {
         addWhere(sWhereString, "(BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int8[42] = (byte)(1) ;
      }
      if ( ! (0==AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int8[43] = (byte)(1) ;
      }
      if ( ! (0==AV134Albaranes_albaranguia__wwds_48_tftipacacod) )
      {
         addWhere(sWhereString, "(TipAcaCod >= ?)");
      }
      else
      {
         GXv_int8[44] = (byte)(1) ;
      }
      if ( ! (0==AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) )
      {
         addWhere(sWhereString, "(TipAcaCod <= ?)");
      }
      else
      {
         GXv_int8[45] = (byte)(1) ;
      }
      if ( AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels, "AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY BarCodPar" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P09UR3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                          int AV88Albaranes_albaranguia__wwds_2_tfbarcod ,
                                          int AV89Albaranes_albaranguia__wwds_3_tfbarcod_to ,
                                          byte AV90Albaranes_albaranguia__wwds_4_tfbarcodreo ,
                                          byte AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to ,
                                          String AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                          String AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                          String AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                          String AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                          String AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                          String AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                          int AV100Albaranes_albaranguia__wwds_14_tfalbcolnum ,
                                          int AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to ,
                                          String AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                          String AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                          java.math.BigDecimal AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                          java.math.BigDecimal AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                          short AV108Albaranes_albaranguia__wwds_22_tfalbhdranc ,
                                          short AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to ,
                                          short AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ,
                                          short AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                          java.math.BigDecimal AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                          int AV116Albaranes_albaranguia__wwds_30_tfbaralbpie ,
                                          int AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to ,
                                          String AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                          String AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                          java.math.BigDecimal AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                          java.math.BigDecimal AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                          String AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                          String AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                          short AV124Albaranes_albaranguia__wwds_38_tftubcod ,
                                          short AV125Albaranes_albaranguia__wwds_39_tftubcod_to ,
                                          int AV126Albaranes_albaranguia__wwds_40_tfbaralbtub ,
                                          int AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to ,
                                          String AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                          String AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                          short AV130Albaranes_albaranguia__wwds_44_tfplascod ,
                                          short AV131Albaranes_albaranguia__wwds_45_tfplascod_to ,
                                          short AV132Albaranes_albaranguia__wwds_46_tfbaralbplas ,
                                          short AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to ,
                                          short AV134Albaranes_albaranguia__wwds_48_tftipacacod ,
                                          short AV135Albaranes_albaranguia__wwds_49_tftipacacod_to ,
                                          int AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          String A14057AlbTiras ,
                                          java.math.BigDecimal A14058AlbTirasKg ,
                                          String A14059AlbSinTest ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          String A2441AlbHdrObs ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          short A5051TipAcaCod ,
                                          String AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                          String A14056AlbColorCv ,
                                          String AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                          String AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[46];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT AlbSer, TipAcaCod, BarAlbPlas, PlasCod, AlbHdrObs, BarAlbTub, TubCod, AlbSinTest, AlbTirasKg, AlbTiras, BarAlbPie, BarPreMtr, BarAlbMtrE, AlbHdrgm2, AlbHdrAnc," ;
      scmdbuf += " BarPreKgm, BarAlbKgmE, CodCod, AlbColNum, AlbNomCli, AlbProVal, BarCodPar, BarCodReo, BarCod, EmprCod, AlbProCod FROM TXPALBBAR" ;
      if ( ! (0==AV88Albaranes_albaranguia__wwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( ! (0==AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (0==AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV92Albaranes_albaranguia__wwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV94Albaranes_albaranguia__wwds_8_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSer = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV98Albaranes_albaranguia__wwds_12_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(AlbNomCli = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (0==AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) )
      {
         addWhere(sWhereString, "(AlbColNum >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (0==AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(AlbColNum <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Albaranes_albaranguia__wwds_16_tfcodcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CodCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) )
      {
         addWhere(sWhereString, "(CodCod = ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) )
      {
         addWhere(sWhereString, "(AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) )
      {
         addWhere(sWhereString, "(BarAlbPie >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (0==AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(BarAlbPie <= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) && ( ! (GXutil.strcmp("", AV118Albaranes_albaranguia__wwds_32_tfalbtiras)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbTiras) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) )
      {
         addWhere(sWhereString, "(AlbTiras = ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) && ( ! (GXutil.strcmp("", AV122Albaranes_albaranguia__wwds_36_tfalbsintest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSinTest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSinTest = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (0==AV124Albaranes_albaranguia__wwds_38_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (0==AV125Albaranes_albaranguia__wwds_39_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) )
      {
         addWhere(sWhereString, "(BarAlbTub >= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(BarAlbTub <= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHdrObs = ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (0==AV130Albaranes_albaranguia__wwds_44_tfplascod) )
      {
         addWhere(sWhereString, "(PlasCod >= ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (0==AV131Albaranes_albaranguia__wwds_45_tfplascod_to) )
      {
         addWhere(sWhereString, "(PlasCod <= ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( ! (0==AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) )
      {
         addWhere(sWhereString, "(BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( ! (0==AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! (0==AV134Albaranes_albaranguia__wwds_48_tftipacacod) )
      {
         addWhere(sWhereString, "(TipAcaCod >= ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( ! (0==AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) )
      {
         addWhere(sWhereString, "(TipAcaCod <= ?)");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels, "AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbSer" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P09UR4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                          int AV88Albaranes_albaranguia__wwds_2_tfbarcod ,
                                          int AV89Albaranes_albaranguia__wwds_3_tfbarcod_to ,
                                          byte AV90Albaranes_albaranguia__wwds_4_tfbarcodreo ,
                                          byte AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to ,
                                          String AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                          String AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                          String AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                          String AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                          String AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                          String AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                          int AV100Albaranes_albaranguia__wwds_14_tfalbcolnum ,
                                          int AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to ,
                                          String AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                          String AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                          java.math.BigDecimal AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                          java.math.BigDecimal AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                          short AV108Albaranes_albaranguia__wwds_22_tfalbhdranc ,
                                          short AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to ,
                                          short AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ,
                                          short AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                          java.math.BigDecimal AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                          int AV116Albaranes_albaranguia__wwds_30_tfbaralbpie ,
                                          int AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to ,
                                          String AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                          String AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                          java.math.BigDecimal AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                          java.math.BigDecimal AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                          String AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                          String AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                          short AV124Albaranes_albaranguia__wwds_38_tftubcod ,
                                          short AV125Albaranes_albaranguia__wwds_39_tftubcod_to ,
                                          int AV126Albaranes_albaranguia__wwds_40_tfbaralbtub ,
                                          int AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to ,
                                          String AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                          String AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                          short AV130Albaranes_albaranguia__wwds_44_tfplascod ,
                                          short AV131Albaranes_albaranguia__wwds_45_tfplascod_to ,
                                          short AV132Albaranes_albaranguia__wwds_46_tfbaralbplas ,
                                          short AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to ,
                                          short AV134Albaranes_albaranguia__wwds_48_tftipacacod ,
                                          short AV135Albaranes_albaranguia__wwds_49_tftipacacod_to ,
                                          int AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          String A14057AlbTiras ,
                                          java.math.BigDecimal A14058AlbTirasKg ,
                                          String A14059AlbSinTest ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          String A2441AlbHdrObs ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          short A5051TipAcaCod ,
                                          String AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                          String A14056AlbColorCv ,
                                          String AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                          String AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[46];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT TipAcaCod, BarAlbPlas, PlasCod, AlbHdrObs, BarAlbTub, TubCod, AlbSinTest, AlbTirasKg, AlbTiras, BarAlbPie, BarPreMtr, BarAlbMtrE, AlbHdrgm2, AlbHdrAnc, BarPreKgm," ;
      scmdbuf += " BarAlbKgmE, CodCod, AlbColNum, AlbNomCli, AlbSer, AlbProVal, BarCodPar, BarCodReo, BarCod, EmprCod, AlbProCod FROM TXPALBBAR" ;
      if ( ! (0==AV88Albaranes_albaranguia__wwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int14[0] = (byte)(1) ;
      }
      if ( ! (0==AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! (0==AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV92Albaranes_albaranguia__wwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV94Albaranes_albaranguia__wwds_8_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSer = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV98Albaranes_albaranguia__wwds_12_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(AlbNomCli = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) )
      {
         addWhere(sWhereString, "(AlbColNum >= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (0==AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(AlbColNum <= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Albaranes_albaranguia__wwds_16_tfcodcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CodCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) )
      {
         addWhere(sWhereString, "(CodCod = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) )
      {
         addWhere(sWhereString, "(AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) )
      {
         addWhere(sWhereString, "(BarAlbPie >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(BarAlbPie <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) && ( ! (GXutil.strcmp("", AV118Albaranes_albaranguia__wwds_32_tfalbtiras)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbTiras) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) )
      {
         addWhere(sWhereString, "(AlbTiras = ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) && ( ! (GXutil.strcmp("", AV122Albaranes_albaranguia__wwds_36_tfalbsintest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSinTest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSinTest = ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV124Albaranes_albaranguia__wwds_38_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV125Albaranes_albaranguia__wwds_39_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (0==AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) )
      {
         addWhere(sWhereString, "(BarAlbTub >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (0==AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(BarAlbTub <= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHdrObs = ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (0==AV130Albaranes_albaranguia__wwds_44_tfplascod) )
      {
         addWhere(sWhereString, "(PlasCod >= ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( ! (0==AV131Albaranes_albaranguia__wwds_45_tfplascod_to) )
      {
         addWhere(sWhereString, "(PlasCod <= ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
      }
      if ( ! (0==AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) )
      {
         addWhere(sWhereString, "(BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int14[42] = (byte)(1) ;
      }
      if ( ! (0==AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int14[43] = (byte)(1) ;
      }
      if ( ! (0==AV134Albaranes_albaranguia__wwds_48_tftipacacod) )
      {
         addWhere(sWhereString, "(TipAcaCod >= ?)");
      }
      else
      {
         GXv_int14[44] = (byte)(1) ;
      }
      if ( ! (0==AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) )
      {
         addWhere(sWhereString, "(TipAcaCod <= ?)");
      }
      else
      {
         GXv_int14[45] = (byte)(1) ;
      }
      if ( AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels, "AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P09UR5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                          int AV88Albaranes_albaranguia__wwds_2_tfbarcod ,
                                          int AV89Albaranes_albaranguia__wwds_3_tfbarcod_to ,
                                          byte AV90Albaranes_albaranguia__wwds_4_tfbarcodreo ,
                                          byte AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to ,
                                          String AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                          String AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                          String AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                          String AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                          String AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                          String AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                          int AV100Albaranes_albaranguia__wwds_14_tfalbcolnum ,
                                          int AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to ,
                                          String AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                          String AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                          java.math.BigDecimal AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                          java.math.BigDecimal AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                          short AV108Albaranes_albaranguia__wwds_22_tfalbhdranc ,
                                          short AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to ,
                                          short AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ,
                                          short AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                          java.math.BigDecimal AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                          int AV116Albaranes_albaranguia__wwds_30_tfbaralbpie ,
                                          int AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to ,
                                          String AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                          String AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                          java.math.BigDecimal AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                          java.math.BigDecimal AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                          String AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                          String AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                          short AV124Albaranes_albaranguia__wwds_38_tftubcod ,
                                          short AV125Albaranes_albaranguia__wwds_39_tftubcod_to ,
                                          int AV126Albaranes_albaranguia__wwds_40_tfbaralbtub ,
                                          int AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to ,
                                          String AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                          String AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                          short AV130Albaranes_albaranguia__wwds_44_tfplascod ,
                                          short AV131Albaranes_albaranguia__wwds_45_tfplascod_to ,
                                          short AV132Albaranes_albaranguia__wwds_46_tfbaralbplas ,
                                          short AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to ,
                                          short AV134Albaranes_albaranguia__wwds_48_tftipacacod ,
                                          short AV135Albaranes_albaranguia__wwds_49_tftipacacod_to ,
                                          int AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          String A14057AlbTiras ,
                                          java.math.BigDecimal A14058AlbTirasKg ,
                                          String A14059AlbSinTest ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          String A2441AlbHdrObs ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          short A5051TipAcaCod ,
                                          String AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                          String A14056AlbColorCv ,
                                          String AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                          String AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[46];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT AlbNomCli, TipAcaCod, BarAlbPlas, PlasCod, AlbHdrObs, BarAlbTub, TubCod, AlbSinTest, AlbTirasKg, AlbTiras, BarAlbPie, BarPreMtr, BarAlbMtrE, AlbHdrgm2, AlbHdrAnc," ;
      scmdbuf += " BarPreKgm, BarAlbKgmE, CodCod, AlbColNum, AlbSer, AlbProVal, BarCodPar, BarCodReo, BarCod, EmprCod, AlbProCod FROM TXPALBBAR" ;
      if ( ! (0==AV88Albaranes_albaranguia__wwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! (0==AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (0==AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (0==AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV92Albaranes_albaranguia__wwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV94Albaranes_albaranguia__wwds_8_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSer = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV98Albaranes_albaranguia__wwds_12_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(AlbNomCli = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (0==AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) )
      {
         addWhere(sWhereString, "(AlbColNum >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(AlbColNum <= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Albaranes_albaranguia__wwds_16_tfcodcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CodCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) )
      {
         addWhere(sWhereString, "(CodCod = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) )
      {
         addWhere(sWhereString, "(AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (0==AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) )
      {
         addWhere(sWhereString, "(BarAlbPie >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (0==AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(BarAlbPie <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) && ( ! (GXutil.strcmp("", AV118Albaranes_albaranguia__wwds_32_tfalbtiras)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbTiras) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) )
      {
         addWhere(sWhereString, "(AlbTiras = ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) && ( ! (GXutil.strcmp("", AV122Albaranes_albaranguia__wwds_36_tfalbsintest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSinTest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSinTest = ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (0==AV124Albaranes_albaranguia__wwds_38_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (0==AV125Albaranes_albaranguia__wwds_39_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( ! (0==AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) )
      {
         addWhere(sWhereString, "(BarAlbTub >= ?)");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (0==AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(BarAlbTub <= ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHdrObs = ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( ! (0==AV130Albaranes_albaranguia__wwds_44_tfplascod) )
      {
         addWhere(sWhereString, "(PlasCod >= ?)");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      if ( ! (0==AV131Albaranes_albaranguia__wwds_45_tfplascod_to) )
      {
         addWhere(sWhereString, "(PlasCod <= ?)");
      }
      else
      {
         GXv_int17[41] = (byte)(1) ;
      }
      if ( ! (0==AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) )
      {
         addWhere(sWhereString, "(BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int17[42] = (byte)(1) ;
      }
      if ( ! (0==AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int17[43] = (byte)(1) ;
      }
      if ( ! (0==AV134Albaranes_albaranguia__wwds_48_tftipacacod) )
      {
         addWhere(sWhereString, "(TipAcaCod >= ?)");
      }
      else
      {
         GXv_int17[44] = (byte)(1) ;
      }
      if ( ! (0==AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) )
      {
         addWhere(sWhereString, "(TipAcaCod <= ?)");
      }
      else
      {
         GXv_int17[45] = (byte)(1) ;
      }
      if ( AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels, "AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbNomCli" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P09UR6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                          int AV88Albaranes_albaranguia__wwds_2_tfbarcod ,
                                          int AV89Albaranes_albaranguia__wwds_3_tfbarcod_to ,
                                          byte AV90Albaranes_albaranguia__wwds_4_tfbarcodreo ,
                                          byte AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to ,
                                          String AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                          String AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                          String AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                          String AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                          String AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                          String AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                          int AV100Albaranes_albaranguia__wwds_14_tfalbcolnum ,
                                          int AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to ,
                                          String AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                          String AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                          java.math.BigDecimal AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                          java.math.BigDecimal AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                          short AV108Albaranes_albaranguia__wwds_22_tfalbhdranc ,
                                          short AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to ,
                                          short AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ,
                                          short AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                          java.math.BigDecimal AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                          int AV116Albaranes_albaranguia__wwds_30_tfbaralbpie ,
                                          int AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to ,
                                          String AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                          String AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                          java.math.BigDecimal AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                          java.math.BigDecimal AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                          String AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                          String AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                          short AV124Albaranes_albaranguia__wwds_38_tftubcod ,
                                          short AV125Albaranes_albaranguia__wwds_39_tftubcod_to ,
                                          int AV126Albaranes_albaranguia__wwds_40_tfbaralbtub ,
                                          int AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to ,
                                          String AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                          String AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                          short AV130Albaranes_albaranguia__wwds_44_tfplascod ,
                                          short AV131Albaranes_albaranguia__wwds_45_tfplascod_to ,
                                          short AV132Albaranes_albaranguia__wwds_46_tfbaralbplas ,
                                          short AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to ,
                                          short AV134Albaranes_albaranguia__wwds_48_tftipacacod ,
                                          short AV135Albaranes_albaranguia__wwds_49_tftipacacod_to ,
                                          int AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          String A14057AlbTiras ,
                                          java.math.BigDecimal A14058AlbTirasKg ,
                                          String A14059AlbSinTest ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          String A2441AlbHdrObs ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          short A5051TipAcaCod ,
                                          String AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                          String A14056AlbColorCv ,
                                          String AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                          String AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[46];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT CodCod, TipAcaCod, BarAlbPlas, PlasCod, AlbHdrObs, BarAlbTub, TubCod, AlbSinTest, AlbTirasKg, AlbTiras, BarAlbPie, BarPreMtr, BarAlbMtrE, AlbHdrgm2, AlbHdrAnc," ;
      scmdbuf += " BarPreKgm, BarAlbKgmE, AlbColNum, AlbNomCli, AlbSer, AlbProVal, BarCodPar, BarCodReo, BarCod, EmprCod, AlbProCod FROM TXPALBBAR" ;
      if ( ! (0==AV88Albaranes_albaranguia__wwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int20[0] = (byte)(1) ;
      }
      if ( ! (0==AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( ! (0==AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (0==AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV92Albaranes_albaranguia__wwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV94Albaranes_albaranguia__wwds_8_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSer = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV98Albaranes_albaranguia__wwds_12_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(AlbNomCli = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! (0==AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) )
      {
         addWhere(sWhereString, "(AlbColNum >= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (0==AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(AlbColNum <= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Albaranes_albaranguia__wwds_16_tfcodcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CodCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) )
      {
         addWhere(sWhereString, "(CodCod = ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm >= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm <= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (0==AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) )
      {
         addWhere(sWhereString, "(AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (0==AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr >= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr <= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (0==AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) )
      {
         addWhere(sWhereString, "(BarAlbPie >= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (0==AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(BarAlbPie <= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) && ( ! (GXutil.strcmp("", AV118Albaranes_albaranguia__wwds_32_tfalbtiras)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbTiras) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) )
      {
         addWhere(sWhereString, "(AlbTiras = ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg >= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg <= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) && ( ! (GXutil.strcmp("", AV122Albaranes_albaranguia__wwds_36_tfalbsintest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSinTest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSinTest = ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (0==AV124Albaranes_albaranguia__wwds_38_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (0==AV125Albaranes_albaranguia__wwds_39_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( ! (0==AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) )
      {
         addWhere(sWhereString, "(BarAlbTub >= ?)");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (0==AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(BarAlbTub <= ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHdrObs = ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (0==AV130Albaranes_albaranguia__wwds_44_tfplascod) )
      {
         addWhere(sWhereString, "(PlasCod >= ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      if ( ! (0==AV131Albaranes_albaranguia__wwds_45_tfplascod_to) )
      {
         addWhere(sWhereString, "(PlasCod <= ?)");
      }
      else
      {
         GXv_int20[41] = (byte)(1) ;
      }
      if ( ! (0==AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) )
      {
         addWhere(sWhereString, "(BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int20[42] = (byte)(1) ;
      }
      if ( ! (0==AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int20[43] = (byte)(1) ;
      }
      if ( ! (0==AV134Albaranes_albaranguia__wwds_48_tftipacacod) )
      {
         addWhere(sWhereString, "(TipAcaCod >= ?)");
      }
      else
      {
         GXv_int20[44] = (byte)(1) ;
      }
      if ( ! (0==AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) )
      {
         addWhere(sWhereString, "(TipAcaCod <= ?)");
      }
      else
      {
         GXv_int20[45] = (byte)(1) ;
      }
      if ( AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels, "AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CodCod" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_P09UR7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                          int AV88Albaranes_albaranguia__wwds_2_tfbarcod ,
                                          int AV89Albaranes_albaranguia__wwds_3_tfbarcod_to ,
                                          byte AV90Albaranes_albaranguia__wwds_4_tfbarcodreo ,
                                          byte AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to ,
                                          String AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                          String AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                          String AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                          String AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                          String AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                          String AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                          int AV100Albaranes_albaranguia__wwds_14_tfalbcolnum ,
                                          int AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to ,
                                          String AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                          String AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                          java.math.BigDecimal AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                          java.math.BigDecimal AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                          short AV108Albaranes_albaranguia__wwds_22_tfalbhdranc ,
                                          short AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to ,
                                          short AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ,
                                          short AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                          java.math.BigDecimal AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                          int AV116Albaranes_albaranguia__wwds_30_tfbaralbpie ,
                                          int AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to ,
                                          String AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                          String AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                          java.math.BigDecimal AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                          java.math.BigDecimal AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                          String AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                          String AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                          short AV124Albaranes_albaranguia__wwds_38_tftubcod ,
                                          short AV125Albaranes_albaranguia__wwds_39_tftubcod_to ,
                                          int AV126Albaranes_albaranguia__wwds_40_tfbaralbtub ,
                                          int AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to ,
                                          String AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                          String AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                          short AV130Albaranes_albaranguia__wwds_44_tfplascod ,
                                          short AV131Albaranes_albaranguia__wwds_45_tfplascod_to ,
                                          short AV132Albaranes_albaranguia__wwds_46_tfbaralbplas ,
                                          short AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to ,
                                          short AV134Albaranes_albaranguia__wwds_48_tftipacacod ,
                                          short AV135Albaranes_albaranguia__wwds_49_tftipacacod_to ,
                                          int AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          String A14057AlbTiras ,
                                          java.math.BigDecimal A14058AlbTirasKg ,
                                          String A14059AlbSinTest ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          String A2441AlbHdrObs ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          short A5051TipAcaCod ,
                                          String AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                          String A14056AlbColorCv ,
                                          String AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                          String AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[46];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT AlbTiras, TipAcaCod, BarAlbPlas, PlasCod, AlbHdrObs, BarAlbTub, TubCod, AlbSinTest, AlbTirasKg, BarAlbPie, BarPreMtr, BarAlbMtrE, AlbHdrgm2, AlbHdrAnc, BarPreKgm," ;
      scmdbuf += " BarAlbKgmE, CodCod, AlbColNum, AlbNomCli, AlbSer, AlbProVal, BarCodPar, BarCodReo, BarCod, EmprCod, AlbProCod FROM TXPALBBAR" ;
      if ( ! (0==AV88Albaranes_albaranguia__wwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int23[0] = (byte)(1) ;
      }
      if ( ! (0==AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( ! (0==AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (0==AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV92Albaranes_albaranguia__wwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV94Albaranes_albaranguia__wwds_8_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSer = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV98Albaranes_albaranguia__wwds_12_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(AlbNomCli = ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (0==AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) )
      {
         addWhere(sWhereString, "(AlbColNum >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (0==AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(AlbColNum <= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Albaranes_albaranguia__wwds_16_tfcodcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CodCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) )
      {
         addWhere(sWhereString, "(CodCod = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm >= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm <= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) )
      {
         addWhere(sWhereString, "(AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (0==AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr >= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr <= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (0==AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) )
      {
         addWhere(sWhereString, "(BarAlbPie >= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (0==AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(BarAlbPie <= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) && ( ! (GXutil.strcmp("", AV118Albaranes_albaranguia__wwds_32_tfalbtiras)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbTiras) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) )
      {
         addWhere(sWhereString, "(AlbTiras = ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg >= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg <= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) && ( ! (GXutil.strcmp("", AV122Albaranes_albaranguia__wwds_36_tfalbsintest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSinTest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSinTest = ?)");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (0==AV124Albaranes_albaranguia__wwds_38_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV125Albaranes_albaranguia__wwds_39_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (0==AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) )
      {
         addWhere(sWhereString, "(BarAlbTub >= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (0==AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(BarAlbTub <= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHdrObs = ?)");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (0==AV130Albaranes_albaranguia__wwds_44_tfplascod) )
      {
         addWhere(sWhereString, "(PlasCod >= ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( ! (0==AV131Albaranes_albaranguia__wwds_45_tfplascod_to) )
      {
         addWhere(sWhereString, "(PlasCod <= ?)");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( ! (0==AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) )
      {
         addWhere(sWhereString, "(BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( ! (0==AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( ! (0==AV134Albaranes_albaranguia__wwds_48_tftipacacod) )
      {
         addWhere(sWhereString, "(TipAcaCod >= ?)");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( ! (0==AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) )
      {
         addWhere(sWhereString, "(TipAcaCod <= ?)");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      if ( AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels, "AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbTiras" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_P09UR8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                          int AV88Albaranes_albaranguia__wwds_2_tfbarcod ,
                                          int AV89Albaranes_albaranguia__wwds_3_tfbarcod_to ,
                                          byte AV90Albaranes_albaranguia__wwds_4_tfbarcodreo ,
                                          byte AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to ,
                                          String AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                          String AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                          String AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                          String AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                          String AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                          String AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                          int AV100Albaranes_albaranguia__wwds_14_tfalbcolnum ,
                                          int AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to ,
                                          String AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                          String AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                          java.math.BigDecimal AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                          java.math.BigDecimal AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                          short AV108Albaranes_albaranguia__wwds_22_tfalbhdranc ,
                                          short AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to ,
                                          short AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ,
                                          short AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                          java.math.BigDecimal AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                          int AV116Albaranes_albaranguia__wwds_30_tfbaralbpie ,
                                          int AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to ,
                                          String AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                          String AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                          java.math.BigDecimal AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                          java.math.BigDecimal AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                          String AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                          String AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                          short AV124Albaranes_albaranguia__wwds_38_tftubcod ,
                                          short AV125Albaranes_albaranguia__wwds_39_tftubcod_to ,
                                          int AV126Albaranes_albaranguia__wwds_40_tfbaralbtub ,
                                          int AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to ,
                                          String AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                          String AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                          short AV130Albaranes_albaranguia__wwds_44_tfplascod ,
                                          short AV131Albaranes_albaranguia__wwds_45_tfplascod_to ,
                                          short AV132Albaranes_albaranguia__wwds_46_tfbaralbplas ,
                                          short AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to ,
                                          short AV134Albaranes_albaranguia__wwds_48_tftipacacod ,
                                          short AV135Albaranes_albaranguia__wwds_49_tftipacacod_to ,
                                          int AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          String A14057AlbTiras ,
                                          java.math.BigDecimal A14058AlbTirasKg ,
                                          String A14059AlbSinTest ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          String A2441AlbHdrObs ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          short A5051TipAcaCod ,
                                          String AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                          String A14056AlbColorCv ,
                                          String AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                          String AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[46];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT AlbSinTest, TipAcaCod, BarAlbPlas, PlasCod, AlbHdrObs, BarAlbTub, TubCod, AlbTirasKg, AlbTiras, BarAlbPie, BarPreMtr, BarAlbMtrE, AlbHdrgm2, AlbHdrAnc, BarPreKgm," ;
      scmdbuf += " BarAlbKgmE, CodCod, AlbColNum, AlbNomCli, AlbSer, AlbProVal, BarCodPar, BarCodReo, BarCod, EmprCod, AlbProCod FROM TXPALBBAR" ;
      if ( ! (0==AV88Albaranes_albaranguia__wwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int26[0] = (byte)(1) ;
      }
      if ( ! (0==AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int26[1] = (byte)(1) ;
      }
      if ( ! (0==AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (0==AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV92Albaranes_albaranguia__wwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV94Albaranes_albaranguia__wwds_8_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSer = ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV98Albaranes_albaranguia__wwds_12_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(AlbNomCli = ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (0==AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) )
      {
         addWhere(sWhereString, "(AlbColNum >= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (0==AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(AlbColNum <= ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Albaranes_albaranguia__wwds_16_tfcodcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CodCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) )
      {
         addWhere(sWhereString, "(CodCod = ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm >= ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm <= ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (0==AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) )
      {
         addWhere(sWhereString, "(AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (0==AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! (0==AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (0==AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr >= ?)");
      }
      else
      {
         GXv_int26[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr <= ?)");
      }
      else
      {
         GXv_int26[25] = (byte)(1) ;
      }
      if ( ! (0==AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) )
      {
         addWhere(sWhereString, "(BarAlbPie >= ?)");
      }
      else
      {
         GXv_int26[26] = (byte)(1) ;
      }
      if ( ! (0==AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(BarAlbPie <= ?)");
      }
      else
      {
         GXv_int26[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) && ( ! (GXutil.strcmp("", AV118Albaranes_albaranguia__wwds_32_tfalbtiras)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbTiras) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) )
      {
         addWhere(sWhereString, "(AlbTiras = ?)");
      }
      else
      {
         GXv_int26[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg >= ?)");
      }
      else
      {
         GXv_int26[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg <= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) && ( ! (GXutil.strcmp("", AV122Albaranes_albaranguia__wwds_36_tfalbsintest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSinTest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSinTest = ?)");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (0==AV124Albaranes_albaranguia__wwds_38_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (0==AV125Albaranes_albaranguia__wwds_39_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (0==AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) )
      {
         addWhere(sWhereString, "(BarAlbTub >= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (0==AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(BarAlbTub <= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHdrObs = ?)");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( ! (0==AV130Albaranes_albaranguia__wwds_44_tfplascod) )
      {
         addWhere(sWhereString, "(PlasCod >= ?)");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      if ( ! (0==AV131Albaranes_albaranguia__wwds_45_tfplascod_to) )
      {
         addWhere(sWhereString, "(PlasCod <= ?)");
      }
      else
      {
         GXv_int26[41] = (byte)(1) ;
      }
      if ( ! (0==AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) )
      {
         addWhere(sWhereString, "(BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int26[42] = (byte)(1) ;
      }
      if ( ! (0==AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int26[43] = (byte)(1) ;
      }
      if ( ! (0==AV134Albaranes_albaranguia__wwds_48_tftipacacod) )
      {
         addWhere(sWhereString, "(TipAcaCod >= ?)");
      }
      else
      {
         GXv_int26[44] = (byte)(1) ;
      }
      if ( ! (0==AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) )
      {
         addWhere(sWhereString, "(TipAcaCod <= ?)");
      }
      else
      {
         GXv_int26[45] = (byte)(1) ;
      }
      if ( AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels, "AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbSinTest" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_P09UR9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels ,
                                          int AV88Albaranes_albaranguia__wwds_2_tfbarcod ,
                                          int AV89Albaranes_albaranguia__wwds_3_tfbarcod_to ,
                                          byte AV90Albaranes_albaranguia__wwds_4_tfbarcodreo ,
                                          byte AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to ,
                                          String AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel ,
                                          String AV92Albaranes_albaranguia__wwds_6_tfbarcodpar ,
                                          String AV95Albaranes_albaranguia__wwds_9_tfalbser_sel ,
                                          String AV94Albaranes_albaranguia__wwds_8_tfalbser ,
                                          String AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel ,
                                          String AV98Albaranes_albaranguia__wwds_12_tfalbnomcli ,
                                          int AV100Albaranes_albaranguia__wwds_14_tfalbcolnum ,
                                          int AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to ,
                                          String AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel ,
                                          String AV102Albaranes_albaranguia__wwds_16_tfcodcod ,
                                          java.math.BigDecimal AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Albaranes_albaranguia__wwds_20_tfbarprekgm ,
                                          java.math.BigDecimal AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to ,
                                          short AV108Albaranes_albaranguia__wwds_22_tfalbhdranc ,
                                          short AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to ,
                                          short AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2 ,
                                          short AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Albaranes_albaranguia__wwds_28_tfbarpremtr ,
                                          java.math.BigDecimal AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to ,
                                          int AV116Albaranes_albaranguia__wwds_30_tfbaralbpie ,
                                          int AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to ,
                                          String AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel ,
                                          String AV118Albaranes_albaranguia__wwds_32_tfalbtiras ,
                                          java.math.BigDecimal AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg ,
                                          java.math.BigDecimal AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to ,
                                          String AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel ,
                                          String AV122Albaranes_albaranguia__wwds_36_tfalbsintest ,
                                          short AV124Albaranes_albaranguia__wwds_38_tftubcod ,
                                          short AV125Albaranes_albaranguia__wwds_39_tftubcod_to ,
                                          int AV126Albaranes_albaranguia__wwds_40_tfbaralbtub ,
                                          int AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to ,
                                          String AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel ,
                                          String AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs ,
                                          short AV130Albaranes_albaranguia__wwds_44_tfplascod ,
                                          short AV131Albaranes_albaranguia__wwds_45_tfplascod_to ,
                                          short AV132Albaranes_albaranguia__wwds_46_tfbaralbplas ,
                                          short AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to ,
                                          short AV134Albaranes_albaranguia__wwds_48_tftipacacod ,
                                          short AV135Albaranes_albaranguia__wwds_49_tftipacacod_to ,
                                          int AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A12232AlbNomCli ,
                                          int A3393AlbColNum ,
                                          String A3153CodCod ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1262BarPreKgm ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          java.math.BigDecimal A1264BarPreMtr ,
                                          int A1265BarAlbPie ,
                                          String A14057AlbTiras ,
                                          java.math.BigDecimal A14058AlbTirasKg ,
                                          String A14059AlbSinTest ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          String A2441AlbHdrObs ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          short A5051TipAcaCod ,
                                          String AV87Albaranes_albaranguia__wwds_1_filterfulltext ,
                                          String A14056AlbColorCv ,
                                          String AV97Albaranes_albaranguia__wwds_11_tfalbcolorcv_sel ,
                                          String AV96Albaranes_albaranguia__wwds_10_tfalbcolorcv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[46];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT AlbHdrObs, TipAcaCod, BarAlbPlas, PlasCod, BarAlbTub, TubCod, AlbSinTest, AlbTirasKg, AlbTiras, BarAlbPie, BarPreMtr, BarAlbMtrE, AlbHdrgm2, AlbHdrAnc, BarPreKgm," ;
      scmdbuf += " BarAlbKgmE, CodCod, AlbColNum, AlbNomCli, AlbSer, AlbProVal, BarCodPar, BarCodReo, BarCod, EmprCod, AlbProCod FROM TXPALBBAR" ;
      if ( ! (0==AV88Albaranes_albaranguia__wwds_2_tfbarcod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int29[0] = (byte)(1) ;
      }
      if ( ! (0==AV89Albaranes_albaranguia__wwds_3_tfbarcod_to) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int29[1] = (byte)(1) ;
      }
      if ( ! (0==AV90Albaranes_albaranguia__wwds_4_tfbarcodreo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int29[2] = (byte)(1) ;
      }
      if ( ! (0==AV91Albaranes_albaranguia__wwds_5_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV92Albaranes_albaranguia__wwds_6_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Albaranes_albaranguia__wwds_7_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(BarCodPar = ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV94Albaranes_albaranguia__wwds_8_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Albaranes_albaranguia__wwds_9_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSer = ?)");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV98Albaranes_albaranguia__wwds_12_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Albaranes_albaranguia__wwds_13_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(AlbNomCli = ?)");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (0==AV100Albaranes_albaranguia__wwds_14_tfalbcolnum) )
      {
         addWhere(sWhereString, "(AlbColNum >= ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (0==AV101Albaranes_albaranguia__wwds_15_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(AlbColNum <= ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Albaranes_albaranguia__wwds_16_tfcodcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(CodCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Albaranes_albaranguia__wwds_17_tfcodcod_sel)==0) )
      {
         addWhere(sWhereString, "(CodCod = ?)");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Albaranes_albaranguia__wwds_18_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Albaranes_albaranguia__wwds_19_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Albaranes_albaranguia__wwds_20_tfbarprekgm)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm >= ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Albaranes_albaranguia__wwds_21_tfbarprekgm_to)==0) )
      {
         addWhere(sWhereString, "(BarPreKgm <= ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (0==AV108Albaranes_albaranguia__wwds_22_tfalbhdranc) )
      {
         addWhere(sWhereString, "(AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (0==AV109Albaranes_albaranguia__wwds_23_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (0==AV110Albaranes_albaranguia__wwds_24_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV111Albaranes_albaranguia__wwds_25_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Albaranes_albaranguia__wwds_26_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Albaranes_albaranguia__wwds_27_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Albaranes_albaranguia__wwds_28_tfbarpremtr)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr >= ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Albaranes_albaranguia__wwds_29_tfbarpremtr_to)==0) )
      {
         addWhere(sWhereString, "(BarPreMtr <= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (0==AV116Albaranes_albaranguia__wwds_30_tfbaralbpie) )
      {
         addWhere(sWhereString, "(BarAlbPie >= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! (0==AV117Albaranes_albaranguia__wwds_31_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(BarAlbPie <= ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) && ( ! (GXutil.strcmp("", AV118Albaranes_albaranguia__wwds_32_tfalbtiras)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbTiras) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Albaranes_albaranguia__wwds_33_tfalbtiras_sel)==0) )
      {
         addWhere(sWhereString, "(AlbTiras = ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Albaranes_albaranguia__wwds_34_tfalbtiraskg)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Albaranes_albaranguia__wwds_35_tfalbtiraskg_to)==0) )
      {
         addWhere(sWhereString, "(AlbTirasKg <= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) && ( ! (GXutil.strcmp("", AV122Albaranes_albaranguia__wwds_36_tfalbsintest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbSinTest) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Albaranes_albaranguia__wwds_37_tfalbsintest_sel)==0) )
      {
         addWhere(sWhereString, "(AlbSinTest = ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (0==AV124Albaranes_albaranguia__wwds_38_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (0==AV125Albaranes_albaranguia__wwds_39_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (0==AV126Albaranes_albaranguia__wwds_40_tfbaralbtub) )
      {
         addWhere(sWhereString, "(BarAlbTub >= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (0==AV127Albaranes_albaranguia__wwds_41_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(BarAlbTub <= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV128Albaranes_albaranguia__wwds_42_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Albaranes_albaranguia__wwds_43_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHdrObs = ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! (0==AV130Albaranes_albaranguia__wwds_44_tfplascod) )
      {
         addWhere(sWhereString, "(PlasCod >= ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (0==AV131Albaranes_albaranguia__wwds_45_tfplascod_to) )
      {
         addWhere(sWhereString, "(PlasCod <= ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! (0==AV132Albaranes_albaranguia__wwds_46_tfbaralbplas) )
      {
         addWhere(sWhereString, "(BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (0==AV133Albaranes_albaranguia__wwds_47_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! (0==AV134Albaranes_albaranguia__wwds_48_tftipacacod) )
      {
         addWhere(sWhereString, "(TipAcaCod >= ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( ! (0==AV135Albaranes_albaranguia__wwds_49_tftipacacod_to) )
      {
         addWhere(sWhereString, "(TipAcaCod <= ?)");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Albaranes_albaranguia__wwds_50_tfalbproval_sels, "AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbHdrObs" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
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
                  return conditional_P09UR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).shortValue() , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , ((Number) dynConstraints[70]).shortValue() , ((Number) dynConstraints[71]).shortValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] );
            case 1 :
                  return conditional_P09UR3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).shortValue() , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , ((Number) dynConstraints[70]).shortValue() , ((Number) dynConstraints[71]).shortValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] );
            case 2 :
                  return conditional_P09UR4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).shortValue() , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , ((Number) dynConstraints[70]).shortValue() , ((Number) dynConstraints[71]).shortValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] );
            case 3 :
                  return conditional_P09UR5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).shortValue() , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , ((Number) dynConstraints[70]).shortValue() , ((Number) dynConstraints[71]).shortValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] );
            case 4 :
                  return conditional_P09UR6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).shortValue() , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , ((Number) dynConstraints[70]).shortValue() , ((Number) dynConstraints[71]).shortValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] );
            case 5 :
                  return conditional_P09UR7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).shortValue() , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , ((Number) dynConstraints[70]).shortValue() , ((Number) dynConstraints[71]).shortValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] );
            case 6 :
                  return conditional_P09UR8(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).shortValue() , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , ((Number) dynConstraints[70]).shortValue() , ((Number) dynConstraints[71]).shortValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] );
            case 7 :
                  return conditional_P09UR9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).shortValue() , (java.math.BigDecimal)dynConstraints[60] , (java.math.BigDecimal)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).shortValue() , ((Number) dynConstraints[67]).intValue() , (String)dynConstraints[68] , ((Number) dynConstraints[69]).shortValue() , ((Number) dynConstraints[70]).shortValue() , ((Number) dynConstraints[71]).shortValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09UR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UR3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UR4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UR5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UR6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UR7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UR8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09UR9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 60);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 13);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 3);
               ((long[]) buf[28])[0] = rslt.getLong(26);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 60);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 13);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 3);
               ((long[]) buf[28])[0] = rslt.getLong(26);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 60);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 13);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 3);
               ((long[]) buf[28])[0] = rslt.getLong(26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 13);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 60);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[19])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 3);
               ((long[]) buf[28])[0] = rslt.getLong(26);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 60);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((short[]) buf[17])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 13);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 3);
               ((long[]) buf[28])[0] = rslt.getLong(26);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 60);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 13);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 3);
               ((long[]) buf[28])[0] = rslt.getLong(26);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 60);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 13);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 3);
               ((long[]) buf[28])[0] = rslt.getLong(26);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 60);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 1);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[18])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 13);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 3);
               ((long[]) buf[28])[0] = rslt.getLong(26);
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
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 60);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 60);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 60);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 60);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 60);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 60);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 60);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 60);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 60);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 60);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 60);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 60);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 60);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 60);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 5);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 5);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 60);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 60);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[88]).shortValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[89]).shortValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[90]).shortValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[91]).shortValue());
               }
               return;
      }
   }

}

