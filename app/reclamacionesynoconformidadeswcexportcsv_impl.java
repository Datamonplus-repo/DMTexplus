package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class reclamacionesynoconformidadeswcexportcsv_impl extends GXWebProcedure
{
   public reclamacionesynoconformidadeswcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ReclamacionesyNoConformidadesWCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ReclamacionesyNoConformidadesWCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ReclamacionesyNoConformidadesWCColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Causa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Defecto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Causa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( " Responsabilidad", "") : "") ;
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
      AV96Reclamacionesynoconformidadeswcds_1_filterfulltext = AV30FilterFullText ;
      AV97Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = AV36TFHisEstReo_Sels ;
      AV98Reclamacionesynoconformidadeswcds_3_tfhisreofec = AV37TFHisReoFec ;
      AV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr = AV39TFHisReoHDR ;
      AV100Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = AV40TFHisReoHDR_Sel ;
      AV101Reclamacionesynoconformidadeswcds_6_tfhisreolote = AV41TFHisreoLote ;
      AV102Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = AV42TFHisreoLote_Sel ;
      AV103Reclamacionesynoconformidadeswcds_8_tfclinom = AV43TFCliNom ;
      AV104Reclamacionesynoconformidadeswcds_9_tfclinom_sel = AV44TFCliNom_Sel ;
      AV105Reclamacionesynoconformidadeswcds_10_tfhisbarser = AV45TFHisBarSer ;
      AV106Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = AV46TFHisBarSer_Sel ;
      AV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc = AV47TFHisReoDsc ;
      AV108Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = AV48TFHisReoDsc_Sel ;
      AV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom = AV49TFHisColNom ;
      AV110Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = AV50TFHisColNom_Sel ;
      AV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli = AV51TFHisNomCli ;
      AV112Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = AV52TFHisNomCli_Sel ;
      AV113Reclamacionesynoconformidadeswcds_18_tfhisopetur = AV53TFHisOpeTur ;
      AV114Reclamacionesynoconformidadeswcds_19_tfhisopetur_to = AV54TFHisOpeTur_To ;
      AV115Reclamacionesynoconformidadeswcds_20_tfmaqcod = AV55TFMaqCod ;
      AV116Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = AV56TFMaqCod_Sel ;
      AV117Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = AV57TFHisBarKgm ;
      AV118Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = AV58TFHisBarKgm_To ;
      AV119Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = AV59TFHisBarMtr ;
      AV120Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = AV60TFHisBarMtr_To ;
      AV121Reclamacionesynoconformidadeswcds_26_tfcostcausa = AV61TFCostCausa ;
      AV122Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = AV62TFCostCausa_To ;
      AV123Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = AV87TFHisreoValorCausa ;
      AV124Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = AV88TFHisreoValorCausa_To ;
      AV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc = AV63TFTipDefDsc ;
      AV126Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = AV64TFTipDefDsc_Sel ;
      AV127Reclamacionesynoconformidadeswcds_32_tfdsccausa = AV65TFDscCausa ;
      AV128Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = AV66TFDscCausa_Sel ;
      AV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc = AV67TFRps_Dsc ;
      AV130Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = AV68TFRps_Dsc_Sel ;
      AV131Reclamacionesynoconformidadeswcds_36_tfhisreotn = AV69TFHisReoTn ;
      AV132Reclamacionesynoconformidadeswcds_37_tfhisreotn_to = AV70TFHisReoTn_To ;
      AV133Reclamacionesynoconformidadeswcds_38_tfhisopecod = AV71TFHisOpecod ;
      AV134Reclamacionesynoconformidadeswcds_39_tfhisopecod_to = AV72TFHisOpecod_To ;
      AV135Reclamacionesynoconformidadeswcds_40_tfhisacco = AV73TFHisAcCo ;
      AV136Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = AV74TFHisAcCo_Sel ;
      AV137Reclamacionesynoconformidadeswcds_42_tfhisaccot = AV75TFHisAcCot ;
      AV138Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = AV76TFHisAcCot_Sel ;
      AV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco = AV77TFHisAdEAcCo ;
      AV140Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = AV78TFHisAdEAcCo_Sel ;
      AV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct = AV79TFHisAdEAcCt ;
      AV142Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = AV80TFHisAdEAcCt_Sel ;
      AV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = AV89TFHisTipArtDsc ;
      AV144Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = AV90TFHisTipArtDsc_Sel ;
      AV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = AV91TFHisTipColDsc ;
      AV146Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = AV92TFHisTipColDsc_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A548HisEstReo) ,
                                           AV97Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels ,
                                           AV96Reclamacionesynoconformidadeswcds_1_filterfulltext ,
                                           Integer.valueOf(AV97Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels.size()) ,
                                           AV98Reclamacionesynoconformidadeswcds_3_tfhisreofec ,
                                           AV100Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel ,
                                           AV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr ,
                                           AV102Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel ,
                                           AV101Reclamacionesynoconformidadeswcds_6_tfhisreolote ,
                                           AV104Reclamacionesynoconformidadeswcds_9_tfclinom_sel ,
                                           AV103Reclamacionesynoconformidadeswcds_8_tfclinom ,
                                           AV106Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel ,
                                           AV105Reclamacionesynoconformidadeswcds_10_tfhisbarser ,
                                           AV108Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel ,
                                           AV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc ,
                                           AV110Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel ,
                                           AV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom ,
                                           AV112Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel ,
                                           AV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli ,
                                           Byte.valueOf(AV113Reclamacionesynoconformidadeswcds_18_tfhisopetur) ,
                                           Byte.valueOf(AV114Reclamacionesynoconformidadeswcds_19_tfhisopetur_to) ,
                                           AV116Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel ,
                                           AV115Reclamacionesynoconformidadeswcds_20_tfmaqcod ,
                                           AV117Reclamacionesynoconformidadeswcds_22_tfhisbarkgm ,
                                           AV118Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to ,
                                           AV119Reclamacionesynoconformidadeswcds_24_tfhisbarmtr ,
                                           AV120Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to ,
                                           AV121Reclamacionesynoconformidadeswcds_26_tfcostcausa ,
                                           AV122Reclamacionesynoconformidadeswcds_27_tfcostcausa_to ,
                                           AV123Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa ,
                                           AV124Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to ,
                                           AV126Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel ,
                                           AV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc ,
                                           AV128Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel ,
                                           AV127Reclamacionesynoconformidadeswcds_32_tfdsccausa ,
                                           AV130Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel ,
                                           AV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc ,
                                           Integer.valueOf(AV131Reclamacionesynoconformidadeswcds_36_tfhisreotn) ,
                                           Integer.valueOf(AV132Reclamacionesynoconformidadeswcds_37_tfhisreotn_to) ,
                                           Integer.valueOf(AV133Reclamacionesynoconformidadeswcds_38_tfhisopecod) ,
                                           Integer.valueOf(AV134Reclamacionesynoconformidadeswcds_39_tfhisopecod_to) ,
                                           AV136Reclamacionesynoconformidadeswcds_41_tfhisacco_sel ,
                                           AV135Reclamacionesynoconformidadeswcds_40_tfhisacco ,
                                           AV138Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel ,
                                           AV137Reclamacionesynoconformidadeswcds_42_tfhisaccot ,
                                           AV140Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel ,
                                           AV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco ,
                                           AV142Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel ,
                                           AV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct ,
                                           AV144Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel ,
                                           AV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ,
                                           AV146Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel ,
                                           AV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ,
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
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV82Clicod) ,
                                           Short.valueOf(AV86Clicod_to) ,
                                           AV83HisreoFec ,
                                           AV84HisreoFec_to ,
                                           Byte.valueOf(AV85HisEstReo) ,
                                           AV81Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV96Reclamacionesynoconformidadeswcds_1_filterfulltext), "%", "") ;
      lV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr = GXutil.padr( GXutil.rtrim( AV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr), 11, "%") ;
      lV101Reclamacionesynoconformidadeswcds_6_tfhisreolote = GXutil.padr( GXutil.rtrim( AV101Reclamacionesynoconformidadeswcds_6_tfhisreolote), 20, "%") ;
      lV103Reclamacionesynoconformidadeswcds_8_tfclinom = GXutil.padr( GXutil.rtrim( AV103Reclamacionesynoconformidadeswcds_8_tfclinom), 30, "%") ;
      lV105Reclamacionesynoconformidadeswcds_10_tfhisbarser = GXutil.padr( GXutil.rtrim( AV105Reclamacionesynoconformidadeswcds_10_tfhisbarser), 16, "%") ;
      lV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc = GXutil.padr( GXutil.rtrim( AV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc), 26, "%") ;
      lV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom = GXutil.padr( GXutil.rtrim( AV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom), 13, "%") ;
      lV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli = GXutil.padr( GXutil.rtrim( AV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli), 13, "%") ;
      lV115Reclamacionesynoconformidadeswcds_20_tfmaqcod = GXutil.padr( GXutil.rtrim( AV115Reclamacionesynoconformidadeswcds_20_tfmaqcod), 6, "%") ;
      lV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc = GXutil.padr( GXutil.rtrim( AV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc), 30, "%") ;
      lV127Reclamacionesynoconformidadeswcds_32_tfdsccausa = GXutil.padr( GXutil.rtrim( AV127Reclamacionesynoconformidadeswcds_32_tfdsccausa), 60, "%") ;
      lV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc = GXutil.padr( GXutil.rtrim( AV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc), 40, "%") ;
      lV135Reclamacionesynoconformidadeswcds_40_tfhisacco = GXutil.concat( GXutil.rtrim( AV135Reclamacionesynoconformidadeswcds_40_tfhisacco), "%", "") ;
      lV137Reclamacionesynoconformidadeswcds_42_tfhisaccot = GXutil.concat( GXutil.rtrim( AV137Reclamacionesynoconformidadeswcds_42_tfhisaccot), "%", "") ;
      lV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco = GXutil.concat( GXutil.rtrim( AV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco), "%", "") ;
      lV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct = GXutil.concat( GXutil.rtrim( AV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct), "%", "") ;
      lV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = GXutil.padr( GXutil.rtrim( AV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc), 30, "%") ;
      lV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = GXutil.padr( GXutil.rtrim( AV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc), 30, "%") ;
      /* Using cursor P08YQ2 */
      pr_default.execute(0, new Object[] {AV81Emprcod, Integer.valueOf(AV82Clicod), Short.valueOf(AV86Clicod_to), AV83HisreoFec, AV84HisreoFec_to, Byte.valueOf(AV85HisEstReo), lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, lV96Reclamacionesynoconformidadeswcds_1_filterfulltext, AV98Reclamacionesynoconformidadeswcds_3_tfhisreofec, lV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr, AV100Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel, lV101Reclamacionesynoconformidadeswcds_6_tfhisreolote, AV102Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel, lV103Reclamacionesynoconformidadeswcds_8_tfclinom, AV104Reclamacionesynoconformidadeswcds_9_tfclinom_sel, lV105Reclamacionesynoconformidadeswcds_10_tfhisbarser, AV106Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel, lV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc, AV108Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel, lV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom, AV110Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel, lV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli, AV112Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel, Byte.valueOf(AV113Reclamacionesynoconformidadeswcds_18_tfhisopetur), Byte.valueOf(AV114Reclamacionesynoconformidadeswcds_19_tfhisopetur_to), lV115Reclamacionesynoconformidadeswcds_20_tfmaqcod, AV116Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel, AV117Reclamacionesynoconformidadeswcds_22_tfhisbarkgm, AV118Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to, AV119Reclamacionesynoconformidadeswcds_24_tfhisbarmtr, AV120Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to, AV121Reclamacionesynoconformidadeswcds_26_tfcostcausa, AV122Reclamacionesynoconformidadeswcds_27_tfcostcausa_to, AV123Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa, AV124Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to, lV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc, AV126Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel, lV127Reclamacionesynoconformidadeswcds_32_tfdsccausa, AV128Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel, lV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc, AV130Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel, Integer.valueOf(AV131Reclamacionesynoconformidadeswcds_36_tfhisreotn), Integer.valueOf(AV132Reclamacionesynoconformidadeswcds_37_tfhisreotn_to), Integer.valueOf(AV133Reclamacionesynoconformidadeswcds_38_tfhisopecod), Integer.valueOf(AV134Reclamacionesynoconformidadeswcds_39_tfhisopecod_to), lV135Reclamacionesynoconformidadeswcds_40_tfhisacco, AV136Reclamacionesynoconformidadeswcds_41_tfhisacco_sel, lV137Reclamacionesynoconformidadeswcds_42_tfhisaccot, AV138Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel, lV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco, AV140Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel, lV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct, AV142Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel, lV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc, AV144Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel, lV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc, AV146Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A571HisTipArt = P08YQ2_A571HisTipArt[0] ;
         n571HisTipArt = P08YQ2_n571HisTipArt[0] ;
         A572HisTipCol = P08YQ2_A572HisTipCol[0] ;
         n572HisTipCol = P08YQ2_n572HisTipCol[0] ;
         A833TipDefCod = P08YQ2_A833TipDefCod[0] ;
         A5085CodCausa = P08YQ2_A5085CodCausa[0] ;
         n5085CodCausa = P08YQ2_n5085CodCausa[0] ;
         A7000Rps_Cod = P08YQ2_A7000Rps_Cod[0] ;
         n7000Rps_Cod = P08YQ2_n7000Rps_Cod[0] ;
         A252CliCod = P08YQ2_A252CliCod[0] ;
         n252CliCod = P08YQ2_n252CliCod[0] ;
         A396EmprCod = P08YQ2_A396EmprCod[0] ;
         A13844HisTipColD = P08YQ2_A13844HisTipColD[0] ;
         n13844HisTipColD = P08YQ2_n13844HisTipColD[0] ;
         A13843HisTipArtD = P08YQ2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P08YQ2_n13843HisTipArtD[0] ;
         A5695HisAdEAcCt = P08YQ2_A5695HisAdEAcCt[0] ;
         n5695HisAdEAcCt = P08YQ2_n5695HisAdEAcCt[0] ;
         A5694HisAdEAcCo = P08YQ2_A5694HisAdEAcCo[0] ;
         n5694HisAdEAcCo = P08YQ2_n5694HisAdEAcCo[0] ;
         A5693HisAcCot = P08YQ2_A5693HisAcCot[0] ;
         n5693HisAcCot = P08YQ2_n5693HisAcCot[0] ;
         A5662HisAcCo = P08YQ2_A5662HisAcCo[0] ;
         n5662HisAcCo = P08YQ2_n5662HisAcCo[0] ;
         A12949HisOpecod = P08YQ2_A12949HisOpecod[0] ;
         n12949HisOpecod = P08YQ2_n12949HisOpecod[0] ;
         A2297HisReoTn = P08YQ2_A2297HisReoTn[0] ;
         n2297HisReoTn = P08YQ2_n2297HisReoTn[0] ;
         A7001Rps_Dsc = P08YQ2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P08YQ2_n7001Rps_Dsc[0] ;
         A5086DscCausa = P08YQ2_A5086DscCausa[0] ;
         n5086DscCausa = P08YQ2_n5086DscCausa[0] ;
         A834TipDefDsc = P08YQ2_A834TipDefDsc[0] ;
         n834TipDefDsc = P08YQ2_n834TipDefDsc[0] ;
         A541HisBarMtr = P08YQ2_A541HisBarMtr[0] ;
         n541HisBarMtr = P08YQ2_n541HisBarMtr[0] ;
         A602MaqCod = P08YQ2_A602MaqCod[0] ;
         n602MaqCod = P08YQ2_n602MaqCod[0] ;
         A12950HisOpeTur = P08YQ2_A12950HisOpeTur[0] ;
         n12950HisOpeTur = P08YQ2_n12950HisOpeTur[0] ;
         A8889HisNomCli = P08YQ2_A8889HisNomCli[0] ;
         n8889HisNomCli = P08YQ2_n8889HisNomCli[0] ;
         A546HisColNom = P08YQ2_A546HisColNom[0] ;
         n546HisColNom = P08YQ2_n546HisColNom[0] ;
         A2299HisReoDsc = P08YQ2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = P08YQ2_n2299HisReoDsc[0] ;
         A542HisBarSer = P08YQ2_A542HisBarSer[0] ;
         n542HisBarSer = P08YQ2_n542HisBarSer[0] ;
         A279CliNom = P08YQ2_A279CliNom[0] ;
         A13698HisreoLote = P08YQ2_A13698HisreoLote[0] ;
         n13698HisreoLote = P08YQ2_n13698HisreoLote[0] ;
         A569HisReoFec = P08YQ2_A569HisReoFec[0] ;
         n569HisReoFec = P08YQ2_n569HisReoFec[0] ;
         A548HisEstReo = P08YQ2_A548HisEstReo[0] ;
         n548HisEstReo = P08YQ2_n548HisEstReo[0] ;
         A544HisCodPar = P08YQ2_A544HisCodPar[0] ;
         A545HisCodReo = P08YQ2_A545HisCodReo[0] ;
         A539HisBarCod = P08YQ2_A539HisBarCod[0] ;
         A13699CostCausa = P08YQ2_A13699CostCausa[0] ;
         n13699CostCausa = P08YQ2_n13699CostCausa[0] ;
         A540HisBarKgm = P08YQ2_A540HisBarKgm[0] ;
         n540HisBarKgm = P08YQ2_n540HisBarKgm[0] ;
         A279CliNom = P08YQ2_A279CliNom[0] ;
         A13843HisTipArtD = P08YQ2_A13843HisTipArtD[0] ;
         n13843HisTipArtD = P08YQ2_n13843HisTipArtD[0] ;
         A13844HisTipColD = P08YQ2_A13844HisTipColD[0] ;
         n13844HisTipColD = P08YQ2_n13844HisTipColD[0] ;
         A834TipDefDsc = P08YQ2_A834TipDefDsc[0] ;
         n834TipDefDsc = P08YQ2_n834TipDefDsc[0] ;
         A5086DscCausa = P08YQ2_A5086DscCausa[0] ;
         n5086DscCausa = P08YQ2_n5086DscCausa[0] ;
         A13699CostCausa = P08YQ2_A13699CostCausa[0] ;
         n13699CostCausa = P08YQ2_n13699CostCausa[0] ;
         A7001Rps_Dsc = P08YQ2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = P08YQ2_n7001Rps_Dsc[0] ;
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
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13698HisreoLote, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A542HisBarSer, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2299HisReoDsc, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A546HisColNom, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A8889HisNomCli, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5086DscCausa, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A7001Rps_Dsc, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV31NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A5662HisAcCo, ";", ","), AV31NewLine, " "), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV31NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A5693HisAcCot, ";", ","), AV31NewLine, " "), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV31NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A5694HisAdEAcCo, ";", ","), AV31NewLine, " "), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV31NewLine = GXutil.chr( (short)(10)) ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A5695HisAdEAcCt, ";", ","), AV31NewLine, " "), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13843HisTipArtD, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13844HisTipColD, ";", ","), GXv_char3) ;
            reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ReclamacionesyNoConformidadesWCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCod", "", "Código Máquina", true, "") ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DscCausa", "", "Causa", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Rps_Dsc", "", " Responsabilidad", true, "") ;
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
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ReclamacionesyNoConformidadesWCColumnsSelector", GXv_char3) ;
      reclamacionesynoconformidadeswcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ReclamacionesyNoConformidadesWCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ReclamacionesyNoConformidadesWCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("ReclamacionesyNoConformidadesWCGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV147GXV1 = 1 ;
      while ( AV147GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV147GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISESTREO_SEL") == 0 )
         {
            AV35TFHisEstReo_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV36TFHisEstReo_Sels.fromJSonString(AV35TFHisEstReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOFEC") == 0 )
         {
            AV37TFHisReoFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR") == 0 )
         {
            AV39TFHisReoHDR = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOHDR_SEL") == 0 )
         {
            AV40TFHisReoHDR_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE") == 0 )
         {
            AV41TFHisreoLote = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOLOTE_SEL") == 0 )
         {
            AV42TFHisreoLote_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV43TFCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV44TFCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER") == 0 )
         {
            AV45TFHisBarSer = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARSER_SEL") == 0 )
         {
            AV46TFHisBarSer_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC") == 0 )
         {
            AV47TFHisReoDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREODSC_SEL") == 0 )
         {
            AV48TFHisReoDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM") == 0 )
         {
            AV49TFHisColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISCOLNOM_SEL") == 0 )
         {
            AV50TFHisColNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI") == 0 )
         {
            AV51TFHisNomCli = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISNOMCLI_SEL") == 0 )
         {
            AV52TFHisNomCli_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPETUR") == 0 )
         {
            AV53TFHisOpeTur = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFHisOpeTur_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV55TFMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV56TFMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARKGM") == 0 )
         {
            AV57TFHisBarKgm = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFHisBarKgm_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISBARMTR") == 0 )
         {
            AV59TFHisBarMtr = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFHisBarMtr_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTCAUSA") == 0 )
         {
            AV61TFCostCausa = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFCostCausa_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOVALORCAUSA") == 0 )
         {
            AV87TFHisreoValorCausa = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV88TFHisreoValorCausa_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC") == 0 )
         {
            AV63TFTipDefDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPDEFDSC_SEL") == 0 )
         {
            AV64TFTipDefDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA") == 0 )
         {
            AV65TFDscCausa = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDSCCAUSA_SEL") == 0 )
         {
            AV66TFDscCausa_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC") == 0 )
         {
            AV67TFRps_Dsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRPS_DSC_SEL") == 0 )
         {
            AV68TFRps_Dsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISREOTN") == 0 )
         {
            AV69TFHisReoTn = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFHisReoTn_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISOPECOD") == 0 )
         {
            AV71TFHisOpecod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV72TFHisOpecod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO") == 0 )
         {
            AV73TFHisAcCo = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCO_SEL") == 0 )
         {
            AV74TFHisAcCo_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT") == 0 )
         {
            AV75TFHisAcCot = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISACCOT_SEL") == 0 )
         {
            AV76TFHisAcCot_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO") == 0 )
         {
            AV77TFHisAdEAcCo = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCO_SEL") == 0 )
         {
            AV78TFHisAdEAcCo_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT") == 0 )
         {
            AV79TFHisAdEAcCt = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISADEACCT_SEL") == 0 )
         {
            AV80TFHisAdEAcCt_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC") == 0 )
         {
            AV89TFHisTipArtDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPARTDSC_SEL") == 0 )
         {
            AV90TFHisTipArtDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC") == 0 )
         {
            AV91TFHisTipColDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISTIPCOLDSC_SEL") == 0 )
         {
            AV92TFHisTipColDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV81Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV82Clicod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV86Clicod_to = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISREOFEC") == 0 )
         {
            AV83HisreoFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISREOFEC_TO") == 0 )
         {
            AV84HisreoFec_to = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISESTREO") == 0 )
         {
            AV85HisEstReo = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV147GXV1 = (int)(AV147GXV1+1) ;
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
      AV96Reclamacionesynoconformidadeswcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV97Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV36TFHisEstReo_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV98Reclamacionesynoconformidadeswcds_3_tfhisreofec = GXutil.nullDate() ;
      AV37TFHisReoFec = GXutil.nullDate() ;
      AV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr = "" ;
      AV39TFHisReoHDR = "" ;
      AV100Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel = "" ;
      AV40TFHisReoHDR_Sel = "" ;
      AV101Reclamacionesynoconformidadeswcds_6_tfhisreolote = "" ;
      AV41TFHisreoLote = "" ;
      AV102Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel = "" ;
      AV42TFHisreoLote_Sel = "" ;
      AV103Reclamacionesynoconformidadeswcds_8_tfclinom = "" ;
      AV43TFCliNom = "" ;
      AV104Reclamacionesynoconformidadeswcds_9_tfclinom_sel = "" ;
      AV44TFCliNom_Sel = "" ;
      AV105Reclamacionesynoconformidadeswcds_10_tfhisbarser = "" ;
      AV45TFHisBarSer = "" ;
      AV106Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel = "" ;
      AV46TFHisBarSer_Sel = "" ;
      AV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc = "" ;
      AV47TFHisReoDsc = "" ;
      AV108Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel = "" ;
      AV48TFHisReoDsc_Sel = "" ;
      AV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom = "" ;
      AV49TFHisColNom = "" ;
      AV110Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel = "" ;
      AV50TFHisColNom_Sel = "" ;
      AV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli = "" ;
      AV51TFHisNomCli = "" ;
      AV112Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel = "" ;
      AV52TFHisNomCli_Sel = "" ;
      AV115Reclamacionesynoconformidadeswcds_20_tfmaqcod = "" ;
      AV55TFMaqCod = "" ;
      AV116Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel = "" ;
      AV56TFMaqCod_Sel = "" ;
      AV117Reclamacionesynoconformidadeswcds_22_tfhisbarkgm = DecimalUtil.ZERO ;
      AV57TFHisBarKgm = DecimalUtil.ZERO ;
      AV118Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to = DecimalUtil.ZERO ;
      AV58TFHisBarKgm_To = DecimalUtil.ZERO ;
      AV119Reclamacionesynoconformidadeswcds_24_tfhisbarmtr = DecimalUtil.ZERO ;
      AV59TFHisBarMtr = DecimalUtil.ZERO ;
      AV120Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to = DecimalUtil.ZERO ;
      AV60TFHisBarMtr_To = DecimalUtil.ZERO ;
      AV121Reclamacionesynoconformidadeswcds_26_tfcostcausa = DecimalUtil.ZERO ;
      AV61TFCostCausa = DecimalUtil.ZERO ;
      AV122Reclamacionesynoconformidadeswcds_27_tfcostcausa_to = DecimalUtil.ZERO ;
      AV62TFCostCausa_To = DecimalUtil.ZERO ;
      AV123Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa = DecimalUtil.ZERO ;
      AV87TFHisreoValorCausa = DecimalUtil.ZERO ;
      AV124Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to = DecimalUtil.ZERO ;
      AV88TFHisreoValorCausa_To = DecimalUtil.ZERO ;
      AV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc = "" ;
      AV63TFTipDefDsc = "" ;
      AV126Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel = "" ;
      AV64TFTipDefDsc_Sel = "" ;
      AV127Reclamacionesynoconformidadeswcds_32_tfdsccausa = "" ;
      AV65TFDscCausa = "" ;
      AV128Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel = "" ;
      AV66TFDscCausa_Sel = "" ;
      AV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc = "" ;
      AV67TFRps_Dsc = "" ;
      AV130Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel = "" ;
      AV68TFRps_Dsc_Sel = "" ;
      AV135Reclamacionesynoconformidadeswcds_40_tfhisacco = "" ;
      AV73TFHisAcCo = "" ;
      AV136Reclamacionesynoconformidadeswcds_41_tfhisacco_sel = "" ;
      AV74TFHisAcCo_Sel = "" ;
      AV137Reclamacionesynoconformidadeswcds_42_tfhisaccot = "" ;
      AV75TFHisAcCot = "" ;
      AV138Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel = "" ;
      AV76TFHisAcCot_Sel = "" ;
      AV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco = "" ;
      AV77TFHisAdEAcCo = "" ;
      AV140Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel = "" ;
      AV78TFHisAdEAcCo_Sel = "" ;
      AV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct = "" ;
      AV79TFHisAdEAcCt = "" ;
      AV142Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel = "" ;
      AV80TFHisAdEAcCt_Sel = "" ;
      AV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = "" ;
      AV89TFHisTipArtDsc = "" ;
      AV144Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel = "" ;
      AV90TFHisTipArtDsc_Sel = "" ;
      AV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = "" ;
      AV91TFHisTipColDsc = "" ;
      AV146Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel = "" ;
      AV92TFHisTipColDsc_Sel = "" ;
      scmdbuf = "" ;
      lV96Reclamacionesynoconformidadeswcds_1_filterfulltext = "" ;
      lV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr = "" ;
      lV101Reclamacionesynoconformidadeswcds_6_tfhisreolote = "" ;
      lV103Reclamacionesynoconformidadeswcds_8_tfclinom = "" ;
      lV105Reclamacionesynoconformidadeswcds_10_tfhisbarser = "" ;
      lV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc = "" ;
      lV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom = "" ;
      lV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli = "" ;
      lV115Reclamacionesynoconformidadeswcds_20_tfmaqcod = "" ;
      lV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc = "" ;
      lV127Reclamacionesynoconformidadeswcds_32_tfdsccausa = "" ;
      lV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc = "" ;
      lV135Reclamacionesynoconformidadeswcds_40_tfhisacco = "" ;
      lV137Reclamacionesynoconformidadeswcds_42_tfhisaccot = "" ;
      lV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco = "" ;
      lV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct = "" ;
      lV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc = "" ;
      lV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc = "" ;
      A544HisCodPar = "" ;
      AV83HisreoFec = GXutil.nullDate() ;
      AV84HisreoFec_to = GXutil.nullDate() ;
      AV81Emprcod = "" ;
      A396EmprCod = "" ;
      P08YQ2_A571HisTipArt = new short[1] ;
      P08YQ2_n571HisTipArt = new boolean[] {false} ;
      P08YQ2_A572HisTipCol = new byte[1] ;
      P08YQ2_n572HisTipCol = new boolean[] {false} ;
      P08YQ2_A833TipDefCod = new short[1] ;
      P08YQ2_A5085CodCausa = new short[1] ;
      P08YQ2_n5085CodCausa = new boolean[] {false} ;
      P08YQ2_A7000Rps_Cod = new short[1] ;
      P08YQ2_n7000Rps_Cod = new boolean[] {false} ;
      P08YQ2_A252CliCod = new int[1] ;
      P08YQ2_n252CliCod = new boolean[] {false} ;
      P08YQ2_A396EmprCod = new String[] {""} ;
      P08YQ2_A13844HisTipColD = new String[] {""} ;
      P08YQ2_n13844HisTipColD = new boolean[] {false} ;
      P08YQ2_A13843HisTipArtD = new String[] {""} ;
      P08YQ2_n13843HisTipArtD = new boolean[] {false} ;
      P08YQ2_A5695HisAdEAcCt = new String[] {""} ;
      P08YQ2_n5695HisAdEAcCt = new boolean[] {false} ;
      P08YQ2_A5694HisAdEAcCo = new String[] {""} ;
      P08YQ2_n5694HisAdEAcCo = new boolean[] {false} ;
      P08YQ2_A5693HisAcCot = new String[] {""} ;
      P08YQ2_n5693HisAcCot = new boolean[] {false} ;
      P08YQ2_A5662HisAcCo = new String[] {""} ;
      P08YQ2_n5662HisAcCo = new boolean[] {false} ;
      P08YQ2_A12949HisOpecod = new int[1] ;
      P08YQ2_n12949HisOpecod = new boolean[] {false} ;
      P08YQ2_A2297HisReoTn = new int[1] ;
      P08YQ2_n2297HisReoTn = new boolean[] {false} ;
      P08YQ2_A7001Rps_Dsc = new String[] {""} ;
      P08YQ2_n7001Rps_Dsc = new boolean[] {false} ;
      P08YQ2_A5086DscCausa = new String[] {""} ;
      P08YQ2_n5086DscCausa = new boolean[] {false} ;
      P08YQ2_A834TipDefDsc = new String[] {""} ;
      P08YQ2_n834TipDefDsc = new boolean[] {false} ;
      P08YQ2_A541HisBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YQ2_n541HisBarMtr = new boolean[] {false} ;
      P08YQ2_A602MaqCod = new String[] {""} ;
      P08YQ2_n602MaqCod = new boolean[] {false} ;
      P08YQ2_A12950HisOpeTur = new byte[1] ;
      P08YQ2_n12950HisOpeTur = new boolean[] {false} ;
      P08YQ2_A8889HisNomCli = new String[] {""} ;
      P08YQ2_n8889HisNomCli = new boolean[] {false} ;
      P08YQ2_A546HisColNom = new String[] {""} ;
      P08YQ2_n546HisColNom = new boolean[] {false} ;
      P08YQ2_A2299HisReoDsc = new String[] {""} ;
      P08YQ2_n2299HisReoDsc = new boolean[] {false} ;
      P08YQ2_A542HisBarSer = new String[] {""} ;
      P08YQ2_n542HisBarSer = new boolean[] {false} ;
      P08YQ2_A279CliNom = new String[] {""} ;
      P08YQ2_A13698HisreoLote = new String[] {""} ;
      P08YQ2_n13698HisreoLote = new boolean[] {false} ;
      P08YQ2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08YQ2_n569HisReoFec = new boolean[] {false} ;
      P08YQ2_A548HisEstReo = new byte[1] ;
      P08YQ2_n548HisEstReo = new boolean[] {false} ;
      P08YQ2_A544HisCodPar = new String[] {""} ;
      P08YQ2_A545HisCodReo = new byte[1] ;
      P08YQ2_A539HisBarCod = new int[1] ;
      P08YQ2_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YQ2_n13699CostCausa = new boolean[] {false} ;
      P08YQ2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YQ2_n540HisBarKgm = new boolean[] {false} ;
      AV31NewLine = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV35TFHisEstReo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.reclamacionesynoconformidadeswcexportcsv__default(),
         new Object[] {
             new Object[] {
            P08YQ2_A571HisTipArt, P08YQ2_n571HisTipArt, P08YQ2_A572HisTipCol, P08YQ2_n572HisTipCol, P08YQ2_A833TipDefCod, P08YQ2_A5085CodCausa, P08YQ2_n5085CodCausa, P08YQ2_A7000Rps_Cod, P08YQ2_n7000Rps_Cod, P08YQ2_A252CliCod,
            P08YQ2_n252CliCod, P08YQ2_A396EmprCod, P08YQ2_A13844HisTipColD, P08YQ2_n13844HisTipColD, P08YQ2_A13843HisTipArtD, P08YQ2_n13843HisTipArtD, P08YQ2_A5695HisAdEAcCt, P08YQ2_n5695HisAdEAcCt, P08YQ2_A5694HisAdEAcCo, P08YQ2_n5694HisAdEAcCo,
            P08YQ2_A5693HisAcCot, P08YQ2_n5693HisAcCot, P08YQ2_A5662HisAcCo, P08YQ2_n5662HisAcCo, P08YQ2_A12949HisOpecod, P08YQ2_n12949HisOpecod, P08YQ2_A2297HisReoTn, P08YQ2_n2297HisReoTn, P08YQ2_A7001Rps_Dsc, P08YQ2_n7001Rps_Dsc,
            P08YQ2_A5086DscCausa, P08YQ2_n5086DscCausa, P08YQ2_A834TipDefDsc, P08YQ2_n834TipDefDsc, P08YQ2_A541HisBarMtr, P08YQ2_n541HisBarMtr, P08YQ2_A602MaqCod, P08YQ2_n602MaqCod, P08YQ2_A12950HisOpeTur, P08YQ2_n12950HisOpeTur,
            P08YQ2_A8889HisNomCli, P08YQ2_n8889HisNomCli, P08YQ2_A546HisColNom, P08YQ2_n546HisColNom, P08YQ2_A2299HisReoDsc, P08YQ2_n2299HisReoDsc, P08YQ2_A542HisBarSer, P08YQ2_n542HisBarSer, P08YQ2_A279CliNom, P08YQ2_A13698HisreoLote,
            P08YQ2_n13698HisreoLote, P08YQ2_A569HisReoFec, P08YQ2_n569HisReoFec, P08YQ2_A548HisEstReo, P08YQ2_n548HisEstReo, P08YQ2_A544HisCodPar, P08YQ2_A545HisCodReo, P08YQ2_A539HisBarCod, P08YQ2_A13699CostCausa, P08YQ2_n13699CostCausa,
            P08YQ2_A540HisBarKgm, P08YQ2_n540HisBarKgm
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A548HisEstReo ;
   private byte A12950HisOpeTur ;
   private byte AV113Reclamacionesynoconformidadeswcds_18_tfhisopetur ;
   private byte AV53TFHisOpeTur ;
   private byte AV114Reclamacionesynoconformidadeswcds_19_tfhisopetur_to ;
   private byte AV54TFHisOpeTur_To ;
   private byte A545HisCodReo ;
   private byte AV85HisEstReo ;
   private byte A572HisTipCol ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short AV86Clicod_to ;
   private short A571HisTipArt ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private short Gx_err ;
   private int AV13Random ;
   private int A2297HisReoTn ;
   private int A12949HisOpecod ;
   private int AV131Reclamacionesynoconformidadeswcds_36_tfhisreotn ;
   private int AV69TFHisReoTn ;
   private int AV132Reclamacionesynoconformidadeswcds_37_tfhisreotn_to ;
   private int AV70TFHisReoTn_To ;
   private int AV133Reclamacionesynoconformidadeswcds_38_tfhisopecod ;
   private int AV71TFHisOpecod ;
   private int AV134Reclamacionesynoconformidadeswcds_39_tfhisopecod_to ;
   private int AV72TFHisOpecod_To ;
   private int AV97Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels_size ;
   private int A539HisBarCod ;
   private int A252CliCod ;
   private int AV82Clicod ;
   private int AV147GXV1 ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal A541HisBarMtr ;
   private java.math.BigDecimal A13699CostCausa ;
   private java.math.BigDecimal A13700HisreoValo ;
   private java.math.BigDecimal AV117Reclamacionesynoconformidadeswcds_22_tfhisbarkgm ;
   private java.math.BigDecimal AV57TFHisBarKgm ;
   private java.math.BigDecimal AV118Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to ;
   private java.math.BigDecimal AV58TFHisBarKgm_To ;
   private java.math.BigDecimal AV119Reclamacionesynoconformidadeswcds_24_tfhisbarmtr ;
   private java.math.BigDecimal AV59TFHisBarMtr ;
   private java.math.BigDecimal AV120Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to ;
   private java.math.BigDecimal AV60TFHisBarMtr_To ;
   private java.math.BigDecimal AV121Reclamacionesynoconformidadeswcds_26_tfcostcausa ;
   private java.math.BigDecimal AV61TFCostCausa ;
   private java.math.BigDecimal AV122Reclamacionesynoconformidadeswcds_27_tfcostcausa_to ;
   private java.math.BigDecimal AV62TFCostCausa_To ;
   private java.math.BigDecimal AV123Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa ;
   private java.math.BigDecimal AV87TFHisreoValorCausa ;
   private java.math.BigDecimal AV124Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to ;
   private java.math.BigDecimal AV88TFHisreoValorCausa_To ;
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
   private String AV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr ;
   private String AV39TFHisReoHDR ;
   private String AV100Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel ;
   private String AV40TFHisReoHDR_Sel ;
   private String AV101Reclamacionesynoconformidadeswcds_6_tfhisreolote ;
   private String AV41TFHisreoLote ;
   private String AV102Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel ;
   private String AV42TFHisreoLote_Sel ;
   private String AV103Reclamacionesynoconformidadeswcds_8_tfclinom ;
   private String AV43TFCliNom ;
   private String AV104Reclamacionesynoconformidadeswcds_9_tfclinom_sel ;
   private String AV44TFCliNom_Sel ;
   private String AV105Reclamacionesynoconformidadeswcds_10_tfhisbarser ;
   private String AV45TFHisBarSer ;
   private String AV106Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel ;
   private String AV46TFHisBarSer_Sel ;
   private String AV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc ;
   private String AV47TFHisReoDsc ;
   private String AV108Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel ;
   private String AV48TFHisReoDsc_Sel ;
   private String AV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom ;
   private String AV49TFHisColNom ;
   private String AV110Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel ;
   private String AV50TFHisColNom_Sel ;
   private String AV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli ;
   private String AV51TFHisNomCli ;
   private String AV112Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel ;
   private String AV52TFHisNomCli_Sel ;
   private String AV115Reclamacionesynoconformidadeswcds_20_tfmaqcod ;
   private String AV55TFMaqCod ;
   private String AV116Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel ;
   private String AV56TFMaqCod_Sel ;
   private String AV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc ;
   private String AV63TFTipDefDsc ;
   private String AV126Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel ;
   private String AV64TFTipDefDsc_Sel ;
   private String AV127Reclamacionesynoconformidadeswcds_32_tfdsccausa ;
   private String AV65TFDscCausa ;
   private String AV128Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel ;
   private String AV66TFDscCausa_Sel ;
   private String AV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc ;
   private String AV67TFRps_Dsc ;
   private String AV130Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel ;
   private String AV68TFRps_Dsc_Sel ;
   private String AV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ;
   private String AV89TFHisTipArtDsc ;
   private String AV144Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel ;
   private String AV90TFHisTipArtDsc_Sel ;
   private String AV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ;
   private String AV91TFHisTipColDsc ;
   private String AV146Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel ;
   private String AV92TFHisTipColDsc_Sel ;
   private String scmdbuf ;
   private String lV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr ;
   private String lV101Reclamacionesynoconformidadeswcds_6_tfhisreolote ;
   private String lV103Reclamacionesynoconformidadeswcds_8_tfclinom ;
   private String lV105Reclamacionesynoconformidadeswcds_10_tfhisbarser ;
   private String lV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc ;
   private String lV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom ;
   private String lV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli ;
   private String lV115Reclamacionesynoconformidadeswcds_20_tfmaqcod ;
   private String lV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc ;
   private String lV127Reclamacionesynoconformidadeswcds_32_tfdsccausa ;
   private String lV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc ;
   private String lV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ;
   private String lV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ;
   private String A544HisCodPar ;
   private String AV81Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A569HisReoFec ;
   private java.util.Date AV98Reclamacionesynoconformidadeswcds_3_tfhisreofec ;
   private java.util.Date AV37TFHisReoFec ;
   private java.util.Date AV83HisreoFec ;
   private java.util.Date AV84HisreoFec_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n571HisTipArt ;
   private boolean n572HisTipCol ;
   private boolean n5085CodCausa ;
   private boolean n7000Rps_Cod ;
   private boolean n252CliCod ;
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
   private String AV35TFHisEstReo_SelsJson ;
   private String AV11Filename ;
   private String A5662HisAcCo ;
   private String A5693HisAcCot ;
   private String A5694HisAdEAcCo ;
   private String A5695HisAdEAcCt ;
   private String AV96Reclamacionesynoconformidadeswcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV135Reclamacionesynoconformidadeswcds_40_tfhisacco ;
   private String AV73TFHisAcCo ;
   private String AV136Reclamacionesynoconformidadeswcds_41_tfhisacco_sel ;
   private String AV74TFHisAcCo_Sel ;
   private String AV137Reclamacionesynoconformidadeswcds_42_tfhisaccot ;
   private String AV75TFHisAcCot ;
   private String AV138Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel ;
   private String AV76TFHisAcCot_Sel ;
   private String AV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco ;
   private String AV77TFHisAdEAcCo ;
   private String AV140Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel ;
   private String AV78TFHisAdEAcCo_Sel ;
   private String AV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct ;
   private String AV79TFHisAdEAcCt ;
   private String AV142Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel ;
   private String AV80TFHisAdEAcCt_Sel ;
   private String lV96Reclamacionesynoconformidadeswcds_1_filterfulltext ;
   private String lV135Reclamacionesynoconformidadeswcds_40_tfhisacco ;
   private String lV137Reclamacionesynoconformidadeswcds_42_tfhisaccot ;
   private String lV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco ;
   private String lV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct ;
   private String AV31NewLine ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV97Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels ;
   private GXSimpleCollection<Byte> AV36TFHisEstReo_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P08YQ2_A571HisTipArt ;
   private boolean[] P08YQ2_n571HisTipArt ;
   private byte[] P08YQ2_A572HisTipCol ;
   private boolean[] P08YQ2_n572HisTipCol ;
   private short[] P08YQ2_A833TipDefCod ;
   private short[] P08YQ2_A5085CodCausa ;
   private boolean[] P08YQ2_n5085CodCausa ;
   private short[] P08YQ2_A7000Rps_Cod ;
   private boolean[] P08YQ2_n7000Rps_Cod ;
   private int[] P08YQ2_A252CliCod ;
   private boolean[] P08YQ2_n252CliCod ;
   private String[] P08YQ2_A396EmprCod ;
   private String[] P08YQ2_A13844HisTipColD ;
   private boolean[] P08YQ2_n13844HisTipColD ;
   private String[] P08YQ2_A13843HisTipArtD ;
   private boolean[] P08YQ2_n13843HisTipArtD ;
   private String[] P08YQ2_A5695HisAdEAcCt ;
   private boolean[] P08YQ2_n5695HisAdEAcCt ;
   private String[] P08YQ2_A5694HisAdEAcCo ;
   private boolean[] P08YQ2_n5694HisAdEAcCo ;
   private String[] P08YQ2_A5693HisAcCot ;
   private boolean[] P08YQ2_n5693HisAcCot ;
   private String[] P08YQ2_A5662HisAcCo ;
   private boolean[] P08YQ2_n5662HisAcCo ;
   private int[] P08YQ2_A12949HisOpecod ;
   private boolean[] P08YQ2_n12949HisOpecod ;
   private int[] P08YQ2_A2297HisReoTn ;
   private boolean[] P08YQ2_n2297HisReoTn ;
   private String[] P08YQ2_A7001Rps_Dsc ;
   private boolean[] P08YQ2_n7001Rps_Dsc ;
   private String[] P08YQ2_A5086DscCausa ;
   private boolean[] P08YQ2_n5086DscCausa ;
   private String[] P08YQ2_A834TipDefDsc ;
   private boolean[] P08YQ2_n834TipDefDsc ;
   private java.math.BigDecimal[] P08YQ2_A541HisBarMtr ;
   private boolean[] P08YQ2_n541HisBarMtr ;
   private String[] P08YQ2_A602MaqCod ;
   private boolean[] P08YQ2_n602MaqCod ;
   private byte[] P08YQ2_A12950HisOpeTur ;
   private boolean[] P08YQ2_n12950HisOpeTur ;
   private String[] P08YQ2_A8889HisNomCli ;
   private boolean[] P08YQ2_n8889HisNomCli ;
   private String[] P08YQ2_A546HisColNom ;
   private boolean[] P08YQ2_n546HisColNom ;
   private String[] P08YQ2_A2299HisReoDsc ;
   private boolean[] P08YQ2_n2299HisReoDsc ;
   private String[] P08YQ2_A542HisBarSer ;
   private boolean[] P08YQ2_n542HisBarSer ;
   private String[] P08YQ2_A279CliNom ;
   private String[] P08YQ2_A13698HisreoLote ;
   private boolean[] P08YQ2_n13698HisreoLote ;
   private java.util.Date[] P08YQ2_A569HisReoFec ;
   private boolean[] P08YQ2_n569HisReoFec ;
   private byte[] P08YQ2_A548HisEstReo ;
   private boolean[] P08YQ2_n548HisEstReo ;
   private String[] P08YQ2_A544HisCodPar ;
   private byte[] P08YQ2_A545HisCodReo ;
   private int[] P08YQ2_A539HisBarCod ;
   private java.math.BigDecimal[] P08YQ2_A13699CostCausa ;
   private boolean[] P08YQ2_n13699CostCausa ;
   private java.math.BigDecimal[] P08YQ2_A540HisBarKgm ;
   private boolean[] P08YQ2_n540HisBarKgm ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class reclamacionesynoconformidadeswcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08YQ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A548HisEstReo ,
                                          GXSimpleCollection<Byte> AV97Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels ,
                                          String AV96Reclamacionesynoconformidadeswcds_1_filterfulltext ,
                                          int AV97Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels_size ,
                                          java.util.Date AV98Reclamacionesynoconformidadeswcds_3_tfhisreofec ,
                                          String AV100Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel ,
                                          String AV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr ,
                                          String AV102Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel ,
                                          String AV101Reclamacionesynoconformidadeswcds_6_tfhisreolote ,
                                          String AV104Reclamacionesynoconformidadeswcds_9_tfclinom_sel ,
                                          String AV103Reclamacionesynoconformidadeswcds_8_tfclinom ,
                                          String AV106Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel ,
                                          String AV105Reclamacionesynoconformidadeswcds_10_tfhisbarser ,
                                          String AV108Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel ,
                                          String AV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc ,
                                          String AV110Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel ,
                                          String AV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom ,
                                          String AV112Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel ,
                                          String AV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli ,
                                          byte AV113Reclamacionesynoconformidadeswcds_18_tfhisopetur ,
                                          byte AV114Reclamacionesynoconformidadeswcds_19_tfhisopetur_to ,
                                          String AV116Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel ,
                                          String AV115Reclamacionesynoconformidadeswcds_20_tfmaqcod ,
                                          java.math.BigDecimal AV117Reclamacionesynoconformidadeswcds_22_tfhisbarkgm ,
                                          java.math.BigDecimal AV118Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to ,
                                          java.math.BigDecimal AV119Reclamacionesynoconformidadeswcds_24_tfhisbarmtr ,
                                          java.math.BigDecimal AV120Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to ,
                                          java.math.BigDecimal AV121Reclamacionesynoconformidadeswcds_26_tfcostcausa ,
                                          java.math.BigDecimal AV122Reclamacionesynoconformidadeswcds_27_tfcostcausa_to ,
                                          java.math.BigDecimal AV123Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa ,
                                          java.math.BigDecimal AV124Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to ,
                                          String AV126Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel ,
                                          String AV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc ,
                                          String AV128Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel ,
                                          String AV127Reclamacionesynoconformidadeswcds_32_tfdsccausa ,
                                          String AV130Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel ,
                                          String AV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc ,
                                          int AV131Reclamacionesynoconformidadeswcds_36_tfhisreotn ,
                                          int AV132Reclamacionesynoconformidadeswcds_37_tfhisreotn_to ,
                                          int AV133Reclamacionesynoconformidadeswcds_38_tfhisopecod ,
                                          int AV134Reclamacionesynoconformidadeswcds_39_tfhisopecod_to ,
                                          String AV136Reclamacionesynoconformidadeswcds_41_tfhisacco_sel ,
                                          String AV135Reclamacionesynoconformidadeswcds_40_tfhisacco ,
                                          String AV138Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel ,
                                          String AV137Reclamacionesynoconformidadeswcds_42_tfhisaccot ,
                                          String AV140Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel ,
                                          String AV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco ,
                                          String AV142Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel ,
                                          String AV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct ,
                                          String AV144Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel ,
                                          String AV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc ,
                                          String AV146Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel ,
                                          String AV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc ,
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
                                          boolean AV29OrderedDsc ,
                                          int A252CliCod ,
                                          int AV82Clicod ,
                                          short AV86Clicod_to ,
                                          java.util.Date AV83HisreoFec ,
                                          java.util.Date AV84HisreoFec_to ,
                                          byte AV85HisEstReo ,
                                          String AV81Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[80];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.HisTipArt AS HisTipArt, T1.HisTipCol AS HisTipCol, T1.TipDefCod, T1.CodCausa, T1.Rps_Cod, T1.CliCod, T1.EmprCod, T4.TipColDsc AS HisTipColD, T3.TipArtDsc" ;
      scmdbuf += " AS HisTipArtD, T1.HisAdEAcCt, T1.HisAdEAcCo, T1.HisAcCot, T1.HisAcCo, T1.HisOpecod, T1.HisReoTn, T7.Rps_Dsc, T6.DscCausa, T5.TipDefDsc, T1.HisBarMtr, T1.MaqCod," ;
      scmdbuf += " T1.HisOpeTur, T1.HisNomCli, T1.HisColNom, T1.HisReoDsc, T1.HisBarSer, T2.CliNom, T1.HisreoLote, T1.HisReoFec, T1.HisEstReo, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod," ;
      scmdbuf += " T6.CostCausa, T1.HisBarKgm FROM ((((((TXPHISREO T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TipArtCod = T1.HisTipArt) LEFT JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.HisTipCol) INNER JOIN TXPTIPDEF T5 ON T5.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T5.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T6 ON T6.EmprCod = T1.EmprCod AND T6.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T7 ON T7.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T7.Rps_Cod = T1.Rps_Cod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      addWhere(sWhereString, "(T1.HisReoFec <= ?)");
      addWhere(sWhereString, "(T1.HisEstReo = ?)");
      if ( ! (GXutil.strcmp("", AV96Reclamacionesynoconformidadeswcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.HisEstReo,'90'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?)) or ( UPPER(T1.HisreoLote) like '%' || UPPER(?)) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.HisBarSer) like '%' || UPPER(?)) or ( UPPER(T1.HisReoDsc) like '%' || UPPER(?)) or ( UPPER(T1.HisColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisOpeTur,'90'), 2) like '%' || ?) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisBarKgm,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisBarMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T6.CostCausa,'9999990.999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2),'9999990.999'), 2) like '%' || ?) or ( UPPER(T5.TipDefDsc) like '%' || UPPER(?)) or ( UPPER(T6.DscCausa) like '%' || UPPER(?)) or ( UPPER(T7.Rps_Dsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisReoTn,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisOpecod,'999990'), 2) like '%' || ?) or ( UPPER(T1.HisAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAcCot) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCo) like '%' || UPPER(?)) or ( UPPER(T1.HisAdEAcCt) like '%' || UPPER(?)) or ( UPPER(T3.TipArtDsc) like '%' || UPPER(?)) or ( UPPER(T4.TipColDsc) like '%' || UPPER(?)))");
      }
      else
      {
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
         GXv_int6[25] = (byte)(1) ;
         GXv_int6[26] = (byte)(1) ;
         GXv_int6[27] = (byte)(1) ;
         GXv_int6[28] = (byte)(1) ;
         GXv_int6[29] = (byte)(1) ;
         GXv_int6[30] = (byte)(1) ;
      }
      if ( AV97Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Reclamacionesynoconformidadeswcds_2_tfhisestreo_sels, "T1.HisEstReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Reclamacionesynoconformidadeswcds_3_tfhisreofec)) )
      {
         addWhere(sWhereString, "(T1.HisReoFec >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel)==0) && ( ! (GXutil.strcmp("", AV99Reclamacionesynoconformidadeswcds_4_tfhisreohdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Reclamacionesynoconformidadeswcds_5_tfhisreohdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(T1.HisBarCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.HisCodReo,'90'), 2) || T1.HisCodPar = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel)==0) && ( ! (GXutil.strcmp("", AV101Reclamacionesynoconformidadeswcds_6_tfhisreolote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisreoLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Reclamacionesynoconformidadeswcds_7_tfhisreolote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisreoLote = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Reclamacionesynoconformidadeswcds_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV103Reclamacionesynoconformidadeswcds_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Reclamacionesynoconformidadeswcds_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel)==0) && ( ! (GXutil.strcmp("", AV105Reclamacionesynoconformidadeswcds_10_tfhisbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisBarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Reclamacionesynoconformidadeswcds_11_tfhisbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarSer = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel)==0) && ( ! (GXutil.strcmp("", AV107Reclamacionesynoconformidadeswcds_12_tfhisreodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisReoDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Reclamacionesynoconformidadeswcds_13_tfhisreodsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisReoDsc = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV109Reclamacionesynoconformidadeswcds_14_tfhiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Reclamacionesynoconformidadeswcds_15_tfhiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisColNom = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV111Reclamacionesynoconformidadeswcds_16_tfhisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Reclamacionesynoconformidadeswcds_17_tfhisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisNomCli = ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (0==AV113Reclamacionesynoconformidadeswcds_18_tfhisopetur) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur >= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (0==AV114Reclamacionesynoconformidadeswcds_19_tfhisopetur_to) )
      {
         addWhere(sWhereString, "(T1.HisOpeTur <= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV115Reclamacionesynoconformidadeswcds_20_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Reclamacionesynoconformidadeswcds_21_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Reclamacionesynoconformidadeswcds_22_tfhisbarkgm)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm >= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Reclamacionesynoconformidadeswcds_23_tfhisbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarKgm <= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Reclamacionesynoconformidadeswcds_24_tfhisbarmtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr >= ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Reclamacionesynoconformidadeswcds_25_tfhisbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisBarMtr <= ?)");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Reclamacionesynoconformidadeswcds_26_tfcostcausa)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa >= ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Reclamacionesynoconformidadeswcds_27_tfcostcausa_to)==0) )
      {
         addWhere(sWhereString, "(T6.CostCausa <= ?)");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Reclamacionesynoconformidadeswcds_28_tfhisreovalorcausa)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) >= ?)");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Reclamacionesynoconformidadeswcds_29_tfhisreovalorcausa_to)==0) )
      {
         addWhere(sWhereString, "(ROUND(T6.CostCausa * CAST(T1.HisBarKgm AS NUMERIC(21,10)), 2) <= ?)");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Reclamacionesynoconformidadeswcds_30_tftipdefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Reclamacionesynoconformidadeswcds_31_tftipdefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipDefDsc = ?)");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel)==0) && ( ! (GXutil.strcmp("", AV127Reclamacionesynoconformidadeswcds_32_tfdsccausa)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.DscCausa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Reclamacionesynoconformidadeswcds_33_tfdsccausa_sel)==0) )
      {
         addWhere(sWhereString, "(T6.DscCausa = ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV129Reclamacionesynoconformidadeswcds_34_tfrps_dsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T7.Rps_Dsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[62] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Reclamacionesynoconformidadeswcds_35_tfrps_dsc_sel)==0) )
      {
         addWhere(sWhereString, "(T7.Rps_Dsc = ?)");
      }
      else
      {
         GXv_int6[63] = (byte)(1) ;
      }
      if ( ! (0==AV131Reclamacionesynoconformidadeswcds_36_tfhisreotn) )
      {
         addWhere(sWhereString, "(T1.HisReoTn >= ?)");
      }
      else
      {
         GXv_int6[64] = (byte)(1) ;
      }
      if ( ! (0==AV132Reclamacionesynoconformidadeswcds_37_tfhisreotn_to) )
      {
         addWhere(sWhereString, "(T1.HisReoTn <= ?)");
      }
      else
      {
         GXv_int6[65] = (byte)(1) ;
      }
      if ( ! (0==AV133Reclamacionesynoconformidadeswcds_38_tfhisopecod) )
      {
         addWhere(sWhereString, "(T1.HisOpecod >= ?)");
      }
      else
      {
         GXv_int6[66] = (byte)(1) ;
      }
      if ( ! (0==AV134Reclamacionesynoconformidadeswcds_39_tfhisopecod_to) )
      {
         addWhere(sWhereString, "(T1.HisOpecod <= ?)");
      }
      else
      {
         GXv_int6[67] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Reclamacionesynoconformidadeswcds_41_tfhisacco_sel)==0) && ( ! (GXutil.strcmp("", AV135Reclamacionesynoconformidadeswcds_40_tfhisacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[68] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Reclamacionesynoconformidadeswcds_41_tfhisacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCo = ?)");
      }
      else
      {
         GXv_int6[69] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel)==0) && ( ! (GXutil.strcmp("", AV137Reclamacionesynoconformidadeswcds_42_tfhisaccot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAcCot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[70] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Reclamacionesynoconformidadeswcds_43_tfhisaccot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAcCot = ?)");
      }
      else
      {
         GXv_int6[71] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel)==0) && ( ! (GXutil.strcmp("", AV139Reclamacionesynoconformidadeswcds_44_tfhisadeacco)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[72] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Reclamacionesynoconformidadeswcds_45_tfhisadeacco_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCo = ?)");
      }
      else
      {
         GXv_int6[73] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV142Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel)==0) && ( ! (GXutil.strcmp("", AV141Reclamacionesynoconformidadeswcds_46_tfhisadeacct)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisAdEAcCt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[74] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV142Reclamacionesynoconformidadeswcds_47_tfhisadeacct_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisAdEAcCt = ?)");
      }
      else
      {
         GXv_int6[75] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV143Reclamacionesynoconformidadeswcds_48_tfhistipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[76] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Reclamacionesynoconformidadeswcds_49_tfhistipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int6[77] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV146Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV145Reclamacionesynoconformidadeswcds_50_tfhistipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[78] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV146Reclamacionesynoconformidadeswcds_51_tfhistipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[79] = (byte)(1) ;
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
                  return conditional_P08YQ2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , ((Number) dynConstraints[70]).intValue() , ((Number) dynConstraints[71]).intValue() , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Boolean) dynConstraints[80]).booleanValue() , ((Number) dynConstraints[81]).intValue() , ((Number) dynConstraints[82]).intValue() , ((Number) dynConstraints[83]).shortValue() , (java.util.Date)dynConstraints[84] , (java.util.Date)dynConstraints[85] , ((Number) dynConstraints[86]).byteValue() , (String)dynConstraints[87] , (String)dynConstraints[88] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08YQ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
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
                  stmt.setString(sIdx, (String)parms[80], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[82]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[102], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[103], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[104], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[105], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[106], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[107], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[108], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[109], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[110], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[111]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 20);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 30);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 30);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 16);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 16);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 26);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 26);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 13);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[126]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[127]).byteValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[128], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 6);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[134], 3);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[135], 3);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[136], 3);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[137], 3);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 30);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 60);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 60);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 40);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 40);
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[144]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[145]).intValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[146]).intValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[147]).intValue());
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[148], 3276);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[149], 3276);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[150], 2000);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[151], 2000);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[152], 2000);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[153], 2000);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[154], 2000);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[155], 2000);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[156], 30);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[157], 30);
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[158], 30);
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[159], 30);
               }
               return;
      }
   }

}

