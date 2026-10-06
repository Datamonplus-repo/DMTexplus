package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webcontador_metrajepiezas_defectos_wcexportcsv_impl extends GXWebProcedure
{
   public webcontador_metrajepiezas_defectos_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebContador_MetrajePiezas_Defectos_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Defecto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros Iniciales", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros Finales", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = AV28EmprCod ;
      AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = AV29MetTerCod ;
      AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod = AV30BarCod ;
      AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo = AV31BarCodReo ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = AV32BarCodPar ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = AV33MetPieCod ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = AV36FilterFullText ;
      AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin = AV40TFMetPieDfLin ;
      AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to = AV41TFMetPieDfLin_To ;
      AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid = AV42TFMetPieDfID ;
      AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to = AV43TFMetPieDfID_To ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = AV44TFMetPieDfDc ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = AV45TFMetPieDfDc_Sel ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = AV46TFMetPieDfMin ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = AV47TFMetPieDfMin_To ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = AV48TFMetPieDfMax ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = AV49TFMetPieDfMax_To ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = AV50TFMetPieDfFase ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = AV51TFMetPieDfFase_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                           Short.valueOf(AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) ,
                                           Short.valueOf(AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) ,
                                           Short.valueOf(AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) ,
                                           Short.valueOf(AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) ,
                                           AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                           AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                           AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                           AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                           AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                           AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                           AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                           AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                           Short.valueOf(A12995MetPieDfLi) ,
                                           Short.valueOf(A12996MetPieDfID) ,
                                           A12997MetPieDfDc ,
                                           A12998MetPieDfMi ,
                                           A12999MetPieDfMa ,
                                           A13000MetPieDfFa ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV35OrderedDsc) ,
                                           A396EmprCod ,
                                           AV28EmprCod ,
                                           A2809MetTerCod ,
                                           AV29MetTerCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV30BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV31BarCodReo) ,
                                           A130BarCodPar ,
                                           AV32BarCodPar ,
                                           A2813MetPieCod ,
                                           AV33MetPieCod ,
                                           AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                           AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                           Integer.valueOf(AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod) ,
                                           Byte.valueOf(AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo) ,
                                           AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                           AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = GXutil.concat( GXutil.rtrim( AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext), "%", "") ;
      lV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = GXutil.padr( GXutil.rtrim( AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc), 30, "%") ;
      lV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = GXutil.padr( GXutil.rtrim( AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase), 8, "%") ;
      /* Using cursor P09AT2 */
      pr_default.execute(0, new Object[] {AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod, AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod, Integer.valueOf(AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod), Byte.valueOf(AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo), AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar, AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod, AV28EmprCod, AV29MetTerCod, Integer.valueOf(AV30BarCod), Byte.valueOf(AV31BarCodReo), AV32BarCodPar, AV33MetPieCod, lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext, Short.valueOf(AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin), Short.valueOf(AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to), Short.valueOf(AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid), Short.valueOf(AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to), lV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc, AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to, lV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase, AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13000MetPieDfFa = P09AT2_A13000MetPieDfFa[0] ;
         A12999MetPieDfMa = P09AT2_A12999MetPieDfMa[0] ;
         A12998MetPieDfMi = P09AT2_A12998MetPieDfMi[0] ;
         A12997MetPieDfDc = P09AT2_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = P09AT2_n12997MetPieDfDc[0] ;
         A12996MetPieDfID = P09AT2_A12996MetPieDfID[0] ;
         A12995MetPieDfLi = P09AT2_A12995MetPieDfLi[0] ;
         A2813MetPieCod = P09AT2_A2813MetPieCod[0] ;
         A130BarCodPar = P09AT2_A130BarCodPar[0] ;
         A132BarCodReo = P09AT2_A132BarCodReo[0] ;
         A129BarCod = P09AT2_A129BarCod[0] ;
         A2809MetTerCod = P09AT2_A2809MetTerCod[0] ;
         A396EmprCod = P09AT2_A396EmprCod[0] ;
         A12997MetPieDfDc = P09AT2_A12997MetPieDfDc[0] ;
         n12997MetPieDfDc = P09AT2_n12997MetPieDfDc[0] ;
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
            AV14TextFileLine += GXutil.str( A12995MetPieDfLi, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A12996MetPieDfID, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A12997MetPieDfDc, ";", ","), GXv_char3) ;
            webcontador_metrajepiezas_defectos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A12998MetPieDfMi, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A12999MetPieDfMa, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13000MetPieDfFa, ";", ","), GXv_char3) ;
            webcontador_metrajepiezas_defectos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebContador_MetrajePiezas_Defectos_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieDfLin", "", "Linea", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieDfID", "", "Defecto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieDfDc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieDfMin", "", "Metros Iniciales", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieDfMax", "", "Metros Finales", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MetPieDfFase", "", "Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCColumnsSelector", GXv_char3) ;
      webcontador_metrajepiezas_defectos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV19Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_Defectos_WCGridState"), null, null);
      }
      AV34OrderedBy = AV38GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV35OrderedDsc = AV38GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV39GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV38GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV74GXV1));
         if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV36FilterFullText = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFLIN") == 0 )
         {
            AV40TFMetPieDfLin = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV41TFMetPieDfLin_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFID") == 0 )
         {
            AV42TFMetPieDfID = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFMetPieDfID_To = (short)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFDC") == 0 )
         {
            AV44TFMetPieDfDc = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFDC_SEL") == 0 )
         {
            AV45TFMetPieDfDc_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFMIN") == 0 )
         {
            AV46TFMetPieDfMin = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFMetPieDfMin_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFMAX") == 0 )
         {
            AV48TFMetPieDfMax = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFMetPieDfMax_To = CommonUtil.decimalVal( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFFASE") == 0 )
         {
            AV50TFMetPieDfFase = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFFASE_SEL") == 0 )
         {
            AV51TFMetPieDfFase_Sel = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28EmprCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&METTERCOD") == 0 )
         {
            AV29MetTerCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV30BarCod = (int)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV31BarCodReo = (byte)(GXutil.lval( AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV32BarCodPar = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&METPIECOD") == 0 )
         {
            AV33MetPieCod = AV39GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
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
      A12997MetPieDfDc = "" ;
      A12998MetPieDfMi = DecimalUtil.ZERO ;
      A12999MetPieDfMa = DecimalUtil.ZERO ;
      A13000MetPieDfFa = "" ;
      AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod = "" ;
      AV28EmprCod = "" ;
      AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod = "" ;
      AV29MetTerCod = "" ;
      AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar = "" ;
      AV32BarCodPar = "" ;
      AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod = "" ;
      AV33MetPieCod = "" ;
      AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = "" ;
      AV36FilterFullText = "" ;
      AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = "" ;
      AV44TFMetPieDfDc = "" ;
      AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel = "" ;
      AV45TFMetPieDfDc_Sel = "" ;
      AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin = DecimalUtil.ZERO ;
      AV46TFMetPieDfMin = DecimalUtil.ZERO ;
      AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to = DecimalUtil.ZERO ;
      AV47TFMetPieDfMin_To = DecimalUtil.ZERO ;
      AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax = DecimalUtil.ZERO ;
      AV48TFMetPieDfMax = DecimalUtil.ZERO ;
      AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to = DecimalUtil.ZERO ;
      AV49TFMetPieDfMax_To = DecimalUtil.ZERO ;
      AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = "" ;
      AV50TFMetPieDfFase = "" ;
      AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel = "" ;
      AV51TFMetPieDfFase_Sel = "" ;
      scmdbuf = "" ;
      lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext = "" ;
      lV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc = "" ;
      lV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      P09AT2_A13000MetPieDfFa = new String[] {""} ;
      P09AT2_A12999MetPieDfMa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AT2_A12998MetPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09AT2_A12997MetPieDfDc = new String[] {""} ;
      P09AT2_n12997MetPieDfDc = new boolean[] {false} ;
      P09AT2_A12996MetPieDfID = new short[1] ;
      P09AT2_A12995MetPieDfLi = new short[1] ;
      P09AT2_A2813MetPieCod = new String[] {""} ;
      P09AT2_A130BarCodPar = new String[] {""} ;
      P09AT2_A132BarCodReo = new byte[1] ;
      P09AT2_A129BarCod = new int[1] ;
      P09AT2_A2809MetTerCod = new String[] {""} ;
      P09AT2_A396EmprCod = new String[] {""} ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV39GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webcontador_metrajepiezas_defectos_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09AT2_A13000MetPieDfFa, P09AT2_A12999MetPieDfMa, P09AT2_A12998MetPieDfMi, P09AT2_A12997MetPieDfDc, P09AT2_n12997MetPieDfDc, P09AT2_A12996MetPieDfID, P09AT2_A12995MetPieDfLi, P09AT2_A2813MetPieCod, P09AT2_A130BarCodPar, P09AT2_A132BarCodReo,
            P09AT2_A129BarCod, P09AT2_A2809MetTerCod, P09AT2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ;
   private byte AV31BarCodReo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A12995MetPieDfLi ;
   private short A12996MetPieDfID ;
   private short AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ;
   private short AV40TFMetPieDfLin ;
   private short AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ;
   private short AV41TFMetPieDfLin_To ;
   private short AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ;
   private short AV42TFMetPieDfID ;
   private short AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ;
   private short AV43TFMetPieDfID_To ;
   private short AV34OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ;
   private int AV30BarCod ;
   private int A129BarCod ;
   private int AV74GXV1 ;
   private java.math.BigDecimal A12998MetPieDfMi ;
   private java.math.BigDecimal A12999MetPieDfMa ;
   private java.math.BigDecimal AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ;
   private java.math.BigDecimal AV46TFMetPieDfMin ;
   private java.math.BigDecimal AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ;
   private java.math.BigDecimal AV47TFMetPieDfMin_To ;
   private java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ;
   private java.math.BigDecimal AV48TFMetPieDfMax ;
   private java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ;
   private java.math.BigDecimal AV49TFMetPieDfMax_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A12997MetPieDfDc ;
   private String A13000MetPieDfFa ;
   private String AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ;
   private String AV28EmprCod ;
   private String AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ;
   private String AV29MetTerCod ;
   private String AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ;
   private String AV32BarCodPar ;
   private String AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod ;
   private String AV33MetPieCod ;
   private String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ;
   private String AV44TFMetPieDfDc ;
   private String AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ;
   private String AV45TFMetPieDfDc_Sel ;
   private String AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ;
   private String AV50TFMetPieDfFase ;
   private String AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ;
   private String AV51TFMetPieDfFase_Sel ;
   private String scmdbuf ;
   private String lV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ;
   private String lV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ;
   private String A396EmprCod ;
   private String A2809MetTerCod ;
   private String A130BarCodPar ;
   private String A2813MetPieCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV35OrderedDsc ;
   private boolean n12997MetPieDfDc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ;
   private String AV36FilterFullText ;
   private String lV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09AT2_A13000MetPieDfFa ;
   private java.math.BigDecimal[] P09AT2_A12999MetPieDfMa ;
   private java.math.BigDecimal[] P09AT2_A12998MetPieDfMi ;
   private String[] P09AT2_A12997MetPieDfDc ;
   private boolean[] P09AT2_n12997MetPieDfDc ;
   private short[] P09AT2_A12996MetPieDfID ;
   private short[] P09AT2_A12995MetPieDfLi ;
   private String[] P09AT2_A2813MetPieCod ;
   private String[] P09AT2_A130BarCodPar ;
   private byte[] P09AT2_A132BarCodReo ;
   private int[] P09AT2_A129BarCod ;
   private String[] P09AT2_A2809MetTerCod ;
   private String[] P09AT2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV39GridStateFilterValue ;
}

final  class webcontador_metrajepiezas_defectos_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09AT2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext ,
                                          short AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin ,
                                          short AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to ,
                                          short AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid ,
                                          short AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to ,
                                          String AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel ,
                                          String AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc ,
                                          java.math.BigDecimal AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin ,
                                          java.math.BigDecimal AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to ,
                                          java.math.BigDecimal AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax ,
                                          java.math.BigDecimal AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to ,
                                          String AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel ,
                                          String AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase ,
                                          short A12995MetPieDfLi ,
                                          short A12996MetPieDfID ,
                                          String A12997MetPieDfDc ,
                                          java.math.BigDecimal A12998MetPieDfMi ,
                                          java.math.BigDecimal A12999MetPieDfMa ,
                                          String A13000MetPieDfFa ,
                                          short AV34OrderedBy ,
                                          boolean AV35OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV28EmprCod ,
                                          String A2809MetTerCod ,
                                          String AV29MetTerCod ,
                                          int A129BarCod ,
                                          int AV30BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV31BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV32BarCodPar ,
                                          String A2813MetPieCod ,
                                          String AV33MetPieCod ,
                                          String AV55Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_1_emprcod ,
                                          String AV56Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_2_mettercod ,
                                          int AV57Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_3_barcod ,
                                          byte AV58Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_4_barcodreo ,
                                          String AV59Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_5_barcodpar ,
                                          String AV60Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_6_metpiecod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.MetPieDfFa, T1.MetPieDfMa, T1.MetPieDfMi, T2.TipDefDsc AS MetPieDfDc, T1.MetPieDfID AS MetPieDfID, T1.MetPieDfLi, T1.MetPieCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.MetTerCod, T1.EmprCod FROM (TXPMETPID T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.MetPieDfID)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MetTerCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.MetPieCod = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MetTerCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.MetPieCod = ?)");
      if ( ! (GXutil.strcmp("", AV61Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_7_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.MetPieDfLi,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfID,'9990'), 2) like '%' || ?) or ( UPPER(T2.TipDefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfMi,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieDfMa,'999990.99'), 2) like '%' || ?) or ( UPPER(T1.MetPieDfFa) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
         GXv_int6[13] = (byte)(1) ;
         GXv_int6[14] = (byte)(1) ;
         GXv_int6[15] = (byte)(1) ;
         GXv_int6[16] = (byte)(1) ;
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV62Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_8_tfmetpiedflin) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV63Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_9_tfmetpiedflin_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfLi <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV64Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_10_tfmetpiedfid) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV65Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_11_tfmetpiedfid_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfID <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) && ( ! (GXutil.strcmp("", AV66Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_12_tfmetpiedfdc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipDefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_13_tfmetpiedfdc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipDefDsc = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_14_tfmetpiedfmin)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV69Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_15_tfmetpiedfmin_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMi <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_16_tfmetpiedfmax)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_17_tfmetpiedfmax_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfMa <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) && ( ! (GXutil.strcmp("", AV72Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_18_tfmetpiedffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieDfFa) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Expedicionesautomatizadas_webcontador_metrajepiezas_defectos_wcds_19_tfmetpiedffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieDfFa = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV34OrderedBy == 1 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfFa" ;
      }
      else if ( ( AV34OrderedBy == 1 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfFa DESC" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfLi" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfLi DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfID" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfID DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T2.TipDefDsc" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T2.TipDefDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfMi" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfMi DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MetTerCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod, T1.MetPieDfMa" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.MetTerCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieCod DESC, T1.MetPieDfMa DESC" ;
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
                  return conditional_P09AT2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09AT2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 9);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 10);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 10);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 9);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 10);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               return;
      }
   }

}

