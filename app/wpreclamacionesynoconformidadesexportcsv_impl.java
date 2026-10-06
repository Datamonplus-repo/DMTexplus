package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpreclamacionesynoconformidadesexportcsv_impl extends GXWebProcedure
{
   public wpreclamacionesynoconformidadesexportcsv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_SdtWWPContext1[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV9WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S181 ();
      if ( returnInSub )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV13Random = (int)(GXutil.random( )*10000) ;
      AV11Filename = "WPReclamacionesyNoConformidadesExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
      AV10TextFile.setSource( AV11Filename );
      AV10TextFile.create();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      AV10TextFile.openWrite("");
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
   }

   public void S131( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV14TextFileLine = "" ;
      if ( GXutil.strcmp(AV19Session.getValue("WPReclamacionesyNoConformidadesColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WPReclamacionesyNoConformidadesColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Causa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Defecto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tratamiento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Responsabilidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Int", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acciones Corrección a implementar:", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acciones Correctivas a Implementar:", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Analisis de Corrección", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Analisis  Accion Correctivas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "de Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Colorante", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV151Wpreclamacionesynoconformidadesds_1_filterfulltext = AV143FilterFullText ;
      AV152Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels = AV136TFHisEstReo_Sels ;
      AV153Wpreclamacionesynoconformidadesds_3_tfhisreofec = AV66TFHisReoFec ;
      AV154Wpreclamacionesynoconformidadesds_4_tfhisreofec_to = AV67TFHisReoFec_To ;
      AV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr = AV133TFHisReoHDR ;
      AV156Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel = AV134TFHisReoHDR_Sel ;
      AV157Wpreclamacionesynoconformidadesds_7_tfhisreolote = AV137TFHisreoLote ;
      AV158Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel = AV138TFHisreoLote_Sel ;
      AV159Wpreclamacionesynoconformidadesds_9_tfclinom = AV48TFCliNom ;
      AV160Wpreclamacionesynoconformidadesds_10_tfclinom_sel = AV49TFCliNom_Sel ;
      AV161Wpreclamacionesynoconformidadesds_11_tfhisbarser = AV50TFHisBarSer ;
      AV162Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel = AV51TFHisBarSer_Sel ;
      AV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc = AV80TFHisReoDsc ;
      AV164Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel = AV81TFHisReoDsc_Sel ;
      AV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom = AV52TFHisColNom ;
      AV166Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel = AV53TFHisColNom_Sel ;
      AV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli = AV114TFHisNomCli ;
      AV168Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel = AV115TFHisNomCli_Sel ;
      AV169Wpreclamacionesynoconformidadesds_19_tfhisopetur = AV120TFHisOpeTur ;
      AV170Wpreclamacionesynoconformidadesds_20_tfhisopetur_to = AV121TFHisOpeTur_To ;
      AV171Wpreclamacionesynoconformidadesds_21_tfmaqcod = AV64TFMaqCod ;
      AV172Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel = AV65TFMaqCod_Sel ;
      AV173Wpreclamacionesynoconformidadesds_23_tfhisbarkgm = AV60TFHisBarKgm ;
      AV174Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to = AV61TFHisBarKgm_To ;
      AV175Wpreclamacionesynoconformidadesds_25_tfhisbarmtr = AV62TFHisBarMtr ;
      AV176Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to = AV63TFHisBarMtr_To ;
      AV177Wpreclamacionesynoconformidadesds_27_tfcostcausa = AV139TFCostCausa ;
      AV178Wpreclamacionesynoconformidadesds_28_tfcostcausa_to = AV140TFCostCausa_To ;
      AV179Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa = AV141TFHisreoValorCausa ;
      AV180Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to = AV142TFHisreoValorCausa_To ;
      AV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc = AV86TFTipDefDsc ;
      AV182Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel = AV87TFTipDefDsc_Sel ;
      AV183Wpreclamacionesynoconformidadesds_33_tfdsccausa = AV84TFDscCausa ;
      AV184Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel = AV85TFDscCausa_Sel ;
      AV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc = AV108TFRps_Dsc ;
      AV186Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel = AV109TFRps_Dsc_Sel ;
      AV187Wpreclamacionesynoconformidadesds_37_tfhisreotn = AV76TFHisReoTn ;
      AV188Wpreclamacionesynoconformidadesds_38_tfhisreotn_to = AV77TFHisReoTn_To ;
      AV189Wpreclamacionesynoconformidadesds_39_tfhisopecod = AV118TFHisOpecod ;
      AV190Wpreclamacionesynoconformidadesds_40_tfhisopecod_to = AV119TFHisOpecod_To ;
      AV191Wpreclamacionesynoconformidadesds_41_tfhisacco = AV94TFHisAcCo ;
      AV192Wpreclamacionesynoconformidadesds_42_tfhisacco_sel = AV95TFHisAcCo_Sel ;
      AV193Wpreclamacionesynoconformidadesds_43_tfhisaccot = AV96TFHisAcCot ;
      AV194Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel = AV97TFHisAcCot_Sel ;
      AV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco = AV98TFHisAdEAcCo ;
      AV196Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel = AV99TFHisAdEAcCo_Sel ;
      AV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct = AV100TFHisAdEAcCt ;
      AV198Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel = AV101TFHisAdEAcCt_Sel ;
      AV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc = AV144TFHisTipArtDsc ;
      AV200Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel = AV145TFHisTipArtDsc_Sel ;
      AV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc = AV146TFHisTipColDsc ;
      AV202Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel = AV147TFHisTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A548HisEstReo) ,
                                           AV152Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels ,
                                           AV151Wpreclamacionesynoconformidadesds_1_filterfulltext ,
                                           Integer.valueOf(AV152Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels.size()) ,
                                           AV153Wpreclamacionesynoconformidadesds_3_tfhisreofec ,
                                           AV154Wpreclamacionesynoconformidadesds_4_tfhisreofec_to ,
                                           AV156Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel ,
                                           AV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr ,
                                           AV158Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel ,
                                           AV157Wpreclamacionesynoconformidadesds_7_tfhisreolote ,
                                           AV160Wpreclamacionesynoconformidadesds_10_tfclinom_sel ,
                                           AV159Wpreclamacionesynoconformidadesds_9_tfclinom ,
                                           AV162Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel ,
                                           AV161Wpreclamacionesynoconformidadesds_11_tfhisbarser ,
                                           AV164Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel ,
                                           AV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc ,
                                           AV166Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel ,
                                           AV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom ,
                                           AV168Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel ,
                                           AV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli ,
                                           Byte.valueOf(AV169Wpreclamacionesynoconformidadesds_19_tfhisopetur) ,
                                           Byte.valueOf(AV170Wpreclamacionesynoconformidadesds_20_tfhisopetur_to) ,
                                           AV172Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel ,
                                           AV171Wpreclamacionesynoconformidadesds_21_tfmaqcod ,
                                           AV173Wpreclamacionesynoconformidadesds_23_tfhisbarkgm ,
                                           AV174Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to ,
                                           AV175Wpreclamacionesynoconformidadesds_25_tfhisbarmtr ,
                                           AV176Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to ,
                                           AV177Wpreclamacionesynoconformidadesds_27_tfcostcausa ,
                                           AV178Wpreclamacionesynoconformidadesds_28_tfcostcausa_to ,
                                           AV179Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa ,
                                           AV180Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to ,
                                           AV182Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel ,
                                           AV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc ,
                                           AV184Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel ,
                                           AV183Wpreclamacionesynoconformidadesds_33_tfdsccausa ,
                                           AV186Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel ,
                                           AV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc ,
                                           Integer.valueOf(AV187Wpreclamacionesynoconformidadesds_37_tfhisreotn) ,
                                           Integer.valueOf(AV188Wpreclamacionesynoconformidadesds_38_tfhisreotn_to) ,
                                           Integer.valueOf(AV189Wpreclamacionesynoconformidadesds_39_tfhisopecod) ,
                                           Integer.valueOf(AV190Wpreclamacionesynoconformidadesds_40_tfhisopecod_to) ,
                                           AV192Wpreclamacionesynoconformidadesds_42_tfhisacco_sel ,
                                           AV191Wpreclamacionesynoconformidadesds_41_tfhisacco ,
                                           AV194Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel ,
                                           AV193Wpreclamacionesynoconformidadesds_43_tfhisaccot ,
                                           AV196Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel ,
                                           AV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco ,
                                           AV198Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel ,
                                           AV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct ,
                                           AV200Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel ,
                                           AV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc ,
                                           AV202Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel ,
                                           AV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc ,
                                           Integer.valueOf(A539HisBarCod) ,
                                           Byte.valueOf(A545HisCodReo) ,
                                           A544HisCodPar ,
                                           A13698HisreoLote ,
                                           A279CliNom ,
                                           A542HisBarSer ,
                                           A2299HisReoDsc ,
                                           A546HisColNom ,
                                           A8889HisNomCli ,
                                           Byte.valueOf(A12950HisOpeTur) ,
                                           A602MaqCod ,
                                           A540HisBarKgm ,
                                           A541HisBarMtr ,
                                           A13699CostCausa ,
                                           A834TipDefDsc ,
                                           A5086DscCausa ,
                                           A7001Rps_Dsc ,
                                           Integer.valueOf(A2297HisReoTn) ,
                                           Integer.valueOf(A12949HisOpecod) ,
                                           A5662HisAcCo ,
                                           A5693HisAcCot ,
                                           A5694HisAdEAcCo ,
                                           A5695HisAdEAcCt ,
                                           A13843HisTipArtD ,
                                           A13844HisTipColD ,
                                           A569HisReoFec ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV151Wpreclamacionesynoconformidadesds_1_filterfulltext), "%", "") ;
      lV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr = GXutil.padr( GXutil.rtrim( AV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr), 11, "%") ;
      lV157Wpreclamacionesynoconformidadesds_7_tfhisreolote = GXutil.padr( GXutil.rtrim( AV157Wpreclamacionesynoconformidadesds_7_tfhisreolote), 20, "%") ;
      lV159Wpreclamacionesynoconformidadesds_9_tfclinom = GXutil.padr( GXutil.rtrim( AV159Wpreclamacionesynoconformidadesds_9_tfclinom), 30, "%") ;
      lV161Wpreclamacionesynoconformidadesds_11_tfhisbarser = GXutil.padr( GXutil.rtrim( AV161Wpreclamacionesynoconformidadesds_11_tfhisbarser), 16, "%") ;
      lV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc = GXutil.padr( GXutil.rtrim( AV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc), 26, "%") ;
      lV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom = GXutil.padr( GXutil.rtrim( AV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom), 13, "%") ;
      lV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli = GXutil.padr( GXutil.rtrim( AV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli), 13, "%") ;
      lV171Wpreclamacionesynoconformidadesds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV171Wpreclamacionesynoconformidadesds_21_tfmaqcod), 6, "%") ;
      lV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc), 30, "%") ;
      lV183Wpreclamacionesynoconformidadesds_33_tfdsccausa = GXutil.padr( GXutil.rtrim( AV183Wpreclamacionesynoconformidadesds_33_tfdsccausa), 60, "%") ;
      lV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc = GXutil.padr( GXutil.rtrim( AV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc), 40, "%") ;
      lV191Wpreclamacionesynoconformidadesds_41_tfhisacco = GXutil.concat( GXutil.rtrim( AV191Wpreclamacionesynoconformidadesds_41_tfhisacco), "%", "") ;
      lV193Wpreclamacionesynoconformidadesds_43_tfhisaccot = GXutil.concat( GXutil.rtrim( AV193Wpreclamacionesynoconformidadesds_43_tfhisaccot), "%", "") ;
      lV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco = GXutil.concat( GXutil.rtrim( AV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco), "%", "") ;
      lV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct = GXutil.concat( GXutil.rtrim( AV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct), "%", "") ;
      lV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc = GXutil.padr( GXutil.rtrim( AV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc), 30, "%") ;
      lV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc = GXutil.padr( GXutil.rtrim( AV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc), 30, "%") ;
      /* Using cursor P087G2 */
      pr_default.execute(0, new Object[] {lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, lV151Wpreclamacionesynoconformidadesds_1_filterfulltext, AV153Wpreclamacionesynoconformidadesds_3_tfhisreofec, AV154Wpreclamacionesynoconformidadesds_4_tfhisreofec_to, lV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr, AV156Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel, lV157Wpreclamacionesynoconformidadesds_7_tfhisreolote, AV158Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel, lV159Wpreclamacionesynoconformidadesds_9_tfclinom, AV160Wpreclamacionesynoconformidadesds_10_tfclinom_sel, lV161Wpreclamacionesynoconformidadesds_11_tfhisbarser, AV162Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel, lV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc, AV164Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel, lV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom, AV166Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel, lV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli, AV168Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel, Byte.valueOf(AV169Wpreclamacionesynoconformidadesds_19_tfhisopetur), Byte.valueOf(AV170Wpreclamacionesynoconformidadesds_20_tfhisopetur_to), lV171Wpreclamacionesynoconformidadesds_21_tfmaqcod, AV172Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel, AV173Wpreclamacionesynoconformidadesds_23_tfhisbarkgm, AV174Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to, AV175Wpreclamacionesynoconformidadesds_25_tfhisbarmtr, AV176Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to, AV177Wpreclamacionesynoconformidadesds_27_tfcostcausa, AV178Wpreclamacionesynoconformidadesds_28_tfcostcausa_to, AV179Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa, AV180Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to, lV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc, AV182Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel, lV183Wpreclamacionesynoconformidadesds_33_tfdsccausa, AV184Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel, lV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc, AV186Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel, Integer.valueOf(AV187Wpreclamacionesynoconformidadesds_37_tfhisreotn), Integer.valueOf(AV188Wpreclamacionesynoconformidadesds_38_tfhisreotn_to), Integer.valueOf(AV189Wpreclamacionesynoconformidadesds_39_tfhisopecod), Integer.valueOf(AV190Wpreclamacionesynoconformidadesds_40_tfhisopecod_to), lV191Wpreclamacionesynoconformidadesds_41_tfhisacco, AV192Wpreclamacionesynoconformidadesds_42_tfhisacco_sel, lV193Wpreclamacionesynoconformidadesds_43_tfhisaccot, AV194Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel, lV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco, AV196Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel, lV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct, AV198Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel, lV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc, AV200Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel, lV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc, AV202Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P087G2_A396EmprCod[0] ;
         A252CliCod = P087G2_A252CliCod[0] ;
         n252CliCod = P087G2_n252CliCod[0] ;
         A571HisTipArt = P087G2_A571HisTipArt[0] ;
         n571HisTipArt = P087G2_n571HisTipArt[0] ;
         A572HisTipCol = P087G2_A572HisTipCol[0] ;
         n572HisTipCol = P087G2_n572HisTipCol[0] ;
         A833TipDefCod = P087G2_A833TipDefCod[0] ;
         A5085CodCausa = P087G2_A5085CodCausa[0] ;
         n5085CodCausa = P087G2_n5085CodCausa[0] ;
         A7000Rps_Cod = P087G2_A7000Rps_Cod[0] ;
         n7000Rps_Cod = P087G2_n7000Rps_Cod[0] ;
         A13844HisTipColD = P087G2_A13844HisTipColD[0] ;
         n13844HisTipColD = P087G2_n13844HisTipColD[0] ;
         A13843HisTipArtD = P087G2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P087G2_n13843HisTipArtD[0] ;
         A5695HisAdEAcCt = P087G2_A5695HisAdEAcCt[0] ;
         n5695HisAdEAcCt = P087G2_n5695HisAdEAcCt[0] ;
         A5694HisAdEAcCo = P087G2_A5694HisAdEAcCo[0] ;
         n5694HisAdEAcCo = P087G2_n5694HisAdEAcCo[0] ;
         A5693HisAcCot = P087G2_A5693HisAcCot[0] ;
         n5693HisAcCot = P087G2_n5693HisAcCot[0] ;
         A5662HisAcCo = P087G2_A5662HisAcCo[0] ;
         n5662HisAcCo = P087G2_n5662HisAcCo[0] ;
         A12949HisOpecod = P087G2_A12949HisOpecod[0] ;
         n12949HisOpecod = P087G2_n12949HisOpecod[0] ;
         A2297HisReoTn = P087G2_A2297HisReoTn[0] ;
         n2297HisReoTn = P087G2_n2297HisReoTn[0] ;
         A7001Rps_Dsc = P087G2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P087G2_n7001Rps_Dsc[0] ;
         A5086DscCausa = P087G2_A5086DscCausa[0] ;
         n5086DscCausa = P087G2_n5086DscCausa[0] ;
         A834TipDefDsc = P087G2_A834TipDefDsc[0] ;
         n834TipDefDsc = P087G2_n834TipDefDsc[0] ;
         A541HisBarMtr = P087G2_A541HisBarMtr[0] ;
         n541HisBarMtr = P087G2_n541HisBarMtr[0] ;
         A602MaqCod = P087G2_A602MaqCod[0] ;
         n602MaqCod = P087G2_n602MaqCod[0] ;
         A12950HisOpeTur = P087G2_A12950HisOpeTur[0] ;
         n12950HisOpeTur = P087G2_n12950HisOpeTur[0] ;
         A8889HisNomCli = P087G2_A8889HisNomCli[0] ;
         n8889HisNomCli = P087G2_n8889HisNomCli[0] ;
         A546HisColNom = P087G2_A546HisColNom[0] ;
         n546HisColNom = P087G2_n546HisColNom[0] ;
         A2299HisReoDsc = P087G2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = P087G2_n2299HisReoDsc[0] ;
         A542HisBarSer = P087G2_A542HisBarSer[0] ;
         n542HisBarSer = P087G2_n542HisBarSer[0] ;
         A279CliNom = P087G2_A279CliNom[0] ;
         A13698HisreoLote = P087G2_A13698HisreoLote[0] ;
         n13698HisreoLote = P087G2_n13698HisreoLote[0] ;
         A569HisReoFec = P087G2_A569HisReoFec[0] ;
         n569HisReoFec = P087G2_n569HisReoFec[0] ;
         A548HisEstReo = P087G2_A548HisEstReo[0] ;
         n548HisEstReo = P087G2_n548HisEstReo[0] ;
         A544HisCodPar = P087G2_A544HisCodPar[0] ;
         A545HisCodReo = P087G2_A545HisCodReo[0] ;
         A539HisBarCod = P087G2_A539HisBarCod[0] ;
         A13699CostCausa = P087G2_A13699CostCausa[0] ;
         n13699CostCausa = P087G2_n13699CostCausa[0] ;
         A540HisBarKgm = P087G2_A540HisBarKgm[0] ;
         n540HisBarKgm = P087G2_n540HisBarKgm[0] ;
         A279CliNom = P087G2_A279CliNom[0] ;
         A13843HisTipArtD = P087G2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P087G2_n13843HisTipArtD[0] ;
         A13844HisTipColD = P087G2_A13844HisTipColD[0] ;
         n13844HisTipColD = P087G2_n13844HisTipColD[0] ;
         A834TipDefDsc = P087G2_A834TipDefDsc[0] ;
         n834TipDefDsc = P087G2_n834TipDefDsc[0] ;
         A5086DscCausa = P087G2_A5086DscCausa[0] ;
         n5086DscCausa = P087G2_n5086DscCausa[0] ;
         A13699CostCausa = P087G2_A13699CostCausa[0] ;
         n13699CostCausa = P087G2_n13699CostCausa[0] ;
         A7001Rps_Dsc = P087G2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P087G2_n7001Rps_Dsc[0] ;
         A13700HisreoValo = GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2) ;
         A13697HisReoHDR = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A548HisEstReo == 1 )
            {
               AV14TextFileLine += httpContext.getMessage( "NC", "") ;
            }
            else if ( A548HisEstReo == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "RC", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A569HisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13697HisReoHDR, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13698HisreoLote, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A542HisBarSer, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2299HisReoDsc, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A546HisColNom, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A8889HisNomCli, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A12950HisOpeTur, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A540HisBarKgm, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A541HisBarMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13699CostCausa, 11, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13700HisreoValo, 11, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A834TipDefDsc, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5086DscCausa, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A7001Rps_Dsc, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2297HisReoTn, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A12949HisOpecod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV30NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A5662HisAcCo, ";", ","), AV30NewLine, " "), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV30NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A5693HisAcCot, ";", ","), AV30NewLine, " "), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV30NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A5694HisAdEAcCo, ";", ","), AV30NewLine, " "), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV30NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A5695HisAdEAcCt, ";", ","), AV30NewLine, " "), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13843HisTipArtD, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13844HisTipColD, ";", ","), GXv_char3) ;
            wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.len( AV14TextFileLine) > 0 )
         {
            AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10TextFile.close();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S121 ();
      if (returnInSub) return;
      if ( AV10TextFile.getErrCode() == 0 )
      {
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WPReclamacionesyNoConformidadesExportCSV.csv");
         }
         AV27HttpResponse.addFile(AV10TextFile.getAbsoluteName());
      }
   }

   public void S121( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10TextFile.getErrCode() != 0 )
      {
         AV11Filename = "" ;
         AV12ErrorMessage = AV10TextFile.getErrDescription() ;
         AV10TextFile.close();
         AV27HttpResponse.addString(AV12ErrorMessage);
         httpContext.nUserReturn = (byte)(1) ;
         if ( httpContext.willRedirect( ) )
         {
            httpContext.redirect( httpContext.wjLoc );
            httpContext.wjLoc = "" ;
         }
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV15ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisEstReo", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisReoFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisReoHDR", "", "Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisreoLote", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisBarSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisReoDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisNomCli", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisOpeTur", "", "T", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCod", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisBarKgm", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisBarMtr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CostCausa", "", "Coste Causa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisreoValorCausa", "", "Valor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipDefDsc", "", "Defecto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DscCausa", "", "Tratamiento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Rps_Dsc", "", "Responsabilidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisReoTn", "", "N Int", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisOpecod", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisAcCo", "", "Acciones Corrección a implementar:", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisAcCot", "", "Acciones Correctivas a Implementar:", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisAdEAcCo", "", "Analisis de Corrección", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisAdEAcCt", "", "Analisis  Accion Correctivas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisTipArtDsc", "", "de Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisTipColDsc", "", "Tipo Colorante", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WPReclamacionesyNoConformidadesColumnsSelector", GXv_char3) ;
      wpreclamacionesynoconformidadesexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector4[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector5[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, GXv_SdtWWPColumnsSelector5) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector4[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector5[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WPReclamacionesyNoConformidadesGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WPReclamacionesyNoConformidadesGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV19Session.getValue("WPReclamacionesyNoConformidadesGridState"), null, null);
      }
      AV28OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV203GXV1 = 1 ;
      while ( AV203GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV203GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV143FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISESTREO_SEL") == 0 )
         {
            AV135TFHisEstReo_SelsJson = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV136TFHisEstReo_Sels.fromJSonString(AV135TFHisEstReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOFEC") == 0 )
         {
            AV66TFHisReoFec = localUtil.ctod( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV67TFHisReoFec_To = localUtil.ctod( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR") == 0 )
         {
            AV133TFHisReoHDR = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR_SEL") == 0 )
         {
            AV134TFHisReoHDR_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE") == 0 )
         {
            AV137TFHisreoLote = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE_SEL") == 0 )
         {
            AV138TFHisreoLote_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV48TFCliNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV49TFCliNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER") == 0 )
         {
            AV50TFHisBarSer = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER_SEL") == 0 )
         {
            AV51TFHisBarSer_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC") == 0 )
         {
            AV80TFHisReoDsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC_SEL") == 0 )
         {
            AV81TFHisReoDsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM") == 0 )
         {
            AV52TFHisColNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM_SEL") == 0 )
         {
            AV53TFHisColNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI") == 0 )
         {
            AV114TFHisNomCli = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI_SEL") == 0 )
         {
            AV115TFHisNomCli_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPETUR") == 0 )
         {
            AV120TFHisOpeTur = (byte)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV121TFHisOpeTur_To = (byte)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV64TFMaqCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV65TFMaqCod_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARKGM") == 0 )
         {
            AV60TFHisBarKgm = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFHisBarKgm_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARMTR") == 0 )
         {
            AV62TFHisBarMtr = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFHisBarMtr_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTCAUSA") == 0 )
         {
            AV139TFCostCausa = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV140TFCostCausa_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOVALORCAUSA") == 0 )
         {
            AV141TFHisreoValorCausa = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV142TFHisreoValorCausa_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC") == 0 )
         {
            AV86TFTipDefDsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC_SEL") == 0 )
         {
            AV87TFTipDefDsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA") == 0 )
         {
            AV84TFDscCausa = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA_SEL") == 0 )
         {
            AV85TFDscCausa_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC") == 0 )
         {
            AV108TFRps_Dsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC_SEL") == 0 )
         {
            AV109TFRps_Dsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOTN") == 0 )
         {
            AV76TFHisReoTn = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV77TFHisReoTn_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPECOD") == 0 )
         {
            AV118TFHisOpecod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV119TFHisOpecod_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO") == 0 )
         {
            AV94TFHisAcCo = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO_SEL") == 0 )
         {
            AV95TFHisAcCo_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT") == 0 )
         {
            AV96TFHisAcCot = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT_SEL") == 0 )
         {
            AV97TFHisAcCot_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO") == 0 )
         {
            AV98TFHisAdEAcCo = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO_SEL") == 0 )
         {
            AV99TFHisAdEAcCo_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT") == 0 )
         {
            AV100TFHisAdEAcCt = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT_SEL") == 0 )
         {
            AV101TFHisAdEAcCt_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC") == 0 )
         {
            AV144TFHisTipArtDsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC_SEL") == 0 )
         {
            AV145TFHisTipArtDsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC") == 0 )
         {
            AV146TFHisTipColDsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC_SEL") == 0 )
         {
            AV147TFHisTipColDsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV203GXV1 = (int)(AV203GXV1+1) ;
      }
   }

   public void S162( )
   {
      /* 'BEFOREWRITELINE' Routine */
      returnInSub = false ;
   }

   public void S172( )
   {
      /* 'AFTERWRITELINE' Routine */
      returnInSub = false ;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A569HisReoFec = GXutil.nullDate() ;
      A13697HisReoHDR = "" ;
      A13698HisreoLote = "" ;
      A279CliNom = "" ;
      A542HisBarSer = "" ;
      A2299HisReoDsc = "" ;
      A546HisColNom = "" ;
      A8889HisNomCli = "" ;
      A602MaqCod = "" ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      A541HisBarMtr = DecimalUtil.ZERO ;
      A13699CostCausa = DecimalUtil.ZERO ;
      A13700HisreoValo = DecimalUtil.ZERO ;
      A834TipDefDsc = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      A5662HisAcCo = "" ;
      A5693HisAcCot = "" ;
      A5694HisAdEAcCo = "" ;
      A5695HisAdEAcCt = "" ;
      A13843HisTipArtD = "" ;
      A13844HisTipColD = "" ;
      AV151Wpreclamacionesynoconformidadesds_1_filterfulltext = "" ;
      AV143FilterFullText = "" ;
      AV152Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV136TFHisEstReo_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV153Wpreclamacionesynoconformidadesds_3_tfhisreofec = GXutil.nullDate() ;
      AV66TFHisReoFec = GXutil.nullDate() ;
      AV154Wpreclamacionesynoconformidadesds_4_tfhisreofec_to = GXutil.nullDate() ;
      AV67TFHisReoFec_To = GXutil.nullDate() ;
      AV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr = "" ;
      AV133TFHisReoHDR = "" ;
      AV156Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel = "" ;
      AV134TFHisReoHDR_Sel = "" ;
      AV157Wpreclamacionesynoconformidadesds_7_tfhisreolote = "" ;
      AV137TFHisreoLote = "" ;
      AV158Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel = "" ;
      AV138TFHisreoLote_Sel = "" ;
      AV159Wpreclamacionesynoconformidadesds_9_tfclinom = "" ;
      AV48TFCliNom = "" ;
      AV160Wpreclamacionesynoconformidadesds_10_tfclinom_sel = "" ;
      AV49TFCliNom_Sel = "" ;
      AV161Wpreclamacionesynoconformidadesds_11_tfhisbarser = "" ;
      AV50TFHisBarSer = "" ;
      AV162Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel = "" ;
      AV51TFHisBarSer_Sel = "" ;
      AV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc = "" ;
      AV80TFHisReoDsc = "" ;
      AV164Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel = "" ;
      AV81TFHisReoDsc_Sel = "" ;
      AV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom = "" ;
      AV52TFHisColNom = "" ;
      AV166Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel = "" ;
      AV53TFHisColNom_Sel = "" ;
      AV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli = "" ;
      AV114TFHisNomCli = "" ;
      AV168Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel = "" ;
      AV115TFHisNomCli_Sel = "" ;
      AV171Wpreclamacionesynoconformidadesds_21_tfmaqcod = "" ;
      AV64TFMaqCod = "" ;
      AV172Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel = "" ;
      AV65TFMaqCod_Sel = "" ;
      AV173Wpreclamacionesynoconformidadesds_23_tfhisbarkgm = DecimalUtil.ZERO ;
      AV60TFHisBarKgm = DecimalUtil.ZERO ;
      AV174Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to = DecimalUtil.ZERO ;
      AV61TFHisBarKgm_To = DecimalUtil.ZERO ;
      AV175Wpreclamacionesynoconformidadesds_25_tfhisbarmtr = DecimalUtil.ZERO ;
      AV62TFHisBarMtr = DecimalUtil.ZERO ;
      AV176Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to = DecimalUtil.ZERO ;
      AV63TFHisBarMtr_To = DecimalUtil.ZERO ;
      AV177Wpreclamacionesynoconformidadesds_27_tfcostcausa = DecimalUtil.ZERO ;
      AV139TFCostCausa = DecimalUtil.ZERO ;
      AV178Wpreclamacionesynoconformidadesds_28_tfcostcausa_to = DecimalUtil.ZERO ;
      AV140TFCostCausa_To = DecimalUtil.ZERO ;
      AV179Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa = DecimalUtil.ZERO ;
      AV141TFHisreoValorCausa = DecimalUtil.ZERO ;
      AV180Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to = DecimalUtil.ZERO ;
      AV142TFHisreoValorCausa_To = DecimalUtil.ZERO ;
      AV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc = "" ;
      AV86TFTipDefDsc = "" ;
      AV182Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel = "" ;
      AV87TFTipDefDsc_Sel = "" ;
      AV183Wpreclamacionesynoconformidadesds_33_tfdsccausa = "" ;
      AV84TFDscCausa = "" ;
      AV184Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel = "" ;
      AV85TFDscCausa_Sel = "" ;
      AV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc = "" ;
      AV108TFRps_Dsc = "" ;
      AV186Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel = "" ;
      AV109TFRps_Dsc_Sel = "" ;
      AV191Wpreclamacionesynoconformidadesds_41_tfhisacco = "" ;
      AV94TFHisAcCo = "" ;
      AV192Wpreclamacionesynoconformidadesds_42_tfhisacco_sel = "" ;
      AV95TFHisAcCo_Sel = "" ;
      AV193Wpreclamacionesynoconformidadesds_43_tfhisaccot = "" ;
      AV96TFHisAcCot = "" ;
      AV194Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel = "" ;
      AV97TFHisAcCot_Sel = "" ;
      AV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco = "" ;
      AV98TFHisAdEAcCo = "" ;
      AV196Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel = "" ;
      AV99TFHisAdEAcCo_Sel = "" ;
      AV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct = "" ;
      AV100TFHisAdEAcCt = "" ;
      AV198Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel = "" ;
      AV101TFHisAdEAcCt_Sel = "" ;
      AV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc = "" ;
      AV144TFHisTipArtDsc = "" ;
      AV200Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel = "" ;
      AV145TFHisTipArtDsc_Sel = "" ;
      AV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc = "" ;
      AV146TFHisTipColDsc = "" ;
      AV202Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel = "" ;
      AV147TFHisTipColDsc_Sel = "" ;
      scmdbuf = "" ;
      lV151Wpreclamacionesynoconformidadesds_1_filterfulltext = "" ;
      lV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr = "" ;
      lV157Wpreclamacionesynoconformidadesds_7_tfhisreolote = "" ;
      lV159Wpreclamacionesynoconformidadesds_9_tfclinom = "" ;
      lV161Wpreclamacionesynoconformidadesds_11_tfhisbarser = "" ;
      lV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc = "" ;
      lV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom = "" ;
      lV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli = "" ;
      lV171Wpreclamacionesynoconformidadesds_21_tfmaqcod = "" ;
      lV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc = "" ;
      lV183Wpreclamacionesynoconformidadesds_33_tfdsccausa = "" ;
      lV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc = "" ;
      lV191Wpreclamacionesynoconformidadesds_41_tfhisacco = "" ;
      lV193Wpreclamacionesynoconformidadesds_43_tfhisaccot = "" ;
      lV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco = "" ;
      lV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct = "" ;
      lV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc = "" ;
      lV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc = "" ;
      A544HisCodPar = "" ;
      P087G2_A396EmprCod = new String[] {""} ;
      P087G2_A252CliCod = new int[1] ;
      P087G2_n252CliCod = new boolean[] {false} ;
      P087G2_A571HisTipArt = new short[1] ;
      P087G2_n571HisTipArt = new boolean[] {false} ;
      P087G2_A572HisTipCol = new byte[1] ;
      P087G2_n572HisTipCol = new boolean[] {false} ;
      P087G2_A833TipDefCod = new short[1] ;
      P087G2_A5085CodCausa = new short[1] ;
      P087G2_n5085CodCausa = new boolean[] {false} ;
      P087G2_A7000Rps_Cod = new short[1] ;
      P087G2_n7000Rps_Cod = new boolean[] {false} ;
      P087G2_A13844HisTipColD = new String[] {""} ;
      P087G2_n13844HisTipColD = new boolean[] {false} ;
      P087G2_A13843HisTipArtD = new String[] {""} ;
      P087G2_n13843HisTipArtD = new boolean[] {false} ;
      P087G2_A5695HisAdEAcCt = new String[] {""} ;
      P087G2_n5695HisAdEAcCt = new boolean[] {false} ;
      P087G2_A5694HisAdEAcCo = new String[] {""} ;
      P087G2_n5694HisAdEAcCo = new boolean[] {false} ;
      P087G2_A5693HisAcCot = new String[] {""} ;
      P087G2_n5693HisAcCot = new boolean[] {false} ;
      P087G2_A5662HisAcCo = new String[] {""} ;
      P087G2_n5662HisAcCo = new boolean[] {false} ;
      P087G2_A12949HisOpecod = new int[1] ;
      P087G2_n12949HisOpecod = new boolean[] {false} ;
      P087G2_A2297HisReoTn = new int[1] ;
      P087G2_n2297HisReoTn = new boolean[] {false} ;
      P087G2_A7001Rps_Dsc = new String[] {""} ;
      P087G2_n7001Rps_Dsc = new boolean[] {false} ;
      P087G2_A5086DscCausa = new String[] {""} ;
      P087G2_n5086DscCausa = new boolean[] {false} ;
      P087G2_A834TipDefDsc = new String[] {""} ;
      P087G2_n834TipDefDsc = new boolean[] {false} ;
      P087G2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087G2_n541HisBarMtr = new boolean[] {false} ;
      P087G2_A602MaqCod = new String[] {""} ;
      P087G2_n602MaqCod = new boolean[] {false} ;
      P087G2_A12950HisOpeTur = new byte[1] ;
      P087G2_n12950HisOpeTur = new boolean[] {false} ;
      P087G2_A8889HisNomCli = new String[] {""} ;
      P087G2_n8889HisNomCli = new boolean[] {false} ;
      P087G2_A546HisColNom = new String[] {""} ;
      P087G2_n546HisColNom = new boolean[] {false} ;
      P087G2_A2299HisReoDsc = new String[] {""} ;
      P087G2_n2299HisReoDsc = new boolean[] {false} ;
      P087G2_A542HisBarSer = new String[] {""} ;
      P087G2_n542HisBarSer = new boolean[] {false} ;
      P087G2_A279CliNom = new String[] {""} ;
      P087G2_A13698HisreoLote = new String[] {""} ;
      P087G2_n13698HisreoLote = new boolean[] {false} ;
      P087G2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P087G2_n569HisReoFec = new boolean[] {false} ;
      P087G2_A548HisEstReo = new byte[1] ;
      P087G2_n548HisEstReo = new boolean[] {false} ;
      P087G2_A544HisCodPar = new String[] {""} ;
      P087G2_A545HisCodReo = new byte[1] ;
      P087G2_A539HisBarCod = new int[1] ;
      P087G2_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087G2_n13699CostCausa = new boolean[] {false} ;
      P087G2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P087G2_n540HisBarKgm = new boolean[] {false} ;
      A396EmprCod = "" ;
      AV30NewLine = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV135TFHisEstReo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpreclamacionesynoconformidadesexportcsv__default(),
         new Object[] {
             new Object[] {
            P087G2_A396EmprCod, P087G2_A252CliCod, P087G2_n252CliCod, P087G2_A571HisTipArt, P087G2_n571HisTipArt, P087G2_A572HisTipCol, P087G2_n572HisTipCol, P087G2_A833TipDefCod, P087G2_A5085CodCausa, P087G2_n5085CodCausa,
            P087G2_A7000Rps_Cod, P087G2_n7000Rps_Cod, P087G2_A13844HisTipColD, P087G2_n13844HisTipColD, P087G2_A13843HisTipArtD, P087G2_n13843HisTipArtD, P087G2_A5695HisAdEAcCt, P087G2_n5695HisAdEAcCt, P087G2_A5694HisAdEAcCo, P087G2_n5694HisAdEAcCo,
            P087G2_A5693HisAcCot, P087G2_n5693HisAcCot, P087G2_A5662HisAcCo, P087G2_n5662HisAcCo, P087G2_A12949HisOpecod, P087G2_n12949HisOpecod, P087G2_A2297HisReoTn, P087G2_n2297HisReoTn, P087G2_A7001Rps_Dsc, P087G2_n7001Rps_Dsc,
            P087G2_A5086DscCausa, P087G2_n5086DscCausa, P087G2_A834TipDefDsc, P087G2_n834TipDefDsc, P087G2_A541HisBarMtr, P087G2_n541HisBarMtr, P087G2_A602MaqCod, P087G2_n602MaqCod, P087G2_A12950HisOpeTur, P087G2_n12950HisOpeTur,
            P087G2_A8889HisNomCli, P087G2_n8889HisNomCli, P087G2_A546HisColNom, P087G2_n546HisColNom, P087G2_A2299HisReoDsc, P087G2_n2299HisReoDsc, P087G2_A542HisBarSer, P087G2_n542HisBarSer, P087G2_A279CliNom, P087G2_A13698HisreoLote,
            P087G2_n13698HisreoLote, P087G2_A569HisReoFec, P087G2_n569HisReoFec, P087G2_A548HisEstReo, P087G2_n548HisEstReo, P087G2_A544HisCodPar, P087G2_A545HisCodReo, P087G2_A539HisBarCod, P087G2_A13699CostCausa, P087G2_n13699CostCausa,
            P087G2_A540HisBarKgm, P087G2_n540HisBarKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A548HisEstReo ;
   private byte A12950HisOpeTur ;
   private byte AV169Wpreclamacionesynoconformidadesds_19_tfhisopetur ;
   private byte AV120TFHisOpeTur ;
   private byte AV170Wpreclamacionesynoconformidadesds_20_tfhisopetur_to ;
   private byte AV121TFHisOpeTur_To ;
   private byte A545HisCodReo ;
   private byte A572HisTipCol ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short A571HisTipArt ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private int AV13Random ;
   private int A2297HisReoTn ;
   private int A12949HisOpecod ;
   private int AV187Wpreclamacionesynoconformidadesds_37_tfhisreotn ;
   private int AV76TFHisReoTn ;
   private int AV188Wpreclamacionesynoconformidadesds_38_tfhisreotn_to ;
   private int AV77TFHisReoTn_To ;
   private int AV189Wpreclamacionesynoconformidadesds_39_tfhisopecod ;
   private int AV118TFHisOpecod ;
   private int AV190Wpreclamacionesynoconformidadesds_40_tfhisopecod_to ;
   private int AV119TFHisOpecod_To ;
   private int AV152Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels_size ;
   private int A539HisBarCod ;
   private int A252CliCod ;
   private int AV203GXV1 ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A13699CostCausa ;
   private java.math.BigDecimal A13700HisreoValo ;
   private java.math.BigDecimal AV173Wpreclamacionesynoconformidadesds_23_tfhisbarkgm ;
   private java.math.BigDecimal AV60TFHisBarKgm ;
   private java.math.BigDecimal AV174Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to ;
   private java.math.BigDecimal AV61TFHisBarKgm_To ;
   private java.math.BigDecimal AV175Wpreclamacionesynoconformidadesds_25_tfhisbarmtr ;
   private java.math.BigDecimal AV62TFHisBarMtr ;
   private java.math.BigDecimal AV176Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to ;
   private java.math.BigDecimal AV63TFHisBarMtr_To ;
   private java.math.BigDecimal AV177Wpreclamacionesynoconformidadesds_27_tfcostcausa ;
   private java.math.BigDecimal AV139TFCostCausa ;
   private java.math.BigDecimal AV178Wpreclamacionesynoconformidadesds_28_tfcostcausa_to ;
   private java.math.BigDecimal AV140TFCostCausa_To ;
   private java.math.BigDecimal AV179Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa ;
   private java.math.BigDecimal AV141TFHisreoValorCausa ;
   private java.math.BigDecimal AV180Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to ;
   private java.math.BigDecimal AV142TFHisreoValorCausa_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13697HisReoHDR ;
   private String A13698HisreoLote ;
   private String A279CliNom ;
   private String A542HisBarSer ;
   private String A2299HisReoDsc ;
   private String A546HisColNom ;
   private String A8889HisNomCli ;
   private String A602MaqCod ;
   private String A834TipDefDsc ;
   private String A5086DscCausa ;
   private String A7001Rps_Dsc ;
   private String A13843HisTipArtD ;
   private String A13844HisTipColD ;
   private String AV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr ;
   private String AV133TFHisReoHDR ;
   private String AV156Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel ;
   private String AV134TFHisReoHDR_Sel ;
   private String AV157Wpreclamacionesynoconformidadesds_7_tfhisreolote ;
   private String AV137TFHisreoLote ;
   private String AV158Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel ;
   private String AV138TFHisreoLote_Sel ;
   private String AV159Wpreclamacionesynoconformidadesds_9_tfclinom ;
   private String AV48TFCliNom ;
   private String AV160Wpreclamacionesynoconformidadesds_10_tfclinom_sel ;
   private String AV49TFCliNom_Sel ;
   private String AV161Wpreclamacionesynoconformidadesds_11_tfhisbarser ;
   private String AV50TFHisBarSer ;
   private String AV162Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel ;
   private String AV51TFHisBarSer_Sel ;
   private String AV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc ;
   private String AV80TFHisReoDsc ;
   private String AV164Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel ;
   private String AV81TFHisReoDsc_Sel ;
   private String AV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom ;
   private String AV52TFHisColNom ;
   private String AV166Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel ;
   private String AV53TFHisColNom_Sel ;
   private String AV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli ;
   private String AV114TFHisNomCli ;
   private String AV168Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel ;
   private String AV115TFHisNomCli_Sel ;
   private String AV171Wpreclamacionesynoconformidadesds_21_tfmaqcod ;
   private String AV64TFMaqCod ;
   private String AV172Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel ;
   private String AV65TFMaqCod_Sel ;
   private String AV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc ;
   private String AV86TFTipDefDsc ;
   private String AV182Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel ;
   private String AV87TFTipDefDsc_Sel ;
   private String AV183Wpreclamacionesynoconformidadesds_33_tfdsccausa ;
   private String AV84TFDscCausa ;
   private String AV184Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel ;
   private String AV85TFDscCausa_Sel ;
   private String AV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc ;
   private String AV108TFRps_Dsc ;
   private String AV186Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel ;
   private String AV109TFRps_Dsc_Sel ;
   private String AV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc ;
   private String AV144TFHisTipArtDsc ;
   private String AV200Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel ;
   private String AV145TFHisTipArtDsc_Sel ;
   private String AV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc ;
   private String AV146TFHisTipColDsc ;
   private String AV202Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel ;
   private String AV147TFHisTipColDsc_Sel ;
   private String scmdbuf ;
   private String lV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr ;
   private String lV157Wpreclamacionesynoconformidadesds_7_tfhisreolote ;
   private String lV159Wpreclamacionesynoconformidadesds_9_tfclinom ;
   private String lV161Wpreclamacionesynoconformidadesds_11_tfhisbarser ;
   private String lV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc ;
   private String lV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom ;
   private String lV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli ;
   private String lV171Wpreclamacionesynoconformidadesds_21_tfmaqcod ;
   private String lV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc ;
   private String lV183Wpreclamacionesynoconformidadesds_33_tfdsccausa ;
   private String lV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc ;
   private String lV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc ;
   private String lV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc ;
   private String A544HisCodPar ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A569HisReoFec ;
   private java.util.Date AV153Wpreclamacionesynoconformidadesds_3_tfhisreofec ;
   private java.util.Date AV66TFHisReoFec ;
   private java.util.Date AV154Wpreclamacionesynoconformidadesds_4_tfhisreofec_to ;
   private java.util.Date AV67TFHisReoFec_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n571HisTipArt ;
   private boolean n572HisTipCol ;
   private boolean n5085CodCausa ;
   private boolean n7000Rps_Cod ;
   private boolean n13844HisTipColD ;
   private boolean n13843HisTipArtD ;
   private boolean n5695HisAdEAcCt ;
   private boolean n5694HisAdEAcCo ;
   private boolean n5693HisAcCot ;
   private boolean n5662HisAcCo ;
   private boolean n12949HisOpecod ;
   private boolean n2297HisReoTn ;
   private boolean n7001Rps_Dsc ;
   private boolean n5086DscCausa ;
   private boolean n834TipDefDsc ;
   private boolean n541HisBarMtr ;
   private boolean n602MaqCod ;
   private boolean n12950HisOpeTur ;
   private boolean n8889HisNomCli ;
   private boolean n546HisColNom ;
   private boolean n2299HisReoDsc ;
   private boolean n542HisBarSer ;
   private boolean n13698HisreoLote ;
   private boolean n569HisReoFec ;
   private boolean n548HisEstReo ;
   private boolean n13699CostCausa ;
   private boolean n540HisBarKgm ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV135TFHisEstReo_SelsJson ;
   private String AV11Filename ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String AV151Wpreclamacionesynoconformidadesds_1_filterfulltext ;
   private String AV143FilterFullText ;
   private String AV191Wpreclamacionesynoconformidadesds_41_tfhisacco ;
   private String AV94TFHisAcCo ;
   private String AV192Wpreclamacionesynoconformidadesds_42_tfhisacco_sel ;
   private String AV95TFHisAcCo_Sel ;
   private String AV193Wpreclamacionesynoconformidadesds_43_tfhisaccot ;
   private String AV96TFHisAcCot ;
   private String AV194Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel ;
   private String AV97TFHisAcCot_Sel ;
   private String AV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco ;
   private String AV98TFHisAdEAcCo ;
   private String AV196Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel ;
   private String AV99TFHisAdEAcCo_Sel ;
   private String AV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct ;
   private String AV100TFHisAdEAcCt ;
   private String AV198Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel ;
   private String AV101TFHisAdEAcCt_Sel ;
   private String lV151Wpreclamacionesynoconformidadesds_1_filterfulltext ;
   private String lV191Wpreclamacionesynoconformidadesds_41_tfhisacco ;
   private String lV193Wpreclamacionesynoconformidadesds_43_tfhisaccot ;
   private String lV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco ;
   private String lV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct ;
   private String AV30NewLine ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV152Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels ;
   private GXSimpleCollection<Byte> AV136TFHisEstReo_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P087G2_A396EmprCod ;
   private int[] P087G2_A252CliCod ;
   private boolean[] P087G2_n252CliCod ;
   private short[] P087G2_A571HisTipArt ;
   private boolean[] P087G2_n571HisTipArt ;
   private byte[] P087G2_A572HisTipCol ;
   private boolean[] P087G2_n572HisTipCol ;
   private short[] P087G2_A833TipDefCod ;
   private short[] P087G2_A5085CodCausa ;
   private boolean[] P087G2_n5085CodCausa ;
   private short[] P087G2_A7000Rps_Cod ;
   private boolean[] P087G2_n7000Rps_Cod ;
   private String[] P087G2_A13844HisTipColD ;
   private boolean[] P087G2_n13844HisTipColD ;
   private String[] P087G2_A13843HisTipArtD ;
   private boolean[] P087G2_n13843HisTipArtD ;
   private String[] P087G2_A5695HisAdEAcCt ;
   private boolean[] P087G2_n5695HisAdEAcCt ;
   private String[] P087G2_A5694HisAdEAcCo ;
   private boolean[] P087G2_n5694HisAdEAcCo ;
   private String[] P087G2_A5693HisAcCot ;
   private boolean[] P087G2_n5693HisAcCot ;
   private String[] P087G2_A5662HisAcCo ;
   private boolean[] P087G2_n5662HisAcCo ;
   private int[] P087G2_A12949HisOpecod ;
   private boolean[] P087G2_n12949HisOpecod ;
   private int[] P087G2_A2297HisReoTn ;
   private boolean[] P087G2_n2297HisReoTn ;
   private String[] P087G2_A7001Rps_Dsc ;
   private boolean[] P087G2_n7001Rps_Dsc ;
   private String[] P087G2_A5086DscCausa ;
   private boolean[] P087G2_n5086DscCausa ;
   private String[] P087G2_A834TipDefDsc ;
   private boolean[] P087G2_n834TipDefDsc ;
   private java.math.BigDecimal[] P087G2_A541HisBarMtr ;
   private boolean[] P087G2_n541HisBarMtr ;
   private String[] P087G2_A602MaqCod ;
   private boolean[] P087G2_n602MaqCod ;
   private byte[] P087G2_A12950HisOpeTur ;
   private boolean[] P087G2_n12950HisOpeTur ;
   private String[] P087G2_A8889HisNomCli ;
   private boolean[] P087G2_n8889HisNomCli ;
   private String[] P087G2_A546HisColNom ;
   private boolean[] P087G2_n546HisColNom ;
   private String[] P087G2_A2299HisReoDsc ;
   private boolean[] P087G2_n2299HisReoDsc ;
   private String[] P087G2_A542HisBarSer ;
   private boolean[] P087G2_n542HisBarSer ;
   private String[] P087G2_A279CliNom ;
   private String[] P087G2_A13698HisreoLote ;
   private boolean[] P087G2_n13698HisreoLote ;
   private java.util.Date[] P087G2_A569HisReoFec ;
   private boolean[] P087G2_n569HisReoFec ;
   private byte[] P087G2_A548HisEstReo ;
   private boolean[] P087G2_n548HisEstReo ;
   private String[] P087G2_A544HisCodPar ;
   private byte[] P087G2_A545HisCodReo ;
   private int[] P087G2_A539HisBarCod ;
   private java.math.BigDecimal[] P087G2_A13699CostCausa ;
   private boolean[] P087G2_n13699CostCausa ;
   private java.math.BigDecimal[] P087G2_A540HisBarKgm ;
   private boolean[] P087G2_n540HisBarKgm ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class wpreclamacionesynoconformidadesexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P087G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A548HisEstReo ,
                                          GXSimpleCollection<Byte> AV152Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels ,
                                          String AV151Wpreclamacionesynoconformidadesds_1_filterfulltext ,
                                          int AV152Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels_size ,
                                          java.util.Date AV153Wpreclamacionesynoconformidadesds_3_tfhisreofec ,
                                          java.util.Date AV154Wpreclamacionesynoconformidadesds_4_tfhisreofec_to ,
                                          String AV156Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel ,
                                          String AV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr ,
                                          String AV158Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel ,
                                          String AV157Wpreclamacionesynoconformidadesds_7_tfhisreolote ,
                                          String AV160Wpreclamacionesynoconformidadesds_10_tfclinom_sel ,
                                          String AV159Wpreclamacionesynoconformidadesds_9_tfclinom ,
                                          String AV162Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel ,
                                          String AV161Wpreclamacionesynoconformidadesds_11_tfhisbarser ,
                                          String AV164Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel ,
                                          String AV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc ,
                                          String AV166Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel ,
                                          String AV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom ,
                                          String AV168Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel ,
                                          String AV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli ,
                                          byte AV169Wpreclamacionesynoconformidadesds_19_tfhisopetur ,
                                          byte AV170Wpreclamacionesynoconformidadesds_20_tfhisopetur_to ,
                                          String AV172Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel ,
                                          String AV171Wpreclamacionesynoconformidadesds_21_tfmaqcod ,
                                          java.math.BigDecimal AV173Wpreclamacionesynoconformidadesds_23_tfhisbarkgm ,
                                          java.math.BigDecimal AV174Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to ,
                                          java.math.BigDecimal AV175Wpreclamacionesynoconformidadesds_25_tfhisbarmtr ,
                                          java.math.BigDecimal AV176Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to ,
                                          java.math.BigDecimal AV177Wpreclamacionesynoconformidadesds_27_tfcostcausa ,
                                          java.math.BigDecimal AV178Wpreclamacionesynoconformidadesds_28_tfcostcausa_to ,
                                          java.math.BigDecimal AV179Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa ,
                                          java.math.BigDecimal AV180Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to ,
                                          String AV182Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel ,
                                          String AV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc ,
                                          String AV184Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel ,
                                          String AV183Wpreclamacionesynoconformidadesds_33_tfdsccausa ,
                                          String AV186Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel ,
                                          String AV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc ,
                                          int AV187Wpreclamacionesynoconformidadesds_37_tfhisreotn ,
                                          int AV188Wpreclamacionesynoconformidadesds_38_tfhisreotn_to ,
                                          int AV189Wpreclamacionesynoconformidadesds_39_tfhisopecod ,
                                          int AV190Wpreclamacionesynoconformidadesds_40_tfhisopecod_to ,
                                          String AV192Wpreclamacionesynoconformidadesds_42_tfhisacco_sel ,
                                          String AV191Wpreclamacionesynoconformidadesds_41_tfhisacco ,
                                          String AV194Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel ,
                                          String AV193Wpreclamacionesynoconformidadesds_43_tfhisaccot ,
                                          String AV196Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel ,
                                          String AV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco ,
                                          String AV198Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel ,
                                          String AV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct ,
                                          String AV200Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel ,
                                          String AV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc ,
                                          String AV202Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel ,
                                          String AV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc ,
                                          int A539HisBarCod ,
                                          byte A545HisCodReo ,
                                          String A544HisCodPar ,
                                          String A13698HisreoLote ,
                                          String A279CliNom ,
                                          String A542HisBarSer ,
                                          String A2299HisReoDsc ,
                                          String A546HisColNom ,
                                          String A8889HisNomCli ,
                                          byte A12950HisOpeTur ,
                                          String A602MaqCod ,
                                          java.math.BigDecimal A540HisBarKgm ,
                                          java.math.BigDecimal A541HisBarMtr ,
                                          java.math.BigDecimal A13699CostCausa ,
                                          String A834TipDefDsc ,
                                          String A5086DscCausa ,
                                          String A7001Rps_Dsc ,
                                          int A2297HisReoTn ,
                                          int A12949HisOpecod ,
                                          String A5662HisAcCo ,
                                          String A5693HisAcCot ,
                                          String A5694HisAdEAcCo ,
                                          String A5695HisAdEAcCt ,
                                          String A13843HisTipArtD ,
                                          String A13844HisTipColD ,
                                          java.util.Date A569HisReoFec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[75];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.HisTipArt AS HisTipArt, T1.HisTipCol AS HisTipCol, T1.TipDefCod, T1.CodCausa, T1.Rps_Cod, T4.TipColDsc AS HisTipColD, T3.TipArtDsc" ;
      scmdbuf += " AS HisTipArtD, T1.HisAdEAcCt, T1.HisAdEAcCo, T1.HisAcCot, T1.HisAcCo, T1.HisOpecod, T1.HisReoTn, T7.Rps_Dsc, T6.DscCausa, T5.TipDefDsc, T1.HisBarMtr, T1.MaqCod," ;
      scmdbuf += " T1.HisOpeTur, T1.HisNomCli, T1.HisColNom, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.HisreoLote, T1.HisReoFec, T1.HisEstReo, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod," ;
      scmdbuf += " T6.CostCausa, T1.HisBarKgm FROM ((((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TipArtCod = T1.HisTipArt) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.HisTipCol) INNER JOIN TXPTIPDEF T5 ON T5.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T5.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T6 ON T6.EmprCod = T1.EmprCod AND T6.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.Rps_Cod = T1.Rps_Cod)" ;
      if ( ! (GXutil.strcmp("", AV151Wpreclamacionesynoconformidadesds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.HisEstReo,'90'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?)) or ( UPPER(T1.HisreoLote) like '%' || UPPER(?)) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.HisBarSer) like '%' || UPPER(?)) or ( UPPER(T1.HisReoDsc) like '%' || UPPER(?)) or ( UPPER(T1.HisColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisOpeTur,'90'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisBarKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisBarMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T6.CostCausa,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2),'9999990.999'), 2) like '%' || ?) or ( UPPER(T5.TipDefDsc) like '%' || UPPER(?)) or ( UPPER(T6.DscCausa) like '%' || UPPER(?)) or ( UPPER(T7.Rps_Dsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisReoTn,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisOpecod,'999990'), 2) like '%' || ?) or ( UPPER(T1.HisAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAcCot) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCt) like '%' || UPPER(?)) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( UPPER(T4.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
         GXv_int6[18] = (byte)(1) ;
         GXv_int6[19] = (byte)(1) ;
         GXv_int6[20] = (byte)(1) ;
         GXv_int6[21] = (byte)(1) ;
         GXv_int6[22] = (byte)(1) ;
         GXv_int6[23] = (byte)(1) ;
         GXv_int6[24] = (byte)(1) ;
      }
      if ( AV152Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV152Wpreclamacionesynoconformidadesds_2_tfhisestreo_sels, "T1.HisEstReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV153Wpreclamacionesynoconformidadesds_3_tfhisreofec)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV154Wpreclamacionesynoconformidadesds_4_tfhisreofec_to)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel)==0) && ( ! (GXutil.strcmp("", AV155Wpreclamacionesynoconformidadesds_5_tfhisreohdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Wpreclamacionesynoconformidadesds_6_tfhisreohdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV158Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel)==0) && ( ! (GXutil.strcmp("", AV157Wpreclamacionesynoconformidadesds_7_tfhisreolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisreoLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Wpreclamacionesynoconformidadesds_8_tfhisreolote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisreoLote = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV160Wpreclamacionesynoconformidadesds_10_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV159Wpreclamacionesynoconformidadesds_9_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV160Wpreclamacionesynoconformidadesds_10_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel)==0) && ( ! (GXutil.strcmp("", AV161Wpreclamacionesynoconformidadesds_11_tfhisbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Wpreclamacionesynoconformidadesds_12_tfhisbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarSer = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV164Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel)==0) && ( ! (GXutil.strcmp("", AV163Wpreclamacionesynoconformidadesds_13_tfhisreodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisReoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV164Wpreclamacionesynoconformidadesds_14_tfhisreodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisReoDsc = ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV166Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV165Wpreclamacionesynoconformidadesds_15_tfhiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Wpreclamacionesynoconformidadesds_16_tfhiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisColNom = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV167Wpreclamacionesynoconformidadesds_17_tfhisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Wpreclamacionesynoconformidadesds_18_tfhisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisNomCli = ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV169Wpreclamacionesynoconformidadesds_19_tfhisopetur) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (0==AV170Wpreclamacionesynoconformidadesds_20_tfhisopetur_to) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV172Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV171Wpreclamacionesynoconformidadesds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV172Wpreclamacionesynoconformidadesds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV173Wpreclamacionesynoconformidadesds_23_tfhisbarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm >= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV174Wpreclamacionesynoconformidadesds_24_tfhisbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm <= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV175Wpreclamacionesynoconformidadesds_25_tfhisbarmtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr >= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Wpreclamacionesynoconformidadesds_26_tfhisbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr <= ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Wpreclamacionesynoconformidadesds_27_tfcostcausa)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV178Wpreclamacionesynoconformidadesds_28_tfcostcausa_to)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa <= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV179Wpreclamacionesynoconformidadesds_29_tfhisreovalorcausa)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) >= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV180Wpreclamacionesynoconformidadesds_30_tfhisreovalorcausa_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) <= ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV181Wpreclamacionesynoconformidadesds_31_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Wpreclamacionesynoconformidadesds_32_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipDefDsc = ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel)==0) && ( ! (GXutil.strcmp("", AV183Wpreclamacionesynoconformidadesds_33_tfdsccausa)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.DscCausa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Wpreclamacionesynoconformidadesds_34_tfdsccausa_sel)==0) )
      {
         addWhere(sWhereString, "(T6.DscCausa = ?)");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV186Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV185Wpreclamacionesynoconformidadesds_35_tfrps_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T7.Rps_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV186Wpreclamacionesynoconformidadesds_36_tfrps_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(T7.Rps_Dsc = ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( ! (0==AV187Wpreclamacionesynoconformidadesds_37_tfhisreotn) )
      {
         addWhere(sWhereString, "(T1.HisReoTn >= ?)");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( ! (0==AV188Wpreclamacionesynoconformidadesds_38_tfhisreotn_to) )
      {
         addWhere(sWhereString, "(T1.HisReoTn <= ?)");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (0==AV189Wpreclamacionesynoconformidadesds_39_tfhisopecod) )
      {
         addWhere(sWhereString, "(T1.HisOpecod >= ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      if ( ! (0==AV190Wpreclamacionesynoconformidadesds_40_tfhisopecod_to) )
      {
         addWhere(sWhereString, "(T1.HisOpecod <= ?)");
      }
      else
      {
         GXv_int6[62] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV192Wpreclamacionesynoconformidadesds_42_tfhisacco_sel)==0) && ( ! (GXutil.strcmp("", AV191Wpreclamacionesynoconformidadesds_41_tfhisacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[63] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV192Wpreclamacionesynoconformidadesds_42_tfhisacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCo = ?)");
      }
      else
      {
         GXv_int6[64] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV194Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel)==0) && ( ! (GXutil.strcmp("", AV193Wpreclamacionesynoconformidadesds_43_tfhisaccot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[65] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV194Wpreclamacionesynoconformidadesds_44_tfhisaccot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCot = ?)");
      }
      else
      {
         GXv_int6[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV196Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel)==0) && ( ! (GXutil.strcmp("", AV195Wpreclamacionesynoconformidadesds_45_tfhisadeacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV196Wpreclamacionesynoconformidadesds_46_tfhisadeacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCo = ?)");
      }
      else
      {
         GXv_int6[68] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV198Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel)==0) && ( ! (GXutil.strcmp("", AV197Wpreclamacionesynoconformidadesds_47_tfhisadeacct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[69] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV198Wpreclamacionesynoconformidadesds_48_tfhisadeacct_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCt = ?)");
      }
      else
      {
         GXv_int6[70] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV200Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV199Wpreclamacionesynoconformidadesds_49_tfhistipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[71] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV200Wpreclamacionesynoconformidadesds_50_tfhistipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int6[72] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV202Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV201Wpreclamacionesynoconformidadesds_51_tfhistipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[73] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV202Wpreclamacionesynoconformidadesds_52_tfhistipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[74] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisReoFec" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisReoFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisEstReo" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisEstReo DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisreoLote" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisreoLote DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisBarSer" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisBarSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisReoDsc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisReoDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisColNom" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisNomCli" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisOpeTur" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisOpeTur DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisBarKgm" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisBarKgm DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisBarMtr" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisBarMtr DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.CostCausa" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.CostCausa DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipDefDsc" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipDefDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.DscCausa" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.DscCausa DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T7.Rps_Dsc" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T7.Rps_Dsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisReoTn" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisReoTn DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisOpecod" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisOpecod DESC" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisAcCo" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisAcCo DESC" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisAcCot" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisAcCot DESC" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisAdEAcCo" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisAdEAcCo DESC" ;
      }
      else if ( ( AV28OrderedBy == 23 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisAdEAcCt" ;
      }
      else if ( ( AV28OrderedBy == 23 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisAdEAcCt DESC" ;
      }
      else if ( ( AV28OrderedBy == 24 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV28OrderedBy == 24 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipColDsc DESC" ;
      }
      GXv_Object7[0] = scmdbuf ;
      GXv_Object7[1] = GXv_int6 ;
      return GXv_Object7 ;
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
                  return conditional_P087G2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).byteValue() , (String)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , ((Number) dynConstraints[71]).intValue() , ((Number) dynConstraints[72]).intValue() , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (java.util.Date)dynConstraints[79] , ((Number) dynConstraints[80]).shortValue() , ((Boolean) dynConstraints[81]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P087G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((int[]) buf[24])[0] = rslt.getInt(14);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((int[]) buf[26])[0] = rslt.getInt(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 40);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 60);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((byte[]) buf[38])[0] = rslt.getByte(21);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(23, 13);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(24, 26);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(25, 16);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(26, 30);
               ((String[]) buf[49])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDate(28);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(29);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(30, 1);
               ((byte[]) buf[56])[0] = rslt.getByte(31);
               ((int[]) buf[57])[0] = rslt.getInt(32);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(33,3);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 11);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 26);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 13);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 6);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[120], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[121], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[122], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[123], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[124], 3);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[125], 3);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[126], 3);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[127], 3);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 30);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 30);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 60);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 60);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 40);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 40);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[135]).intValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[136]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[138], 3276);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[139], 3276);
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[140], 2000);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[141], 2000);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[142], 2000);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[143], 2000);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[144], 2000);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[145], 2000);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 30);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 30);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 30);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[149], 30);
               }
               return;
      }
   }

}

