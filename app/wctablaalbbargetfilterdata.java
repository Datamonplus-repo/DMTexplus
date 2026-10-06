package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class wctablaalbbargetfilterdata extends GXProcedure
{
   public wctablaalbbargetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wctablaalbbargetfilterdata.class ), "" );
   }

   public wctablaalbbargetfilterdata( int remoteHandle ,
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
      wctablaalbbargetfilterdata.this.aP5 = new String[] {""};
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
      wctablaalbbargetfilterdata.this.AV58DDOName = aP0;
      wctablaalbbargetfilterdata.this.AV56SearchTxt = aP1;
      wctablaalbbargetfilterdata.this.AV57SearchTxtTo = aP2;
      wctablaalbbargetfilterdata.this.aP3 = aP3;
      wctablaalbbargetfilterdata.this.aP4 = aP4;
      wctablaalbbargetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV61Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV66OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_EMPRGUIREM") == 0 )
      {
         /* Execute user subroutine: 'LOADEMPRGUIREMOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_BARCODPAR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARCODPAROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBSER") == 0 )
      {
         /* Execute user subroutine: 'LOADALBSEROPTIONS' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBSERD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBSERDOPTIONS' */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBCOLNOM") == 0 )
      {
         /* Execute user subroutine: 'LOADALBCOLNOMOPTIONS' */
         S161 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBNOMCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADALBNOMCLIOPTIONS' */
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_CODCOD") == 0 )
      {
         /* Execute user subroutine: 'LOADCODCODOPTIONS' */
         S181 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBHDROBS") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBTIPENT") == 0 )
      {
         /* Execute user subroutine: 'LOADALBTIPENTOPTIONS' */
         S201 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV62OptionsJson = AV61Options.toJSonString(false) ;
      AV65OptionsDescJson = AV64OptionsDesc.toJSonString(false) ;
      AV67OptionIndexesJson = AV66OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV69Session.getValue("WCTablaAlbbarGridState"), "") == 0 )
      {
         AV71GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCTablaAlbbarGridState"), null, null);
      }
      else
      {
         AV71GridState.fromxml(AV69Session.getValue("WCTablaAlbbarGridState"), null, null);
      }
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV72GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV71GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRGUIREM") == 0 )
         {
            AV76TFEmprGuiRem = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRGUIREM_SEL") == 0 )
         {
            AV77TFEmprGuiRem_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV10TFBarCod = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFBarCod_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV12TFBarCodReo = (byte)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV13TFBarCodReo_To = (byte)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV14TFBarCodPar = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV15TFBarCodPar_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER") == 0 )
         {
            AV16TFAlbSer = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER_SEL") == 0 )
         {
            AV17TFAlbSer_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD") == 0 )
         {
            AV18TFAlbSerD = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD_SEL") == 0 )
         {
            AV19TFAlbSerD_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM") == 0 )
         {
            AV20TFAlbColNom = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM_SEL") == 0 )
         {
            AV21TFAlbColNom_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI") == 0 )
         {
            AV22TFAlbNomCli = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI_SEL") == 0 )
         {
            AV23TFAlbNomCli_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNUM") == 0 )
         {
            AV24TFAlbColNum = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFAlbColNum_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCODCOD") == 0 )
         {
            AV26TFCodCod = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCODCOD_SEL") == 0 )
         {
            AV27TFCodCod_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV28TFBarAlbKgmE = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFBarAlbKgmE_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPREKGM") == 0 )
         {
            AV30TFBarPreKgm = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV31TFBarPreKgm_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV32TFAlbHdrAnc = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFAlbHdrAnc_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV34TFAlbHdrgm2 = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFAlbHdrgm2_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV36TFBarAlbMtrE = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV37TFBarAlbMtrE_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPREMTR") == 0 )
         {
            AV38TFBarPreMtr = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFBarPreMtr_To = CommonUtil.decimalVal( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV40TFBarAlbPie = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFBarAlbPie_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV42TFTubCod = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFTubCod_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV44TFBarAlbTub = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFBarAlbTub_To = (int)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPLASCOD") == 0 )
         {
            AV46TFPlasCod = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFPlasCod_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPLAS") == 0 )
         {
            AV48TFBarAlbPlas = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFBarAlbPlas_To = (short)(GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV50TFAlbHdrObs = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV51TFAlbHdrObs_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV52TFAlbProVal_SelsJson = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV53TFAlbProVal_Sels.fromJSonString(AV52TFAlbProVal_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIPENT") == 0 )
         {
            AV54TFAlbTipEnt = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIPENT_SEL") == 0 )
         {
            AV55TFAlbTipEnt_Sel = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV74Emprcod = AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROCOD") == 0 )
         {
            AV75AlbProcod = GXutil.lval( AV72GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADEMPRGUIREMOPTIONS' Routine */
      returnInSub = false ;
      AV76TFEmprGuiRem = AV56SearchTxt ;
      AV77TFEmprGuiRem_Sel = "" ;
      AV82Wctablaalbbards_1_emprcod = AV74Emprcod ;
      AV83Wctablaalbbards_2_albprocod = AV75AlbProcod ;
      AV84Wctablaalbbards_3_tfemprguirem = AV76TFEmprGuiRem ;
      AV85Wctablaalbbards_4_tfemprguirem_sel = AV77TFEmprGuiRem_Sel ;
      AV86Wctablaalbbards_5_tfbarcod = AV10TFBarCod ;
      AV87Wctablaalbbards_6_tfbarcod_to = AV11TFBarCod_To ;
      AV88Wctablaalbbards_7_tfbarcodreo = AV12TFBarCodReo ;
      AV89Wctablaalbbards_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV90Wctablaalbbards_9_tfbarcodpar = AV14TFBarCodPar ;
      AV91Wctablaalbbards_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV92Wctablaalbbards_11_tfalbser = AV16TFAlbSer ;
      AV93Wctablaalbbards_12_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV94Wctablaalbbards_13_tfalbserd = AV18TFAlbSerD ;
      AV95Wctablaalbbards_14_tfalbserd_sel = AV19TFAlbSerD_Sel ;
      AV96Wctablaalbbards_15_tfalbcolnom = AV20TFAlbColNom ;
      AV97Wctablaalbbards_16_tfalbcolnom_sel = AV21TFAlbColNom_Sel ;
      AV98Wctablaalbbards_17_tfalbnomcli = AV22TFAlbNomCli ;
      AV99Wctablaalbbards_18_tfalbnomcli_sel = AV23TFAlbNomCli_Sel ;
      AV100Wctablaalbbards_19_tfalbcolnum = AV24TFAlbColNum ;
      AV101Wctablaalbbards_20_tfalbcolnum_to = AV25TFAlbColNum_To ;
      AV102Wctablaalbbards_21_tfcodcod = AV26TFCodCod ;
      AV103Wctablaalbbards_22_tfcodcod_sel = AV27TFCodCod_Sel ;
      AV104Wctablaalbbards_23_tfbaralbkgme = AV28TFBarAlbKgmE ;
      AV105Wctablaalbbards_24_tfbaralbkgme_to = AV29TFBarAlbKgmE_To ;
      AV106Wctablaalbbards_25_tfbarprekgm = AV30TFBarPreKgm ;
      AV107Wctablaalbbards_26_tfbarprekgm_to = AV31TFBarPreKgm_To ;
      AV108Wctablaalbbards_27_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV109Wctablaalbbards_28_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV110Wctablaalbbards_29_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV111Wctablaalbbards_30_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV112Wctablaalbbards_31_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV113Wctablaalbbards_32_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV114Wctablaalbbards_33_tfbarpremtr = AV38TFBarPreMtr ;
      AV115Wctablaalbbards_34_tfbarpremtr_to = AV39TFBarPreMtr_To ;
      AV116Wctablaalbbards_35_tfbaralbpie = AV40TFBarAlbPie ;
      AV117Wctablaalbbards_36_tfbaralbpie_to = AV41TFBarAlbPie_To ;
      AV118Wctablaalbbards_37_tftubcod = AV42TFTubCod ;
      AV119Wctablaalbbards_38_tftubcod_to = AV43TFTubCod_To ;
      AV120Wctablaalbbards_39_tfbaralbtub = AV44TFBarAlbTub ;
      AV121Wctablaalbbards_40_tfbaralbtub_to = AV45TFBarAlbTub_To ;
      AV122Wctablaalbbards_41_tfplascod = AV46TFPlasCod ;
      AV123Wctablaalbbards_42_tfplascod_to = AV47TFPlasCod_To ;
      AV124Wctablaalbbards_43_tfbaralbplas = AV48TFBarAlbPlas ;
      AV125Wctablaalbbards_44_tfbaralbplas_to = AV49TFBarAlbPlas_To ;
      AV126Wctablaalbbards_45_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV127Wctablaalbbards_46_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV128Wctablaalbbards_47_tfalbproval_sels = AV53TFAlbProVal_Sels ;
      AV129Wctablaalbbards_48_tfalbtipent = AV54TFAlbTipEnt ;
      AV130Wctablaalbbards_49_tfalbtipent_sel = AV55TFAlbTipEnt_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV128Wctablaalbbards_47_tfalbproval_sels ,
                                           AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                           AV84Wctablaalbbards_3_tfemprguirem ,
                                           Integer.valueOf(AV86Wctablaalbbards_5_tfbarcod) ,
                                           Integer.valueOf(AV87Wctablaalbbards_6_tfbarcod_to) ,
                                           Byte.valueOf(AV88Wctablaalbbards_7_tfbarcodreo) ,
                                           Byte.valueOf(AV89Wctablaalbbards_8_tfbarcodreo_to) ,
                                           AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                           AV90Wctablaalbbards_9_tfbarcodpar ,
                                           AV93Wctablaalbbards_12_tfalbser_sel ,
                                           AV92Wctablaalbbards_11_tfalbser ,
                                           AV95Wctablaalbbards_14_tfalbserd_sel ,
                                           AV94Wctablaalbbards_13_tfalbserd ,
                                           AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                           AV96Wctablaalbbards_15_tfalbcolnom ,
                                           AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                           AV98Wctablaalbbards_17_tfalbnomcli ,
                                           Integer.valueOf(AV100Wctablaalbbards_19_tfalbcolnum) ,
                                           Integer.valueOf(AV101Wctablaalbbards_20_tfalbcolnum_to) ,
                                           AV103Wctablaalbbards_22_tfcodcod_sel ,
                                           AV102Wctablaalbbards_21_tfcodcod ,
                                           AV104Wctablaalbbards_23_tfbaralbkgme ,
                                           AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                           AV106Wctablaalbbards_25_tfbarprekgm ,
                                           AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                           Short.valueOf(AV108Wctablaalbbards_27_tfalbhdranc) ,
                                           Short.valueOf(AV109Wctablaalbbards_28_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Wctablaalbbards_29_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                           AV112Wctablaalbbards_31_tfbaralbmtre ,
                                           AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                           AV114Wctablaalbbards_33_tfbarpremtr ,
                                           AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Wctablaalbbards_35_tfbaralbpie) ,
                                           Integer.valueOf(AV117Wctablaalbbards_36_tfbaralbpie_to) ,
                                           Short.valueOf(AV118Wctablaalbbards_37_tftubcod) ,
                                           Short.valueOf(AV119Wctablaalbbards_38_tftubcod_to) ,
                                           Integer.valueOf(AV120Wctablaalbbards_39_tfbaralbtub) ,
                                           Integer.valueOf(AV121Wctablaalbbards_40_tfbaralbtub_to) ,
                                           Short.valueOf(AV122Wctablaalbbards_41_tfplascod) ,
                                           Short.valueOf(AV123Wctablaalbbards_42_tfplascod_to) ,
                                           Short.valueOf(AV124Wctablaalbbards_43_tfbaralbplas) ,
                                           Short.valueOf(AV125Wctablaalbbards_44_tfbaralbplas_to) ,
                                           AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           AV126Wctablaalbbards_45_tfalbhdrobs ,
                                           Integer.valueOf(AV128Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                           AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                           AV129Wctablaalbbards_48_tfalbtipent ,
                                           A1253EmprGuiRem ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           A12232AlbNomCli ,
                                           A3153CodCod ,
                                           A2441AlbHdrObs ,
                                           A1095AlbTipEnt ,
                                           AV82Wctablaalbbards_1_emprcod ,
                                           Long.valueOf(AV83Wctablaalbbards_2_albprocod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV84Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV84Wctablaalbbards_3_tfemprguirem), 3, "%") ;
      /* Using cursor P08F72 */
      pr_default.execute(0, new Object[] {AV82Wctablaalbbards_1_emprcod, Long.valueOf(AV83Wctablaalbbards_2_albprocod), lV84Wctablaalbbards_3_tfemprguirem, AV85Wctablaalbbards_4_tfemprguirem_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8F72 = false ;
         A396EmprCod = P08F72_A396EmprCod[0] ;
         A30AlbProCod = P08F72_A30AlbProCod[0] ;
         A1253EmprGuiRem = P08F72_A1253EmprGuiRem[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08F72_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08F72_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(P08F72_A1253EmprGuiRem[0], A1253EmprGuiRem) == 0 ) )
         {
            brk8F72 = false ;
            AV68count = (long)(AV68count+1) ;
            brk8F72 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1253EmprGuiRem)==0) )
         {
            AV60Option = A1253EmprGuiRem ;
            AV63OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!"))) ;
            AV61Options.add(AV60Option, 0);
            AV64OptionsDesc.add(AV63OptionDesc, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8F72 )
         {
            brk8F72 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARCODPAROPTIONS' Routine */
      returnInSub = false ;
      AV14TFBarCodPar = AV56SearchTxt ;
      AV15TFBarCodPar_Sel = "" ;
      AV82Wctablaalbbards_1_emprcod = AV74Emprcod ;
      AV83Wctablaalbbards_2_albprocod = AV75AlbProcod ;
      AV84Wctablaalbbards_3_tfemprguirem = AV76TFEmprGuiRem ;
      AV85Wctablaalbbards_4_tfemprguirem_sel = AV77TFEmprGuiRem_Sel ;
      AV86Wctablaalbbards_5_tfbarcod = AV10TFBarCod ;
      AV87Wctablaalbbards_6_tfbarcod_to = AV11TFBarCod_To ;
      AV88Wctablaalbbards_7_tfbarcodreo = AV12TFBarCodReo ;
      AV89Wctablaalbbards_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV90Wctablaalbbards_9_tfbarcodpar = AV14TFBarCodPar ;
      AV91Wctablaalbbards_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV92Wctablaalbbards_11_tfalbser = AV16TFAlbSer ;
      AV93Wctablaalbbards_12_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV94Wctablaalbbards_13_tfalbserd = AV18TFAlbSerD ;
      AV95Wctablaalbbards_14_tfalbserd_sel = AV19TFAlbSerD_Sel ;
      AV96Wctablaalbbards_15_tfalbcolnom = AV20TFAlbColNom ;
      AV97Wctablaalbbards_16_tfalbcolnom_sel = AV21TFAlbColNom_Sel ;
      AV98Wctablaalbbards_17_tfalbnomcli = AV22TFAlbNomCli ;
      AV99Wctablaalbbards_18_tfalbnomcli_sel = AV23TFAlbNomCli_Sel ;
      AV100Wctablaalbbards_19_tfalbcolnum = AV24TFAlbColNum ;
      AV101Wctablaalbbards_20_tfalbcolnum_to = AV25TFAlbColNum_To ;
      AV102Wctablaalbbards_21_tfcodcod = AV26TFCodCod ;
      AV103Wctablaalbbards_22_tfcodcod_sel = AV27TFCodCod_Sel ;
      AV104Wctablaalbbards_23_tfbaralbkgme = AV28TFBarAlbKgmE ;
      AV105Wctablaalbbards_24_tfbaralbkgme_to = AV29TFBarAlbKgmE_To ;
      AV106Wctablaalbbards_25_tfbarprekgm = AV30TFBarPreKgm ;
      AV107Wctablaalbbards_26_tfbarprekgm_to = AV31TFBarPreKgm_To ;
      AV108Wctablaalbbards_27_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV109Wctablaalbbards_28_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV110Wctablaalbbards_29_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV111Wctablaalbbards_30_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV112Wctablaalbbards_31_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV113Wctablaalbbards_32_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV114Wctablaalbbards_33_tfbarpremtr = AV38TFBarPreMtr ;
      AV115Wctablaalbbards_34_tfbarpremtr_to = AV39TFBarPreMtr_To ;
      AV116Wctablaalbbards_35_tfbaralbpie = AV40TFBarAlbPie ;
      AV117Wctablaalbbards_36_tfbaralbpie_to = AV41TFBarAlbPie_To ;
      AV118Wctablaalbbards_37_tftubcod = AV42TFTubCod ;
      AV119Wctablaalbbards_38_tftubcod_to = AV43TFTubCod_To ;
      AV120Wctablaalbbards_39_tfbaralbtub = AV44TFBarAlbTub ;
      AV121Wctablaalbbards_40_tfbaralbtub_to = AV45TFBarAlbTub_To ;
      AV122Wctablaalbbards_41_tfplascod = AV46TFPlasCod ;
      AV123Wctablaalbbards_42_tfplascod_to = AV47TFPlasCod_To ;
      AV124Wctablaalbbards_43_tfbaralbplas = AV48TFBarAlbPlas ;
      AV125Wctablaalbbards_44_tfbaralbplas_to = AV49TFBarAlbPlas_To ;
      AV126Wctablaalbbards_45_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV127Wctablaalbbards_46_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV128Wctablaalbbards_47_tfalbproval_sels = AV53TFAlbProVal_Sels ;
      AV129Wctablaalbbards_48_tfalbtipent = AV54TFAlbTipEnt ;
      AV130Wctablaalbbards_49_tfalbtipent_sel = AV55TFAlbTipEnt_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV128Wctablaalbbards_47_tfalbproval_sels ,
                                           AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                           AV84Wctablaalbbards_3_tfemprguirem ,
                                           Integer.valueOf(AV86Wctablaalbbards_5_tfbarcod) ,
                                           Integer.valueOf(AV87Wctablaalbbards_6_tfbarcod_to) ,
                                           Byte.valueOf(AV88Wctablaalbbards_7_tfbarcodreo) ,
                                           Byte.valueOf(AV89Wctablaalbbards_8_tfbarcodreo_to) ,
                                           AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                           AV90Wctablaalbbards_9_tfbarcodpar ,
                                           AV93Wctablaalbbards_12_tfalbser_sel ,
                                           AV92Wctablaalbbards_11_tfalbser ,
                                           AV95Wctablaalbbards_14_tfalbserd_sel ,
                                           AV94Wctablaalbbards_13_tfalbserd ,
                                           AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                           AV96Wctablaalbbards_15_tfalbcolnom ,
                                           AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                           AV98Wctablaalbbards_17_tfalbnomcli ,
                                           Integer.valueOf(AV100Wctablaalbbards_19_tfalbcolnum) ,
                                           Integer.valueOf(AV101Wctablaalbbards_20_tfalbcolnum_to) ,
                                           AV103Wctablaalbbards_22_tfcodcod_sel ,
                                           AV102Wctablaalbbards_21_tfcodcod ,
                                           AV104Wctablaalbbards_23_tfbaralbkgme ,
                                           AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                           AV106Wctablaalbbards_25_tfbarprekgm ,
                                           AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                           Short.valueOf(AV108Wctablaalbbards_27_tfalbhdranc) ,
                                           Short.valueOf(AV109Wctablaalbbards_28_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Wctablaalbbards_29_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                           AV112Wctablaalbbards_31_tfbaralbmtre ,
                                           AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                           AV114Wctablaalbbards_33_tfbarpremtr ,
                                           AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Wctablaalbbards_35_tfbaralbpie) ,
                                           Integer.valueOf(AV117Wctablaalbbards_36_tfbaralbpie_to) ,
                                           Short.valueOf(AV118Wctablaalbbards_37_tftubcod) ,
                                           Short.valueOf(AV119Wctablaalbbards_38_tftubcod_to) ,
                                           Integer.valueOf(AV120Wctablaalbbards_39_tfbaralbtub) ,
                                           Integer.valueOf(AV121Wctablaalbbards_40_tfbaralbtub_to) ,
                                           Short.valueOf(AV122Wctablaalbbards_41_tfplascod) ,
                                           Short.valueOf(AV123Wctablaalbbards_42_tfplascod_to) ,
                                           Short.valueOf(AV124Wctablaalbbards_43_tfbaralbplas) ,
                                           Short.valueOf(AV125Wctablaalbbards_44_tfbaralbplas_to) ,
                                           AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           AV126Wctablaalbbards_45_tfalbhdrobs ,
                                           Integer.valueOf(AV128Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                           AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                           AV129Wctablaalbbards_48_tfalbtipent ,
                                           A1253EmprGuiRem ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           A12232AlbNomCli ,
                                           A3153CodCod ,
                                           A2441AlbHdrObs ,
                                           A1095AlbTipEnt ,
                                           AV82Wctablaalbbards_1_emprcod ,
                                           Long.valueOf(AV83Wctablaalbbards_2_albprocod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV84Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV84Wctablaalbbards_3_tfemprguirem), 3, "%") ;
      /* Using cursor P08F73 */
      pr_default.execute(1, new Object[] {AV82Wctablaalbbards_1_emprcod, Long.valueOf(AV83Wctablaalbbards_2_albprocod), lV84Wctablaalbbards_3_tfemprguirem, AV85Wctablaalbbards_4_tfemprguirem_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8F74 = false ;
         A396EmprCod = P08F73_A396EmprCod[0] ;
         A30AlbProCod = P08F73_A30AlbProCod[0] ;
         A1253EmprGuiRem = P08F73_A1253EmprGuiRem[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08F73_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08F73_A30AlbProCod[0] == A30AlbProCod ) )
         {
            brk8F74 = false ;
            AV68count = (long)(AV68count+1) ;
            brk8F74 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A130BarCodPar)==0) )
         {
            AV60Option = A130BarCodPar ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8F74 )
         {
            brk8F74 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBSEROPTIONS' Routine */
      returnInSub = false ;
      AV16TFAlbSer = AV56SearchTxt ;
      AV17TFAlbSer_Sel = "" ;
      AV82Wctablaalbbards_1_emprcod = AV74Emprcod ;
      AV83Wctablaalbbards_2_albprocod = AV75AlbProcod ;
      AV84Wctablaalbbards_3_tfemprguirem = AV76TFEmprGuiRem ;
      AV85Wctablaalbbards_4_tfemprguirem_sel = AV77TFEmprGuiRem_Sel ;
      AV86Wctablaalbbards_5_tfbarcod = AV10TFBarCod ;
      AV87Wctablaalbbards_6_tfbarcod_to = AV11TFBarCod_To ;
      AV88Wctablaalbbards_7_tfbarcodreo = AV12TFBarCodReo ;
      AV89Wctablaalbbards_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV90Wctablaalbbards_9_tfbarcodpar = AV14TFBarCodPar ;
      AV91Wctablaalbbards_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV92Wctablaalbbards_11_tfalbser = AV16TFAlbSer ;
      AV93Wctablaalbbards_12_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV94Wctablaalbbards_13_tfalbserd = AV18TFAlbSerD ;
      AV95Wctablaalbbards_14_tfalbserd_sel = AV19TFAlbSerD_Sel ;
      AV96Wctablaalbbards_15_tfalbcolnom = AV20TFAlbColNom ;
      AV97Wctablaalbbards_16_tfalbcolnom_sel = AV21TFAlbColNom_Sel ;
      AV98Wctablaalbbards_17_tfalbnomcli = AV22TFAlbNomCli ;
      AV99Wctablaalbbards_18_tfalbnomcli_sel = AV23TFAlbNomCli_Sel ;
      AV100Wctablaalbbards_19_tfalbcolnum = AV24TFAlbColNum ;
      AV101Wctablaalbbards_20_tfalbcolnum_to = AV25TFAlbColNum_To ;
      AV102Wctablaalbbards_21_tfcodcod = AV26TFCodCod ;
      AV103Wctablaalbbards_22_tfcodcod_sel = AV27TFCodCod_Sel ;
      AV104Wctablaalbbards_23_tfbaralbkgme = AV28TFBarAlbKgmE ;
      AV105Wctablaalbbards_24_tfbaralbkgme_to = AV29TFBarAlbKgmE_To ;
      AV106Wctablaalbbards_25_tfbarprekgm = AV30TFBarPreKgm ;
      AV107Wctablaalbbards_26_tfbarprekgm_to = AV31TFBarPreKgm_To ;
      AV108Wctablaalbbards_27_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV109Wctablaalbbards_28_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV110Wctablaalbbards_29_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV111Wctablaalbbards_30_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV112Wctablaalbbards_31_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV113Wctablaalbbards_32_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV114Wctablaalbbards_33_tfbarpremtr = AV38TFBarPreMtr ;
      AV115Wctablaalbbards_34_tfbarpremtr_to = AV39TFBarPreMtr_To ;
      AV116Wctablaalbbards_35_tfbaralbpie = AV40TFBarAlbPie ;
      AV117Wctablaalbbards_36_tfbaralbpie_to = AV41TFBarAlbPie_To ;
      AV118Wctablaalbbards_37_tftubcod = AV42TFTubCod ;
      AV119Wctablaalbbards_38_tftubcod_to = AV43TFTubCod_To ;
      AV120Wctablaalbbards_39_tfbaralbtub = AV44TFBarAlbTub ;
      AV121Wctablaalbbards_40_tfbaralbtub_to = AV45TFBarAlbTub_To ;
      AV122Wctablaalbbards_41_tfplascod = AV46TFPlasCod ;
      AV123Wctablaalbbards_42_tfplascod_to = AV47TFPlasCod_To ;
      AV124Wctablaalbbards_43_tfbaralbplas = AV48TFBarAlbPlas ;
      AV125Wctablaalbbards_44_tfbaralbplas_to = AV49TFBarAlbPlas_To ;
      AV126Wctablaalbbards_45_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV127Wctablaalbbards_46_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV128Wctablaalbbards_47_tfalbproval_sels = AV53TFAlbProVal_Sels ;
      AV129Wctablaalbbards_48_tfalbtipent = AV54TFAlbTipEnt ;
      AV130Wctablaalbbards_49_tfalbtipent_sel = AV55TFAlbTipEnt_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV128Wctablaalbbards_47_tfalbproval_sels ,
                                           AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                           AV84Wctablaalbbards_3_tfemprguirem ,
                                           Integer.valueOf(AV86Wctablaalbbards_5_tfbarcod) ,
                                           Integer.valueOf(AV87Wctablaalbbards_6_tfbarcod_to) ,
                                           Byte.valueOf(AV88Wctablaalbbards_7_tfbarcodreo) ,
                                           Byte.valueOf(AV89Wctablaalbbards_8_tfbarcodreo_to) ,
                                           AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                           AV90Wctablaalbbards_9_tfbarcodpar ,
                                           AV93Wctablaalbbards_12_tfalbser_sel ,
                                           AV92Wctablaalbbards_11_tfalbser ,
                                           AV95Wctablaalbbards_14_tfalbserd_sel ,
                                           AV94Wctablaalbbards_13_tfalbserd ,
                                           AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                           AV96Wctablaalbbards_15_tfalbcolnom ,
                                           AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                           AV98Wctablaalbbards_17_tfalbnomcli ,
                                           Integer.valueOf(AV100Wctablaalbbards_19_tfalbcolnum) ,
                                           Integer.valueOf(AV101Wctablaalbbards_20_tfalbcolnum_to) ,
                                           AV103Wctablaalbbards_22_tfcodcod_sel ,
                                           AV102Wctablaalbbards_21_tfcodcod ,
                                           AV104Wctablaalbbards_23_tfbaralbkgme ,
                                           AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                           AV106Wctablaalbbards_25_tfbarprekgm ,
                                           AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                           Short.valueOf(AV108Wctablaalbbards_27_tfalbhdranc) ,
                                           Short.valueOf(AV109Wctablaalbbards_28_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Wctablaalbbards_29_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                           AV112Wctablaalbbards_31_tfbaralbmtre ,
                                           AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                           AV114Wctablaalbbards_33_tfbarpremtr ,
                                           AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Wctablaalbbards_35_tfbaralbpie) ,
                                           Integer.valueOf(AV117Wctablaalbbards_36_tfbaralbpie_to) ,
                                           Short.valueOf(AV118Wctablaalbbards_37_tftubcod) ,
                                           Short.valueOf(AV119Wctablaalbbards_38_tftubcod_to) ,
                                           Integer.valueOf(AV120Wctablaalbbards_39_tfbaralbtub) ,
                                           Integer.valueOf(AV121Wctablaalbbards_40_tfbaralbtub_to) ,
                                           Short.valueOf(AV122Wctablaalbbards_41_tfplascod) ,
                                           Short.valueOf(AV123Wctablaalbbards_42_tfplascod_to) ,
                                           Short.valueOf(AV124Wctablaalbbards_43_tfbaralbplas) ,
                                           Short.valueOf(AV125Wctablaalbbards_44_tfbaralbplas_to) ,
                                           AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           AV126Wctablaalbbards_45_tfalbhdrobs ,
                                           Integer.valueOf(AV128Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                           AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                           AV129Wctablaalbbards_48_tfalbtipent ,
                                           A1253EmprGuiRem ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           A12232AlbNomCli ,
                                           A3153CodCod ,
                                           A2441AlbHdrObs ,
                                           A1095AlbTipEnt ,
                                           AV82Wctablaalbbards_1_emprcod ,
                                           Long.valueOf(AV83Wctablaalbbards_2_albprocod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV84Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV84Wctablaalbbards_3_tfemprguirem), 3, "%") ;
      /* Using cursor P08F74 */
      pr_default.execute(2, new Object[] {AV82Wctablaalbbards_1_emprcod, Long.valueOf(AV83Wctablaalbbards_2_albprocod), lV84Wctablaalbbards_3_tfemprguirem, AV85Wctablaalbbards_4_tfemprguirem_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8F76 = false ;
         A396EmprCod = P08F74_A396EmprCod[0] ;
         A30AlbProCod = P08F74_A30AlbProCod[0] ;
         A1253EmprGuiRem = P08F74_A1253EmprGuiRem[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P08F74_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08F74_A30AlbProCod[0] == A30AlbProCod ) )
         {
            brk8F76 = false ;
            AV68count = (long)(AV68count+1) ;
            brk8F76 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A3391AlbSer)==0) )
         {
            AV60Option = A3391AlbSer ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8F76 )
         {
            brk8F76 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBSERDOPTIONS' Routine */
      returnInSub = false ;
      AV18TFAlbSerD = AV56SearchTxt ;
      AV19TFAlbSerD_Sel = "" ;
      AV82Wctablaalbbards_1_emprcod = AV74Emprcod ;
      AV83Wctablaalbbards_2_albprocod = AV75AlbProcod ;
      AV84Wctablaalbbards_3_tfemprguirem = AV76TFEmprGuiRem ;
      AV85Wctablaalbbards_4_tfemprguirem_sel = AV77TFEmprGuiRem_Sel ;
      AV86Wctablaalbbards_5_tfbarcod = AV10TFBarCod ;
      AV87Wctablaalbbards_6_tfbarcod_to = AV11TFBarCod_To ;
      AV88Wctablaalbbards_7_tfbarcodreo = AV12TFBarCodReo ;
      AV89Wctablaalbbards_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV90Wctablaalbbards_9_tfbarcodpar = AV14TFBarCodPar ;
      AV91Wctablaalbbards_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV92Wctablaalbbards_11_tfalbser = AV16TFAlbSer ;
      AV93Wctablaalbbards_12_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV94Wctablaalbbards_13_tfalbserd = AV18TFAlbSerD ;
      AV95Wctablaalbbards_14_tfalbserd_sel = AV19TFAlbSerD_Sel ;
      AV96Wctablaalbbards_15_tfalbcolnom = AV20TFAlbColNom ;
      AV97Wctablaalbbards_16_tfalbcolnom_sel = AV21TFAlbColNom_Sel ;
      AV98Wctablaalbbards_17_tfalbnomcli = AV22TFAlbNomCli ;
      AV99Wctablaalbbards_18_tfalbnomcli_sel = AV23TFAlbNomCli_Sel ;
      AV100Wctablaalbbards_19_tfalbcolnum = AV24TFAlbColNum ;
      AV101Wctablaalbbards_20_tfalbcolnum_to = AV25TFAlbColNum_To ;
      AV102Wctablaalbbards_21_tfcodcod = AV26TFCodCod ;
      AV103Wctablaalbbards_22_tfcodcod_sel = AV27TFCodCod_Sel ;
      AV104Wctablaalbbards_23_tfbaralbkgme = AV28TFBarAlbKgmE ;
      AV105Wctablaalbbards_24_tfbaralbkgme_to = AV29TFBarAlbKgmE_To ;
      AV106Wctablaalbbards_25_tfbarprekgm = AV30TFBarPreKgm ;
      AV107Wctablaalbbards_26_tfbarprekgm_to = AV31TFBarPreKgm_To ;
      AV108Wctablaalbbards_27_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV109Wctablaalbbards_28_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV110Wctablaalbbards_29_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV111Wctablaalbbards_30_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV112Wctablaalbbards_31_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV113Wctablaalbbards_32_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV114Wctablaalbbards_33_tfbarpremtr = AV38TFBarPreMtr ;
      AV115Wctablaalbbards_34_tfbarpremtr_to = AV39TFBarPreMtr_To ;
      AV116Wctablaalbbards_35_tfbaralbpie = AV40TFBarAlbPie ;
      AV117Wctablaalbbards_36_tfbaralbpie_to = AV41TFBarAlbPie_To ;
      AV118Wctablaalbbards_37_tftubcod = AV42TFTubCod ;
      AV119Wctablaalbbards_38_tftubcod_to = AV43TFTubCod_To ;
      AV120Wctablaalbbards_39_tfbaralbtub = AV44TFBarAlbTub ;
      AV121Wctablaalbbards_40_tfbaralbtub_to = AV45TFBarAlbTub_To ;
      AV122Wctablaalbbards_41_tfplascod = AV46TFPlasCod ;
      AV123Wctablaalbbards_42_tfplascod_to = AV47TFPlasCod_To ;
      AV124Wctablaalbbards_43_tfbaralbplas = AV48TFBarAlbPlas ;
      AV125Wctablaalbbards_44_tfbaralbplas_to = AV49TFBarAlbPlas_To ;
      AV126Wctablaalbbards_45_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV127Wctablaalbbards_46_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV128Wctablaalbbards_47_tfalbproval_sels = AV53TFAlbProVal_Sels ;
      AV129Wctablaalbbards_48_tfalbtipent = AV54TFAlbTipEnt ;
      AV130Wctablaalbbards_49_tfalbtipent_sel = AV55TFAlbTipEnt_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV128Wctablaalbbards_47_tfalbproval_sels ,
                                           AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                           AV84Wctablaalbbards_3_tfemprguirem ,
                                           Integer.valueOf(AV86Wctablaalbbards_5_tfbarcod) ,
                                           Integer.valueOf(AV87Wctablaalbbards_6_tfbarcod_to) ,
                                           Byte.valueOf(AV88Wctablaalbbards_7_tfbarcodreo) ,
                                           Byte.valueOf(AV89Wctablaalbbards_8_tfbarcodreo_to) ,
                                           AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                           AV90Wctablaalbbards_9_tfbarcodpar ,
                                           AV93Wctablaalbbards_12_tfalbser_sel ,
                                           AV92Wctablaalbbards_11_tfalbser ,
                                           AV95Wctablaalbbards_14_tfalbserd_sel ,
                                           AV94Wctablaalbbards_13_tfalbserd ,
                                           AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                           AV96Wctablaalbbards_15_tfalbcolnom ,
                                           AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                           AV98Wctablaalbbards_17_tfalbnomcli ,
                                           Integer.valueOf(AV100Wctablaalbbards_19_tfalbcolnum) ,
                                           Integer.valueOf(AV101Wctablaalbbards_20_tfalbcolnum_to) ,
                                           AV103Wctablaalbbards_22_tfcodcod_sel ,
                                           AV102Wctablaalbbards_21_tfcodcod ,
                                           AV104Wctablaalbbards_23_tfbaralbkgme ,
                                           AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                           AV106Wctablaalbbards_25_tfbarprekgm ,
                                           AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                           Short.valueOf(AV108Wctablaalbbards_27_tfalbhdranc) ,
                                           Short.valueOf(AV109Wctablaalbbards_28_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Wctablaalbbards_29_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                           AV112Wctablaalbbards_31_tfbaralbmtre ,
                                           AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                           AV114Wctablaalbbards_33_tfbarpremtr ,
                                           AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Wctablaalbbards_35_tfbaralbpie) ,
                                           Integer.valueOf(AV117Wctablaalbbards_36_tfbaralbpie_to) ,
                                           Short.valueOf(AV118Wctablaalbbards_37_tftubcod) ,
                                           Short.valueOf(AV119Wctablaalbbards_38_tftubcod_to) ,
                                           Integer.valueOf(AV120Wctablaalbbards_39_tfbaralbtub) ,
                                           Integer.valueOf(AV121Wctablaalbbards_40_tfbaralbtub_to) ,
                                           Short.valueOf(AV122Wctablaalbbards_41_tfplascod) ,
                                           Short.valueOf(AV123Wctablaalbbards_42_tfplascod_to) ,
                                           Short.valueOf(AV124Wctablaalbbards_43_tfbaralbplas) ,
                                           Short.valueOf(AV125Wctablaalbbards_44_tfbaralbplas_to) ,
                                           AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           AV126Wctablaalbbards_45_tfalbhdrobs ,
                                           Integer.valueOf(AV128Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                           AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                           AV129Wctablaalbbards_48_tfalbtipent ,
                                           A1253EmprGuiRem ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           A12232AlbNomCli ,
                                           A3153CodCod ,
                                           A2441AlbHdrObs ,
                                           A1095AlbTipEnt ,
                                           AV82Wctablaalbbards_1_emprcod ,
                                           Long.valueOf(AV83Wctablaalbbards_2_albprocod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV84Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV84Wctablaalbbards_3_tfemprguirem), 3, "%") ;
      /* Using cursor P08F75 */
      pr_default.execute(3, new Object[] {AV82Wctablaalbbards_1_emprcod, Long.valueOf(AV83Wctablaalbbards_2_albprocod), lV84Wctablaalbbards_3_tfemprguirem, AV85Wctablaalbbards_4_tfemprguirem_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8F78 = false ;
         A396EmprCod = P08F75_A396EmprCod[0] ;
         A30AlbProCod = P08F75_A30AlbProCod[0] ;
         A1253EmprGuiRem = P08F75_A1253EmprGuiRem[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P08F75_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08F75_A30AlbProCod[0] == A30AlbProCod ) )
         {
            brk8F78 = false ;
            AV68count = (long)(AV68count+1) ;
            brk8F78 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A8879AlbSerD)==0) )
         {
            AV60Option = A8879AlbSerD ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8F78 )
         {
            brk8F78 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV20TFAlbColNom = AV56SearchTxt ;
      AV21TFAlbColNom_Sel = "" ;
      AV82Wctablaalbbards_1_emprcod = AV74Emprcod ;
      AV83Wctablaalbbards_2_albprocod = AV75AlbProcod ;
      AV84Wctablaalbbards_3_tfemprguirem = AV76TFEmprGuiRem ;
      AV85Wctablaalbbards_4_tfemprguirem_sel = AV77TFEmprGuiRem_Sel ;
      AV86Wctablaalbbards_5_tfbarcod = AV10TFBarCod ;
      AV87Wctablaalbbards_6_tfbarcod_to = AV11TFBarCod_To ;
      AV88Wctablaalbbards_7_tfbarcodreo = AV12TFBarCodReo ;
      AV89Wctablaalbbards_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV90Wctablaalbbards_9_tfbarcodpar = AV14TFBarCodPar ;
      AV91Wctablaalbbards_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV92Wctablaalbbards_11_tfalbser = AV16TFAlbSer ;
      AV93Wctablaalbbards_12_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV94Wctablaalbbards_13_tfalbserd = AV18TFAlbSerD ;
      AV95Wctablaalbbards_14_tfalbserd_sel = AV19TFAlbSerD_Sel ;
      AV96Wctablaalbbards_15_tfalbcolnom = AV20TFAlbColNom ;
      AV97Wctablaalbbards_16_tfalbcolnom_sel = AV21TFAlbColNom_Sel ;
      AV98Wctablaalbbards_17_tfalbnomcli = AV22TFAlbNomCli ;
      AV99Wctablaalbbards_18_tfalbnomcli_sel = AV23TFAlbNomCli_Sel ;
      AV100Wctablaalbbards_19_tfalbcolnum = AV24TFAlbColNum ;
      AV101Wctablaalbbards_20_tfalbcolnum_to = AV25TFAlbColNum_To ;
      AV102Wctablaalbbards_21_tfcodcod = AV26TFCodCod ;
      AV103Wctablaalbbards_22_tfcodcod_sel = AV27TFCodCod_Sel ;
      AV104Wctablaalbbards_23_tfbaralbkgme = AV28TFBarAlbKgmE ;
      AV105Wctablaalbbards_24_tfbaralbkgme_to = AV29TFBarAlbKgmE_To ;
      AV106Wctablaalbbards_25_tfbarprekgm = AV30TFBarPreKgm ;
      AV107Wctablaalbbards_26_tfbarprekgm_to = AV31TFBarPreKgm_To ;
      AV108Wctablaalbbards_27_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV109Wctablaalbbards_28_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV110Wctablaalbbards_29_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV111Wctablaalbbards_30_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV112Wctablaalbbards_31_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV113Wctablaalbbards_32_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV114Wctablaalbbards_33_tfbarpremtr = AV38TFBarPreMtr ;
      AV115Wctablaalbbards_34_tfbarpremtr_to = AV39TFBarPreMtr_To ;
      AV116Wctablaalbbards_35_tfbaralbpie = AV40TFBarAlbPie ;
      AV117Wctablaalbbards_36_tfbaralbpie_to = AV41TFBarAlbPie_To ;
      AV118Wctablaalbbards_37_tftubcod = AV42TFTubCod ;
      AV119Wctablaalbbards_38_tftubcod_to = AV43TFTubCod_To ;
      AV120Wctablaalbbards_39_tfbaralbtub = AV44TFBarAlbTub ;
      AV121Wctablaalbbards_40_tfbaralbtub_to = AV45TFBarAlbTub_To ;
      AV122Wctablaalbbards_41_tfplascod = AV46TFPlasCod ;
      AV123Wctablaalbbards_42_tfplascod_to = AV47TFPlasCod_To ;
      AV124Wctablaalbbards_43_tfbaralbplas = AV48TFBarAlbPlas ;
      AV125Wctablaalbbards_44_tfbaralbplas_to = AV49TFBarAlbPlas_To ;
      AV126Wctablaalbbards_45_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV127Wctablaalbbards_46_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV128Wctablaalbbards_47_tfalbproval_sels = AV53TFAlbProVal_Sels ;
      AV129Wctablaalbbards_48_tfalbtipent = AV54TFAlbTipEnt ;
      AV130Wctablaalbbards_49_tfalbtipent_sel = AV55TFAlbTipEnt_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV128Wctablaalbbards_47_tfalbproval_sels ,
                                           AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                           AV84Wctablaalbbards_3_tfemprguirem ,
                                           Integer.valueOf(AV86Wctablaalbbards_5_tfbarcod) ,
                                           Integer.valueOf(AV87Wctablaalbbards_6_tfbarcod_to) ,
                                           Byte.valueOf(AV88Wctablaalbbards_7_tfbarcodreo) ,
                                           Byte.valueOf(AV89Wctablaalbbards_8_tfbarcodreo_to) ,
                                           AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                           AV90Wctablaalbbards_9_tfbarcodpar ,
                                           AV93Wctablaalbbards_12_tfalbser_sel ,
                                           AV92Wctablaalbbards_11_tfalbser ,
                                           AV95Wctablaalbbards_14_tfalbserd_sel ,
                                           AV94Wctablaalbbards_13_tfalbserd ,
                                           AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                           AV96Wctablaalbbards_15_tfalbcolnom ,
                                           AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                           AV98Wctablaalbbards_17_tfalbnomcli ,
                                           Integer.valueOf(AV100Wctablaalbbards_19_tfalbcolnum) ,
                                           Integer.valueOf(AV101Wctablaalbbards_20_tfalbcolnum_to) ,
                                           AV103Wctablaalbbards_22_tfcodcod_sel ,
                                           AV102Wctablaalbbards_21_tfcodcod ,
                                           AV104Wctablaalbbards_23_tfbaralbkgme ,
                                           AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                           AV106Wctablaalbbards_25_tfbarprekgm ,
                                           AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                           Short.valueOf(AV108Wctablaalbbards_27_tfalbhdranc) ,
                                           Short.valueOf(AV109Wctablaalbbards_28_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Wctablaalbbards_29_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                           AV112Wctablaalbbards_31_tfbaralbmtre ,
                                           AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                           AV114Wctablaalbbards_33_tfbarpremtr ,
                                           AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Wctablaalbbards_35_tfbaralbpie) ,
                                           Integer.valueOf(AV117Wctablaalbbards_36_tfbaralbpie_to) ,
                                           Short.valueOf(AV118Wctablaalbbards_37_tftubcod) ,
                                           Short.valueOf(AV119Wctablaalbbards_38_tftubcod_to) ,
                                           Integer.valueOf(AV120Wctablaalbbards_39_tfbaralbtub) ,
                                           Integer.valueOf(AV121Wctablaalbbards_40_tfbaralbtub_to) ,
                                           Short.valueOf(AV122Wctablaalbbards_41_tfplascod) ,
                                           Short.valueOf(AV123Wctablaalbbards_42_tfplascod_to) ,
                                           Short.valueOf(AV124Wctablaalbbards_43_tfbaralbplas) ,
                                           Short.valueOf(AV125Wctablaalbbards_44_tfbaralbplas_to) ,
                                           AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           AV126Wctablaalbbards_45_tfalbhdrobs ,
                                           Integer.valueOf(AV128Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                           AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                           AV129Wctablaalbbards_48_tfalbtipent ,
                                           A1253EmprGuiRem ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           A12232AlbNomCli ,
                                           A3153CodCod ,
                                           A2441AlbHdrObs ,
                                           A1095AlbTipEnt ,
                                           AV82Wctablaalbbards_1_emprcod ,
                                           Long.valueOf(AV83Wctablaalbbards_2_albprocod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV84Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV84Wctablaalbbards_3_tfemprguirem), 3, "%") ;
      /* Using cursor P08F76 */
      pr_default.execute(4, new Object[] {AV82Wctablaalbbards_1_emprcod, Long.valueOf(AV83Wctablaalbbards_2_albprocod), lV84Wctablaalbbards_3_tfemprguirem, AV85Wctablaalbbards_4_tfemprguirem_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8F710 = false ;
         A396EmprCod = P08F76_A396EmprCod[0] ;
         A30AlbProCod = P08F76_A30AlbProCod[0] ;
         A1253EmprGuiRem = P08F76_A1253EmprGuiRem[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P08F76_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08F76_A30AlbProCod[0] == A30AlbProCod ) )
         {
            brk8F710 = false ;
            AV68count = (long)(AV68count+1) ;
            brk8F710 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A3392AlbColNom)==0) )
         {
            AV60Option = A3392AlbColNom ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8F710 )
         {
            brk8F710 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADALBNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV22TFAlbNomCli = AV56SearchTxt ;
      AV23TFAlbNomCli_Sel = "" ;
      AV82Wctablaalbbards_1_emprcod = AV74Emprcod ;
      AV83Wctablaalbbards_2_albprocod = AV75AlbProcod ;
      AV84Wctablaalbbards_3_tfemprguirem = AV76TFEmprGuiRem ;
      AV85Wctablaalbbards_4_tfemprguirem_sel = AV77TFEmprGuiRem_Sel ;
      AV86Wctablaalbbards_5_tfbarcod = AV10TFBarCod ;
      AV87Wctablaalbbards_6_tfbarcod_to = AV11TFBarCod_To ;
      AV88Wctablaalbbards_7_tfbarcodreo = AV12TFBarCodReo ;
      AV89Wctablaalbbards_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV90Wctablaalbbards_9_tfbarcodpar = AV14TFBarCodPar ;
      AV91Wctablaalbbards_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV92Wctablaalbbards_11_tfalbser = AV16TFAlbSer ;
      AV93Wctablaalbbards_12_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV94Wctablaalbbards_13_tfalbserd = AV18TFAlbSerD ;
      AV95Wctablaalbbards_14_tfalbserd_sel = AV19TFAlbSerD_Sel ;
      AV96Wctablaalbbards_15_tfalbcolnom = AV20TFAlbColNom ;
      AV97Wctablaalbbards_16_tfalbcolnom_sel = AV21TFAlbColNom_Sel ;
      AV98Wctablaalbbards_17_tfalbnomcli = AV22TFAlbNomCli ;
      AV99Wctablaalbbards_18_tfalbnomcli_sel = AV23TFAlbNomCli_Sel ;
      AV100Wctablaalbbards_19_tfalbcolnum = AV24TFAlbColNum ;
      AV101Wctablaalbbards_20_tfalbcolnum_to = AV25TFAlbColNum_To ;
      AV102Wctablaalbbards_21_tfcodcod = AV26TFCodCod ;
      AV103Wctablaalbbards_22_tfcodcod_sel = AV27TFCodCod_Sel ;
      AV104Wctablaalbbards_23_tfbaralbkgme = AV28TFBarAlbKgmE ;
      AV105Wctablaalbbards_24_tfbaralbkgme_to = AV29TFBarAlbKgmE_To ;
      AV106Wctablaalbbards_25_tfbarprekgm = AV30TFBarPreKgm ;
      AV107Wctablaalbbards_26_tfbarprekgm_to = AV31TFBarPreKgm_To ;
      AV108Wctablaalbbards_27_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV109Wctablaalbbards_28_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV110Wctablaalbbards_29_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV111Wctablaalbbards_30_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV112Wctablaalbbards_31_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV113Wctablaalbbards_32_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV114Wctablaalbbards_33_tfbarpremtr = AV38TFBarPreMtr ;
      AV115Wctablaalbbards_34_tfbarpremtr_to = AV39TFBarPreMtr_To ;
      AV116Wctablaalbbards_35_tfbaralbpie = AV40TFBarAlbPie ;
      AV117Wctablaalbbards_36_tfbaralbpie_to = AV41TFBarAlbPie_To ;
      AV118Wctablaalbbards_37_tftubcod = AV42TFTubCod ;
      AV119Wctablaalbbards_38_tftubcod_to = AV43TFTubCod_To ;
      AV120Wctablaalbbards_39_tfbaralbtub = AV44TFBarAlbTub ;
      AV121Wctablaalbbards_40_tfbaralbtub_to = AV45TFBarAlbTub_To ;
      AV122Wctablaalbbards_41_tfplascod = AV46TFPlasCod ;
      AV123Wctablaalbbards_42_tfplascod_to = AV47TFPlasCod_To ;
      AV124Wctablaalbbards_43_tfbaralbplas = AV48TFBarAlbPlas ;
      AV125Wctablaalbbards_44_tfbaralbplas_to = AV49TFBarAlbPlas_To ;
      AV126Wctablaalbbards_45_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV127Wctablaalbbards_46_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV128Wctablaalbbards_47_tfalbproval_sels = AV53TFAlbProVal_Sels ;
      AV129Wctablaalbbards_48_tfalbtipent = AV54TFAlbTipEnt ;
      AV130Wctablaalbbards_49_tfalbtipent_sel = AV55TFAlbTipEnt_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV128Wctablaalbbards_47_tfalbproval_sels ,
                                           AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                           AV84Wctablaalbbards_3_tfemprguirem ,
                                           Integer.valueOf(AV86Wctablaalbbards_5_tfbarcod) ,
                                           Integer.valueOf(AV87Wctablaalbbards_6_tfbarcod_to) ,
                                           Byte.valueOf(AV88Wctablaalbbards_7_tfbarcodreo) ,
                                           Byte.valueOf(AV89Wctablaalbbards_8_tfbarcodreo_to) ,
                                           AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                           AV90Wctablaalbbards_9_tfbarcodpar ,
                                           AV93Wctablaalbbards_12_tfalbser_sel ,
                                           AV92Wctablaalbbards_11_tfalbser ,
                                           AV95Wctablaalbbards_14_tfalbserd_sel ,
                                           AV94Wctablaalbbards_13_tfalbserd ,
                                           AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                           AV96Wctablaalbbards_15_tfalbcolnom ,
                                           AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                           AV98Wctablaalbbards_17_tfalbnomcli ,
                                           Integer.valueOf(AV100Wctablaalbbards_19_tfalbcolnum) ,
                                           Integer.valueOf(AV101Wctablaalbbards_20_tfalbcolnum_to) ,
                                           AV103Wctablaalbbards_22_tfcodcod_sel ,
                                           AV102Wctablaalbbards_21_tfcodcod ,
                                           AV104Wctablaalbbards_23_tfbaralbkgme ,
                                           AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                           AV106Wctablaalbbards_25_tfbarprekgm ,
                                           AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                           Short.valueOf(AV108Wctablaalbbards_27_tfalbhdranc) ,
                                           Short.valueOf(AV109Wctablaalbbards_28_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Wctablaalbbards_29_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                           AV112Wctablaalbbards_31_tfbaralbmtre ,
                                           AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                           AV114Wctablaalbbards_33_tfbarpremtr ,
                                           AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Wctablaalbbards_35_tfbaralbpie) ,
                                           Integer.valueOf(AV117Wctablaalbbards_36_tfbaralbpie_to) ,
                                           Short.valueOf(AV118Wctablaalbbards_37_tftubcod) ,
                                           Short.valueOf(AV119Wctablaalbbards_38_tftubcod_to) ,
                                           Integer.valueOf(AV120Wctablaalbbards_39_tfbaralbtub) ,
                                           Integer.valueOf(AV121Wctablaalbbards_40_tfbaralbtub_to) ,
                                           Short.valueOf(AV122Wctablaalbbards_41_tfplascod) ,
                                           Short.valueOf(AV123Wctablaalbbards_42_tfplascod_to) ,
                                           Short.valueOf(AV124Wctablaalbbards_43_tfbaralbplas) ,
                                           Short.valueOf(AV125Wctablaalbbards_44_tfbaralbplas_to) ,
                                           AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           AV126Wctablaalbbards_45_tfalbhdrobs ,
                                           Integer.valueOf(AV128Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                           AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                           AV129Wctablaalbbards_48_tfalbtipent ,
                                           A1253EmprGuiRem ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           A12232AlbNomCli ,
                                           A3153CodCod ,
                                           A2441AlbHdrObs ,
                                           A1095AlbTipEnt ,
                                           AV82Wctablaalbbards_1_emprcod ,
                                           Long.valueOf(AV83Wctablaalbbards_2_albprocod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV84Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV84Wctablaalbbards_3_tfemprguirem), 3, "%") ;
      /* Using cursor P08F77 */
      pr_default.execute(5, new Object[] {AV82Wctablaalbbards_1_emprcod, Long.valueOf(AV83Wctablaalbbards_2_albprocod), lV84Wctablaalbbards_3_tfemprguirem, AV85Wctablaalbbards_4_tfemprguirem_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8F712 = false ;
         A396EmprCod = P08F77_A396EmprCod[0] ;
         A30AlbProCod = P08F77_A30AlbProCod[0] ;
         A1253EmprGuiRem = P08F77_A1253EmprGuiRem[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P08F77_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08F77_A30AlbProCod[0] == A30AlbProCod ) )
         {
            brk8F712 = false ;
            AV68count = (long)(AV68count+1) ;
            brk8F712 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A12232AlbNomCli)==0) )
         {
            AV60Option = A12232AlbNomCli ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8F712 )
         {
            brk8F712 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADCODCODOPTIONS' Routine */
      returnInSub = false ;
      AV26TFCodCod = AV56SearchTxt ;
      AV27TFCodCod_Sel = "" ;
      AV82Wctablaalbbards_1_emprcod = AV74Emprcod ;
      AV83Wctablaalbbards_2_albprocod = AV75AlbProcod ;
      AV84Wctablaalbbards_3_tfemprguirem = AV76TFEmprGuiRem ;
      AV85Wctablaalbbards_4_tfemprguirem_sel = AV77TFEmprGuiRem_Sel ;
      AV86Wctablaalbbards_5_tfbarcod = AV10TFBarCod ;
      AV87Wctablaalbbards_6_tfbarcod_to = AV11TFBarCod_To ;
      AV88Wctablaalbbards_7_tfbarcodreo = AV12TFBarCodReo ;
      AV89Wctablaalbbards_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV90Wctablaalbbards_9_tfbarcodpar = AV14TFBarCodPar ;
      AV91Wctablaalbbards_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV92Wctablaalbbards_11_tfalbser = AV16TFAlbSer ;
      AV93Wctablaalbbards_12_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV94Wctablaalbbards_13_tfalbserd = AV18TFAlbSerD ;
      AV95Wctablaalbbards_14_tfalbserd_sel = AV19TFAlbSerD_Sel ;
      AV96Wctablaalbbards_15_tfalbcolnom = AV20TFAlbColNom ;
      AV97Wctablaalbbards_16_tfalbcolnom_sel = AV21TFAlbColNom_Sel ;
      AV98Wctablaalbbards_17_tfalbnomcli = AV22TFAlbNomCli ;
      AV99Wctablaalbbards_18_tfalbnomcli_sel = AV23TFAlbNomCli_Sel ;
      AV100Wctablaalbbards_19_tfalbcolnum = AV24TFAlbColNum ;
      AV101Wctablaalbbards_20_tfalbcolnum_to = AV25TFAlbColNum_To ;
      AV102Wctablaalbbards_21_tfcodcod = AV26TFCodCod ;
      AV103Wctablaalbbards_22_tfcodcod_sel = AV27TFCodCod_Sel ;
      AV104Wctablaalbbards_23_tfbaralbkgme = AV28TFBarAlbKgmE ;
      AV105Wctablaalbbards_24_tfbaralbkgme_to = AV29TFBarAlbKgmE_To ;
      AV106Wctablaalbbards_25_tfbarprekgm = AV30TFBarPreKgm ;
      AV107Wctablaalbbards_26_tfbarprekgm_to = AV31TFBarPreKgm_To ;
      AV108Wctablaalbbards_27_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV109Wctablaalbbards_28_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV110Wctablaalbbards_29_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV111Wctablaalbbards_30_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV112Wctablaalbbards_31_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV113Wctablaalbbards_32_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV114Wctablaalbbards_33_tfbarpremtr = AV38TFBarPreMtr ;
      AV115Wctablaalbbards_34_tfbarpremtr_to = AV39TFBarPreMtr_To ;
      AV116Wctablaalbbards_35_tfbaralbpie = AV40TFBarAlbPie ;
      AV117Wctablaalbbards_36_tfbaralbpie_to = AV41TFBarAlbPie_To ;
      AV118Wctablaalbbards_37_tftubcod = AV42TFTubCod ;
      AV119Wctablaalbbards_38_tftubcod_to = AV43TFTubCod_To ;
      AV120Wctablaalbbards_39_tfbaralbtub = AV44TFBarAlbTub ;
      AV121Wctablaalbbards_40_tfbaralbtub_to = AV45TFBarAlbTub_To ;
      AV122Wctablaalbbards_41_tfplascod = AV46TFPlasCod ;
      AV123Wctablaalbbards_42_tfplascod_to = AV47TFPlasCod_To ;
      AV124Wctablaalbbards_43_tfbaralbplas = AV48TFBarAlbPlas ;
      AV125Wctablaalbbards_44_tfbaralbplas_to = AV49TFBarAlbPlas_To ;
      AV126Wctablaalbbards_45_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV127Wctablaalbbards_46_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV128Wctablaalbbards_47_tfalbproval_sels = AV53TFAlbProVal_Sels ;
      AV129Wctablaalbbards_48_tfalbtipent = AV54TFAlbTipEnt ;
      AV130Wctablaalbbards_49_tfalbtipent_sel = AV55TFAlbTipEnt_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           AV128Wctablaalbbards_47_tfalbproval_sels ,
                                           AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                           AV84Wctablaalbbards_3_tfemprguirem ,
                                           Integer.valueOf(AV86Wctablaalbbards_5_tfbarcod) ,
                                           Integer.valueOf(AV87Wctablaalbbards_6_tfbarcod_to) ,
                                           Byte.valueOf(AV88Wctablaalbbards_7_tfbarcodreo) ,
                                           Byte.valueOf(AV89Wctablaalbbards_8_tfbarcodreo_to) ,
                                           AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                           AV90Wctablaalbbards_9_tfbarcodpar ,
                                           AV93Wctablaalbbards_12_tfalbser_sel ,
                                           AV92Wctablaalbbards_11_tfalbser ,
                                           AV95Wctablaalbbards_14_tfalbserd_sel ,
                                           AV94Wctablaalbbards_13_tfalbserd ,
                                           AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                           AV96Wctablaalbbards_15_tfalbcolnom ,
                                           AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                           AV98Wctablaalbbards_17_tfalbnomcli ,
                                           Integer.valueOf(AV100Wctablaalbbards_19_tfalbcolnum) ,
                                           Integer.valueOf(AV101Wctablaalbbards_20_tfalbcolnum_to) ,
                                           AV103Wctablaalbbards_22_tfcodcod_sel ,
                                           AV102Wctablaalbbards_21_tfcodcod ,
                                           AV104Wctablaalbbards_23_tfbaralbkgme ,
                                           AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                           AV106Wctablaalbbards_25_tfbarprekgm ,
                                           AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                           Short.valueOf(AV108Wctablaalbbards_27_tfalbhdranc) ,
                                           Short.valueOf(AV109Wctablaalbbards_28_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Wctablaalbbards_29_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                           AV112Wctablaalbbards_31_tfbaralbmtre ,
                                           AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                           AV114Wctablaalbbards_33_tfbarpremtr ,
                                           AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Wctablaalbbards_35_tfbaralbpie) ,
                                           Integer.valueOf(AV117Wctablaalbbards_36_tfbaralbpie_to) ,
                                           Short.valueOf(AV118Wctablaalbbards_37_tftubcod) ,
                                           Short.valueOf(AV119Wctablaalbbards_38_tftubcod_to) ,
                                           Integer.valueOf(AV120Wctablaalbbards_39_tfbaralbtub) ,
                                           Integer.valueOf(AV121Wctablaalbbards_40_tfbaralbtub_to) ,
                                           Short.valueOf(AV122Wctablaalbbards_41_tfplascod) ,
                                           Short.valueOf(AV123Wctablaalbbards_42_tfplascod_to) ,
                                           Short.valueOf(AV124Wctablaalbbards_43_tfbaralbplas) ,
                                           Short.valueOf(AV125Wctablaalbbards_44_tfbaralbplas_to) ,
                                           AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           AV126Wctablaalbbards_45_tfalbhdrobs ,
                                           Integer.valueOf(AV128Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                           AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                           AV129Wctablaalbbards_48_tfalbtipent ,
                                           A1253EmprGuiRem ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           A12232AlbNomCli ,
                                           A3153CodCod ,
                                           A2441AlbHdrObs ,
                                           A1095AlbTipEnt ,
                                           AV82Wctablaalbbards_1_emprcod ,
                                           Long.valueOf(AV83Wctablaalbbards_2_albprocod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV84Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV84Wctablaalbbards_3_tfemprguirem), 3, "%") ;
      /* Using cursor P08F78 */
      pr_default.execute(6, new Object[] {AV82Wctablaalbbards_1_emprcod, Long.valueOf(AV83Wctablaalbbards_2_albprocod), lV84Wctablaalbbards_3_tfemprguirem, AV85Wctablaalbbards_4_tfemprguirem_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brk8F714 = false ;
         A396EmprCod = P08F78_A396EmprCod[0] ;
         A30AlbProCod = P08F78_A30AlbProCod[0] ;
         A1253EmprGuiRem = P08F78_A1253EmprGuiRem[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P08F78_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08F78_A30AlbProCod[0] == A30AlbProCod ) )
         {
            brk8F714 = false ;
            AV68count = (long)(AV68count+1) ;
            brk8F714 = true ;
            pr_default.readNext(6);
         }
         if ( ! (GXutil.strcmp("", A3153CodCod)==0) )
         {
            AV60Option = A3153CodCod ;
            AV63OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A3153CodCod, "XXXXXX"))) ;
            AV61Options.add(AV60Option, 0);
            AV64OptionsDesc.add(AV63OptionDesc, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8F714 )
         {
            brk8F714 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   public void S191( )
   {
      /* 'LOADALBHDROBSOPTIONS' Routine */
      returnInSub = false ;
      AV50TFAlbHdrObs = AV56SearchTxt ;
      AV51TFAlbHdrObs_Sel = "" ;
      AV82Wctablaalbbards_1_emprcod = AV74Emprcod ;
      AV83Wctablaalbbards_2_albprocod = AV75AlbProcod ;
      AV84Wctablaalbbards_3_tfemprguirem = AV76TFEmprGuiRem ;
      AV85Wctablaalbbards_4_tfemprguirem_sel = AV77TFEmprGuiRem_Sel ;
      AV86Wctablaalbbards_5_tfbarcod = AV10TFBarCod ;
      AV87Wctablaalbbards_6_tfbarcod_to = AV11TFBarCod_To ;
      AV88Wctablaalbbards_7_tfbarcodreo = AV12TFBarCodReo ;
      AV89Wctablaalbbards_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV90Wctablaalbbards_9_tfbarcodpar = AV14TFBarCodPar ;
      AV91Wctablaalbbards_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV92Wctablaalbbards_11_tfalbser = AV16TFAlbSer ;
      AV93Wctablaalbbards_12_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV94Wctablaalbbards_13_tfalbserd = AV18TFAlbSerD ;
      AV95Wctablaalbbards_14_tfalbserd_sel = AV19TFAlbSerD_Sel ;
      AV96Wctablaalbbards_15_tfalbcolnom = AV20TFAlbColNom ;
      AV97Wctablaalbbards_16_tfalbcolnom_sel = AV21TFAlbColNom_Sel ;
      AV98Wctablaalbbards_17_tfalbnomcli = AV22TFAlbNomCli ;
      AV99Wctablaalbbards_18_tfalbnomcli_sel = AV23TFAlbNomCli_Sel ;
      AV100Wctablaalbbards_19_tfalbcolnum = AV24TFAlbColNum ;
      AV101Wctablaalbbards_20_tfalbcolnum_to = AV25TFAlbColNum_To ;
      AV102Wctablaalbbards_21_tfcodcod = AV26TFCodCod ;
      AV103Wctablaalbbards_22_tfcodcod_sel = AV27TFCodCod_Sel ;
      AV104Wctablaalbbards_23_tfbaralbkgme = AV28TFBarAlbKgmE ;
      AV105Wctablaalbbards_24_tfbaralbkgme_to = AV29TFBarAlbKgmE_To ;
      AV106Wctablaalbbards_25_tfbarprekgm = AV30TFBarPreKgm ;
      AV107Wctablaalbbards_26_tfbarprekgm_to = AV31TFBarPreKgm_To ;
      AV108Wctablaalbbards_27_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV109Wctablaalbbards_28_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV110Wctablaalbbards_29_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV111Wctablaalbbards_30_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV112Wctablaalbbards_31_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV113Wctablaalbbards_32_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV114Wctablaalbbards_33_tfbarpremtr = AV38TFBarPreMtr ;
      AV115Wctablaalbbards_34_tfbarpremtr_to = AV39TFBarPreMtr_To ;
      AV116Wctablaalbbards_35_tfbaralbpie = AV40TFBarAlbPie ;
      AV117Wctablaalbbards_36_tfbaralbpie_to = AV41TFBarAlbPie_To ;
      AV118Wctablaalbbards_37_tftubcod = AV42TFTubCod ;
      AV119Wctablaalbbards_38_tftubcod_to = AV43TFTubCod_To ;
      AV120Wctablaalbbards_39_tfbaralbtub = AV44TFBarAlbTub ;
      AV121Wctablaalbbards_40_tfbaralbtub_to = AV45TFBarAlbTub_To ;
      AV122Wctablaalbbards_41_tfplascod = AV46TFPlasCod ;
      AV123Wctablaalbbards_42_tfplascod_to = AV47TFPlasCod_To ;
      AV124Wctablaalbbards_43_tfbaralbplas = AV48TFBarAlbPlas ;
      AV125Wctablaalbbards_44_tfbaralbplas_to = AV49TFBarAlbPlas_To ;
      AV126Wctablaalbbards_45_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV127Wctablaalbbards_46_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV128Wctablaalbbards_47_tfalbproval_sels = AV53TFAlbProVal_Sels ;
      AV129Wctablaalbbards_48_tfalbtipent = AV54TFAlbTipEnt ;
      AV130Wctablaalbbards_49_tfalbtipent_sel = AV55TFAlbTipEnt_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV128Wctablaalbbards_47_tfalbproval_sels ,
                                           AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                           AV84Wctablaalbbards_3_tfemprguirem ,
                                           Integer.valueOf(AV86Wctablaalbbards_5_tfbarcod) ,
                                           Integer.valueOf(AV87Wctablaalbbards_6_tfbarcod_to) ,
                                           Byte.valueOf(AV88Wctablaalbbards_7_tfbarcodreo) ,
                                           Byte.valueOf(AV89Wctablaalbbards_8_tfbarcodreo_to) ,
                                           AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                           AV90Wctablaalbbards_9_tfbarcodpar ,
                                           AV93Wctablaalbbards_12_tfalbser_sel ,
                                           AV92Wctablaalbbards_11_tfalbser ,
                                           AV95Wctablaalbbards_14_tfalbserd_sel ,
                                           AV94Wctablaalbbards_13_tfalbserd ,
                                           AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                           AV96Wctablaalbbards_15_tfalbcolnom ,
                                           AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                           AV98Wctablaalbbards_17_tfalbnomcli ,
                                           Integer.valueOf(AV100Wctablaalbbards_19_tfalbcolnum) ,
                                           Integer.valueOf(AV101Wctablaalbbards_20_tfalbcolnum_to) ,
                                           AV103Wctablaalbbards_22_tfcodcod_sel ,
                                           AV102Wctablaalbbards_21_tfcodcod ,
                                           AV104Wctablaalbbards_23_tfbaralbkgme ,
                                           AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                           AV106Wctablaalbbards_25_tfbarprekgm ,
                                           AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                           Short.valueOf(AV108Wctablaalbbards_27_tfalbhdranc) ,
                                           Short.valueOf(AV109Wctablaalbbards_28_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Wctablaalbbards_29_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                           AV112Wctablaalbbards_31_tfbaralbmtre ,
                                           AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                           AV114Wctablaalbbards_33_tfbarpremtr ,
                                           AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Wctablaalbbards_35_tfbaralbpie) ,
                                           Integer.valueOf(AV117Wctablaalbbards_36_tfbaralbpie_to) ,
                                           Short.valueOf(AV118Wctablaalbbards_37_tftubcod) ,
                                           Short.valueOf(AV119Wctablaalbbards_38_tftubcod_to) ,
                                           Integer.valueOf(AV120Wctablaalbbards_39_tfbaralbtub) ,
                                           Integer.valueOf(AV121Wctablaalbbards_40_tfbaralbtub_to) ,
                                           Short.valueOf(AV122Wctablaalbbards_41_tfplascod) ,
                                           Short.valueOf(AV123Wctablaalbbards_42_tfplascod_to) ,
                                           Short.valueOf(AV124Wctablaalbbards_43_tfbaralbplas) ,
                                           Short.valueOf(AV125Wctablaalbbards_44_tfbaralbplas_to) ,
                                           AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           AV126Wctablaalbbards_45_tfalbhdrobs ,
                                           Integer.valueOf(AV128Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                           AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                           AV129Wctablaalbbards_48_tfalbtipent ,
                                           A1253EmprGuiRem ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           A12232AlbNomCli ,
                                           A3153CodCod ,
                                           A2441AlbHdrObs ,
                                           A1095AlbTipEnt ,
                                           AV82Wctablaalbbards_1_emprcod ,
                                           Long.valueOf(AV83Wctablaalbbards_2_albprocod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV84Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV84Wctablaalbbards_3_tfemprguirem), 3, "%") ;
      /* Using cursor P08F79 */
      pr_default.execute(7, new Object[] {AV82Wctablaalbbards_1_emprcod, Long.valueOf(AV83Wctablaalbbards_2_albprocod), lV84Wctablaalbbards_3_tfemprguirem, AV85Wctablaalbbards_4_tfemprguirem_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         brk8F716 = false ;
         A396EmprCod = P08F79_A396EmprCod[0] ;
         A30AlbProCod = P08F79_A30AlbProCod[0] ;
         A1253EmprGuiRem = P08F79_A1253EmprGuiRem[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(P08F79_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08F79_A30AlbProCod[0] == A30AlbProCod ) )
         {
            brk8F716 = false ;
            AV68count = (long)(AV68count+1) ;
            brk8F716 = true ;
            pr_default.readNext(7);
         }
         if ( ! (GXutil.strcmp("", A2441AlbHdrObs)==0) )
         {
            AV60Option = A2441AlbHdrObs ;
            AV61Options.add(AV60Option, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8F716 )
         {
            brk8F716 = true ;
            pr_default.readNext(7);
         }
      }
      pr_default.close(7);
   }

   public void S201( )
   {
      /* 'LOADALBTIPENTOPTIONS' Routine */
      returnInSub = false ;
      AV54TFAlbTipEnt = AV56SearchTxt ;
      AV55TFAlbTipEnt_Sel = "" ;
      AV82Wctablaalbbards_1_emprcod = AV74Emprcod ;
      AV83Wctablaalbbards_2_albprocod = AV75AlbProcod ;
      AV84Wctablaalbbards_3_tfemprguirem = AV76TFEmprGuiRem ;
      AV85Wctablaalbbards_4_tfemprguirem_sel = AV77TFEmprGuiRem_Sel ;
      AV86Wctablaalbbards_5_tfbarcod = AV10TFBarCod ;
      AV87Wctablaalbbards_6_tfbarcod_to = AV11TFBarCod_To ;
      AV88Wctablaalbbards_7_tfbarcodreo = AV12TFBarCodReo ;
      AV89Wctablaalbbards_8_tfbarcodreo_to = AV13TFBarCodReo_To ;
      AV90Wctablaalbbards_9_tfbarcodpar = AV14TFBarCodPar ;
      AV91Wctablaalbbards_10_tfbarcodpar_sel = AV15TFBarCodPar_Sel ;
      AV92Wctablaalbbards_11_tfalbser = AV16TFAlbSer ;
      AV93Wctablaalbbards_12_tfalbser_sel = AV17TFAlbSer_Sel ;
      AV94Wctablaalbbards_13_tfalbserd = AV18TFAlbSerD ;
      AV95Wctablaalbbards_14_tfalbserd_sel = AV19TFAlbSerD_Sel ;
      AV96Wctablaalbbards_15_tfalbcolnom = AV20TFAlbColNom ;
      AV97Wctablaalbbards_16_tfalbcolnom_sel = AV21TFAlbColNom_Sel ;
      AV98Wctablaalbbards_17_tfalbnomcli = AV22TFAlbNomCli ;
      AV99Wctablaalbbards_18_tfalbnomcli_sel = AV23TFAlbNomCli_Sel ;
      AV100Wctablaalbbards_19_tfalbcolnum = AV24TFAlbColNum ;
      AV101Wctablaalbbards_20_tfalbcolnum_to = AV25TFAlbColNum_To ;
      AV102Wctablaalbbards_21_tfcodcod = AV26TFCodCod ;
      AV103Wctablaalbbards_22_tfcodcod_sel = AV27TFCodCod_Sel ;
      AV104Wctablaalbbards_23_tfbaralbkgme = AV28TFBarAlbKgmE ;
      AV105Wctablaalbbards_24_tfbaralbkgme_to = AV29TFBarAlbKgmE_To ;
      AV106Wctablaalbbards_25_tfbarprekgm = AV30TFBarPreKgm ;
      AV107Wctablaalbbards_26_tfbarprekgm_to = AV31TFBarPreKgm_To ;
      AV108Wctablaalbbards_27_tfalbhdranc = AV32TFAlbHdrAnc ;
      AV109Wctablaalbbards_28_tfalbhdranc_to = AV33TFAlbHdrAnc_To ;
      AV110Wctablaalbbards_29_tfalbhdrgm2 = AV34TFAlbHdrgm2 ;
      AV111Wctablaalbbards_30_tfalbhdrgm2_to = AV35TFAlbHdrgm2_To ;
      AV112Wctablaalbbards_31_tfbaralbmtre = AV36TFBarAlbMtrE ;
      AV113Wctablaalbbards_32_tfbaralbmtre_to = AV37TFBarAlbMtrE_To ;
      AV114Wctablaalbbards_33_tfbarpremtr = AV38TFBarPreMtr ;
      AV115Wctablaalbbards_34_tfbarpremtr_to = AV39TFBarPreMtr_To ;
      AV116Wctablaalbbards_35_tfbaralbpie = AV40TFBarAlbPie ;
      AV117Wctablaalbbards_36_tfbaralbpie_to = AV41TFBarAlbPie_To ;
      AV118Wctablaalbbards_37_tftubcod = AV42TFTubCod ;
      AV119Wctablaalbbards_38_tftubcod_to = AV43TFTubCod_To ;
      AV120Wctablaalbbards_39_tfbaralbtub = AV44TFBarAlbTub ;
      AV121Wctablaalbbards_40_tfbaralbtub_to = AV45TFBarAlbTub_To ;
      AV122Wctablaalbbards_41_tfplascod = AV46TFPlasCod ;
      AV123Wctablaalbbards_42_tfplascod_to = AV47TFPlasCod_To ;
      AV124Wctablaalbbards_43_tfbaralbplas = AV48TFBarAlbPlas ;
      AV125Wctablaalbbards_44_tfbaralbplas_to = AV49TFBarAlbPlas_To ;
      AV126Wctablaalbbards_45_tfalbhdrobs = AV50TFAlbHdrObs ;
      AV127Wctablaalbbards_46_tfalbhdrobs_sel = AV51TFAlbHdrObs_Sel ;
      AV128Wctablaalbbards_47_tfalbproval_sels = AV53TFAlbProVal_Sels ;
      AV129Wctablaalbbards_48_tfalbtipent = AV54TFAlbTipEnt ;
      AV130Wctablaalbbards_49_tfalbtipent_sel = AV55TFAlbTipEnt_Sel ;
      pr_default.dynParam(8, new Object[]{ new Object[]{
                                           AV128Wctablaalbbards_47_tfalbproval_sels ,
                                           AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                           AV84Wctablaalbbards_3_tfemprguirem ,
                                           Integer.valueOf(AV86Wctablaalbbards_5_tfbarcod) ,
                                           Integer.valueOf(AV87Wctablaalbbards_6_tfbarcod_to) ,
                                           Byte.valueOf(AV88Wctablaalbbards_7_tfbarcodreo) ,
                                           Byte.valueOf(AV89Wctablaalbbards_8_tfbarcodreo_to) ,
                                           AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                           AV90Wctablaalbbards_9_tfbarcodpar ,
                                           AV93Wctablaalbbards_12_tfalbser_sel ,
                                           AV92Wctablaalbbards_11_tfalbser ,
                                           AV95Wctablaalbbards_14_tfalbserd_sel ,
                                           AV94Wctablaalbbards_13_tfalbserd ,
                                           AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                           AV96Wctablaalbbards_15_tfalbcolnom ,
                                           AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                           AV98Wctablaalbbards_17_tfalbnomcli ,
                                           Integer.valueOf(AV100Wctablaalbbards_19_tfalbcolnum) ,
                                           Integer.valueOf(AV101Wctablaalbbards_20_tfalbcolnum_to) ,
                                           AV103Wctablaalbbards_22_tfcodcod_sel ,
                                           AV102Wctablaalbbards_21_tfcodcod ,
                                           AV104Wctablaalbbards_23_tfbaralbkgme ,
                                           AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                           AV106Wctablaalbbards_25_tfbarprekgm ,
                                           AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                           Short.valueOf(AV108Wctablaalbbards_27_tfalbhdranc) ,
                                           Short.valueOf(AV109Wctablaalbbards_28_tfalbhdranc_to) ,
                                           Short.valueOf(AV110Wctablaalbbards_29_tfalbhdrgm2) ,
                                           Short.valueOf(AV111Wctablaalbbards_30_tfalbhdrgm2_to) ,
                                           AV112Wctablaalbbards_31_tfbaralbmtre ,
                                           AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                           AV114Wctablaalbbards_33_tfbarpremtr ,
                                           AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                           Integer.valueOf(AV116Wctablaalbbards_35_tfbaralbpie) ,
                                           Integer.valueOf(AV117Wctablaalbbards_36_tfbaralbpie_to) ,
                                           Short.valueOf(AV118Wctablaalbbards_37_tftubcod) ,
                                           Short.valueOf(AV119Wctablaalbbards_38_tftubcod_to) ,
                                           Integer.valueOf(AV120Wctablaalbbards_39_tfbaralbtub) ,
                                           Integer.valueOf(AV121Wctablaalbbards_40_tfbaralbtub_to) ,
                                           Short.valueOf(AV122Wctablaalbbards_41_tfplascod) ,
                                           Short.valueOf(AV123Wctablaalbbards_42_tfplascod_to) ,
                                           Short.valueOf(AV124Wctablaalbbards_43_tfbaralbplas) ,
                                           Short.valueOf(AV125Wctablaalbbards_44_tfbaralbplas_to) ,
                                           AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           AV126Wctablaalbbards_45_tfalbhdrobs ,
                                           Integer.valueOf(AV128Wctablaalbbards_47_tfalbproval_sels.size()) ,
                                           AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                           AV129Wctablaalbbards_48_tfalbtipent ,
                                           A1253EmprGuiRem ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           A12232AlbNomCli ,
                                           A3153CodCod ,
                                           A2441AlbHdrObs ,
                                           A1095AlbTipEnt ,
                                           AV82Wctablaalbbards_1_emprcod ,
                                           Long.valueOf(AV83Wctablaalbbards_2_albprocod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV84Wctablaalbbards_3_tfemprguirem = GXutil.padr( GXutil.rtrim( AV84Wctablaalbbards_3_tfemprguirem), 3, "%") ;
      /* Using cursor P08F710 */
      pr_default.execute(8, new Object[] {AV82Wctablaalbbards_1_emprcod, Long.valueOf(AV83Wctablaalbbards_2_albprocod), lV84Wctablaalbbards_3_tfemprguirem, AV85Wctablaalbbards_4_tfemprguirem_sel});
      while ( (pr_default.getStatus(8) != 101) )
      {
         brk8F718 = false ;
         A396EmprCod = P08F710_A396EmprCod[0] ;
         A30AlbProCod = P08F710_A30AlbProCod[0] ;
         A1253EmprGuiRem = P08F710_A1253EmprGuiRem[0] ;
         AV68count = 0 ;
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(P08F710_A396EmprCod[0], A396EmprCod) == 0 ) && ( P08F710_A30AlbProCod[0] == A30AlbProCod ) )
         {
            brk8F718 = false ;
            AV68count = (long)(AV68count+1) ;
            brk8F718 = true ;
            pr_default.readNext(8);
         }
         if ( ! (GXutil.strcmp("", A1095AlbTipEnt)==0) )
         {
            AV60Option = A1095AlbTipEnt ;
            AV63OptionDesc = GXutil.trim( GXutil.rtrim( localUtil.format( A1095AlbTipEnt, "@!"))) ;
            AV61Options.add(AV60Option, 0);
            AV64OptionsDesc.add(AV63OptionDesc, 0);
            AV66OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV68count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV61Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8F718 )
         {
            brk8F718 = true ;
            pr_default.readNext(8);
         }
      }
      pr_default.close(8);
   }

   protected void cleanup( )
   {
      this.aP3[0] = wctablaalbbargetfilterdata.this.AV62OptionsJson;
      this.aP4[0] = wctablaalbbargetfilterdata.this.AV65OptionsDescJson;
      this.aP5[0] = wctablaalbbargetfilterdata.this.AV67OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV62OptionsJson = "" ;
      AV65OptionsDescJson = "" ;
      AV67OptionIndexesJson = "" ;
      AV61Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV69Session = httpContext.getWebSession();
      AV71GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV72GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV76TFEmprGuiRem = "" ;
      AV77TFEmprGuiRem_Sel = "" ;
      AV14TFBarCodPar = "" ;
      AV15TFBarCodPar_Sel = "" ;
      AV16TFAlbSer = "" ;
      AV17TFAlbSer_Sel = "" ;
      AV18TFAlbSerD = "" ;
      AV19TFAlbSerD_Sel = "" ;
      AV20TFAlbColNom = "" ;
      AV21TFAlbColNom_Sel = "" ;
      AV22TFAlbNomCli = "" ;
      AV23TFAlbNomCli_Sel = "" ;
      AV26TFCodCod = "" ;
      AV27TFCodCod_Sel = "" ;
      AV28TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV29TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV30TFBarPreKgm = DecimalUtil.ZERO ;
      AV31TFBarPreKgm_To = DecimalUtil.ZERO ;
      AV36TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV37TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV38TFBarPreMtr = DecimalUtil.ZERO ;
      AV39TFBarPreMtr_To = DecimalUtil.ZERO ;
      AV50TFAlbHdrObs = "" ;
      AV51TFAlbHdrObs_Sel = "" ;
      AV52TFAlbProVal_SelsJson = "" ;
      AV53TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54TFAlbTipEnt = "" ;
      AV55TFAlbTipEnt_Sel = "" ;
      AV74Emprcod = "" ;
      A1253EmprGuiRem = "" ;
      AV82Wctablaalbbards_1_emprcod = "" ;
      AV84Wctablaalbbards_3_tfemprguirem = "" ;
      AV85Wctablaalbbards_4_tfemprguirem_sel = "" ;
      AV90Wctablaalbbards_9_tfbarcodpar = "" ;
      AV91Wctablaalbbards_10_tfbarcodpar_sel = "" ;
      AV92Wctablaalbbards_11_tfalbser = "" ;
      AV93Wctablaalbbards_12_tfalbser_sel = "" ;
      AV94Wctablaalbbards_13_tfalbserd = "" ;
      AV95Wctablaalbbards_14_tfalbserd_sel = "" ;
      AV96Wctablaalbbards_15_tfalbcolnom = "" ;
      AV97Wctablaalbbards_16_tfalbcolnom_sel = "" ;
      AV98Wctablaalbbards_17_tfalbnomcli = "" ;
      AV99Wctablaalbbards_18_tfalbnomcli_sel = "" ;
      AV102Wctablaalbbards_21_tfcodcod = "" ;
      AV103Wctablaalbbards_22_tfcodcod_sel = "" ;
      AV104Wctablaalbbards_23_tfbaralbkgme = DecimalUtil.ZERO ;
      AV105Wctablaalbbards_24_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV106Wctablaalbbards_25_tfbarprekgm = DecimalUtil.ZERO ;
      AV107Wctablaalbbards_26_tfbarprekgm_to = DecimalUtil.ZERO ;
      AV112Wctablaalbbards_31_tfbaralbmtre = DecimalUtil.ZERO ;
      AV113Wctablaalbbards_32_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV114Wctablaalbbards_33_tfbarpremtr = DecimalUtil.ZERO ;
      AV115Wctablaalbbards_34_tfbarpremtr_to = DecimalUtil.ZERO ;
      AV126Wctablaalbbards_45_tfalbhdrobs = "" ;
      AV127Wctablaalbbards_46_tfalbhdrobs_sel = "" ;
      AV128Wctablaalbbards_47_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV129Wctablaalbbards_48_tfalbtipent = "" ;
      AV130Wctablaalbbards_49_tfalbtipent_sel = "" ;
      scmdbuf = "" ;
      lV84Wctablaalbbards_3_tfemprguirem = "" ;
      A130BarCodPar = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A3153CodCod = "" ;
      A2441AlbHdrObs = "" ;
      A1095AlbTipEnt = "" ;
      A396EmprCod = "" ;
      P08F72_A396EmprCod = new String[] {""} ;
      P08F72_A30AlbProCod = new long[1] ;
      P08F72_A1253EmprGuiRem = new String[] {""} ;
      AV60Option = "" ;
      AV63OptionDesc = "" ;
      P08F73_A396EmprCod = new String[] {""} ;
      P08F73_A30AlbProCod = new long[1] ;
      P08F73_A1253EmprGuiRem = new String[] {""} ;
      P08F74_A396EmprCod = new String[] {""} ;
      P08F74_A30AlbProCod = new long[1] ;
      P08F74_A1253EmprGuiRem = new String[] {""} ;
      P08F75_A396EmprCod = new String[] {""} ;
      P08F75_A30AlbProCod = new long[1] ;
      P08F75_A1253EmprGuiRem = new String[] {""} ;
      P08F76_A396EmprCod = new String[] {""} ;
      P08F76_A30AlbProCod = new long[1] ;
      P08F76_A1253EmprGuiRem = new String[] {""} ;
      P08F77_A396EmprCod = new String[] {""} ;
      P08F77_A30AlbProCod = new long[1] ;
      P08F77_A1253EmprGuiRem = new String[] {""} ;
      P08F78_A396EmprCod = new String[] {""} ;
      P08F78_A30AlbProCod = new long[1] ;
      P08F78_A1253EmprGuiRem = new String[] {""} ;
      P08F79_A396EmprCod = new String[] {""} ;
      P08F79_A30AlbProCod = new long[1] ;
      P08F79_A1253EmprGuiRem = new String[] {""} ;
      P08F710_A396EmprCod = new String[] {""} ;
      P08F710_A30AlbProCod = new long[1] ;
      P08F710_A1253EmprGuiRem = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wctablaalbbargetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08F72_A396EmprCod, P08F72_A30AlbProCod, P08F72_A1253EmprGuiRem
            }
            , new Object[] {
            P08F73_A396EmprCod, P08F73_A30AlbProCod, P08F73_A1253EmprGuiRem
            }
            , new Object[] {
            P08F74_A396EmprCod, P08F74_A30AlbProCod, P08F74_A1253EmprGuiRem
            }
            , new Object[] {
            P08F75_A396EmprCod, P08F75_A30AlbProCod, P08F75_A1253EmprGuiRem
            }
            , new Object[] {
            P08F76_A396EmprCod, P08F76_A30AlbProCod, P08F76_A1253EmprGuiRem
            }
            , new Object[] {
            P08F77_A396EmprCod, P08F77_A30AlbProCod, P08F77_A1253EmprGuiRem
            }
            , new Object[] {
            P08F78_A396EmprCod, P08F78_A30AlbProCod, P08F78_A1253EmprGuiRem
            }
            , new Object[] {
            P08F79_A396EmprCod, P08F79_A30AlbProCod, P08F79_A1253EmprGuiRem
            }
            , new Object[] {
            P08F710_A396EmprCod, P08F710_A30AlbProCod, P08F710_A1253EmprGuiRem
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12TFBarCodReo ;
   private byte AV13TFBarCodReo_To ;
   private byte AV88Wctablaalbbards_7_tfbarcodreo ;
   private byte AV89Wctablaalbbards_8_tfbarcodreo_to ;
   private short AV32TFAlbHdrAnc ;
   private short AV33TFAlbHdrAnc_To ;
   private short AV34TFAlbHdrgm2 ;
   private short AV35TFAlbHdrgm2_To ;
   private short AV42TFTubCod ;
   private short AV43TFTubCod_To ;
   private short AV46TFPlasCod ;
   private short AV47TFPlasCod_To ;
   private short AV48TFBarAlbPlas ;
   private short AV49TFBarAlbPlas_To ;
   private short AV108Wctablaalbbards_27_tfalbhdranc ;
   private short AV109Wctablaalbbards_28_tfalbhdranc_to ;
   private short AV110Wctablaalbbards_29_tfalbhdrgm2 ;
   private short AV111Wctablaalbbards_30_tfalbhdrgm2_to ;
   private short AV118Wctablaalbbards_37_tftubcod ;
   private short AV119Wctablaalbbards_38_tftubcod_to ;
   private short AV122Wctablaalbbards_41_tfplascod ;
   private short AV123Wctablaalbbards_42_tfplascod_to ;
   private short AV124Wctablaalbbards_43_tfbaralbplas ;
   private short AV125Wctablaalbbards_44_tfbaralbplas_to ;
   private short Gx_err ;
   private int AV80GXV1 ;
   private int AV10TFBarCod ;
   private int AV11TFBarCod_To ;
   private int AV24TFAlbColNum ;
   private int AV25TFAlbColNum_To ;
   private int AV40TFBarAlbPie ;
   private int AV41TFBarAlbPie_To ;
   private int AV44TFBarAlbTub ;
   private int AV45TFBarAlbTub_To ;
   private int AV86Wctablaalbbards_5_tfbarcod ;
   private int AV87Wctablaalbbards_6_tfbarcod_to ;
   private int AV100Wctablaalbbards_19_tfalbcolnum ;
   private int AV101Wctablaalbbards_20_tfalbcolnum_to ;
   private int AV116Wctablaalbbards_35_tfbaralbpie ;
   private int AV117Wctablaalbbards_36_tfbaralbpie_to ;
   private int AV120Wctablaalbbards_39_tfbaralbtub ;
   private int AV121Wctablaalbbards_40_tfbaralbtub_to ;
   private int AV128Wctablaalbbards_47_tfalbproval_sels_size ;
   private long AV75AlbProcod ;
   private long AV83Wctablaalbbards_2_albprocod ;
   private long A30AlbProCod ;
   private long AV68count ;
   private java.math.BigDecimal AV28TFBarAlbKgmE ;
   private java.math.BigDecimal AV29TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV30TFBarPreKgm ;
   private java.math.BigDecimal AV31TFBarPreKgm_To ;
   private java.math.BigDecimal AV36TFBarAlbMtrE ;
   private java.math.BigDecimal AV37TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV38TFBarPreMtr ;
   private java.math.BigDecimal AV39TFBarPreMtr_To ;
   private java.math.BigDecimal AV104Wctablaalbbards_23_tfbaralbkgme ;
   private java.math.BigDecimal AV105Wctablaalbbards_24_tfbaralbkgme_to ;
   private java.math.BigDecimal AV106Wctablaalbbards_25_tfbarprekgm ;
   private java.math.BigDecimal AV107Wctablaalbbards_26_tfbarprekgm_to ;
   private java.math.BigDecimal AV112Wctablaalbbards_31_tfbaralbmtre ;
   private java.math.BigDecimal AV113Wctablaalbbards_32_tfbaralbmtre_to ;
   private java.math.BigDecimal AV114Wctablaalbbards_33_tfbarpremtr ;
   private java.math.BigDecimal AV115Wctablaalbbards_34_tfbarpremtr_to ;
   private String AV76TFEmprGuiRem ;
   private String AV77TFEmprGuiRem_Sel ;
   private String AV14TFBarCodPar ;
   private String AV15TFBarCodPar_Sel ;
   private String AV16TFAlbSer ;
   private String AV17TFAlbSer_Sel ;
   private String AV18TFAlbSerD ;
   private String AV19TFAlbSerD_Sel ;
   private String AV20TFAlbColNom ;
   private String AV21TFAlbColNom_Sel ;
   private String AV22TFAlbNomCli ;
   private String AV23TFAlbNomCli_Sel ;
   private String AV26TFCodCod ;
   private String AV27TFCodCod_Sel ;
   private String AV50TFAlbHdrObs ;
   private String AV51TFAlbHdrObs_Sel ;
   private String AV54TFAlbTipEnt ;
   private String AV55TFAlbTipEnt_Sel ;
   private String AV74Emprcod ;
   private String A1253EmprGuiRem ;
   private String AV82Wctablaalbbards_1_emprcod ;
   private String AV84Wctablaalbbards_3_tfemprguirem ;
   private String AV85Wctablaalbbards_4_tfemprguirem_sel ;
   private String AV90Wctablaalbbards_9_tfbarcodpar ;
   private String AV91Wctablaalbbards_10_tfbarcodpar_sel ;
   private String AV92Wctablaalbbards_11_tfalbser ;
   private String AV93Wctablaalbbards_12_tfalbser_sel ;
   private String AV94Wctablaalbbards_13_tfalbserd ;
   private String AV95Wctablaalbbards_14_tfalbserd_sel ;
   private String AV96Wctablaalbbards_15_tfalbcolnom ;
   private String AV97Wctablaalbbards_16_tfalbcolnom_sel ;
   private String AV98Wctablaalbbards_17_tfalbnomcli ;
   private String AV99Wctablaalbbards_18_tfalbnomcli_sel ;
   private String AV102Wctablaalbbards_21_tfcodcod ;
   private String AV103Wctablaalbbards_22_tfcodcod_sel ;
   private String AV126Wctablaalbbards_45_tfalbhdrobs ;
   private String AV127Wctablaalbbards_46_tfalbhdrobs_sel ;
   private String AV129Wctablaalbbards_48_tfalbtipent ;
   private String AV130Wctablaalbbards_49_tfalbtipent_sel ;
   private String scmdbuf ;
   private String lV84Wctablaalbbards_3_tfemprguirem ;
   private String A130BarCodPar ;
   private String A3391AlbSer ;
   private String A8879AlbSerD ;
   private String A3392AlbColNom ;
   private String A12232AlbNomCli ;
   private String A3153CodCod ;
   private String A2441AlbHdrObs ;
   private String A1095AlbTipEnt ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean brk8F72 ;
   private boolean brk8F74 ;
   private boolean brk8F76 ;
   private boolean brk8F78 ;
   private boolean brk8F710 ;
   private boolean brk8F712 ;
   private boolean brk8F714 ;
   private boolean brk8F716 ;
   private boolean brk8F718 ;
   private String AV62OptionsJson ;
   private String AV65OptionsDescJson ;
   private String AV67OptionIndexesJson ;
   private String AV52TFAlbProVal_SelsJson ;
   private String AV58DDOName ;
   private String AV56SearchTxt ;
   private String AV57SearchTxtTo ;
   private String AV60Option ;
   private String AV63OptionDesc ;
   private com.genexus.webpanels.WebSession AV69Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08F72_A396EmprCod ;
   private long[] P08F72_A30AlbProCod ;
   private String[] P08F72_A1253EmprGuiRem ;
   private String[] P08F73_A396EmprCod ;
   private long[] P08F73_A30AlbProCod ;
   private String[] P08F73_A1253EmprGuiRem ;
   private String[] P08F74_A396EmprCod ;
   private long[] P08F74_A30AlbProCod ;
   private String[] P08F74_A1253EmprGuiRem ;
   private String[] P08F75_A396EmprCod ;
   private long[] P08F75_A30AlbProCod ;
   private String[] P08F75_A1253EmprGuiRem ;
   private String[] P08F76_A396EmprCod ;
   private long[] P08F76_A30AlbProCod ;
   private String[] P08F76_A1253EmprGuiRem ;
   private String[] P08F77_A396EmprCod ;
   private long[] P08F77_A30AlbProCod ;
   private String[] P08F77_A1253EmprGuiRem ;
   private String[] P08F78_A396EmprCod ;
   private long[] P08F78_A30AlbProCod ;
   private String[] P08F78_A1253EmprGuiRem ;
   private String[] P08F79_A396EmprCod ;
   private long[] P08F79_A30AlbProCod ;
   private String[] P08F79_A1253EmprGuiRem ;
   private String[] P08F710_A396EmprCod ;
   private long[] P08F710_A30AlbProCod ;
   private String[] P08F710_A1253EmprGuiRem ;
   private GXSimpleCollection<String> AV53TFAlbProVal_Sels ;
   private GXSimpleCollection<String> AV128Wctablaalbbards_47_tfalbproval_sels ;
   private GXSimpleCollection<String> AV61Options ;
   private GXSimpleCollection<String> AV64OptionsDesc ;
   private GXSimpleCollection<String> AV66OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV71GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV72GridStateFilterValue ;
}

final  class wctablaalbbargetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08F72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          GXSimpleCollection<String> AV128Wctablaalbbards_47_tfalbproval_sels ,
                                          String AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                          String AV84Wctablaalbbards_3_tfemprguirem ,
                                          int AV86Wctablaalbbards_5_tfbarcod ,
                                          int AV87Wctablaalbbards_6_tfbarcod_to ,
                                          byte AV88Wctablaalbbards_7_tfbarcodreo ,
                                          byte AV89Wctablaalbbards_8_tfbarcodreo_to ,
                                          String AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                          String AV90Wctablaalbbards_9_tfbarcodpar ,
                                          String AV93Wctablaalbbards_12_tfalbser_sel ,
                                          String AV92Wctablaalbbards_11_tfalbser ,
                                          String AV95Wctablaalbbards_14_tfalbserd_sel ,
                                          String AV94Wctablaalbbards_13_tfalbserd ,
                                          String AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                          String AV96Wctablaalbbards_15_tfalbcolnom ,
                                          String AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                          String AV98Wctablaalbbards_17_tfalbnomcli ,
                                          int AV100Wctablaalbbards_19_tfalbcolnum ,
                                          int AV101Wctablaalbbards_20_tfalbcolnum_to ,
                                          String AV103Wctablaalbbards_22_tfcodcod_sel ,
                                          String AV102Wctablaalbbards_21_tfcodcod ,
                                          java.math.BigDecimal AV104Wctablaalbbards_23_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Wctablaalbbards_25_tfbarprekgm ,
                                          java.math.BigDecimal AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                          short AV108Wctablaalbbards_27_tfalbhdranc ,
                                          short AV109Wctablaalbbards_28_tfalbhdranc_to ,
                                          short AV110Wctablaalbbards_29_tfalbhdrgm2 ,
                                          short AV111Wctablaalbbards_30_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Wctablaalbbards_31_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Wctablaalbbards_33_tfbarpremtr ,
                                          java.math.BigDecimal AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                          int AV116Wctablaalbbards_35_tfbaralbpie ,
                                          int AV117Wctablaalbbards_36_tfbaralbpie_to ,
                                          short AV118Wctablaalbbards_37_tftubcod ,
                                          short AV119Wctablaalbbards_38_tftubcod_to ,
                                          int AV120Wctablaalbbards_39_tfbaralbtub ,
                                          int AV121Wctablaalbbards_40_tfbaralbtub_to ,
                                          short AV122Wctablaalbbards_41_tfplascod ,
                                          short AV123Wctablaalbbards_42_tfplascod_to ,
                                          short AV124Wctablaalbbards_43_tfbaralbplas ,
                                          short AV125Wctablaalbbards_44_tfbaralbplas_to ,
                                          String AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                          String AV126Wctablaalbbards_45_tfalbhdrobs ,
                                          int AV128Wctablaalbbards_47_tfalbproval_sels_size ,
                                          String AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                          String AV129Wctablaalbbards_48_tfalbtipent ,
                                          String A1253EmprGuiRem ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          String A12232AlbNomCli ,
                                          String A3153CodCod ,
                                          String A2441AlbHdrObs ,
                                          String A1095AlbTipEnt ,
                                          String AV82Wctablaalbbards_1_emprcod ,
                                          long AV83Wctablaalbbards_2_albprocod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[4];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, EmprGuiRem FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod, EmprGuiRem" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08F73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          GXSimpleCollection<String> AV128Wctablaalbbards_47_tfalbproval_sels ,
                                          String AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                          String AV84Wctablaalbbards_3_tfemprguirem ,
                                          int AV86Wctablaalbbards_5_tfbarcod ,
                                          int AV87Wctablaalbbards_6_tfbarcod_to ,
                                          byte AV88Wctablaalbbards_7_tfbarcodreo ,
                                          byte AV89Wctablaalbbards_8_tfbarcodreo_to ,
                                          String AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                          String AV90Wctablaalbbards_9_tfbarcodpar ,
                                          String AV93Wctablaalbbards_12_tfalbser_sel ,
                                          String AV92Wctablaalbbards_11_tfalbser ,
                                          String AV95Wctablaalbbards_14_tfalbserd_sel ,
                                          String AV94Wctablaalbbards_13_tfalbserd ,
                                          String AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                          String AV96Wctablaalbbards_15_tfalbcolnom ,
                                          String AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                          String AV98Wctablaalbbards_17_tfalbnomcli ,
                                          int AV100Wctablaalbbards_19_tfalbcolnum ,
                                          int AV101Wctablaalbbards_20_tfalbcolnum_to ,
                                          String AV103Wctablaalbbards_22_tfcodcod_sel ,
                                          String AV102Wctablaalbbards_21_tfcodcod ,
                                          java.math.BigDecimal AV104Wctablaalbbards_23_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Wctablaalbbards_25_tfbarprekgm ,
                                          java.math.BigDecimal AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                          short AV108Wctablaalbbards_27_tfalbhdranc ,
                                          short AV109Wctablaalbbards_28_tfalbhdranc_to ,
                                          short AV110Wctablaalbbards_29_tfalbhdrgm2 ,
                                          short AV111Wctablaalbbards_30_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Wctablaalbbards_31_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Wctablaalbbards_33_tfbarpremtr ,
                                          java.math.BigDecimal AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                          int AV116Wctablaalbbards_35_tfbaralbpie ,
                                          int AV117Wctablaalbbards_36_tfbaralbpie_to ,
                                          short AV118Wctablaalbbards_37_tftubcod ,
                                          short AV119Wctablaalbbards_38_tftubcod_to ,
                                          int AV120Wctablaalbbards_39_tfbaralbtub ,
                                          int AV121Wctablaalbbards_40_tfbaralbtub_to ,
                                          short AV122Wctablaalbbards_41_tfplascod ,
                                          short AV123Wctablaalbbards_42_tfplascod_to ,
                                          short AV124Wctablaalbbards_43_tfbaralbplas ,
                                          short AV125Wctablaalbbards_44_tfbaralbplas_to ,
                                          String AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                          String AV126Wctablaalbbards_45_tfalbhdrobs ,
                                          int AV128Wctablaalbbards_47_tfalbproval_sels_size ,
                                          String AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                          String AV129Wctablaalbbards_48_tfalbtipent ,
                                          String A1253EmprGuiRem ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          String A12232AlbNomCli ,
                                          String A3153CodCod ,
                                          String A2441AlbHdrObs ,
                                          String A1095AlbTipEnt ,
                                          String AV82Wctablaalbbards_1_emprcod ,
                                          long AV83Wctablaalbbards_2_albprocod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[4];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, EmprGuiRem FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08F74( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          GXSimpleCollection<String> AV128Wctablaalbbards_47_tfalbproval_sels ,
                                          String AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                          String AV84Wctablaalbbards_3_tfemprguirem ,
                                          int AV86Wctablaalbbards_5_tfbarcod ,
                                          int AV87Wctablaalbbards_6_tfbarcod_to ,
                                          byte AV88Wctablaalbbards_7_tfbarcodreo ,
                                          byte AV89Wctablaalbbards_8_tfbarcodreo_to ,
                                          String AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                          String AV90Wctablaalbbards_9_tfbarcodpar ,
                                          String AV93Wctablaalbbards_12_tfalbser_sel ,
                                          String AV92Wctablaalbbards_11_tfalbser ,
                                          String AV95Wctablaalbbards_14_tfalbserd_sel ,
                                          String AV94Wctablaalbbards_13_tfalbserd ,
                                          String AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                          String AV96Wctablaalbbards_15_tfalbcolnom ,
                                          String AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                          String AV98Wctablaalbbards_17_tfalbnomcli ,
                                          int AV100Wctablaalbbards_19_tfalbcolnum ,
                                          int AV101Wctablaalbbards_20_tfalbcolnum_to ,
                                          String AV103Wctablaalbbards_22_tfcodcod_sel ,
                                          String AV102Wctablaalbbards_21_tfcodcod ,
                                          java.math.BigDecimal AV104Wctablaalbbards_23_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Wctablaalbbards_25_tfbarprekgm ,
                                          java.math.BigDecimal AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                          short AV108Wctablaalbbards_27_tfalbhdranc ,
                                          short AV109Wctablaalbbards_28_tfalbhdranc_to ,
                                          short AV110Wctablaalbbards_29_tfalbhdrgm2 ,
                                          short AV111Wctablaalbbards_30_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Wctablaalbbards_31_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Wctablaalbbards_33_tfbarpremtr ,
                                          java.math.BigDecimal AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                          int AV116Wctablaalbbards_35_tfbaralbpie ,
                                          int AV117Wctablaalbbards_36_tfbaralbpie_to ,
                                          short AV118Wctablaalbbards_37_tftubcod ,
                                          short AV119Wctablaalbbards_38_tftubcod_to ,
                                          int AV120Wctablaalbbards_39_tfbaralbtub ,
                                          int AV121Wctablaalbbards_40_tfbaralbtub_to ,
                                          short AV122Wctablaalbbards_41_tfplascod ,
                                          short AV123Wctablaalbbards_42_tfplascod_to ,
                                          short AV124Wctablaalbbards_43_tfbaralbplas ,
                                          short AV125Wctablaalbbards_44_tfbaralbplas_to ,
                                          String AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                          String AV126Wctablaalbbards_45_tfalbhdrobs ,
                                          int AV128Wctablaalbbards_47_tfalbproval_sels_size ,
                                          String AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                          String AV129Wctablaalbbards_48_tfalbtipent ,
                                          String A1253EmprGuiRem ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          String A12232AlbNomCli ,
                                          String A3153CodCod ,
                                          String A2441AlbHdrObs ,
                                          String A1095AlbTipEnt ,
                                          String AV82Wctablaalbbards_1_emprcod ,
                                          long AV83Wctablaalbbards_2_albprocod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[4];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, EmprGuiRem FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod" ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08F75( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          GXSimpleCollection<String> AV128Wctablaalbbards_47_tfalbproval_sels ,
                                          String AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                          String AV84Wctablaalbbards_3_tfemprguirem ,
                                          int AV86Wctablaalbbards_5_tfbarcod ,
                                          int AV87Wctablaalbbards_6_tfbarcod_to ,
                                          byte AV88Wctablaalbbards_7_tfbarcodreo ,
                                          byte AV89Wctablaalbbards_8_tfbarcodreo_to ,
                                          String AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                          String AV90Wctablaalbbards_9_tfbarcodpar ,
                                          String AV93Wctablaalbbards_12_tfalbser_sel ,
                                          String AV92Wctablaalbbards_11_tfalbser ,
                                          String AV95Wctablaalbbards_14_tfalbserd_sel ,
                                          String AV94Wctablaalbbards_13_tfalbserd ,
                                          String AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                          String AV96Wctablaalbbards_15_tfalbcolnom ,
                                          String AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                          String AV98Wctablaalbbards_17_tfalbnomcli ,
                                          int AV100Wctablaalbbards_19_tfalbcolnum ,
                                          int AV101Wctablaalbbards_20_tfalbcolnum_to ,
                                          String AV103Wctablaalbbards_22_tfcodcod_sel ,
                                          String AV102Wctablaalbbards_21_tfcodcod ,
                                          java.math.BigDecimal AV104Wctablaalbbards_23_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Wctablaalbbards_25_tfbarprekgm ,
                                          java.math.BigDecimal AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                          short AV108Wctablaalbbards_27_tfalbhdranc ,
                                          short AV109Wctablaalbbards_28_tfalbhdranc_to ,
                                          short AV110Wctablaalbbards_29_tfalbhdrgm2 ,
                                          short AV111Wctablaalbbards_30_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Wctablaalbbards_31_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Wctablaalbbards_33_tfbarpremtr ,
                                          java.math.BigDecimal AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                          int AV116Wctablaalbbards_35_tfbaralbpie ,
                                          int AV117Wctablaalbbards_36_tfbaralbpie_to ,
                                          short AV118Wctablaalbbards_37_tftubcod ,
                                          short AV119Wctablaalbbards_38_tftubcod_to ,
                                          int AV120Wctablaalbbards_39_tfbaralbtub ,
                                          int AV121Wctablaalbbards_40_tfbaralbtub_to ,
                                          short AV122Wctablaalbbards_41_tfplascod ,
                                          short AV123Wctablaalbbards_42_tfplascod_to ,
                                          short AV124Wctablaalbbards_43_tfbaralbplas ,
                                          short AV125Wctablaalbbards_44_tfbaralbplas_to ,
                                          String AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                          String AV126Wctablaalbbards_45_tfalbhdrobs ,
                                          int AV128Wctablaalbbards_47_tfalbproval_sels_size ,
                                          String AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                          String AV129Wctablaalbbards_48_tfalbtipent ,
                                          String A1253EmprGuiRem ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          String A12232AlbNomCli ,
                                          String A3153CodCod ,
                                          String A2441AlbHdrObs ,
                                          String A1095AlbTipEnt ,
                                          String AV82Wctablaalbbards_1_emprcod ,
                                          long AV83Wctablaalbbards_2_albprocod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[4];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, EmprGuiRem FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08F76( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          GXSimpleCollection<String> AV128Wctablaalbbards_47_tfalbproval_sels ,
                                          String AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                          String AV84Wctablaalbbards_3_tfemprguirem ,
                                          int AV86Wctablaalbbards_5_tfbarcod ,
                                          int AV87Wctablaalbbards_6_tfbarcod_to ,
                                          byte AV88Wctablaalbbards_7_tfbarcodreo ,
                                          byte AV89Wctablaalbbards_8_tfbarcodreo_to ,
                                          String AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                          String AV90Wctablaalbbards_9_tfbarcodpar ,
                                          String AV93Wctablaalbbards_12_tfalbser_sel ,
                                          String AV92Wctablaalbbards_11_tfalbser ,
                                          String AV95Wctablaalbbards_14_tfalbserd_sel ,
                                          String AV94Wctablaalbbards_13_tfalbserd ,
                                          String AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                          String AV96Wctablaalbbards_15_tfalbcolnom ,
                                          String AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                          String AV98Wctablaalbbards_17_tfalbnomcli ,
                                          int AV100Wctablaalbbards_19_tfalbcolnum ,
                                          int AV101Wctablaalbbards_20_tfalbcolnum_to ,
                                          String AV103Wctablaalbbards_22_tfcodcod_sel ,
                                          String AV102Wctablaalbbards_21_tfcodcod ,
                                          java.math.BigDecimal AV104Wctablaalbbards_23_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Wctablaalbbards_25_tfbarprekgm ,
                                          java.math.BigDecimal AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                          short AV108Wctablaalbbards_27_tfalbhdranc ,
                                          short AV109Wctablaalbbards_28_tfalbhdranc_to ,
                                          short AV110Wctablaalbbards_29_tfalbhdrgm2 ,
                                          short AV111Wctablaalbbards_30_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Wctablaalbbards_31_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Wctablaalbbards_33_tfbarpremtr ,
                                          java.math.BigDecimal AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                          int AV116Wctablaalbbards_35_tfbaralbpie ,
                                          int AV117Wctablaalbbards_36_tfbaralbpie_to ,
                                          short AV118Wctablaalbbards_37_tftubcod ,
                                          short AV119Wctablaalbbards_38_tftubcod_to ,
                                          int AV120Wctablaalbbards_39_tfbaralbtub ,
                                          int AV121Wctablaalbbards_40_tfbaralbtub_to ,
                                          short AV122Wctablaalbbards_41_tfplascod ,
                                          short AV123Wctablaalbbards_42_tfplascod_to ,
                                          short AV124Wctablaalbbards_43_tfbaralbplas ,
                                          short AV125Wctablaalbbards_44_tfbaralbplas_to ,
                                          String AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                          String AV126Wctablaalbbards_45_tfalbhdrobs ,
                                          int AV128Wctablaalbbards_47_tfalbproval_sels_size ,
                                          String AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                          String AV129Wctablaalbbards_48_tfalbtipent ,
                                          String A1253EmprGuiRem ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          String A12232AlbNomCli ,
                                          String A3153CodCod ,
                                          String A2441AlbHdrObs ,
                                          String A1095AlbTipEnt ,
                                          String AV82Wctablaalbbards_1_emprcod ,
                                          long AV83Wctablaalbbards_2_albprocod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[4];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, EmprGuiRem FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08F77( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          GXSimpleCollection<String> AV128Wctablaalbbards_47_tfalbproval_sels ,
                                          String AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                          String AV84Wctablaalbbards_3_tfemprguirem ,
                                          int AV86Wctablaalbbards_5_tfbarcod ,
                                          int AV87Wctablaalbbards_6_tfbarcod_to ,
                                          byte AV88Wctablaalbbards_7_tfbarcodreo ,
                                          byte AV89Wctablaalbbards_8_tfbarcodreo_to ,
                                          String AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                          String AV90Wctablaalbbards_9_tfbarcodpar ,
                                          String AV93Wctablaalbbards_12_tfalbser_sel ,
                                          String AV92Wctablaalbbards_11_tfalbser ,
                                          String AV95Wctablaalbbards_14_tfalbserd_sel ,
                                          String AV94Wctablaalbbards_13_tfalbserd ,
                                          String AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                          String AV96Wctablaalbbards_15_tfalbcolnom ,
                                          String AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                          String AV98Wctablaalbbards_17_tfalbnomcli ,
                                          int AV100Wctablaalbbards_19_tfalbcolnum ,
                                          int AV101Wctablaalbbards_20_tfalbcolnum_to ,
                                          String AV103Wctablaalbbards_22_tfcodcod_sel ,
                                          String AV102Wctablaalbbards_21_tfcodcod ,
                                          java.math.BigDecimal AV104Wctablaalbbards_23_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Wctablaalbbards_25_tfbarprekgm ,
                                          java.math.BigDecimal AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                          short AV108Wctablaalbbards_27_tfalbhdranc ,
                                          short AV109Wctablaalbbards_28_tfalbhdranc_to ,
                                          short AV110Wctablaalbbards_29_tfalbhdrgm2 ,
                                          short AV111Wctablaalbbards_30_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Wctablaalbbards_31_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Wctablaalbbards_33_tfbarpremtr ,
                                          java.math.BigDecimal AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                          int AV116Wctablaalbbards_35_tfbaralbpie ,
                                          int AV117Wctablaalbbards_36_tfbaralbpie_to ,
                                          short AV118Wctablaalbbards_37_tftubcod ,
                                          short AV119Wctablaalbbards_38_tftubcod_to ,
                                          int AV120Wctablaalbbards_39_tfbaralbtub ,
                                          int AV121Wctablaalbbards_40_tfbaralbtub_to ,
                                          short AV122Wctablaalbbards_41_tfplascod ,
                                          short AV123Wctablaalbbards_42_tfplascod_to ,
                                          short AV124Wctablaalbbards_43_tfbaralbplas ,
                                          short AV125Wctablaalbbards_44_tfbaralbplas_to ,
                                          String AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                          String AV126Wctablaalbbards_45_tfalbhdrobs ,
                                          int AV128Wctablaalbbards_47_tfalbproval_sels_size ,
                                          String AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                          String AV129Wctablaalbbards_48_tfalbtipent ,
                                          String A1253EmprGuiRem ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          String A12232AlbNomCli ,
                                          String A3153CodCod ,
                                          String A2441AlbHdrObs ,
                                          String A1095AlbTipEnt ,
                                          String AV82Wctablaalbbards_1_emprcod ,
                                          long AV83Wctablaalbbards_2_albprocod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[4];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, EmprGuiRem FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P08F78( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          GXSimpleCollection<String> AV128Wctablaalbbards_47_tfalbproval_sels ,
                                          String AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                          String AV84Wctablaalbbards_3_tfemprguirem ,
                                          int AV86Wctablaalbbards_5_tfbarcod ,
                                          int AV87Wctablaalbbards_6_tfbarcod_to ,
                                          byte AV88Wctablaalbbards_7_tfbarcodreo ,
                                          byte AV89Wctablaalbbards_8_tfbarcodreo_to ,
                                          String AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                          String AV90Wctablaalbbards_9_tfbarcodpar ,
                                          String AV93Wctablaalbbards_12_tfalbser_sel ,
                                          String AV92Wctablaalbbards_11_tfalbser ,
                                          String AV95Wctablaalbbards_14_tfalbserd_sel ,
                                          String AV94Wctablaalbbards_13_tfalbserd ,
                                          String AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                          String AV96Wctablaalbbards_15_tfalbcolnom ,
                                          String AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                          String AV98Wctablaalbbards_17_tfalbnomcli ,
                                          int AV100Wctablaalbbards_19_tfalbcolnum ,
                                          int AV101Wctablaalbbards_20_tfalbcolnum_to ,
                                          String AV103Wctablaalbbards_22_tfcodcod_sel ,
                                          String AV102Wctablaalbbards_21_tfcodcod ,
                                          java.math.BigDecimal AV104Wctablaalbbards_23_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Wctablaalbbards_25_tfbarprekgm ,
                                          java.math.BigDecimal AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                          short AV108Wctablaalbbards_27_tfalbhdranc ,
                                          short AV109Wctablaalbbards_28_tfalbhdranc_to ,
                                          short AV110Wctablaalbbards_29_tfalbhdrgm2 ,
                                          short AV111Wctablaalbbards_30_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Wctablaalbbards_31_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Wctablaalbbards_33_tfbarpremtr ,
                                          java.math.BigDecimal AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                          int AV116Wctablaalbbards_35_tfbaralbpie ,
                                          int AV117Wctablaalbbards_36_tfbaralbpie_to ,
                                          short AV118Wctablaalbbards_37_tftubcod ,
                                          short AV119Wctablaalbbards_38_tftubcod_to ,
                                          int AV120Wctablaalbbards_39_tfbaralbtub ,
                                          int AV121Wctablaalbbards_40_tfbaralbtub_to ,
                                          short AV122Wctablaalbbards_41_tfplascod ,
                                          short AV123Wctablaalbbards_42_tfplascod_to ,
                                          short AV124Wctablaalbbards_43_tfbaralbplas ,
                                          short AV125Wctablaalbbards_44_tfbaralbplas_to ,
                                          String AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                          String AV126Wctablaalbbards_45_tfalbhdrobs ,
                                          int AV128Wctablaalbbards_47_tfalbproval_sels_size ,
                                          String AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                          String AV129Wctablaalbbards_48_tfalbtipent ,
                                          String A1253EmprGuiRem ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          String A12232AlbNomCli ,
                                          String A3153CodCod ,
                                          String A2441AlbHdrObs ,
                                          String A1095AlbTipEnt ,
                                          String AV82Wctablaalbbards_1_emprcod ,
                                          long AV83Wctablaalbbards_2_albprocod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[4];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, EmprGuiRem FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P08F79( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          GXSimpleCollection<String> AV128Wctablaalbbards_47_tfalbproval_sels ,
                                          String AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                          String AV84Wctablaalbbards_3_tfemprguirem ,
                                          int AV86Wctablaalbbards_5_tfbarcod ,
                                          int AV87Wctablaalbbards_6_tfbarcod_to ,
                                          byte AV88Wctablaalbbards_7_tfbarcodreo ,
                                          byte AV89Wctablaalbbards_8_tfbarcodreo_to ,
                                          String AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                          String AV90Wctablaalbbards_9_tfbarcodpar ,
                                          String AV93Wctablaalbbards_12_tfalbser_sel ,
                                          String AV92Wctablaalbbards_11_tfalbser ,
                                          String AV95Wctablaalbbards_14_tfalbserd_sel ,
                                          String AV94Wctablaalbbards_13_tfalbserd ,
                                          String AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                          String AV96Wctablaalbbards_15_tfalbcolnom ,
                                          String AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                          String AV98Wctablaalbbards_17_tfalbnomcli ,
                                          int AV100Wctablaalbbards_19_tfalbcolnum ,
                                          int AV101Wctablaalbbards_20_tfalbcolnum_to ,
                                          String AV103Wctablaalbbards_22_tfcodcod_sel ,
                                          String AV102Wctablaalbbards_21_tfcodcod ,
                                          java.math.BigDecimal AV104Wctablaalbbards_23_tfbaralbkgme ,
                                          java.math.BigDecimal AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV106Wctablaalbbards_25_tfbarprekgm ,
                                          java.math.BigDecimal AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                          short AV108Wctablaalbbards_27_tfalbhdranc ,
                                          short AV109Wctablaalbbards_28_tfalbhdranc_to ,
                                          short AV110Wctablaalbbards_29_tfalbhdrgm2 ,
                                          short AV111Wctablaalbbards_30_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV112Wctablaalbbards_31_tfbaralbmtre ,
                                          java.math.BigDecimal AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                          java.math.BigDecimal AV114Wctablaalbbards_33_tfbarpremtr ,
                                          java.math.BigDecimal AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                          int AV116Wctablaalbbards_35_tfbaralbpie ,
                                          int AV117Wctablaalbbards_36_tfbaralbpie_to ,
                                          short AV118Wctablaalbbards_37_tftubcod ,
                                          short AV119Wctablaalbbards_38_tftubcod_to ,
                                          int AV120Wctablaalbbards_39_tfbaralbtub ,
                                          int AV121Wctablaalbbards_40_tfbaralbtub_to ,
                                          short AV122Wctablaalbbards_41_tfplascod ,
                                          short AV123Wctablaalbbards_42_tfplascod_to ,
                                          short AV124Wctablaalbbards_43_tfbaralbplas ,
                                          short AV125Wctablaalbbards_44_tfbaralbplas_to ,
                                          String AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                          String AV126Wctablaalbbards_45_tfalbhdrobs ,
                                          int AV128Wctablaalbbards_47_tfalbproval_sels_size ,
                                          String AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                          String AV129Wctablaalbbards_48_tfalbtipent ,
                                          String A1253EmprGuiRem ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          String A12232AlbNomCli ,
                                          String A3153CodCod ,
                                          String A2441AlbHdrObs ,
                                          String A1095AlbTipEnt ,
                                          String AV82Wctablaalbbards_1_emprcod ,
                                          long AV83Wctablaalbbards_2_albprocod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[4];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, EmprGuiRem FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P08F710( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           GXSimpleCollection<String> AV128Wctablaalbbards_47_tfalbproval_sels ,
                                           String AV85Wctablaalbbards_4_tfemprguirem_sel ,
                                           String AV84Wctablaalbbards_3_tfemprguirem ,
                                           int AV86Wctablaalbbards_5_tfbarcod ,
                                           int AV87Wctablaalbbards_6_tfbarcod_to ,
                                           byte AV88Wctablaalbbards_7_tfbarcodreo ,
                                           byte AV89Wctablaalbbards_8_tfbarcodreo_to ,
                                           String AV91Wctablaalbbards_10_tfbarcodpar_sel ,
                                           String AV90Wctablaalbbards_9_tfbarcodpar ,
                                           String AV93Wctablaalbbards_12_tfalbser_sel ,
                                           String AV92Wctablaalbbards_11_tfalbser ,
                                           String AV95Wctablaalbbards_14_tfalbserd_sel ,
                                           String AV94Wctablaalbbards_13_tfalbserd ,
                                           String AV97Wctablaalbbards_16_tfalbcolnom_sel ,
                                           String AV96Wctablaalbbards_15_tfalbcolnom ,
                                           String AV99Wctablaalbbards_18_tfalbnomcli_sel ,
                                           String AV98Wctablaalbbards_17_tfalbnomcli ,
                                           int AV100Wctablaalbbards_19_tfalbcolnum ,
                                           int AV101Wctablaalbbards_20_tfalbcolnum_to ,
                                           String AV103Wctablaalbbards_22_tfcodcod_sel ,
                                           String AV102Wctablaalbbards_21_tfcodcod ,
                                           java.math.BigDecimal AV104Wctablaalbbards_23_tfbaralbkgme ,
                                           java.math.BigDecimal AV105Wctablaalbbards_24_tfbaralbkgme_to ,
                                           java.math.BigDecimal AV106Wctablaalbbards_25_tfbarprekgm ,
                                           java.math.BigDecimal AV107Wctablaalbbards_26_tfbarprekgm_to ,
                                           short AV108Wctablaalbbards_27_tfalbhdranc ,
                                           short AV109Wctablaalbbards_28_tfalbhdranc_to ,
                                           short AV110Wctablaalbbards_29_tfalbhdrgm2 ,
                                           short AV111Wctablaalbbards_30_tfalbhdrgm2_to ,
                                           java.math.BigDecimal AV112Wctablaalbbards_31_tfbaralbmtre ,
                                           java.math.BigDecimal AV113Wctablaalbbards_32_tfbaralbmtre_to ,
                                           java.math.BigDecimal AV114Wctablaalbbards_33_tfbarpremtr ,
                                           java.math.BigDecimal AV115Wctablaalbbards_34_tfbarpremtr_to ,
                                           int AV116Wctablaalbbards_35_tfbaralbpie ,
                                           int AV117Wctablaalbbards_36_tfbaralbpie_to ,
                                           short AV118Wctablaalbbards_37_tftubcod ,
                                           short AV119Wctablaalbbards_38_tftubcod_to ,
                                           int AV120Wctablaalbbards_39_tfbaralbtub ,
                                           int AV121Wctablaalbbards_40_tfbaralbtub_to ,
                                           short AV122Wctablaalbbards_41_tfplascod ,
                                           short AV123Wctablaalbbards_42_tfplascod_to ,
                                           short AV124Wctablaalbbards_43_tfbaralbplas ,
                                           short AV125Wctablaalbbards_44_tfbaralbplas_to ,
                                           String AV127Wctablaalbbards_46_tfalbhdrobs_sel ,
                                           String AV126Wctablaalbbards_45_tfalbhdrobs ,
                                           int AV128Wctablaalbbards_47_tfalbproval_sels_size ,
                                           String AV130Wctablaalbbards_49_tfalbtipent_sel ,
                                           String AV129Wctablaalbbards_48_tfalbtipent ,
                                           String A1253EmprGuiRem ,
                                           String A130BarCodPar ,
                                           String A3391AlbSer ,
                                           String A8879AlbSerD ,
                                           String A3392AlbColNom ,
                                           String A12232AlbNomCli ,
                                           String A3153CodCod ,
                                           String A2441AlbHdrObs ,
                                           String A1095AlbTipEnt ,
                                           String AV82Wctablaalbbards_1_emprcod ,
                                           long AV83Wctablaalbbards_2_albprocod ,
                                           String A396EmprCod ,
                                           long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[4];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, EmprGuiRem FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) && ( ! (GXutil.strcmp("", AV84Wctablaalbbards_3_tfemprguirem)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprGuiRem) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Wctablaalbbards_4_tfemprguirem_sel)==0) )
      {
         addWhere(sWhereString, "(EmprGuiRem = ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_P08F72(context, remoteHandle, httpContext, (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[58] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() );
            case 1 :
                  return conditional_P08F73(context, remoteHandle, httpContext, (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[58] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() );
            case 2 :
                  return conditional_P08F74(context, remoteHandle, httpContext, (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[58] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() );
            case 3 :
                  return conditional_P08F75(context, remoteHandle, httpContext, (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[58] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() );
            case 4 :
                  return conditional_P08F76(context, remoteHandle, httpContext, (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[58] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() );
            case 5 :
                  return conditional_P08F77(context, remoteHandle, httpContext, (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[58] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() );
            case 6 :
                  return conditional_P08F78(context, remoteHandle, httpContext, (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[58] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() );
            case 7 :
                  return conditional_P08F79(context, remoteHandle, httpContext, (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[58] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() );
            case 8 :
                  return conditional_P08F710(context, remoteHandle, httpContext, (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[58] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , (String)dynConstraints[74] , ((Number) dynConstraints[75]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08F72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08F73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08F74", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08F75", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08F76", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08F77", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08F78", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08F79", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08F710", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               return;
            case 8 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[5]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[6], 3);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               return;
      }
   }

}

