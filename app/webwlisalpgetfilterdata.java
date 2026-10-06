package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class webwlisalpgetfilterdata extends GXProcedure
{
   public webwlisalpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwlisalpgetfilterdata.class ), "" );
   }

   public webwlisalpgetfilterdata( int remoteHandle ,
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
      webwlisalpgetfilterdata.this.aP5 = new String[] {""};
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
      webwlisalpgetfilterdata.this.AV20DDOName = aP0;
      webwlisalpgetfilterdata.this.AV18SearchTxt = aP1;
      webwlisalpgetfilterdata.this.AV19SearchTxtTo = aP2;
      webwlisalpgetfilterdata.this.aP3 = aP3;
      webwlisalpgetfilterdata.this.aP4 = aP4;
      webwlisalpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_GUIREMCLN") == 0 )
      {
         /* Execute user subroutine: 'LOADGUIREMCLNOPTIONS' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_BARNHDR") == 0 )
      {
         /* Execute user subroutine: 'LOADBARNHDROPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_BARSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_BARSERDSC") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_BARNOMCLI") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV20DDOName), "DDO_BARCOLNOM") == 0 )
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
      AV24OptionsJson = AV23Options.toJSonString(false) ;
      AV27OptionsDescJson = AV26OptionsDesc.toJSonString(false) ;
      AV29OptionIndexesJson = AV28OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue("WebWLISALPGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWLISALPGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV31Session.getValue("WebWLISALPGridState"), null, null);
      }
      AV85GXV1 = 1 ;
      while ( AV85GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV85GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROFCH") == 0 )
         {
            AV70AlbProFch = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV71AlbProFch_To = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "GUIREMCLI") == 0 )
         {
            AV60GuiRemCli = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61GuiRemCli_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSER") == 0 )
         {
            AV64BarSer = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV65BarSer_To = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNOM") == 0 )
         {
            AV66BarColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV67BarColNom_To = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNUM") == 0 )
         {
            AV68BarColNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69BarColNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV10TFGuiRemCli = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV11TFGuiRemCli_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV12TFGuiRemCln = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV13TFGuiRemCln_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV14TFAlbProCod = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV15TFAlbProCod_To = GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV16TFAlbProfch = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV36TFBarFecCli = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV38TFBarNHdr = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV39TFBarNHdr_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV40TFBarSer = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV41TFBarSer_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV42TFBarSerDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV43TFBarSerDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV44TFBarNomCli = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV45TFBarNomCli_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV46TFBarColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV47TFBarColNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV48TFBarColNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFBarColNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV50TFBarKgm = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFBarKgm_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV81TFBarMtr = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV82TFBarMtr_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV52TFBarAlbKgmE = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFBarAlbKgmE_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV54TFBarAlbMtrE = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV55TFBarAlbMtrE_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV56TFBarAlbPie = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarAlbPie_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARANCACA1") == 0 )
         {
            AV58TFBarAncAca1 = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFBarAncAca1_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV72TFTrnCod = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFTrnCod_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV85GXV1 = (int)(AV85GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADGUIREMCLNOPTIONS' Routine */
      returnInSub = false ;
      AV12TFGuiRemCln = AV18SearchTxt ;
      AV13TFGuiRemCln_Sel = "" ;
      AV87Webwlisalpds_1_albprofch = AV70AlbProFch ;
      AV88Webwlisalpds_2_albprofch_to = AV71AlbProFch_To ;
      AV89Webwlisalpds_3_guiremcli = AV60GuiRemCli ;
      AV90Webwlisalpds_4_guiremcli_to = AV61GuiRemCli_To ;
      AV91Webwlisalpds_5_barser = AV64BarSer ;
      AV92Webwlisalpds_6_barser_to = AV65BarSer_To ;
      AV93Webwlisalpds_7_barcolnom = AV66BarColNom ;
      AV94Webwlisalpds_8_barcolnom_to = AV67BarColNom_To ;
      AV95Webwlisalpds_9_barcolnum = AV68BarColNum ;
      AV96Webwlisalpds_10_barcolnum_to = AV69BarColNum_To ;
      AV97Webwlisalpds_11_tfguiremcli = AV10TFGuiRemCli ;
      AV98Webwlisalpds_12_tfguiremcli_to = AV11TFGuiRemCli_To ;
      AV99Webwlisalpds_13_tfguiremcln = AV12TFGuiRemCln ;
      AV100Webwlisalpds_14_tfguiremcln_sel = AV13TFGuiRemCln_Sel ;
      AV101Webwlisalpds_15_tfalbprocod = AV14TFAlbProCod ;
      AV102Webwlisalpds_16_tfalbprocod_to = AV15TFAlbProCod_To ;
      AV103Webwlisalpds_17_tfalbprofch = AV16TFAlbProfch ;
      AV104Webwlisalpds_18_tfbarfeccli = AV36TFBarFecCli ;
      AV105Webwlisalpds_19_tfbarnhdr = AV38TFBarNHdr ;
      AV106Webwlisalpds_20_tfbarnhdr_sel = AV39TFBarNHdr_Sel ;
      AV107Webwlisalpds_21_tfbarser = AV40TFBarSer ;
      AV108Webwlisalpds_22_tfbarser_sel = AV41TFBarSer_Sel ;
      AV109Webwlisalpds_23_tfbarserdsc = AV42TFBarSerDsc ;
      AV110Webwlisalpds_24_tfbarserdsc_sel = AV43TFBarSerDsc_Sel ;
      AV111Webwlisalpds_25_tfbarnomcli = AV44TFBarNomCli ;
      AV112Webwlisalpds_26_tfbarnomcli_sel = AV45TFBarNomCli_Sel ;
      AV113Webwlisalpds_27_tfbarcolnom = AV46TFBarColNom ;
      AV114Webwlisalpds_28_tfbarcolnom_sel = AV47TFBarColNom_Sel ;
      AV115Webwlisalpds_29_tfbarcolnum = AV48TFBarColNum ;
      AV116Webwlisalpds_30_tfbarcolnum_to = AV49TFBarColNum_To ;
      AV117Webwlisalpds_31_tfbarkgm = AV50TFBarKgm ;
      AV118Webwlisalpds_32_tfbarkgm_to = AV51TFBarKgm_To ;
      AV119Webwlisalpds_33_tfbarmtr = AV81TFBarMtr ;
      AV120Webwlisalpds_34_tfbarmtr_to = AV82TFBarMtr_To ;
      AV121Webwlisalpds_35_tfbaralbkgme = AV52TFBarAlbKgmE ;
      AV122Webwlisalpds_36_tfbaralbkgme_to = AV53TFBarAlbKgmE_To ;
      AV123Webwlisalpds_37_tfbaralbmtre = AV54TFBarAlbMtrE ;
      AV124Webwlisalpds_38_tfbaralbmtre_to = AV55TFBarAlbMtrE_To ;
      AV125Webwlisalpds_39_tfbaralbpie = AV56TFBarAlbPie ;
      AV126Webwlisalpds_40_tfbaralbpie_to = AV57TFBarAlbPie_To ;
      AV127Webwlisalpds_41_tfbarancaca1 = AV58TFBarAncAca1 ;
      AV128Webwlisalpds_42_tfbarancaca1_to = AV59TFBarAncAca1_To ;
      AV129Webwlisalpds_43_tftrncod = AV72TFTrnCod ;
      AV130Webwlisalpds_44_tftrncod_to = AV73TFTrnCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV87Webwlisalpds_1_albprofch ,
                                           AV88Webwlisalpds_2_albprofch_to ,
                                           Integer.valueOf(AV89Webwlisalpds_3_guiremcli) ,
                                           Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to) ,
                                           AV91Webwlisalpds_5_barser ,
                                           AV92Webwlisalpds_6_barser_to ,
                                           AV93Webwlisalpds_7_barcolnom ,
                                           AV94Webwlisalpds_8_barcolnom_to ,
                                           Integer.valueOf(AV95Webwlisalpds_9_barcolnum) ,
                                           Integer.valueOf(AV96Webwlisalpds_10_barcolnum_to) ,
                                           Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli) ,
                                           Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to) ,
                                           AV100Webwlisalpds_14_tfguiremcln_sel ,
                                           AV99Webwlisalpds_13_tfguiremcln ,
                                           Long.valueOf(AV101Webwlisalpds_15_tfalbprocod) ,
                                           Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to) ,
                                           AV103Webwlisalpds_17_tfalbprofch ,
                                           AV104Webwlisalpds_18_tfbarfeccli ,
                                           AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                           AV105Webwlisalpds_19_tfbarnhdr ,
                                           AV108Webwlisalpds_22_tfbarser_sel ,
                                           AV107Webwlisalpds_21_tfbarser ,
                                           AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                           AV109Webwlisalpds_23_tfbarserdsc ,
                                           AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                           AV111Webwlisalpds_25_tfbarnomcli ,
                                           AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                           AV113Webwlisalpds_27_tfbarcolnom ,
                                           Integer.valueOf(AV115Webwlisalpds_29_tfbarcolnum) ,
                                           Integer.valueOf(AV116Webwlisalpds_30_tfbarcolnum_to) ,
                                           AV117Webwlisalpds_31_tfbarkgm ,
                                           AV118Webwlisalpds_32_tfbarkgm_to ,
                                           AV119Webwlisalpds_33_tfbarmtr ,
                                           AV120Webwlisalpds_34_tfbarmtr_to ,
                                           AV121Webwlisalpds_35_tfbaralbkgme ,
                                           AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                           AV123Webwlisalpds_37_tfbaralbmtre ,
                                           AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                           Integer.valueOf(AV125Webwlisalpds_39_tfbaralbpie) ,
                                           Integer.valueOf(AV126Webwlisalpds_40_tfbaralbpie_to) ,
                                           Short.valueOf(AV127Webwlisalpds_41_tfbarancaca1) ,
                                           Short.valueOf(AV128Webwlisalpds_42_tfbarancaca1_to) ,
                                           Short.valueOf(AV129Webwlisalpds_43_tftrncod) ,
                                           Short.valueOf(AV130Webwlisalpds_44_tftrncod_to) ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1244GuiRemCln ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A840TrnCod) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT
                                           }
      });
      lV99Webwlisalpds_13_tfguiremcln = GXutil.padr( GXutil.rtrim( AV99Webwlisalpds_13_tfguiremcln), 30, "%") ;
      /* Using cursor P08FI2 */
      pr_default.execute(0, new Object[] {AV87Webwlisalpds_1_albprofch, AV88Webwlisalpds_2_albprofch_to, Integer.valueOf(AV89Webwlisalpds_3_guiremcli), Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to), Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli), Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to), lV99Webwlisalpds_13_tfguiremcln, AV100Webwlisalpds_14_tfguiremcln_sel, Long.valueOf(AV101Webwlisalpds_15_tfalbprocod), Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to), AV103Webwlisalpds_17_tfalbprofch, Short.valueOf(AV129Webwlisalpds_43_tftrncod), Short.valueOf(AV130Webwlisalpds_44_tftrncod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8FI2 = false ;
         A1253EmprGuiRem = P08FI2_A1253EmprGuiRem[0] ;
         A396EmprCod = P08FI2_A396EmprCod[0] ;
         A1244GuiRemCln = P08FI2_A1244GuiRemCln[0] ;
         A840TrnCod = P08FI2_A840TrnCod[0] ;
         A30AlbProCod = P08FI2_A30AlbProCod[0] ;
         A1243GuiRemCli = P08FI2_A1243GuiRemCli[0] ;
         A34AlbProfch = P08FI2_A34AlbProfch[0] ;
         A1244GuiRemCln = P08FI2_A1244GuiRemCln[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08FI2_A1244GuiRemCln[0], A1244GuiRemCln) == 0 ) )
         {
            brk8FI2 = false ;
            A1253EmprGuiRem = P08FI2_A1253EmprGuiRem[0] ;
            A396EmprCod = P08FI2_A396EmprCod[0] ;
            A30AlbProCod = P08FI2_A30AlbProCod[0] ;
            A1243GuiRemCli = P08FI2_A1243GuiRemCli[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8FI2 = true ;
            pr_default.readNext(0);
         }
         if ( ! (GXutil.strcmp("", A1244GuiRemCln)==0) )
         {
            AV22Option = A1244GuiRemCln ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8FI2 )
         {
            brk8FI2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV38TFBarNHdr = AV18SearchTxt ;
      AV39TFBarNHdr_Sel = "" ;
      AV87Webwlisalpds_1_albprofch = AV70AlbProFch ;
      AV88Webwlisalpds_2_albprofch_to = AV71AlbProFch_To ;
      AV89Webwlisalpds_3_guiremcli = AV60GuiRemCli ;
      AV90Webwlisalpds_4_guiremcli_to = AV61GuiRemCli_To ;
      AV91Webwlisalpds_5_barser = AV64BarSer ;
      AV92Webwlisalpds_6_barser_to = AV65BarSer_To ;
      AV93Webwlisalpds_7_barcolnom = AV66BarColNom ;
      AV94Webwlisalpds_8_barcolnom_to = AV67BarColNom_To ;
      AV95Webwlisalpds_9_barcolnum = AV68BarColNum ;
      AV96Webwlisalpds_10_barcolnum_to = AV69BarColNum_To ;
      AV97Webwlisalpds_11_tfguiremcli = AV10TFGuiRemCli ;
      AV98Webwlisalpds_12_tfguiremcli_to = AV11TFGuiRemCli_To ;
      AV99Webwlisalpds_13_tfguiremcln = AV12TFGuiRemCln ;
      AV100Webwlisalpds_14_tfguiremcln_sel = AV13TFGuiRemCln_Sel ;
      AV101Webwlisalpds_15_tfalbprocod = AV14TFAlbProCod ;
      AV102Webwlisalpds_16_tfalbprocod_to = AV15TFAlbProCod_To ;
      AV103Webwlisalpds_17_tfalbprofch = AV16TFAlbProfch ;
      AV104Webwlisalpds_18_tfbarfeccli = AV36TFBarFecCli ;
      AV105Webwlisalpds_19_tfbarnhdr = AV38TFBarNHdr ;
      AV106Webwlisalpds_20_tfbarnhdr_sel = AV39TFBarNHdr_Sel ;
      AV107Webwlisalpds_21_tfbarser = AV40TFBarSer ;
      AV108Webwlisalpds_22_tfbarser_sel = AV41TFBarSer_Sel ;
      AV109Webwlisalpds_23_tfbarserdsc = AV42TFBarSerDsc ;
      AV110Webwlisalpds_24_tfbarserdsc_sel = AV43TFBarSerDsc_Sel ;
      AV111Webwlisalpds_25_tfbarnomcli = AV44TFBarNomCli ;
      AV112Webwlisalpds_26_tfbarnomcli_sel = AV45TFBarNomCli_Sel ;
      AV113Webwlisalpds_27_tfbarcolnom = AV46TFBarColNom ;
      AV114Webwlisalpds_28_tfbarcolnom_sel = AV47TFBarColNom_Sel ;
      AV115Webwlisalpds_29_tfbarcolnum = AV48TFBarColNum ;
      AV116Webwlisalpds_30_tfbarcolnum_to = AV49TFBarColNum_To ;
      AV117Webwlisalpds_31_tfbarkgm = AV50TFBarKgm ;
      AV118Webwlisalpds_32_tfbarkgm_to = AV51TFBarKgm_To ;
      AV119Webwlisalpds_33_tfbarmtr = AV81TFBarMtr ;
      AV120Webwlisalpds_34_tfbarmtr_to = AV82TFBarMtr_To ;
      AV121Webwlisalpds_35_tfbaralbkgme = AV52TFBarAlbKgmE ;
      AV122Webwlisalpds_36_tfbaralbkgme_to = AV53TFBarAlbKgmE_To ;
      AV123Webwlisalpds_37_tfbaralbmtre = AV54TFBarAlbMtrE ;
      AV124Webwlisalpds_38_tfbaralbmtre_to = AV55TFBarAlbMtrE_To ;
      AV125Webwlisalpds_39_tfbaralbpie = AV56TFBarAlbPie ;
      AV126Webwlisalpds_40_tfbaralbpie_to = AV57TFBarAlbPie_To ;
      AV127Webwlisalpds_41_tfbarancaca1 = AV58TFBarAncAca1 ;
      AV128Webwlisalpds_42_tfbarancaca1_to = AV59TFBarAncAca1_To ;
      AV129Webwlisalpds_43_tftrncod = AV72TFTrnCod ;
      AV130Webwlisalpds_44_tftrncod_to = AV73TFTrnCod_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV87Webwlisalpds_1_albprofch ,
                                           AV88Webwlisalpds_2_albprofch_to ,
                                           Integer.valueOf(AV89Webwlisalpds_3_guiremcli) ,
                                           Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to) ,
                                           AV91Webwlisalpds_5_barser ,
                                           AV92Webwlisalpds_6_barser_to ,
                                           AV93Webwlisalpds_7_barcolnom ,
                                           AV94Webwlisalpds_8_barcolnom_to ,
                                           Integer.valueOf(AV95Webwlisalpds_9_barcolnum) ,
                                           Integer.valueOf(AV96Webwlisalpds_10_barcolnum_to) ,
                                           Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli) ,
                                           Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to) ,
                                           AV100Webwlisalpds_14_tfguiremcln_sel ,
                                           AV99Webwlisalpds_13_tfguiremcln ,
                                           Long.valueOf(AV101Webwlisalpds_15_tfalbprocod) ,
                                           Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to) ,
                                           AV103Webwlisalpds_17_tfalbprofch ,
                                           AV104Webwlisalpds_18_tfbarfeccli ,
                                           AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                           AV105Webwlisalpds_19_tfbarnhdr ,
                                           AV108Webwlisalpds_22_tfbarser_sel ,
                                           AV107Webwlisalpds_21_tfbarser ,
                                           AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                           AV109Webwlisalpds_23_tfbarserdsc ,
                                           AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                           AV111Webwlisalpds_25_tfbarnomcli ,
                                           AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                           AV113Webwlisalpds_27_tfbarcolnom ,
                                           Integer.valueOf(AV115Webwlisalpds_29_tfbarcolnum) ,
                                           Integer.valueOf(AV116Webwlisalpds_30_tfbarcolnum_to) ,
                                           AV117Webwlisalpds_31_tfbarkgm ,
                                           AV118Webwlisalpds_32_tfbarkgm_to ,
                                           AV119Webwlisalpds_33_tfbarmtr ,
                                           AV120Webwlisalpds_34_tfbarmtr_to ,
                                           AV121Webwlisalpds_35_tfbaralbkgme ,
                                           AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                           AV123Webwlisalpds_37_tfbaralbmtre ,
                                           AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                           Integer.valueOf(AV125Webwlisalpds_39_tfbaralbpie) ,
                                           Integer.valueOf(AV126Webwlisalpds_40_tfbaralbpie_to) ,
                                           Short.valueOf(AV127Webwlisalpds_41_tfbarancaca1) ,
                                           Short.valueOf(AV128Webwlisalpds_42_tfbarancaca1_to) ,
                                           Short.valueOf(AV129Webwlisalpds_43_tftrncod) ,
                                           Short.valueOf(AV130Webwlisalpds_44_tftrncod_to) ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1244GuiRemCln ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A840TrnCod) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT
                                           }
      });
      lV99Webwlisalpds_13_tfguiremcln = GXutil.padr( GXutil.rtrim( AV99Webwlisalpds_13_tfguiremcln), 30, "%") ;
      /* Using cursor P08FI3 */
      pr_default.execute(1, new Object[] {AV87Webwlisalpds_1_albprofch, AV88Webwlisalpds_2_albprofch_to, Integer.valueOf(AV89Webwlisalpds_3_guiremcli), Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to), Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli), Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to), lV99Webwlisalpds_13_tfguiremcln, AV100Webwlisalpds_14_tfguiremcln_sel, Long.valueOf(AV101Webwlisalpds_15_tfalbprocod), Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to), AV103Webwlisalpds_17_tfalbprofch, Short.valueOf(AV129Webwlisalpds_43_tftrncod), Short.valueOf(AV130Webwlisalpds_44_tftrncod_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1253EmprGuiRem = P08FI3_A1253EmprGuiRem[0] ;
         A396EmprCod = P08FI3_A396EmprCod[0] ;
         A840TrnCod = P08FI3_A840TrnCod[0] ;
         A30AlbProCod = P08FI3_A30AlbProCod[0] ;
         A1244GuiRemCln = P08FI3_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08FI3_A1243GuiRemCli[0] ;
         A34AlbProfch = P08FI3_A34AlbProfch[0] ;
         A1244GuiRemCln = P08FI3_A1244GuiRemCln[0] ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV22Option = A13696BarNHdr ;
            AV21InsertIndex = 1 ;
            while ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) < 0 ) )
            {
               AV21InsertIndex = (int)(AV21InsertIndex+1) ;
            }
            if ( ( AV21InsertIndex <= AV23Options.size() ) && ( GXutil.strcmp((String)AV23Options.elementAt(-1+AV21InsertIndex), AV22Option) == 0 ) )
            {
               AV30count = GXutil.lval( (String)AV28OptionIndexes.elementAt(-1+AV21InsertIndex)) ;
               AV30count = (long)(AV30count+1) ;
               AV28OptionIndexes.removeItem(AV21InsertIndex);
               AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), AV21InsertIndex);
            }
            else
            {
               AV23Options.add(AV22Option, AV21InsertIndex);
               AV28OptionIndexes.add("1", AV21InsertIndex);
            }
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADBARSEROPTIONS' Routine */
      returnInSub = false ;
      AV40TFBarSer = AV18SearchTxt ;
      AV41TFBarSer_Sel = "" ;
      AV87Webwlisalpds_1_albprofch = AV70AlbProFch ;
      AV88Webwlisalpds_2_albprofch_to = AV71AlbProFch_To ;
      AV89Webwlisalpds_3_guiremcli = AV60GuiRemCli ;
      AV90Webwlisalpds_4_guiremcli_to = AV61GuiRemCli_To ;
      AV91Webwlisalpds_5_barser = AV64BarSer ;
      AV92Webwlisalpds_6_barser_to = AV65BarSer_To ;
      AV93Webwlisalpds_7_barcolnom = AV66BarColNom ;
      AV94Webwlisalpds_8_barcolnom_to = AV67BarColNom_To ;
      AV95Webwlisalpds_9_barcolnum = AV68BarColNum ;
      AV96Webwlisalpds_10_barcolnum_to = AV69BarColNum_To ;
      AV97Webwlisalpds_11_tfguiremcli = AV10TFGuiRemCli ;
      AV98Webwlisalpds_12_tfguiremcli_to = AV11TFGuiRemCli_To ;
      AV99Webwlisalpds_13_tfguiremcln = AV12TFGuiRemCln ;
      AV100Webwlisalpds_14_tfguiremcln_sel = AV13TFGuiRemCln_Sel ;
      AV101Webwlisalpds_15_tfalbprocod = AV14TFAlbProCod ;
      AV102Webwlisalpds_16_tfalbprocod_to = AV15TFAlbProCod_To ;
      AV103Webwlisalpds_17_tfalbprofch = AV16TFAlbProfch ;
      AV104Webwlisalpds_18_tfbarfeccli = AV36TFBarFecCli ;
      AV105Webwlisalpds_19_tfbarnhdr = AV38TFBarNHdr ;
      AV106Webwlisalpds_20_tfbarnhdr_sel = AV39TFBarNHdr_Sel ;
      AV107Webwlisalpds_21_tfbarser = AV40TFBarSer ;
      AV108Webwlisalpds_22_tfbarser_sel = AV41TFBarSer_Sel ;
      AV109Webwlisalpds_23_tfbarserdsc = AV42TFBarSerDsc ;
      AV110Webwlisalpds_24_tfbarserdsc_sel = AV43TFBarSerDsc_Sel ;
      AV111Webwlisalpds_25_tfbarnomcli = AV44TFBarNomCli ;
      AV112Webwlisalpds_26_tfbarnomcli_sel = AV45TFBarNomCli_Sel ;
      AV113Webwlisalpds_27_tfbarcolnom = AV46TFBarColNom ;
      AV114Webwlisalpds_28_tfbarcolnom_sel = AV47TFBarColNom_Sel ;
      AV115Webwlisalpds_29_tfbarcolnum = AV48TFBarColNum ;
      AV116Webwlisalpds_30_tfbarcolnum_to = AV49TFBarColNum_To ;
      AV117Webwlisalpds_31_tfbarkgm = AV50TFBarKgm ;
      AV118Webwlisalpds_32_tfbarkgm_to = AV51TFBarKgm_To ;
      AV119Webwlisalpds_33_tfbarmtr = AV81TFBarMtr ;
      AV120Webwlisalpds_34_tfbarmtr_to = AV82TFBarMtr_To ;
      AV121Webwlisalpds_35_tfbaralbkgme = AV52TFBarAlbKgmE ;
      AV122Webwlisalpds_36_tfbaralbkgme_to = AV53TFBarAlbKgmE_To ;
      AV123Webwlisalpds_37_tfbaralbmtre = AV54TFBarAlbMtrE ;
      AV124Webwlisalpds_38_tfbaralbmtre_to = AV55TFBarAlbMtrE_To ;
      AV125Webwlisalpds_39_tfbaralbpie = AV56TFBarAlbPie ;
      AV126Webwlisalpds_40_tfbaralbpie_to = AV57TFBarAlbPie_To ;
      AV127Webwlisalpds_41_tfbarancaca1 = AV58TFBarAncAca1 ;
      AV128Webwlisalpds_42_tfbarancaca1_to = AV59TFBarAncAca1_To ;
      AV129Webwlisalpds_43_tftrncod = AV72TFTrnCod ;
      AV130Webwlisalpds_44_tftrncod_to = AV73TFTrnCod_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV87Webwlisalpds_1_albprofch ,
                                           AV88Webwlisalpds_2_albprofch_to ,
                                           Integer.valueOf(AV89Webwlisalpds_3_guiremcli) ,
                                           Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to) ,
                                           AV91Webwlisalpds_5_barser ,
                                           AV92Webwlisalpds_6_barser_to ,
                                           AV93Webwlisalpds_7_barcolnom ,
                                           AV94Webwlisalpds_8_barcolnom_to ,
                                           Integer.valueOf(AV95Webwlisalpds_9_barcolnum) ,
                                           Integer.valueOf(AV96Webwlisalpds_10_barcolnum_to) ,
                                           Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli) ,
                                           Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to) ,
                                           AV100Webwlisalpds_14_tfguiremcln_sel ,
                                           AV99Webwlisalpds_13_tfguiremcln ,
                                           Long.valueOf(AV101Webwlisalpds_15_tfalbprocod) ,
                                           Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to) ,
                                           AV103Webwlisalpds_17_tfalbprofch ,
                                           AV104Webwlisalpds_18_tfbarfeccli ,
                                           AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                           AV105Webwlisalpds_19_tfbarnhdr ,
                                           AV108Webwlisalpds_22_tfbarser_sel ,
                                           AV107Webwlisalpds_21_tfbarser ,
                                           AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                           AV109Webwlisalpds_23_tfbarserdsc ,
                                           AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                           AV111Webwlisalpds_25_tfbarnomcli ,
                                           AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                           AV113Webwlisalpds_27_tfbarcolnom ,
                                           Integer.valueOf(AV115Webwlisalpds_29_tfbarcolnum) ,
                                           Integer.valueOf(AV116Webwlisalpds_30_tfbarcolnum_to) ,
                                           AV117Webwlisalpds_31_tfbarkgm ,
                                           AV118Webwlisalpds_32_tfbarkgm_to ,
                                           AV119Webwlisalpds_33_tfbarmtr ,
                                           AV120Webwlisalpds_34_tfbarmtr_to ,
                                           AV121Webwlisalpds_35_tfbaralbkgme ,
                                           AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                           AV123Webwlisalpds_37_tfbaralbmtre ,
                                           AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                           Integer.valueOf(AV125Webwlisalpds_39_tfbaralbpie) ,
                                           Integer.valueOf(AV126Webwlisalpds_40_tfbaralbpie_to) ,
                                           Short.valueOf(AV127Webwlisalpds_41_tfbarancaca1) ,
                                           Short.valueOf(AV128Webwlisalpds_42_tfbarancaca1_to) ,
                                           Short.valueOf(AV129Webwlisalpds_43_tftrncod) ,
                                           Short.valueOf(AV130Webwlisalpds_44_tftrncod_to) ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1244GuiRemCln ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A840TrnCod) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT
                                           }
      });
      lV99Webwlisalpds_13_tfguiremcln = GXutil.padr( GXutil.rtrim( AV99Webwlisalpds_13_tfguiremcln), 30, "%") ;
      /* Using cursor P08FI4 */
      pr_default.execute(2, new Object[] {AV87Webwlisalpds_1_albprofch, AV88Webwlisalpds_2_albprofch_to, Integer.valueOf(AV89Webwlisalpds_3_guiremcli), Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to), Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli), Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to), lV99Webwlisalpds_13_tfguiremcln, AV100Webwlisalpds_14_tfguiremcln_sel, Long.valueOf(AV101Webwlisalpds_15_tfalbprocod), Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to), AV103Webwlisalpds_17_tfalbprofch, Short.valueOf(AV129Webwlisalpds_43_tftrncod), Short.valueOf(AV130Webwlisalpds_44_tftrncod_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk8FI5 = false ;
         A1253EmprGuiRem = P08FI4_A1253EmprGuiRem[0] ;
         A396EmprCod = P08FI4_A396EmprCod[0] ;
         A840TrnCod = P08FI4_A840TrnCod[0] ;
         A30AlbProCod = P08FI4_A30AlbProCod[0] ;
         A1244GuiRemCln = P08FI4_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08FI4_A1243GuiRemCli[0] ;
         A34AlbProfch = P08FI4_A34AlbProfch[0] ;
         A1244GuiRemCln = P08FI4_A1244GuiRemCln[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(2) != 101) )
         {
            brk8FI5 = false ;
            A396EmprCod = P08FI4_A396EmprCod[0] ;
            A30AlbProCod = P08FI4_A30AlbProCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8FI5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A212BarSer)==0) )
         {
            AV22Option = A212BarSer ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8FI5 )
         {
            brk8FI5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADBARSERDSCOPTIONS' Routine */
      returnInSub = false ;
      AV42TFBarSerDsc = AV18SearchTxt ;
      AV43TFBarSerDsc_Sel = "" ;
      AV87Webwlisalpds_1_albprofch = AV70AlbProFch ;
      AV88Webwlisalpds_2_albprofch_to = AV71AlbProFch_To ;
      AV89Webwlisalpds_3_guiremcli = AV60GuiRemCli ;
      AV90Webwlisalpds_4_guiremcli_to = AV61GuiRemCli_To ;
      AV91Webwlisalpds_5_barser = AV64BarSer ;
      AV92Webwlisalpds_6_barser_to = AV65BarSer_To ;
      AV93Webwlisalpds_7_barcolnom = AV66BarColNom ;
      AV94Webwlisalpds_8_barcolnom_to = AV67BarColNom_To ;
      AV95Webwlisalpds_9_barcolnum = AV68BarColNum ;
      AV96Webwlisalpds_10_barcolnum_to = AV69BarColNum_To ;
      AV97Webwlisalpds_11_tfguiremcli = AV10TFGuiRemCli ;
      AV98Webwlisalpds_12_tfguiremcli_to = AV11TFGuiRemCli_To ;
      AV99Webwlisalpds_13_tfguiremcln = AV12TFGuiRemCln ;
      AV100Webwlisalpds_14_tfguiremcln_sel = AV13TFGuiRemCln_Sel ;
      AV101Webwlisalpds_15_tfalbprocod = AV14TFAlbProCod ;
      AV102Webwlisalpds_16_tfalbprocod_to = AV15TFAlbProCod_To ;
      AV103Webwlisalpds_17_tfalbprofch = AV16TFAlbProfch ;
      AV104Webwlisalpds_18_tfbarfeccli = AV36TFBarFecCli ;
      AV105Webwlisalpds_19_tfbarnhdr = AV38TFBarNHdr ;
      AV106Webwlisalpds_20_tfbarnhdr_sel = AV39TFBarNHdr_Sel ;
      AV107Webwlisalpds_21_tfbarser = AV40TFBarSer ;
      AV108Webwlisalpds_22_tfbarser_sel = AV41TFBarSer_Sel ;
      AV109Webwlisalpds_23_tfbarserdsc = AV42TFBarSerDsc ;
      AV110Webwlisalpds_24_tfbarserdsc_sel = AV43TFBarSerDsc_Sel ;
      AV111Webwlisalpds_25_tfbarnomcli = AV44TFBarNomCli ;
      AV112Webwlisalpds_26_tfbarnomcli_sel = AV45TFBarNomCli_Sel ;
      AV113Webwlisalpds_27_tfbarcolnom = AV46TFBarColNom ;
      AV114Webwlisalpds_28_tfbarcolnom_sel = AV47TFBarColNom_Sel ;
      AV115Webwlisalpds_29_tfbarcolnum = AV48TFBarColNum ;
      AV116Webwlisalpds_30_tfbarcolnum_to = AV49TFBarColNum_To ;
      AV117Webwlisalpds_31_tfbarkgm = AV50TFBarKgm ;
      AV118Webwlisalpds_32_tfbarkgm_to = AV51TFBarKgm_To ;
      AV119Webwlisalpds_33_tfbarmtr = AV81TFBarMtr ;
      AV120Webwlisalpds_34_tfbarmtr_to = AV82TFBarMtr_To ;
      AV121Webwlisalpds_35_tfbaralbkgme = AV52TFBarAlbKgmE ;
      AV122Webwlisalpds_36_tfbaralbkgme_to = AV53TFBarAlbKgmE_To ;
      AV123Webwlisalpds_37_tfbaralbmtre = AV54TFBarAlbMtrE ;
      AV124Webwlisalpds_38_tfbaralbmtre_to = AV55TFBarAlbMtrE_To ;
      AV125Webwlisalpds_39_tfbaralbpie = AV56TFBarAlbPie ;
      AV126Webwlisalpds_40_tfbaralbpie_to = AV57TFBarAlbPie_To ;
      AV127Webwlisalpds_41_tfbarancaca1 = AV58TFBarAncAca1 ;
      AV128Webwlisalpds_42_tfbarancaca1_to = AV59TFBarAncAca1_To ;
      AV129Webwlisalpds_43_tftrncod = AV72TFTrnCod ;
      AV130Webwlisalpds_44_tftrncod_to = AV73TFTrnCod_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV87Webwlisalpds_1_albprofch ,
                                           AV88Webwlisalpds_2_albprofch_to ,
                                           Integer.valueOf(AV89Webwlisalpds_3_guiremcli) ,
                                           Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to) ,
                                           AV91Webwlisalpds_5_barser ,
                                           AV92Webwlisalpds_6_barser_to ,
                                           AV93Webwlisalpds_7_barcolnom ,
                                           AV94Webwlisalpds_8_barcolnom_to ,
                                           Integer.valueOf(AV95Webwlisalpds_9_barcolnum) ,
                                           Integer.valueOf(AV96Webwlisalpds_10_barcolnum_to) ,
                                           Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli) ,
                                           Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to) ,
                                           AV100Webwlisalpds_14_tfguiremcln_sel ,
                                           AV99Webwlisalpds_13_tfguiremcln ,
                                           Long.valueOf(AV101Webwlisalpds_15_tfalbprocod) ,
                                           Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to) ,
                                           AV103Webwlisalpds_17_tfalbprofch ,
                                           AV104Webwlisalpds_18_tfbarfeccli ,
                                           AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                           AV105Webwlisalpds_19_tfbarnhdr ,
                                           AV108Webwlisalpds_22_tfbarser_sel ,
                                           AV107Webwlisalpds_21_tfbarser ,
                                           AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                           AV109Webwlisalpds_23_tfbarserdsc ,
                                           AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                           AV111Webwlisalpds_25_tfbarnomcli ,
                                           AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                           AV113Webwlisalpds_27_tfbarcolnom ,
                                           Integer.valueOf(AV115Webwlisalpds_29_tfbarcolnum) ,
                                           Integer.valueOf(AV116Webwlisalpds_30_tfbarcolnum_to) ,
                                           AV117Webwlisalpds_31_tfbarkgm ,
                                           AV118Webwlisalpds_32_tfbarkgm_to ,
                                           AV119Webwlisalpds_33_tfbarmtr ,
                                           AV120Webwlisalpds_34_tfbarmtr_to ,
                                           AV121Webwlisalpds_35_tfbaralbkgme ,
                                           AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                           AV123Webwlisalpds_37_tfbaralbmtre ,
                                           AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                           Integer.valueOf(AV125Webwlisalpds_39_tfbaralbpie) ,
                                           Integer.valueOf(AV126Webwlisalpds_40_tfbaralbpie_to) ,
                                           Short.valueOf(AV127Webwlisalpds_41_tfbarancaca1) ,
                                           Short.valueOf(AV128Webwlisalpds_42_tfbarancaca1_to) ,
                                           Short.valueOf(AV129Webwlisalpds_43_tftrncod) ,
                                           Short.valueOf(AV130Webwlisalpds_44_tftrncod_to) ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1244GuiRemCln ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A840TrnCod) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT
                                           }
      });
      lV99Webwlisalpds_13_tfguiremcln = GXutil.padr( GXutil.rtrim( AV99Webwlisalpds_13_tfguiremcln), 30, "%") ;
      /* Using cursor P08FI5 */
      pr_default.execute(3, new Object[] {AV87Webwlisalpds_1_albprofch, AV88Webwlisalpds_2_albprofch_to, Integer.valueOf(AV89Webwlisalpds_3_guiremcli), Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to), Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli), Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to), lV99Webwlisalpds_13_tfguiremcln, AV100Webwlisalpds_14_tfguiremcln_sel, Long.valueOf(AV101Webwlisalpds_15_tfalbprocod), Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to), AV103Webwlisalpds_17_tfalbprofch, Short.valueOf(AV129Webwlisalpds_43_tftrncod), Short.valueOf(AV130Webwlisalpds_44_tftrncod_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk8FI7 = false ;
         A1253EmprGuiRem = P08FI5_A1253EmprGuiRem[0] ;
         A396EmprCod = P08FI5_A396EmprCod[0] ;
         A840TrnCod = P08FI5_A840TrnCod[0] ;
         A30AlbProCod = P08FI5_A30AlbProCod[0] ;
         A1244GuiRemCln = P08FI5_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08FI5_A1243GuiRemCli[0] ;
         A34AlbProfch = P08FI5_A34AlbProfch[0] ;
         A1244GuiRemCln = P08FI5_A1244GuiRemCln[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(3) != 101) )
         {
            brk8FI7 = false ;
            A396EmprCod = P08FI5_A396EmprCod[0] ;
            A30AlbProCod = P08FI5_A30AlbProCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8FI7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A1652BarSerDsc)==0) )
         {
            AV22Option = A1652BarSerDsc ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8FI7 )
         {
            brk8FI7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADBARNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV44TFBarNomCli = AV18SearchTxt ;
      AV45TFBarNomCli_Sel = "" ;
      AV87Webwlisalpds_1_albprofch = AV70AlbProFch ;
      AV88Webwlisalpds_2_albprofch_to = AV71AlbProFch_To ;
      AV89Webwlisalpds_3_guiremcli = AV60GuiRemCli ;
      AV90Webwlisalpds_4_guiremcli_to = AV61GuiRemCli_To ;
      AV91Webwlisalpds_5_barser = AV64BarSer ;
      AV92Webwlisalpds_6_barser_to = AV65BarSer_To ;
      AV93Webwlisalpds_7_barcolnom = AV66BarColNom ;
      AV94Webwlisalpds_8_barcolnom_to = AV67BarColNom_To ;
      AV95Webwlisalpds_9_barcolnum = AV68BarColNum ;
      AV96Webwlisalpds_10_barcolnum_to = AV69BarColNum_To ;
      AV97Webwlisalpds_11_tfguiremcli = AV10TFGuiRemCli ;
      AV98Webwlisalpds_12_tfguiremcli_to = AV11TFGuiRemCli_To ;
      AV99Webwlisalpds_13_tfguiremcln = AV12TFGuiRemCln ;
      AV100Webwlisalpds_14_tfguiremcln_sel = AV13TFGuiRemCln_Sel ;
      AV101Webwlisalpds_15_tfalbprocod = AV14TFAlbProCod ;
      AV102Webwlisalpds_16_tfalbprocod_to = AV15TFAlbProCod_To ;
      AV103Webwlisalpds_17_tfalbprofch = AV16TFAlbProfch ;
      AV104Webwlisalpds_18_tfbarfeccli = AV36TFBarFecCli ;
      AV105Webwlisalpds_19_tfbarnhdr = AV38TFBarNHdr ;
      AV106Webwlisalpds_20_tfbarnhdr_sel = AV39TFBarNHdr_Sel ;
      AV107Webwlisalpds_21_tfbarser = AV40TFBarSer ;
      AV108Webwlisalpds_22_tfbarser_sel = AV41TFBarSer_Sel ;
      AV109Webwlisalpds_23_tfbarserdsc = AV42TFBarSerDsc ;
      AV110Webwlisalpds_24_tfbarserdsc_sel = AV43TFBarSerDsc_Sel ;
      AV111Webwlisalpds_25_tfbarnomcli = AV44TFBarNomCli ;
      AV112Webwlisalpds_26_tfbarnomcli_sel = AV45TFBarNomCli_Sel ;
      AV113Webwlisalpds_27_tfbarcolnom = AV46TFBarColNom ;
      AV114Webwlisalpds_28_tfbarcolnom_sel = AV47TFBarColNom_Sel ;
      AV115Webwlisalpds_29_tfbarcolnum = AV48TFBarColNum ;
      AV116Webwlisalpds_30_tfbarcolnum_to = AV49TFBarColNum_To ;
      AV117Webwlisalpds_31_tfbarkgm = AV50TFBarKgm ;
      AV118Webwlisalpds_32_tfbarkgm_to = AV51TFBarKgm_To ;
      AV119Webwlisalpds_33_tfbarmtr = AV81TFBarMtr ;
      AV120Webwlisalpds_34_tfbarmtr_to = AV82TFBarMtr_To ;
      AV121Webwlisalpds_35_tfbaralbkgme = AV52TFBarAlbKgmE ;
      AV122Webwlisalpds_36_tfbaralbkgme_to = AV53TFBarAlbKgmE_To ;
      AV123Webwlisalpds_37_tfbaralbmtre = AV54TFBarAlbMtrE ;
      AV124Webwlisalpds_38_tfbaralbmtre_to = AV55TFBarAlbMtrE_To ;
      AV125Webwlisalpds_39_tfbaralbpie = AV56TFBarAlbPie ;
      AV126Webwlisalpds_40_tfbaralbpie_to = AV57TFBarAlbPie_To ;
      AV127Webwlisalpds_41_tfbarancaca1 = AV58TFBarAncAca1 ;
      AV128Webwlisalpds_42_tfbarancaca1_to = AV59TFBarAncAca1_To ;
      AV129Webwlisalpds_43_tftrncod = AV72TFTrnCod ;
      AV130Webwlisalpds_44_tftrncod_to = AV73TFTrnCod_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV87Webwlisalpds_1_albprofch ,
                                           AV88Webwlisalpds_2_albprofch_to ,
                                           Integer.valueOf(AV89Webwlisalpds_3_guiremcli) ,
                                           Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to) ,
                                           AV91Webwlisalpds_5_barser ,
                                           AV92Webwlisalpds_6_barser_to ,
                                           AV93Webwlisalpds_7_barcolnom ,
                                           AV94Webwlisalpds_8_barcolnom_to ,
                                           Integer.valueOf(AV95Webwlisalpds_9_barcolnum) ,
                                           Integer.valueOf(AV96Webwlisalpds_10_barcolnum_to) ,
                                           Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli) ,
                                           Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to) ,
                                           AV100Webwlisalpds_14_tfguiremcln_sel ,
                                           AV99Webwlisalpds_13_tfguiremcln ,
                                           Long.valueOf(AV101Webwlisalpds_15_tfalbprocod) ,
                                           Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to) ,
                                           AV103Webwlisalpds_17_tfalbprofch ,
                                           AV104Webwlisalpds_18_tfbarfeccli ,
                                           AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                           AV105Webwlisalpds_19_tfbarnhdr ,
                                           AV108Webwlisalpds_22_tfbarser_sel ,
                                           AV107Webwlisalpds_21_tfbarser ,
                                           AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                           AV109Webwlisalpds_23_tfbarserdsc ,
                                           AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                           AV111Webwlisalpds_25_tfbarnomcli ,
                                           AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                           AV113Webwlisalpds_27_tfbarcolnom ,
                                           Integer.valueOf(AV115Webwlisalpds_29_tfbarcolnum) ,
                                           Integer.valueOf(AV116Webwlisalpds_30_tfbarcolnum_to) ,
                                           AV117Webwlisalpds_31_tfbarkgm ,
                                           AV118Webwlisalpds_32_tfbarkgm_to ,
                                           AV119Webwlisalpds_33_tfbarmtr ,
                                           AV120Webwlisalpds_34_tfbarmtr_to ,
                                           AV121Webwlisalpds_35_tfbaralbkgme ,
                                           AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                           AV123Webwlisalpds_37_tfbaralbmtre ,
                                           AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                           Integer.valueOf(AV125Webwlisalpds_39_tfbaralbpie) ,
                                           Integer.valueOf(AV126Webwlisalpds_40_tfbaralbpie_to) ,
                                           Short.valueOf(AV127Webwlisalpds_41_tfbarancaca1) ,
                                           Short.valueOf(AV128Webwlisalpds_42_tfbarancaca1_to) ,
                                           Short.valueOf(AV129Webwlisalpds_43_tftrncod) ,
                                           Short.valueOf(AV130Webwlisalpds_44_tftrncod_to) ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1244GuiRemCln ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A840TrnCod) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT
                                           }
      });
      lV99Webwlisalpds_13_tfguiremcln = GXutil.padr( GXutil.rtrim( AV99Webwlisalpds_13_tfguiremcln), 30, "%") ;
      /* Using cursor P08FI6 */
      pr_default.execute(4, new Object[] {AV87Webwlisalpds_1_albprofch, AV88Webwlisalpds_2_albprofch_to, Integer.valueOf(AV89Webwlisalpds_3_guiremcli), Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to), Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli), Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to), lV99Webwlisalpds_13_tfguiremcln, AV100Webwlisalpds_14_tfguiremcln_sel, Long.valueOf(AV101Webwlisalpds_15_tfalbprocod), Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to), AV103Webwlisalpds_17_tfalbprofch, Short.valueOf(AV129Webwlisalpds_43_tftrncod), Short.valueOf(AV130Webwlisalpds_44_tftrncod_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brk8FI9 = false ;
         A1253EmprGuiRem = P08FI6_A1253EmprGuiRem[0] ;
         A396EmprCod = P08FI6_A396EmprCod[0] ;
         A840TrnCod = P08FI6_A840TrnCod[0] ;
         A30AlbProCod = P08FI6_A30AlbProCod[0] ;
         A1244GuiRemCln = P08FI6_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08FI6_A1243GuiRemCli[0] ;
         A34AlbProfch = P08FI6_A34AlbProfch[0] ;
         A1244GuiRemCln = P08FI6_A1244GuiRemCln[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(4) != 101) )
         {
            brk8FI9 = false ;
            A396EmprCod = P08FI6_A396EmprCod[0] ;
            A30AlbProCod = P08FI6_A30AlbProCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8FI9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A1234BarNomCli)==0) )
         {
            AV22Option = A1234BarNomCli ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8FI9 )
         {
            brk8FI9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADBARCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV46TFBarColNom = AV18SearchTxt ;
      AV47TFBarColNom_Sel = "" ;
      AV87Webwlisalpds_1_albprofch = AV70AlbProFch ;
      AV88Webwlisalpds_2_albprofch_to = AV71AlbProFch_To ;
      AV89Webwlisalpds_3_guiremcli = AV60GuiRemCli ;
      AV90Webwlisalpds_4_guiremcli_to = AV61GuiRemCli_To ;
      AV91Webwlisalpds_5_barser = AV64BarSer ;
      AV92Webwlisalpds_6_barser_to = AV65BarSer_To ;
      AV93Webwlisalpds_7_barcolnom = AV66BarColNom ;
      AV94Webwlisalpds_8_barcolnom_to = AV67BarColNom_To ;
      AV95Webwlisalpds_9_barcolnum = AV68BarColNum ;
      AV96Webwlisalpds_10_barcolnum_to = AV69BarColNum_To ;
      AV97Webwlisalpds_11_tfguiremcli = AV10TFGuiRemCli ;
      AV98Webwlisalpds_12_tfguiremcli_to = AV11TFGuiRemCli_To ;
      AV99Webwlisalpds_13_tfguiremcln = AV12TFGuiRemCln ;
      AV100Webwlisalpds_14_tfguiremcln_sel = AV13TFGuiRemCln_Sel ;
      AV101Webwlisalpds_15_tfalbprocod = AV14TFAlbProCod ;
      AV102Webwlisalpds_16_tfalbprocod_to = AV15TFAlbProCod_To ;
      AV103Webwlisalpds_17_tfalbprofch = AV16TFAlbProfch ;
      AV104Webwlisalpds_18_tfbarfeccli = AV36TFBarFecCli ;
      AV105Webwlisalpds_19_tfbarnhdr = AV38TFBarNHdr ;
      AV106Webwlisalpds_20_tfbarnhdr_sel = AV39TFBarNHdr_Sel ;
      AV107Webwlisalpds_21_tfbarser = AV40TFBarSer ;
      AV108Webwlisalpds_22_tfbarser_sel = AV41TFBarSer_Sel ;
      AV109Webwlisalpds_23_tfbarserdsc = AV42TFBarSerDsc ;
      AV110Webwlisalpds_24_tfbarserdsc_sel = AV43TFBarSerDsc_Sel ;
      AV111Webwlisalpds_25_tfbarnomcli = AV44TFBarNomCli ;
      AV112Webwlisalpds_26_tfbarnomcli_sel = AV45TFBarNomCli_Sel ;
      AV113Webwlisalpds_27_tfbarcolnom = AV46TFBarColNom ;
      AV114Webwlisalpds_28_tfbarcolnom_sel = AV47TFBarColNom_Sel ;
      AV115Webwlisalpds_29_tfbarcolnum = AV48TFBarColNum ;
      AV116Webwlisalpds_30_tfbarcolnum_to = AV49TFBarColNum_To ;
      AV117Webwlisalpds_31_tfbarkgm = AV50TFBarKgm ;
      AV118Webwlisalpds_32_tfbarkgm_to = AV51TFBarKgm_To ;
      AV119Webwlisalpds_33_tfbarmtr = AV81TFBarMtr ;
      AV120Webwlisalpds_34_tfbarmtr_to = AV82TFBarMtr_To ;
      AV121Webwlisalpds_35_tfbaralbkgme = AV52TFBarAlbKgmE ;
      AV122Webwlisalpds_36_tfbaralbkgme_to = AV53TFBarAlbKgmE_To ;
      AV123Webwlisalpds_37_tfbaralbmtre = AV54TFBarAlbMtrE ;
      AV124Webwlisalpds_38_tfbaralbmtre_to = AV55TFBarAlbMtrE_To ;
      AV125Webwlisalpds_39_tfbaralbpie = AV56TFBarAlbPie ;
      AV126Webwlisalpds_40_tfbaralbpie_to = AV57TFBarAlbPie_To ;
      AV127Webwlisalpds_41_tfbarancaca1 = AV58TFBarAncAca1 ;
      AV128Webwlisalpds_42_tfbarancaca1_to = AV59TFBarAncAca1_To ;
      AV129Webwlisalpds_43_tftrncod = AV72TFTrnCod ;
      AV130Webwlisalpds_44_tftrncod_to = AV73TFTrnCod_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           AV87Webwlisalpds_1_albprofch ,
                                           AV88Webwlisalpds_2_albprofch_to ,
                                           Integer.valueOf(AV89Webwlisalpds_3_guiremcli) ,
                                           Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to) ,
                                           AV91Webwlisalpds_5_barser ,
                                           AV92Webwlisalpds_6_barser_to ,
                                           AV93Webwlisalpds_7_barcolnom ,
                                           AV94Webwlisalpds_8_barcolnom_to ,
                                           Integer.valueOf(AV95Webwlisalpds_9_barcolnum) ,
                                           Integer.valueOf(AV96Webwlisalpds_10_barcolnum_to) ,
                                           Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli) ,
                                           Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to) ,
                                           AV100Webwlisalpds_14_tfguiremcln_sel ,
                                           AV99Webwlisalpds_13_tfguiremcln ,
                                           Long.valueOf(AV101Webwlisalpds_15_tfalbprocod) ,
                                           Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to) ,
                                           AV103Webwlisalpds_17_tfalbprofch ,
                                           AV104Webwlisalpds_18_tfbarfeccli ,
                                           AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                           AV105Webwlisalpds_19_tfbarnhdr ,
                                           AV108Webwlisalpds_22_tfbarser_sel ,
                                           AV107Webwlisalpds_21_tfbarser ,
                                           AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                           AV109Webwlisalpds_23_tfbarserdsc ,
                                           AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                           AV111Webwlisalpds_25_tfbarnomcli ,
                                           AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                           AV113Webwlisalpds_27_tfbarcolnom ,
                                           Integer.valueOf(AV115Webwlisalpds_29_tfbarcolnum) ,
                                           Integer.valueOf(AV116Webwlisalpds_30_tfbarcolnum_to) ,
                                           AV117Webwlisalpds_31_tfbarkgm ,
                                           AV118Webwlisalpds_32_tfbarkgm_to ,
                                           AV119Webwlisalpds_33_tfbarmtr ,
                                           AV120Webwlisalpds_34_tfbarmtr_to ,
                                           AV121Webwlisalpds_35_tfbaralbkgme ,
                                           AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                           AV123Webwlisalpds_37_tfbaralbmtre ,
                                           AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                           Integer.valueOf(AV125Webwlisalpds_39_tfbaralbpie) ,
                                           Integer.valueOf(AV126Webwlisalpds_40_tfbaralbpie_to) ,
                                           Short.valueOf(AV127Webwlisalpds_41_tfbarancaca1) ,
                                           Short.valueOf(AV128Webwlisalpds_42_tfbarancaca1_to) ,
                                           Short.valueOf(AV129Webwlisalpds_43_tftrncod) ,
                                           Short.valueOf(AV130Webwlisalpds_44_tftrncod_to) ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1244GuiRemCln ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A840TrnCod) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT
                                           }
      });
      lV99Webwlisalpds_13_tfguiremcln = GXutil.padr( GXutil.rtrim( AV99Webwlisalpds_13_tfguiremcln), 30, "%") ;
      /* Using cursor P08FI7 */
      pr_default.execute(5, new Object[] {AV87Webwlisalpds_1_albprofch, AV88Webwlisalpds_2_albprofch_to, Integer.valueOf(AV89Webwlisalpds_3_guiremcli), Integer.valueOf(AV90Webwlisalpds_4_guiremcli_to), Integer.valueOf(AV97Webwlisalpds_11_tfguiremcli), Integer.valueOf(AV98Webwlisalpds_12_tfguiremcli_to), lV99Webwlisalpds_13_tfguiremcln, AV100Webwlisalpds_14_tfguiremcln_sel, Long.valueOf(AV101Webwlisalpds_15_tfalbprocod), Long.valueOf(AV102Webwlisalpds_16_tfalbprocod_to), AV103Webwlisalpds_17_tfalbprofch, Short.valueOf(AV129Webwlisalpds_43_tftrncod), Short.valueOf(AV130Webwlisalpds_44_tftrncod_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brk8FI11 = false ;
         A1253EmprGuiRem = P08FI7_A1253EmprGuiRem[0] ;
         A396EmprCod = P08FI7_A396EmprCod[0] ;
         A840TrnCod = P08FI7_A840TrnCod[0] ;
         A30AlbProCod = P08FI7_A30AlbProCod[0] ;
         A1244GuiRemCln = P08FI7_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08FI7_A1243GuiRemCli[0] ;
         A34AlbProfch = P08FI7_A34AlbProfch[0] ;
         A1244GuiRemCln = P08FI7_A1244GuiRemCln[0] ;
         AV30count = 0 ;
         while ( (pr_default.getStatus(5) != 101) )
         {
            brk8FI11 = false ;
            A396EmprCod = P08FI7_A396EmprCod[0] ;
            A30AlbProCod = P08FI7_A30AlbProCod[0] ;
            AV30count = (long)(AV30count+1) ;
            brk8FI11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A135BarColNom)==0) )
         {
            AV22Option = A135BarColNom ;
            AV23Options.add(AV22Option, 0);
            AV28OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV30count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV23Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk8FI11 )
         {
            brk8FI11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = webwlisalpgetfilterdata.this.AV24OptionsJson;
      this.aP4[0] = webwlisalpgetfilterdata.this.AV27OptionsDescJson;
      this.aP5[0] = webwlisalpgetfilterdata.this.AV29OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV24OptionsJson = "" ;
      AV27OptionsDescJson = "" ;
      AV29OptionIndexesJson = "" ;
      AV23Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV31Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV70AlbProFch = GXutil.nullDate() ;
      AV71AlbProFch_To = GXutil.nullDate() ;
      AV64BarSer = "" ;
      AV65BarSer_To = "" ;
      AV66BarColNom = "" ;
      AV67BarColNom_To = "" ;
      AV12TFGuiRemCln = "" ;
      AV13TFGuiRemCln_Sel = "" ;
      AV16TFAlbProfch = GXutil.nullDate() ;
      AV36TFBarFecCli = GXutil.nullDate() ;
      AV38TFBarNHdr = "" ;
      AV39TFBarNHdr_Sel = "" ;
      AV40TFBarSer = "" ;
      AV41TFBarSer_Sel = "" ;
      AV42TFBarSerDsc = "" ;
      AV43TFBarSerDsc_Sel = "" ;
      AV44TFBarNomCli = "" ;
      AV45TFBarNomCli_Sel = "" ;
      AV46TFBarColNom = "" ;
      AV47TFBarColNom_Sel = "" ;
      AV50TFBarKgm = DecimalUtil.ZERO ;
      AV51TFBarKgm_To = DecimalUtil.ZERO ;
      AV81TFBarMtr = DecimalUtil.ZERO ;
      AV82TFBarMtr_To = DecimalUtil.ZERO ;
      AV52TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV53TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV54TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV55TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      A1244GuiRemCln = "" ;
      AV87Webwlisalpds_1_albprofch = GXutil.nullDate() ;
      AV88Webwlisalpds_2_albprofch_to = GXutil.nullDate() ;
      AV91Webwlisalpds_5_barser = "" ;
      AV92Webwlisalpds_6_barser_to = "" ;
      AV93Webwlisalpds_7_barcolnom = "" ;
      AV94Webwlisalpds_8_barcolnom_to = "" ;
      AV99Webwlisalpds_13_tfguiremcln = "" ;
      AV100Webwlisalpds_14_tfguiremcln_sel = "" ;
      AV103Webwlisalpds_17_tfalbprofch = GXutil.nullDate() ;
      AV104Webwlisalpds_18_tfbarfeccli = GXutil.nullDate() ;
      AV105Webwlisalpds_19_tfbarnhdr = "" ;
      AV106Webwlisalpds_20_tfbarnhdr_sel = "" ;
      AV107Webwlisalpds_21_tfbarser = "" ;
      AV108Webwlisalpds_22_tfbarser_sel = "" ;
      AV109Webwlisalpds_23_tfbarserdsc = "" ;
      AV110Webwlisalpds_24_tfbarserdsc_sel = "" ;
      AV111Webwlisalpds_25_tfbarnomcli = "" ;
      AV112Webwlisalpds_26_tfbarnomcli_sel = "" ;
      AV113Webwlisalpds_27_tfbarcolnom = "" ;
      AV114Webwlisalpds_28_tfbarcolnom_sel = "" ;
      AV117Webwlisalpds_31_tfbarkgm = DecimalUtil.ZERO ;
      AV118Webwlisalpds_32_tfbarkgm_to = DecimalUtil.ZERO ;
      AV119Webwlisalpds_33_tfbarmtr = DecimalUtil.ZERO ;
      AV120Webwlisalpds_34_tfbarmtr_to = DecimalUtil.ZERO ;
      AV121Webwlisalpds_35_tfbaralbkgme = DecimalUtil.ZERO ;
      AV122Webwlisalpds_36_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV123Webwlisalpds_37_tfbaralbmtre = DecimalUtil.ZERO ;
      AV124Webwlisalpds_38_tfbaralbmtre_to = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV99Webwlisalpds_13_tfguiremcln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A130BarCodPar = "" ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      P08FI2_A1253EmprGuiRem = new String[] {""} ;
      P08FI2_A396EmprCod = new String[] {""} ;
      P08FI2_A1244GuiRemCln = new String[] {""} ;
      P08FI2_A840TrnCod = new short[1] ;
      P08FI2_A30AlbProCod = new long[1] ;
      P08FI2_A1243GuiRemCli = new int[1] ;
      P08FI2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A1253EmprGuiRem = "" ;
      A396EmprCod = "" ;
      AV22Option = "" ;
      A13696BarNHdr = "" ;
      P08FI3_A1253EmprGuiRem = new String[] {""} ;
      P08FI3_A396EmprCod = new String[] {""} ;
      P08FI3_A840TrnCod = new short[1] ;
      P08FI3_A30AlbProCod = new long[1] ;
      P08FI3_A1244GuiRemCln = new String[] {""} ;
      P08FI3_A1243GuiRemCli = new int[1] ;
      P08FI3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08FI4_A1253EmprGuiRem = new String[] {""} ;
      P08FI4_A396EmprCod = new String[] {""} ;
      P08FI4_A840TrnCod = new short[1] ;
      P08FI4_A30AlbProCod = new long[1] ;
      P08FI4_A1244GuiRemCln = new String[] {""} ;
      P08FI4_A1243GuiRemCli = new int[1] ;
      P08FI4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08FI5_A1253EmprGuiRem = new String[] {""} ;
      P08FI5_A396EmprCod = new String[] {""} ;
      P08FI5_A840TrnCod = new short[1] ;
      P08FI5_A30AlbProCod = new long[1] ;
      P08FI5_A1244GuiRemCln = new String[] {""} ;
      P08FI5_A1243GuiRemCli = new int[1] ;
      P08FI5_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08FI6_A1253EmprGuiRem = new String[] {""} ;
      P08FI6_A396EmprCod = new String[] {""} ;
      P08FI6_A840TrnCod = new short[1] ;
      P08FI6_A30AlbProCod = new long[1] ;
      P08FI6_A1244GuiRemCln = new String[] {""} ;
      P08FI6_A1243GuiRemCli = new int[1] ;
      P08FI6_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08FI7_A1253EmprGuiRem = new String[] {""} ;
      P08FI7_A396EmprCod = new String[] {""} ;
      P08FI7_A840TrnCod = new short[1] ;
      P08FI7_A30AlbProCod = new long[1] ;
      P08FI7_A1244GuiRemCln = new String[] {""} ;
      P08FI7_A1243GuiRemCli = new int[1] ;
      P08FI7_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwlisalpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P08FI2_A1253EmprGuiRem, P08FI2_A396EmprCod, P08FI2_A1244GuiRemCln, P08FI2_A840TrnCod, P08FI2_A30AlbProCod, P08FI2_A1243GuiRemCli, P08FI2_A34AlbProfch
            }
            , new Object[] {
            P08FI3_A1253EmprGuiRem, P08FI3_A396EmprCod, P08FI3_A840TrnCod, P08FI3_A30AlbProCod, P08FI3_A1244GuiRemCln, P08FI3_A1243GuiRemCli, P08FI3_A34AlbProfch
            }
            , new Object[] {
            P08FI4_A1253EmprGuiRem, P08FI4_A396EmprCod, P08FI4_A840TrnCod, P08FI4_A30AlbProCod, P08FI4_A1244GuiRemCln, P08FI4_A1243GuiRemCli, P08FI4_A34AlbProfch
            }
            , new Object[] {
            P08FI5_A1253EmprGuiRem, P08FI5_A396EmprCod, P08FI5_A840TrnCod, P08FI5_A30AlbProCod, P08FI5_A1244GuiRemCln, P08FI5_A1243GuiRemCli, P08FI5_A34AlbProfch
            }
            , new Object[] {
            P08FI6_A1253EmprGuiRem, P08FI6_A396EmprCod, P08FI6_A840TrnCod, P08FI6_A30AlbProCod, P08FI6_A1244GuiRemCln, P08FI6_A1243GuiRemCli, P08FI6_A34AlbProfch
            }
            , new Object[] {
            P08FI7_A1253EmprGuiRem, P08FI7_A396EmprCod, P08FI7_A840TrnCod, P08FI7_A30AlbProCod, P08FI7_A1244GuiRemCln, P08FI7_A1243GuiRemCli, P08FI7_A34AlbProfch
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short AV58TFBarAncAca1 ;
   private short AV59TFBarAncAca1_To ;
   private short AV72TFTrnCod ;
   private short AV73TFTrnCod_To ;
   private short AV127Webwlisalpds_41_tfbarancaca1 ;
   private short AV128Webwlisalpds_42_tfbarancaca1_to ;
   private short AV129Webwlisalpds_43_tftrncod ;
   private short AV130Webwlisalpds_44_tftrncod_to ;
   private short A840TrnCod ;
   private short Gx_err ;
   private int AV85GXV1 ;
   private int AV60GuiRemCli ;
   private int AV61GuiRemCli_To ;
   private int AV68BarColNum ;
   private int AV69BarColNum_To ;
   private int AV10TFGuiRemCli ;
   private int AV11TFGuiRemCli_To ;
   private int AV48TFBarColNum ;
   private int AV49TFBarColNum_To ;
   private int AV56TFBarAlbPie ;
   private int AV57TFBarAlbPie_To ;
   private int AV89Webwlisalpds_3_guiremcli ;
   private int AV90Webwlisalpds_4_guiremcli_to ;
   private int AV95Webwlisalpds_9_barcolnum ;
   private int AV96Webwlisalpds_10_barcolnum_to ;
   private int AV97Webwlisalpds_11_tfguiremcli ;
   private int AV98Webwlisalpds_12_tfguiremcli_to ;
   private int AV115Webwlisalpds_29_tfbarcolnum ;
   private int AV116Webwlisalpds_30_tfbarcolnum_to ;
   private int AV125Webwlisalpds_39_tfbaralbpie ;
   private int AV126Webwlisalpds_40_tfbaralbpie_to ;
   private int A1243GuiRemCli ;
   private int A129BarCod ;
   private int AV21InsertIndex ;
   private long AV14TFAlbProCod ;
   private long AV15TFAlbProCod_To ;
   private long AV101Webwlisalpds_15_tfalbprocod ;
   private long AV102Webwlisalpds_16_tfalbprocod_to ;
   private long A30AlbProCod ;
   private long AV30count ;
   private java.math.BigDecimal AV50TFBarKgm ;
   private java.math.BigDecimal AV51TFBarKgm_To ;
   private java.math.BigDecimal AV81TFBarMtr ;
   private java.math.BigDecimal AV82TFBarMtr_To ;
   private java.math.BigDecimal AV52TFBarAlbKgmE ;
   private java.math.BigDecimal AV53TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV54TFBarAlbMtrE ;
   private java.math.BigDecimal AV55TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV117Webwlisalpds_31_tfbarkgm ;
   private java.math.BigDecimal AV118Webwlisalpds_32_tfbarkgm_to ;
   private java.math.BigDecimal AV119Webwlisalpds_33_tfbarmtr ;
   private java.math.BigDecimal AV120Webwlisalpds_34_tfbarmtr_to ;
   private java.math.BigDecimal AV121Webwlisalpds_35_tfbaralbkgme ;
   private java.math.BigDecimal AV122Webwlisalpds_36_tfbaralbkgme_to ;
   private java.math.BigDecimal AV123Webwlisalpds_37_tfbaralbmtre ;
   private java.math.BigDecimal AV124Webwlisalpds_38_tfbaralbmtre_to ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String AV64BarSer ;
   private String AV65BarSer_To ;
   private String AV66BarColNom ;
   private String AV67BarColNom_To ;
   private String AV12TFGuiRemCln ;
   private String AV13TFGuiRemCln_Sel ;
   private String AV38TFBarNHdr ;
   private String AV39TFBarNHdr_Sel ;
   private String AV40TFBarSer ;
   private String AV41TFBarSer_Sel ;
   private String AV42TFBarSerDsc ;
   private String AV43TFBarSerDsc_Sel ;
   private String AV44TFBarNomCli ;
   private String AV45TFBarNomCli_Sel ;
   private String AV46TFBarColNom ;
   private String AV47TFBarColNom_Sel ;
   private String A1244GuiRemCln ;
   private String AV91Webwlisalpds_5_barser ;
   private String AV92Webwlisalpds_6_barser_to ;
   private String AV93Webwlisalpds_7_barcolnom ;
   private String AV94Webwlisalpds_8_barcolnom_to ;
   private String AV99Webwlisalpds_13_tfguiremcln ;
   private String AV100Webwlisalpds_14_tfguiremcln_sel ;
   private String AV105Webwlisalpds_19_tfbarnhdr ;
   private String AV106Webwlisalpds_20_tfbarnhdr_sel ;
   private String AV107Webwlisalpds_21_tfbarser ;
   private String AV108Webwlisalpds_22_tfbarser_sel ;
   private String AV109Webwlisalpds_23_tfbarserdsc ;
   private String AV110Webwlisalpds_24_tfbarserdsc_sel ;
   private String AV111Webwlisalpds_25_tfbarnomcli ;
   private String AV112Webwlisalpds_26_tfbarnomcli_sel ;
   private String AV113Webwlisalpds_27_tfbarcolnom ;
   private String AV114Webwlisalpds_28_tfbarcolnom_sel ;
   private String scmdbuf ;
   private String lV99Webwlisalpds_13_tfguiremcln ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A130BarCodPar ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String A1253EmprGuiRem ;
   private String A396EmprCod ;
   private String A13696BarNHdr ;
   private java.util.Date AV70AlbProFch ;
   private java.util.Date AV71AlbProFch_To ;
   private java.util.Date AV16TFAlbProfch ;
   private java.util.Date AV36TFBarFecCli ;
   private java.util.Date AV87Webwlisalpds_1_albprofch ;
   private java.util.Date AV88Webwlisalpds_2_albprofch_to ;
   private java.util.Date AV103Webwlisalpds_17_tfalbprofch ;
   private java.util.Date AV104Webwlisalpds_18_tfbarfeccli ;
   private java.util.Date A34AlbProfch ;
   private boolean returnInSub ;
   private boolean brk8FI2 ;
   private boolean brk8FI5 ;
   private boolean brk8FI7 ;
   private boolean brk8FI9 ;
   private boolean brk8FI11 ;
   private String AV24OptionsJson ;
   private String AV27OptionsDescJson ;
   private String AV29OptionIndexesJson ;
   private String AV20DDOName ;
   private String AV18SearchTxt ;
   private String AV19SearchTxtTo ;
   private String AV22Option ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P08FI2_A1253EmprGuiRem ;
   private String[] P08FI2_A396EmprCod ;
   private String[] P08FI2_A1244GuiRemCln ;
   private short[] P08FI2_A840TrnCod ;
   private long[] P08FI2_A30AlbProCod ;
   private int[] P08FI2_A1243GuiRemCli ;
   private java.util.Date[] P08FI2_A34AlbProfch ;
   private String[] P08FI3_A1253EmprGuiRem ;
   private String[] P08FI3_A396EmprCod ;
   private short[] P08FI3_A840TrnCod ;
   private long[] P08FI3_A30AlbProCod ;
   private String[] P08FI3_A1244GuiRemCln ;
   private int[] P08FI3_A1243GuiRemCli ;
   private java.util.Date[] P08FI3_A34AlbProfch ;
   private String[] P08FI4_A1253EmprGuiRem ;
   private String[] P08FI4_A396EmprCod ;
   private short[] P08FI4_A840TrnCod ;
   private long[] P08FI4_A30AlbProCod ;
   private String[] P08FI4_A1244GuiRemCln ;
   private int[] P08FI4_A1243GuiRemCli ;
   private java.util.Date[] P08FI4_A34AlbProfch ;
   private String[] P08FI5_A1253EmprGuiRem ;
   private String[] P08FI5_A396EmprCod ;
   private short[] P08FI5_A840TrnCod ;
   private long[] P08FI5_A30AlbProCod ;
   private String[] P08FI5_A1244GuiRemCln ;
   private int[] P08FI5_A1243GuiRemCli ;
   private java.util.Date[] P08FI5_A34AlbProfch ;
   private String[] P08FI6_A1253EmprGuiRem ;
   private String[] P08FI6_A396EmprCod ;
   private short[] P08FI6_A840TrnCod ;
   private long[] P08FI6_A30AlbProCod ;
   private String[] P08FI6_A1244GuiRemCln ;
   private int[] P08FI6_A1243GuiRemCli ;
   private java.util.Date[] P08FI6_A34AlbProfch ;
   private String[] P08FI7_A1253EmprGuiRem ;
   private String[] P08FI7_A396EmprCod ;
   private short[] P08FI7_A840TrnCod ;
   private long[] P08FI7_A30AlbProCod ;
   private String[] P08FI7_A1244GuiRemCln ;
   private int[] P08FI7_A1243GuiRemCli ;
   private java.util.Date[] P08FI7_A34AlbProfch ;
   private GXSimpleCollection<String> AV23Options ;
   private GXSimpleCollection<String> AV26OptionsDesc ;
   private GXSimpleCollection<String> AV28OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class webwlisalpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV87Webwlisalpds_1_albprofch ,
                                          java.util.Date AV88Webwlisalpds_2_albprofch_to ,
                                          int AV89Webwlisalpds_3_guiremcli ,
                                          int AV90Webwlisalpds_4_guiremcli_to ,
                                          String AV91Webwlisalpds_5_barser ,
                                          String AV92Webwlisalpds_6_barser_to ,
                                          String AV93Webwlisalpds_7_barcolnom ,
                                          String AV94Webwlisalpds_8_barcolnom_to ,
                                          int AV95Webwlisalpds_9_barcolnum ,
                                          int AV96Webwlisalpds_10_barcolnum_to ,
                                          int AV97Webwlisalpds_11_tfguiremcli ,
                                          int AV98Webwlisalpds_12_tfguiremcli_to ,
                                          String AV100Webwlisalpds_14_tfguiremcln_sel ,
                                          String AV99Webwlisalpds_13_tfguiremcln ,
                                          long AV101Webwlisalpds_15_tfalbprocod ,
                                          long AV102Webwlisalpds_16_tfalbprocod_to ,
                                          java.util.Date AV103Webwlisalpds_17_tfalbprofch ,
                                          java.util.Date AV104Webwlisalpds_18_tfbarfeccli ,
                                          String AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                          String AV105Webwlisalpds_19_tfbarnhdr ,
                                          String AV108Webwlisalpds_22_tfbarser_sel ,
                                          String AV107Webwlisalpds_21_tfbarser ,
                                          String AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                          String AV109Webwlisalpds_23_tfbarserdsc ,
                                          String AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                          String AV111Webwlisalpds_25_tfbarnomcli ,
                                          String AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                          String AV113Webwlisalpds_27_tfbarcolnom ,
                                          int AV115Webwlisalpds_29_tfbarcolnum ,
                                          int AV116Webwlisalpds_30_tfbarcolnum_to ,
                                          java.math.BigDecimal AV117Webwlisalpds_31_tfbarkgm ,
                                          java.math.BigDecimal AV118Webwlisalpds_32_tfbarkgm_to ,
                                          java.math.BigDecimal AV119Webwlisalpds_33_tfbarmtr ,
                                          java.math.BigDecimal AV120Webwlisalpds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV121Webwlisalpds_35_tfbaralbkgme ,
                                          java.math.BigDecimal AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV123Webwlisalpds_37_tfbaralbmtre ,
                                          java.math.BigDecimal AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                          int AV125Webwlisalpds_39_tfbaralbpie ,
                                          int AV126Webwlisalpds_40_tfbaralbpie_to ,
                                          short AV127Webwlisalpds_41_tfbarancaca1 ,
                                          short AV128Webwlisalpds_42_tfbarancaca1_to ,
                                          short AV129Webwlisalpds_43_tftrncod ,
                                          short AV130Webwlisalpds_44_tftrncod_to ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1244GuiRemCln ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          short A840TrnCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[13];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T2.CliNom AS GuiRemCln, T1.TrnCod, T1.AlbProCod, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch FROM (TXPCALPRD T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Webwlisalpds_1_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Webwlisalpds_2_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int2[1] = (byte)(1) ;
      }
      if ( ! (0==AV89Webwlisalpds_3_guiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwlisalpds_4_guiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV97Webwlisalpds_11_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV98Webwlisalpds_12_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV99Webwlisalpds_13_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlisalpds_15_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlisalpds_16_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Webwlisalpds_17_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (0==AV129Webwlisalpds_43_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV130Webwlisalpds_44_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T2.CliNom" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P08FI3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV87Webwlisalpds_1_albprofch ,
                                          java.util.Date AV88Webwlisalpds_2_albprofch_to ,
                                          int AV89Webwlisalpds_3_guiremcli ,
                                          int AV90Webwlisalpds_4_guiremcli_to ,
                                          String AV91Webwlisalpds_5_barser ,
                                          String AV92Webwlisalpds_6_barser_to ,
                                          String AV93Webwlisalpds_7_barcolnom ,
                                          String AV94Webwlisalpds_8_barcolnom_to ,
                                          int AV95Webwlisalpds_9_barcolnum ,
                                          int AV96Webwlisalpds_10_barcolnum_to ,
                                          int AV97Webwlisalpds_11_tfguiremcli ,
                                          int AV98Webwlisalpds_12_tfguiremcli_to ,
                                          String AV100Webwlisalpds_14_tfguiremcln_sel ,
                                          String AV99Webwlisalpds_13_tfguiremcln ,
                                          long AV101Webwlisalpds_15_tfalbprocod ,
                                          long AV102Webwlisalpds_16_tfalbprocod_to ,
                                          java.util.Date AV103Webwlisalpds_17_tfalbprofch ,
                                          java.util.Date AV104Webwlisalpds_18_tfbarfeccli ,
                                          String AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                          String AV105Webwlisalpds_19_tfbarnhdr ,
                                          String AV108Webwlisalpds_22_tfbarser_sel ,
                                          String AV107Webwlisalpds_21_tfbarser ,
                                          String AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                          String AV109Webwlisalpds_23_tfbarserdsc ,
                                          String AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                          String AV111Webwlisalpds_25_tfbarnomcli ,
                                          String AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                          String AV113Webwlisalpds_27_tfbarcolnom ,
                                          int AV115Webwlisalpds_29_tfbarcolnum ,
                                          int AV116Webwlisalpds_30_tfbarcolnum_to ,
                                          java.math.BigDecimal AV117Webwlisalpds_31_tfbarkgm ,
                                          java.math.BigDecimal AV118Webwlisalpds_32_tfbarkgm_to ,
                                          java.math.BigDecimal AV119Webwlisalpds_33_tfbarmtr ,
                                          java.math.BigDecimal AV120Webwlisalpds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV121Webwlisalpds_35_tfbaralbkgme ,
                                          java.math.BigDecimal AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV123Webwlisalpds_37_tfbaralbmtre ,
                                          java.math.BigDecimal AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                          int AV125Webwlisalpds_39_tfbaralbpie ,
                                          int AV126Webwlisalpds_40_tfbaralbpie_to ,
                                          short AV127Webwlisalpds_41_tfbarancaca1 ,
                                          short AV128Webwlisalpds_42_tfbarancaca1_to ,
                                          short AV129Webwlisalpds_43_tftrncod ,
                                          short AV130Webwlisalpds_44_tftrncod_to ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1244GuiRemCln ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          short A840TrnCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int4 = new byte[13];
      Object[] GXv_Object5 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.TrnCod, T1.AlbProCod, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch FROM (TXPCALPRD T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Webwlisalpds_1_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int4[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Webwlisalpds_2_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int4[1] = (byte)(1) ;
      }
      if ( ! (0==AV89Webwlisalpds_3_guiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int4[2] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwlisalpds_4_guiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int4[3] = (byte)(1) ;
      }
      if ( ! (0==AV97Webwlisalpds_11_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int4[4] = (byte)(1) ;
      }
      if ( ! (0==AV98Webwlisalpds_12_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int4[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV99Webwlisalpds_13_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int4[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int4[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlisalpds_15_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int4[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlisalpds_16_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int4[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Webwlisalpds_17_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int4[10] = (byte)(1) ;
      }
      if ( ! (0==AV129Webwlisalpds_43_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int4[11] = (byte)(1) ;
      }
      if ( ! (0==AV130Webwlisalpds_44_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int4[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      GXv_Object5[0] = scmdbuf ;
      GXv_Object5[1] = GXv_int4 ;
      return GXv_Object5 ;
   }

   protected Object[] conditional_P08FI4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV87Webwlisalpds_1_albprofch ,
                                          java.util.Date AV88Webwlisalpds_2_albprofch_to ,
                                          int AV89Webwlisalpds_3_guiremcli ,
                                          int AV90Webwlisalpds_4_guiremcli_to ,
                                          String AV91Webwlisalpds_5_barser ,
                                          String AV92Webwlisalpds_6_barser_to ,
                                          String AV93Webwlisalpds_7_barcolnom ,
                                          String AV94Webwlisalpds_8_barcolnom_to ,
                                          int AV95Webwlisalpds_9_barcolnum ,
                                          int AV96Webwlisalpds_10_barcolnum_to ,
                                          int AV97Webwlisalpds_11_tfguiremcli ,
                                          int AV98Webwlisalpds_12_tfguiremcli_to ,
                                          String AV100Webwlisalpds_14_tfguiremcln_sel ,
                                          String AV99Webwlisalpds_13_tfguiremcln ,
                                          long AV101Webwlisalpds_15_tfalbprocod ,
                                          long AV102Webwlisalpds_16_tfalbprocod_to ,
                                          java.util.Date AV103Webwlisalpds_17_tfalbprofch ,
                                          java.util.Date AV104Webwlisalpds_18_tfbarfeccli ,
                                          String AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                          String AV105Webwlisalpds_19_tfbarnhdr ,
                                          String AV108Webwlisalpds_22_tfbarser_sel ,
                                          String AV107Webwlisalpds_21_tfbarser ,
                                          String AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                          String AV109Webwlisalpds_23_tfbarserdsc ,
                                          String AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                          String AV111Webwlisalpds_25_tfbarnomcli ,
                                          String AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                          String AV113Webwlisalpds_27_tfbarcolnom ,
                                          int AV115Webwlisalpds_29_tfbarcolnum ,
                                          int AV116Webwlisalpds_30_tfbarcolnum_to ,
                                          java.math.BigDecimal AV117Webwlisalpds_31_tfbarkgm ,
                                          java.math.BigDecimal AV118Webwlisalpds_32_tfbarkgm_to ,
                                          java.math.BigDecimal AV119Webwlisalpds_33_tfbarmtr ,
                                          java.math.BigDecimal AV120Webwlisalpds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV121Webwlisalpds_35_tfbaralbkgme ,
                                          java.math.BigDecimal AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV123Webwlisalpds_37_tfbaralbmtre ,
                                          java.math.BigDecimal AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                          int AV125Webwlisalpds_39_tfbaralbpie ,
                                          int AV126Webwlisalpds_40_tfbaralbpie_to ,
                                          short AV127Webwlisalpds_41_tfbarancaca1 ,
                                          short AV128Webwlisalpds_42_tfbarancaca1_to ,
                                          short AV129Webwlisalpds_43_tftrncod ,
                                          short AV130Webwlisalpds_44_tftrncod_to ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1244GuiRemCln ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          short A840TrnCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[13];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.TrnCod, T1.AlbProCod, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch FROM (TXPCALPRD T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Webwlisalpds_1_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Webwlisalpds_2_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV89Webwlisalpds_3_guiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwlisalpds_4_guiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV97Webwlisalpds_11_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV98Webwlisalpds_12_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV99Webwlisalpds_13_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlisalpds_15_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlisalpds_16_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Webwlisalpds_17_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV129Webwlisalpds_43_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV130Webwlisalpds_44_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
   }

   protected Object[] conditional_P08FI5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV87Webwlisalpds_1_albprofch ,
                                          java.util.Date AV88Webwlisalpds_2_albprofch_to ,
                                          int AV89Webwlisalpds_3_guiremcli ,
                                          int AV90Webwlisalpds_4_guiremcli_to ,
                                          String AV91Webwlisalpds_5_barser ,
                                          String AV92Webwlisalpds_6_barser_to ,
                                          String AV93Webwlisalpds_7_barcolnom ,
                                          String AV94Webwlisalpds_8_barcolnom_to ,
                                          int AV95Webwlisalpds_9_barcolnum ,
                                          int AV96Webwlisalpds_10_barcolnum_to ,
                                          int AV97Webwlisalpds_11_tfguiremcli ,
                                          int AV98Webwlisalpds_12_tfguiremcli_to ,
                                          String AV100Webwlisalpds_14_tfguiremcln_sel ,
                                          String AV99Webwlisalpds_13_tfguiremcln ,
                                          long AV101Webwlisalpds_15_tfalbprocod ,
                                          long AV102Webwlisalpds_16_tfalbprocod_to ,
                                          java.util.Date AV103Webwlisalpds_17_tfalbprofch ,
                                          java.util.Date AV104Webwlisalpds_18_tfbarfeccli ,
                                          String AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                          String AV105Webwlisalpds_19_tfbarnhdr ,
                                          String AV108Webwlisalpds_22_tfbarser_sel ,
                                          String AV107Webwlisalpds_21_tfbarser ,
                                          String AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                          String AV109Webwlisalpds_23_tfbarserdsc ,
                                          String AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                          String AV111Webwlisalpds_25_tfbarnomcli ,
                                          String AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                          String AV113Webwlisalpds_27_tfbarcolnom ,
                                          int AV115Webwlisalpds_29_tfbarcolnum ,
                                          int AV116Webwlisalpds_30_tfbarcolnum_to ,
                                          java.math.BigDecimal AV117Webwlisalpds_31_tfbarkgm ,
                                          java.math.BigDecimal AV118Webwlisalpds_32_tfbarkgm_to ,
                                          java.math.BigDecimal AV119Webwlisalpds_33_tfbarmtr ,
                                          java.math.BigDecimal AV120Webwlisalpds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV121Webwlisalpds_35_tfbaralbkgme ,
                                          java.math.BigDecimal AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV123Webwlisalpds_37_tfbaralbmtre ,
                                          java.math.BigDecimal AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                          int AV125Webwlisalpds_39_tfbaralbpie ,
                                          int AV126Webwlisalpds_40_tfbaralbpie_to ,
                                          short AV127Webwlisalpds_41_tfbarancaca1 ,
                                          short AV128Webwlisalpds_42_tfbarancaca1_to ,
                                          short AV129Webwlisalpds_43_tftrncod ,
                                          short AV130Webwlisalpds_44_tftrncod_to ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1244GuiRemCln ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          short A840TrnCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[13];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.TrnCod, T1.AlbProCod, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch FROM (TXPCALPRD T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Webwlisalpds_1_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Webwlisalpds_2_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ! (0==AV89Webwlisalpds_3_guiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwlisalpds_4_guiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV97Webwlisalpds_11_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV98Webwlisalpds_12_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV99Webwlisalpds_13_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlisalpds_15_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlisalpds_16_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Webwlisalpds_17_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV129Webwlisalpds_43_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV130Webwlisalpds_44_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P08FI6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV87Webwlisalpds_1_albprofch ,
                                          java.util.Date AV88Webwlisalpds_2_albprofch_to ,
                                          int AV89Webwlisalpds_3_guiremcli ,
                                          int AV90Webwlisalpds_4_guiremcli_to ,
                                          String AV91Webwlisalpds_5_barser ,
                                          String AV92Webwlisalpds_6_barser_to ,
                                          String AV93Webwlisalpds_7_barcolnom ,
                                          String AV94Webwlisalpds_8_barcolnom_to ,
                                          int AV95Webwlisalpds_9_barcolnum ,
                                          int AV96Webwlisalpds_10_barcolnum_to ,
                                          int AV97Webwlisalpds_11_tfguiremcli ,
                                          int AV98Webwlisalpds_12_tfguiremcli_to ,
                                          String AV100Webwlisalpds_14_tfguiremcln_sel ,
                                          String AV99Webwlisalpds_13_tfguiremcln ,
                                          long AV101Webwlisalpds_15_tfalbprocod ,
                                          long AV102Webwlisalpds_16_tfalbprocod_to ,
                                          java.util.Date AV103Webwlisalpds_17_tfalbprofch ,
                                          java.util.Date AV104Webwlisalpds_18_tfbarfeccli ,
                                          String AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                          String AV105Webwlisalpds_19_tfbarnhdr ,
                                          String AV108Webwlisalpds_22_tfbarser_sel ,
                                          String AV107Webwlisalpds_21_tfbarser ,
                                          String AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                          String AV109Webwlisalpds_23_tfbarserdsc ,
                                          String AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                          String AV111Webwlisalpds_25_tfbarnomcli ,
                                          String AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                          String AV113Webwlisalpds_27_tfbarcolnom ,
                                          int AV115Webwlisalpds_29_tfbarcolnum ,
                                          int AV116Webwlisalpds_30_tfbarcolnum_to ,
                                          java.math.BigDecimal AV117Webwlisalpds_31_tfbarkgm ,
                                          java.math.BigDecimal AV118Webwlisalpds_32_tfbarkgm_to ,
                                          java.math.BigDecimal AV119Webwlisalpds_33_tfbarmtr ,
                                          java.math.BigDecimal AV120Webwlisalpds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV121Webwlisalpds_35_tfbaralbkgme ,
                                          java.math.BigDecimal AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV123Webwlisalpds_37_tfbaralbmtre ,
                                          java.math.BigDecimal AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                          int AV125Webwlisalpds_39_tfbaralbpie ,
                                          int AV126Webwlisalpds_40_tfbaralbpie_to ,
                                          short AV127Webwlisalpds_41_tfbarancaca1 ,
                                          short AV128Webwlisalpds_42_tfbarancaca1_to ,
                                          short AV129Webwlisalpds_43_tftrncod ,
                                          short AV130Webwlisalpds_44_tftrncod_to ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1244GuiRemCln ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          short A840TrnCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[13];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.TrnCod, T1.AlbProCod, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch FROM (TXPCALPRD T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Webwlisalpds_1_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Webwlisalpds_2_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ! (0==AV89Webwlisalpds_3_guiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwlisalpds_4_guiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ! (0==AV97Webwlisalpds_11_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (0==AV98Webwlisalpds_12_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV99Webwlisalpds_13_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlisalpds_15_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlisalpds_16_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Webwlisalpds_17_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV129Webwlisalpds_43_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV130Webwlisalpds_44_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P08FI7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV87Webwlisalpds_1_albprofch ,
                                          java.util.Date AV88Webwlisalpds_2_albprofch_to ,
                                          int AV89Webwlisalpds_3_guiremcli ,
                                          int AV90Webwlisalpds_4_guiremcli_to ,
                                          String AV91Webwlisalpds_5_barser ,
                                          String AV92Webwlisalpds_6_barser_to ,
                                          String AV93Webwlisalpds_7_barcolnom ,
                                          String AV94Webwlisalpds_8_barcolnom_to ,
                                          int AV95Webwlisalpds_9_barcolnum ,
                                          int AV96Webwlisalpds_10_barcolnum_to ,
                                          int AV97Webwlisalpds_11_tfguiremcli ,
                                          int AV98Webwlisalpds_12_tfguiremcli_to ,
                                          String AV100Webwlisalpds_14_tfguiremcln_sel ,
                                          String AV99Webwlisalpds_13_tfguiremcln ,
                                          long AV101Webwlisalpds_15_tfalbprocod ,
                                          long AV102Webwlisalpds_16_tfalbprocod_to ,
                                          java.util.Date AV103Webwlisalpds_17_tfalbprofch ,
                                          java.util.Date AV104Webwlisalpds_18_tfbarfeccli ,
                                          String AV106Webwlisalpds_20_tfbarnhdr_sel ,
                                          String AV105Webwlisalpds_19_tfbarnhdr ,
                                          String AV108Webwlisalpds_22_tfbarser_sel ,
                                          String AV107Webwlisalpds_21_tfbarser ,
                                          String AV110Webwlisalpds_24_tfbarserdsc_sel ,
                                          String AV109Webwlisalpds_23_tfbarserdsc ,
                                          String AV112Webwlisalpds_26_tfbarnomcli_sel ,
                                          String AV111Webwlisalpds_25_tfbarnomcli ,
                                          String AV114Webwlisalpds_28_tfbarcolnom_sel ,
                                          String AV113Webwlisalpds_27_tfbarcolnom ,
                                          int AV115Webwlisalpds_29_tfbarcolnum ,
                                          int AV116Webwlisalpds_30_tfbarcolnum_to ,
                                          java.math.BigDecimal AV117Webwlisalpds_31_tfbarkgm ,
                                          java.math.BigDecimal AV118Webwlisalpds_32_tfbarkgm_to ,
                                          java.math.BigDecimal AV119Webwlisalpds_33_tfbarmtr ,
                                          java.math.BigDecimal AV120Webwlisalpds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV121Webwlisalpds_35_tfbaralbkgme ,
                                          java.math.BigDecimal AV122Webwlisalpds_36_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV123Webwlisalpds_37_tfbaralbmtre ,
                                          java.math.BigDecimal AV124Webwlisalpds_38_tfbaralbmtre_to ,
                                          int AV125Webwlisalpds_39_tfbaralbpie ,
                                          int AV126Webwlisalpds_40_tfbaralbpie_to ,
                                          short AV127Webwlisalpds_41_tfbarancaca1 ,
                                          short AV128Webwlisalpds_42_tfbarancaca1_to ,
                                          short AV129Webwlisalpds_43_tftrncod ,
                                          short AV130Webwlisalpds_44_tftrncod_to ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1244GuiRemCln ,
                                          long A30AlbProCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          short A840TrnCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[13];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.TrnCod, T1.AlbProCod, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch FROM (TXPCALPRD T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Webwlisalpds_1_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int12[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Webwlisalpds_2_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int12[1] = (byte)(1) ;
      }
      if ( ! (0==AV89Webwlisalpds_3_guiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV90Webwlisalpds_4_guiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV97Webwlisalpds_11_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV98Webwlisalpds_12_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV99Webwlisalpds_13_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Webwlisalpds_14_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Webwlisalpds_15_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Webwlisalpds_16_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Webwlisalpds_17_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (0==AV129Webwlisalpds_43_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (0==AV130Webwlisalpds_44_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
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
                  return conditional_P08FI2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).longValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (java.math.BigDecimal)dynConstraints[58] , ((Number) dynConstraints[63]).shortValue() );
            case 1 :
                  return conditional_P08FI3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).longValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (java.math.BigDecimal)dynConstraints[58] , ((Number) dynConstraints[63]).shortValue() );
            case 2 :
                  return conditional_P08FI4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).longValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (java.math.BigDecimal)dynConstraints[58] , ((Number) dynConstraints[63]).shortValue() );
            case 3 :
                  return conditional_P08FI5(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).longValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (java.math.BigDecimal)dynConstraints[58] , ((Number) dynConstraints[63]).shortValue() );
            case 4 :
                  return conditional_P08FI6(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).longValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (java.math.BigDecimal)dynConstraints[58] , ((Number) dynConstraints[63]).shortValue() );
            case 5 :
                  return conditional_P08FI7(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[49] , ((Number) dynConstraints[50]).longValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (java.math.BigDecimal)dynConstraints[58] , ((Number) dynConstraints[63]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FI3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FI4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FI5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FI6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FI7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               return;
      }
   }

}

