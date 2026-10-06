package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte_cierre2_wcexportcsv_impl extends GXWebProcedure
{
   public recetadetinte_cierre2_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "RecetadeTinte_Cierre2_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Cierre2_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.RecetadeTinte_Cierre2_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Op", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "P?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ad?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Any?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Err", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "St.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "A?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "TC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cli.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Volumen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Alta", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Añad.", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = AV36FilterFullText ;
      AV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = AV42TFBarNHdr ;
      AV86Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = AV43TFBarNHdr_Sel ;
      AV87Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq = AV44TFRecLinMaq ;
      AV88Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to = AV45TFRecLinMaq_To ;
      AV89Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit = AV46TFBarSit ;
      AV90Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to = AV47TFBarSit_To ;
      AV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = AV48TFBarSer ;
      AV92Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = AV49TFBarSer_Sel ;
      AV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = AV50TFBarSerDsc ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = AV52TFBarColNom ;
      AV96Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV97Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum = AV54TFBarColNum ;
      AV98Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to = AV55TFBarColNum_To ;
      AV99Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol = AV56TFBarTipCol ;
      AV100Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to = AV57TFBarTipCol_To ;
      AV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = AV58TFBarNomCli ;
      AV102Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = AV59TFBarNomCli_Sel ;
      AV103Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli = AV60TFBarNumCli ;
      AV104Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to = AV61TFBarNumCli_To ;
      AV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = AV62TFMaqCod ;
      AV106Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = AV63TFMaqCod_Sel ;
      AV107Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd = AV64TFRecVolPrd ;
      AV108Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to = AV65TFRecVolPrd_To ;
      AV109Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = AV68TFRecFecAlt ;
      AV110Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany = AV70TFBarNumAny ;
      AV111Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to = AV71TFBarNumAny_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV86Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                           AV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                           Short.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) ,
                                           Short.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) ,
                                           Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) ,
                                           Byte.valueOf(AV90Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) ,
                                           AV92Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                           AV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                           AV94Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                           AV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                           AV96Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                           AV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV98Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) ,
                                           Byte.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) ,
                                           Byte.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) ,
                                           AV102Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                           AV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                           Integer.valueOf(AV103Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) ,
                                           Integer.valueOf(AV104Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) ,
                                           AV106Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                           AV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                           Integer.valueOf(AV107Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) ,
                                           Integer.valueOf(AV108Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) ,
                                           AV109Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                           Short.valueOf(AV110Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) ,
                                           Short.valueOf(AV111Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) ,
                                           Integer.valueOf(AV29Barcod) ,
                                           Byte.valueOf(AV30Barcodreo) ,
                                           AV31Barcodpar ,
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
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV35OrderedDsc) ,
                                           AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                           A14372RecHayAny ,
                                           A13696BarNHdr ,
                                           A6039RecAcab ,
                                           Byte.valueOf(A4700RecEnvio) ,
                                           AV28Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr), 11, "%") ;
      lV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser), 16, "%") ;
      lV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc), 26, "%") ;
      lV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom), 13, "%") ;
      lV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli), 13, "%") ;
      lV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = GXutil.padr( GXutil.rtrim( AV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod), 6, "%") ;
      /* Using cursor P09HI2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, lV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr, AV86Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel, Short.valueOf(AV87Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq), Short.valueOf(AV88Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to), Byte.valueOf(AV89Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit), Byte.valueOf(AV90Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to), lV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser, AV92Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel, lV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc, AV94Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel, lV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom, AV96Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV97Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum), Integer.valueOf(AV98Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to), Byte.valueOf(AV99Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol), Byte.valueOf(AV100Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to), lV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli, AV102Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel, Integer.valueOf(AV103Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli), Integer.valueOf(AV104Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to), lV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod, AV106Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel, Integer.valueOf(AV107Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd), Integer.valueOf(AV108Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to), AV109Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt, Short.valueOf(AV110Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany), Short.valueOf(AV111Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to), Integer.valueOf(AV29Barcod), Byte.valueOf(AV30Barcodreo), AV31Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4700RecEnvio = P09HI2_A4700RecEnvio[0] ;
         A6039RecAcab = P09HI2_A6039RecAcab[0] ;
         n6039RecAcab = P09HI2_n6039RecAcab[0] ;
         A189BarNumAny = P09HI2_A189BarNumAny[0] ;
         A4866RecFecAlt = P09HI2_A4866RecFecAlt[0] ;
         n4866RecFecAlt = P09HI2_n4866RecFecAlt[0] ;
         A2805RecVolPrd = P09HI2_A2805RecVolPrd[0] ;
         A602MaqCod = P09HI2_A602MaqCod[0] ;
         A1235BarNumCli = P09HI2_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HI2_A1234BarNomCli[0] ;
         A218BarTipCol = P09HI2_A218BarTipCol[0] ;
         A136BarColNum = P09HI2_A136BarColNum[0] ;
         A135BarColNom = P09HI2_A135BarColNom[0] ;
         A1652BarSerDsc = P09HI2_A1652BarSerDsc[0] ;
         A212BarSer = P09HI2_A212BarSer[0] ;
         A213BarSit = P09HI2_A213BarSit[0] ;
         A13696BarNHdr = P09HI2_A13696BarNHdr[0] ;
         A120BarAgrEst = P09HI2_A120BarAgrEst[0] ;
         A2804RecLinMaq = P09HI2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09HI2_A130BarCodPar[0] ;
         A132BarCodReo = P09HI2_A132BarCodReo[0] ;
         A129BarCod = P09HI2_A129BarCod[0] ;
         A396EmprCod = P09HI2_A396EmprCod[0] ;
         A189BarNumAny = P09HI2_A189BarNumAny[0] ;
         A1235BarNumCli = P09HI2_A1235BarNumCli[0] ;
         A1234BarNomCli = P09HI2_A1234BarNomCli[0] ;
         A218BarTipCol = P09HI2_A218BarTipCol[0] ;
         A136BarColNum = P09HI2_A136BarColNum[0] ;
         A135BarColNom = P09HI2_A135BarColNom[0] ;
         A1652BarSerDsc = P09HI2_A1652BarSerDsc[0] ;
         A212BarSer = P09HI2_A212BarSer[0] ;
         A213BarSit = P09HI2_A213BarSit[0] ;
         A13696BarNHdr = P09HI2_A13696BarNHdr[0] ;
         A120BarAgrEst = P09HI2_A120BarAgrEst[0] ;
         GXt_char2 = A14372RecHayAny ;
         GXv_char3[0] = GXt_char2 ;
         new app.formulaciontinte.hayanyadidas(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, GXv_char3) ;
         recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         A14372RecHayAny = GXt_char2 ;
         if ( (GXutil.strcmp("", AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A14372RecHayAny) , GXutil.padr( "%" + GXutil.upper( AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2804RecLinMaq, 4, 0) , GXutil.padr( "%" + AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A218BarTipCol, 2, 0) , GXutil.padr( "%" + AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2805RecVolPrd, 5, 0) , GXutil.padr( "%" + AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A189BarNumAny, 3, 0) , GXutil.padr( "%" + AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
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
               AV14TextFileLine += GXutil.booltostr( AV37Seleccionar) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV72Pesado, ";", ","), GXv_char3) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV73Adicion = "N" ;
               AV73Adicion = ((A189BarNumAny>0) ? "S" : AV73Adicion) ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV73Adicion, ";", ","), GXv_char3) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14372RecHayAny, ";", ","), GXv_char3) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               GXt_int4 = AV112Contval ;
               GXv_char3[0] = AV28Emprcod ;
               GXv_char5[0] = "011100" ;
               GXv_int6[0] = GXt_int4 ;
               new app.pbuscou(remoteHandle, context).execute( GXv_char3, GXv_char5, GXv_int6) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.AV28Emprcod = GXv_char3[0] ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_int4 = GXv_int6[0] ;
               AV112Contval = GXt_int4 ;
               AV113Consumos = ((AV112Contval==1) ? DecimalUtil.doubleToDec(1) : DecimalUtil.doubleToDec(0)) ;
               AV74incidencias = (byte)(0) ;
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( AV74incidencias, 1, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char5[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char5) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A2804RecLinMaq, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A213BarSit, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV38BarAgrEst = A120BarAgrEst ;
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char5[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV38BarAgrEst, ";", ","), GXv_char5) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char5[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char5) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char5[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char5) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char5[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char5) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A218BarTipCol, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char5[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char5) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A1235BarNumCli, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char5[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char5) ;
               recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A2805RecVolPrd, 5, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A4866RecFecAlt, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
               returnInSub = true;
               if (true) return;
            }
            if ( GXutil.len( AV14TextFileLine) > 0 )
            {
               AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=RecetadeTinte_Cierre2_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Seleccionar", "", "Op", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Pesado", "", "P?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Adicion", "", "Ad?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecHayAny", "", "Any?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&incidencias", "", "Err", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNHdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecLinMaq", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSit", "", "St.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarAgrEst", "", "A?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSerDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarTipCol", "", "TC", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNomCli", "", "Color Cli.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNumCli", "", "Numero ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "MaqCod", "", "Código Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecVolPrd", "", "Volumen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecFecAlt", "Fecha", "Alta", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNumAny", "", "Nº Añad.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Cierre2_WCColumnsSelector", GXv_char5) ;
      recetadetinte_cierre2_wcexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Cierre2_WCGridState"), "") == 0 )
      {
         AV40GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.RecetadeTinte_Cierre2_WCGridState"), null, null);
      }
      else
      {
         AV40GridState.fromxml(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Cierre2_WCGridState"), null, null);
      }
      AV34OrderedBy = AV40GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV35OrderedDsc = AV40GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV40GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV41GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV40GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV42TFBarNHdr = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV43TFBarNHdr_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAQ") == 0 )
         {
            AV44TFRecLinMaq = (short)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFRecLinMaq_To = (short)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV46TFBarSit = (byte)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFBarSit_To = (byte)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV48TFBarSer = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV49TFBarSer_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV50TFBarSerDsc = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV51TFBarSerDsc_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV52TFBarColNom = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV53TFBarColNom_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV54TFBarColNum = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFBarColNum_To = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV56TFBarTipCol = (byte)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarTipCol_To = (byte)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV58TFBarNomCli = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV59TFBarNomCli_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV60TFBarNumCli = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFBarNumCli_To = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV62TFMaqCod = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV63TFMaqCod_Sel = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECVOLPRD") == 0 )
         {
            AV64TFRecVolPrd = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFRecVolPrd_To = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFECALT") == 0 )
         {
            AV68TFRecFecAlt = localUtil.ctot( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANY") == 0 )
         {
            AV70TFBarNumAny = (short)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFBarNumAny_To = (short)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV29Barcod = (int)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV30Barcodreo = (byte)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV31Barcodpar = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FECHACIERRE") == 0 )
         {
            AV32FechaCierre = (short)(GXutil.lval( AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECACAB") == 0 )
         {
            AV33RecAcab = AV41GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      A14372RecHayAny = "" ;
      A13696BarNHdr = "" ;
      A120BarAgrEst = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A602MaqCod = "" ;
      A4866RecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = "" ;
      AV36FilterFullText = "" ;
      AV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = "" ;
      AV42TFBarNHdr = "" ;
      AV86Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel = "" ;
      AV43TFBarNHdr_Sel = "" ;
      AV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = "" ;
      AV48TFBarSer = "" ;
      AV92Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel = "" ;
      AV49TFBarSer_Sel = "" ;
      AV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = "" ;
      AV50TFBarSerDsc = "" ;
      AV94Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel = "" ;
      AV51TFBarSerDsc_Sel = "" ;
      AV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = "" ;
      AV52TFBarColNom = "" ;
      AV96Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel = "" ;
      AV53TFBarColNom_Sel = "" ;
      AV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = "" ;
      AV58TFBarNomCli = "" ;
      AV102Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel = "" ;
      AV59TFBarNomCli_Sel = "" ;
      AV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = "" ;
      AV62TFMaqCod = "" ;
      AV106Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel = "" ;
      AV63TFMaqCod_Sel = "" ;
      AV109Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt = GXutil.resetTime( GXutil.nullDate() );
      AV68TFRecFecAlt = GXutil.resetTime( GXutil.nullDate() );
      lV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr = "" ;
      lV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser = "" ;
      lV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc = "" ;
      lV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom = "" ;
      lV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli = "" ;
      lV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod = "" ;
      AV31Barcodpar = "" ;
      A130BarCodPar = "" ;
      A6039RecAcab = "" ;
      AV28Emprcod = "" ;
      A396EmprCod = "" ;
      P09HI2_A4700RecEnvio = new byte[1] ;
      P09HI2_A6039RecAcab = new String[] {""} ;
      P09HI2_n6039RecAcab = new boolean[] {false} ;
      P09HI2_A189BarNumAny = new short[1] ;
      P09HI2_A4866RecFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      P09HI2_n4866RecFecAlt = new boolean[] {false} ;
      P09HI2_A2805RecVolPrd = new int[1] ;
      P09HI2_A602MaqCod = new String[] {""} ;
      P09HI2_A1235BarNumCli = new int[1] ;
      P09HI2_A1234BarNomCli = new String[] {""} ;
      P09HI2_A218BarTipCol = new byte[1] ;
      P09HI2_A136BarColNum = new int[1] ;
      P09HI2_A135BarColNom = new String[] {""} ;
      P09HI2_A1652BarSerDsc = new String[] {""} ;
      P09HI2_A212BarSer = new String[] {""} ;
      P09HI2_A213BarSit = new byte[1] ;
      P09HI2_A13696BarNHdr = new String[] {""} ;
      P09HI2_A120BarAgrEst = new String[] {""} ;
      P09HI2_A2804RecLinMaq = new short[1] ;
      P09HI2_A130BarCodPar = new String[] {""} ;
      P09HI2_A132BarCodReo = new byte[1] ;
      P09HI2_A129BarCod = new int[1] ;
      P09HI2_A396EmprCod = new String[] {""} ;
      AV72Pesado = "" ;
      AV73Adicion = "" ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      AV113Consumos = DecimalUtil.ZERO ;
      AV38BarAgrEst = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV40GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV41GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV33RecAcab = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_cierre2_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09HI2_A4700RecEnvio, P09HI2_A6039RecAcab, P09HI2_n6039RecAcab, P09HI2_A189BarNumAny, P09HI2_A4866RecFecAlt, P09HI2_n4866RecFecAlt, P09HI2_A2805RecVolPrd, P09HI2_A602MaqCod, P09HI2_A1235BarNumCli, P09HI2_A1234BarNomCli,
            P09HI2_A218BarTipCol, P09HI2_A136BarColNum, P09HI2_A135BarColNom, P09HI2_A1652BarSerDsc, P09HI2_A212BarSer, P09HI2_A213BarSit, P09HI2_A13696BarNHdr, P09HI2_A120BarAgrEst, P09HI2_A2804RecLinMaq, P09HI2_A130BarCodPar,
            P09HI2_A132BarCodReo, P09HI2_A129BarCod, P09HI2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV89Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ;
   private byte AV46TFBarSit ;
   private byte AV90Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ;
   private byte AV47TFBarSit_To ;
   private byte AV99Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ;
   private byte AV56TFBarTipCol ;
   private byte AV100Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ;
   private byte AV57TFBarTipCol_To ;
   private byte AV30Barcodreo ;
   private byte A132BarCodReo ;
   private byte A4700RecEnvio ;
   private byte AV74incidencias ;
   private short gxcookieaux ;
   private short A189BarNumAny ;
   private short A2804RecLinMaq ;
   private short AV87Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ;
   private short AV44TFRecLinMaq ;
   private short AV88Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ;
   private short AV45TFRecLinMaq_To ;
   private short AV110Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ;
   private short AV70TFBarNumAny ;
   private short AV111Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ;
   private short AV71TFBarNumAny_To ;
   private short AV34OrderedBy ;
   private short AV32FechaCierre ;
   private short Gx_err ;
   private int AV13Random ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A2805RecVolPrd ;
   private int AV97Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ;
   private int AV54TFBarColNum ;
   private int AV98Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ;
   private int AV55TFBarColNum_To ;
   private int AV103Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ;
   private int AV60TFBarNumCli ;
   private int AV104Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ;
   private int AV61TFBarNumCli_To ;
   private int AV107Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ;
   private int AV64TFRecVolPrd ;
   private int AV108Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ;
   private int AV65TFRecVolPrd_To ;
   private int AV29Barcod ;
   private int A129BarCod ;
   private int AV112Contval ;
   private int GXt_int4 ;
   private int GXv_int6[] ;
   private int AV114GXV1 ;
   private java.math.BigDecimal AV113Consumos ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A14372RecHayAny ;
   private String A13696BarNHdr ;
   private String A120BarAgrEst ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A602MaqCod ;
   private String AV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ;
   private String AV42TFBarNHdr ;
   private String AV86Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ;
   private String AV43TFBarNHdr_Sel ;
   private String AV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ;
   private String AV48TFBarSer ;
   private String AV92Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ;
   private String AV49TFBarSer_Sel ;
   private String AV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ;
   private String AV50TFBarSerDsc ;
   private String AV94Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ;
   private String AV51TFBarSerDsc_Sel ;
   private String AV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ;
   private String AV52TFBarColNom ;
   private String AV96Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ;
   private String AV53TFBarColNom_Sel ;
   private String AV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ;
   private String AV58TFBarNomCli ;
   private String AV102Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ;
   private String AV59TFBarNomCli_Sel ;
   private String AV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ;
   private String AV62TFMaqCod ;
   private String AV106Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ;
   private String AV63TFMaqCod_Sel ;
   private String scmdbuf ;
   private String lV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ;
   private String lV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ;
   private String lV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ;
   private String lV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ;
   private String lV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ;
   private String lV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ;
   private String AV31Barcodpar ;
   private String A130BarCodPar ;
   private String A6039RecAcab ;
   private String AV28Emprcod ;
   private String A396EmprCod ;
   private String AV72Pesado ;
   private String AV73Adicion ;
   private String GXv_char3[] ;
   private String AV38BarAgrEst ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String AV33RecAcab ;
   private java.util.Date A4866RecFecAlt ;
   private java.util.Date AV109Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ;
   private java.util.Date AV68TFRecFecAlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV35OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n4866RecFecAlt ;
   private boolean AV37Seleccionar ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ;
   private String AV36FilterFullText ;
   private String lV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09HI2_A4700RecEnvio ;
   private String[] P09HI2_A6039RecAcab ;
   private boolean[] P09HI2_n6039RecAcab ;
   private short[] P09HI2_A189BarNumAny ;
   private java.util.Date[] P09HI2_A4866RecFecAlt ;
   private boolean[] P09HI2_n4866RecFecAlt ;
   private int[] P09HI2_A2805RecVolPrd ;
   private String[] P09HI2_A602MaqCod ;
   private int[] P09HI2_A1235BarNumCli ;
   private String[] P09HI2_A1234BarNomCli ;
   private byte[] P09HI2_A218BarTipCol ;
   private int[] P09HI2_A136BarColNum ;
   private String[] P09HI2_A135BarColNom ;
   private String[] P09HI2_A1652BarSerDsc ;
   private String[] P09HI2_A212BarSer ;
   private byte[] P09HI2_A213BarSit ;
   private String[] P09HI2_A13696BarNHdr ;
   private String[] P09HI2_A120BarAgrEst ;
   private short[] P09HI2_A2804RecLinMaq ;
   private String[] P09HI2_A130BarCodPar ;
   private byte[] P09HI2_A132BarCodReo ;
   private int[] P09HI2_A129BarCod ;
   private String[] P09HI2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV40GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV41GridStateFilterValue ;
}

final  class recetadetinte_cierre2_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09HI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV86Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel ,
                                          String AV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr ,
                                          short AV87Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq ,
                                          short AV88Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to ,
                                          byte AV89Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit ,
                                          byte AV90Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to ,
                                          String AV92Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel ,
                                          String AV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser ,
                                          String AV94Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel ,
                                          String AV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc ,
                                          String AV96Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel ,
                                          String AV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom ,
                                          int AV97Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum ,
                                          int AV98Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to ,
                                          byte AV99Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol ,
                                          byte AV100Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to ,
                                          String AV102Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel ,
                                          String AV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli ,
                                          int AV103Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli ,
                                          int AV104Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to ,
                                          String AV106Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel ,
                                          String AV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod ,
                                          int AV107Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd ,
                                          int AV108Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to ,
                                          java.util.Date AV109Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt ,
                                          short AV110Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany ,
                                          short AV111Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to ,
                                          int AV29Barcod ,
                                          byte AV30Barcodreo ,
                                          String AV31Barcodpar ,
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
                                          short AV34OrderedBy ,
                                          boolean AV35OrderedDsc ,
                                          String AV84Formulaciontinte_recetadetinte_cierre2_wcds_1_filterfulltext ,
                                          String A14372RecHayAny ,
                                          String A13696BarNHdr ,
                                          String A6039RecAcab ,
                                          byte A4700RecEnvio ,
                                          String AV28Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[31];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.RecEnvio, T1.RecAcab, T2.BarNumAny, T1.RecFecAlt, T1.RecVolPrd, T1.MaqCod, T2.BarNumCli, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc," ;
      scmdbuf += " T2.BarSer, T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr," ;
      scmdbuf += " T2.BarAgrEst, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod" ;
      scmdbuf += " = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.RecAcab <> 'S')");
      addWhere(sWhereString, "(T1.RecEnvio > 0)");
      if ( (GXutil.strcmp("", AV86Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_recetadetinte_cierre2_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_recetadetinte_cierre2_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_recetadetinte_cierre2_wcds_4_tfreclinmaq) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV88Formulaciontinte_recetadetinte_cierre2_wcds_5_tfreclinmaq_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMaq <= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_recetadetinte_cierre2_wcds_6_tfbarsit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_recetadetinte_cierre2_wcds_7_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_recetadetinte_cierre2_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_recetadetinte_cierre2_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV93Formulaciontinte_recetadetinte_cierre2_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_cierre2_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_cierre2_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Formulaciontinte_recetadetinte_cierre2_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! (0==AV97Formulaciontinte_recetadetinte_cierre2_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_recetadetinte_cierre2_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_recetadetinte_cierre2_wcds_16_tfbartipcol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_recetadetinte_cierre2_wcds_17_tfbartipcol_to) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV101Formulaciontinte_recetadetinte_cierre2_wcds_18_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Formulaciontinte_recetadetinte_cierre2_wcds_19_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV103Formulaciontinte_recetadetinte_cierre2_wcds_20_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T2.BarNumCli >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV104Formulaciontinte_recetadetinte_cierre2_wcds_21_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T2.BarNumCli <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_cierre2_wcds_22_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Formulaciontinte_recetadetinte_cierre2_wcds_23_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_cierre2_wcds_24_tfrecvolprd) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Formulaciontinte_recetadetinte_cierre2_wcds_25_tfrecvolprd_to) )
      {
         addWhere(sWhereString, "(T1.RecVolPrd <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV109Formulaciontinte_recetadetinte_cierre2_wcds_26_tfrecfecalt) )
      {
         addWhere(sWhereString, "(T1.RecFecAlt >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (0==AV110Formulaciontinte_recetadetinte_cierre2_wcds_27_tfbarnumany) )
      {
         addWhere(sWhereString, "(T2.BarNumAny >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (0==AV111Formulaciontinte_recetadetinte_cierre2_wcds_28_tfbarnumany_to) )
      {
         addWhere(sWhereString, "(T2.BarNumAny <= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV29Barcod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV30Barcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV31Barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV34OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.RecEnvio" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecLinMaq DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNumCli" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNumCli DESC" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecVolPrd DESC" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt" ;
      }
      else if ( ( AV34OrderedBy == 13 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFecAlt DESC" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNumAny" ;
      }
      else if ( ( AV34OrderedBy == 14 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNumAny DESC" ;
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
                  return conditional_P09HI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Number) dynConstraints[46]).shortValue() , ((Boolean) dynConstraints[47]).booleanValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09HI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((short[]) buf[18])[0] = rslt.getShort(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 3);
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
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[58]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               return;
      }
   }

}

