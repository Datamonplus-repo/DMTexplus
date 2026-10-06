package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wciformedetalladohdrsproduccionexportcsv_impl extends GXWebProcedure
{
   public wciformedetalladohdrsproduccionexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCIformedetalladoHdrsProduccionExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCIformedetalladoHdrsProduccionColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCIformedetalladoHdrsProduccionColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "TC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Paro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "TReal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Reoperado", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV104Wciformedetalladohdrsproduccionds_1_filterfulltext = AV79FilterFullText ;
      AV105Wciformedetalladohdrsproduccionds_2_tfmaqcod = AV33TFMaqCod ;
      AV106Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = AV34TFMaqCod_Sel ;
      AV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc = AV52TFMaqDsc ;
      AV108Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = AV53TFMaqDsc_Sel ;
      AV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr = AV35TFBarNHdr ;
      AV110Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = AV36TFBarNHdr_Sel ;
      AV111Wciformedetalladohdrsproduccionds_8_tfhisprolot = AV77TFHisProLot ;
      AV112Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = AV78TFHisProLot_Sel ;
      AV113Wciformedetalladohdrsproduccionds_10_tfclicod = AV54TFCliCod ;
      AV114Wciformedetalladohdrsproduccionds_11_tfclicod_to = AV55TFCliCod_To ;
      AV115Wciformedetalladohdrsproduccionds_12_tfclinom = AV56TFCliNom ;
      AV116Wciformedetalladohdrsproduccionds_13_tfclinom_sel = AV57TFCliNom_Sel ;
      AV117Wciformedetalladohdrsproduccionds_14_tfpedidocliente = AV94TFPedidoCliente ;
      AV118Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = AV95TFPedidoCliente_Sel ;
      AV119Wciformedetalladohdrsproduccionds_16_tfbarfecgen = AV58TFBarFecGen ;
      AV120Wciformedetalladohdrsproduccionds_17_tfbarser = AV60TFBarSer ;
      AV121Wciformedetalladohdrsproduccionds_18_tfbarser_sel = AV61TFBarSer_Sel ;
      AV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc = AV62TFBarSerDsc ;
      AV123Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = AV63TFBarSerDsc_Sel ;
      AV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = AV90TFBarTipArtDsc ;
      AV125Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = AV91TFBarTipArtDsc_Sel ;
      AV126Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = AV92TFBarTipColDsc ;
      AV127Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = AV93TFBarTipColDsc_Sel ;
      AV128Wciformedetalladohdrsproduccionds_25_tffase = AV37TFFase ;
      AV129Wciformedetalladohdrsproduccionds_26_tffase_sel = AV38TFFase_Sel ;
      AV130Wciformedetalladohdrsproduccionds_27_tffasedescripcion = AV98TFFaseDescripcion ;
      AV131Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = AV99TFFaseDescripcion_Sel ;
      AV132Wciformedetalladohdrsproduccionds_29_tfhisprodti = AV39TFHisProDTI ;
      AV133Wciformedetalladohdrsproduccionds_30_tfhisprodtf = AV41TFHisProDTF ;
      AV134Wciformedetalladohdrsproduccionds_31_tfhisprokgr = AV64TFHisProKgr ;
      AV135Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = AV65TFHisProKgr_To ;
      AV136Wciformedetalladohdrsproduccionds_33_tfhispromtr = AV66TFHisProMtr ;
      AV137Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = AV67TFHisProMtr_To ;
      AV138Wciformedetalladohdrsproduccionds_35_tfparcod = AV70TFParCod ;
      AV139Wciformedetalladohdrsproduccionds_36_tfparcod_to = AV71TFParCod_To ;
      AV140Wciformedetalladohdrsproduccionds_37_tfparcodnom = AV75TFParCodNom ;
      AV141Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = AV76TFParCodNom_Sel ;
      AV142Wciformedetalladohdrsproduccionds_39_tfhisprotur = AV72TFHisProTur ;
      AV143Wciformedetalladohdrsproduccionds_40_tfhisprotur_to = AV73TFHisProTur_To ;
      AV144Wciformedetalladohdrsproduccionds_41_tfhisproreo = AV82TFHisProReo ;
      AV145Wciformedetalladohdrsproduccionds_42_tfhisproreo_to = AV83TFHisProReo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV106Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                           AV105Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                           AV108Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                           AV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                           AV110Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                           AV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                           AV112Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                           AV111Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                           Integer.valueOf(AV113Wciformedetalladohdrsproduccionds_10_tfclicod) ,
                                           Integer.valueOf(AV114Wciformedetalladohdrsproduccionds_11_tfclicod_to) ,
                                           AV116Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                           AV115Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                           AV119Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                           AV121Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                           AV120Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                           AV123Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                           AV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                           AV125Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                           AV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                           AV129Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                           AV128Wciformedetalladohdrsproduccionds_25_tffase ,
                                           AV132Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                           AV133Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                           AV134Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                           AV135Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                           AV136Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                           AV137Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                           Short.valueOf(AV138Wciformedetalladohdrsproduccionds_35_tfparcod) ,
                                           Short.valueOf(AV139Wciformedetalladohdrsproduccionds_36_tfparcod_to) ,
                                           AV141Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                           AV140Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                           Byte.valueOf(AV142Wciformedetalladohdrsproduccionds_39_tfhisprotur) ,
                                           Byte.valueOf(AV143Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) ,
                                           Byte.valueOf(AV144Wciformedetalladohdrsproduccionds_41_tfhisproreo) ,
                                           Byte.valueOf(AV145Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) ,
                                           AV44MaqCodInicial ,
                                           AV45MaqCodFinal ,
                                           AV46Hisprodti ,
                                           AV47Hisprodtf ,
                                           Byte.valueOf(AV80HisProReo) ,
                                           Short.valueOf(AV81ParCod) ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A3610HisProLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Byte.valueOf(A566HisProTur) ,
                                           Byte.valueOf(A3612HisProReo) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV104Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13878PedidoClie ,
                                           A13868BarTipColD ,
                                           A13893FaseDescri ,
                                           AV118Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                           AV117Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                           AV127Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                           AV126Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                           AV131Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                           AV130Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                           AV43Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV105Wciformedetalladohdrsproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV105Wciformedetalladohdrsproduccionds_2_tfmaqcod), 6, "%") ;
      lV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc), 16, "%") ;
      lV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr), 11, "%") ;
      lV111Wciformedetalladohdrsproduccionds_8_tfhisprolot = GXutil.padr( GXutil.rtrim( AV111Wciformedetalladohdrsproduccionds_8_tfhisprolot), 10, "%") ;
      lV115Wciformedetalladohdrsproduccionds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV115Wciformedetalladohdrsproduccionds_12_tfclinom), 30, "%") ;
      lV120Wciformedetalladohdrsproduccionds_17_tfbarser = GXutil.padr( GXutil.rtrim( AV120Wciformedetalladohdrsproduccionds_17_tfbarser), 16, "%") ;
      lV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc), 26, "%") ;
      lV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc), 30, "%") ;
      lV128Wciformedetalladohdrsproduccionds_25_tffase = GXutil.padr( GXutil.rtrim( AV128Wciformedetalladohdrsproduccionds_25_tffase), 8, "%") ;
      lV140Wciformedetalladohdrsproduccionds_37_tfparcodnom = GXutil.padr( GXutil.rtrim( AV140Wciformedetalladohdrsproduccionds_37_tfparcodnom), 30, "%") ;
      /* Using cursor P08LW2 */
      pr_default.execute(0, new Object[] {AV43Emprcod, lV105Wciformedetalladohdrsproduccionds_2_tfmaqcod, AV106Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel, lV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc, AV108Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel, lV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr, AV110Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel, lV111Wciformedetalladohdrsproduccionds_8_tfhisprolot, AV112Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel, Integer.valueOf(AV113Wciformedetalladohdrsproduccionds_10_tfclicod), Integer.valueOf(AV114Wciformedetalladohdrsproduccionds_11_tfclicod_to), lV115Wciformedetalladohdrsproduccionds_12_tfclinom, AV116Wciformedetalladohdrsproduccionds_13_tfclinom_sel, AV119Wciformedetalladohdrsproduccionds_16_tfbarfecgen, lV120Wciformedetalladohdrsproduccionds_17_tfbarser, AV121Wciformedetalladohdrsproduccionds_18_tfbarser_sel, lV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc, AV123Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel, lV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc, AV125Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel, lV128Wciformedetalladohdrsproduccionds_25_tffase, AV129Wciformedetalladohdrsproduccionds_26_tffase_sel, AV132Wciformedetalladohdrsproduccionds_29_tfhisprodti, AV133Wciformedetalladohdrsproduccionds_30_tfhisprodtf, AV134Wciformedetalladohdrsproduccionds_31_tfhisprokgr, AV135Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to, AV136Wciformedetalladohdrsproduccionds_33_tfhispromtr, AV137Wciformedetalladohdrsproduccionds_34_tfhispromtr_to, Short.valueOf(AV138Wciformedetalladohdrsproduccionds_35_tfparcod), Short.valueOf(AV139Wciformedetalladohdrsproduccionds_36_tfparcod_to), lV140Wciformedetalladohdrsproduccionds_37_tfparcodnom, AV141Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel, Byte.valueOf(AV142Wciformedetalladohdrsproduccionds_39_tfhisprotur), Byte.valueOf(AV143Wciformedetalladohdrsproduccionds_40_tfhisprotur_to), Byte.valueOf(AV144Wciformedetalladohdrsproduccionds_41_tfhisproreo), Byte.valueOf(AV145Wciformedetalladohdrsproduccionds_42_tfhisproreo_to), AV44MaqCodInicial, AV45MaqCodFinal, AV46Hisprodti, AV47Hisprodtf, Byte.valueOf(AV80HisProReo), Short.valueOf(AV81ParCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P08LW2_A217BarTipArt[0] ;
         n217BarTipArt = P08LW2_n217BarTipArt[0] ;
         A3612HisProReo = P08LW2_A3612HisProReo[0] ;
         A566HisProTur = P08LW2_A566HisProTur[0] ;
         A867ParCodNom = P08LW2_A867ParCodNom[0] ;
         n867ParCodNom = P08LW2_n867ParCodNom[0] ;
         A656ParCod = P08LW2_A656ParCod[0] ;
         n656ParCod = P08LW2_n656ParCod[0] ;
         A1526HisProMtr = P08LW2_A1526HisProMtr[0] ;
         A1525HisProKgr = P08LW2_A1525HisProKgr[0] ;
         A13711BarTipArtD = P08LW2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LW2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P08LW2_A1652BarSerDsc[0] ;
         A212BarSer = P08LW2_A212BarSer[0] ;
         A159BarFecGen = P08LW2_A159BarFecGen[0] ;
         A279CliNom = P08LW2_A279CliNom[0] ;
         A252CliCod = P08LW2_A252CliCod[0] ;
         n252CliCod = P08LW2_n252CliCod[0] ;
         A3610HisProLot = P08LW2_A3610HisProLot[0] ;
         A13696BarNHdr = P08LW2_A13696BarNHdr[0] ;
         A606MaqDsc = P08LW2_A606MaqDsc[0] ;
         n606MaqDsc = P08LW2_n606MaqDsc[0] ;
         A602MaqCod = P08LW2_A602MaqCod[0] ;
         A129BarCod = P08LW2_A129BarCod[0] ;
         A132BarCodReo = P08LW2_A132BarCodReo[0] ;
         A130BarCodPar = P08LW2_A130BarCodPar[0] ;
         A4440HisProDTI = P08LW2_A4440HisProDTI[0] ;
         n4440HisProDTI = P08LW2_n4440HisProDTI[0] ;
         A4441HisProDTF = P08LW2_A4441HisProDTF[0] ;
         n4441HisProDTF = P08LW2_n4441HisProDTF[0] ;
         A143BarDisNum = P08LW2_A143BarDisNum[0] ;
         A4812BarEncCli = P08LW2_A4812BarEncCli[0] ;
         A218BarTipCol = P08LW2_A218BarTipCol[0] ;
         A461Fase = P08LW2_A461Fase[0] ;
         A396EmprCod = P08LW2_A396EmprCod[0] ;
         A558HisProFec = P08LW2_A558HisProFec[0] ;
         A561HisProLin = P08LW2_A561HisProLin[0] ;
         A606MaqDsc = P08LW2_A606MaqDsc[0] ;
         n606MaqDsc = P08LW2_n606MaqDsc[0] ;
         A217BarTipArt = P08LW2_A217BarTipArt[0] ;
         n217BarTipArt = P08LW2_n217BarTipArt[0] ;
         A1652BarSerDsc = P08LW2_A1652BarSerDsc[0] ;
         A212BarSer = P08LW2_A212BarSer[0] ;
         A159BarFecGen = P08LW2_A159BarFecGen[0] ;
         A252CliCod = P08LW2_A252CliCod[0] ;
         n252CliCod = P08LW2_n252CliCod[0] ;
         A13696BarNHdr = P08LW2_A13696BarNHdr[0] ;
         A143BarDisNum = P08LW2_A143BarDisNum[0] ;
         A4812BarEncCli = P08LW2_A4812BarEncCli[0] ;
         A218BarTipCol = P08LW2_A218BarTipCol[0] ;
         A279CliNom = P08LW2_A279CliNom[0] ;
         A13711BarTipArtD = P08LW2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P08LW2_n13711BarTipArtD[0] ;
         A867ParCodNom = P08LW2_A867ParCodNom[0] ;
         n867ParCodNom = P08LW2_n867ParCodNom[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         wciformedetalladohdrsproduccionexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
         wciformedetalladohdrsproduccionexportcsv_impl.this.A4812BarEncCli = GXv_char4[0] ;
         wciformedetalladohdrsproduccionexportcsv_impl.this.A143BarDisNum = GXv_char5[0] ;
         wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV117Wciformedetalladohdrsproduccionds_14_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV117Wciformedetalladohdrsproduccionds_14_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV118Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV118Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_char2 = A13868BarTipColD ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int7[0] = A218BarTipCol ;
               GXv_char5[0] = GXt_char2 ;
               new app.pfcoldsc(remoteHandle, context).execute( GXv_char6, GXv_int7, GXv_char5) ;
               wciformedetalladohdrsproduccionexportcsv_impl.this.A396EmprCod = GXv_char6[0] ;
               wciformedetalladohdrsproduccionexportcsv_impl.this.A218BarTipCol = GXv_int7[0] ;
               wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
               A13868BarTipColD = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV127Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV126Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc)==0) ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV126Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV127Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel)==0) || ( ( GXutil.strcmp(A13868BarTipColD, AV127Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13893FaseDescri ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char6) ;
                     wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                     A13893FaseDescri = GXt_char2 ;
                     if ( (GXutil.strcmp("", AV104Wciformedetalladohdrsproduccionds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A602MaqCod) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A606MaqDsc) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3610HisProLot) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV104Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13868BarTipColD) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A461Fase) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1525HisProKgr, 9, 2) , GXutil.padr( "%" + AV104Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1526HisProMtr, 9, 2) , GXutil.padr( "%" + AV104Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A656ParCod, 4, 0) , GXutil.padr( "%" + AV104Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A867ParCodNom) , GXutil.padr( "%" + GXutil.upper( AV104Wciformedetalladohdrsproduccionds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A566HisProTur, 1, 0) , GXutil.padr( "%" + AV104Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3612HisProReo, 1, 0) , GXutil.padr( "%" + AV104Wciformedetalladohdrsproduccionds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV131Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) && ( ! (GXutil.strcmp("", AV130Wciformedetalladohdrsproduccionds_27_tffasedescripcion)==0) ) ) || ( GXutil.like( GXutil.upper( A13893FaseDescri) , GXutil.padr( "%" + GXutil.upper( AV130Wciformedetalladohdrsproduccionds_27_tffasedescripcion) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV131Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel)==0) || ( ( GXutil.strcmp(A13893FaseDescri, AV131Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel) == 0 ) ) )
                           {
                              if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                              {
                                 A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
                              }
                              else
                              {
                                 A5605HisProTr2 = (short)(0) ;
                              }
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
                                 returnInSub = true;
                                 if (true) return;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A606MaqDsc, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3610HisProLot, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
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
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13878PedidoClie, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13711BarTipArtD, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13868BarTipColD, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A461Fase, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13893FaseDescri, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += localUtil.ttoc( A4440HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += localUtil.ttoc( A4441HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A1525HisProKgr, 9, 2) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A1526HisProMtr, 9, 2) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A656ParCod, 4, 0) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A867ParCodNom, ";", ","), GXv_char6) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A566HisProTur, 1, 0) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 GXt_int8 = AV74Tiempom ;
                                 GXv_char6[0] = A461Fase ;
                                 GXv_char5[0] = A3610HisProLot ;
                                 GXv_int9[0] = A129BarCod ;
                                 GXv_int7[0] = A132BarCodReo ;
                                 GXv_char4[0] = A130BarCodPar ;
                                 GXv_int10[0] = A5605HisProTr2 ;
                                 GXv_int11[0] = GXt_int8 ;
                                 new app.tiemporeallector(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int9, GXv_int7, GXv_char4, GXv_int10, GXv_int11) ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.A461Fase = GXv_char6[0] ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.A3610HisProLot = GXv_char5[0] ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.A129BarCod = GXv_int9[0] ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.A132BarCodReo = GXv_int7[0] ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.A130BarCodPar = GXv_char4[0] ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.A5605HisProTr2 = GXv_int10[0] ;
                                 wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_int8 = GXv_int11[0] ;
                                 AV74Tiempom = GXt_int8 ;
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( AV74Tiempom, 4, 0) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A3612HisProReo, 1, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCIformedetalladoHdrsProduccionExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "MaqCod", "", "Código Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "MaqDsc", "", "Descripcion Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarNHdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HisProLot", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "CliCod", "", "Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarFecGen", "", "Fecha Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSer", "", "Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarTipArtDsc", "", "Tipo Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "BarTipColDsc", "", "TC", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "Fase", "", "Codigo Fase", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "FaseDescripcion", "", "Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HisProDTI", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HisProDTF", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HisProKgr", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HisProMtr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ParCod", "", "Paro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "ParCodNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HisProTur", "", "T", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Tiempom", "", "TReal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HisProReo", "", "Tipo Reoperado", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char6[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCIformedetalladoHdrsProduccionColumnsSelector", GXv_char6) ;
      wciformedetalladohdrsproduccionexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCIformedetalladoHdrsProduccionGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCIformedetalladoHdrsProduccionGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("WCIformedetalladoHdrsProduccionGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV146GXV1 = 1 ;
      while ( AV146GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV146GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV79FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV33TFMaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV34TFMaqCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV52TFMaqDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV53TFMaqDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV35TFBarNHdr = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV36TFBarNHdr_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT") == 0 )
         {
            AV77TFHisProLot = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT_SEL") == 0 )
         {
            AV78TFHisProLot_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV54TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV56TFCliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV57TFCliNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV94TFPedidoCliente = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV95TFPedidoCliente_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV58TFBarFecGen = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV60TFBarSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV61TFBarSer_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV62TFBarSerDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV63TFBarSerDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV90TFBarTipArtDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV91TFBarTipArtDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOLDSC") == 0 )
         {
            AV92TFBarTipColDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOLDSC_SEL") == 0 )
         {
            AV93TFBarTipColDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV37TFFase = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV38TFFase_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION") == 0 )
         {
            AV98TFFaseDescripcion = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDESCRIPCION_SEL") == 0 )
         {
            AV99TFFaseDescripcion_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV39TFHisProDTI = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV41TFHisProDTF = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV64TFHisProKgr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV65TFHisProKgr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV66TFHisProMtr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV67TFHisProMtr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV70TFParCod = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFParCod_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV75TFParCodNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV76TFParCodNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV72TFHisProTur = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFHisProTur_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROREO") == 0 )
         {
            AV82TFHisProReo = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV83TFHisProReo_To = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV43Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODINICIAL") == 0 )
         {
            AV44MaqCodInicial = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODFINAL") == 0 )
         {
            AV45MaqCodFinal = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPRODTI") == 0 )
         {
            AV46Hisprodti = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPRODTF") == 0 )
         {
            AV47Hisprodtf = localUtil.ctot( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROREO") == 0 )
         {
            AV80HisProReo = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PARCOD") == 0 )
         {
            AV81ParCod = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV146GXV1 = (int)(AV146GXV1+1) ;
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
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A13696BarNHdr = "" ;
      A3610HisProLot = "" ;
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A13868BarTipColD = "" ;
      A461Fase = "" ;
      A13893FaseDescri = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      A130BarCodPar = "" ;
      AV104Wciformedetalladohdrsproduccionds_1_filterfulltext = "" ;
      AV79FilterFullText = "" ;
      AV105Wciformedetalladohdrsproduccionds_2_tfmaqcod = "" ;
      AV33TFMaqCod = "" ;
      AV106Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel = "" ;
      AV34TFMaqCod_Sel = "" ;
      AV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc = "" ;
      AV52TFMaqDsc = "" ;
      AV108Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel = "" ;
      AV53TFMaqDsc_Sel = "" ;
      AV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr = "" ;
      AV35TFBarNHdr = "" ;
      AV110Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel = "" ;
      AV36TFBarNHdr_Sel = "" ;
      AV111Wciformedetalladohdrsproduccionds_8_tfhisprolot = "" ;
      AV77TFHisProLot = "" ;
      AV112Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel = "" ;
      AV78TFHisProLot_Sel = "" ;
      AV115Wciformedetalladohdrsproduccionds_12_tfclinom = "" ;
      AV56TFCliNom = "" ;
      AV116Wciformedetalladohdrsproduccionds_13_tfclinom_sel = "" ;
      AV57TFCliNom_Sel = "" ;
      AV117Wciformedetalladohdrsproduccionds_14_tfpedidocliente = "" ;
      AV94TFPedidoCliente = "" ;
      AV118Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel = "" ;
      AV95TFPedidoCliente_Sel = "" ;
      AV119Wciformedetalladohdrsproduccionds_16_tfbarfecgen = GXutil.nullDate() ;
      AV58TFBarFecGen = GXutil.nullDate() ;
      AV120Wciformedetalladohdrsproduccionds_17_tfbarser = "" ;
      AV60TFBarSer = "" ;
      AV121Wciformedetalladohdrsproduccionds_18_tfbarser_sel = "" ;
      AV61TFBarSer_Sel = "" ;
      AV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc = "" ;
      AV62TFBarSerDsc = "" ;
      AV123Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel = "" ;
      AV63TFBarSerDsc_Sel = "" ;
      AV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = "" ;
      AV90TFBarTipArtDsc = "" ;
      AV125Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel = "" ;
      AV91TFBarTipArtDsc_Sel = "" ;
      AV126Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc = "" ;
      AV92TFBarTipColDsc = "" ;
      AV127Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel = "" ;
      AV93TFBarTipColDsc_Sel = "" ;
      AV128Wciformedetalladohdrsproduccionds_25_tffase = "" ;
      AV37TFFase = "" ;
      AV129Wciformedetalladohdrsproduccionds_26_tffase_sel = "" ;
      AV38TFFase_Sel = "" ;
      AV130Wciformedetalladohdrsproduccionds_27_tffasedescripcion = "" ;
      AV98TFFaseDescripcion = "" ;
      AV131Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel = "" ;
      AV99TFFaseDescripcion_Sel = "" ;
      AV132Wciformedetalladohdrsproduccionds_29_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV39TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV133Wciformedetalladohdrsproduccionds_30_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV41TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV134Wciformedetalladohdrsproduccionds_31_tfhisprokgr = DecimalUtil.ZERO ;
      AV64TFHisProKgr = DecimalUtil.ZERO ;
      AV135Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV65TFHisProKgr_To = DecimalUtil.ZERO ;
      AV136Wciformedetalladohdrsproduccionds_33_tfhispromtr = DecimalUtil.ZERO ;
      AV66TFHisProMtr = DecimalUtil.ZERO ;
      AV137Wciformedetalladohdrsproduccionds_34_tfhispromtr_to = DecimalUtil.ZERO ;
      AV67TFHisProMtr_To = DecimalUtil.ZERO ;
      AV140Wciformedetalladohdrsproduccionds_37_tfparcodnom = "" ;
      AV75TFParCodNom = "" ;
      AV141Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel = "" ;
      AV76TFParCodNom_Sel = "" ;
      lV104Wciformedetalladohdrsproduccionds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV105Wciformedetalladohdrsproduccionds_2_tfmaqcod = "" ;
      lV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc = "" ;
      lV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr = "" ;
      lV111Wciformedetalladohdrsproduccionds_8_tfhisprolot = "" ;
      lV115Wciformedetalladohdrsproduccionds_12_tfclinom = "" ;
      lV120Wciformedetalladohdrsproduccionds_17_tfbarser = "" ;
      lV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc = "" ;
      lV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc = "" ;
      lV128Wciformedetalladohdrsproduccionds_25_tffase = "" ;
      lV140Wciformedetalladohdrsproduccionds_37_tfparcodnom = "" ;
      AV44MaqCodInicial = "" ;
      AV45MaqCodFinal = "" ;
      AV46Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV47Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV43Emprcod = "" ;
      A396EmprCod = "" ;
      P08LW2_A217BarTipArt = new short[1] ;
      P08LW2_n217BarTipArt = new boolean[] {false} ;
      P08LW2_A3612HisProReo = new byte[1] ;
      P08LW2_A566HisProTur = new byte[1] ;
      P08LW2_A867ParCodNom = new String[] {""} ;
      P08LW2_n867ParCodNom = new boolean[] {false} ;
      P08LW2_A656ParCod = new short[1] ;
      P08LW2_n656ParCod = new boolean[] {false} ;
      P08LW2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LW2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08LW2_A13711BarTipArtD = new String[] {""} ;
      P08LW2_n13711BarTipArtD = new boolean[] {false} ;
      P08LW2_A1652BarSerDsc = new String[] {""} ;
      P08LW2_A212BarSer = new String[] {""} ;
      P08LW2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08LW2_A279CliNom = new String[] {""} ;
      P08LW2_A252CliCod = new int[1] ;
      P08LW2_n252CliCod = new boolean[] {false} ;
      P08LW2_A3610HisProLot = new String[] {""} ;
      P08LW2_A13696BarNHdr = new String[] {""} ;
      P08LW2_A606MaqDsc = new String[] {""} ;
      P08LW2_n606MaqDsc = new boolean[] {false} ;
      P08LW2_A602MaqCod = new String[] {""} ;
      P08LW2_A129BarCod = new int[1] ;
      P08LW2_A132BarCodReo = new byte[1] ;
      P08LW2_A130BarCodPar = new String[] {""} ;
      P08LW2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08LW2_n4440HisProDTI = new boolean[] {false} ;
      P08LW2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08LW2_n4441HisProDTF = new boolean[] {false} ;
      P08LW2_A143BarDisNum = new String[] {""} ;
      P08LW2_A4812BarEncCli = new String[] {""} ;
      P08LW2_A218BarTipCol = new byte[1] ;
      P08LW2_A461Fase = new String[] {""} ;
      P08LW2_A396EmprCod = new String[] {""} ;
      P08LW2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08LW2_A561HisProLin = new int[1] ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A558HisProFec = GXutil.nullDate() ;
      GXv_char3 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wciformedetalladohdrsproduccionexportcsv__default(),
         new Object[] {
             new Object[] {
            P08LW2_A217BarTipArt, P08LW2_n217BarTipArt, P08LW2_A3612HisProReo, P08LW2_A566HisProTur, P08LW2_A867ParCodNom, P08LW2_n867ParCodNom, P08LW2_A656ParCod, P08LW2_n656ParCod, P08LW2_A1526HisProMtr, P08LW2_A1525HisProKgr,
            P08LW2_A13711BarTipArtD, P08LW2_n13711BarTipArtD, P08LW2_A1652BarSerDsc, P08LW2_A212BarSer, P08LW2_A159BarFecGen, P08LW2_A279CliNom, P08LW2_A252CliCod, P08LW2_n252CliCod, P08LW2_A3610HisProLot, P08LW2_A13696BarNHdr,
            P08LW2_A606MaqDsc, P08LW2_n606MaqDsc, P08LW2_A602MaqCod, P08LW2_A129BarCod, P08LW2_A132BarCodReo, P08LW2_A130BarCodPar, P08LW2_A4440HisProDTI, P08LW2_n4440HisProDTI, P08LW2_A4441HisProDTF, P08LW2_n4441HisProDTF,
            P08LW2_A143BarDisNum, P08LW2_A4812BarEncCli, P08LW2_A218BarTipCol, P08LW2_A461Fase, P08LW2_A396EmprCod, P08LW2_A558HisProFec, P08LW2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A566HisProTur ;
   private byte A132BarCodReo ;
   private byte A3612HisProReo ;
   private byte AV142Wciformedetalladohdrsproduccionds_39_tfhisprotur ;
   private byte AV72TFHisProTur ;
   private byte AV143Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ;
   private byte AV73TFHisProTur_To ;
   private byte AV144Wciformedetalladohdrsproduccionds_41_tfhisproreo ;
   private byte AV82TFHisProReo ;
   private byte AV145Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ;
   private byte AV83TFHisProReo_To ;
   private byte AV80HisProReo ;
   private byte A218BarTipCol ;
   private byte GXv_int7[] ;
   private short gxcookieaux ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short AV138Wciformedetalladohdrsproduccionds_35_tfparcod ;
   private short AV70TFParCod ;
   private short AV139Wciformedetalladohdrsproduccionds_36_tfparcod_to ;
   private short AV71TFParCod_To ;
   private short AV81ParCod ;
   private short AV28OrderedBy ;
   private short A217BarTipArt ;
   private short AV74Tiempom ;
   private short GXt_int8 ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int AV113Wciformedetalladohdrsproduccionds_10_tfclicod ;
   private int AV54TFCliCod ;
   private int AV114Wciformedetalladohdrsproduccionds_11_tfclicod_to ;
   private int AV55TFCliCod_To ;
   private int A561HisProLin ;
   private int GXv_int9[] ;
   private int AV146GXV1 ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV134Wciformedetalladohdrsproduccionds_31_tfhisprokgr ;
   private java.math.BigDecimal AV64TFHisProKgr ;
   private java.math.BigDecimal AV135Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ;
   private java.math.BigDecimal AV65TFHisProKgr_To ;
   private java.math.BigDecimal AV136Wciformedetalladohdrsproduccionds_33_tfhispromtr ;
   private java.math.BigDecimal AV66TFHisProMtr ;
   private java.math.BigDecimal AV137Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ;
   private java.math.BigDecimal AV67TFHisProMtr_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A13696BarNHdr ;
   private String A3610HisProLot ;
   private String A279CliNom ;
   private String A13878PedidoClie ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A13868BarTipColD ;
   private String A461Fase ;
   private String A13893FaseDescri ;
   private String A867ParCodNom ;
   private String A130BarCodPar ;
   private String AV105Wciformedetalladohdrsproduccionds_2_tfmaqcod ;
   private String AV33TFMaqCod ;
   private String AV106Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ;
   private String AV34TFMaqCod_Sel ;
   private String AV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc ;
   private String AV52TFMaqDsc ;
   private String AV108Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ;
   private String AV53TFMaqDsc_Sel ;
   private String AV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr ;
   private String AV35TFBarNHdr ;
   private String AV110Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ;
   private String AV36TFBarNHdr_Sel ;
   private String AV111Wciformedetalladohdrsproduccionds_8_tfhisprolot ;
   private String AV77TFHisProLot ;
   private String AV112Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ;
   private String AV78TFHisProLot_Sel ;
   private String AV115Wciformedetalladohdrsproduccionds_12_tfclinom ;
   private String AV56TFCliNom ;
   private String AV116Wciformedetalladohdrsproduccionds_13_tfclinom_sel ;
   private String AV57TFCliNom_Sel ;
   private String AV117Wciformedetalladohdrsproduccionds_14_tfpedidocliente ;
   private String AV94TFPedidoCliente ;
   private String AV118Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ;
   private String AV95TFPedidoCliente_Sel ;
   private String AV120Wciformedetalladohdrsproduccionds_17_tfbarser ;
   private String AV60TFBarSer ;
   private String AV121Wciformedetalladohdrsproduccionds_18_tfbarser_sel ;
   private String AV61TFBarSer_Sel ;
   private String AV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc ;
   private String AV62TFBarSerDsc ;
   private String AV123Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ;
   private String AV63TFBarSerDsc_Sel ;
   private String AV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ;
   private String AV90TFBarTipArtDsc ;
   private String AV125Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ;
   private String AV91TFBarTipArtDsc_Sel ;
   private String AV126Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ;
   private String AV92TFBarTipColDsc ;
   private String AV127Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ;
   private String AV93TFBarTipColDsc_Sel ;
   private String AV128Wciformedetalladohdrsproduccionds_25_tffase ;
   private String AV37TFFase ;
   private String AV129Wciformedetalladohdrsproduccionds_26_tffase_sel ;
   private String AV38TFFase_Sel ;
   private String AV130Wciformedetalladohdrsproduccionds_27_tffasedescripcion ;
   private String AV98TFFaseDescripcion ;
   private String AV131Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ;
   private String AV99TFFaseDescripcion_Sel ;
   private String AV140Wciformedetalladohdrsproduccionds_37_tfparcodnom ;
   private String AV75TFParCodNom ;
   private String AV141Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ;
   private String AV76TFParCodNom_Sel ;
   private String scmdbuf ;
   private String lV105Wciformedetalladohdrsproduccionds_2_tfmaqcod ;
   private String lV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc ;
   private String lV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr ;
   private String lV111Wciformedetalladohdrsproduccionds_8_tfhisprolot ;
   private String lV115Wciformedetalladohdrsproduccionds_12_tfclinom ;
   private String lV120Wciformedetalladohdrsproduccionds_17_tfbarser ;
   private String lV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc ;
   private String lV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ;
   private String lV128Wciformedetalladohdrsproduccionds_25_tffase ;
   private String lV140Wciformedetalladohdrsproduccionds_37_tfparcodnom ;
   private String AV44MaqCodInicial ;
   private String AV45MaqCodFinal ;
   private String AV43Emprcod ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV132Wciformedetalladohdrsproduccionds_29_tfhisprodti ;
   private java.util.Date AV39TFHisProDTI ;
   private java.util.Date AV133Wciformedetalladohdrsproduccionds_30_tfhisprodtf ;
   private java.util.Date AV41TFHisProDTF ;
   private java.util.Date AV46Hisprodti ;
   private java.util.Date AV47Hisprodtf ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV119Wciformedetalladohdrsproduccionds_16_tfbarfecgen ;
   private java.util.Date AV58TFBarFecGen ;
   private java.util.Date A558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n217BarTipArt ;
   private boolean n867ParCodNom ;
   private boolean n656ParCod ;
   private boolean n13711BarTipArtD ;
   private boolean n252CliCod ;
   private boolean n606MaqDsc ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV104Wciformedetalladohdrsproduccionds_1_filterfulltext ;
   private String AV79FilterFullText ;
   private String lV104Wciformedetalladohdrsproduccionds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P08LW2_A217BarTipArt ;
   private boolean[] P08LW2_n217BarTipArt ;
   private byte[] P08LW2_A3612HisProReo ;
   private byte[] P08LW2_A566HisProTur ;
   private String[] P08LW2_A867ParCodNom ;
   private boolean[] P08LW2_n867ParCodNom ;
   private short[] P08LW2_A656ParCod ;
   private boolean[] P08LW2_n656ParCod ;
   private java.math.BigDecimal[] P08LW2_A1526HisProMtr ;
   private java.math.BigDecimal[] P08LW2_A1525HisProKgr ;
   private String[] P08LW2_A13711BarTipArtD ;
   private boolean[] P08LW2_n13711BarTipArtD ;
   private String[] P08LW2_A1652BarSerDsc ;
   private String[] P08LW2_A212BarSer ;
   private java.util.Date[] P08LW2_A159BarFecGen ;
   private String[] P08LW2_A279CliNom ;
   private int[] P08LW2_A252CliCod ;
   private boolean[] P08LW2_n252CliCod ;
   private String[] P08LW2_A3610HisProLot ;
   private String[] P08LW2_A13696BarNHdr ;
   private String[] P08LW2_A606MaqDsc ;
   private boolean[] P08LW2_n606MaqDsc ;
   private String[] P08LW2_A602MaqCod ;
   private int[] P08LW2_A129BarCod ;
   private byte[] P08LW2_A132BarCodReo ;
   private String[] P08LW2_A130BarCodPar ;
   private java.util.Date[] P08LW2_A4440HisProDTI ;
   private boolean[] P08LW2_n4440HisProDTI ;
   private java.util.Date[] P08LW2_A4441HisProDTF ;
   private boolean[] P08LW2_n4441HisProDTF ;
   private String[] P08LW2_A143BarDisNum ;
   private String[] P08LW2_A4812BarEncCli ;
   private byte[] P08LW2_A218BarTipCol ;
   private String[] P08LW2_A461Fase ;
   private String[] P08LW2_A396EmprCod ;
   private java.util.Date[] P08LW2_A558HisProFec ;
   private int[] P08LW2_A561HisProLin ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class wciformedetalladohdrsproduccionexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08LW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV106Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel ,
                                          String AV105Wciformedetalladohdrsproduccionds_2_tfmaqcod ,
                                          String AV108Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel ,
                                          String AV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc ,
                                          String AV110Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel ,
                                          String AV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr ,
                                          String AV112Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel ,
                                          String AV111Wciformedetalladohdrsproduccionds_8_tfhisprolot ,
                                          int AV113Wciformedetalladohdrsproduccionds_10_tfclicod ,
                                          int AV114Wciformedetalladohdrsproduccionds_11_tfclicod_to ,
                                          String AV116Wciformedetalladohdrsproduccionds_13_tfclinom_sel ,
                                          String AV115Wciformedetalladohdrsproduccionds_12_tfclinom ,
                                          java.util.Date AV119Wciformedetalladohdrsproduccionds_16_tfbarfecgen ,
                                          String AV121Wciformedetalladohdrsproduccionds_18_tfbarser_sel ,
                                          String AV120Wciformedetalladohdrsproduccionds_17_tfbarser ,
                                          String AV123Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel ,
                                          String AV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc ,
                                          String AV125Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel ,
                                          String AV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc ,
                                          String AV129Wciformedetalladohdrsproduccionds_26_tffase_sel ,
                                          String AV128Wciformedetalladohdrsproduccionds_25_tffase ,
                                          java.util.Date AV132Wciformedetalladohdrsproduccionds_29_tfhisprodti ,
                                          java.util.Date AV133Wciformedetalladohdrsproduccionds_30_tfhisprodtf ,
                                          java.math.BigDecimal AV134Wciformedetalladohdrsproduccionds_31_tfhisprokgr ,
                                          java.math.BigDecimal AV135Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to ,
                                          java.math.BigDecimal AV136Wciformedetalladohdrsproduccionds_33_tfhispromtr ,
                                          java.math.BigDecimal AV137Wciformedetalladohdrsproduccionds_34_tfhispromtr_to ,
                                          short AV138Wciformedetalladohdrsproduccionds_35_tfparcod ,
                                          short AV139Wciformedetalladohdrsproduccionds_36_tfparcod_to ,
                                          String AV141Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel ,
                                          String AV140Wciformedetalladohdrsproduccionds_37_tfparcodnom ,
                                          byte AV142Wciformedetalladohdrsproduccionds_39_tfhisprotur ,
                                          byte AV143Wciformedetalladohdrsproduccionds_40_tfhisprotur_to ,
                                          byte AV144Wciformedetalladohdrsproduccionds_41_tfhisproreo ,
                                          byte AV145Wciformedetalladohdrsproduccionds_42_tfhisproreo_to ,
                                          String AV44MaqCodInicial ,
                                          String AV45MaqCodFinal ,
                                          java.util.Date AV46Hisprodti ,
                                          java.util.Date AV47Hisprodtf ,
                                          byte AV80HisProReo ,
                                          short AV81ParCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A3610HisProLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          byte A566HisProTur ,
                                          byte A3612HisProReo ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV104Wciformedetalladohdrsproduccionds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13878PedidoClie ,
                                          String A13868BarTipColD ,
                                          String A13893FaseDescri ,
                                          String AV118Wciformedetalladohdrsproduccionds_15_tfpedidocliente_sel ,
                                          String AV117Wciformedetalladohdrsproduccionds_14_tfpedidocliente ,
                                          String AV127Wciformedetalladohdrsproduccionds_24_tfbartipcoldsc_sel ,
                                          String AV126Wciformedetalladohdrsproduccionds_23_tfbartipcoldsc ,
                                          String AV131Wciformedetalladohdrsproduccionds_28_tffasedescripcion_sel ,
                                          String AV130Wciformedetalladohdrsproduccionds_27_tffasedescripcion ,
                                          String AV43Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[42];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T3.BarTipArt AS BarTipArt, T1.HisProReo, T1.HisProTur, T6.ParCodNom, T1.ParCod, T1.HisProMtr, T1.HisProKgr, T5.TipArtDsc AS BarTipArtD, T3.BarSerDsc, T3.BarSer," ;
      scmdbuf += " T3.BarFecGen, T4.CliNom, T3.CliCod, T1.HisProLot, RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T3.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T3.BarCodPar AS BarNHdr, T2.MaqDsc, T1.MaqCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProDTI, T1.HisProDTF, T3.BarDisNum, T3.BarEncCli, T3.BarTipCol," ;
      scmdbuf += " T1.Fase, T1.EmprCod, T1.HisProFec, T1.HisProLin FROM (((((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN" ;
      scmdbuf += " TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T4.CliCod = T3.CliCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T3.BarTipArt) LEFT JOIN TXPCODPAR T6 ON T6.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T6.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV105Wciformedetalladohdrsproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Wciformedetalladohdrsproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV107Wciformedetalladohdrsproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wciformedetalladohdrsproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV109Wciformedetalladohdrsproduccionds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Wciformedetalladohdrsproduccionds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV111Wciformedetalladohdrsproduccionds_8_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Wciformedetalladohdrsproduccionds_9_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV113Wciformedetalladohdrsproduccionds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV114Wciformedetalladohdrsproduccionds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV115Wciformedetalladohdrsproduccionds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Wciformedetalladohdrsproduccionds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV119Wciformedetalladohdrsproduccionds_16_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV120Wciformedetalladohdrsproduccionds_17_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Wciformedetalladohdrsproduccionds_18_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV122Wciformedetalladohdrsproduccionds_19_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Wciformedetalladohdrsproduccionds_20_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Wciformedetalladohdrsproduccionds_21_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Wciformedetalladohdrsproduccionds_22_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.TipArtDsc = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV128Wciformedetalladohdrsproduccionds_25_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Wciformedetalladohdrsproduccionds_26_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV132Wciformedetalladohdrsproduccionds_29_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int14[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV133Wciformedetalladohdrsproduccionds_30_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int14[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Wciformedetalladohdrsproduccionds_31_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int14[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Wciformedetalladohdrsproduccionds_32_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int14[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Wciformedetalladohdrsproduccionds_33_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int14[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Wciformedetalladohdrsproduccionds_34_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int14[27] = (byte)(1) ;
      }
      if ( ! (0==AV138Wciformedetalladohdrsproduccionds_35_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int14[28] = (byte)(1) ;
      }
      if ( ! (0==AV139Wciformedetalladohdrsproduccionds_36_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int14[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV140Wciformedetalladohdrsproduccionds_37_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Wciformedetalladohdrsproduccionds_38_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.ParCodNom = ?)");
      }
      else
      {
         GXv_int14[31] = (byte)(1) ;
      }
      if ( ! (0==AV142Wciformedetalladohdrsproduccionds_39_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int14[32] = (byte)(1) ;
      }
      if ( ! (0==AV143Wciformedetalladohdrsproduccionds_40_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int14[33] = (byte)(1) ;
      }
      if ( ! (0==AV144Wciformedetalladohdrsproduccionds_41_tfhisproreo) )
      {
         addWhere(sWhereString, "(T1.HisProReo >= ?)");
      }
      else
      {
         GXv_int14[34] = (byte)(1) ;
      }
      if ( ! (0==AV145Wciformedetalladohdrsproduccionds_42_tfhisproreo_to) )
      {
         addWhere(sWhereString, "(T1.HisProReo <= ?)");
      }
      else
      {
         GXv_int14[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV44MaqCodInicial)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod >= ?)");
      }
      else
      {
         GXv_int14[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45MaqCodFinal)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod <= ?)");
      }
      else
      {
         GXv_int14[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV46Hisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int14[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV47Hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int14[39] = (byte)(1) ;
      }
      if ( ! ( AV80HisProReo == 9 ) )
      {
         addWhere(sWhereString, "(T1.HisProReo = ?)");
      }
      else
      {
         GXv_int14[40] = (byte)(1) ;
      }
      if ( AV81ParCod >= 0 )
      {
         addWhere(sWhereString, "(T1.ParCod = ?)");
      }
      else
      {
         GXv_int14[41] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLot" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLot DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarFecGen" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarFecGen DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSer" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.BarSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ParCod" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ParCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T6.ParCodNom" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.ParCodNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProReo" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProReo DESC" ;
      }
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_P08LW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).byteValue() , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] , (java.util.Date)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).byteValue() , ((Number) dynConstraints[61]).byteValue() , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08LW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 26);
               ((String[]) buf[13])[0] = rslt.getString(10, 16);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(14, 10);
               ((String[]) buf[19])[0] = rslt.getString(15, 11);
               ((String[]) buf[20])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(17, 6);
               ((int[]) buf[23])[0] = rslt.getInt(18);
               ((byte[]) buf[24])[0] = rslt.getByte(19);
               ((String[]) buf[25])[0] = rslt.getString(20, 1);
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(21);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(22);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(23, 8);
               ((String[]) buf[31])[0] = rslt.getString(24, 20);
               ((byte[]) buf[32])[0] = rslt.getByte(25);
               ((String[]) buf[33])[0] = rslt.getString(26, 8);
               ((String[]) buf[34])[0] = rslt.getString(27, 3);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(28);
               ((int[]) buf[36])[0] = rslt.getInt(29);
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
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 10);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[55]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 16);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[64], false);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[65], false);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[70]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[76]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[77]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 6);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 6);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[80], false);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[81], false);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[82]).byteValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[83]).shortValue());
               }
               return;
      }
   }

}

