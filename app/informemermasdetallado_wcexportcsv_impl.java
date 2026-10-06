package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informemermasdetallado_wcexportcsv_impl extends GXWebProcedure
{
   public informemermasdetallado_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      if ( 1 == 0 )
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
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
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
      /* Execute user subroutine: 'CARGADATOSFILTROS' */
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'TITULODATOSFILTROS' */
      S211 ();
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
      AV11Filename = "./PrivateTempStorage/" + "InformeMermasDetallado_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("InformeMermasDetallado_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("InformeMermasDetallado_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod. Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nom. Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "O.S. - R", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Enc Cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod. Cor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cor Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Data", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Qgs. Entrado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Qgs. Saidos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Qgs. Difer", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Qgs. %", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts. Entrado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts. Saidos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts. Difer", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts. %", "") : "") ;
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
                                           Integer.valueOf(AV43TFCliCod) ,
                                           Integer.valueOf(AV44TFCliCod_To) ,
                                           AV34TFCliNom_Sel ,
                                           AV33TFCliNom ,
                                           AV36TFBarNHdr_Sel ,
                                           AV35TFBarNHdr ,
                                           Short.valueOf(AV45TFBarTipArt) ,
                                           Short.valueOf(AV46TFBarTipArt_To) ,
                                           AV48TFBarSer_Sel ,
                                           AV47TFBarSer ,
                                           AV52TFBarColNom_Sel ,
                                           AV51TFBarColNom ,
                                           AV54TFBarNomCli_Sel ,
                                           AV53TFBarNomCli ,
                                           Integer.valueOf(AV55TFBarColNum) ,
                                           Integer.valueOf(AV56TFBarColNum_To) ,
                                           AV57TFBarFecCli ,
                                           AV59TFBarKgm ,
                                           AV60TFBarKgm_To ,
                                           AV67TFBarMtr ,
                                           AV68TFBarMtr_To ,
                                           AV39BarFecSal ,
                                           AV40BarFecSal_To ,
                                           Integer.valueOf(AV73CliCod) ,
                                           Integer.valueOf(AV74CliCod_To) ,
                                           AV75BarSer ,
                                           AV76BarSer_To ,
                                           AV77BarColNom ,
                                           AV78BarColNom_To ,
                                           Integer.valueOf(AV106BarColNum) ,
                                           Integer.valueOf(AV107BarColNum_to) ,
                                           Short.valueOf(AV103BarTipArt) ,
                                           Short.valueOf(AV105BarTipArt_to) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A161BarFecSal ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV109TFPedidoCliente_Sel ,
                                           AV108TFPedidoCliente ,
                                           A13878PedidoClie ,
                                           AV42BarEncCli ,
                                           AV102BarEncCli_to ,
                                           Byte.valueOf(A213BarSit) ,
                                           AV101Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV33TFCliNom = GXutil.padr( GXutil.rtrim( AV33TFCliNom), 30, "%") ;
      lV35TFBarNHdr = GXutil.padr( GXutil.rtrim( AV35TFBarNHdr), 11, "%") ;
      lV47TFBarSer = GXutil.padr( GXutil.rtrim( AV47TFBarSer), 16, "%") ;
      lV51TFBarColNom = GXutil.padr( GXutil.rtrim( AV51TFBarColNom), 13, "%") ;
      lV53TFBarNomCli = GXutil.padr( GXutil.rtrim( AV53TFBarNomCli), 13, "%") ;
      /* Using cursor P08FN3 */
      pr_default.execute(0, new Object[] {AV101Emprcod, Integer.valueOf(AV43TFCliCod), Integer.valueOf(AV44TFCliCod_To), lV33TFCliNom, AV34TFCliNom_Sel, lV35TFBarNHdr, AV36TFBarNHdr_Sel, Short.valueOf(AV45TFBarTipArt), Short.valueOf(AV46TFBarTipArt_To), lV47TFBarSer, AV48TFBarSer_Sel, lV51TFBarColNom, AV52TFBarColNom_Sel, lV53TFBarNomCli, AV54TFBarNomCli_Sel, Integer.valueOf(AV55TFBarColNum), Integer.valueOf(AV56TFBarColNum_To), AV57TFBarFecCli, AV59TFBarKgm, AV60TFBarKgm_To, AV67TFBarMtr, AV68TFBarMtr_To, AV39BarFecSal, AV40BarFecSal_To, Integer.valueOf(AV73CliCod), Integer.valueOf(AV74CliCod_To), AV75BarSer, AV76BarSer_To, AV77BarColNom, AV78BarColNom_To, Integer.valueOf(AV106BarColNum), Integer.valueOf(AV107BarColNum_to), Short.valueOf(AV103BarTipArt), Short.valueOf(AV105BarTipArt_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A213BarSit = P08FN3_A213BarSit[0] ;
         A161BarFecSal = P08FN3_A161BarFecSal[0] ;
         A155BarFecCli = P08FN3_A155BarFecCli[0] ;
         A136BarColNum = P08FN3_A136BarColNum[0] ;
         A1234BarNomCli = P08FN3_A1234BarNomCli[0] ;
         A135BarColNom = P08FN3_A135BarColNom[0] ;
         A212BarSer = P08FN3_A212BarSer[0] ;
         A217BarTipArt = P08FN3_A217BarTipArt[0] ;
         n217BarTipArt = P08FN3_n217BarTipArt[0] ;
         A279CliNom = P08FN3_A279CliNom[0] ;
         A252CliCod = P08FN3_A252CliCod[0] ;
         n252CliCod = P08FN3_n252CliCod[0] ;
         A184BarMtr = P08FN3_A184BarMtr[0] ;
         A166BarKgm = P08FN3_A166BarKgm[0] ;
         A130BarCodPar = P08FN3_A130BarCodPar[0] ;
         A132BarCodReo = P08FN3_A132BarCodReo[0] ;
         A129BarCod = P08FN3_A129BarCod[0] ;
         A143BarDisNum = P08FN3_A143BarDisNum[0] ;
         A4812BarEncCli = P08FN3_A4812BarEncCli[0] ;
         A396EmprCod = P08FN3_A396EmprCod[0] ;
         A279CliNom = P08FN3_A279CliNom[0] ;
         A184BarMtr = P08FN3_A184BarMtr[0] ;
         A166BarKgm = P08FN3_A166BarKgm[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         informemermasdetallado_wcexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
         informemermasdetallado_wcexportcsv_impl.this.A4812BarEncCli = GXv_char4[0] ;
         informemermasdetallado_wcexportcsv_impl.this.A143BarDisNum = GXv_char5[0] ;
         informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV109TFPedidoCliente_Sel)==0) && ( ! (GXutil.strcmp("", AV108TFPedidoCliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV108TFPedidoCliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV109TFPedidoCliente_Sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV109TFPedidoCliente_Sel) == 0 ) ) )
            {
               if ( (GXutil.strcmp("", AV42BarEncCli)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV42BarEncCli) >= 0 ) ) )
               {
                  if ( (GXutil.strcmp("", AV102BarEncCli_to)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV102BarEncCli_to) <= 0 ) ) )
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
                        informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char6) ;
                        informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A217BarTipArt, 4, 0) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        GXt_char2 = AV41TipArtDsc ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char6) ;
                        informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV41TipArtDsc = GXt_char2 ;
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV41TipArtDsc, ";", ","), GXv_char6) ;
                        informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13878PedidoClie, ";", ","), GXv_char6) ;
                        informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char6) ;
                        informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char6) ;
                        informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char6[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char6) ;
                        informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
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
                        AV14TextFileLine += localUtil.dtoc( A155BarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A166BarKgm, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV61KgsExp = DecimalUtil.doubleToDec(0) ;
                        AV62Mtsexp = DecimalUtil.doubleToDec(0) ;
                        /* Optimized group. */
                        /* Using cursor P08FN4 */
                        pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                        c1261BarAlbKgmE = P08FN4_A1261BarAlbKgmE[0] ;
                        c1263BarAlbMtrE = P08FN4_A1263BarAlbMtrE[0] ;
                        pr_default.close(1);
                        AV61KgsExp = AV61KgsExp.add(c1261BarAlbKgmE) ;
                        AV62Mtsexp = AV62Mtsexp.add(c1263BarAlbMtrE) ;
                        /* End optimized group. */
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( AV61KgsExp, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV63DifKilos = ((AV61KgsExp.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : (AV61KgsExp.subtract(A166BarKgm))) ;
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( AV63DifKilos, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV64PorKgs = ((A166BarKgm.doubleValue()>0) ? (AV63DifKilos.divide(A166BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( AV64PorKgs, 6, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A184BarMtr, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( AV62Mtsexp, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV65DifMetros = ((AV62Mtsexp.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : (AV62Mtsexp.subtract(A184BarMtr))) ;
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( AV65DifMetros, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV66PorMts = ((A184BarMtr.doubleValue()>0) ? (AV65DifMetros.divide(A184BarMtr, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( AV66PorMts, 6, 2) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=InformeMermasDetallado_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cod. Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nom. Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNHdr", "", "O.S. - R", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarTipArt", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&TipArtDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PedidoCliente", "", "Enc Cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSer", "", "Artigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNom", "", "Cod. Cor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNomCli", "", "Cor Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFecCli", "", "Data", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarKgm", "", "Qgs. Entrado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&KgsExp", "", "Qgs. Saidos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&DifKilos", "", "Qgs. Difer", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PorKgs", "", "Qgs. %", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarMtr", "", "Mts. Entrado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Mtsexp", "", "Mts. Saidos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&DifMetros", "", "Mts. Difer", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PorMts", "", "Mts. %", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char6[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "InformeMermasDetallado_WCColumnsSelector", GXv_char6) ;
      informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("InformeMermasDetallado_WCGridState"), "") == 0 )
      {
         AV31GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "InformeMermasDetallado_WCGridState"), null, null);
      }
      else
      {
         AV31GridState.fromxml(AV19Session.getValue("InformeMermasDetallado_WCGridState"), null, null);
      }
      AV28OrderedBy = AV31GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV31GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV132GXV1 = 1 ;
      while ( AV132GXV1 <= AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV32GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV31GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV132GXV1));
         if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV43TFCliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFCliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV33TFCliNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV34TFCliNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV35TFBarNHdr = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV36TFBarNHdr_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV45TFBarTipArt = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFBarTipArt_To = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV108TFPedidoCliente = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV109TFPedidoCliente_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV47TFBarSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV48TFBarSer_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV51TFBarColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV52TFBarColNom_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV53TFBarNomCli = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV54TFBarNomCli_Sel = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV55TFBarColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFBarColNum_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV57TFBarFecCli = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV59TFBarKgm = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFBarKgm_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV67TFBarMtr = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV68TFBarMtr_To = CommonUtil.decimalVal( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV101Emprcod = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSAL") == 0 )
         {
            AV39BarFecSal = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECSAL_TO") == 0 )
         {
            AV40BarFecSal_To = localUtil.ctod( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV77BarColNom = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM_TO") == 0 )
         {
            AV78BarColNom_To = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV106BarColNum = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM_TO") == 0 )
         {
            AV107BarColNum_to = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV75BarSer = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER_TO") == 0 )
         {
            AV76BarSer_To = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV73CliCod = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV74CliCod_To = (int)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARENCCLI") == 0 )
         {
            AV42BarEncCli = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARENCCLI_TO") == 0 )
         {
            AV102BarEncCli_to = AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPART") == 0 )
         {
            AV103BarTipArt = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARTIPART_TO") == 0 )
         {
            AV105BarTipArt_to = (short)(GXutil.lval( AV32GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV132GXV1 = (int)(AV132GXV1+1) ;
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

   public void S201( )
   {
      /* 'CARGADATOSFILTROS' Routine */
      returnInSub = false ;
      GXt_char2 = AV122Station ;
      GXv_char6[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      informemermasdetallado_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
      AV122Station = GXt_char2 ;
      GXv_char6[0] = AV101Emprcod ;
      GXv_char5[0] = AV123EmprNom ;
      GXv_char4[0] = AV124UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV122Station, GXv_char6, GXv_char5, GXv_char4) ;
      informemermasdetallado_wcexportcsv_impl.this.AV101Emprcod = GXv_char6[0] ;
      informemermasdetallado_wcexportcsv_impl.this.AV123EmprNom = GXv_char5[0] ;
      informemermasdetallado_wcexportcsv_impl.this.AV124UsurCod = GXv_char4[0] ;
      AV125BarFecSal_char = GXutil.upper( GXutil.trim( AV127WebSession.getValue("InformeMermasDetallado_WC_BarFecSal"))) ;
      AV127WebSession.remove("InformeMermasDetallado_WC_BarFecSal");
      AV126BarFecSal_to_char = GXutil.upper( GXutil.trim( AV127WebSession.getValue("InformeMermasDetallado_WC_BarFecSal_to"))) ;
      AV127WebSession.remove("InformeMermasDetallado_WC_BarFecSal_to");
   }

   public void S211( )
   {
      /* 'TITULODATOSFILTROS' Routine */
      returnInSub = false ;
      AV14TextFileLine += AV123EmprNom + " " + "(" + AV133Pgmdesc + ")" + " " ;
      AV14TextFileLine += httpContext.getMessage( "Fecha Salida Inicial: ", "") + " " + AV125BarFecSal_char + " " ;
      AV14TextFileLine += httpContext.getMessage( "Fecha Salida Final: ", "") + " " + AV126BarFecSal_to_char ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(AV14TextFileLine);
         AV10TextFile.writeLine(" ");
      }
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
      scmdbuf = "" ;
      lV33TFCliNom = "" ;
      lV35TFBarNHdr = "" ;
      lV47TFBarSer = "" ;
      lV51TFBarColNom = "" ;
      lV53TFBarNomCli = "" ;
      AV34TFCliNom_Sel = "" ;
      AV33TFCliNom = "" ;
      AV36TFBarNHdr_Sel = "" ;
      AV35TFBarNHdr = "" ;
      AV48TFBarSer_Sel = "" ;
      AV47TFBarSer = "" ;
      AV52TFBarColNom_Sel = "" ;
      AV51TFBarColNom = "" ;
      AV54TFBarNomCli_Sel = "" ;
      AV53TFBarNomCli = "" ;
      AV57TFBarFecCli = GXutil.nullDate() ;
      AV59TFBarKgm = DecimalUtil.ZERO ;
      AV60TFBarKgm_To = DecimalUtil.ZERO ;
      AV67TFBarMtr = DecimalUtil.ZERO ;
      AV68TFBarMtr_To = DecimalUtil.ZERO ;
      AV39BarFecSal = GXutil.nullDate() ;
      AV40BarFecSal_To = GXutil.nullDate() ;
      AV75BarSer = "" ;
      AV76BarSer_To = "" ;
      AV77BarColNom = "" ;
      AV78BarColNom_To = "" ;
      A279CliNom = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A161BarFecSal = GXutil.nullDate() ;
      AV109TFPedidoCliente_Sel = "" ;
      AV108TFPedidoCliente = "" ;
      A13878PedidoClie = "" ;
      AV42BarEncCli = "" ;
      AV102BarEncCli_to = "" ;
      AV101Emprcod = "" ;
      A396EmprCod = "" ;
      P08FN3_A213BarSit = new byte[1] ;
      P08FN3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FN3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FN3_A136BarColNum = new int[1] ;
      P08FN3_A1234BarNomCli = new String[] {""} ;
      P08FN3_A135BarColNom = new String[] {""} ;
      P08FN3_A212BarSer = new String[] {""} ;
      P08FN3_A217BarTipArt = new short[1] ;
      P08FN3_n217BarTipArt = new boolean[] {false} ;
      P08FN3_A279CliNom = new String[] {""} ;
      P08FN3_A252CliCod = new int[1] ;
      P08FN3_n252CliCod = new boolean[] {false} ;
      P08FN3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FN3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FN3_A130BarCodPar = new String[] {""} ;
      P08FN3_A132BarCodReo = new byte[1] ;
      P08FN3_A129BarCod = new int[1] ;
      P08FN3_A143BarDisNum = new String[] {""} ;
      P08FN3_A4812BarEncCli = new String[] {""} ;
      P08FN3_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      GXv_char3 = new String[1] ;
      A13696BarNHdr = "" ;
      AV41TipArtDsc = "" ;
      AV61KgsExp = DecimalUtil.ZERO ;
      AV62Mtsexp = DecimalUtil.ZERO ;
      c1261BarAlbKgmE = DecimalUtil.ZERO ;
      c1263BarAlbMtrE = DecimalUtil.ZERO ;
      P08FN4_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FN4_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV63DifKilos = DecimalUtil.ZERO ;
      AV64PorKgs = DecimalUtil.ZERO ;
      AV65DifMetros = DecimalUtil.ZERO ;
      AV66PorMts = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV31GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV32GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV122Station = "" ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      AV123EmprNom = "" ;
      GXv_char5 = new String[1] ;
      AV124UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV125BarFecSal_char = "" ;
      AV127WebSession = httpContext.getWebSession();
      AV126BarFecSal_to_char = "" ;
      AV133Pgmdesc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informemermasdetallado_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P08FN3_A213BarSit, P08FN3_A161BarFecSal, P08FN3_A155BarFecCli, P08FN3_A136BarColNum, P08FN3_A1234BarNomCli, P08FN3_A135BarColNom, P08FN3_A212BarSer, P08FN3_A217BarTipArt, P08FN3_n217BarTipArt, P08FN3_A279CliNom,
            P08FN3_A252CliCod, P08FN3_n252CliCod, P08FN3_A184BarMtr, P08FN3_A166BarKgm, P08FN3_A130BarCodPar, P08FN3_A132BarCodReo, P08FN3_A129BarCod, P08FN3_A143BarDisNum, P08FN3_A4812BarEncCli, P08FN3_A396EmprCod
            }
            , new Object[] {
            P08FN4_A1261BarAlbKgmE, P08FN4_A1263BarAlbMtrE
            }
         }
      );
      AV133Pgmdesc = httpContext.getMessage( "Informe Mermas Detallado_WCExport CSV", "") ;
      /* GeneXus formulas. */
      AV133Pgmdesc = httpContext.getMessage( "Informe Mermas Detallado_WCExport CSV", "") ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short gxcookieaux ;
   private short AV45TFBarTipArt ;
   private short AV46TFBarTipArt_To ;
   private short AV103BarTipArt ;
   private short AV105BarTipArt_to ;
   private short A217BarTipArt ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV43TFCliCod ;
   private int AV44TFCliCod_To ;
   private int AV55TFBarColNum ;
   private int AV56TFBarColNum_To ;
   private int AV73CliCod ;
   private int AV74CliCod_To ;
   private int AV106BarColNum ;
   private int AV107BarColNum_to ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV132GXV1 ;
   private java.math.BigDecimal AV59TFBarKgm ;
   private java.math.BigDecimal AV60TFBarKgm_To ;
   private java.math.BigDecimal AV67TFBarMtr ;
   private java.math.BigDecimal AV68TFBarMtr_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV61KgsExp ;
   private java.math.BigDecimal AV62Mtsexp ;
   private java.math.BigDecimal c1261BarAlbKgmE ;
   private java.math.BigDecimal c1263BarAlbMtrE ;
   private java.math.BigDecimal AV63DifKilos ;
   private java.math.BigDecimal AV64PorKgs ;
   private java.math.BigDecimal AV65DifMetros ;
   private java.math.BigDecimal AV66PorMts ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String scmdbuf ;
   private String lV33TFCliNom ;
   private String lV35TFBarNHdr ;
   private String lV47TFBarSer ;
   private String lV51TFBarColNom ;
   private String lV53TFBarNomCli ;
   private String AV34TFCliNom_Sel ;
   private String AV33TFCliNom ;
   private String AV36TFBarNHdr_Sel ;
   private String AV35TFBarNHdr ;
   private String AV48TFBarSer_Sel ;
   private String AV47TFBarSer ;
   private String AV52TFBarColNom_Sel ;
   private String AV51TFBarColNom ;
   private String AV54TFBarNomCli_Sel ;
   private String AV53TFBarNomCli ;
   private String AV75BarSer ;
   private String AV76BarSer_To ;
   private String AV77BarColNom ;
   private String AV78BarColNom_To ;
   private String A279CliNom ;
   private String A130BarCodPar ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String AV109TFPedidoCliente_Sel ;
   private String AV108TFPedidoCliente ;
   private String A13878PedidoClie ;
   private String AV42BarEncCli ;
   private String AV102BarEncCli_to ;
   private String AV101Emprcod ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String GXv_char3[] ;
   private String A13696BarNHdr ;
   private String AV41TipArtDsc ;
   private String AV122Station ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private String AV123EmprNom ;
   private String GXv_char5[] ;
   private String AV124UsurCod ;
   private String GXv_char4[] ;
   private String AV125BarFecSal_char ;
   private String AV126BarFecSal_to_char ;
   private String AV133Pgmdesc ;
   private java.util.Date AV57TFBarFecCli ;
   private java.util.Date AV39BarFecSal ;
   private java.util.Date AV40BarFecSal_To ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A161BarFecSal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.WebSession AV127WebSession ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P08FN3_A213BarSit ;
   private java.util.Date[] P08FN3_A161BarFecSal ;
   private java.util.Date[] P08FN3_A155BarFecCli ;
   private int[] P08FN3_A136BarColNum ;
   private String[] P08FN3_A1234BarNomCli ;
   private String[] P08FN3_A135BarColNom ;
   private String[] P08FN3_A212BarSer ;
   private short[] P08FN3_A217BarTipArt ;
   private boolean[] P08FN3_n217BarTipArt ;
   private String[] P08FN3_A279CliNom ;
   private int[] P08FN3_A252CliCod ;
   private boolean[] P08FN3_n252CliCod ;
   private java.math.BigDecimal[] P08FN3_A184BarMtr ;
   private java.math.BigDecimal[] P08FN3_A166BarKgm ;
   private String[] P08FN3_A130BarCodPar ;
   private byte[] P08FN3_A132BarCodReo ;
   private int[] P08FN3_A129BarCod ;
   private String[] P08FN3_A143BarDisNum ;
   private String[] P08FN3_A4812BarEncCli ;
   private String[] P08FN3_A396EmprCod ;
   private java.math.BigDecimal[] P08FN4_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P08FN4_A1263BarAlbMtrE ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV31GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV32GridStateFilterValue ;
}

final  class informemermasdetallado_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV43TFCliCod ,
                                          int AV44TFCliCod_To ,
                                          String AV34TFCliNom_Sel ,
                                          String AV33TFCliNom ,
                                          String AV36TFBarNHdr_Sel ,
                                          String AV35TFBarNHdr ,
                                          short AV45TFBarTipArt ,
                                          short AV46TFBarTipArt_To ,
                                          String AV48TFBarSer_Sel ,
                                          String AV47TFBarSer ,
                                          String AV52TFBarColNom_Sel ,
                                          String AV51TFBarColNom ,
                                          String AV54TFBarNomCli_Sel ,
                                          String AV53TFBarNomCli ,
                                          int AV55TFBarColNum ,
                                          int AV56TFBarColNum_To ,
                                          java.util.Date AV57TFBarFecCli ,
                                          java.math.BigDecimal AV59TFBarKgm ,
                                          java.math.BigDecimal AV60TFBarKgm_To ,
                                          java.math.BigDecimal AV67TFBarMtr ,
                                          java.math.BigDecimal AV68TFBarMtr_To ,
                                          java.util.Date AV39BarFecSal ,
                                          java.util.Date AV40BarFecSal_To ,
                                          int AV73CliCod ,
                                          int AV74CliCod_To ,
                                          String AV75BarSer ,
                                          String AV76BarSer_To ,
                                          String AV77BarColNom ,
                                          String AV78BarColNom_To ,
                                          int AV106BarColNum ,
                                          int AV107BarColNum_to ,
                                          short AV103BarTipArt ,
                                          short AV105BarTipArt_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A217BarTipArt ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          int A136BarColNum ,
                                          java.util.Date A155BarFecCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A161BarFecSal ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV109TFPedidoCliente_Sel ,
                                          String AV108TFPedidoCliente ,
                                          String A13878PedidoClie ,
                                          String AV42BarEncCli ,
                                          String AV102BarEncCli_to ,
                                          byte A213BarSit ,
                                          String AV101Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[34];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.BarSit, T1.BarFecSal, T1.BarFecCli, T1.BarColNum, T1.BarNomCli, T1.BarColNom, T1.BarSer, T1.BarTipArt, T2.CliNom, T1.CliCod, COALESCE( T3.BarMtr, 0) AS" ;
      scmdbuf += " BarMtr, COALESCE( T3.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli, T1.EmprCod FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm" ;
      scmdbuf += " FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      if ( ! (0==AV43TFCliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (0==AV44TFCliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV34TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV33TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV34TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV36TFBarNHdr_Sel)==0) && ( ! (GXutil.strcmp("", AV35TFBarNHdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV36TFBarNHdr_Sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! (0==AV45TFBarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarTipArt_To) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV53TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (0==AV55TFBarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (0==AV56TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57TFBarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T3.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40BarFecSal_To)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV73CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV74CliCod_To) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76BarSer_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78BarColNom_To)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV106BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (0==AV107BarColNum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (0==AV103BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV105BarTipArt_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P08FN3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (java.util.Date)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).shortValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , (java.util.Date)dynConstraints[43] , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() , ((Boolean) dynConstraints[48]).booleanValue() , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FN4", "SELECT SUM(BarAlbKgmE), SUM(BarAlbMtrE) FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((int[]) buf[16])[0] = rslt.getInt(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 8);
               ((String[]) buf[18])[0] = rslt.getString(17, 20);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

