package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcconsultaalmacentejidoencrudoexportcsv_impl extends GXWebProcedure
{
   public wcconsultaalmacentejidoencrudoexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCConsultaAlmacenTejidoencrudoExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaAlmacenTejidoencrudoColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCConsultaAlmacenTejidoencrudoColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Recepcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rec?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Documento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Referencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disp. Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Localizacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Entradas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Utilizadas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disponibles", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Entradas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Utilizadas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disponibles", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Procedencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Composicion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Destino", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext = AV29FilterFullText ;
      AV100Wcconsultaalmacentejidoencrudods_2_tfalbreccod = AV34TFAlbRecCod ;
      AV101Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to = AV35TFAlbRecCod_To ;
      AV102Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = AV80TFAlbRReo_Sels ;
      AV103Wcconsultaalmacentejidoencrudods_5_tfalbrfen = AV37TFAlbRFen ;
      AV104Wcconsultaalmacentejidoencrudods_6_tfclicod = AV39TFCliCod ;
      AV105Wcconsultaalmacentejidoencrudods_7_tfclicod_to = AV40TFCliCod_To ;
      AV106Wcconsultaalmacentejidoencrudods_8_tfclinom = AV41TFCliNom ;
      AV107Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = AV42TFCliNom_Sel ;
      AV108Wcconsultaalmacentejidoencrudods_10_tfalbref = AV43TFAlbRef ;
      AV109Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = AV44TFAlbRef_Sel ;
      AV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = AV45TFAlbRefDsc ;
      AV111Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = AV46TFAlbRefDsc_Sel ;
      AV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = AV47TFAlbRDisCli ;
      AV113Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = AV48TFAlbRDisCli_Sel ;
      AV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = AV49TFAlbRTartD ;
      AV115Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = AV50TFAlbRTartD_Sel ;
      AV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote = AV51TFAlbRLote ;
      AV117Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = AV52TFAlbRLote_Sel ;
      AV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc = AV53TFAlbRLoc ;
      AV119Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = AV54TFAlbRLoc_Sel ;
      AV120Wcconsultaalmacentejidoencrudods_22_tfalbrpieent = AV55TFAlbRPieEnt ;
      AV121Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to = AV56TFAlbRPieEnt_To ;
      AV122Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti = AV57TFAlbRPieUti ;
      AV123Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to = AV58TFAlbRPieUti_To ;
      AV124Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis = AV59TFAlbRPieDis ;
      AV125Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to = AV60TFAlbRPieDis_To ;
      AV126Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = AV62TFAlbRUni_Sels ;
      AV127Wcconsultaalmacentejidoencrudods_29_tfalbrunient = AV63TFAlbRUniEnt ;
      AV128Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = AV64TFAlbRUniEnt_To ;
      AV129Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = AV65TFAlbRUniUti ;
      AV130Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = AV66TFAlbRUniUti_To ;
      AV131Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = AV67TFAlbRUniDis ;
      AV132Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = AV68TFAlbRUniDis_To ;
      AV133Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = AV78TFAlbREst_Sels ;
      AV134Wcconsultaalmacentejidoencrudods_36_tfprocenom = AV83TFProceNom ;
      AV135Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = AV84TFProceNom_Sel ;
      AV136Wcconsultaalmacentejidoencrudods_38_tfcomposicion = AV85TFComposicion ;
      AV137Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = AV86TFComposicion_Sel ;
      AV138Wcconsultaalmacentejidoencrudods_40_tftipentnom = AV92TFTipEntNom ;
      AV139Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = AV93TFTipEntNom_Sel ;
      AV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes = AV94TFAlbRDes ;
      AV141Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = AV95TFAlbRDes_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV102Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV126Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV133Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                           Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_2_tfalbreccod) ,
                                           Integer.valueOf(AV101Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) ,
                                           Integer.valueOf(AV102Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels.size()) ,
                                           AV103Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                           Integer.valueOf(AV104Wcconsultaalmacentejidoencrudods_6_tfclicod) ,
                                           Integer.valueOf(AV105Wcconsultaalmacentejidoencrudods_7_tfclicod_to) ,
                                           AV107Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                           AV106Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                           AV109Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                           AV108Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                           AV111Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                           AV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                           AV113Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                           AV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                           AV115Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                           AV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                           AV117Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                           AV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                           AV119Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                           AV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                           Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) ,
                                           Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) ,
                                           Integer.valueOf(AV122Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) ,
                                           Integer.valueOf(AV123Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV124Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) ,
                                           Integer.valueOf(AV125Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV126Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels.size()) ,
                                           AV127Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                           AV128Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                           AV129Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                           AV130Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                           AV131Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                           AV132Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                           Integer.valueOf(AV133Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels.size()) ,
                                           AV135Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                           AV134Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                           AV139Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                           AV138Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                           AV141Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                           AV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A3359AlbRDisCli ,
                                           A6264AlbRTartD ,
                                           A6463AlbRLote ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           A971ProceNom ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           Short.valueOf(AV36OrderedBy) ,
                                           Boolean.valueOf(AV28OrderedDsc) ,
                                           AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                           Integer.valueOf(A51AlbRPieDis) ,
                                           A57AlbRUniDis ,
                                           A13981Composicio ,
                                           AV137Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                           AV136Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                           AV74AlbRef ,
                                           AV89albref_to ,
                                           AV70Albrfen ,
                                           AV71Albrfen_to ,
                                           Integer.valueOf(AV72Clicod) ,
                                           Integer.valueOf(AV73Clicod_to) ,
                                           Short.valueOf(A970ProceCod) ,
                                           Short.valueOf(AV81Procecod) ,
                                           Short.valueOf(AV82ProceCod_to) ,
                                           AV75AlbRReo ,
                                           Byte.valueOf(AV76AlbREst) ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           Short.valueOf(AV90TipEntCod) ,
                                           AV91AlbRUni ,
                                           AV69Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV106Wcconsultaalmacentejidoencrudods_8_tfclinom = GXutil.padr( GXutil.rtrim( AV106Wcconsultaalmacentejidoencrudods_8_tfclinom), 30, "%") ;
      lV108Wcconsultaalmacentejidoencrudods_10_tfalbref = GXutil.padr( GXutil.rtrim( AV108Wcconsultaalmacentejidoencrudods_10_tfalbref), 16, "%") ;
      lV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc), 26, "%") ;
      lV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = GXutil.padr( GXutil.rtrim( AV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli), 20, "%") ;
      lV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd), 30, "%") ;
      lV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote = GXutil.padr( GXutil.rtrim( AV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote), 20, "%") ;
      lV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc = GXutil.padr( GXutil.rtrim( AV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc), 10, "%") ;
      lV134Wcconsultaalmacentejidoencrudods_36_tfprocenom = GXutil.padr( GXutil.rtrim( AV134Wcconsultaalmacentejidoencrudods_36_tfprocenom), 30, "%") ;
      lV138Wcconsultaalmacentejidoencrudods_40_tftipentnom = GXutil.padr( GXutil.rtrim( AV138Wcconsultaalmacentejidoencrudods_40_tftipentnom), 25, "%") ;
      lV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes = GXutil.padr( GXutil.rtrim( AV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes), 20, "%") ;
      /* Using cursor P08ZS2 */
      pr_default.execute(0, new Object[] {AV69Emprcod, AV74AlbRef, AV89albref_to, AV70Albrfen, AV71Albrfen_to, Integer.valueOf(AV72Clicod), Integer.valueOf(AV73Clicod_to), Short.valueOf(AV81Procecod), Short.valueOf(AV82ProceCod_to), Byte.valueOf(AV76AlbREst), Byte.valueOf(AV76AlbREst), Short.valueOf(AV90TipEntCod), Short.valueOf(AV90TipEntCod), AV91AlbRUni, Integer.valueOf(AV100Wcconsultaalmacentejidoencrudods_2_tfalbreccod), Integer.valueOf(AV101Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to), AV103Wcconsultaalmacentejidoencrudods_5_tfalbrfen, Integer.valueOf(AV104Wcconsultaalmacentejidoencrudods_6_tfclicod), Integer.valueOf(AV105Wcconsultaalmacentejidoencrudods_7_tfclicod_to), lV106Wcconsultaalmacentejidoencrudods_8_tfclinom, AV107Wcconsultaalmacentejidoencrudods_9_tfclinom_sel, lV108Wcconsultaalmacentejidoencrudods_10_tfalbref, AV109Wcconsultaalmacentejidoencrudods_11_tfalbref_sel, lV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc, AV111Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel, lV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli, AV113Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel, lV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd, AV115Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel, lV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote, AV117Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel, lV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc, AV119Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel, Integer.valueOf(AV120Wcconsultaalmacentejidoencrudods_22_tfalbrpieent), Integer.valueOf(AV121Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to), Integer.valueOf(AV122Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti), Integer.valueOf(AV123Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to), Integer.valueOf(AV124Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis), Integer.valueOf(AV125Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to), AV127Wcconsultaalmacentejidoencrudods_29_tfalbrunient, AV128Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to, AV129Wcconsultaalmacentejidoencrudods_31_tfalbruniuti, AV130Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to, AV131Wcconsultaalmacentejidoencrudods_33_tfalbrunidis, AV132Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to, lV134Wcconsultaalmacentejidoencrudods_36_tfprocenom, AV135Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel, lV138Wcconsultaalmacentejidoencrudods_40_tftipentnom, AV139Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel, lV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes, AV141Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6263AlbRTartC = P08ZS2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P08ZS2_n6263AlbRTartC[0] ;
         A1211TipEntCod = P08ZS2_A1211TipEntCod[0] ;
         n1211TipEntCod = P08ZS2_n1211TipEntCod[0] ;
         A970ProceCod = P08ZS2_A970ProceCod[0] ;
         n970ProceCod = P08ZS2_n970ProceCod[0] ;
         A1291AlbRDes = P08ZS2_A1291AlbRDes[0] ;
         A1212TipEntNom = P08ZS2_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZS2_n1212TipEntNom[0] ;
         A971ProceNom = P08ZS2_A971ProceNom[0] ;
         n971ProceNom = P08ZS2_n971ProceNom[0] ;
         A57AlbRUniDis = P08ZS2_A57AlbRUniDis[0] ;
         A51AlbRPieDis = P08ZS2_A51AlbRPieDis[0] ;
         A50AlbRLoc = P08ZS2_A50AlbRLoc[0] ;
         A6463AlbRLote = P08ZS2_A6463AlbRLote[0] ;
         A6264AlbRTartD = P08ZS2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZS2_n6264AlbRTartD[0] ;
         A3359AlbRDisCli = P08ZS2_A3359AlbRDisCli[0] ;
         A3613AlbRefDsc = P08ZS2_A3613AlbRefDsc[0] ;
         A279CliNom = P08ZS2_A279CliNom[0] ;
         A49AlbRFen = P08ZS2_A49AlbRFen[0] ;
         A44AlbRecCod = P08ZS2_A44AlbRecCod[0] ;
         A47AlbREst = P08ZS2_A47AlbREst[0] ;
         A56AlbRUni = P08ZS2_A56AlbRUni[0] ;
         A55AlbRReo = P08ZS2_A55AlbRReo[0] ;
         A46AlbREnt = P08ZS2_A46AlbREnt[0] ;
         A5806AlbREnt2 = P08ZS2_A5806AlbREnt2[0] ;
         A58AlbRUniEnt = P08ZS2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P08ZS2_A60AlbRUniUti[0] ;
         A52AlbRPieEnt = P08ZS2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P08ZS2_A54AlbRPieUti[0] ;
         A45AlbRef = P08ZS2_A45AlbRef[0] ;
         A252CliCod = P08ZS2_A252CliCod[0] ;
         A396EmprCod = P08ZS2_A396EmprCod[0] ;
         A279CliNom = P08ZS2_A279CliNom[0] ;
         A6264AlbRTartD = P08ZS2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P08ZS2_n6264AlbRTartD[0] ;
         A971ProceNom = P08ZS2_A971ProceNom[0] ;
         n971ProceNom = P08ZS2_n971ProceNom[0] ;
         A1212TipEntNom = P08ZS2_A1212TipEntNom[0] ;
         n1212TipEntNom = P08ZS2_n1212TipEntNom[0] ;
         if ( ( GXutil.strcmp(A55AlbRReo, AV75AlbRReo) == 0 ) || ( GXutil.strcmp(AV75AlbRReo, httpContext.getMessage( "T", "")) == 0 ) )
         {
            GXt_char2 = A13981Composicio ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char5[0] = A45AlbRef ;
            GXv_char6[0] = GXt_char2 ;
            new app.almacensindetalle.composicion(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5, GXv_char6) ;
            wcconsultaalmacentejidoencrudoexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
            wcconsultaalmacentejidoencrudoexportcsv_impl.this.A252CliCod = GXv_int4[0] ;
            wcconsultaalmacentejidoencrudoexportcsv_impl.this.A45AlbRef = GXv_char5[0] ;
            wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
            A13981Composicio = GXt_char2 ;
            if ( (GXutil.strcmp("", AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3359AlbRDisCli) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6463AlbRLote) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               if ( ! ( (GXutil.strcmp("", AV137Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) && ( ! (GXutil.strcmp("", AV136Wcconsultaalmacentejidoencrudods_38_tfcomposicion)==0) ) ) || ( GXutil.like( GXutil.upper( A13981Composicio) , GXutil.padr( "%" + GXutil.upper( AV136Wcconsultaalmacentejidoencrudods_38_tfcomposicion) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV137Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel)==0) || ( ( GXutil.strcmp(A13981Composicio, AV137Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel) == 0 ) ) )
                  {
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
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A44AlbRecCod, 8, 0) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "NO") == 0 )
                        {
                           AV14TextFileLine += httpContext.getMessage( "NO", "") ;
                        }
                        else if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "SI") == 0 )
                        {
                           AV14TextFileLine += httpContext.getMessage( "SI", "") ;
                        }
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += localUtil.dtoc( A49AlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV30AlbREnt2 = ((GXutil.strcmp("", A5806AlbREnt2)==0) ? A46AlbREnt : A5806AlbREnt2) ;
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30AlbREnt2, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A45AlbRef, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3613AlbRefDsc, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3359AlbRDisCli, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6264AlbRTartD, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6463AlbRLote, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A50AlbRLoc, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A52AlbRPieEnt, 6, 0) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A54AlbRPieUti, 6, 0) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A51AlbRPieDis, 6, 0) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "K") == 0 )
                        {
                           AV14TextFileLine += httpContext.getMessage( "K", "") ;
                        }
                        else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "M") == 0 )
                        {
                           AV14TextFileLine += httpContext.getMessage( "M", "") ;
                        }
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A58AlbRUniEnt, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A60AlbRUniUti, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A57AlbRUniDis, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        if ( A47AlbREst == 0 )
                        {
                           AV14TextFileLine += httpContext.getMessage( "Abierta", "") ;
                        }
                        else if ( A47AlbREst == 1 )
                        {
                           AV14TextFileLine += httpContext.getMessage( "Cerrada", "") ;
                        }
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A971ProceNom, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13981Composicio, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1212TipEntNom, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1291AlbRDes, ";", ","), GXv_char6) ;
                        wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
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
                        returnInSub = true;
                        if (true) return;
                     }
                     if ( GXutil.len( AV14TextFileLine) > 0 )
                     {
                        AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
                     }
                  }
               }
            }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCConsultaAlmacenTejidoencrudoExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRReo", "", "Rec?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRFen", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&AlbREnt2", "", "Nº Documento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Codigo", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRef", "", "Referencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRefDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRDisCli", "", "Disp. Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRTartD", "", "Tipo Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRLote", "", "Lote", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRLoc", "", "Localizacion", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRPieEnt", "Piezas", "Entradas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRPieUti", "Piezas", "Utilizadas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRPieDis", "Piezas", "Disponibles", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUni", "", "Und", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUniEnt", "Unidades", "Entradas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUniUti", "Unidades", "Utilizadas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRUniDis", "Unidades", "Disponibles", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbREst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "ProceNom", "", "Procedencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Composicion", "", "Composicion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "TipEntNom", "", "Tipo Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "AlbRDes", "", "Destino", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char6[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaAlmacenTejidoencrudoColumnsSelector", GXv_char6) ;
      wcconsultaalmacentejidoencrudoexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCConsultaAlmacenTejidoencrudoGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCConsultaAlmacenTejidoencrudoGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("WCConsultaAlmacenTejidoencrudoGridState"), null, null);
      }
      AV36OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV28OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV142GXV1 = 1 ;
      while ( AV142GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV142GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV29FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV34TFAlbRecCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFAlbRecCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV79TFAlbRReo_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV80TFAlbRReo_Sels.fromJSonString(AV79TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV37TFAlbRFen = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV39TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV41TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV42TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV43TFAlbRef = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV44TFAlbRef_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV45TFAlbRefDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV46TFAlbRefDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDISCLI") == 0 )
         {
            AV47TFAlbRDisCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDISCLI_SEL") == 0 )
         {
            AV48TFAlbRDisCli_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD") == 0 )
         {
            AV49TFAlbRTartD = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD_SEL") == 0 )
         {
            AV50TFAlbRTartD_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV51TFAlbRLote = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV52TFAlbRLote_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV53TFAlbRLoc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV54TFAlbRLoc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV55TFAlbRPieEnt = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFAlbRPieEnt_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV57TFAlbRPieUti = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFAlbRPieUti_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV59TFAlbRPieDis = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFAlbRPieDis_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV61TFAlbRUni_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV62TFAlbRUni_Sels.fromJSonString(AV61TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV63TFAlbRUniEnt = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFAlbRUniEnt_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV65TFAlbRUniUti = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV66TFAlbRUniUti_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV67TFAlbRUniDis = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV68TFAlbRUniDis_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREST_SEL") == 0 )
         {
            AV77TFAlbREst_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV78TFAlbREst_Sels.fromJSonString(AV77TFAlbREst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV83TFProceNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV84TFProceNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOMPOSICION") == 0 )
         {
            AV85TFComposicion = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOMPOSICION_SEL") == 0 )
         {
            AV86TFComposicion_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV92TFTipEntNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV93TFTipEntNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV94TFAlbRDes = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV95TFAlbRDes_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV69Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRFEN") == 0 )
         {
            AV70Albrfen = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRFEN_TO") == 0 )
         {
            AV71Albrfen_to = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV72Clicod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV73Clicod_to = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF") == 0 )
         {
            AV74AlbRef = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREF_TO") == 0 )
         {
            AV89albref_to = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECOD") == 0 )
         {
            AV81Procecod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROCECOD_TO") == 0 )
         {
            AV82ProceCod_to = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRREO") == 0 )
         {
            AV75AlbRReo = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBREST") == 0 )
         {
            AV76AlbREst = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPENTCOD") == 0 )
         {
            AV90TipEntCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBRUNI") == 0 )
         {
            AV91AlbRUni = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV142GXV1 = (int)(AV142GXV1+1) ;
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
      A55AlbRReo = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A5806AlbREnt2 = "" ;
      A46AlbREnt = "" ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A3359AlbRDisCli = "" ;
      A6264AlbRTartD = "" ;
      A6463AlbRLote = "" ;
      A50AlbRLoc = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A971ProceNom = "" ;
      A13981Composicio = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext = "" ;
      AV29FilterFullText = "" ;
      AV102Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV80TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV103Wcconsultaalmacentejidoencrudods_5_tfalbrfen = GXutil.nullDate() ;
      AV37TFAlbRFen = GXutil.nullDate() ;
      AV106Wcconsultaalmacentejidoencrudods_8_tfclinom = "" ;
      AV41TFCliNom = "" ;
      AV107Wcconsultaalmacentejidoencrudods_9_tfclinom_sel = "" ;
      AV42TFCliNom_Sel = "" ;
      AV108Wcconsultaalmacentejidoencrudods_10_tfalbref = "" ;
      AV43TFAlbRef = "" ;
      AV109Wcconsultaalmacentejidoencrudods_11_tfalbref_sel = "" ;
      AV44TFAlbRef_Sel = "" ;
      AV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = "" ;
      AV45TFAlbRefDsc = "" ;
      AV111Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel = "" ;
      AV46TFAlbRefDsc_Sel = "" ;
      AV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = "" ;
      AV47TFAlbRDisCli = "" ;
      AV113Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel = "" ;
      AV48TFAlbRDisCli_Sel = "" ;
      AV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = "" ;
      AV49TFAlbRTartD = "" ;
      AV115Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel = "" ;
      AV50TFAlbRTartD_Sel = "" ;
      AV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote = "" ;
      AV51TFAlbRLote = "" ;
      AV117Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel = "" ;
      AV52TFAlbRLote_Sel = "" ;
      AV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc = "" ;
      AV53TFAlbRLoc = "" ;
      AV119Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel = "" ;
      AV54TFAlbRLoc_Sel = "" ;
      AV126Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV127Wcconsultaalmacentejidoencrudods_29_tfalbrunient = DecimalUtil.ZERO ;
      AV63TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV128Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to = DecimalUtil.ZERO ;
      AV64TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV129Wcconsultaalmacentejidoencrudods_31_tfalbruniuti = DecimalUtil.ZERO ;
      AV65TFAlbRUniUti = DecimalUtil.ZERO ;
      AV130Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV66TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV131Wcconsultaalmacentejidoencrudods_33_tfalbrunidis = DecimalUtil.ZERO ;
      AV67TFAlbRUniDis = DecimalUtil.ZERO ;
      AV132Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV68TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV133Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV78TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV134Wcconsultaalmacentejidoencrudods_36_tfprocenom = "" ;
      AV83TFProceNom = "" ;
      AV135Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel = "" ;
      AV84TFProceNom_Sel = "" ;
      AV136Wcconsultaalmacentejidoencrudods_38_tfcomposicion = "" ;
      AV85TFComposicion = "" ;
      AV137Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel = "" ;
      AV86TFComposicion_Sel = "" ;
      AV138Wcconsultaalmacentejidoencrudods_40_tftipentnom = "" ;
      AV92TFTipEntNom = "" ;
      AV139Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel = "" ;
      AV93TFTipEntNom_Sel = "" ;
      AV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes = "" ;
      AV94TFAlbRDes = "" ;
      AV141Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel = "" ;
      AV95TFAlbRDes_Sel = "" ;
      lV99Wcconsultaalmacentejidoencrudods_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV106Wcconsultaalmacentejidoencrudods_8_tfclinom = "" ;
      lV108Wcconsultaalmacentejidoencrudods_10_tfalbref = "" ;
      lV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc = "" ;
      lV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli = "" ;
      lV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd = "" ;
      lV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote = "" ;
      lV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc = "" ;
      lV134Wcconsultaalmacentejidoencrudods_36_tfprocenom = "" ;
      lV138Wcconsultaalmacentejidoencrudods_40_tftipentnom = "" ;
      lV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes = "" ;
      AV74AlbRef = "" ;
      AV89albref_to = "" ;
      AV70Albrfen = GXutil.nullDate() ;
      AV71Albrfen_to = GXutil.nullDate() ;
      AV75AlbRReo = "" ;
      AV91AlbRUni = "" ;
      AV69Emprcod = "" ;
      A396EmprCod = "" ;
      P08ZS2_A6263AlbRTartC = new short[1] ;
      P08ZS2_n6263AlbRTartC = new boolean[] {false} ;
      P08ZS2_A1211TipEntCod = new short[1] ;
      P08ZS2_n1211TipEntCod = new boolean[] {false} ;
      P08ZS2_A970ProceCod = new short[1] ;
      P08ZS2_n970ProceCod = new boolean[] {false} ;
      P08ZS2_A1291AlbRDes = new String[] {""} ;
      P08ZS2_A1212TipEntNom = new String[] {""} ;
      P08ZS2_n1212TipEntNom = new boolean[] {false} ;
      P08ZS2_A971ProceNom = new String[] {""} ;
      P08ZS2_n971ProceNom = new boolean[] {false} ;
      P08ZS2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZS2_A51AlbRPieDis = new int[1] ;
      P08ZS2_A50AlbRLoc = new String[] {""} ;
      P08ZS2_A6463AlbRLote = new String[] {""} ;
      P08ZS2_A6264AlbRTartD = new String[] {""} ;
      P08ZS2_n6264AlbRTartD = new boolean[] {false} ;
      P08ZS2_A3359AlbRDisCli = new String[] {""} ;
      P08ZS2_A3613AlbRefDsc = new String[] {""} ;
      P08ZS2_A279CliNom = new String[] {""} ;
      P08ZS2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P08ZS2_A44AlbRecCod = new int[1] ;
      P08ZS2_A47AlbREst = new byte[1] ;
      P08ZS2_A56AlbRUni = new String[] {""} ;
      P08ZS2_A55AlbRReo = new String[] {""} ;
      P08ZS2_A46AlbREnt = new String[] {""} ;
      P08ZS2_A5806AlbREnt2 = new String[] {""} ;
      P08ZS2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZS2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08ZS2_A52AlbRPieEnt = new int[1] ;
      P08ZS2_A54AlbRPieUti = new int[1] ;
      P08ZS2_A45AlbRef = new String[] {""} ;
      P08ZS2_A252CliCod = new int[1] ;
      P08ZS2_A396EmprCod = new String[] {""} ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_char5 = new String[1] ;
      AV30AlbREnt2 = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV79TFAlbRReo_SelsJson = "" ;
      AV61TFAlbRUni_SelsJson = "" ;
      AV77TFAlbREst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultaalmacentejidoencrudoexportcsv__default(),
         new Object[] {
             new Object[] {
            P08ZS2_A6263AlbRTartC, P08ZS2_n6263AlbRTartC, P08ZS2_A1211TipEntCod, P08ZS2_n1211TipEntCod, P08ZS2_A970ProceCod, P08ZS2_n970ProceCod, P08ZS2_A1291AlbRDes, P08ZS2_A1212TipEntNom, P08ZS2_n1212TipEntNom, P08ZS2_A971ProceNom,
            P08ZS2_n971ProceNom, P08ZS2_A57AlbRUniDis, P08ZS2_A51AlbRPieDis, P08ZS2_A50AlbRLoc, P08ZS2_A6463AlbRLote, P08ZS2_A6264AlbRTartD, P08ZS2_n6264AlbRTartD, P08ZS2_A3359AlbRDisCli, P08ZS2_A3613AlbRefDsc, P08ZS2_A279CliNom,
            P08ZS2_A49AlbRFen, P08ZS2_A44AlbRecCod, P08ZS2_A47AlbREst, P08ZS2_A56AlbRUni, P08ZS2_A55AlbRReo, P08ZS2_A46AlbREnt, P08ZS2_A5806AlbREnt2, P08ZS2_A58AlbRUniEnt, P08ZS2_A60AlbRUniUti, P08ZS2_A52AlbRPieEnt,
            P08ZS2_A54AlbRPieUti, P08ZS2_A45AlbRef, P08ZS2_A252CliCod, P08ZS2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private byte AV76AlbREst ;
   private short gxcookieaux ;
   private short AV36OrderedBy ;
   private short A970ProceCod ;
   private short AV81Procecod ;
   private short AV82ProceCod_to ;
   private short A1211TipEntCod ;
   private short AV90TipEntCod ;
   private short A6263AlbRTartC ;
   private short Gx_err ;
   private int AV13Random ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV100Wcconsultaalmacentejidoencrudods_2_tfalbreccod ;
   private int AV34TFAlbRecCod ;
   private int AV101Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ;
   private int AV35TFAlbRecCod_To ;
   private int AV104Wcconsultaalmacentejidoencrudods_6_tfclicod ;
   private int AV39TFCliCod ;
   private int AV105Wcconsultaalmacentejidoencrudods_7_tfclicod_to ;
   private int AV40TFCliCod_To ;
   private int AV120Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ;
   private int AV55TFAlbRPieEnt ;
   private int AV121Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ;
   private int AV56TFAlbRPieEnt_To ;
   private int AV122Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ;
   private int AV57TFAlbRPieUti ;
   private int AV123Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ;
   private int AV58TFAlbRPieUti_To ;
   private int AV124Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ;
   private int AV59TFAlbRPieDis ;
   private int AV125Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ;
   private int AV60TFAlbRPieDis_To ;
   private int AV102Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ;
   private int AV126Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ;
   private int AV133Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ;
   private int AV72Clicod ;
   private int AV73Clicod_to ;
   private int GXv_int4[] ;
   private int AV142GXV1 ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_29_tfalbrunient ;
   private java.math.BigDecimal AV63TFAlbRUniEnt ;
   private java.math.BigDecimal AV128Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ;
   private java.math.BigDecimal AV64TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV129Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ;
   private java.math.BigDecimal AV65TFAlbRUniUti ;
   private java.math.BigDecimal AV130Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ;
   private java.math.BigDecimal AV66TFAlbRUniUti_To ;
   private java.math.BigDecimal AV131Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ;
   private java.math.BigDecimal AV67TFAlbRUniDis ;
   private java.math.BigDecimal AV132Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ;
   private java.math.BigDecimal AV68TFAlbRUniDis_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A55AlbRReo ;
   private String A5806AlbREnt2 ;
   private String A46AlbREnt ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A3359AlbRDisCli ;
   private String A6264AlbRTartD ;
   private String A6463AlbRLote ;
   private String A50AlbRLoc ;
   private String A56AlbRUni ;
   private String A971ProceNom ;
   private String A13981Composicio ;
   private String A1212TipEntNom ;
   private String A1291AlbRDes ;
   private String AV106Wcconsultaalmacentejidoencrudods_8_tfclinom ;
   private String AV41TFCliNom ;
   private String AV107Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ;
   private String AV42TFCliNom_Sel ;
   private String AV108Wcconsultaalmacentejidoencrudods_10_tfalbref ;
   private String AV43TFAlbRef ;
   private String AV109Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ;
   private String AV44TFAlbRef_Sel ;
   private String AV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ;
   private String AV45TFAlbRefDsc ;
   private String AV111Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ;
   private String AV46TFAlbRefDsc_Sel ;
   private String AV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ;
   private String AV47TFAlbRDisCli ;
   private String AV113Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ;
   private String AV48TFAlbRDisCli_Sel ;
   private String AV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ;
   private String AV49TFAlbRTartD ;
   private String AV115Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ;
   private String AV50TFAlbRTartD_Sel ;
   private String AV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote ;
   private String AV51TFAlbRLote ;
   private String AV117Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ;
   private String AV52TFAlbRLote_Sel ;
   private String AV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc ;
   private String AV53TFAlbRLoc ;
   private String AV119Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ;
   private String AV54TFAlbRLoc_Sel ;
   private String AV134Wcconsultaalmacentejidoencrudods_36_tfprocenom ;
   private String AV83TFProceNom ;
   private String AV135Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ;
   private String AV84TFProceNom_Sel ;
   private String AV136Wcconsultaalmacentejidoencrudods_38_tfcomposicion ;
   private String AV85TFComposicion ;
   private String AV137Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ;
   private String AV86TFComposicion_Sel ;
   private String AV138Wcconsultaalmacentejidoencrudods_40_tftipentnom ;
   private String AV92TFTipEntNom ;
   private String AV139Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ;
   private String AV93TFTipEntNom_Sel ;
   private String AV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes ;
   private String AV94TFAlbRDes ;
   private String AV141Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ;
   private String AV95TFAlbRDes_Sel ;
   private String scmdbuf ;
   private String lV106Wcconsultaalmacentejidoencrudods_8_tfclinom ;
   private String lV108Wcconsultaalmacentejidoencrudods_10_tfalbref ;
   private String lV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ;
   private String lV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ;
   private String lV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ;
   private String lV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote ;
   private String lV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc ;
   private String lV134Wcconsultaalmacentejidoencrudods_36_tfprocenom ;
   private String lV138Wcconsultaalmacentejidoencrudods_40_tftipentnom ;
   private String lV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes ;
   private String AV74AlbRef ;
   private String AV89albref_to ;
   private String AV75AlbRReo ;
   private String AV91AlbRUni ;
   private String AV69Emprcod ;
   private String A396EmprCod ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String AV30AlbREnt2 ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV103Wcconsultaalmacentejidoencrudods_5_tfalbrfen ;
   private java.util.Date AV37TFAlbRFen ;
   private java.util.Date AV70Albrfen ;
   private java.util.Date AV71Albrfen_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV28OrderedDsc ;
   private boolean n6263AlbRTartC ;
   private boolean n1211TipEntCod ;
   private boolean n970ProceCod ;
   private boolean n1212TipEntNom ;
   private boolean n971ProceNom ;
   private boolean n6264AlbRTartD ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV79TFAlbRReo_SelsJson ;
   private String AV61TFAlbRUni_SelsJson ;
   private String AV77TFAlbREst_SelsJson ;
   private String AV11Filename ;
   private String AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext ;
   private String AV29FilterFullText ;
   private String lV99Wcconsultaalmacentejidoencrudods_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV133Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ;
   private GXSimpleCollection<Byte> AV78TFAlbREst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P08ZS2_A6263AlbRTartC ;
   private boolean[] P08ZS2_n6263AlbRTartC ;
   private short[] P08ZS2_A1211TipEntCod ;
   private boolean[] P08ZS2_n1211TipEntCod ;
   private short[] P08ZS2_A970ProceCod ;
   private boolean[] P08ZS2_n970ProceCod ;
   private String[] P08ZS2_A1291AlbRDes ;
   private String[] P08ZS2_A1212TipEntNom ;
   private boolean[] P08ZS2_n1212TipEntNom ;
   private String[] P08ZS2_A971ProceNom ;
   private boolean[] P08ZS2_n971ProceNom ;
   private java.math.BigDecimal[] P08ZS2_A57AlbRUniDis ;
   private int[] P08ZS2_A51AlbRPieDis ;
   private String[] P08ZS2_A50AlbRLoc ;
   private String[] P08ZS2_A6463AlbRLote ;
   private String[] P08ZS2_A6264AlbRTartD ;
   private boolean[] P08ZS2_n6264AlbRTartD ;
   private String[] P08ZS2_A3359AlbRDisCli ;
   private String[] P08ZS2_A3613AlbRefDsc ;
   private String[] P08ZS2_A279CliNom ;
   private java.util.Date[] P08ZS2_A49AlbRFen ;
   private int[] P08ZS2_A44AlbRecCod ;
   private byte[] P08ZS2_A47AlbREst ;
   private String[] P08ZS2_A56AlbRUni ;
   private String[] P08ZS2_A55AlbRReo ;
   private String[] P08ZS2_A46AlbREnt ;
   private String[] P08ZS2_A5806AlbREnt2 ;
   private java.math.BigDecimal[] P08ZS2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P08ZS2_A60AlbRUniUti ;
   private int[] P08ZS2_A52AlbRPieEnt ;
   private int[] P08ZS2_A54AlbRPieUti ;
   private String[] P08ZS2_A45AlbRef ;
   private int[] P08ZS2_A252CliCod ;
   private String[] P08ZS2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV102Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV80TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV126Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ;
   private GXSimpleCollection<String> AV62TFAlbRUni_Sels ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class wcconsultaalmacentejidoencrudoexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08ZS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV102Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV126Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV133Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels ,
                                          int AV100Wcconsultaalmacentejidoencrudods_2_tfalbreccod ,
                                          int AV101Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to ,
                                          int AV102Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size ,
                                          java.util.Date AV103Wcconsultaalmacentejidoencrudods_5_tfalbrfen ,
                                          int AV104Wcconsultaalmacentejidoencrudods_6_tfclicod ,
                                          int AV105Wcconsultaalmacentejidoencrudods_7_tfclicod_to ,
                                          String AV107Wcconsultaalmacentejidoencrudods_9_tfclinom_sel ,
                                          String AV106Wcconsultaalmacentejidoencrudods_8_tfclinom ,
                                          String AV109Wcconsultaalmacentejidoencrudods_11_tfalbref_sel ,
                                          String AV108Wcconsultaalmacentejidoencrudods_10_tfalbref ,
                                          String AV111Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel ,
                                          String AV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc ,
                                          String AV113Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel ,
                                          String AV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli ,
                                          String AV115Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel ,
                                          String AV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd ,
                                          String AV117Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel ,
                                          String AV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote ,
                                          String AV119Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel ,
                                          String AV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc ,
                                          int AV120Wcconsultaalmacentejidoencrudods_22_tfalbrpieent ,
                                          int AV121Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to ,
                                          int AV122Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti ,
                                          int AV123Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to ,
                                          int AV124Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis ,
                                          int AV125Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to ,
                                          int AV126Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV127Wcconsultaalmacentejidoencrudods_29_tfalbrunient ,
                                          java.math.BigDecimal AV128Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to ,
                                          java.math.BigDecimal AV129Wcconsultaalmacentejidoencrudods_31_tfalbruniuti ,
                                          java.math.BigDecimal AV130Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to ,
                                          java.math.BigDecimal AV131Wcconsultaalmacentejidoencrudods_33_tfalbrunidis ,
                                          java.math.BigDecimal AV132Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to ,
                                          int AV133Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size ,
                                          String AV135Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel ,
                                          String AV134Wcconsultaalmacentejidoencrudods_36_tfprocenom ,
                                          String AV139Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel ,
                                          String AV138Wcconsultaalmacentejidoencrudods_40_tftipentnom ,
                                          String AV141Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel ,
                                          String AV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A3359AlbRDisCli ,
                                          String A6264AlbRTartD ,
                                          String A6463AlbRLote ,
                                          String A50AlbRLoc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          String A971ProceNom ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          short AV36OrderedBy ,
                                          boolean AV28OrderedDsc ,
                                          String AV99Wcconsultaalmacentejidoencrudods_1_filterfulltext ,
                                          int A51AlbRPieDis ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          String A13981Composicio ,
                                          String AV137Wcconsultaalmacentejidoencrudods_39_tfcomposicion_sel ,
                                          String AV136Wcconsultaalmacentejidoencrudods_38_tfcomposicion ,
                                          String AV74AlbRef ,
                                          String AV89albref_to ,
                                          java.util.Date AV70Albrfen ,
                                          java.util.Date AV71Albrfen_to ,
                                          int AV72Clicod ,
                                          int AV73Clicod_to ,
                                          short A970ProceCod ,
                                          short AV81Procecod ,
                                          short AV82ProceCod_to ,
                                          String AV75AlbRReo ,
                                          byte AV76AlbREst ,
                                          short A1211TipEntCod ,
                                          short AV90TipEntCod ,
                                          String AV91AlbRUni ,
                                          String AV69Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[51];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.AlbRTartC AS AlbRTartC, T1.TipEntCod, T1.ProceCod, T1.AlbRDes, T5.TipEntNom, T4.ProceNom, CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt" ;
      scmdbuf += " - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, T1.AlbRLoc, T1.AlbRLote, T3.TipArtDsc" ;
      scmdbuf += " AS AlbRTartD, T1.AlbRDisCli, T1.AlbRefDsc, T2.CliNom, T1.AlbRFen, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbREnt, T1.AlbREnt2, T1.AlbRUniEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRef, T1.CliCod, T1.EmprCod FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod)" ;
      scmdbuf += " LEFT JOIN TXPENTRAD T5 ON T5.EmprCod = T1.EmprCod AND T5.TipEntCod = T1.TipEntCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbRef >= ?)");
      addWhere(sWhereString, "(T1.AlbRef <= ?)");
      addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.ProceCod >= ?)");
      addWhere(sWhereString, "(T1.ProceCod <= ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      addWhere(sWhereString, "(T1.TipEntCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.AlbRUni = ?)");
      if ( ! (0==AV100Wcconsultaalmacentejidoencrudods_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV101Wcconsultaalmacentejidoencrudods_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( AV102Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV102Wcconsultaalmacentejidoencrudods_4_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV103Wcconsultaalmacentejidoencrudods_5_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (0==AV104Wcconsultaalmacentejidoencrudods_6_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (0==AV105Wcconsultaalmacentejidoencrudods_7_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV106Wcconsultaalmacentejidoencrudods_8_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Wcconsultaalmacentejidoencrudods_9_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV108Wcconsultaalmacentejidoencrudods_10_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Wcconsultaalmacentejidoencrudods_11_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV110Wcconsultaalmacentejidoencrudods_12_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Wcconsultaalmacentejidoencrudods_13_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) && ( ! (GXutil.strcmp("", AV112Wcconsultaalmacentejidoencrudods_14_tfalbrdiscli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDisCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Wcconsultaalmacentejidoencrudods_15_tfalbrdiscli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDisCli = ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV114Wcconsultaalmacentejidoencrudods_16_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Wcconsultaalmacentejidoencrudods_17_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV116Wcconsultaalmacentejidoencrudods_18_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Wcconsultaalmacentejidoencrudods_19_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLote = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV118Wcconsultaalmacentejidoencrudods_20_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Wcconsultaalmacentejidoencrudods_21_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV120Wcconsultaalmacentejidoencrudods_22_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (0==AV121Wcconsultaalmacentejidoencrudods_23_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (0==AV122Wcconsultaalmacentejidoencrudods_24_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (0==AV123Wcconsultaalmacentejidoencrudods_25_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (0==AV124Wcconsultaalmacentejidoencrudods_26_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (0==AV125Wcconsultaalmacentejidoencrudods_27_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( AV126Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV126Wcconsultaalmacentejidoencrudods_28_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcconsultaalmacentejidoencrudods_29_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Wcconsultaalmacentejidoencrudods_30_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Wcconsultaalmacentejidoencrudods_31_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Wcconsultaalmacentejidoencrudods_32_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Wcconsultaalmacentejidoencrudods_33_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Wcconsultaalmacentejidoencrudods_34_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( AV133Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV133Wcconsultaalmacentejidoencrudods_35_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV134Wcconsultaalmacentejidoencrudods_36_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Wcconsultaalmacentejidoencrudods_37_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV138Wcconsultaalmacentejidoencrudods_40_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Wcconsultaalmacentejidoencrudods_41_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipEntNom = ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV140Wcconsultaalmacentejidoencrudods_42_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Wcconsultaalmacentejidoencrudods_43_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV36OrderedBy == 1 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV36OrderedBy == 1 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV36OrderedBy == 2 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV36OrderedBy == 2 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV36OrderedBy == 3 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV36OrderedBy == 4 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV36OrderedBy == 5 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV36OrderedBy == 6 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV36OrderedBy == 7 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDisCli" ;
      }
      else if ( ( AV36OrderedBy == 8 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDisCli DESC" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV36OrderedBy == 9 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLote" ;
      }
      else if ( ( AV36OrderedBy == 10 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLote DESC" ;
      }
      else if ( ( AV36OrderedBy == 11 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV36OrderedBy == 11 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV36OrderedBy == 12 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV36OrderedBy == 12 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV36OrderedBy == 13 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV36OrderedBy == 13 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV36OrderedBy == 14 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV36OrderedBy == 14 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV36OrderedBy == 15 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV36OrderedBy == 15 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV36OrderedBy == 16 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV36OrderedBy == 16 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      else if ( ( AV36OrderedBy == 17 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV36OrderedBy == 17 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
      }
      else if ( ( AV36OrderedBy == 18 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProceNom" ;
      }
      else if ( ( AV36OrderedBy == 18 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProceNom DESC" ;
      }
      else if ( ( AV36OrderedBy == 19 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipEntNom" ;
      }
      else if ( ( AV36OrderedBy == 19 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipEntNom DESC" ;
      }
      else if ( ( AV36OrderedBy == 20 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV36OrderedBy == 20 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P08ZS2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.util.Date)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , ((Boolean) dynConstraints[64]).booleanValue() , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , ((Number) dynConstraints[75]).intValue() , ((Number) dynConstraints[76]).intValue() , ((Number) dynConstraints[77]).shortValue() , ((Number) dynConstraints[78]).shortValue() , ((Number) dynConstraints[79]).shortValue() , (String)dynConstraints[80] , ((Number) dynConstraints[81]).byteValue() , ((Number) dynConstraints[82]).shortValue() , ((Number) dynConstraints[83]).shortValue() , (String)dynConstraints[84] , (String)dynConstraints[85] , (String)dynConstraints[86] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08ZS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(4, 20);
               ((String[]) buf[7])[0] = rslt.getString(5, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 10);
               ((String[]) buf[14])[0] = rslt.getString(10, 20);
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((int[]) buf[21])[0] = rslt.getInt(16);
               ((byte[]) buf[22])[0] = rslt.getByte(17);
               ((String[]) buf[23])[0] = rslt.getString(18, 1);
               ((String[]) buf[24])[0] = rslt.getString(19, 2);
               ((String[]) buf[25])[0] = rslt.getString(20, 8);
               ((String[]) buf[26])[0] = rslt.getString(21, 20);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((int[]) buf[29])[0] = rslt.getInt(24);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               ((String[]) buf[31])[0] = rslt.getString(26, 16);
               ((int[]) buf[32])[0] = rslt.getInt(27);
               ((String[]) buf[33])[0] = rslt.getString(28, 3);
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
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[54]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 20);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 10);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 10);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[86]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[90], 2);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[93], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 25);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 25);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 20);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 20);
               }
               return;
      }
   }

}

