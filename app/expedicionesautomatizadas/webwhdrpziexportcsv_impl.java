package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwhdrpziexportcsv_impl extends GXWebProcedure
{
   public webwhdrpziexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebWHDRPZIExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Pieza", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ancho Acabado Pieza", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Impresa?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV61Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV28EmprCod ;
      AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV44FilterFullText ;
      AV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV48TFBarPieCod ;
      AV64Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV49TFBarPieCod_Sel ;
      AV65Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV50TFBarPieKil ;
      AV66Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV51TFBarPieKil_To ;
      AV67Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV52TFBarPieMet ;
      AV68Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV53TFBarPieMet_To ;
      AV69Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV54TFBarPieAnc ;
      AV70Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV55TFBarPieAnc_To ;
      AV71Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV56TFBarPieEst ;
      AV72Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV57TFBarPieEst_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                           AV64Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                           AV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                           AV65Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                           AV66Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                           AV67Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                           AV68Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                           Short.valueOf(AV69Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) ,
                                           Short.valueOf(AV70Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) ,
                                           Byte.valueOf(AV71Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) ,
                                           Byte.valueOf(AV72Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) ,
                                           A200BarPieCod ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Short.valueOf(A1691BarPieAnc) ,
                                           A6116BarPieImp ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           Short.valueOf(AV42OrderedBy) ,
                                           Boolean.valueOf(AV43OrderedDsc) ,
                                           A396EmprCod ,
                                           AV28EmprCod ,
                                           AV61Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                           Integer.valueOf(AV35BarCod) ,
                                           Byte.valueOf(AV36BarCodReo) ,
                                           AV37BarCodPar ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod), 9, "%") ;
      /* Using cursor P09C32 */
      pr_default.execute(0, new Object[] {AV61Expedicionesautomatizadas_webwhdrpzids_1_emprcod, Integer.valueOf(AV35BarCod), Byte.valueOf(AV36BarCodReo), AV37BarCodPar, AV28EmprCod, lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod, AV64Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel, AV65Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil, AV66Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to, AV67Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet, AV68Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to, Short.valueOf(AV69Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc), Short.valueOf(AV70Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to), Byte.valueOf(AV71Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest), Byte.valueOf(AV72Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P09C32_A130BarCodPar[0] ;
         A132BarCodReo = P09C32_A132BarCodReo[0] ;
         A129BarCod = P09C32_A129BarCod[0] ;
         A6116BarPieImp = P09C32_A6116BarPieImp[0] ;
         n6116BarPieImp = P09C32_n6116BarPieImp[0] ;
         A201BarPieEst = P09C32_A201BarPieEst[0] ;
         A1691BarPieAnc = P09C32_A1691BarPieAnc[0] ;
         n1691BarPieAnc = P09C32_n1691BarPieAnc[0] ;
         A205BarPieMet = P09C32_A205BarPieMet[0] ;
         A203BarPieKil = P09C32_A203BarPieKil[0] ;
         A200BarPieCod = P09C32_A200BarPieCod[0] ;
         A396EmprCod = P09C32_A396EmprCod[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A200BarPieCod, ";", ","), GXv_char3) ;
            webwhdrpziexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A203BarPieKil, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A205BarPieMet, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1691BarPieAnc, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6116BarPieImp, ";", ","), GXv_char3) ;
            webwhdrpziexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A201BarPieEst, 1, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebWHDRPZIExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieCod", "", "Nº Pieza", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieKil", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieMet", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieAnc", "", "Ancho Acabado Pieza", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieImp", "", "Impresa?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarPieEst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebWHDRPZIColumnsSelector", GXv_char3) ;
      webwhdrpziexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIGridState"), "") == 0 )
      {
         AV46GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebWHDRPZIGridState"), null, null);
      }
      else
      {
         AV46GridState.fromxml(AV19Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIGridState"), null, null);
      }
      AV42OrderedBy = AV46GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV43OrderedDsc = AV46GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV73GXV1 = 1 ;
      while ( AV73GXV1 <= AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV47GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV46GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV73GXV1));
         if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV44FilterFullText = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD") == 0 )
         {
            AV48TFBarPieCod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD_SEL") == 0 )
         {
            AV49TFBarPieCod_Sel = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV50TFBarPieKil = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFBarPieKil_To = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV52TFBarPieMet = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV53TFBarPieMet_To = CommonUtil.decimalVal( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEANC") == 0 )
         {
            AV54TFBarPieAnc = (short)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFBarPieAnc_To = (short)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEEST") == 0 )
         {
            AV56TFBarPieEst = (byte)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarPieEst_To = (byte)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28EmprCod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPECOD") == 0 )
         {
            AV29OpeCod = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&OPENOM") == 0 )
         {
            AV30OpeNom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV31MaqCod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQNOM") == 0 )
         {
            AV32MaqNom = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASCOD") == 0 )
         {
            AV33FasCod = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FASDSC") == 0 )
         {
            AV34FasDsc = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV35BarCod = (int)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV36BarCodReo = (byte)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV37BarCodPar = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARORDLIN") == 0 )
         {
            AV38BarOrdlin = (short)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARANCACA1") == 0 )
         {
            AV39BarAncAca1 = (short)(GXutil.lval( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MSG_I") == 0 )
         {
            AV40Msg_i = AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&LECFEC") == 0 )
         {
            AV41Lecfec = localUtil.ctod( AV47GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV73GXV1 = (int)(AV73GXV1+1) ;
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
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A6116BarPieImp = "" ;
      AV61Expedicionesautomatizadas_webwhdrpzids_1_emprcod = "" ;
      AV28EmprCod = "" ;
      AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = "" ;
      AV44FilterFullText = "" ;
      AV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = "" ;
      AV48TFBarPieCod = "" ;
      AV64Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = "" ;
      AV49TFBarPieCod_Sel = "" ;
      AV65Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = DecimalUtil.ZERO ;
      AV50TFBarPieKil = DecimalUtil.ZERO ;
      AV66Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV51TFBarPieKil_To = DecimalUtil.ZERO ;
      AV67Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = DecimalUtil.ZERO ;
      AV52TFBarPieMet = DecimalUtil.ZERO ;
      AV68Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = DecimalUtil.ZERO ;
      AV53TFBarPieMet_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = "" ;
      lV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = "" ;
      A396EmprCod = "" ;
      AV37BarCodPar = "" ;
      A130BarCodPar = "" ;
      P09C32_A130BarCodPar = new String[] {""} ;
      P09C32_A132BarCodReo = new byte[1] ;
      P09C32_A129BarCod = new int[1] ;
      P09C32_A6116BarPieImp = new String[] {""} ;
      P09C32_n6116BarPieImp = new boolean[] {false} ;
      P09C32_A201BarPieEst = new byte[1] ;
      P09C32_A1691BarPieAnc = new short[1] ;
      P09C32_n1691BarPieAnc = new boolean[] {false} ;
      P09C32_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C32_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09C32_A200BarPieCod = new String[] {""} ;
      P09C32_A396EmprCod = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV46GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV47GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV30OpeNom = "" ;
      AV31MaqCod = "" ;
      AV32MaqNom = "" ;
      AV33FasCod = "" ;
      AV34FasDsc = "" ;
      AV40Msg_i = "" ;
      AV41Lecfec = GXutil.nullDate() ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webwhdrpziexportcsv__default(),
         new Object[] {
             new Object[] {
            P09C32_A130BarCodPar, P09C32_A132BarCodReo, P09C32_A129BarCod, P09C32_A6116BarPieImp, P09C32_n6116BarPieImp, P09C32_A201BarPieEst, P09C32_A1691BarPieAnc, P09C32_n1691BarPieAnc, P09C32_A205BarPieMet, P09C32_A203BarPieKil,
            P09C32_A200BarPieCod, P09C32_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A201BarPieEst ;
   private byte AV71Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ;
   private byte AV56TFBarPieEst ;
   private byte AV72Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ;
   private byte AV57TFBarPieEst_To ;
   private byte AV36BarCodReo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A1691BarPieAnc ;
   private short AV69Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ;
   private short AV54TFBarPieAnc ;
   private short AV70Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ;
   private short AV55TFBarPieAnc_To ;
   private short AV42OrderedBy ;
   private short AV38BarOrdlin ;
   private short AV39BarAncAca1 ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV35BarCod ;
   private int A129BarCod ;
   private int AV73GXV1 ;
   private int AV29OpeCod ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV65Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ;
   private java.math.BigDecimal AV50TFBarPieKil ;
   private java.math.BigDecimal AV66Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ;
   private java.math.BigDecimal AV51TFBarPieKil_To ;
   private java.math.BigDecimal AV67Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ;
   private java.math.BigDecimal AV52TFBarPieMet ;
   private java.math.BigDecimal AV68Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ;
   private java.math.BigDecimal AV53TFBarPieMet_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A200BarPieCod ;
   private String A6116BarPieImp ;
   private String AV61Expedicionesautomatizadas_webwhdrpzids_1_emprcod ;
   private String AV28EmprCod ;
   private String AV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ;
   private String AV48TFBarPieCod ;
   private String AV64Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ;
   private String AV49TFBarPieCod_Sel ;
   private String scmdbuf ;
   private String lV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ;
   private String A396EmprCod ;
   private String AV37BarCodPar ;
   private String A130BarCodPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV30OpeNom ;
   private String AV31MaqCod ;
   private String AV32MaqNom ;
   private String AV33FasCod ;
   private String AV34FasDsc ;
   private String AV40Msg_i ;
   private java.util.Date AV41Lecfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV43OrderedDsc ;
   private boolean n6116BarPieImp ;
   private boolean n1691BarPieAnc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ;
   private String AV44FilterFullText ;
   private String lV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09C32_A130BarCodPar ;
   private byte[] P09C32_A132BarCodReo ;
   private int[] P09C32_A129BarCod ;
   private String[] P09C32_A6116BarPieImp ;
   private boolean[] P09C32_n6116BarPieImp ;
   private byte[] P09C32_A201BarPieEst ;
   private short[] P09C32_A1691BarPieAnc ;
   private boolean[] P09C32_n1691BarPieAnc ;
   private java.math.BigDecimal[] P09C32_A205BarPieMet ;
   private java.math.BigDecimal[] P09C32_A203BarPieKil ;
   private String[] P09C32_A200BarPieCod ;
   private String[] P09C32_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV46GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV47GridStateFilterValue ;
}

final  class webwhdrpziexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09C32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                          String AV64Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                          String AV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                          java.math.BigDecimal AV65Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                          java.math.BigDecimal AV66Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                          java.math.BigDecimal AV67Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                          java.math.BigDecimal AV68Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                          short AV69Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ,
                                          short AV70Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ,
                                          byte AV71Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ,
                                          byte AV72Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ,
                                          String A200BarPieCod ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          short A1691BarPieAnc ,
                                          String A6116BarPieImp ,
                                          byte A201BarPieEst ,
                                          short AV42OrderedBy ,
                                          boolean AV43OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV28EmprCod ,
                                          String AV61Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                          int AV35BarCod ,
                                          byte AV36BarCodReo ,
                                          String AV37BarCodPar ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[21];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT BarCodPar, BarCodReo, BarCod, BarPieImp, BarPieEst, BarPieAnc, BarPieMet, BarPieKil, BarPieCod, EmprCod FROM TXPBARPIE" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(BarPieKil > 0)");
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV62Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieAnc,'9990'), 2) like '%' || ?) or ( UPPER(BarPieImp) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV63Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(BarPieCod = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(BarPieKil >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(BarPieKil <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(BarPieMet >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(BarPieMet <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV69Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) )
      {
         addWhere(sWhereString, "(BarPieAnc >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV70Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) )
      {
         addWhere(sWhereString, "(BarPieAnc <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV71Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) )
      {
         addWhere(sWhereString, "(BarPieEst >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV72Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(BarPieEst <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV42OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV42OrderedBy == 2 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieCod" ;
      }
      else if ( ( AV42OrderedBy == 2 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieCod DESC" ;
      }
      else if ( ( AV42OrderedBy == 3 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieKil" ;
      }
      else if ( ( AV42OrderedBy == 3 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieKil DESC" ;
      }
      else if ( ( AV42OrderedBy == 4 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieMet" ;
      }
      else if ( ( AV42OrderedBy == 4 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieMet DESC" ;
      }
      else if ( ( AV42OrderedBy == 5 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieAnc" ;
      }
      else if ( ( AV42OrderedBy == 5 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieAnc DESC" ;
      }
      else if ( ( AV42OrderedBy == 6 ) && ! AV43OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, BarPieEst" ;
      }
      else if ( ( AV42OrderedBy == 6 ) && ( AV43OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, BarPieEst DESC" ;
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
                  return conditional_P09C32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09C32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[10])[0] = rslt.getString(9, 9);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[23]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 9);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               return;
      }
   }

}

