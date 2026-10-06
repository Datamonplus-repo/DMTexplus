package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class analisiscostesbasicosdetalle_wcexportcsv_impl extends GXWebProcedure
{
   public analisiscostesbasicosdetalle_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "AnalisisCostesBasicosDetalle_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AnalisisCostesBasicosDetalle_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("AnalisisCostesBasicosDetalle_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion de Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und Totales", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T Real", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T Teo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Minuto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Real", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Teo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tiempo (m)", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV77Analisiscostesbasicosdetalle_wcds_1_emprcod = AV70Emprcod ;
      AV78Analisiscostesbasicosdetalle_wcds_2_barcod = AV71Barcod ;
      AV79Analisiscostesbasicosdetalle_wcds_3_barcodreo = AV72Barcodreo ;
      AV80Analisiscostesbasicosdetalle_wcds_4_barcodpar = AV73BarCodpar ;
      AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext = AV30FilterFullText ;
      AV82Analisiscostesbasicosdetalle_wcds_6_tfbarordlin = AV36TFBarOrdLin ;
      AV83Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to = AV37TFBarOrdLin_To ;
      AV84Analisiscostesbasicosdetalle_wcds_8_tffascod = AV38TFFasCod ;
      AV85Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = AV39TFFasCod_Sel ;
      AV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc = AV40TFFasDsc ;
      AV87Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = AV41TFFasDsc_Sel ;
      AV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = AV42TFMaqCodBis ;
      AV89Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = AV43TFMaqCodBis_Sel ;
      AV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = AV44TFBarUniMed ;
      AV91Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = AV45TFBarUniMed_Sel ;
      AV92Analisiscostesbasicosdetalle_wcds_16_tfbartierea = AV53TFBarTieRea ;
      AV93Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = AV54TFBarTieRea_To ;
      AV94Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = AV55TFBarTieTeo ;
      AV95Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = AV56TFBarTieTeo_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                           Short.valueOf(AV82Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) ,
                                           Short.valueOf(AV83Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) ,
                                           AV85Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                           AV84Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                           AV87Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                           AV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                           AV89Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                           AV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                           AV91Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                           AV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                           AV92Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                           AV93Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                           AV94Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                           AV95Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A228BarUniMed ,
                                           A215BarTieRea ,
                                           A216BarTieTeo ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV77Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                           Integer.valueOf(AV78Analisiscostesbasicosdetalle_wcds_2_barcod) ,
                                           Byte.valueOf(AV79Analisiscostesbasicosdetalle_wcds_3_barcodreo) ,
                                           AV80Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext), "%", "") ;
      lV84Analisiscostesbasicosdetalle_wcds_8_tffascod = GXutil.padr( GXutil.rtrim( AV84Analisiscostesbasicosdetalle_wcds_8_tffascod), 8, "%") ;
      lV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc = GXutil.padr( GXutil.rtrim( AV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc), 28, "%") ;
      lV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis), 6, "%") ;
      lV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = GXutil.padr( GXutil.rtrim( AV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed), 1, "%") ;
      /* Using cursor P093G2 */
      pr_default.execute(0, new Object[] {AV77Analisiscostesbasicosdetalle_wcds_1_emprcod, Integer.valueOf(AV78Analisiscostesbasicosdetalle_wcds_2_barcod), Byte.valueOf(AV79Analisiscostesbasicosdetalle_wcds_3_barcodreo), AV80Analisiscostesbasicosdetalle_wcds_4_barcodpar, lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext, lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext, Short.valueOf(AV82Analisiscostesbasicosdetalle_wcds_6_tfbarordlin), Short.valueOf(AV83Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to), lV84Analisiscostesbasicosdetalle_wcds_8_tffascod, AV85Analisiscostesbasicosdetalle_wcds_9_tffascod_sel, lV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc, AV87Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel, lV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis, AV89Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel, lV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed, AV91Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel, AV92Analisiscostesbasicosdetalle_wcds_16_tfbartierea, AV93Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to, AV94Analisiscostesbasicosdetalle_wcds_18_tfbartieteo, AV95Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A216BarTieTeo = P093G2_A216BarTieTeo[0] ;
         A215BarTieRea = P093G2_A215BarTieRea[0] ;
         A228BarUniMed = P093G2_A228BarUniMed[0] ;
         A603MaqCodBis = P093G2_A603MaqCodBis[0] ;
         A460FasDsc = P093G2_A460FasDsc[0] ;
         A457FasCod = P093G2_A457FasCod[0] ;
         A194BarOrdLin = P093G2_A194BarOrdLin[0] ;
         A130BarCodPar = P093G2_A130BarCodPar[0] ;
         A132BarCodReo = P093G2_A132BarCodReo[0] ;
         A129BarCod = P093G2_A129BarCod[0] ;
         A396EmprCod = P093G2_A396EmprCod[0] ;
         A165BarHorIni = P093G2_A165BarHorIni[0] ;
         A164BarHorFin = P093G2_A164BarHorFin[0] ;
         A758ProCod = P093G2_A758ProCod[0] ;
         A460FasDsc = P093G2_A460FasDsc[0] ;
         A228BarUniMed = P093G2_A228BarUniMed[0] ;
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
            AV14TextFileLine += GXutil.str( A194BarOrdLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A457FasCod, ";", ","), GXv_char3) ;
            analisiscostesbasicosdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A460FasDsc, ";", ","), GXv_char3) ;
            analisiscostesbasicosdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A603MaqCodBis, ";", ","), GXv_char3) ;
            analisiscostesbasicosdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV69MaqDsc ;
            GXv_char3[0] = GXt_char2 ;
            new app.pobtmaq(remoteHandle, context).execute( A396EmprCod, A603MaqCodBis, GXv_char3) ;
            analisiscostesbasicosdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV69MaqDsc = GXt_char2 ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV69MaqDsc, ";", ","), GXv_char3) ;
            analisiscostesbasicosdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV31Unidades, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV32Unidadest, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A228BarUniMed, ";", ","), GXv_char3) ;
            analisiscostesbasicosdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV96Ceros4 = "0000" ;
            AV97Horini = GXutil.str( A165BarHorIni, 4, 0) ;
            AV97Horini = GXutil.ltrim( GXutil.rtrim( AV97Horini)) ;
            AV98Lenvar = DecimalUtil.doubleToDec(GXutil.len( AV97Horini)) ;
            AV98Lenvar = DecimalUtil.doubleToDec(4).subtract(AV98Lenvar) ;
            AV97Horini = GXutil.substring( AV96Ceros4, 1, (int)(DecimalUtil.decToDouble(AV98Lenvar))) + AV97Horini ;
            AV48HorIni_5 = GXutil.substring( AV97Horini, 1, 2) + "." + GXutil.substring( AV97Horini, 3, 2) ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV48HorIni_5, ";", ","), GXv_char3) ;
            analisiscostesbasicosdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV99Horfin = GXutil.str( A164BarHorFin, 4, 0) ;
            AV99Horfin = GXutil.ltrim( GXutil.rtrim( AV99Horfin)) ;
            AV98Lenvar = DecimalUtil.doubleToDec(GXutil.len( AV99Horfin)) ;
            AV98Lenvar = DecimalUtil.doubleToDec(4).subtract(AV98Lenvar) ;
            AV99Horfin = GXutil.substring( AV96Ceros4, 1, (int)(DecimalUtil.decToDouble(AV98Lenvar))) + AV99Horfin ;
            AV49HorFin_5 = GXutil.substring( AV99Horfin, 1, 2) + "." + GXutil.substring( AV99Horfin, 3, 2) ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV49HorFin_5, ";", ","), GXv_char3) ;
            analisiscostesbasicosdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A215BarTieRea, 5, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A216BarTieTeo, 5, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV47Tteo, 5, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV46MaqCosMin, 10, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV50Coste_m, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV51Coste_tm, 12, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV52Tiempo_m, 6, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=AnalisisCostesBasicosDetalle_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarOrdLin", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasCod", "", "Codigo Fase", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FasDsc", "", "Descripcion de Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCodBis", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&MaqDsc", "", "Descripcion ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Unidades", "", "Unidades", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Unidadest", "", "Und Totales", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarUniMed", "", "Und", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HorIni_5", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HorFin_5", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarTieRea", "", "T Real", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarTieTeo", "", "T Teo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Tteo", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&MaqCosMin", "", "Coste Minuto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Coste_m", "", "Coste Real", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Coste_tm", "", "Coste Teo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Tiempo_m", "", "Tiempo (m)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "AnalisisCostesBasicosDetalle_WCColumnsSelector", GXv_char3) ;
      analisiscostesbasicosdetalle_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("AnalisisCostesBasicosDetalle_WCGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "AnalisisCostesBasicosDetalle_WCGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV19Session.getValue("AnalisisCostesBasicosDetalle_WCGridState"), null, null);
      }
      AV28OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV100GXV1 = 1 ;
      while ( AV100GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV100GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV36TFBarOrdLin = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFBarOrdLin_To = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV38TFFasCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV39TFFasCod_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV40TFFasDsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV41TFFasDsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV42TFMaqCodBis = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV43TFMaqCodBis_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED") == 0 )
         {
            AV44TFBarUniMed = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED_SEL") == 0 )
         {
            AV45TFBarUniMed_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV53TFBarTieRea = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFBarTieRea_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIETEO") == 0 )
         {
            AV55TFBarTieTeo = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFBarTieTeo_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV70Emprcod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV71Barcod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV72Barcodreo = (byte)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV73BarCodpar = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A396EmprCod = "" ;
      A228BarUniMed = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      AV77Analisiscostesbasicosdetalle_wcds_1_emprcod = "" ;
      AV70Emprcod = "" ;
      AV80Analisiscostesbasicosdetalle_wcds_4_barcodpar = "" ;
      AV73BarCodpar = "" ;
      AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV84Analisiscostesbasicosdetalle_wcds_8_tffascod = "" ;
      AV38TFFasCod = "" ;
      AV85Analisiscostesbasicosdetalle_wcds_9_tffascod_sel = "" ;
      AV39TFFasCod_Sel = "" ;
      AV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc = "" ;
      AV40TFFasDsc = "" ;
      AV87Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel = "" ;
      AV41TFFasDsc_Sel = "" ;
      AV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = "" ;
      AV42TFMaqCodBis = "" ;
      AV89Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel = "" ;
      AV43TFMaqCodBis_Sel = "" ;
      AV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = "" ;
      AV44TFBarUniMed = "" ;
      AV91Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel = "" ;
      AV45TFBarUniMed_Sel = "" ;
      AV92Analisiscostesbasicosdetalle_wcds_16_tfbartierea = DecimalUtil.ZERO ;
      AV53TFBarTieRea = DecimalUtil.ZERO ;
      AV93Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to = DecimalUtil.ZERO ;
      AV54TFBarTieRea_To = DecimalUtil.ZERO ;
      AV94Analisiscostesbasicosdetalle_wcds_18_tfbartieteo = DecimalUtil.ZERO ;
      AV55TFBarTieTeo = DecimalUtil.ZERO ;
      AV95Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to = DecimalUtil.ZERO ;
      AV56TFBarTieTeo_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext = "" ;
      lV84Analisiscostesbasicosdetalle_wcds_8_tffascod = "" ;
      lV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc = "" ;
      lV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis = "" ;
      lV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed = "" ;
      A130BarCodPar = "" ;
      P093G2_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093G2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P093G2_A228BarUniMed = new String[] {""} ;
      P093G2_A603MaqCodBis = new String[] {""} ;
      P093G2_A460FasDsc = new String[] {""} ;
      P093G2_A457FasCod = new String[] {""} ;
      P093G2_A194BarOrdLin = new short[1] ;
      P093G2_A130BarCodPar = new String[] {""} ;
      P093G2_A132BarCodReo = new byte[1] ;
      P093G2_A129BarCod = new int[1] ;
      P093G2_A396EmprCod = new String[] {""} ;
      P093G2_A165BarHorIni = new short[1] ;
      P093G2_A164BarHorFin = new short[1] ;
      P093G2_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV69MaqDsc = "" ;
      AV31Unidades = DecimalUtil.ZERO ;
      AV32Unidadest = DecimalUtil.ZERO ;
      AV96Ceros4 = "" ;
      AV97Horini = "" ;
      AV98Lenvar = DecimalUtil.ZERO ;
      AV48HorIni_5 = "" ;
      AV99Horfin = "" ;
      AV49HorFin_5 = "" ;
      AV47Tteo = DecimalUtil.ZERO ;
      AV46MaqCosMin = DecimalUtil.ZERO ;
      AV50Coste_m = DecimalUtil.ZERO ;
      AV51Coste_tm = DecimalUtil.ZERO ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.analisiscostesbasicosdetalle_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P093G2_A216BarTieTeo, P093G2_A215BarTieRea, P093G2_A228BarUniMed, P093G2_A603MaqCodBis, P093G2_A460FasDsc, P093G2_A457FasCod, P093G2_A194BarOrdLin, P093G2_A130BarCodPar, P093G2_A132BarCodReo, P093G2_A129BarCod,
            P093G2_A396EmprCod, P093G2_A165BarHorIni, P093G2_A164BarHorFin, P093G2_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV79Analisiscostesbasicosdetalle_wcds_3_barcodreo ;
   private byte AV72Barcodreo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short AV82Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ;
   private short AV36TFBarOrdLin ;
   private short AV83Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ;
   private short AV37TFBarOrdLin_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV78Analisiscostesbasicosdetalle_wcds_2_barcod ;
   private int AV71Barcod ;
   private int A129BarCod ;
   private int AV52Tiempo_m ;
   private int AV100GXV1 ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal AV92Analisiscostesbasicosdetalle_wcds_16_tfbartierea ;
   private java.math.BigDecimal AV53TFBarTieRea ;
   private java.math.BigDecimal AV93Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ;
   private java.math.BigDecimal AV54TFBarTieRea_To ;
   private java.math.BigDecimal AV94Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ;
   private java.math.BigDecimal AV55TFBarTieTeo ;
   private java.math.BigDecimal AV95Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ;
   private java.math.BigDecimal AV56TFBarTieTeo_To ;
   private java.math.BigDecimal AV31Unidades ;
   private java.math.BigDecimal AV32Unidadest ;
   private java.math.BigDecimal AV98Lenvar ;
   private java.math.BigDecimal AV47Tteo ;
   private java.math.BigDecimal AV46MaqCosMin ;
   private java.math.BigDecimal AV50Coste_m ;
   private java.math.BigDecimal AV51Coste_tm ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A603MaqCodBis ;
   private String A396EmprCod ;
   private String A228BarUniMed ;
   private String AV77Analisiscostesbasicosdetalle_wcds_1_emprcod ;
   private String AV70Emprcod ;
   private String AV80Analisiscostesbasicosdetalle_wcds_4_barcodpar ;
   private String AV73BarCodpar ;
   private String AV84Analisiscostesbasicosdetalle_wcds_8_tffascod ;
   private String AV38TFFasCod ;
   private String AV85Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ;
   private String AV39TFFasCod_Sel ;
   private String AV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc ;
   private String AV40TFFasDsc ;
   private String AV87Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ;
   private String AV41TFFasDsc_Sel ;
   private String AV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ;
   private String AV42TFMaqCodBis ;
   private String AV89Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ;
   private String AV43TFMaqCodBis_Sel ;
   private String AV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ;
   private String AV44TFBarUniMed ;
   private String AV91Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ;
   private String AV45TFBarUniMed_Sel ;
   private String scmdbuf ;
   private String lV84Analisiscostesbasicosdetalle_wcds_8_tffascod ;
   private String lV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc ;
   private String lV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ;
   private String lV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String AV69MaqDsc ;
   private String AV96Ceros4 ;
   private String AV97Horini ;
   private String AV48HorIni_5 ;
   private String AV99Horfin ;
   private String AV49HorFin_5 ;
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
   private String AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] P093G2_A216BarTieTeo ;
   private java.math.BigDecimal[] P093G2_A215BarTieRea ;
   private String[] P093G2_A228BarUniMed ;
   private String[] P093G2_A603MaqCodBis ;
   private String[] P093G2_A460FasDsc ;
   private String[] P093G2_A457FasCod ;
   private short[] P093G2_A194BarOrdLin ;
   private String[] P093G2_A130BarCodPar ;
   private byte[] P093G2_A132BarCodReo ;
   private int[] P093G2_A129BarCod ;
   private String[] P093G2_A396EmprCod ;
   private short[] P093G2_A165BarHorIni ;
   private short[] P093G2_A164BarHorFin ;
   private String[] P093G2_A758ProCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class analisiscostesbasicosdetalle_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P093G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext ,
                                          short AV82Analisiscostesbasicosdetalle_wcds_6_tfbarordlin ,
                                          short AV83Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to ,
                                          String AV85Analisiscostesbasicosdetalle_wcds_9_tffascod_sel ,
                                          String AV84Analisiscostesbasicosdetalle_wcds_8_tffascod ,
                                          String AV87Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel ,
                                          String AV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc ,
                                          String AV89Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel ,
                                          String AV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis ,
                                          String AV91Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel ,
                                          String AV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed ,
                                          java.math.BigDecimal AV92Analisiscostesbasicosdetalle_wcds_16_tfbartierea ,
                                          java.math.BigDecimal AV93Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to ,
                                          java.math.BigDecimal AV94Analisiscostesbasicosdetalle_wcds_18_tfbartieteo ,
                                          java.math.BigDecimal AV95Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          String A228BarUniMed ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.math.BigDecimal A216BarTieTeo ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV77Analisiscostesbasicosdetalle_wcds_1_emprcod ,
                                          int AV78Analisiscostesbasicosdetalle_wcds_2_barcod ,
                                          byte AV79Analisiscostesbasicosdetalle_wcds_3_barcodreo ,
                                          String AV80Analisiscostesbasicosdetalle_wcds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[25];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.BarTieTeo, T1.BarTieRea, T3.BarUniMed, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarHorIni," ;
      scmdbuf += " T1.BarHorFin, T1.ProCod FROM ((TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV81Analisiscostesbasicosdetalle_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.FasCod) like '%' || UPPER(?)) or ( UPPER(T2.FasDsc) like '%' || UPPER(?)) or ( UPPER(T1.MaqCodBis) like '%' || UPPER(?)) or ( UPPER(T3.BarUniMed) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarTieRea,'90.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTieTeo,'90.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (0==AV82Analisiscostesbasicosdetalle_wcds_6_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV83Analisiscostesbasicosdetalle_wcds_7_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV84Analisiscostesbasicosdetalle_wcds_8_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Analisiscostesbasicosdetalle_wcds_9_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Analisiscostesbasicosdetalle_wcds_10_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Analisiscostesbasicosdetalle_wcds_11_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV88Analisiscostesbasicosdetalle_wcds_12_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Analisiscostesbasicosdetalle_wcds_13_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV90Analisiscostesbasicosdetalle_wcds_14_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Analisiscostesbasicosdetalle_wcds_15_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarUniMed = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Analisiscostesbasicosdetalle_wcds_16_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Analisiscostesbasicosdetalle_wcds_17_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Analisiscostesbasicosdetalle_wcds_18_tfbartieteo)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Analisiscostesbasicosdetalle_wcds_19_tfbartieteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieTeo <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.FasCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasDsc" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.FasDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCodBis" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCodBis DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.BarUniMed" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.BarUniMed DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieRea" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieRea DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarTieTeo" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarTieTeo DESC" ;
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
                  return conditional_P093G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , ((Boolean) dynConstraints[23]).booleanValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P093G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 28);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 8);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 28);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 28);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               return;
      }
   }

}

