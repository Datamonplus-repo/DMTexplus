package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informealbaranesproducciondetallado_wcexportcsv_impl extends GXWebProcedure
{
   public informealbaranesproducciondetallado_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      GXt_char1 = AV67Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV67Station = GXt_char1 ;
      GXv_char2[0] = AV28Emprcod ;
      GXv_char3[0] = AV65EmprNom ;
      GXv_char4[0] = AV66UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV67Station, GXv_char2, GXv_char3, GXv_char4) ;
      informealbaranesproducciondetallado_wcexportcsv_impl.this.AV28Emprcod = GXv_char2[0] ;
      informealbaranesproducciondetallado_wcexportcsv_impl.this.AV65EmprNom = GXv_char3[0] ;
      informealbaranesproducciondetallado_wcexportcsv_impl.this.AV66UsurCod = GXv_char4[0] ;
      GXt_int5 = (byte)(AV64moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV28Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_int5 = GXv_int6[0] ;
      AV64moda21 = GXt_int5 ;
      GXv_SdtWWPContext7[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV9WWPContext = GXv_SdtWWPContext7[0] ;
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
      AV11Filename = "./PrivateTempStorage/" + "InformeAlbaranesProduccionDetallado_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("InformeAlbaranesProduccionDetallado_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("InformeAlbaranesProduccionDetallado_WCColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Albaran", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Alb", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido Cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Disposicion Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Composicion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Intensidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos Cru.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
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
                                           Integer.valueOf(AV30Clicod) ,
                                           Integer.valueOf(AV31Clicod_to) ,
                                           AV32ALbProfch ,
                                           AV33ALbProfch_to ,
                                           AV34Barser ,
                                           AV35Barser_to ,
                                           AV38BarColNom ,
                                           AV39BarColNom_to ,
                                           Integer.valueOf(AV40BarColNum) ,
                                           Integer.valueOf(AV41BarColNum_to) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           Short.valueOf(AV46OrderedBy) ,
                                           Boolean.valueOf(AV47OrderedDsc) ,
                                           A39AlbProPri ,
                                           AV29Prio ,
                                           AV36AlbEncCli ,
                                           A13878PedidoClie ,
                                           AV37AlbEncCli_to ,
                                           Byte.valueOf(A148BarEstReo) ,
                                           Byte.valueOf(AV43Barestreoi) ,
                                           Byte.valueOf(AV44barestreof) ,
                                           A2010BarTipDis ,
                                           AV45TipDisCod ,
                                           A5140AlbMarca ,
                                           AV28Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P0AFD2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, AV29Prio, AV29Prio, Byte.valueOf(AV43Barestreoi), Byte.valueOf(AV44barestreof), AV45TipDisCod, AV45TipDisCod, Integer.valueOf(AV30Clicod), Integer.valueOf(AV31Clicod_to), AV32ALbProfch, AV33ALbProfch_to, AV34Barser, AV35Barser_to, AV38BarColNom, AV39BarColNom_to, Integer.valueOf(AV40BarColNum), Integer.valueOf(AV41BarColNum_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A217BarTipArt = P0AFD2_A217BarTipArt[0] ;
         n217BarTipArt = P0AFD2_n217BarTipArt[0] ;
         A1253EmprGuiRem = P0AFD2_A1253EmprGuiRem[0] ;
         A5140AlbMarca = P0AFD2_A5140AlbMarca[0] ;
         A2010BarTipDis = P0AFD2_A2010BarTipDis[0] ;
         A148BarEstReo = P0AFD2_A148BarEstReo[0] ;
         A136BarColNum = P0AFD2_A136BarColNum[0] ;
         A135BarColNom = P0AFD2_A135BarColNom[0] ;
         A212BarSer = P0AFD2_A212BarSer[0] ;
         A34AlbProfch = P0AFD2_A34AlbProfch[0] ;
         A1243GuiRemCli = P0AFD2_A1243GuiRemCli[0] ;
         A39AlbProPri = P0AFD2_A39AlbProPri[0] ;
         A252CliCod = P0AFD2_A252CliCod[0] ;
         n252CliCod = P0AFD2_n252CliCod[0] ;
         A218BarTipCol = P0AFD2_A218BarTipCol[0] ;
         A1261BarAlbKgmE = P0AFD2_A1261BarAlbKgmE[0] ;
         A2243BarKgsCli = P0AFD2_A2243BarKgsCli[0] ;
         n2243BarKgsCli = P0AFD2_n2243BarKgsCli[0] ;
         A1263BarAlbMtrE = P0AFD2_A1263BarAlbMtrE[0] ;
         A1461BarAlbPN = P0AFD2_A1461BarAlbPN[0] ;
         A1265BarAlbPie = P0AFD2_A1265BarAlbPie[0] ;
         A1234BarNomCli = P0AFD2_A1234BarNomCli[0] ;
         A13711BarTipArtD = P0AFD2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P0AFD2_n13711BarTipArtD[0] ;
         A1652BarSerDsc = P0AFD2_A1652BarSerDsc[0] ;
         A155BarFecCli = P0AFD2_A155BarFecCli[0] ;
         A30AlbProCod = P0AFD2_A30AlbProCod[0] ;
         A1244GuiRemCln = P0AFD2_A1244GuiRemCln[0] ;
         A130BarCodPar = P0AFD2_A130BarCodPar[0] ;
         A132BarCodReo = P0AFD2_A132BarCodReo[0] ;
         A129BarCod = P0AFD2_A129BarCod[0] ;
         A143BarDisNum = P0AFD2_A143BarDisNum[0] ;
         A4812BarEncCli = P0AFD2_A4812BarEncCli[0] ;
         A396EmprCod = P0AFD2_A396EmprCod[0] ;
         A217BarTipArt = P0AFD2_A217BarTipArt[0] ;
         n217BarTipArt = P0AFD2_n217BarTipArt[0] ;
         A2010BarTipDis = P0AFD2_A2010BarTipDis[0] ;
         A148BarEstReo = P0AFD2_A148BarEstReo[0] ;
         A136BarColNum = P0AFD2_A136BarColNum[0] ;
         A135BarColNom = P0AFD2_A135BarColNom[0] ;
         A212BarSer = P0AFD2_A212BarSer[0] ;
         A252CliCod = P0AFD2_A252CliCod[0] ;
         n252CliCod = P0AFD2_n252CliCod[0] ;
         A218BarTipCol = P0AFD2_A218BarTipCol[0] ;
         A1234BarNomCli = P0AFD2_A1234BarNomCli[0] ;
         A1652BarSerDsc = P0AFD2_A1652BarSerDsc[0] ;
         A155BarFecCli = P0AFD2_A155BarFecCli[0] ;
         A143BarDisNum = P0AFD2_A143BarDisNum[0] ;
         A4812BarEncCli = P0AFD2_A4812BarEncCli[0] ;
         A1253EmprGuiRem = P0AFD2_A1253EmprGuiRem[0] ;
         A5140AlbMarca = P0AFD2_A5140AlbMarca[0] ;
         A34AlbProfch = P0AFD2_A34AlbProfch[0] ;
         A1243GuiRemCli = P0AFD2_A1243GuiRemCli[0] ;
         A39AlbProPri = P0AFD2_A39AlbProPri[0] ;
         A1244GuiRemCln = P0AFD2_A1244GuiRemCln[0] ;
         A13711BarTipArtD = P0AFD2_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P0AFD2_n13711BarTipArtD[0] ;
         GXt_char1 = A13878PedidoClie ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A4812BarEncCli ;
         GXv_char2[0] = A143BarDisNum ;
         GXv_char8[0] = GXt_char1 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char8) ;
         informealbaranesproducciondetallado_wcexportcsv_impl.this.A396EmprCod = GXv_char4[0] ;
         informealbaranesproducciondetallado_wcexportcsv_impl.this.A4812BarEncCli = GXv_char3[0] ;
         informealbaranesproducciondetallado_wcexportcsv_impl.this.A143BarDisNum = GXv_char2[0] ;
         informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char8[0] ;
         A13878PedidoClie = GXt_char1 ;
         if ( (GXutil.strcmp("", AV36AlbEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV36AlbEncCli) >= 0 ) ) )
         {
            if ( (GXutil.strcmp("", AV37AlbEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV37AlbEncCli_to) <= 0 ) ) )
            {
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
                  pr_default.close(0);
                  returnInSub = true;
                  if (true) return;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A1243GuiRemCli, 6, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char1 = AV14TextFileLine ;
                  GXv_char8[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1244GuiRemCln, ";", ","), GXv_char8) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char8[0] ;
                  AV14TextFileLine += GXt_char1 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A30AlbProCod, 10, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += localUtil.dtoc( A34AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV48BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
                  AV14TextFileLine += ";" ;
                  GXt_char1 = AV14TextFileLine ;
                  GXv_char8[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV48BarEncCli, ";", ","), GXv_char8) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char8[0] ;
                  AV14TextFileLine += GXt_char1 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += localUtil.dtoc( A155BarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char1 = AV14TextFileLine ;
                  GXv_char8[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char8) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char8[0] ;
                  AV14TextFileLine += GXt_char1 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char1 = AV14TextFileLine ;
                  GXv_char8[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char8) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char8[0] ;
                  AV14TextFileLine += GXt_char1 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char1 = AV14TextFileLine ;
                  GXv_char8[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char8) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char8[0] ;
                  AV14TextFileLine += GXt_char1 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char1 = AV14TextFileLine ;
                  GXv_char8[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13711BarTipArtD, ";", ","), GXv_char8) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char8[0] ;
                  AV14TextFileLine += GXt_char1 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char1 = AV14TextFileLine ;
                  GXv_char8[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char8) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char8[0] ;
                  AV14TextFileLine += GXt_char1 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char1 = AV14TextFileLine ;
                  GXv_char8[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char8) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char8[0] ;
                  AV14TextFileLine += GXt_char1 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXv_char8[0] = " " ;
                  GXv_char4[0] = " " ;
                  GXv_int9[0] = (short)(0) ;
                  GXv_int6[0] = (byte)(0) ;
                  GXv_char3[0] = AV49TipColDsc ;
                  GXv_char2[0] = " " ;
                  GXv_int10[0] = 0 ;
                  GXv_char11[0] = " " ;
                  GXv_char12[0] = " " ;
                  GXv_int13[0] = (short)(0) ;
                  GXv_char14[0] = " " ;
                  GXv_char15[0] = " " ;
                  new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char8, GXv_char4, GXv_int9, GXv_int6, GXv_char3, GXv_char2, GXv_int10, GXv_char11, GXv_char12, GXv_int13, GXv_char14, GXv_char15) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.AV49TipColDsc = GXv_char3[0] ;
                  AV14TextFileLine += ";" ;
                  GXt_char1 = AV14TextFileLine ;
                  GXv_char15[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV49TipColDsc, ";", ","), GXv_char15) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char15[0] ;
                  AV14TextFileLine += GXt_char1 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXv_char15[0] = AV50IntDsc ;
                  GXv_char14[0] = " " ;
                  GXv_int13[0] = (short)(0) ;
                  GXv_int6[0] = (byte)(0) ;
                  GXv_char12[0] = "" ;
                  GXv_char11[0] = " " ;
                  GXv_int10[0] = 0 ;
                  GXv_char8[0] = " " ;
                  GXv_char4[0] = " " ;
                  GXv_int9[0] = (short)(0) ;
                  GXv_char3[0] = " " ;
                  GXv_char2[0] = " " ;
                  new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char15, GXv_char14, GXv_int13, GXv_int6, GXv_char12, GXv_char11, GXv_int10, GXv_char8, GXv_char4, GXv_int9, GXv_char3, GXv_char2) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.AV50IntDsc = GXv_char15[0] ;
                  AV14TextFileLine += ";" ;
                  GXt_char1 = AV14TextFileLine ;
                  GXv_char15[0] = GXt_char1 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV50IntDsc, ";", ","), GXv_char15) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char15[0] ;
                  AV14TextFileLine += GXt_char1 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  GXt_decimal16 = AV68BarKgm ;
                  GXv_decimal17[0] = GXt_decimal16 ;
                  new app.get_barkgm(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal17) ;
                  informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_decimal16 = GXv_decimal17[0] ;
                  AV68BarKgm = GXt_decimal16 ;
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( AV68BarKgm, 9, 2) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV58BarAlbKgmE = A1261BarAlbKgmE ;
                  if ( AV64moda21 == 1 )
                  {
                     if ( A2243BarKgsCli.doubleValue() != 0 )
                     {
                        AV58BarAlbKgmE = A2243BarKgsCli ;
                     }
                  }
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( AV58BarAlbKgmE, 9, 2) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV59BarAlbMtrE = A1263BarAlbMtrE ;
                  if ( AV64moda21 == 1 )
                  {
                     if ( A1461BarAlbPN.doubleValue() != 0 )
                     {
                        AV59BarAlbMtrE = A1461BarAlbPN ;
                     }
                  }
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( AV59BarAlbMtrE, 9, 2) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A1265BarAlbPie, 6, 0) ;
               }
               /* Execute user subroutine: 'AFTERWRITELINE' */
               S172 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=InformeAlbaranesProduccionDetallado_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "GuiRemCli", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "GuiRemCln", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "AlbProCod", "", "Albaran", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "AlbProfch", "", "Fecha Alb", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarEncCli", "", "Pedido Cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarFecCli", "", "Fecha Disposicion Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarNHdr", "", "Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarSerDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarTipArtDsc", "", "Composicion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarNomCli", "", "Color Cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&TipColDsc", "", "Tc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&IntDsc", "", "Intensidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarKgm", "", "Kilos Cru.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarAlbKgmE", "Entregados", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "&BarAlbMtrE", "Entregados", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXv_SdtWWPColumnsSelector18[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, "BarAlbPie", "", "Piezas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector18[0] ;
      GXt_char1 = AV20UserCustomValue ;
      GXv_char15[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "InformeAlbaranesProduccionDetallado_WCColumnsSelector", GXv_char15) ;
      informealbaranesproducciondetallado_wcexportcsv_impl.this.GXt_char1 = GXv_char15[0] ;
      AV20UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector18[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector19[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector18, GXv_SdtWWPColumnsSelector19) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector18[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("InformeAlbaranesProduccionDetallado_WCGridState"), "") == 0 )
      {
         AV54GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformeAlbaranesProduccionDetallado_WCGridState"), null, null);
      }
      else
      {
         AV54GridState.fromxml(AV19Session.getValue("InformeAlbaranesProduccionDetallado_WCGridState"), null, null);
      }
      AV46OrderedBy = AV54GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV47OrderedDsc = AV54GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV72GXV1 = 1 ;
      while ( AV72GXV1 <= AV54GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV55GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV54GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV72GXV1));
         if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV56TFIntDsc = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV57TFIntDsc_Sel = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRIO") == 0 )
         {
            AV29Prio = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV30Clicod = (int)(GXutil.lval( AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV31Clicod_to = (int)(GXutil.lval( AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROFCH") == 0 )
         {
            AV32ALbProfch = localUtil.ctod( AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBPROFCH_TO") == 0 )
         {
            AV33ALbProfch_to = localUtil.ctod( AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV34Barser = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER_TO") == 0 )
         {
            AV35Barser_to = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENCCLI") == 0 )
         {
            AV36AlbEncCli = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&ALBENCCLI_TO") == 0 )
         {
            AV37AlbEncCli_to = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV38BarColNom = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM_TO") == 0 )
         {
            AV39BarColNom_to = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV40BarColNum = (int)(GXutil.lval( AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM_TO") == 0 )
         {
            AV41BarColNum_to = (int)(GXutil.lval( AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREO") == 0 )
         {
            AV42Barestreo = (byte)(GXutil.lval( AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREOI") == 0 )
         {
            AV43Barestreoi = (byte)(GXutil.lval( AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARESTREOF") == 0 )
         {
            AV44barestreof = (byte)(GXutil.lval( AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPDISCOD") == 0 )
         {
            AV45TipDisCod = AV55GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV72GXV1 = (int)(AV72GXV1+1) ;
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
      AV67Station = "" ;
      AV28Emprcod = "" ;
      AV65EmprNom = "" ;
      AV66UsurCod = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      scmdbuf = "" ;
      AV32ALbProfch = GXutil.nullDate() ;
      AV33ALbProfch_to = GXutil.nullDate() ;
      AV34Barser = "" ;
      AV35Barser_to = "" ;
      AV38BarColNom = "" ;
      AV39BarColNom_to = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A39AlbProPri = "" ;
      AV29Prio = "" ;
      AV36AlbEncCli = "" ;
      A13878PedidoClie = "" ;
      AV37AlbEncCli_to = "" ;
      A2010BarTipDis = "" ;
      AV45TipDisCod = "" ;
      A5140AlbMarca = "" ;
      A396EmprCod = "" ;
      P0AFD2_A217BarTipArt = new short[1] ;
      P0AFD2_n217BarTipArt = new boolean[] {false} ;
      P0AFD2_A1253EmprGuiRem = new String[] {""} ;
      P0AFD2_A5140AlbMarca = new String[] {""} ;
      P0AFD2_A2010BarTipDis = new String[] {""} ;
      P0AFD2_A148BarEstReo = new byte[1] ;
      P0AFD2_A136BarColNum = new int[1] ;
      P0AFD2_A135BarColNom = new String[] {""} ;
      P0AFD2_A212BarSer = new String[] {""} ;
      P0AFD2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P0AFD2_A1243GuiRemCli = new int[1] ;
      P0AFD2_A39AlbProPri = new String[] {""} ;
      P0AFD2_A252CliCod = new int[1] ;
      P0AFD2_n252CliCod = new boolean[] {false} ;
      P0AFD2_A218BarTipCol = new byte[1] ;
      P0AFD2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFD2_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFD2_n2243BarKgsCli = new boolean[] {false} ;
      P0AFD2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFD2_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AFD2_A1265BarAlbPie = new int[1] ;
      P0AFD2_A1234BarNomCli = new String[] {""} ;
      P0AFD2_A13711BarTipArtD = new String[] {""} ;
      P0AFD2_n13711BarTipArtD = new boolean[] {false} ;
      P0AFD2_A1652BarSerDsc = new String[] {""} ;
      P0AFD2_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0AFD2_A30AlbProCod = new long[1] ;
      P0AFD2_A1244GuiRemCln = new String[] {""} ;
      P0AFD2_A130BarCodPar = new String[] {""} ;
      P0AFD2_A132BarCodReo = new byte[1] ;
      P0AFD2_A129BarCod = new int[1] ;
      P0AFD2_A143BarDisNum = new String[] {""} ;
      P0AFD2_A4812BarEncCli = new String[] {""} ;
      P0AFD2_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A13711BarTipArtD = "" ;
      A1652BarSerDsc = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      A130BarCodPar = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A13696BarNHdr = "" ;
      AV48BarEncCli = "" ;
      AV49TipColDsc = "" ;
      AV50IntDsc = "" ;
      GXv_char14 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char12 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV68BarKgm = DecimalUtil.ZERO ;
      GXt_decimal16 = DecimalUtil.ZERO ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      AV58BarAlbKgmE = DecimalUtil.ZERO ;
      AV59BarAlbMtrE = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char15 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector18 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector19 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV54GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV55GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV56TFIntDsc = "" ;
      AV57TFIntDsc_Sel = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informealbaranesproducciondetallado_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P0AFD2_A217BarTipArt, P0AFD2_n217BarTipArt, P0AFD2_A1253EmprGuiRem, P0AFD2_A5140AlbMarca, P0AFD2_A2010BarTipDis, P0AFD2_A148BarEstReo, P0AFD2_A136BarColNum, P0AFD2_A135BarColNom, P0AFD2_A212BarSer, P0AFD2_A34AlbProfch,
            P0AFD2_A1243GuiRemCli, P0AFD2_A39AlbProPri, P0AFD2_A252CliCod, P0AFD2_n252CliCod, P0AFD2_A218BarTipCol, P0AFD2_A1261BarAlbKgmE, P0AFD2_A2243BarKgsCli, P0AFD2_n2243BarKgsCli, P0AFD2_A1263BarAlbMtrE, P0AFD2_A1461BarAlbPN,
            P0AFD2_A1265BarAlbPie, P0AFD2_A1234BarNomCli, P0AFD2_A13711BarTipArtD, P0AFD2_n13711BarTipArtD, P0AFD2_A1652BarSerDsc, P0AFD2_A155BarFecCli, P0AFD2_A30AlbProCod, P0AFD2_A1244GuiRemCln, P0AFD2_A130BarCodPar, P0AFD2_A132BarCodReo,
            P0AFD2_A129BarCod, P0AFD2_A143BarDisNum, P0AFD2_A4812BarEncCli, P0AFD2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GXt_int5 ;
   private byte A148BarEstReo ;
   private byte AV43Barestreoi ;
   private byte AV44barestreof ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte GXv_int6[] ;
   private byte AV42Barestreo ;
   private short gxcookieaux ;
   private short AV64moda21 ;
   private short AV46OrderedBy ;
   private short A217BarTipArt ;
   private short GXv_int13[] ;
   private short GXv_int9[] ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV30Clicod ;
   private int AV31Clicod_to ;
   private int AV40BarColNum ;
   private int AV41BarColNum_to ;
   private int A1243GuiRemCli ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A1265BarAlbPie ;
   private int A129BarCod ;
   private int GXv_int10[] ;
   private int AV72GXV1 ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal AV68BarKgm ;
   private java.math.BigDecimal GXt_decimal16 ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal AV58BarAlbKgmE ;
   private java.math.BigDecimal AV59BarAlbMtrE ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV67Station ;
   private String AV28Emprcod ;
   private String AV65EmprNom ;
   private String AV66UsurCod ;
   private String scmdbuf ;
   private String AV34Barser ;
   private String AV35Barser_to ;
   private String AV38BarColNom ;
   private String AV39BarColNom_to ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A39AlbProPri ;
   private String AV29Prio ;
   private String AV36AlbEncCli ;
   private String A13878PedidoClie ;
   private String AV37AlbEncCli_to ;
   private String A2010BarTipDis ;
   private String AV45TipDisCod ;
   private String A5140AlbMarca ;
   private String A396EmprCod ;
   private String A1253EmprGuiRem ;
   private String A1234BarNomCli ;
   private String A13711BarTipArtD ;
   private String A1652BarSerDsc ;
   private String A1244GuiRemCln ;
   private String A130BarCodPar ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A13696BarNHdr ;
   private String AV48BarEncCli ;
   private String AV49TipColDsc ;
   private String AV50IntDsc ;
   private String GXv_char14[] ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char15[] ;
   private String AV56TFIntDsc ;
   private String AV57TFIntDsc_Sel ;
   private java.util.Date AV32ALbProfch ;
   private java.util.Date AV33ALbProfch_to ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A155BarFecCli ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV47OrderedDsc ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n2243BarKgsCli ;
   private boolean n13711BarTipArtD ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P0AFD2_A217BarTipArt ;
   private boolean[] P0AFD2_n217BarTipArt ;
   private String[] P0AFD2_A1253EmprGuiRem ;
   private String[] P0AFD2_A5140AlbMarca ;
   private String[] P0AFD2_A2010BarTipDis ;
   private byte[] P0AFD2_A148BarEstReo ;
   private int[] P0AFD2_A136BarColNum ;
   private String[] P0AFD2_A135BarColNom ;
   private String[] P0AFD2_A212BarSer ;
   private java.util.Date[] P0AFD2_A34AlbProfch ;
   private int[] P0AFD2_A1243GuiRemCli ;
   private String[] P0AFD2_A39AlbProPri ;
   private int[] P0AFD2_A252CliCod ;
   private boolean[] P0AFD2_n252CliCod ;
   private byte[] P0AFD2_A218BarTipCol ;
   private java.math.BigDecimal[] P0AFD2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P0AFD2_A2243BarKgsCli ;
   private boolean[] P0AFD2_n2243BarKgsCli ;
   private java.math.BigDecimal[] P0AFD2_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0AFD2_A1461BarAlbPN ;
   private int[] P0AFD2_A1265BarAlbPie ;
   private String[] P0AFD2_A1234BarNomCli ;
   private String[] P0AFD2_A13711BarTipArtD ;
   private boolean[] P0AFD2_n13711BarTipArtD ;
   private String[] P0AFD2_A1652BarSerDsc ;
   private java.util.Date[] P0AFD2_A155BarFecCli ;
   private long[] P0AFD2_A30AlbProCod ;
   private String[] P0AFD2_A1244GuiRemCln ;
   private String[] P0AFD2_A130BarCodPar ;
   private byte[] P0AFD2_A132BarCodReo ;
   private int[] P0AFD2_A129BarCod ;
   private String[] P0AFD2_A143BarDisNum ;
   private String[] P0AFD2_A4812BarEncCli ;
   private String[] P0AFD2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector18[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector19[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV54GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV55GridStateFilterValue ;
}

final  class informealbaranesproducciondetallado_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AFD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV30Clicod ,
                                          int AV31Clicod_to ,
                                          java.util.Date AV32ALbProfch ,
                                          java.util.Date AV33ALbProfch_to ,
                                          String AV34Barser ,
                                          String AV35Barser_to ,
                                          String AV38BarColNom ,
                                          String AV39BarColNom_to ,
                                          int AV40BarColNum ,
                                          int AV41BarColNum_to ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          short AV46OrderedBy ,
                                          boolean AV47OrderedDsc ,
                                          String A39AlbProPri ,
                                          String AV29Prio ,
                                          String AV36AlbEncCli ,
                                          String A13878PedidoClie ,
                                          String AV37AlbEncCli_to ,
                                          byte A148BarEstReo ,
                                          byte AV43Barestreoi ,
                                          byte AV44barestreof ,
                                          String A2010BarTipDis ,
                                          String AV45TipDisCod ,
                                          String A5140AlbMarca ,
                                          String AV28Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[17];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T2.BarTipArt AS BarTipArt, T3.EmprGuiRem AS EmprGuiRem, T3.AlbMarca, T2.BarTipDis, T2.BarEstReo, T2.BarColNum, T2.BarColNom, T2.BarSer, T3.AlbProfch, T3.GuiRemCli" ;
      scmdbuf += " AS GuiRemCli, T3.AlbProPri, T2.CliCod, T2.BarTipCol, T1.BarAlbKgmE, T1.BarKgsCli, T1.BarAlbMtrE, T1.BarAlbPN, T1.BarAlbPie, T2.BarNomCli, T5.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T2.BarSerDsc, T2.BarFecCli, T1.AlbProCod, T4.CliNom AS GuiRemCln, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((((TXPALBBAR" ;
      scmdbuf += " T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTIPART" ;
      scmdbuf += " T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T2.BarTipArt) INNER JOIN TXPCALPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod) INNER JOIN TXPCLIENT" ;
      scmdbuf += " T4 ON T4.EmprCod = T3.EmprGuiRem AND T4.CliCod = T3.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T3.AlbProPri = ? or ? = '2')");
      addWhere(sWhereString, "(T2.BarEstReo >= ?)");
      addWhere(sWhereString, "(T2.BarEstReo <= ?)");
      addWhere(sWhereString, "(T2.BarTipDis = ? or ? = '*')");
      addWhere(sWhereString, "(T3.AlbMarca <> 'A')");
      if ( ! (0==AV30Clicod) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (0==AV31Clicod_to) )
      {
         addWhere(sWhereString, "(T3.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV32ALbProfch)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch >= ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33ALbProfch_to)) )
      {
         addWhere(sWhereString, "(T3.AlbProfch <= ?)");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34Barser)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer >= ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35Barser_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer <= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV38BarColNom)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom >= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39BarColNom_to)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom <= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! (0==AV40BarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (0==AV41BarColNum_to) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV46OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T3.GuiRemCli" ;
      }
      else if ( ( AV46OrderedBy == 2 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.GuiRemCli" ;
      }
      else if ( ( AV46OrderedBy == 2 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.GuiRemCli DESC" ;
      }
      else if ( ( AV46OrderedBy == 3 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV46OrderedBy == 3 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV46OrderedBy == 4 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV46OrderedBy == 4 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV46OrderedBy == 5 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.AlbProfch" ;
      }
      else if ( ( AV46OrderedBy == 5 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.AlbProfch DESC" ;
      }
      else if ( ( AV46OrderedBy == 6 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarFecCli" ;
      }
      else if ( ( AV46OrderedBy == 6 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarFecCli DESC" ;
      }
      else if ( ( AV46OrderedBy == 7 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV46OrderedBy == 7 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV46OrderedBy == 8 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV46OrderedBy == 8 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV46OrderedBy == 9 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc" ;
      }
      else if ( ( AV46OrderedBy == 9 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.TipArtDsc DESC" ;
      }
      else if ( ( AV46OrderedBy == 10 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV46OrderedBy == 10 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV46OrderedBy == 11 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV46OrderedBy == 11 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV46OrderedBy == 12 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV46OrderedBy == 12 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV46OrderedBy == 13 ) && ! AV47OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie" ;
      }
      else if ( ( AV46OrderedBy == 13 ) && ( AV47OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAlbPie DESC" ;
      }
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_P0AFD2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AFD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((int[]) buf[20])[0] = rslt.getInt(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 13);
               ((String[]) buf[22])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 26);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(22);
               ((long[]) buf[26])[0] = rslt.getLong(23);
               ((String[]) buf[27])[0] = rslt.getString(24, 30);
               ((String[]) buf[28])[0] = rslt.getString(25, 1);
               ((byte[]) buf[29])[0] = rslt.getByte(26);
               ((int[]) buf[30])[0] = rslt.getInt(27);
               ((String[]) buf[31])[0] = rslt.getString(28, 8);
               ((String[]) buf[32])[0] = rslt.getString(29, 20);
               ((String[]) buf[33])[0] = rslt.getString(30, 3);
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
                  stmt.setString(sIdx, (String)parms[18], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
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
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
      }
   }

}

