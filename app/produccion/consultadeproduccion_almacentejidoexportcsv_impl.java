package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_almacentejidoexportcsv_impl extends GXWebProcedure
{
   public consultadeproduccion_almacentejidoexportcsv_impl( com.genexus.internet.HttpContext context )
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
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S181 ();
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
      S191 ();
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_AlmacenTejidoExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Pieza", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Recepcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs. Lanz.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts. Lanz.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Localizacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Doc. Entr.", "") : "") ;
      if ( AV67IsAuthorizedAlbRLote )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      }
      if ( AV68IsAuthorizedAlbRTelar )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fio", "") : "") ;
      }
      if ( AV69IsAuthorizedAlbRMdlCod )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Jogo", "") : "") ;
      }
      if ( AV70IsAuthorizedAlbRLu )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pgadas", "") : "") ;
      }
      if ( AV71IsAuthorizedAlbRTara )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "LFA", "") : "") ;
      }
      if ( AV72IsAuthorizedAlbMaqTej )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maq", "") : "") ;
      }
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = AV33TFBarPieCod ;
      AV84Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = AV34TFBarPieCod_Sel ;
      AV85Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod = AV35TFAlbRecCod ;
      AV86Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to = AV36TFAlbRecCod_To ;
      AV87Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = AV37TFBarKilLan ;
      AV88Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = AV38TFBarKilLan_To ;
      AV89Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = AV39TFBarMetLan ;
      AV90Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = AV40TFBarMetLan_To ;
      AV91Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = AV41TFBarPieKil ;
      AV92Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = AV42TFBarPieKil_To ;
      AV93Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = AV43TFBarPieMet ;
      AV94Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = AV44TFBarPieMet_To ;
      AV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = AV45TFBarPieLoc ;
      AV96Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = AV46TFBarPieLoc_Sel ;
      AV97Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest = AV47TFBarPieEst ;
      AV98Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to = AV48TFBarPieEst_To ;
      AV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = AV49TFAlbREnt ;
      AV100Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = AV50TFAlbREnt_Sel ;
      AV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = AV51TFAlbRLote ;
      AV102Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = AV52TFAlbRLote_Sel ;
      AV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = AV53TFAlbRTelar ;
      AV104Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = AV54TFAlbRTelar_Sel ;
      AV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = AV55TFAlbRMdlCod ;
      AV106Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = AV56TFAlbRMdlCod_Sel ;
      AV107Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = AV57TFAlbRLu ;
      AV108Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = AV58TFAlbRLu_To ;
      AV109Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = AV59TFAlbRTara ;
      AV110Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = AV60TFAlbRTara_To ;
      AV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = AV61TFAlbMaqTej ;
      AV112Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = AV62TFAlbMaqTej_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV84Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                           AV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                           Integer.valueOf(AV85Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) ,
                                           Integer.valueOf(AV86Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) ,
                                           AV87Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                           AV88Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                           AV89Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                           AV90Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                           AV91Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                           AV92Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                           AV93Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                           AV94Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                           AV96Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                           AV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                           Byte.valueOf(AV97Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) ,
                                           Byte.valueOf(AV98Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) ,
                                           AV100Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                           AV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                           AV102Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                           AV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                           AV104Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                           AV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                           AV106Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                           AV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                           AV107Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                           AV108Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                           AV109Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                           AV110Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                           AV112Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                           AV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                           A200BarPieCod ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A170BarKilLan ,
                                           A183BarMetLan ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           A2186BarPieLoc ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           A46AlbREnt ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A4602AlbRMdlCod ,
                                           A6465AlbRLu ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV63Emprcod ,
                                           Integer.valueOf(AV64Barcod) ,
                                           Byte.valueOf(AV65Barcodreo) ,
                                           AV66Barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod), 9, "%") ;
      lV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = GXutil.padr( GXutil.rtrim( AV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc), 10, "%") ;
      lV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = GXutil.padr( GXutil.rtrim( AV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent), 8, "%") ;
      lV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = GXutil.padr( GXutil.rtrim( AV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote), 20, "%") ;
      lV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar), 20, "%") ;
      lV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod), 13, "%") ;
      lV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej), 12, "%") ;
      /* Using cursor P09X32 */
      pr_default.execute(0, new Object[] {AV63Emprcod, Integer.valueOf(AV64Barcod), Byte.valueOf(AV65Barcodreo), AV66Barcodpar, lV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod, AV84Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel, Integer.valueOf(AV85Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod), Integer.valueOf(AV86Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to), AV87Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan, AV88Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to, AV89Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan, AV90Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to, AV91Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil, AV92Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to, AV93Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet, AV94Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to, lV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc, AV96Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel, Byte.valueOf(AV97Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest), Byte.valueOf(AV98Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to), lV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent, AV100Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel, lV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote, AV102Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel, lV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar, AV104Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel, lV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod, AV106Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel, AV107Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu, AV108Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to, AV109Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara, AV110Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to, lV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej, AV112Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P09X32_A130BarCodPar[0] ;
         A132BarCodReo = P09X32_A132BarCodReo[0] ;
         A129BarCod = P09X32_A129BarCod[0] ;
         A396EmprCod = P09X32_A396EmprCod[0] ;
         A8035AlbMaqTej = P09X32_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X32_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X32_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X32_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X32_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X32_A6463AlbRLote[0] ;
         A46AlbREnt = P09X32_A46AlbREnt[0] ;
         A201BarPieEst = P09X32_A201BarPieEst[0] ;
         A2186BarPieLoc = P09X32_A2186BarPieLoc[0] ;
         n2186BarPieLoc = P09X32_n2186BarPieLoc[0] ;
         A205BarPieMet = P09X32_A205BarPieMet[0] ;
         A203BarPieKil = P09X32_A203BarPieKil[0] ;
         A183BarMetLan = P09X32_A183BarMetLan[0] ;
         A170BarKilLan = P09X32_A170BarKilLan[0] ;
         A44AlbRecCod = P09X32_A44AlbRecCod[0] ;
         A200BarPieCod = P09X32_A200BarPieCod[0] ;
         A8035AlbMaqTej = P09X32_A8035AlbMaqTej[0] ;
         A6470AlbRTara = P09X32_A6470AlbRTara[0] ;
         A6465AlbRLu = P09X32_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = P09X32_A4602AlbRMdlCod[0] ;
         A6464AlbRTelar = P09X32_A6464AlbRTelar[0] ;
         A6463AlbRLote = P09X32_A6463AlbRLote[0] ;
         A46AlbREnt = P09X32_A46AlbREnt[0] ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A200BarPieCod, ";", ","), GXv_char3) ;
            consultadeproduccion_almacentejidoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A44AlbRecCod, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A170BarKilLan, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A183BarMetLan, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A203BarPieKil, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A205BarPieMet, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2186BarPieLoc, ";", ","), GXv_char3) ;
            consultadeproduccion_almacentejidoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A201BarPieEst, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A46AlbREnt, ";", ","), GXv_char3) ;
            consultadeproduccion_almacentejidoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6463AlbRLote, ";", ","), GXv_char3) ;
            consultadeproduccion_almacentejidoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6464AlbRTelar, ";", ","), GXv_char3) ;
            consultadeproduccion_almacentejidoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4602AlbRMdlCod, ";", ","), GXv_char3) ;
            consultadeproduccion_almacentejidoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A6465AlbRLu, 6, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A6470AlbRTara, 6, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A8035AlbMaqTej, ";", ","), GXv_char3) ;
            consultadeproduccion_almacentejidoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      AV67IsAuthorizedAlbRLote = (boolean)(((AV113Moda21.doubleValue()==1))) ;
      AV68IsAuthorizedAlbRTelar = (boolean)(((AV113Moda21.doubleValue()==1))) ;
      AV69IsAuthorizedAlbRMdlCod = (boolean)(((AV113Moda21.doubleValue()==1))) ;
      AV70IsAuthorizedAlbRLu = (boolean)(((AV113Moda21.doubleValue()==1))) ;
      AV71IsAuthorizedAlbRTara = (boolean)(((AV113Moda21.doubleValue()==1))) ;
      AV72IsAuthorizedAlbMaqTej = (boolean)(((AV113Moda21.doubleValue()==1))) ;
   }

   public void S191( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultadeProduccion_AlmacenTejidoExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieCod", "", "Nº Pieza", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarKilLan", "", "Kgs. Lanz.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarMetLan", "", "Mts. Lanz.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieKil", "", "Kgs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieMet", "", "Mts", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieLoc", "", "Localizacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieEst", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbREnt", "", "Nº Doc. Entr.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      if ( AV113Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRLote", "", "Lote", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      if ( AV113Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRTelar", "", "Fio", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      if ( AV113Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRMdlCod", "", "Jogo", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      if ( AV113Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRLu", "", "Pgadas", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      if ( AV113Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRTara", "", "LFA", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      if ( AV113Moda21.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbMaqTej", "", "Maq", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_AlmacenTejidoColumnsSelector", GXv_char3) ;
      consultadeproduccion_almacentejidoexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_AlmacenTejidoGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("Produccion.ConsultadeProduccion_AlmacenTejidoGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD") == 0 )
         {
            AV33TFBarPieCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD_SEL") == 0 )
         {
            AV34TFBarPieCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV35TFAlbRecCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFAlbRecCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKILLAN") == 0 )
         {
            AV37TFBarKilLan = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV38TFBarKilLan_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMETLAN") == 0 )
         {
            AV39TFBarMetLan = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV40TFBarMetLan_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV41TFBarPieKil = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFBarPieKil_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV43TFBarPieMet = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFBarPieMet_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIELOC") == 0 )
         {
            AV45TFBarPieLoc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIELOC_SEL") == 0 )
         {
            AV46TFBarPieLoc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEEST") == 0 )
         {
            AV47TFBarPieEst = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFBarPieEst_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV49TFAlbREnt = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV50TFAlbREnt_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV51TFAlbRLote = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV52TFAlbRLote_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR") == 0 )
         {
            AV53TFAlbRTelar = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR_SEL") == 0 )
         {
            AV54TFAlbRTelar_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD") == 0 )
         {
            AV55TFAlbRMdlCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD_SEL") == 0 )
         {
            AV56TFAlbRMdlCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLU") == 0 )
         {
            AV57TFAlbRLu = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFAlbRLu_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARA") == 0 )
         {
            AV59TFAlbRTara = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFAlbRTara_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ") == 0 )
         {
            AV61TFAlbMaqTej = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ_SEL") == 0 )
         {
            AV62TFAlbMaqTej_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV63Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV64Barcod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV65Barcodreo = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV66Barcodpar = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV73Clicod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV74CliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV75PedidoCliente = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV76Barser = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV77BarSerDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV78Barcolnom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV79Barcolnum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV114GXV1 = (int)(AV114GXV1+1) ;
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
      A200BarPieCod = "" ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A2186BarPieLoc = "" ;
      A46AlbREnt = "" ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A4602AlbRMdlCod = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A8035AlbMaqTej = "" ;
      AV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = "" ;
      AV33TFBarPieCod = "" ;
      AV84Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel = "" ;
      AV34TFBarPieCod_Sel = "" ;
      AV87Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan = DecimalUtil.ZERO ;
      AV37TFBarKilLan = DecimalUtil.ZERO ;
      AV88Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to = DecimalUtil.ZERO ;
      AV38TFBarKilLan_To = DecimalUtil.ZERO ;
      AV89Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan = DecimalUtil.ZERO ;
      AV39TFBarMetLan = DecimalUtil.ZERO ;
      AV90Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to = DecimalUtil.ZERO ;
      AV40TFBarMetLan_To = DecimalUtil.ZERO ;
      AV91Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil = DecimalUtil.ZERO ;
      AV41TFBarPieKil = DecimalUtil.ZERO ;
      AV92Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV42TFBarPieKil_To = DecimalUtil.ZERO ;
      AV93Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet = DecimalUtil.ZERO ;
      AV43TFBarPieMet = DecimalUtil.ZERO ;
      AV94Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to = DecimalUtil.ZERO ;
      AV44TFBarPieMet_To = DecimalUtil.ZERO ;
      AV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = "" ;
      AV45TFBarPieLoc = "" ;
      AV96Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel = "" ;
      AV46TFBarPieLoc_Sel = "" ;
      AV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = "" ;
      AV49TFAlbREnt = "" ;
      AV100Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel = "" ;
      AV50TFAlbREnt_Sel = "" ;
      AV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = "" ;
      AV51TFAlbRLote = "" ;
      AV102Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel = "" ;
      AV52TFAlbRLote_Sel = "" ;
      AV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = "" ;
      AV53TFAlbRTelar = "" ;
      AV104Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel = "" ;
      AV54TFAlbRTelar_Sel = "" ;
      AV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = "" ;
      AV55TFAlbRMdlCod = "" ;
      AV106Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel = "" ;
      AV56TFAlbRMdlCod_Sel = "" ;
      AV107Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu = DecimalUtil.ZERO ;
      AV57TFAlbRLu = DecimalUtil.ZERO ;
      AV108Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to = DecimalUtil.ZERO ;
      AV58TFAlbRLu_To = DecimalUtil.ZERO ;
      AV109Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara = DecimalUtil.ZERO ;
      AV59TFAlbRTara = DecimalUtil.ZERO ;
      AV110Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to = DecimalUtil.ZERO ;
      AV60TFAlbRTara_To = DecimalUtil.ZERO ;
      AV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = "" ;
      AV61TFAlbMaqTej = "" ;
      AV112Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel = "" ;
      AV62TFAlbMaqTej_Sel = "" ;
      scmdbuf = "" ;
      lV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod = "" ;
      lV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc = "" ;
      lV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent = "" ;
      lV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote = "" ;
      lV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar = "" ;
      lV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod = "" ;
      lV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej = "" ;
      AV63Emprcod = "" ;
      AV66Barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09X32_A130BarCodPar = new String[] {""} ;
      P09X32_A132BarCodReo = new byte[1] ;
      P09X32_A129BarCod = new int[1] ;
      P09X32_A396EmprCod = new String[] {""} ;
      P09X32_A8035AlbMaqTej = new String[] {""} ;
      P09X32_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X32_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X32_A4602AlbRMdlCod = new String[] {""} ;
      P09X32_A6464AlbRTelar = new String[] {""} ;
      P09X32_A6463AlbRLote = new String[] {""} ;
      P09X32_A46AlbREnt = new String[] {""} ;
      P09X32_A201BarPieEst = new byte[1] ;
      P09X32_A2186BarPieLoc = new String[] {""} ;
      P09X32_n2186BarPieLoc = new boolean[] {false} ;
      P09X32_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X32_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X32_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X32_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09X32_A44AlbRecCod = new int[1] ;
      P09X32_A200BarPieCod = new String[] {""} ;
      AV113Moda21 = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV74CliNom = "" ;
      AV75PedidoCliente = "" ;
      AV76Barser = "" ;
      AV77BarSerDsc = "" ;
      AV78Barcolnom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_almacentejidoexportcsv__default(),
         new Object[] {
             new Object[] {
            P09X32_A130BarCodPar, P09X32_A132BarCodReo, P09X32_A129BarCod, P09X32_A396EmprCod, P09X32_A8035AlbMaqTej, P09X32_A6470AlbRTara, P09X32_A6465AlbRLu, P09X32_A4602AlbRMdlCod, P09X32_A6464AlbRTelar, P09X32_A6463AlbRLote,
            P09X32_A46AlbREnt, P09X32_A201BarPieEst, P09X32_A2186BarPieLoc, P09X32_n2186BarPieLoc, P09X32_A205BarPieMet, P09X32_A203BarPieKil, P09X32_A183BarMetLan, P09X32_A170BarKilLan, P09X32_A44AlbRecCod, P09X32_A200BarPieCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A201BarPieEst ;
   private byte AV97Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ;
   private byte AV47TFBarPieEst ;
   private byte AV98Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ;
   private byte AV48TFBarPieEst_To ;
   private byte AV65Barcodreo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A44AlbRecCod ;
   private int AV85Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ;
   private int AV35TFAlbRecCod ;
   private int AV86Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ;
   private int AV36TFAlbRecCod_To ;
   private int AV64Barcod ;
   private int A129BarCod ;
   private int AV114GXV1 ;
   private int AV73Clicod ;
   private int AV79Barcolnum ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal AV87Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ;
   private java.math.BigDecimal AV37TFBarKilLan ;
   private java.math.BigDecimal AV88Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ;
   private java.math.BigDecimal AV38TFBarKilLan_To ;
   private java.math.BigDecimal AV89Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ;
   private java.math.BigDecimal AV39TFBarMetLan ;
   private java.math.BigDecimal AV90Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ;
   private java.math.BigDecimal AV40TFBarMetLan_To ;
   private java.math.BigDecimal AV91Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ;
   private java.math.BigDecimal AV41TFBarPieKil ;
   private java.math.BigDecimal AV92Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ;
   private java.math.BigDecimal AV42TFBarPieKil_To ;
   private java.math.BigDecimal AV93Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ;
   private java.math.BigDecimal AV43TFBarPieMet ;
   private java.math.BigDecimal AV94Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ;
   private java.math.BigDecimal AV44TFBarPieMet_To ;
   private java.math.BigDecimal AV107Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ;
   private java.math.BigDecimal AV57TFAlbRLu ;
   private java.math.BigDecimal AV108Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ;
   private java.math.BigDecimal AV58TFAlbRLu_To ;
   private java.math.BigDecimal AV109Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ;
   private java.math.BigDecimal AV59TFAlbRTara ;
   private java.math.BigDecimal AV110Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ;
   private java.math.BigDecimal AV60TFAlbRTara_To ;
   private java.math.BigDecimal AV113Moda21 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A200BarPieCod ;
   private String A2186BarPieLoc ;
   private String A46AlbREnt ;
   private String A6463AlbRLote ;
   private String A6464AlbRTelar ;
   private String A4602AlbRMdlCod ;
   private String A8035AlbMaqTej ;
   private String AV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ;
   private String AV33TFBarPieCod ;
   private String AV84Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ;
   private String AV34TFBarPieCod_Sel ;
   private String AV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ;
   private String AV45TFBarPieLoc ;
   private String AV96Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ;
   private String AV46TFBarPieLoc_Sel ;
   private String AV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ;
   private String AV49TFAlbREnt ;
   private String AV100Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ;
   private String AV50TFAlbREnt_Sel ;
   private String AV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ;
   private String AV51TFAlbRLote ;
   private String AV102Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ;
   private String AV52TFAlbRLote_Sel ;
   private String AV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ;
   private String AV53TFAlbRTelar ;
   private String AV104Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ;
   private String AV54TFAlbRTelar_Sel ;
   private String AV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ;
   private String AV55TFAlbRMdlCod ;
   private String AV106Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ;
   private String AV56TFAlbRMdlCod_Sel ;
   private String AV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ;
   private String AV61TFAlbMaqTej ;
   private String AV112Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ;
   private String AV62TFAlbMaqTej_Sel ;
   private String scmdbuf ;
   private String lV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ;
   private String lV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ;
   private String lV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ;
   private String lV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ;
   private String lV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ;
   private String lV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ;
   private String lV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ;
   private String AV63Emprcod ;
   private String AV66Barcodpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV74CliNom ;
   private String AV75PedidoCliente ;
   private String AV76Barser ;
   private String AV77BarSerDsc ;
   private String AV78Barcolnom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV67IsAuthorizedAlbRLote ;
   private boolean AV68IsAuthorizedAlbRTelar ;
   private boolean AV69IsAuthorizedAlbRMdlCod ;
   private boolean AV70IsAuthorizedAlbRLu ;
   private boolean AV71IsAuthorizedAlbRTara ;
   private boolean AV72IsAuthorizedAlbMaqTej ;
   private boolean AV29OrderedDsc ;
   private boolean n2186BarPieLoc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09X32_A130BarCodPar ;
   private byte[] P09X32_A132BarCodReo ;
   private int[] P09X32_A129BarCod ;
   private String[] P09X32_A396EmprCod ;
   private String[] P09X32_A8035AlbMaqTej ;
   private java.math.BigDecimal[] P09X32_A6470AlbRTara ;
   private java.math.BigDecimal[] P09X32_A6465AlbRLu ;
   private String[] P09X32_A4602AlbRMdlCod ;
   private String[] P09X32_A6464AlbRTelar ;
   private String[] P09X32_A6463AlbRLote ;
   private String[] P09X32_A46AlbREnt ;
   private byte[] P09X32_A201BarPieEst ;
   private String[] P09X32_A2186BarPieLoc ;
   private boolean[] P09X32_n2186BarPieLoc ;
   private java.math.BigDecimal[] P09X32_A205BarPieMet ;
   private java.math.BigDecimal[] P09X32_A203BarPieKil ;
   private java.math.BigDecimal[] P09X32_A183BarMetLan ;
   private java.math.BigDecimal[] P09X32_A170BarKilLan ;
   private int[] P09X32_A44AlbRecCod ;
   private String[] P09X32_A200BarPieCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class consultadeproduccion_almacentejidoexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09X32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV84Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel ,
                                          String AV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod ,
                                          int AV85Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod ,
                                          int AV86Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to ,
                                          java.math.BigDecimal AV87Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan ,
                                          java.math.BigDecimal AV88Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil ,
                                          java.math.BigDecimal AV92Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to ,
                                          java.math.BigDecimal AV93Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet ,
                                          java.math.BigDecimal AV94Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to ,
                                          String AV96Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel ,
                                          String AV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc ,
                                          byte AV97Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest ,
                                          byte AV98Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to ,
                                          String AV100Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel ,
                                          String AV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent ,
                                          String AV102Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel ,
                                          String AV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote ,
                                          String AV104Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel ,
                                          String AV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar ,
                                          String AV106Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel ,
                                          String AV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod ,
                                          java.math.BigDecimal AV107Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu ,
                                          java.math.BigDecimal AV108Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to ,
                                          java.math.BigDecimal AV109Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara ,
                                          java.math.BigDecimal AV110Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to ,
                                          String AV112Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel ,
                                          String AV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej ,
                                          String A200BarPieCod ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A170BarKilLan ,
                                          java.math.BigDecimal A183BarMetLan ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          String A2186BarPieLoc ,
                                          byte A201BarPieEst ,
                                          String A46AlbREnt ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV63Emprcod ,
                                          int AV64Barcod ,
                                          byte AV65Barcodreo ,
                                          String AV66Barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[34];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRLu, T2.AlbRMdlCod, T2.AlbRTelar, T2.AlbRLote, T2.AlbREnt, T1.BarPieEst," ;
      scmdbuf += " T1.BarPieLoc, T1.BarPieMet, T1.BarPieKil, T1.BarMetLan, T1.BarKilLan, T1.AlbRecCod, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV84Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_almacentejidods_1_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Produccion_consultadeproduccion_almacentejidods_2_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV85Produccion_consultadeproduccion_almacentejidods_3_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV86Produccion_consultadeproduccion_almacentejidods_4_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Produccion_consultadeproduccion_almacentejidods_5_tfbarkillan)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Produccion_consultadeproduccion_almacentejidods_6_tfbarkillan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKilLan <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_almacentejidods_7_tfbarmetlan)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_almacentejidods_8_tfbarmetlan_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMetLan <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_almacentejidods_9_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Produccion_consultadeproduccion_almacentejidods_10_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieKil <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Produccion_consultadeproduccion_almacentejidods_11_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Produccion_consultadeproduccion_almacentejidods_12_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieMet <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) && ( ! (GXutil.strcmp("", AV95Produccion_consultadeproduccion_almacentejidods_13_tfbarpieloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarPieLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Produccion_consultadeproduccion_almacentejidods_14_tfbarpieloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarPieLoc = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV97Produccion_consultadeproduccion_almacentejidods_15_tfbarpieest) )
      {
         addWhere(sWhereString, "(T1.BarPieEst >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV98Produccion_consultadeproduccion_almacentejidods_16_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(T1.BarPieEst <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV99Produccion_consultadeproduccion_almacentejidods_17_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Produccion_consultadeproduccion_almacentejidods_18_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV101Produccion_consultadeproduccion_almacentejidods_19_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_almacentejidods_20_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV103Produccion_consultadeproduccion_almacentejidods_21_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Produccion_consultadeproduccion_almacentejidods_22_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV105Produccion_consultadeproduccion_almacentejidods_23_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Produccion_consultadeproduccion_almacentejidods_24_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Produccion_consultadeproduccion_almacentejidods_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Produccion_consultadeproduccion_almacentejidods_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Produccion_consultadeproduccion_almacentejidods_27_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Produccion_consultadeproduccion_almacentejidods_28_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV111Produccion_consultadeproduccion_almacentejidods_29_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Produccion_consultadeproduccion_almacentejidods_30_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarKilLan" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarKilLan DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMetLan" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMetLan DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieKil" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieKil DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieMet" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieMet DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieLoc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieLoc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPieEst" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPieEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbREnt" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbREnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbRLote" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbRLote DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbRTelar" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbRTelar DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbRMdlCod" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbRMdlCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbRLu" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbRLu DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbRTara" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbRTara DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.AlbMaqTej" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.AlbMaqTej DESC" ;
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
                  return conditional_P09X32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).byteValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09X32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((String[]) buf[19])[0] = rslt.getString(19, 9);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 9);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 10);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               return;
      }
   }

}

