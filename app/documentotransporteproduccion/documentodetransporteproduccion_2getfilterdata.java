package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_2getfilterdata extends GXProcedure
{
   public documentodetransporteproduccion_2getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_2getfilterdata.class ), "" );
   }

   public documentodetransporteproduccion_2getfilterdata( int remoteHandle ,
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
      documentodetransporteproduccion_2getfilterdata.this.aP5 = new String[] {""};
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
      documentodetransporteproduccion_2getfilterdata.this.AV56DDOName = aP0;
      documentodetransporteproduccion_2getfilterdata.this.AV57SearchTxt = aP1;
      documentodetransporteproduccion_2getfilterdata.this.AV58SearchTxtTo = aP2;
      documentodetransporteproduccion_2getfilterdata.this.aP3 = aP3;
      documentodetransporteproduccion_2getfilterdata.this.aP4 = aP4;
      documentodetransporteproduccion_2getfilterdata.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV46Options = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV49OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "") ;
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
      if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_BARNHDR") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBHDROBS") == 0 )
      {
         /* Execute user subroutine: 'LOADALBHDROBSOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV59OptionsJson = AV46Options.toJSonString(false) ;
      AV60OptionsDescJson = AV48OptionsDesc.toJSonString(false) ;
      AV61OptionIndexesJson = AV49OptionIndexes.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV51Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2GridState"), "") == 0 )
      {
         AV53GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2GridState"), null, null);
      }
      else
      {
         AV53GridState.fromxml(AV51Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_2GridState"), null, null);
      }
      AV68GXV1 = 1 ;
      while ( AV68GXV1 <= AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV54GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV68GXV1));
         if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV22TFBarAlbKgmE = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV23TFBarAlbKgmE_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRANC") == 0 )
         {
            AV24TFAlbHdrAnc = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV25TFAlbHdrAnc_To = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDRGM2") == 0 )
         {
            AV26TFAlbHdrgm2 = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV27TFAlbHdrgm2_To = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV28TFBarAlbMtrE = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV29TFBarAlbMtrE_To = CommonUtil.decimalVal( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV30TFBarAlbPie = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV31TFBarAlbPie_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTUBCOD") == 0 )
         {
            AV32TFTubCod = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV33TFTubCod_To = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBTUB") == 0 )
         {
            AV34TFBarAlbTub = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFBarAlbTub_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPLASCOD") == 0 )
         {
            AV36TFPlasCod = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFPlasCod_To = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPLAS") == 0 )
         {
            AV38TFBarAlbPlas = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFBarAlbPlas_To = (short)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS") == 0 )
         {
            AV40TFAlbHdrObs = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHDROBS_SEL") == 0 )
         {
            AV41TFAlbHdrObs_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROVAL_SEL") == 0 )
         {
            AV42TFAlbProVal_SelsJson = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV43TFAlbProVal_Sels.fromJSonString(AV42TFAlbProVal_SelsJson, null);
         }
         AV68GXV1 = (int)(AV68GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV57SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie = AV30TFBarAlbPie ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod = AV32TFTubCod ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to = AV33TFTubCod_To ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub = AV34TFBarAlbTub ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod = AV36TFPlasCod ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to = AV37TFPlasCod_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas = AV38TFBarAlbPlas ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ,
                                           AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme ,
                                           AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to ,
                                           Short.valueOf(AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc) ,
                                           Short.valueOf(AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to) ,
                                           Short.valueOf(AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2) ,
                                           Short.valueOf(AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to) ,
                                           AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre ,
                                           AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to ,
                                           Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie) ,
                                           Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to) ,
                                           Short.valueOf(AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod) ,
                                           Short.valueOf(AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to) ,
                                           Integer.valueOf(AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub) ,
                                           Integer.valueOf(AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to) ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to) ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
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
                                           AV62EmprCod ,
                                           Long.valueOf(AV63AlbProCod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr), 11, "%") ;
      lV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0A6W2 */
      pr_default.execute(0, new Object[] {AV62EmprCod, Long.valueOf(AV63AlbProCod), lV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr, AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel, AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme, AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to, Short.valueOf(AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc), Short.valueOf(AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to), Short.valueOf(AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2), Short.valueOf(AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to), AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre, AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to, Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie), Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to), Short.valueOf(AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod), Short.valueOf(AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to), Integer.valueOf(AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub), Integer.valueOf(AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to), Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to), lV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs, AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P0A6W2_A30AlbProCod[0] ;
         A396EmprCod = P0A6W2_A396EmprCod[0] ;
         A2839AlbProVal = P0A6W2_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0A6W2_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0A6W2_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0A6W2_A6466PlasCod[0] ;
         n6466PlasCod = P0A6W2_n6466PlasCod[0] ;
         A1266BarAlbTub = P0A6W2_A1266BarAlbTub[0] ;
         A1206TubCod = P0A6W2_A1206TubCod[0] ;
         n1206TubCod = P0A6W2_n1206TubCod[0] ;
         A1265BarAlbPie = P0A6W2_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0A6W2_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0A6W2_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0A6W2_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0A6W2_A1261BarAlbKgmE[0] ;
         A130BarCodPar = P0A6W2_A130BarCodPar[0] ;
         A132BarCodReo = P0A6W2_A132BarCodReo[0] ;
         A129BarCod = P0A6W2_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         if ( ! (GXutil.strcmp("", A13696BarNHdr)==0) )
         {
            AV45Option = A13696BarNHdr ;
            AV44InsertIndex = 1 ;
            while ( ( AV44InsertIndex <= AV46Options.size() ) && ( GXutil.strcmp((String)AV46Options.elementAt(-1+AV44InsertIndex), AV45Option) < 0 ) )
            {
               AV44InsertIndex = (int)(AV44InsertIndex+1) ;
            }
            if ( ( AV44InsertIndex <= AV46Options.size() ) && ( GXutil.strcmp((String)AV46Options.elementAt(-1+AV44InsertIndex), AV45Option) == 0 ) )
            {
               AV50count = GXutil.lval( (String)AV49OptionIndexes.elementAt(-1+AV44InsertIndex)) ;
               AV50count = (long)(AV50count+1) ;
               AV49OptionIndexes.removeItem(AV44InsertIndex);
               AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), AV44InsertIndex);
            }
            else
            {
               AV46Options.add(AV45Option, AV44InsertIndex);
               AV49OptionIndexes.add("1", AV44InsertIndex);
            }
         }
         if ( AV46Options.size() == 50 )
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
      /* 'LOADALBHDROBSOPTIONS' Routine */
      returnInSub = false ;
      AV40TFAlbHdrObs = AV57SearchTxt ;
      AV41TFAlbHdrObs_Sel = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie = AV30TFBarAlbPie ;
      AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod = AV32TFTubCod ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to = AV33TFTubCod_To ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub = AV34TFBarAlbTub ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod = AV36TFPlasCod ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to = AV37TFPlasCod_To ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas = AV38TFBarAlbPlas ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels ,
                                           AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel ,
                                           AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ,
                                           AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme ,
                                           AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to ,
                                           Short.valueOf(AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc) ,
                                           Short.valueOf(AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to) ,
                                           Short.valueOf(AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2) ,
                                           Short.valueOf(AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to) ,
                                           AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre ,
                                           AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to ,
                                           Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie) ,
                                           Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to) ,
                                           Short.valueOf(AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod) ,
                                           Short.valueOf(AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to) ,
                                           Integer.valueOf(AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub) ,
                                           Integer.valueOf(AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to) ,
                                           Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod) ,
                                           Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to) ,
                                           Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas) ,
                                           Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to) ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ,
                                           Integer.valueOf(AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
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
                                           AV62EmprCod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV63AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr), 11, "%") ;
      lV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0A6W3 */
      pr_default.execute(1, new Object[] {AV62EmprCod, Long.valueOf(AV63AlbProCod), lV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr, AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel, AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme, AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to, Short.valueOf(AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc), Short.valueOf(AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to), Short.valueOf(AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2), Short.valueOf(AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to), AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre, AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to, Integer.valueOf(AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie), Integer.valueOf(AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to), Short.valueOf(AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod), Short.valueOf(AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to), Integer.valueOf(AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub), Integer.valueOf(AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to), Short.valueOf(AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod), Short.valueOf(AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to), Short.valueOf(AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas), Short.valueOf(AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to), lV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs, AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA6W3 = false ;
         A396EmprCod = P0A6W3_A396EmprCod[0] ;
         A30AlbProCod = P0A6W3_A30AlbProCod[0] ;
         A2441AlbHdrObs = P0A6W3_A2441AlbHdrObs[0] ;
         A2839AlbProVal = P0A6W3_A2839AlbProVal[0] ;
         A6467BarAlbPlas = P0A6W3_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0A6W3_A6466PlasCod[0] ;
         n6466PlasCod = P0A6W3_n6466PlasCod[0] ;
         A1266BarAlbTub = P0A6W3_A1266BarAlbTub[0] ;
         A1206TubCod = P0A6W3_A1206TubCod[0] ;
         n1206TubCod = P0A6W3_n1206TubCod[0] ;
         A1265BarAlbPie = P0A6W3_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0A6W3_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0A6W3_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0A6W3_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0A6W3_A1261BarAlbKgmE[0] ;
         A130BarCodPar = P0A6W3_A130BarCodPar[0] ;
         A132BarCodReo = P0A6W3_A132BarCodReo[0] ;
         A129BarCod = P0A6W3_A129BarCod[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A6W3_A2441AlbHdrObs[0], A2441AlbHdrObs) == 0 ) )
         {
            brkA6W3 = false ;
            A396EmprCod = P0A6W3_A396EmprCod[0] ;
            A30AlbProCod = P0A6W3_A30AlbProCod[0] ;
            A130BarCodPar = P0A6W3_A130BarCodPar[0] ;
            A132BarCodReo = P0A6W3_A132BarCodReo[0] ;
            A129BarCod = P0A6W3_A129BarCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkA6W3 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A2441AlbHdrObs)==0) )
         {
            AV45Option = A2441AlbHdrObs ;
            AV46Options.add(AV45Option, 0);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA6W3 )
         {
            brkA6W3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentodetransporteproduccion_2getfilterdata.this.AV59OptionsJson;
      this.aP4[0] = documentodetransporteproduccion_2getfilterdata.this.AV60OptionsDescJson;
      this.aP5[0] = documentodetransporteproduccion_2getfilterdata.this.AV61OptionIndexesJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV59OptionsJson = "" ;
      AV60OptionsDescJson = "" ;
      AV61OptionIndexesJson = "" ;
      AV46Options = new GXSimpleCollection<String>(String.class, "internal", "");
      AV48OptionsDesc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV49OptionIndexes = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV51Session = httpContext.getWebSession();
      AV53GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV54GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV10TFBarNHdr = "" ;
      AV11TFBarNHdr_Sel = "" ;
      AV22TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV23TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV28TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV29TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      AV40TFAlbHdrObs = "" ;
      AV41TFAlbHdrObs_Sel = "" ;
      AV42TFAlbProVal_SelsJson = "" ;
      AV43TFAlbProVal_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      A13696BarNHdr = "" ;
      AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = "" ;
      AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel = "" ;
      AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme = DecimalUtil.ZERO ;
      AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre = DecimalUtil.ZERO ;
      AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = "" ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel = "" ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr = "" ;
      lV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs = "" ;
      A2839AlbProVal = "" ;
      A130BarCodPar = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2441AlbHdrObs = "" ;
      AV62EmprCod = "" ;
      A396EmprCod = "" ;
      P0A6W2_A30AlbProCod = new long[1] ;
      P0A6W2_A396EmprCod = new String[] {""} ;
      P0A6W2_A2839AlbProVal = new String[] {""} ;
      P0A6W2_A2441AlbHdrObs = new String[] {""} ;
      P0A6W2_A6467BarAlbPlas = new short[1] ;
      P0A6W2_A6466PlasCod = new short[1] ;
      P0A6W2_n6466PlasCod = new boolean[] {false} ;
      P0A6W2_A1266BarAlbTub = new int[1] ;
      P0A6W2_A1206TubCod = new short[1] ;
      P0A6W2_n1206TubCod = new boolean[] {false} ;
      P0A6W2_A1265BarAlbPie = new int[1] ;
      P0A6W2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6W2_A5019AlbHdrgm2 = new short[1] ;
      P0A6W2_A3271AlbHdrAnc = new short[1] ;
      P0A6W2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6W2_A130BarCodPar = new String[] {""} ;
      P0A6W2_A132BarCodReo = new byte[1] ;
      P0A6W2_A129BarCod = new int[1] ;
      AV45Option = "" ;
      P0A6W3_A396EmprCod = new String[] {""} ;
      P0A6W3_A30AlbProCod = new long[1] ;
      P0A6W3_A2441AlbHdrObs = new String[] {""} ;
      P0A6W3_A2839AlbProVal = new String[] {""} ;
      P0A6W3_A6467BarAlbPlas = new short[1] ;
      P0A6W3_A6466PlasCod = new short[1] ;
      P0A6W3_n6466PlasCod = new boolean[] {false} ;
      P0A6W3_A1266BarAlbTub = new int[1] ;
      P0A6W3_A1206TubCod = new short[1] ;
      P0A6W3_n1206TubCod = new boolean[] {false} ;
      P0A6W3_A1265BarAlbPie = new int[1] ;
      P0A6W3_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6W3_A5019AlbHdrgm2 = new short[1] ;
      P0A6W3_A3271AlbHdrAnc = new short[1] ;
      P0A6W3_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A6W3_A130BarCodPar = new String[] {""} ;
      P0A6W3_A132BarCodReo = new byte[1] ;
      P0A6W3_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_2getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A6W2_A30AlbProCod, P0A6W2_A396EmprCod, P0A6W2_A2839AlbProVal, P0A6W2_A2441AlbHdrObs, P0A6W2_A6467BarAlbPlas, P0A6W2_A6466PlasCod, P0A6W2_n6466PlasCod, P0A6W2_A1266BarAlbTub, P0A6W2_A1206TubCod, P0A6W2_n1206TubCod,
            P0A6W2_A1265BarAlbPie, P0A6W2_A1263BarAlbMtrE, P0A6W2_A5019AlbHdrgm2, P0A6W2_A3271AlbHdrAnc, P0A6W2_A1261BarAlbKgmE, P0A6W2_A130BarCodPar, P0A6W2_A132BarCodReo, P0A6W2_A129BarCod
            }
            , new Object[] {
            P0A6W3_A396EmprCod, P0A6W3_A30AlbProCod, P0A6W3_A2441AlbHdrObs, P0A6W3_A2839AlbProVal, P0A6W3_A6467BarAlbPlas, P0A6W3_A6466PlasCod, P0A6W3_n6466PlasCod, P0A6W3_A1266BarAlbTub, P0A6W3_A1206TubCod, P0A6W3_n1206TubCod,
            P0A6W3_A1265BarAlbPie, P0A6W3_A1263BarAlbMtrE, P0A6W3_A5019AlbHdrgm2, P0A6W3_A3271AlbHdrAnc, P0A6W3_A1261BarAlbKgmE, P0A6W3_A130BarCodPar, P0A6W3_A132BarCodReo, P0A6W3_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
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
   private short AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc ;
   private short AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to ;
   private short AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 ;
   private short AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to ;
   private short AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod ;
   private short AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to ;
   private short AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod ;
   private short AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to ;
   private short AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas ;
   private short AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short Gx_err ;
   private int AV68GXV1 ;
   private int AV30TFBarAlbPie ;
   private int AV31TFBarAlbPie_To ;
   private int AV34TFBarAlbTub ;
   private int AV35TFBarAlbTub_To ;
   private int AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie ;
   private int AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to ;
   private int AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub ;
   private int AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to ;
   private int AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels_size ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int AV44InsertIndex ;
   private long AV63AlbProCod ;
   private long A30AlbProCod ;
   private long AV50count ;
   private java.math.BigDecimal AV22TFBarAlbKgmE ;
   private java.math.BigDecimal AV23TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV28TFBarAlbMtrE ;
   private java.math.BigDecimal AV29TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme ;
   private java.math.BigDecimal AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to ;
   private java.math.BigDecimal AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre ;
   private java.math.BigDecimal AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV40TFAlbHdrObs ;
   private String AV41TFAlbHdrObs_Sel ;
   private String A13696BarNHdr ;
   private String AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ;
   private String AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel ;
   private String AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ;
   private String AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel ;
   private String scmdbuf ;
   private String lV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ;
   private String lV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ;
   private String A2839AlbProVal ;
   private String A130BarCodPar ;
   private String A2441AlbHdrObs ;
   private String AV62EmprCod ;
   private String A396EmprCod ;
   private boolean returnInSub ;
   private boolean n6466PlasCod ;
   private boolean n1206TubCod ;
   private boolean brkA6W3 ;
   private String AV59OptionsJson ;
   private String AV60OptionsDescJson ;
   private String AV61OptionIndexesJson ;
   private String AV42TFAlbProVal_SelsJson ;
   private String AV56DDOName ;
   private String AV57SearchTxt ;
   private String AV58SearchTxtTo ;
   private String AV45Option ;
   private com.genexus.webpanels.WebSession AV51Session ;
   private String[] aP5 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P0A6W2_A30AlbProCod ;
   private String[] P0A6W2_A396EmprCod ;
   private String[] P0A6W2_A2839AlbProVal ;
   private String[] P0A6W2_A2441AlbHdrObs ;
   private short[] P0A6W2_A6467BarAlbPlas ;
   private short[] P0A6W2_A6466PlasCod ;
   private boolean[] P0A6W2_n6466PlasCod ;
   private int[] P0A6W2_A1266BarAlbTub ;
   private short[] P0A6W2_A1206TubCod ;
   private boolean[] P0A6W2_n1206TubCod ;
   private int[] P0A6W2_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0A6W2_A1263BarAlbMtrE ;
   private short[] P0A6W2_A5019AlbHdrgm2 ;
   private short[] P0A6W2_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0A6W2_A1261BarAlbKgmE ;
   private String[] P0A6W2_A130BarCodPar ;
   private byte[] P0A6W2_A132BarCodReo ;
   private int[] P0A6W2_A129BarCod ;
   private String[] P0A6W3_A396EmprCod ;
   private long[] P0A6W3_A30AlbProCod ;
   private String[] P0A6W3_A2441AlbHdrObs ;
   private String[] P0A6W3_A2839AlbProVal ;
   private short[] P0A6W3_A6467BarAlbPlas ;
   private short[] P0A6W3_A6466PlasCod ;
   private boolean[] P0A6W3_n6466PlasCod ;
   private int[] P0A6W3_A1266BarAlbTub ;
   private short[] P0A6W3_A1206TubCod ;
   private boolean[] P0A6W3_n1206TubCod ;
   private int[] P0A6W3_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0A6W3_A1263BarAlbMtrE ;
   private short[] P0A6W3_A5019AlbHdrgm2 ;
   private short[] P0A6W3_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0A6W3_A1261BarAlbKgmE ;
   private String[] P0A6W3_A130BarCodPar ;
   private byte[] P0A6W3_A132BarCodReo ;
   private int[] P0A6W3_A129BarCod ;
   private GXSimpleCollection<String> AV43TFAlbProVal_Sels ;
   private GXSimpleCollection<String> AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels ;
   private GXSimpleCollection<String> AV46Options ;
   private GXSimpleCollection<String> AV48OptionsDesc ;
   private GXSimpleCollection<String> AV49OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV53GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV54GridStateFilterValue ;
}

