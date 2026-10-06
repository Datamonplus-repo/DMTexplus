package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeformulas_wcexportcsv_impl extends GXWebProcedure
{
   public listadodeformulas_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeFormulas_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ListadodeFormulas_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ListadodeFormulas_WCColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "TC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Intensidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod. Int. Fact.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Intensidad Fact.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Interno F.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Bloqueo Color?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Coste Formula", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Formula", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ultima Modificacion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = AV30FilterFullText ;
      AV180Formulaciontinte_listadodeformulas_wcds_2_tfclicod = AV39TFCliCod ;
      AV181Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to = AV40TFCliCod_To ;
      AV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom = AV41TFCliNom ;
      AV183Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = AV42TFCliNom_Sel ;
      AV184Formulaciontinte_listadodeformulas_wcds_6_tfforser = AV43TFForSer ;
      AV185Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = AV44TFForSer_Sel ;
      AV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = AV45TFForSerDsc ;
      AV187Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = AV46TFForSerDsc_Sel ;
      AV188Formulaciontinte_listadodeformulas_wcds_10_tffortipart = AV115TFForTipArt ;
      AV189Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to = AV116TFForTipArt_To ;
      AV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = AV170TFForTipArtDsc ;
      AV191Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = AV171TFForTipArtDsc_Sel ;
      AV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = AV47TFForColNom ;
      AV193Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = AV48TFForColNom_Sel ;
      AV194Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum = AV49TFForColNum ;
      AV195Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to = AV50TFForColNum_To ;
      AV196Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod = AV51TFTipColCod ;
      AV197Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to = AV52TFTipColCod_To ;
      AV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = AV53TFTipColDsc ;
      AV199Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = AV54TFTipColDsc_Sel ;
      AV200Formulaciontinte_listadodeformulas_wcds_22_tfintcod = AV55TFIntCod ;
      AV201Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to = AV56TFIntCod_To ;
      AV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = AV57TFIntDsc ;
      AV203Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = AV58TFIntDsc_Sel ;
      AV204Formulaciontinte_listadodeformulas_wcds_26_tfintcodf = AV67TFIntCodF ;
      AV205Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to = AV68TFIntCodF_To ;
      AV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = AV69TFIntDscF ;
      AV207Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = AV70TFIntDscF_Sel ;
      AV208Formulaciontinte_listadodeformulas_wcds_30_tffornumcol = AV97TFForNumCol ;
      AV209Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to = AV98TFForNumCol_To ;
      AV210Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = AV175TFForBlo_Sels ;
      AV211Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = AV141TFForCosForm ;
      AV212Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = AV142TFForCosForm_To ;
      AV213Formulaciontinte_listadodeformulas_wcds_35_tfforfec = AV99TFForFec ;
      AV214Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = AV105TFForUltMod ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A7781ForBlo ,
                                           AV210Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                           Integer.valueOf(AV180Formulaciontinte_listadodeformulas_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV181Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) ,
                                           AV183Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                           AV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                           AV185Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                           AV184Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                           AV187Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                           AV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                           Short.valueOf(AV188Formulaciontinte_listadodeformulas_wcds_10_tffortipart) ,
                                           Short.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) ,
                                           AV193Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                           AV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                           Integer.valueOf(AV194Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) ,
                                           Integer.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) ,
                                           Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) ,
                                           Byte.valueOf(AV197Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) ,
                                           AV199Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                           AV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                           Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_22_tfintcod) ,
                                           Byte.valueOf(AV201Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) ,
                                           AV203Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                           AV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                           Byte.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) ,
                                           Byte.valueOf(AV205Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) ,
                                           AV207Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                           AV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                           Integer.valueOf(AV208Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) ,
                                           Integer.valueOf(AV209Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) ,
                                           Integer.valueOf(AV210Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels.size()) ,
                                           AV211Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                           AV212Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                           AV213Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                           AV214Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                           Integer.valueOf(AV160Clicod) ,
                                           Integer.valueOf(AV161Clicod_to) ,
                                           AV162Forser ,
                                           AV163Forser_to ,
                                           AV166Forcolnom ,
                                           AV167Forcolnom_to ,
                                           Integer.valueOf(AV164Forcolnum) ,
                                           Integer.valueOf(AV165Forcolnum_to) ,
                                           Byte.valueOf(AV168Tipcolcod) ,
                                           Short.valueOf(AV169Tipcolcod_to) ,
                                           Integer.valueOf(AV172ForNumColfrom) ,
                                           Integer.valueOf(AV173ForNumColto) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A494ForSer ,
                                           A5742ForSerDsc ,
                                           Short.valueOf(A4384ForTipArt) ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) ,
                                           A832TipColDsc ,
                                           Byte.valueOf(A583IntCod) ,
                                           A584IntDsc ,
                                           Byte.valueOf(A5362IntCodF) ,
                                           A5363IntDscF ,
                                           Integer.valueOf(A486ForNumCol) ,
                                           A4380ForCosForm ,
                                           A485ForFec ,
                                           A495ForUltMod ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                           A13929ForTipArtD ,
                                           AV191Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                           AV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                           A10045CliAct ,
                                           AV159Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = GXutil.padr( GXutil.rtrim( AV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc), 30, "%") ;
      lV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom), 30, "%") ;
      lV184Formulaciontinte_listadodeformulas_wcds_6_tfforser = GXutil.padr( GXutil.rtrim( AV184Formulaciontinte_listadodeformulas_wcds_6_tfforser), 16, "%") ;
      lV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = GXutil.padr( GXutil.rtrim( AV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc), 26, "%") ;
      lV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = GXutil.padr( GXutil.rtrim( AV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom), 13, "%") ;
      lV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = GXutil.padr( GXutil.rtrim( AV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc), 30, "%") ;
      lV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = GXutil.padr( GXutil.rtrim( AV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc), 30, "%") ;
      lV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = GXutil.padr( GXutil.rtrim( AV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf), 30, "%") ;
      /* Using cursor P09DJ2 */
      pr_default.execute(0, new Object[] {AV159Emprcod, AV191Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, lV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc, AV191Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, AV191Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel, Integer.valueOf(AV180Formulaciontinte_listadodeformulas_wcds_2_tfclicod), Integer.valueOf(AV181Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to), lV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom, AV183Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel, lV184Formulaciontinte_listadodeformulas_wcds_6_tfforser, AV185Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel, lV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc, AV187Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel, Short.valueOf(AV188Formulaciontinte_listadodeformulas_wcds_10_tffortipart), Short.valueOf(AV189Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to), lV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom, AV193Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel, Integer.valueOf(AV194Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum), Integer.valueOf(AV195Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to), Byte.valueOf(AV196Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod), Byte.valueOf(AV197Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to), lV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc, AV199Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel, Byte.valueOf(AV200Formulaciontinte_listadodeformulas_wcds_22_tfintcod), Byte.valueOf(AV201Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to), lV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc, AV203Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel, Byte.valueOf(AV204Formulaciontinte_listadodeformulas_wcds_26_tfintcodf), Byte.valueOf(AV205Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to), lV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf, AV207Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel, Integer.valueOf(AV208Formulaciontinte_listadodeformulas_wcds_30_tffornumcol), Integer.valueOf(AV209Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to), AV211Formulaciontinte_listadodeformulas_wcds_33_tfforcosform, AV212Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to, AV213Formulaciontinte_listadodeformulas_wcds_35_tfforfec, AV214Formulaciontinte_listadodeformulas_wcds_36_tfforultmod, Integer.valueOf(AV160Clicod), Integer.valueOf(AV161Clicod_to), AV162Forser, AV163Forser_to, AV166Forcolnom, AV167Forcolnom_to, Integer.valueOf(AV164Forcolnum), Integer.valueOf(AV165Forcolnum_to), Byte.valueOf(AV168Tipcolcod), Short.valueOf(AV169Tipcolcod_to), Integer.valueOf(AV172ForNumColfrom), Integer.valueOf(AV173ForNumColto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10045CliAct = P09DJ2_A10045CliAct[0] ;
         A396EmprCod = P09DJ2_A396EmprCod[0] ;
         A495ForUltMod = P09DJ2_A495ForUltMod[0] ;
         n495ForUltMod = P09DJ2_n495ForUltMod[0] ;
         A485ForFec = P09DJ2_A485ForFec[0] ;
         n485ForFec = P09DJ2_n485ForFec[0] ;
         A4380ForCosForm = P09DJ2_A4380ForCosForm[0] ;
         n4380ForCosForm = P09DJ2_n4380ForCosForm[0] ;
         A486ForNumCol = P09DJ2_A486ForNumCol[0] ;
         A5363IntDscF = P09DJ2_A5363IntDscF[0] ;
         n5363IntDscF = P09DJ2_n5363IntDscF[0] ;
         A5362IntCodF = P09DJ2_A5362IntCodF[0] ;
         n5362IntCodF = P09DJ2_n5362IntCodF[0] ;
         A584IntDsc = P09DJ2_A584IntDsc[0] ;
         n584IntDsc = P09DJ2_n584IntDsc[0] ;
         A583IntCod = P09DJ2_A583IntCod[0] ;
         A832TipColDsc = P09DJ2_A832TipColDsc[0] ;
         n832TipColDsc = P09DJ2_n832TipColDsc[0] ;
         A831TipColCod = P09DJ2_A831TipColCod[0] ;
         A483ForColNum = P09DJ2_A483ForColNum[0] ;
         A482ForColNom = P09DJ2_A482ForColNom[0] ;
         A4384ForTipArt = P09DJ2_A4384ForTipArt[0] ;
         n4384ForTipArt = P09DJ2_n4384ForTipArt[0] ;
         A5742ForSerDsc = P09DJ2_A5742ForSerDsc[0] ;
         n5742ForSerDsc = P09DJ2_n5742ForSerDsc[0] ;
         A494ForSer = P09DJ2_A494ForSer[0] ;
         A279CliNom = P09DJ2_A279CliNom[0] ;
         A252CliCod = P09DJ2_A252CliCod[0] ;
         A7781ForBlo = P09DJ2_A7781ForBlo[0] ;
         n7781ForBlo = P09DJ2_n7781ForBlo[0] ;
         A13929ForTipArtD = P09DJ2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DJ2_n13929ForTipArtD[0] ;
         A5363IntDscF = P09DJ2_A5363IntDscF[0] ;
         n5363IntDscF = P09DJ2_n5363IntDscF[0] ;
         A584IntDsc = P09DJ2_A584IntDsc[0] ;
         n584IntDsc = P09DJ2_n584IntDsc[0] ;
         A832TipColDsc = P09DJ2_A832TipColDsc[0] ;
         n832TipColDsc = P09DJ2_n832TipColDsc[0] ;
         A13929ForTipArtD = P09DJ2_A13929ForTipArtD[0] ;
         n13929ForTipArtD = P09DJ2_n13929ForTipArtD[0] ;
         A10045CliAct = P09DJ2_A10045CliAct[0] ;
         A279CliNom = P09DJ2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A494ForSer) , GXutil.padr( "%" + GXutil.upper( AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5742ForSerDsc) , GXutil.padr( "%" + GXutil.upper( AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4384ForTipArt, 4, 0) , GXutil.padr( "%" + AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13929ForTipArtD) , GXutil.padr( "%" + GXutil.upper( AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A482ForColNom) , GXutil.padr( "%" + GXutil.upper( AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A483ForColNum, 6, 0) , GXutil.padr( "%" + AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A831TipColCod, 2, 0) , GXutil.padr( "%" + AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A832TipColDsc) , GXutil.padr( "%" + GXutil.upper( AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A583IntCod, 2, 0) , GXutil.padr( "%" + AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A584IntDsc) , GXutil.padr( "%" + GXutil.upper( AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A5362IntCodF, 2, 0) , GXutil.padr( "%" + AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5363IntDscF) , GXutil.padr( "%" + GXutil.upper( AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A486ForNumCol, 8, 0) , GXutil.padr( "%" + AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A7781ForBlo, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A4380ForCosForm, 11, 5) , GXutil.padr( "%" + AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
               listadodeformulas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A494ForSer, ";", ","), GXv_char3) ;
               listadodeformulas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5742ForSerDsc, ";", ","), GXv_char3) ;
               listadodeformulas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A4384ForTipArt, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13929ForTipArtD, ";", ","), GXv_char3) ;
               listadodeformulas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A482ForColNom, ";", ","), GXv_char3) ;
               listadodeformulas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A483ForColNum, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A831TipColCod, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A832TipColDsc, ";", ","), GXv_char3) ;
               listadodeformulas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A583IntCod, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A584IntDsc, ";", ","), GXv_char3) ;
               listadodeformulas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A5362IntCodF, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5363IntDscF, ";", ","), GXv_char3) ;
               listadodeformulas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A486ForNumCol, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A7781ForBlo), "N") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "N", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A7781ForBlo), "S") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "S", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A4380ForCosForm, 11, 5) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A485ForFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A495ForUltMod, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ListadodeFormulas_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForSerDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForTipArt", "", "Tipo Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForTipArtDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipColCod", "", "TC", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipColDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IntCod", "", "Intensidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IntDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IntCodF", "", "Cod. Int. Fact.", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "IntDscF", "", "Intensidad Fact.", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForNumCol", "", "Nº Interno F.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForBlo", "", "Bloqueo Color?", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForCosForm", "", "Coste Formula", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForFec", "", "Fecha Formula", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ForUltMod", "", "Ultima Modificacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ListadodeFormulas_WCColumnsSelector", GXv_char3) ;
      listadodeformulas_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ListadodeFormulas_WCGridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ListadodeFormulas_WCGridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV19Session.getValue("FormulacionTinte.ListadodeFormulas_WCGridState"), null, null);
      }
      AV28OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV215GXV1 = 1 ;
      while ( AV215GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV215GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV39TFCliCod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV40TFCliCod_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV41TFCliNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV42TFCliNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER") == 0 )
         {
            AV43TFForSer = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSER_SEL") == 0 )
         {
            AV44TFForSer_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC") == 0 )
         {
            AV45TFForSerDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORSERDSC_SEL") == 0 )
         {
            AV46TFForSerDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPART") == 0 )
         {
            AV115TFForTipArt = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV116TFForTipArt_To = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC") == 0 )
         {
            AV170TFForTipArtDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORTIPARTDSC_SEL") == 0 )
         {
            AV171TFForTipArtDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM") == 0 )
         {
            AV47TFForColNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNOM_SEL") == 0 )
         {
            AV48TFForColNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOLNUM") == 0 )
         {
            AV49TFForColNum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFForColNum_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLCOD") == 0 )
         {
            AV51TFTipColCod = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFTipColCod_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC") == 0 )
         {
            AV53TFTipColDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPCOLDSC_SEL") == 0 )
         {
            AV54TFTipColDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCOD") == 0 )
         {
            AV55TFIntCod = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFIntCod_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC") == 0 )
         {
            AV57TFIntDsc = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSC_SEL") == 0 )
         {
            AV58TFIntDsc_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTCODF") == 0 )
         {
            AV67TFIntCodF = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFIntCodF_To = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF") == 0 )
         {
            AV69TFIntDscF = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINTDSCF_SEL") == 0 )
         {
            AV70TFIntDscF_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORNUMCOL") == 0 )
         {
            AV97TFForNumCol = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV98TFForNumCol_To = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORBLO_SEL") == 0 )
         {
            AV174TFForBlo_SelsJson = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV175TFForBlo_Sels.fromJSonString(AV174TFForBlo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCOSFORM") == 0 )
         {
            AV141TFForCosForm = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV142TFForCosForm_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORFEC") == 0 )
         {
            AV99TFForFec = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORULTMOD") == 0 )
         {
            AV105TFForUltMod = localUtil.ctod( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV159Emprcod = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV160Clicod = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV161Clicod_to = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER") == 0 )
         {
            AV162Forser = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORSER_TO") == 0 )
         {
            AV163Forser_to = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM") == 0 )
         {
            AV164Forcolnum = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNUM_TO") == 0 )
         {
            AV165Forcolnum_to = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM") == 0 )
         {
            AV166Forcolnom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORCOLNOM_TO") == 0 )
         {
            AV167Forcolnom_to = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD") == 0 )
         {
            AV168Tipcolcod = (byte)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPCOLCOD_TO") == 0 )
         {
            AV169Tipcolcod_to = (short)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOLFROM") == 0 )
         {
            AV172ForNumColfrom = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FORNUMCOLTO") == 0 )
         {
            AV173ForNumColto = (int)(GXutil.lval( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV215GXV1 = (int)(AV215GXV1+1) ;
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
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A13929ForTipArtD = "" ;
      A482ForColNom = "" ;
      A832TipColDsc = "" ;
      A584IntDsc = "" ;
      A5363IntDscF = "" ;
      A7781ForBlo = "" ;
      A4380ForCosForm = DecimalUtil.ZERO ;
      A485ForFec = GXutil.nullDate() ;
      A495ForUltMod = GXutil.nullDate() ;
      AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom = "" ;
      AV41TFCliNom = "" ;
      AV183Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel = "" ;
      AV42TFCliNom_Sel = "" ;
      AV184Formulaciontinte_listadodeformulas_wcds_6_tfforser = "" ;
      AV43TFForSer = "" ;
      AV185Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel = "" ;
      AV44TFForSer_Sel = "" ;
      AV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = "" ;
      AV45TFForSerDsc = "" ;
      AV187Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel = "" ;
      AV46TFForSerDsc_Sel = "" ;
      AV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = "" ;
      AV170TFForTipArtDsc = "" ;
      AV191Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel = "" ;
      AV171TFForTipArtDsc_Sel = "" ;
      AV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = "" ;
      AV47TFForColNom = "" ;
      AV193Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel = "" ;
      AV48TFForColNom_Sel = "" ;
      AV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = "" ;
      AV53TFTipColDsc = "" ;
      AV199Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel = "" ;
      AV54TFTipColDsc_Sel = "" ;
      AV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = "" ;
      AV57TFIntDsc = "" ;
      AV203Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel = "" ;
      AV58TFIntDsc_Sel = "" ;
      AV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = "" ;
      AV69TFIntDscF = "" ;
      AV207Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel = "" ;
      AV70TFIntDscF_Sel = "" ;
      AV210Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV175TFForBlo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV211Formulaciontinte_listadodeformulas_wcds_33_tfforcosform = DecimalUtil.ZERO ;
      AV141TFForCosForm = DecimalUtil.ZERO ;
      AV212Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to = DecimalUtil.ZERO ;
      AV142TFForCosForm_To = DecimalUtil.ZERO ;
      AV213Formulaciontinte_listadodeformulas_wcds_35_tfforfec = GXutil.nullDate() ;
      AV99TFForFec = GXutil.nullDate() ;
      AV214Formulaciontinte_listadodeformulas_wcds_36_tfforultmod = GXutil.nullDate() ;
      AV105TFForUltMod = GXutil.nullDate() ;
      lV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc = "" ;
      lV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom = "" ;
      lV184Formulaciontinte_listadodeformulas_wcds_6_tfforser = "" ;
      lV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc = "" ;
      lV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom = "" ;
      lV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc = "" ;
      lV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc = "" ;
      lV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf = "" ;
      AV162Forser = "" ;
      AV163Forser_to = "" ;
      AV166Forcolnom = "" ;
      AV167Forcolnom_to = "" ;
      A10045CliAct = "" ;
      AV159Emprcod = "" ;
      A396EmprCod = "" ;
      P09DJ2_A829TipArtCod = new short[1] ;
      P09DJ2_A10045CliAct = new String[] {""} ;
      P09DJ2_A396EmprCod = new String[] {""} ;
      P09DJ2_A495ForUltMod = new java.util.Date[] {GXutil.nullDate()} ;
      P09DJ2_n495ForUltMod = new boolean[] {false} ;
      P09DJ2_A485ForFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09DJ2_n485ForFec = new boolean[] {false} ;
      P09DJ2_A4380ForCosForm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DJ2_n4380ForCosForm = new boolean[] {false} ;
      P09DJ2_A486ForNumCol = new int[1] ;
      P09DJ2_A5363IntDscF = new String[] {""} ;
      P09DJ2_n5363IntDscF = new boolean[] {false} ;
      P09DJ2_A5362IntCodF = new byte[1] ;
      P09DJ2_n5362IntCodF = new boolean[] {false} ;
      P09DJ2_A584IntDsc = new String[] {""} ;
      P09DJ2_n584IntDsc = new boolean[] {false} ;
      P09DJ2_A583IntCod = new byte[1] ;
      P09DJ2_A832TipColDsc = new String[] {""} ;
      P09DJ2_n832TipColDsc = new boolean[] {false} ;
      P09DJ2_A831TipColCod = new byte[1] ;
      P09DJ2_A483ForColNum = new int[1] ;
      P09DJ2_A482ForColNom = new String[] {""} ;
      P09DJ2_A4384ForTipArt = new short[1] ;
      P09DJ2_n4384ForTipArt = new boolean[] {false} ;
      P09DJ2_A5742ForSerDsc = new String[] {""} ;
      P09DJ2_n5742ForSerDsc = new boolean[] {false} ;
      P09DJ2_A494ForSer = new String[] {""} ;
      P09DJ2_A279CliNom = new String[] {""} ;
      P09DJ2_A252CliCod = new int[1] ;
      P09DJ2_A7781ForBlo = new String[] {""} ;
      P09DJ2_n7781ForBlo = new boolean[] {false} ;
      P09DJ2_A13929ForTipArtD = new String[] {""} ;
      P09DJ2_n13929ForTipArtD = new boolean[] {false} ;
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
      AV174TFForBlo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.listadodeformulas_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09DJ2_A829TipArtCod, P09DJ2_A10045CliAct, P09DJ2_A396EmprCod, P09DJ2_A495ForUltMod, P09DJ2_n495ForUltMod, P09DJ2_A485ForFec, P09DJ2_n485ForFec, P09DJ2_A4380ForCosForm, P09DJ2_n4380ForCosForm, P09DJ2_A486ForNumCol,
            P09DJ2_A5363IntDscF, P09DJ2_n5363IntDscF, P09DJ2_A5362IntCodF, P09DJ2_n5362IntCodF, P09DJ2_A584IntDsc, P09DJ2_n584IntDsc, P09DJ2_A583IntCod, P09DJ2_A832TipColDsc, P09DJ2_n832TipColDsc, P09DJ2_A831TipColCod,
            P09DJ2_A483ForColNum, P09DJ2_A482ForColNom, P09DJ2_A4384ForTipArt, P09DJ2_n4384ForTipArt, P09DJ2_A5742ForSerDsc, P09DJ2_n5742ForSerDsc, P09DJ2_A494ForSer, P09DJ2_A279CliNom, P09DJ2_A252CliCod, P09DJ2_A7781ForBlo,
            P09DJ2_n7781ForBlo, P09DJ2_A13929ForTipArtD, P09DJ2_n13929ForTipArtD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte A5362IntCodF ;
   private byte AV196Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ;
   private byte AV51TFTipColCod ;
   private byte AV197Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ;
   private byte AV52TFTipColCod_To ;
   private byte AV200Formulaciontinte_listadodeformulas_wcds_22_tfintcod ;
   private byte AV55TFIntCod ;
   private byte AV201Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ;
   private byte AV56TFIntCod_To ;
   private byte AV204Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ;
   private byte AV67TFIntCodF ;
   private byte AV205Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ;
   private byte AV68TFIntCodF_To ;
   private byte AV168Tipcolcod ;
   private short gxcookieaux ;
   private short A4384ForTipArt ;
   private short AV188Formulaciontinte_listadodeformulas_wcds_10_tffortipart ;
   private short AV115TFForTipArt ;
   private short AV189Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ;
   private short AV116TFForTipArt_To ;
   private short AV169Tipcolcod_to ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A486ForNumCol ;
   private int AV180Formulaciontinte_listadodeformulas_wcds_2_tfclicod ;
   private int AV39TFCliCod ;
   private int AV181Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ;
   private int AV40TFCliCod_To ;
   private int AV194Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ;
   private int AV49TFForColNum ;
   private int AV195Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ;
   private int AV50TFForColNum_To ;
   private int AV208Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ;
   private int AV97TFForNumCol ;
   private int AV209Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ;
   private int AV98TFForNumCol_To ;
   private int AV210Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ;
   private int AV160Clicod ;
   private int AV161Clicod_to ;
   private int AV164Forcolnum ;
   private int AV165Forcolnum_to ;
   private int AV172ForNumColfrom ;
   private int AV173ForNumColto ;
   private int AV215GXV1 ;
   private java.math.BigDecimal A4380ForCosForm ;
   private java.math.BigDecimal AV211Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ;
   private java.math.BigDecimal AV141TFForCosForm ;
   private java.math.BigDecimal AV212Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ;
   private java.math.BigDecimal AV142TFForCosForm_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A494ForSer ;
   private String A5742ForSerDsc ;
   private String A13929ForTipArtD ;
   private String A482ForColNom ;
   private String A832TipColDsc ;
   private String A584IntDsc ;
   private String A5363IntDscF ;
   private String A7781ForBlo ;
   private String AV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom ;
   private String AV41TFCliNom ;
   private String AV183Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ;
   private String AV42TFCliNom_Sel ;
   private String AV184Formulaciontinte_listadodeformulas_wcds_6_tfforser ;
   private String AV43TFForSer ;
   private String AV185Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ;
   private String AV44TFForSer_Sel ;
   private String AV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ;
   private String AV45TFForSerDsc ;
   private String AV187Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ;
   private String AV46TFForSerDsc_Sel ;
   private String AV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ;
   private String AV170TFForTipArtDsc ;
   private String AV191Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ;
   private String AV171TFForTipArtDsc_Sel ;
   private String AV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ;
   private String AV47TFForColNom ;
   private String AV193Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ;
   private String AV48TFForColNom_Sel ;
   private String AV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ;
   private String AV53TFTipColDsc ;
   private String AV199Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ;
   private String AV54TFTipColDsc_Sel ;
   private String AV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ;
   private String AV57TFIntDsc ;
   private String AV203Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ;
   private String AV58TFIntDsc_Sel ;
   private String AV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ;
   private String AV69TFIntDscF ;
   private String AV207Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ;
   private String AV70TFIntDscF_Sel ;
   private String lV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ;
   private String scmdbuf ;
   private String lV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom ;
   private String lV184Formulaciontinte_listadodeformulas_wcds_6_tfforser ;
   private String lV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ;
   private String lV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ;
   private String lV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ;
   private String lV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ;
   private String lV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ;
   private String AV162Forser ;
   private String AV163Forser_to ;
   private String AV166Forcolnom ;
   private String AV167Forcolnom_to ;
   private String A10045CliAct ;
   private String AV159Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A485ForFec ;
   private java.util.Date A495ForUltMod ;
   private java.util.Date AV213Formulaciontinte_listadodeformulas_wcds_35_tfforfec ;
   private java.util.Date AV99TFForFec ;
   private java.util.Date AV214Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ;
   private java.util.Date AV105TFForUltMod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n495ForUltMod ;
   private boolean n485ForFec ;
   private boolean n4380ForCosForm ;
   private boolean n5363IntDscF ;
   private boolean n5362IntCodF ;
   private boolean n584IntDsc ;
   private boolean n832TipColDsc ;
   private boolean n4384ForTipArt ;
   private boolean n5742ForSerDsc ;
   private boolean n7781ForBlo ;
   private boolean n13929ForTipArtD ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV174TFForBlo_SelsJson ;
   private String AV11Filename ;
   private String AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P09DJ2_A829TipArtCod ;
   private String[] P09DJ2_A10045CliAct ;
   private String[] P09DJ2_A396EmprCod ;
   private java.util.Date[] P09DJ2_A495ForUltMod ;
   private boolean[] P09DJ2_n495ForUltMod ;
   private java.util.Date[] P09DJ2_A485ForFec ;
   private boolean[] P09DJ2_n485ForFec ;
   private java.math.BigDecimal[] P09DJ2_A4380ForCosForm ;
   private boolean[] P09DJ2_n4380ForCosForm ;
   private int[] P09DJ2_A486ForNumCol ;
   private String[] P09DJ2_A5363IntDscF ;
   private boolean[] P09DJ2_n5363IntDscF ;
   private byte[] P09DJ2_A5362IntCodF ;
   private boolean[] P09DJ2_n5362IntCodF ;
   private String[] P09DJ2_A584IntDsc ;
   private boolean[] P09DJ2_n584IntDsc ;
   private byte[] P09DJ2_A583IntCod ;
   private String[] P09DJ2_A832TipColDsc ;
   private boolean[] P09DJ2_n832TipColDsc ;
   private byte[] P09DJ2_A831TipColCod ;
   private int[] P09DJ2_A483ForColNum ;
   private String[] P09DJ2_A482ForColNom ;
   private short[] P09DJ2_A4384ForTipArt ;
   private boolean[] P09DJ2_n4384ForTipArt ;
   private String[] P09DJ2_A5742ForSerDsc ;
   private boolean[] P09DJ2_n5742ForSerDsc ;
   private String[] P09DJ2_A494ForSer ;
   private String[] P09DJ2_A279CliNom ;
   private int[] P09DJ2_A252CliCod ;
   private String[] P09DJ2_A7781ForBlo ;
   private boolean[] P09DJ2_n7781ForBlo ;
   private String[] P09DJ2_A13929ForTipArtD ;
   private boolean[] P09DJ2_n13929ForTipArtD ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV210Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ;
   private GXSimpleCollection<String> AV175TFForBlo_Sels ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodeformulas_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09DJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A7781ForBlo ,
                                          GXSimpleCollection<String> AV210Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels ,
                                          int AV180Formulaciontinte_listadodeformulas_wcds_2_tfclicod ,
                                          int AV181Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to ,
                                          String AV183Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel ,
                                          String AV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom ,
                                          String AV185Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel ,
                                          String AV184Formulaciontinte_listadodeformulas_wcds_6_tfforser ,
                                          String AV187Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel ,
                                          String AV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc ,
                                          short AV188Formulaciontinte_listadodeformulas_wcds_10_tffortipart ,
                                          short AV189Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to ,
                                          String AV193Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel ,
                                          String AV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom ,
                                          int AV194Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum ,
                                          int AV195Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to ,
                                          byte AV196Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod ,
                                          byte AV197Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to ,
                                          String AV199Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel ,
                                          String AV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc ,
                                          byte AV200Formulaciontinte_listadodeformulas_wcds_22_tfintcod ,
                                          byte AV201Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to ,
                                          String AV203Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel ,
                                          String AV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc ,
                                          byte AV204Formulaciontinte_listadodeformulas_wcds_26_tfintcodf ,
                                          byte AV205Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to ,
                                          String AV207Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel ,
                                          String AV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf ,
                                          int AV208Formulaciontinte_listadodeformulas_wcds_30_tffornumcol ,
                                          int AV209Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to ,
                                          int AV210Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size ,
                                          java.math.BigDecimal AV211Formulaciontinte_listadodeformulas_wcds_33_tfforcosform ,
                                          java.math.BigDecimal AV212Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to ,
                                          java.util.Date AV213Formulaciontinte_listadodeformulas_wcds_35_tfforfec ,
                                          java.util.Date AV214Formulaciontinte_listadodeformulas_wcds_36_tfforultmod ,
                                          int AV160Clicod ,
                                          int AV161Clicod_to ,
                                          String AV162Forser ,
                                          String AV163Forser_to ,
                                          String AV166Forcolnom ,
                                          String AV167Forcolnom_to ,
                                          int AV164Forcolnum ,
                                          int AV165Forcolnum_to ,
                                          byte AV168Tipcolcod ,
                                          short AV169Tipcolcod_to ,
                                          int AV172ForNumColfrom ,
                                          int AV173ForNumColto ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A494ForSer ,
                                          String A5742ForSerDsc ,
                                          short A4384ForTipArt ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod ,
                                          String A832TipColDsc ,
                                          byte A583IntCod ,
                                          String A584IntDsc ,
                                          byte A5362IntCodF ,
                                          String A5363IntDscF ,
                                          int A486ForNumCol ,
                                          java.math.BigDecimal A4380ForCosForm ,
                                          java.util.Date A485ForFec ,
                                          java.util.Date A495ForUltMod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV179Formulaciontinte_listadodeformulas_wcds_1_filterfulltext ,
                                          String A13929ForTipArtD ,
                                          String AV191Formulaciontinte_listadodeformulas_wcds_13_tffortipartdsc_sel ,
                                          String AV190Formulaciontinte_listadodeformulas_wcds_12_tffortipartdsc ,
                                          String A10045CliAct ,
                                          String AV159Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[50];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T5.TipArtCod, T6.CliAct, T1.EmprCod, T1.ForUltMod, T1.ForFec, T1.ForCosForm, T1.ForNumCol, T2.IntDscF, T1.IntCodF, T3.IntDsc, T1.IntCod, T4.TipColDsc, T1.TipColCod," ;
      scmdbuf += " T1.ForColNum, T1.ForColNom, T1.ForTipArt, T1.ForSerDsc, T1.ForSer, T6.CliNom, T1.CliCod, T1.ForBlo, COALESCE( T5.TipArtDsc, ' ') AS ForTipArtD FROM (((((TXPCFORMU" ;
      scmdbuf += " T1 LEFT JOIN TXPINTFAC T2 ON T2.EmprCod = T1.EmprCod AND T2.IntCodF = T1.IntCodF) INNER JOIN TXPINTENS T3 ON T3.EmprCod = T1.EmprCod AND T3.IntCod = T1.IntCod)" ;
      scmdbuf += " INNER JOIN TXPTIPCOL T4 ON T4.EmprCod = T1.EmprCod AND T4.TipColCod = T1.TipColCod) LEFT JOIN TXPTIPART T5 ON T5.EmprCod = T1.EmprCod AND T5.TipArtCod = T1.ForTipArt)" ;
      scmdbuf += " INNER JOIN TXPCLIENT T6 ON T6.EmprCod = T1.EmprCod AND T6.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "(T6.CliAct = 'S')");
      if ( ! (0==AV180Formulaciontinte_listadodeformulas_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV181Formulaciontinte_listadodeformulas_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV183Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV182Formulaciontinte_listadodeformulas_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T6.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV183Formulaciontinte_listadodeformulas_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T6.CliNom = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV185Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) && ( ! (GXutil.strcmp("", AV184Formulaciontinte_listadodeformulas_wcds_6_tfforser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV185Formulaciontinte_listadodeformulas_wcds_7_tfforser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV186Formulaciontinte_listadodeformulas_wcds_8_tfforserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV187Formulaciontinte_listadodeformulas_wcds_9_tfforserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForSerDsc = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (0==AV188Formulaciontinte_listadodeformulas_wcds_10_tffortipart) )
      {
         addWhere(sWhereString, "(T1.ForTipArt >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (0==AV189Formulaciontinte_listadodeformulas_wcds_11_tffortipart_to) )
      {
         addWhere(sWhereString, "(T1.ForTipArt <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV192Formulaciontinte_listadodeformulas_wcds_14_tfforcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV193Formulaciontinte_listadodeformulas_wcds_15_tfforcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV194Formulaciontinte_listadodeformulas_wcds_16_tfforcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV195Formulaciontinte_listadodeformulas_wcds_17_tfforcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV196Formulaciontinte_listadodeformulas_wcds_18_tftipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV197Formulaciontinte_listadodeformulas_wcds_19_tftipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV199Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) && ( ! (GXutil.strcmp("", AV198Formulaciontinte_listadodeformulas_wcds_20_tftipcoldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.TipColDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV199Formulaciontinte_listadodeformulas_wcds_21_tftipcoldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T4.TipColDsc = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV200Formulaciontinte_listadodeformulas_wcds_22_tfintcod) )
      {
         addWhere(sWhereString, "(T1.IntCod >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV201Formulaciontinte_listadodeformulas_wcds_23_tfintcod_to) )
      {
         addWhere(sWhereString, "(T1.IntCod <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV203Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) && ( ! (GXutil.strcmp("", AV202Formulaciontinte_listadodeformulas_wcds_24_tfintdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.IntDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV203Formulaciontinte_listadodeformulas_wcds_25_tfintdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.IntDsc = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV204Formulaciontinte_listadodeformulas_wcds_26_tfintcodf) )
      {
         addWhere(sWhereString, "(T1.IntCodF >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV205Formulaciontinte_listadodeformulas_wcds_27_tfintcodf_to) )
      {
         addWhere(sWhereString, "(T1.IntCodF <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV207Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) && ( ! (GXutil.strcmp("", AV206Formulaciontinte_listadodeformulas_wcds_28_tfintdscf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.IntDscF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV207Formulaciontinte_listadodeformulas_wcds_29_tfintdscf_sel)==0) )
      {
         addWhere(sWhereString, "(T2.IntDscF = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV208Formulaciontinte_listadodeformulas_wcds_30_tffornumcol) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV209Formulaciontinte_listadodeformulas_wcds_31_tffornumcol_to) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( AV210Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV210Formulaciontinte_listadodeformulas_wcds_32_tfforblo_sels, "T1.ForBlo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV211Formulaciontinte_listadodeformulas_wcds_33_tfforcosform)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV212Formulaciontinte_listadodeformulas_wcds_34_tfforcosform_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCosForm <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV213Formulaciontinte_listadodeformulas_wcds_35_tfforfec)) )
      {
         addWhere(sWhereString, "(T1.ForFec >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV214Formulaciontinte_listadodeformulas_wcds_36_tfforultmod)) )
      {
         addWhere(sWhereString, "(T1.ForUltMod >= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV160Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV161Clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Forser)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer >= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV163Forser_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForSer <= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV166Forcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom >= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Forcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForColNom <= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (0==AV164Forcolnum) )
      {
         addWhere(sWhereString, "(T1.ForColNum >= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (0==AV165Forcolnum_to) )
      {
         addWhere(sWhereString, "(T1.ForColNum <= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (0==AV168Tipcolcod) )
      {
         addWhere(sWhereString, "(T1.TipColCod >= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (0==AV169Tipcolcod_to) )
      {
         addWhere(sWhereString, "(T1.TipColCod <= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (0==AV172ForNumColfrom) )
      {
         addWhere(sWhereString, "(T1.ForNumCol >= ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV173ForNumColto) )
      {
         addWhere(sWhereString, "(T1.ForNumCol <= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T6.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T6.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSer" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForTipArt" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForTipArt DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForColNum" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipColCod" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipColCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.TipColDsc" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.TipColDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IntCod" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IntCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.IntDsc" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.IntDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.IntCodF" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.IntCodF DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.IntDscF" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.IntDscF DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForNumCol" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForNumCol DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForBlo" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForBlo DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForCosForm" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForCosForm DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForFec" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ForUltMod" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ForUltMod DESC" ;
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
                  return conditional_P09DJ2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).intValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).byteValue() , ((Number) dynConstraints[44]).shortValue() , ((Number) dynConstraints[45]).intValue() , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , (String)dynConstraints[52] , ((Number) dynConstraints[53]).intValue() , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).byteValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , (java.math.BigDecimal)dynConstraints[61] , (java.util.Date)dynConstraints[62] , (java.util.Date)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(7);
               ((String[]) buf[10])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((int[]) buf[20])[0] = rslt.getInt(14);
               ((String[]) buf[21])[0] = rslt.getString(15, 13);
               ((short[]) buf[22])[0] = rslt.getShort(16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(18, 16);
               ((String[]) buf[27])[0] = rslt.getString(19, 30);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((String[]) buf[29])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[78]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[79]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[83]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 5);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 5);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[86]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[87]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 16);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 16);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[96]).byteValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[97]).shortValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               return;
      }
   }

}

