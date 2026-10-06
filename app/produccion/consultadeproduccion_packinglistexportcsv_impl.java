package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_packinglistexportcsv_impl extends GXWebProcedure
{
   public consultadeproduccion_packinglistexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV68Var_Hdr = AV67WebSession.getValue("&Var_Hdr") ;
      AV63EmprCod = GXutil.substring( AV68Var_Hdr, 1, 3) ;
      AV64BarCod = (int)(GXutil.lval( GXutil.substring( AV68Var_Hdr, 4, 8))) ;
      AV65BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV68Var_Hdr, 12, 1))) ;
      AV66BarCodPar = GXutil.substring( AV68Var_Hdr, 13, 1) ;
      AV67WebSession.remove("&Var_Hdr");
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_PackingListExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_PackingListColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Produccion.ConsultadeProduccion_PackingListColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Terminal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pieza", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ancho", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "E", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV81Produccion_consultadeproduccion_packinglistds_1_emprcod = AV63EmprCod ;
      AV82Produccion_consultadeproduccion_packinglistds_2_barcod = AV64BarCod ;
      AV83Produccion_consultadeproduccion_packinglistds_3_barcodreo = AV65BarCodReo ;
      AV84Produccion_consultadeproduccion_packinglistds_4_barcodpar = AV66BarCodPar ;
      AV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod = AV38TFMetTerCod ;
      AV86Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = AV39TFMetTerCod_Sel ;
      AV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = AV52TFMetPieCod ;
      AV88Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = AV53TFMetPieCod_Sel ;
      AV89Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = AV57TFMetPieMet ;
      AV90Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = AV58TFMetPieMet_To ;
      AV91Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = AV59TFMetPieKil ;
      AV92Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = AV60TFMetPieKil_To ;
      AV93Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc = AV61TFMetPieAnc ;
      AV94Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to = AV62TFMetPieAnc_To ;
      AV95Produccion_consultadeproduccion_packinglistds_15_tfmetpieest = AV69TFMetPieEst ;
      AV96Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to = AV70TFMetPieEst_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV86Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                           AV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                           AV88Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                           AV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                           AV89Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                           AV90Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                           AV91Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                           AV92Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                           Short.valueOf(AV93Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) ,
                                           Short.valueOf(AV94Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) ,
                                           Byte.valueOf(AV95Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) ,
                                           Byte.valueOf(AV96Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2815MetPieMet ,
                                           A2814MetPieKil ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV81Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                           Integer.valueOf(AV82Produccion_consultadeproduccion_packinglistds_2_barcod) ,
                                           Byte.valueOf(AV83Produccion_consultadeproduccion_packinglistds_3_barcodreo) ,
                                           AV84Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod = GXutil.padr( GXutil.rtrim( AV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod), 10, "%") ;
      lV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod), 9, "%") ;
      /* Using cursor P09LN2 */
      pr_default.execute(0, new Object[] {AV81Produccion_consultadeproduccion_packinglistds_1_emprcod, Integer.valueOf(AV82Produccion_consultadeproduccion_packinglistds_2_barcod), Byte.valueOf(AV83Produccion_consultadeproduccion_packinglistds_3_barcodreo), AV84Produccion_consultadeproduccion_packinglistds_4_barcodpar, lV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod, AV86Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel, lV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod, AV88Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel, AV89Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet, AV90Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to, AV91Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil, AV92Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to, Short.valueOf(AV93Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc), Short.valueOf(AV94Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to), Byte.valueOf(AV95Produccion_consultadeproduccion_packinglistds_15_tfmetpieest), Byte.valueOf(AV96Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2816MetPieEst = P09LN2_A2816MetPieEst[0] ;
         A6635MetPieAnc = P09LN2_A6635MetPieAnc[0] ;
         A2814MetPieKil = P09LN2_A2814MetPieKil[0] ;
         A2815MetPieMet = P09LN2_A2815MetPieMet[0] ;
         A2813MetPieCod = P09LN2_A2813MetPieCod[0] ;
         A2809MetTerCod = P09LN2_A2809MetTerCod[0] ;
         A130BarCodPar = P09LN2_A130BarCodPar[0] ;
         A132BarCodReo = P09LN2_A132BarCodReo[0] ;
         A129BarCod = P09LN2_A129BarCod[0] ;
         A396EmprCod = P09LN2_A396EmprCod[0] ;
         A4917MetPieObs = P09LN2_A4917MetPieObs[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2809MetTerCod, ";", ","), GXv_char3) ;
            consultadeproduccion_packinglistexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2813MetPieCod, ";", ","), GXv_char3) ;
            consultadeproduccion_packinglistexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2815MetPieMet, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2814MetPieKil, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A6635MetPieAnc, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A2816MetPieEst, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV54MaqCod = GXutil.substring( A4917MetPieObs, 4, 6) ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV54MaqCod, ";", ","), GXv_char3) ;
            consultadeproduccion_packinglistexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV55HisProFec = localUtil.ctod( GXutil.substring( A4917MetPieObs, 10, 8), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( AV55HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV56BarOrdLin = (short)(GXutil.lval( GXutil.substring( A4917MetPieObs, 18, 8))) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV56BarOrdLin, 4, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultadeProduccion_PackingListExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetTerCod", "", "Terminal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieCod", "", "Pieza", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieMet", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieKil", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieAnc", "", "Ancho", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieEst", "", "E", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&MaqCod", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&HisProFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarOrdLin", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_PackingListColumnsSelector", GXv_char3) ;
      consultadeproduccion_packinglistexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_PackingListGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_PackingListGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("Produccion.ConsultadeProduccion_PackingListGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV97GXV1 = 1 ;
      while ( AV97GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV97GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD") == 0 )
         {
            AV38TFMetTerCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD_SEL") == 0 )
         {
            AV39TFMetTerCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV52TFMetPieCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV53TFMetPieCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV57TFMetPieMet = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFMetPieMet_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV59TFMetPieKil = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFMetPieKil_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV61TFMetPieAnc = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFMetPieAnc_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEEST") == 0 )
         {
            AV69TFMetPieEst = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFMetPieEst_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV63EmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV64BarCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV65BarCodReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV66BarCodPar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV71Clicod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV72CliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV73PedidoCliente = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV74Barser = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV75BarSerDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV76Barcolnom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV77Barcolnum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV97GXV1 = (int)(AV97GXV1+1) ;
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
      AV68Var_Hdr = "" ;
      AV67WebSession = httpContext.getWebSession();
      AV63EmprCod = "" ;
      AV66BarCodPar = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A2809MetTerCod = "" ;
      A2813MetPieCod = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      A4917MetPieObs = "" ;
      AV81Produccion_consultadeproduccion_packinglistds_1_emprcod = "" ;
      AV84Produccion_consultadeproduccion_packinglistds_4_barcodpar = "" ;
      AV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod = "" ;
      AV38TFMetTerCod = "" ;
      AV86Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel = "" ;
      AV39TFMetTerCod_Sel = "" ;
      AV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = "" ;
      AV52TFMetPieCod = "" ;
      AV88Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel = "" ;
      AV53TFMetPieCod_Sel = "" ;
      AV89Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet = DecimalUtil.ZERO ;
      AV57TFMetPieMet = DecimalUtil.ZERO ;
      AV90Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV58TFMetPieMet_To = DecimalUtil.ZERO ;
      AV91Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil = DecimalUtil.ZERO ;
      AV59TFMetPieKil = DecimalUtil.ZERO ;
      AV92Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to = DecimalUtil.ZERO ;
      AV60TFMetPieKil_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod = "" ;
      lV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09LN2_A2816MetPieEst = new byte[1] ;
      P09LN2_A6635MetPieAnc = new short[1] ;
      P09LN2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LN2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LN2_A2813MetPieCod = new String[] {""} ;
      P09LN2_A2809MetTerCod = new String[] {""} ;
      P09LN2_A130BarCodPar = new String[] {""} ;
      P09LN2_A132BarCodReo = new byte[1] ;
      P09LN2_A129BarCod = new int[1] ;
      P09LN2_A396EmprCod = new String[] {""} ;
      P09LN2_A4917MetPieObs = new String[] {""} ;
      AV54MaqCod = "" ;
      AV55HisProFec = GXutil.nullDate() ;
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
      AV72CliNom = "" ;
      AV73PedidoCliente = "" ;
      AV74Barser = "" ;
      AV75BarSerDsc = "" ;
      AV76Barcolnom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_packinglistexportcsv__default(),
         new Object[] {
             new Object[] {
            P09LN2_A2816MetPieEst, P09LN2_A6635MetPieAnc, P09LN2_A2814MetPieKil, P09LN2_A2815MetPieMet, P09LN2_A2813MetPieCod, P09LN2_A2809MetTerCod, P09LN2_A130BarCodPar, P09LN2_A132BarCodReo, P09LN2_A129BarCod, P09LN2_A396EmprCod,
            P09LN2_A4917MetPieObs
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV65BarCodReo ;
   private byte A2816MetPieEst ;
   private byte AV83Produccion_consultadeproduccion_packinglistds_3_barcodreo ;
   private byte AV95Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ;
   private byte AV69TFMetPieEst ;
   private byte AV96Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ;
   private byte AV70TFMetPieEst_To ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A6635MetPieAnc ;
   private short AV93Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ;
   private short AV61TFMetPieAnc ;
   private short AV94Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ;
   private short AV62TFMetPieAnc_To ;
   private short AV28OrderedBy ;
   private short AV56BarOrdLin ;
   private short Gx_err ;
   private int AV64BarCod ;
   private int AV13Random ;
   private int AV82Produccion_consultadeproduccion_packinglistds_2_barcod ;
   private int A129BarCod ;
   private int AV97GXV1 ;
   private int AV71Clicod ;
   private int AV77Barcolnum ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal AV89Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ;
   private java.math.BigDecimal AV57TFMetPieMet ;
   private java.math.BigDecimal AV90Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ;
   private java.math.BigDecimal AV58TFMetPieMet_To ;
   private java.math.BigDecimal AV91Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ;
   private java.math.BigDecimal AV59TFMetPieKil ;
   private java.math.BigDecimal AV92Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ;
   private java.math.BigDecimal AV60TFMetPieKil_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV68Var_Hdr ;
   private String AV63EmprCod ;
   private String AV66BarCodPar ;
   private String A2809MetTerCod ;
   private String A2813MetPieCod ;
   private String AV81Produccion_consultadeproduccion_packinglistds_1_emprcod ;
   private String AV84Produccion_consultadeproduccion_packinglistds_4_barcodpar ;
   private String AV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod ;
   private String AV38TFMetTerCod ;
   private String AV86Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ;
   private String AV39TFMetTerCod_Sel ;
   private String AV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ;
   private String AV52TFMetPieCod ;
   private String AV88Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ;
   private String AV53TFMetPieCod_Sel ;
   private String scmdbuf ;
   private String lV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod ;
   private String lV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV54MaqCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV72CliNom ;
   private String AV73PedidoCliente ;
   private String AV74Barser ;
   private String AV75BarSerDsc ;
   private String AV76Barcolnom ;
   private java.util.Date AV55HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String A4917MetPieObs ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV67WebSession ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09LN2_A2816MetPieEst ;
   private short[] P09LN2_A6635MetPieAnc ;
   private java.math.BigDecimal[] P09LN2_A2814MetPieKil ;
   private java.math.BigDecimal[] P09LN2_A2815MetPieMet ;
   private String[] P09LN2_A2813MetPieCod ;
   private String[] P09LN2_A2809MetTerCod ;
   private String[] P09LN2_A130BarCodPar ;
   private byte[] P09LN2_A132BarCodReo ;
   private int[] P09LN2_A129BarCod ;
   private String[] P09LN2_A396EmprCod ;
   private String[] P09LN2_A4917MetPieObs ;
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

final  class consultadeproduccion_packinglistexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV86Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel ,
                                          String AV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod ,
                                          String AV88Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel ,
                                          String AV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod ,
                                          java.math.BigDecimal AV89Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet ,
                                          java.math.BigDecimal AV90Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to ,
                                          java.math.BigDecimal AV91Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil ,
                                          java.math.BigDecimal AV92Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to ,
                                          short AV93Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc ,
                                          short AV94Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to ,
                                          byte AV95Produccion_consultadeproduccion_packinglistds_15_tfmetpieest ,
                                          byte AV96Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          short A6635MetPieAnc ,
                                          byte A2816MetPieEst ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV81Produccion_consultadeproduccion_packinglistds_1_emprcod ,
                                          int AV82Produccion_consultadeproduccion_packinglistds_2_barcod ,
                                          byte AV83Produccion_consultadeproduccion_packinglistds_3_barcodreo ,
                                          String AV84Produccion_consultadeproduccion_packinglistds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[16];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT MetPieEst, MetPieAnc, MetPieKil, MetPieMet, MetPieCod, MetTerCod, BarCodPar, BarCodReo, BarCod, EmprCod, MetPieObs FROM TXPLMETPI" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV86Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV85Produccion_consultadeproduccion_packinglistds_5_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_packinglistds_6_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(MetTerCod = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV87Produccion_consultadeproduccion_packinglistds_7_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Produccion_consultadeproduccion_packinglistds_8_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(MetPieCod = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Produccion_consultadeproduccion_packinglistds_9_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(MetPieMet >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Produccion_consultadeproduccion_packinglistds_10_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(MetPieMet <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Produccion_consultadeproduccion_packinglistds_11_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(MetPieKil >= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Produccion_consultadeproduccion_packinglistds_12_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(MetPieKil <= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV93Produccion_consultadeproduccion_packinglistds_13_tfmetpieanc) )
      {
         addWhere(sWhereString, "(MetPieAnc >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV94Produccion_consultadeproduccion_packinglistds_14_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(MetPieAnc <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV95Produccion_consultadeproduccion_packinglistds_15_tfmetpieest) )
      {
         addWhere(sWhereString, "(MetPieEst >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV96Produccion_consultadeproduccion_packinglistds_16_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(MetPieEst <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetTerCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetTerCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieMet" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieMet DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieKil" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieKil DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieAnc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieAnc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MetPieEst" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MetPieEst DESC" ;
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
                  return conditional_P09LN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((String[]) buf[10])[0] = rslt.getVarchar(11);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[18]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 10);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 10);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 9);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 9);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               return;
      }
   }

}

