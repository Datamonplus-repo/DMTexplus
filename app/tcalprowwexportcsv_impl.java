package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcalprowwexportcsv_impl extends GXWebProcedure
{
   public tcalprowwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TCALPROWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TCALPROWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TCALPROWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Documento", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mercado Interno / Externo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor o Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha-Hora Salida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Categoria", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Categoria", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Domicilio Envio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod Transp", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Matricula", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Observaciones", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "AT ID", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado AT ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV80Tcalprowwds_1_filterfulltext = AV30FilterFullText ;
      AV81Tcalprowwds_2_tfalbproid = AV35TFAlbProID ;
      AV82Tcalprowwds_3_tfalbproid_to = AV36TFAlbProID_To ;
      AV83Tcalprowwds_4_tfalbproinex_sels = AV38TFAlbProInEx_Sels ;
      AV84Tcalprowwds_5_tfalbprotipo_sels = AV40TFAlbProTipo_Sels ;
      AV85Tcalprowwds_6_tfalbprodate = AV41TFAlbProDate ;
      AV86Tcalprowwds_7_tfalbprosal = AV43TFAlbProSal ;
      AV87Tcalprowwds_8_tfcatdocid = AV45TFCatDocID ;
      AV88Tcalprowwds_9_tfcatdocid_to = AV46TFCatDocID_To ;
      AV89Tcalprowwds_10_tfcatdocnom = AV47TFCatDocNom ;
      AV90Tcalprowwds_11_tfcatdocnom_sel = AV48TFCatDocNom_Sel ;
      AV91Tcalprowwds_12_tfalbproprvid = AV49TFAlbProPrvID ;
      AV92Tcalprowwds_13_tfalbproprvid_to = AV50TFAlbProPrvID_To ;
      AV93Tcalprowwds_14_tfalbproprvnom = AV51TFAlbProPrvNom ;
      AV94Tcalprowwds_15_tfalbproprvnom_sel = AV52TFAlbProPrvNom_Sel ;
      AV95Tcalprowwds_16_tfalbproclicod = AV53TFAlbProCliCod ;
      AV96Tcalprowwds_17_tfalbproclicod_to = AV54TFAlbProCliCod_To ;
      AV97Tcalprowwds_18_tfalbproclinom = AV55TFAlbProCliNom ;
      AV98Tcalprowwds_19_tfalbproclinom_sel = AV56TFAlbProCliNom_Sel ;
      AV99Tcalprowwds_20_tfalbprodomenv = AV57TFAlbProDomEnv ;
      AV100Tcalprowwds_21_tfalbprodomenv_to = AV58TFAlbProDomEnv_To ;
      AV101Tcalprowwds_22_tftrncod = AV59TFTrnCod ;
      AV102Tcalprowwds_23_tftrncod_to = AV60TFTrnCod_To ;
      AV103Tcalprowwds_24_tftrnnom = AV61TFTrnNom ;
      AV104Tcalprowwds_25_tftrnnom_sel = AV62TFTrnNom_Sel ;
      AV105Tcalprowwds_26_tfalbpromatricula = AV63TFAlbProMatricula ;
      AV106Tcalprowwds_27_tfalbpromatricula_sel = AV64TFAlbProMatricula_Sel ;
      AV107Tcalprowwds_28_tfalbproobs = AV65TFAlbProObs ;
      AV108Tcalprowwds_29_tfalbproobs_sel = AV66TFAlbProObs_Sel ;
      AV109Tcalprowwds_30_tfalbproidat = AV71TFAlbProIDAT ;
      AV110Tcalprowwds_31_tfalbproidat_sel = AV72TFAlbProIDAT_Sel ;
      AV111Tcalprowwds_32_tfalbprostat_sels = AV76TFAlbProStAT_Sels ;
      AV112Tcalprowwds_33_tfalbproanulado_sels = AV70TFAlbProAnulado_Sels ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A13452AlbProInEx) ,
                                           AV83Tcalprowwds_4_tfalbproinex_sels ,
                                           A13417AlbProTipo ,
                                           AV84Tcalprowwds_5_tfalbprotipo_sels ,
                                           Byte.valueOf(A13438AlbProStAT) ,
                                           AV111Tcalprowwds_32_tfalbprostat_sels ,
                                           A13440AlbProAnul ,
                                           AV112Tcalprowwds_33_tfalbproanulado_sels ,
                                           Integer.valueOf(AV81Tcalprowwds_2_tfalbproid) ,
                                           Integer.valueOf(AV82Tcalprowwds_3_tfalbproid_to) ,
                                           Integer.valueOf(AV83Tcalprowwds_4_tfalbproinex_sels.size()) ,
                                           Integer.valueOf(AV84Tcalprowwds_5_tfalbprotipo_sels.size()) ,
                                           AV85Tcalprowwds_6_tfalbprodate ,
                                           AV86Tcalprowwds_7_tfalbprosal ,
                                           Short.valueOf(AV87Tcalprowwds_8_tfcatdocid) ,
                                           Short.valueOf(AV88Tcalprowwds_9_tfcatdocid_to) ,
                                           AV90Tcalprowwds_11_tfcatdocnom_sel ,
                                           AV89Tcalprowwds_10_tfcatdocnom ,
                                           Integer.valueOf(AV91Tcalprowwds_12_tfalbproprvid) ,
                                           Integer.valueOf(AV92Tcalprowwds_13_tfalbproprvid_to) ,
                                           AV94Tcalprowwds_15_tfalbproprvnom_sel ,
                                           AV93Tcalprowwds_14_tfalbproprvnom ,
                                           Integer.valueOf(AV95Tcalprowwds_16_tfalbproclicod) ,
                                           Integer.valueOf(AV96Tcalprowwds_17_tfalbproclicod_to) ,
                                           AV98Tcalprowwds_19_tfalbproclinom_sel ,
                                           AV97Tcalprowwds_18_tfalbproclinom ,
                                           Byte.valueOf(AV99Tcalprowwds_20_tfalbprodomenv) ,
                                           Byte.valueOf(AV100Tcalprowwds_21_tfalbprodomenv_to) ,
                                           Short.valueOf(AV101Tcalprowwds_22_tftrncod) ,
                                           Short.valueOf(AV102Tcalprowwds_23_tftrncod_to) ,
                                           AV104Tcalprowwds_25_tftrnnom_sel ,
                                           AV103Tcalprowwds_24_tftrnnom ,
                                           AV106Tcalprowwds_27_tfalbpromatricula_sel ,
                                           AV105Tcalprowwds_26_tfalbpromatricula ,
                                           AV108Tcalprowwds_29_tfalbproobs_sel ,
                                           AV107Tcalprowwds_28_tfalbproobs ,
                                           AV110Tcalprowwds_31_tfalbproidat_sel ,
                                           AV109Tcalprowwds_30_tfalbproidat ,
                                           Integer.valueOf(AV111Tcalprowwds_32_tfalbprostat_sels.size()) ,
                                           Integer.valueOf(AV112Tcalprowwds_33_tfalbproanulado_sels.size()) ,
                                           Integer.valueOf(A13418AlbProID) ,
                                           A13430AlbProDate ,
                                           A13429AlbProSal ,
                                           Short.valueOf(A13453CatDocID) ,
                                           A13454CatDocNom ,
                                           Integer.valueOf(A13419AlbProPrvI) ,
                                           A13420AlbProPrvN ,
                                           Integer.valueOf(A13425AlbProCliC) ,
                                           A13426AlbProCliN ,
                                           Byte.valueOf(A13427AlbProDomE) ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           A13424AlbProMatr ,
                                           A13439AlbProObs ,
                                           A13436AlbProIDAT ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV80Tcalprowwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV89Tcalprowwds_10_tfcatdocnom = GXutil.padr( GXutil.rtrim( AV89Tcalprowwds_10_tfcatdocnom), 30, "%") ;
      lV93Tcalprowwds_14_tfalbproprvnom = GXutil.padr( GXutil.rtrim( AV93Tcalprowwds_14_tfalbproprvnom), 30, "%") ;
      lV97Tcalprowwds_18_tfalbproclinom = GXutil.padr( GXutil.rtrim( AV97Tcalprowwds_18_tfalbproclinom), 30, "%") ;
      lV103Tcalprowwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV103Tcalprowwds_24_tftrnnom), 30, "%") ;
      lV105Tcalprowwds_26_tfalbpromatricula = GXutil.padr( GXutil.rtrim( AV105Tcalprowwds_26_tfalbpromatricula), 30, "%") ;
      lV107Tcalprowwds_28_tfalbproobs = GXutil.concat( GXutil.rtrim( AV107Tcalprowwds_28_tfalbproobs), "%", "") ;
      lV109Tcalprowwds_30_tfalbproidat = GXutil.padr( GXutil.rtrim( AV109Tcalprowwds_30_tfalbproidat), 20, "%") ;
      /* Using cursor P091T2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV81Tcalprowwds_2_tfalbproid), Integer.valueOf(AV82Tcalprowwds_3_tfalbproid_to), AV85Tcalprowwds_6_tfalbprodate, AV86Tcalprowwds_7_tfalbprosal, Short.valueOf(AV87Tcalprowwds_8_tfcatdocid), Short.valueOf(AV88Tcalprowwds_9_tfcatdocid_to), lV89Tcalprowwds_10_tfcatdocnom, AV90Tcalprowwds_11_tfcatdocnom_sel, Integer.valueOf(AV91Tcalprowwds_12_tfalbproprvid), Integer.valueOf(AV92Tcalprowwds_13_tfalbproprvid_to), lV93Tcalprowwds_14_tfalbproprvnom, AV94Tcalprowwds_15_tfalbproprvnom_sel, Integer.valueOf(AV95Tcalprowwds_16_tfalbproclicod), Integer.valueOf(AV96Tcalprowwds_17_tfalbproclicod_to), lV97Tcalprowwds_18_tfalbproclinom, AV98Tcalprowwds_19_tfalbproclinom_sel, Byte.valueOf(AV99Tcalprowwds_20_tfalbprodomenv), Byte.valueOf(AV100Tcalprowwds_21_tfalbprodomenv_to), Short.valueOf(AV101Tcalprowwds_22_tftrncod), Short.valueOf(AV102Tcalprowwds_23_tftrncod_to), lV103Tcalprowwds_24_tftrnnom, AV104Tcalprowwds_25_tftrnnom_sel, lV105Tcalprowwds_26_tfalbpromatricula, AV106Tcalprowwds_27_tfalbpromatricula_sel, lV107Tcalprowwds_28_tfalbproobs, AV108Tcalprowwds_29_tfalbproobs_sel, lV109Tcalprowwds_30_tfalbproidat, AV110Tcalprowwds_31_tfalbproidat_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P091T2_A396EmprCod[0] ;
         A13440AlbProAnul = P091T2_A13440AlbProAnul[0] ;
         A13438AlbProStAT = P091T2_A13438AlbProStAT[0] ;
         A13436AlbProIDAT = P091T2_A13436AlbProIDAT[0] ;
         A13439AlbProObs = P091T2_A13439AlbProObs[0] ;
         A13424AlbProMatr = P091T2_A13424AlbProMatr[0] ;
         A841TrnNom = P091T2_A841TrnNom[0] ;
         n841TrnNom = P091T2_n841TrnNom[0] ;
         A840TrnCod = P091T2_A840TrnCod[0] ;
         n840TrnCod = P091T2_n840TrnCod[0] ;
         A13427AlbProDomE = P091T2_A13427AlbProDomE[0] ;
         A13426AlbProCliN = P091T2_A13426AlbProCliN[0] ;
         A13425AlbProCliC = P091T2_A13425AlbProCliC[0] ;
         A13420AlbProPrvN = P091T2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091T2_n13420AlbProPrvN[0] ;
         A13419AlbProPrvI = P091T2_A13419AlbProPrvI[0] ;
         A13454CatDocNom = P091T2_A13454CatDocNom[0] ;
         n13454CatDocNom = P091T2_n13454CatDocNom[0] ;
         A13453CatDocID = P091T2_A13453CatDocID[0] ;
         n13453CatDocID = P091T2_n13453CatDocID[0] ;
         A13429AlbProSal = P091T2_A13429AlbProSal[0] ;
         A13430AlbProDate = P091T2_A13430AlbProDate[0] ;
         A13418AlbProID = P091T2_A13418AlbProID[0] ;
         A13417AlbProTipo = P091T2_A13417AlbProTipo[0] ;
         A13452AlbProInEx = P091T2_A13452AlbProInEx[0] ;
         A841TrnNom = P091T2_A841TrnNom[0] ;
         n841TrnNom = P091T2_n841TrnNom[0] ;
         A13426AlbProCliN = P091T2_A13426AlbProCliN[0] ;
         A13420AlbProPrvN = P091T2_A13420AlbProPrvN[0] ;
         n13420AlbProPrvN = P091T2_n13420AlbProPrvN[0] ;
         A13454CatDocNom = P091T2_A13454CatDocNom[0] ;
         n13454CatDocNom = P091T2_n13454CatDocNom[0] ;
         if ( (GXutil.strcmp("", AV80Tcalprowwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A13418AlbProID, 8, 0) , GXutil.padr( "%" + AV80Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado interno", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "mercado externo", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A13452AlbProInEx == 2 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "proveedor", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cliente", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A13453CatDocID, 4, 0) , GXutil.padr( "%" + AV80Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13454CatDocNom) , GXutil.padr( "%" + GXutil.upper( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13419AlbProPrvI, 6, 0) , GXutil.padr( "%" + AV80Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13420AlbProPrvN) , GXutil.padr( "%" + GXutil.upper( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13425AlbProCliC, 6, 0) , GXutil.padr( "%" + AV80Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13426AlbProCliN) , GXutil.padr( "%" + GXutil.upper( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13427AlbProDomE, 1, 0) , GXutil.padr( "%" + AV80Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV80Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13424AlbProMatr) , GXutil.padr( "%" + GXutil.upper( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13439AlbProObs) , GXutil.padr( "%" + GXutil.upper( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13436AlbProIDAT) , GXutil.padr( "%" + GXutil.upper( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13438AlbProStAT, 1, 0) , GXutil.padr( "%" + AV80Tcalprowwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13440AlbProAnul) , GXutil.padr( "%" + GXutil.upper( AV80Tcalprowwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A13418AlbProID, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( A13452AlbProInEx == 1 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Mercado Interno", "") ;
               }
               else if ( A13452AlbProInEx == 2 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Mercado Externo", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A13417AlbProTipo), "P") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Proveedor", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A13417AlbProTipo), "C") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Cliente", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A13430AlbProDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A13429AlbProSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A13453CatDocID, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13454CatDocNom, ";", ","), GXv_char3) ;
               tcalprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A13419AlbProPrvI, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13420AlbProPrvN, ";", ","), GXv_char3) ;
               tcalprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A13425AlbProCliC, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13426AlbProCliN, ";", ","), GXv_char3) ;
               tcalprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A13427AlbProDomE, 1, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A840TrnCod, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A841TrnNom, ";", ","), GXv_char3) ;
               tcalprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13424AlbProMatr, ";", ","), GXv_char3) ;
               tcalprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV31NewLine = GXutil.chr( (short)(10)) ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( GXutil.strReplace( A13439AlbProObs, ";", ","), AV31NewLine, " "), GXv_char3) ;
               tcalprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13436AlbProIDAT, ";", ","), GXv_char3) ;
               tcalprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( A13438AlbProStAT == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Pendiente", "") ;
               }
               else if ( A13438AlbProStAT == 3 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Enviada", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A13440AlbProAnul), "") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Activo", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A13440AlbProAnul), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Anulado", "") ;
               }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TCALPROWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProID", "", "Nº Documento", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProInEx", "", "Mercado Interno / Externo", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProTipo", "", "Proveedor o Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProDate", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProSal", "", "Fecha-Hora Salida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CatDocID", "", "Codigo Categoria", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CatDocNom", "", "Categoria", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProPrvID", "", "Codigo Proveedor", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProPrvNom", "", "Nombre Proveedor", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProCliCod", "", "Codigo Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProCliNom", "", "Nombre Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProDomEnv", "", "Domicilio Envio", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnCod", "", "Cod Transp", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnNom", "", "Transportista", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProMatricula", "", "Matricula", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProObs", "", "Observaciones", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProIDAT", "", "AT ID", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProStAT", "", "Estado AT ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbProAnulado", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TCALPROWWColumnsSelector", GXv_char3) ;
      tcalprowwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TCALPROWWGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TCALPROWWGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("TCALPROWWGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV113GXV1 = 1 ;
      while ( AV113GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV113GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROID") == 0 )
         {
            AV35TFAlbProID = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV36TFAlbProID_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROINEX_SEL") == 0 )
         {
            AV37TFAlbProInEx_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV38TFAlbProInEx_Sels.fromJSonString(AV37TFAlbProInEx_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROTIPO_SEL") == 0 )
         {
            AV39TFAlbProTipo_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV40TFAlbProTipo_Sels.fromJSonString(AV39TFAlbProTipo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODATE") == 0 )
         {
            AV41TFAlbProDate = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSAL") == 0 )
         {
            AV43TFAlbProSal = localUtil.ctot( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCID") == 0 )
         {
            AV45TFCatDocID = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFCatDocID_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM") == 0 )
         {
            AV47TFCatDocNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCATDOCNOM_SEL") == 0 )
         {
            AV48TFCatDocNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVID") == 0 )
         {
            AV49TFAlbProPrvID = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFAlbProPrvID_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM") == 0 )
         {
            AV51TFAlbProPrvNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRVNOM_SEL") == 0 )
         {
            AV52TFAlbProPrvNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLICOD") == 0 )
         {
            AV53TFAlbProCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFAlbProCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLINOM") == 0 )
         {
            AV55TFAlbProCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCLINOM_SEL") == 0 )
         {
            AV56TFAlbProCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODOMENV") == 0 )
         {
            AV57TFAlbProDomEnv = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFAlbProDomEnv_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV59TFTrnCod = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFTrnCod_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV61TFTrnNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV62TFTrnNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROMATRICULA") == 0 )
         {
            AV63TFAlbProMatricula = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROMATRICULA_SEL") == 0 )
         {
            AV64TFAlbProMatricula_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROOBS") == 0 )
         {
            AV65TFAlbProObs = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROOBS_SEL") == 0 )
         {
            AV66TFAlbProObs_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT") == 0 )
         {
            AV71TFAlbProIDAT = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROIDAT_SEL") == 0 )
         {
            AV72TFAlbProIDAT_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROSTAT_SEL") == 0 )
         {
            AV75TFAlbProStAT_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV76TFAlbProStAT_Sels.fromJSonString(AV75TFAlbProStAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROANULADO_SEL") == 0 )
         {
            AV69TFAlbProAnulado_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV70TFAlbProAnulado_Sels.fromJSonString(AV69TFAlbProAnulado_SelsJson, null);
         }
         AV113GXV1 = (int)(AV113GXV1+1) ;
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
      A13417AlbProTipo = "" ;
      A13430AlbProDate = GXutil.nullDate() ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13454CatDocNom = "" ;
      A13420AlbProPrvN = "" ;
      A13426AlbProCliN = "" ;
      A841TrnNom = "" ;
      A13424AlbProMatr = "" ;
      A13439AlbProObs = "" ;
      A13436AlbProIDAT = "" ;
      A13440AlbProAnul = "" ;
      AV80Tcalprowwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV83Tcalprowwds_4_tfalbproinex_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV38TFAlbProInEx_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV84Tcalprowwds_5_tfalbprotipo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40TFAlbProTipo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV85Tcalprowwds_6_tfalbprodate = GXutil.nullDate() ;
      AV41TFAlbProDate = GXutil.nullDate() ;
      AV86Tcalprowwds_7_tfalbprosal = GXutil.resetTime( GXutil.nullDate() );
      AV43TFAlbProSal = GXutil.resetTime( GXutil.nullDate() );
      AV89Tcalprowwds_10_tfcatdocnom = "" ;
      AV47TFCatDocNom = "" ;
      AV90Tcalprowwds_11_tfcatdocnom_sel = "" ;
      AV48TFCatDocNom_Sel = "" ;
      AV93Tcalprowwds_14_tfalbproprvnom = "" ;
      AV51TFAlbProPrvNom = "" ;
      AV94Tcalprowwds_15_tfalbproprvnom_sel = "" ;
      AV52TFAlbProPrvNom_Sel = "" ;
      AV97Tcalprowwds_18_tfalbproclinom = "" ;
      AV55TFAlbProCliNom = "" ;
      AV98Tcalprowwds_19_tfalbproclinom_sel = "" ;
      AV56TFAlbProCliNom_Sel = "" ;
      AV103Tcalprowwds_24_tftrnnom = "" ;
      AV61TFTrnNom = "" ;
      AV104Tcalprowwds_25_tftrnnom_sel = "" ;
      AV62TFTrnNom_Sel = "" ;
      AV105Tcalprowwds_26_tfalbpromatricula = "" ;
      AV63TFAlbProMatricula = "" ;
      AV106Tcalprowwds_27_tfalbpromatricula_sel = "" ;
      AV64TFAlbProMatricula_Sel = "" ;
      AV107Tcalprowwds_28_tfalbproobs = "" ;
      AV65TFAlbProObs = "" ;
      AV108Tcalprowwds_29_tfalbproobs_sel = "" ;
      AV66TFAlbProObs_Sel = "" ;
      AV109Tcalprowwds_30_tfalbproidat = "" ;
      AV71TFAlbProIDAT = "" ;
      AV110Tcalprowwds_31_tfalbproidat_sel = "" ;
      AV72TFAlbProIDAT_Sel = "" ;
      AV111Tcalprowwds_32_tfalbprostat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV76TFAlbProStAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV112Tcalprowwds_33_tfalbproanulado_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV70TFAlbProAnulado_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      lV80Tcalprowwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV89Tcalprowwds_10_tfcatdocnom = "" ;
      lV93Tcalprowwds_14_tfalbproprvnom = "" ;
      lV97Tcalprowwds_18_tfalbproclinom = "" ;
      lV103Tcalprowwds_24_tftrnnom = "" ;
      lV105Tcalprowwds_26_tfalbpromatricula = "" ;
      lV107Tcalprowwds_28_tfalbproobs = "" ;
      lV109Tcalprowwds_30_tfalbproidat = "" ;
      P091T2_A396EmprCod = new String[] {""} ;
      P091T2_A13440AlbProAnul = new String[] {""} ;
      P091T2_A13438AlbProStAT = new byte[1] ;
      P091T2_A13436AlbProIDAT = new String[] {""} ;
      P091T2_A13439AlbProObs = new String[] {""} ;
      P091T2_A13424AlbProMatr = new String[] {""} ;
      P091T2_A841TrnNom = new String[] {""} ;
      P091T2_n841TrnNom = new boolean[] {false} ;
      P091T2_A840TrnCod = new short[1] ;
      P091T2_n840TrnCod = new boolean[] {false} ;
      P091T2_A13427AlbProDomE = new byte[1] ;
      P091T2_A13426AlbProCliN = new String[] {""} ;
      P091T2_A13425AlbProCliC = new int[1] ;
      P091T2_A13420AlbProPrvN = new String[] {""} ;
      P091T2_n13420AlbProPrvN = new boolean[] {false} ;
      P091T2_A13419AlbProPrvI = new int[1] ;
      P091T2_A13454CatDocNom = new String[] {""} ;
      P091T2_n13454CatDocNom = new boolean[] {false} ;
      P091T2_A13453CatDocID = new short[1] ;
      P091T2_n13453CatDocID = new boolean[] {false} ;
      P091T2_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      P091T2_A13430AlbProDate = new java.util.Date[] {GXutil.nullDate()} ;
      P091T2_A13418AlbProID = new int[1] ;
      P091T2_A13417AlbProTipo = new String[] {""} ;
      P091T2_A13452AlbProInEx = new byte[1] ;
      A396EmprCod = "" ;
      AV31NewLine = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV37TFAlbProInEx_SelsJson = "" ;
      AV39TFAlbProTipo_SelsJson = "" ;
      AV75TFAlbProStAT_SelsJson = "" ;
      AV69TFAlbProAnulado_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcalprowwexportcsv__default(),
         new Object[] {
             new Object[] {
            P091T2_A396EmprCod, P091T2_A13440AlbProAnul, P091T2_A13438AlbProStAT, P091T2_A13436AlbProIDAT, P091T2_A13439AlbProObs, P091T2_A13424AlbProMatr, P091T2_A841TrnNom, P091T2_n841TrnNom, P091T2_A840TrnCod, P091T2_n840TrnCod,
            P091T2_A13427AlbProDomE, P091T2_A13426AlbProCliN, P091T2_A13425AlbProCliC, P091T2_A13420AlbProPrvN, P091T2_n13420AlbProPrvN, P091T2_A13419AlbProPrvI, P091T2_A13454CatDocNom, P091T2_n13454CatDocNom, P091T2_A13453CatDocID, P091T2_n13453CatDocID,
            P091T2_A13429AlbProSal, P091T2_A13430AlbProDate, P091T2_A13418AlbProID, P091T2_A13417AlbProTipo, P091T2_A13452AlbProInEx
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A13452AlbProInEx ;
   private byte A13427AlbProDomE ;
   private byte A13438AlbProStAT ;
   private byte AV99Tcalprowwds_20_tfalbprodomenv ;
   private byte AV57TFAlbProDomEnv ;
   private byte AV100Tcalprowwds_21_tfalbprodomenv_to ;
   private byte AV58TFAlbProDomEnv_To ;
   private short gxcookieaux ;
   private short A13453CatDocID ;
   private short A840TrnCod ;
   private short AV87Tcalprowwds_8_tfcatdocid ;
   private short AV45TFCatDocID ;
   private short AV88Tcalprowwds_9_tfcatdocid_to ;
   private short AV46TFCatDocID_To ;
   private short AV101Tcalprowwds_22_tftrncod ;
   private short AV59TFTrnCod ;
   private short AV102Tcalprowwds_23_tftrncod_to ;
   private short AV60TFTrnCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A13418AlbProID ;
   private int A13419AlbProPrvI ;
   private int A13425AlbProCliC ;
   private int AV81Tcalprowwds_2_tfalbproid ;
   private int AV35TFAlbProID ;
   private int AV82Tcalprowwds_3_tfalbproid_to ;
   private int AV36TFAlbProID_To ;
   private int AV91Tcalprowwds_12_tfalbproprvid ;
   private int AV49TFAlbProPrvID ;
   private int AV92Tcalprowwds_13_tfalbproprvid_to ;
   private int AV50TFAlbProPrvID_To ;
   private int AV95Tcalprowwds_16_tfalbproclicod ;
   private int AV53TFAlbProCliCod ;
   private int AV96Tcalprowwds_17_tfalbproclicod_to ;
   private int AV54TFAlbProCliCod_To ;
   private int AV83Tcalprowwds_4_tfalbproinex_sels_size ;
   private int AV84Tcalprowwds_5_tfalbprotipo_sels_size ;
   private int AV111Tcalprowwds_32_tfalbprostat_sels_size ;
   private int AV112Tcalprowwds_33_tfalbproanulado_sels_size ;
   private int AV113GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A13417AlbProTipo ;
   private String A13454CatDocNom ;
   private String A13420AlbProPrvN ;
   private String A13426AlbProCliN ;
   private String A841TrnNom ;
   private String A13424AlbProMatr ;
   private String A13436AlbProIDAT ;
   private String A13440AlbProAnul ;
   private String AV89Tcalprowwds_10_tfcatdocnom ;
   private String AV47TFCatDocNom ;
   private String AV90Tcalprowwds_11_tfcatdocnom_sel ;
   private String AV48TFCatDocNom_Sel ;
   private String AV93Tcalprowwds_14_tfalbproprvnom ;
   private String AV51TFAlbProPrvNom ;
   private String AV94Tcalprowwds_15_tfalbproprvnom_sel ;
   private String AV52TFAlbProPrvNom_Sel ;
   private String AV97Tcalprowwds_18_tfalbproclinom ;
   private String AV55TFAlbProCliNom ;
   private String AV98Tcalprowwds_19_tfalbproclinom_sel ;
   private String AV56TFAlbProCliNom_Sel ;
   private String AV103Tcalprowwds_24_tftrnnom ;
   private String AV61TFTrnNom ;
   private String AV104Tcalprowwds_25_tftrnnom_sel ;
   private String AV62TFTrnNom_Sel ;
   private String AV105Tcalprowwds_26_tfalbpromatricula ;
   private String AV63TFAlbProMatricula ;
   private String AV106Tcalprowwds_27_tfalbpromatricula_sel ;
   private String AV64TFAlbProMatricula_Sel ;
   private String AV109Tcalprowwds_30_tfalbproidat ;
   private String AV71TFAlbProIDAT ;
   private String AV110Tcalprowwds_31_tfalbproidat_sel ;
   private String AV72TFAlbProIDAT_Sel ;
   private String scmdbuf ;
   private String lV89Tcalprowwds_10_tfcatdocnom ;
   private String lV93Tcalprowwds_14_tfalbproprvnom ;
   private String lV97Tcalprowwds_18_tfalbproclinom ;
   private String lV103Tcalprowwds_24_tftrnnom ;
   private String lV105Tcalprowwds_26_tfalbpromatricula ;
   private String lV109Tcalprowwds_30_tfalbproidat ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date AV86Tcalprowwds_7_tfalbprosal ;
   private java.util.Date AV43TFAlbProSal ;
   private java.util.Date A13430AlbProDate ;
   private java.util.Date AV85Tcalprowwds_6_tfalbprodate ;
   private java.util.Date AV41TFAlbProDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n13420AlbProPrvN ;
   private boolean n13454CatDocNom ;
   private boolean n13453CatDocID ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV37TFAlbProInEx_SelsJson ;
   private String AV39TFAlbProTipo_SelsJson ;
   private String AV75TFAlbProStAT_SelsJson ;
   private String AV69TFAlbProAnulado_SelsJson ;
   private String AV11Filename ;
   private String A13439AlbProObs ;
   private String AV80Tcalprowwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV107Tcalprowwds_28_tfalbproobs ;
   private String AV65TFAlbProObs ;
   private String AV108Tcalprowwds_29_tfalbproobs_sel ;
   private String AV66TFAlbProObs_Sel ;
   private String lV80Tcalprowwds_1_filterfulltext ;
   private String lV107Tcalprowwds_28_tfalbproobs ;
   private String AV31NewLine ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV83Tcalprowwds_4_tfalbproinex_sels ;
   private GXSimpleCollection<Byte> AV38TFAlbProInEx_Sels ;
   private GXSimpleCollection<Byte> AV111Tcalprowwds_32_tfalbprostat_sels ;
   private GXSimpleCollection<Byte> AV76TFAlbProStAT_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P091T2_A396EmprCod ;
   private String[] P091T2_A13440AlbProAnul ;
   private byte[] P091T2_A13438AlbProStAT ;
   private String[] P091T2_A13436AlbProIDAT ;
   private String[] P091T2_A13439AlbProObs ;
   private String[] P091T2_A13424AlbProMatr ;
   private String[] P091T2_A841TrnNom ;
   private boolean[] P091T2_n841TrnNom ;
   private short[] P091T2_A840TrnCod ;
   private boolean[] P091T2_n840TrnCod ;
   private byte[] P091T2_A13427AlbProDomE ;
   private String[] P091T2_A13426AlbProCliN ;
   private int[] P091T2_A13425AlbProCliC ;
   private String[] P091T2_A13420AlbProPrvN ;
   private boolean[] P091T2_n13420AlbProPrvN ;
   private int[] P091T2_A13419AlbProPrvI ;
   private String[] P091T2_A13454CatDocNom ;
   private boolean[] P091T2_n13454CatDocNom ;
   private short[] P091T2_A13453CatDocID ;
   private boolean[] P091T2_n13453CatDocID ;
   private java.util.Date[] P091T2_A13429AlbProSal ;
   private java.util.Date[] P091T2_A13430AlbProDate ;
   private int[] P091T2_A13418AlbProID ;
   private String[] P091T2_A13417AlbProTipo ;
   private byte[] P091T2_A13452AlbProInEx ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV84Tcalprowwds_5_tfalbprotipo_sels ;
   private GXSimpleCollection<String> AV40TFAlbProTipo_Sels ;
   private GXSimpleCollection<String> AV112Tcalprowwds_33_tfalbproanulado_sels ;
   private GXSimpleCollection<String> AV70TFAlbProAnulado_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
}

final  class tcalprowwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P091T2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A13452AlbProInEx ,
                                          GXSimpleCollection<Byte> AV83Tcalprowwds_4_tfalbproinex_sels ,
                                          String A13417AlbProTipo ,
                                          GXSimpleCollection<String> AV84Tcalprowwds_5_tfalbprotipo_sels ,
                                          byte A13438AlbProStAT ,
                                          GXSimpleCollection<Byte> AV111Tcalprowwds_32_tfalbprostat_sels ,
                                          String A13440AlbProAnul ,
                                          GXSimpleCollection<String> AV112Tcalprowwds_33_tfalbproanulado_sels ,
                                          int AV81Tcalprowwds_2_tfalbproid ,
                                          int AV82Tcalprowwds_3_tfalbproid_to ,
                                          int AV83Tcalprowwds_4_tfalbproinex_sels_size ,
                                          int AV84Tcalprowwds_5_tfalbprotipo_sels_size ,
                                          java.util.Date AV85Tcalprowwds_6_tfalbprodate ,
                                          java.util.Date AV86Tcalprowwds_7_tfalbprosal ,
                                          short AV87Tcalprowwds_8_tfcatdocid ,
                                          short AV88Tcalprowwds_9_tfcatdocid_to ,
                                          String AV90Tcalprowwds_11_tfcatdocnom_sel ,
                                          String AV89Tcalprowwds_10_tfcatdocnom ,
                                          int AV91Tcalprowwds_12_tfalbproprvid ,
                                          int AV92Tcalprowwds_13_tfalbproprvid_to ,
                                          String AV94Tcalprowwds_15_tfalbproprvnom_sel ,
                                          String AV93Tcalprowwds_14_tfalbproprvnom ,
                                          int AV95Tcalprowwds_16_tfalbproclicod ,
                                          int AV96Tcalprowwds_17_tfalbproclicod_to ,
                                          String AV98Tcalprowwds_19_tfalbproclinom_sel ,
                                          String AV97Tcalprowwds_18_tfalbproclinom ,
                                          byte AV99Tcalprowwds_20_tfalbprodomenv ,
                                          byte AV100Tcalprowwds_21_tfalbprodomenv_to ,
                                          short AV101Tcalprowwds_22_tftrncod ,
                                          short AV102Tcalprowwds_23_tftrncod_to ,
                                          String AV104Tcalprowwds_25_tftrnnom_sel ,
                                          String AV103Tcalprowwds_24_tftrnnom ,
                                          String AV106Tcalprowwds_27_tfalbpromatricula_sel ,
                                          String AV105Tcalprowwds_26_tfalbpromatricula ,
                                          String AV108Tcalprowwds_29_tfalbproobs_sel ,
                                          String AV107Tcalprowwds_28_tfalbproobs ,
                                          String AV110Tcalprowwds_31_tfalbproidat_sel ,
                                          String AV109Tcalprowwds_30_tfalbproidat ,
                                          int AV111Tcalprowwds_32_tfalbprostat_sels_size ,
                                          int AV112Tcalprowwds_33_tfalbproanulado_sels_size ,
                                          int A13418AlbProID ,
                                          java.util.Date A13430AlbProDate ,
                                          java.util.Date A13429AlbProSal ,
                                          short A13453CatDocID ,
                                          String A13454CatDocNom ,
                                          int A13419AlbProPrvI ,
                                          String A13420AlbProPrvN ,
                                          int A13425AlbProCliC ,
                                          String A13426AlbProCliN ,
                                          byte A13427AlbProDomE ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          String A13424AlbProMatr ,
                                          String A13439AlbProObs ,
                                          String A13436AlbProIDAT ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV80Tcalprowwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[28];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbProAnul, T1.AlbProStAT, T1.AlbProIDAT, T1.AlbProObs, T1.AlbProMatr, T2.TrnNom, T1.TrnCod, T1.AlbProDomE, T3.CliNom AS AlbProCliN, T1.AlbProCliC" ;
      scmdbuf += " AS AlbProCliC, T4.PrvNom AS AlbProPrvN, T1.AlbProPrvI AS AlbProPrvI, T5.CatDocNom, T1.CatDocID, T1.AlbProSal, T1.AlbProDate, T1.AlbProID, T1.AlbProTipo, T1.AlbProInEx" ;
      scmdbuf += " FROM ((((TXPCALPRO T1 LEFT JOIN TXPTRANSP T2 ON T2.EmprCod = T1.EmprCod AND T2.TrnCod = T1.TrnCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod" ;
      scmdbuf += " = T1.AlbProCliC) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod AND T4.PrvNum = T1.AlbProPrvI) LEFT JOIN TXPCATDOC T5 ON T5.EmprCod = T1.EmprCod AND T5.CatDocID" ;
      scmdbuf += " = T1.CatDocID)" ;
      if ( ! (0==AV81Tcalprowwds_2_tfalbproid) )
      {
         addWhere(sWhereString, "(T1.AlbProID >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV82Tcalprowwds_3_tfalbproid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProID <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( AV83Tcalprowwds_4_tfalbproinex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV83Tcalprowwds_4_tfalbproinex_sels, "T1.AlbProInEx IN (", ")")+")");
      }
      if ( AV84Tcalprowwds_5_tfalbprotipo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV84Tcalprowwds_5_tfalbprotipo_sels, "T1.AlbProTipo IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85Tcalprowwds_6_tfalbprodate)) )
      {
         addWhere(sWhereString, "(T1.AlbProDate >= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV86Tcalprowwds_7_tfalbprosal) )
      {
         addWhere(sWhereString, "(T1.AlbProSal >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV87Tcalprowwds_8_tfcatdocid) )
      {
         addWhere(sWhereString, "(T1.CatDocID >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV88Tcalprowwds_9_tfcatdocid_to) )
      {
         addWhere(sWhereString, "(T1.CatDocID <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Tcalprowwds_11_tfcatdocnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Tcalprowwds_10_tfcatdocnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CatDocNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Tcalprowwds_11_tfcatdocnom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CatDocNom = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV91Tcalprowwds_12_tfalbproprvid) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV92Tcalprowwds_13_tfalbproprvid_to) )
      {
         addWhere(sWhereString, "(T1.AlbProPrvI <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Tcalprowwds_15_tfalbproprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV93Tcalprowwds_14_tfalbproprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Tcalprowwds_15_tfalbproprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV95Tcalprowwds_16_tfalbproclicod) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV96Tcalprowwds_17_tfalbproclicod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCliC <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Tcalprowwds_19_tfalbproclinom_sel)==0) && ( ! (GXutil.strcmp("", AV97Tcalprowwds_18_tfalbproclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Tcalprowwds_19_tfalbproclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV99Tcalprowwds_20_tfalbprodomenv) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV100Tcalprowwds_21_tfalbprodomenv_to) )
      {
         addWhere(sWhereString, "(T1.AlbProDomE <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV101Tcalprowwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV102Tcalprowwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Tcalprowwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV103Tcalprowwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Tcalprowwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TrnNom = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Tcalprowwds_27_tfalbpromatricula_sel)==0) && ( ! (GXutil.strcmp("", AV105Tcalprowwds_26_tfalbpromatricula)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProMatr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Tcalprowwds_27_tfalbpromatricula_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProMatr = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Tcalprowwds_29_tfalbproobs_sel)==0) && ( ! (GXutil.strcmp("", AV107Tcalprowwds_28_tfalbproobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Tcalprowwds_29_tfalbproobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProObs = ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Tcalprowwds_31_tfalbproidat_sel)==0) && ( ! (GXutil.strcmp("", AV109Tcalprowwds_30_tfalbproidat)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProIDAT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Tcalprowwds_31_tfalbproidat_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProIDAT = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( AV111Tcalprowwds_32_tfalbprostat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV111Tcalprowwds_32_tfalbprostat_sels, "T1.AlbProStAT IN (", ")")+")");
      }
      if ( AV112Tcalprowwds_33_tfalbproanulado_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV112Tcalprowwds_33_tfalbproanulado_sels, "T1.AlbProAnul IN (", ")")+")");
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProID" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProID DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProInEx" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProInEx DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProTipo" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProTipo DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProDate" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProDate DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProSal" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProSal DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CatDocID" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CatDocID DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CatDocNom" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CatDocNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPrvI" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPrvI DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PrvNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCliC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCliC DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProDomE" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProDomE DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProMatr" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProMatr DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProObs" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProObs DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProIDAT" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProIDAT DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProStAT" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProStAT DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProAnul" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProAnul DESC" ;
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
                  return conditional_P091T2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (java.util.Date)dynConstraints[41] , (java.util.Date)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , ((Number) dynConstraints[50]).shortValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , ((Boolean) dynConstraints[56]).booleanValue() , (String)dynConstraints[57] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P091T2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(16);
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(17);
               ((int[]) buf[22])[0] = rslt.getInt(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(20);
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
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[31], false);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 200);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 200);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               return;
      }
   }

}

