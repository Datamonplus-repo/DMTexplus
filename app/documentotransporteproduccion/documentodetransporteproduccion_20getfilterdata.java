package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_20getfilterdata extends GXProcedure
{
   public documentodetransporteproduccion_20getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_20getfilterdata.class ), "" );
   }

   public documentodetransporteproduccion_20getfilterdata( int remoteHandle ,
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
      documentodetransporteproduccion_20getfilterdata.this.aP5 = new String[] {""};
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
      documentodetransporteproduccion_20getfilterdata.this.AV26DDOName = aP0;
      documentodetransporteproduccion_20getfilterdata.this.AV27SearchTxt = aP1;
      documentodetransporteproduccion_20getfilterdata.this.AV28SearchTxtTo = aP2;
      documentodetransporteproduccion_20getfilterdata.this.aP3 = aP3;
      documentodetransporteproduccion_20getfilterdata.this.aP4 = aP4;
      documentodetransporteproduccion_20getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_PEDIDOCLIENTE") == 0 )
      {
         /* Execute user subroutine: 'LOADPEDIDOCLIENTEOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_ALBSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_ALBSERD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_ALBCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV26DDOName), "DDO_ALBNOMCLI") == 0 )
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
      AV29OptionsJson = AV16Options.toJSonString(false) ;
      AV30OptionsDescJson = AV18OptionsDesc.toJSonString(false) ;
      AV31OptionIndexesJson = AV19OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV21Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_20GridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_20GridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV21Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_20GridState"), null, null);
      }
      AV66GXV1 = 1 ;
      while ( AV66GXV1 <= AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV66GXV1));
         if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV32TFPedidoCliente = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV33TFPedidoCliente_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER") == 0 )
         {
            AV34TFAlbSer = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER_SEL") == 0 )
         {
            AV35TFAlbSer_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD") == 0 )
         {
            AV36TFAlbSerD = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD_SEL") == 0 )
         {
            AV37TFAlbSerD_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM") == 0 )
         {
            AV38TFAlbColNom = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM_SEL") == 0 )
         {
            AV39TFAlbColNom_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNUM") == 0 )
         {
            AV40TFAlbColNum = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFAlbColNum_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIPCOL") == 0 )
         {
            AV42TFAlbTipCol = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFAlbTipCol_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI") == 0 )
         {
            AV44TFAlbNomCli = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI_SEL") == 0 )
         {
            AV45TFAlbNomCli_Sel = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV12TFBarAlbKgmE = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV13TFBarAlbKgmE_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV46TFAlbHdrAnc = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFAlbHdrAnc_To = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV48TFAlbHdrgm2 = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFAlbHdrgm2_To = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV50TFBarAlbMtrE = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFBarAlbMtrE_To = CommonUtil.decimalVal( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV52TFBarAlbPie = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFBarAlbPie_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV54TFTubCod = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFTubCod_To = (short)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV56TFBarAlbTub = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarAlbTub_To = (int)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV58TFAlbProVal_SelsJson = AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV59TFAlbProVal_Sels.fromJSonString(AV58TFAlbProVal_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV62TFBarSit = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFBarSit_To = (byte)(GXutil.lval( AV24GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV66GXV1 = (int)(AV66GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV27SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV32TFPedidoCliente ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV34TFAlbSer ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV35TFAlbSer_Sel ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV36TFAlbSerD ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV37TFAlbSerD_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV38TFAlbColNom ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV39TFAlbColNom_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV40TFAlbColNum ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV41TFAlbColNum_To ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV42TFAlbTipCol ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV43TFAlbTipCol_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV44TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV12TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV13TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV46TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV47TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV48TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV49TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV50TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV51TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV52TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV54TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV55TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV56TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV57TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV62TFBarSit ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV63TFBarSit_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                           AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                           AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                           AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                           AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) ,
                                           Integer.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) ,
                                           Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           Byte.valueOf(A3394AlbTipCol) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           AV60EmprCod ,
                                           Long.valueOf(AV61AlbProCod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr), 11, "%") ;
      lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser), 16, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd), 26, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli), 13, "%") ;
      /* Using cursor P0AGC2 */
      pr_default.execute(0, new Object[] {AV60EmprCod, Long.valueOf(AV61AlbProCod), lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr, AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel, lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser, AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel, lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd, AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom, AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel, Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum), Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to), Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol), Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to), Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit), Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P0AGC2_A30AlbProCod[0] ;
         A213BarSit = P0AGC2_A213BarSit[0] ;
         A2839AlbProVal = P0AGC2_A2839AlbProVal[0] ;
         A1266BarAlbTub = P0AGC2_A1266BarAlbTub[0] ;
         A1206TubCod = P0AGC2_A1206TubCod[0] ;
         n1206TubCod = P0AGC2_n1206TubCod[0] ;
         A1265BarAlbPie = P0AGC2_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0AGC2_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0AGC2_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0AGC2_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0AGC2_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0AGC2_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0AGC2_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0AGC2_A3393AlbColNum[0] ;
         A3392AlbColNom = P0AGC2_A3392AlbColNom[0] ;
         A8879AlbSerD = P0AGC2_A8879AlbSerD[0] ;
         A3391AlbSer = P0AGC2_A3391AlbSer[0] ;
         A130BarCodPar = P0AGC2_A130BarCodPar[0] ;
         A132BarCodReo = P0AGC2_A132BarCodReo[0] ;
         A129BarCod = P0AGC2_A129BarCod[0] ;
         A143BarDisNum = P0AGC2_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC2_A4812BarEncCli[0] ;
         A396EmprCod = P0AGC2_A396EmprCod[0] ;
         A213BarSit = P0AGC2_A213BarSit[0] ;
         A143BarDisNum = P0AGC2_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC2_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         documentodetransporteproduccion_20getfilterdata.this.A396EmprCod = GXv_char3[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A4812BarEncCli = GXv_char4[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A143BarDisNum = GXv_char5[0] ;
         documentodetransporteproduccion_20getfilterdata.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
               {
                  AV15Option = A13696BarNHdr ;
                  AV14InsertIndex = 1 ;
                  while ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) < 0 ) )
                  {
                     AV14InsertIndex = (int)(AV14InsertIndex+1) ;
                  }
                  if ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) == 0 ) )
                  {
                     AV20count = GXutil.lval( (String)AV19OptionIndexes.elementAt(-1+AV14InsertIndex)) ;
                     AV20count = (long)(AV20count+1) ;
                     AV19OptionIndexes.removeItem(AV14InsertIndex);
                     AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), AV14InsertIndex);
                  }
                  else
                  {
                     AV16Options.add(AV15Option, AV14InsertIndex);
                     AV19OptionIndexes.add("1", AV14InsertIndex);
                  }
               }
               if ( AV16Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S131( )
   {
      /* 'LOADPEDIDOCLIENTEOPTIONS' Routine */
      returnInSub = false ;
      AV32TFPedidoCliente = AV27SearchTxt ;
      AV33TFPedidoCliente_Sel = "" ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV32TFPedidoCliente ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV34TFAlbSer ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV35TFAlbSer_Sel ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV36TFAlbSerD ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV37TFAlbSerD_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV38TFAlbColNom ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV39TFAlbColNom_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV40TFAlbColNum ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV41TFAlbColNum_To ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV42TFAlbTipCol ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV43TFAlbTipCol_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV44TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV12TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV13TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV46TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV47TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV48TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV49TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV50TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV51TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV52TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV54TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV55TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV56TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV57TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV62TFBarSit ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV63TFBarSit_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                           AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                           AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                           AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                           AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) ,
                                           Integer.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) ,
                                           Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           Byte.valueOf(A3394AlbTipCol) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           AV60EmprCod ,
                                           Long.valueOf(AV61AlbProCod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr), 11, "%") ;
      lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser), 16, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd), 26, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli), 13, "%") ;
      /* Using cursor P0AGC3 */
      pr_default.execute(1, new Object[] {AV60EmprCod, Long.valueOf(AV61AlbProCod), lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr, AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel, lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser, AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel, lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd, AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom, AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel, Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum), Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to), Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol), Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to), Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit), Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A30AlbProCod = P0AGC3_A30AlbProCod[0] ;
         A213BarSit = P0AGC3_A213BarSit[0] ;
         A2839AlbProVal = P0AGC3_A2839AlbProVal[0] ;
         A1266BarAlbTub = P0AGC3_A1266BarAlbTub[0] ;
         A1206TubCod = P0AGC3_A1206TubCod[0] ;
         n1206TubCod = P0AGC3_n1206TubCod[0] ;
         A1265BarAlbPie = P0AGC3_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0AGC3_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0AGC3_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0AGC3_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0AGC3_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0AGC3_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0AGC3_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0AGC3_A3393AlbColNum[0] ;
         A3392AlbColNom = P0AGC3_A3392AlbColNom[0] ;
         A8879AlbSerD = P0AGC3_A8879AlbSerD[0] ;
         A3391AlbSer = P0AGC3_A3391AlbSer[0] ;
         A130BarCodPar = P0AGC3_A130BarCodPar[0] ;
         A132BarCodReo = P0AGC3_A132BarCodReo[0] ;
         A129BarCod = P0AGC3_A129BarCod[0] ;
         A143BarDisNum = P0AGC3_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC3_A4812BarEncCli[0] ;
         A396EmprCod = P0AGC3_A396EmprCod[0] ;
         A213BarSit = P0AGC3_A213BarSit[0] ;
         A143BarDisNum = P0AGC3_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC3_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         documentodetransporteproduccion_20getfilterdata.this.A396EmprCod = GXv_char6[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         documentodetransporteproduccion_20getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               if ( ! (GXutil.strcmp("", A13878PedidoClie)==0) )
               {
                  AV15Option = A13878PedidoClie ;
                  AV14InsertIndex = 1 ;
                  while ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) < 0 ) )
                  {
                     AV14InsertIndex = (int)(AV14InsertIndex+1) ;
                  }
                  if ( ( AV14InsertIndex <= AV16Options.size() ) && ( GXutil.strcmp((String)AV16Options.elementAt(-1+AV14InsertIndex), AV15Option) == 0 ) )
                  {
                     AV20count = GXutil.lval( (String)AV19OptionIndexes.elementAt(-1+AV14InsertIndex)) ;
                     AV20count = (long)(AV20count+1) ;
                     AV19OptionIndexes.removeItem(AV14InsertIndex);
                     AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), AV14InsertIndex);
                  }
                  else
                  {
                     AV16Options.add(AV15Option, AV14InsertIndex);
                     AV19OptionIndexes.add("1", AV14InsertIndex);
                  }
               }
               if ( AV16Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBSEROPTIONS' Routine */
      returnInSub = false ;
      AV34TFAlbSer = AV27SearchTxt ;
      AV35TFAlbSer_Sel = "" ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV32TFPedidoCliente ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV34TFAlbSer ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV35TFAlbSer_Sel ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV36TFAlbSerD ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV37TFAlbSerD_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV38TFAlbColNom ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV39TFAlbColNom_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV40TFAlbColNum ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV41TFAlbColNum_To ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV42TFAlbTipCol ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV43TFAlbTipCol_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV44TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV12TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV13TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV46TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV47TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV48TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV49TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV50TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV51TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV52TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV54TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV55TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV56TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV57TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV62TFBarSit ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV63TFBarSit_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                           AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                           AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                           AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                           AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) ,
                                           Integer.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) ,
                                           Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           Byte.valueOf(A3394AlbTipCol) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           A396EmprCod ,
                                           AV60EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV61AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr), 11, "%") ;
      lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser), 16, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd), 26, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli), 13, "%") ;
      /* Using cursor P0AGC4 */
      pr_default.execute(2, new Object[] {AV60EmprCod, Long.valueOf(AV61AlbProCod), lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr, AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel, lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser, AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel, lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd, AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom, AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel, Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum), Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to), Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol), Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to), Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit), Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkAGC4 = false ;
         A30AlbProCod = P0AGC4_A30AlbProCod[0] ;
         A3391AlbSer = P0AGC4_A3391AlbSer[0] ;
         A213BarSit = P0AGC4_A213BarSit[0] ;
         A2839AlbProVal = P0AGC4_A2839AlbProVal[0] ;
         A1266BarAlbTub = P0AGC4_A1266BarAlbTub[0] ;
         A1206TubCod = P0AGC4_A1206TubCod[0] ;
         n1206TubCod = P0AGC4_n1206TubCod[0] ;
         A1265BarAlbPie = P0AGC4_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0AGC4_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0AGC4_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0AGC4_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0AGC4_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0AGC4_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0AGC4_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0AGC4_A3393AlbColNum[0] ;
         A3392AlbColNom = P0AGC4_A3392AlbColNom[0] ;
         A8879AlbSerD = P0AGC4_A8879AlbSerD[0] ;
         A130BarCodPar = P0AGC4_A130BarCodPar[0] ;
         A132BarCodReo = P0AGC4_A132BarCodReo[0] ;
         A129BarCod = P0AGC4_A129BarCod[0] ;
         A143BarDisNum = P0AGC4_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC4_A4812BarEncCli[0] ;
         A396EmprCod = P0AGC4_A396EmprCod[0] ;
         A213BarSit = P0AGC4_A213BarSit[0] ;
         A143BarDisNum = P0AGC4_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC4_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         documentodetransporteproduccion_20getfilterdata.this.A396EmprCod = GXv_char6[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         documentodetransporteproduccion_20getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV20count = 0 ;
               while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0AGC4_A3391AlbSer[0], A3391AlbSer) == 0 ) )
               {
                  brkAGC4 = false ;
                  A30AlbProCod = P0AGC4_A30AlbProCod[0] ;
                  A130BarCodPar = P0AGC4_A130BarCodPar[0] ;
                  A132BarCodReo = P0AGC4_A132BarCodReo[0] ;
                  A129BarCod = P0AGC4_A129BarCod[0] ;
                  A396EmprCod = P0AGC4_A396EmprCod[0] ;
                  AV20count = (long)(AV20count+1) ;
                  brkAGC4 = true ;
                  pr_default.readNext(2);
               }
               if ( ! (GXutil.strcmp("", A3391AlbSer)==0) )
               {
                  AV15Option = A3391AlbSer ;
                  AV16Options.add(AV15Option, 0);
                  AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV16Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAGC4 )
         {
            brkAGC4 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBSERDOPTIONS' Routine */
      returnInSub = false ;
      AV36TFAlbSerD = AV27SearchTxt ;
      AV37TFAlbSerD_Sel = "" ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV32TFPedidoCliente ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV34TFAlbSer ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV35TFAlbSer_Sel ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV36TFAlbSerD ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV37TFAlbSerD_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV38TFAlbColNom ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV39TFAlbColNom_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV40TFAlbColNum ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV41TFAlbColNum_To ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV42TFAlbTipCol ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV43TFAlbTipCol_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV44TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV12TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV13TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV46TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV47TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV48TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV49TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV50TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV51TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV52TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV54TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV55TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV56TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV57TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV62TFBarSit ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV63TFBarSit_To ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                           AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                           AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                           AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                           AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) ,
                                           Integer.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) ,
                                           Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           Byte.valueOf(A3394AlbTipCol) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           A396EmprCod ,
                                           AV60EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV61AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr), 11, "%") ;
      lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser), 16, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd), 26, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli), 13, "%") ;
      /* Using cursor P0AGC5 */
      pr_default.execute(3, new Object[] {AV60EmprCod, Long.valueOf(AV61AlbProCod), lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr, AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel, lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser, AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel, lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd, AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom, AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel, Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum), Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to), Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol), Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to), Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit), Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkAGC6 = false ;
         A30AlbProCod = P0AGC5_A30AlbProCod[0] ;
         A8879AlbSerD = P0AGC5_A8879AlbSerD[0] ;
         A213BarSit = P0AGC5_A213BarSit[0] ;
         A2839AlbProVal = P0AGC5_A2839AlbProVal[0] ;
         A1266BarAlbTub = P0AGC5_A1266BarAlbTub[0] ;
         A1206TubCod = P0AGC5_A1206TubCod[0] ;
         n1206TubCod = P0AGC5_n1206TubCod[0] ;
         A1265BarAlbPie = P0AGC5_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0AGC5_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0AGC5_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0AGC5_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0AGC5_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0AGC5_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0AGC5_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0AGC5_A3393AlbColNum[0] ;
         A3392AlbColNom = P0AGC5_A3392AlbColNom[0] ;
         A3391AlbSer = P0AGC5_A3391AlbSer[0] ;
         A130BarCodPar = P0AGC5_A130BarCodPar[0] ;
         A132BarCodReo = P0AGC5_A132BarCodReo[0] ;
         A129BarCod = P0AGC5_A129BarCod[0] ;
         A143BarDisNum = P0AGC5_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC5_A4812BarEncCli[0] ;
         A396EmprCod = P0AGC5_A396EmprCod[0] ;
         A213BarSit = P0AGC5_A213BarSit[0] ;
         A143BarDisNum = P0AGC5_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC5_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         documentodetransporteproduccion_20getfilterdata.this.A396EmprCod = GXv_char6[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         documentodetransporteproduccion_20getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV20count = 0 ;
               while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0AGC5_A8879AlbSerD[0], A8879AlbSerD) == 0 ) )
               {
                  brkAGC6 = false ;
                  A30AlbProCod = P0AGC5_A30AlbProCod[0] ;
                  A130BarCodPar = P0AGC5_A130BarCodPar[0] ;
                  A132BarCodReo = P0AGC5_A132BarCodReo[0] ;
                  A129BarCod = P0AGC5_A129BarCod[0] ;
                  A396EmprCod = P0AGC5_A396EmprCod[0] ;
                  AV20count = (long)(AV20count+1) ;
                  brkAGC6 = true ;
                  pr_default.readNext(3);
               }
               if ( ! (GXutil.strcmp("", A8879AlbSerD)==0) )
               {
                  AV15Option = A8879AlbSerD ;
                  AV16Options.add(AV15Option, 0);
                  AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV16Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAGC6 )
         {
            brkAGC6 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV38TFAlbColNom = AV27SearchTxt ;
      AV39TFAlbColNom_Sel = "" ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV32TFPedidoCliente ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV34TFAlbSer ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV35TFAlbSer_Sel ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV36TFAlbSerD ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV37TFAlbSerD_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV38TFAlbColNom ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV39TFAlbColNom_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV40TFAlbColNum ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV41TFAlbColNum_To ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV42TFAlbTipCol ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV43TFAlbTipCol_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV44TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV12TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV13TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV46TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV47TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV48TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV49TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV50TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV51TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV52TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV54TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV55TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV56TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV57TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV62TFBarSit ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV63TFBarSit_To ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                           AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                           AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                           AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                           AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) ,
                                           Integer.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) ,
                                           Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           Byte.valueOf(A3394AlbTipCol) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           A396EmprCod ,
                                           AV60EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV61AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr), 11, "%") ;
      lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser), 16, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd), 26, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli), 13, "%") ;
      /* Using cursor P0AGC6 */
      pr_default.execute(4, new Object[] {AV60EmprCod, Long.valueOf(AV61AlbProCod), lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr, AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel, lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser, AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel, lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd, AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom, AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel, Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum), Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to), Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol), Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to), Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit), Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkAGC8 = false ;
         A30AlbProCod = P0AGC6_A30AlbProCod[0] ;
         A3392AlbColNom = P0AGC6_A3392AlbColNom[0] ;
         A213BarSit = P0AGC6_A213BarSit[0] ;
         A2839AlbProVal = P0AGC6_A2839AlbProVal[0] ;
         A1266BarAlbTub = P0AGC6_A1266BarAlbTub[0] ;
         A1206TubCod = P0AGC6_A1206TubCod[0] ;
         n1206TubCod = P0AGC6_n1206TubCod[0] ;
         A1265BarAlbPie = P0AGC6_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0AGC6_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0AGC6_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0AGC6_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0AGC6_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0AGC6_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0AGC6_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0AGC6_A3393AlbColNum[0] ;
         A8879AlbSerD = P0AGC6_A8879AlbSerD[0] ;
         A3391AlbSer = P0AGC6_A3391AlbSer[0] ;
         A130BarCodPar = P0AGC6_A130BarCodPar[0] ;
         A132BarCodReo = P0AGC6_A132BarCodReo[0] ;
         A129BarCod = P0AGC6_A129BarCod[0] ;
         A143BarDisNum = P0AGC6_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC6_A4812BarEncCli[0] ;
         A396EmprCod = P0AGC6_A396EmprCod[0] ;
         A213BarSit = P0AGC6_A213BarSit[0] ;
         A143BarDisNum = P0AGC6_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC6_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         documentodetransporteproduccion_20getfilterdata.this.A396EmprCod = GXv_char6[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         documentodetransporteproduccion_20getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV20count = 0 ;
               while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0AGC6_A3392AlbColNom[0], A3392AlbColNom) == 0 ) )
               {
                  brkAGC8 = false ;
                  A30AlbProCod = P0AGC6_A30AlbProCod[0] ;
                  A130BarCodPar = P0AGC6_A130BarCodPar[0] ;
                  A132BarCodReo = P0AGC6_A132BarCodReo[0] ;
                  A129BarCod = P0AGC6_A129BarCod[0] ;
                  A396EmprCod = P0AGC6_A396EmprCod[0] ;
                  AV20count = (long)(AV20count+1) ;
                  brkAGC8 = true ;
                  pr_default.readNext(4);
               }
               if ( ! (GXutil.strcmp("", A3392AlbColNom)==0) )
               {
                  AV15Option = A3392AlbColNom ;
                  AV16Options.add(AV15Option, 0);
                  AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV16Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAGC8 )
         {
            brkAGC8 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADALBNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV44TFAlbNomCli = AV27SearchTxt ;
      AV45TFAlbNomCli_Sel = "" ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = AV32TFPedidoCliente ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = AV33TFPedidoCliente_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = AV34TFAlbSer ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = AV35TFAlbSer_Sel ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = AV36TFAlbSerD ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = AV37TFAlbSerD_Sel ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = AV38TFAlbColNom ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = AV39TFAlbColNom_Sel ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum = AV40TFAlbColNum ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to = AV41TFAlbColNum_To ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol = AV42TFAlbTipCol ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to = AV43TFAlbTipCol_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = AV44TFAlbNomCli ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = AV45TFAlbNomCli_Sel ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = AV12TFBarAlbKgmE ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = AV13TFBarAlbKgmE_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc = AV46TFAlbHdrAnc ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to = AV47TFAlbHdrAnc_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 = AV48TFAlbHdrgm2 ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to = AV49TFAlbHdrgm2_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = AV50TFBarAlbMtrE ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = AV51TFBarAlbMtrE_To ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie = AV52TFBarAlbPie ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to = AV53TFBarAlbPie_To ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod = AV54TFTubCod ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to = AV55TFTubCod_To ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub = AV56TFBarAlbTub ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to = AV57TFBarAlbTub_To ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = AV59TFAlbProVal_Sels ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit = AV62TFBarSit ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to = AV63TFBarSit_To ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                           AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                           AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                           AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                           AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                           AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                           AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                           AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                           AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                           AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) ,
                                           Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) ,
                                           Integer.valueOf(AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) ,
                                           Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3391AlbSer ,
                                           A8879AlbSerD ,
                                           A3392AlbColNom ,
                                           Integer.valueOf(A3393AlbColNum) ,
                                           Byte.valueOf(A3394AlbTipCol) ,
                                           A12232AlbNomCli ,
                                           A1261BarAlbKgmE ,
                                           Short.valueOf(A3271AlbHdrAnc) ,
                                           Short.valueOf(A5019AlbHdrgm2) ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A1206TubCod) ,
                                           Integer.valueOf(A1266BarAlbTub) ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                           A13878PedidoClie ,
                                           A396EmprCod ,
                                           AV60EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV61AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr), 11, "%") ;
      lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser), 16, "%") ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd), 26, "%") ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom), 13, "%") ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli), 13, "%") ;
      /* Using cursor P0AGC7 */
      pr_default.execute(5, new Object[] {AV60EmprCod, Long.valueOf(AV61AlbProCod), lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr, AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel, lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser, AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel, lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd, AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel, lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom, AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel, Integer.valueOf(AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum), Integer.valueOf(AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to), Byte.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol), Byte.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to), lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli, AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to, Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to), AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to, Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie), Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to), Short.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod), Short.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to), Integer.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub), Integer.valueOf(AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to), Byte.valueOf(AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit), Byte.valueOf(AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkAGC10 = false ;
         A30AlbProCod = P0AGC7_A30AlbProCod[0] ;
         A12232AlbNomCli = P0AGC7_A12232AlbNomCli[0] ;
         A213BarSit = P0AGC7_A213BarSit[0] ;
         A2839AlbProVal = P0AGC7_A2839AlbProVal[0] ;
         A1266BarAlbTub = P0AGC7_A1266BarAlbTub[0] ;
         A1206TubCod = P0AGC7_A1206TubCod[0] ;
         n1206TubCod = P0AGC7_n1206TubCod[0] ;
         A1265BarAlbPie = P0AGC7_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0AGC7_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0AGC7_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0AGC7_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0AGC7_A1261BarAlbKgmE[0] ;
         A3394AlbTipCol = P0AGC7_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0AGC7_A3393AlbColNum[0] ;
         A3392AlbColNom = P0AGC7_A3392AlbColNom[0] ;
         A8879AlbSerD = P0AGC7_A8879AlbSerD[0] ;
         A3391AlbSer = P0AGC7_A3391AlbSer[0] ;
         A130BarCodPar = P0AGC7_A130BarCodPar[0] ;
         A132BarCodReo = P0AGC7_A132BarCodReo[0] ;
         A129BarCod = P0AGC7_A129BarCod[0] ;
         A143BarDisNum = P0AGC7_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC7_A4812BarEncCli[0] ;
         A396EmprCod = P0AGC7_A396EmprCod[0] ;
         A213BarSit = P0AGC7_A213BarSit[0] ;
         A143BarDisNum = P0AGC7_A143BarDisNum[0] ;
         A4812BarEncCli = P0AGC7_A4812BarEncCli[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A4812BarEncCli ;
         GXv_char4[0] = A143BarDisNum ;
         GXv_char3[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_char4, GXv_char3) ;
         documentodetransporteproduccion_20getfilterdata.this.A396EmprCod = GXv_char6[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A4812BarEncCli = GXv_char5[0] ;
         documentodetransporteproduccion_20getfilterdata.this.A143BarDisNum = GXv_char4[0] ;
         documentodetransporteproduccion_20getfilterdata.this.GXt_char2 = GXv_char3[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
               AV20count = 0 ;
               while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0AGC7_A12232AlbNomCli[0], A12232AlbNomCli) == 0 ) )
               {
                  brkAGC10 = false ;
                  A30AlbProCod = P0AGC7_A30AlbProCod[0] ;
                  A130BarCodPar = P0AGC7_A130BarCodPar[0] ;
                  A132BarCodReo = P0AGC7_A132BarCodReo[0] ;
                  A129BarCod = P0AGC7_A129BarCod[0] ;
                  A396EmprCod = P0AGC7_A396EmprCod[0] ;
                  AV20count = (long)(AV20count+1) ;
                  brkAGC10 = true ;
                  pr_default.readNext(5);
               }
               if ( ! (GXutil.strcmp("", A12232AlbNomCli)==0) )
               {
                  AV15Option = A12232AlbNomCli ;
                  AV16Options.add(AV15Option, 0);
                  AV19OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV20count), "Z,ZZZ,ZZZ,ZZ9")), 0);
               }
               if ( AV16Options.size() == 50 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
            }
         }
         if ( ! brkAGC10 )
         {
            brkAGC10 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentodetransporteproduccion_20getfilterdata.this.AV29OptionsJson;
      this.aP4[0] = documentodetransporteproduccion_20getfilterdata.this.AV30OptionsDescJson;
      this.aP5[0] = documentodetransporteproduccion_20getfilterdata.this.AV31OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV29OptionsJson = "" ;
      AV30OptionsDescJson = "" ;
      AV31OptionIndexesJson = "" ;
      AV16Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV18OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV19OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV21Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV32TFPedidoCliente = "" ;
      AV33TFPedidoCliente_Sel = "" ;
      AV34TFAlbSer = "" ;
      AV35TFAlbSer_Sel = "" ;
      AV36TFAlbSerD = "" ;
      AV37TFAlbSerD_Sel = "" ;
      AV38TFAlbColNom = "" ;
      AV39TFAlbColNom_Sel = "" ;
      AV44TFAlbNomCli = "" ;
      AV45TFAlbNomCli_Sel = "" ;
      AV12TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV13TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV50TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV51TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV58TFAlbProVal_SelsJson = "" ;
      AV59TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A13696BarNHdr = "" ;
      AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = "" ;
      AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente = "" ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel = "" ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = "" ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel = "" ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = "" ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel = "" ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = "" ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel = "" ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel = "" ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme = DecimalUtil.ZERO ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre = DecimalUtil.ZERO ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr = "" ;
      lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser = "" ;
      lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd = "" ;
      lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom = "" ;
      lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli = "" ;
      A2839AlbProVal = "" ;
      A130BarCodPar = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A13878PedidoClie = "" ;
      AV60EmprCod = "" ;
      A396EmprCod = "" ;
      P0AGC2_A30AlbProCod = new long[1] ;
      P0AGC2_A213BarSit = new byte[1] ;
      P0AGC2_A2839AlbProVal = new String[] {""} ;
      P0AGC2_A1266BarAlbTub = new int[1] ;
      P0AGC2_A1206TubCod = new short[1] ;
      P0AGC2_n1206TubCod = new boolean[] {false} ;
      P0AGC2_A1265BarAlbPie = new int[1] ;
      P0AGC2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC2_A5019AlbHdrgm2 = new short[1] ;
      P0AGC2_A3271AlbHdrAnc = new short[1] ;
      P0AGC2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC2_A12232AlbNomCli = new String[] {""} ;
      P0AGC2_A3394AlbTipCol = new byte[1] ;
      P0AGC2_A3393AlbColNum = new int[1] ;
      P0AGC2_A3392AlbColNom = new String[] {""} ;
      P0AGC2_A8879AlbSerD = new String[] {""} ;
      P0AGC2_A3391AlbSer = new String[] {""} ;
      P0AGC2_A130BarCodPar = new String[] {""} ;
      P0AGC2_A132BarCodReo = new byte[1] ;
      P0AGC2_A129BarCod = new int[1] ;
      P0AGC2_A143BarDisNum = new String[] {""} ;
      P0AGC2_A4812BarEncCli = new String[] {""} ;
      P0AGC2_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      AV15Option = "" ;
      P0AGC3_A30AlbProCod = new long[1] ;
      P0AGC3_A213BarSit = new byte[1] ;
      P0AGC3_A2839AlbProVal = new String[] {""} ;
      P0AGC3_A1266BarAlbTub = new int[1] ;
      P0AGC3_A1206TubCod = new short[1] ;
      P0AGC3_n1206TubCod = new boolean[] {false} ;
      P0AGC3_A1265BarAlbPie = new int[1] ;
      P0AGC3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC3_A5019AlbHdrgm2 = new short[1] ;
      P0AGC3_A3271AlbHdrAnc = new short[1] ;
      P0AGC3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC3_A12232AlbNomCli = new String[] {""} ;
      P0AGC3_A3394AlbTipCol = new byte[1] ;
      P0AGC3_A3393AlbColNum = new int[1] ;
      P0AGC3_A3392AlbColNom = new String[] {""} ;
      P0AGC3_A8879AlbSerD = new String[] {""} ;
      P0AGC3_A3391AlbSer = new String[] {""} ;
      P0AGC3_A130BarCodPar = new String[] {""} ;
      P0AGC3_A132BarCodReo = new byte[1] ;
      P0AGC3_A129BarCod = new int[1] ;
      P0AGC3_A143BarDisNum = new String[] {""} ;
      P0AGC3_A4812BarEncCli = new String[] {""} ;
      P0AGC3_A396EmprCod = new String[] {""} ;
      P0AGC4_A30AlbProCod = new long[1] ;
      P0AGC4_A3391AlbSer = new String[] {""} ;
      P0AGC4_A213BarSit = new byte[1] ;
      P0AGC4_A2839AlbProVal = new String[] {""} ;
      P0AGC4_A1266BarAlbTub = new int[1] ;
      P0AGC4_A1206TubCod = new short[1] ;
      P0AGC4_n1206TubCod = new boolean[] {false} ;
      P0AGC4_A1265BarAlbPie = new int[1] ;
      P0AGC4_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC4_A5019AlbHdrgm2 = new short[1] ;
      P0AGC4_A3271AlbHdrAnc = new short[1] ;
      P0AGC4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC4_A12232AlbNomCli = new String[] {""} ;
      P0AGC4_A3394AlbTipCol = new byte[1] ;
      P0AGC4_A3393AlbColNum = new int[1] ;
      P0AGC4_A3392AlbColNom = new String[] {""} ;
      P0AGC4_A8879AlbSerD = new String[] {""} ;
      P0AGC4_A130BarCodPar = new String[] {""} ;
      P0AGC4_A132BarCodReo = new byte[1] ;
      P0AGC4_A129BarCod = new int[1] ;
      P0AGC4_A143BarDisNum = new String[] {""} ;
      P0AGC4_A4812BarEncCli = new String[] {""} ;
      P0AGC4_A396EmprCod = new String[] {""} ;
      P0AGC5_A30AlbProCod = new long[1] ;
      P0AGC5_A8879AlbSerD = new String[] {""} ;
      P0AGC5_A213BarSit = new byte[1] ;
      P0AGC5_A2839AlbProVal = new String[] {""} ;
      P0AGC5_A1266BarAlbTub = new int[1] ;
      P0AGC5_A1206TubCod = new short[1] ;
      P0AGC5_n1206TubCod = new boolean[] {false} ;
      P0AGC5_A1265BarAlbPie = new int[1] ;
      P0AGC5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC5_A5019AlbHdrgm2 = new short[1] ;
      P0AGC5_A3271AlbHdrAnc = new short[1] ;
      P0AGC5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC5_A12232AlbNomCli = new String[] {""} ;
      P0AGC5_A3394AlbTipCol = new byte[1] ;
      P0AGC5_A3393AlbColNum = new int[1] ;
      P0AGC5_A3392AlbColNom = new String[] {""} ;
      P0AGC5_A3391AlbSer = new String[] {""} ;
      P0AGC5_A130BarCodPar = new String[] {""} ;
      P0AGC5_A132BarCodReo = new byte[1] ;
      P0AGC5_A129BarCod = new int[1] ;
      P0AGC5_A143BarDisNum = new String[] {""} ;
      P0AGC5_A4812BarEncCli = new String[] {""} ;
      P0AGC5_A396EmprCod = new String[] {""} ;
      P0AGC6_A30AlbProCod = new long[1] ;
      P0AGC6_A3392AlbColNom = new String[] {""} ;
      P0AGC6_A213BarSit = new byte[1] ;
      P0AGC6_A2839AlbProVal = new String[] {""} ;
      P0AGC6_A1266BarAlbTub = new int[1] ;
      P0AGC6_A1206TubCod = new short[1] ;
      P0AGC6_n1206TubCod = new boolean[] {false} ;
      P0AGC6_A1265BarAlbPie = new int[1] ;
      P0AGC6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC6_A5019AlbHdrgm2 = new short[1] ;
      P0AGC6_A3271AlbHdrAnc = new short[1] ;
      P0AGC6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC6_A12232AlbNomCli = new String[] {""} ;
      P0AGC6_A3394AlbTipCol = new byte[1] ;
      P0AGC6_A3393AlbColNum = new int[1] ;
      P0AGC6_A8879AlbSerD = new String[] {""} ;
      P0AGC6_A3391AlbSer = new String[] {""} ;
      P0AGC6_A130BarCodPar = new String[] {""} ;
      P0AGC6_A132BarCodReo = new byte[1] ;
      P0AGC6_A129BarCod = new int[1] ;
      P0AGC6_A143BarDisNum = new String[] {""} ;
      P0AGC6_A4812BarEncCli = new String[] {""} ;
      P0AGC6_A396EmprCod = new String[] {""} ;
      P0AGC7_A30AlbProCod = new long[1] ;
      P0AGC7_A12232AlbNomCli = new String[] {""} ;
      P0AGC7_A213BarSit = new byte[1] ;
      P0AGC7_A2839AlbProVal = new String[] {""} ;
      P0AGC7_A1266BarAlbTub = new int[1] ;
      P0AGC7_A1206TubCod = new short[1] ;
      P0AGC7_n1206TubCod = new boolean[] {false} ;
      P0AGC7_A1265BarAlbPie = new int[1] ;
      P0AGC7_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC7_A5019AlbHdrgm2 = new short[1] ;
      P0AGC7_A3271AlbHdrAnc = new short[1] ;
      P0AGC7_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AGC7_A3394AlbTipCol = new byte[1] ;
      P0AGC7_A3393AlbColNum = new int[1] ;
      P0AGC7_A3392AlbColNom = new String[] {""} ;
      P0AGC7_A8879AlbSerD = new String[] {""} ;
      P0AGC7_A3391AlbSer = new String[] {""} ;
      P0AGC7_A130BarCodPar = new String[] {""} ;
      P0AGC7_A132BarCodReo = new byte[1] ;
      P0AGC7_A129BarCod = new int[1] ;
      P0AGC7_A143BarDisNum = new String[] {""} ;
      P0AGC7_A4812BarEncCli = new String[] {""} ;
      P0AGC7_A396EmprCod = new String[] {""} ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_20getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0AGC2_A30AlbProCod, P0AGC2_A213BarSit, P0AGC2_A2839AlbProVal, P0AGC2_A1266BarAlbTub, P0AGC2_A1206TubCod, P0AGC2_n1206TubCod, P0AGC2_A1265BarAlbPie, P0AGC2_A1263BarAlbMtrE, P0AGC2_A5019AlbHdrgm2, P0AGC2_A3271AlbHdrAnc,
            P0AGC2_A1261BarAlbKgmE, P0AGC2_A12232AlbNomCli, P0AGC2_A3394AlbTipCol, P0AGC2_A3393AlbColNum, P0AGC2_A3392AlbColNom, P0AGC2_A8879AlbSerD, P0AGC2_A3391AlbSer, P0AGC2_A130BarCodPar, P0AGC2_A132BarCodReo, P0AGC2_A129BarCod,
            P0AGC2_A143BarDisNum, P0AGC2_A4812BarEncCli, P0AGC2_A396EmprCod
            }
            , new Object[] {
            P0AGC3_A30AlbProCod, P0AGC3_A213BarSit, P0AGC3_A2839AlbProVal, P0AGC3_A1266BarAlbTub, P0AGC3_A1206TubCod, P0AGC3_n1206TubCod, P0AGC3_A1265BarAlbPie, P0AGC3_A1263BarAlbMtrE, P0AGC3_A5019AlbHdrgm2, P0AGC3_A3271AlbHdrAnc,
            P0AGC3_A1261BarAlbKgmE, P0AGC3_A12232AlbNomCli, P0AGC3_A3394AlbTipCol, P0AGC3_A3393AlbColNum, P0AGC3_A3392AlbColNom, P0AGC3_A8879AlbSerD, P0AGC3_A3391AlbSer, P0AGC3_A130BarCodPar, P0AGC3_A132BarCodReo, P0AGC3_A129BarCod,
            P0AGC3_A143BarDisNum, P0AGC3_A4812BarEncCli, P0AGC3_A396EmprCod
            }
            , new Object[] {
            P0AGC4_A30AlbProCod, P0AGC4_A3391AlbSer, P0AGC4_A213BarSit, P0AGC4_A2839AlbProVal, P0AGC4_A1266BarAlbTub, P0AGC4_A1206TubCod, P0AGC4_n1206TubCod, P0AGC4_A1265BarAlbPie, P0AGC4_A1263BarAlbMtrE, P0AGC4_A5019AlbHdrgm2,
            P0AGC4_A3271AlbHdrAnc, P0AGC4_A1261BarAlbKgmE, P0AGC4_A12232AlbNomCli, P0AGC4_A3394AlbTipCol, P0AGC4_A3393AlbColNum, P0AGC4_A3392AlbColNom, P0AGC4_A8879AlbSerD, P0AGC4_A130BarCodPar, P0AGC4_A132BarCodReo, P0AGC4_A129BarCod,
            P0AGC4_A143BarDisNum, P0AGC4_A4812BarEncCli, P0AGC4_A396EmprCod
            }
            , new Object[] {
            P0AGC5_A30AlbProCod, P0AGC5_A8879AlbSerD, P0AGC5_A213BarSit, P0AGC5_A2839AlbProVal, P0AGC5_A1266BarAlbTub, P0AGC5_A1206TubCod, P0AGC5_n1206TubCod, P0AGC5_A1265BarAlbPie, P0AGC5_A1263BarAlbMtrE, P0AGC5_A5019AlbHdrgm2,
            P0AGC5_A3271AlbHdrAnc, P0AGC5_A1261BarAlbKgmE, P0AGC5_A12232AlbNomCli, P0AGC5_A3394AlbTipCol, P0AGC5_A3393AlbColNum, P0AGC5_A3392AlbColNom, P0AGC5_A3391AlbSer, P0AGC5_A130BarCodPar, P0AGC5_A132BarCodReo, P0AGC5_A129BarCod,
            P0AGC5_A143BarDisNum, P0AGC5_A4812BarEncCli, P0AGC5_A396EmprCod
            }
            , new Object[] {
            P0AGC6_A30AlbProCod, P0AGC6_A3392AlbColNom, P0AGC6_A213BarSit, P0AGC6_A2839AlbProVal, P0AGC6_A1266BarAlbTub, P0AGC6_A1206TubCod, P0AGC6_n1206TubCod, P0AGC6_A1265BarAlbPie, P0AGC6_A1263BarAlbMtrE, P0AGC6_A5019AlbHdrgm2,
            P0AGC6_A3271AlbHdrAnc, P0AGC6_A1261BarAlbKgmE, P0AGC6_A12232AlbNomCli, P0AGC6_A3394AlbTipCol, P0AGC6_A3393AlbColNum, P0AGC6_A8879AlbSerD, P0AGC6_A3391AlbSer, P0AGC6_A130BarCodPar, P0AGC6_A132BarCodReo, P0AGC6_A129BarCod,
            P0AGC6_A143BarDisNum, P0AGC6_A4812BarEncCli, P0AGC6_A396EmprCod
            }
            , new Object[] {
            P0AGC7_A30AlbProCod, P0AGC7_A12232AlbNomCli, P0AGC7_A213BarSit, P0AGC7_A2839AlbProVal, P0AGC7_A1266BarAlbTub, P0AGC7_A1206TubCod, P0AGC7_n1206TubCod, P0AGC7_A1265BarAlbPie, P0AGC7_A1263BarAlbMtrE, P0AGC7_A5019AlbHdrgm2,
            P0AGC7_A3271AlbHdrAnc, P0AGC7_A1261BarAlbKgmE, P0AGC7_A3394AlbTipCol, P0AGC7_A3393AlbColNum, P0AGC7_A3392AlbColNom, P0AGC7_A8879AlbSerD, P0AGC7_A3391AlbSer, P0AGC7_A130BarCodPar, P0AGC7_A132BarCodReo, P0AGC7_A129BarCod,
            P0AGC7_A143BarDisNum, P0AGC7_A4812BarEncCli, P0AGC7_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV42TFAlbTipCol ;
   private byte AV43TFAlbTipCol_To ;
   private byte AV62TFBarSit ;
   private byte AV63TFBarSit_To ;
   private byte AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol ;
   private byte AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to ;
   private byte AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit ;
   private byte AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to ;
   private byte A132BarCodReo ;
   private byte A3394AlbTipCol ;
   private byte A213BarSit ;
   private short AV46TFAlbHdrAnc ;
   private short AV47TFAlbHdrAnc_To ;
   private short AV48TFAlbHdrgm2 ;
   private short AV49TFAlbHdrgm2_To ;
   private short AV54TFTubCod ;
   private short AV55TFTubCod_To ;
   private short AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc ;
   private short AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to ;
   private short AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 ;
   private short AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to ;
   private short AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod ;
   private short AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short Gx_err ;
   private int AV66GXV1 ;
   private int AV40TFAlbColNum ;
   private int AV41TFAlbColNum_To ;
   private int AV52TFBarAlbPie ;
   private int AV53TFBarAlbPie_To ;
   private int AV56TFBarAlbTub ;
   private int AV57TFBarAlbTub_To ;
   private int AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum ;
   private int AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to ;
   private int AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie ;
   private int AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to ;
   private int AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub ;
   private int AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to ;
   private int AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size ;
   private int A129BarCod ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int AV14InsertIndex ;
   private long AV61AlbProCod ;
   private long A30AlbProCod ;
   private long AV20count ;
   private java.math.BigDecimal AV12TFBarAlbKgmE ;
   private java.math.BigDecimal AV13TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV50TFBarAlbMtrE ;
   private java.math.BigDecimal AV51TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ;
   private java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ;
   private java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ;
   private java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV32TFPedidoCliente ;
   private String AV33TFPedidoCliente_Sel ;
   private String AV34TFAlbSer ;
   private String AV35TFAlbSer_Sel ;
   private String AV36TFAlbSerD ;
   private String AV37TFAlbSerD_Sel ;
   private String AV38TFAlbColNom ;
   private String AV39TFAlbColNom_Sel ;
   private String AV44TFAlbNomCli ;
   private String AV45TFAlbNomCli_Sel ;
   private String A13696BarNHdr ;
   private String AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ;
   private String AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ;
   private String AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ;
   private String AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ;
   private String AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ;
   private String AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ;
   private String AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ;
   private String AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ;
   private String AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ;
   private String AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ;
   private String AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ;
   private String AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ;
   private String scmdbuf ;
   private String lV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ;
   private String lV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ;
   private String lV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ;
   private String lV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ;
   private String lV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ;
   private String A2839AlbProVal ;
   private String A130BarCodPar ;
   private String A3391AlbSer ;
   private String A8879AlbSerD ;
   private String A3392AlbColNom ;
   private String A12232AlbNomCli ;
   private String A13878PedidoClie ;
   private String AV60EmprCod ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private boolean returnInSub ;
   private boolean n1206TubCod ;
   private boolean brkAGC4 ;
   private boolean brkAGC6 ;
   private boolean brkAGC8 ;
   private boolean brkAGC10 ;
   private String AV29OptionsJson ;
   private String AV30OptionsDescJson ;
   private String AV31OptionIndexesJson ;
   private String AV58TFAlbProVal_SelsJson ;
   private String AV26DDOName ;
   private String AV27SearchTxt ;
   private String AV28SearchTxtTo ;
   private String AV15Option ;
   private com.genexus.webpanels.WebSession AV21Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P0AGC2_A30AlbProCod ;
   private byte[] P0AGC2_A213BarSit ;
   private String[] P0AGC2_A2839AlbProVal ;
   private int[] P0AGC2_A1266BarAlbTub ;
   private short[] P0AGC2_A1206TubCod ;
   private boolean[] P0AGC2_n1206TubCod ;
   private int[] P0AGC2_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0AGC2_A1263BarAlbMtrE ;
   private short[] P0AGC2_A5019AlbHdrgm2 ;
   private short[] P0AGC2_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0AGC2_A1261BarAlbKgmE ;
   private String[] P0AGC2_A12232AlbNomCli ;
   private byte[] P0AGC2_A3394AlbTipCol ;
   private int[] P0AGC2_A3393AlbColNum ;
   private String[] P0AGC2_A3392AlbColNom ;
   private String[] P0AGC2_A8879AlbSerD ;
   private String[] P0AGC2_A3391AlbSer ;
   private String[] P0AGC2_A130BarCodPar ;
   private byte[] P0AGC2_A132BarCodReo ;
   private int[] P0AGC2_A129BarCod ;
   private String[] P0AGC2_A143BarDisNum ;
   private String[] P0AGC2_A4812BarEncCli ;
   private String[] P0AGC2_A396EmprCod ;
   private long[] P0AGC3_A30AlbProCod ;
   private byte[] P0AGC3_A213BarSit ;
   private String[] P0AGC3_A2839AlbProVal ;
   private int[] P0AGC3_A1266BarAlbTub ;
   private short[] P0AGC3_A1206TubCod ;
   private boolean[] P0AGC3_n1206TubCod ;
   private int[] P0AGC3_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0AGC3_A1263BarAlbMtrE ;
   private short[] P0AGC3_A5019AlbHdrgm2 ;
   private short[] P0AGC3_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0AGC3_A1261BarAlbKgmE ;
   private String[] P0AGC3_A12232AlbNomCli ;
   private byte[] P0AGC3_A3394AlbTipCol ;
   private int[] P0AGC3_A3393AlbColNum ;
   private String[] P0AGC3_A3392AlbColNom ;
   private String[] P0AGC3_A8879AlbSerD ;
   private String[] P0AGC3_A3391AlbSer ;
   private String[] P0AGC3_A130BarCodPar ;
   private byte[] P0AGC3_A132BarCodReo ;
   private int[] P0AGC3_A129BarCod ;
   private String[] P0AGC3_A143BarDisNum ;
   private String[] P0AGC3_A4812BarEncCli ;
   private String[] P0AGC3_A396EmprCod ;
   private long[] P0AGC4_A30AlbProCod ;
   private String[] P0AGC4_A3391AlbSer ;
   private byte[] P0AGC4_A213BarSit ;
   private String[] P0AGC4_A2839AlbProVal ;
   private int[] P0AGC4_A1266BarAlbTub ;
   private short[] P0AGC4_A1206TubCod ;
   private boolean[] P0AGC4_n1206TubCod ;
   private int[] P0AGC4_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0AGC4_A1263BarAlbMtrE ;
   private short[] P0AGC4_A5019AlbHdrgm2 ;
   private short[] P0AGC4_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0AGC4_A1261BarAlbKgmE ;
   private String[] P0AGC4_A12232AlbNomCli ;
   private byte[] P0AGC4_A3394AlbTipCol ;
   private int[] P0AGC4_A3393AlbColNum ;
   private String[] P0AGC4_A3392AlbColNom ;
   private String[] P0AGC4_A8879AlbSerD ;
   private String[] P0AGC4_A130BarCodPar ;
   private byte[] P0AGC4_A132BarCodReo ;
   private int[] P0AGC4_A129BarCod ;
   private String[] P0AGC4_A143BarDisNum ;
   private String[] P0AGC4_A4812BarEncCli ;
   private String[] P0AGC4_A396EmprCod ;
   private long[] P0AGC5_A30AlbProCod ;
   private String[] P0AGC5_A8879AlbSerD ;
   private byte[] P0AGC5_A213BarSit ;
   private String[] P0AGC5_A2839AlbProVal ;
   private int[] P0AGC5_A1266BarAlbTub ;
   private short[] P0AGC5_A1206TubCod ;
   private boolean[] P0AGC5_n1206TubCod ;
   private int[] P0AGC5_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0AGC5_A1263BarAlbMtrE ;
   private short[] P0AGC5_A5019AlbHdrgm2 ;
   private short[] P0AGC5_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0AGC5_A1261BarAlbKgmE ;
   private String[] P0AGC5_A12232AlbNomCli ;
   private byte[] P0AGC5_A3394AlbTipCol ;
   private int[] P0AGC5_A3393AlbColNum ;
   private String[] P0AGC5_A3392AlbColNom ;
   private String[] P0AGC5_A3391AlbSer ;
   private String[] P0AGC5_A130BarCodPar ;
   private byte[] P0AGC5_A132BarCodReo ;
   private int[] P0AGC5_A129BarCod ;
   private String[] P0AGC5_A143BarDisNum ;
   private String[] P0AGC5_A4812BarEncCli ;
   private String[] P0AGC5_A396EmprCod ;
   private long[] P0AGC6_A30AlbProCod ;
   private String[] P0AGC6_A3392AlbColNom ;
   private byte[] P0AGC6_A213BarSit ;
   private String[] P0AGC6_A2839AlbProVal ;
   private int[] P0AGC6_A1266BarAlbTub ;
   private short[] P0AGC6_A1206TubCod ;
   private boolean[] P0AGC6_n1206TubCod ;
   private int[] P0AGC6_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0AGC6_A1263BarAlbMtrE ;
   private short[] P0AGC6_A5019AlbHdrgm2 ;
   private short[] P0AGC6_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0AGC6_A1261BarAlbKgmE ;
   private String[] P0AGC6_A12232AlbNomCli ;
   private byte[] P0AGC6_A3394AlbTipCol ;
   private int[] P0AGC6_A3393AlbColNum ;
   private String[] P0AGC6_A8879AlbSerD ;
   private String[] P0AGC6_A3391AlbSer ;
   private String[] P0AGC6_A130BarCodPar ;
   private byte[] P0AGC6_A132BarCodReo ;
   private int[] P0AGC6_A129BarCod ;
   private String[] P0AGC6_A143BarDisNum ;
   private String[] P0AGC6_A4812BarEncCli ;
   private String[] P0AGC6_A396EmprCod ;
   private long[] P0AGC7_A30AlbProCod ;
   private String[] P0AGC7_A12232AlbNomCli ;
   private byte[] P0AGC7_A213BarSit ;
   private String[] P0AGC7_A2839AlbProVal ;
   private int[] P0AGC7_A1266BarAlbTub ;
   private short[] P0AGC7_A1206TubCod ;
   private boolean[] P0AGC7_n1206TubCod ;
   private int[] P0AGC7_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0AGC7_A1263BarAlbMtrE ;
   private short[] P0AGC7_A5019AlbHdrgm2 ;
   private short[] P0AGC7_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0AGC7_A1261BarAlbKgmE ;
   private byte[] P0AGC7_A3394AlbTipCol ;
   private int[] P0AGC7_A3393AlbColNum ;
   private String[] P0AGC7_A3392AlbColNom ;
   private String[] P0AGC7_A8879AlbSerD ;
   private String[] P0AGC7_A3391AlbSer ;
   private String[] P0AGC7_A130BarCodPar ;
   private byte[] P0AGC7_A132BarCodReo ;
   private int[] P0AGC7_A129BarCod ;
   private String[] P0AGC7_A143BarDisNum ;
   private String[] P0AGC7_A4812BarEncCli ;
   private String[] P0AGC7_A396EmprCod ;
   private GXSimpleCollection<String> AV59TFAlbProVal_Sels ;
   private GXSimpleCollection<String> AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ;
   private GXSimpleCollection<String> AV16Options ;
   private GXSimpleCollection<String> AV18OptionsDesc ;
   private GXSimpleCollection<String> AV19OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
}

