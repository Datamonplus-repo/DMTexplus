package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta_trnwwexportcsv_impl extends GXWebProcedure
{
   public hojaderuta_trnwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV92Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV85BarCodIN = (int)(GXutil.lval( httpContext.GetPar( "BarCodIN"))) ;
            AV86BarCodreoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreoIN"))) ;
            AV87BarCodparIN = httpContext.GetPar( "BarCodparIN") ;
            AV88BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
            AV89BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
            AV90BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
            AV91BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
         }
      }
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
      AV11Filename = "./PrivateTempStorage/" + "HojadeRuta_TRNWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N° Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Creacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "St", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pzas.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "KIlos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "A?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Albaran?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV44TFCliCod) ,
                                           Integer.valueOf(AV45TFCliCod_To) ,
                                           AV47TFCliNom_Sel ,
                                           AV46TFCliNom ,
                                           AV65TFBarTipDis_Sel ,
                                           AV64TFBarTipDis ,
                                           AV49TFBarSer_Sel ,
                                           AV48TFBarSer ,
                                           AV51TFBarSerDsc_Sel ,
                                           AV50TFBarSerDsc ,
                                           AV53TFBarColNom_Sel ,
                                           AV52TFBarColNom ,
                                           Integer.valueOf(AV54TFBarColNum) ,
                                           Integer.valueOf(AV55TFBarColNum_To) ,
                                           AV67TFBarNomCli_Sel ,
                                           AV66TFBarNomCli ,
                                           Integer.valueOf(AV68TFBarNumCli) ,
                                           Integer.valueOf(AV69TFBarNumCli_To) ,
                                           AV71TFBarMaqCod_Sel ,
                                           AV70TFBarMaqCod ,
                                           AV74TFBarKgm ,
                                           AV75TFBarKgm_To ,
                                           AV76TFBarMtr ,
                                           AV77TFBarMtr_To ,
                                           AV79TFBarAcaQui_Sel ,
                                           AV78TFBarAcaQui ,
                                           AV84TFBarAgrEst_Sel ,
                                           AV83TFBarAgrEst ,
                                           AV88BarFecGenfrom ,
                                           AV89BarFecGento ,
                                           Byte.valueOf(AV90BarSitfrom) ,
                                           Byte.valueOf(AV91BarSitto) ,
                                           Integer.valueOf(AV85BarCodIN) ,
                                           Byte.valueOf(AV86BarCodreoIN) ,
                                           AV87BarCodparIN ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A2010BarTipDis ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A180BarMaqCod ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A118BarAcaQui ,
                                           A120BarAgrEst ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV37OrderedBy) ,
                                           Boolean.valueOf(AV28OrderedDsc) ,
                                           AV29FilterFullText ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           AV41TFPedidoCliente_Sel ,
                                           AV40TFPedidoCliente ,
                                           Integer.valueOf(AV72TFBarPie) ,
                                           Integer.valueOf(AV73TFBarPie_To) ,
                                           Byte.valueOf(AV95TFBarHayAlb_Sel) ,
                                           Byte.valueOf(A14502BarHayAlb) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      lV46TFCliNom = GXutil.padr( GXutil.rtrim( AV46TFCliNom), 30, "%") ;
      lV64TFBarTipDis = GXutil.padr( GXutil.rtrim( AV64TFBarTipDis), 1, "%") ;
      lV48TFBarSer = GXutil.padr( GXutil.rtrim( AV48TFBarSer), 16, "%") ;
      lV50TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV50TFBarSerDsc), 26, "%") ;
      lV52TFBarColNom = GXutil.padr( GXutil.rtrim( AV52TFBarColNom), 13, "%") ;
      lV66TFBarNomCli = GXutil.padr( GXutil.rtrim( AV66TFBarNomCli), 13, "%") ;
      lV70TFBarMaqCod = GXutil.padr( GXutil.rtrim( AV70TFBarMaqCod), 6, "%") ;
      lV78TFBarAcaQui = GXutil.padr( GXutil.rtrim( AV78TFBarAcaQui), 6, "%") ;
      lV83TFBarAgrEst = GXutil.padr( GXutil.rtrim( AV83TFBarAgrEst), 1, "%") ;
      /* Using cursor P09KH3 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV44TFCliCod), Integer.valueOf(AV45TFCliCod_To), lV46TFCliNom, AV47TFCliNom_Sel, lV64TFBarTipDis, AV65TFBarTipDis_Sel, lV48TFBarSer, AV49TFBarSer_Sel, lV50TFBarSerDsc, AV51TFBarSerDsc_Sel, lV52TFBarColNom, AV53TFBarColNom_Sel, Integer.valueOf(AV54TFBarColNum), Integer.valueOf(AV55TFBarColNum_To), lV66TFBarNomCli, AV67TFBarNomCli_Sel, Integer.valueOf(AV68TFBarNumCli), Integer.valueOf(AV69TFBarNumCli_To), lV70TFBarMaqCod, AV71TFBarMaqCod_Sel, AV74TFBarKgm, AV75TFBarKgm_To, AV76TFBarMtr, AV77TFBarMtr_To, lV78TFBarAcaQui, AV79TFBarAcaQui_Sel, lV83TFBarAgrEst, AV84TFBarAgrEst_Sel, AV88BarFecGenfrom, AV89BarFecGento, Byte.valueOf(AV90BarSitfrom), Byte.valueOf(AV91BarSitto), Integer.valueOf(AV85BarCodIN), Byte.valueOf(AV86BarCodreoIN), AV87BarCodparIN});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A159BarFecGen = P09KH3_A159BarFecGen[0] ;
         A120BarAgrEst = P09KH3_A120BarAgrEst[0] ;
         A118BarAcaQui = P09KH3_A118BarAcaQui[0] ;
         A180BarMaqCod = P09KH3_A180BarMaqCod[0] ;
         A213BarSit = P09KH3_A213BarSit[0] ;
         A1235BarNumCli = P09KH3_A1235BarNumCli[0] ;
         A1234BarNomCli = P09KH3_A1234BarNomCli[0] ;
         A136BarColNum = P09KH3_A136BarColNum[0] ;
         A135BarColNom = P09KH3_A135BarColNom[0] ;
         A1652BarSerDsc = P09KH3_A1652BarSerDsc[0] ;
         A212BarSer = P09KH3_A212BarSer[0] ;
         A2010BarTipDis = P09KH3_A2010BarTipDis[0] ;
         A13696BarNHdr = P09KH3_A13696BarNHdr[0] ;
         A279CliNom = P09KH3_A279CliNom[0] ;
         A252CliCod = P09KH3_A252CliCod[0] ;
         n252CliCod = P09KH3_n252CliCod[0] ;
         A184BarMtr = P09KH3_A184BarMtr[0] ;
         A166BarKgm = P09KH3_A166BarKgm[0] ;
         A143BarDisNum = P09KH3_A143BarDisNum[0] ;
         A4812BarEncCli = P09KH3_A4812BarEncCli[0] ;
         A199BarPie1 = P09KH3_A199BarPie1[0] ;
         A365DisDes = P09KH3_A365DisDes[0] ;
         A898BarPieNDes = P09KH3_A898BarPieNDes[0] ;
         A130BarCodPar = P09KH3_A130BarCodPar[0] ;
         A132BarCodReo = P09KH3_A132BarCodReo[0] ;
         A129BarCod = P09KH3_A129BarCod[0] ;
         A396EmprCod = P09KH3_A396EmprCod[0] ;
         A279CliNom = P09KH3_A279CliNom[0] ;
         A184BarMtr = P09KH3_A184BarMtr[0] ;
         A166BarKgm = P09KH3_A166BarKgm[0] ;
         A199BarPie1 = P09KH3_A199BarPie1[0] ;
         A898BarPieNDes = P09KH3_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         hojaderuta_trnwwexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
         hojaderuta_trnwwexportcsv_impl.this.A4812BarEncCli = GXv_char4[0] ;
         hojaderuta_trnwwexportcsv_impl.this.A143BarDisNum = GXv_char5[0] ;
         hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV41TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV40TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV40TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV41TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV41TFPedidoCliente_Sel) == 0 ) ) )
            {
               GXt_int7 = A14502BarHayAlb ;
               GXv_int8[0] = GXt_int7 ;
               new app.hayalbaransalida(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               hojaderuta_trnwwexportcsv_impl.this.GXt_int7 = GXv_int8[0] ;
               A14502BarHayAlb = GXt_int7 ;
               if ( ( AV95TFBarHayAlb_Sel != 1 ) || ( ( A14502BarHayAlb == 1 ) ) )
               {
                  if ( ( AV95TFBarHayAlb_Sel != 2 ) || ( ( A14502BarHayAlb == 0 ) ) )
                  {
                     if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                     {
                        A198BarPie = A898BarPieNDes ;
                     }
                     else
                     {
                        A198BarPie = A199BarPie1 ;
                     }
                     if ( (GXutil.strcmp("", AV29FilterFullText)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV29FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A2010BarTipDis) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV29FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1235BarNumCli, 6, 0) , GXutil.padr( "%" + AV29FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV29FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV29FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV29FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV29FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A118BarAcaQui) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV29FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( (0==AV72TFBarPie) || ( ( A198BarPie >= AV72TFBarPie ) ) )
                        {
                           if ( (0==AV73TFBarPie_To) || ( ( A198BarPie <= AV73TFBarPie_To ) ) )
                           {
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
                                 AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13878PedidoClie, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2010BarTipDis, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A1235BarNumCli, 6, 0) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A213BarSit, 2, 0) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A180BarMaqCod, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A198BarPie, 6, 0) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A166BarKgm, 9, 2) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A184BarMtr, 9, 2) ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A118BarAcaQui, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 GXt_char2 = AV14TextFileLine ;
                                 GXv_char6[0] = GXt_char2 ;
                                 new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A120BarAgrEst, ";", ","), GXv_char6) ;
                                 hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                 AV14TextFileLine += GXt_char2 ;
                              }
                              if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                              {
                                 AV14TextFileLine += ";" ;
                                 AV14TextFileLine += GXutil.str( A14502BarHayAlb, 1, 0) ;
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
                     }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=HojadeRuta_TRNWWExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNHdr", "", "N° Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarTipDis", "", "Tipo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFecGen", "", "Fecha Creacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSerDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNomCli", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNumCli", "", "Numero ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSit", "", "St", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarMaqCod", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarPie", "", "Pzas.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarKgm", "", "KIlos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarMtr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarAcaQui", "", "Acs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarAgrEst", "", "A?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarHayAlb", "", "Albaran?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char6[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta_TRNWWColumnsSelector", GXv_char6) ;
      hojaderuta_trnwwexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta_TRNWWGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("PedidosClienteSinDetalle.HojadeRuta_TRNWWGridState"), null, null);
      }
      AV37OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV28OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV99GXV1 = 1 ;
      while ( AV99GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV99GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV29FilterFullText = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV44TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV46TFCliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV47TFCliNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV40TFPedidoCliente = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV41TFPedidoCliente_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPDIS") == 0 )
         {
            AV64TFBarTipDis = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPDIS_SEL") == 0 )
         {
            AV65TFBarTipDis_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV48TFBarSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV49TFBarSer_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV50TFBarSerDsc = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV51TFBarSerDsc_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV52TFBarColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV53TFBarColNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV54TFBarColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFBarColNum_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV66TFBarNomCli = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV67TFBarNomCli_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV68TFBarNumCli = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFBarNumCli_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV70TFBarMaqCod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV71TFBarMaqCod_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV72TFBarPie = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFBarPie_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV74TFBarKgm = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV75TFBarKgm_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV76TFBarMtr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFBarMtr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI") == 0 )
         {
            AV78TFBarAcaQui = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACAQUI_SEL") == 0 )
         {
            AV79TFBarAcaQui_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV83TFBarAgrEst = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV84TFBarAgrEst_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARHAYALB_SEL") == 0 )
         {
            AV95TFBarHayAlb_Sel = (byte)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV99GXV1 = (int)(AV99GXV1+1) ;
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
      AV92Emprcod = "" ;
      AV87BarCodparIN = "" ;
      AV88BarFecGenfrom = GXutil.nullDate() ;
      AV89BarFecGento = GXutil.nullDate() ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      lV29FilterFullText = "" ;
      scmdbuf = "" ;
      lV46TFCliNom = "" ;
      lV64TFBarTipDis = "" ;
      lV48TFBarSer = "" ;
      lV50TFBarSerDsc = "" ;
      lV52TFBarColNom = "" ;
      lV66TFBarNomCli = "" ;
      lV70TFBarMaqCod = "" ;
      lV78TFBarAcaQui = "" ;
      lV83TFBarAgrEst = "" ;
      AV47TFCliNom_Sel = "" ;
      AV46TFCliNom = "" ;
      AV65TFBarTipDis_Sel = "" ;
      AV64TFBarTipDis = "" ;
      AV49TFBarSer_Sel = "" ;
      AV48TFBarSer = "" ;
      AV51TFBarSerDsc_Sel = "" ;
      AV50TFBarSerDsc = "" ;
      AV53TFBarColNom_Sel = "" ;
      AV52TFBarColNom = "" ;
      AV67TFBarNomCli_Sel = "" ;
      AV66TFBarNomCli = "" ;
      AV71TFBarMaqCod_Sel = "" ;
      AV70TFBarMaqCod = "" ;
      AV74TFBarKgm = DecimalUtil.ZERO ;
      AV75TFBarKgm_To = DecimalUtil.ZERO ;
      AV76TFBarMtr = DecimalUtil.ZERO ;
      AV77TFBarMtr_To = DecimalUtil.ZERO ;
      AV79TFBarAcaQui_Sel = "" ;
      AV78TFBarAcaQui = "" ;
      AV84TFBarAgrEst_Sel = "" ;
      AV83TFBarAgrEst = "" ;
      A279CliNom = "" ;
      A2010BarTipDis = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A180BarMaqCod = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A118BarAcaQui = "" ;
      A120BarAgrEst = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      AV29FilterFullText = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      AV41TFPedidoCliente_Sel = "" ;
      AV40TFPedidoCliente = "" ;
      P09KH3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P09KH3_A120BarAgrEst = new String[] {""} ;
      P09KH3_A118BarAcaQui = new String[] {""} ;
      P09KH3_A180BarMaqCod = new String[] {""} ;
      P09KH3_A213BarSit = new byte[1] ;
      P09KH3_A1235BarNumCli = new int[1] ;
      P09KH3_A1234BarNomCli = new String[] {""} ;
      P09KH3_A136BarColNum = new int[1] ;
      P09KH3_A135BarColNom = new String[] {""} ;
      P09KH3_A1652BarSerDsc = new String[] {""} ;
      P09KH3_A212BarSer = new String[] {""} ;
      P09KH3_A2010BarTipDis = new String[] {""} ;
      P09KH3_A13696BarNHdr = new String[] {""} ;
      P09KH3_A279CliNom = new String[] {""} ;
      P09KH3_A252CliCod = new int[1] ;
      P09KH3_n252CliCod = new boolean[] {false} ;
      P09KH3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KH3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09KH3_A143BarDisNum = new String[] {""} ;
      P09KH3_A4812BarEncCli = new String[] {""} ;
      P09KH3_A199BarPie1 = new short[1] ;
      P09KH3_A365DisDes = new String[] {""} ;
      P09KH3_A898BarPieNDes = new int[1] ;
      P09KH3_A130BarCodPar = new String[] {""} ;
      P09KH3_A132BarCodReo = new byte[1] ;
      P09KH3_A129BarCod = new int[1] ;
      P09KH3_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A365DisDes = "" ;
      A396EmprCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new byte[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta_trnwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09KH3_A159BarFecGen, P09KH3_A120BarAgrEst, P09KH3_A118BarAcaQui, P09KH3_A180BarMaqCod, P09KH3_A213BarSit, P09KH3_A1235BarNumCli, P09KH3_A1234BarNomCli, P09KH3_A136BarColNum, P09KH3_A135BarColNom, P09KH3_A1652BarSerDsc,
            P09KH3_A212BarSer, P09KH3_A2010BarTipDis, P09KH3_A13696BarNHdr, P09KH3_A279CliNom, P09KH3_A252CliCod, P09KH3_n252CliCod, P09KH3_A184BarMtr, P09KH3_A166BarKgm, P09KH3_A143BarDisNum, P09KH3_A4812BarEncCli,
            P09KH3_A199BarPie1, P09KH3_A365DisDes, P09KH3_A898BarPieNDes, P09KH3_A130BarCodPar, P09KH3_A132BarCodReo, P09KH3_A129BarCod, P09KH3_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV86BarCodreoIN ;
   private byte AV90BarSitfrom ;
   private byte AV91BarSitto ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte AV95TFBarHayAlb_Sel ;
   private byte A14502BarHayAlb ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private short gxcookieaux ;
   private short AV37OrderedBy ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV85BarCodIN ;
   private int AV13Random ;
   private int AV44TFCliCod ;
   private int AV45TFCliCod_To ;
   private int AV54TFBarColNum ;
   private int AV55TFBarColNum_To ;
   private int AV68TFBarNumCli ;
   private int AV69TFBarNumCli_To ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A129BarCod ;
   private int A198BarPie ;
   private int AV72TFBarPie ;
   private int AV73TFBarPie_To ;
   private int A898BarPieNDes ;
   private int AV99GXV1 ;
   private java.math.BigDecimal AV74TFBarKgm ;
   private java.math.BigDecimal AV75TFBarKgm_To ;
   private java.math.BigDecimal AV76TFBarMtr ;
   private java.math.BigDecimal AV77TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV92Emprcod ;
   private String AV87BarCodparIN ;
   private String scmdbuf ;
   private String lV46TFCliNom ;
   private String lV64TFBarTipDis ;
   private String lV48TFBarSer ;
   private String lV50TFBarSerDsc ;
   private String lV52TFBarColNom ;
   private String lV66TFBarNomCli ;
   private String lV70TFBarMaqCod ;
   private String lV78TFBarAcaQui ;
   private String lV83TFBarAgrEst ;
   private String AV47TFCliNom_Sel ;
   private String AV46TFCliNom ;
   private String AV65TFBarTipDis_Sel ;
   private String AV64TFBarTipDis ;
   private String AV49TFBarSer_Sel ;
   private String AV48TFBarSer ;
   private String AV51TFBarSerDsc_Sel ;
   private String AV50TFBarSerDsc ;
   private String AV53TFBarColNom_Sel ;
   private String AV52TFBarColNom ;
   private String AV67TFBarNomCli_Sel ;
   private String AV66TFBarNomCli ;
   private String AV71TFBarMaqCod_Sel ;
   private String AV70TFBarMaqCod ;
   private String AV79TFBarAcaQui_Sel ;
   private String AV78TFBarAcaQui ;
   private String AV84TFBarAgrEst_Sel ;
   private String AV83TFBarAgrEst ;
   private String A279CliNom ;
   private String A2010BarTipDis ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A180BarMaqCod ;
   private String A118BarAcaQui ;
   private String A120BarAgrEst ;
   private String A130BarCodPar ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String AV41TFPedidoCliente_Sel ;
   private String AV40TFPedidoCliente ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A365DisDes ;
   private String A396EmprCod ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private java.util.Date AV88BarFecGenfrom ;
   private java.util.Date AV89BarFecGento ;
   private java.util.Date A159BarFecGen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV28OrderedDsc ;
   private boolean n252CliCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String lV29FilterFullText ;
   private String AV29FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P09KH3_A159BarFecGen ;
   private String[] P09KH3_A120BarAgrEst ;
   private String[] P09KH3_A118BarAcaQui ;
   private String[] P09KH3_A180BarMaqCod ;
   private byte[] P09KH3_A213BarSit ;
   private int[] P09KH3_A1235BarNumCli ;
   private String[] P09KH3_A1234BarNomCli ;
   private int[] P09KH3_A136BarColNum ;
   private String[] P09KH3_A135BarColNom ;
   private String[] P09KH3_A1652BarSerDsc ;
   private String[] P09KH3_A212BarSer ;
   private String[] P09KH3_A2010BarTipDis ;
   private String[] P09KH3_A13696BarNHdr ;
   private String[] P09KH3_A279CliNom ;
   private int[] P09KH3_A252CliCod ;
   private boolean[] P09KH3_n252CliCod ;
   private java.math.BigDecimal[] P09KH3_A184BarMtr ;
   private java.math.BigDecimal[] P09KH3_A166BarKgm ;
   private String[] P09KH3_A143BarDisNum ;
   private String[] P09KH3_A4812BarEncCli ;
   private short[] P09KH3_A199BarPie1 ;
   private String[] P09KH3_A365DisDes ;
   private int[] P09KH3_A898BarPieNDes ;
   private String[] P09KH3_A130BarCodPar ;
   private byte[] P09KH3_A132BarCodReo ;
   private int[] P09KH3_A129BarCod ;
   private String[] P09KH3_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class hojaderuta_trnwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09KH3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV44TFCliCod ,
                                          int AV45TFCliCod_To ,
                                          String AV47TFCliNom_Sel ,
                                          String AV46TFCliNom ,
                                          String AV65TFBarTipDis_Sel ,
                                          String AV64TFBarTipDis ,
                                          String AV49TFBarSer_Sel ,
                                          String AV48TFBarSer ,
                                          String AV51TFBarSerDsc_Sel ,
                                          String AV50TFBarSerDsc ,
                                          String AV53TFBarColNom_Sel ,
                                          String AV52TFBarColNom ,
                                          int AV54TFBarColNum ,
                                          int AV55TFBarColNum_To ,
                                          String AV67TFBarNomCli_Sel ,
                                          String AV66TFBarNomCli ,
                                          int AV68TFBarNumCli ,
                                          int AV69TFBarNumCli_To ,
                                          String AV71TFBarMaqCod_Sel ,
                                          String AV70TFBarMaqCod ,
                                          java.math.BigDecimal AV74TFBarKgm ,
                                          java.math.BigDecimal AV75TFBarKgm_To ,
                                          java.math.BigDecimal AV76TFBarMtr ,
                                          java.math.BigDecimal AV77TFBarMtr_To ,
                                          String AV79TFBarAcaQui_Sel ,
                                          String AV78TFBarAcaQui ,
                                          String AV84TFBarAgrEst_Sel ,
                                          String AV83TFBarAgrEst ,
                                          java.util.Date AV88BarFecGenfrom ,
                                          java.util.Date AV89BarFecGento ,
                                          byte AV90BarSitfrom ,
                                          byte AV91BarSitto ,
                                          int AV85BarCodIN ,
                                          byte AV86BarCodreoIN ,
                                          String AV87BarCodparIN ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A2010BarTipDis ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A1235BarNumCli ,
                                          String A180BarMaqCod ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          String A118BarAcaQui ,
                                          String A120BarAgrEst ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV37OrderedBy ,
                                          boolean AV28OrderedDsc ,
                                          String AV29FilterFullText ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String AV41TFPedidoCliente_Sel ,
                                          String AV40TFPedidoCliente ,
                                          int AV72TFBarPie ,
                                          int AV73TFBarPie_To ,
                                          byte AV95TFBarHayAlb_Sel ,
                                          byte A14502BarHayAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[35];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT T1.BarFecGen, T1.BarAgrEst, T1.BarAcaQui, T1.BarMaqCod, T1.BarSit, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T1.BarTipDis," ;
      scmdbuf += " RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T2.CliNom, T1.CliCod," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes," ;
      scmdbuf += " 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM" ;
      scmdbuf += " TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      if ( ! (0==AV44TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (0==AV45TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV47TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV46TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV65TFBarTipDis_Sel)==0) && ( ! (GXutil.strcmp("", AV64TFBarTipDis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarTipDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65TFBarTipDis_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarTipDis = ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV49TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV48TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV49TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int11[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int11[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV53TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV52TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV53TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV54TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV66TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (0==AV68TFBarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (0==AV69TFBarNumCli_To) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71TFBarMaqCod_Sel)==0) && ( ! (GXutil.strcmp("", AV70TFBarMaqCod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71TFBarMaqCod_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int11[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int11[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79TFBarAcaQui_Sel)==0) && ( ! (GXutil.strcmp("", AV78TFBarAcaQui)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAcaQui) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79TFBarAcaQui_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAcaQui = ?)");
      }
      else
      {
         GXv_int11[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84TFBarAgrEst_Sel)==0) && ( ! (GXutil.strcmp("", AV83TFBarAgrEst)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84TFBarAgrEst_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int11[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int11[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int11[29] = (byte)(1) ;
      }
      if ( ! (0==AV90BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int11[30] = (byte)(1) ;
      }
      if ( ! (0==AV91BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int11[31] = (byte)(1) ;
      }
      if ( ! (0==AV85BarCodIN) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int11[32] = (byte)(1) ;
      }
      if ( ! (0==AV86BarCodreoIN) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int11[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87BarCodparIN)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int11[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV37OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV37OrderedBy == 2 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV37OrderedBy == 3 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV37OrderedBy == 4 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarNHdr DESC" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipDis" ;
      }
      else if ( ( AV37OrderedBy == 5 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipDis DESC" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV37OrderedBy == 6 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV37OrderedBy == 7 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV37OrderedBy == 8 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV37OrderedBy == 9 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV37OrderedBy == 10 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV37OrderedBy == 11 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumCli" ;
      }
      else if ( ( AV37OrderedBy == 12 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumCli DESC" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV37OrderedBy == 13 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV37OrderedBy == 14 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui" ;
      }
      else if ( ( AV37OrderedBy == 15 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAcaQui DESC" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ! AV28OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV37OrderedBy == 16 ) && ( AV28OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
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
                  return conditional_P09KH3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).shortValue() , ((Boolean) dynConstraints[55]).booleanValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).intValue() , ((Number) dynConstraints[64]).byteValue() , ((Number) dynConstraints[65]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09KH3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((String[]) buf[12])[0] = rslt.getString(13, 11);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 8);
               ((String[]) buf[19])[0] = rslt.getString(19, 20);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((String[]) buf[21])[0] = rslt.getString(21, 1);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(24);
               ((int[]) buf[25])[0] = rslt.getInt(25);
               ((String[]) buf[26])[0] = rslt.getString(26, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 6);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 6);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[63]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[64]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
      }
   }

}

