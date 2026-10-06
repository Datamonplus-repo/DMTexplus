package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_2_wpgetfilterdata extends GXProcedure
{
   public documentodetransporteproduccion_2_wpgetfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_2_wpgetfilterdata.class ), "" );
   }

   public documentodetransporteproduccion_2_wpgetfilterdata( int remoteHandle ,
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
      documentodetransporteproduccion_2_wpgetfilterdata.this.aP5 = new String[] {""};
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
      documentodetransporteproduccion_2_wpgetfilterdata.this.AV58DDOName = aP0;
      documentodetransporteproduccion_2_wpgetfilterdata.this.AV59SearchTxt = aP1;
      documentodetransporteproduccion_2_wpgetfilterdata.this.AV60SearchTxtTo = aP2;
      documentodetransporteproduccion_2_wpgetfilterdata.this.aP3 = aP3;
      documentodetransporteproduccion_2_wpgetfilterdata.this.aP4 = aP4;
      documentodetransporteproduccion_2_wpgetfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV48Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV50OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV51OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV58DDOName), "DDO_ALBSERD") == 0 )
      {
         /* Execute user subroutine: 'LOADALBSERDOPTIONS' */
         S141 ();
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
         S151 ();
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
         S161 ();
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
         S171 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV61OptionsJson = AV48Options.toJSonString(false) ;
      AV62OptionsDescJson = AV50OptionsDesc.toJSonString(false) ;
      AV63OptionIndexesJson = AV51OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV53Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2_WPGridState"), "") == 0 )
      {
         AV55GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2_WPGridState"), null, null);
      }
      else
      {
         AV55GridState.fromxml(AV53Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2_WPGridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV56GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV44TFBarSit = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFBarSit_To = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER") == 0 )
         {
            AV12TFAlbSer = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER_SEL") == 0 )
         {
            AV13TFAlbSer_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD") == 0 )
         {
            AV14TFAlbSerD = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD_SEL") == 0 )
         {
            AV15TFAlbSerD_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM") == 0 )
         {
            AV16TFAlbColNom = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM_SEL") == 0 )
         {
            AV17TFAlbColNom_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNUM") == 0 )
         {
            AV18TFAlbColNum = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFAlbColNum_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI") == 0 )
         {
            AV20TFAlbNomCli = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI_SEL") == 0 )
         {
            AV21TFAlbNomCli_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV22TFBarAlbKgmE = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFBarAlbKgmE_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV24TFAlbHdrAnc = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFAlbHdrAnc_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV26TFAlbHdrgm2 = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFAlbHdrgm2_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV28TFBarAlbMtrE = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFBarAlbMtrE_To = CommonUtil.decimalVal( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV30TFBarAlbPie = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFBarAlbPie_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV32TFTubCod = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFTubCod_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV34TFBarAlbTub = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFBarAlbTub_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPLASCOD") == 0 )
         {
            AV36TFPlasCod = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFPlasCod_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPLAS") == 0 )
         {
            AV38TFBarAlbPlas = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarAlbPlas_To = (short)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV40TFAlbHdrObs = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV41TFAlbHdrObs_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV42TFAlbProVal_SelsJson = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV43TFAlbProVal_Sels.fromJSonString(AV42TFAlbProVal_SelsJson, null);
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV59SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV44TFBarSit ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV45TFBarSit_To ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV12TFAlbSer ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV14TFAlbSerD ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV20TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV30TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV32TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV33TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV34TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV36TFPlasCod ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV37TFPlasCod_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV38TFBarAlbPlas ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                           Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) ,
                                           Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                           AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                           AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                           Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) ,
                                           Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) ,
                                           Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) ,
                                           Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                           Integer.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           AV64EmprCod ,
                                           Long.valueOf(AV65AlbProCod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.LONG
                                           }
      });
      lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr), 11, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser), 16, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd), 26, "%") ;
      lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli), 13, "%") ;
      lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0ACE2 */
      pr_default.execute(0, new Object[] {AV64EmprCod, Long.valueOf(AV65AlbProCod), lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr, AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel, Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit), Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to), lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser, AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd, AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel, lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom, AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel, Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum), Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to), Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod), Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to), Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas), Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to), lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs, AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P0ACE2_A30AlbProCod[0] ;
         A396EmprCod = P0ACE2_A396EmprCod[0] ;
         A2839AlbProVal = P0ACE2_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0ACE2_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0ACE2_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0ACE2_A6466PlasCod[0] ;
         n6466PlasCod = P0ACE2_n6466PlasCod[0] ;
         A1266BarAlbTub = P0ACE2_A1266BarAlbTub[0] ;
         A1206TubCod = P0ACE2_A1206TubCod[0] ;
         n1206TubCod = P0ACE2_n1206TubCod[0] ;
         A1265BarAlbPie = P0ACE2_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0ACE2_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0ACE2_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0ACE2_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0ACE2_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0ACE2_A12232AlbNomCli[0] ;
         A3393AlbColNum = P0ACE2_A3393AlbColNum[0] ;
         A3392AlbColNom = P0ACE2_A3392AlbColNom[0] ;
         A8879AlbSerD = P0ACE2_A8879AlbSerD[0] ;
         A3391AlbSer = P0ACE2_A3391AlbSer[0] ;
         A213BarSit = P0ACE2_A213BarSit[0] ;
         A130BarCodPar = P0ACE2_A130BarCodPar[0] ;
         A132BarCodReo = P0ACE2_A132BarCodReo[0] ;
         A129BarCod = P0ACE2_A129BarCod[0] ;
         A213BarSit = P0ACE2_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV47Option = A13696BarNHdr ;
            AV46InsertIndex = 1 ;
            while ( ( AV46InsertIndex <= AV48Options.size() ) && ( GXutil.strcmp((String)AV48Options.elementAt(-1+AV46InsertIndex), AV47Option) < 0 ) )
            {
               AV46InsertIndex = (int)(AV46InsertIndex+1) ;
            }
            if ( ( AV46InsertIndex <= AV48Options.size() ) && ( GXutil.strcmp((String)AV48Options.elementAt(-1+AV46InsertIndex), AV47Option) == 0 ) )
            {
               AV52count = GXutil.lval( (String)AV51OptionIndexes.elementAt(-1+AV46InsertIndex)) ;
               AV52count = (long)(AV52count+1) ;
               AV51OptionIndexes.removeItem(AV46InsertIndex);
               AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), AV46InsertIndex);
            }
            else
            {
               AV48Options.add(AV47Option, AV46InsertIndex);
               AV51OptionIndexes.add("1", AV46InsertIndex);
            }
         }
         if ( AV48Options.size() == 50 )
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
      /* 'LOADALBSEROPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbSer = AV59SearchTxt ;
      AV13TFAlbSer_Sel = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV44TFBarSit ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV45TFBarSit_To ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV12TFAlbSer ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV14TFAlbSerD ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV20TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV30TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV32TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV33TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV34TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV36TFPlasCod ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV37TFPlasCod_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV38TFBarAlbPlas ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                           Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) ,
                                           Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                           AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                           AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                           Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) ,
                                           Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) ,
                                           Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) ,
                                           Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                           Integer.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           A396EmprCod ,
                                           AV64EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV65AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.LONG
                                           }
      });
      lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr), 11, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser), 16, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd), 26, "%") ;
      lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli), 13, "%") ;
      lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0ACE3 */
      pr_default.execute(1, new Object[] {AV64EmprCod, Long.valueOf(AV65AlbProCod), lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr, AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel, Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit), Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to), lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser, AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd, AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel, lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom, AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel, Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum), Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to), Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod), Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to), Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas), Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to), lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs, AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkACE3 = false ;
         A396EmprCod = P0ACE3_A396EmprCod[0] ;
         A30AlbProCod = P0ACE3_A30AlbProCod[0] ;
         A3391AlbSer = P0ACE3_A3391AlbSer[0] ;
         A2839AlbProVal = P0ACE3_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0ACE3_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0ACE3_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0ACE3_A6466PlasCod[0] ;
         n6466PlasCod = P0ACE3_n6466PlasCod[0] ;
         A1266BarAlbTub = P0ACE3_A1266BarAlbTub[0] ;
         A1206TubCod = P0ACE3_A1206TubCod[0] ;
         n1206TubCod = P0ACE3_n1206TubCod[0] ;
         A1265BarAlbPie = P0ACE3_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0ACE3_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0ACE3_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0ACE3_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0ACE3_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0ACE3_A12232AlbNomCli[0] ;
         A3393AlbColNum = P0ACE3_A3393AlbColNum[0] ;
         A3392AlbColNom = P0ACE3_A3392AlbColNom[0] ;
         A8879AlbSerD = P0ACE3_A8879AlbSerD[0] ;
         A213BarSit = P0ACE3_A213BarSit[0] ;
         A130BarCodPar = P0ACE3_A130BarCodPar[0] ;
         A132BarCodReo = P0ACE3_A132BarCodReo[0] ;
         A129BarCod = P0ACE3_A129BarCod[0] ;
         A213BarSit = P0ACE3_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0ACE3_A3391AlbSer[0], A3391AlbSer) == 0 ) )
         {
            brkACE3 = false ;
            A396EmprCod = P0ACE3_A396EmprCod[0] ;
            A30AlbProCod = P0ACE3_A30AlbProCod[0] ;
            A130BarCodPar = P0ACE3_A130BarCodPar[0] ;
            A132BarCodReo = P0ACE3_A132BarCodReo[0] ;
            A129BarCod = P0ACE3_A129BarCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brkACE3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A3391AlbSer)==0) )
         {
            AV47Option = A3391AlbSer ;
            AV48Options.add(AV47Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV48Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACE3 )
         {
            brkACE3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBSERDOPTIONS' Routine */
      returnInSub = false ;
      AV14TFAlbSerD = AV59SearchTxt ;
      AV15TFAlbSerD_Sel = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV44TFBarSit ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV45TFBarSit_To ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV12TFAlbSer ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV14TFAlbSerD ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV20TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV30TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV32TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV33TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV34TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV36TFPlasCod ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV37TFPlasCod_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV38TFBarAlbPlas ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                           Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) ,
                                           Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                           AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                           AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                           Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) ,
                                           Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) ,
                                           Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) ,
                                           Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                           Integer.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           A396EmprCod ,
                                           AV64EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV65AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.LONG
                                           }
      });
      lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr), 11, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser), 16, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd), 26, "%") ;
      lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli), 13, "%") ;
      lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0ACE4 */
      pr_default.execute(2, new Object[] {AV64EmprCod, Long.valueOf(AV65AlbProCod), lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr, AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel, Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit), Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to), lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser, AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd, AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel, lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom, AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel, Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum), Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to), Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod), Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to), Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas), Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to), lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs, AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkACE5 = false ;
         A396EmprCod = P0ACE4_A396EmprCod[0] ;
         A30AlbProCod = P0ACE4_A30AlbProCod[0] ;
         A8879AlbSerD = P0ACE4_A8879AlbSerD[0] ;
         A2839AlbProVal = P0ACE4_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0ACE4_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0ACE4_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0ACE4_A6466PlasCod[0] ;
         n6466PlasCod = P0ACE4_n6466PlasCod[0] ;
         A1266BarAlbTub = P0ACE4_A1266BarAlbTub[0] ;
         A1206TubCod = P0ACE4_A1206TubCod[0] ;
         n1206TubCod = P0ACE4_n1206TubCod[0] ;
         A1265BarAlbPie = P0ACE4_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0ACE4_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0ACE4_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0ACE4_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0ACE4_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0ACE4_A12232AlbNomCli[0] ;
         A3393AlbColNum = P0ACE4_A3393AlbColNum[0] ;
         A3392AlbColNom = P0ACE4_A3392AlbColNom[0] ;
         A3391AlbSer = P0ACE4_A3391AlbSer[0] ;
         A213BarSit = P0ACE4_A213BarSit[0] ;
         A130BarCodPar = P0ACE4_A130BarCodPar[0] ;
         A132BarCodReo = P0ACE4_A132BarCodReo[0] ;
         A129BarCod = P0ACE4_A129BarCod[0] ;
         A213BarSit = P0ACE4_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0ACE4_A8879AlbSerD[0], A8879AlbSerD) == 0 ) )
         {
            brkACE5 = false ;
            A396EmprCod = P0ACE4_A396EmprCod[0] ;
            A30AlbProCod = P0ACE4_A30AlbProCod[0] ;
            A130BarCodPar = P0ACE4_A130BarCodPar[0] ;
            A132BarCodReo = P0ACE4_A132BarCodReo[0] ;
            A129BarCod = P0ACE4_A129BarCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brkACE5 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A8879AlbSerD)==0) )
         {
            AV47Option = A8879AlbSerD ;
            AV48Options.add(AV47Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV48Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACE5 )
         {
            brkACE5 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFAlbColNom = AV59SearchTxt ;
      AV17TFAlbColNom_Sel = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV44TFBarSit ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV45TFBarSit_To ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV12TFAlbSer ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV14TFAlbSerD ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV20TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV30TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV32TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV33TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV34TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV36TFPlasCod ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV37TFPlasCod_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV38TFBarAlbPlas ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                           Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) ,
                                           Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                           AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                           AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                           Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) ,
                                           Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) ,
                                           Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) ,
                                           Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                           Integer.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           A396EmprCod ,
                                           AV64EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV65AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.LONG
                                           }
      });
      lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr), 11, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser), 16, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd), 26, "%") ;
      lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli), 13, "%") ;
      lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0ACE5 */
      pr_default.execute(3, new Object[] {AV64EmprCod, Long.valueOf(AV65AlbProCod), lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr, AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel, Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit), Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to), lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser, AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd, AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel, lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom, AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel, Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum), Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to), Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod), Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to), Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas), Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to), lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs, AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkACE7 = false ;
         A396EmprCod = P0ACE5_A396EmprCod[0] ;
         A30AlbProCod = P0ACE5_A30AlbProCod[0] ;
         A3392AlbColNom = P0ACE5_A3392AlbColNom[0] ;
         A2839AlbProVal = P0ACE5_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0ACE5_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0ACE5_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0ACE5_A6466PlasCod[0] ;
         n6466PlasCod = P0ACE5_n6466PlasCod[0] ;
         A1266BarAlbTub = P0ACE5_A1266BarAlbTub[0] ;
         A1206TubCod = P0ACE5_A1206TubCod[0] ;
         n1206TubCod = P0ACE5_n1206TubCod[0] ;
         A1265BarAlbPie = P0ACE5_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0ACE5_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0ACE5_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0ACE5_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0ACE5_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0ACE5_A12232AlbNomCli[0] ;
         A3393AlbColNum = P0ACE5_A3393AlbColNum[0] ;
         A8879AlbSerD = P0ACE5_A8879AlbSerD[0] ;
         A3391AlbSer = P0ACE5_A3391AlbSer[0] ;
         A213BarSit = P0ACE5_A213BarSit[0] ;
         A130BarCodPar = P0ACE5_A130BarCodPar[0] ;
         A132BarCodReo = P0ACE5_A132BarCodReo[0] ;
         A129BarCod = P0ACE5_A129BarCod[0] ;
         A213BarSit = P0ACE5_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0ACE5_A3392AlbColNom[0], A3392AlbColNom) == 0 ) )
         {
            brkACE7 = false ;
            A396EmprCod = P0ACE5_A396EmprCod[0] ;
            A30AlbProCod = P0ACE5_A30AlbProCod[0] ;
            A130BarCodPar = P0ACE5_A130BarCodPar[0] ;
            A132BarCodReo = P0ACE5_A132BarCodReo[0] ;
            A129BarCod = P0ACE5_A129BarCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brkACE7 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A3392AlbColNom)==0) )
         {
            AV47Option = A3392AlbColNom ;
            AV48Options.add(AV47Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV48Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACE7 )
         {
            brkACE7 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV20TFAlbNomCli = AV59SearchTxt ;
      AV21TFAlbNomCli_Sel = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV44TFBarSit ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV45TFBarSit_To ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV12TFAlbSer ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV14TFAlbSerD ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV20TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV30TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV32TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV33TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV34TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV36TFPlasCod ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV37TFPlasCod_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV38TFBarAlbPlas ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                           Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) ,
                                           Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                           AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                           AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                           Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) ,
                                           Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) ,
                                           Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) ,
                                           Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                           Integer.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           A396EmprCod ,
                                           AV64EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV65AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.LONG
                                           }
      });
      lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr), 11, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser), 16, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd), 26, "%") ;
      lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli), 13, "%") ;
      lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0ACE6 */
      pr_default.execute(4, new Object[] {AV64EmprCod, Long.valueOf(AV65AlbProCod), lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr, AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel, Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit), Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to), lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser, AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd, AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel, lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom, AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel, Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum), Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to), Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod), Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to), Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas), Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to), lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs, AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkACE9 = false ;
         A396EmprCod = P0ACE6_A396EmprCod[0] ;
         A30AlbProCod = P0ACE6_A30AlbProCod[0] ;
         A12232AlbNomCli = P0ACE6_A12232AlbNomCli[0] ;
         A2839AlbProVal = P0ACE6_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0ACE6_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0ACE6_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0ACE6_A6466PlasCod[0] ;
         n6466PlasCod = P0ACE6_n6466PlasCod[0] ;
         A1266BarAlbTub = P0ACE6_A1266BarAlbTub[0] ;
         A1206TubCod = P0ACE6_A1206TubCod[0] ;
         n1206TubCod = P0ACE6_n1206TubCod[0] ;
         A1265BarAlbPie = P0ACE6_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0ACE6_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0ACE6_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0ACE6_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0ACE6_A1261BarAlbKgmE[0] ;
         A3393AlbColNum = P0ACE6_A3393AlbColNum[0] ;
         A3392AlbColNom = P0ACE6_A3392AlbColNom[0] ;
         A8879AlbSerD = P0ACE6_A8879AlbSerD[0] ;
         A3391AlbSer = P0ACE6_A3391AlbSer[0] ;
         A213BarSit = P0ACE6_A213BarSit[0] ;
         A130BarCodPar = P0ACE6_A130BarCodPar[0] ;
         A132BarCodReo = P0ACE6_A132BarCodReo[0] ;
         A129BarCod = P0ACE6_A129BarCod[0] ;
         A213BarSit = P0ACE6_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0ACE6_A12232AlbNomCli[0], A12232AlbNomCli) == 0 ) )
         {
            brkACE9 = false ;
            A396EmprCod = P0ACE6_A396EmprCod[0] ;
            A30AlbProCod = P0ACE6_A30AlbProCod[0] ;
            A130BarCodPar = P0ACE6_A130BarCodPar[0] ;
            A132BarCodReo = P0ACE6_A132BarCodReo[0] ;
            A129BarCod = P0ACE6_A129BarCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brkACE9 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A12232AlbNomCli)==0) )
         {
            AV47Option = A12232AlbNomCli ;
            AV48Options.add(AV47Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV48Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACE9 )
         {
            brkACE9 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADALBHDROBSOPTIONS' Routine */
      returnInSub = false ;
      AV40TFAlbHdrObs = AV59SearchTxt ;
      AV41TFAlbHdrObs_Sel = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit = AV44TFBarSit ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to = AV45TFBarSit_To ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = AV12TFAlbSer ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = AV14TFAlbSerD ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = AV20TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie = AV30TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod = AV32TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to = AV33TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub = AV34TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod = AV36TFPlasCod ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to = AV37TFPlasCod_To ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas = AV38TFBarAlbPlas ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                           Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) ,
                                           Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                           AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                           AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                           Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) ,
                                           Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) ,
                                           Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) ,
                                           Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) ,
                                           AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                           AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                           Integer.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           A396EmprCod ,
                                           AV64EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV65AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG,
                                           TypeConstants.LONG
                                           }
      });
      lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr), 11, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser), 16, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd), 26, "%") ;
      lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli), 13, "%") ;
      lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0ACE7 */
      pr_default.execute(5, new Object[] {AV64EmprCod, Long.valueOf(AV65AlbProCod), lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr, AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel, Byte.valueOf(AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit), Byte.valueOf(AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to), lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser, AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd, AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel, lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom, AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel, Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum), Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to), Short.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod), Short.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to), Short.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas), Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to), lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs, AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkACE11 = false ;
         A396EmprCod = P0ACE7_A396EmprCod[0] ;
         A30AlbProCod = P0ACE7_A30AlbProCod[0] ;
         A2441AlbHdrObs = P0ACE7_A2441AlbHdrObs[0] ;
         A2839AlbProVal = P0ACE7_A2839AlbProVal[0] ;
         A6467BarAlbPlas = P0ACE7_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0ACE7_A6466PlasCod[0] ;
         n6466PlasCod = P0ACE7_n6466PlasCod[0] ;
         A1266BarAlbTub = P0ACE7_A1266BarAlbTub[0] ;
         A1206TubCod = P0ACE7_A1206TubCod[0] ;
         n1206TubCod = P0ACE7_n1206TubCod[0] ;
         A1265BarAlbPie = P0ACE7_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0ACE7_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0ACE7_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0ACE7_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0ACE7_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0ACE7_A12232AlbNomCli[0] ;
         A3393AlbColNum = P0ACE7_A3393AlbColNum[0] ;
         A3392AlbColNom = P0ACE7_A3392AlbColNom[0] ;
         A8879AlbSerD = P0ACE7_A8879AlbSerD[0] ;
         A3391AlbSer = P0ACE7_A3391AlbSer[0] ;
         A213BarSit = P0ACE7_A213BarSit[0] ;
         A130BarCodPar = P0ACE7_A130BarCodPar[0] ;
         A132BarCodReo = P0ACE7_A132BarCodReo[0] ;
         A129BarCod = P0ACE7_A129BarCod[0] ;
         A213BarSit = P0ACE7_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV52count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0ACE7_A2441AlbHdrObs[0], A2441AlbHdrObs) == 0 ) )
         {
            brkACE11 = false ;
            A396EmprCod = P0ACE7_A396EmprCod[0] ;
            A30AlbProCod = P0ACE7_A30AlbProCod[0] ;
            A130BarCodPar = P0ACE7_A130BarCodPar[0] ;
            A132BarCodReo = P0ACE7_A132BarCodReo[0] ;
            A129BarCod = P0ACE7_A129BarCod[0] ;
            AV52count = (long)(AV52count+1) ;
            brkACE11 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A2441AlbHdrObs)==0) )
         {
            AV47Option = A2441AlbHdrObs ;
            AV48Options.add(AV47Option, 0);
            AV51OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV52count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV48Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkACE11 )
         {
            brkACE11 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentodetransporteproduccion_2_wpgetfilterdata.this.AV61OptionsJson;
      this.aP4[0] = documentodetransporteproduccion_2_wpgetfilterdata.this.AV62OptionsDescJson;
      this.aP5[0] = documentodetransporteproduccion_2_wpgetfilterdata.this.AV63OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV61OptionsJson = "" ;
      AV62OptionsDescJson = "" ;
      AV63OptionIndexesJson = "" ;
      AV48Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV50OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV51OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV53Session = httpContext.getWebSession();
      AV55GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV56GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV12TFAlbSer = "" ;
      AV13TFAlbSer_Sel = "" ;
      AV14TFAlbSerD = "" ;
      AV15TFAlbSerD_Sel = "" ;
      AV16TFAlbColNom = "" ;
      AV17TFAlbColNom_Sel = "" ;
      AV20TFAlbNomCli = "" ;
      AV21TFAlbNomCli_Sel = "" ;
      AV22TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV23TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV28TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV29TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV40TFAlbHdrObs = "" ;
      AV41TFAlbHdrObs_Sel = "" ;
      AV42TFAlbProVal_SelsJson = "" ;
      AV43TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A13696BarNHdr = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = "" ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel = "" ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = "" ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel = "" ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = "" ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel = "" ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = "" ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel = "" ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel = "" ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme = DecimalUtil.ZERO ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre = DecimalUtil.ZERO ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = "" ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel = "" ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr = "" ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser = "" ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd = "" ;
      lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom = "" ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli = "" ;
      lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs = "" ;
      A2839AlbProVal = "" ;
      A130BarCodPar = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2441AlbHdrObs = "" ;
      AV64EmprCod = "" ;
      A396EmprCod = "" ;
      P0ACE2_A30AlbProCod = new long[1] ;
      P0ACE2_A396EmprCod = new String[] {""} ;
      P0ACE2_A2839AlbProVal = new String[] {""} ;
      P0ACE2_A2441AlbHdrObs = new String[] {""} ;
      P0ACE2_A6467BarAlbPlas = new short[1] ;
      P0ACE2_A6466PlasCod = new short[1] ;
      P0ACE2_n6466PlasCod = new boolean[] {false} ;
      P0ACE2_A1266BarAlbTub = new int[1] ;
      P0ACE2_A1206TubCod = new short[1] ;
      P0ACE2_n1206TubCod = new boolean[] {false} ;
      P0ACE2_A1265BarAlbPie = new int[1] ;
      P0ACE2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE2_A5019AlbHdrgm2 = new short[1] ;
      P0ACE2_A3271AlbHdrAnc = new short[1] ;
      P0ACE2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE2_A12232AlbNomCli = new String[] {""} ;
      P0ACE2_A3393AlbColNum = new int[1] ;
      P0ACE2_A3392AlbColNom = new String[] {""} ;
      P0ACE2_A8879AlbSerD = new String[] {""} ;
      P0ACE2_A3391AlbSer = new String[] {""} ;
      P0ACE2_A213BarSit = new byte[1] ;
      P0ACE2_A130BarCodPar = new String[] {""} ;
      P0ACE2_A132BarCodReo = new byte[1] ;
      P0ACE2_A129BarCod = new int[1] ;
      AV47Option = "" ;
      P0ACE3_A396EmprCod = new String[] {""} ;
      P0ACE3_A30AlbProCod = new long[1] ;
      P0ACE3_A3391AlbSer = new String[] {""} ;
      P0ACE3_A2839AlbProVal = new String[] {""} ;
      P0ACE3_A2441AlbHdrObs = new String[] {""} ;
      P0ACE3_A6467BarAlbPlas = new short[1] ;
      P0ACE3_A6466PlasCod = new short[1] ;
      P0ACE3_n6466PlasCod = new boolean[] {false} ;
      P0ACE3_A1266BarAlbTub = new int[1] ;
      P0ACE3_A1206TubCod = new short[1] ;
      P0ACE3_n1206TubCod = new boolean[] {false} ;
      P0ACE3_A1265BarAlbPie = new int[1] ;
      P0ACE3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE3_A5019AlbHdrgm2 = new short[1] ;
      P0ACE3_A3271AlbHdrAnc = new short[1] ;
      P0ACE3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE3_A12232AlbNomCli = new String[] {""} ;
      P0ACE3_A3393AlbColNum = new int[1] ;
      P0ACE3_A3392AlbColNom = new String[] {""} ;
      P0ACE3_A8879AlbSerD = new String[] {""} ;
      P0ACE3_A213BarSit = new byte[1] ;
      P0ACE3_A130BarCodPar = new String[] {""} ;
      P0ACE3_A132BarCodReo = new byte[1] ;
      P0ACE3_A129BarCod = new int[1] ;
      P0ACE4_A396EmprCod = new String[] {""} ;
      P0ACE4_A30AlbProCod = new long[1] ;
      P0ACE4_A8879AlbSerD = new String[] {""} ;
      P0ACE4_A2839AlbProVal = new String[] {""} ;
      P0ACE4_A2441AlbHdrObs = new String[] {""} ;
      P0ACE4_A6467BarAlbPlas = new short[1] ;
      P0ACE4_A6466PlasCod = new short[1] ;
      P0ACE4_n6466PlasCod = new boolean[] {false} ;
      P0ACE4_A1266BarAlbTub = new int[1] ;
      P0ACE4_A1206TubCod = new short[1] ;
      P0ACE4_n1206TubCod = new boolean[] {false} ;
      P0ACE4_A1265BarAlbPie = new int[1] ;
      P0ACE4_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE4_A5019AlbHdrgm2 = new short[1] ;
      P0ACE4_A3271AlbHdrAnc = new short[1] ;
      P0ACE4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE4_A12232AlbNomCli = new String[] {""} ;
      P0ACE4_A3393AlbColNum = new int[1] ;
      P0ACE4_A3392AlbColNom = new String[] {""} ;
      P0ACE4_A3391AlbSer = new String[] {""} ;
      P0ACE4_A213BarSit = new byte[1] ;
      P0ACE4_A130BarCodPar = new String[] {""} ;
      P0ACE4_A132BarCodReo = new byte[1] ;
      P0ACE4_A129BarCod = new int[1] ;
      P0ACE5_A396EmprCod = new String[] {""} ;
      P0ACE5_A30AlbProCod = new long[1] ;
      P0ACE5_A3392AlbColNom = new String[] {""} ;
      P0ACE5_A2839AlbProVal = new String[] {""} ;
      P0ACE5_A2441AlbHdrObs = new String[] {""} ;
      P0ACE5_A6467BarAlbPlas = new short[1] ;
      P0ACE5_A6466PlasCod = new short[1] ;
      P0ACE5_n6466PlasCod = new boolean[] {false} ;
      P0ACE5_A1266BarAlbTub = new int[1] ;
      P0ACE5_A1206TubCod = new short[1] ;
      P0ACE5_n1206TubCod = new boolean[] {false} ;
      P0ACE5_A1265BarAlbPie = new int[1] ;
      P0ACE5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE5_A5019AlbHdrgm2 = new short[1] ;
      P0ACE5_A3271AlbHdrAnc = new short[1] ;
      P0ACE5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE5_A12232AlbNomCli = new String[] {""} ;
      P0ACE5_A3393AlbColNum = new int[1] ;
      P0ACE5_A8879AlbSerD = new String[] {""} ;
      P0ACE5_A3391AlbSer = new String[] {""} ;
      P0ACE5_A213BarSit = new byte[1] ;
      P0ACE5_A130BarCodPar = new String[] {""} ;
      P0ACE5_A132BarCodReo = new byte[1] ;
      P0ACE5_A129BarCod = new int[1] ;
      P0ACE6_A396EmprCod = new String[] {""} ;
      P0ACE6_A30AlbProCod = new long[1] ;
      P0ACE6_A12232AlbNomCli = new String[] {""} ;
      P0ACE6_A2839AlbProVal = new String[] {""} ;
      P0ACE6_A2441AlbHdrObs = new String[] {""} ;
      P0ACE6_A6467BarAlbPlas = new short[1] ;
      P0ACE6_A6466PlasCod = new short[1] ;
      P0ACE6_n6466PlasCod = new boolean[] {false} ;
      P0ACE6_A1266BarAlbTub = new int[1] ;
      P0ACE6_A1206TubCod = new short[1] ;
      P0ACE6_n1206TubCod = new boolean[] {false} ;
      P0ACE6_A1265BarAlbPie = new int[1] ;
      P0ACE6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE6_A5019AlbHdrgm2 = new short[1] ;
      P0ACE6_A3271AlbHdrAnc = new short[1] ;
      P0ACE6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE6_A3393AlbColNum = new int[1] ;
      P0ACE6_A3392AlbColNom = new String[] {""} ;
      P0ACE6_A8879AlbSerD = new String[] {""} ;
      P0ACE6_A3391AlbSer = new String[] {""} ;
      P0ACE6_A213BarSit = new byte[1] ;
      P0ACE6_A130BarCodPar = new String[] {""} ;
      P0ACE6_A132BarCodReo = new byte[1] ;
      P0ACE6_A129BarCod = new int[1] ;
      P0ACE7_A396EmprCod = new String[] {""} ;
      P0ACE7_A30AlbProCod = new long[1] ;
      P0ACE7_A2441AlbHdrObs = new String[] {""} ;
      P0ACE7_A2839AlbProVal = new String[] {""} ;
      P0ACE7_A6467BarAlbPlas = new short[1] ;
      P0ACE7_A6466PlasCod = new short[1] ;
      P0ACE7_n6466PlasCod = new boolean[] {false} ;
      P0ACE7_A1266BarAlbTub = new int[1] ;
      P0ACE7_A1206TubCod = new short[1] ;
      P0ACE7_n1206TubCod = new boolean[] {false} ;
      P0ACE7_A1265BarAlbPie = new int[1] ;
      P0ACE7_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE7_A5019AlbHdrgm2 = new short[1] ;
      P0ACE7_A3271AlbHdrAnc = new short[1] ;
      P0ACE7_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0ACE7_A12232AlbNomCli = new String[] {""} ;
      P0ACE7_A3393AlbColNum = new int[1] ;
      P0ACE7_A3392AlbColNom = new String[] {""} ;
      P0ACE7_A8879AlbSerD = new String[] {""} ;
      P0ACE7_A3391AlbSer = new String[] {""} ;
      P0ACE7_A213BarSit = new byte[1] ;
      P0ACE7_A130BarCodPar = new String[] {""} ;
      P0ACE7_A132BarCodReo = new byte[1] ;
      P0ACE7_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_2_wpgetfilterdata__default(),
         new Object[] {
             new Object[] {
            P0ACE2_A30AlbProCod, P0ACE2_A396EmprCod, P0ACE2_A2839AlbProVal, P0ACE2_A2441AlbHdrObs, P0ACE2_A6467BarAlbPlas, P0ACE2_A6466PlasCod, P0ACE2_n6466PlasCod, P0ACE2_A1266BarAlbTub, P0ACE2_A1206TubCod, P0ACE2_n1206TubCod,
            P0ACE2_A1265BarAlbPie, P0ACE2_A1263BarAlbMtrE, P0ACE2_A5019AlbHdrgm2, P0ACE2_A3271AlbHdrAnc, P0ACE2_A1261BarAlbKgmE, P0ACE2_A12232AlbNomCli, P0ACE2_A3393AlbColNum, P0ACE2_A3392AlbColNom, P0ACE2_A8879AlbSerD, P0ACE2_A3391AlbSer,
            P0ACE2_A213BarSit, P0ACE2_A130BarCodPar, P0ACE2_A132BarCodReo, P0ACE2_A129BarCod
            }
            , new Object[] {
            P0ACE3_A396EmprCod, P0ACE3_A30AlbProCod, P0ACE3_A3391AlbSer, P0ACE3_A2839AlbProVal, P0ACE3_A2441AlbHdrObs, P0ACE3_A6467BarAlbPlas, P0ACE3_A6466PlasCod, P0ACE3_n6466PlasCod, P0ACE3_A1266BarAlbTub, P0ACE3_A1206TubCod,
            P0ACE3_n1206TubCod, P0ACE3_A1265BarAlbPie, P0ACE3_A1263BarAlbMtrE, P0ACE3_A5019AlbHdrgm2, P0ACE3_A3271AlbHdrAnc, P0ACE3_A1261BarAlbKgmE, P0ACE3_A12232AlbNomCli, P0ACE3_A3393AlbColNum, P0ACE3_A3392AlbColNom, P0ACE3_A8879AlbSerD,
            P0ACE3_A213BarSit, P0ACE3_A130BarCodPar, P0ACE3_A132BarCodReo, P0ACE3_A129BarCod
            }
            , new Object[] {
            P0ACE4_A396EmprCod, P0ACE4_A30AlbProCod, P0ACE4_A8879AlbSerD, P0ACE4_A2839AlbProVal, P0ACE4_A2441AlbHdrObs, P0ACE4_A6467BarAlbPlas, P0ACE4_A6466PlasCod, P0ACE4_n6466PlasCod, P0ACE4_A1266BarAlbTub, P0ACE4_A1206TubCod,
            P0ACE4_n1206TubCod, P0ACE4_A1265BarAlbPie, P0ACE4_A1263BarAlbMtrE, P0ACE4_A5019AlbHdrgm2, P0ACE4_A3271AlbHdrAnc, P0ACE4_A1261BarAlbKgmE, P0ACE4_A12232AlbNomCli, P0ACE4_A3393AlbColNum, P0ACE4_A3392AlbColNom, P0ACE4_A3391AlbSer,
            P0ACE4_A213BarSit, P0ACE4_A130BarCodPar, P0ACE4_A132BarCodReo, P0ACE4_A129BarCod
            }
            , new Object[] {
            P0ACE5_A396EmprCod, P0ACE5_A30AlbProCod, P0ACE5_A3392AlbColNom, P0ACE5_A2839AlbProVal, P0ACE5_A2441AlbHdrObs, P0ACE5_A6467BarAlbPlas, P0ACE5_A6466PlasCod, P0ACE5_n6466PlasCod, P0ACE5_A1266BarAlbTub, P0ACE5_A1206TubCod,
            P0ACE5_n1206TubCod, P0ACE5_A1265BarAlbPie, P0ACE5_A1263BarAlbMtrE, P0ACE5_A5019AlbHdrgm2, P0ACE5_A3271AlbHdrAnc, P0ACE5_A1261BarAlbKgmE, P0ACE5_A12232AlbNomCli, P0ACE5_A3393AlbColNum, P0ACE5_A8879AlbSerD, P0ACE5_A3391AlbSer,
            P0ACE5_A213BarSit, P0ACE5_A130BarCodPar, P0ACE5_A132BarCodReo, P0ACE5_A129BarCod
            }
            , new Object[] {
            P0ACE6_A396EmprCod, P0ACE6_A30AlbProCod, P0ACE6_A12232AlbNomCli, P0ACE6_A2839AlbProVal, P0ACE6_A2441AlbHdrObs, P0ACE6_A6467BarAlbPlas, P0ACE6_A6466PlasCod, P0ACE6_n6466PlasCod, P0ACE6_A1266BarAlbTub, P0ACE6_A1206TubCod,
            P0ACE6_n1206TubCod, P0ACE6_A1265BarAlbPie, P0ACE6_A1263BarAlbMtrE, P0ACE6_A5019AlbHdrgm2, P0ACE6_A3271AlbHdrAnc, P0ACE6_A1261BarAlbKgmE, P0ACE6_A3393AlbColNum, P0ACE6_A3392AlbColNom, P0ACE6_A8879AlbSerD, P0ACE6_A3391AlbSer,
            P0ACE6_A213BarSit, P0ACE6_A130BarCodPar, P0ACE6_A132BarCodReo, P0ACE6_A129BarCod
            }
            , new Object[] {
            P0ACE7_A396EmprCod, P0ACE7_A30AlbProCod, P0ACE7_A2441AlbHdrObs, P0ACE7_A2839AlbProVal, P0ACE7_A6467BarAlbPlas, P0ACE7_A6466PlasCod, P0ACE7_n6466PlasCod, P0ACE7_A1266BarAlbTub, P0ACE7_A1206TubCod, P0ACE7_n1206TubCod,
            P0ACE7_A1265BarAlbPie, P0ACE7_A1263BarAlbMtrE, P0ACE7_A5019AlbHdrgm2, P0ACE7_A3271AlbHdrAnc, P0ACE7_A1261BarAlbKgmE, P0ACE7_A12232AlbNomCli, P0ACE7_A3393AlbColNum, P0ACE7_A3392AlbColNom, P0ACE7_A8879AlbSerD, P0ACE7_A3391AlbSer,
            P0ACE7_A213BarSit, P0ACE7_A130BarCodPar, P0ACE7_A132BarCodReo, P0ACE7_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV44TFBarSit ;
   private byte AV45TFBarSit_To ;
   private byte AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit ;
   private byte AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short AV24TFAlbHdrAnc ;
   private short AV25TFAlbHdrAnc_To ;
   private short AV26TFAlbHdrgm2 ;
   private short AV27TFAlbHdrgm2_To ;
   private short AV32TFTubCod ;
   private short AV33TFTubCod_To ;
   private short AV36TFPlasCod ;
   private short AV37TFPlasCod_To ;
   private short AV38TFBarAlbPlas ;
   private short AV39TFBarAlbPlas_To ;
   private short AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc ;
   private short AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to ;
   private short AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 ;
   private short AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to ;
   private short AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod ;
   private short AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to ;
   private short AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod ;
   private short AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to ;
   private short AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas ;
   private short AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short Gx_err ;
   private int AV68GXV1 ;
   private int AV18TFAlbColNum ;
   private int AV19TFAlbColNum_To ;
   private int AV30TFBarAlbPie ;
   private int AV31TFBarAlbPie_To ;
   private int AV34TFBarAlbTub ;
   private int AV35TFBarAlbTub_To ;
   private int AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum ;
   private int AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to ;
   private int AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie ;
   private int AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to ;
   private int AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub ;
   private int AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to ;
   private int AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size ;
   private int A129BarCod ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int AV46InsertIndex ;
   private long AV65AlbProCod ;
   private long A30AlbProCod ;
   private long AV52count ;
   private java.math.BigDecimal AV22TFBarAlbKgmE ;
   private java.math.BigDecimal AV23TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV28TFBarAlbMtrE ;
   private java.math.BigDecimal AV29TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ;
   private java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ;
   private java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ;
   private java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV12TFAlbSer ;
   private String AV13TFAlbSer_Sel ;
   private String AV14TFAlbSerD ;
   private String AV15TFAlbSerD_Sel ;
   private String AV16TFAlbColNom ;
   private String AV17TFAlbColNom_Sel ;
   private String AV20TFAlbNomCli ;
   private String AV21TFAlbNomCli_Sel ;
   private String AV40TFAlbHdrObs ;
   private String AV41TFAlbHdrObs_Sel ;
   private String A13696BarNHdr ;
   private String AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ;
   private String AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ;
   private String AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ;
   private String AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ;
   private String AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ;
   private String AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ;
   private String AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ;
   private String AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ;
   private String AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ;
   private String AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ;
   private String AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ;
   private String AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ;
   private String scmdbuf ;
   private String lV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ;
   private String lV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ;
   private String lV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ;
   private String lV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ;
   private String lV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ;
   private String lV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ;
   private String A2839AlbProVal ;
   private String A130BarCodPar ;
   private String A3391AlbSer ;
   private String A8879AlbSerD ;
   private String A3392AlbColNom ;
   private String A12232AlbNomCli ;
   private String A2441AlbHdrObs ;
   private String AV64EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n6466PlasCod ;
   private boolean n1206TubCod ;
   private boolean brkACE3 ;
   private boolean brkACE5 ;
   private boolean brkACE7 ;
   private boolean brkACE9 ;
   private boolean brkACE11 ;
   private String AV61OptionsJson ;
   private String AV62OptionsDescJson ;
   private String AV63OptionIndexesJson ;
   private String AV42TFAlbProVal_SelsJson ;
   private String AV58DDOName ;
   private String AV59SearchTxt ;
   private String AV60SearchTxtTo ;
   private String AV47Option ;
   private com.genexus.webpanels.WebSession AV53Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P0ACE2_A30AlbProCod ;
   private String[] P0ACE2_A396EmprCod ;
   private String[] P0ACE2_A2839AlbProVal ;
   private String[] P0ACE2_A2441AlbHdrObs ;
   private short[] P0ACE2_A6467BarAlbPlas ;
   private short[] P0ACE2_A6466PlasCod ;
   private boolean[] P0ACE2_n6466PlasCod ;
   private int[] P0ACE2_A1266BarAlbTub ;
   private short[] P0ACE2_A1206TubCod ;
   private boolean[] P0ACE2_n1206TubCod ;
   private int[] P0ACE2_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0ACE2_A1263BarAlbMtrE ;
   private short[] P0ACE2_A5019AlbHdrgm2 ;
   private short[] P0ACE2_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0ACE2_A1261BarAlbKgmE ;
   private String[] P0ACE2_A12232AlbNomCli ;
   private int[] P0ACE2_A3393AlbColNum ;
   private String[] P0ACE2_A3392AlbColNom ;
   private String[] P0ACE2_A8879AlbSerD ;
   private String[] P0ACE2_A3391AlbSer ;
   private byte[] P0ACE2_A213BarSit ;
   private String[] P0ACE2_A130BarCodPar ;
   private byte[] P0ACE2_A132BarCodReo ;
   private int[] P0ACE2_A129BarCod ;
   private String[] P0ACE3_A396EmprCod ;
   private long[] P0ACE3_A30AlbProCod ;
   private String[] P0ACE3_A3391AlbSer ;
   private String[] P0ACE3_A2839AlbProVal ;
   private String[] P0ACE3_A2441AlbHdrObs ;
   private short[] P0ACE3_A6467BarAlbPlas ;
   private short[] P0ACE3_A6466PlasCod ;
   private boolean[] P0ACE3_n6466PlasCod ;
   private int[] P0ACE3_A1266BarAlbTub ;
   private short[] P0ACE3_A1206TubCod ;
   private boolean[] P0ACE3_n1206TubCod ;
   private int[] P0ACE3_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0ACE3_A1263BarAlbMtrE ;
   private short[] P0ACE3_A5019AlbHdrgm2 ;
   private short[] P0ACE3_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0ACE3_A1261BarAlbKgmE ;
   private String[] P0ACE3_A12232AlbNomCli ;
   private int[] P0ACE3_A3393AlbColNum ;
   private String[] P0ACE3_A3392AlbColNom ;
   private String[] P0ACE3_A8879AlbSerD ;
   private byte[] P0ACE3_A213BarSit ;
   private String[] P0ACE3_A130BarCodPar ;
   private byte[] P0ACE3_A132BarCodReo ;
   private int[] P0ACE3_A129BarCod ;
   private String[] P0ACE4_A396EmprCod ;
   private long[] P0ACE4_A30AlbProCod ;
   private String[] P0ACE4_A8879AlbSerD ;
   private String[] P0ACE4_A2839AlbProVal ;
   private String[] P0ACE4_A2441AlbHdrObs ;
   private short[] P0ACE4_A6467BarAlbPlas ;
   private short[] P0ACE4_A6466PlasCod ;
   private boolean[] P0ACE4_n6466PlasCod ;
   private int[] P0ACE4_A1266BarAlbTub ;
   private short[] P0ACE4_A1206TubCod ;
   private boolean[] P0ACE4_n1206TubCod ;
   private int[] P0ACE4_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0ACE4_A1263BarAlbMtrE ;
   private short[] P0ACE4_A5019AlbHdrgm2 ;
   private short[] P0ACE4_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0ACE4_A1261BarAlbKgmE ;
   private String[] P0ACE4_A12232AlbNomCli ;
   private int[] P0ACE4_A3393AlbColNum ;
   private String[] P0ACE4_A3392AlbColNom ;
   private String[] P0ACE4_A3391AlbSer ;
   private byte[] P0ACE4_A213BarSit ;
   private String[] P0ACE4_A130BarCodPar ;
   private byte[] P0ACE4_A132BarCodReo ;
   private int[] P0ACE4_A129BarCod ;
   private String[] P0ACE5_A396EmprCod ;
   private long[] P0ACE5_A30AlbProCod ;
   private String[] P0ACE5_A3392AlbColNom ;
   private String[] P0ACE5_A2839AlbProVal ;
   private String[] P0ACE5_A2441AlbHdrObs ;
   private short[] P0ACE5_A6467BarAlbPlas ;
   private short[] P0ACE5_A6466PlasCod ;
   private boolean[] P0ACE5_n6466PlasCod ;
   private int[] P0ACE5_A1266BarAlbTub ;
   private short[] P0ACE5_A1206TubCod ;
   private boolean[] P0ACE5_n1206TubCod ;
   private int[] P0ACE5_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0ACE5_A1263BarAlbMtrE ;
   private short[] P0ACE5_A5019AlbHdrgm2 ;
   private short[] P0ACE5_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0ACE5_A1261BarAlbKgmE ;
   private String[] P0ACE5_A12232AlbNomCli ;
   private int[] P0ACE5_A3393AlbColNum ;
   private String[] P0ACE5_A8879AlbSerD ;
   private String[] P0ACE5_A3391AlbSer ;
   private byte[] P0ACE5_A213BarSit ;
   private String[] P0ACE5_A130BarCodPar ;
   private byte[] P0ACE5_A132BarCodReo ;
   private int[] P0ACE5_A129BarCod ;
   private String[] P0ACE6_A396EmprCod ;
   private long[] P0ACE6_A30AlbProCod ;
   private String[] P0ACE6_A12232AlbNomCli ;
   private String[] P0ACE6_A2839AlbProVal ;
   private String[] P0ACE6_A2441AlbHdrObs ;
   private short[] P0ACE6_A6467BarAlbPlas ;
   private short[] P0ACE6_A6466PlasCod ;
   private boolean[] P0ACE6_n6466PlasCod ;
   private int[] P0ACE6_A1266BarAlbTub ;
   private short[] P0ACE6_A1206TubCod ;
   private boolean[] P0ACE6_n1206TubCod ;
   private int[] P0ACE6_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0ACE6_A1263BarAlbMtrE ;
   private short[] P0ACE6_A5019AlbHdrgm2 ;
   private short[] P0ACE6_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0ACE6_A1261BarAlbKgmE ;
   private int[] P0ACE6_A3393AlbColNum ;
   private String[] P0ACE6_A3392AlbColNom ;
   private String[] P0ACE6_A8879AlbSerD ;
   private String[] P0ACE6_A3391AlbSer ;
   private byte[] P0ACE6_A213BarSit ;
   private String[] P0ACE6_A130BarCodPar ;
   private byte[] P0ACE6_A132BarCodReo ;
   private int[] P0ACE6_A129BarCod ;
   private String[] P0ACE7_A396EmprCod ;
   private long[] P0ACE7_A30AlbProCod ;
   private String[] P0ACE7_A2441AlbHdrObs ;
   private String[] P0ACE7_A2839AlbProVal ;
   private short[] P0ACE7_A6467BarAlbPlas ;
   private short[] P0ACE7_A6466PlasCod ;
   private boolean[] P0ACE7_n6466PlasCod ;
   private int[] P0ACE7_A1266BarAlbTub ;
   private short[] P0ACE7_A1206TubCod ;
   private boolean[] P0ACE7_n1206TubCod ;
   private int[] P0ACE7_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0ACE7_A1263BarAlbMtrE ;
   private short[] P0ACE7_A5019AlbHdrgm2 ;
   private short[] P0ACE7_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0ACE7_A1261BarAlbKgmE ;
   private String[] P0ACE7_A12232AlbNomCli ;
   private int[] P0ACE7_A3393AlbColNum ;
   private String[] P0ACE7_A3392AlbColNom ;
   private String[] P0ACE7_A8879AlbSerD ;
   private String[] P0ACE7_A3391AlbSer ;
   private byte[] P0ACE7_A213BarSit ;
   private String[] P0ACE7_A130BarCodPar ;
   private byte[] P0ACE7_A132BarCodReo ;
   private int[] P0ACE7_A129BarCod ;
   private GXSimpleCollection<String> AV43TFAlbProVal_Sels ;
   private GXSimpleCollection<String> AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ;
   private GXSimpleCollection<String> AV48Options ;
   private GXSimpleCollection<String> AV50OptionsDesc ;
   private GXSimpleCollection<String> AV51OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV55GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV56GridStateFilterValue ;
}

final  class documentodetransporteproduccion_2_wpgetfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ACE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                          byte AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit ,
                                          byte AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                          String AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                          String AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                          int AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum ,
                                          int AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to ,
                                          short AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod ,
                                          short AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to ,
                                          short AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                          String AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                          int AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          String AV64EmprCod ,
                                          long AV65AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[36];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.EmprCod, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc," ;
      scmdbuf += " T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (0==AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0ACE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                          byte AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit ,
                                          byte AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                          String AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                          String AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                          int AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum ,
                                          int AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to ,
                                          short AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod ,
                                          short AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to ,
                                          short AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                          String AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                          int AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          String A396EmprCod ,
                                          String AV64EmprCod ,
                                          long A30AlbProCod ,
                                          long AV65AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[36];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbSer, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2," ;
      scmdbuf += " T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN" ;
      scmdbuf += " TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (0==AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (0==AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbSer" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0ACE4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                          byte AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit ,
                                          byte AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                          String AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                          String AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                          int AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum ,
                                          int AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to ,
                                          short AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod ,
                                          short AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to ,
                                          short AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                          String AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                          int AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          String A396EmprCod ,
                                          String AV64EmprCod ,
                                          long A30AlbProCod ,
                                          long AV65AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[36];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbSerD, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2," ;
      scmdbuf += " T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbColNum, T1.AlbColNom, T1.AlbSer, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN" ;
      scmdbuf += " TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! (0==AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbSerD" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0ACE5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                          byte AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit ,
                                          byte AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                          String AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                          String AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                          int AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum ,
                                          int AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to ,
                                          short AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod ,
                                          short AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to ,
                                          short AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                          String AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                          int AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          String A396EmprCod ,
                                          String AV64EmprCod ,
                                          long A30AlbProCod ,
                                          long AV65AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[36];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbColNom, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2," ;
      scmdbuf += " T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbColNum, T1.AlbSerD, T1.AlbSer, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbColNom" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0ACE6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                          byte AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit ,
                                          byte AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                          String AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                          String AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                          int AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum ,
                                          int AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to ,
                                          short AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod ,
                                          short AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to ,
                                          short AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                          String AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                          int AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          String A396EmprCod ,
                                          String AV64EmprCod ,
                                          long A30AlbProCod ,
                                          long AV65AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[36];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbNomCli, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2," ;
      scmdbuf += " T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbNomCli" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0ACE7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr ,
                                          byte AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit ,
                                          byte AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd ,
                                          String AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel ,
                                          String AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom ,
                                          int AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum ,
                                          int AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to ,
                                          short AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod ,
                                          short AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to ,
                                          short AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to ,
                                          String AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel ,
                                          String AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs ,
                                          int AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          String A396EmprCod ,
                                          String AV64EmprCod ,
                                          long A30AlbProCod ,
                                          long AV65AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[36];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbHdrObs, T1.AlbProVal, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc," ;
      scmdbuf += " T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV72Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_3_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (0==AV73Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_4_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV78Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_13_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_14_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_15_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_16_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_17_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_18_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_19_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_20_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_21_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_22_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_23_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_24_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_25_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_26_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_27_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_28_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV98Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_29_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_30_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_31_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_32_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV102Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_33_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_34_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Documentotransporteproduccion_documentodetransporteproduccion_2_wpds_35_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbHdrObs" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_P0ACE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).longValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).longValue() );
            case 1 :
                  return conditional_P0ACE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).longValue() , ((Number) dynConstraints[59]).longValue() );
            case 2 :
                  return conditional_P0ACE4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).longValue() , ((Number) dynConstraints[59]).longValue() );
            case 3 :
                  return conditional_P0ACE5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).longValue() , ((Number) dynConstraints[59]).longValue() );
            case 4 :
                  return conditional_P0ACE6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).longValue() , ((Number) dynConstraints[59]).longValue() );
            case 5 :
                  return conditional_P0ACE7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).shortValue() , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).longValue() , ((Number) dynConstraints[59]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ACE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACE4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACE5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACE6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0ACE7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[15])[0] = rslt.getString(14, 13);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 13);
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[16])[0] = rslt.getString(15, 13);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 13);
               ((String[]) buf[19])[0] = rslt.getString(18, 26);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[16])[0] = rslt.getString(15, 13);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 13);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[16])[0] = rslt.getString(15, 13);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 13);
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((short[]) buf[13])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[15])[0] = rslt.getString(14, 13);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 13);
               ((String[]) buf[18])[0] = rslt.getString(17, 26);
               ((String[]) buf[19])[0] = rslt.getString(18, 16);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
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
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[37]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 60);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 60);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[37]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 60);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 60);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[37]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 60);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 60);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[37]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 60);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 60);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[37]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 60);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 60);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[37]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 60);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 60);
               }
               return;
      }
   }

}

