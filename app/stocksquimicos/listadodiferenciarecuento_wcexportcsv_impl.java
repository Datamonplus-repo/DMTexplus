package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodiferenciarecuento_wcexportcsv_impl extends GXWebProcedure
{
   public listadodiferenciarecuento_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ListadoDiferenciaRecuento_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha/Hora", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencias", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencias", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Diferencia Inventario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "% Desvio Inventário", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Valor", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = AV30FilterFullText ;
      AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = AV36TFRecFec ;
      AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = AV38TFRechora ;
      AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = AV40TFPrdNum ;
      AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = AV42TFPrdNom ;
      AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = AV43TFPrdNom_Sel ;
      AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = AV44TFRecExiTeo ;
      AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = AV45TFRecExiTeo_To ;
      AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = AV46TFRecExiRea ;
      AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = AV47TFRecExiRea_To ;
      AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = AV53TFRecPreRec ;
      AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = AV54TFRecPreRec_To ;
      AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = AV55TFDifAlmacen ;
      AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = AV56TFDifAlmacen_To ;
      AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = AV58TFDifAlmPor ;
      AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = AV59TFDifAlmPor_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                           AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                           AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                           AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                           AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                           AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                           AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                           AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                           AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                           AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                           AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                           AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                           AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                           AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                           AV49recfec ,
                                           AV50prdnumfrom ,
                                           AV51prdnumto ,
                                           A810RecFec ,
                                           A13455Rechora ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A807RecExiRea ,
                                           A6573RecPreRec ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                           A14034DifAlmacen ,
                                           A14377DifAlmPor ,
                                           AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                           AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                           AV52desvios ,
                                           AV48emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum), 6, "%") ;
      lV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = GXutil.padr( GXutil.rtrim( AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom), 26, "%") ;
      /* Using cursor P09IX2 */
      pr_default.execute(0, new Object[] {AV48emprcod, AV52desvios, AV52desvios, AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec, AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora, lV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum, AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel, lV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom, AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel, AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo, AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to, AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea, AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to, AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec, AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to, AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen, AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to, AV49recfec, AV50prdnumfrom, AV51prdnumto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09IX2_A396EmprCod[0] ;
         A14034DifAlmacen = P09IX2_A14034DifAlmacen[0] ;
         A6573RecPreRec = P09IX2_A6573RecPreRec[0] ;
         A718PrdNom = P09IX2_A718PrdNom[0] ;
         A719PrdNum = P09IX2_A719PrdNum[0] ;
         A13455Rechora = P09IX2_A13455Rechora[0] ;
         A810RecFec = P09IX2_A810RecFec[0] ;
         A807RecExiRea = P09IX2_A807RecExiRea[0] ;
         A809RecExiTeo = P09IX2_A809RecExiTeo[0] ;
         A718PrdNom = P09IX2_A718PrdNom[0] ;
         GXt_decimal2 = A14377DifAlmPor ;
         GXv_decimal3[0] = GXt_decimal2 ;
         new app.stocksquimicos.calculosdiferenciasrecuento(remoteHandle, context).execute( A809RecExiTeo, A807RecExiRea, GXv_decimal3) ;
         listadodiferenciarecuento_wcexportcsv_impl.this.GXt_decimal2 = GXv_decimal3[0] ;
         A14377DifAlmPor = GXt_decimal2 ;
         if ( (GXutil.strcmp("", AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A809RecExiTeo, 12, 4) , GXutil.padr( "%" + AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A807RecExiRea, 12, 4) , GXutil.padr( "%" + AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6573RecPreRec, 14, 5) , GXutil.padr( "%" + AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14034DifAlmacen, 12, 4) , GXutil.padr( "%" + AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A14377DifAlmPor, 7, 2) , GXutil.padr( "%" + AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to)==0) || ( ( DecimalUtil.compareTo(A14377DifAlmPor, AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to) <= 0 ) ) )
               {
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
                     AV14TextFileLine += localUtil.dtoc( A810RecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += localUtil.ttoc( A13455Rechora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char4 = AV14TextFileLine ;
                     GXv_char5[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char5) ;
                     listadodiferenciarecuento_wcexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
                     AV14TextFileLine += GXt_char4 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char4 = AV14TextFileLine ;
                     GXv_char5[0] = GXt_char4 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char5) ;
                     listadodiferenciarecuento_wcexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
                     AV14TextFileLine += GXt_char4 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A809RecExiTeo, 12, 4) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A807RecExiRea, 12, 4) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A6573RecPreRec, 14, 5) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV32ValorActual = GXutil.roundDecimal( (A807RecExiRea.multiply(A6573RecPreRec)), 2) ;
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( AV32ValorActual, 11, 2) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A14034DifAlmacen, 12, 4) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A14377DifAlmPor, 7, 2) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV57DesvioMon = (A14034DifAlmacen.multiply(A6573RecPreRec)) ;
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( AV57DesvioMon, 7, 2) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ListadoDiferenciaRecuento_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "Rechora", "", "Fecha/Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecExiTeo", "Teorico", "Existencias", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecExiRea", "Real", "Existencias", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "RecPreRec", "", "Precio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&ValorActual", "Real", "Valor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DifAlmacen", "", "Diferencia Inventario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DifAlmPor", "", "% Desvio Inventário", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "&DesvioMon", "", "Valor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char4 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char4 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadoDiferenciaRecuento_WCColumnsSelector", GXv_char5) ;
      listadodiferenciarecuento_wcexportcsv_impl.this.GXt_char4 = GXv_char5[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.ListadoDiferenciaRecuento_WCGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV19Session.getValue("StocksQuimicos.ListadoDiferenciaRecuento_WCGridState"), null, null);
      }
      AV28OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV80GXV1 = 1 ;
      while ( AV80GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV80GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFEC") == 0 )
         {
            AV36TFRecFec = localUtil.ctod( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECHORA") == 0 )
         {
            AV38TFRechora = localUtil.ctot( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV40TFPrdNum = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV41TFPrdNum_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV42TFPrdNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV43TFPrdNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV44TFRecExiTeo = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV45TFRecExiTeo_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXIREA") == 0 )
         {
            AV46TFRecExiRea = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV47TFRecExiRea_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPREREC") == 0 )
         {
            AV53TFRecPreRec = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV54TFRecPreRec_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFALMACEN") == 0 )
         {
            AV55TFDifAlmacen = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFDifAlmacen_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDIFALMPOR") == 0 )
         {
            AV58TFDifAlmPor = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFDifAlmPor_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV48emprcod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECFEC") == 0 )
         {
            AV49recfec = localUtil.ctod( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMFROM") == 0 )
         {
            AV50prdnumfrom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMTO") == 0 )
         {
            AV51prdnumto = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DESVIOS") == 0 )
         {
            AV52desvios = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV80GXV1 = (int)(AV80GXV1+1) ;
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
      A810RecFec = GXutil.nullDate() ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A6573RecPreRec = DecimalUtil.ZERO ;
      A14034DifAlmacen = DecimalUtil.ZERO ;
      A14377DifAlmPor = DecimalUtil.ZERO ;
      AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec = GXutil.nullDate() ;
      AV36TFRecFec = GXutil.nullDate() ;
      AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora = GXutil.resetTime( GXutil.nullDate() );
      AV38TFRechora = GXutil.resetTime( GXutil.nullDate() );
      AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = "" ;
      AV40TFPrdNum = "" ;
      AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel = "" ;
      AV41TFPrdNum_Sel = "" ;
      AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = "" ;
      AV42TFPrdNom = "" ;
      AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel = "" ;
      AV43TFPrdNom_Sel = "" ;
      AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo = DecimalUtil.ZERO ;
      AV44TFRecExiTeo = DecimalUtil.ZERO ;
      AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV45TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea = DecimalUtil.ZERO ;
      AV46TFRecExiRea = DecimalUtil.ZERO ;
      AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to = DecimalUtil.ZERO ;
      AV47TFRecExiRea_To = DecimalUtil.ZERO ;
      AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec = DecimalUtil.ZERO ;
      AV53TFRecPreRec = DecimalUtil.ZERO ;
      AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to = DecimalUtil.ZERO ;
      AV54TFRecPreRec_To = DecimalUtil.ZERO ;
      AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen = DecimalUtil.ZERO ;
      AV55TFDifAlmacen = DecimalUtil.ZERO ;
      AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to = DecimalUtil.ZERO ;
      AV56TFDifAlmacen_To = DecimalUtil.ZERO ;
      AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor = DecimalUtil.ZERO ;
      AV58TFDifAlmPor = DecimalUtil.ZERO ;
      AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to = DecimalUtil.ZERO ;
      AV59TFDifAlmPor_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum = "" ;
      lV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom = "" ;
      AV49recfec = GXutil.nullDate() ;
      AV50prdnumfrom = "" ;
      AV51prdnumto = "" ;
      AV52desvios = "" ;
      AV48emprcod = "" ;
      A396EmprCod = "" ;
      P09IX2_A396EmprCod = new String[] {""} ;
      P09IX2_A14034DifAlmacen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IX2_A6573RecPreRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IX2_A718PrdNom = new String[] {""} ;
      P09IX2_A719PrdNum = new String[] {""} ;
      P09IX2_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      P09IX2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09IX2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09IX2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      GXt_decimal2 = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      AV32ValorActual = DecimalUtil.ZERO ;
      AV57DesvioMon = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char4 = "" ;
      GXv_char5 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodiferenciarecuento_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09IX2_A396EmprCod, P09IX2_A14034DifAlmacen, P09IX2_A6573RecPreRec, P09IX2_A718PrdNom, P09IX2_A719PrdNum, P09IX2_A13455Rechora, P09IX2_A810RecFec, P09IX2_A807RecExiRea, P09IX2_A809RecExiTeo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV80GXV1 ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A6573RecPreRec ;
   private java.math.BigDecimal A14034DifAlmacen ;
   private java.math.BigDecimal A14377DifAlmPor ;
   private java.math.BigDecimal AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ;
   private java.math.BigDecimal AV44TFRecExiTeo ;
   private java.math.BigDecimal AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ;
   private java.math.BigDecimal AV45TFRecExiTeo_To ;
   private java.math.BigDecimal AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ;
   private java.math.BigDecimal AV46TFRecExiRea ;
   private java.math.BigDecimal AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ;
   private java.math.BigDecimal AV47TFRecExiRea_To ;
   private java.math.BigDecimal AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ;
   private java.math.BigDecimal AV53TFRecPreRec ;
   private java.math.BigDecimal AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ;
   private java.math.BigDecimal AV54TFRecPreRec_To ;
   private java.math.BigDecimal AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ;
   private java.math.BigDecimal AV55TFDifAlmacen ;
   private java.math.BigDecimal AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ;
   private java.math.BigDecimal AV56TFDifAlmacen_To ;
   private java.math.BigDecimal AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ;
   private java.math.BigDecimal AV58TFDifAlmPor ;
   private java.math.BigDecimal AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ;
   private java.math.BigDecimal AV59TFDifAlmPor_To ;
   private java.math.BigDecimal GXt_decimal2 ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal AV32ValorActual ;
   private java.math.BigDecimal AV57DesvioMon ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ;
   private String AV40TFPrdNum ;
   private String AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ;
   private String AV41TFPrdNum_Sel ;
   private String AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ;
   private String AV42TFPrdNom ;
   private String AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ;
   private String AV43TFPrdNom_Sel ;
   private String scmdbuf ;
   private String lV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ;
   private String lV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ;
   private String AV50prdnumfrom ;
   private String AV51prdnumto ;
   private String AV52desvios ;
   private String AV48emprcod ;
   private String A396EmprCod ;
   private String GXt_char4 ;
   private String GXv_char5[] ;
   private java.util.Date A13455Rechora ;
   private java.util.Date AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ;
   private java.util.Date AV38TFRechora ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ;
   private java.util.Date AV36TFRecFec ;
   private java.util.Date AV49recfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09IX2_A396EmprCod ;
   private java.math.BigDecimal[] P09IX2_A14034DifAlmacen ;
   private java.math.BigDecimal[] P09IX2_A6573RecPreRec ;
   private String[] P09IX2_A718PrdNom ;
   private String[] P09IX2_A719PrdNum ;
   private java.util.Date[] P09IX2_A13455Rechora ;
   private java.util.Date[] P09IX2_A810RecFec ;
   private java.math.BigDecimal[] P09IX2_A807RecExiRea ;
   private java.math.BigDecimal[] P09IX2_A809RecExiTeo ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodiferenciarecuento_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09IX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec ,
                                          java.util.Date AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora ,
                                          String AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel ,
                                          String AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum ,
                                          String AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel ,
                                          String AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom ,
                                          java.math.BigDecimal AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo ,
                                          java.math.BigDecimal AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to ,
                                          java.math.BigDecimal AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea ,
                                          java.math.BigDecimal AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to ,
                                          java.math.BigDecimal AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec ,
                                          java.math.BigDecimal AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to ,
                                          java.math.BigDecimal AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen ,
                                          java.math.BigDecimal AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to ,
                                          java.util.Date AV49recfec ,
                                          String AV50prdnumfrom ,
                                          String AV51prdnumto ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date A13455Rechora ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A807RecExiRea ,
                                          java.math.BigDecimal A6573RecPreRec ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV63Stocksquimicos_listadodiferenciarecuento_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A14034DifAlmacen ,
                                          java.math.BigDecimal A14377DifAlmPor ,
                                          java.math.BigDecimal AV78Stocksquimicos_listadodiferenciarecuento_wcds_16_tfdifalmpor ,
                                          java.math.BigDecimal AV79Stocksquimicos_listadodiferenciarecuento_wcds_17_tfdifalmpor_to ,
                                          String AV52desvios ,
                                          String AV48emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[20];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, ( T1.RecExiTeo - T1.RecExiRea) AS DifAlmacen, T1.RecPreRec, T2.PrdNom, T1.PrdNum, T1.Rechora, T1.RecFec, T1.RecExiRea, T1.RecExiTeo FROM (TXPRECUEN" ;
      scmdbuf += " T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(( ( T1.RecExiTeo - T1.RecExiRea) <> 0 and ? = 'S') or ? = 'N')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV64Stocksquimicos_listadodiferenciarecuento_wcds_2_tfrecfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec >= ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV65Stocksquimicos_listadodiferenciarecuento_wcds_3_tfrechora) )
      {
         addWhere(sWhereString, "(T1.Rechora >= ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV66Stocksquimicos_listadodiferenciarecuento_wcds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Stocksquimicos_listadodiferenciarecuento_wcds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV68Stocksquimicos_listadodiferenciarecuento_wcds_6_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69Stocksquimicos_listadodiferenciarecuento_wcds_7_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV70Stocksquimicos_listadodiferenciarecuento_wcds_8_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Stocksquimicos_listadodiferenciarecuento_wcds_9_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Stocksquimicos_listadodiferenciarecuento_wcds_10_tfrecexirea)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Stocksquimicos_listadodiferenciarecuento_wcds_11_tfrecexirea_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiRea <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Stocksquimicos_listadodiferenciarecuento_wcds_12_tfrecprerec)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec >= ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Stocksquimicos_listadodiferenciarecuento_wcds_13_tfrecprerec_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecPreRec <= ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Stocksquimicos_listadodiferenciarecuento_wcds_14_tfdifalmacen)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) >= ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Stocksquimicos_listadodiferenciarecuento_wcds_15_tfdifalmacen_to)==0) )
      {
         addWhere(sWhereString, "(( T1.RecExiTeo - T1.RecExiRea) <= ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49recfec)) )
      {
         addWhere(sWhereString, "(T1.RecFec = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50prdnumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51prdnumto)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecFec" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Rechora" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Rechora DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiRea" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiRea DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecPreRec" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecPreRec DESC" ;
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
                  return conditional_P09IX2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09IX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[24], false);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 6);
               }
               return;
      }
   }

}

