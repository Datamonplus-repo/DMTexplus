package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpie1wwexportcsv_impl extends GXWebProcedure
{
   public tdevpie1wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TDevPie1WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TDevPie1WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TDevPie1WWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Devolucion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Recepcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cdg.Ref.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "EmprTrn", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV77Tdevpie1wwds_1_filterfulltext = AV69FilterFullText ;
      AV78Tdevpie1wwds_2_tfdevgencod = AV51TFDevGenCod ;
      AV79Tdevpie1wwds_3_tfdevgencod_to = AV52TFDevGenCod_To ;
      AV80Tdevpie1wwds_4_tfdevgenfec = AV53TFDevGenFec ;
      AV81Tdevpie1wwds_5_tfalbreccod = AV55TFAlbRecCod ;
      AV82Tdevpie1wwds_6_tfalbreccod_to = AV56TFAlbRecCod_To ;
      AV83Tdevpie1wwds_7_tfclinom = AV57TFCliNom ;
      AV84Tdevpie1wwds_8_tfclinom_sel = AV58TFCliNom_Sel ;
      AV85Tdevpie1wwds_9_tfalbref = AV59TFAlbRef ;
      AV86Tdevpie1wwds_10_tfalbref_sel = AV60TFAlbRef_Sel ;
      AV87Tdevpie1wwds_11_tfdevtrnnom = AV61TFDevTrnNom ;
      AV88Tdevpie1wwds_12_tfdevtrnnom_sel = AV62TFDevTrnNom_Sel ;
      AV89Tdevpie1wwds_13_tfdevgenuni = AV63TFDevGenUni ;
      AV90Tdevpie1wwds_14_tfdevgenuni_to = AV64TFDevGenUni_To ;
      AV91Tdevpie1wwds_15_tfalbruni_sels = AV71TFAlbRUni_Sels ;
      AV92Tdevpie1wwds_16_tfdevgenpie = AV67TFDevGenPie ;
      AV93Tdevpie1wwds_17_tfdevgenpie_to = AV68TFDevGenPie_To ;
      AV94Tdevpie1wwds_18_tfemprtrn = AV72TFEmprTrn ;
      AV95Tdevpie1wwds_19_tfemprtrn_sel = AV73TFEmprTrn_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV91Tdevpie1wwds_15_tfalbruni_sels ,
                                           Integer.valueOf(AV78Tdevpie1wwds_2_tfdevgencod) ,
                                           Integer.valueOf(AV79Tdevpie1wwds_3_tfdevgencod_to) ,
                                           AV80Tdevpie1wwds_4_tfdevgenfec ,
                                           Integer.valueOf(AV81Tdevpie1wwds_5_tfalbreccod) ,
                                           Integer.valueOf(AV82Tdevpie1wwds_6_tfalbreccod_to) ,
                                           AV84Tdevpie1wwds_8_tfclinom_sel ,
                                           AV83Tdevpie1wwds_7_tfclinom ,
                                           AV86Tdevpie1wwds_10_tfalbref_sel ,
                                           AV85Tdevpie1wwds_9_tfalbref ,
                                           AV88Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                           AV87Tdevpie1wwds_11_tfdevtrnnom ,
                                           AV89Tdevpie1wwds_13_tfdevgenuni ,
                                           AV90Tdevpie1wwds_14_tfdevgenuni_to ,
                                           Integer.valueOf(AV91Tdevpie1wwds_15_tfalbruni_sels.size()) ,
                                           Short.valueOf(AV92Tdevpie1wwds_16_tfdevgenpie) ,
                                           Short.valueOf(AV93Tdevpie1wwds_17_tfdevgenpie_to) ,
                                           AV95Tdevpie1wwds_19_tfemprtrn_sel ,
                                           AV94Tdevpie1wwds_18_tfemprtrn ,
                                           Integer.valueOf(A323DevGenCod) ,
                                           A325DevGenFec ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A329DevTrnNom ,
                                           A328DevGenUni ,
                                           Short.valueOf(A326DevGenPie) ,
                                           A410EmprTrn ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV77Tdevpie1wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV83Tdevpie1wwds_7_tfclinom = GXutil.padr( GXutil.rtrim( AV83Tdevpie1wwds_7_tfclinom), 30, "%") ;
      lV85Tdevpie1wwds_9_tfalbref = GXutil.padr( GXutil.rtrim( AV85Tdevpie1wwds_9_tfalbref), 16, "%") ;
      lV87Tdevpie1wwds_11_tfdevtrnnom = GXutil.padr( GXutil.rtrim( AV87Tdevpie1wwds_11_tfdevtrnnom), 30, "%") ;
      lV94Tdevpie1wwds_18_tfemprtrn = GXutil.padr( GXutil.rtrim( AV94Tdevpie1wwds_18_tfemprtrn), 3, "%") ;
      /* Using cursor P086K2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV78Tdevpie1wwds_2_tfdevgencod), Integer.valueOf(AV79Tdevpie1wwds_3_tfdevgencod_to), AV80Tdevpie1wwds_4_tfdevgenfec, Integer.valueOf(AV81Tdevpie1wwds_5_tfalbreccod), Integer.valueOf(AV82Tdevpie1wwds_6_tfalbreccod_to), lV83Tdevpie1wwds_7_tfclinom, AV84Tdevpie1wwds_8_tfclinom_sel, lV85Tdevpie1wwds_9_tfalbref, AV86Tdevpie1wwds_10_tfalbref_sel, lV87Tdevpie1wwds_11_tfdevtrnnom, AV88Tdevpie1wwds_12_tfdevtrnnom_sel, AV89Tdevpie1wwds_13_tfdevgenuni, AV90Tdevpie1wwds_14_tfdevgenuni_to, Short.valueOf(AV92Tdevpie1wwds_16_tfdevgenpie), Short.valueOf(AV93Tdevpie1wwds_17_tfdevgenpie_to), lV94Tdevpie1wwds_18_tfemprtrn, AV95Tdevpie1wwds_19_tfemprtrn_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P086K2_A396EmprCod[0] ;
         A252CliCod = P086K2_A252CliCod[0] ;
         n252CliCod = P086K2_n252CliCod[0] ;
         A327DevGenTrn = P086K2_A327DevGenTrn[0] ;
         n327DevGenTrn = P086K2_n327DevGenTrn[0] ;
         A410EmprTrn = P086K2_A410EmprTrn[0] ;
         n410EmprTrn = P086K2_n410EmprTrn[0] ;
         A326DevGenPie = P086K2_A326DevGenPie[0] ;
         n326DevGenPie = P086K2_n326DevGenPie[0] ;
         A328DevGenUni = P086K2_A328DevGenUni[0] ;
         n328DevGenUni = P086K2_n328DevGenUni[0] ;
         A329DevTrnNom = P086K2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086K2_n329DevTrnNom[0] ;
         A45AlbRef = P086K2_A45AlbRef[0] ;
         A279CliNom = P086K2_A279CliNom[0] ;
         A44AlbRecCod = P086K2_A44AlbRecCod[0] ;
         n44AlbRecCod = P086K2_n44AlbRecCod[0] ;
         A325DevGenFec = P086K2_A325DevGenFec[0] ;
         n325DevGenFec = P086K2_n325DevGenFec[0] ;
         A323DevGenCod = P086K2_A323DevGenCod[0] ;
         A56AlbRUni = P086K2_A56AlbRUni[0] ;
         A279CliNom = P086K2_A279CliNom[0] ;
         A329DevTrnNom = P086K2_A329DevTrnNom[0] ;
         n329DevTrnNom = P086K2_n329DevTrnNom[0] ;
         A45AlbRef = P086K2_A45AlbRef[0] ;
         A56AlbRUni = P086K2_A56AlbRUni[0] ;
         if ( (GXutil.strcmp("", AV77Tdevpie1wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A323DevGenCod, 8, 0) , GXutil.padr( "%" + AV77Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV77Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV77Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV77Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A329DevTrnNom) , GXutil.padr( "%" + GXutil.upper( AV77Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A328DevGenUni, 9, 2) , GXutil.padr( "%" + AV77Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV77Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV77Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A326DevGenPie, 4, 0) , GXutil.padr( "%" + AV77Tdevpie1wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A410EmprTrn) , GXutil.padr( "%" + GXutil.upper( AV77Tdevpie1wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
               tdevpie1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A45AlbRef, ";", ","), GXv_char3) ;
               tdevpie1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A329DevTrnNom, ";", ","), GXv_char3) ;
               tdevpie1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A328DevGenUni, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A326DevGenPie, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A410EmprTrn, ";", ","), GXv_char3) ;
               tdevpie1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TDevPie1WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevGenCod", "", "N Devolucion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevGenFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRef", "", "Cdg.Ref.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevTrnNom", "", "Transportista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevGenUni", "", "Unidades", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUni", "", "Unidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "DevGenPie", "", "Piezas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EmprTrn", "", "EmprTrn", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TDevPie1WWColumnsSelector", GXv_char3) ;
      tdevpie1wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TDevPie1WWGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TDevPie1WWGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV19Session.getValue("TDevPie1WWGridState"), null, null);
      }
      AV28OrderedBy = AV49GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV49GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV96GXV1 = 1 ;
      while ( AV96GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV96GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV69FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENCOD") == 0 )
         {
            AV51TFDevGenCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFDevGenCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENFEC") == 0 )
         {
            AV53TFDevGenFec = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV55TFAlbRecCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFAlbRecCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV57TFCliNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV58TFCliNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV59TFAlbRef = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV60TFAlbRef_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM") == 0 )
         {
            AV61TFDevTrnNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVTRNNOM_SEL") == 0 )
         {
            AV62TFDevTrnNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENUNI") == 0 )
         {
            AV63TFDevGenUni = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFDevGenUni_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV70TFAlbRUni_SelsJson = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV71TFAlbRUni_Sels.fromJSonString(AV70TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVGENPIE") == 0 )
         {
            AV67TFDevGenPie = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFDevGenPie_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTRN") == 0 )
         {
            AV72TFEmprTrn = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRTRN_SEL") == 0 )
         {
            AV73TFEmprTrn_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV96GXV1 = (int)(AV96GXV1+1) ;
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
      A328DevGenUni = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A410EmprTrn = "" ;
      AV77Tdevpie1wwds_1_filterfulltext = "" ;
      AV69FilterFullText = "" ;
      AV80Tdevpie1wwds_4_tfdevgenfec = GXutil.nullDate() ;
      AV53TFDevGenFec = GXutil.nullDate() ;
      AV83Tdevpie1wwds_7_tfclinom = "" ;
      AV57TFCliNom = "" ;
      AV84Tdevpie1wwds_8_tfclinom_sel = "" ;
      AV58TFCliNom_Sel = "" ;
      AV85Tdevpie1wwds_9_tfalbref = "" ;
      AV59TFAlbRef = "" ;
      AV86Tdevpie1wwds_10_tfalbref_sel = "" ;
      AV60TFAlbRef_Sel = "" ;
      AV87Tdevpie1wwds_11_tfdevtrnnom = "" ;
      AV61TFDevTrnNom = "" ;
      AV88Tdevpie1wwds_12_tfdevtrnnom_sel = "" ;
      AV62TFDevTrnNom_Sel = "" ;
      AV89Tdevpie1wwds_13_tfdevgenuni = DecimalUtil.ZERO ;
      AV63TFDevGenUni = DecimalUtil.ZERO ;
      AV90Tdevpie1wwds_14_tfdevgenuni_to = DecimalUtil.ZERO ;
      AV64TFDevGenUni_To = DecimalUtil.ZERO ;
      AV91Tdevpie1wwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV71TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV94Tdevpie1wwds_18_tfemprtrn = "" ;
      AV72TFEmprTrn = "" ;
      AV95Tdevpie1wwds_19_tfemprtrn_sel = "" ;
      AV73TFEmprTrn_Sel = "" ;
      lV77Tdevpie1wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV83Tdevpie1wwds_7_tfclinom = "" ;
      lV85Tdevpie1wwds_9_tfalbref = "" ;
      lV87Tdevpie1wwds_11_tfdevtrnnom = "" ;
      lV94Tdevpie1wwds_18_tfemprtrn = "" ;
      P086K2_A396EmprCod = new String[] {""} ;
      P086K2_A252CliCod = new int[1] ;
      P086K2_n252CliCod = new boolean[] {false} ;
      P086K2_A327DevGenTrn = new short[1] ;
      P086K2_n327DevGenTrn = new boolean[] {false} ;
      P086K2_A410EmprTrn = new String[] {""} ;
      P086K2_n410EmprTrn = new boolean[] {false} ;
      P086K2_A326DevGenPie = new short[1] ;
      P086K2_n326DevGenPie = new boolean[] {false} ;
      P086K2_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086K2_n328DevGenUni = new boolean[] {false} ;
      P086K2_A329DevTrnNom = new String[] {""} ;
      P086K2_n329DevTrnNom = new boolean[] {false} ;
      P086K2_A45AlbRef = new String[] {""} ;
      P086K2_A279CliNom = new String[] {""} ;
      P086K2_A44AlbRecCod = new int[1] ;
      P086K2_n44AlbRecCod = new boolean[] {false} ;
      P086K2_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      P086K2_n325DevGenFec = new boolean[] {false} ;
      P086K2_A323DevGenCod = new int[1] ;
      P086K2_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV70TFAlbRUni_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpie1wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P086K2_A396EmprCod, P086K2_A252CliCod, P086K2_n252CliCod, P086K2_A327DevGenTrn, P086K2_n327DevGenTrn, P086K2_A410EmprTrn, P086K2_n410EmprTrn, P086K2_A326DevGenPie, P086K2_n326DevGenPie, P086K2_A328DevGenUni,
            P086K2_n328DevGenUni, P086K2_A329DevTrnNom, P086K2_n329DevTrnNom, P086K2_A45AlbRef, P086K2_A279CliNom, P086K2_A44AlbRecCod, P086K2_n44AlbRecCod, P086K2_A325DevGenFec, P086K2_n325DevGenFec, P086K2_A323DevGenCod,
            P086K2_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A326DevGenPie ;
   private short AV92Tdevpie1wwds_16_tfdevgenpie ;
   private short AV67TFDevGenPie ;
   private short AV93Tdevpie1wwds_17_tfdevgenpie_to ;
   private short AV68TFDevGenPie_To ;
   private short AV28OrderedBy ;
   private short A327DevGenTrn ;
   private short Gx_err ;
   private int AV13Random ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int AV78Tdevpie1wwds_2_tfdevgencod ;
   private int AV51TFDevGenCod ;
   private int AV79Tdevpie1wwds_3_tfdevgencod_to ;
   private int AV52TFDevGenCod_To ;
   private int AV81Tdevpie1wwds_5_tfalbreccod ;
   private int AV55TFAlbRecCod ;
   private int AV82Tdevpie1wwds_6_tfalbreccod_to ;
   private int AV56TFAlbRecCod_To ;
   private int AV91Tdevpie1wwds_15_tfalbruni_sels_size ;
   private int A252CliCod ;
   private int AV96GXV1 ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal AV89Tdevpie1wwds_13_tfdevgenuni ;
   private java.math.BigDecimal AV63TFDevGenUni ;
   private java.math.BigDecimal AV90Tdevpie1wwds_14_tfdevgenuni_to ;
   private java.math.BigDecimal AV64TFDevGenUni_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A329DevTrnNom ;
   private String A56AlbRUni ;
   private String A410EmprTrn ;
   private String AV83Tdevpie1wwds_7_tfclinom ;
   private String AV57TFCliNom ;
   private String AV84Tdevpie1wwds_8_tfclinom_sel ;
   private String AV58TFCliNom_Sel ;
   private String AV85Tdevpie1wwds_9_tfalbref ;
   private String AV59TFAlbRef ;
   private String AV86Tdevpie1wwds_10_tfalbref_sel ;
   private String AV60TFAlbRef_Sel ;
   private String AV87Tdevpie1wwds_11_tfdevtrnnom ;
   private String AV61TFDevTrnNom ;
   private String AV88Tdevpie1wwds_12_tfdevtrnnom_sel ;
   private String AV62TFDevTrnNom_Sel ;
   private String AV94Tdevpie1wwds_18_tfemprtrn ;
   private String AV72TFEmprTrn ;
   private String AV95Tdevpie1wwds_19_tfemprtrn_sel ;
   private String AV73TFEmprTrn_Sel ;
   private String scmdbuf ;
   private String lV83Tdevpie1wwds_7_tfclinom ;
   private String lV85Tdevpie1wwds_9_tfalbref ;
   private String lV87Tdevpie1wwds_11_tfdevtrnnom ;
   private String lV94Tdevpie1wwds_18_tfemprtrn ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date AV80Tdevpie1wwds_4_tfdevgenfec ;
   private java.util.Date AV53TFDevGenFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n252CliCod ;
   private boolean n327DevGenTrn ;
   private boolean n410EmprTrn ;
   private boolean n326DevGenPie ;
   private boolean n328DevGenUni ;
   private boolean n329DevTrnNom ;
   private boolean n44AlbRecCod ;
   private boolean n325DevGenFec ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV70TFAlbRUni_SelsJson ;
   private String AV11Filename ;
   private String AV77Tdevpie1wwds_1_filterfulltext ;
   private String AV69FilterFullText ;
   private String lV77Tdevpie1wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P086K2_A396EmprCod ;
   private int[] P086K2_A252CliCod ;
   private boolean[] P086K2_n252CliCod ;
   private short[] P086K2_A327DevGenTrn ;
   private boolean[] P086K2_n327DevGenTrn ;
   private String[] P086K2_A410EmprTrn ;
   private boolean[] P086K2_n410EmprTrn ;
   private short[] P086K2_A326DevGenPie ;
   private boolean[] P086K2_n326DevGenPie ;
   private java.math.BigDecimal[] P086K2_A328DevGenUni ;
   private boolean[] P086K2_n328DevGenUni ;
   private String[] P086K2_A329DevTrnNom ;
   private boolean[] P086K2_n329DevTrnNom ;
   private String[] P086K2_A45AlbRef ;
   private String[] P086K2_A279CliNom ;
   private int[] P086K2_A44AlbRecCod ;
   private boolean[] P086K2_n44AlbRecCod ;
   private java.util.Date[] P086K2_A325DevGenFec ;
   private boolean[] P086K2_n325DevGenFec ;
   private int[] P086K2_A323DevGenCod ;
   private String[] P086K2_A56AlbRUni ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV91Tdevpie1wwds_15_tfalbruni_sels ;
   private GXSimpleCollection<String> AV71TFAlbRUni_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class tdevpie1wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV91Tdevpie1wwds_15_tfalbruni_sels ,
                                          int AV78Tdevpie1wwds_2_tfdevgencod ,
                                          int AV79Tdevpie1wwds_3_tfdevgencod_to ,
                                          java.util.Date AV80Tdevpie1wwds_4_tfdevgenfec ,
                                          int AV81Tdevpie1wwds_5_tfalbreccod ,
                                          int AV82Tdevpie1wwds_6_tfalbreccod_to ,
                                          String AV84Tdevpie1wwds_8_tfclinom_sel ,
                                          String AV83Tdevpie1wwds_7_tfclinom ,
                                          String AV86Tdevpie1wwds_10_tfalbref_sel ,
                                          String AV85Tdevpie1wwds_9_tfalbref ,
                                          String AV88Tdevpie1wwds_12_tfdevtrnnom_sel ,
                                          String AV87Tdevpie1wwds_11_tfdevtrnnom ,
                                          java.math.BigDecimal AV89Tdevpie1wwds_13_tfdevgenuni ,
                                          java.math.BigDecimal AV90Tdevpie1wwds_14_tfdevgenuni_to ,
                                          int AV91Tdevpie1wwds_15_tfalbruni_sels_size ,
                                          short AV92Tdevpie1wwds_16_tfdevgenpie ,
                                          short AV93Tdevpie1wwds_17_tfdevgenpie_to ,
                                          String AV95Tdevpie1wwds_19_tfemprtrn_sel ,
                                          String AV94Tdevpie1wwds_18_tfemprtrn ,
                                          int A323DevGenCod ,
                                          java.util.Date A325DevGenFec ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A329DevTrnNom ,
                                          java.math.BigDecimal A328DevGenUni ,
                                          short A326DevGenPie ,
                                          String A410EmprTrn ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV77Tdevpie1wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[17];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.DevGenTrn AS DevGenTrn, T1.EmprTrn, T1.DevGenPie, T1.DevGenUni, T3.TrnNom AS DevTrnNom, T4.AlbRef, T2.CliNom, T1.AlbRecCod, T1.DevGenFec," ;
      scmdbuf += " T1.DevGenCod, T4.AlbRUni FROM (((TXPDEVGEN T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.TrnCod = T1.DevGenTrn) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = T1.EmprCod AND T4.AlbRecCod = T1.AlbRecCod)" ;
      if ( ! (0==AV78Tdevpie1wwds_2_tfdevgencod) )
      {
         addWhere(sWhereString, "(T1.DevGenCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV79Tdevpie1wwds_3_tfdevgencod_to) )
      {
         addWhere(sWhereString, "(T1.DevGenCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80Tdevpie1wwds_4_tfdevgenfec)) )
      {
         addWhere(sWhereString, "(T1.DevGenFec >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (0==AV81Tdevpie1wwds_5_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV82Tdevpie1wwds_6_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Tdevpie1wwds_8_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV83Tdevpie1wwds_7_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Tdevpie1wwds_8_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Tdevpie1wwds_10_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV85Tdevpie1wwds_9_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Tdevpie1wwds_10_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T4.AlbRef = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Tdevpie1wwds_12_tfdevtrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV87Tdevpie1wwds_11_tfdevtrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Tdevpie1wwds_12_tfdevtrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Tdevpie1wwds_13_tfdevgenuni)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Tdevpie1wwds_14_tfdevgenuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevGenUni <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( AV91Tdevpie1wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91Tdevpie1wwds_15_tfalbruni_sels, "T4.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV92Tdevpie1wwds_16_tfdevgenpie) )
      {
         addWhere(sWhereString, "(T1.DevGenPie >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV93Tdevpie1wwds_17_tfdevgenpie_to) )
      {
         addWhere(sWhereString, "(T1.DevGenPie <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Tdevpie1wwds_19_tfemprtrn_sel)==0) && ( ! (GXutil.strcmp("", AV94Tdevpie1wwds_18_tfemprtrn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.EmprTrn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Tdevpie1wwds_19_tfemprtrn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.EmprTrn = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRef" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRef DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenUni" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.AlbRUni" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.AlbRUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DevGenPie" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DevGenPie DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprTrn" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprTrn DESC" ;
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
                  return conditional_P086K2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 16);
               ((String[]) buf[14])[0] = rslt.getString(9, 30);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(12);
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 3);
               }
               return;
      }
   }

}

