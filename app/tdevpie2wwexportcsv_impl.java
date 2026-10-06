package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpie2wwexportcsv_impl extends GXWebProcedure
{
   public tdevpie2wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TDevPie2WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TDevPie2WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TDevPie2WWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Devolucion ID", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha de Devolucion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Recepcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Domicilio Envio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cdg.Ref.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und.Disp.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas Disponibles", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Dev", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas Dev", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV88Tdevpie2wwds_1_filterfulltext = AV82FilterFullText ;
      AV89Tdevpie2wwds_2_tfdevgencod = AV54TFDevGenCod ;
      AV90Tdevpie2wwds_3_tfdevgencod_to = AV55TFDevGenCod_To ;
      AV91Tdevpie2wwds_4_tfdevgenfec = AV56TFDevGenFec ;
      AV92Tdevpie2wwds_5_tfalbreccod = AV58TFAlbRecCod ;
      AV93Tdevpie2wwds_6_tfalbreccod_to = AV59TFAlbRecCod_To ;
      AV94Tdevpie2wwds_7_tfdevgendom = AV60TFDevGenDom ;
      AV95Tdevpie2wwds_8_tfdevgendom_to = AV61TFDevGenDom_To ;
      AV96Tdevpie2wwds_9_tfclicod = AV62TFCliCod ;
      AV97Tdevpie2wwds_10_tfclicod_to = AV63TFCliCod_To ;
      AV98Tdevpie2wwds_11_tfclinom = AV64TFCliNom ;
      AV99Tdevpie2wwds_12_tfclinom_sel = AV65TFCliNom_Sel ;
      AV100Tdevpie2wwds_13_tfalbref = AV66TFAlbRef ;
      AV101Tdevpie2wwds_14_tfalbref_sel = AV67TFAlbRef_Sel ;
      AV102Tdevpie2wwds_15_tfdevgentrn = AV68TFDevGenTrn ;
      AV103Tdevpie2wwds_16_tfdevgentrn_to = AV69TFDevGenTrn_To ;
      AV104Tdevpie2wwds_17_tfdevtrnnom = AV70TFDevTrnNom ;
      AV105Tdevpie2wwds_18_tfdevtrnnom_sel = AV71TFDevTrnNom_Sel ;
      AV106Tdevpie2wwds_19_tfalbrunidis = AV72TFAlbRUniDis ;
      AV107Tdevpie2wwds_20_tfalbrunidis_to = AV73TFAlbRUniDis_To ;
      AV108Tdevpie2wwds_21_tfalbrpiedis = AV74TFAlbRPieDis ;
      AV109Tdevpie2wwds_22_tfalbrpiedis_to = AV75TFAlbRPieDis_To ;
      AV110Tdevpie2wwds_23_tfalbruni_sels = AV84TFAlbRUni_Sels ;
      AV111Tdevpie2wwds_24_tfdevgenuni = AV78TFDevGenUni ;
      AV112Tdevpie2wwds_25_tfdevgenuni_to = AV79TFDevGenUni_To ;
      AV113Tdevpie2wwds_26_tfdevgenpie = AV80TFDevGenPie ;
      AV114Tdevpie2wwds_27_tfdevgenpie_to = AV81TFDevGenPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV110Tdevpie2wwds_23_tfalbruni_sels ,
                                           Integer.valueOf(AV89Tdevpie2wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV90Tdevpie2wwds_3_tfdevgencod_to) ,
                                           AV91Tdevpie2wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV92Tdevpie2wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV93Tdevpie2wwds_6_tfalbreccod_to) ,
                                           Byte.valueOf(AV94Tdevpie2wwds_7_tfdevgendom) ,
                                           Byte.valueOf(AV95Tdevpie2wwds_8_tfdevgendom_to) ,
                                           Integer.valueOf(AV96Tdevpie2wwds_9_tfclicod) ,
                                           Integer.valueOf(AV97Tdevpie2wwds_10_tfclicod_to) ,
                                           AV99Tdevpie2wwds_12_tfclinom_sel ,
                                           AV98Tdevpie2wwds_11_tfclinom ,
                                           AV101Tdevpie2wwds_14_tfalbref_sel ,
                                           AV100Tdevpie2wwds_13_tfalbref ,
                                           Short.valueOf(AV102Tdevpie2wwds_15_tfdevgentrn) ,
                                           Short.valueOf(AV103Tdevpie2wwds_16_tfdevgentrn_to) ,
                                           AV105Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                           AV104Tdevpie2wwds_17_tfdevtrnnom ,
                                           AV106Tdevpie2wwds_19_tfalbrunidis ,
                                           AV107Tdevpie2wwds_20_tfalbrunidis_to ,
                                           Integer.valueOf(AV108Tdevpie2wwds_21_tfalbrpiedis) ,
                                           Integer.valueOf(AV109Tdevpie2wwds_22_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV110Tdevpie2wwds_23_tfalbruni_sels.size()) ,
                                           AV111Tdevpie2wwds_24_tfdevgenuni ,
                                           AV112Tdevpie2wwds_25_tfdevgenuni_to ,
                                           Short.valueOf(AV113Tdevpie2wwds_26_tfdevgenpie) ,
                                           Short.valueOf(AV114Tdevpie2wwds_27_tfdevgenpie_to) ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           Byte.valueOf(A6288DevGenDom) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           Short.valueOf(A327DevGenTrn) ,
                                           A329DevTrnNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV88Tdevpie2wwds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV98Tdevpie2wwds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV98Tdevpie2wwds_11_tfclinom), 30, "%") ;
      lV100Tdevpie2wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV100Tdevpie2wwds_13_tfalbref), 16, "%") ;
      lV104Tdevpie2wwds_17_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV104Tdevpie2wwds_17_tfdevtrnnom), 30, "%") ;
      /* Using cursor P086Q2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV89Tdevpie2wwds_2_tfdevgencod), Integer.valueOf(AV90Tdevpie2wwds_3_tfdevgencod_to), AV91Tdevpie2wwds_4_tfdevgenfec, Integer.valueOf(AV92Tdevpie2wwds_5_tfalbreccod), Integer.valueOf(AV93Tdevpie2wwds_6_tfalbreccod_to), Byte.valueOf(AV94Tdevpie2wwds_7_tfdevgendom), Byte.valueOf(AV95Tdevpie2wwds_8_tfdevgendom_to), Integer.valueOf(AV96Tdevpie2wwds_9_tfclicod), Integer.valueOf(AV97Tdevpie2wwds_10_tfclicod_to), lV98Tdevpie2wwds_11_tfclinom, AV99Tdevpie2wwds_12_tfclinom_sel, lV100Tdevpie2wwds_13_tfalbref, AV101Tdevpie2wwds_14_tfalbref_sel, Short.valueOf(AV102Tdevpie2wwds_15_tfdevgentrn), Short.valueOf(AV103Tdevpie2wwds_16_tfdevgentrn_to), lV104Tdevpie2wwds_17_tfdevtrnnom, AV105Tdevpie2wwds_18_tfdevtrnnom_sel, AV106Tdevpie2wwds_19_tfalbrunidis, AV107Tdevpie2wwds_20_tfalbrunidis_to, Integer.valueOf(AV108Tdevpie2wwds_21_tfalbrpiedis), Integer.valueOf(AV109Tdevpie2wwds_22_tfalbrpiedis_to), AV111Tdevpie2wwds_24_tfdevgenuni, AV112Tdevpie2wwds_25_tfdevgenuni_to, Short.valueOf(AV113Tdevpie2wwds_26_tfdevgenpie), Short.valueOf(AV114Tdevpie2wwds_27_tfdevgenpie_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P086Q2_A396EmprCod[0] ;
         A326DevGenPie = P086Q2_A326DevGenPie[0] ;
         n326DevGenPie = P086Q2_n326DevGenPie[0] ;
         A328DevGenUni = P086Q2_A328DevGenUni[0] ;
         n328DevGenUni = P086Q2_n328DevGenUni[0] ;
         A51AlbRPieDis = P086Q2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086Q2_A57AlbRUniDis[0] ;
         A329DevTrnNom = P086Q2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086Q2_n329DevTrnNom[0] ;
         A327DevGenTrn = P086Q2_A327DevGenTrn[0] ;
         n327DevGenTrn = P086Q2_n327DevGenTrn[0] ;
         A45AlbRef = P086Q2_A45AlbRef[0] ;
         A279CliNom = P086Q2_A279CliNom[0] ;
         A252CliCod = P086Q2_A252CliCod[0] ;
         n252CliCod = P086Q2_n252CliCod[0] ;
         A6288DevGenDom = P086Q2_A6288DevGenDom[0] ;
         n6288DevGenDom = P086Q2_n6288DevGenDom[0] ;
         A44AlbRecCod = P086Q2_A44AlbRecCod[0] ;
         n44AlbRecCod = P086Q2_n44AlbRecCod[0] ;
         A325DevGenFec = P086Q2_A325DevGenFec[0] ;
         n325DevGenFec = P086Q2_n325DevGenFec[0] ;
         A323DevGenCod = P086Q2_A323DevGenCod[0] ;
         A56AlbRUni = P086Q2_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086Q2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086Q2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086Q2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086Q2_A60AlbRUniUti[0] ;
         A329DevTrnNom = P086Q2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086Q2_n329DevTrnNom[0] ;
         A279CliNom = P086Q2_A279CliNom[0] ;
         A51AlbRPieDis = P086Q2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P086Q2_A57AlbRUniDis[0] ;
         A45AlbRef = P086Q2_A45AlbRef[0] ;
         A56AlbRUni = P086Q2_A56AlbRUni[0] ;
         A52AlbRPieEnt = P086Q2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P086Q2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P086Q2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P086Q2_A60AlbRUniUti[0] ;
         if ( (GXutil.strcmp("", AV88Tdevpie2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV88Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV88Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A6288DevGenDom, 1, 0) , GXutil.padr( "%" + AV88Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV88Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV88Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV88Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A327DevGenTrn, 4, 0) , GXutil.padr( "%" + AV88Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV88Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV88Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV88Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV88Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV88Tdevpie2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV88Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV88Tdevpie2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV14TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S162 ();
            if ( returnInSub )
            {
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
               AV14TextFileLine += GXutil.str( A323DevGenCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A325DevGenFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A44AlbRecCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A6288DevGenDom, 1, 0) ;
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
               tdevpie2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A45AlbRef, ";", ","), GXv_char3) ;
               tdevpie2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A327DevGenTrn, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A329DevTrnNom, ";", ","), GXv_char3) ;
               tdevpie2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A57AlbRUniDis, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A51AlbRPieDis, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "K") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "K", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "M") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "M", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A328DevGenUni, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A326DevGenPie, 4, 0) ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TDevPie2WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevGenCod", "", "N Devolucion ID", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevGenFec", "", "Fecha de Devolucion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevGenDom", "", "Domicilio Envio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRef", "", "Cdg.Ref.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevGenTrn", "", "Transportista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevTrnNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUniDis", "", "Und.Disp.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRPieDis", "", "Piezas Disponibles", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUni", "", "Unidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevGenUni", "", "Unidades Dev", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevGenPie", "", "Piezas Dev", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TDevPie2WWColumnsSelector", GXv_char3) ;
      tdevpie2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TDevPie2WWGridState"), "") == 0 )
      {
         AV52GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDevPie2WWGridState"), null, null);
      }
      else
      {
         AV52GridState.fromxml(AV19Session.getValue("TDevPie2WWGridState"), null, null);
      }
      AV28OrderedBy = AV52GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV52GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV115GXV1 = 1 ;
      while ( AV115GXV1 <= AV52GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV53GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV52GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV115GXV1));
         if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV82FilterFullText = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENCOD") == 0 )
         {
            AV54TFDevGenCod = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFDevGenCod_To = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENFEC") == 0 )
         {
            AV56TFDevGenFec = localUtil.ctod( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV58TFAlbRecCod = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV59TFAlbRecCod_To = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENDOM") == 0 )
         {
            AV60TFDevGenDom = (byte)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFDevGenDom_To = (byte)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV62TFCliCod = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFCliCod_To = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV64TFCliNom = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV65TFCliNom_Sel = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV66TFAlbRef = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV67TFAlbRef_Sel = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENTRN") == 0 )
         {
            AV68TFDevGenTrn = (short)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFDevGenTrn_To = (short)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM") == 0 )
         {
            AV70TFDevTrnNom = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM_SEL") == 0 )
         {
            AV71TFDevTrnNom_Sel = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV72TFAlbRUniDis = CommonUtil.decimalVal( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV73TFAlbRUniDis_To = CommonUtil.decimalVal( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV74TFAlbRPieDis = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFAlbRPieDis_To = (int)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV83TFAlbRUni_SelsJson = AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV84TFAlbRUni_Sels.fromJSonString(AV83TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENUNI") == 0 )
         {
            AV78TFDevGenUni = CommonUtil.decimalVal( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV79TFDevGenUni_To = CommonUtil.decimalVal( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENPIE") == 0 )
         {
            AV80TFDevGenPie = (short)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV81TFDevGenPie_To = (short)(GXutil.lval( AV53GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV115GXV1 = (int)(AV115GXV1+1) ;
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
      A325DevGenFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A329DevTrnNom = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      AV88Tdevpie2wwds_1_filterfulltext = "" ;
      AV82FilterFullText = "" ;
      AV91Tdevpie2wwds_4_tfdevgenfec = GXutil.nullDate() ;
      AV56TFDevGenFec = GXutil.nullDate() ;
      AV98Tdevpie2wwds_11_tfclinom = "" ;
      AV64TFCliNom = "" ;
      AV99Tdevpie2wwds_12_tfclinom_sel = "" ;
      AV65TFCliNom_Sel = "" ;
      AV100Tdevpie2wwds_13_tfalbref = "" ;
      AV66TFAlbRef = "" ;
      AV101Tdevpie2wwds_14_tfalbref_sel = "" ;
      AV67TFAlbRef_Sel = "" ;
      AV104Tdevpie2wwds_17_tfdevtrnnom = "" ;
      AV70TFDevTrnNom = "" ;
      AV105Tdevpie2wwds_18_tfdevtrnnom_sel = "" ;
      AV71TFDevTrnNom_Sel = "" ;
      AV106Tdevpie2wwds_19_tfalbrunidis = DecimalUtil.ZERO ;
      AV72TFAlbRUniDis = DecimalUtil.ZERO ;
      AV107Tdevpie2wwds_20_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV73TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV110Tdevpie2wwds_23_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV84TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV111Tdevpie2wwds_24_tfdevgenuni = DecimalUtil.ZERO ;
      AV78TFDevGenUni = DecimalUtil.ZERO ;
      AV112Tdevpie2wwds_25_tfdevgenuni_to = DecimalUtil.ZERO ;
      AV79TFDevGenUni_To = DecimalUtil.ZERO ;
      lV88Tdevpie2wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV98Tdevpie2wwds_11_tfclinom = "" ;
      lV100Tdevpie2wwds_13_tfalbref = "" ;
      lV104Tdevpie2wwds_17_tfdevtrnnom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      P086Q2_A396EmprCod = new String[] {""} ;
      P086Q2_A326DevGenPie = new short[1] ;
      P086Q2_n326DevGenPie = new boolean[] {false} ;
      P086Q2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086Q2_n328DevGenUni = new boolean[] {false} ;
      P086Q2_A51AlbRPieDis = new int[1] ;
      P086Q2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086Q2_A329DevTrnNom = new String[] {""} ;
      P086Q2_n329DevTrnNom = new boolean[] {false} ;
      P086Q2_A327DevGenTrn = new short[1] ;
      P086Q2_n327DevGenTrn = new boolean[] {false} ;
      P086Q2_A45AlbRef = new String[] {""} ;
      P086Q2_A279CliNom = new String[] {""} ;
      P086Q2_A252CliCod = new int[1] ;
      P086Q2_n252CliCod = new boolean[] {false} ;
      P086Q2_A6288DevGenDom = new byte[1] ;
      P086Q2_n6288DevGenDom = new boolean[] {false} ;
      P086Q2_A44AlbRecCod = new int[1] ;
      P086Q2_n44AlbRecCod = new boolean[] {false} ;
      P086Q2_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086Q2_n325DevGenFec = new boolean[] {false} ;
      P086Q2_A323DevGenCod = new int[1] ;
      P086Q2_A56AlbRUni = new String[] {""} ;
      P086Q2_A52AlbRPieEnt = new int[1] ;
      P086Q2_A54AlbRPieUti = new int[1] ;
      P086Q2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086Q2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV52GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV53GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV83TFAlbRUni_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie2wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P086Q2_A396EmprCod, P086Q2_A326DevGenPie, P086Q2_n326DevGenPie, P086Q2_A328DevGenUni, P086Q2_n328DevGenUni, P086Q2_A51AlbRPieDis, P086Q2_A57AlbRUniDis, P086Q2_A329DevTrnNom, P086Q2_n329DevTrnNom, P086Q2_A327DevGenTrn,
            P086Q2_n327DevGenTrn, P086Q2_A45AlbRef, P086Q2_A279CliNom, P086Q2_A252CliCod, P086Q2_n252CliCod, P086Q2_A6288DevGenDom, P086Q2_n6288DevGenDom, P086Q2_A44AlbRecCod, P086Q2_n44AlbRecCod, P086Q2_A325DevGenFec,
            P086Q2_n325DevGenFec, P086Q2_A323DevGenCod, P086Q2_A56AlbRUni, P086Q2_A52AlbRPieEnt, P086Q2_A54AlbRPieUti, P086Q2_A58AlbRUniEnt, P086Q2_A60AlbRUniUti
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A6288DevGenDom ;
   private byte AV94Tdevpie2wwds_7_tfdevgendom ;
   private byte AV60TFDevGenDom ;
   private byte AV95Tdevpie2wwds_8_tfdevgendom_to ;
   private byte AV61TFDevGenDom_To ;
   private short gxcookieaux ;
   private short A327DevGenTrn ;
   private short A326DevGenPie ;
   private short AV102Tdevpie2wwds_15_tfdevgentrn ;
   private short AV68TFDevGenTrn ;
   private short AV103Tdevpie2wwds_16_tfdevgentrn_to ;
   private short AV69TFDevGenTrn_To ;
   private short AV113Tdevpie2wwds_26_tfdevgenpie ;
   private short AV80TFDevGenPie ;
   private short AV114Tdevpie2wwds_27_tfdevgenpie_to ;
   private short AV81TFDevGenPie_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A51AlbRPieDis ;
   private int AV89Tdevpie2wwds_2_tfdevgencod ;
   private int AV54TFDevGenCod ;
   private int AV90Tdevpie2wwds_3_tfdevgencod_to ;
   private int AV55TFDevGenCod_To ;
   private int AV92Tdevpie2wwds_5_tfalbreccod ;
   private int AV58TFAlbRecCod ;
   private int AV93Tdevpie2wwds_6_tfalbreccod_to ;
   private int AV59TFAlbRecCod_To ;
   private int AV96Tdevpie2wwds_9_tfclicod ;
   private int AV62TFCliCod ;
   private int AV97Tdevpie2wwds_10_tfclicod_to ;
   private int AV63TFCliCod_To ;
   private int AV108Tdevpie2wwds_21_tfalbrpiedis ;
   private int AV74TFAlbRPieDis ;
   private int AV109Tdevpie2wwds_22_tfalbrpiedis_to ;
   private int AV75TFAlbRPieDis_To ;
   private int AV110Tdevpie2wwds_23_tfalbruni_sels_size ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int AV115GXV1 ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal AV106Tdevpie2wwds_19_tfalbrunidis ;
   private java.math.BigDecimal AV72TFAlbRUniDis ;
   private java.math.BigDecimal AV107Tdevpie2wwds_20_tfalbrunidis_to ;
   private java.math.BigDecimal AV73TFAlbRUniDis_To ;
   private java.math.BigDecimal AV111Tdevpie2wwds_24_tfdevgenuni ;
   private java.math.BigDecimal AV78TFDevGenUni ;
   private java.math.BigDecimal AV112Tdevpie2wwds_25_tfdevgenuni_to ;
   private java.math.BigDecimal AV79TFDevGenUni_To ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A329DevTrnNom ;
   private String A56AlbRUni ;
   private String AV98Tdevpie2wwds_11_tfclinom ;
   private String AV64TFCliNom ;
   private String AV99Tdevpie2wwds_12_tfclinom_sel ;
   private String AV65TFCliNom_Sel ;
   private String AV100Tdevpie2wwds_13_tfalbref ;
   private String AV66TFAlbRef ;
   private String AV101Tdevpie2wwds_14_tfalbref_sel ;
   private String AV67TFAlbRef_Sel ;
   private String AV104Tdevpie2wwds_17_tfdevtrnnom ;
   private String AV70TFDevTrnNom ;
   private String AV105Tdevpie2wwds_18_tfdevtrnnom_sel ;
   private String AV71TFDevTrnNom_Sel ;
   private String scmdbuf ;
   private String lV98Tdevpie2wwds_11_tfclinom ;
   private String lV100Tdevpie2wwds_13_tfalbref ;
   private String lV104Tdevpie2wwds_17_tfdevtrnnom ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date AV91Tdevpie2wwds_4_tfdevgenfec ;
   private java.util.Date AV56TFDevGenFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean n329DevTrnNom ;
   private boolean n327DevGenTrn ;
   private boolean n252CliCod ;
   private boolean n6288DevGenDom ;
   private boolean n44AlbRecCod ;
   private boolean n325DevGenFec ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV83TFAlbRUni_SelsJson ;
   private String AV11Filename ;
   private String AV88Tdevpie2wwds_1_filterfulltext ;
   private String AV82FilterFullText ;
   private String lV88Tdevpie2wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P086Q2_A396EmprCod ;
   private short[] P086Q2_A326DevGenPie ;
   private boolean[] P086Q2_n326DevGenPie ;
   private java.math.BigDecimal[] P086Q2_A328DevGenUni ;
   private boolean[] P086Q2_n328DevGenUni ;
   private int[] P086Q2_A51AlbRPieDis ;
   private java.math.BigDecimal[] P086Q2_A57AlbRUniDis ;
   private String[] P086Q2_A329DevTrnNom ;
   private boolean[] P086Q2_n329DevTrnNom ;
   private short[] P086Q2_A327DevGenTrn ;
   private boolean[] P086Q2_n327DevGenTrn ;
   private String[] P086Q2_A45AlbRef ;
   private String[] P086Q2_A279CliNom ;
   private int[] P086Q2_A252CliCod ;
   private boolean[] P086Q2_n252CliCod ;
   private byte[] P086Q2_A6288DevGenDom ;
   private boolean[] P086Q2_n6288DevGenDom ;
   private int[] P086Q2_A44AlbRecCod ;
   private boolean[] P086Q2_n44AlbRecCod ;
   private java.util.Date[] P086Q2_A325DevGenFec ;
   private boolean[] P086Q2_n325DevGenFec ;
   private int[] P086Q2_A323DevGenCod ;
   private String[] P086Q2_A56AlbRUni ;
   private int[] P086Q2_A52AlbRPieEnt ;
   private int[] P086Q2_A54AlbRPieUti ;
   private java.math.BigDecimal[] P086Q2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P086Q2_A60AlbRUniUti ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV110Tdevpie2wwds_23_tfalbruni_sels ;
   private GXSimpleCollection<String> AV84TFAlbRUni_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV52GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV53GridStateFilterValue ;
}

final  class tdevpie2wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086Q2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV110Tdevpie2wwds_23_tfalbruni_sels ,
                                          int AV89Tdevpie2wwds_2_tfdevgencod ,
                                          int AV90Tdevpie2wwds_3_tfdevgencod_to ,
                                          java.util.Date AV91Tdevpie2wwds_4_tfdevgenfec ,
                                          int AV92Tdevpie2wwds_5_tfalbreccod ,
                                          int AV93Tdevpie2wwds_6_tfalbreccod_to ,
                                          byte AV94Tdevpie2wwds_7_tfdevgendom ,
                                          byte AV95Tdevpie2wwds_8_tfdevgendom_to ,
                                          int AV96Tdevpie2wwds_9_tfclicod ,
                                          int AV97Tdevpie2wwds_10_tfclicod_to ,
                                          String AV99Tdevpie2wwds_12_tfclinom_sel ,
                                          String AV98Tdevpie2wwds_11_tfclinom ,
                                          String AV101Tdevpie2wwds_14_tfalbref_sel ,
                                          String AV100Tdevpie2wwds_13_tfalbref ,
                                          short AV102Tdevpie2wwds_15_tfdevgentrn ,
                                          short AV103Tdevpie2wwds_16_tfdevgentrn_to ,
                                          String AV105Tdevpie2wwds_18_tfdevtrnnom_sel ,
                                          String AV104Tdevpie2wwds_17_tfdevtrnnom ,
                                          java.math.BigDecimal AV106Tdevpie2wwds_19_tfalbrunidis ,
                                          java.math.BigDecimal AV107Tdevpie2wwds_20_tfalbrunidis_to ,
                                          int AV108Tdevpie2wwds_21_tfalbrpiedis ,
                                          int AV109Tdevpie2wwds_22_tfalbrpiedis_to ,
                                          int AV110Tdevpie2wwds_23_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV111Tdevpie2wwds_24_tfdevgenuni ,
                                          java.math.BigDecimal AV112Tdevpie2wwds_25_tfdevgenuni_to ,
                                          short AV113Tdevpie2wwds_26_tfdevgenpie ,
                                          short AV114Tdevpie2wwds_27_tfdevgenpie_to ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          byte A6288DevGenDom ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          short A327DevGenTrn ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV88Tdevpie2wwds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[25];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DevGenPie, T1.DevGenUni, COALESCE( T4.AlbRPieEnt, 0) - COALESCE( T4.AlbRPieUti, 0) AS AlbRPieDis, CASE  WHEN ( COALESCE( T4.AlbRUniEnt, 0)" ;
      scmdbuf += " - COALESCE( T4.AlbRUniUti, 0)) >= 0 THEN COALESCE( T4.AlbRUniEnt, 0) - COALESCE( T4.AlbRUniUti, 0) WHEN ( COALESCE( T4.AlbRUniEnt, 0) - COALESCE( T4.AlbRUniUti," ;
      scmdbuf += " 0)) < 0 THEN 0 END AS AlbRUniDis, T2.TrnNom AS DevTrnNom, T1.DevGenTrn AS DevGenTrn, T4.AlbRef, T3.CliNom, T1.CliCod, T1.DevGenDom, T1.AlbRecCod, T1.DevGenFec," ;
      scmdbuf += " T1.DevGenCod, T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRPieUti, T4.AlbRUniEnt, T4.AlbRUniUti FROM (((TXPDEVGEN T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T2.TrnCod = T1.DevGenTrn) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      if ( ! (0==AV89Tdevpie2wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV90Tdevpie2wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91Tdevpie2wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV92Tdevpie2wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV93Tdevpie2wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV94Tdevpie2wwds_7_tfdevgendom) )
      {
         addWhere(sWhereString, "(T1.DevGenDom >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (0==AV95Tdevpie2wwds_8_tfdevgendom_to) )
      {
         addWhere(sWhereString, "(T1.DevGenDom <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV96Tdevpie2wwds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV97Tdevpie2wwds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tdevpie2wwds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tdevpie2wwds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tdevpie2wwds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tdevpie2wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV100Tdevpie2wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tdevpie2wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV102Tdevpie2wwds_15_tfdevgentrn) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV103Tdevpie2wwds_16_tfdevgentrn_to) )
      {
         addWhere(sWhereString, "(T1.DevGenTrn <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tdevpie2wwds_18_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV104Tdevpie2wwds_17_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tdevpie2wwds_18_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Tdevpie2wwds_19_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) >= 0 THEN T4.AlbRUniEnt - T4.AlbRUniUti WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Tdevpie2wwds_20_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) >= 0 THEN T4.AlbRUniEnt - T4.AlbRUniUti WHEN ( T4.AlbRUniEnt - T4.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV108Tdevpie2wwds_21_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T4.AlbRPieEnt - T4.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV109Tdevpie2wwds_22_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T4.AlbRPieEnt - T4.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( AV110Tdevpie2wwds_23_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Tdevpie2wwds_23_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Tdevpie2wwds_24_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Tdevpie2wwds_25_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV113Tdevpie2wwds_26_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV114Tdevpie2wwds_27_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenFec" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenDom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenDom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRef" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRef DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenTrn" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenTrn DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRUni" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenUni" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenPie" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenPie DESC" ;
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
                  return conditional_P086Q2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Number) dynConstraints[16]).shortValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , (String)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.math.BigDecimal)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , ((Boolean) dynConstraints[44]).booleanValue() , (String)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086Q2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 16);
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((String[]) buf[22])[0] = rslt.getString(15, 1);
               ((int[]) buf[23])[0] = rslt.getInt(16);
               ((int[]) buf[24])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(19,2);
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
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[27]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
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
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               return;
      }
   }

}

