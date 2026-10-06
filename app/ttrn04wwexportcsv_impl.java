package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn04wwexportcsv_impl extends GXWebProcedure
{
   public ttrn04wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TTrn04WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTrn04WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TTrn04WWColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disposicion Cliente Nueva", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Tipo Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero del Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Generacion Barcada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Disposicion Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Salida en Albaran", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "St", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Receta?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV128Ttrn04wwds_1_filterfulltext = AV117FilterFullText ;
      AV129Ttrn04wwds_2_tfbarnhdr = AV107TFBarNHdr ;
      AV130Ttrn04wwds_3_tfbarnhdr_sel = AV108TFBarNHdr_Sel ;
      AV131Ttrn04wwds_4_tfclinom = AV69TFCliNom ;
      AV132Ttrn04wwds_5_tfclinom_sel = AV70TFCliNom_Sel ;
      AV133Ttrn04wwds_6_tfbarenccli = AV119TFBarEncCli ;
      AV134Ttrn04wwds_7_tfbarenccli_sel = AV120TFBarEncCli_Sel ;
      AV135Ttrn04wwds_8_tfbarser = AV71TFBarSer ;
      AV136Ttrn04wwds_9_tfbarser_sel = AV72TFBarSer_Sel ;
      AV137Ttrn04wwds_10_tfbarserdsc = AV73TFBarSerDsc ;
      AV138Ttrn04wwds_11_tfbarserdsc_sel = AV74TFBarSerDsc_Sel ;
      AV139Ttrn04wwds_12_tfbartipartdsc = AV121TFBarTipArtDsc ;
      AV140Ttrn04wwds_13_tfbartipartdsc_sel = AV122TFBarTipArtDsc_Sel ;
      AV141Ttrn04wwds_14_tfclicod = AV67TFCliCod ;
      AV142Ttrn04wwds_15_tfclicod_to = AV68TFCliCod_To ;
      AV143Ttrn04wwds_16_tfbarcolnom = AV77TFBarColNom ;
      AV144Ttrn04wwds_17_tfbarcolnom_sel = AV78TFBarColNom_Sel ;
      AV145Ttrn04wwds_18_tfbarcolnum = AV79TFBarColNum ;
      AV146Ttrn04wwds_19_tfbarcolnum_to = AV80TFBarColNum_To ;
      AV147Ttrn04wwds_20_tfbarfecgen = AV83TFBarFecGen ;
      AV148Ttrn04wwds_21_tfbarfeccli = AV85TFBarFecCli ;
      AV149Ttrn04wwds_22_tfbarfecsal = AV89TFBarFecSal ;
      AV150Ttrn04wwds_23_tfbarsit = AV115TFBarSit ;
      AV151Ttrn04wwds_24_tfbarsit_to = AV116TFBarSit_To ;
      AV152Ttrn04wwds_25_tfhayrec_sel = AV118TFHayRec_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV128Ttrn04wwds_1_filterfulltext ,
                                           AV130Ttrn04wwds_3_tfbarnhdr_sel ,
                                           AV129Ttrn04wwds_2_tfbarnhdr ,
                                           AV132Ttrn04wwds_5_tfclinom_sel ,
                                           AV131Ttrn04wwds_4_tfclinom ,
                                           AV134Ttrn04wwds_7_tfbarenccli_sel ,
                                           AV133Ttrn04wwds_6_tfbarenccli ,
                                           AV136Ttrn04wwds_9_tfbarser_sel ,
                                           AV135Ttrn04wwds_8_tfbarser ,
                                           AV138Ttrn04wwds_11_tfbarserdsc_sel ,
                                           AV137Ttrn04wwds_10_tfbarserdsc ,
                                           AV140Ttrn04wwds_13_tfbartipartdsc_sel ,
                                           AV139Ttrn04wwds_12_tfbartipartdsc ,
                                           Integer.valueOf(AV141Ttrn04wwds_14_tfclicod) ,
                                           Integer.valueOf(AV142Ttrn04wwds_15_tfclicod_to) ,
                                           AV144Ttrn04wwds_17_tfbarcolnom_sel ,
                                           AV143Ttrn04wwds_16_tfbarcolnom ,
                                           Integer.valueOf(AV145Ttrn04wwds_18_tfbarcolnum) ,
                                           Integer.valueOf(AV146Ttrn04wwds_19_tfbarcolnum_to) ,
                                           AV147Ttrn04wwds_20_tfbarfecgen ,
                                           AV148Ttrn04wwds_21_tfbarfeccli ,
                                           AV149Ttrn04wwds_22_tfbarfecsal ,
                                           Byte.valueOf(AV150Ttrn04wwds_23_tfbarsit) ,
                                           Byte.valueOf(AV151Ttrn04wwds_24_tfbarsit_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A13711BarTipArtD ,
                                           Integer.valueOf(A252CliCod) ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A161BarFecSal ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           Byte.valueOf(AV152Ttrn04wwds_25_tfhayrec_sel) ,
                                           Byte.valueOf(A13710HayRec) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV128Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV128Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV128Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV128Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV128Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV128Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV128Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV128Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV128Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV128Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV128Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV128Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV128Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV128Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV128Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV128Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV128Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV128Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV128Ttrn04wwds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV128Ttrn04wwds_1_filterfulltext), "%", "") ;
      lV129Ttrn04wwds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV129Ttrn04wwds_2_tfbarnhdr), 11, "%") ;
      lV131Ttrn04wwds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV131Ttrn04wwds_4_tfclinom), 30, "%") ;
      lV133Ttrn04wwds_6_tfbarenccli = GXutil.padr( GXutil.rtrim( AV133Ttrn04wwds_6_tfbarenccli), 20, "%") ;
      lV135Ttrn04wwds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV135Ttrn04wwds_8_tfbarser), 16, "%") ;
      lV137Ttrn04wwds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV137Ttrn04wwds_10_tfbarserdsc), 26, "%") ;
      lV139Ttrn04wwds_12_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV139Ttrn04wwds_12_tfbartipartdsc), 30, "%") ;
      lV143Ttrn04wwds_16_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV143Ttrn04wwds_16_tfbarcolnom), 13, "%") ;
      /* Using cursor P088K2 */
      pr_default.execute(0, new Object[] {lV128Ttrn04wwds_1_filterfulltext, lV128Ttrn04wwds_1_filterfulltext, lV128Ttrn04wwds_1_filterfulltext, lV128Ttrn04wwds_1_filterfulltext, lV128Ttrn04wwds_1_filterfulltext, lV128Ttrn04wwds_1_filterfulltext, lV128Ttrn04wwds_1_filterfulltext, lV128Ttrn04wwds_1_filterfulltext, lV128Ttrn04wwds_1_filterfulltext, lV128Ttrn04wwds_1_filterfulltext, lV129Ttrn04wwds_2_tfbarnhdr, AV130Ttrn04wwds_3_tfbarnhdr_sel, lV131Ttrn04wwds_4_tfclinom, AV132Ttrn04wwds_5_tfclinom_sel, lV133Ttrn04wwds_6_tfbarenccli, AV134Ttrn04wwds_7_tfbarenccli_sel, lV135Ttrn04wwds_8_tfbarser, AV136Ttrn04wwds_9_tfbarser_sel, lV137Ttrn04wwds_10_tfbarserdsc, AV138Ttrn04wwds_11_tfbarserdsc_sel, lV139Ttrn04wwds_12_tfbartipartdsc, AV140Ttrn04wwds_13_tfbartipartdsc_sel, Integer.valueOf(AV141Ttrn04wwds_14_tfclicod), Integer.valueOf(AV142Ttrn04wwds_15_tfclicod_to), lV143Ttrn04wwds_16_tfbarcolnom, AV144Ttrn04wwds_17_tfbarcolnom_sel, Integer.valueOf(AV145Ttrn04wwds_18_tfbarcolnum), Integer.valueOf(AV146Ttrn04wwds_19_tfbarcolnum_to), AV147Ttrn04wwds_20_tfbarfecgen, AV148Ttrn04wwds_21_tfbarfeccli, AV149Ttrn04wwds_22_tfbarfecsal, Byte.valueOf(AV150Ttrn04wwds_23_tfbarsit), Byte.valueOf(AV151Ttrn04wwds_24_tfbarsit_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P088K2_A217BarTipArt[0] ;
         n217BarTipArt = P088K2_n217BarTipArt[0] ;
         A213BarSit = P088K2_A213BarSit[0] ;
         A161BarFecSal = P088K2_A161BarFecSal[0] ;
         A155BarFecCli = P088K2_A155BarFecCli[0] ;
         A159BarFecGen = P088K2_A159BarFecGen[0] ;
         A136BarColNum = P088K2_A136BarColNum[0] ;
         A135BarColNom = P088K2_A135BarColNom[0] ;
         A252CliCod = P088K2_A252CliCod[0] ;
         n252CliCod = P088K2_n252CliCod[0] ;
         A13711BarTipArtD = P088K2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088K2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P088K2_A1652BarSerDsc[0] ;
         A212BarSer = P088K2_A212BarSer[0] ;
         A4812BarEncCli = P088K2_A4812BarEncCli[0] ;
         A279CliNom = P088K2_A279CliNom[0] ;
         A130BarCodPar = P088K2_A130BarCodPar[0] ;
         A132BarCodReo = P088K2_A132BarCodReo[0] ;
         A129BarCod = P088K2_A129BarCod[0] ;
         A396EmprCod = P088K2_A396EmprCod[0] ;
         A13711BarTipArtD = P088K2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P088K2_n13711BarTipArtD[0] ;
         A279CliNom = P088K2_A279CliNom[0] ;
         GXt_int2 = A13710HayRec ;
         GXv_int3[0] = GXt_int2 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         ttrn04wwexportcsv_impl.this.GXt_int2 = GXv_int3[0] ;
         A13710HayRec = GXt_int2 ;
         if ( ( AV152Ttrn04wwds_25_tfhayrec_sel != 1 ) || ( ( A13710HayRec == 1 ) ) )
         {
            if ( ( AV152Ttrn04wwds_25_tfhayrec_sel != 2 ) || ( ( A13710HayRec == 0 ) ) )
            {
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
                  AV14TextFileLine += ";" ;
                  GXt_char4 = AV14TextFileLine ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char5) ;
                  ttrn04wwexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
                  AV14TextFileLine += GXt_char4 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char4 = AV14TextFileLine ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char5) ;
                  ttrn04wwexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
                  AV14TextFileLine += GXt_char4 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char4 = AV14TextFileLine ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4812BarEncCli, ";", ","), GXv_char5) ;
                  ttrn04wwexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
                  AV14TextFileLine += GXt_char4 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char4 = AV14TextFileLine ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char5) ;
                  ttrn04wwexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
                  AV14TextFileLine += GXt_char4 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char4 = AV14TextFileLine ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char5) ;
                  ttrn04wwexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
                  AV14TextFileLine += GXt_char4 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char4 = AV14TextFileLine ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13711BarTipArtD, ";", ","), GXv_char5) ;
                  ttrn04wwexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
                  AV14TextFileLine += GXt_char4 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char4 = AV14TextFileLine ;
                  GXv_char5[0] = GXt_char4 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char5) ;
                  ttrn04wwexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
                  AV14TextFileLine += GXt_char4 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += localUtil.dtoc( A155BarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += localUtil.dtoc( A161BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A213BarSit, 2, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A13710HayRec, 1, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TTrn04WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarNHdr", "", "N° Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarEncCli", "", "Disposicion Cliente Nueva", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSer", "", "Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarTipArtDsc", "", "Descripcion Tipo Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNom", "", "Nombre Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarColNum", "", "Numero del Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarFecGen", "", "Fecha Generacion Barcada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarFecCli", "", "Fecha Disposicion Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "BarSit", "", "St", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "HayRec", "", "Receta?", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TTrn04WWColumnsSelector", GXv_char5) ;
      ttrn04wwexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
      AV20UserCustomValue = GXt_char4 ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TTrn04WWGridState"), "") == 0 )
      {
         AV55GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TTrn04WWGridState"), null, null);
      }
      else
      {
         AV55GridState.fromxml(AV19Session.getValue("TTrn04WWGridState"), null, null);
      }
      AV28OrderedBy = AV55GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV55GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV153GXV1 = 1 ;
      while ( AV153GXV1 <= AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV56GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV55GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV153GXV1));
         if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV117FilterFullText = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV107TFBarNHdr = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV108TFBarNHdr_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV69TFCliNom = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV70TFCliNom_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI") == 0 )
         {
            AV119TFBarEncCli = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARENCCLI_SEL") == 0 )
         {
            AV120TFBarEncCli_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV71TFBarSer = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV72TFBarSer_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV73TFBarSerDsc = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV74TFBarSerDsc_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV121TFBarTipArtDsc = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV122TFBarTipArtDsc_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV67TFCliCod = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFCliCod_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV77TFBarColNom = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV78TFBarColNom_Sel = AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV79TFBarColNum = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV80TFBarColNum_To = (int)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV83TFBarFecGen = localUtil.ctod( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV85TFBarFecCli = localUtil.ctod( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV89TFBarFecSal = localUtil.ctod( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV115TFBarSit = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV116TFBarSit_To = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHAYREC_SEL") == 0 )
         {
            AV118TFHayRec_Sel = (byte)(GXutil.lval( AV56GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV153GXV1 = (int)(AV153GXV1+1) ;
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
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      AV128Ttrn04wwds_1_filterfulltext = "" ;
      AV117FilterFullText = "" ;
      AV129Ttrn04wwds_2_tfbarnhdr = "" ;
      AV107TFBarNHdr = "" ;
      AV130Ttrn04wwds_3_tfbarnhdr_sel = "" ;
      AV108TFBarNHdr_Sel = "" ;
      AV131Ttrn04wwds_4_tfclinom = "" ;
      AV69TFCliNom = "" ;
      AV132Ttrn04wwds_5_tfclinom_sel = "" ;
      AV70TFCliNom_Sel = "" ;
      AV133Ttrn04wwds_6_tfbarenccli = "" ;
      AV119TFBarEncCli = "" ;
      AV134Ttrn04wwds_7_tfbarenccli_sel = "" ;
      AV120TFBarEncCli_Sel = "" ;
      AV135Ttrn04wwds_8_tfbarser = "" ;
      AV71TFBarSer = "" ;
      AV136Ttrn04wwds_9_tfbarser_sel = "" ;
      AV72TFBarSer_Sel = "" ;
      AV137Ttrn04wwds_10_tfbarserdsc = "" ;
      AV73TFBarSerDsc = "" ;
      AV138Ttrn04wwds_11_tfbarserdsc_sel = "" ;
      AV74TFBarSerDsc_Sel = "" ;
      AV139Ttrn04wwds_12_tfbartipartdsc = "" ;
      AV121TFBarTipArtDsc = "" ;
      AV140Ttrn04wwds_13_tfbartipartdsc_sel = "" ;
      AV122TFBarTipArtDsc_Sel = "" ;
      AV143Ttrn04wwds_16_tfbarcolnom = "" ;
      AV77TFBarColNom = "" ;
      AV144Ttrn04wwds_17_tfbarcolnom_sel = "" ;
      AV78TFBarColNom_Sel = "" ;
      AV147Ttrn04wwds_20_tfbarfecgen = GXutil.nullDate() ;
      AV83TFBarFecGen = GXutil.nullDate() ;
      AV148Ttrn04wwds_21_tfbarfeccli = GXutil.nullDate() ;
      AV85TFBarFecCli = GXutil.nullDate() ;
      AV149Ttrn04wwds_22_tfbarfecsal = GXutil.nullDate() ;
      AV89TFBarFecSal = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV128Ttrn04wwds_1_filterfulltext = "" ;
      lV129Ttrn04wwds_2_tfbarnhdr = "" ;
      lV131Ttrn04wwds_4_tfclinom = "" ;
      lV133Ttrn04wwds_6_tfbarenccli = "" ;
      lV135Ttrn04wwds_8_tfbarser = "" ;
      lV137Ttrn04wwds_10_tfbarserdsc = "" ;
      lV139Ttrn04wwds_12_tfbartipartdsc = "" ;
      lV143Ttrn04wwds_16_tfbarcolnom = "" ;
      A130BarCodPar = "" ;
      P088K2_A217BarTipArt = new short[1] ;
      P088K2_n217BarTipArt = new boolean[] {false} ;
      P088K2_A213BarSit = new byte[1] ;
      P088K2_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P088K2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P088K2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P088K2_A136BarColNum = new int[1] ;
      P088K2_A135BarColNom = new String[] {""} ;
      P088K2_A252CliCod = new int[1] ;
      P088K2_n252CliCod = new boolean[] {false} ;
      P088K2_A13711BarTipArtD = new String[] {""} ;
      P088K2_n13711BarTipArtD = new boolean[] {false} ;
      P088K2_A1652BarSerDsc = new String[] {""} ;
      P088K2_A212BarSer = new String[] {""} ;
      P088K2_A4812BarEncCli = new String[] {""} ;
      P088K2_A279CliNom = new String[] {""} ;
      P088K2_A130BarCodPar = new String[] {""} ;
      P088K2_A132BarCodReo = new byte[1] ;
      P088K2_A129BarCod = new int[1] ;
      P088K2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      GXv_int3 = new byte[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV55GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV56GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn04wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P088K2_A217BarTipArt, P088K2_n217BarTipArt, P088K2_A213BarSit, P088K2_A161BarFecSal, P088K2_A155BarFecCli, P088K2_A159BarFecGen, P088K2_A136BarColNum, P088K2_A135BarColNom, P088K2_A252CliCod, P088K2_n252CliCod,
            P088K2_A13711BarTipArtD, P088K2_n13711BarTipArtD, P088K2_A1652BarSerDsc, P088K2_A212BarSer, P088K2_A4812BarEncCli, P088K2_A279CliNom, P088K2_A130BarCodPar, P088K2_A132BarCodReo, P088K2_A129BarCod, P088K2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte AV150Ttrn04wwds_23_tfbarsit ;
   private byte AV115TFBarSit ;
   private byte AV151Ttrn04wwds_24_tfbarsit_to ;
   private byte AV116TFBarSit_To ;
   private byte AV152Ttrn04wwds_25_tfhayrec_sel ;
   private byte AV118TFHayRec_Sel ;
   private byte A132BarCodReo ;
   private byte GXt_int2 ;
   private byte GXv_int3[] ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short A217BarTipArt ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV141Ttrn04wwds_14_tfclicod ;
   private int AV67TFCliCod ;
   private int AV142Ttrn04wwds_15_tfclicod_to ;
   private int AV68TFCliCod_To ;
   private int AV145Ttrn04wwds_18_tfbarcolnum ;
   private int AV79TFBarColNum ;
   private int AV146Ttrn04wwds_19_tfbarcolnum_to ;
   private int AV80TFBarColNum_To ;
   private int A129BarCod ;
   private int AV153GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String AV129Ttrn04wwds_2_tfbarnhdr ;
   private String AV107TFBarNHdr ;
   private String AV130Ttrn04wwds_3_tfbarnhdr_sel ;
   private String AV108TFBarNHdr_Sel ;
   private String AV131Ttrn04wwds_4_tfclinom ;
   private String AV69TFCliNom ;
   private String AV132Ttrn04wwds_5_tfclinom_sel ;
   private String AV70TFCliNom_Sel ;
   private String AV133Ttrn04wwds_6_tfbarenccli ;
   private String AV119TFBarEncCli ;
   private String AV134Ttrn04wwds_7_tfbarenccli_sel ;
   private String AV120TFBarEncCli_Sel ;
   private String AV135Ttrn04wwds_8_tfbarser ;
   private String AV71TFBarSer ;
   private String AV136Ttrn04wwds_9_tfbarser_sel ;
   private String AV72TFBarSer_Sel ;
   private String AV137Ttrn04wwds_10_tfbarserdsc ;
   private String AV73TFBarSerDsc ;
   private String AV138Ttrn04wwds_11_tfbarserdsc_sel ;
   private String AV74TFBarSerDsc_Sel ;
   private String AV139Ttrn04wwds_12_tfbartipartdsc ;
   private String AV121TFBarTipArtDsc ;
   private String AV140Ttrn04wwds_13_tfbartipartdsc_sel ;
   private String AV122TFBarTipArtDsc_Sel ;
   private String AV143Ttrn04wwds_16_tfbarcolnom ;
   private String AV77TFBarColNom ;
   private String AV144Ttrn04wwds_17_tfbarcolnom_sel ;
   private String AV78TFBarColNom_Sel ;
   private String scmdbuf ;
   private String lV129Ttrn04wwds_2_tfbarnhdr ;
   private String lV131Ttrn04wwds_4_tfclinom ;
   private String lV133Ttrn04wwds_6_tfbarenccli ;
   private String lV135Ttrn04wwds_8_tfbarser ;
   private String lV137Ttrn04wwds_10_tfbarserdsc ;
   private String lV139Ttrn04wwds_12_tfbartipartdsc ;
   private String lV143Ttrn04wwds_16_tfbarcolnom ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV147Ttrn04wwds_20_tfbarfecgen ;
   private java.util.Date AV83TFBarFecGen ;
   private java.util.Date AV148Ttrn04wwds_21_tfbarfeccli ;
   private java.util.Date AV85TFBarFecCli ;
   private java.util.Date AV149Ttrn04wwds_22_tfbarfecsal ;
   private java.util.Date AV89TFBarFecSal ;
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
   private String AV128Ttrn04wwds_1_filterfulltext ;
   private String AV117FilterFullText ;
   private String lV128Ttrn04wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P088K2_A217BarTipArt ;
   private boolean[] P088K2_n217BarTipArt ;
   private byte[] P088K2_A213BarSit ;
   private java.util.Date[] P088K2_A161BarFecSal ;
   private java.util.Date[] P088K2_A155BarFecCli ;
   private java.util.Date[] P088K2_A159BarFecGen ;
   private int[] P088K2_A136BarColNum ;
   private String[] P088K2_A135BarColNom ;
   private int[] P088K2_A252CliCod ;
   private boolean[] P088K2_n252CliCod ;
   private String[] P088K2_A13711BarTipArtD ;
   private boolean[] P088K2_n13711BarTipArtD ;
   private String[] P088K2_A1652BarSerDsc ;
   private String[] P088K2_A212BarSer ;
   private String[] P088K2_A4812BarEncCli ;
   private String[] P088K2_A279CliNom ;
   private String[] P088K2_A130BarCodPar ;
   private byte[] P088K2_A132BarCodReo ;
   private int[] P088K2_A129BarCod ;
   private String[] P088K2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV55GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV56GridStateFilterValue ;
}

final  class ttrn04wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P088K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV128Ttrn04wwds_1_filterfulltext ,
                                          String AV130Ttrn04wwds_3_tfbarnhdr_sel ,
                                          String AV129Ttrn04wwds_2_tfbarnhdr ,
                                          String AV132Ttrn04wwds_5_tfclinom_sel ,
                                          String AV131Ttrn04wwds_4_tfclinom ,
                                          String AV134Ttrn04wwds_7_tfbarenccli_sel ,
                                          String AV133Ttrn04wwds_6_tfbarenccli ,
                                          String AV136Ttrn04wwds_9_tfbarser_sel ,
                                          String AV135Ttrn04wwds_8_tfbarser ,
                                          String AV138Ttrn04wwds_11_tfbarserdsc_sel ,
                                          String AV137Ttrn04wwds_10_tfbarserdsc ,
                                          String AV140Ttrn04wwds_13_tfbartipartdsc_sel ,
                                          String AV139Ttrn04wwds_12_tfbartipartdsc ,
                                          int AV141Ttrn04wwds_14_tfclicod ,
                                          int AV142Ttrn04wwds_15_tfclicod_to ,
                                          String AV144Ttrn04wwds_17_tfbarcolnom_sel ,
                                          String AV143Ttrn04wwds_16_tfbarcolnom ,
                                          int AV145Ttrn04wwds_18_tfbarcolnum ,
                                          int AV146Ttrn04wwds_19_tfbarcolnum_to ,
                                          java.util.Date AV147Ttrn04wwds_20_tfbarfecgen ,
                                          java.util.Date AV148Ttrn04wwds_21_tfbarfeccli ,
                                          java.util.Date AV149Ttrn04wwds_22_tfbarfecsal ,
                                          byte AV150Ttrn04wwds_23_tfbarsit ,
                                          byte AV151Ttrn04wwds_24_tfbarsit_to ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A279CliNom ,
                                          String A4812BarEncCli ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A13711BarTipArtD ,
                                          int A252CliCod ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A161BarFecSal ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          byte AV152Ttrn04wwds_25_tfhayrec_sel ,
                                          byte A13710HayRec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[33];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarFecGen, T1.BarColNum, T1.BarColNom, T1.CliCod, T2.TipArtDsc AS BarTipArtD, T1.BarSerDsc," ;
      scmdbuf += " T1.BarSer, T1.BarEncCli, T3.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      if ( ! (GXutil.strcmp("", AV128Ttrn04wwds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarEncCli) like '%' || UPPER(?)) or ( UPPER(T1.BarSer) like '%' || UPPER(?)) or ( UPPER(T1.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.TipArtDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T1.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNum,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarSit,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
         GXv_int8[1] = (byte)(1) ;
         GXv_int8[2] = (byte)(1) ;
         GXv_int8[3] = (byte)(1) ;
         GXv_int8[4] = (byte)(1) ;
         GXv_int8[5] = (byte)(1) ;
         GXv_int8[6] = (byte)(1) ;
         GXv_int8[7] = (byte)(1) ;
         GXv_int8[8] = (byte)(1) ;
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Ttrn04wwds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV129Ttrn04wwds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Ttrn04wwds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Ttrn04wwds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV131Ttrn04wwds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Ttrn04wwds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Ttrn04wwds_7_tfbarenccli_sel)==0) && ( ! (GXutil.strcmp("", AV133Ttrn04wwds_6_tfbarenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Ttrn04wwds_7_tfbarenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Ttrn04wwds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV135Ttrn04wwds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Ttrn04wwds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Ttrn04wwds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV137Ttrn04wwds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Ttrn04wwds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Ttrn04wwds_13_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV139Ttrn04wwds_12_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Ttrn04wwds_13_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV141Ttrn04wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV142Ttrn04wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV144Ttrn04wwds_17_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV143Ttrn04wwds_16_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV144Ttrn04wwds_17_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (0==AV145Ttrn04wwds_18_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV146Ttrn04wwds_19_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV147Ttrn04wwds_20_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV148Ttrn04wwds_21_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV149Ttrn04wwds_22_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV150Ttrn04wwds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV151Ttrn04wwds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarEncCli" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarEncCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
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
                  return conditional_P088K2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (java.util.Date)dynConstraints[19] , (java.util.Date)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).shortValue() , ((Boolean) dynConstraints[40]).booleanValue() , ((Number) dynConstraints[41]).byteValue() , ((Number) dynConstraints[42]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P088K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 16);
               ((String[]) buf[14])[0] = rslt.getString(12, 20);
               ((String[]) buf[15])[0] = rslt.getString(13, 30);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((int[]) buf[18])[0] = rslt.getInt(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 3);
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
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 11);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[61]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[62]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               return;
      }
   }

}