final  class documentodetransporteproduccion_2getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A6W2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ,
                                          java.math.BigDecimal AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme ,
                                          java.math.BigDecimal AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to ,
                                          short AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc ,
                                          short AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to ,
                                          short AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 ,
                                          short AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre ,
                                          java.math.BigDecimal AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to ,
                                          int AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie ,
                                          int AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to ,
                                          short AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod ,
                                          short AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to ,
                                          int AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub ,
                                          int AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
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
                                          String AV62EmprCod ,
                                          long AV63AlbProCod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[24];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT AlbProCod, EmprCod, AlbProVal, AlbHdrObs, BarAlbPlas, PlasCod, BarAlbTub, TubCod, BarAlbPie, BarAlbMtrE, AlbHdrgm2, AlbHdrAnc, BarAlbKgmE, BarCodPar, BarCodReo," ;
      scmdbuf += " BarCod FROM TXPALBBAR" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( ! (0==AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc) )
      {
         addWhere(sWhereString, "(AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (0==AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( ! (0==AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie) )
      {
         addWhere(sWhereString, "(BarAlbPie >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(BarAlbPie <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( ! (0==AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub) )
      {
         addWhere(sWhereString, "(BarAlbTub >= ?)");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (0==AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(BarAlbTub <= ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod) )
      {
         addWhere(sWhereString, "(PlasCod >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to) )
      {
         addWhere(sWhereString, "(PlasCod <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas) )
      {
         addWhere(sWhereString, "(BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHdrObs = ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels, "AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A6W3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels ,
                                          String AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel ,
                                          String AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr ,
                                          java.math.BigDecimal AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme ,
                                          java.math.BigDecimal AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to ,
                                          short AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc ,
                                          short AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to ,
                                          short AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2 ,
                                          short AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre ,
                                          java.math.BigDecimal AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to ,
                                          int AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie ,
                                          int AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to ,
                                          short AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod ,
                                          short AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to ,
                                          int AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub ,
                                          int AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to ,
                                          short AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod ,
                                          short AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to ,
                                          short AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas ,
                                          short AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs ,
                                          int AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
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
                                          String AV62EmprCod ,
                                          long A30AlbProCod ,
                                          long AV63AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[24];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT EmprCod, AlbProCod, AlbHdrObs, AlbProVal, BarAlbPlas, PlasCod, BarAlbTub, TubCod, BarAlbPie, BarAlbMtrE, AlbHdrgm2, AlbHdrAnc, BarAlbKgmE, BarCodPar, BarCodReo," ;
      scmdbuf += " BarCod FROM TXPALBBAR" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV70Documentotransporteproduccion_documentodetransporteproduccion_2ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Documentotransporteproduccion_documentodetransporteproduccion_2ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(BarCodReo,'90'), 2))) || BarCodPar = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Documentotransporteproduccion_documentodetransporteproduccion_2ds_3_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Documentotransporteproduccion_documentodetransporteproduccion_2ds_4_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (0==AV74Documentotransporteproduccion_documentodetransporteproduccion_2ds_5_tfalbhdranc) )
      {
         addWhere(sWhereString, "(AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (0==AV75Documentotransporteproduccion_documentodetransporteproduccion_2ds_6_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (0==AV76Documentotransporteproduccion_documentodetransporteproduccion_2ds_7_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (0==AV77Documentotransporteproduccion_documentodetransporteproduccion_2ds_8_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Documentotransporteproduccion_documentodetransporteproduccion_2ds_9_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Documentotransporteproduccion_documentodetransporteproduccion_2ds_10_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV80Documentotransporteproduccion_documentodetransporteproduccion_2ds_11_tfbaralbpie) )
      {
         addWhere(sWhereString, "(BarAlbPie >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV81Documentotransporteproduccion_documentodetransporteproduccion_2ds_12_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(BarAlbPie <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV82Documentotransporteproduccion_documentodetransporteproduccion_2ds_13_tftubcod) )
      {
         addWhere(sWhereString, "(TubCod >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV83Documentotransporteproduccion_documentodetransporteproduccion_2ds_14_tftubcod_to) )
      {
         addWhere(sWhereString, "(TubCod <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( ! (0==AV84Documentotransporteproduccion_documentodetransporteproduccion_2ds_15_tfbaralbtub) )
      {
         addWhere(sWhereString, "(BarAlbTub >= ?)");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (0==AV85Documentotransporteproduccion_documentodetransporteproduccion_2ds_16_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(BarAlbTub <= ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (0==AV86Documentotransporteproduccion_documentodetransporteproduccion_2ds_17_tfplascod) )
      {
         addWhere(sWhereString, "(PlasCod >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (0==AV87Documentotransporteproduccion_documentodetransporteproduccion_2ds_18_tfplascod_to) )
      {
         addWhere(sWhereString, "(PlasCod <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV88Documentotransporteproduccion_documentodetransporteproduccion_2ds_19_tfbaralbplas) )
      {
         addWhere(sWhereString, "(BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV89Documentotransporteproduccion_documentodetransporteproduccion_2ds_20_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_2ds_21_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_2ds_22_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(AlbHdrObs = ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV92Documentotransporteproduccion_documentodetransporteproduccion_2ds_23_tfalbproval_sels, "AlbProVal IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY AlbHdrObs" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P0A6W2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).longValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).longValue() );
            case 1 :
                  return conditional_P0A6W3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).longValue() , ((Number) dynConstraints[41]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A6W2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A6W3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               return;
            case 1 :
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
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[25]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 60);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 60);
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
                  stmt.setLong(sIdx, ((Number) parms[25]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 60);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 60);
               }
               return;
      }
   }

}

