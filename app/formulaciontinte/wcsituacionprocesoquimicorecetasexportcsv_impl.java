package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcsituacionprocesoquimicorecetasexportcsv_impl extends GXWebProcedure
{
   public wcsituacionprocesoquimicorecetasexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCSituacionProcesoQuimicoRecetasExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero del Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
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
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV55FilterFullText ;
      AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV35TFCliCod ;
      AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV36TFCliCod_To ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV37TFCliNom ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV38TFCliNom_Sel ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV39TFBarSer ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV40TFBarSer_Sel ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV41TFBarSerDsc ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV42TFBarSerDsc_Sel ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV43TFBarColNom ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV44TFBarColNom_Sel ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV45TFBarColNum ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV46TFBarColNum_To ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV47TFBarNomCli ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV48TFBarNomCli_Sel ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV49TFBarNHdr ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV54TFRecAcab_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                           AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                           Integer.valueOf(AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                           Integer.valueOf(AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                           AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                           AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                           AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                           AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                           AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                           AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                           AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                           AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                           Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                           AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                           AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                           AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                           AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                           Integer.valueOf(AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV30OrderedBy) ,
                                           Boolean.valueOf(AV31OrderedDsc) ,
                                           AV29Proforcod ,
                                           AV28Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
      lV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
      lV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
      lV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
      /* Using cursor P08IR2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, Integer.valueOf(AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08IR2_A396EmprCod[0] ;
         A1234BarNomCli = P08IR2_A1234BarNomCli[0] ;
         A136BarColNum = P08IR2_A136BarColNum[0] ;
         A135BarColNom = P08IR2_A135BarColNom[0] ;
         A1652BarSerDsc = P08IR2_A1652BarSerDsc[0] ;
         A212BarSer = P08IR2_A212BarSer[0] ;
         A279CliNom = P08IR2_A279CliNom[0] ;
         A252CliCod = P08IR2_A252CliCod[0] ;
         n252CliCod = P08IR2_n252CliCod[0] ;
         A130BarCodPar = P08IR2_A130BarCodPar[0] ;
         A132BarCodReo = P08IR2_A132BarCodReo[0] ;
         A129BarCod = P08IR2_A129BarCod[0] ;
         A279CliNom = P08IR2_A279CliNom[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            wcsituacionprocesoquimicorecetasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCSituacionProcesoQuimicoRecetasExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNHdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "RecAcab", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCSituacionProcesoQuimicoRecetasColumnsSelector", GXv_char3) ;
      wcsituacionprocesoquimicorecetasexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasGridState"), null, null);
      }
      AV30OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV31OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV55FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV35TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV37TFCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV38TFCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV39TFBarSer = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV40TFBarSer_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV41TFBarSerDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV42TFBarSerDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV43TFBarColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV44TFBarColNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV45TFBarColNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFBarColNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV47TFBarNomCli = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV48TFBarNomCli_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV49TFBarNHdr = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV50TFBarNHdr_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECACAB_SEL") == 0 )
         {
            AV53TFRecAcab_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV54TFRecAcab_Sels.fromJSonString(AV53TFRecAcab_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PROFORCOD") == 0 )
         {
            AV29Proforcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
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
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A13696BarNHdr = "" ;
      A6039RecAcab = "" ;
      AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = "" ;
      AV55FilterFullText = "" ;
      AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = "" ;
      AV37TFCliNom = "" ;
      AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = "" ;
      AV38TFCliNom_Sel = "" ;
      AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = "" ;
      AV39TFBarSer = "" ;
      AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = "" ;
      AV40TFBarSer_Sel = "" ;
      AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = "" ;
      AV41TFBarSerDsc = "" ;
      AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = "" ;
      AV42TFBarSerDsc_Sel = "" ;
      AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = "" ;
      AV43TFBarColNom = "" ;
      AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = "" ;
      AV44TFBarColNom_Sel = "" ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = "" ;
      AV47TFBarNomCli = "" ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = "" ;
      AV48TFBarNomCli_Sel = "" ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = "" ;
      AV49TFBarNHdr = "" ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = "" ;
      AV50TFBarNHdr_Sel = "" ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV54TFRecAcab_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = "" ;
      lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = "" ;
      lV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = "" ;
      lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = "" ;
      lV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = "" ;
      lV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = "" ;
      A130BarCodPar = "" ;
      AV29Proforcod = "" ;
      AV28Emprcod = "" ;
      A396EmprCod = "" ;
      P08IR2_A396EmprCod = new String[] {""} ;
      P08IR2_A1234BarNomCli = new String[] {""} ;
      P08IR2_A136BarColNum = new int[1] ;
      P08IR2_A135BarColNom = new String[] {""} ;
      P08IR2_A1652BarSerDsc = new String[] {""} ;
      P08IR2_A212BarSer = new String[] {""} ;
      P08IR2_A279CliNom = new String[] {""} ;
      P08IR2_A252CliCod = new int[1] ;
      P08IR2_n252CliCod = new boolean[] {false} ;
      P08IR2_A130BarCodPar = new String[] {""} ;
      P08IR2_A132BarCodReo = new byte[1] ;
      P08IR2_A129BarCod = new int[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV53TFRecAcab_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsituacionprocesoquimicorecetasexportcsv__default(),
         new Object[] {
             new Object[] {
            P08IR2_A396EmprCod, P08IR2_A1234BarNomCli, P08IR2_A136BarColNum, P08IR2_A135BarColNom, P08IR2_A1652BarSerDsc, P08IR2_A212BarSer, P08IR2_A279CliNom, P08IR2_A252CliCod, P08IR2_n252CliCod, P08IR2_A130BarCodPar,
            P08IR2_A132BarCodReo, P08IR2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV30OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ;
   private int AV35TFCliCod ;
   private int AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ;
   private int AV36TFCliCod_To ;
   private int AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ;
   private int AV45TFBarColNum ;
   private int AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ;
   private int AV46TFBarColNum_To ;
   private int AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ;
   private int A129BarCod ;
   private int AV77GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A13696BarNHdr ;
   private String A6039RecAcab ;
   private String AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ;
   private String AV37TFCliNom ;
   private String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ;
   private String AV38TFCliNom_Sel ;
   private String AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ;
   private String AV39TFBarSer ;
   private String AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ;
   private String AV40TFBarSer_Sel ;
   private String AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ;
   private String AV41TFBarSerDsc ;
   private String AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ;
   private String AV42TFBarSerDsc_Sel ;
   private String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ;
   private String AV43TFBarColNom ;
   private String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ;
   private String AV44TFBarColNom_Sel ;
   private String AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ;
   private String AV47TFBarNomCli ;
   private String AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ;
   private String AV48TFBarNomCli_Sel ;
   private String AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ;
   private String AV49TFBarNHdr ;
   private String AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ;
   private String AV50TFBarNHdr_Sel ;
   private String scmdbuf ;
   private String lV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ;
   private String lV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ;
   private String lV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ;
   private String lV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ;
   private String lV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ;
   private String lV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ;
   private String A130BarCodPar ;
   private String AV29Proforcod ;
   private String AV28Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV31OrderedDsc ;
   private boolean n252CliCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV53TFRecAcab_SelsJson ;
   private String AV11Filename ;
   private String AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ;
   private String AV55FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08IR2_A396EmprCod ;
   private String[] P08IR2_A1234BarNomCli ;
   private int[] P08IR2_A136BarColNum ;
   private String[] P08IR2_A135BarColNom ;
   private String[] P08IR2_A1652BarSerDsc ;
   private String[] P08IR2_A212BarSer ;
   private String[] P08IR2_A279CliNom ;
   private int[] P08IR2_A252CliCod ;
   private boolean[] P08IR2_n252CliCod ;
   private String[] P08IR2_A130BarCodPar ;
   private byte[] P08IR2_A132BarCodReo ;
   private int[] P08IR2_A129BarCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ;
   private GXSimpleCollection<String> AV54TFRecAcab_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class wcsituacionprocesoquimicorecetasexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08IR2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV59Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV30OrderedBy ,
                                          boolean AV31OrderedDsc ,
                                          String AV29Proforcod ,
                                          String AV28Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[17];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM (TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV60Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV61Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV62Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV64Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV66Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV30OrderedBy == 1 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV30OrderedBy == 1 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV30OrderedBy == 2 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV30OrderedBy == 3 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV30OrderedBy == 4 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV30OrderedBy == 5 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV30OrderedBy == 6 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV30OrderedBy == 7 ) && ! AV31OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV30OrderedBy == 7 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV30OrderedBy == 8 ) && ! AV31OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV30OrderedBy == 8 ) && ( AV31OrderedDsc ) )
      {
         scmdbuf += "" ;
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
                  return conditional_P08IR2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08IR2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               return;
      }
   }

}

