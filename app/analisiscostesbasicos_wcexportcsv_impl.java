package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class analisiscostesbasicos_wcexportcsv_impl extends GXWebProcedure
{
   public analisiscostesbasicos_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "AnalisisCostesBasicos_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AnalisisCostesBasicos_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("AnalisisCostesBasicos_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N° Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero del Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilogramos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Qui", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Fab", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Margen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Documentos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Generacion Barcada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Salida en Albaran", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV79Analisiscostesbasicos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV80Analisiscostesbasicos_wcds_2_tfclicod = AV34TFCliCod ;
      AV81Analisiscostesbasicos_wcds_3_tfclicod_to = AV35TFCliCod_To ;
      AV82Analisiscostesbasicos_wcds_4_tfclinom = AV36TFCliNom ;
      AV83Analisiscostesbasicos_wcds_5_tfclinom_sel = AV37TFCliNom_Sel ;
      AV84Analisiscostesbasicos_wcds_6_tfbarnhdr = AV38TFBarNHdr ;
      AV85Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = AV39TFBarNHdr_Sel ;
      AV86Analisiscostesbasicos_wcds_8_tfbarser = AV56TFBarSer ;
      AV87Analisiscostesbasicos_wcds_9_tfbarser_sel = AV57TFBarSer_Sel ;
      AV88Analisiscostesbasicos_wcds_10_tfbarserdsc = AV58TFBarSerDsc ;
      AV89Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = AV59TFBarSerDsc_Sel ;
      AV90Analisiscostesbasicos_wcds_12_tfbarcolnom = AV60TFBarColNom ;
      AV91Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = AV61TFBarColNom_Sel ;
      AV92Analisiscostesbasicos_wcds_14_tfbarcolnum = AV62TFBarColNum ;
      AV93Analisiscostesbasicos_wcds_15_tfbarcolnum_to = AV63TFBarColNum_To ;
      AV94Analisiscostesbasicos_wcds_16_tfbarnomcli = AV66TFBarNomCli ;
      AV95Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = AV67TFBarNomCli_Sel ;
      AV96Analisiscostesbasicos_wcds_18_tfbarkgm = AV68TFBarKgm ;
      AV97Analisiscostesbasicos_wcds_19_tfbarkgm_to = AV69TFBarKgm_To ;
      AV98Analisiscostesbasicos_wcds_20_tfbarmtr = AV70TFBarMtr ;
      AV99Analisiscostesbasicos_wcds_21_tfbarmtr_to = AV71TFBarMtr_To ;
      AV100Analisiscostesbasicos_wcds_22_tfbarfecgen = AV72TFBarFecGen ;
      AV101Analisiscostesbasicos_wcds_23_tfbarfecsal = AV74TFBarFecSal ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV80Analisiscostesbasicos_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV81Analisiscostesbasicos_wcds_3_tfclicod_to) ,
                                           AV83Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                           AV82Analisiscostesbasicos_wcds_4_tfclinom ,
                                           AV85Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                           AV84Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                           AV87Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                           AV86Analisiscostesbasicos_wcds_8_tfbarser ,
                                           AV89Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                           AV88Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                           AV91Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                           AV90Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                           Integer.valueOf(AV92Analisiscostesbasicos_wcds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV93Analisiscostesbasicos_wcds_15_tfbarcolnum_to) ,
                                           AV95Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                           AV94Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                           AV96Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                           AV97Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                           AV98Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                           AV99Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                           AV100Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                           AV101Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A161BarFecSal ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV79Analisiscostesbasicos_wcds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(AV41Clicod) ,
                                           Integer.valueOf(AV50Clicod_to) ,
                                           AV42Barfecgen ,
                                           AV43Barfecgen_to ,
                                           AV46Barser ,
                                           AV44BarFecsal ,
                                           AV45Barfecsal_to ,
                                           Integer.valueOf(AV47InBarcod) ,
                                           Byte.valueOf(AV48InBarcodreo) ,
                                           AV49InBarcodpar ,
                                           AV40Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV79Analisiscostesbasicos_wcds_1_filterfulltext), "%", "") ;
      lV46Barser = GXutil.padr( GXutil.rtrim( AV46Barser), 16, "%") ;
      lV82Analisiscostesbasicos_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV82Analisiscostesbasicos_wcds_4_tfclinom), 30, "%") ;
      lV84Analisiscostesbasicos_wcds_6_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV84Analisiscostesbasicos_wcds_6_tfbarnhdr), 11, "%") ;
      lV86Analisiscostesbasicos_wcds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV86Analisiscostesbasicos_wcds_8_tfbarser), 16, "%") ;
      lV88Analisiscostesbasicos_wcds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV88Analisiscostesbasicos_wcds_10_tfbarserdsc), 26, "%") ;
      lV90Analisiscostesbasicos_wcds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV90Analisiscostesbasicos_wcds_12_tfbarcolnom), 13, "%") ;
      lV94Analisiscostesbasicos_wcds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV94Analisiscostesbasicos_wcds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P093C3 */
      pr_default.execute(0, new Object[] {AV40Emprcod, AV79Analisiscostesbasicos_wcds_1_filterfulltext, lV79Analisiscostesbasicos_wcds_1_filterfulltext, lV79Analisiscostesbasicos_wcds_1_filterfulltext, lV79Analisiscostesbasicos_wcds_1_filterfulltext, lV79Analisiscostesbasicos_wcds_1_filterfulltext, lV79Analisiscostesbasicos_wcds_1_filterfulltext, lV79Analisiscostesbasicos_wcds_1_filterfulltext, lV79Analisiscostesbasicos_wcds_1_filterfulltext, lV79Analisiscostesbasicos_wcds_1_filterfulltext, lV79Analisiscostesbasicos_wcds_1_filterfulltext, lV79Analisiscostesbasicos_wcds_1_filterfulltext, Integer.valueOf(AV41Clicod), Integer.valueOf(AV50Clicod_to), AV42Barfecgen, AV43Barfecgen_to, lV46Barser, AV46Barser, AV44BarFecsal, AV44BarFecsal, AV45Barfecsal_to, AV45Barfecsal_to, Integer.valueOf(AV47InBarcod), Integer.valueOf(AV47InBarcod), Byte.valueOf(AV48InBarcodreo), Byte.valueOf(AV48InBarcodreo), AV49InBarcodpar, AV49InBarcodpar, Integer.valueOf(AV80Analisiscostesbasicos_wcds_2_tfclicod), Integer.valueOf(AV81Analisiscostesbasicos_wcds_3_tfclicod_to), lV82Analisiscostesbasicos_wcds_4_tfclinom, AV83Analisiscostesbasicos_wcds_5_tfclinom_sel, lV84Analisiscostesbasicos_wcds_6_tfbarnhdr, AV85Analisiscostesbasicos_wcds_7_tfbarnhdr_sel, lV86Analisiscostesbasicos_wcds_8_tfbarser, AV87Analisiscostesbasicos_wcds_9_tfbarser_sel, lV88Analisiscostesbasicos_wcds_10_tfbarserdsc, AV89Analisiscostesbasicos_wcds_11_tfbarserdsc_sel, lV90Analisiscostesbasicos_wcds_12_tfbarcolnom, AV91Analisiscostesbasicos_wcds_13_tfbarcolnom_sel, Integer.valueOf(AV92Analisiscostesbasicos_wcds_14_tfbarcolnum), Integer.valueOf(AV93Analisiscostesbasicos_wcds_15_tfbarcolnum_to), lV94Analisiscostesbasicos_wcds_16_tfbarnomcli, AV95Analisiscostesbasicos_wcds_17_tfbarnomcli_sel, AV96Analisiscostesbasicos_wcds_18_tfbarkgm, AV97Analisiscostesbasicos_wcds_19_tfbarkgm_to, AV98Analisiscostesbasicos_wcds_20_tfbarmtr, AV99Analisiscostesbasicos_wcds_21_tfbarmtr_to, AV100Analisiscostesbasicos_wcds_22_tfbarfecgen, AV101Analisiscostesbasicos_wcds_23_tfbarfecsal});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P093C3_A396EmprCod[0] ;
         A161BarFecSal = P093C3_A161BarFecSal[0] ;
         A159BarFecGen = P093C3_A159BarFecGen[0] ;
         A1234BarNomCli = P093C3_A1234BarNomCli[0] ;
         A136BarColNum = P093C3_A136BarColNum[0] ;
         A135BarColNom = P093C3_A135BarColNom[0] ;
         A1652BarSerDsc = P093C3_A1652BarSerDsc[0] ;
         A212BarSer = P093C3_A212BarSer[0] ;
         A13696BarNHdr = P093C3_A13696BarNHdr[0] ;
         A279CliNom = P093C3_A279CliNom[0] ;
         A252CliCod = P093C3_A252CliCod[0] ;
         n252CliCod = P093C3_n252CliCod[0] ;
         A140BarCosAny = P093C3_A140BarCosAny[0] ;
         A141BarCosPro = P093C3_A141BarCosPro[0] ;
         A184BarMtr = P093C3_A184BarMtr[0] ;
         A166BarKgm = P093C3_A166BarKgm[0] ;
         A129BarCod = P093C3_A129BarCod[0] ;
         A132BarCodReo = P093C3_A132BarCodReo[0] ;
         A130BarCodPar = P093C3_A130BarCodPar[0] ;
         A279CliNom = P093C3_A279CliNom[0] ;
         A184BarMtr = P093C3_A184BarMtr[0] ;
         A166BarKgm = P093C3_A166BarKgm[0] ;
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
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            analisiscostesbasicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            analisiscostesbasicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
            analisiscostesbasicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
            analisiscostesbasicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char3) ;
            analisiscostesbasicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char3) ;
            analisiscostesbasicos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A166BarKgm, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A184BarMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV51Coste_p = (A141BarCosPro.add(A140BarCosAny)) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV51Coste_p, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV52CosteFab, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A129BarCod ;
            GXv_int5[0] = A132BarCodReo ;
            GXv_char6[0] = A130BarCodPar ;
            GXv_char7[0] = AV55TxtAlb ;
            GXv_decimal8[0] = AV53Valor ;
            new app.recuperodatosalbbar(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char6, GXv_char7, GXv_decimal8) ;
            analisiscostesbasicos_wcexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
            analisiscostesbasicos_wcexportcsv_impl.this.A129BarCod = GXv_int4[0] ;
            analisiscostesbasicos_wcexportcsv_impl.this.A132BarCodReo = GXv_int5[0] ;
            analisiscostesbasicos_wcexportcsv_impl.this.A130BarCodPar = GXv_char6[0] ;
            analisiscostesbasicos_wcexportcsv_impl.this.AV55TxtAlb = GXv_char7[0] ;
            analisiscostesbasicos_wcexportcsv_impl.this.AV53Valor = GXv_decimal8[0] ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV53Valor, 11, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV54Margen = AV53Valor.subtract((AV52CosteFab.add(AV51Coste_p).add(AV102Costest))) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV54Margen, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char7[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV55TxtAlb, ";", ","), GXv_char7) ;
            analisiscostesbasicos_wcexportcsv_impl.this.GXt_char2 = GXv_char7[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A161BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=AnalisisCostesBasicos_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliCod", "", "Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNHdr", "", "N° Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSer", "", "Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNom", "", "Nombre Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNum", "", "Numero del Color", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarKgm", "", "Kilogramos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarMtr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Coste_p", "", "Coste Qui", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&CosteFab", "", "Coste Fab", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Valor", "", "Valor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Margen", "", "Margen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&TxtAlb", "", "Documentos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecGen", "", "Fecha Generacion Barcada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char7[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnalisisCostesBasicos_WCColumnsSelector", GXv_char7) ;
      analisiscostesbasicos_wcexportcsv_impl.this.GXt_char2 = GXv_char7[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AnalisisCostesBasicos_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AnalisisCostesBasicos_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("AnalisisCostesBasicos_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV103GXV1 = 1 ;
      while ( AV103GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV36TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV37TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV38TFBarNHdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV39TFBarNHdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV56TFBarSer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV57TFBarSer_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV58TFBarSerDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV59TFBarSerDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV60TFBarColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV61TFBarColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV62TFBarColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFBarColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV66TFBarNomCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV67TFBarNomCli_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV68TFBarKgm = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV69TFBarKgm_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV70TFBarMtr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV71TFBarMtr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV72TFBarFecGen = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV74TFBarFecSal = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV40Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV41Clicod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV50Clicod_to = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV42Barfecgen = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV43Barfecgen_to = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSAL") == 0 )
         {
            AV44BarFecsal = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSAL_TO") == 0 )
         {
            AV45Barfecsal_to = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV46Barser = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCOD") == 0 )
         {
            AV47InBarcod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCODREO") == 0 )
         {
            AV48InBarcodreo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&INBARCODPAR") == 0 )
         {
            AV49InBarcodpar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV103GXV1 = (int)(AV103GXV1+1) ;
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
      A279CliNom = "" ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      AV79Analisiscostesbasicos_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV82Analisiscostesbasicos_wcds_4_tfclinom = "" ;
      AV36TFCliNom = "" ;
      AV83Analisiscostesbasicos_wcds_5_tfclinom_sel = "" ;
      AV37TFCliNom_Sel = "" ;
      AV84Analisiscostesbasicos_wcds_6_tfbarnhdr = "" ;
      AV38TFBarNHdr = "" ;
      AV85Analisiscostesbasicos_wcds_7_tfbarnhdr_sel = "" ;
      AV39TFBarNHdr_Sel = "" ;
      AV86Analisiscostesbasicos_wcds_8_tfbarser = "" ;
      AV56TFBarSer = "" ;
      AV87Analisiscostesbasicos_wcds_9_tfbarser_sel = "" ;
      AV57TFBarSer_Sel = "" ;
      AV88Analisiscostesbasicos_wcds_10_tfbarserdsc = "" ;
      AV58TFBarSerDsc = "" ;
      AV89Analisiscostesbasicos_wcds_11_tfbarserdsc_sel = "" ;
      AV59TFBarSerDsc_Sel = "" ;
      AV90Analisiscostesbasicos_wcds_12_tfbarcolnom = "" ;
      AV60TFBarColNom = "" ;
      AV91Analisiscostesbasicos_wcds_13_tfbarcolnom_sel = "" ;
      AV61TFBarColNom_Sel = "" ;
      AV94Analisiscostesbasicos_wcds_16_tfbarnomcli = "" ;
      AV66TFBarNomCli = "" ;
      AV95Analisiscostesbasicos_wcds_17_tfbarnomcli_sel = "" ;
      AV67TFBarNomCli_Sel = "" ;
      AV96Analisiscostesbasicos_wcds_18_tfbarkgm = DecimalUtil.ZERO ;
      AV68TFBarKgm = DecimalUtil.ZERO ;
      AV97Analisiscostesbasicos_wcds_19_tfbarkgm_to = DecimalUtil.ZERO ;
      AV69TFBarKgm_To = DecimalUtil.ZERO ;
      AV98Analisiscostesbasicos_wcds_20_tfbarmtr = DecimalUtil.ZERO ;
      AV70TFBarMtr = DecimalUtil.ZERO ;
      AV99Analisiscostesbasicos_wcds_21_tfbarmtr_to = DecimalUtil.ZERO ;
      AV71TFBarMtr_To = DecimalUtil.ZERO ;
      AV100Analisiscostesbasicos_wcds_22_tfbarfecgen = GXutil.nullDate() ;
      AV72TFBarFecGen = GXutil.nullDate() ;
      AV101Analisiscostesbasicos_wcds_23_tfbarfecsal = GXutil.nullDate() ;
      AV74TFBarFecSal = GXutil.nullDate() ;
      lV79Analisiscostesbasicos_wcds_1_filterfulltext = "" ;
      lV46Barser = "" ;
      scmdbuf = "" ;
      lV82Analisiscostesbasicos_wcds_4_tfclinom = "" ;
      lV84Analisiscostesbasicos_wcds_6_tfbarnhdr = "" ;
      lV86Analisiscostesbasicos_wcds_8_tfbarser = "" ;
      lV88Analisiscostesbasicos_wcds_10_tfbarserdsc = "" ;
      lV90Analisiscostesbasicos_wcds_12_tfbarcolnom = "" ;
      lV94Analisiscostesbasicos_wcds_16_tfbarnomcli = "" ;
      AV42Barfecgen = GXutil.nullDate() ;
      AV43Barfecgen_to = GXutil.nullDate() ;
      AV46Barser = "" ;
      AV44BarFecsal = GXutil.nullDate() ;
      AV45Barfecsal_to = GXutil.nullDate() ;
      AV49InBarcodpar = "" ;
      AV40Emprcod = "" ;
      P093C3_A396EmprCod = new String[] {""} ;
      P093C3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P093C3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P093C3_A1234BarNomCli = new String[] {""} ;
      P093C3_A136BarColNum = new int[1] ;
      P093C3_A135BarColNom = new String[] {""} ;
      P093C3_A1652BarSerDsc = new String[] {""} ;
      P093C3_A212BarSer = new String[] {""} ;
      P093C3_A13696BarNHdr = new String[] {""} ;
      P093C3_A279CliNom = new String[] {""} ;
      P093C3_A252CliCod = new int[1] ;
      P093C3_n252CliCod = new boolean[] {false} ;
      P093C3_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093C3_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093C3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093C3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093C3_A129BarCod = new int[1] ;
      P093C3_A132BarCodReo = new byte[1] ;
      P093C3_A130BarCodPar = new String[] {""} ;
      AV51Coste_p = DecimalUtil.ZERO ;
      AV52CosteFab = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char6 = new String[1] ;
      AV55TxtAlb = "" ;
      AV53Valor = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV54Margen = DecimalUtil.ZERO ;
      AV102Costest = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char7 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.analisiscostesbasicos_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P093C3_A396EmprCod, P093C3_A161BarFecSal, P093C3_A159BarFecGen, P093C3_A1234BarNomCli, P093C3_A136BarColNum, P093C3_A135BarColNom, P093C3_A1652BarSerDsc, P093C3_A212BarSer, P093C3_A13696BarNHdr, P093C3_A279CliNom,
            P093C3_A252CliCod, P093C3_n252CliCod, P093C3_A140BarCosAny, P093C3_A141BarCosPro, P093C3_A184BarMtr, P093C3_A166BarKgm, P093C3_A129BarCod, P093C3_A132BarCodReo, P093C3_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV48InBarcodreo ;
   private byte GXv_int5[] ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int AV80Analisiscostesbasicos_wcds_2_tfclicod ;
   private int AV34TFCliCod ;
   private int AV81Analisiscostesbasicos_wcds_3_tfclicod_to ;
   private int AV35TFCliCod_To ;
   private int AV92Analisiscostesbasicos_wcds_14_tfbarcolnum ;
   private int AV62TFBarColNum ;
   private int AV93Analisiscostesbasicos_wcds_15_tfbarcolnum_to ;
   private int AV63TFBarColNum_To ;
   private int AV41Clicod ;
   private int AV50Clicod_to ;
   private int AV47InBarcod ;
   private int GXv_int4[] ;
   private int AV103GXV1 ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal AV96Analisiscostesbasicos_wcds_18_tfbarkgm ;
   private java.math.BigDecimal AV68TFBarKgm ;
   private java.math.BigDecimal AV97Analisiscostesbasicos_wcds_19_tfbarkgm_to ;
   private java.math.BigDecimal AV69TFBarKgm_To ;
   private java.math.BigDecimal AV98Analisiscostesbasicos_wcds_20_tfbarmtr ;
   private java.math.BigDecimal AV70TFBarMtr ;
   private java.math.BigDecimal AV99Analisiscostesbasicos_wcds_21_tfbarmtr_to ;
   private java.math.BigDecimal AV71TFBarMtr_To ;
   private java.math.BigDecimal AV51Coste_p ;
   private java.math.BigDecimal AV52CosteFab ;
   private java.math.BigDecimal AV53Valor ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV54Margen ;
   private java.math.BigDecimal AV102Costest ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV82Analisiscostesbasicos_wcds_4_tfclinom ;
   private String AV36TFCliNom ;
   private String AV83Analisiscostesbasicos_wcds_5_tfclinom_sel ;
   private String AV37TFCliNom_Sel ;
   private String AV84Analisiscostesbasicos_wcds_6_tfbarnhdr ;
   private String AV38TFBarNHdr ;
   private String AV85Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ;
   private String AV39TFBarNHdr_Sel ;
   private String AV86Analisiscostesbasicos_wcds_8_tfbarser ;
   private String AV56TFBarSer ;
   private String AV87Analisiscostesbasicos_wcds_9_tfbarser_sel ;
   private String AV57TFBarSer_Sel ;
   private String AV88Analisiscostesbasicos_wcds_10_tfbarserdsc ;
   private String AV58TFBarSerDsc ;
   private String AV89Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ;
   private String AV59TFBarSerDsc_Sel ;
   private String AV90Analisiscostesbasicos_wcds_12_tfbarcolnom ;
   private String AV60TFBarColNom ;
   private String AV91Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ;
   private String AV61TFBarColNom_Sel ;
   private String AV94Analisiscostesbasicos_wcds_16_tfbarnomcli ;
   private String AV66TFBarNomCli ;
   private String AV95Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ;
   private String AV67TFBarNomCli_Sel ;
   private String lV46Barser ;
   private String scmdbuf ;
   private String lV82Analisiscostesbasicos_wcds_4_tfclinom ;
   private String lV84Analisiscostesbasicos_wcds_6_tfbarnhdr ;
   private String lV86Analisiscostesbasicos_wcds_8_tfbarser ;
   private String lV88Analisiscostesbasicos_wcds_10_tfbarserdsc ;
   private String lV90Analisiscostesbasicos_wcds_12_tfbarcolnom ;
   private String lV94Analisiscostesbasicos_wcds_16_tfbarnomcli ;
   private String AV46Barser ;
   private String AV49InBarcodpar ;
   private String AV40Emprcod ;
   private String GXv_char3[] ;
   private String GXv_char6[] ;
   private String GXt_char2 ;
   private String GXv_char7[] ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV100Analisiscostesbasicos_wcds_22_tfbarfecgen ;
   private java.util.Date AV72TFBarFecGen ;
   private java.util.Date AV101Analisiscostesbasicos_wcds_23_tfbarfecsal ;
   private java.util.Date AV74TFBarFecSal ;
   private java.util.Date AV42Barfecgen ;
   private java.util.Date AV43Barfecgen_to ;
   private java.util.Date AV44BarFecsal ;
   private java.util.Date AV45Barfecsal_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n252CliCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV79Analisiscostesbasicos_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV79Analisiscostesbasicos_wcds_1_filterfulltext ;
   private String AV55TxtAlb ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P093C3_A396EmprCod ;
   private java.util.Date[] P093C3_A161BarFecSal ;
   private java.util.Date[] P093C3_A159BarFecGen ;
   private String[] P093C3_A1234BarNomCli ;
   private int[] P093C3_A136BarColNum ;
   private String[] P093C3_A135BarColNom ;
   private String[] P093C3_A1652BarSerDsc ;
   private String[] P093C3_A212BarSer ;
   private String[] P093C3_A13696BarNHdr ;
   private String[] P093C3_A279CliNom ;
   private int[] P093C3_A252CliCod ;
   private boolean[] P093C3_n252CliCod ;
   private java.math.BigDecimal[] P093C3_A140BarCosAny ;
   private java.math.BigDecimal[] P093C3_A141BarCosPro ;
   private java.math.BigDecimal[] P093C3_A184BarMtr ;
   private java.math.BigDecimal[] P093C3_A166BarKgm ;
   private int[] P093C3_A129BarCod ;
   private byte[] P093C3_A132BarCodReo ;
   private String[] P093C3_A130BarCodPar ;
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

final  class analisiscostesbasicos_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P093C3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV80Analisiscostesbasicos_wcds_2_tfclicod ,
                                          int AV81Analisiscostesbasicos_wcds_3_tfclicod_to ,
                                          String AV83Analisiscostesbasicos_wcds_5_tfclinom_sel ,
                                          String AV82Analisiscostesbasicos_wcds_4_tfclinom ,
                                          String AV85Analisiscostesbasicos_wcds_7_tfbarnhdr_sel ,
                                          String AV84Analisiscostesbasicos_wcds_6_tfbarnhdr ,
                                          String AV87Analisiscostesbasicos_wcds_9_tfbarser_sel ,
                                          String AV86Analisiscostesbasicos_wcds_8_tfbarser ,
                                          String AV89Analisiscostesbasicos_wcds_11_tfbarserdsc_sel ,
                                          String AV88Analisiscostesbasicos_wcds_10_tfbarserdsc ,
                                          String AV91Analisiscostesbasicos_wcds_13_tfbarcolnom_sel ,
                                          String AV90Analisiscostesbasicos_wcds_12_tfbarcolnom ,
                                          int AV92Analisiscostesbasicos_wcds_14_tfbarcolnum ,
                                          int AV93Analisiscostesbasicos_wcds_15_tfbarcolnum_to ,
                                          String AV95Analisiscostesbasicos_wcds_17_tfbarnomcli_sel ,
                                          String AV94Analisiscostesbasicos_wcds_16_tfbarnomcli ,
                                          java.math.BigDecimal AV96Analisiscostesbasicos_wcds_18_tfbarkgm ,
                                          java.math.BigDecimal AV97Analisiscostesbasicos_wcds_19_tfbarkgm_to ,
                                          java.math.BigDecimal AV98Analisiscostesbasicos_wcds_20_tfbarmtr ,
                                          java.math.BigDecimal AV99Analisiscostesbasicos_wcds_21_tfbarmtr_to ,
                                          java.util.Date AV100Analisiscostesbasicos_wcds_22_tfbarfecgen ,
                                          java.util.Date AV101Analisiscostesbasicos_wcds_23_tfbarfecsal ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A161BarFecSal ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV79Analisiscostesbasicos_wcds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          int AV41Clicod ,
                                          int AV50Clicod_to ,
                                          java.util.Date AV42Barfecgen ,
                                          java.util.Date AV43Barfecgen_to ,
                                          String AV46Barser ,
                                          java.util.Date AV44BarFecsal ,
                                          java.util.Date AV45Barfecsal_to ,
                                          int AV47InBarcod ,
                                          byte AV48InBarcodreo ,
                                          String AV49InBarcodpar ,
                                          String AV40Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[50];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarFecSal, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990')," ;
      scmdbuf += " 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod, T1.BarCosAny, T1.BarCosPro, COALESCE( T3.BarMtr," ;
      scmdbuf += " 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T3.BarMtr, 0),'999990.99'), 2) like '%' || ?)))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarSer like ? or (rtrim(?) IS NULL))");
      addWhere(sWhereString, "(T1.BarFecSal >= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarFecSal <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.BarCod = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodReo = ? or (? = 0))");
      addWhere(sWhereString, "(T1.BarCodPar = ? or (rtrim(?) IS NULL))");
      if ( ! (0==AV80Analisiscostesbasicos_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! (0==AV81Analisiscostesbasicos_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV82Analisiscostesbasicos_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Analisiscostesbasicos_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV84Analisiscostesbasicos_wcds_6_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Analisiscostesbasicos_wcds_7_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV86Analisiscostesbasicos_wcds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Analisiscostesbasicos_wcds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV88Analisiscostesbasicos_wcds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Analisiscostesbasicos_wcds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV90Analisiscostesbasicos_wcds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Analisiscostesbasicos_wcds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[39] = (byte)(1) ;
      }
      if ( ! (0==AV92Analisiscostesbasicos_wcds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[40] = (byte)(1) ;
      }
      if ( ! (0==AV93Analisiscostesbasicos_wcds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV94Analisiscostesbasicos_wcds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Analisiscostesbasicos_wcds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[43] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Analisiscostesbasicos_wcds_18_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int11[44] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Analisiscostesbasicos_wcds_19_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int11[45] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Analisiscostesbasicos_wcds_20_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int11[46] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Analisiscostesbasicos_wcds_21_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int11[47] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100Analisiscostesbasicos_wcds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV101Analisiscostesbasicos_wcds_23_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int11[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
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
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
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
                  return conditional_P093C3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).intValue() , (java.util.Date)dynConstraints[42] , (java.util.Date)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).byteValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093C3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((String[]) buf[8])[0] = rslt.getString(9, 11);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
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
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[65]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 26);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 26);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[94], 2);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
      }
   }

}

