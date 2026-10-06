package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcsituacionprocesoquimicorecetas_crecetexportcsv_impl extends GXWebProcedure
{
   public wcsituacionprocesoquimicorecetas_crecetexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCSituacionProcesoQuimicoRecetas_CRECETExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero del Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = AV32FilterFullText ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = AV36TFBarNHdr ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = AV37TFBarNHdr_Sel ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod = AV38TFCliCod ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to = AV39TFCliCod_To ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = AV40TFCliNom ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = AV41TFCliNom_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = AV42TFBarSer ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = AV43TFBarSer_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = AV44TFBarSerDsc ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = AV45TFBarSerDsc_Sel ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = AV46TFBarColNom ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = AV47TFBarColNom_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum = AV48TFBarColNum ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to = AV49TFBarColNum_To ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = AV50TFBarNomCli ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = AV51TFBarNomCli_Sel ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = AV53TFRecAcab_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                           AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                           AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                           Integer.valueOf(AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) ,
                                           Integer.valueOf(AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                           AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                           AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                           Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) ,
                                           Integer.valueOf(AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) ,
                                           AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                           Integer.valueOf(AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           AV28Emprcod ,
                                           AV29Proforcod ,
                                           A396EmprCod ,
                                           A764ProForCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext), "%", "") ;
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr), 11, "%") ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom), 30, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser), 16, "%") ;
      lV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc), 26, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom), 13, "%") ;
      lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli), 13, "%") ;
      /* Using cursor P09CM2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, AV29Proforcod, lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext, lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr, AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel, Integer.valueOf(AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod), Integer.valueOf(AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to), lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom, AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser, AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel, lV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc, AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel, lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom, AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel, Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum), Integer.valueOf(AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to), lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli, AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09CM2_A2804RecLinMaq[0] ;
         A764ProForCod = P09CM2_A764ProForCod[0] ;
         A396EmprCod = P09CM2_A396EmprCod[0] ;
         A6039RecAcab = P09CM2_A6039RecAcab[0] ;
         n6039RecAcab = P09CM2_n6039RecAcab[0] ;
         A1234BarNomCli = P09CM2_A1234BarNomCli[0] ;
         A136BarColNum = P09CM2_A136BarColNum[0] ;
         A135BarColNom = P09CM2_A135BarColNom[0] ;
         A1652BarSerDsc = P09CM2_A1652BarSerDsc[0] ;
         A212BarSer = P09CM2_A212BarSer[0] ;
         A279CliNom = P09CM2_A279CliNom[0] ;
         A252CliCod = P09CM2_A252CliCod[0] ;
         n252CliCod = P09CM2_n252CliCod[0] ;
         A130BarCodPar = P09CM2_A130BarCodPar[0] ;
         A132BarCodReo = P09CM2_A132BarCodReo[0] ;
         A129BarCod = P09CM2_A129BarCod[0] ;
         A1273RecLinPro = P09CM2_A1273RecLinPro[0] ;
         A1234BarNomCli = P09CM2_A1234BarNomCli[0] ;
         A136BarColNum = P09CM2_A136BarColNum[0] ;
         A135BarColNom = P09CM2_A135BarColNom[0] ;
         A1652BarSerDsc = P09CM2_A1652BarSerDsc[0] ;
         A212BarSer = P09CM2_A212BarSer[0] ;
         A252CliCod = P09CM2_A252CliCod[0] ;
         n252CliCod = P09CM2_n252CliCod[0] ;
         A279CliNom = P09CM2_A279CliNom[0] ;
         A6039RecAcab = P09CM2_A6039RecAcab[0] ;
         n6039RecAcab = P09CM2_n6039RecAcab[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetas_crecetexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetas_crecetexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetas_crecetexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetas_crecetexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetas_crecetexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            wcsituacionprocesoquimicorecetas_crecetexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            if ( GXutil.strcmp(GXutil.trim( A6039RecAcab), "N") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Receta Tinte", "") ;
            }
            else if ( GXutil.strcmp(GXutil.trim( A6039RecAcab), "S") == 0 )
            {
               AV14TextFileLine += httpContext.getMessage( "Receta acabado", "") ;
            }
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCSituacionProcesoQuimicoRecetas_CRECETExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNHdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSer", "", "Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarColNom", "", "Nombre Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarColNum", "", "Numero del Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecAcab", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETColumnsSelector", GXv_char3) ;
      wcsituacionprocesoquimicorecetas_crecetexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetas_CRECETGridState"), null, null);
      }
      AV30OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV75GXV1 = 1 ;
      while ( AV75GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV75GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV32FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV36TFBarNHdr = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV37TFBarNHdr_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV42TFBarSer = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV43TFBarSer_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV44TFBarSerDsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV45TFBarSerDsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV46TFBarColNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV47TFBarColNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV48TFBarColNum = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFBarColNum_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV50TFBarNomCli = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV51TFBarNomCli_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECACAB_SEL") == 0 )
         {
            AV52TFRecAcab_SelsJson = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV53TFRecAcab_Sels.fromJSonString(AV52TFRecAcab_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV29Proforcod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV75GXV1 = (int)(AV75GXV1+1) ;
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
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A6039RecAcab = "" ;
      AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = "" ;
      AV32FilterFullText = "" ;
      AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = "" ;
      AV36TFBarNHdr = "" ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel = "" ;
      AV37TFBarNHdr_Sel = "" ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = "" ;
      AV40TFCliNom = "" ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel = "" ;
      AV41TFCliNom_Sel = "" ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = "" ;
      AV42TFBarSer = "" ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel = "" ;
      AV43TFBarSer_Sel = "" ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = "" ;
      AV44TFBarSerDsc = "" ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel = "" ;
      AV45TFBarSerDsc_Sel = "" ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = "" ;
      AV46TFBarColNom = "" ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel = "" ;
      AV47TFBarColNom_Sel = "" ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = "" ;
      AV50TFBarNomCli = "" ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel = "" ;
      AV51TFBarNomCli_Sel = "" ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV53TFRecAcab_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext = "" ;
      lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr = "" ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom = "" ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser = "" ;
      lV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc = "" ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom = "" ;
      lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli = "" ;
      A130BarCodPar = "" ;
      AV28Emprcod = "" ;
      AV29Proforcod = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      P09CM2_A2804RecLinMaq = new short[1] ;
      P09CM2_A764ProForCod = new String[] {""} ;
      P09CM2_A396EmprCod = new String[] {""} ;
      P09CM2_A6039RecAcab = new String[] {""} ;
      P09CM2_n6039RecAcab = new boolean[] {false} ;
      P09CM2_A1234BarNomCli = new String[] {""} ;
      P09CM2_A136BarColNum = new int[1] ;
      P09CM2_A135BarColNom = new String[] {""} ;
      P09CM2_A1652BarSerDsc = new String[] {""} ;
      P09CM2_A212BarSer = new String[] {""} ;
      P09CM2_A279CliNom = new String[] {""} ;
      P09CM2_A252CliCod = new int[1] ;
      P09CM2_n252CliCod = new boolean[] {false} ;
      P09CM2_A130BarCodPar = new String[] {""} ;
      P09CM2_A132BarCodReo = new byte[1] ;
      P09CM2_A129BarCod = new int[1] ;
      P09CM2_A1273RecLinPro = new byte[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV52TFRecAcab_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsituacionprocesoquimicorecetas_crecetexportcsv__default(),
         new Object[] {
             new Object[] {
            P09CM2_A2804RecLinMaq, P09CM2_A764ProForCod, P09CM2_A396EmprCod, P09CM2_A6039RecAcab, P09CM2_n6039RecAcab, P09CM2_A1234BarNomCli, P09CM2_A136BarColNum, P09CM2_A135BarColNom, P09CM2_A1652BarSerDsc, P09CM2_A212BarSer,
            P09CM2_A279CliNom, P09CM2_A252CliCod, P09CM2_n252CliCod, P09CM2_A130BarCodPar, P09CM2_A132BarCodReo, P09CM2_A129BarCod, P09CM2_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private short gxcookieaux ;
   private short AV30OrderedBy ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ;
   private int AV38TFCliCod ;
   private int AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ;
   private int AV39TFCliCod_To ;
   private int AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ;
   private int AV48TFBarColNum ;
   private int AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ;
   private int AV49TFBarColNum_To ;
   private int AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ;
   private int A129BarCod ;
   private int AV75GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13696BarNHdr ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A6039RecAcab ;
   private String AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ;
   private String AV36TFBarNHdr ;
   private String AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ;
   private String AV37TFBarNHdr_Sel ;
   private String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ;
   private String AV40TFCliNom ;
   private String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ;
   private String AV41TFCliNom_Sel ;
   private String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ;
   private String AV42TFBarSer ;
   private String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ;
   private String AV43TFBarSer_Sel ;
   private String AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ;
   private String AV44TFBarSerDsc ;
   private String AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ;
   private String AV45TFBarSerDsc_Sel ;
   private String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ;
   private String AV46TFBarColNom ;
   private String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ;
   private String AV47TFBarColNom_Sel ;
   private String AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ;
   private String AV50TFBarNomCli ;
   private String AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ;
   private String AV51TFBarNomCli_Sel ;
   private String scmdbuf ;
   private String lV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ;
   private String lV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ;
   private String lV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ;
   private String lV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ;
   private String lV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ;
   private String lV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ;
   private String A130BarCodPar ;
   private String AV28Emprcod ;
   private String AV29Proforcod ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private boolean n6039RecAcab ;
   private boolean n252CliCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV52TFRecAcab_SelsJson ;
   private String AV11Filename ;
   private String AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ;
   private String AV32FilterFullText ;
   private String lV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P09CM2_A2804RecLinMaq ;
   private String[] P09CM2_A764ProForCod ;
   private String[] P09CM2_A396EmprCod ;
   private String[] P09CM2_A6039RecAcab ;
   private boolean[] P09CM2_n6039RecAcab ;
   private String[] P09CM2_A1234BarNomCli ;
   private int[] P09CM2_A136BarColNum ;
   private String[] P09CM2_A135BarColNom ;
   private String[] P09CM2_A1652BarSerDsc ;
   private String[] P09CM2_A212BarSer ;
   private String[] P09CM2_A279CliNom ;
   private int[] P09CM2_A252CliCod ;
   private boolean[] P09CM2_n252CliCod ;
   private String[] P09CM2_A130BarCodPar ;
   private byte[] P09CM2_A132BarCodReo ;
   private int[] P09CM2_A129BarCod ;
   private byte[] P09CM2_A1273RecLinPro ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ;
   private GXSimpleCollection<String> AV53TFRecAcab_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class wcsituacionprocesoquimicorecetas_crecetexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09CM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels ,
                                          String AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel ,
                                          String AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr ,
                                          int AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod ,
                                          int AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser ,
                                          String AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel ,
                                          String AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom ,
                                          int AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum ,
                                          int AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to ,
                                          String AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel ,
                                          String AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli ,
                                          int AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          String AV28Emprcod ,
                                          String AV29Proforcod ,
                                          String A396EmprCod ,
                                          String A764ProForCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[27];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.RecLinMaq, T1.ProForCod, T1.EmprCod, T4.RecAcab, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.RecLinPro FROM (((TXPCRECET T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPRECMAQ T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProForCod = ?)");
      if ( ! (GXutil.strcmp("", AV57Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( UPPER(T4.RecAcab) like '%' || UPPER(?)))");
      }
      else
      {
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
      if ( (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV58Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_2_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_3_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_4_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_5_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_6_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_7_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_8_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_9_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_10_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_11_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_12_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_13_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_14_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_15_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_16_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_17_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV74Formulaciontinte_wcsituacionprocesoquimicorecetas_crecetds_18_tfrecacab_sels, "T4.RecAcab IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( AV30OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.ProForCod" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV30OrderedBy == 7 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV30OrderedBy == 7 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV30OrderedBy == 8 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV30OrderedBy == 8 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV30OrderedBy == 9 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.RecAcab" ;
      }
      else if ( ( AV30OrderedBy == 9 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.RecAcab DESC" ;
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
                  return conditional_P09CM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09CM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 16);
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
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
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               return;
      }
   }

}

