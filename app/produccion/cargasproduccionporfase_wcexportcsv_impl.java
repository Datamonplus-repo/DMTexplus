package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cargasproduccionporfase_wcexportcsv_impl extends GXWebProcedure
{
   public cargasproduccionporfase_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "CargasProduccionporFase_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.CargasProduccionporFase_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Produccion.CargasProduccionporFase_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre.Cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disp.Cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Sit.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artículo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "TC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color.Cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs.", "") : "") ;
      if ( AV44IsAuthorizedBarMtr )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts.", "") : "") ;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ult.Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Sig.Fase", "") : "") ;
      if ( AV47IsAuthorizedAlbRLoc )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Local", "") : "") ;
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
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A153BarFasEst) ,
                                           AV55TFBarFasEst_Sels ,
                                           AV53TFMaqCodBis_Sel ,
                                           AV52TFMaqCodBis ,
                                           Integer.valueOf(AV55TFBarFasEst_Sels.size()) ,
                                           Integer.valueOf(AV56TFCliCod) ,
                                           Integer.valueOf(AV57TFCliCod_To) ,
                                           AV59TFCliNom_Sel ,
                                           AV58TFCliNom ,
                                           AV61TFBarNHdr_Sel ,
                                           AV60TFBarNHdr ,
                                           Byte.valueOf(AV62TFBarSit) ,
                                           Byte.valueOf(AV63TFBarSit_To) ,
                                           AV65TFBarSer_Sel ,
                                           AV64TFBarSer ,
                                           AV67TFBarSerDsc_Sel ,
                                           AV66TFBarSerDsc ,
                                           AV69TFBarColNom_Sel ,
                                           AV68TFBarColNom ,
                                           Integer.valueOf(AV70TFBarColNum) ,
                                           Integer.valueOf(AV71TFBarColNum_To) ,
                                           Byte.valueOf(AV72TFBarTipCol) ,
                                           Byte.valueOf(AV73TFBarTipCol_To) ,
                                           AV75TFBarNomCli_Sel ,
                                           AV74TFBarNomCli ,
                                           AV76TFBarKgm ,
                                           AV77TFBarKgm_To ,
                                           AV78TFBarMtr ,
                                           AV79TFBarMtr_To ,
                                           Short.valueOf(AV86TFBarOrdLin) ,
                                           Short.valueOf(AV87TFBarOrdLin_To) ,
                                           AV89TFBarDibCli_Sel ,
                                           AV88TFBarDibCli ,
                                           Short.valueOf(AV90TFBarAcaAnh) ,
                                           Short.valueOf(AV91TFBarAcaAnh_To) ,
                                           A603MaqCodBis ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A218BarTipCol) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A1798BarDibCli ,
                                           Short.valueOf(A4466BarAcaAnh) ,
                                           Short.valueOf(AV39OrderedBy) ,
                                           Boolean.valueOf(AV40OrderedDsc) ,
                                           AV41FilterFullText ,
                                           A13696BarNHdr ,
                                           A151BarFasCod ,
                                           Short.valueOf(A154BarFasLin) ,
                                           A1955BarFasSig ,
                                           AV81TFBarFasCod_Sel ,
                                           AV80TFBarFasCod ,
                                           Short.valueOf(AV82TFBarFasLin) ,
                                           Short.valueOf(AV83TFBarFasLin_To) ,
                                           AV85TFBarFasSig_Sel ,
                                           AV84TFBarFasSig ,
                                           Integer.valueOf(AV30Clicod) ,
                                           Integer.valueOf(AV31Clicod_to) ,
                                           A159BarFecGen ,
                                           AV32BarFecgen ,
                                           AV33BarFecGen_to ,
                                           Byte.valueOf(AV34BarSIt) ,
                                           Byte.valueOf(AV35Barsit_to) ,
                                           Byte.valueOf(AV36BarfasEst) ,
                                           Byte.valueOf(AV37BarFasEst_to) ,
                                           Short.valueOf(AV38BarAcaAnh) ,
                                           AV28Emprcod ,
                                           AV29Fascod ,
                                           A396EmprCod ,
                                           A457FasCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV41FilterFullText = GXutil.concat( GXutil.rtrim( AV41FilterFullText), "%", "") ;
      lV80TFBarFasCod = GXutil.padr( GXutil.rtrim( AV80TFBarFasCod), 8, "%") ;
      lV84TFBarFasSig = GXutil.padr( GXutil.rtrim( AV84TFBarFasSig), 8, "%") ;
      lV52TFMaqCodBis = GXutil.padr( GXutil.rtrim( AV52TFMaqCodBis), 6, "%") ;
      lV58TFCliNom = GXutil.padr( GXutil.rtrim( AV58TFCliNom), 30, "%") ;
      lV60TFBarNHdr = GXutil.padr( GXutil.rtrim( AV60TFBarNHdr), 11, "%") ;
      lV64TFBarSer = GXutil.padr( GXutil.rtrim( AV64TFBarSer), 16, "%") ;
      lV66TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV66TFBarSerDsc), 26, "%") ;
      lV68TFBarColNom = GXutil.padr( GXutil.rtrim( AV68TFBarColNom), 13, "%") ;
      lV74TFBarNomCli = GXutil.padr( GXutil.rtrim( AV74TFBarNomCli), 13, "%") ;
      lV88TFBarDibCli = GXutil.padr( GXutil.rtrim( AV88TFBarDibCli), 16, "%") ;
      /* Using cursor P0AAX10 */
      pr_default.execute(0, new Object[] {AV28Emprcod, AV29Fascod, AV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, lV41FilterFullText, AV81TFBarFasCod_Sel, AV80TFBarFasCod, lV80TFBarFasCod, AV81TFBarFasCod_Sel, AV81TFBarFasCod_Sel, Short.valueOf(AV82TFBarFasLin), Short.valueOf(AV82TFBarFasLin), Short.valueOf(AV83TFBarFasLin_To), Short.valueOf(AV83TFBarFasLin_To), AV85TFBarFasSig_Sel, AV84TFBarFasSig, lV84TFBarFasSig, AV85TFBarFasSig_Sel, AV85TFBarFasSig_Sel, Integer.valueOf(AV30Clicod), Integer.valueOf(AV31Clicod_to), AV32BarFecgen, AV33BarFecGen_to, Byte.valueOf(AV34BarSIt), Byte.valueOf(AV35Barsit_to), Byte.valueOf(AV36BarfasEst), Byte.valueOf(AV37BarFasEst_to), Short.valueOf(AV38BarAcaAnh), Short.valueOf(AV38BarAcaAnh), lV52TFMaqCodBis, AV53TFMaqCodBis_Sel, Integer.valueOf(AV56TFCliCod), Integer.valueOf(AV57TFCliCod_To), lV58TFCliNom, AV59TFCliNom_Sel, lV60TFBarNHdr, AV61TFBarNHdr_Sel, Byte.valueOf(AV62TFBarSit), Byte.valueOf(AV63TFBarSit_To), lV64TFBarSer, AV65TFBarSer_Sel, lV66TFBarSerDsc, AV67TFBarSerDsc_Sel, lV68TFBarColNom, AV69TFBarColNom_Sel, Integer.valueOf(AV70TFBarColNum), Integer.valueOf(AV71TFBarColNum_To), Byte.valueOf(AV72TFBarTipCol), Byte.valueOf(AV73TFBarTipCol_To), lV74TFBarNomCli, AV75TFBarNomCli_Sel, AV76TFBarKgm, AV77TFBarKgm_To, AV78TFBarMtr, AV79TFBarMtr_To, Short.valueOf(AV86TFBarOrdLin), Short.valueOf(AV87TFBarOrdLin_To), lV88TFBarDibCli, AV89TFBarDibCli_Sel, Short.valueOf(AV90TFBarAcaAnh), Short.valueOf(AV91TFBarAcaAnh_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A159BarFecGen = P0AAX10_A159BarFecGen[0] ;
         A457FasCod = P0AAX10_A457FasCod[0] ;
         A396EmprCod = P0AAX10_A396EmprCod[0] ;
         A4466BarAcaAnh = P0AAX10_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P0AAX10_A1798BarDibCli[0] ;
         A194BarOrdLin = P0AAX10_A194BarOrdLin[0] ;
         A1234BarNomCli = P0AAX10_A1234BarNomCli[0] ;
         A218BarTipCol = P0AAX10_A218BarTipCol[0] ;
         A136BarColNum = P0AAX10_A136BarColNum[0] ;
         A135BarColNom = P0AAX10_A135BarColNom[0] ;
         A1652BarSerDsc = P0AAX10_A1652BarSerDsc[0] ;
         A212BarSer = P0AAX10_A212BarSer[0] ;
         A213BarSit = P0AAX10_A213BarSit[0] ;
         A13696BarNHdr = P0AAX10_A13696BarNHdr[0] ;
         A279CliNom = P0AAX10_A279CliNom[0] ;
         A252CliCod = P0AAX10_A252CliCod[0] ;
         n252CliCod = P0AAX10_n252CliCod[0] ;
         A153BarFasEst = P0AAX10_A153BarFasEst[0] ;
         A603MaqCodBis = P0AAX10_A603MaqCodBis[0] ;
         A4812BarEncCli = P0AAX10_A4812BarEncCli[0] ;
         A143BarDisNum = P0AAX10_A143BarDisNum[0] ;
         A1955BarFasSig = P0AAX10_A1955BarFasSig[0] ;
         n1955BarFasSig = P0AAX10_n1955BarFasSig[0] ;
         A154BarFasLin = P0AAX10_A154BarFasLin[0] ;
         n154BarFasLin = P0AAX10_n154BarFasLin[0] ;
         A151BarFasCod = P0AAX10_A151BarFasCod[0] ;
         n151BarFasCod = P0AAX10_n151BarFasCod[0] ;
         A184BarMtr = P0AAX10_A184BarMtr[0] ;
         A166BarKgm = P0AAX10_A166BarKgm[0] ;
         A129BarCod = P0AAX10_A129BarCod[0] ;
         A132BarCodReo = P0AAX10_A132BarCodReo[0] ;
         A130BarCodPar = P0AAX10_A130BarCodPar[0] ;
         A758ProCod = P0AAX10_A758ProCod[0] ;
         A159BarFecGen = P0AAX10_A159BarFecGen[0] ;
         A4466BarAcaAnh = P0AAX10_A4466BarAcaAnh[0] ;
         A1798BarDibCli = P0AAX10_A1798BarDibCli[0] ;
         A1234BarNomCli = P0AAX10_A1234BarNomCli[0] ;
         A218BarTipCol = P0AAX10_A218BarTipCol[0] ;
         A136BarColNum = P0AAX10_A136BarColNum[0] ;
         A135BarColNom = P0AAX10_A135BarColNom[0] ;
         A1652BarSerDsc = P0AAX10_A1652BarSerDsc[0] ;
         A212BarSer = P0AAX10_A212BarSer[0] ;
         A213BarSit = P0AAX10_A213BarSit[0] ;
         A13696BarNHdr = P0AAX10_A13696BarNHdr[0] ;
         A252CliCod = P0AAX10_A252CliCod[0] ;
         n252CliCod = P0AAX10_n252CliCod[0] ;
         A4812BarEncCli = P0AAX10_A4812BarEncCli[0] ;
         A143BarDisNum = P0AAX10_A143BarDisNum[0] ;
         A279CliNom = P0AAX10_A279CliNom[0] ;
         A1955BarFasSig = P0AAX10_A1955BarFasSig[0] ;
         n1955BarFasSig = P0AAX10_n1955BarFasSig[0] ;
         A154BarFasLin = P0AAX10_A154BarFasLin[0] ;
         n154BarFasLin = P0AAX10_n154BarFasLin[0] ;
         A151BarFasCod = P0AAX10_A151BarFasCod[0] ;
         n151BarFasCod = P0AAX10_n151BarFasCod[0] ;
         A184BarMtr = P0AAX10_A184BarMtr[0] ;
         A166BarKgm = P0AAX10_A166BarKgm[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV42Sel, ";", ","), GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( A153BarFasEst == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Pendiente", "") ;
            }
            else if ( A153BarFasEst == 1 )
            {
               AV14TextFileLine += httpContext.getMessage( "En Proceso (Fase Ini)", "") ;
            }
            else if ( A153BarFasEst == 2 )
            {
               AV14TextFileLine += httpContext.getMessage( "En Proceso  (Fase Fin)", "") ;
            }
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            if ( GXutil.strcmp(A4812BarEncCli, " ") != 0 )
            {
               AV43BarEncCli = A4812BarEncCli ;
            }
            else
            {
               AV43BarEncCli = A143BarDisNum ;
            }
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV43BarEncCli, ";", ","), GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A213BarSit, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A166BarKgm, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A184BarMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV45FasDscLast ;
            GXv_char3[0] = GXt_char2 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A151BarFasCod, GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV45FasDscLast = GXt_char2 ;
            AV45FasDscLast = ((GXutil.strcmp("", A151BarFasCod)==0) ? " " : AV45FasDscLast) ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV45FasDscLast, ";", ","), GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV46FasdscNext ;
            GXv_char3[0] = GXt_char2 ;
            new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1955BarFasSig, GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV46FasdscNext = GXt_char2 ;
            AV46FasdscNext = ((GXutil.strcmp("", A1955BarFasSig)==0) ? "" : AV46FasdscNext) ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV46FasdscNext, ";", ","), GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            if ( ( AV95Rioplatense.doubleValue() == 1 ) || ( AV96Carvitin.doubleValue() == 1 ) )
            {
               GXt_char2 = AV48AlbRLoc ;
               GXv_char3[0] = GXt_char2 ;
               new app.produccion.recuperalocalizacionalbr(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_char3) ;
               cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV48AlbRLoc = GXt_char2 ;
            }
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV48AlbRLoc, ";", ","), GXv_char3) ;
            cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      AV44IsAuthorizedBarMtr = (boolean)(((AV97Fio.doubleValue()==0))) ;
      AV47IsAuthorizedAlbRLoc = (boolean)(((AV97Fio.doubleValue()==0))) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=CargasProduccionporFase_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Sel", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCodBis", "", "Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      if ( AV97Fio.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HisProNFusos", "", "Nro.Fusos", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarFasEst", "", "Estado Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre.Cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarEncCli", "", "Disp.Cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNHdr", "", "Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSit", "", "Sit.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSer", "", "Artículo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSerDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarColNum", "", "Número", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarTipCol", "", "TC", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNomCli", "", "Color.Cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarKgm", "", "Kgs.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      if ( AV97Fio.doubleValue() == 0 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarMtr", "", "Mts.", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarFasCod", "", "", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarFasLin", "", "#Ult.Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&FasDscLast", "", "Ult.Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarFasSig", "", "", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&FasdscNext", "", "Sig.Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarOrdLin", "", "# Act", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&FasDscAnt", "", "Fas.Ant", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Abierta", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      if ( ( AV98Tintest.doubleValue() == 1 ) || ( AV97Fio.doubleValue() == 1 ) )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarDibCli", "", "Dibujo", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      if ( AV97Fio.doubleValue() == 0 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Estado", "", "Estado", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      if ( AV97Fio.doubleValue() == 0 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&AlbRFen", "", "Fecha Entrada", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      if ( AV99Cnoenc.doubleValue() == 1 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarAcaAnh", "", "Caderno", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      }
      if ( AV97Fio.doubleValue() == 0 )
      {
         GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&AlbRLoc", "", "Local", true, "") ;
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
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.CargasProduccionporFase_WCColumnsSelector", GXv_char3) ;
      cargasproduccionporfase_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.CargasProduccionporFase_WCGridState"), "") == 0 )
      {
         AV50GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.CargasProduccionporFase_WCGridState"), null, null);
      }
      else
      {
         AV50GridState.fromxml(AV19Session.getValue("Produccion.CargasProduccionporFase_WCGridState"), null, null);
      }
      AV39OrderedBy = AV50GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV40OrderedDsc = AV50GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV50GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV1));
         if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV41FilterFullText = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV52TFMaqCodBis = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV53TFMaqCodBis_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASEST_SEL") == 0 )
         {
            AV54TFBarFasEst_SelsJson = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV55TFBarFasEst_Sels.fromJSonString(AV54TFBarFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV56TFCliCod = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFCliCod_To = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV58TFCliNom = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV59TFCliNom_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV60TFBarNHdr = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV61TFBarNHdr_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV62TFBarSit = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFBarSit_To = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV64TFBarSer = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV65TFBarSer_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV66TFBarSerDsc = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV67TFBarSerDsc_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV68TFBarColNom = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV69TFBarColNom_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV70TFBarColNum = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFBarColNum_To = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOL") == 0 )
         {
            AV72TFBarTipCol = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFBarTipCol_To = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV74TFBarNomCli = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV75TFBarNomCli_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV76TFBarKgm = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFBarKgm_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV78TFBarMtr = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV79TFBarMtr_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV80TFBarFasCod = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV81TFBarFasCod_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASLIN") == 0 )
         {
            AV82TFBarFasLin = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV83TFBarFasLin_To = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV84TFBarFasSig = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV85TFBarFasSig_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV86TFBarOrdLin = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV87TFBarOrdLin_To = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDIBCLI") == 0 )
         {
            AV88TFBarDibCli = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDIBCLI_SEL") == 0 )
         {
            AV89TFBarDibCli_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAANH") == 0 )
         {
            AV90TFBarAcaAnh = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV91TFBarAcaAnh_To = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASCOD") == 0 )
         {
            AV29Fascod = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV30Clicod = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV31Clicod_to = (int)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV32BarFecgen = localUtil.ctod( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV33BarFecGen_to = localUtil.ctod( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV34BarSIt = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV35Barsit_to = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFASEST") == 0 )
         {
            AV36BarfasEst = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFASEST_TO") == 0 )
         {
            AV37BarFasEst_to = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARACAANH") == 0 )
         {
            AV38BarAcaAnh = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV100GXV1 = (int)(AV100GXV1+1) ;
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
      lV41FilterFullText = "" ;
      lV80TFBarFasCod = "" ;
      lV84TFBarFasSig = "" ;
      AV55TFBarFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV52TFMaqCodBis = "" ;
      lV58TFCliNom = "" ;
      lV60TFBarNHdr = "" ;
      lV64TFBarSer = "" ;
      lV66TFBarSerDsc = "" ;
      lV68TFBarColNom = "" ;
      lV74TFBarNomCli = "" ;
      lV88TFBarDibCli = "" ;
      AV53TFMaqCodBis_Sel = "" ;
      AV52TFMaqCodBis = "" ;
      AV59TFCliNom_Sel = "" ;
      AV58TFCliNom = "" ;
      AV61TFBarNHdr_Sel = "" ;
      AV60TFBarNHdr = "" ;
      AV65TFBarSer_Sel = "" ;
      AV64TFBarSer = "" ;
      AV67TFBarSerDsc_Sel = "" ;
      AV66TFBarSerDsc = "" ;
      AV69TFBarColNom_Sel = "" ;
      AV68TFBarColNom = "" ;
      AV75TFBarNomCli_Sel = "" ;
      AV74TFBarNomCli = "" ;
      AV76TFBarKgm = DecimalUtil.ZERO ;
      AV77TFBarKgm_To = DecimalUtil.ZERO ;
      AV78TFBarMtr = DecimalUtil.ZERO ;
      AV79TFBarMtr_To = DecimalUtil.ZERO ;
      AV89TFBarDibCli_Sel = "" ;
      AV88TFBarDibCli = "" ;
      A603MaqCodBis = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A1798BarDibCli = "" ;
      AV41FilterFullText = "" ;
      A13696BarNHdr = "" ;
      A151BarFasCod = "" ;
      A1955BarFasSig = "" ;
      AV81TFBarFasCod_Sel = "" ;
      AV80TFBarFasCod = "" ;
      AV85TFBarFasSig_Sel = "" ;
      AV84TFBarFasSig = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      AV32BarFecgen = GXutil.nullDate() ;
      AV33BarFecGen_to = GXutil.nullDate() ;
      AV28Emprcod = "" ;
      AV29Fascod = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      P0AAX10_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AAX10_A457FasCod = new String[] {""} ;
      P0AAX10_A396EmprCod = new String[] {""} ;
      P0AAX10_A4466BarAcaAnh = new short[1] ;
      P0AAX10_A1798BarDibCli = new String[] {""} ;
      P0AAX10_A194BarOrdLin = new short[1] ;
      P0AAX10_A1234BarNomCli = new String[] {""} ;
      P0AAX10_A218BarTipCol = new byte[1] ;
      P0AAX10_A136BarColNum = new int[1] ;
      P0AAX10_A135BarColNom = new String[] {""} ;
      P0AAX10_A1652BarSerDsc = new String[] {""} ;
      P0AAX10_A212BarSer = new String[] {""} ;
      P0AAX10_A213BarSit = new byte[1] ;
      P0AAX10_A13696BarNHdr = new String[] {""} ;
      P0AAX10_A279CliNom = new String[] {""} ;
      P0AAX10_A252CliCod = new int[1] ;
      P0AAX10_n252CliCod = new boolean[] {false} ;
      P0AAX10_A153BarFasEst = new byte[1] ;
      P0AAX10_A603MaqCodBis = new String[] {""} ;
      P0AAX10_A4812BarEncCli = new String[] {""} ;
      P0AAX10_A143BarDisNum = new String[] {""} ;
      P0AAX10_A1955BarFasSig = new String[] {""} ;
      P0AAX10_n1955BarFasSig = new boolean[] {false} ;
      P0AAX10_A154BarFasLin = new short[1] ;
      P0AAX10_n154BarFasLin = new boolean[] {false} ;
      P0AAX10_A151BarFasCod = new String[] {""} ;
      P0AAX10_n151BarFasCod = new boolean[] {false} ;
      P0AAX10_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAX10_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AAX10_A129BarCod = new int[1] ;
      P0AAX10_A132BarCodReo = new byte[1] ;
      P0AAX10_A130BarCodPar = new String[] {""} ;
      P0AAX10_A758ProCod = new String[] {""} ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A758ProCod = "" ;
      AV42Sel = "" ;
      AV43BarEncCli = "" ;
      AV45FasDscLast = "" ;
      AV46FasdscNext = "" ;
      AV95Rioplatense = DecimalUtil.ZERO ;
      AV96Carvitin = DecimalUtil.ZERO ;
      AV48AlbRLoc = "" ;
      AV97Fio = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV98Tintest = DecimalUtil.ZERO ;
      AV99Cnoenc = DecimalUtil.ZERO ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV50GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV51GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV54TFBarFasEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.cargasproduccionporfase_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P0AAX10_A159BarFecGen, P0AAX10_A457FasCod, P0AAX10_A396EmprCod, P0AAX10_A4466BarAcaAnh, P0AAX10_A1798BarDibCli, P0AAX10_A194BarOrdLin, P0AAX10_A1234BarNomCli, P0AAX10_A218BarTipCol, P0AAX10_A136BarColNum, P0AAX10_A135BarColNom,
            P0AAX10_A1652BarSerDsc, P0AAX10_A212BarSer, P0AAX10_A213BarSit, P0AAX10_A13696BarNHdr, P0AAX10_A279CliNom, P0AAX10_A252CliCod, P0AAX10_n252CliCod, P0AAX10_A153BarFasEst, P0AAX10_A603MaqCodBis, P0AAX10_A4812BarEncCli,
            P0AAX10_A143BarDisNum, P0AAX10_A1955BarFasSig, P0AAX10_n1955BarFasSig, P0AAX10_A154BarFasLin, P0AAX10_n154BarFasLin, P0AAX10_A151BarFasCod, P0AAX10_n151BarFasCod, P0AAX10_A184BarMtr, P0AAX10_A166BarKgm, P0AAX10_A129BarCod,
            P0AAX10_A132BarCodReo, P0AAX10_A130BarCodPar, P0AAX10_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A153BarFasEst ;
   private byte AV62TFBarSit ;
   private byte AV63TFBarSit_To ;
   private byte AV72TFBarTipCol ;
   private byte AV73TFBarTipCol_To ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV34BarSIt ;
   private byte AV35Barsit_to ;
   private byte AV36BarfasEst ;
   private byte AV37BarFasEst_to ;
   private short gxcookieaux ;
   private short AV86TFBarOrdLin ;
   private short AV87TFBarOrdLin_To ;
   private short AV90TFBarAcaAnh ;
   private short AV91TFBarAcaAnh_To ;
   private short A194BarOrdLin ;
   private short A4466BarAcaAnh ;
   private short AV39OrderedBy ;
   private short A154BarFasLin ;
   private short AV82TFBarFasLin ;
   private short AV83TFBarFasLin_To ;
   private short AV38BarAcaAnh ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV55TFBarFasEst_Sels_size ;
   private int AV56TFCliCod ;
   private int AV57TFCliCod_To ;
   private int AV70TFBarColNum ;
   private int AV71TFBarColNum_To ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV30Clicod ;
   private int AV31Clicod_to ;
   private int AV100GXV1 ;
   private java.math.BigDecimal AV76TFBarKgm ;
   private java.math.BigDecimal AV77TFBarKgm_To ;
   private java.math.BigDecimal AV78TFBarMtr ;
   private java.math.BigDecimal AV79TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV95Rioplatense ;
   private java.math.BigDecimal AV96Carvitin ;
   private java.math.BigDecimal AV97Fio ;
   private java.math.BigDecimal AV98Tintest ;
   private java.math.BigDecimal AV99Cnoenc ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String lV80TFBarFasCod ;
   private String lV84TFBarFasSig ;
   private String scmdbuf ;
   private String lV52TFMaqCodBis ;
   private String lV58TFCliNom ;
   private String lV60TFBarNHdr ;
   private String lV64TFBarSer ;
   private String lV66TFBarSerDsc ;
   private String lV68TFBarColNom ;
   private String lV74TFBarNomCli ;
   private String lV88TFBarDibCli ;
   private String AV53TFMaqCodBis_Sel ;
   private String AV52TFMaqCodBis ;
   private String AV59TFCliNom_Sel ;
   private String AV58TFCliNom ;
   private String AV61TFBarNHdr_Sel ;
   private String AV60TFBarNHdr ;
   private String AV65TFBarSer_Sel ;
   private String AV64TFBarSer ;
   private String AV67TFBarSerDsc_Sel ;
   private String AV66TFBarSerDsc ;
   private String AV69TFBarColNom_Sel ;
   private String AV68TFBarColNom ;
   private String AV75TFBarNomCli_Sel ;
   private String AV74TFBarNomCli ;
   private String AV89TFBarDibCli_Sel ;
   private String AV88TFBarDibCli ;
   private String A603MaqCodBis ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A1798BarDibCli ;
   private String A13696BarNHdr ;
   private String A151BarFasCod ;
   private String A1955BarFasSig ;
   private String AV81TFBarFasCod_Sel ;
   private String AV80TFBarFasCod ;
   private String AV85TFBarFasSig_Sel ;
   private String AV84TFBarFasSig ;
   private String AV28Emprcod ;
   private String AV29Fascod ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A758ProCod ;
   private String AV42Sel ;
   private String AV43BarEncCli ;
   private String AV45FasDscLast ;
   private String AV46FasdscNext ;
   private String AV48AlbRLoc ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV32BarFecgen ;
   private java.util.Date AV33BarFecGen_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV44IsAuthorizedBarMtr ;
   private boolean AV47IsAuthorizedAlbRLoc ;
   private boolean AV40OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n1955BarFasSig ;
   private boolean n154BarFasLin ;
   private boolean n151BarFasCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV54TFBarFasEst_SelsJson ;
   private String AV11Filename ;
   private String lV41FilterFullText ;
   private String AV41FilterFullText ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV55TFBarFasEst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0AAX10_A159BarFecGen ;
   private String[] P0AAX10_A457FasCod ;
   private String[] P0AAX10_A396EmprCod ;
   private short[] P0AAX10_A4466BarAcaAnh ;
   private String[] P0AAX10_A1798BarDibCli ;
   private short[] P0AAX10_A194BarOrdLin ;
   private String[] P0AAX10_A1234BarNomCli ;
   private byte[] P0AAX10_A218BarTipCol ;
   private int[] P0AAX10_A136BarColNum ;
   private String[] P0AAX10_A135BarColNom ;
   private String[] P0AAX10_A1652BarSerDsc ;
   private String[] P0AAX10_A212BarSer ;
   private byte[] P0AAX10_A213BarSit ;
   private String[] P0AAX10_A13696BarNHdr ;
   private String[] P0AAX10_A279CliNom ;
   private int[] P0AAX10_A252CliCod ;
   private boolean[] P0AAX10_n252CliCod ;
   private byte[] P0AAX10_A153BarFasEst ;
   private String[] P0AAX10_A603MaqCodBis ;
   private String[] P0AAX10_A4812BarEncCli ;
   private String[] P0AAX10_A143BarDisNum ;
   private String[] P0AAX10_A1955BarFasSig ;
   private boolean[] P0AAX10_n1955BarFasSig ;
   private short[] P0AAX10_A154BarFasLin ;
   private boolean[] P0AAX10_n154BarFasLin ;
   private String[] P0AAX10_A151BarFasCod ;
   private boolean[] P0AAX10_n151BarFasCod ;
   private java.math.BigDecimal[] P0AAX10_A184BarMtr ;
   private java.math.BigDecimal[] P0AAX10_A166BarKgm ;
   private int[] P0AAX10_A129BarCod ;
   private byte[] P0AAX10_A132BarCodReo ;
   private String[] P0AAX10_A130BarCodPar ;
   private String[] P0AAX10_A758ProCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV50GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV51GridStateFilterValue ;
}

final  class cargasproduccionporfase_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AAX10( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A153BarFasEst ,
                                           GXSimpleCollection<Byte> AV55TFBarFasEst_Sels ,
                                           String AV53TFMaqCodBis_Sel ,
                                           String AV52TFMaqCodBis ,
                                           int AV55TFBarFasEst_Sels_size ,
                                           int AV56TFCliCod ,
                                           int AV57TFCliCod_To ,
                                           String AV59TFCliNom_Sel ,
                                           String AV58TFCliNom ,
                                           String AV61TFBarNHdr_Sel ,
                                           String AV60TFBarNHdr ,
                                           byte AV62TFBarSit ,
                                           byte AV63TFBarSit_To ,
                                           String AV65TFBarSer_Sel ,
                                           String AV64TFBarSer ,
                                           String AV67TFBarSerDsc_Sel ,
                                           String AV66TFBarSerDsc ,
                                           String AV69TFBarColNom_Sel ,
                                           String AV68TFBarColNom ,
                                           int AV70TFBarColNum ,
                                           int AV71TFBarColNum_To ,
                                           byte AV72TFBarTipCol ,
                                           byte AV73TFBarTipCol_To ,
                                           String AV75TFBarNomCli_Sel ,
                                           String AV74TFBarNomCli ,
                                           java.math.BigDecimal AV76TFBarKgm ,
                                           java.math.BigDecimal AV77TFBarKgm_To ,
                                           java.math.BigDecimal AV78TFBarMtr ,
                                           java.math.BigDecimal AV79TFBarMtr_To ,
                                           short AV86TFBarOrdLin ,
                                           short AV87TFBarOrdLin_To ,
                                           String AV89TFBarDibCli_Sel ,
                                           String AV88TFBarDibCli ,
                                           short AV90TFBarAcaAnh ,
                                           short AV91TFBarAcaAnh_To ,
                                           String A603MaqCodBis ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           byte A218BarTipCol ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A194BarOrdLin ,
                                           String A1798BarDibCli ,
                                           short A4466BarAcaAnh ,
                                           short AV39OrderedBy ,
                                           boolean AV40OrderedDsc ,
                                           String AV41FilterFullText ,
                                           String A13696BarNHdr ,
                                           String A151BarFasCod ,
                                           short A154BarFasLin ,
                                           String A1955BarFasSig ,
                                           String AV81TFBarFasCod_Sel ,
                                           String AV80TFBarFasCod ,
                                           short AV82TFBarFasLin ,
                                           short AV83TFBarFasLin_To ,
                                           String AV85TFBarFasSig_Sel ,
                                           String AV84TFBarFasSig ,
                                           int AV30Clicod ,
                                           int AV31Clicod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV32BarFecgen ,
                                           java.util.Date AV33BarFecGen_to ,
                                           byte AV34BarSIt ,
                                           byte AV35Barsit_to ,
                                           byte AV36BarfasEst ,
                                           byte AV37BarFasEst_to ,
                                           short AV38BarAcaAnh ,
                                           String AV28Emprcod ,
                                           String AV29Fascod ,
                                           String A396EmprCod ,
                                           String A457FasCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[79];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T2.BarFecGen, T1.FasCod, T1.EmprCod, T2.BarAcaAnh, T2.BarDibCli, T1.BarOrdLin, T2.BarNomCli, T2.BarTipCol, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer," ;
      scmdbuf += " T2.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar AS BarNHdr, T3.CliNom," ;
      scmdbuf += " T2.CliCod, T1.BarFasEst, T1.MaqCodBis, T2.BarEncCli, T2.BarDisNum, COALESCE( T4.BarFasSig, ' ') AS BarFasSig, COALESCE( T5.BarFasLin, 0) AS BarFasLin, COALESCE(" ;
      scmdbuf += " T6.BarFasSig, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod FROM ((((((TXPBARFAS" ;
      scmdbuf += " T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, COALESCE( T9.BarFasLin, 0) AS BarFasLin, T8.EmprCod, T8.BarCod," ;
      scmdbuf += " T8.BarCodReo, T8.BarCodPar FROM ((TXPBARFAS T8 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar =" ;
      scmdbuf += " T8.BarCodPar) INNER JOIN (SELECT MIN(T11.BarOrdLin) AS GXC1, COALESCE( T12.BarFasLin, 0) AS BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM" ;
      scmdbuf += " (TXPBARFAS T11 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T12 ON T12.EmprCod = T11.EmprCod AND T12.BarCod = T11.BarCod AND T12.BarCodReo = T11.BarCodReo AND T12.BarCodPar = T11.BarCodPar) WHERE (T11.BarOrdLin" ;
      scmdbuf += " >= 0) AND (T11.BarOrdLin > COALESCE( T12.BarFasLin, 0)) AND (T11.BarFasEst = 0) GROUP BY T12.BarFasLin, T11.EmprCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar )" ;
      scmdbuf += " T10 ON T10.EmprCod = T8.EmprCod AND T10.BarCod = T8.BarCod AND T10.BarCodReo = T8.BarCodReo AND T10.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T10.GXC1) AND" ;
      scmdbuf += " (T8.BarOrdLin >= 0) AND (T8.BarOrdLin > COALESCE( T9.BarFasLin, 0)) AND (T8.BarFasEst = 0) GROUP BY T9.BarFasLin, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod" ;
      scmdbuf += " = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasSig, T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC2, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin" ;
      scmdbuf += " = T9.GXC2) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.FasCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarFasEst,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.BarCodReo,'90'), 2))) || T2.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.BarTipCol,'90'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T7.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T5.BarFasLin, 0),'9990'), 2) like '%' || ?) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarDibCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarAcaAnh,'9990'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T5.BarFasLin, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasSig, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasSig, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(T1.BarFasEst >= ?)");
      addWhere(sWhereString, "(T1.BarFasEst <= ?)");
      addWhere(sWhereString, "(T2.BarAcaAnh = ? or (? = 0))");
      if ( (GXutil.strcmp("", AV53TFMaqCodBis_Sel)==0) && ( ! (GXutil.strcmp("", AV52TFMaqCodBis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFMaqCodBis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( AV55TFBarFasEst_Sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV55TFBarFasEst_Sels, "T1.BarFasEst IN (", ")")+")");
      }
      if ( ! (0==AV56TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (0==AV57TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV61TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV60TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV61TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( ! (0==AV62TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( ! (0==AV63TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV64TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV68TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[62] = (byte)(1) ;
      }
      if ( ! (0==AV70TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[63] = (byte)(1) ;
      }
      if ( ! (0==AV71TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[64] = (byte)(1) ;
      }
      if ( ! (0==AV72TFBarTipCol) )
      {
         addWhere(sWhereString, "(T2.BarTipCol >= ?)");
      }
      else
      {
         GXv_int6[65] = (byte)(1) ;
      }
      if ( ! (0==AV73TFBarTipCol_To) )
      {
         addWhere(sWhereString, "(T2.BarTipCol <= ?)");
      }
      else
      {
         GXv_int6[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV74TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int6[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int6[70] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int6[71] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int6[72] = (byte)(1) ;
      }
      if ( ! (0==AV86TFBarOrdLin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[73] = (byte)(1) ;
      }
      if ( ! (0==AV87TFBarOrdLin_To) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89TFBarDibCli_Sel)==0) && ( ! (GXutil.strcmp("", AV88TFBarDibCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarDibCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89TFBarDibCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarDibCli = ?)");
      }
      else
      {
         GXv_int6[76] = (byte)(1) ;
      }
      if ( ! (0==AV90TFBarAcaAnh) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh >= ?)");
      }
      else
      {
         GXv_int6[77] = (byte)(1) ;
      }
      if ( ! (0==AV91TFBarAcaAnh_To) )
      {
         addWhere(sWhereString, "(T2.BarAcaAnh <= ?)");
      }
      else
      {
         GXv_int6[78] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV39OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.FasCod" ;
      }
      else if ( ( AV39OrderedBy == 2 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis" ;
      }
      else if ( ( AV39OrderedBy == 2 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodBis DESC" ;
      }
      else if ( ( AV39OrderedBy == 3 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFasEst" ;
      }
      else if ( ( AV39OrderedBy == 3 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFasEst DESC" ;
      }
      else if ( ( AV39OrderedBy == 4 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV39OrderedBy == 4 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV39OrderedBy == 5 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV39OrderedBy == 5 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV39OrderedBy == 6 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV39OrderedBy == 6 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV39OrderedBy == 7 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV39OrderedBy == 7 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV39OrderedBy == 8 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV39OrderedBy == 8 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV39OrderedBy == 9 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV39OrderedBy == 9 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV39OrderedBy == 10 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV39OrderedBy == 10 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV39OrderedBy == 11 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarTipCol" ;
      }
      else if ( ( AV39OrderedBy == 11 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarTipCol DESC" ;
      }
      else if ( ( AV39OrderedBy == 12 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV39OrderedBy == 12 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV39OrderedBy == 13 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV39OrderedBy == 13 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV39OrderedBy == 14 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarDibCli" ;
      }
      else if ( ( AV39OrderedBy == 14 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarDibCli DESC" ;
      }
      else if ( ( AV39OrderedBy == 15 ) && ! AV40OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarAcaAnh" ;
      }
      else if ( ( AV39OrderedBy == 15 ) && ( AV40OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarAcaAnh DESC" ;
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
                  return conditional_P0AAX10(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).byteValue() , (String)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , ((Number) dynConstraints[52]).shortValue() , ((Number) dynConstraints[53]).shortValue() , ((Boolean) dynConstraints[54]).booleanValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Number) dynConstraints[63]).shortValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).intValue() , (java.util.Date)dynConstraints[68] , (java.util.Date)dynConstraints[69] , (java.util.Date)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , ((Number) dynConstraints[72]).byteValue() , ((Number) dynConstraints[73]).byteValue() , ((Number) dynConstraints[74]).byteValue() , ((Number) dynConstraints[75]).shortValue() , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AAX10", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 11);
               ((String[]) buf[14])[0] = rslt.getString(15, 30);
               ((int[]) buf[15])[0] = rslt.getInt(16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 6);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((String[]) buf[20])[0] = rslt.getString(20, 8);
               ((String[]) buf[21])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(25,2);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((byte[]) buf[30])[0] = rslt.getByte(27);
               ((String[]) buf[31])[0] = rslt.getString(28, 1);
               ((String[]) buf[32])[0] = rslt.getString(29, 8);
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
                  stmt.setString(sIdx, (String)parms[79], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[82], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[85], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[86], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[87], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[88], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[89], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[92], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[93], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[94], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[97], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[98], 100);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[99], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[100], 100);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[101], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[107]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[108]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[109]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[110]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 8);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 8);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 8);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[116]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[118]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[119]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[120]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[123]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[124]).shortValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[125]).shortValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[131], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[132], 11);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 11);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 16);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[137], 16);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 26);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 26);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 13);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 13);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[142]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[143]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[144]).byteValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[145]).byteValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[146], 13);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[148], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[149], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[150], 2);
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[151], 2);
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[152]).shortValue());
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[153]).shortValue());
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[154], 16);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[155], 16);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[156]).shortValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[157]).shortValue());
               }
               return;
      }
   }

}