final  class documentodetransporteproduccion_20getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AGC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                          String AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                          String AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                          String AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                          String AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                          int AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum ,
                                          int AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to ,
                                          byte AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol ,
                                          byte AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to ,
                                          int AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size ,
                                          byte AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit ,
                                          byte AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          byte A3394AlbTipCol ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          byte A213BarSit ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String AV60EmprCod ,
                                          long AV61AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int7 = new byte[32];
      Object[] GXv_Object8 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T2.BarSit, T1.AlbProVal, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol," ;
      scmdbuf += " T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int7[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int7[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int7[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int7[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int7[10] = (byte)(1) ;
      }
      if ( ! (0==AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int7[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int7[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int7[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int7[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int7[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int7[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int7[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int7[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int7[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int7[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int7[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int7[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int7[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int7[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int7[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int7[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int7[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int7[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int7[29] = (byte)(1) ;
      }
      if ( AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int7[30] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int7[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   protected Object[] conditional_P0AGC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                          String AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                          String AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                          String AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                          String AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                          int AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum ,
                                          int AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to ,
                                          byte AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol ,
                                          byte AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to ,
                                          int AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size ,
                                          byte AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit ,
                                          byte AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          byte A3394AlbTipCol ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          byte A213BarSit ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String AV60EmprCod ,
                                          long AV61AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[32];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T2.BarSit, T1.AlbProVal, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol," ;
      scmdbuf += " T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( ! (0==AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int10[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int10[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int10[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int10[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int10[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int10[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int10[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int10[29] = (byte)(1) ;
      }
      if ( AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int10[30] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int10[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
   }

   protected Object[] conditional_P0AGC4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                          String AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                          String AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                          String AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                          String AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                          int AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum ,
                                          int AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to ,
                                          byte AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol ,
                                          byte AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to ,
                                          int AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size ,
                                          byte AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit ,
                                          byte AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          byte A3394AlbTipCol ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          byte A213BarSit ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String A396EmprCod ,
                                          String AV60EmprCod ,
                                          long A30AlbProCod ,
                                          long AV61AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[32];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.AlbSer, T2.BarSit, T1.AlbProVal, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli," ;
      scmdbuf += " T1.AlbTipCol, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN" ;
      scmdbuf += " TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (0==AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbSer" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_P0AGC5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                          String AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                          String AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                          String AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                          String AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                          int AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum ,
                                          int AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to ,
                                          byte AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol ,
                                          byte AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to ,
                                          int AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size ,
                                          byte AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit ,
                                          byte AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          byte A3394AlbTipCol ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          byte A213BarSit ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String A396EmprCod ,
                                          String AV60EmprCod ,
                                          long A30AlbProCod ,
                                          long AV61AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[32];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.AlbSerD, T2.BarSit, T1.AlbProVal, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli," ;
      scmdbuf += " T1.AlbTipCol, T1.AlbColNum, T1.AlbColNom, T1.AlbSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN" ;
      scmdbuf += " TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (0==AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int16[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int16[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int16[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int16[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int16[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int16[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int16[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int16[29] = (byte)(1) ;
      }
      if ( AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int16[30] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int16[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbSerD" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_P0AGC6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                          String AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                          String AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                          String AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                          String AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                          int AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum ,
                                          int AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to ,
                                          byte AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol ,
                                          byte AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to ,
                                          int AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size ,
                                          byte AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit ,
                                          byte AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          byte A3394AlbTipCol ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          byte A213BarSit ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String A396EmprCod ,
                                          String AV60EmprCod ,
                                          long A30AlbProCod ,
                                          long AV61AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[32];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.AlbColNom, T2.BarSit, T1.AlbProVal, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli," ;
      scmdbuf += " T1.AlbTipCol, T1.AlbColNum, T1.AlbSerD, T1.AlbSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (0==AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbColNom" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_P0AGC7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels ,
                                          String AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel ,
                                          String AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr ,
                                          String AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel ,
                                          String AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser ,
                                          String AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel ,
                                          String AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd ,
                                          String AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel ,
                                          String AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom ,
                                          int AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum ,
                                          int AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to ,
                                          byte AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol ,
                                          byte AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel ,
                                          String AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2 ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to ,
                                          short AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod ,
                                          short AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to ,
                                          int AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub ,
                                          int AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to ,
                                          int AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size ,
                                          byte AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit ,
                                          byte AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3391AlbSer ,
                                          String A8879AlbSerD ,
                                          String A3392AlbColNom ,
                                          int A3393AlbColNum ,
                                          byte A3394AlbTipCol ,
                                          String A12232AlbNomCli ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          short A3271AlbHdrAnc ,
                                          short A5019AlbHdrgm2 ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A1206TubCod ,
                                          int A1266BarAlbTub ,
                                          byte A213BarSit ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_20ds_4_tfpedidocliente_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_20ds_3_tfpedidocliente ,
                                          String A13878PedidoClie ,
                                          String A396EmprCod ,
                                          String AV60EmprCod ,
                                          long A30AlbProCod ,
                                          long AV61AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[32];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.AlbNomCli, T2.BarSit, T1.AlbProVal, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbTipCol," ;
      scmdbuf += " T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV68Documentotransporteproduccion_documentodetransporteproduccion_20ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Documentotransporteproduccion_documentodetransporteproduccion_20ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV72Documentotransporteproduccion_documentodetransporteproduccion_20ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Documentotransporteproduccion_documentodetransporteproduccion_20ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV74Documentotransporteproduccion_documentodetransporteproduccion_20ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Documentotransporteproduccion_documentodetransporteproduccion_20ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV76Documentotransporteproduccion_documentodetransporteproduccion_20ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Documentotransporteproduccion_documentodetransporteproduccion_20ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (0==AV78Documentotransporteproduccion_documentodetransporteproduccion_20ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (0==AV79Documentotransporteproduccion_documentodetransporteproduccion_20ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_20ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_20ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV82Documentotransporteproduccion_documentodetransporteproduccion_20ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_20ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Documentotransporteproduccion_documentodetransporteproduccion_20ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Documentotransporteproduccion_documentodetransporteproduccion_20ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_20ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_20ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_20ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_20ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Documentotransporteproduccion_documentodetransporteproduccion_20ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Documentotransporteproduccion_documentodetransporteproduccion_20ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( ! (0==AV92Documentotransporteproduccion_documentodetransporteproduccion_20ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_20ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_20ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_20ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int22[27] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_20ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int22[28] = (byte)(1) ;
      }
      if ( ! (0==AV97Documentotransporteproduccion_documentodetransporteproduccion_20ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int22[29] = (byte)(1) ;
      }
      if ( AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Documentotransporteproduccion_documentodetransporteproduccion_20ds_31_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV99Documentotransporteproduccion_documentodetransporteproduccion_20ds_32_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int22[30] = (byte)(1) ;
      }
      if ( ! (0==AV100Documentotransporteproduccion_documentodetransporteproduccion_20ds_33_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int22[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbNomCli" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
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
                  return conditional_P0AGC2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).longValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).longValue() );
            case 1 :
                  return conditional_P0AGC3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).longValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).longValue() );
            case 2 :
                  return conditional_P0AGC4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).longValue() , ((Number) dynConstraints[56]).longValue() );
            case 3 :
                  return conditional_P0AGC5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).longValue() , ((Number) dynConstraints[56]).longValue() );
            case 4 :
                  return conditional_P0AGC6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).longValue() , ((Number) dynConstraints[56]).longValue() );
            case 5 :
                  return conditional_P0AGC7(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).longValue() , ((Number) dynConstraints[56]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AGC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGC4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGC5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGC6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AGC7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((String[]) buf[21])[0] = rslt.getString(21, 20);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((String[]) buf[21])[0] = rslt.getString(21, 20);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((String[]) buf[16])[0] = rslt.getString(16, 26);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((String[]) buf[21])[0] = rslt.getString(21, 20);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 13);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((String[]) buf[21])[0] = rslt.getString(21, 20);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((String[]) buf[21])[0] = rslt.getString(21, 20);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((String[]) buf[14])[0] = rslt.getString(14, 13);
               ((String[]) buf[15])[0] = rslt.getString(15, 26);
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((String[]) buf[21])[0] = rslt.getString(21, 20);
               ((String[]) buf[22])[0] = rslt.getString(22, 3);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[52]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[63]).byteValue());
               }
               return;
      }
   }

}

