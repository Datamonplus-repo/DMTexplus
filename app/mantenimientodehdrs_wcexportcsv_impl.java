package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientodehdrs_wcexportcsv_impl extends GXWebProcedure
{
   public mantenimientodehdrs_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "MantenimientodeHDRs_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientodeHDRs_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("MantenimientodeHDRs_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N° Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Tipo Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero del Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Generacion Barcada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Disposicion Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Salida en Albaran", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "St", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Receta?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Partida", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV80Mantenimientodehdrs_wcds_1_filterfulltext = AV30FilterFullText ;
      AV81Mantenimientodehdrs_wcds_2_tfbarnhdr = AV34TFBarNHdr ;
      AV82Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = AV35TFBarNHdr_Sel ;
      AV83Mantenimientodehdrs_wcds_4_tfclinom = AV36TFCliNom ;
      AV84Mantenimientodehdrs_wcds_5_tfclinom_sel = AV37TFCliNom_Sel ;
      AV85Mantenimientodehdrs_wcds_6_tfpedidocliente = AV70TFPedidoCliente ;
      AV86Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = AV71TFPedidoCliente_Sel ;
      AV87Mantenimientodehdrs_wcds_8_tfbarser = AV40TFBarSer ;
      AV88Mantenimientodehdrs_wcds_9_tfbarser_sel = AV41TFBarSer_Sel ;
      AV89Mantenimientodehdrs_wcds_10_tfbarserdsc = AV42TFBarSerDsc ;
      AV90Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = AV43TFBarSerDsc_Sel ;
      AV91Mantenimientodehdrs_wcds_12_tfbartipartdsc = AV44TFBarTipArtDsc ;
      AV92Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = AV45TFBarTipArtDsc_Sel ;
      AV93Mantenimientodehdrs_wcds_14_tfbarcolnom = AV48TFBarColNom ;
      AV94Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = AV49TFBarColNom_Sel ;
      AV95Mantenimientodehdrs_wcds_16_tfbarcolnum = AV50TFBarColNum ;
      AV96Mantenimientodehdrs_wcds_17_tfbarcolnum_to = AV51TFBarColNum_To ;
      AV97Mantenimientodehdrs_wcds_18_tfbarfecgen = AV52TFBarFecGen ;
      AV98Mantenimientodehdrs_wcds_19_tfbarfeccli = AV54TFBarFecCli ;
      AV99Mantenimientodehdrs_wcds_20_tfbarfecsal = AV56TFBarFecSal ;
      AV100Mantenimientodehdrs_wcds_21_tfbarsit = AV58TFBarSit ;
      AV101Mantenimientodehdrs_wcds_22_tfbarsit_to = AV59TFBarSit_To ;
      AV102Mantenimientodehdrs_wcds_23_tfhayrec_sel = AV60TFHayRec_Sel ;
      AV103Mantenimientodehdrs_wcds_24_tfbarpart = AV75TFBarPart ;
      AV104Mantenimientodehdrs_wcds_25_tfbarpart_to = AV76TFBarPart_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV82Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                           AV81Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                           AV84Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                           AV83Mantenimientodehdrs_wcds_4_tfclinom ,
                                           AV88Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                           AV87Mantenimientodehdrs_wcds_8_tfbarser ,
                                           AV90Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                           AV89Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                           AV92Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                           AV91Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                           AV94Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                           AV93Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                           Integer.valueOf(AV95Mantenimientodehdrs_wcds_16_tfbarcolnum) ,
                                           Integer.valueOf(AV96Mantenimientodehdrs_wcds_17_tfbarcolnum_to) ,
                                           AV97Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                           AV98Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                           AV99Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                           Byte.valueOf(AV100Mantenimientodehdrs_wcds_21_tfbarsit) ,
                                           Byte.valueOf(AV101Mantenimientodehdrs_wcds_22_tfbarsit_to) ,
                                           Short.valueOf(AV103Mantenimientodehdrs_wcds_24_tfbarpart) ,
                                           Short.valueOf(AV104Mantenimientodehdrs_wcds_25_tfbarpart_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Byte.valueOf(A213BarSit) ,
                                           Short.valueOf(A1503BarPart) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV80Mantenimientodehdrs_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           AV86Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV85Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                           Byte.valueOf(AV102Mantenimientodehdrs_wcds_23_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(AV62Clicod) ,
                                           AV63Barfecgen ,
                                           AV64BarFecGen_to ,
                                           Byte.valueOf(AV65Barsit) ,
                                           Short.valueOf(AV66BarSit_to) ,
                                           A4812BarEncCli ,
                                           AV67BarEnccli ,
                                           Short.valueOf(AV69Enc20c) ,
                                           A143BarDisNum ,
                                           AV68BarDisnum ,
                                           Integer.valueOf(AV72Barcod) ,
                                           Byte.valueOf(AV73BarCodReo) ,
                                           AV74BarCodPar ,
                                           AV61Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV81Mantenimientodehdrs_wcds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV81Mantenimientodehdrs_wcds_2_tfbarnhdr), 11, "%") ;
      lV83Mantenimientodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV83Mantenimientodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV87Mantenimientodehdrs_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV87Mantenimientodehdrs_wcds_8_tfbarser), 16, "%") ;
      lV89Mantenimientodehdrs_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV89Mantenimientodehdrs_wcds_10_tfbarserdsc), 26, "%") ;
      lV91Mantenimientodehdrs_wcds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV91Mantenimientodehdrs_wcds_12_tfbartipartdsc), 30, "%") ;
      lV93Mantenimientodehdrs_wcds_14_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV93Mantenimientodehdrs_wcds_14_tfbarcolnom), 13, "%") ;
      /* Using cursor P097C2 */
      pr_default.execute(0, new Object[] {AV61Emprcod, Integer.valueOf(AV62Clicod), Integer.valueOf(AV62Clicod), AV63Barfecgen, AV64BarFecGen_to, Byte.valueOf(AV65Barsit), Short.valueOf(AV66BarSit_to), AV67BarEnccli, Short.valueOf(AV69Enc20c), AV67BarEnccli, AV68BarDisnum, Short.valueOf(AV69Enc20c), AV68BarDisnum, Integer.valueOf(AV72Barcod), Integer.valueOf(AV72Barcod), Byte.valueOf(AV73BarCodReo), Byte.valueOf(AV73BarCodReo), AV74BarCodPar, AV74BarCodPar, lV81Mantenimientodehdrs_wcds_2_tfbarnhdr, AV82Mantenimientodehdrs_wcds_3_tfbarnhdr_sel, lV83Mantenimientodehdrs_wcds_4_tfclinom, AV84Mantenimientodehdrs_wcds_5_tfclinom_sel, lV87Mantenimientodehdrs_wcds_8_tfbarser, AV88Mantenimientodehdrs_wcds_9_tfbarser_sel, lV89Mantenimientodehdrs_wcds_10_tfbarserdsc, AV90Mantenimientodehdrs_wcds_11_tfbarserdsc_sel, lV91Mantenimientodehdrs_wcds_12_tfbartipartdsc, AV92Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel, lV93Mantenimientodehdrs_wcds_14_tfbarcolnom, AV94Mantenimientodehdrs_wcds_15_tfbarcolnom_sel, Integer.valueOf(AV95Mantenimientodehdrs_wcds_16_tfbarcolnum), Integer.valueOf(AV96Mantenimientodehdrs_wcds_17_tfbarcolnum_to), AV97Mantenimientodehdrs_wcds_18_tfbarfecgen, AV98Mantenimientodehdrs_wcds_19_tfbarfeccli, AV99Mantenimientodehdrs_wcds_20_tfbarfecsal, Byte.valueOf(AV100Mantenimientodehdrs_wcds_21_tfbarsit), Byte.valueOf(AV101Mantenimientodehdrs_wcds_22_tfbarsit_to), Short.valueOf(AV103Mantenimientodehdrs_wcds_24_tfbarpart), Short.valueOf(AV104Mantenimientodehdrs_wcds_25_tfbarpart_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P097C2_A217BarTipArt[0] ;
         n217BarTipArt = P097C2_n217BarTipArt[0] ;
         A252CliCod = P097C2_A252CliCod[0] ;
         n252CliCod = P097C2_n252CliCod[0] ;
         A1503BarPart = P097C2_A1503BarPart[0] ;
         A213BarSit = P097C2_A213BarSit[0] ;
         A161BarFecSal = P097C2_A161BarFecSal[0] ;
         A155BarFecCli = P097C2_A155BarFecCli[0] ;
         A159BarFecGen = P097C2_A159BarFecGen[0] ;
         A136BarColNum = P097C2_A136BarColNum[0] ;
         A135BarColNom = P097C2_A135BarColNom[0] ;
         A13711BarTipArtD = P097C2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097C2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P097C2_A1652BarSerDsc[0] ;
         A212BarSer = P097C2_A212BarSer[0] ;
         A279CliNom = P097C2_A279CliNom[0] ;
         A13696BarNHdr = P097C2_A13696BarNHdr[0] ;
         A143BarDisNum = P097C2_A143BarDisNum[0] ;
         A4812BarEncCli = P097C2_A4812BarEncCli[0] ;
         A130BarCodPar = P097C2_A130BarCodPar[0] ;
         A132BarCodReo = P097C2_A132BarCodReo[0] ;
         A129BarCod = P097C2_A129BarCod[0] ;
         A396EmprCod = P097C2_A396EmprCod[0] ;
         A13711BarTipArtD = P097C2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097C2_n13711BarTipArtD[0] ;
         A279CliNom = P097C2_A279CliNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         mantenimientodehdrs_wcexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
         mantenimientodehdrs_wcexportcsv_impl.this.A4812BarEncCli = GXv_char4[0] ;
         mantenimientodehdrs_wcexportcsv_impl.this.A143BarDisNum = GXv_char5[0] ;
         mantenimientodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( (GXutil.strcmp("", AV80Mantenimientodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV80Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV80Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV80Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV80Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV80Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV80Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV80Mantenimientodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV80Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV80Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1503BarPart, 4, 0) , GXutil.padr( "%" + AV80Mantenimientodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV85Mantenimientodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV85Mantenimientodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV86Mantenimientodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV86Mantenimientodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
               {
                  GXt_int7 = A13710HayRec ;
                  GXv_int8[0] = GXt_int7 ;
                  new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
                  mantenimientodehdrs_wcexportcsv_impl.this.GXt_int7 = GXv_int8[0] ;
                  A13710HayRec = GXt_int7 ;
                  if ( ( AV102Mantenimientodehdrs_wcds_23_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
                  {
                     if ( ( AV102Mantenimientodehdrs_wcds_23_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
                     {
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
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char6[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char6) ;
                           mantenimientodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char6[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char6) ;
                           mantenimientodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char6[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13878PedidoClie, ";", ","), GXv_char6) ;
                           mantenimientodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char6[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char6) ;
                           mantenimientodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char6[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char6) ;
                           mantenimientodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char6[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13711BarTipArtD, ";", ","), GXv_char6) ;
                           mantenimientodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           GXt_char2 = AV14TextFileLine ;
                           GXv_char6[0] = GXt_char2 ;
                           new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char6) ;
                           mantenimientodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                           AV14TextFileLine += GXt_char2 ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += localUtil.dtoc( A155BarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += localUtil.dtoc( A161BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A213BarSit, 2, 0) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A13710HayRec, 1, 0) ;
                        }
                        if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                        {
                           AV14TextFileLine += ";" ;
                           AV14TextFileLine += GXutil.str( A1503BarPart, 4, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=MantenimientodeHDRs_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNHdr", "", "N° Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSer", "", "Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarTipArtDsc", "", "Descripcion Tipo Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNom", "", "Nombre Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNum", "", "Numero del Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecGen", "", "Fecha Generacion Barcada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecCli", "", "Fecha Disposicion Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSit", "", "St", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "HayRec", "", "Receta?", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarPart", "", "Nº Partida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char6[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "MantenimientodeHDRs_WCColumnsSelector", GXv_char6) ;
      mantenimientodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("MantenimientodeHDRs_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "MantenimientodeHDRs_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("MantenimientodeHDRs_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV105GXV1 = 1 ;
      while ( AV105GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV105GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV34TFBarNHdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV35TFBarNHdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV36TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV37TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV70TFPedidoCliente = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV71TFPedidoCliente_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV40TFBarSer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV41TFBarSer_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV42TFBarSerDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV43TFBarSerDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV44TFBarTipArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV45TFBarTipArtDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV48TFBarColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV49TFBarColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV50TFBarColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV51TFBarColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV52TFBarFecGen = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV54TFBarFecCli = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV56TFBarFecSal = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV58TFBarSit = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFBarSit_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHAYREC_SEL") == 0 )
         {
            AV60TFHayRec_Sel = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPART") == 0 )
         {
            AV75TFBarPart = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV76TFBarPart_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV61Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV62Clicod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV63Barfecgen = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV64BarFecGen_to = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV65Barsit = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV66BarSit_to = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARENCCLI") == 0 )
         {
            AV67BarEnccli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARDISNUM") == 0 )
         {
            AV68BarDisnum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV72Barcod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV73BarCodReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV74BarCodPar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV105GXV1 = (int)(AV105GXV1+1) ;
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
      A13696BarNHdr = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      AV80Mantenimientodehdrs_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV81Mantenimientodehdrs_wcds_2_tfbarnhdr = "" ;
      AV34TFBarNHdr = "" ;
      AV82Mantenimientodehdrs_wcds_3_tfbarnhdr_sel = "" ;
      AV35TFBarNHdr_Sel = "" ;
      AV83Mantenimientodehdrs_wcds_4_tfclinom = "" ;
      AV36TFCliNom = "" ;
      AV84Mantenimientodehdrs_wcds_5_tfclinom_sel = "" ;
      AV37TFCliNom_Sel = "" ;
      AV85Mantenimientodehdrs_wcds_6_tfpedidocliente = "" ;
      AV70TFPedidoCliente = "" ;
      AV86Mantenimientodehdrs_wcds_7_tfpedidocliente_sel = "" ;
      AV71TFPedidoCliente_Sel = "" ;
      AV87Mantenimientodehdrs_wcds_8_tfbarser = "" ;
      AV40TFBarSer = "" ;
      AV88Mantenimientodehdrs_wcds_9_tfbarser_sel = "" ;
      AV41TFBarSer_Sel = "" ;
      AV89Mantenimientodehdrs_wcds_10_tfbarserdsc = "" ;
      AV42TFBarSerDsc = "" ;
      AV90Mantenimientodehdrs_wcds_11_tfbarserdsc_sel = "" ;
      AV43TFBarSerDsc_Sel = "" ;
      AV91Mantenimientodehdrs_wcds_12_tfbartipartdsc = "" ;
      AV44TFBarTipArtDsc = "" ;
      AV92Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel = "" ;
      AV45TFBarTipArtDsc_Sel = "" ;
      AV93Mantenimientodehdrs_wcds_14_tfbarcolnom = "" ;
      AV48TFBarColNom = "" ;
      AV94Mantenimientodehdrs_wcds_15_tfbarcolnom_sel = "" ;
      AV49TFBarColNom_Sel = "" ;
      AV97Mantenimientodehdrs_wcds_18_tfbarfecgen = GXutil.nullDate() ;
      AV52TFBarFecGen = GXutil.nullDate() ;
      AV98Mantenimientodehdrs_wcds_19_tfbarfeccli = GXutil.nullDate() ;
      AV54TFBarFecCli = GXutil.nullDate() ;
      AV99Mantenimientodehdrs_wcds_20_tfbarfecsal = GXutil.nullDate() ;
      AV56TFBarFecSal = GXutil.nullDate() ;
      lV80Mantenimientodehdrs_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV81Mantenimientodehdrs_wcds_2_tfbarnhdr = "" ;
      lV83Mantenimientodehdrs_wcds_4_tfclinom = "" ;
      lV87Mantenimientodehdrs_wcds_8_tfbarser = "" ;
      lV89Mantenimientodehdrs_wcds_10_tfbarserdsc = "" ;
      lV91Mantenimientodehdrs_wcds_12_tfbartipartdsc = "" ;
      lV93Mantenimientodehdrs_wcds_14_tfbarcolnom = "" ;
      A130BarCodPar = "" ;
      AV63Barfecgen = GXutil.nullDate() ;
      AV64BarFecGen_to = GXutil.nullDate() ;
      A4812BarEncCli = "" ;
      AV67BarEnccli = "" ;
      A143BarDisNum = "" ;
      AV68BarDisnum = "" ;
      AV74BarCodPar = "" ;
      AV61Emprcod = "" ;
      A396EmprCod = "" ;
      P097C2_A217BarTipArt = new short[1] ;
      P097C2_n217BarTipArt = new boolean[] {false} ;
      P097C2_A252CliCod = new int[1] ;
      P097C2_n252CliCod = new boolean[] {false} ;
      P097C2_A1503BarPart = new short[1] ;
      P097C2_A213BarSit = new byte[1] ;
      P097C2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P097C2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097C2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097C2_A136BarColNum = new int[1] ;
      P097C2_A135BarColNom = new String[] {""} ;
      P097C2_A13711BarTipArtD = new String[] {""} ;
      P097C2_n13711BarTipArtD = new boolean[] {false} ;
      P097C2_A1652BarSerDsc = new String[] {""} ;
      P097C2_A212BarSer = new String[] {""} ;
      P097C2_A279CliNom = new String[] {""} ;
      P097C2_A13696BarNHdr = new String[] {""} ;
      P097C2_A143BarDisNum = new String[] {""} ;
      P097C2_A4812BarEncCli = new String[] {""} ;
      P097C2_A130BarCodPar = new String[] {""} ;
      P097C2_A132BarCodReo = new byte[1] ;
      P097C2_A129BarCod = new int[1] ;
      P097C2_A396EmprCod = new String[] {""} ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new byte[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientodehdrs_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P097C2_A217BarTipArt, P097C2_n217BarTipArt, P097C2_A252CliCod, P097C2_n252CliCod, P097C2_A1503BarPart, P097C2_A213BarSit, P097C2_A161BarFecSal, P097C2_A155BarFecCli, P097C2_A159BarFecGen, P097C2_A136BarColNum,
            P097C2_A135BarColNom, P097C2_A13711BarTipArtD, P097C2_n13711BarTipArtD, P097C2_A1652BarSerDsc, P097C2_A212BarSer, P097C2_A279CliNom, P097C2_A13696BarNHdr, P097C2_A143BarDisNum, P097C2_A4812BarEncCli, P097C2_A130BarCodPar,
            P097C2_A132BarCodReo, P097C2_A129BarCod, P097C2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte AV100Mantenimientodehdrs_wcds_21_tfbarsit ;
   private byte AV58TFBarSit ;
   private byte AV101Mantenimientodehdrs_wcds_22_tfbarsit_to ;
   private byte AV59TFBarSit_To ;
   private byte AV102Mantenimientodehdrs_wcds_23_tfhayrec_sel ;
   private byte AV60TFHayRec_Sel ;
   private byte A132BarCodReo ;
   private byte AV65Barsit ;
   private byte AV73BarCodReo ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short gxcookieaux ;
   private short A1503BarPart ;
   private short AV103Mantenimientodehdrs_wcds_24_tfbarpart ;
   private short AV75TFBarPart ;
   private short AV104Mantenimientodehdrs_wcds_25_tfbarpart_to ;
   private short AV76TFBarPart_To ;
   private short AV28OrderedBy ;
   private short AV66BarSit_to ;
   private short AV69Enc20c ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV13Random ;
   private int A136BarColNum ;
   private int AV95Mantenimientodehdrs_wcds_16_tfbarcolnum ;
   private int AV50TFBarColNum ;
   private int AV96Mantenimientodehdrs_wcds_17_tfbarcolnum_to ;
   private int AV51TFBarColNum_To ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV62Clicod ;
   private int AV72Barcod ;
   private int AV105GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A13878PedidoClie ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String AV81Mantenimientodehdrs_wcds_2_tfbarnhdr ;
   private String AV34TFBarNHdr ;
   private String AV82Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ;
   private String AV35TFBarNHdr_Sel ;
   private String AV83Mantenimientodehdrs_wcds_4_tfclinom ;
   private String AV36TFCliNom ;
   private String AV84Mantenimientodehdrs_wcds_5_tfclinom_sel ;
   private String AV37TFCliNom_Sel ;
   private String AV85Mantenimientodehdrs_wcds_6_tfpedidocliente ;
   private String AV70TFPedidoCliente ;
   private String AV86Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ;
   private String AV71TFPedidoCliente_Sel ;
   private String AV87Mantenimientodehdrs_wcds_8_tfbarser ;
   private String AV40TFBarSer ;
   private String AV88Mantenimientodehdrs_wcds_9_tfbarser_sel ;
   private String AV41TFBarSer_Sel ;
   private String AV89Mantenimientodehdrs_wcds_10_tfbarserdsc ;
   private String AV42TFBarSerDsc ;
   private String AV90Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ;
   private String AV43TFBarSerDsc_Sel ;
   private String AV91Mantenimientodehdrs_wcds_12_tfbartipartdsc ;
   private String AV44TFBarTipArtDsc ;
   private String AV92Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ;
   private String AV45TFBarTipArtDsc_Sel ;
   private String AV93Mantenimientodehdrs_wcds_14_tfbarcolnom ;
   private String AV48TFBarColNom ;
   private String AV94Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ;
   private String AV49TFBarColNom_Sel ;
   private String scmdbuf ;
   private String lV81Mantenimientodehdrs_wcds_2_tfbarnhdr ;
   private String lV83Mantenimientodehdrs_wcds_4_tfclinom ;
   private String lV87Mantenimientodehdrs_wcds_8_tfbarser ;
   private String lV89Mantenimientodehdrs_wcds_10_tfbarserdsc ;
   private String lV91Mantenimientodehdrs_wcds_12_tfbartipartdsc ;
   private String lV93Mantenimientodehdrs_wcds_14_tfbarcolnom ;
   private String A130BarCodPar ;
   private String A4812BarEncCli ;
   private String AV67BarEnccli ;
   private String A143BarDisNum ;
   private String AV68BarDisnum ;
   private String AV74BarCodPar ;
   private String AV61Emprcod ;
   private String A396EmprCod ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV97Mantenimientodehdrs_wcds_18_tfbarfecgen ;
   private java.util.Date AV52TFBarFecGen ;
   private java.util.Date AV98Mantenimientodehdrs_wcds_19_tfbarfeccli ;
   private java.util.Date AV54TFBarFecCli ;
   private java.util.Date AV99Mantenimientodehdrs_wcds_20_tfbarfecsal ;
   private java.util.Date AV56TFBarFecSal ;
   private java.util.Date AV63Barfecgen ;
   private java.util.Date AV64BarFecGen_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13711BarTipArtD ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV80Mantenimientodehdrs_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV80Mantenimientodehdrs_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P097C2_A217BarTipArt ;
   private boolean[] P097C2_n217BarTipArt ;
   private int[] P097C2_A252CliCod ;
   private boolean[] P097C2_n252CliCod ;
   private short[] P097C2_A1503BarPart ;
   private byte[] P097C2_A213BarSit ;
   private java.util.Date[] P097C2_A161BarFecSal ;
   private java.util.Date[] P097C2_A155BarFecCli ;
   private java.util.Date[] P097C2_A159BarFecGen ;
   private int[] P097C2_A136BarColNum ;
   private String[] P097C2_A135BarColNom ;
   private String[] P097C2_A13711BarTipArtD ;
   private boolean[] P097C2_n13711BarTipArtD ;
   private String[] P097C2_A1652BarSerDsc ;
   private String[] P097C2_A212BarSer ;
   private String[] P097C2_A279CliNom ;
   private String[] P097C2_A13696BarNHdr ;
   private String[] P097C2_A143BarDisNum ;
   private String[] P097C2_A4812BarEncCli ;
   private String[] P097C2_A130BarCodPar ;
   private byte[] P097C2_A132BarCodReo ;
   private int[] P097C2_A129BarCod ;
   private String[] P097C2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class mantenimientodehdrs_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV82Mantenimientodehdrs_wcds_3_tfbarnhdr_sel ,
                                          String AV81Mantenimientodehdrs_wcds_2_tfbarnhdr ,
                                          String AV84Mantenimientodehdrs_wcds_5_tfclinom_sel ,
                                          String AV83Mantenimientodehdrs_wcds_4_tfclinom ,
                                          String AV88Mantenimientodehdrs_wcds_9_tfbarser_sel ,
                                          String AV87Mantenimientodehdrs_wcds_8_tfbarser ,
                                          String AV90Mantenimientodehdrs_wcds_11_tfbarserdsc_sel ,
                                          String AV89Mantenimientodehdrs_wcds_10_tfbarserdsc ,
                                          String AV92Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel ,
                                          String AV91Mantenimientodehdrs_wcds_12_tfbartipartdsc ,
                                          String AV94Mantenimientodehdrs_wcds_15_tfbarcolnom_sel ,
                                          String AV93Mantenimientodehdrs_wcds_14_tfbarcolnom ,
                                          int AV95Mantenimientodehdrs_wcds_16_tfbarcolnum ,
                                          int AV96Mantenimientodehdrs_wcds_17_tfbarcolnum_to ,
                                          java.util.Date AV97Mantenimientodehdrs_wcds_18_tfbarfecgen ,
                                          java.util.Date AV98Mantenimientodehdrs_wcds_19_tfbarfeccli ,
                                          java.util.Date AV99Mantenimientodehdrs_wcds_20_tfbarfecsal ,
                                          byte AV100Mantenimientodehdrs_wcds_21_tfbarsit ,
                                          byte AV101Mantenimientodehdrs_wcds_22_tfbarsit_to ,
                                          short AV103Mantenimientodehdrs_wcds_24_tfbarpart ,
                                          short AV104Mantenimientodehdrs_wcds_25_tfbarpart_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          byte A213BarSit ,
                                          short A1503BarPart ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV80Mantenimientodehdrs_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String AV86Mantenimientodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV85Mantenimientodehdrs_wcds_6_tfpedidocliente ,
                                          byte AV102Mantenimientodehdrs_wcds_23_tfhayrec_sel ,
                                          byte A13710HayRec ,
                                          int A252CliCod ,
                                          int AV62Clicod ,
                                          java.util.Date AV63Barfecgen ,
                                          java.util.Date AV64BarFecGen_to ,
                                          byte AV65Barsit ,
                                          short AV66BarSit_to ,
                                          String A4812BarEncCli ,
                                          String AV67BarEnccli ,
                                          short AV69Enc20c ,
                                          String A143BarDisNum ,
                                          String AV68BarDisnum ,
                                          int AV72Barcod ,
                                          byte AV73BarCodReo ,
                                          String AV74BarCodPar ,
                                          String AV61Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[40];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.CliCod, T1.BarPart, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarSerDsc, T1.BarSer, T3.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T1.BarDisNum, T1.BarEncCli, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.CliCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarEncCli = ? and ? = 1 or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarDisNum = ? and (? = 0) or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV81Mantenimientodehdrs_wcds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Mantenimientodehdrs_wcds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Mantenimientodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Mantenimientodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV87Mantenimientodehdrs_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Mantenimientodehdrs_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV89Mantenimientodehdrs_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Mantenimientodehdrs_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Mantenimientodehdrs_wcds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Mantenimientodehdrs_wcds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV93Mantenimientodehdrs_wcds_14_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Mantenimientodehdrs_wcds_15_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV95Mantenimientodehdrs_wcds_16_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV96Mantenimientodehdrs_wcds_17_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Mantenimientodehdrs_wcds_18_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Mantenimientodehdrs_wcds_19_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99Mantenimientodehdrs_wcds_20_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( ! (0==AV100Mantenimientodehdrs_wcds_21_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (0==AV101Mantenimientodehdrs_wcds_22_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( ! (0==AV103Mantenimientodehdrs_wcds_24_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (0==AV104Mantenimientodehdrs_wcds_25_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPart" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPart DESC" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P097C2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , (java.util.Date)dynConstraints[31] , (java.util.Date)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).intValue() , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).byteValue() , ((Number) dynConstraints[49]).shortValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(7);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((String[]) buf[14])[0] = rslt.getString(12, 16);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 11);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
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
                  stmt.setString(sIdx, (String)parms[40], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 11);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 16);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[73]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[78]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[79]).shortValue());
               }
               return;
      }
   }

}

