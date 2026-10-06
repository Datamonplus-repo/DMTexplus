package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class hojaderuta___wwexportcsv_impl extends GXWebProcedure
{
   public hojaderuta___wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
         AV39Emprcod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV45BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            AV46BarCodreo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreo"))) ;
            AV47BarCodpar = httpContext.GetPar( "BarCodpar") ;
            AV47BarCodpar = httpContext.GetPar( "BarCodpar") ;
            AV40CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            AV41BarFecGenfrom = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenfrom")) ;
            AV42BarFecGento = localUtil.parseDateParm( httpContext.GetPar( "BarFecGento")) ;
            AV43BarSitfrom = (byte)(GXutil.lval( httpContext.GetPar( "BarSitfrom"))) ;
            AV44BarSitto = (byte)(GXutil.lval( httpContext.GetPar( "BarSitto"))) ;
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
      AV11Filename = "./PrivateTempStorage/" + "HojadeRuta___WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.HojadeRuta___WWColumnsSelector"), "") != 0 )
      {
         AV53ColumnsSelectorXML = AV19Session.getValue("PedidosClienteSinDetalle.HojadeRuta___WWColumnsSelector") ;
         AV50ColumnsSelector.fromxml(AV53ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N° Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Creacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "St", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "A?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rct?", "") : "") ;
      AV14TextFileLine += ";" + httpContext.getMessage( "Albaran", "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = AV18FilterFullText ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = AV23TFCliNom ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = AV24TFCliNom_Sel ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = AV25TFPedidoCliente ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = AV26TFPedidoCliente_Sel ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = AV27TFBarSer ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = AV28TFBarSer_Sel ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = AV29TFBarSerDsc ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = AV30TFBarSerDsc_Sel ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = AV31TFBarColNom ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = AV32TFBarColNom_Sel ;
      AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum = AV33TFBarColNum ;
      AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to = AV34TFBarColNum_To ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = AV35TFBarMaqCod ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = AV36TFBarMaqCod_Sel ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = AV37TFBarAgrEst ;
      AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = AV38TFBarAgrEst_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                           AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                           AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                           AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                           AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                           AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                           AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                           AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                           Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) ,
                                           AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                           AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                           AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                           AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                           Integer.valueOf(AV40CliCod) ,
                                           AV41BarFecGenfrom ,
                                           AV42BarFecGento ,
                                           Byte.valueOf(AV43BarSitfrom) ,
                                           Byte.valueOf(AV44BarSitto) ,
                                           Integer.valueOf(AV45BarCod) ,
                                           Byte.valueOf(AV46BarCodreo) ,
                                           AV47BarCodpar ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A180BarMaqCod ,
                                           A120BarAgrEst ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV16OrderedBy) ,
                                           Boolean.valueOf(AV17OrderedDsc) ,
                                           AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                           AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                           AV39Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = GXutil.padr( GXutil.rtrim( AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom), 30, "%") ;
      lV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser), 16, "%") ;
      lV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc), 26, "%") ;
      lV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom), 13, "%") ;
      lV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod), 6, "%") ;
      lV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest), 1, "%") ;
      /* Using cursor P0ARW2 */
      pr_default.execute(0, new Object[] {AV39Emprcod, lV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom, AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel, lV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser, AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel, lV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc, AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel, lV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom, AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel, Integer.valueOf(AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum), Integer.valueOf(AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to), lV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod, AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel, lV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest, AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel, Integer.valueOf(AV40CliCod), AV41BarFecGenfrom, AV42BarFecGento, Byte.valueOf(AV43BarSitfrom), Byte.valueOf(AV44BarSitto), Integer.valueOf(AV45BarCod), Byte.valueOf(AV46BarCodreo), AV47BarCodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A159BarFecGen = P0ARW2_A159BarFecGen[0] ;
         A213BarSit = P0ARW2_A213BarSit[0] ;
         A13696BarNHdr = P0ARW2_A13696BarNHdr[0] ;
         A252CliCod = P0ARW2_A252CliCod[0] ;
         n252CliCod = P0ARW2_n252CliCod[0] ;
         A120BarAgrEst = P0ARW2_A120BarAgrEst[0] ;
         A180BarMaqCod = P0ARW2_A180BarMaqCod[0] ;
         A136BarColNum = P0ARW2_A136BarColNum[0] ;
         A135BarColNom = P0ARW2_A135BarColNom[0] ;
         A1652BarSerDsc = P0ARW2_A1652BarSerDsc[0] ;
         A212BarSer = P0ARW2_A212BarSer[0] ;
         A279CliNom = P0ARW2_A279CliNom[0] ;
         A130BarCodPar = P0ARW2_A130BarCodPar[0] ;
         A132BarCodReo = P0ARW2_A132BarCodReo[0] ;
         A129BarCod = P0ARW2_A129BarCod[0] ;
         A143BarDisNum = P0ARW2_A143BarDisNum[0] ;
         A4812BarEncCli = P0ARW2_A4812BarEncCli[0] ;
         A396EmprCod = P0ARW2_A396EmprCod[0] ;
         A279CliNom = P0ARW2_A279CliNom[0] ;
         GXt_int2 = A13930BarAlbUlti ;
         GXv_int3[0] = GXt_int2 ;
         new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int3) ;
         hojaderuta___wwexportcsv_impl.this.GXt_int2 = GXv_int3[0] ;
         A13930BarAlbUlti = GXt_int2 ;
         GXt_int4 = A13710HayRec ;
         GXv_int5[0] = GXt_int4 ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
         hojaderuta___wwexportcsv_impl.this.GXt_int4 = GXv_int5[0] ;
         A13710HayRec = GXt_int4 ;
         GXt_char6 = A13878PedidoClie ;
         GXv_char7[0] = A396EmprCod ;
         GXv_char8[0] = A4812BarEncCli ;
         GXv_char9[0] = A143BarDisNum ;
         GXv_char10[0] = GXt_char6 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char7, GXv_char8, GXv_char9, GXv_char10) ;
         hojaderuta___wwexportcsv_impl.this.A396EmprCod = GXv_char7[0] ;
         hojaderuta___wwexportcsv_impl.this.A4812BarEncCli = GXv_char8[0] ;
         hojaderuta___wwexportcsv_impl.this.A143BarDisNum = GXv_char9[0] ;
         hojaderuta___wwexportcsv_impl.this.GXt_char6 = GXv_char10[0] ;
         A13878PedidoClie = GXt_char6 ;
         if ( (GXutil.strcmp("", AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A120BarAgrEst) , GXutil.padr( "%" + GXutil.upper( AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( ! ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel) == 0 ) ) )
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
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char6 = AV14TextFileLine ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char10) ;
                     hojaderuta___wwexportcsv_impl.this.GXt_char6 = GXv_char10[0] ;
                     AV14TextFileLine += GXt_char6 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char6 = AV14TextFileLine ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13878PedidoClie, ";", ","), GXv_char10) ;
                     hojaderuta___wwexportcsv_impl.this.GXt_char6 = GXv_char10[0] ;
                     AV14TextFileLine += GXt_char6 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char6 = AV14TextFileLine ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char10) ;
                     hojaderuta___wwexportcsv_impl.this.GXt_char6 = GXv_char10[0] ;
                     AV14TextFileLine += GXt_char6 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char6 = AV14TextFileLine ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char10) ;
                     hojaderuta___wwexportcsv_impl.this.GXt_char6 = GXv_char10[0] ;
                     AV14TextFileLine += GXt_char6 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char6 = AV14TextFileLine ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char10) ;
                     hojaderuta___wwexportcsv_impl.this.GXt_char6 = GXv_char10[0] ;
                     AV14TextFileLine += GXt_char6 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char6 = AV14TextFileLine ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char10) ;
                     hojaderuta___wwexportcsv_impl.this.GXt_char6 = GXv_char10[0] ;
                     AV14TextFileLine += GXt_char6 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A213BarSit, 2, 0) ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char6 = AV14TextFileLine ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A180BarMaqCod, ";", ","), GXv_char10) ;
                     hojaderuta___wwexportcsv_impl.this.GXt_char6 = GXv_char10[0] ;
                     AV14TextFileLine += GXt_char6 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     GXt_char6 = AV14TextFileLine ;
                     GXv_char10[0] = GXt_char6 ;
                     new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A120BarAgrEst, ";", ","), GXv_char10) ;
                     hojaderuta___wwexportcsv_impl.this.GXt_char6 = GXv_char10[0] ;
                     AV14TextFileLine += GXt_char6 ;
                  }
                  if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV50ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                  {
                     AV14TextFileLine += ";" ;
                     AV14TextFileLine += GXutil.str( A13710HayRec, 1, 0) ;
                  }
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A13930BarAlbUlti, 10, 0) ;
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
            AV15HttpResponse.addHeader("Content-Type", "text/csv");
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            AV15HttpResponse.addHeader("Content-Disposition", "attachment;filename=HojadeRuta___WWExportCSV.csv");
         }
         AV15HttpResponse.addFile(AV10TextFile.getAbsoluteName());
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
         AV15HttpResponse.addString(AV12ErrorMessage);
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
      AV50ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "CliCod", "", "Cliente", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "CliNom", "", "Nombre", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarNHdr", "", "N° Hdr", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarFecGen", "", "Fecha Creacion", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarSer", "", "Articulo", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarSerDsc", "", "Descripcion", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarColNom", "", "Color", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarColNum", "", "Numero", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarSit", "", "St", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarMaqCod", "", "Maquina", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarAgrEst", "", "A?", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV50ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "HayRec", "", "Rct?", true, "") ;
      AV50ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXt_char6 = AV54UserCustomValue ;
      GXv_char10[0] = GXt_char6 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "PedidosClienteSinDetalle.HojadeRuta___WWColumnsSelector", GXv_char10) ;
      hojaderuta___wwexportcsv_impl.this.GXt_char6 = GXv_char10[0] ;
      AV54UserCustomValue = GXt_char6 ;
      if ( ! ( (GXutil.strcmp("", AV54UserCustomValue)==0) ) )
      {
         AV51ColumnsSelectorAux.fromxml(AV54UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector11[0] = AV51ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector12[0] = AV50ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, GXv_SdtWWPColumnsSelector12) ;
         AV51ColumnsSelectorAux = GXv_SdtWWPColumnsSelector11[0] ;
         AV50ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("PedidosClienteSinDetalle.HojadeRuta___WWGridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "PedidosClienteSinDetalle.HojadeRuta___WWGridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV19Session.getValue("PedidosClienteSinDetalle.HojadeRuta___WWGridState"), null, null);
      }
      AV16OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV17OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV23TFCliNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV24TFCliNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV25TFPedidoCliente = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV26TFPedidoCliente_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV27TFBarSer = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV28TFBarSer_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV29TFBarSerDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV30TFBarSerDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV31TFBarColNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV32TFBarColNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV33TFBarColNum = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV34TFBarColNum_To = (int)(GXutil.lval( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV35TFBarMaqCod = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV36TFBarMaqCod_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV37TFBarAgrEst = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV38TFBarAgrEst_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
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
      AV39Emprcod = "" ;
      AV47BarCodpar = "" ;
      AV41BarFecGenfrom = GXutil.nullDate() ;
      AV42BarFecGento = GXutil.nullDate() ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV53ColumnsSelectorXML = "" ;
      AV50ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A279CliNom = "" ;
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A180BarMaqCod = "" ;
      A120BarAgrEst = "" ;
      AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = "" ;
      AV18FilterFullText = "" ;
      AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = "" ;
      AV23TFCliNom = "" ;
      AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel = "" ;
      AV24TFCliNom_Sel = "" ;
      AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente = "" ;
      AV25TFPedidoCliente = "" ;
      AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel = "" ;
      AV26TFPedidoCliente_Sel = "" ;
      AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = "" ;
      AV27TFBarSer = "" ;
      AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel = "" ;
      AV28TFBarSer_Sel = "" ;
      AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = "" ;
      AV29TFBarSerDsc = "" ;
      AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel = "" ;
      AV30TFBarSerDsc_Sel = "" ;
      AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = "" ;
      AV31TFBarColNom = "" ;
      AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel = "" ;
      AV32TFBarColNom_Sel = "" ;
      AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = "" ;
      AV35TFBarMaqCod = "" ;
      AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel = "" ;
      AV36TFBarMaqCod_Sel = "" ;
      AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = "" ;
      AV37TFBarAgrEst = "" ;
      AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel = "" ;
      AV38TFBarAgrEst_Sel = "" ;
      lV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom = "" ;
      lV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser = "" ;
      lV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc = "" ;
      lV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom = "" ;
      lV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod = "" ;
      lV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest = "" ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P0ARW2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0ARW2_A213BarSit = new byte[1] ;
      P0ARW2_A13696BarNHdr = new String[] {""} ;
      P0ARW2_A252CliCod = new int[1] ;
      P0ARW2_n252CliCod = new boolean[] {false} ;
      P0ARW2_A120BarAgrEst = new String[] {""} ;
      P0ARW2_A180BarMaqCod = new String[] {""} ;
      P0ARW2_A136BarColNum = new int[1] ;
      P0ARW2_A135BarColNom = new String[] {""} ;
      P0ARW2_A1652BarSerDsc = new String[] {""} ;
      P0ARW2_A212BarSer = new String[] {""} ;
      P0ARW2_A279CliNom = new String[] {""} ;
      P0ARW2_A130BarCodPar = new String[] {""} ;
      P0ARW2_A132BarCodReo = new byte[1] ;
      P0ARW2_A129BarCod = new int[1] ;
      P0ARW2_A143BarDisNum = new String[] {""} ;
      P0ARW2_A4812BarEncCli = new String[] {""} ;
      P0ARW2_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      GXv_int3 = new long[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      AV15HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV54UserCustomValue = "" ;
      GXt_char6 = "" ;
      GXv_char10 = new String[1] ;
      AV51ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.hojaderuta___wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0ARW2_A159BarFecGen, P0ARW2_A213BarSit, P0ARW2_A13696BarNHdr, P0ARW2_A252CliCod, P0ARW2_n252CliCod, P0ARW2_A120BarAgrEst, P0ARW2_A180BarMaqCod, P0ARW2_A136BarColNum, P0ARW2_A135BarColNom, P0ARW2_A1652BarSerDsc,
            P0ARW2_A212BarSer, P0ARW2_A279CliNom, P0ARW2_A130BarCodPar, P0ARW2_A132BarCodReo, P0ARW2_A129BarCod, P0ARW2_A143BarDisNum, P0ARW2_A4812BarEncCli, P0ARW2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV46BarCodreo ;
   private byte AV43BarSitfrom ;
   private byte AV44BarSitto ;
   private byte A213BarSit ;
   private byte A13710HayRec ;
   private byte A132BarCodReo ;
   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private short gxcookieaux ;
   private short AV16OrderedBy ;
   private short Gx_err ;
   private int AV45BarCod ;
   private int AV40CliCod ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ;
   private int AV33TFBarColNum ;
   private int AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ;
   private int AV34TFBarColNum_To ;
   private int A129BarCod ;
   private int AV81GXV1 ;
   private long A13930BarAlbUlti ;
   private long GXt_int2 ;
   private long GXv_int3[] ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV39Emprcod ;
   private String AV47BarCodpar ;
   private String A279CliNom ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A180BarMaqCod ;
   private String A120BarAgrEst ;
   private String AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ;
   private String AV23TFCliNom ;
   private String AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ;
   private String AV24TFCliNom_Sel ;
   private String AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ;
   private String AV25TFPedidoCliente ;
   private String AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ;
   private String AV26TFPedidoCliente_Sel ;
   private String AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ;
   private String AV27TFBarSer ;
   private String AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ;
   private String AV28TFBarSer_Sel ;
   private String AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ;
   private String AV29TFBarSerDsc ;
   private String AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ;
   private String AV30TFBarSerDsc_Sel ;
   private String AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ;
   private String AV31TFBarColNom ;
   private String AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ;
   private String AV32TFBarColNom_Sel ;
   private String AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ;
   private String AV35TFBarMaqCod ;
   private String AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ;
   private String AV36TFBarMaqCod_Sel ;
   private String AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ;
   private String AV37TFBarAgrEst ;
   private String AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ;
   private String AV38TFBarAgrEst_Sel ;
   private String scmdbuf ;
   private String lV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ;
   private String lV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ;
   private String lV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ;
   private String lV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ;
   private String lV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ;
   private String lV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXt_char6 ;
   private String GXv_char10[] ;
   private java.util.Date AV41BarFecGenfrom ;
   private java.util.Date AV42BarFecGento ;
   private java.util.Date A159BarFecGen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV17OrderedDsc ;
   private boolean n252CliCod ;
   private String AV14TextFileLine ;
   private String AV53ColumnsSelectorXML ;
   private String AV54UserCustomValue ;
   private String AV11Filename ;
   private String AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ;
   private String AV18FilterFullText ;
   private String lV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0ARW2_A159BarFecGen ;
   private byte[] P0ARW2_A213BarSit ;
   private String[] P0ARW2_A13696BarNHdr ;
   private int[] P0ARW2_A252CliCod ;
   private boolean[] P0ARW2_n252CliCod ;
   private String[] P0ARW2_A120BarAgrEst ;
   private String[] P0ARW2_A180BarMaqCod ;
   private int[] P0ARW2_A136BarColNum ;
   private String[] P0ARW2_A135BarColNom ;
   private String[] P0ARW2_A1652BarSerDsc ;
   private String[] P0ARW2_A212BarSer ;
   private String[] P0ARW2_A279CliNom ;
   private String[] P0ARW2_A130BarCodPar ;
   private byte[] P0ARW2_A132BarCodReo ;
   private int[] P0ARW2_A129BarCod ;
   private String[] P0ARW2_A143BarDisNum ;
   private String[] P0ARW2_A4812BarEncCli ;
   private String[] P0ARW2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV15HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV50ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV51ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
}

final  class hojaderuta___wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0ARW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel ,
                                          String AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom ,
                                          String AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel ,
                                          String AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser ,
                                          String AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel ,
                                          String AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc ,
                                          String AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel ,
                                          String AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom ,
                                          int AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum ,
                                          int AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to ,
                                          String AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel ,
                                          String AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod ,
                                          String AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel ,
                                          String AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest ,
                                          int AV40CliCod ,
                                          java.util.Date AV41BarFecGenfrom ,
                                          java.util.Date AV42BarFecGento ,
                                          byte AV43BarSitfrom ,
                                          byte AV44BarSitto ,
                                          int AV45BarCod ,
                                          byte AV46BarCodreo ,
                                          String AV47BarCodpar ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A180BarMaqCod ,
                                          String A120BarAgrEst ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          byte A213BarSit ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV16OrderedBy ,
                                          boolean AV17OrderedDsc ,
                                          String AV64Pedidosclientesindetalle_hojaderuta___wwds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          String AV68Pedidosclientesindetalle_hojaderuta___wwds_5_tfpedidocliente_sel ,
                                          String AV67Pedidosclientesindetalle_hojaderuta___wwds_4_tfpedidocliente ,
                                          String AV39Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[23];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T1.BarFecGen, T1.BarSit, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar" ;
      scmdbuf += " AS BarNHdr, T1.CliCod, T1.BarAgrEst, T1.BarMaqCod, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, T1.EmprCod FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV65Pedidosclientesindetalle_hojaderuta___wwds_2_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Pedidosclientesindetalle_hojaderuta___wwds_3_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int13[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV69Pedidosclientesindetalle_hojaderuta___wwds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Pedidosclientesindetalle_hojaderuta___wwds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV71Pedidosclientesindetalle_hojaderuta___wwds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Pedidosclientesindetalle_hojaderuta___wwds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV73Pedidosclientesindetalle_hojaderuta___wwds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Pedidosclientesindetalle_hojaderuta___wwds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (0==AV75Pedidosclientesindetalle_hojaderuta___wwds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV76Pedidosclientesindetalle_hojaderuta___wwds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV77Pedidosclientesindetalle_hojaderuta___wwds_14_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Pedidosclientesindetalle_hojaderuta___wwds_15_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV79Pedidosclientesindetalle_hojaderuta___wwds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Pedidosclientesindetalle_hojaderuta___wwds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (0==AV40CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41BarFecGenfrom)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42BarFecGento)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (0==AV43BarSitfrom) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (0==AV44BarSitto) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (0==AV45BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (0==AV46BarCodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV47BarCodpar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV16OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFecGen" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV16OrderedBy == 2 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV16OrderedBy == 3 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY BarNHdr" ;
      }
      else if ( ( AV16OrderedBy == 4 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY BarNHdr DESC" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV16OrderedBy == 5 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV16OrderedBy == 6 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV16OrderedBy == 7 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV16OrderedBy == 8 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV16OrderedBy == 9 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV16OrderedBy == 10 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV16OrderedBy == 11 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ! AV17OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV16OrderedBy == 12 ) && ( AV17OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
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
                  return conditional_P0ARW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).byteValue() , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Boolean) dynConstraints[36]).booleanValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ARW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 11);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((String[]) buf[16])[0] = rslt.getString(16, 20);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               return;
      }
   }

}

