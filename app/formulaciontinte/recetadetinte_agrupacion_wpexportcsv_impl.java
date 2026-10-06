package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte_agrupacion_wpexportcsv_impl extends GXWebProcedure
{
   public recetadetinte_agrupacion_wpexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "RecetadeTinte_Agrupacion_WPExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº HDR", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cód Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N° Color Cliente", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = AV30FilterFullText ;
      AV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = AV88TFBarAgrNhdr ;
      AV95Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = AV89TFBarAgrNhdr_Sel ;
      AV96Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = AV62TFKgmAgr ;
      AV97Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = AV63TFKgmAgr_To ;
      AV98Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = AV66TFMtrAgr ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = AV67TFMtrAgr_To ;
      AV100Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr = AV64TFPieAgr ;
      AV101Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to = AV65TFPieAgr_To ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = AV68TFBarAgrSer ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = AV69TFBarAgrSer_Sel ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = AV70TFBarAgrDsc ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = AV71TFBarAgrDsc_Sel ;
      AV106Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr = AV72TFCliCodAgr ;
      AV107Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to = AV73TFCliCodAgr_To ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = AV76TFColNomAgr ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = AV77TFColNomAgr_Sel ;
      AV110Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr = AV78TFColNumAgr ;
      AV111Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to = AV79TFColNumAgr_To ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = AV80TFColNoCAgr ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = AV81TFColNoCAgr_Sel ;
      AV114Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr = AV82TFColNuCAgr ;
      AV115Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to = AV83TFColNuCAgr_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                           AV95Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                           AV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                           AV96Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                           AV97Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                           AV98Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                           AV99Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                           Short.valueOf(AV100Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) ,
                                           Short.valueOf(AV101Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) ,
                                           AV103Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                           AV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                           AV105Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                           AV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                           Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) ,
                                           Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) ,
                                           AV109Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                           AV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                           Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) ,
                                           Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) ,
                                           AV113Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                           AV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                           Integer.valueOf(AV114Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) ,
                                           Integer.valueOf(AV115Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) ,
                                           Integer.valueOf(A119BarAgrCod) ,
                                           Byte.valueOf(A124BarAgrReo) ,
                                           A122BarAgrPar ,
                                           A590KgmAgr ,
                                           A869MtrAgr ,
                                           Short.valueOf(A671PieAgr) ,
                                           A1245BarAgrSer ,
                                           A1507BarAgrDsc ,
                                           Integer.valueOf(A1508CliCodAgr) ,
                                           A1510ColNomAgr ,
                                           Integer.valueOf(A1512ColNumAgr) ,
                                           A1509ColNoCAgr ,
                                           Integer.valueOf(A1511ColNuCAgr) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext), "%", "") ;
      lV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = GXutil.padr( GXutil.rtrim( AV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr), 11, "%") ;
      lV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = GXutil.padr( GXutil.rtrim( AV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser), 16, "%") ;
      lV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc), 26, "%") ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = GXutil.padr( GXutil.rtrim( AV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr), 13, "%") ;
      lV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = GXutil.padr( GXutil.rtrim( AV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr), 13, "%") ;
      /* Using cursor P09H92 */
      pr_default.execute(0, new Object[] {lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext, lV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr, AV95Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel, AV96Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr, AV97Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to, AV98Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr, AV99Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to, Short.valueOf(AV100Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr), Short.valueOf(AV101Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to), lV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser, AV103Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel, lV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc, AV105Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel, Integer.valueOf(AV106Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr), Integer.valueOf(AV107Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to), lV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr, AV109Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel, Integer.valueOf(AV110Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr), Integer.valueOf(AV111Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to), lV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr, AV113Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel, Integer.valueOf(AV114Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr), Integer.valueOf(AV115Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1511ColNuCAgr = P09H92_A1511ColNuCAgr[0] ;
         A1509ColNoCAgr = P09H92_A1509ColNoCAgr[0] ;
         A1512ColNumAgr = P09H92_A1512ColNumAgr[0] ;
         A1510ColNomAgr = P09H92_A1510ColNomAgr[0] ;
         A1508CliCodAgr = P09H92_A1508CliCodAgr[0] ;
         A1507BarAgrDsc = P09H92_A1507BarAgrDsc[0] ;
         A1245BarAgrSer = P09H92_A1245BarAgrSer[0] ;
         A671PieAgr = P09H92_A671PieAgr[0] ;
         A869MtrAgr = P09H92_A869MtrAgr[0] ;
         A590KgmAgr = P09H92_A590KgmAgr[0] ;
         A122BarAgrPar = P09H92_A122BarAgrPar[0] ;
         A124BarAgrReo = P09H92_A124BarAgrReo[0] ;
         A119BarAgrCod = P09H92_A119BarAgrCod[0] ;
         A396EmprCod = P09H92_A396EmprCod[0] ;
         A129BarCod = P09H92_A129BarCod[0] ;
         A132BarCodReo = P09H92_A132BarCodReo[0] ;
         A130BarCodPar = P09H92_A130BarCodPar[0] ;
         A13792BarAgrNhdr = GXutil.str( A119BarAgrCod, 8, 0) + "-" + GXutil.str( A124BarAgrReo, 1, 0) + A122BarAgrPar ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13792BarAgrNhdr, ";", ","), GXv_char3) ;
            recetadetinte_agrupacion_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A590KgmAgr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A869MtrAgr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A671PieAgr, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1245BarAgrSer, ";", ","), GXv_char3) ;
            recetadetinte_agrupacion_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1507BarAgrDsc, ";", ","), GXv_char3) ;
            recetadetinte_agrupacion_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1508CliCodAgr, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1510ColNomAgr, ";", ","), GXv_char3) ;
            recetadetinte_agrupacion_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1512ColNumAgr, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1509ColNoCAgr, ";", ","), GXv_char3) ;
            recetadetinte_agrupacion_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1511ColNuCAgr, 6, 0) ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=RecetadeTinte_Agrupacion_WPExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarAgrNhdr", "", "Nº HDR", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "KgmAgr", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MtrAgr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PieAgr", "", "Piezas", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarAgrSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarAgrDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCodAgr", "", "Cód Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ColNomAgr", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ColNumAgr", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ColNoCAgr", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ColNuCAgr", "", "N° Color Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.RecetadeTinte_Agrupacion_WPColumnsSelector", GXv_char3) ;
      recetadetinte_agrupacion_wpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.RecetadeTinte_Agrupacion_WPGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("FormulacionTinte.RecetadeTinte_Agrupacion_WPGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV116GXV1 = 1 ;
      while ( AV116GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV116GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR") == 0 )
         {
            AV88TFBarAgrNhdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRNHDR_SEL") == 0 )
         {
            AV89TFBarAgrNhdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKGMAGR") == 0 )
         {
            AV62TFKgmAgr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV63TFKgmAgr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMTRAGR") == 0 )
         {
            AV66TFMtrAgr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV67TFMtrAgr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEAGR") == 0 )
         {
            AV64TFPieAgr = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFPieAgr_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER") == 0 )
         {
            AV68TFBarAgrSer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRSER_SEL") == 0 )
         {
            AV69TFBarAgrSer_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC") == 0 )
         {
            AV70TFBarAgrDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRDSC_SEL") == 0 )
         {
            AV71TFBarAgrDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICODAGR") == 0 )
         {
            AV72TFCliCodAgr = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFCliCodAgr_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR") == 0 )
         {
            AV76TFColNomAgr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOMAGR_SEL") == 0 )
         {
            AV77TFColNomAgr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUMAGR") == 0 )
         {
            AV78TFColNumAgr = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV79TFColNumAgr_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOCAGR") == 0 )
         {
            AV80TFColNoCAgr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNOCAGR_SEL") == 0 )
         {
            AV81TFColNoCAgr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLNUCAGR") == 0 )
         {
            AV82TFColNuCAgr = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV83TFColNuCAgr_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV116GXV1 = (int)(AV116GXV1+1) ;
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
      A13792BarAgrNhdr = "" ;
      A590KgmAgr = DecimalUtil.ZERO ;
      A869MtrAgr = DecimalUtil.ZERO ;
      A1245BarAgrSer = "" ;
      A1507BarAgrDsc = "" ;
      A1510ColNomAgr = "" ;
      A1509ColNoCAgr = "" ;
      AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = "" ;
      AV88TFBarAgrNhdr = "" ;
      AV95Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel = "" ;
      AV89TFBarAgrNhdr_Sel = "" ;
      AV96Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr = DecimalUtil.ZERO ;
      AV62TFKgmAgr = DecimalUtil.ZERO ;
      AV97Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to = DecimalUtil.ZERO ;
      AV63TFKgmAgr_To = DecimalUtil.ZERO ;
      AV98Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr = DecimalUtil.ZERO ;
      AV66TFMtrAgr = DecimalUtil.ZERO ;
      AV99Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to = DecimalUtil.ZERO ;
      AV67TFMtrAgr_To = DecimalUtil.ZERO ;
      AV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = "" ;
      AV68TFBarAgrSer = "" ;
      AV103Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel = "" ;
      AV69TFBarAgrSer_Sel = "" ;
      AV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = "" ;
      AV70TFBarAgrDsc = "" ;
      AV105Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel = "" ;
      AV71TFBarAgrDsc_Sel = "" ;
      AV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = "" ;
      AV76TFColNomAgr = "" ;
      AV109Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel = "" ;
      AV77TFColNomAgr_Sel = "" ;
      AV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = "" ;
      AV80TFColNoCAgr = "" ;
      AV113Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel = "" ;
      AV81TFColNoCAgr_Sel = "" ;
      scmdbuf = "" ;
      lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext = "" ;
      lV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr = "" ;
      lV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser = "" ;
      lV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc = "" ;
      lV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr = "" ;
      lV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr = "" ;
      A122BarAgrPar = "" ;
      P09H92_A1511ColNuCAgr = new int[1] ;
      P09H92_A1509ColNoCAgr = new String[] {""} ;
      P09H92_A1512ColNumAgr = new int[1] ;
      P09H92_A1510ColNomAgr = new String[] {""} ;
      P09H92_A1508CliCodAgr = new int[1] ;
      P09H92_A1507BarAgrDsc = new String[] {""} ;
      P09H92_A1245BarAgrSer = new String[] {""} ;
      P09H92_A671PieAgr = new short[1] ;
      P09H92_A869MtrAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H92_A590KgmAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09H92_A122BarAgrPar = new String[] {""} ;
      P09H92_A124BarAgrReo = new byte[1] ;
      P09H92_A119BarAgrCod = new int[1] ;
      P09H92_A396EmprCod = new String[] {""} ;
      P09H92_A129BarCod = new int[1] ;
      P09H92_A132BarCodReo = new byte[1] ;
      P09H92_A130BarCodPar = new String[] {""} ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.recetadetinte_agrupacion_wpexportcsv__default(),
         new Object[] {
             new Object[] {
            P09H92_A1511ColNuCAgr, P09H92_A1509ColNoCAgr, P09H92_A1512ColNumAgr, P09H92_A1510ColNomAgr, P09H92_A1508CliCodAgr, P09H92_A1507BarAgrDsc, P09H92_A1245BarAgrSer, P09H92_A671PieAgr, P09H92_A869MtrAgr, P09H92_A590KgmAgr,
            P09H92_A122BarAgrPar, P09H92_A124BarAgrReo, P09H92_A119BarAgrCod, P09H92_A396EmprCod, P09H92_A129BarCod, P09H92_A132BarCodReo, P09H92_A130BarCodPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A124BarAgrReo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A671PieAgr ;
   private short AV100Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ;
   private short AV64TFPieAgr ;
   private short AV101Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ;
   private short AV65TFPieAgr_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A1508CliCodAgr ;
   private int A1512ColNumAgr ;
   private int A1511ColNuCAgr ;
   private int AV106Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ;
   private int AV72TFCliCodAgr ;
   private int AV107Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ;
   private int AV73TFCliCodAgr_To ;
   private int AV110Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ;
   private int AV78TFColNumAgr ;
   private int AV111Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ;
   private int AV79TFColNumAgr_To ;
   private int AV114Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ;
   private int AV82TFColNuCAgr ;
   private int AV115Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ;
   private int AV83TFColNuCAgr_To ;
   private int A119BarAgrCod ;
   private int A129BarCod ;
   private int AV116GXV1 ;
   private java.math.BigDecimal A590KgmAgr ;
   private java.math.BigDecimal A869MtrAgr ;
   private java.math.BigDecimal AV96Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ;
   private java.math.BigDecimal AV62TFKgmAgr ;
   private java.math.BigDecimal AV97Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ;
   private java.math.BigDecimal AV63TFKgmAgr_To ;
   private java.math.BigDecimal AV98Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ;
   private java.math.BigDecimal AV66TFMtrAgr ;
   private java.math.BigDecimal AV99Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ;
   private java.math.BigDecimal AV67TFMtrAgr_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13792BarAgrNhdr ;
   private String A1245BarAgrSer ;
   private String A1507BarAgrDsc ;
   private String A1510ColNomAgr ;
   private String A1509ColNoCAgr ;
   private String AV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ;
   private String AV88TFBarAgrNhdr ;
   private String AV95Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ;
   private String AV89TFBarAgrNhdr_Sel ;
   private String AV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ;
   private String AV68TFBarAgrSer ;
   private String AV103Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ;
   private String AV69TFBarAgrSer_Sel ;
   private String AV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ;
   private String AV70TFBarAgrDsc ;
   private String AV105Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ;
   private String AV71TFBarAgrDsc_Sel ;
   private String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ;
   private String AV76TFColNomAgr ;
   private String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ;
   private String AV77TFColNomAgr_Sel ;
   private String AV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ;
   private String AV80TFColNoCAgr ;
   private String AV113Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ;
   private String AV81TFColNoCAgr_Sel ;
   private String scmdbuf ;
   private String lV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ;
   private String lV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ;
   private String lV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ;
   private String lV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ;
   private String lV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ;
   private String A122BarAgrPar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private int[] P09H92_A1511ColNuCAgr ;
   private String[] P09H92_A1509ColNoCAgr ;
   private int[] P09H92_A1512ColNumAgr ;
   private String[] P09H92_A1510ColNomAgr ;
   private int[] P09H92_A1508CliCodAgr ;
   private String[] P09H92_A1507BarAgrDsc ;
   private String[] P09H92_A1245BarAgrSer ;
   private short[] P09H92_A671PieAgr ;
   private java.math.BigDecimal[] P09H92_A869MtrAgr ;
   private java.math.BigDecimal[] P09H92_A590KgmAgr ;
   private String[] P09H92_A122BarAgrPar ;
   private byte[] P09H92_A124BarAgrReo ;
   private int[] P09H92_A119BarAgrCod ;
   private String[] P09H92_A396EmprCod ;
   private int[] P09H92_A129BarCod ;
   private byte[] P09H92_A132BarCodReo ;
   private String[] P09H92_A130BarCodPar ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class recetadetinte_agrupacion_wpexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09H92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext ,
                                          String AV95Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel ,
                                          String AV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr ,
                                          java.math.BigDecimal AV96Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr ,
                                          java.math.BigDecimal AV97Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to ,
                                          java.math.BigDecimal AV98Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr ,
                                          java.math.BigDecimal AV99Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to ,
                                          short AV100Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr ,
                                          short AV101Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to ,
                                          String AV103Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel ,
                                          String AV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser ,
                                          String AV105Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel ,
                                          String AV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc ,
                                          int AV106Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr ,
                                          int AV107Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to ,
                                          String AV109Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel ,
                                          String AV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr ,
                                          int AV110Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr ,
                                          int AV111Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to ,
                                          String AV113Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel ,
                                          String AV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr ,
                                          int AV114Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr ,
                                          int AV115Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to ,
                                          int A119BarAgrCod ,
                                          byte A124BarAgrReo ,
                                          String A122BarAgrPar ,
                                          java.math.BigDecimal A590KgmAgr ,
                                          java.math.BigDecimal A869MtrAgr ,
                                          short A671PieAgr ,
                                          String A1245BarAgrSer ,
                                          String A1507BarAgrDsc ,
                                          int A1508CliCodAgr ,
                                          String A1510ColNomAgr ,
                                          int A1512ColNumAgr ,
                                          String A1509ColNoCAgr ,
                                          int A1511ColNuCAgr ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[33];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT ColNuCAgr, ColNoCAgr, ColNumAgr, ColNomAgr, CliCodAgr, BarAgrDsc, BarAgrSer, PieAgr, MtrAgr, KgmAgr, BarAgrPar, BarAgrReo, BarAgrCod, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar FROM TXPBARAGR" ;
      if ( ! (GXutil.strcmp("", AV93Formulaciontinte_recetadetinte_agrupacion_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(KgmAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(MtrAgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(PieAgr,'9990'), 2) like '%' || ?) or ( UPPER(BarAgrSer) like '%' || UPPER(?)) or ( UPPER(BarAgrDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(CliCodAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNomAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNumAgr,'999990'), 2) like '%' || ?) or ( UPPER(ColNoCAgr) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(ColNuCAgr,'999990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV94Formulaciontinte_recetadetinte_agrupacion_wpds_2_tfbaragrnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Formulaciontinte_recetadetinte_agrupacion_wpds_3_tfbaragrnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(TO_CHAR(BarAgrCod,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(BarAgrReo,'90'), 2) || BarAgrPar = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Formulaciontinte_recetadetinte_agrupacion_wpds_4_tfkgmagr)==0) )
      {
         addWhere(sWhereString, "(KgmAgr >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Formulaciontinte_recetadetinte_agrupacion_wpds_5_tfkgmagr_to)==0) )
      {
         addWhere(sWhereString, "(KgmAgr <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Formulaciontinte_recetadetinte_agrupacion_wpds_6_tfmtragr)==0) )
      {
         addWhere(sWhereString, "(MtrAgr >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Formulaciontinte_recetadetinte_agrupacion_wpds_7_tfmtragr_to)==0) )
      {
         addWhere(sWhereString, "(MtrAgr <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_recetadetinte_agrupacion_wpds_8_tfpieagr) )
      {
         addWhere(sWhereString, "(PieAgr >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV101Formulaciontinte_recetadetinte_agrupacion_wpds_9_tfpieagr_to) )
      {
         addWhere(sWhereString, "(PieAgr <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) && ( ! (GXutil.strcmp("", AV102Formulaciontinte_recetadetinte_agrupacion_wpds_10_tfbaragrser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Formulaciontinte_recetadetinte_agrupacion_wpds_11_tfbaragrser_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrSer = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_recetadetinte_agrupacion_wpds_12_tfbaragrdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarAgrDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_recetadetinte_agrupacion_wpds_13_tfbaragrdsc_sel)==0) )
      {
         addWhere(sWhereString, "(BarAgrDsc = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV106Formulaciontinte_recetadetinte_agrupacion_wpds_14_tfclicodagr) )
      {
         addWhere(sWhereString, "(CliCodAgr >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV107Formulaciontinte_recetadetinte_agrupacion_wpds_15_tfclicodagr_to) )
      {
         addWhere(sWhereString, "(CliCodAgr <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) && ( ! (GXutil.strcmp("", AV108Formulaciontinte_recetadetinte_agrupacion_wpds_16_tfcolnomagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNomAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Formulaciontinte_recetadetinte_agrupacion_wpds_17_tfcolnomagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNomAgr = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV110Formulaciontinte_recetadetinte_agrupacion_wpds_18_tfcolnumagr) )
      {
         addWhere(sWhereString, "(ColNumAgr >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV111Formulaciontinte_recetadetinte_agrupacion_wpds_19_tfcolnumagr_to) )
      {
         addWhere(sWhereString, "(ColNumAgr <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) && ( ! (GXutil.strcmp("", AV112Formulaciontinte_recetadetinte_agrupacion_wpds_20_tfcolnocagr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ColNoCAgr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Formulaciontinte_recetadetinte_agrupacion_wpds_21_tfcolnocagr_sel)==0) )
      {
         addWhere(sWhereString, "(ColNoCAgr = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV114Formulaciontinte_recetadetinte_agrupacion_wpds_22_tfcolnucagr) )
      {
         addWhere(sWhereString, "(ColNuCAgr >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV115Formulaciontinte_recetadetinte_agrupacion_wpds_23_tfcolnucagr_to) )
      {
         addWhere(sWhereString, "(ColNuCAgr <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY KgmAgr" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY KgmAgr DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY MtrAgr" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY MtrAgr DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PieAgr" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PieAgr DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY BarAgrSer" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarAgrSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY BarAgrDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarAgrDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY CliCodAgr" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY CliCodAgr DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ColNomAgr" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ColNomAgr DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ColNumAgr" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ColNumAgr DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ColNoCAgr" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ColNoCAgr DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY ColNuCAgr" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY ColNuCAgr DESC" ;
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
                  return conditional_P09H92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09H92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 1);
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
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               return;
      }
   }

}

