package app.documentotransporteproduccion ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_7getfilterdata extends GXProcedure
{
   public documentodetransporteproduccion_7getfilterdata( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_7getfilterdata.class ), "" );
   }

   public documentodetransporteproduccion_7getfilterdata( int remoteHandle ,
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
      documentodetransporteproduccion_7getfilterdata.this.aP5 = new String[] {""};
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
      documentodetransporteproduccion_7getfilterdata.this.AV56DDOName = aP0;
      documentodetransporteproduccion_7getfilterdata.this.AV57SearchTxt = aP1;
      documentodetransporteproduccion_7getfilterdata.this.AV58SearchTxtTo = aP2;
      documentodetransporteproduccion_7getfilterdata.this.aP3 = aP3;
      documentodetransporteproduccion_7getfilterdata.this.aP4 = aP4;
      documentodetransporteproduccion_7getfilterdata.this.aP5 = aP5;
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBENCCLI") == 0 )
      {
         /* Execute user subroutine: 'LOADALBENCCLIOPTIONS' */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBSER") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBSERD") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBCOLNOM") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBNOMCLI") == 0 )
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
      else if ( GXutil.strcmp(GXutil.upper( AV56DDOName), "DDO_ALBHDROBS") == 0 )
      {
         /* Execute user subroutine: 'LOADALBHDROBSOPTIONS' */
         S181 ();
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
      if ( GXutil.strcmp(AV51Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7GridState"), "") == 0 )
      {
         AV53GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7GridState"), null, null);
      }
      else
      {
         AV53GridState.fromxml(AV51Session.getValue("DocumentoTransporteProduccion.DocumentodeTransporteProduccion_7GridState"), null, null);
      }
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV54GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV53GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV10TFBarNHdr = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV11TFBarNHdr_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBENCCLI") == 0 )
         {
            AV73TFAlbEncCli = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBENCCLI_SEL") == 0 )
         {
            AV74TFAlbEncCli_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER") == 0 )
         {
            AV12TFAlbSer = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSER_SEL") == 0 )
         {
            AV13TFAlbSer_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD") == 0 )
         {
            AV14TFAlbSerD = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBSERD_SEL") == 0 )
         {
            AV15TFAlbSerD_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM") == 0 )
         {
            AV16TFAlbColNom = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNOM_SEL") == 0 )
         {
            AV17TFAlbColNom_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOLNUM") == 0 )
         {
            AV18TFAlbColNum = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV19TFAlbColNum_To = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBTIPCOL") == 0 )
         {
            AV75TFAlbTipCol = (byte)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV76TFAlbTipCol_To = (byte)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI") == 0 )
         {
            AV20TFAlbNomCli = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBNOMCLI_SEL") == 0 )
         {
            AV21TFAlbNomCli_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV64TFBarSit = (byte)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFBarSit_To = (byte)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOR_SEL") == 0 )
         {
            AV77TFBarTipCor_Sel = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV62Emprcod = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROCOD") == 0 )
         {
            AV63AlbProcod = GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&GUIREMCLI") == 0 )
         {
            AV66Guiremcli = (int)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&GUIREMCLN") == 0 )
         {
            AV67GuiRemCln = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROFCH") == 0 )
         {
            AV68AlbProFch = localUtil.ctod( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBSEC") == 0 )
         {
            AV69AlbSec = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROPRI") == 0 )
         {
            AV70AlbPropri = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENVFTP") == 0 )
         {
            AV71AlbEnvFtp = (byte)(GXutil.lval( AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBLIC") == 0 )
         {
            AV72AlbLic = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MODE") == 0 )
         {
            Gx_mode = AV54GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'LOADBARNHDROPTIONS' Routine */
      returnInSub = false ;
      AV10TFBarNHdr = AV57SearchTxt ;
      AV11TFBarNHdr_Sel = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV73TFAlbEncCli ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV74TFAlbEncCli_Sel ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV12TFAlbSer ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV14TFAlbSerD ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV75TFAlbTipCol ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV76TFAlbTipCol_To ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV20TFAlbNomCli ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV30TFBarAlbPie ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV32TFTubCod ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV33TFTubCod_To ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV34TFBarAlbTub ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV36TFPlasCod ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV37TFPlasCod_To ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV38TFBarAlbPlas ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV64TFBarSit ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV65TFBarSit_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV77TFBarTipCor_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                           AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                           AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                           AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                           AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) ,
                                           AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                           AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) ,
                                           Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) ,
                                           Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) ,
                                           Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) ,
                                           Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) ,
                                           Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) ,
                                           AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                           AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                           Integer.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) ,
                                           Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) ,
                                           AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4815AlbEncCli ,
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
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           Byte.valueOf(A213BarSit) ,
                                           A5291BarTipCor ,
                                           AV62Emprcod ,
                                           Long.valueOf(AV63AlbProcod) ,
                                           A396EmprCod ,
                                           Long.valueOf(A30AlbProCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG
                                           }
      });
      lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr), 11, "%") ;
      lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = GXutil.padr( GXutil.rtrim( AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli), 20, "%") ;
      lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser), 16, "%") ;
      lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd), 26, "%") ;
      lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom), 13, "%") ;
      lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli), 13, "%") ;
      lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0A712 */
      pr_default.execute(0, new Object[] {AV62Emprcod, Long.valueOf(AV63AlbProcod), lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr, AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel, lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli, AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel, lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser, AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel, lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd, AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel, lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom, AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel, Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum), Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to), Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol), Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to), lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to, Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc), Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to), Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2), Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to), AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to, Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie), Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod), Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to), Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub), Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to), Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas), Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to), lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs, AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel, Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit), Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to), AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P0A712_A30AlbProCod[0] ;
         A396EmprCod = P0A712_A396EmprCod[0] ;
         A5291BarTipCor = P0A712_A5291BarTipCor[0] ;
         A213BarSit = P0A712_A213BarSit[0] ;
         A2839AlbProVal = P0A712_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0A712_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0A712_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0A712_A6466PlasCod[0] ;
         n6466PlasCod = P0A712_n6466PlasCod[0] ;
         A1266BarAlbTub = P0A712_A1266BarAlbTub[0] ;
         A1206TubCod = P0A712_A1206TubCod[0] ;
         n1206TubCod = P0A712_n1206TubCod[0] ;
         A1265BarAlbPie = P0A712_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0A712_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0A712_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0A712_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0A712_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0A712_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0A712_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0A712_A3393AlbColNum[0] ;
         A3392AlbColNom = P0A712_A3392AlbColNom[0] ;
         A8879AlbSerD = P0A712_A8879AlbSerD[0] ;
         A3391AlbSer = P0A712_A3391AlbSer[0] ;
         A4815AlbEncCli = P0A712_A4815AlbEncCli[0] ;
         A130BarCodPar = P0A712_A130BarCodPar[0] ;
         A132BarCodReo = P0A712_A132BarCodReo[0] ;
         A129BarCod = P0A712_A129BarCod[0] ;
         A5291BarTipCor = P0A712_A5291BarTipCor[0] ;
         A213BarSit = P0A712_A213BarSit[0] ;
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
      /* 'LOADALBENCCLIOPTIONS' Routine */
      returnInSub = false ;
      AV73TFAlbEncCli = AV57SearchTxt ;
      AV74TFAlbEncCli_Sel = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV73TFAlbEncCli ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV74TFAlbEncCli_Sel ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV12TFAlbSer ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV14TFAlbSerD ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV75TFAlbTipCol ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV76TFAlbTipCol_To ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV20TFAlbNomCli ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV30TFBarAlbPie ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV32TFTubCod ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV33TFTubCod_To ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV34TFBarAlbTub ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV36TFPlasCod ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV37TFPlasCod_To ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV38TFBarAlbPlas ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV64TFBarSit ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV65TFBarSit_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV77TFBarTipCor_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                           AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                           AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                           AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                           AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) ,
                                           AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                           AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) ,
                                           Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) ,
                                           Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) ,
                                           Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) ,
                                           Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) ,
                                           Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) ,
                                           AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                           AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                           Integer.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) ,
                                           Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) ,
                                           AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4815AlbEncCli ,
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
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           Byte.valueOf(A213BarSit) ,
                                           A5291BarTipCor ,
                                           A396EmprCod ,
                                           AV62Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV63AlbProcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr), 11, "%") ;
      lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = GXutil.padr( GXutil.rtrim( AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli), 20, "%") ;
      lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser), 16, "%") ;
      lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd), 26, "%") ;
      lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom), 13, "%") ;
      lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli), 13, "%") ;
      lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0A713 */
      pr_default.execute(1, new Object[] {AV62Emprcod, Long.valueOf(AV63AlbProcod), lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr, AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel, lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli, AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel, lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser, AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel, lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd, AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel, lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom, AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel, Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum), Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to), Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol), Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to), lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to, Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc), Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to), Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2), Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to), AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to, Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie), Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod), Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to), Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub), Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to), Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas), Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to), lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs, AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel, Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit), Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to), AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brkA713 = false ;
         A396EmprCod = P0A713_A396EmprCod[0] ;
         A30AlbProCod = P0A713_A30AlbProCod[0] ;
         A4815AlbEncCli = P0A713_A4815AlbEncCli[0] ;
         A5291BarTipCor = P0A713_A5291BarTipCor[0] ;
         A213BarSit = P0A713_A213BarSit[0] ;
         A2839AlbProVal = P0A713_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0A713_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0A713_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0A713_A6466PlasCod[0] ;
         n6466PlasCod = P0A713_n6466PlasCod[0] ;
         A1266BarAlbTub = P0A713_A1266BarAlbTub[0] ;
         A1206TubCod = P0A713_A1206TubCod[0] ;
         n1206TubCod = P0A713_n1206TubCod[0] ;
         A1265BarAlbPie = P0A713_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0A713_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0A713_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0A713_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0A713_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0A713_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0A713_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0A713_A3393AlbColNum[0] ;
         A3392AlbColNom = P0A713_A3392AlbColNom[0] ;
         A8879AlbSerD = P0A713_A8879AlbSerD[0] ;
         A3391AlbSer = P0A713_A3391AlbSer[0] ;
         A130BarCodPar = P0A713_A130BarCodPar[0] ;
         A132BarCodReo = P0A713_A132BarCodReo[0] ;
         A129BarCod = P0A713_A129BarCod[0] ;
         A5291BarTipCor = P0A713_A5291BarTipCor[0] ;
         A213BarSit = P0A713_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P0A713_A4815AlbEncCli[0], A4815AlbEncCli) == 0 ) )
         {
            brkA713 = false ;
            A396EmprCod = P0A713_A396EmprCod[0] ;
            A30AlbProCod = P0A713_A30AlbProCod[0] ;
            A130BarCodPar = P0A713_A130BarCodPar[0] ;
            A132BarCodReo = P0A713_A132BarCodReo[0] ;
            A129BarCod = P0A713_A129BarCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkA713 = true ;
            pr_default.readNext(1);
         }
         if ( ! (GXutil.strcmp("", A4815AlbEncCli)==0) )
         {
            AV45Option = A4815AlbEncCli ;
            AV46Options.add(AV45Option, 0);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA713 )
         {
            brkA713 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S141( )
   {
      /* 'LOADALBSEROPTIONS' Routine */
      returnInSub = false ;
      AV12TFAlbSer = AV57SearchTxt ;
      AV13TFAlbSer_Sel = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV73TFAlbEncCli ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV74TFAlbEncCli_Sel ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV12TFAlbSer ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV14TFAlbSerD ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV75TFAlbTipCol ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV76TFAlbTipCol_To ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV20TFAlbNomCli ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV30TFBarAlbPie ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV32TFTubCod ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV33TFTubCod_To ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV34TFBarAlbTub ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV36TFPlasCod ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV37TFPlasCod_To ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV38TFBarAlbPlas ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV64TFBarSit ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV65TFBarSit_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV77TFBarTipCor_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                           AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                           AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                           AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                           AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) ,
                                           AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                           AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) ,
                                           Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) ,
                                           Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) ,
                                           Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) ,
                                           Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) ,
                                           Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) ,
                                           AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                           AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                           Integer.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) ,
                                           Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) ,
                                           AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4815AlbEncCli ,
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
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           Byte.valueOf(A213BarSit) ,
                                           A5291BarTipCor ,
                                           A396EmprCod ,
                                           AV62Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV63AlbProcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr), 11, "%") ;
      lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = GXutil.padr( GXutil.rtrim( AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli), 20, "%") ;
      lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser), 16, "%") ;
      lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd), 26, "%") ;
      lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom), 13, "%") ;
      lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli), 13, "%") ;
      lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0A714 */
      pr_default.execute(2, new Object[] {AV62Emprcod, Long.valueOf(AV63AlbProcod), lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr, AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel, lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli, AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel, lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser, AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel, lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd, AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel, lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom, AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel, Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum), Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to), Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol), Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to), lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to, Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc), Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to), Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2), Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to), AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to, Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie), Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod), Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to), Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub), Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to), Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas), Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to), lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs, AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel, Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit), Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to), AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brkA715 = false ;
         A396EmprCod = P0A714_A396EmprCod[0] ;
         A30AlbProCod = P0A714_A30AlbProCod[0] ;
         A3391AlbSer = P0A714_A3391AlbSer[0] ;
         A5291BarTipCor = P0A714_A5291BarTipCor[0] ;
         A213BarSit = P0A714_A213BarSit[0] ;
         A2839AlbProVal = P0A714_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0A714_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0A714_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0A714_A6466PlasCod[0] ;
         n6466PlasCod = P0A714_n6466PlasCod[0] ;
         A1266BarAlbTub = P0A714_A1266BarAlbTub[0] ;
         A1206TubCod = P0A714_A1206TubCod[0] ;
         n1206TubCod = P0A714_n1206TubCod[0] ;
         A1265BarAlbPie = P0A714_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0A714_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0A714_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0A714_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0A714_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0A714_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0A714_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0A714_A3393AlbColNum[0] ;
         A3392AlbColNom = P0A714_A3392AlbColNom[0] ;
         A8879AlbSerD = P0A714_A8879AlbSerD[0] ;
         A4815AlbEncCli = P0A714_A4815AlbEncCli[0] ;
         A130BarCodPar = P0A714_A130BarCodPar[0] ;
         A132BarCodReo = P0A714_A132BarCodReo[0] ;
         A129BarCod = P0A714_A129BarCod[0] ;
         A5291BarTipCor = P0A714_A5291BarTipCor[0] ;
         A213BarSit = P0A714_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(P0A714_A3391AlbSer[0], A3391AlbSer) == 0 ) )
         {
            brkA715 = false ;
            A396EmprCod = P0A714_A396EmprCod[0] ;
            A30AlbProCod = P0A714_A30AlbProCod[0] ;
            A130BarCodPar = P0A714_A130BarCodPar[0] ;
            A132BarCodReo = P0A714_A132BarCodReo[0] ;
            A129BarCod = P0A714_A129BarCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkA715 = true ;
            pr_default.readNext(2);
         }
         if ( ! (GXutil.strcmp("", A3391AlbSer)==0) )
         {
            AV45Option = A3391AlbSer ;
            AV46Options.add(AV45Option, 0);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA715 )
         {
            brkA715 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S151( )
   {
      /* 'LOADALBSERDOPTIONS' Routine */
      returnInSub = false ;
      AV14TFAlbSerD = AV57SearchTxt ;
      AV15TFAlbSerD_Sel = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV73TFAlbEncCli ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV74TFAlbEncCli_Sel ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV12TFAlbSer ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV14TFAlbSerD ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV75TFAlbTipCol ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV76TFAlbTipCol_To ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV20TFAlbNomCli ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV30TFBarAlbPie ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV32TFTubCod ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV33TFTubCod_To ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV34TFBarAlbTub ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV36TFPlasCod ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV37TFPlasCod_To ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV38TFBarAlbPlas ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV64TFBarSit ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV65TFBarSit_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV77TFBarTipCor_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                           AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                           AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                           AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                           AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) ,
                                           AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                           AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) ,
                                           Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) ,
                                           Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) ,
                                           Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) ,
                                           Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) ,
                                           Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) ,
                                           AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                           AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                           Integer.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) ,
                                           Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) ,
                                           AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4815AlbEncCli ,
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
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           Byte.valueOf(A213BarSit) ,
                                           A5291BarTipCor ,
                                           A396EmprCod ,
                                           AV62Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV63AlbProcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr), 11, "%") ;
      lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = GXutil.padr( GXutil.rtrim( AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli), 20, "%") ;
      lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser), 16, "%") ;
      lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd), 26, "%") ;
      lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom), 13, "%") ;
      lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli), 13, "%") ;
      lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0A715 */
      pr_default.execute(3, new Object[] {AV62Emprcod, Long.valueOf(AV63AlbProcod), lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr, AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel, lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli, AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel, lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser, AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel, lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd, AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel, lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom, AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel, Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum), Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to), Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol), Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to), lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to, Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc), Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to), Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2), Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to), AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to, Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie), Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod), Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to), Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub), Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to), Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas), Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to), lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs, AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel, Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit), Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to), AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brkA717 = false ;
         A396EmprCod = P0A715_A396EmprCod[0] ;
         A30AlbProCod = P0A715_A30AlbProCod[0] ;
         A8879AlbSerD = P0A715_A8879AlbSerD[0] ;
         A5291BarTipCor = P0A715_A5291BarTipCor[0] ;
         A213BarSit = P0A715_A213BarSit[0] ;
         A2839AlbProVal = P0A715_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0A715_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0A715_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0A715_A6466PlasCod[0] ;
         n6466PlasCod = P0A715_n6466PlasCod[0] ;
         A1266BarAlbTub = P0A715_A1266BarAlbTub[0] ;
         A1206TubCod = P0A715_A1206TubCod[0] ;
         n1206TubCod = P0A715_n1206TubCod[0] ;
         A1265BarAlbPie = P0A715_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0A715_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0A715_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0A715_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0A715_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0A715_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0A715_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0A715_A3393AlbColNum[0] ;
         A3392AlbColNom = P0A715_A3392AlbColNom[0] ;
         A3391AlbSer = P0A715_A3391AlbSer[0] ;
         A4815AlbEncCli = P0A715_A4815AlbEncCli[0] ;
         A130BarCodPar = P0A715_A130BarCodPar[0] ;
         A132BarCodReo = P0A715_A132BarCodReo[0] ;
         A129BarCod = P0A715_A129BarCod[0] ;
         A5291BarTipCor = P0A715_A5291BarTipCor[0] ;
         A213BarSit = P0A715_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P0A715_A8879AlbSerD[0], A8879AlbSerD) == 0 ) )
         {
            brkA717 = false ;
            A396EmprCod = P0A715_A396EmprCod[0] ;
            A30AlbProCod = P0A715_A30AlbProCod[0] ;
            A130BarCodPar = P0A715_A130BarCodPar[0] ;
            A132BarCodReo = P0A715_A132BarCodReo[0] ;
            A129BarCod = P0A715_A129BarCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkA717 = true ;
            pr_default.readNext(3);
         }
         if ( ! (GXutil.strcmp("", A8879AlbSerD)==0) )
         {
            AV45Option = A8879AlbSerD ;
            AV46Options.add(AV45Option, 0);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA717 )
         {
            brkA717 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S161( )
   {
      /* 'LOADALBCOLNOMOPTIONS' Routine */
      returnInSub = false ;
      AV16TFAlbColNom = AV57SearchTxt ;
      AV17TFAlbColNom_Sel = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV73TFAlbEncCli ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV74TFAlbEncCli_Sel ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV12TFAlbSer ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV14TFAlbSerD ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV75TFAlbTipCol ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV76TFAlbTipCol_To ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV20TFAlbNomCli ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV30TFBarAlbPie ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV32TFTubCod ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV33TFTubCod_To ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV34TFBarAlbTub ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV36TFPlasCod ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV37TFPlasCod_To ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV38TFBarAlbPlas ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV64TFBarSit ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV65TFBarSit_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV77TFBarTipCor_Sel ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                           AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                           AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                           AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                           AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) ,
                                           AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                           AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) ,
                                           Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) ,
                                           Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) ,
                                           Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) ,
                                           Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) ,
                                           Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) ,
                                           AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                           AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                           Integer.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) ,
                                           Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) ,
                                           AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4815AlbEncCli ,
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
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           Byte.valueOf(A213BarSit) ,
                                           A5291BarTipCor ,
                                           A396EmprCod ,
                                           AV62Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV63AlbProcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr), 11, "%") ;
      lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = GXutil.padr( GXutil.rtrim( AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli), 20, "%") ;
      lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser), 16, "%") ;
      lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd), 26, "%") ;
      lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom), 13, "%") ;
      lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli), 13, "%") ;
      lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0A716 */
      pr_default.execute(4, new Object[] {AV62Emprcod, Long.valueOf(AV63AlbProcod), lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr, AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel, lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli, AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel, lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser, AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel, lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd, AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel, lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom, AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel, Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum), Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to), Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol), Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to), lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to, Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc), Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to), Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2), Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to), AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to, Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie), Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod), Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to), Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub), Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to), Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas), Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to), lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs, AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel, Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit), Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to), AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel});
      while ( (pr_default.getStatus(4) != 101) )
      {
         brkA719 = false ;
         A396EmprCod = P0A716_A396EmprCod[0] ;
         A30AlbProCod = P0A716_A30AlbProCod[0] ;
         A3392AlbColNom = P0A716_A3392AlbColNom[0] ;
         A5291BarTipCor = P0A716_A5291BarTipCor[0] ;
         A213BarSit = P0A716_A213BarSit[0] ;
         A2839AlbProVal = P0A716_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0A716_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0A716_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0A716_A6466PlasCod[0] ;
         n6466PlasCod = P0A716_n6466PlasCod[0] ;
         A1266BarAlbTub = P0A716_A1266BarAlbTub[0] ;
         A1206TubCod = P0A716_A1206TubCod[0] ;
         n1206TubCod = P0A716_n1206TubCod[0] ;
         A1265BarAlbPie = P0A716_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0A716_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0A716_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0A716_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0A716_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0A716_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0A716_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0A716_A3393AlbColNum[0] ;
         A8879AlbSerD = P0A716_A8879AlbSerD[0] ;
         A3391AlbSer = P0A716_A3391AlbSer[0] ;
         A4815AlbEncCli = P0A716_A4815AlbEncCli[0] ;
         A130BarCodPar = P0A716_A130BarCodPar[0] ;
         A132BarCodReo = P0A716_A132BarCodReo[0] ;
         A129BarCod = P0A716_A129BarCod[0] ;
         A5291BarTipCor = P0A716_A5291BarTipCor[0] ;
         A213BarSit = P0A716_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(P0A716_A3392AlbColNom[0], A3392AlbColNom) == 0 ) )
         {
            brkA719 = false ;
            A396EmprCod = P0A716_A396EmprCod[0] ;
            A30AlbProCod = P0A716_A30AlbProCod[0] ;
            A130BarCodPar = P0A716_A130BarCodPar[0] ;
            A132BarCodReo = P0A716_A132BarCodReo[0] ;
            A129BarCod = P0A716_A129BarCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkA719 = true ;
            pr_default.readNext(4);
         }
         if ( ! (GXutil.strcmp("", A3392AlbColNom)==0) )
         {
            AV45Option = A3392AlbColNom ;
            AV46Options.add(AV45Option, 0);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA719 )
         {
            brkA719 = true ;
            pr_default.readNext(4);
         }
      }
      pr_default.close(4);
   }

   public void S171( )
   {
      /* 'LOADALBNOMCLIOPTIONS' Routine */
      returnInSub = false ;
      AV20TFAlbNomCli = AV57SearchTxt ;
      AV21TFAlbNomCli_Sel = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV73TFAlbEncCli ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV74TFAlbEncCli_Sel ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV12TFAlbSer ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV14TFAlbSerD ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV75TFAlbTipCol ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV76TFAlbTipCol_To ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV20TFAlbNomCli ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV30TFBarAlbPie ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV32TFTubCod ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV33TFTubCod_To ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV34TFBarAlbTub ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV36TFPlasCod ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV37TFPlasCod_To ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV38TFBarAlbPlas ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV64TFBarSit ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV65TFBarSit_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV77TFBarTipCor_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                           AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                           AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                           AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                           AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) ,
                                           AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                           AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) ,
                                           Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) ,
                                           Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) ,
                                           Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) ,
                                           Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) ,
                                           Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) ,
                                           AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                           AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                           Integer.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) ,
                                           Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) ,
                                           AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4815AlbEncCli ,
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
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           Byte.valueOf(A213BarSit) ,
                                           A5291BarTipCor ,
                                           A396EmprCod ,
                                           AV62Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV63AlbProcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr), 11, "%") ;
      lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = GXutil.padr( GXutil.rtrim( AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli), 20, "%") ;
      lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser), 16, "%") ;
      lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd), 26, "%") ;
      lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom), 13, "%") ;
      lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli), 13, "%") ;
      lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0A717 */
      pr_default.execute(5, new Object[] {AV62Emprcod, Long.valueOf(AV63AlbProcod), lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr, AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel, lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli, AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel, lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser, AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel, lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd, AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel, lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom, AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel, Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum), Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to), Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol), Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to), lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to, Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc), Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to), Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2), Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to), AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to, Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie), Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod), Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to), Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub), Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to), Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas), Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to), lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs, AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel, Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit), Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to), AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel});
      while ( (pr_default.getStatus(5) != 101) )
      {
         brkA7111 = false ;
         A396EmprCod = P0A717_A396EmprCod[0] ;
         A30AlbProCod = P0A717_A30AlbProCod[0] ;
         A12232AlbNomCli = P0A717_A12232AlbNomCli[0] ;
         A5291BarTipCor = P0A717_A5291BarTipCor[0] ;
         A213BarSit = P0A717_A213BarSit[0] ;
         A2839AlbProVal = P0A717_A2839AlbProVal[0] ;
         A2441AlbHdrObs = P0A717_A2441AlbHdrObs[0] ;
         A6467BarAlbPlas = P0A717_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0A717_A6466PlasCod[0] ;
         n6466PlasCod = P0A717_n6466PlasCod[0] ;
         A1266BarAlbTub = P0A717_A1266BarAlbTub[0] ;
         A1206TubCod = P0A717_A1206TubCod[0] ;
         n1206TubCod = P0A717_n1206TubCod[0] ;
         A1265BarAlbPie = P0A717_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0A717_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0A717_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0A717_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0A717_A1261BarAlbKgmE[0] ;
         A3394AlbTipCol = P0A717_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0A717_A3393AlbColNum[0] ;
         A3392AlbColNom = P0A717_A3392AlbColNom[0] ;
         A8879AlbSerD = P0A717_A8879AlbSerD[0] ;
         A3391AlbSer = P0A717_A3391AlbSer[0] ;
         A4815AlbEncCli = P0A717_A4815AlbEncCli[0] ;
         A130BarCodPar = P0A717_A130BarCodPar[0] ;
         A132BarCodReo = P0A717_A132BarCodReo[0] ;
         A129BarCod = P0A717_A129BarCod[0] ;
         A5291BarTipCor = P0A717_A5291BarTipCor[0] ;
         A213BarSit = P0A717_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(P0A717_A12232AlbNomCli[0], A12232AlbNomCli) == 0 ) )
         {
            brkA7111 = false ;
            A396EmprCod = P0A717_A396EmprCod[0] ;
            A30AlbProCod = P0A717_A30AlbProCod[0] ;
            A130BarCodPar = P0A717_A130BarCodPar[0] ;
            A132BarCodReo = P0A717_A132BarCodReo[0] ;
            A129BarCod = P0A717_A129BarCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkA7111 = true ;
            pr_default.readNext(5);
         }
         if ( ! (GXutil.strcmp("", A12232AlbNomCli)==0) )
         {
            AV45Option = A12232AlbNomCli ;
            AV46Options.add(AV45Option, 0);
            AV49OptionIndexes.add(GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV50count), "Z,ZZZ,ZZZ,ZZ9")), 0);
         }
         if ( AV46Options.size() == 50 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brkA7111 )
         {
            brkA7111 = true ;
            pr_default.readNext(5);
         }
      }
      pr_default.close(5);
   }

   public void S181( )
   {
      /* 'LOADALBHDROBSOPTIONS' Routine */
      returnInSub = false ;
      AV40TFAlbHdrObs = AV57SearchTxt ;
      AV41TFAlbHdrObs_Sel = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = AV10TFBarNHdr ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = AV11TFBarNHdr_Sel ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = AV73TFAlbEncCli ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = AV74TFAlbEncCli_Sel ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = AV12TFAlbSer ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = AV13TFAlbSer_Sel ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = AV14TFAlbSerD ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = AV15TFAlbSerD_Sel ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = AV16TFAlbColNom ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = AV17TFAlbColNom_Sel ;
      AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum = AV18TFAlbColNum ;
      AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to = AV19TFAlbColNum_To ;
      AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol = AV75TFAlbTipCol ;
      AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to = AV76TFAlbTipCol_To ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = AV20TFAlbNomCli ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = AV21TFAlbNomCli_Sel ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = AV22TFBarAlbKgmE ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = AV23TFBarAlbKgmE_To ;
      AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc = AV24TFAlbHdrAnc ;
      AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to = AV25TFAlbHdrAnc_To ;
      AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 = AV26TFAlbHdrgm2 ;
      AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to = AV27TFAlbHdrgm2_To ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = AV28TFBarAlbMtrE ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = AV29TFBarAlbMtrE_To ;
      AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie = AV30TFBarAlbPie ;
      AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to = AV31TFBarAlbPie_To ;
      AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod = AV32TFTubCod ;
      AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to = AV33TFTubCod_To ;
      AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub = AV34TFBarAlbTub ;
      AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to = AV35TFBarAlbTub_To ;
      AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod = AV36TFPlasCod ;
      AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to = AV37TFPlasCod_To ;
      AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas = AV38TFBarAlbPlas ;
      AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to = AV39TFBarAlbPlas_To ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = AV40TFAlbHdrObs ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = AV41TFAlbHdrObs_Sel ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = AV43TFAlbProVal_Sels ;
      AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit = AV64TFBarSit ;
      AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to = AV65TFBarSit_To ;
      AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = AV77TFBarTipCor_Sel ;
      pr_default.dynParam(6, new Object[]{ new Object[]{
                                           A2839AlbProVal ,
                                           AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                           AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                           AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                           AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                           AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                           AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                           AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                           AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                           AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                           AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                           AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                           Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) ,
                                           Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) ,
                                           Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) ,
                                           Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) ,
                                           AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                           AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                           AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                           AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                           Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) ,
                                           Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) ,
                                           Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) ,
                                           Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) ,
                                           AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                           AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                           Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) ,
                                           Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) ,
                                           Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) ,
                                           Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) ,
                                           Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) ,
                                           Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) ,
                                           Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) ,
                                           Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) ,
                                           Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) ,
                                           Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) ,
                                           AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                           AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                           Integer.valueOf(AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels.size()) ,
                                           Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) ,
                                           Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) ,
                                           AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A4815AlbEncCli ,
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
                                           Short.valueOf(A6466PlasCod) ,
                                           Short.valueOf(A6467BarAlbPlas) ,
                                           A2441AlbHdrObs ,
                                           Byte.valueOf(A213BarSit) ,
                                           A5291BarTipCor ,
                                           A396EmprCod ,
                                           AV62Emprcod ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Long.valueOf(AV63AlbProcod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr), 11, "%") ;
      lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = GXutil.padr( GXutil.rtrim( AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli), 20, "%") ;
      lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = GXutil.padr( GXutil.rtrim( AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser), 16, "%") ;
      lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = GXutil.padr( GXutil.rtrim( AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd), 26, "%") ;
      lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = GXutil.padr( GXutil.rtrim( AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom), 13, "%") ;
      lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = GXutil.padr( GXutil.rtrim( AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli), 13, "%") ;
      lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = GXutil.padr( GXutil.rtrim( AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs), 60, "%") ;
      /* Using cursor P0A718 */
      pr_default.execute(6, new Object[] {AV62Emprcod, Long.valueOf(AV63AlbProcod), lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr, AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel, lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli, AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel, lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser, AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel, lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd, AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel, lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom, AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel, Integer.valueOf(AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum), Integer.valueOf(AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to), Byte.valueOf(AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol), Byte.valueOf(AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to), lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli, AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to, Short.valueOf(AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc), Short.valueOf(AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to), Short.valueOf(AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2), Short.valueOf(AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to), AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to, Integer.valueOf(AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie), Integer.valueOf(AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to), Short.valueOf(AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod), Short.valueOf(AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to), Integer.valueOf(AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub), Integer.valueOf(AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to), Short.valueOf(AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod), Short.valueOf(AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to), Short.valueOf(AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas), Short.valueOf(AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to), lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs, AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel, Byte.valueOf(AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit), Byte.valueOf(AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to), AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel});
      while ( (pr_default.getStatus(6) != 101) )
      {
         brkA7113 = false ;
         A396EmprCod = P0A718_A396EmprCod[0] ;
         A30AlbProCod = P0A718_A30AlbProCod[0] ;
         A2441AlbHdrObs = P0A718_A2441AlbHdrObs[0] ;
         A5291BarTipCor = P0A718_A5291BarTipCor[0] ;
         A213BarSit = P0A718_A213BarSit[0] ;
         A2839AlbProVal = P0A718_A2839AlbProVal[0] ;
         A6467BarAlbPlas = P0A718_A6467BarAlbPlas[0] ;
         A6466PlasCod = P0A718_A6466PlasCod[0] ;
         n6466PlasCod = P0A718_n6466PlasCod[0] ;
         A1266BarAlbTub = P0A718_A1266BarAlbTub[0] ;
         A1206TubCod = P0A718_A1206TubCod[0] ;
         n1206TubCod = P0A718_n1206TubCod[0] ;
         A1265BarAlbPie = P0A718_A1265BarAlbPie[0] ;
         A1263BarAlbMtrE = P0A718_A1263BarAlbMtrE[0] ;
         A5019AlbHdrgm2 = P0A718_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P0A718_A3271AlbHdrAnc[0] ;
         A1261BarAlbKgmE = P0A718_A1261BarAlbKgmE[0] ;
         A12232AlbNomCli = P0A718_A12232AlbNomCli[0] ;
         A3394AlbTipCol = P0A718_A3394AlbTipCol[0] ;
         A3393AlbColNum = P0A718_A3393AlbColNum[0] ;
         A3392AlbColNom = P0A718_A3392AlbColNom[0] ;
         A8879AlbSerD = P0A718_A8879AlbSerD[0] ;
         A3391AlbSer = P0A718_A3391AlbSer[0] ;
         A4815AlbEncCli = P0A718_A4815AlbEncCli[0] ;
         A130BarCodPar = P0A718_A130BarCodPar[0] ;
         A132BarCodReo = P0A718_A132BarCodReo[0] ;
         A129BarCod = P0A718_A129BarCod[0] ;
         A5291BarTipCor = P0A718_A5291BarTipCor[0] ;
         A213BarSit = P0A718_A213BarSit[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV50count = 0 ;
         while ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(P0A718_A2441AlbHdrObs[0], A2441AlbHdrObs) == 0 ) )
         {
            brkA7113 = false ;
            A396EmprCod = P0A718_A396EmprCod[0] ;
            A30AlbProCod = P0A718_A30AlbProCod[0] ;
            A130BarCodPar = P0A718_A130BarCodPar[0] ;
            A132BarCodReo = P0A718_A132BarCodReo[0] ;
            A129BarCod = P0A718_A129BarCod[0] ;
            AV50count = (long)(AV50count+1) ;
            brkA7113 = true ;
            pr_default.readNext(6);
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
         if ( ! brkA7113 )
         {
            brkA7113 = true ;
            pr_default.readNext(6);
         }
      }
      pr_default.close(6);
   }

   protected void cleanup( )
   {
      this.aP3[0] = documentodetransporteproduccion_7getfilterdata.this.AV59OptionsJson;
      this.aP4[0] = documentodetransporteproduccion_7getfilterdata.this.AV60OptionsDescJson;
      this.aP5[0] = documentodetransporteproduccion_7getfilterdata.this.AV61OptionIndexesJson;
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
      AV73TFAlbEncCli = "" ;
      AV74TFAlbEncCli_Sel = "" ;
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
      AV77TFBarTipCor_Sel = "" ;
      AV62Emprcod = "" ;
      AV67GuiRemCln = "" ;
      AV68AlbProFch = GXutil.nullDate() ;
      AV69AlbSec = "" ;
      AV70AlbPropri = "" ;
      AV72AlbLic = "" ;
      Gx_mode = "" ;
      A13696BarNHdr = "" ;
      AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = "" ;
      AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel = "" ;
      AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = "" ;
      AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel = "" ;
      AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = "" ;
      AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel = "" ;
      AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = "" ;
      AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel = "" ;
      AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = "" ;
      AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel = "" ;
      AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = "" ;
      AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel = "" ;
      AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme = DecimalUtil.ZERO ;
      AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre = DecimalUtil.ZERO ;
      AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = "" ;
      AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel = "" ;
      AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel = "" ;
      scmdbuf = "" ;
      lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr = "" ;
      lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli = "" ;
      lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser = "" ;
      lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd = "" ;
      lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom = "" ;
      lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli = "" ;
      lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs = "" ;
      A2839AlbProVal = "" ;
      A130BarCodPar = "" ;
      A4815AlbEncCli = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2441AlbHdrObs = "" ;
      A5291BarTipCor = "" ;
      A396EmprCod = "" ;
      P0A712_A30AlbProCod = new long[1] ;
      P0A712_A396EmprCod = new String[] {""} ;
      P0A712_A5291BarTipCor = new String[] {""} ;
      P0A712_A213BarSit = new byte[1] ;
      P0A712_A2839AlbProVal = new String[] {""} ;
      P0A712_A2441AlbHdrObs = new String[] {""} ;
      P0A712_A6467BarAlbPlas = new short[1] ;
      P0A712_A6466PlasCod = new short[1] ;
      P0A712_n6466PlasCod = new boolean[] {false} ;
      P0A712_A1266BarAlbTub = new int[1] ;
      P0A712_A1206TubCod = new short[1] ;
      P0A712_n1206TubCod = new boolean[] {false} ;
      P0A712_A1265BarAlbPie = new int[1] ;
      P0A712_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A712_A5019AlbHdrgm2 = new short[1] ;
      P0A712_A3271AlbHdrAnc = new short[1] ;
      P0A712_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A712_A12232AlbNomCli = new String[] {""} ;
      P0A712_A3394AlbTipCol = new byte[1] ;
      P0A712_A3393AlbColNum = new int[1] ;
      P0A712_A3392AlbColNom = new String[] {""} ;
      P0A712_A8879AlbSerD = new String[] {""} ;
      P0A712_A3391AlbSer = new String[] {""} ;
      P0A712_A4815AlbEncCli = new String[] {""} ;
      P0A712_A130BarCodPar = new String[] {""} ;
      P0A712_A132BarCodReo = new byte[1] ;
      P0A712_A129BarCod = new int[1] ;
      AV45Option = "" ;
      P0A713_A396EmprCod = new String[] {""} ;
      P0A713_A30AlbProCod = new long[1] ;
      P0A713_A4815AlbEncCli = new String[] {""} ;
      P0A713_A5291BarTipCor = new String[] {""} ;
      P0A713_A213BarSit = new byte[1] ;
      P0A713_A2839AlbProVal = new String[] {""} ;
      P0A713_A2441AlbHdrObs = new String[] {""} ;
      P0A713_A6467BarAlbPlas = new short[1] ;
      P0A713_A6466PlasCod = new short[1] ;
      P0A713_n6466PlasCod = new boolean[] {false} ;
      P0A713_A1266BarAlbTub = new int[1] ;
      P0A713_A1206TubCod = new short[1] ;
      P0A713_n1206TubCod = new boolean[] {false} ;
      P0A713_A1265BarAlbPie = new int[1] ;
      P0A713_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A713_A5019AlbHdrgm2 = new short[1] ;
      P0A713_A3271AlbHdrAnc = new short[1] ;
      P0A713_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A713_A12232AlbNomCli = new String[] {""} ;
      P0A713_A3394AlbTipCol = new byte[1] ;
      P0A713_A3393AlbColNum = new int[1] ;
      P0A713_A3392AlbColNom = new String[] {""} ;
      P0A713_A8879AlbSerD = new String[] {""} ;
      P0A713_A3391AlbSer = new String[] {""} ;
      P0A713_A130BarCodPar = new String[] {""} ;
      P0A713_A132BarCodReo = new byte[1] ;
      P0A713_A129BarCod = new int[1] ;
      P0A714_A396EmprCod = new String[] {""} ;
      P0A714_A30AlbProCod = new long[1] ;
      P0A714_A3391AlbSer = new String[] {""} ;
      P0A714_A5291BarTipCor = new String[] {""} ;
      P0A714_A213BarSit = new byte[1] ;
      P0A714_A2839AlbProVal = new String[] {""} ;
      P0A714_A2441AlbHdrObs = new String[] {""} ;
      P0A714_A6467BarAlbPlas = new short[1] ;
      P0A714_A6466PlasCod = new short[1] ;
      P0A714_n6466PlasCod = new boolean[] {false} ;
      P0A714_A1266BarAlbTub = new int[1] ;
      P0A714_A1206TubCod = new short[1] ;
      P0A714_n1206TubCod = new boolean[] {false} ;
      P0A714_A1265BarAlbPie = new int[1] ;
      P0A714_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A714_A5019AlbHdrgm2 = new short[1] ;
      P0A714_A3271AlbHdrAnc = new short[1] ;
      P0A714_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A714_A12232AlbNomCli = new String[] {""} ;
      P0A714_A3394AlbTipCol = new byte[1] ;
      P0A714_A3393AlbColNum = new int[1] ;
      P0A714_A3392AlbColNom = new String[] {""} ;
      P0A714_A8879AlbSerD = new String[] {""} ;
      P0A714_A4815AlbEncCli = new String[] {""} ;
      P0A714_A130BarCodPar = new String[] {""} ;
      P0A714_A132BarCodReo = new byte[1] ;
      P0A714_A129BarCod = new int[1] ;
      P0A715_A396EmprCod = new String[] {""} ;
      P0A715_A30AlbProCod = new long[1] ;
      P0A715_A8879AlbSerD = new String[] {""} ;
      P0A715_A5291BarTipCor = new String[] {""} ;
      P0A715_A213BarSit = new byte[1] ;
      P0A715_A2839AlbProVal = new String[] {""} ;
      P0A715_A2441AlbHdrObs = new String[] {""} ;
      P0A715_A6467BarAlbPlas = new short[1] ;
      P0A715_A6466PlasCod = new short[1] ;
      P0A715_n6466PlasCod = new boolean[] {false} ;
      P0A715_A1266BarAlbTub = new int[1] ;
      P0A715_A1206TubCod = new short[1] ;
      P0A715_n1206TubCod = new boolean[] {false} ;
      P0A715_A1265BarAlbPie = new int[1] ;
      P0A715_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A715_A5019AlbHdrgm2 = new short[1] ;
      P0A715_A3271AlbHdrAnc = new short[1] ;
      P0A715_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A715_A12232AlbNomCli = new String[] {""} ;
      P0A715_A3394AlbTipCol = new byte[1] ;
      P0A715_A3393AlbColNum = new int[1] ;
      P0A715_A3392AlbColNom = new String[] {""} ;
      P0A715_A3391AlbSer = new String[] {""} ;
      P0A715_A4815AlbEncCli = new String[] {""} ;
      P0A715_A130BarCodPar = new String[] {""} ;
      P0A715_A132BarCodReo = new byte[1] ;
      P0A715_A129BarCod = new int[1] ;
      P0A716_A396EmprCod = new String[] {""} ;
      P0A716_A30AlbProCod = new long[1] ;
      P0A716_A3392AlbColNom = new String[] {""} ;
      P0A716_A5291BarTipCor = new String[] {""} ;
      P0A716_A213BarSit = new byte[1] ;
      P0A716_A2839AlbProVal = new String[] {""} ;
      P0A716_A2441AlbHdrObs = new String[] {""} ;
      P0A716_A6467BarAlbPlas = new short[1] ;
      P0A716_A6466PlasCod = new short[1] ;
      P0A716_n6466PlasCod = new boolean[] {false} ;
      P0A716_A1266BarAlbTub = new int[1] ;
      P0A716_A1206TubCod = new short[1] ;
      P0A716_n1206TubCod = new boolean[] {false} ;
      P0A716_A1265BarAlbPie = new int[1] ;
      P0A716_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A716_A5019AlbHdrgm2 = new short[1] ;
      P0A716_A3271AlbHdrAnc = new short[1] ;
      P0A716_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A716_A12232AlbNomCli = new String[] {""} ;
      P0A716_A3394AlbTipCol = new byte[1] ;
      P0A716_A3393AlbColNum = new int[1] ;
      P0A716_A8879AlbSerD = new String[] {""} ;
      P0A716_A3391AlbSer = new String[] {""} ;
      P0A716_A4815AlbEncCli = new String[] {""} ;
      P0A716_A130BarCodPar = new String[] {""} ;
      P0A716_A132BarCodReo = new byte[1] ;
      P0A716_A129BarCod = new int[1] ;
      P0A717_A396EmprCod = new String[] {""} ;
      P0A717_A30AlbProCod = new long[1] ;
      P0A717_A12232AlbNomCli = new String[] {""} ;
      P0A717_A5291BarTipCor = new String[] {""} ;
      P0A717_A213BarSit = new byte[1] ;
      P0A717_A2839AlbProVal = new String[] {""} ;
      P0A717_A2441AlbHdrObs = new String[] {""} ;
      P0A717_A6467BarAlbPlas = new short[1] ;
      P0A717_A6466PlasCod = new short[1] ;
      P0A717_n6466PlasCod = new boolean[] {false} ;
      P0A717_A1266BarAlbTub = new int[1] ;
      P0A717_A1206TubCod = new short[1] ;
      P0A717_n1206TubCod = new boolean[] {false} ;
      P0A717_A1265BarAlbPie = new int[1] ;
      P0A717_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A717_A5019AlbHdrgm2 = new short[1] ;
      P0A717_A3271AlbHdrAnc = new short[1] ;
      P0A717_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A717_A3394AlbTipCol = new byte[1] ;
      P0A717_A3393AlbColNum = new int[1] ;
      P0A717_A3392AlbColNom = new String[] {""} ;
      P0A717_A8879AlbSerD = new String[] {""} ;
      P0A717_A3391AlbSer = new String[] {""} ;
      P0A717_A4815AlbEncCli = new String[] {""} ;
      P0A717_A130BarCodPar = new String[] {""} ;
      P0A717_A132BarCodReo = new byte[1] ;
      P0A717_A129BarCod = new int[1] ;
      P0A718_A396EmprCod = new String[] {""} ;
      P0A718_A30AlbProCod = new long[1] ;
      P0A718_A2441AlbHdrObs = new String[] {""} ;
      P0A718_A5291BarTipCor = new String[] {""} ;
      P0A718_A213BarSit = new byte[1] ;
      P0A718_A2839AlbProVal = new String[] {""} ;
      P0A718_A6467BarAlbPlas = new short[1] ;
      P0A718_A6466PlasCod = new short[1] ;
      P0A718_n6466PlasCod = new boolean[] {false} ;
      P0A718_A1266BarAlbTub = new int[1] ;
      P0A718_A1206TubCod = new short[1] ;
      P0A718_n1206TubCod = new boolean[] {false} ;
      P0A718_A1265BarAlbPie = new int[1] ;
      P0A718_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A718_A5019AlbHdrgm2 = new short[1] ;
      P0A718_A3271AlbHdrAnc = new short[1] ;
      P0A718_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A718_A12232AlbNomCli = new String[] {""} ;
      P0A718_A3394AlbTipCol = new byte[1] ;
      P0A718_A3393AlbColNum = new int[1] ;
      P0A718_A3392AlbColNom = new String[] {""} ;
      P0A718_A8879AlbSerD = new String[] {""} ;
      P0A718_A3391AlbSer = new String[] {""} ;
      P0A718_A4815AlbEncCli = new String[] {""} ;
      P0A718_A130BarCodPar = new String[] {""} ;
      P0A718_A132BarCodReo = new byte[1] ;
      P0A718_A129BarCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_7getfilterdata__default(),
         new Object[] {
             new Object[] {
            P0A712_A30AlbProCod, P0A712_A396EmprCod, P0A712_A5291BarTipCor, P0A712_A213BarSit, P0A712_A2839AlbProVal, P0A712_A2441AlbHdrObs, P0A712_A6467BarAlbPlas, P0A712_A6466PlasCod, P0A712_n6466PlasCod, P0A712_A1266BarAlbTub,
            P0A712_A1206TubCod, P0A712_n1206TubCod, P0A712_A1265BarAlbPie, P0A712_A1263BarAlbMtrE, P0A712_A5019AlbHdrgm2, P0A712_A3271AlbHdrAnc, P0A712_A1261BarAlbKgmE, P0A712_A12232AlbNomCli, P0A712_A3394AlbTipCol, P0A712_A3393AlbColNum,
            P0A712_A3392AlbColNom, P0A712_A8879AlbSerD, P0A712_A3391AlbSer, P0A712_A4815AlbEncCli, P0A712_A130BarCodPar, P0A712_A132BarCodReo, P0A712_A129BarCod
            }
            , new Object[] {
            P0A713_A396EmprCod, P0A713_A30AlbProCod, P0A713_A4815AlbEncCli, P0A713_A5291BarTipCor, P0A713_A213BarSit, P0A713_A2839AlbProVal, P0A713_A2441AlbHdrObs, P0A713_A6467BarAlbPlas, P0A713_A6466PlasCod, P0A713_n6466PlasCod,
            P0A713_A1266BarAlbTub, P0A713_A1206TubCod, P0A713_n1206TubCod, P0A713_A1265BarAlbPie, P0A713_A1263BarAlbMtrE, P0A713_A5019AlbHdrgm2, P0A713_A3271AlbHdrAnc, P0A713_A1261BarAlbKgmE, P0A713_A12232AlbNomCli, P0A713_A3394AlbTipCol,
            P0A713_A3393AlbColNum, P0A713_A3392AlbColNom, P0A713_A8879AlbSerD, P0A713_A3391AlbSer, P0A713_A130BarCodPar, P0A713_A132BarCodReo, P0A713_A129BarCod
            }
            , new Object[] {
            P0A714_A396EmprCod, P0A714_A30AlbProCod, P0A714_A3391AlbSer, P0A714_A5291BarTipCor, P0A714_A213BarSit, P0A714_A2839AlbProVal, P0A714_A2441AlbHdrObs, P0A714_A6467BarAlbPlas, P0A714_A6466PlasCod, P0A714_n6466PlasCod,
            P0A714_A1266BarAlbTub, P0A714_A1206TubCod, P0A714_n1206TubCod, P0A714_A1265BarAlbPie, P0A714_A1263BarAlbMtrE, P0A714_A5019AlbHdrgm2, P0A714_A3271AlbHdrAnc, P0A714_A1261BarAlbKgmE, P0A714_A12232AlbNomCli, P0A714_A3394AlbTipCol,
            P0A714_A3393AlbColNum, P0A714_A3392AlbColNom, P0A714_A8879AlbSerD, P0A714_A4815AlbEncCli, P0A714_A130BarCodPar, P0A714_A132BarCodReo, P0A714_A129BarCod
            }
            , new Object[] {
            P0A715_A396EmprCod, P0A715_A30AlbProCod, P0A715_A8879AlbSerD, P0A715_A5291BarTipCor, P0A715_A213BarSit, P0A715_A2839AlbProVal, P0A715_A2441AlbHdrObs, P0A715_A6467BarAlbPlas, P0A715_A6466PlasCod, P0A715_n6466PlasCod,
            P0A715_A1266BarAlbTub, P0A715_A1206TubCod, P0A715_n1206TubCod, P0A715_A1265BarAlbPie, P0A715_A1263BarAlbMtrE, P0A715_A5019AlbHdrgm2, P0A715_A3271AlbHdrAnc, P0A715_A1261BarAlbKgmE, P0A715_A12232AlbNomCli, P0A715_A3394AlbTipCol,
            P0A715_A3393AlbColNum, P0A715_A3392AlbColNom, P0A715_A3391AlbSer, P0A715_A4815AlbEncCli, P0A715_A130BarCodPar, P0A715_A132BarCodReo, P0A715_A129BarCod
            }
            , new Object[] {
            P0A716_A396EmprCod, P0A716_A30AlbProCod, P0A716_A3392AlbColNom, P0A716_A5291BarTipCor, P0A716_A213BarSit, P0A716_A2839AlbProVal, P0A716_A2441AlbHdrObs, P0A716_A6467BarAlbPlas, P0A716_A6466PlasCod, P0A716_n6466PlasCod,
            P0A716_A1266BarAlbTub, P0A716_A1206TubCod, P0A716_n1206TubCod, P0A716_A1265BarAlbPie, P0A716_A1263BarAlbMtrE, P0A716_A5019AlbHdrgm2, P0A716_A3271AlbHdrAnc, P0A716_A1261BarAlbKgmE, P0A716_A12232AlbNomCli, P0A716_A3394AlbTipCol,
            P0A716_A3393AlbColNum, P0A716_A8879AlbSerD, P0A716_A3391AlbSer, P0A716_A4815AlbEncCli, P0A716_A130BarCodPar, P0A716_A132BarCodReo, P0A716_A129BarCod
            }
            , new Object[] {
            P0A717_A396EmprCod, P0A717_A30AlbProCod, P0A717_A12232AlbNomCli, P0A717_A5291BarTipCor, P0A717_A213BarSit, P0A717_A2839AlbProVal, P0A717_A2441AlbHdrObs, P0A717_A6467BarAlbPlas, P0A717_A6466PlasCod, P0A717_n6466PlasCod,
            P0A717_A1266BarAlbTub, P0A717_A1206TubCod, P0A717_n1206TubCod, P0A717_A1265BarAlbPie, P0A717_A1263BarAlbMtrE, P0A717_A5019AlbHdrgm2, P0A717_A3271AlbHdrAnc, P0A717_A1261BarAlbKgmE, P0A717_A3394AlbTipCol, P0A717_A3393AlbColNum,
            P0A717_A3392AlbColNom, P0A717_A8879AlbSerD, P0A717_A3391AlbSer, P0A717_A4815AlbEncCli, P0A717_A130BarCodPar, P0A717_A132BarCodReo, P0A717_A129BarCod
            }
            , new Object[] {
            P0A718_A396EmprCod, P0A718_A30AlbProCod, P0A718_A2441AlbHdrObs, P0A718_A5291BarTipCor, P0A718_A213BarSit, P0A718_A2839AlbProVal, P0A718_A6467BarAlbPlas, P0A718_A6466PlasCod, P0A718_n6466PlasCod, P0A718_A1266BarAlbTub,
            P0A718_A1206TubCod, P0A718_n1206TubCod, P0A718_A1265BarAlbPie, P0A718_A1263BarAlbMtrE, P0A718_A5019AlbHdrgm2, P0A718_A3271AlbHdrAnc, P0A718_A1261BarAlbKgmE, P0A718_A12232AlbNomCli, P0A718_A3394AlbTipCol, P0A718_A3393AlbColNum,
            P0A718_A3392AlbColNom, P0A718_A8879AlbSerD, P0A718_A3391AlbSer, P0A718_A4815AlbEncCli, P0A718_A130BarCodPar, P0A718_A132BarCodReo, P0A718_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV75TFAlbTipCol ;
   private byte AV76TFAlbTipCol_To ;
   private byte AV64TFBarSit ;
   private byte AV65TFBarSit_To ;
   private byte AV71AlbEnvFtp ;
   private byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ;
   private byte AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ;
   private byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ;
   private byte AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ;
   private byte A132BarCodReo ;
   private byte A3394AlbTipCol ;
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
   private short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ;
   private short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ;
   private short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ;
   private short AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ;
   private short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ;
   private short AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ;
   private short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ;
   private short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ;
   private short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ;
   private short AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A1206TubCod ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short Gx_err ;
   private int AV80GXV1 ;
   private int AV18TFAlbColNum ;
   private int AV19TFAlbColNum_To ;
   private int AV30TFBarAlbPie ;
   private int AV31TFBarAlbPie_To ;
   private int AV34TFBarAlbTub ;
   private int AV35TFBarAlbTub_To ;
   private int AV66Guiremcli ;
   private int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ;
   private int AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ;
   private int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ;
   private int AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ;
   private int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ;
   private int AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ;
   private int AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ;
   private int A129BarCod ;
   private int A3393AlbColNum ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int AV44InsertIndex ;
   private long AV63AlbProcod ;
   private long A30AlbProCod ;
   private long AV50count ;
   private java.math.BigDecimal AV22TFBarAlbKgmE ;
   private java.math.BigDecimal AV23TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV28TFBarAlbMtrE ;
   private java.math.BigDecimal AV29TFBarAlbMtrE_To ;
   private java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ;
   private java.math.BigDecimal AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ;
   private java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ;
   private java.math.BigDecimal AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private String AV10TFBarNHdr ;
   private String AV11TFBarNHdr_Sel ;
   private String AV73TFAlbEncCli ;
   private String AV74TFAlbEncCli_Sel ;
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
   private String AV77TFBarTipCor_Sel ;
   private String AV62Emprcod ;
   private String AV67GuiRemCln ;
   private String AV69AlbSec ;
   private String AV70AlbPropri ;
   private String AV72AlbLic ;
   private String Gx_mode ;
   private String A13696BarNHdr ;
   private String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ;
   private String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ;
   private String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ;
   private String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ;
   private String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ;
   private String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ;
   private String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ;
   private String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ;
   private String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ;
   private String AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ;
   private String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ;
   private String AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ;
   private String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ;
   private String AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ;
   private String AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ;
   private String scmdbuf ;
   private String lV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ;
   private String lV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ;
   private String lV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ;
   private String lV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ;
   private String lV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ;
   private String lV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ;
   private String lV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ;
   private String A2839AlbProVal ;
   private String A130BarCodPar ;
   private String A4815AlbEncCli ;
   private String A3391AlbSer ;
   private String A8879AlbSerD ;
   private String A3392AlbColNom ;
   private String A12232AlbNomCli ;
   private String A2441AlbHdrObs ;
   private String A5291BarTipCor ;
   private String A396EmprCod ;
   private java.util.Date AV68AlbProFch ;
   private boolean returnInSub ;
   private boolean n6466PlasCod ;
   private boolean n1206TubCod ;
   private boolean brkA713 ;
   private boolean brkA715 ;
   private boolean brkA717 ;
   private boolean brkA719 ;
   private boolean brkA7111 ;
   private boolean brkA7113 ;
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
   private long[] P0A712_A30AlbProCod ;
   private String[] P0A712_A396EmprCod ;
   private String[] P0A712_A5291BarTipCor ;
   private byte[] P0A712_A213BarSit ;
   private String[] P0A712_A2839AlbProVal ;
   private String[] P0A712_A2441AlbHdrObs ;
   private short[] P0A712_A6467BarAlbPlas ;
   private short[] P0A712_A6466PlasCod ;
   private boolean[] P0A712_n6466PlasCod ;
   private int[] P0A712_A1266BarAlbTub ;
   private short[] P0A712_A1206TubCod ;
   private boolean[] P0A712_n1206TubCod ;
   private int[] P0A712_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0A712_A1263BarAlbMtrE ;
   private short[] P0A712_A5019AlbHdrgm2 ;
   private short[] P0A712_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0A712_A1261BarAlbKgmE ;
   private String[] P0A712_A12232AlbNomCli ;
   private byte[] P0A712_A3394AlbTipCol ;
   private int[] P0A712_A3393AlbColNum ;
   private String[] P0A712_A3392AlbColNom ;
   private String[] P0A712_A8879AlbSerD ;
   private String[] P0A712_A3391AlbSer ;
   private String[] P0A712_A4815AlbEncCli ;
   private String[] P0A712_A130BarCodPar ;
   private byte[] P0A712_A132BarCodReo ;
   private int[] P0A712_A129BarCod ;
   private String[] P0A713_A396EmprCod ;
   private long[] P0A713_A30AlbProCod ;
   private String[] P0A713_A4815AlbEncCli ;
   private String[] P0A713_A5291BarTipCor ;
   private byte[] P0A713_A213BarSit ;
   private String[] P0A713_A2839AlbProVal ;
   private String[] P0A713_A2441AlbHdrObs ;
   private short[] P0A713_A6467BarAlbPlas ;
   private short[] P0A713_A6466PlasCod ;
   private boolean[] P0A713_n6466PlasCod ;
   private int[] P0A713_A1266BarAlbTub ;
   private short[] P0A713_A1206TubCod ;
   private boolean[] P0A713_n1206TubCod ;
   private int[] P0A713_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0A713_A1263BarAlbMtrE ;
   private short[] P0A713_A5019AlbHdrgm2 ;
   private short[] P0A713_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0A713_A1261BarAlbKgmE ;
   private String[] P0A713_A12232AlbNomCli ;
   private byte[] P0A713_A3394AlbTipCol ;
   private int[] P0A713_A3393AlbColNum ;
   private String[] P0A713_A3392AlbColNom ;
   private String[] P0A713_A8879AlbSerD ;
   private String[] P0A713_A3391AlbSer ;
   private String[] P0A713_A130BarCodPar ;
   private byte[] P0A713_A132BarCodReo ;
   private int[] P0A713_A129BarCod ;
   private String[] P0A714_A396EmprCod ;
   private long[] P0A714_A30AlbProCod ;
   private String[] P0A714_A3391AlbSer ;
   private String[] P0A714_A5291BarTipCor ;
   private byte[] P0A714_A213BarSit ;
   private String[] P0A714_A2839AlbProVal ;
   private String[] P0A714_A2441AlbHdrObs ;
   private short[] P0A714_A6467BarAlbPlas ;
   private short[] P0A714_A6466PlasCod ;
   private boolean[] P0A714_n6466PlasCod ;
   private int[] P0A714_A1266BarAlbTub ;
   private short[] P0A714_A1206TubCod ;
   private boolean[] P0A714_n1206TubCod ;
   private int[] P0A714_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0A714_A1263BarAlbMtrE ;
   private short[] P0A714_A5019AlbHdrgm2 ;
   private short[] P0A714_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0A714_A1261BarAlbKgmE ;
   private String[] P0A714_A12232AlbNomCli ;
   private byte[] P0A714_A3394AlbTipCol ;
   private int[] P0A714_A3393AlbColNum ;
   private String[] P0A714_A3392AlbColNom ;
   private String[] P0A714_A8879AlbSerD ;
   private String[] P0A714_A4815AlbEncCli ;
   private String[] P0A714_A130BarCodPar ;
   private byte[] P0A714_A132BarCodReo ;
   private int[] P0A714_A129BarCod ;
   private String[] P0A715_A396EmprCod ;
   private long[] P0A715_A30AlbProCod ;
   private String[] P0A715_A8879AlbSerD ;
   private String[] P0A715_A5291BarTipCor ;
   private byte[] P0A715_A213BarSit ;
   private String[] P0A715_A2839AlbProVal ;
   private String[] P0A715_A2441AlbHdrObs ;
   private short[] P0A715_A6467BarAlbPlas ;
   private short[] P0A715_A6466PlasCod ;
   private boolean[] P0A715_n6466PlasCod ;
   private int[] P0A715_A1266BarAlbTub ;
   private short[] P0A715_A1206TubCod ;
   private boolean[] P0A715_n1206TubCod ;
   private int[] P0A715_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0A715_A1263BarAlbMtrE ;
   private short[] P0A715_A5019AlbHdrgm2 ;
   private short[] P0A715_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0A715_A1261BarAlbKgmE ;
   private String[] P0A715_A12232AlbNomCli ;
   private byte[] P0A715_A3394AlbTipCol ;
   private int[] P0A715_A3393AlbColNum ;
   private String[] P0A715_A3392AlbColNom ;
   private String[] P0A715_A3391AlbSer ;
   private String[] P0A715_A4815AlbEncCli ;
   private String[] P0A715_A130BarCodPar ;
   private byte[] P0A715_A132BarCodReo ;
   private int[] P0A715_A129BarCod ;
   private String[] P0A716_A396EmprCod ;
   private long[] P0A716_A30AlbProCod ;
   private String[] P0A716_A3392AlbColNom ;
   private String[] P0A716_A5291BarTipCor ;
   private byte[] P0A716_A213BarSit ;
   private String[] P0A716_A2839AlbProVal ;
   private String[] P0A716_A2441AlbHdrObs ;
   private short[] P0A716_A6467BarAlbPlas ;
   private short[] P0A716_A6466PlasCod ;
   private boolean[] P0A716_n6466PlasCod ;
   private int[] P0A716_A1266BarAlbTub ;
   private short[] P0A716_A1206TubCod ;
   private boolean[] P0A716_n1206TubCod ;
   private int[] P0A716_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0A716_A1263BarAlbMtrE ;
   private short[] P0A716_A5019AlbHdrgm2 ;
   private short[] P0A716_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0A716_A1261BarAlbKgmE ;
   private String[] P0A716_A12232AlbNomCli ;
   private byte[] P0A716_A3394AlbTipCol ;
   private int[] P0A716_A3393AlbColNum ;
   private String[] P0A716_A8879AlbSerD ;
   private String[] P0A716_A3391AlbSer ;
   private String[] P0A716_A4815AlbEncCli ;
   private String[] P0A716_A130BarCodPar ;
   private byte[] P0A716_A132BarCodReo ;
   private int[] P0A716_A129BarCod ;
   private String[] P0A717_A396EmprCod ;
   private long[] P0A717_A30AlbProCod ;
   private String[] P0A717_A12232AlbNomCli ;
   private String[] P0A717_A5291BarTipCor ;
   private byte[] P0A717_A213BarSit ;
   private String[] P0A717_A2839AlbProVal ;
   private String[] P0A717_A2441AlbHdrObs ;
   private short[] P0A717_A6467BarAlbPlas ;
   private short[] P0A717_A6466PlasCod ;
   private boolean[] P0A717_n6466PlasCod ;
   private int[] P0A717_A1266BarAlbTub ;
   private short[] P0A717_A1206TubCod ;
   private boolean[] P0A717_n1206TubCod ;
   private int[] P0A717_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0A717_A1263BarAlbMtrE ;
   private short[] P0A717_A5019AlbHdrgm2 ;
   private short[] P0A717_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0A717_A1261BarAlbKgmE ;
   private byte[] P0A717_A3394AlbTipCol ;
   private int[] P0A717_A3393AlbColNum ;
   private String[] P0A717_A3392AlbColNom ;
   private String[] P0A717_A8879AlbSerD ;
   private String[] P0A717_A3391AlbSer ;
   private String[] P0A717_A4815AlbEncCli ;
   private String[] P0A717_A130BarCodPar ;
   private byte[] P0A717_A132BarCodReo ;
   private int[] P0A717_A129BarCod ;
   private String[] P0A718_A396EmprCod ;
   private long[] P0A718_A30AlbProCod ;
   private String[] P0A718_A2441AlbHdrObs ;
   private String[] P0A718_A5291BarTipCor ;
   private byte[] P0A718_A213BarSit ;
   private String[] P0A718_A2839AlbProVal ;
   private short[] P0A718_A6467BarAlbPlas ;
   private short[] P0A718_A6466PlasCod ;
   private boolean[] P0A718_n6466PlasCod ;
   private int[] P0A718_A1266BarAlbTub ;
   private short[] P0A718_A1206TubCod ;
   private boolean[] P0A718_n1206TubCod ;
   private int[] P0A718_A1265BarAlbPie ;
   private java.math.BigDecimal[] P0A718_A1263BarAlbMtrE ;
   private short[] P0A718_A5019AlbHdrgm2 ;
   private short[] P0A718_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P0A718_A1261BarAlbKgmE ;
   private String[] P0A718_A12232AlbNomCli ;
   private byte[] P0A718_A3394AlbTipCol ;
   private int[] P0A718_A3393AlbColNum ;
   private String[] P0A718_A3392AlbColNom ;
   private String[] P0A718_A8879AlbSerD ;
   private String[] P0A718_A3391AlbSer ;
   private String[] P0A718_A4815AlbEncCli ;
   private String[] P0A718_A130BarCodPar ;
   private byte[] P0A718_A132BarCodReo ;
   private int[] P0A718_A129BarCod ;
   private GXSimpleCollection<String> AV43TFAlbProVal_Sels ;
   private GXSimpleCollection<String> AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ;
   private GXSimpleCollection<String> AV46Options ;
   private GXSimpleCollection<String> AV48OptionsDesc ;
   private GXSimpleCollection<String> AV49OptionIndexes ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV53GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV54GridStateFilterValue ;
}

final  class documentodetransporteproduccion_7getfilterdata__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A712( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                          String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                          String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                          String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                          String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                          String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                          String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                          String AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ,
                                          int AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ,
                                          byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ,
                                          byte AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ,
                                          short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ,
                                          short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ,
                                          short AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                          int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ,
                                          int AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ,
                                          short AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ,
                                          int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ,
                                          int AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ,
                                          short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ,
                                          short AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ,
                                          String AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                          String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                          int AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ,
                                          byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ,
                                          byte AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ,
                                          String AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4815AlbEncCli ,
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
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          byte A213BarSit ,
                                          String A5291BarTipCor ,
                                          String AV62Emprcod ,
                                          long AV63AlbProcod ,
                                          String A396EmprCod ,
                                          long A30AlbProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int2 = new byte[41];
      Object[] GXv_Object3 = new Object[2];
      scmdbuf = "SELECT T1.AlbProCod, T1.EmprCod, T2.BarTipCor, T2.BarSit, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE," ;
      scmdbuf += " T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.AlbEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int2[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) && ( ! (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbEncCli = ?)");
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int2[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int2[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int2[11] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int2[12] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int2[13] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int2[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int2[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int2[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int2[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int2[19] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int2[20] = (byte)(1) ;
      }
      if ( ! (0==AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int2[21] = (byte)(1) ;
      }
      if ( ! (0==AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int2[22] = (byte)(1) ;
      }
      if ( ! (0==AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int2[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int2[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int2[25] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int2[26] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int2[27] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int2[28] = (byte)(1) ;
      }
      if ( ! (0==AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int2[29] = (byte)(1) ;
      }
      if ( ! (0==AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int2[30] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int2[31] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int2[32] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int2[33] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int2[34] = (byte)(1) ;
      }
      if ( ! (0==AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int2[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int2[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int2[37] = (byte)(1) ;
      }
      if ( AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int2[38] = (byte)(1) ;
      }
      if ( ! (0==AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int2[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int2[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   protected Object[] conditional_P0A713( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                          String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                          String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                          String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                          String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                          String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                          String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                          String AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ,
                                          int AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ,
                                          byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ,
                                          byte AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ,
                                          short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ,
                                          short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ,
                                          short AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                          int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ,
                                          int AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ,
                                          short AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ,
                                          int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ,
                                          int AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ,
                                          short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ,
                                          short AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ,
                                          String AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                          String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                          int AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ,
                                          byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ,
                                          byte AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ,
                                          String AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4815AlbEncCli ,
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
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          byte A213BarSit ,
                                          String A5291BarTipCor ,
                                          String A396EmprCod ,
                                          String AV62Emprcod ,
                                          long A30AlbProCod ,
                                          long AV63AlbProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[41];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbEncCli, T2.BarTipCor, T2.BarSit, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie," ;
      scmdbuf += " T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) && ( ! (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbEncCli = ?)");
      }
      else
      {
         GXv_int5[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int5[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int5[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int5[13] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int5[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int5[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int5[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int5[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int5[19] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int5[20] = (byte)(1) ;
      }
      if ( ! (0==AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int5[21] = (byte)(1) ;
      }
      if ( ! (0==AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int5[22] = (byte)(1) ;
      }
      if ( ! (0==AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int5[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int5[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int5[25] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int5[26] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int5[27] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int5[28] = (byte)(1) ;
      }
      if ( ! (0==AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int5[29] = (byte)(1) ;
      }
      if ( ! (0==AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int5[30] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int5[31] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int5[32] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int5[33] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int5[34] = (byte)(1) ;
      }
      if ( ! (0==AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int5[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int5[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int5[37] = (byte)(1) ;
      }
      if ( AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int5[38] = (byte)(1) ;
      }
      if ( ! (0==AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int5[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int5[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbEncCli" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   protected Object[] conditional_P0A714( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                          String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                          String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                          String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                          String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                          String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                          String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                          String AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ,
                                          int AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ,
                                          byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ,
                                          byte AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ,
                                          short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ,
                                          short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ,
                                          short AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                          int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ,
                                          int AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ,
                                          short AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ,
                                          int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ,
                                          int AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ,
                                          short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ,
                                          short AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ,
                                          String AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                          String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                          int AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ,
                                          byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ,
                                          byte AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ,
                                          String AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4815AlbEncCli ,
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
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          byte A213BarSit ,
                                          String A5291BarTipCor ,
                                          String A396EmprCod ,
                                          String AV62Emprcod ,
                                          long A30AlbProCod ,
                                          long AV63AlbProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[41];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbSer, T2.BarTipCor, T2.BarSit, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie," ;
      scmdbuf += " T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) && ( ! (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbEncCli = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (0==AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (0==AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
      }
      if ( ! (0==AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int8[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int8[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbSer" ;
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_P0A715( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                          String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                          String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                          String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                          String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                          String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                          String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                          String AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ,
                                          int AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ,
                                          byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ,
                                          byte AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ,
                                          short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ,
                                          short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ,
                                          short AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                          int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ,
                                          int AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ,
                                          short AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ,
                                          int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ,
                                          int AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ,
                                          short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ,
                                          short AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ,
                                          String AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                          String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                          int AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ,
                                          byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ,
                                          byte AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ,
                                          String AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4815AlbEncCli ,
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
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          byte A213BarSit ,
                                          String A5291BarTipCor ,
                                          String A396EmprCod ,
                                          String AV62Emprcod ,
                                          long A30AlbProCod ,
                                          long AV63AlbProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[41];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbSerD, T2.BarTipCor, T2.BarSit, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie," ;
      scmdbuf += " T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol, T1.AlbColNum, T1.AlbColNom, T1.AlbSer, T1.AlbEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) && ( ! (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbEncCli = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (0==AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (0==AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (0==AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (0==AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbSerD" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_P0A716( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                          String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                          String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                          String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                          String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                          String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                          String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                          String AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ,
                                          int AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ,
                                          byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ,
                                          byte AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ,
                                          short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ,
                                          short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ,
                                          short AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                          int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ,
                                          int AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ,
                                          short AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ,
                                          int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ,
                                          int AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ,
                                          short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ,
                                          short AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ,
                                          String AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                          String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                          int AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ,
                                          byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ,
                                          byte AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ,
                                          String AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4815AlbEncCli ,
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
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          byte A213BarSit ,
                                          String A5291BarTipCor ,
                                          String A396EmprCod ,
                                          String AV62Emprcod ,
                                          long A30AlbProCod ,
                                          long AV63AlbProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[41];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbColNom, T2.BarTipCor, T2.BarSit, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie," ;
      scmdbuf += " T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol, T1.AlbColNum, T1.AlbSerD, T1.AlbSer, T1.AlbEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) && ( ! (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbEncCli = ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (0==AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! (0==AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! (0==AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( ! (0==AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! (0==AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbColNom" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P0A717( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                          String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                          String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                          String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                          String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                          String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                          String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                          String AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ,
                                          int AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ,
                                          byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ,
                                          byte AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ,
                                          short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ,
                                          short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ,
                                          short AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                          int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ,
                                          int AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ,
                                          short AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ,
                                          int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ,
                                          int AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ,
                                          short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ,
                                          short AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ,
                                          String AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                          String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                          int AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ,
                                          byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ,
                                          byte AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ,
                                          String AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4815AlbEncCli ,
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
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          byte A213BarSit ,
                                          String A5291BarTipCor ,
                                          String A396EmprCod ,
                                          String AV62Emprcod ,
                                          long A30AlbProCod ,
                                          long AV63AlbProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[41];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbNomCli, T2.BarTipCor, T2.BarSit, T1.AlbProVal, T1.AlbHdrObs, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie," ;
      scmdbuf += " T1.BarAlbMtrE, T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbTipCol, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.AlbEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) && ( ! (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbEncCli = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (0==AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (0==AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (0==AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      if ( AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int17[38] = (byte)(1) ;
      }
      if ( ! (0==AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int17[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int17[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbNomCli" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_P0A718( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A2839AlbProVal ,
                                          GXSimpleCollection<String> AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels ,
                                          String AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel ,
                                          String AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr ,
                                          String AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel ,
                                          String AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli ,
                                          String AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel ,
                                          String AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser ,
                                          String AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel ,
                                          String AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd ,
                                          String AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel ,
                                          String AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom ,
                                          int AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum ,
                                          int AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to ,
                                          byte AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol ,
                                          byte AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to ,
                                          String AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel ,
                                          String AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli ,
                                          java.math.BigDecimal AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme ,
                                          java.math.BigDecimal AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to ,
                                          short AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc ,
                                          short AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to ,
                                          short AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2 ,
                                          short AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to ,
                                          java.math.BigDecimal AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre ,
                                          java.math.BigDecimal AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to ,
                                          int AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie ,
                                          int AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to ,
                                          short AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod ,
                                          short AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to ,
                                          int AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub ,
                                          int AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to ,
                                          short AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod ,
                                          short AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to ,
                                          short AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas ,
                                          short AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to ,
                                          String AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel ,
                                          String AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs ,
                                          int AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size ,
                                          byte AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit ,
                                          byte AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to ,
                                          String AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A4815AlbEncCli ,
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
                                          short A6466PlasCod ,
                                          short A6467BarAlbPlas ,
                                          String A2441AlbHdrObs ,
                                          byte A213BarSit ,
                                          String A5291BarTipCor ,
                                          String A396EmprCod ,
                                          String AV62Emprcod ,
                                          long A30AlbProCod ,
                                          long AV63AlbProcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[41];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProCod, T1.AlbHdrObs, T2.BarTipCor, T2.BarSit, T1.AlbProVal, T1.BarAlbPlas, T1.PlasCod, T1.BarAlbTub, T1.TubCod, T1.BarAlbPie, T1.BarAlbMtrE," ;
      scmdbuf += " T1.AlbHdrgm2, T1.AlbHdrAnc, T1.BarAlbKgmE, T1.AlbNomCli, T1.AlbTipCol, T1.AlbColNum, T1.AlbColNom, T1.AlbSerD, T1.AlbSer, T1.AlbEncCli, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod FROM (TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProCod = ?)");
      if ( (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV83Documentotransporteproduccion_documentodetransporteproduccion_7ds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Documentotransporteproduccion_documentodetransporteproduccion_7ds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) && ( ! (GXutil.strcmp("", AV85Documentotransporteproduccion_documentodetransporteproduccion_7ds_3_tfalbenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Documentotransporteproduccion_documentodetransporteproduccion_7ds_4_tfalbenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbEncCli = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) && ( ! (GXutil.strcmp("", AV87Documentotransporteproduccion_documentodetransporteproduccion_7ds_5_tfalbser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Documentotransporteproduccion_documentodetransporteproduccion_7ds_6_tfalbser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSer = ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) && ( ! (GXutil.strcmp("", AV89Documentotransporteproduccion_documentodetransporteproduccion_7ds_7_tfalbserd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbSerD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Documentotransporteproduccion_documentodetransporteproduccion_7ds_8_tfalbserd_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbSerD = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV91Documentotransporteproduccion_documentodetransporteproduccion_7ds_9_tfalbcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Documentotransporteproduccion_documentodetransporteproduccion_7ds_10_tfalbcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbColNom = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (0==AV93Documentotransporteproduccion_documentodetransporteproduccion_7ds_11_tfalbcolnum) )
      {
         addWhere(sWhereString, "(T1.AlbColNum >= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (0==AV94Documentotransporteproduccion_documentodetransporteproduccion_7ds_12_tfalbcolnum_to) )
      {
         addWhere(sWhereString, "(T1.AlbColNum <= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (0==AV95Documentotransporteproduccion_documentodetransporteproduccion_7ds_13_tfalbtipcol) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol >= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Documentotransporteproduccion_documentodetransporteproduccion_7ds_14_tfalbtipcol_to) )
      {
         addWhere(sWhereString, "(T1.AlbTipCol <= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV97Documentotransporteproduccion_documentodetransporteproduccion_7ds_15_tfalbnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Documentotransporteproduccion_documentodetransporteproduccion_7ds_16_tfalbnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbNomCli = ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Documentotransporteproduccion_documentodetransporteproduccion_7ds_17_tfbaralbkgme)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE >= ?)");
      }
      else
      {
         GXv_int20[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Documentotransporteproduccion_documentodetransporteproduccion_7ds_18_tfbaralbkgme_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbKgmE <= ?)");
      }
      else
      {
         GXv_int20[19] = (byte)(1) ;
      }
      if ( ! (0==AV101Documentotransporteproduccion_documentodetransporteproduccion_7ds_19_tfalbhdranc) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc >= ?)");
      }
      else
      {
         GXv_int20[20] = (byte)(1) ;
      }
      if ( ! (0==AV102Documentotransporteproduccion_documentodetransporteproduccion_7ds_20_tfalbhdranc_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrAnc <= ?)");
      }
      else
      {
         GXv_int20[21] = (byte)(1) ;
      }
      if ( ! (0==AV103Documentotransporteproduccion_documentodetransporteproduccion_7ds_21_tfalbhdrgm2) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 >= ?)");
      }
      else
      {
         GXv_int20[22] = (byte)(1) ;
      }
      if ( ! (0==AV104Documentotransporteproduccion_documentodetransporteproduccion_7ds_22_tfalbhdrgm2_to) )
      {
         addWhere(sWhereString, "(T1.AlbHdrgm2 <= ?)");
      }
      else
      {
         GXv_int20[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Documentotransporteproduccion_documentodetransporteproduccion_7ds_23_tfbaralbmtre)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE >= ?)");
      }
      else
      {
         GXv_int20[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Documentotransporteproduccion_documentodetransporteproduccion_7ds_24_tfbaralbmtre_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarAlbMtrE <= ?)");
      }
      else
      {
         GXv_int20[25] = (byte)(1) ;
      }
      if ( ! (0==AV107Documentotransporteproduccion_documentodetransporteproduccion_7ds_25_tfbaralbpie) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie >= ?)");
      }
      else
      {
         GXv_int20[26] = (byte)(1) ;
      }
      if ( ! (0==AV108Documentotransporteproduccion_documentodetransporteproduccion_7ds_26_tfbaralbpie_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPie <= ?)");
      }
      else
      {
         GXv_int20[27] = (byte)(1) ;
      }
      if ( ! (0==AV109Documentotransporteproduccion_documentodetransporteproduccion_7ds_27_tftubcod) )
      {
         addWhere(sWhereString, "(T1.TubCod >= ?)");
      }
      else
      {
         GXv_int20[28] = (byte)(1) ;
      }
      if ( ! (0==AV110Documentotransporteproduccion_documentodetransporteproduccion_7ds_28_tftubcod_to) )
      {
         addWhere(sWhereString, "(T1.TubCod <= ?)");
      }
      else
      {
         GXv_int20[29] = (byte)(1) ;
      }
      if ( ! (0==AV111Documentotransporteproduccion_documentodetransporteproduccion_7ds_29_tfbaralbtub) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub >= ?)");
      }
      else
      {
         GXv_int20[30] = (byte)(1) ;
      }
      if ( ! (0==AV112Documentotransporteproduccion_documentodetransporteproduccion_7ds_30_tfbaralbtub_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbTub <= ?)");
      }
      else
      {
         GXv_int20[31] = (byte)(1) ;
      }
      if ( ! (0==AV113Documentotransporteproduccion_documentodetransporteproduccion_7ds_31_tfplascod) )
      {
         addWhere(sWhereString, "(T1.PlasCod >= ?)");
      }
      else
      {
         GXv_int20[32] = (byte)(1) ;
      }
      if ( ! (0==AV114Documentotransporteproduccion_documentodetransporteproduccion_7ds_32_tfplascod_to) )
      {
         addWhere(sWhereString, "(T1.PlasCod <= ?)");
      }
      else
      {
         GXv_int20[33] = (byte)(1) ;
      }
      if ( ! (0==AV115Documentotransporteproduccion_documentodetransporteproduccion_7ds_33_tfbaralbplas) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas >= ?)");
      }
      else
      {
         GXv_int20[34] = (byte)(1) ;
      }
      if ( ! (0==AV116Documentotransporteproduccion_documentodetransporteproduccion_7ds_34_tfbaralbplas_to) )
      {
         addWhere(sWhereString, "(T1.BarAlbPlas <= ?)");
      }
      else
      {
         GXv_int20[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) && ( ! (GXutil.strcmp("", AV117Documentotransporteproduccion_documentodetransporteproduccion_7ds_35_tfalbhdrobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbHdrObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Documentotransporteproduccion_documentodetransporteproduccion_7ds_36_tfalbhdrobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbHdrObs = ?)");
      }
      else
      {
         GXv_int20[37] = (byte)(1) ;
      }
      if ( AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Documentotransporteproduccion_documentodetransporteproduccion_7ds_37_tfalbproval_sels, "T1.AlbProVal IN (", ")")+")");
      }
      if ( ! (0==AV120Documentotransporteproduccion_documentodetransporteproduccion_7ds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int20[38] = (byte)(1) ;
      }
      if ( ! (0==AV121Documentotransporteproduccion_documentodetransporteproduccion_7ds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int20[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Documentotransporteproduccion_documentodetransporteproduccion_7ds_40_tfbartipcor_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarTipCor = ?)");
      }
      else
      {
         GXv_int20[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.AlbHdrObs" ;
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
                  return conditional_P0A712(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).shortValue() , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , ((Number) dynConstraints[65]).longValue() , (String)dynConstraints[66] , ((Number) dynConstraints[67]).longValue() );
            case 1 :
                  return conditional_P0A713(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).shortValue() , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).longValue() , ((Number) dynConstraints[67]).longValue() );
            case 2 :
                  return conditional_P0A714(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).shortValue() , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).longValue() , ((Number) dynConstraints[67]).longValue() );
            case 3 :
                  return conditional_P0A715(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).shortValue() , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).longValue() , ((Number) dynConstraints[67]).longValue() );
            case 4 :
                  return conditional_P0A716(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).shortValue() , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).longValue() , ((Number) dynConstraints[67]).longValue() );
            case 5 :
                  return conditional_P0A717(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).shortValue() , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).longValue() , ((Number) dynConstraints[67]).longValue() );
            case 6 :
                  return conditional_P0A718(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).shortValue() , ((Number) dynConstraints[23]).shortValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , (String)dynConstraints[51] , (java.math.BigDecimal)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Number) dynConstraints[54]).shortValue() , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).shortValue() , ((Number) dynConstraints[58]).intValue() , ((Number) dynConstraints[59]).shortValue() , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).longValue() , ((Number) dynConstraints[67]).longValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A712", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A713", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A714", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A715", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A716", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A717", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A718", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[17])[0] = rslt.getString(16, 13);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 13);
               ((String[]) buf[21])[0] = rslt.getString(20, 26);
               ((String[]) buf[22])[0] = rslt.getString(21, 16);
               ((String[]) buf[23])[0] = rslt.getString(22, 20);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((int[]) buf[26])[0] = rslt.getInt(25);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[18])[0] = rslt.getString(17, 13);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 13);
               ((String[]) buf[22])[0] = rslt.getString(21, 26);
               ((String[]) buf[23])[0] = rslt.getString(22, 16);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((int[]) buf[26])[0] = rslt.getInt(25);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[18])[0] = rslt.getString(17, 13);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 13);
               ((String[]) buf[22])[0] = rslt.getString(21, 26);
               ((String[]) buf[23])[0] = rslt.getString(22, 20);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((int[]) buf[26])[0] = rslt.getInt(25);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[18])[0] = rslt.getString(17, 13);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 13);
               ((String[]) buf[22])[0] = rslt.getString(21, 16);
               ((String[]) buf[23])[0] = rslt.getString(22, 20);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((int[]) buf[26])[0] = rslt.getInt(25);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((String[]) buf[18])[0] = rslt.getString(17, 13);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 26);
               ((String[]) buf[22])[0] = rslt.getString(21, 16);
               ((String[]) buf[23])[0] = rslt.getString(22, 20);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((int[]) buf[26])[0] = rslt.getInt(25);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 60);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 13);
               ((String[]) buf[21])[0] = rslt.getString(20, 26);
               ((String[]) buf[22])[0] = rslt.getString(21, 16);
               ((String[]) buf[23])[0] = rslt.getString(22, 20);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((int[]) buf[26])[0] = rslt.getInt(25);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((String[]) buf[17])[0] = rslt.getString(16, 13);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((int[]) buf[19])[0] = rslt.getInt(18);
               ((String[]) buf[20])[0] = rslt.getString(19, 13);
               ((String[]) buf[21])[0] = rslt.getString(20, 26);
               ((String[]) buf[22])[0] = rslt.getString(21, 16);
               ((String[]) buf[23])[0] = rslt.getString(22, 20);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((int[]) buf[26])[0] = rslt.getInt(25);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[42]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 60);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 60);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[42]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 60);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 60);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[42]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 60);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 60);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 2);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[42]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 60);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 60);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 2);
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[42]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 60);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 60);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 2);
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[42]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 60);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 60);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 2);
               }
               return;
            case 6 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[42]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 60);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 60);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[80]).byteValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 2);
               }
               return;
      }
   }

}

