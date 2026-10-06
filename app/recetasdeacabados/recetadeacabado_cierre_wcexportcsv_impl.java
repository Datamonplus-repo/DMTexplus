package app.recetasdeacabados ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadeacabado_cierre_wcexportcsv_impl extends GXWebProcedure
{
   public recetadeacabado_cierre_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "RecetadeAcabado_Cierre_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Op", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Err", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Situacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "A?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "TC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cli.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Volumen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Alta", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Añad.", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = AV43TFBarNHdr ;
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = AV44TFBarNHdr_Sel ;
      AV175Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq = AV59TFRecLinMaq ;
      AV176Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to = AV60TFRecLinMaq_To ;
      AV177Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit = AV162TFBarSit ;
      AV178Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to = AV163TFBarSit_To ;
      AV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = AV45TFBarSer ;
      AV180Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = AV46TFBarSer_Sel ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = AV47TFBarSerDsc ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = AV48TFBarSerDsc_Sel ;
      AV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = AV49TFBarColNom ;
      AV184Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = AV50TFBarColNom_Sel ;
      AV185Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum = AV51TFBarColNum ;
      AV186Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to = AV52TFBarColNum_To ;
      AV187Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol = AV53TFBarTipCol ;
      AV188Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to = AV54TFBarTipCol_To ;
      AV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = AV55TFBarNomCli ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = AV56TFBarNomCli_Sel ;
      AV191Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli = AV57TFBarNumCli ;
      AV192Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to = AV58TFBarNumCli_To ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = AV61TFMaqCod ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = AV62TFMaqCod_Sel ;
      AV195Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd = AV63TFRecVolPrd ;
      AV196Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to = AV64TFRecVolPrd_To ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = AV164TFRecTotKgm ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = AV165TFRecTotKgm_To ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = AV166TFRecFecAlt ;
      AV200Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany = AV168TFBarNumAny ;
      AV201Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to = AV169TFBarNumAny_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV174Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                           AV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                           Short.valueOf(AV175Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) ,
                                           Short.valueOf(AV176Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) ,
                                           Byte.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) ,
                                           Byte.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) ,
                                           AV180Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                           AV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                           AV182Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                           AV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                           AV184Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                           AV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                           Integer.valueOf(AV185Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) ,
                                           Integer.valueOf(AV186Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) ,
                                           Byte.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) ,
                                           Byte.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) ,
                                           AV190Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                           AV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                           Integer.valueOf(AV191Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) ,
                                           Integer.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) ,
                                           AV194Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                           AV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                           Integer.valueOf(AV195Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) ,
                                           Integer.valueOf(AV196Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) ,
                                           AV199Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                           Short.valueOf(AV200Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) ,
                                           Short.valueOf(AV201Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) ,
                                           Integer.valueOf(AV156Barcod) ,
                                           Byte.valueOf(AV157Barcodreo) ,
                                           AV158Barcodpar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A602MaqCod ,
                                           Integer.valueOf(A2805RecVolPrd) ,
                                           A4866RecFecAlt ,
                                           Short.valueOf(A189BarNumAny) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV197Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                           A812RecTotKgm ,
                                           AV198Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                           A6039RecAcab ,
                                           AV160RecAcab ,
                                           AV155Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr), 11, "%") ;
      lV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = GXutil.padr( GXutil.rtrim( AV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser), 16, "%") ;
      lV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc), 26, "%") ;
      lV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom), 13, "%") ;
      lV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli), 13, "%") ;
      lV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = GXutil.padr( GXutil.rtrim( AV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod), 6, "%") ;
      /* Using cursor P09H15 */
      pr_default.execute(0, new Object[] {AV155Emprcod, AV197Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV197Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm, AV198Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV198Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to, AV160RecAcab, lV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr, AV174Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel, Short.valueOf(AV175Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq), Short.valueOf(AV176Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to), Byte.valueOf(AV177Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit), Byte.valueOf(AV178Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to), lV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser, AV180Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel, lV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc, AV182Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel, lV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom, AV184Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel, Integer.valueOf(AV185Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum), Integer.valueOf(AV186Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to), Byte.valueOf(AV187Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol), Byte.valueOf(AV188Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to), lV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli, AV190Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel, Integer.valueOf(AV191Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli), Integer.valueOf(AV192Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to), lV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod, AV194Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel, Integer.valueOf(AV195Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd), Integer.valueOf(AV196Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to), AV199Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt, Short.valueOf(AV200Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany), Short.valueOf(AV201Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to), Integer.valueOf(AV156Barcod), Byte.valueOf(AV157Barcodreo), AV158Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09H15_A396EmprCod[0] ;
         A6039RecAcab = P09H15_A6039RecAcab[0] ;
         n6039RecAcab = P09H15_n6039RecAcab[0] ;
         A189BarNumAny = P09H15_A189BarNumAny[0] ;
         A4866RecFecAlt = P09H15_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09H15_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09H15_A2805RecVolPrd[0] ;
         A602MaqCod = P09H15_A602MaqCod[0] ;
         A1235BarNumCli = P09H15_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H15_A1234BarNomCli[0] ;
         A218BarTipCol = P09H15_A218BarTipCol[0] ;
         A136BarColNum = P09H15_A136BarColNum[0] ;
         A135BarColNom = P09H15_A135BarColNom[0] ;
         A1652BarSerDsc = P09H15_A1652BarSerDsc[0] ;
         A212BarSer = P09H15_A212BarSer[0] ;
         A213BarSit = P09H15_A213BarSit[0] ;
         A2804RecLinMaq = P09H15_A2804RecLinMaq[0] ;
         A812RecTotKgm = P09H15_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H15_n812RecTotKgm[0] ;
         A130BarCodPar = P09H15_A130BarCodPar[0] ;
         A132BarCodReo = P09H15_A132BarCodReo[0] ;
         A129BarCod = P09H15_A129BarCod[0] ;
         A189BarNumAny = P09H15_A189BarNumAny[0] ;
         A1235BarNumCli = P09H15_A1235BarNumCli[0] ;
         A1234BarNomCli = P09H15_A1234BarNomCli[0] ;
         A218BarTipCol = P09H15_A218BarTipCol[0] ;
         A136BarColNum = P09H15_A136BarColNum[0] ;
         A135BarColNom = P09H15_A135BarColNom[0] ;
         A1652BarSerDsc = P09H15_A1652BarSerDsc[0] ;
         A212BarSer = P09H15_A212BarSer[0] ;
         A213BarSit = P09H15_A213BarSit[0] ;
         A812RecTotKgm = P09H15_A812RecTotKgm[0] ;
         n812RecTotKgm = P09H15_n812RecTotKgm[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV153Seleccionar = "N" ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV153Seleccionar, ";", ","), GXv_char3) ;
            recetadeacabado_cierre_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int4 = AV154incidencias ;
            GXv_int5[0] = GXt_int4 ;
            new app.puti016(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_int5) ;
            recetadeacabado_cierre_wcexportcsv_impl.this.GXt_int4 = GXv_int5[0] ;
            AV154incidencias = GXt_int4 ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV154incidencias, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            recetadeacabado_cierre_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2804RecLinMaq, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A213BarSit, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV161BarAgrEst = "N" ;
            /* Using cursor P09H16 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A6034Ac_Metros = P09H16_A6034Ac_Metros[0] ;
               n6034Ac_Metros = P09H16_n6034Ac_Metros[0] ;
               A6031Ac_Barcod = P09H16_A6031Ac_Barcod[0] ;
               A6032Ac_BarReo = P09H16_A6032Ac_BarReo[0] ;
               A6033Ac_BarPar = P09H16_A6033Ac_BarPar[0] ;
               AV161BarAgrEst = "S" ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV161BarAgrEst, ";", ","), GXv_char3) ;
            recetadeacabado_cierre_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
            recetadeacabado_cierre_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
            recetadeacabado_cierre_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char3) ;
            recetadeacabado_cierre_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A218BarTipCol, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char3) ;
            recetadeacabado_cierre_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1235BarNumCli, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char3) ;
            recetadeacabado_cierre_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2805RecVolPrd, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A812RecTotKgm, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.ttoc( A4866RecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A189BarNumAny, 3, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=RecetadeAcabado_Cierre_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&Seleccionar", "", "Op", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&incidencias", "", "Err", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNHdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecLinMaq", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSit", "", "Situacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&BarAgrEst", "", "A?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSerDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarTipCol", "", "TC", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNomCli", "", "Color Cli.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNumCli", "", "Numero ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCod", "", "Código Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecVolPrd", "", "Volumen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecTotKgm", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecFecAlt", "Fecha", "Alta", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNumAny", "", "Nº Añad.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "RecetasDeAcabados.RecetadeAcabado_Cierre_WCColumnsSelector", GXv_char3) ;
      recetadeacabado_cierre_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "RecetasDeAcabados.RecetadeAcabado_Cierre_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("RecetasDeAcabados.RecetadeAcabado_Cierre_WCGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV203GXV1 = 1 ;
      while ( AV203GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV203GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV43TFBarNHdr = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV44TFBarNHdr_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV59TFRecLinMaq = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFRecLinMaq_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV162TFBarSit = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV163TFBarSit_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV45TFBarSer = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV46TFBarSer_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV47TFBarSerDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV48TFBarSerDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV49TFBarColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV50TFBarColNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV51TFBarColNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFBarColNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV53TFBarTipCol = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFBarTipCol_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV55TFBarNomCli = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV56TFBarNomCli_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV57TFBarNumCli = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFBarNumCli_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV61TFMaqCod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV62TFMaqCod_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV63TFRecVolPrd = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFRecVolPrd_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECTOTKGM") == 0 )
         {
            AV164TFRecTotKgm = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV165TFRecTotKgm_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV166TFRecFecAlt = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANY") == 0 )
         {
            AV168TFBarNumAny = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV169TFBarNumAny_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV155Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV156Barcod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV157Barcodreo = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV158Barcodpar = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHACIERRE") == 0 )
         {
            AV159FechaCierre = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECACAB") == 0 )
         {
            AV160RecAcab = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A602MaqCod = "" ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = "" ;
      AV43TFBarNHdr = "" ;
      AV174Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel = "" ;
      AV44TFBarNHdr_Sel = "" ;
      AV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = "" ;
      AV45TFBarSer = "" ;
      AV180Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel = "" ;
      AV46TFBarSer_Sel = "" ;
      AV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = "" ;
      AV47TFBarSerDsc = "" ;
      AV182Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel = "" ;
      AV48TFBarSerDsc_Sel = "" ;
      AV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = "" ;
      AV49TFBarColNom = "" ;
      AV184Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel = "" ;
      AV50TFBarColNom_Sel = "" ;
      AV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = "" ;
      AV55TFBarNomCli = "" ;
      AV190Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel = "" ;
      AV56TFBarNomCli_Sel = "" ;
      AV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = "" ;
      AV61TFMaqCod = "" ;
      AV194Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel = "" ;
      AV62TFMaqCod_Sel = "" ;
      AV197Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm = DecimalUtil.ZERO ;
      AV164TFRecTotKgm = DecimalUtil.ZERO ;
      AV198Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to = DecimalUtil.ZERO ;
      AV165TFRecTotKgm_To = DecimalUtil.ZERO ;
      AV199Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      AV166TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      lV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr = "" ;
      lV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser = "" ;
      lV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc = "" ;
      lV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom = "" ;
      lV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli = "" ;
      lV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod = "" ;
      AV158Barcodpar = "" ;
      A6039RecAcab = "" ;
      AV160RecAcab = "" ;
      AV155Emprcod = "" ;
      P09H15_A396EmprCod = new String[] {""} ;
      P09H15_A6039RecAcab = new String[] {""} ;
      P09H15_n6039RecAcab = new boolean[] {false} ;
      P09H15_A189BarNumAny = new short[1] ;
      P09H15_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09H15_n4866RecFecAlt = new boolean[] {false} ;
      P09H15_A2805RecVolPrd = new int[1] ;
      P09H15_A602MaqCod = new String[] {""} ;
      P09H15_A1235BarNumCli = new int[1] ;
      P09H15_A1234BarNomCli = new String[] {""} ;
      P09H15_A218BarTipCol = new byte[1] ;
      P09H15_A136BarColNum = new int[1] ;
      P09H15_A135BarColNom = new String[] {""} ;
      P09H15_A1652BarSerDsc = new String[] {""} ;
      P09H15_A212BarSer = new String[] {""} ;
      P09H15_A213BarSit = new byte[1] ;
      P09H15_A2804RecLinMaq = new short[1] ;
      P09H15_A812RecTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H15_n812RecTotKgm = new boolean[] {false} ;
      P09H15_A130BarCodPar = new String[] {""} ;
      P09H15_A132BarCodReo = new byte[1] ;
      P09H15_A129BarCod = new int[1] ;
      AV153Seleccionar = "" ;
      GXv_int5 = new short[1] ;
      AV161BarAgrEst = "" ;
      P09H16_A396EmprCod = new String[] {""} ;
      P09H16_A129BarCod = new int[1] ;
      P09H16_A132BarCodReo = new byte[1] ;
      P09H16_A130BarCodPar = new String[] {""} ;
      P09H16_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H16_n6034Ac_Metros = new boolean[] {false} ;
      P09H16_A6031Ac_Barcod = new int[1] ;
      P09H16_A6032Ac_BarReo = new byte[1] ;
      P09H16_A6033Ac_BarPar = new String[] {""} ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A6033Ac_BarPar = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabados.recetadeacabado_cierre_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09H15_A396EmprCod, P09H15_A6039RecAcab, P09H15_n6039RecAcab, P09H15_A189BarNumAny, P09H15_A4866RecFecAlt, P09H15_n4866RecFecAlt, P09H15_A2805RecVolPrd, P09H15_A602MaqCod, P09H15_A1235BarNumCli, P09H15_A1234BarNomCli,
            P09H15_A218BarTipCol, P09H15_A136BarColNum, P09H15_A135BarColNom, P09H15_A1652BarSerDsc, P09H15_A212BarSer, P09H15_A213BarSit, P09H15_A2804RecLinMaq, P09H15_A812RecTotKgm, P09H15_n812RecTotKgm, P09H15_A130BarCodPar,
            P09H15_A132BarCodReo, P09H15_A129BarCod
            }
            , new Object[] {
            P09H16_A396EmprCod, P09H16_A129BarCod, P09H16_A132BarCodReo, P09H16_A130BarCodPar, P09H16_A6034Ac_Metros, P09H16_n6034Ac_Metros, P09H16_A6031Ac_Barcod, P09H16_A6032Ac_BarReo, P09H16_A6033Ac_BarPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV177Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ;
   private byte AV162TFBarSit ;
   private byte AV178Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ;
   private byte AV163TFBarSit_To ;
   private byte AV187Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ;
   private byte AV53TFBarTipCol ;
   private byte AV188Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ;
   private byte AV54TFBarTipCol_To ;
   private byte AV157Barcodreo ;
   private byte A6032Ac_BarReo ;
   private short gxcookieaux ;
   private short A2804RecLinMaq ;
   private short A189BarNumAny ;
   private short AV175Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ;
   private short AV59TFRecLinMaq ;
   private short AV176Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ;
   private short AV60TFRecLinMaq_To ;
   private short AV200Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ;
   private short AV168TFBarNumAny ;
   private short AV201Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ;
   private short AV169TFBarNumAny_To ;
   private short AV28OrderedBy ;
   private short AV154incidencias ;
   private short GXt_int4 ;
   private short GXv_int5[] ;
   private short AV159FechaCierre ;
   private short Gx_err ;
   private int AV13Random ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int AV185Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ;
   private int AV51TFBarColNum ;
   private int AV186Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ;
   private int AV52TFBarColNum_To ;
   private int AV191Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ;
   private int AV57TFBarNumCli ;
   private int AV192Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ;
   private int AV58TFBarNumCli_To ;
   private int AV195Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ;
   private int AV63TFRecVolPrd ;
   private int AV196Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ;
   private int AV64TFRecVolPrd_To ;
   private int AV156Barcod ;
   private int A6031Ac_Barcod ;
   private int AV203GXV1 ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV197Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ;
   private java.math.BigDecimal AV164TFRecTotKgm ;
   private java.math.BigDecimal AV198Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ;
   private java.math.BigDecimal AV165TFRecTotKgm_To ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A602MaqCod ;
   private String AV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ;
   private String AV43TFBarNHdr ;
   private String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ;
   private String AV44TFBarNHdr_Sel ;
   private String AV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ;
   private String AV45TFBarSer ;
   private String AV180Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ;
   private String AV46TFBarSer_Sel ;
   private String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ;
   private String AV47TFBarSerDsc ;
   private String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ;
   private String AV48TFBarSerDsc_Sel ;
   private String AV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ;
   private String AV49TFBarColNom ;
   private String AV184Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ;
   private String AV50TFBarColNom_Sel ;
   private String AV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ;
   private String AV55TFBarNomCli ;
   private String AV190Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ;
   private String AV56TFBarNomCli_Sel ;
   private String AV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ;
   private String AV61TFMaqCod ;
   private String AV194Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ;
   private String AV62TFMaqCod_Sel ;
   private String scmdbuf ;
   private String lV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ;
   private String lV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ;
   private String lV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ;
   private String lV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ;
   private String lV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ;
   private String lV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ;
   private String AV158Barcodpar ;
   private String A6039RecAcab ;
   private String AV160RecAcab ;
   private String AV155Emprcod ;
   private String AV153Seleccionar ;
   private String AV161BarAgrEst ;
   private String A6033Ac_BarPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV199Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ;
   private java.util.Date AV166TFRecFecAlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean n812RecTotKgm ;
   private boolean n6034Ac_Metros ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09H15_A396EmprCod ;
   private String[] P09H15_A6039RecAcab ;
   private boolean[] P09H15_n6039RecAcab ;
   private short[] P09H15_A189BarNumAny ;
   private java.util.Date[] P09H15_A4866RecFecAlt ;
   private boolean[] P09H15_n4866RecFecAlt ;
   private int[] P09H15_A2805RecVolPrd ;
   private String[] P09H15_A602MaqCod ;
   private int[] P09H15_A1235BarNumCli ;
   private String[] P09H15_A1234BarNomCli ;
   private byte[] P09H15_A218BarTipCol ;
   private int[] P09H15_A136BarColNum ;
   private String[] P09H15_A135BarColNom ;
   private String[] P09H15_A1652BarSerDsc ;
   private String[] P09H15_A212BarSer ;
   private byte[] P09H15_A213BarSit ;
   private short[] P09H15_A2804RecLinMaq ;
   private java.math.BigDecimal[] P09H15_A812RecTotKgm ;
   private boolean[] P09H15_n812RecTotKgm ;
   private String[] P09H15_A130BarCodPar ;
   private byte[] P09H15_A132BarCodReo ;
   private int[] P09H15_A129BarCod ;
   private String[] P09H16_A396EmprCod ;
   private int[] P09H16_A129BarCod ;
   private byte[] P09H16_A132BarCodReo ;
   private String[] P09H16_A130BarCodPar ;
   private java.math.BigDecimal[] P09H16_A6034Ac_Metros ;
   private boolean[] P09H16_n6034Ac_Metros ;
   private int[] P09H16_A6031Ac_Barcod ;
   private byte[] P09H16_A6032Ac_BarReo ;
   private String[] P09H16_A6033Ac_BarPar ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class recetadeacabado_cierre_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09H15( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV174Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel ,
                                          String AV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr ,
                                          short AV175Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq ,
                                          short AV176Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to ,
                                          byte AV177Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit ,
                                          byte AV178Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to ,
                                          String AV180Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel ,
                                          String AV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser ,
                                          String AV182Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel ,
                                          String AV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc ,
                                          String AV184Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel ,
                                          String AV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom ,
                                          int AV185Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum ,
                                          int AV186Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to ,
                                          byte AV187Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol ,
                                          byte AV188Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to ,
                                          String AV190Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel ,
                                          String AV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli ,
                                          int AV191Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli ,
                                          int AV192Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to ,
                                          String AV194Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel ,
                                          String AV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod ,
                                          int AV195Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd ,
                                          int AV196Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to ,
                                          java.util.Date AV199Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt ,
                                          short AV200Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany ,
                                          short AV201Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to ,
                                          int AV156Barcod ,
                                          byte AV157Barcodreo ,
                                          String AV158Barcodpar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A218BarTipCol ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A602MaqCod ,
                                          int A2805RecVolPrd ,
                                          java.util.Date A4866RecFecAlt ,
                                          short A189BarNumAny ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          java.math.BigDecimal AV197Recetasdeacabados_recetadeacabado_cierre_wcds_25_tfrectotkgm ,
                                          java.math.BigDecimal A812RecTotKgm ,
                                          java.math.BigDecimal AV198Recetasdeacabados_recetadeacabado_cierre_wcds_26_tfrectotkgm_to ,
                                          String A6039RecAcab ,
                                          String AV160RecAcab ,
                                          String AV155Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[36];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, T1.RecLinMaq, COALESCE( T3.RecTotKgm, 0) AS RecTotKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON" ;
      scmdbuf += " T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) INNER JOIN (SELECT CASE  WHEN COALESCE( T5.BarTotAgr," ;
      scmdbuf += " 0) <> 0 THEN COALESCE( T5.BarTotAgr, 0) + COALESCE( T6.BarKgm, 0) ELSE COALESCE( T6.BarKgm, 0) END AS RecTotKgm, T4.EmprCod, T4.BarCod, T4.BarCodReo, T4.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARCAD T4 LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T5 ON T5.EmprCod = T4.EmprCod AND T5.BarCod = T4.BarCod AND T5.BarCodReo = T4.BarCodReo AND T5.BarCodPar = T4.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T4.EmprCod AND T6.BarCod = T4.BarCod AND" ;
      scmdbuf += " T6.BarCodReo = T4.BarCodReo AND T6.BarCodPar = T4.BarCodPar) ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T3.RecTotKgm, 0) <= ?))");
      addWhere(sWhereString, "(T1.RecAcab = ?)");
      if ( (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV173Recetasdeacabados_recetadeacabado_cierre_wcds_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV174Recetasdeacabados_recetadeacabado_cierre_wcds_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV175Recetasdeacabados_recetadeacabado_cierre_wcds_3_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV176Recetasdeacabados_recetadeacabado_cierre_wcds_4_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (0==AV177Recetasdeacabados_recetadeacabado_cierre_wcds_5_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV178Recetasdeacabados_recetadeacabado_cierre_wcds_6_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV180Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV179Recetasdeacabados_recetadeacabado_cierre_wcds_7_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV180Recetasdeacabados_recetadeacabado_cierre_wcds_8_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV181Recetasdeacabados_recetadeacabado_cierre_wcds_9_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV182Recetasdeacabados_recetadeacabado_cierre_wcds_10_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV184Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV183Recetasdeacabados_recetadeacabado_cierre_wcds_11_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV184Recetasdeacabados_recetadeacabado_cierre_wcds_12_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV185Recetasdeacabados_recetadeacabado_cierre_wcds_13_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV186Recetasdeacabados_recetadeacabado_cierre_wcds_14_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV187Recetasdeacabados_recetadeacabado_cierre_wcds_15_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV188Recetasdeacabados_recetadeacabado_cierre_wcds_16_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV190Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV189Recetasdeacabados_recetadeacabado_cierre_wcds_17_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV190Recetasdeacabados_recetadeacabado_cierre_wcds_18_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV191Recetasdeacabados_recetadeacabado_cierre_wcds_19_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV192Recetasdeacabados_recetadeacabado_cierre_wcds_20_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV194Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV193Recetasdeacabados_recetadeacabado_cierre_wcds_21_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV194Recetasdeacabados_recetadeacabado_cierre_wcds_22_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV195Recetasdeacabados_recetadeacabado_cierre_wcds_23_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (0==AV196Recetasdeacabados_recetadeacabado_cierre_wcds_24_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV199Recetasdeacabados_recetadeacabado_cierre_wcds_27_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV200Recetasdeacabados_recetadeacabado_cierre_wcds_28_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV201Recetasdeacabados_recetadeacabado_cierre_wcds_29_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV156Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV157Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNumCli" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNumCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNumAny" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNumAny DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09H15(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Boolean) dynConstraints[47]).booleanValue() , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (java.math.BigDecimal)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09H15", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09H16", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Metros, Ac_Barcod, Ac_BarReo, Ac_BarPar FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 26);
               ((String[]) buf[14])[0] = rslt.getString(13, 16);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
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
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
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
                  stmt.setDateTime(sIdx, (java.util.Date)parms[66], false);
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
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

