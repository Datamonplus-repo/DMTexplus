package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wchistoricorecetaslcontiexportcsv_impl extends GXWebProcedure
{
   public wchistoricorecetaslcontiexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCHistoricoRecetasLcontiExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCHistoricoRecetasLcontiColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCHistoricoRecetasLcontiColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs Tot", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts Tot", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Volumen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Ensayo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disp Cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Adi", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Costes I", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Costes Ad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste kg", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste mt", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV102Wchistoricorecetaslcontids_1_filterfulltext = AV52FilterFullText ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV102Wchistoricorecetaslcontids_1_filterfulltext ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           Short.valueOf(AV50OrderedBy) ,
                                           Boolean.valueOf(AV51OrderedDsc) ,
                                           A13759EstFecCier ,
                                           AV29Fec1 ,
                                           AV30Fec3 ,
                                           Integer.valueOf(AV31PCliCod) ,
                                           Integer.valueOf(AV32CliCodP) ,
                                           Integer.valueOf(AV33PBarCod) ,
                                           Integer.valueOf(AV34Barcodp) ,
                                           Byte.valueOf(AV35PBarCodReo) ,
                                           Byte.valueOf(AV36BarCodReoP) ,
                                           AV37PBarCodPar ,
                                           AV38BarCodParP ,
                                           AV39PSerie ,
                                           AV40SerieP ,
                                           AV41PColor ,
                                           AV42ColorP ,
                                           Integer.valueOf(AV43PColNum) ,
                                           Integer.valueOf(AV44ColNumP) ,
                                           AV45DispCli1 ,
                                           AV46DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV47HreRacab ,
                                           AV48MaqCodi ,
                                           AV49MaqCod3 ,
                                           AV28Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Wchistoricorecetaslcontids_1_filterfulltext), "%", "") ;
      /* Using cursor P08YH2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, AV29Fec1, AV30Fec3, Integer.valueOf(AV31PCliCod), Integer.valueOf(AV32CliCodP), Integer.valueOf(AV33PBarCod), Integer.valueOf(AV34Barcodp), Byte.valueOf(AV35PBarCodReo), Byte.valueOf(AV36BarCodReoP), AV37PBarCodPar, AV38BarCodParP, AV39PSerie, AV40SerieP, AV41PColor, AV42ColorP, Integer.valueOf(AV43PColNum), Integer.valueOf(AV44ColNumP), AV45DispCli1, AV46DispCli3, AV47HreRacab, AV47HreRacab, AV48MaqCodi, AV49MaqCod3, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext, lV102Wchistoricorecetaslcontids_1_filterfulltext});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6634BarRecAcb = P08YH2_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YH2_n6634BarRecAcb[0] ;
         A13759EstFecCier = P08YH2_A13759EstFecCier[0] ;
         A396EmprCod = P08YH2_A396EmprCod[0] ;
         A3650BarNumAna = P08YH2_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YH2_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YH2_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YH2_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YH2_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YH2_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YH2_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YH2_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YH2_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YH2_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YH2_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YH2_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YH2_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YH2_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YH2_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YH2_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YH2_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YH2_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YH2_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YH2_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YH2_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YH2_n1940BarColNoT[0] ;
         A1937BarDscTin = P08YH2_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YH2_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YH2_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YH2_n1936BarSerTin[0] ;
         A279CliNom = P08YH2_A279CliNom[0] ;
         A252CliCod = P08YH2_A252CliCod[0] ;
         A2316BarAgrLot = P08YH2_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YH2_n2316BarAgrLot[0] ;
         A1929EstTinNr = P08YH2_A1929EstTinNr[0] ;
         A3705BarCosCol = P08YH2_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YH2_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YH2_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YH2_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YH2_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YH2_n3654BarCosPD[0] ;
         A3706BarCosAnc = P08YH2_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YH2_n3706BarCosAnc[0] ;
         A3657BarCosAA = P08YH2_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YH2_n3657BarCosAA[0] ;
         A3656BarCosAD = P08YH2_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YH2_n3656BarCosAD[0] ;
         A1935BarParTin = P08YH2_A1935BarParTin[0] ;
         n1935BarParTin = P08YH2_n1935BarParTin[0] ;
         A1934BarReoTin = P08YH2_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YH2_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YH2_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YH2_n1933BarCodTin[0] ;
         A3646EstTinAny = P08YH2_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YH2_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YH2_A3648EstTinDia[0] ;
         A279CliNom = P08YH2_A279CliNom[0] ;
         A13841Barnhdr_lc = GXutil.str( A1933BarCodTin, 8, 0) + "-" + GXutil.str( A1934BarReoTin, 1, 0) + A1935BarParTin ;
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
            AV14TextFileLine += localUtil.dtoc( A13759EstFecCier, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1929EstTinNr, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13841Barnhdr_lc, ";", ","), GXv_char3) ;
            wchistoricorecetaslcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2316BarAgrLot, ";", ","), GXv_char3) ;
            wchistoricorecetaslcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            wchistoricorecetaslcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1936BarSerTin, ";", ","), GXv_char3) ;
            wchistoricorecetaslcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1937BarDscTin, ";", ","), GXv_char3) ;
            wchistoricorecetaslcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1940BarColNoT, ";", ","), GXv_char3) ;
            wchistoricorecetaslcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1941BarColNuT, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1942BarTipCoT, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1947BarKgmTin, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A8563BarKgsTt, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1948BarMtrTin, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A12993BarMtsTt, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1945BarMaqTin, ";", ","), GXv_char3) ;
            wchistoricorecetaslcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1946BarVolTin, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_int4 = AV53ForNumArc ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int5[0] = A252CliCod ;
            GXv_char6[0] = A1936BarSerTin ;
            GXv_char7[0] = A1940BarColNoT ;
            GXv_int8[0] = A1941BarColNuT ;
            GXv_int9[0] = A1942BarTipCoT ;
            GXv_int10[0] = GXt_int4 ;
            new app.pleoarc(remoteHandle, context).execute( GXv_char3, GXv_int5, GXv_char6, GXv_char7, GXv_int8, GXv_int9, GXv_int10) ;
            wchistoricorecetaslcontiexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
            wchistoricorecetaslcontiexportcsv_impl.this.A252CliCod = GXv_int5[0] ;
            wchistoricorecetaslcontiexportcsv_impl.this.A1936BarSerTin = GXv_char6[0] ;
            wchistoricorecetaslcontiexportcsv_impl.this.A1940BarColNoT = GXv_char7[0] ;
            wchistoricorecetaslcontiexportcsv_impl.this.A1941BarColNuT = GXv_int8[0] ;
            wchistoricorecetaslcontiexportcsv_impl.this.A1942BarTipCoT = GXv_int9[0] ;
            wchistoricorecetaslcontiexportcsv_impl.this.GXt_int4 = GXv_int10[0] ;
            AV53ForNumArc = GXt_int4 ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV53ForNumArc, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char7[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11762BarDispCli, ";", ","), GXv_char7) ;
            wchistoricorecetaslcontiexportcsv_impl.this.GXt_char2 = GXv_char7[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3650BarNumAna, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV54CostesI = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV54CostesI, 11, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV55CostesA = A3656BarCosAD.add(A3657BarCosAA).add(A3706BarCosAnc) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV55CostesA, 11, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV56CosteKg = ((A8563BarKgsTt.doubleValue()>0) ? (AV54CostesI.add(AV55CostesA)).divide(A8563BarKgsTt, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV56CosteKg, 11, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV57CosteMT = ((A1948BarMtrTin.doubleValue()>0) ? (AV54CostesI.add(AV55CostesA)).divide(A1948BarMtrTin, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV57CosteMT, 11, 5) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCHistoricoRecetasLcontiExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EstFecCier", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "EstTinNr", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "Barnhdr_lconti", "", "Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarAgrLot", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "CliCod", "", "Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarSerTin", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarDscTin", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarColNoT", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarColNuT", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarTipCoT", "", "Tc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarKgmTin", "", "Kgs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarKgsTt", "", "Kgs Tot", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarMtrTin", "", "Mts", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarMtsTt", "", "Mts Tot", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarMaqTin", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarVolTin", "", "Volumen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&ForNumArc", "", "Nº Ensayo", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarDispCli", "", "Disp Cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarNumAna", "", "Nº Adi", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&CostesI", "", "Costes I", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&CostesA", "", "Costes Ad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&CosteKg", "", "Coste kg", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "&CosteMT", "", "Coste mt", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char7[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCHistoricoRecetasLcontiColumnsSelector", GXv_char7) ;
      wchistoricorecetaslcontiexportcsv_impl.this.GXt_char2 = GXv_char7[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector11[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, GXv_SdtWWPColumnsSelector12) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector11[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WCHistoricoRecetasLcontiGridState"), "") == 0 )
      {
         AV59GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCHistoricoRecetasLcontiGridState"), null, null);
      }
      else
      {
         AV59GridState.fromxml(AV19Session.getValue("WCHistoricoRecetasLcontiGridState"), null, null);
      }
      AV50OrderedBy = AV59GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV51OrderedDsc = AV59GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV103GXV1 = 1 ;
      while ( AV103GXV1 <= AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV60GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV1));
         if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV52FilterFullText = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV29Fec1 = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC3") == 0 )
         {
            AV30Fec3 = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCLICOD") == 0 )
         {
            AV31PCliCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODP") == 0 )
         {
            AV32CliCodP = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCOD") == 0 )
         {
            AV33PBarCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODP") == 0 )
         {
            AV34Barcodp = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODREO") == 0 )
         {
            AV35PBarCodReo = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOP") == 0 )
         {
            AV36BarCodReoP = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODPAR") == 0 )
         {
            AV37PBarCodPar = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARP") == 0 )
         {
            AV38BarCodParP = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PSERIE") == 0 )
         {
            AV39PSerie = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SERIEP") == 0 )
         {
            AV40SerieP = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLOR") == 0 )
         {
            AV41PColor = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLORP") == 0 )
         {
            AV42ColorP = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLNUM") == 0 )
         {
            AV43PColNum = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLNUMP") == 0 )
         {
            AV44ColNumP = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI1") == 0 )
         {
            AV45DispCli1 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI3") == 0 )
         {
            AV46DispCli3 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV47HreRacab = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODI") == 0 )
         {
            AV48MaqCodi = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD3") == 0 )
         {
            AV49MaqCod3 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
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
      A13759EstFecCier = GXutil.nullDate() ;
      A13841Barnhdr_lc = "" ;
      A2316BarAgrLot = "" ;
      A279CliNom = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A1940BarColNoT = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      A1945BarMaqTin = "" ;
      A396EmprCod = "" ;
      A11762BarDispCli = "" ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      AV102Wchistoricorecetaslcontids_1_filterfulltext = "" ;
      AV52FilterFullText = "" ;
      scmdbuf = "" ;
      lV102Wchistoricorecetaslcontids_1_filterfulltext = "" ;
      A1935BarParTin = "" ;
      AV29Fec1 = GXutil.nullDate() ;
      AV30Fec3 = GXutil.nullDate() ;
      AV37PBarCodPar = "" ;
      AV38BarCodParP = "" ;
      AV39PSerie = "" ;
      AV40SerieP = "" ;
      AV41PColor = "" ;
      AV42ColorP = "" ;
      AV45DispCli1 = "" ;
      AV46DispCli3 = "" ;
      A6634BarRecAcb = "" ;
      AV47HreRacab = "" ;
      AV48MaqCodi = "" ;
      AV49MaqCod3 = "" ;
      AV28Emprcod = "" ;
      P08YH2_A6634BarRecAcb = new String[] {""} ;
      P08YH2_n6634BarRecAcb = new boolean[] {false} ;
      P08YH2_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YH2_A396EmprCod = new String[] {""} ;
      P08YH2_A3650BarNumAna = new short[1] ;
      P08YH2_n3650BarNumAna = new boolean[] {false} ;
      P08YH2_A11762BarDispCli = new String[] {""} ;
      P08YH2_n11762BarDispCli = new boolean[] {false} ;
      P08YH2_A1946BarVolTin = new int[1] ;
      P08YH2_n1946BarVolTin = new boolean[] {false} ;
      P08YH2_A1945BarMaqTin = new String[] {""} ;
      P08YH2_n1945BarMaqTin = new boolean[] {false} ;
      P08YH2_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YH2_n12993BarMtsTt = new boolean[] {false} ;
      P08YH2_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YH2_n1948BarMtrTin = new boolean[] {false} ;
      P08YH2_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YH2_n8563BarKgsTt = new boolean[] {false} ;
      P08YH2_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YH2_n1947BarKgmTin = new boolean[] {false} ;
      P08YH2_A1942BarTipCoT = new byte[1] ;
      P08YH2_n1942BarTipCoT = new boolean[] {false} ;
      P08YH2_A1941BarColNuT = new int[1] ;
      P08YH2_n1941BarColNuT = new boolean[] {false} ;
      P08YH2_A1940BarColNoT = new String[] {""} ;
      P08YH2_n1940BarColNoT = new boolean[] {false} ;
      P08YH2_A1937BarDscTin = new String[] {""} ;
      P08YH2_n1937BarDscTin = new boolean[] {false} ;
      P08YH2_A1936BarSerTin = new String[] {""} ;
      P08YH2_n1936BarSerTin = new boolean[] {false} ;
      P08YH2_A279CliNom = new String[] {""} ;
      P08YH2_A252CliCod = new int[1] ;
      P08YH2_A2316BarAgrLot = new String[] {""} ;
      P08YH2_n2316BarAgrLot = new boolean[] {false} ;
      P08YH2_A1929EstTinNr = new short[1] ;
      P08YH2_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YH2_n3705BarCosCol = new boolean[] {false} ;
      P08YH2_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YH2_n3658BarCosPA = new boolean[] {false} ;
      P08YH2_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YH2_n3654BarCosPD = new boolean[] {false} ;
      P08YH2_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YH2_n3706BarCosAnc = new boolean[] {false} ;
      P08YH2_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YH2_n3657BarCosAA = new boolean[] {false} ;
      P08YH2_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YH2_n3656BarCosAD = new boolean[] {false} ;
      P08YH2_A1935BarParTin = new String[] {""} ;
      P08YH2_n1935BarParTin = new boolean[] {false} ;
      P08YH2_A1934BarReoTin = new byte[1] ;
      P08YH2_n1934BarReoTin = new boolean[] {false} ;
      P08YH2_A1933BarCodTin = new int[1] ;
      P08YH2_n1933BarCodTin = new boolean[] {false} ;
      P08YH2_A3646EstTinAny = new short[1] ;
      P08YH2_A3647EstTinMes = new byte[1] ;
      P08YH2_A3648EstTinDia = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int10 = new int[1] ;
      AV54CostesI = DecimalUtil.ZERO ;
      AV55CostesA = DecimalUtil.ZERO ;
      AV56CosteKg = DecimalUtil.ZERO ;
      AV57CosteMT = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char7 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV59GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV60GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wchistoricorecetaslcontiexportcsv__default(),
         new Object[] {
             new Object[] {
            P08YH2_A6634BarRecAcb, P08YH2_n6634BarRecAcb, P08YH2_A13759EstFecCier, P08YH2_A396EmprCod, P08YH2_A3650BarNumAna, P08YH2_n3650BarNumAna, P08YH2_A11762BarDispCli, P08YH2_n11762BarDispCli, P08YH2_A1946BarVolTin, P08YH2_n1946BarVolTin,
            P08YH2_A1945BarMaqTin, P08YH2_n1945BarMaqTin, P08YH2_A12993BarMtsTt, P08YH2_n12993BarMtsTt, P08YH2_A1948BarMtrTin, P08YH2_n1948BarMtrTin, P08YH2_A8563BarKgsTt, P08YH2_n8563BarKgsTt, P08YH2_A1947BarKgmTin, P08YH2_n1947BarKgmTin,
            P08YH2_A1942BarTipCoT, P08YH2_n1942BarTipCoT, P08YH2_A1941BarColNuT, P08YH2_n1941BarColNuT, P08YH2_A1940BarColNoT, P08YH2_n1940BarColNoT, P08YH2_A1937BarDscTin, P08YH2_n1937BarDscTin, P08YH2_A1936BarSerTin, P08YH2_n1936BarSerTin,
            P08YH2_A279CliNom, P08YH2_A252CliCod, P08YH2_A2316BarAgrLot, P08YH2_n2316BarAgrLot, P08YH2_A1929EstTinNr, P08YH2_A3705BarCosCol, P08YH2_n3705BarCosCol, P08YH2_A3658BarCosPA, P08YH2_n3658BarCosPA, P08YH2_A3654BarCosPD,
            P08YH2_n3654BarCosPD, P08YH2_A3706BarCosAnc, P08YH2_n3706BarCosAnc, P08YH2_A3657BarCosAA, P08YH2_n3657BarCosAA, P08YH2_A3656BarCosAD, P08YH2_n3656BarCosAD, P08YH2_A1935BarParTin, P08YH2_n1935BarParTin, P08YH2_A1934BarReoTin,
            P08YH2_n1934BarReoTin, P08YH2_A1933BarCodTin, P08YH2_n1933BarCodTin, P08YH2_A3646EstTinAny, P08YH2_A3647EstTinMes, P08YH2_A3648EstTinDia
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1942BarTipCoT ;
   private byte A1934BarReoTin ;
   private byte AV35PBarCodReo ;
   private byte AV36BarCodReoP ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private byte GXv_int9[] ;
   private short gxcookieaux ;
   private short A1929EstTinNr ;
   private short A3650BarNumAna ;
   private short AV50OrderedBy ;
   private short A3646EstTinAny ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A1941BarColNuT ;
   private int A1946BarVolTin ;
   private int A1933BarCodTin ;
   private int AV31PCliCod ;
   private int AV32CliCodP ;
   private int AV33PBarCod ;
   private int AV34Barcodp ;
   private int AV43PColNum ;
   private int AV44ColNumP ;
   private int AV53ForNumArc ;
   private int GXt_int4 ;
   private int GXv_int5[] ;
   private int GXv_int8[] ;
   private int GXv_int10[] ;
   private int AV103GXV1 ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal AV54CostesI ;
   private java.math.BigDecimal AV55CostesA ;
   private java.math.BigDecimal AV56CosteKg ;
   private java.math.BigDecimal AV57CosteMT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13841Barnhdr_lc ;
   private String A2316BarAgrLot ;
   private String A279CliNom ;
   private String A1936BarSerTin ;
   private String A1937BarDscTin ;
   private String A1940BarColNoT ;
   private String A1945BarMaqTin ;
   private String A396EmprCod ;
   private String A11762BarDispCli ;
   private String scmdbuf ;
   private String A1935BarParTin ;
   private String AV37PBarCodPar ;
   private String AV38BarCodParP ;
   private String AV39PSerie ;
   private String AV40SerieP ;
   private String AV41PColor ;
   private String AV42ColorP ;
   private String AV45DispCli1 ;
   private String AV46DispCli3 ;
   private String A6634BarRecAcb ;
   private String AV47HreRacab ;
   private String AV48MaqCodi ;
   private String AV49MaqCod3 ;
   private String AV28Emprcod ;
   private String GXv_char3[] ;
   private String GXv_char6[] ;
   private String GXt_char2 ;
   private String GXv_char7[] ;
   private java.util.Date A13759EstFecCier ;
   private java.util.Date AV29Fec1 ;
   private java.util.Date AV30Fec3 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV51OrderedDsc ;
   private boolean n6634BarRecAcb ;
   private boolean n3650BarNumAna ;
   private boolean n11762BarDispCli ;
   private boolean n1946BarVolTin ;
   private boolean n1945BarMaqTin ;
   private boolean n12993BarMtsTt ;
   private boolean n1948BarMtrTin ;
   private boolean n8563BarKgsTt ;
   private boolean n1947BarKgmTin ;
   private boolean n1942BarTipCoT ;
   private boolean n1941BarColNuT ;
   private boolean n1940BarColNoT ;
   private boolean n1937BarDscTin ;
   private boolean n1936BarSerTin ;
   private boolean n2316BarAgrLot ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3654BarCosPD ;
   private boolean n3706BarCosAnc ;
   private boolean n3657BarCosAA ;
   private boolean n3656BarCosAD ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV102Wchistoricorecetaslcontids_1_filterfulltext ;
   private String AV52FilterFullText ;
   private String lV102Wchistoricorecetaslcontids_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08YH2_A6634BarRecAcb ;
   private boolean[] P08YH2_n6634BarRecAcb ;
   private java.util.Date[] P08YH2_A13759EstFecCier ;
   private String[] P08YH2_A396EmprCod ;
   private short[] P08YH2_A3650BarNumAna ;
   private boolean[] P08YH2_n3650BarNumAna ;
   private String[] P08YH2_A11762BarDispCli ;
   private boolean[] P08YH2_n11762BarDispCli ;
   private int[] P08YH2_A1946BarVolTin ;
   private boolean[] P08YH2_n1946BarVolTin ;
   private String[] P08YH2_A1945BarMaqTin ;
   private boolean[] P08YH2_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YH2_A12993BarMtsTt ;
   private boolean[] P08YH2_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YH2_A1948BarMtrTin ;
   private boolean[] P08YH2_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YH2_A8563BarKgsTt ;
   private boolean[] P08YH2_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YH2_A1947BarKgmTin ;
   private boolean[] P08YH2_n1947BarKgmTin ;
   private byte[] P08YH2_A1942BarTipCoT ;
   private boolean[] P08YH2_n1942BarTipCoT ;
   private int[] P08YH2_A1941BarColNuT ;
   private boolean[] P08YH2_n1941BarColNuT ;
   private String[] P08YH2_A1940BarColNoT ;
   private boolean[] P08YH2_n1940BarColNoT ;
   private String[] P08YH2_A1937BarDscTin ;
   private boolean[] P08YH2_n1937BarDscTin ;
   private String[] P08YH2_A1936BarSerTin ;
   private boolean[] P08YH2_n1936BarSerTin ;
   private String[] P08YH2_A279CliNom ;
   private int[] P08YH2_A252CliCod ;
   private String[] P08YH2_A2316BarAgrLot ;
   private boolean[] P08YH2_n2316BarAgrLot ;
   private short[] P08YH2_A1929EstTinNr ;
   private java.math.BigDecimal[] P08YH2_A3705BarCosCol ;
   private boolean[] P08YH2_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YH2_A3658BarCosPA ;
   private boolean[] P08YH2_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YH2_A3654BarCosPD ;
   private boolean[] P08YH2_n3654BarCosPD ;
   private java.math.BigDecimal[] P08YH2_A3706BarCosAnc ;
   private boolean[] P08YH2_n3706BarCosAnc ;
   private java.math.BigDecimal[] P08YH2_A3657BarCosAA ;
   private boolean[] P08YH2_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YH2_A3656BarCosAD ;
   private boolean[] P08YH2_n3656BarCosAD ;
   private String[] P08YH2_A1935BarParTin ;
   private boolean[] P08YH2_n1935BarParTin ;
   private byte[] P08YH2_A1934BarReoTin ;
   private boolean[] P08YH2_n1934BarReoTin ;
   private int[] P08YH2_A1933BarCodTin ;
   private boolean[] P08YH2_n1933BarCodTin ;
   private short[] P08YH2_A3646EstTinAny ;
   private byte[] P08YH2_A3647EstTinMes ;
   private byte[] P08YH2_A3648EstTinDia ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV59GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV60GridStateFilterValue ;
}

final  class wchistoricorecetaslcontiexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08YH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV102Wchistoricorecetaslcontids_1_filterfulltext ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          short AV50OrderedBy ,
                                          boolean AV51OrderedDsc ,
                                          java.util.Date A13759EstFecCier ,
                                          java.util.Date AV29Fec1 ,
                                          java.util.Date AV30Fec3 ,
                                          int AV31PCliCod ,
                                          int AV32CliCodP ,
                                          int AV33PBarCod ,
                                          int AV34Barcodp ,
                                          byte AV35PBarCodReo ,
                                          byte AV36BarCodReoP ,
                                          String AV37PBarCodPar ,
                                          String AV38BarCodParP ,
                                          String AV39PSerie ,
                                          String AV40SerieP ,
                                          String AV41PColor ,
                                          String AV42ColorP ,
                                          int AV43PColNum ,
                                          int AV44ColNumP ,
                                          String AV45DispCli1 ,
                                          String AV46DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV47HreRacab ,
                                          String AV48MaqCodi ,
                                          String AV49MaqCod3 ,
                                          String AV28Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[41];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.BarRecAcb, T1.EstFecCier, T1.EmprCod, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT," ;
      scmdbuf += " T1.BarColNuT, T1.BarColNoT, T1.BarDscTin, T1.BarSerTin, T2.CliNom, T1.CliCod, T1.BarAgrLot, T1.EstTinNr, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.BarCosAnc, T1.BarCosAA," ;
      scmdbuf += " T1.BarCosAD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.EstTinAny, T1.EstTinMes, T1.EstTinDia FROM (TXPLCONTI T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ? and T1.BarReoTin <= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ? and T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ? and T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ? and T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ? and T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      if ( ! (GXutil.strcmp("", AV102Wchistoricorecetaslcontids_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.EstTinNr,'9990'), 2) like '%' || ?) or ( UPPER(SUBSTR(TO_CHAR(T1.BarCodTin,'99999990'), 2) || '-' || SUBSTR(TO_CHAR(T1.BarReoTin,'90'), 2) || T1.BarParTin) like '%' || UPPER(?)) or ( UPPER(T1.BarAgrLot) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T2.CliNom) like '%' || UPPER(?)) or ( UPPER(T1.BarSerTin) like '%' || UPPER(?)) or ( UPPER(T1.BarDscTin) like '%' || UPPER(?)) or ( UPPER(T1.BarColNoT) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarColNuT,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarTipCoT,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgmTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarKgsTt,'9999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtrTin,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarMtsTt,'9999990.99'), 2) like '%' || ?) or ( UPPER(T1.BarMaqTin) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarVolTin,'99990'), 2) like '%' || ?) or ( UPPER(T1.BarDispCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarNumAna,'990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
         GXv_int13[24] = (byte)(1) ;
         GXv_int13[25] = (byte)(1) ;
         GXv_int13[26] = (byte)(1) ;
         GXv_int13[27] = (byte)(1) ;
         GXv_int13[28] = (byte)(1) ;
         GXv_int13[29] = (byte)(1) ;
         GXv_int13[30] = (byte)(1) ;
         GXv_int13[31] = (byte)(1) ;
         GXv_int13[32] = (byte)(1) ;
         GXv_int13[33] = (byte)(1) ;
         GXv_int13[34] = (byte)(1) ;
         GXv_int13[35] = (byte)(1) ;
         GXv_int13[36] = (byte)(1) ;
         GXv_int13[37] = (byte)(1) ;
         GXv_int13[38] = (byte)(1) ;
         GXv_int13[39] = (byte)(1) ;
         GXv_int13[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV50OrderedBy == 1 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstFecCier" ;
      }
      else if ( ( AV50OrderedBy == 1 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstFecCier DESC" ;
      }
      else if ( ( AV50OrderedBy == 2 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstTinNr" ;
      }
      else if ( ( AV50OrderedBy == 2 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstTinNr DESC" ;
      }
      else if ( ( AV50OrderedBy == 3 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrLot" ;
      }
      else if ( ( AV50OrderedBy == 3 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrLot DESC" ;
      }
      else if ( ( AV50OrderedBy == 4 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV50OrderedBy == 4 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV50OrderedBy == 5 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV50OrderedBy == 5 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV50OrderedBy == 6 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerTin" ;
      }
      else if ( ( AV50OrderedBy == 6 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 7 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarDscTin" ;
      }
      else if ( ( AV50OrderedBy == 7 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarDscTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 8 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNoT" ;
      }
      else if ( ( AV50OrderedBy == 8 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNoT DESC" ;
      }
      else if ( ( AV50OrderedBy == 9 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNuT" ;
      }
      else if ( ( AV50OrderedBy == 9 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNuT DESC" ;
      }
      else if ( ( AV50OrderedBy == 10 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipCoT" ;
      }
      else if ( ( AV50OrderedBy == 10 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipCoT DESC" ;
      }
      else if ( ( AV50OrderedBy == 11 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarKgmTin" ;
      }
      else if ( ( AV50OrderedBy == 11 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarKgmTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 12 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarKgsTt" ;
      }
      else if ( ( AV50OrderedBy == 12 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarKgsTt DESC" ;
      }
      else if ( ( AV50OrderedBy == 13 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMtrTin" ;
      }
      else if ( ( AV50OrderedBy == 13 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMtrTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 14 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMtsTt" ;
      }
      else if ( ( AV50OrderedBy == 14 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMtsTt DESC" ;
      }
      else if ( ( AV50OrderedBy == 15 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqTin" ;
      }
      else if ( ( AV50OrderedBy == 15 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 16 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarVolTin" ;
      }
      else if ( ( AV50OrderedBy == 16 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarVolTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 17 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarDispCli" ;
      }
      else if ( ( AV50OrderedBy == 17 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarDispCli DESC" ;
      }
      else if ( ( AV50OrderedBy == 18 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumAna" ;
      }
      else if ( ( AV50OrderedBy == 18 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumAna DESC" ;
      }
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
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
                  return conditional_P08YH2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08YH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((int[]) buf[22])[0] = rslt.getInt(13);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((int[]) buf[31])[0] = rslt.getInt(18);
               ((String[]) buf[32])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(28);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((int[]) buf[51])[0] = rslt.getInt(29);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(30);
               ((byte[]) buf[54])[0] = rslt.getByte(31);
               ((byte[]) buf[55])[0] = rslt.getByte(32);
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[42]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 6);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 6);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[75], 100);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[77], 100);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[78], 100);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[79], 100);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[80], 100);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[81], 100);
               }
               return;
      }
   }

}

