package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class producwwexportcsv_impl extends GXWebProcedure
{
   public producwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "PRODUCWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.PRODUCWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("StocksQuimicos.PRODUCWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "AOX (adsorbable organic halogens)", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "GOTS", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "REACH", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Oeko Tex", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "HM", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "ZDHC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "List by Inditex ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "THELIST", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hoja Seguridad?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Hoja Seguridad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Es Compuesto", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV62Stocksquimicos_producwwds_1_filterfulltext = AV30FilterFullText ;
      AV63Stocksquimicos_producwwds_2_tfprdnom = AV34TFPrdNom ;
      AV64Stocksquimicos_producwwds_3_tfprdnom_sel = AV35TFPrdNom_Sel ;
      AV65Stocksquimicos_producwwds_4_tfprdnum = AV36TFPrdNum ;
      AV66Stocksquimicos_producwwds_5_tfprdnum_sel = AV37TFPrdNum_Sel ;
      AV67Stocksquimicos_producwwds_6_tfprdaox = AV38TFPrdAox ;
      AV68Stocksquimicos_producwwds_7_tfprdaox_to = AV39TFPrdAox_To ;
      AV69Stocksquimicos_producwwds_8_tfprdgots = AV40TFPrdGots ;
      AV70Stocksquimicos_producwwds_9_tfprdgots_sel = AV41TFPrdGots_Sel ;
      AV71Stocksquimicos_producwwds_10_tfprdreach = AV42TFPrdReach ;
      AV72Stocksquimicos_producwwds_11_tfprdreach_sel = AV43TFPrdReach_Sel ;
      AV73Stocksquimicos_producwwds_12_tfprdokotex_sels = AV45TFPrdOkotex_Sels ;
      AV74Stocksquimicos_producwwds_13_tfprdhm = AV46TFPrdHm ;
      AV75Stocksquimicos_producwwds_14_tfprdhm_sel = AV47TFPrdHm_Sel ;
      AV76Stocksquimicos_producwwds_15_tfprdzdhc_sels = AV49TFPrdZDHC_Sels ;
      AV77Stocksquimicos_producwwds_16_tfprdlist_sels = AV51TFPrdList_Sels ;
      AV78Stocksquimicos_producwwds_17_tfprdthelist = AV52TFPrdTHELIST ;
      AV79Stocksquimicos_producwwds_18_tfprdthelist_sel = AV53TFPrdTHELIST_Sel ;
      AV80Stocksquimicos_producwwds_19_tfprdhs = AV54TFPrdHS ;
      AV81Stocksquimicos_producwwds_20_tfprdhs_sel = AV55TFPrdHS_Sel ;
      AV82Stocksquimicos_producwwds_21_tfprdfhs = AV56TFPrdFHS ;
      AV83Stocksquimicos_producwwds_22_tfprdescompuesto_sel = AV58TFPrdEsCompuesto_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV73Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV76Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV77Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                           AV64Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                           AV63Stocksquimicos_producwwds_2_tfprdnom ,
                                           AV66Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                           AV65Stocksquimicos_producwwds_4_tfprdnum ,
                                           AV67Stocksquimicos_producwwds_6_tfprdaox ,
                                           AV68Stocksquimicos_producwwds_7_tfprdaox_to ,
                                           AV70Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                           AV69Stocksquimicos_producwwds_8_tfprdgots ,
                                           AV72Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                           AV71Stocksquimicos_producwwds_10_tfprdreach ,
                                           Integer.valueOf(AV73Stocksquimicos_producwwds_12_tfprdokotex_sels.size()) ,
                                           AV75Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                           AV74Stocksquimicos_producwwds_13_tfprdhm ,
                                           Integer.valueOf(AV76Stocksquimicos_producwwds_15_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV77Stocksquimicos_producwwds_16_tfprdlist_sels.size()) ,
                                           AV79Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                           AV78Stocksquimicos_producwwds_17_tfprdthelist ,
                                           AV81Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                           AV80Stocksquimicos_producwwds_19_tfprdhs ,
                                           AV82Stocksquimicos_producwwds_21_tfprdfhs ,
                                           Byte.valueOf(AV83Stocksquimicos_producwwds_22_tfprdescompuesto_sel) ,
                                           A718PrdNom ,
                                           A719PrdNum ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV62Stocksquimicos_producwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV63Stocksquimicos_producwwds_2_tfprdnom = GXutil.padr( GXutil.rtrim( AV63Stocksquimicos_producwwds_2_tfprdnom), 26, "%") ;
      lV65Stocksquimicos_producwwds_4_tfprdnum = GXutil.padr( GXutil.rtrim( AV65Stocksquimicos_producwwds_4_tfprdnum), 6, "%") ;
      lV69Stocksquimicos_producwwds_8_tfprdgots = GXutil.padr( GXutil.rtrim( AV69Stocksquimicos_producwwds_8_tfprdgots), 1, "%") ;
      lV71Stocksquimicos_producwwds_10_tfprdreach = GXutil.padr( GXutil.rtrim( AV71Stocksquimicos_producwwds_10_tfprdreach), 1, "%") ;
      lV74Stocksquimicos_producwwds_13_tfprdhm = GXutil.padr( GXutil.rtrim( AV74Stocksquimicos_producwwds_13_tfprdhm), 1, "%") ;
      lV78Stocksquimicos_producwwds_17_tfprdthelist = GXutil.padr( GXutil.rtrim( AV78Stocksquimicos_producwwds_17_tfprdthelist), 4, "%") ;
      lV80Stocksquimicos_producwwds_19_tfprdhs = GXutil.padr( GXutil.rtrim( AV80Stocksquimicos_producwwds_19_tfprdhs), 1, "%") ;
      /* Using cursor P08VI2 */
      pr_default.execute(0, new Object[] {lV63Stocksquimicos_producwwds_2_tfprdnom, AV64Stocksquimicos_producwwds_3_tfprdnom_sel, lV65Stocksquimicos_producwwds_4_tfprdnum, AV66Stocksquimicos_producwwds_5_tfprdnum_sel, AV67Stocksquimicos_producwwds_6_tfprdaox, AV68Stocksquimicos_producwwds_7_tfprdaox_to, lV69Stocksquimicos_producwwds_8_tfprdgots, AV70Stocksquimicos_producwwds_9_tfprdgots_sel, lV71Stocksquimicos_producwwds_10_tfprdreach, AV72Stocksquimicos_producwwds_11_tfprdreach_sel, lV74Stocksquimicos_producwwds_13_tfprdhm, AV75Stocksquimicos_producwwds_14_tfprdhm_sel, lV78Stocksquimicos_producwwds_17_tfprdthelist, AV79Stocksquimicos_producwwds_18_tfprdthelist_sel, lV80Stocksquimicos_producwwds_19_tfprdhs, AV81Stocksquimicos_producwwds_20_tfprdhs_sel, AV82Stocksquimicos_producwwds_21_tfprdfhs});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9742PrdFHS = P08VI2_A9742PrdFHS[0] ;
         A9741PrdHS = P08VI2_A9741PrdHS[0] ;
         A13302PrdTHELIST = P08VI2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P08VI2_n13302PrdTHELIST[0] ;
         A11364PrdHm = P08VI2_A11364PrdHm[0] ;
         A5887PrdReach = P08VI2_A5887PrdReach[0] ;
         A11363PrdGots = P08VI2_A11363PrdGots[0] ;
         A9733PrdAox = P08VI2_A9733PrdAox[0] ;
         A718PrdNom = P08VI2_A718PrdNom[0] ;
         A11687PrdList = P08VI2_A11687PrdList[0] ;
         A13301PrdZDHC = P08VI2_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P08VI2_A5888PrdOkotex[0] ;
         A719PrdNum = P08VI2_A719PrdNum[0] ;
         A396EmprCod = P08VI2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV62Stocksquimicos_producwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV62Stocksquimicos_producwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV62Stocksquimicos_producwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            if ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "0") == 0 )
            {
               A13881PrdEsCompu = true ;
            }
            else
            {
               A13881PrdEsCompu = false ;
            }
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
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
               producwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
               producwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A9733PrdAox, 6, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11363PrdGots, ";", ","), GXv_char3) ;
               producwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5887PrdReach, ";", ","), GXv_char3) ;
               producwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "N") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "N", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A5888PrdOkotex), "S") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "S", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11364PrdHm, ";", ","), GXv_char3) ;
               producwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "N") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "N", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "1") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Nivel 1", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "2") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Nivel 2", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A13301PrdZDHC), "3") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Nivel 3", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "S") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "S", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A11687PrdList), "N") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "N", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13302PrdTHELIST, ";", ","), GXv_char3) ;
               producwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9741PrdHS, ";", ","), GXv_char3) ;
               producwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A9742PrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.booltostr( A13881PrdEsCompu) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=PRODUCWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdAox", "", "AOX (adsorbable organic halogens)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdGots", "", "GOTS", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdReach", "", "REACH", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdOkotex", "", "Oeko Tex", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdHm", "", "HM", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdZDHC", "", "ZDHC", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdList", "", "List by Inditex ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdTHELIST", "", "THELIST", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdHS", "", "Hoja Seguridad?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFHS", "", "Fecha Hoja Seguridad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdEsCompuesto", "", "Es Compuesto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.PRODUCWWColumnsSelector", GXv_char3) ;
      producwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.PRODUCWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.PRODUCWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("StocksQuimicos.PRODUCWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV84GXV1 = 1 ;
      while ( AV84GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV84GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV34TFPrdNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV35TFPrdNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV36TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV37TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV38TFPrdAox = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV39TFPrdAox_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV40TFPrdGots = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV41TFPrdGots_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV42TFPrdReach = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV43TFPrdReach_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV44TFPrdOkotex_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV45TFPrdOkotex_Sels.fromJSonString(AV44TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV46TFPrdHm = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV47TFPrdHm_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV48TFPrdZDHC_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV49TFPrdZDHC_Sels.fromJSonString(AV48TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV50TFPrdList_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV51TFPrdList_Sels.fromJSonString(AV50TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV52TFPrdTHELIST = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV53TFPrdTHELIST_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV54TFPrdHS = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV55TFPrdHS_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV56TFPrdFHS = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDESCOMPUESTO_SEL") == 0 )
         {
            AV58TFPrdEsCompuesto_Sel = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV84GXV1 = (int)(AV84GXV1+1) ;
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
      A718PrdNom = "" ;
      A719PrdNum = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11364PrdHm = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A13302PrdTHELIST = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      AV62Stocksquimicos_producwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV63Stocksquimicos_producwwds_2_tfprdnom = "" ;
      AV34TFPrdNom = "" ;
      AV64Stocksquimicos_producwwds_3_tfprdnom_sel = "" ;
      AV35TFPrdNom_Sel = "" ;
      AV65Stocksquimicos_producwwds_4_tfprdnum = "" ;
      AV36TFPrdNum = "" ;
      AV66Stocksquimicos_producwwds_5_tfprdnum_sel = "" ;
      AV37TFPrdNum_Sel = "" ;
      AV67Stocksquimicos_producwwds_6_tfprdaox = DecimalUtil.ZERO ;
      AV38TFPrdAox = DecimalUtil.ZERO ;
      AV68Stocksquimicos_producwwds_7_tfprdaox_to = DecimalUtil.ZERO ;
      AV39TFPrdAox_To = DecimalUtil.ZERO ;
      AV69Stocksquimicos_producwwds_8_tfprdgots = "" ;
      AV40TFPrdGots = "" ;
      AV70Stocksquimicos_producwwds_9_tfprdgots_sel = "" ;
      AV41TFPrdGots_Sel = "" ;
      AV71Stocksquimicos_producwwds_10_tfprdreach = "" ;
      AV42TFPrdReach = "" ;
      AV72Stocksquimicos_producwwds_11_tfprdreach_sel = "" ;
      AV43TFPrdReach_Sel = "" ;
      AV73Stocksquimicos_producwwds_12_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV45TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV74Stocksquimicos_producwwds_13_tfprdhm = "" ;
      AV46TFPrdHm = "" ;
      AV75Stocksquimicos_producwwds_14_tfprdhm_sel = "" ;
      AV47TFPrdHm_Sel = "" ;
      AV76Stocksquimicos_producwwds_15_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV49TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV77Stocksquimicos_producwwds_16_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV51TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV78Stocksquimicos_producwwds_17_tfprdthelist = "" ;
      AV52TFPrdTHELIST = "" ;
      AV79Stocksquimicos_producwwds_18_tfprdthelist_sel = "" ;
      AV53TFPrdTHELIST_Sel = "" ;
      AV80Stocksquimicos_producwwds_19_tfprdhs = "" ;
      AV54TFPrdHS = "" ;
      AV81Stocksquimicos_producwwds_20_tfprdhs_sel = "" ;
      AV55TFPrdHS_Sel = "" ;
      AV82Stocksquimicos_producwwds_21_tfprdfhs = GXutil.nullDate() ;
      AV56TFPrdFHS = GXutil.nullDate() ;
      lV62Stocksquimicos_producwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV63Stocksquimicos_producwwds_2_tfprdnom = "" ;
      lV65Stocksquimicos_producwwds_4_tfprdnum = "" ;
      lV69Stocksquimicos_producwwds_8_tfprdgots = "" ;
      lV71Stocksquimicos_producwwds_10_tfprdreach = "" ;
      lV74Stocksquimicos_producwwds_13_tfprdhm = "" ;
      lV78Stocksquimicos_producwwds_17_tfprdthelist = "" ;
      lV80Stocksquimicos_producwwds_19_tfprdhs = "" ;
      P08VI2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P08VI2_A9741PrdHS = new String[] {""} ;
      P08VI2_A13302PrdTHELIST = new String[] {""} ;
      P08VI2_n13302PrdTHELIST = new boolean[] {false} ;
      P08VI2_A11364PrdHm = new String[] {""} ;
      P08VI2_A5887PrdReach = new String[] {""} ;
      P08VI2_A11363PrdGots = new String[] {""} ;
      P08VI2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08VI2_A718PrdNom = new String[] {""} ;
      P08VI2_A11687PrdList = new String[] {""} ;
      P08VI2_A13301PrdZDHC = new String[] {""} ;
      P08VI2_A5888PrdOkotex = new String[] {""} ;
      P08VI2_A719PrdNum = new String[] {""} ;
      P08VI2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV44TFPrdOkotex_SelsJson = "" ;
      AV48TFPrdZDHC_SelsJson = "" ;
      AV50TFPrdList_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.producwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08VI2_A9742PrdFHS, P08VI2_A9741PrdHS, P08VI2_A13302PrdTHELIST, P08VI2_n13302PrdTHELIST, P08VI2_A11364PrdHm, P08VI2_A5887PrdReach, P08VI2_A11363PrdGots, P08VI2_A9733PrdAox, P08VI2_A718PrdNom, P08VI2_A11687PrdList,
            P08VI2_A13301PrdZDHC, P08VI2_A5888PrdOkotex, P08VI2_A719PrdNum, P08VI2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV83Stocksquimicos_producwwds_22_tfprdescompuesto_sel ;
   private byte AV58TFPrdEsCompuesto_Sel ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int AV73Stocksquimicos_producwwds_12_tfprdokotex_sels_size ;
   private int AV76Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ;
   private int AV77Stocksquimicos_producwwds_16_tfprdlist_sels_size ;
   private int AV84GXV1 ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV67Stocksquimicos_producwwds_6_tfprdaox ;
   private java.math.BigDecimal AV38TFPrdAox ;
   private java.math.BigDecimal AV68Stocksquimicos_producwwds_7_tfprdaox_to ;
   private java.math.BigDecimal AV39TFPrdAox_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A718PrdNom ;
   private String A719PrdNum ;
   private String A11363PrdGots ;
   private String A5887PrdReach ;
   private String A5888PrdOkotex ;
   private String A11364PrdHm ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A13302PrdTHELIST ;
   private String A9741PrdHS ;
   private String AV63Stocksquimicos_producwwds_2_tfprdnom ;
   private String AV34TFPrdNom ;
   private String AV64Stocksquimicos_producwwds_3_tfprdnom_sel ;
   private String AV35TFPrdNom_Sel ;
   private String AV65Stocksquimicos_producwwds_4_tfprdnum ;
   private String AV36TFPrdNum ;
   private String AV66Stocksquimicos_producwwds_5_tfprdnum_sel ;
   private String AV37TFPrdNum_Sel ;
   private String AV69Stocksquimicos_producwwds_8_tfprdgots ;
   private String AV40TFPrdGots ;
   private String AV70Stocksquimicos_producwwds_9_tfprdgots_sel ;
   private String AV41TFPrdGots_Sel ;
   private String AV71Stocksquimicos_producwwds_10_tfprdreach ;
   private String AV42TFPrdReach ;
   private String AV72Stocksquimicos_producwwds_11_tfprdreach_sel ;
   private String AV43TFPrdReach_Sel ;
   private String AV74Stocksquimicos_producwwds_13_tfprdhm ;
   private String AV46TFPrdHm ;
   private String AV75Stocksquimicos_producwwds_14_tfprdhm_sel ;
   private String AV47TFPrdHm_Sel ;
   private String AV78Stocksquimicos_producwwds_17_tfprdthelist ;
   private String AV52TFPrdTHELIST ;
   private String AV79Stocksquimicos_producwwds_18_tfprdthelist_sel ;
   private String AV53TFPrdTHELIST_Sel ;
   private String AV80Stocksquimicos_producwwds_19_tfprdhs ;
   private String AV54TFPrdHS ;
   private String AV81Stocksquimicos_producwwds_20_tfprdhs_sel ;
   private String AV55TFPrdHS_Sel ;
   private String scmdbuf ;
   private String lV63Stocksquimicos_producwwds_2_tfprdnom ;
   private String lV65Stocksquimicos_producwwds_4_tfprdnum ;
   private String lV69Stocksquimicos_producwwds_8_tfprdgots ;
   private String lV71Stocksquimicos_producwwds_10_tfprdreach ;
   private String lV74Stocksquimicos_producwwds_13_tfprdhm ;
   private String lV78Stocksquimicos_producwwds_17_tfprdthelist ;
   private String lV80Stocksquimicos_producwwds_19_tfprdhs ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV82Stocksquimicos_producwwds_21_tfprdfhs ;
   private java.util.Date AV56TFPrdFHS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean A13881PrdEsCompu ;
   private boolean AV29OrderedDsc ;
   private boolean n13302PrdTHELIST ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV44TFPrdOkotex_SelsJson ;
   private String AV48TFPrdZDHC_SelsJson ;
   private String AV50TFPrdList_SelsJson ;
   private String AV11Filename ;
   private String AV62Stocksquimicos_producwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV62Stocksquimicos_producwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08VI2_A9742PrdFHS ;
   private String[] P08VI2_A9741PrdHS ;
   private String[] P08VI2_A13302PrdTHELIST ;
   private boolean[] P08VI2_n13302PrdTHELIST ;
   private String[] P08VI2_A11364PrdHm ;
   private String[] P08VI2_A5887PrdReach ;
   private String[] P08VI2_A11363PrdGots ;
   private java.math.BigDecimal[] P08VI2_A9733PrdAox ;
   private String[] P08VI2_A718PrdNom ;
   private String[] P08VI2_A11687PrdList ;
   private String[] P08VI2_A13301PrdZDHC ;
   private String[] P08VI2_A5888PrdOkotex ;
   private String[] P08VI2_A719PrdNum ;
   private String[] P08VI2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV73Stocksquimicos_producwwds_12_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV45TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV76Stocksquimicos_producwwds_15_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV49TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV77Stocksquimicos_producwwds_16_tfprdlist_sels ;
   private GXSimpleCollection<String> AV51TFPrdList_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class producwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08VI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV73Stocksquimicos_producwwds_12_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV76Stocksquimicos_producwwds_15_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV77Stocksquimicos_producwwds_16_tfprdlist_sels ,
                                          String AV64Stocksquimicos_producwwds_3_tfprdnom_sel ,
                                          String AV63Stocksquimicos_producwwds_2_tfprdnom ,
                                          String AV66Stocksquimicos_producwwds_5_tfprdnum_sel ,
                                          String AV65Stocksquimicos_producwwds_4_tfprdnum ,
                                          java.math.BigDecimal AV67Stocksquimicos_producwwds_6_tfprdaox ,
                                          java.math.BigDecimal AV68Stocksquimicos_producwwds_7_tfprdaox_to ,
                                          String AV70Stocksquimicos_producwwds_9_tfprdgots_sel ,
                                          String AV69Stocksquimicos_producwwds_8_tfprdgots ,
                                          String AV72Stocksquimicos_producwwds_11_tfprdreach_sel ,
                                          String AV71Stocksquimicos_producwwds_10_tfprdreach ,
                                          int AV73Stocksquimicos_producwwds_12_tfprdokotex_sels_size ,
                                          String AV75Stocksquimicos_producwwds_14_tfprdhm_sel ,
                                          String AV74Stocksquimicos_producwwds_13_tfprdhm ,
                                          int AV76Stocksquimicos_producwwds_15_tfprdzdhc_sels_size ,
                                          int AV77Stocksquimicos_producwwds_16_tfprdlist_sels_size ,
                                          String AV79Stocksquimicos_producwwds_18_tfprdthelist_sel ,
                                          String AV78Stocksquimicos_producwwds_17_tfprdthelist ,
                                          String AV81Stocksquimicos_producwwds_20_tfprdhs_sel ,
                                          String AV80Stocksquimicos_producwwds_19_tfprdhs ,
                                          java.util.Date AV82Stocksquimicos_producwwds_21_tfprdfhs ,
                                          byte AV83Stocksquimicos_producwwds_22_tfprdescompuesto_sel ,
                                          String A718PrdNom ,
                                          String A719PrdNum ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV62Stocksquimicos_producwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[17];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT PrdFHS, PrdHS, PrdTHELIST, PrdHm, PrdReach, PrdGots, PrdAox, PrdNom, PrdList, PrdZDHC, PrdOkotex, PrdNum, EmprCod FROM TXPPRODUC" ;
      if ( (GXutil.strcmp("", AV64Stocksquimicos_producwwds_3_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV63Stocksquimicos_producwwds_2_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Stocksquimicos_producwwds_3_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNom = ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Stocksquimicos_producwwds_5_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV65Stocksquimicos_producwwds_4_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Stocksquimicos_producwwds_5_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67Stocksquimicos_producwwds_6_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(PrdAox >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV68Stocksquimicos_producwwds_7_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(PrdAox <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV70Stocksquimicos_producwwds_9_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV69Stocksquimicos_producwwds_8_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV70Stocksquimicos_producwwds_9_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(PrdGots = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV72Stocksquimicos_producwwds_11_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV71Stocksquimicos_producwwds_10_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV72Stocksquimicos_producwwds_11_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(PrdReach = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( AV73Stocksquimicos_producwwds_12_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV73Stocksquimicos_producwwds_12_tfprdokotex_sels, "PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV75Stocksquimicos_producwwds_14_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV74Stocksquimicos_producwwds_13_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Stocksquimicos_producwwds_14_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHm = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( AV76Stocksquimicos_producwwds_15_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Stocksquimicos_producwwds_15_tfprdzdhc_sels, "PrdZDHC IN (", ")")+")");
      }
      if ( AV77Stocksquimicos_producwwds_16_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV77Stocksquimicos_producwwds_16_tfprdlist_sels, "PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV79Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV78Stocksquimicos_producwwds_17_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Stocksquimicos_producwwds_18_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(PrdTHELIST = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Stocksquimicos_producwwds_20_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV80Stocksquimicos_producwwds_19_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Stocksquimicos_producwwds_20_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(PrdHS = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Stocksquimicos_producwwds_21_tfprdfhs)) )
      {
         addWhere(sWhereString, "(PrdFHS >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( AV83Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 1 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (1= 1))");
      }
      if ( AV83Stocksquimicos_producwwds_22_tfprdescompuesto_sel == 2 )
      {
         addWhere(sWhereString, "(( CASE  WHEN SUBSTR(PrdNum, 1, 1) = '0' THEN (1= 1) ELSE (0= 1) END) = (0= 1))");
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrdGots" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrdGots DESC" ;
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
                  return conditional_P08VI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08VI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((String[]) buf[12])[0] = rslt.getString(12, 6);
               ((String[]) buf[13])[0] = rslt.getString(13, 3);
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
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               return;
      }
   }

}

