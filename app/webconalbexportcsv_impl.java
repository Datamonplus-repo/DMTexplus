package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webconalbexportcsv_impl extends GXWebProcedure
{
   public webconalbexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebCONALBExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebCONALBColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WebCONALBColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Recepcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reclamacion?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Referencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Referencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Procedencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unds Ent", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unds Uti", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unds Disp", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pzs Ent", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pzs Uti", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pzs Disp", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV135Webconalbds_1_filterfulltext = AV131FilterFullText ;
      AV136Webconalbds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV137Webconalbds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV138Webconalbds_4_tfclinom = AV55TFCliNom ;
      AV139Webconalbds_5_tfclinom_sel = AV56TFCliNom_Sel ;
      AV140Webconalbds_6_tfalbrfen = AV57TFAlbRFen ;
      AV141Webconalbds_7_tfalbrreo_sels = AV60TFAlbRReo_Sels ;
      AV142Webconalbds_8_tfalbref = AV61TFAlbRef ;
      AV143Webconalbds_9_tfalbref_sel = AV62TFAlbRef_Sel ;
      AV144Webconalbds_10_tfalbrefdsc = AV63TFAlbRefDsc ;
      AV145Webconalbds_11_tfalbrefdsc_sel = AV64TFAlbRefDsc_Sel ;
      AV146Webconalbds_12_tfalbrtartd = AV65TFAlbRTartD ;
      AV147Webconalbds_13_tfalbrtartd_sel = AV66TFAlbRTartD_Sel ;
      AV148Webconalbds_14_tftrnnom = AV67TFTrnNom ;
      AV149Webconalbds_15_tftrnnom_sel = AV68TFTrnNom_Sel ;
      AV150Webconalbds_16_tfprocenom = AV69TFProceNom ;
      AV151Webconalbds_17_tfprocenom_sel = AV70TFProceNom_Sel ;
      AV152Webconalbds_18_tfalbrunient = AV71TFAlbRUniEnt ;
      AV153Webconalbds_19_tfalbrunient_to = AV72TFAlbRUniEnt_To ;
      AV154Webconalbds_20_tfalbruni_sels = AV130TFAlbRUni_Sels ;
      AV155Webconalbds_21_tfalbruniuti = AV75TFAlbRUniUti ;
      AV156Webconalbds_22_tfalbruniuti_to = AV76TFAlbRUniUti_To ;
      AV157Webconalbds_23_tfalbrunidis = AV77TFAlbRUniDis ;
      AV158Webconalbds_24_tfalbrunidis_to = AV78TFAlbRUniDis_To ;
      AV159Webconalbds_25_tfalbrpieent = AV79TFAlbRPieEnt ;
      AV160Webconalbds_26_tfalbrpieent_to = AV80TFAlbRPieEnt_To ;
      AV161Webconalbds_27_tfalbrpieuti = AV81TFAlbRPieUti ;
      AV162Webconalbds_28_tfalbrpieuti_to = AV82TFAlbRPieUti_To ;
      AV163Webconalbds_29_tfalbrpiedis = AV83TFAlbRPieDis ;
      AV164Webconalbds_30_tfalbrpiedis_to = AV84TFAlbRPieDis_To ;
      AV165Webconalbds_31_tfalbrest_sels = AV86TFAlbREst_Sels ;
      AV166Webconalbds_32_tfalbrusu = AV93TFAlbrUsu ;
      AV167Webconalbds_33_tfalbrusu_sel = AV94TFAlbrUsu_Sel ;
      AV168Webconalbds_34_tfalbrhor = AV95TFAlbrHor ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV141Webconalbds_7_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV154Webconalbds_20_tfalbruni_sels ,
                                           Byte.valueOf(A47AlbREst) ,
                                           AV165Webconalbds_31_tfalbrest_sels ,
                                           Integer.valueOf(AV136Webconalbds_2_tfalbreccod) ,
                                           Integer.valueOf(AV137Webconalbds_3_tfalbreccod_to) ,
                                           AV139Webconalbds_5_tfclinom_sel ,
                                           AV138Webconalbds_4_tfclinom ,
                                           AV140Webconalbds_6_tfalbrfen ,
                                           Integer.valueOf(AV141Webconalbds_7_tfalbrreo_sels.size()) ,
                                           AV143Webconalbds_9_tfalbref_sel ,
                                           AV142Webconalbds_8_tfalbref ,
                                           AV145Webconalbds_11_tfalbrefdsc_sel ,
                                           AV144Webconalbds_10_tfalbrefdsc ,
                                           AV147Webconalbds_13_tfalbrtartd_sel ,
                                           AV146Webconalbds_12_tfalbrtartd ,
                                           AV149Webconalbds_15_tftrnnom_sel ,
                                           AV148Webconalbds_14_tftrnnom ,
                                           AV151Webconalbds_17_tfprocenom_sel ,
                                           AV150Webconalbds_16_tfprocenom ,
                                           AV152Webconalbds_18_tfalbrunient ,
                                           AV153Webconalbds_19_tfalbrunient_to ,
                                           Integer.valueOf(AV154Webconalbds_20_tfalbruni_sels.size()) ,
                                           AV155Webconalbds_21_tfalbruniuti ,
                                           AV156Webconalbds_22_tfalbruniuti_to ,
                                           AV157Webconalbds_23_tfalbrunidis ,
                                           AV158Webconalbds_24_tfalbrunidis_to ,
                                           Integer.valueOf(AV159Webconalbds_25_tfalbrpieent) ,
                                           Integer.valueOf(AV160Webconalbds_26_tfalbrpieent_to) ,
                                           Integer.valueOf(AV161Webconalbds_27_tfalbrpieuti) ,
                                           Integer.valueOf(AV162Webconalbds_28_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV163Webconalbds_29_tfalbrpiedis) ,
                                           Integer.valueOf(AV164Webconalbds_30_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV165Webconalbds_31_tfalbrest_sels.size()) ,
                                           AV167Webconalbds_33_tfalbrusu_sel ,
                                           AV166Webconalbds_32_tfalbrusu ,
                                           AV168Webconalbds_34_tfalbrhor ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A279CliNom ,
                                           A49AlbRFen ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A6264AlbRTartD ,
                                           A841TrnNom ,
                                           A971ProceNom ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A6178AlbrUsu ,
                                           A6179AlbrHor ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV135Webconalbds_1_filterfulltext ,
                                           A57AlbRUniDis ,
                                           Integer.valueOf(A51AlbRPieDis) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT
                                           }
      });
      lV138Webconalbds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV138Webconalbds_4_tfclinom), 30, "%") ;
      lV142Webconalbds_8_tfalbref = GXutil.padr( GXutil.rtrim( AV142Webconalbds_8_tfalbref), 16, "%") ;
      lV144Webconalbds_10_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV144Webconalbds_10_tfalbrefdsc), 26, "%") ;
      lV146Webconalbds_12_tfalbrtartd = GXutil.padr( GXutil.rtrim( AV146Webconalbds_12_tfalbrtartd), 30, "%") ;
      lV148Webconalbds_14_tftrnnom = GXutil.padr( GXutil.rtrim( AV148Webconalbds_14_tftrnnom), 30, "%") ;
      lV150Webconalbds_16_tfprocenom = GXutil.padr( GXutil.rtrim( AV150Webconalbds_16_tfprocenom), 30, "%") ;
      lV166Webconalbds_32_tfalbrusu = GXutil.padr( GXutil.rtrim( AV166Webconalbds_32_tfalbrusu), 10, "%") ;
      /* Using cursor P084E2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV136Webconalbds_2_tfalbreccod), Integer.valueOf(AV137Webconalbds_3_tfalbreccod_to), lV138Webconalbds_4_tfclinom, AV139Webconalbds_5_tfclinom_sel, AV140Webconalbds_6_tfalbrfen, lV142Webconalbds_8_tfalbref, AV143Webconalbds_9_tfalbref_sel, lV144Webconalbds_10_tfalbrefdsc, AV145Webconalbds_11_tfalbrefdsc_sel, lV146Webconalbds_12_tfalbrtartd, AV147Webconalbds_13_tfalbrtartd_sel, lV148Webconalbds_14_tftrnnom, AV149Webconalbds_15_tftrnnom_sel, lV150Webconalbds_16_tfprocenom, AV151Webconalbds_17_tfprocenom_sel, AV152Webconalbds_18_tfalbrunient, AV153Webconalbds_19_tfalbrunient_to, AV155Webconalbds_21_tfalbruniuti, AV156Webconalbds_22_tfalbruniuti_to, AV157Webconalbds_23_tfalbrunidis, AV158Webconalbds_24_tfalbrunidis_to, Integer.valueOf(AV159Webconalbds_25_tfalbrpieent), Integer.valueOf(AV160Webconalbds_26_tfalbrpieent_to), Integer.valueOf(AV161Webconalbds_27_tfalbrpieuti), Integer.valueOf(AV162Webconalbds_28_tfalbrpieuti_to), Integer.valueOf(AV163Webconalbds_29_tfalbrpiedis), Integer.valueOf(AV164Webconalbds_30_tfalbrpiedis_to), lV166Webconalbds_32_tfalbrusu, AV167Webconalbds_33_tfalbrusu_sel, AV168Webconalbds_34_tfalbrhor});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P084E2_A396EmprCod[0] ;
         A252CliCod = P084E2_A252CliCod[0] ;
         A6263AlbRTartC = P084E2_A6263AlbRTartC[0] ;
         n6263AlbRTartC = P084E2_n6263AlbRTartC[0] ;
         A840TrnCod = P084E2_A840TrnCod[0] ;
         n840TrnCod = P084E2_n840TrnCod[0] ;
         A970ProceCod = P084E2_A970ProceCod[0] ;
         n970ProceCod = P084E2_n970ProceCod[0] ;
         A6179AlbrHor = P084E2_A6179AlbrHor[0] ;
         A6178AlbrUsu = P084E2_A6178AlbrUsu[0] ;
         A51AlbRPieDis = P084E2_A51AlbRPieDis[0] ;
         A57AlbRUniDis = P084E2_A57AlbRUniDis[0] ;
         A971ProceNom = P084E2_A971ProceNom[0] ;
         n971ProceNom = P084E2_n971ProceNom[0] ;
         A841TrnNom = P084E2_A841TrnNom[0] ;
         n841TrnNom = P084E2_n841TrnNom[0] ;
         A6264AlbRTartD = P084E2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084E2_n6264AlbRTartD[0] ;
         A3613AlbRefDsc = P084E2_A3613AlbRefDsc[0] ;
         A45AlbRef = P084E2_A45AlbRef[0] ;
         A49AlbRFen = P084E2_A49AlbRFen[0] ;
         A279CliNom = P084E2_A279CliNom[0] ;
         A44AlbRecCod = P084E2_A44AlbRecCod[0] ;
         A47AlbREst = P084E2_A47AlbREst[0] ;
         A56AlbRUni = P084E2_A56AlbRUni[0] ;
         A55AlbRReo = P084E2_A55AlbRReo[0] ;
         A52AlbRPieEnt = P084E2_A52AlbRPieEnt[0] ;
         A54AlbRPieUti = P084E2_A54AlbRPieUti[0] ;
         A58AlbRUniEnt = P084E2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = P084E2_A60AlbRUniUti[0] ;
         A279CliNom = P084E2_A279CliNom[0] ;
         A6264AlbRTartD = P084E2_A6264AlbRTartD[0] ;
         n6264AlbRTartD = P084E2_n6264AlbRTartD[0] ;
         A841TrnNom = P084E2_A841TrnNom[0] ;
         n841TrnNom = P084E2_n841TrnNom[0] ;
         A971ProceNom = P084E2_A971ProceNom[0] ;
         n971ProceNom = P084E2_n971ProceNom[0] ;
         if ( (GXutil.strcmp("", AV135Webconalbds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV135Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6264AlbRTartD) , GXutil.padr( "%" + GXutil.upper( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV135Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV135Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A57AlbRUniDis, 9, 2) , GXutil.padr( "%" + AV135Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV135Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV135Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A51AlbRPieDis, 6, 0) , GXutil.padr( "%" + AV135Webconalbds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "abierta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "cerrada", ""), "") , GXutil.padr( "%" + GXutil.lower( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A47AlbREst == 1 ) ) || ( GXutil.like( GXutil.upper( A6178AlbrUsu) , GXutil.padr( "%" + GXutil.upper( AV135Webconalbds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
               AV14TextFileLine += GXutil.str( A44AlbRecCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
               webconalbexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A49AlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "NO") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "NO", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "SI") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "SI", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A45AlbRef, ";", ","), GXv_char3) ;
               webconalbexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3613AlbRefDsc, ";", ","), GXv_char3) ;
               webconalbexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6264AlbRTartD, ";", ","), GXv_char3) ;
               webconalbexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A841TrnNom, ";", ","), GXv_char3) ;
               webconalbexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A971ProceNom, ";", ","), GXv_char3) ;
               webconalbexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A58AlbRUniEnt, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A60AlbRUniUti, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A57AlbRUniDis, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A52AlbRPieEnt, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A54AlbRPieUti, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A51AlbRPieDis, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( A47AlbREst == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Abierta", "") ;
               }
               else if ( A47AlbREst == 1 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Cerrada", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6178AlbrUsu, ";", ","), GXv_char3) ;
               webconalbexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A6179AlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebCONALBExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRFen", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRReo", "", "Reclamacion?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRef", "", "Codigo Referencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRefDsc", "", "Descripcion Referencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRTartD", "", "T Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnNom", "", "Transportista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceNom", "", "Procedencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUniEnt", "", "Unds Ent", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUni", "", "Und", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUniUti", "", "Unds Uti", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUniDis", "", "Unds Disp", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRPieEnt", "", "Pzs Ent", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRPieUti", "", "Pzs Uti", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRPieDis", "", "Pzs Disp", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbREst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbrUsu", "", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbrHor", "", "Hora", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebCONALBColumnsSelector", GXv_char3) ;
      webconalbexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebCONALBGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebCONALBGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV19Session.getValue("WebCONALBGridState"), null, null);
      }
      AV28OrderedBy = AV49GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV49GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV169GXV1 = 1 ;
      while ( AV169GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV169GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV131FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV51TFAlbRecCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFAlbRecCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV55TFCliNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV56TFCliNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV57TFAlbRFen = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV59TFAlbRReo_SelsJson = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV60TFAlbRReo_Sels.fromJSonString(AV59TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV61TFAlbRef = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV62TFAlbRef_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV63TFAlbRefDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV64TFAlbRefDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD") == 0 )
         {
            AV65TFAlbRTartD = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARTD_SEL") == 0 )
         {
            AV66TFAlbRTartD_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV67TFTrnNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV68TFTrnNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV69TFProceNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV70TFProceNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV71TFAlbRUniEnt = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV72TFAlbRUniEnt_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV129TFAlbRUni_SelsJson = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV130TFAlbRUni_Sels.fromJSonString(AV129TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV75TFAlbRUniUti = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV76TFAlbRUniUti_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV77TFAlbRUniDis = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV78TFAlbRUniDis_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV79TFAlbRPieEnt = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV80TFAlbRPieEnt_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV81TFAlbRPieUti = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV82TFAlbRPieUti_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV83TFAlbRPieDis = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV84TFAlbRPieDis_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREST_SEL") == 0 )
         {
            AV85TFAlbREst_SelsJson = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV86TFAlbREst_Sels.fromJSonString(AV85TFAlbREst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUSU") == 0 )
         {
            AV93TFAlbrUsu = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUSU_SEL") == 0 )
         {
            AV94TFAlbrUsu_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV95TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         }
         AV169GXV1 = (int)(AV169GXV1+1) ;
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
      A279CliNom = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A55AlbRReo = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A6264AlbRTartD = "" ;
      A841TrnNom = "" ;
      A971ProceNom = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A6178AlbrUsu = "" ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV135Webconalbds_1_filterfulltext = "" ;
      AV131FilterFullText = "" ;
      AV138Webconalbds_4_tfclinom = "" ;
      AV55TFCliNom = "" ;
      AV139Webconalbds_5_tfclinom_sel = "" ;
      AV56TFCliNom_Sel = "" ;
      AV140Webconalbds_6_tfalbrfen = GXutil.nullDate() ;
      AV57TFAlbRFen = GXutil.nullDate() ;
      AV141Webconalbds_7_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV60TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV142Webconalbds_8_tfalbref = "" ;
      AV61TFAlbRef = "" ;
      AV143Webconalbds_9_tfalbref_sel = "" ;
      AV62TFAlbRef_Sel = "" ;
      AV144Webconalbds_10_tfalbrefdsc = "" ;
      AV63TFAlbRefDsc = "" ;
      AV145Webconalbds_11_tfalbrefdsc_sel = "" ;
      AV64TFAlbRefDsc_Sel = "" ;
      AV146Webconalbds_12_tfalbrtartd = "" ;
      AV65TFAlbRTartD = "" ;
      AV147Webconalbds_13_tfalbrtartd_sel = "" ;
      AV66TFAlbRTartD_Sel = "" ;
      AV148Webconalbds_14_tftrnnom = "" ;
      AV67TFTrnNom = "" ;
      AV149Webconalbds_15_tftrnnom_sel = "" ;
      AV68TFTrnNom_Sel = "" ;
      AV150Webconalbds_16_tfprocenom = "" ;
      AV69TFProceNom = "" ;
      AV151Webconalbds_17_tfprocenom_sel = "" ;
      AV70TFProceNom_Sel = "" ;
      AV152Webconalbds_18_tfalbrunient = DecimalUtil.ZERO ;
      AV71TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV153Webconalbds_19_tfalbrunient_to = DecimalUtil.ZERO ;
      AV72TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV154Webconalbds_20_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV130TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV155Webconalbds_21_tfalbruniuti = DecimalUtil.ZERO ;
      AV75TFAlbRUniUti = DecimalUtil.ZERO ;
      AV156Webconalbds_22_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV76TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV157Webconalbds_23_tfalbrunidis = DecimalUtil.ZERO ;
      AV77TFAlbRUniDis = DecimalUtil.ZERO ;
      AV158Webconalbds_24_tfalbrunidis_to = DecimalUtil.ZERO ;
      AV78TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV165Webconalbds_31_tfalbrest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV86TFAlbREst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV166Webconalbds_32_tfalbrusu = "" ;
      AV93TFAlbrUsu = "" ;
      AV167Webconalbds_33_tfalbrusu_sel = "" ;
      AV94TFAlbrUsu_Sel = "" ;
      AV168Webconalbds_34_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      AV95TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      lV135Webconalbds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV138Webconalbds_4_tfclinom = "" ;
      lV142Webconalbds_8_tfalbref = "" ;
      lV144Webconalbds_10_tfalbrefdsc = "" ;
      lV146Webconalbds_12_tfalbrtartd = "" ;
      lV148Webconalbds_14_tftrnnom = "" ;
      lV150Webconalbds_16_tfprocenom = "" ;
      lV166Webconalbds_32_tfalbrusu = "" ;
      P084E2_A396EmprCod = new String[] {""} ;
      P084E2_A252CliCod = new int[1] ;
      P084E2_A6263AlbRTartC = new short[1] ;
      P084E2_n6263AlbRTartC = new boolean[] {false} ;
      P084E2_A840TrnCod = new short[1] ;
      P084E2_n840TrnCod = new boolean[] {false} ;
      P084E2_A970ProceCod = new short[1] ;
      P084E2_n970ProceCod = new boolean[] {false} ;
      P084E2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      P084E2_A6178AlbrUsu = new String[] {""} ;
      P084E2_A51AlbRPieDis = new int[1] ;
      P084E2_A57AlbRUniDis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084E2_A971ProceNom = new String[] {""} ;
      P084E2_n971ProceNom = new boolean[] {false} ;
      P084E2_A841TrnNom = new String[] {""} ;
      P084E2_n841TrnNom = new boolean[] {false} ;
      P084E2_A6264AlbRTartD = new String[] {""} ;
      P084E2_n6264AlbRTartD = new boolean[] {false} ;
      P084E2_A3613AlbRefDsc = new String[] {""} ;
      P084E2_A45AlbRef = new String[] {""} ;
      P084E2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P084E2_A279CliNom = new String[] {""} ;
      P084E2_A44AlbRecCod = new int[1] ;
      P084E2_A47AlbREst = new byte[1] ;
      P084E2_A56AlbRUni = new String[] {""} ;
      P084E2_A55AlbRReo = new String[] {""} ;
      P084E2_A52AlbRPieEnt = new int[1] ;
      P084E2_A54AlbRPieUti = new int[1] ;
      P084E2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P084E2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      AV59TFAlbRReo_SelsJson = "" ;
      AV129TFAlbRUni_SelsJson = "" ;
      AV85TFAlbREst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webconalbexportcsv__default(),
         new Object[] {
             new Object[] {
            P084E2_A396EmprCod, P084E2_A252CliCod, P084E2_A6263AlbRTartC, P084E2_n6263AlbRTartC, P084E2_A840TrnCod, P084E2_n840TrnCod, P084E2_A970ProceCod, P084E2_n970ProceCod, P084E2_A6179AlbrHor, P084E2_A6178AlbrUsu,
            P084E2_A51AlbRPieDis, P084E2_A57AlbRUniDis, P084E2_A971ProceNom, P084E2_n971ProceNom, P084E2_A841TrnNom, P084E2_n841TrnNom, P084E2_A6264AlbRTartD, P084E2_n6264AlbRTartD, P084E2_A3613AlbRefDsc, P084E2_A45AlbRef,
            P084E2_A49AlbRFen, P084E2_A279CliNom, P084E2_A44AlbRecCod, P084E2_A47AlbREst, P084E2_A56AlbRUni, P084E2_A55AlbRReo, P084E2_A52AlbRPieEnt, P084E2_A54AlbRPieUti, P084E2_A58AlbRUniEnt, P084E2_A60AlbRUniUti
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short A6263AlbRTartC ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int AV13Random ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int AV136Webconalbds_2_tfalbreccod ;
   private int AV51TFAlbRecCod ;
   private int AV137Webconalbds_3_tfalbreccod_to ;
   private int AV52TFAlbRecCod_To ;
   private int AV159Webconalbds_25_tfalbrpieent ;
   private int AV79TFAlbRPieEnt ;
   private int AV160Webconalbds_26_tfalbrpieent_to ;
   private int AV80TFAlbRPieEnt_To ;
   private int AV161Webconalbds_27_tfalbrpieuti ;
   private int AV81TFAlbRPieUti ;
   private int AV162Webconalbds_28_tfalbrpieuti_to ;
   private int AV82TFAlbRPieUti_To ;
   private int AV163Webconalbds_29_tfalbrpiedis ;
   private int AV83TFAlbRPieDis ;
   private int AV164Webconalbds_30_tfalbrpiedis_to ;
   private int AV84TFAlbRPieDis_To ;
   private int AV141Webconalbds_7_tfalbrreo_sels_size ;
   private int AV154Webconalbds_20_tfalbruni_sels_size ;
   private int AV165Webconalbds_31_tfalbrest_sels_size ;
   private int A252CliCod ;
   private int AV169GXV1 ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV152Webconalbds_18_tfalbrunient ;
   private java.math.BigDecimal AV71TFAlbRUniEnt ;
   private java.math.BigDecimal AV153Webconalbds_19_tfalbrunient_to ;
   private java.math.BigDecimal AV72TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV155Webconalbds_21_tfalbruniuti ;
   private java.math.BigDecimal AV75TFAlbRUniUti ;
   private java.math.BigDecimal AV156Webconalbds_22_tfalbruniuti_to ;
   private java.math.BigDecimal AV76TFAlbRUniUti_To ;
   private java.math.BigDecimal AV157Webconalbds_23_tfalbrunidis ;
   private java.math.BigDecimal AV77TFAlbRUniDis ;
   private java.math.BigDecimal AV158Webconalbds_24_tfalbrunidis_to ;
   private java.math.BigDecimal AV78TFAlbRUniDis_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A55AlbRReo ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A6264AlbRTartD ;
   private String A841TrnNom ;
   private String A971ProceNom ;
   private String A56AlbRUni ;
   private String A6178AlbrUsu ;
   private String AV138Webconalbds_4_tfclinom ;
   private String AV55TFCliNom ;
   private String AV139Webconalbds_5_tfclinom_sel ;
   private String AV56TFCliNom_Sel ;
   private String AV142Webconalbds_8_tfalbref ;
   private String AV61TFAlbRef ;
   private String AV143Webconalbds_9_tfalbref_sel ;
   private String AV62TFAlbRef_Sel ;
   private String AV144Webconalbds_10_tfalbrefdsc ;
   private String AV63TFAlbRefDsc ;
   private String AV145Webconalbds_11_tfalbrefdsc_sel ;
   private String AV64TFAlbRefDsc_Sel ;
   private String AV146Webconalbds_12_tfalbrtartd ;
   private String AV65TFAlbRTartD ;
   private String AV147Webconalbds_13_tfalbrtartd_sel ;
   private String AV66TFAlbRTartD_Sel ;
   private String AV148Webconalbds_14_tftrnnom ;
   private String AV67TFTrnNom ;
   private String AV149Webconalbds_15_tftrnnom_sel ;
   private String AV68TFTrnNom_Sel ;
   private String AV150Webconalbds_16_tfprocenom ;
   private String AV69TFProceNom ;
   private String AV151Webconalbds_17_tfprocenom_sel ;
   private String AV70TFProceNom_Sel ;
   private String AV166Webconalbds_32_tfalbrusu ;
   private String AV93TFAlbrUsu ;
   private String AV167Webconalbds_33_tfalbrusu_sel ;
   private String AV94TFAlbrUsu_Sel ;
   private String scmdbuf ;
   private String lV138Webconalbds_4_tfclinom ;
   private String lV142Webconalbds_8_tfalbref ;
   private String lV144Webconalbds_10_tfalbrefdsc ;
   private String lV146Webconalbds_12_tfalbrtartd ;
   private String lV148Webconalbds_14_tftrnnom ;
   private String lV150Webconalbds_16_tfprocenom ;
   private String lV166Webconalbds_32_tfalbrusu ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date AV168Webconalbds_34_tfalbrhor ;
   private java.util.Date AV95TFAlbrHor ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV140Webconalbds_6_tfalbrfen ;
   private java.util.Date AV57TFAlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n6263AlbRTartC ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n971ProceNom ;
   private boolean n841TrnNom ;
   private boolean n6264AlbRTartD ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV59TFAlbRReo_SelsJson ;
   private String AV129TFAlbRUni_SelsJson ;
   private String AV85TFAlbREst_SelsJson ;
   private String AV11Filename ;
   private String AV135Webconalbds_1_filterfulltext ;
   private String AV131FilterFullText ;
   private String lV135Webconalbds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV165Webconalbds_31_tfalbrest_sels ;
   private GXSimpleCollection<Byte> AV86TFAlbREst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P084E2_A396EmprCod ;
   private int[] P084E2_A252CliCod ;
   private short[] P084E2_A6263AlbRTartC ;
   private boolean[] P084E2_n6263AlbRTartC ;
   private short[] P084E2_A840TrnCod ;
   private boolean[] P084E2_n840TrnCod ;
   private short[] P084E2_A970ProceCod ;
   private boolean[] P084E2_n970ProceCod ;
   private java.util.Date[] P084E2_A6179AlbrHor ;
   private String[] P084E2_A6178AlbrUsu ;
   private int[] P084E2_A51AlbRPieDis ;
   private java.math.BigDecimal[] P084E2_A57AlbRUniDis ;
   private String[] P084E2_A971ProceNom ;
   private boolean[] P084E2_n971ProceNom ;
   private String[] P084E2_A841TrnNom ;
   private boolean[] P084E2_n841TrnNom ;
   private String[] P084E2_A6264AlbRTartD ;
   private boolean[] P084E2_n6264AlbRTartD ;
   private String[] P084E2_A3613AlbRefDsc ;
   private String[] P084E2_A45AlbRef ;
   private java.util.Date[] P084E2_A49AlbRFen ;
   private String[] P084E2_A279CliNom ;
   private int[] P084E2_A44AlbRecCod ;
   private byte[] P084E2_A47AlbREst ;
   private String[] P084E2_A56AlbRUni ;
   private String[] P084E2_A55AlbRReo ;
   private int[] P084E2_A52AlbRPieEnt ;
   private int[] P084E2_A54AlbRPieUti ;
   private java.math.BigDecimal[] P084E2_A58AlbRUniEnt ;
   private java.math.BigDecimal[] P084E2_A60AlbRUniUti ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV141Webconalbds_7_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV60TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV154Webconalbds_20_tfalbruni_sels ;
   private GXSimpleCollection<String> AV130TFAlbRUni_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class webconalbexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P084E2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV141Webconalbds_7_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV154Webconalbds_20_tfalbruni_sels ,
                                          byte A47AlbREst ,
                                          GXSimpleCollection<Byte> AV165Webconalbds_31_tfalbrest_sels ,
                                          int AV136Webconalbds_2_tfalbreccod ,
                                          int AV137Webconalbds_3_tfalbreccod_to ,
                                          String AV139Webconalbds_5_tfclinom_sel ,
                                          String AV138Webconalbds_4_tfclinom ,
                                          java.util.Date AV140Webconalbds_6_tfalbrfen ,
                                          int AV141Webconalbds_7_tfalbrreo_sels_size ,
                                          String AV143Webconalbds_9_tfalbref_sel ,
                                          String AV142Webconalbds_8_tfalbref ,
                                          String AV145Webconalbds_11_tfalbrefdsc_sel ,
                                          String AV144Webconalbds_10_tfalbrefdsc ,
                                          String AV147Webconalbds_13_tfalbrtartd_sel ,
                                          String AV146Webconalbds_12_tfalbrtartd ,
                                          String AV149Webconalbds_15_tftrnnom_sel ,
                                          String AV148Webconalbds_14_tftrnnom ,
                                          String AV151Webconalbds_17_tfprocenom_sel ,
                                          String AV150Webconalbds_16_tfprocenom ,
                                          java.math.BigDecimal AV152Webconalbds_18_tfalbrunient ,
                                          java.math.BigDecimal AV153Webconalbds_19_tfalbrunient_to ,
                                          int AV154Webconalbds_20_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV155Webconalbds_21_tfalbruniuti ,
                                          java.math.BigDecimal AV156Webconalbds_22_tfalbruniuti_to ,
                                          java.math.BigDecimal AV157Webconalbds_23_tfalbrunidis ,
                                          java.math.BigDecimal AV158Webconalbds_24_tfalbrunidis_to ,
                                          int AV159Webconalbds_25_tfalbrpieent ,
                                          int AV160Webconalbds_26_tfalbrpieent_to ,
                                          int AV161Webconalbds_27_tfalbrpieuti ,
                                          int AV162Webconalbds_28_tfalbrpieuti_to ,
                                          int AV163Webconalbds_29_tfalbrpiedis ,
                                          int AV164Webconalbds_30_tfalbrpiedis_to ,
                                          int AV165Webconalbds_31_tfalbrest_sels_size ,
                                          String AV167Webconalbds_33_tfalbrusu_sel ,
                                          String AV166Webconalbds_32_tfalbrusu ,
                                          java.util.Date AV168Webconalbds_34_tfalbrhor ,
                                          int A44AlbRecCod ,
                                          String A279CliNom ,
                                          java.util.Date A49AlbRFen ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          String A6264AlbRTartD ,
                                          String A841TrnNom ,
                                          String A971ProceNom ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A6178AlbrUsu ,
                                          java.util.Date A6179AlbrHor ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV135Webconalbds_1_filterfulltext ,
                                          java.math.BigDecimal A57AlbRUniDis ,
                                          int A51AlbRPieDis )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[30];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.CliCod, T1.AlbRTartC AS AlbRTartC, T1.TrnCod, T1.ProceCod, T1.AlbrHor, T1.AlbrUsu, T1.AlbRPieEnt - T1.AlbRPieUti AS AlbRPieDis, CASE  WHEN" ;
      scmdbuf += " ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END AS AlbRUniDis, T5.ProceNom, T4.TrnNom," ;
      scmdbuf += " T3.TipArtDsc AS AlbRTartD, T1.AlbRefDsc, T1.AlbRef, T1.AlbRFen, T2.CliNom, T1.AlbRecCod, T1.AlbREst, T1.AlbRUni, T1.AlbRReo, T1.AlbRPieEnt, T1.AlbRPieUti, T1.AlbRUniEnt," ;
      scmdbuf += " T1.AlbRUniUti FROM ((((TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.AlbRTartC) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod) LEFT JOIN TXPPROCED T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.ProceCod = T1.ProceCod)" ;
      if ( ! (0==AV136Webconalbds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV137Webconalbds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Webconalbds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV138Webconalbds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Webconalbds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV140Webconalbds_6_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( AV141Webconalbds_7_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV141Webconalbds_7_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV143Webconalbds_9_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV142Webconalbds_8_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Webconalbds_9_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Webconalbds_11_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV144Webconalbds_10_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Webconalbds_11_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Webconalbds_13_tfalbrtartd_sel)==0) && ( ! (GXutil.strcmp("", AV146Webconalbds_12_tfalbrtartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Webconalbds_13_tfalbrtartd_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipArtDsc = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Webconalbds_15_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV148Webconalbds_14_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Webconalbds_15_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TrnNom = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Webconalbds_17_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV150Webconalbds_16_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Webconalbds_17_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProceNom = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV152Webconalbds_18_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV153Webconalbds_19_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( AV154Webconalbds_20_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV154Webconalbds_20_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Webconalbds_21_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Webconalbds_22_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Webconalbds_23_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158Webconalbds_24_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV159Webconalbds_25_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV160Webconalbds_26_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV161Webconalbds_27_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV162Webconalbds_28_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV163Webconalbds_29_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV164Webconalbds_30_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( AV165Webconalbds_31_tfalbrest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV165Webconalbds_31_tfalbrest_sels, "T1.AlbREst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV167Webconalbds_33_tfalbrusu_sel)==0) && ( ! (GXutil.strcmp("", AV166Webconalbds_32_tfalbrusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbrUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Webconalbds_33_tfalbrusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbrUsu = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV168Webconalbds_34_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.ProceNom" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.ProceNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREst DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbrUsu" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbrUsu DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbrHor" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbrHor DESC" ;
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
                  return conditional_P084E2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.util.Date)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , (String)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).intValue() , (String)dynConstraints[51] , (java.util.Date)dynConstraints[52] , ((Number) dynConstraints[53]).shortValue() , ((Boolean) dynConstraints[54]).booleanValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P084E2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((String[]) buf[9])[0] = rslt.getString(7, 10);
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[12])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 26);
               ((String[]) buf[19])[0] = rslt.getString(14, 16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(15);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((byte[]) buf[23])[0] = rslt.getByte(18);
               ((String[]) buf[24])[0] = rslt.getString(19, 1);
               ((String[]) buf[25])[0] = rslt.getString(20, 2);
               ((int[]) buf[26])[0] = rslt.getInt(21);
               ((int[]) buf[27])[0] = rslt.getInt(22);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(24,2);
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
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[59], true);
               }
               return;
      }
   }

}

