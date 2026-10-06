package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class dis__wwexportcsv_impl extends GXWebProcedure
{
   public dis__wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S181 ();
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
      S191 ();
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
      AV11Filename = "./PrivateTempStorage/" + "Dis__WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Pedidos.Dis__WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Pedidos.Dis__WWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Usuario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Estado", "") : "") ;
      if ( AV61IsAuthorizedDisCliNum )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ped. Cli.", "") : "") ;
      }
      if ( AV62IsAuthorizedDisEncCli )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ped. Cli.", "") : "") ;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nr.Enc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Data ped.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Data reg.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Data entr.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Artigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cor. Núm", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "TC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und.", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV82Pedidos_dis__wwds_1_filterfulltext = AV30FilterFullText ;
      AV83Pedidos_dis__wwds_2_tfdisusrcod = AV59TFDisUsrCod ;
      AV84Pedidos_dis__wwds_3_tfdisusrcod_sel = AV60TFDisUsrCod_Sel ;
      AV85Pedidos_dis__wwds_4_tfdisest_sels = AV58TFDisEst_Sels ;
      AV86Pedidos_dis__wwds_5_tfdisclinum = AV63TFDisCliNum ;
      AV87Pedidos_dis__wwds_6_tfdisclinum_sel = AV64TFDisCliNum_Sel ;
      AV88Pedidos_dis__wwds_7_tfdisenccli = AV65TFDisEncCli ;
      AV89Pedidos_dis__wwds_8_tfdisenccli_sel = AV66TFDisEncCli_Sel ;
      AV90Pedidos_dis__wwds_9_tfdiscod = AV34TFDisCod ;
      AV91Pedidos_dis__wwds_10_tfdiscod_to = AV35TFDisCod_To ;
      AV92Pedidos_dis__wwds_11_tfdisfeccli = AV36TFDisFecCli ;
      AV93Pedidos_dis__wwds_12_tfdisfec = AV38TFDisFec ;
      AV94Pedidos_dis__wwds_13_tfdisfecent = AV41TFDisFecEnt ;
      AV95Pedidos_dis__wwds_14_tfclicod = AV43TFCliCod ;
      AV96Pedidos_dis__wwds_15_tfclicod_to = AV44TFCliCod_To ;
      AV97Pedidos_dis__wwds_16_tfclinom = AV45TFCliNom ;
      AV98Pedidos_dis__wwds_17_tfclinom_sel = AV46TFCliNom_Sel ;
      AV99Pedidos_dis__wwds_18_tfdisartcod = AV47TFDisArtCod ;
      AV100Pedidos_dis__wwds_19_tfdisartcod_sel = AV48TFDisArtCod_Sel ;
      AV101Pedidos_dis__wwds_20_tfdisartdsc = AV49TFDisArtDsc ;
      AV102Pedidos_dis__wwds_21_tfdisartdsc_sel = AV50TFDisArtDsc_Sel ;
      AV103Pedidos_dis__wwds_22_tfdiscolnom = AV51TFDisColNom ;
      AV104Pedidos_dis__wwds_23_tfdiscolnom_sel = AV52TFDisColNom_Sel ;
      AV105Pedidos_dis__wwds_24_tfdiscolnum = AV53TFDisColNum ;
      AV106Pedidos_dis__wwds_25_tfdiscolnum_to = AV54TFDisColNum_To ;
      AV107Pedidos_dis__wwds_26_tfdistipcol = AV55TFDisTipCol ;
      AV108Pedidos_dis__wwds_27_tfdistipcol_to = AV56TFDisTipCol_To ;
      AV109Pedidos_dis__wwds_28_tfdisnomcli = AV67TFDisNomCli ;
      AV110Pedidos_dis__wwds_29_tfdisnomcli_sel = AV68TFDisNomCli_Sel ;
      AV111Pedidos_dis__wwds_30_tfdisnumcli = AV69TFDisNumCli ;
      AV112Pedidos_dis__wwds_31_tfdisnumcli_to = AV70TFDisNumCli_To ;
      AV113Pedidos_dis__wwds_32_tfmaqcoddis = AV71TFMaqCodDis ;
      AV114Pedidos_dis__wwds_33_tfmaqcoddis_sel = AV72TFMaqCodDis_Sel ;
      AV115Pedidos_dis__wwds_34_tfdisnumpie = AV73TFDisNumPie ;
      AV116Pedidos_dis__wwds_35_tfdisnumpie_to = AV74TFDisNumPie_To ;
      AV117Pedidos_dis__wwds_36_tfdisnumuni = AV75TFDisNumUni ;
      AV118Pedidos_dis__wwds_37_tfdisnumuni_to = AV76TFDisNumUni_To ;
      AV119Pedidos_dis__wwds_38_tfdisunimed = AV77TFDisUniMed ;
      AV120Pedidos_dis__wwds_39_tfdisunimed_sel = AV78TFDisUniMed_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV85Pedidos_dis__wwds_4_tfdisest_sels ,
                                           AV84Pedidos_dis__wwds_3_tfdisusrcod_sel ,
                                           AV83Pedidos_dis__wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV85Pedidos_dis__wwds_4_tfdisest_sels.size()) ,
                                           AV87Pedidos_dis__wwds_6_tfdisclinum_sel ,
                                           AV86Pedidos_dis__wwds_5_tfdisclinum ,
                                           AV89Pedidos_dis__wwds_8_tfdisenccli_sel ,
                                           AV88Pedidos_dis__wwds_7_tfdisenccli ,
                                           Integer.valueOf(AV90Pedidos_dis__wwds_9_tfdiscod) ,
                                           Integer.valueOf(AV91Pedidos_dis__wwds_10_tfdiscod_to) ,
                                           AV92Pedidos_dis__wwds_11_tfdisfeccli ,
                                           AV93Pedidos_dis__wwds_12_tfdisfec ,
                                           AV94Pedidos_dis__wwds_13_tfdisfecent ,
                                           Integer.valueOf(AV95Pedidos_dis__wwds_14_tfclicod) ,
                                           Integer.valueOf(AV96Pedidos_dis__wwds_15_tfclicod_to) ,
                                           AV98Pedidos_dis__wwds_17_tfclinom_sel ,
                                           AV97Pedidos_dis__wwds_16_tfclinom ,
                                           AV100Pedidos_dis__wwds_19_tfdisartcod_sel ,
                                           AV99Pedidos_dis__wwds_18_tfdisartcod ,
                                           AV102Pedidos_dis__wwds_21_tfdisartdsc_sel ,
                                           AV101Pedidos_dis__wwds_20_tfdisartdsc ,
                                           AV104Pedidos_dis__wwds_23_tfdiscolnom_sel ,
                                           AV103Pedidos_dis__wwds_22_tfdiscolnom ,
                                           Integer.valueOf(AV105Pedidos_dis__wwds_24_tfdiscolnum) ,
                                           Integer.valueOf(AV106Pedidos_dis__wwds_25_tfdiscolnum_to) ,
                                           Byte.valueOf(AV107Pedidos_dis__wwds_26_tfdistipcol) ,
                                           Byte.valueOf(AV108Pedidos_dis__wwds_27_tfdistipcol_to) ,
                                           AV110Pedidos_dis__wwds_29_tfdisnomcli_sel ,
                                           AV109Pedidos_dis__wwds_28_tfdisnomcli ,
                                           Integer.valueOf(AV111Pedidos_dis__wwds_30_tfdisnumcli) ,
                                           Integer.valueOf(AV112Pedidos_dis__wwds_31_tfdisnumcli_to) ,
                                           AV114Pedidos_dis__wwds_33_tfmaqcoddis_sel ,
                                           AV113Pedidos_dis__wwds_32_tfmaqcoddis ,
                                           Short.valueOf(AV115Pedidos_dis__wwds_34_tfdisnumpie) ,
                                           Short.valueOf(AV116Pedidos_dis__wwds_35_tfdisnumpie_to) ,
                                           AV117Pedidos_dis__wwds_36_tfdisnumuni ,
                                           AV118Pedidos_dis__wwds_37_tfdisnumuni_to ,
                                           AV120Pedidos_dis__wwds_39_tfdisunimed_sel ,
                                           AV119Pedidos_dis__wwds_38_tfdisunimed ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
                                           Integer.valueOf(A361DisCod) ,
                                           A370DisFecCli ,
                                           A369DisFec ,
                                           A371DisFecEnt ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A335DisArtCod ,
                                           A337DisArtDsc ,
                                           A362DisColNom ,
                                           Integer.valueOf(A363DisColNum) ,
                                           Byte.valueOf(A390DisTipCol) ,
                                           A1195DisNomCli ,
                                           Integer.valueOf(A1196DisNumCli) ,
                                           A1122MaqCodDis ,
                                           Short.valueOf(A374DisNumPie) ,
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV82Pedidos_dis__wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV83Pedidos_dis__wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV83Pedidos_dis__wwds_2_tfdisusrcod), 8, "%") ;
      lV86Pedidos_dis__wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV86Pedidos_dis__wwds_5_tfdisclinum), 8, "%") ;
      lV88Pedidos_dis__wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV88Pedidos_dis__wwds_7_tfdisenccli), 20, "%") ;
      lV97Pedidos_dis__wwds_16_tfclinom = GXutil.padr( GXutil.rtrim( AV97Pedidos_dis__wwds_16_tfclinom), 30, "%") ;
      lV99Pedidos_dis__wwds_18_tfdisartcod = GXutil.padr( GXutil.rtrim( AV99Pedidos_dis__wwds_18_tfdisartcod), 16, "%") ;
      lV101Pedidos_dis__wwds_20_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV101Pedidos_dis__wwds_20_tfdisartdsc), 26, "%") ;
      lV103Pedidos_dis__wwds_22_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV103Pedidos_dis__wwds_22_tfdiscolnom), 13, "%") ;
      lV109Pedidos_dis__wwds_28_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV109Pedidos_dis__wwds_28_tfdisnomcli), 13, "%") ;
      lV113Pedidos_dis__wwds_32_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV113Pedidos_dis__wwds_32_tfmaqcoddis), 6, "%") ;
      lV119Pedidos_dis__wwds_38_tfdisunimed = GXutil.padr( GXutil.rtrim( AV119Pedidos_dis__wwds_38_tfdisunimed), 1, "%") ;
      /* Using cursor P09VG2 */
      pr_default.execute(0, new Object[] {lV83Pedidos_dis__wwds_2_tfdisusrcod, AV84Pedidos_dis__wwds_3_tfdisusrcod_sel, lV86Pedidos_dis__wwds_5_tfdisclinum, AV87Pedidos_dis__wwds_6_tfdisclinum_sel, lV88Pedidos_dis__wwds_7_tfdisenccli, AV89Pedidos_dis__wwds_8_tfdisenccli_sel, Integer.valueOf(AV90Pedidos_dis__wwds_9_tfdiscod), Integer.valueOf(AV91Pedidos_dis__wwds_10_tfdiscod_to), AV92Pedidos_dis__wwds_11_tfdisfeccli, AV93Pedidos_dis__wwds_12_tfdisfec, AV94Pedidos_dis__wwds_13_tfdisfecent, Integer.valueOf(AV95Pedidos_dis__wwds_14_tfclicod), Integer.valueOf(AV96Pedidos_dis__wwds_15_tfclicod_to), lV97Pedidos_dis__wwds_16_tfclinom, AV98Pedidos_dis__wwds_17_tfclinom_sel, lV99Pedidos_dis__wwds_18_tfdisartcod, AV100Pedidos_dis__wwds_19_tfdisartcod_sel, lV101Pedidos_dis__wwds_20_tfdisartdsc, AV102Pedidos_dis__wwds_21_tfdisartdsc_sel, lV103Pedidos_dis__wwds_22_tfdiscolnom, AV104Pedidos_dis__wwds_23_tfdiscolnom_sel, Integer.valueOf(AV105Pedidos_dis__wwds_24_tfdiscolnum), Integer.valueOf(AV106Pedidos_dis__wwds_25_tfdiscolnum_to), Byte.valueOf(AV107Pedidos_dis__wwds_26_tfdistipcol), Byte.valueOf(AV108Pedidos_dis__wwds_27_tfdistipcol_to), lV109Pedidos_dis__wwds_28_tfdisnomcli, AV110Pedidos_dis__wwds_29_tfdisnomcli_sel, Integer.valueOf(AV111Pedidos_dis__wwds_30_tfdisnumcli), Integer.valueOf(AV112Pedidos_dis__wwds_31_tfdisnumcli_to), lV113Pedidos_dis__wwds_32_tfmaqcoddis, AV114Pedidos_dis__wwds_33_tfmaqcoddis_sel, Short.valueOf(AV115Pedidos_dis__wwds_34_tfdisnumpie), Short.valueOf(AV116Pedidos_dis__wwds_35_tfdisnumpie_to), AV117Pedidos_dis__wwds_36_tfdisnumuni, AV118Pedidos_dis__wwds_37_tfdisnumuni_to, lV119Pedidos_dis__wwds_38_tfdisunimed, AV120Pedidos_dis__wwds_39_tfdisunimed_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A392DisUniMed = P09VG2_A392DisUniMed[0] ;
         A375DisNumUni = P09VG2_A375DisNumUni[0] ;
         A374DisNumPie = P09VG2_A374DisNumPie[0] ;
         A1122MaqCodDis = P09VG2_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P09VG2_n1122MaqCodDis[0] ;
         A1196DisNumCli = P09VG2_A1196DisNumCli[0] ;
         A1195DisNomCli = P09VG2_A1195DisNomCli[0] ;
         A390DisTipCol = P09VG2_A390DisTipCol[0] ;
         n390DisTipCol = P09VG2_n390DisTipCol[0] ;
         A363DisColNum = P09VG2_A363DisColNum[0] ;
         n363DisColNum = P09VG2_n363DisColNum[0] ;
         A362DisColNom = P09VG2_A362DisColNom[0] ;
         n362DisColNom = P09VG2_n362DisColNom[0] ;
         A337DisArtDsc = P09VG2_A337DisArtDsc[0] ;
         A335DisArtCod = P09VG2_A335DisArtCod[0] ;
         A279CliNom = P09VG2_A279CliNom[0] ;
         A252CliCod = P09VG2_A252CliCod[0] ;
         A371DisFecEnt = P09VG2_A371DisFecEnt[0] ;
         A369DisFec = P09VG2_A369DisFec[0] ;
         A370DisFecCli = P09VG2_A370DisFecCli[0] ;
         A361DisCod = P09VG2_A361DisCod[0] ;
         A4813DisEncCli = P09VG2_A4813DisEncCli[0] ;
         A360DisCliNum = P09VG2_A360DisCliNum[0] ;
         A4348DisUsrCod = P09VG2_A4348DisUsrCod[0] ;
         A367DisEst = P09VG2_A367DisEst[0] ;
         A396EmprCod = P09VG2_A396EmprCod[0] ;
         A279CliNom = P09VG2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV82Pedidos_dis__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV82Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV82Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV82Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV82Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV82Pedidos_dis__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV82Pedidos_dis__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4348DisUsrCod, ";", ","), GXv_char3) ;
               dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( A367DisEst == 1 )
               {
                  AV14TextFileLine += httpContext.getMessage( "En Pedido", "") ;
               }
               else if ( A367DisEst == 3 )
               {
                  AV14TextFileLine += httpContext.getMessage( "En Produccion", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A360DisCliNum, ";", ","), GXv_char3) ;
               dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4813DisEncCli, ";", ","), GXv_char3) ;
               dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A361DisCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A370DisFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A369DisFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A371DisFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
               dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A335DisArtCod, ";", ","), GXv_char3) ;
               dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A337DisArtDsc, ";", ","), GXv_char3) ;
               dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A362DisColNom, ";", ","), GXv_char3) ;
               dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A363DisColNum, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A390DisTipCol, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1195DisNomCli, ";", ","), GXv_char3) ;
               dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A1196DisNumCli, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1122MaqCodDis, ";", ","), GXv_char3) ;
               dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A374DisNumPie, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A375DisNumUni, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A392DisUniMed, ";", ","), GXv_char3) ;
               dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
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
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void S181( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      GXt_int4 = (byte)(0) ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int5) ;
      dis__wwexportcsv_impl.this.GXt_int4 = GXv_int5[0] ;
      AV61IsAuthorizedDisCliNum = (boolean)(((GXt_int4==0))) ;
      GXt_int4 = (byte)(0) ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int5) ;
      dis__wwexportcsv_impl.this.GXt_int4 = GXv_int5[0] ;
      AV62IsAuthorizedDisEncCli = (boolean)(((GXt_int4==1))) ;
   }

   public void S191( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=Dis__WWExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisUsrCod", "", "Usuario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisEst", "", "Estado", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      if ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 0 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisCliNum", "", "Ped. Cli.", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      if ( new app.pexicon(remoteHandle, context).executeUdp( A396EmprCod, httpContext.getMessage( "ENC20C", "")) == 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisEncCli", "", "Ped. Cli.", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      }
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisCod", "", "Nr.Enc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisFecCli", "", "Data ped.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisFec", "", "Data reg.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisFecEnt", "", "Data entr.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "CliNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisArtCod", "", "Artigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisArtDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisColNom", "", "Cor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisColNum", "", "Cor. Núm", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisTipCol", "", "TC", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisNomCli", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisNumCli", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "MaqCodDis", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisNumPie", "", "Piezas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisNumUni", "", "Unidades", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisUniMed", "", "Und.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Pedidos.Dis__WWColumnsSelector", GXv_char3) ;
      dis__wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector6[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, GXv_SdtWWPColumnsSelector7) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector6[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("Pedidos.Dis__WWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.Dis__WWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("Pedidos.Dis__WWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV121GXV1 = 1 ;
      while ( AV121GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV121GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV59TFDisUsrCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV60TFDisUsrCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISEST_SEL") == 0 )
         {
            AV57TFDisEst_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV58TFDisEst_Sels.fromJSonString(AV57TFDisEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV63TFDisCliNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV64TFDisCliNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI") == 0 )
         {
            AV65TFDisEncCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI_SEL") == 0 )
         {
            AV66TFDisEncCli_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOD") == 0 )
         {
            AV34TFDisCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFDisCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECCLI") == 0 )
         {
            AV36TFDisFecCli = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFEC") == 0 )
         {
            AV38TFDisFec = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECENT") == 0 )
         {
            AV41TFDisFecEnt = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV43TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV45TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV46TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV47TFDisArtCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV48TFDisArtCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV49TFDisArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV50TFDisArtDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV51TFDisColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV52TFDisColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV53TFDisColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV54TFDisColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV55TFDisTipCol = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV56TFDisTipCol_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV67TFDisNomCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV68TFDisNomCli_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMCLI") == 0 )
         {
            AV69TFDisNumCli = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFDisNumCli_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV71TFMaqCodDis = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV72TFMaqCodDis_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMPIE") == 0 )
         {
            AV73TFDisNumPie = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFDisNumPie_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMUNI") == 0 )
         {
            AV75TFDisNumUni = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV76TFDisNumUni_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV77TFDisUniMed = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV78TFDisUniMed_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV121GXV1 = (int)(AV121GXV1+1) ;
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
      A396EmprCod = "" ;
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A4348DisUsrCod = "" ;
      A360DisCliNum = "" ;
      A4813DisEncCli = "" ;
      A370DisFecCli = GXutil.nullDate() ;
      A369DisFec = GXutil.nullDate() ;
      A371DisFecEnt = GXutil.nullDate() ;
      A279CliNom = "" ;
      A335DisArtCod = "" ;
      A337DisArtDsc = "" ;
      A362DisColNom = "" ;
      A1195DisNomCli = "" ;
      A1122MaqCodDis = "" ;
      A375DisNumUni = DecimalUtil.ZERO ;
      A392DisUniMed = "" ;
      AV82Pedidos_dis__wwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV83Pedidos_dis__wwds_2_tfdisusrcod = "" ;
      AV59TFDisUsrCod = "" ;
      AV84Pedidos_dis__wwds_3_tfdisusrcod_sel = "" ;
      AV60TFDisUsrCod_Sel = "" ;
      AV85Pedidos_dis__wwds_4_tfdisest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV58TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV86Pedidos_dis__wwds_5_tfdisclinum = "" ;
      AV63TFDisCliNum = "" ;
      AV87Pedidos_dis__wwds_6_tfdisclinum_sel = "" ;
      AV64TFDisCliNum_Sel = "" ;
      AV88Pedidos_dis__wwds_7_tfdisenccli = "" ;
      AV65TFDisEncCli = "" ;
      AV89Pedidos_dis__wwds_8_tfdisenccli_sel = "" ;
      AV66TFDisEncCli_Sel = "" ;
      AV92Pedidos_dis__wwds_11_tfdisfeccli = GXutil.nullDate() ;
      AV36TFDisFecCli = GXutil.nullDate() ;
      AV93Pedidos_dis__wwds_12_tfdisfec = GXutil.nullDate() ;
      AV38TFDisFec = GXutil.nullDate() ;
      AV94Pedidos_dis__wwds_13_tfdisfecent = GXutil.nullDate() ;
      AV41TFDisFecEnt = GXutil.nullDate() ;
      AV97Pedidos_dis__wwds_16_tfclinom = "" ;
      AV45TFCliNom = "" ;
      AV98Pedidos_dis__wwds_17_tfclinom_sel = "" ;
      AV46TFCliNom_Sel = "" ;
      AV99Pedidos_dis__wwds_18_tfdisartcod = "" ;
      AV47TFDisArtCod = "" ;
      AV100Pedidos_dis__wwds_19_tfdisartcod_sel = "" ;
      AV48TFDisArtCod_Sel = "" ;
      AV101Pedidos_dis__wwds_20_tfdisartdsc = "" ;
      AV49TFDisArtDsc = "" ;
      AV102Pedidos_dis__wwds_21_tfdisartdsc_sel = "" ;
      AV50TFDisArtDsc_Sel = "" ;
      AV103Pedidos_dis__wwds_22_tfdiscolnom = "" ;
      AV51TFDisColNom = "" ;
      AV104Pedidos_dis__wwds_23_tfdiscolnom_sel = "" ;
      AV52TFDisColNom_Sel = "" ;
      AV109Pedidos_dis__wwds_28_tfdisnomcli = "" ;
      AV67TFDisNomCli = "" ;
      AV110Pedidos_dis__wwds_29_tfdisnomcli_sel = "" ;
      AV68TFDisNomCli_Sel = "" ;
      AV113Pedidos_dis__wwds_32_tfmaqcoddis = "" ;
      AV71TFMaqCodDis = "" ;
      AV114Pedidos_dis__wwds_33_tfmaqcoddis_sel = "" ;
      AV72TFMaqCodDis_Sel = "" ;
      AV117Pedidos_dis__wwds_36_tfdisnumuni = DecimalUtil.ZERO ;
      AV75TFDisNumUni = DecimalUtil.ZERO ;
      AV118Pedidos_dis__wwds_37_tfdisnumuni_to = DecimalUtil.ZERO ;
      AV76TFDisNumUni_To = DecimalUtil.ZERO ;
      AV119Pedidos_dis__wwds_38_tfdisunimed = "" ;
      AV77TFDisUniMed = "" ;
      AV120Pedidos_dis__wwds_39_tfdisunimed_sel = "" ;
      AV78TFDisUniMed_Sel = "" ;
      lV82Pedidos_dis__wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV83Pedidos_dis__wwds_2_tfdisusrcod = "" ;
      lV86Pedidos_dis__wwds_5_tfdisclinum = "" ;
      lV88Pedidos_dis__wwds_7_tfdisenccli = "" ;
      lV97Pedidos_dis__wwds_16_tfclinom = "" ;
      lV99Pedidos_dis__wwds_18_tfdisartcod = "" ;
      lV101Pedidos_dis__wwds_20_tfdisartdsc = "" ;
      lV103Pedidos_dis__wwds_22_tfdiscolnom = "" ;
      lV109Pedidos_dis__wwds_28_tfdisnomcli = "" ;
      lV113Pedidos_dis__wwds_32_tfmaqcoddis = "" ;
      lV119Pedidos_dis__wwds_38_tfdisunimed = "" ;
      P09VG2_A392DisUniMed = new String[] {""} ;
      P09VG2_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09VG2_A374DisNumPie = new short[1] ;
      P09VG2_A1122MaqCodDis = new String[] {""} ;
      P09VG2_n1122MaqCodDis = new boolean[] {false} ;
      P09VG2_A1196DisNumCli = new int[1] ;
      P09VG2_A1195DisNomCli = new String[] {""} ;
      P09VG2_A390DisTipCol = new byte[1] ;
      P09VG2_n390DisTipCol = new boolean[] {false} ;
      P09VG2_A363DisColNum = new int[1] ;
      P09VG2_n363DisColNum = new boolean[] {false} ;
      P09VG2_A362DisColNom = new String[] {""} ;
      P09VG2_n362DisColNom = new boolean[] {false} ;
      P09VG2_A337DisArtDsc = new String[] {""} ;
      P09VG2_A335DisArtCod = new String[] {""} ;
      P09VG2_A279CliNom = new String[] {""} ;
      P09VG2_A252CliCod = new int[1] ;
      P09VG2_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P09VG2_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09VG2_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P09VG2_A361DisCod = new int[1] ;
      P09VG2_A4813DisEncCli = new String[] {""} ;
      P09VG2_A360DisCliNum = new String[] {""} ;
      P09VG2_A4348DisUsrCod = new String[] {""} ;
      P09VG2_A367DisEst = new byte[1] ;
      P09VG2_A396EmprCod = new String[] {""} ;
      GXv_int5 = new byte[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV57TFDisEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis__wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P09VG2_A392DisUniMed, P09VG2_A375DisNumUni, P09VG2_A374DisNumPie, P09VG2_A1122MaqCodDis, P09VG2_n1122MaqCodDis, P09VG2_A1196DisNumCli, P09VG2_A1195DisNomCli, P09VG2_A390DisTipCol, P09VG2_n390DisTipCol, P09VG2_A363DisColNum,
            P09VG2_n363DisColNum, P09VG2_A362DisColNom, P09VG2_n362DisColNom, P09VG2_A337DisArtDsc, P09VG2_A335DisArtCod, P09VG2_A279CliNom, P09VG2_A252CliCod, P09VG2_A371DisFecEnt, P09VG2_A369DisFec, P09VG2_A370DisFecCli,
            P09VG2_A361DisCod, P09VG2_A4813DisEncCli, P09VG2_A360DisCliNum, P09VG2_A4348DisUsrCod, P09VG2_A367DisEst, P09VG2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte AV107Pedidos_dis__wwds_26_tfdistipcol ;
   private byte AV55TFDisTipCol ;
   private byte AV108Pedidos_dis__wwds_27_tfdistipcol_to ;
   private byte AV56TFDisTipCol_To ;
   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private short gxcookieaux ;
   private short A374DisNumPie ;
   private short AV115Pedidos_dis__wwds_34_tfdisnumpie ;
   private short AV73TFDisNumPie ;
   private short AV116Pedidos_dis__wwds_35_tfdisnumpie_to ;
   private short AV74TFDisNumPie_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int AV90Pedidos_dis__wwds_9_tfdiscod ;
   private int AV34TFDisCod ;
   private int AV91Pedidos_dis__wwds_10_tfdiscod_to ;
   private int AV35TFDisCod_To ;
   private int AV95Pedidos_dis__wwds_14_tfclicod ;
   private int AV43TFCliCod ;
   private int AV96Pedidos_dis__wwds_15_tfclicod_to ;
   private int AV44TFCliCod_To ;
   private int AV105Pedidos_dis__wwds_24_tfdiscolnum ;
   private int AV53TFDisColNum ;
   private int AV106Pedidos_dis__wwds_25_tfdiscolnum_to ;
   private int AV54TFDisColNum_To ;
   private int AV111Pedidos_dis__wwds_30_tfdisnumcli ;
   private int AV69TFDisNumCli ;
   private int AV112Pedidos_dis__wwds_31_tfdisnumcli_to ;
   private int AV70TFDisNumCli_To ;
   private int AV85Pedidos_dis__wwds_4_tfdisest_sels_size ;
   private int AV121GXV1 ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV117Pedidos_dis__wwds_36_tfdisnumuni ;
   private java.math.BigDecimal AV75TFDisNumUni ;
   private java.math.BigDecimal AV118Pedidos_dis__wwds_37_tfdisnumuni_to ;
   private java.math.BigDecimal AV76TFDisNumUni_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A396EmprCod ;
   private String A4348DisUsrCod ;
   private String A360DisCliNum ;
   private String A4813DisEncCli ;
   private String A279CliNom ;
   private String A335DisArtCod ;
   private String A337DisArtDsc ;
   private String A362DisColNom ;
   private String A1195DisNomCli ;
   private String A1122MaqCodDis ;
   private String A392DisUniMed ;
   private String AV83Pedidos_dis__wwds_2_tfdisusrcod ;
   private String AV59TFDisUsrCod ;
   private String AV84Pedidos_dis__wwds_3_tfdisusrcod_sel ;
   private String AV60TFDisUsrCod_Sel ;
   private String AV86Pedidos_dis__wwds_5_tfdisclinum ;
   private String AV63TFDisCliNum ;
   private String AV87Pedidos_dis__wwds_6_tfdisclinum_sel ;
   private String AV64TFDisCliNum_Sel ;
   private String AV88Pedidos_dis__wwds_7_tfdisenccli ;
   private String AV65TFDisEncCli ;
   private String AV89Pedidos_dis__wwds_8_tfdisenccli_sel ;
   private String AV66TFDisEncCli_Sel ;
   private String AV97Pedidos_dis__wwds_16_tfclinom ;
   private String AV45TFCliNom ;
   private String AV98Pedidos_dis__wwds_17_tfclinom_sel ;
   private String AV46TFCliNom_Sel ;
   private String AV99Pedidos_dis__wwds_18_tfdisartcod ;
   private String AV47TFDisArtCod ;
   private String AV100Pedidos_dis__wwds_19_tfdisartcod_sel ;
   private String AV48TFDisArtCod_Sel ;
   private String AV101Pedidos_dis__wwds_20_tfdisartdsc ;
   private String AV49TFDisArtDsc ;
   private String AV102Pedidos_dis__wwds_21_tfdisartdsc_sel ;
   private String AV50TFDisArtDsc_Sel ;
   private String AV103Pedidos_dis__wwds_22_tfdiscolnom ;
   private String AV51TFDisColNom ;
   private String AV104Pedidos_dis__wwds_23_tfdiscolnom_sel ;
   private String AV52TFDisColNom_Sel ;
   private String AV109Pedidos_dis__wwds_28_tfdisnomcli ;
   private String AV67TFDisNomCli ;
   private String AV110Pedidos_dis__wwds_29_tfdisnomcli_sel ;
   private String AV68TFDisNomCli_Sel ;
   private String AV113Pedidos_dis__wwds_32_tfmaqcoddis ;
   private String AV71TFMaqCodDis ;
   private String AV114Pedidos_dis__wwds_33_tfmaqcoddis_sel ;
   private String AV72TFMaqCodDis_Sel ;
   private String AV119Pedidos_dis__wwds_38_tfdisunimed ;
   private String AV77TFDisUniMed ;
   private String AV120Pedidos_dis__wwds_39_tfdisunimed_sel ;
   private String AV78TFDisUniMed_Sel ;
   private String scmdbuf ;
   private String lV83Pedidos_dis__wwds_2_tfdisusrcod ;
   private String lV86Pedidos_dis__wwds_5_tfdisclinum ;
   private String lV88Pedidos_dis__wwds_7_tfdisenccli ;
   private String lV97Pedidos_dis__wwds_16_tfclinom ;
   private String lV99Pedidos_dis__wwds_18_tfdisartcod ;
   private String lV101Pedidos_dis__wwds_20_tfdisartdsc ;
   private String lV103Pedidos_dis__wwds_22_tfdiscolnom ;
   private String lV109Pedidos_dis__wwds_28_tfdisnomcli ;
   private String lV113Pedidos_dis__wwds_32_tfmaqcoddis ;
   private String lV119Pedidos_dis__wwds_38_tfdisunimed ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date AV92Pedidos_dis__wwds_11_tfdisfeccli ;
   private java.util.Date AV36TFDisFecCli ;
   private java.util.Date AV93Pedidos_dis__wwds_12_tfdisfec ;
   private java.util.Date AV38TFDisFec ;
   private java.util.Date AV94Pedidos_dis__wwds_13_tfdisfecent ;
   private java.util.Date AV41TFDisFecEnt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV61IsAuthorizedDisCliNum ;
   private boolean AV62IsAuthorizedDisEncCli ;
   private boolean AV29OrderedDsc ;
   private boolean n1122MaqCodDis ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean Cond_result ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV57TFDisEst_SelsJson ;
   private String AV11Filename ;
   private String AV82Pedidos_dis__wwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV82Pedidos_dis__wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV85Pedidos_dis__wwds_4_tfdisest_sels ;
   private GXSimpleCollection<Byte> AV58TFDisEst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09VG2_A392DisUniMed ;
   private java.math.BigDecimal[] P09VG2_A375DisNumUni ;
   private short[] P09VG2_A374DisNumPie ;
   private String[] P09VG2_A1122MaqCodDis ;
   private boolean[] P09VG2_n1122MaqCodDis ;
   private int[] P09VG2_A1196DisNumCli ;
   private String[] P09VG2_A1195DisNomCli ;
   private byte[] P09VG2_A390DisTipCol ;
   private boolean[] P09VG2_n390DisTipCol ;
   private int[] P09VG2_A363DisColNum ;
   private boolean[] P09VG2_n363DisColNum ;
   private String[] P09VG2_A362DisColNom ;
   private boolean[] P09VG2_n362DisColNom ;
   private String[] P09VG2_A337DisArtDsc ;
   private String[] P09VG2_A335DisArtCod ;
   private String[] P09VG2_A279CliNom ;
   private int[] P09VG2_A252CliCod ;
   private java.util.Date[] P09VG2_A371DisFecEnt ;
   private java.util.Date[] P09VG2_A369DisFec ;
   private java.util.Date[] P09VG2_A370DisFecCli ;
   private int[] P09VG2_A361DisCod ;
   private String[] P09VG2_A4813DisEncCli ;
   private String[] P09VG2_A360DisCliNum ;
   private String[] P09VG2_A4348DisUsrCod ;
   private byte[] P09VG2_A367DisEst ;
   private String[] P09VG2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class dis__wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09VG2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV85Pedidos_dis__wwds_4_tfdisest_sels ,
                                          String AV84Pedidos_dis__wwds_3_tfdisusrcod_sel ,
                                          String AV83Pedidos_dis__wwds_2_tfdisusrcod ,
                                          int AV85Pedidos_dis__wwds_4_tfdisest_sels_size ,
                                          String AV87Pedidos_dis__wwds_6_tfdisclinum_sel ,
                                          String AV86Pedidos_dis__wwds_5_tfdisclinum ,
                                          String AV89Pedidos_dis__wwds_8_tfdisenccli_sel ,
                                          String AV88Pedidos_dis__wwds_7_tfdisenccli ,
                                          int AV90Pedidos_dis__wwds_9_tfdiscod ,
                                          int AV91Pedidos_dis__wwds_10_tfdiscod_to ,
                                          java.util.Date AV92Pedidos_dis__wwds_11_tfdisfeccli ,
                                          java.util.Date AV93Pedidos_dis__wwds_12_tfdisfec ,
                                          java.util.Date AV94Pedidos_dis__wwds_13_tfdisfecent ,
                                          int AV95Pedidos_dis__wwds_14_tfclicod ,
                                          int AV96Pedidos_dis__wwds_15_tfclicod_to ,
                                          String AV98Pedidos_dis__wwds_17_tfclinom_sel ,
                                          String AV97Pedidos_dis__wwds_16_tfclinom ,
                                          String AV100Pedidos_dis__wwds_19_tfdisartcod_sel ,
                                          String AV99Pedidos_dis__wwds_18_tfdisartcod ,
                                          String AV102Pedidos_dis__wwds_21_tfdisartdsc_sel ,
                                          String AV101Pedidos_dis__wwds_20_tfdisartdsc ,
                                          String AV104Pedidos_dis__wwds_23_tfdiscolnom_sel ,
                                          String AV103Pedidos_dis__wwds_22_tfdiscolnom ,
                                          int AV105Pedidos_dis__wwds_24_tfdiscolnum ,
                                          int AV106Pedidos_dis__wwds_25_tfdiscolnum_to ,
                                          byte AV107Pedidos_dis__wwds_26_tfdistipcol ,
                                          byte AV108Pedidos_dis__wwds_27_tfdistipcol_to ,
                                          String AV110Pedidos_dis__wwds_29_tfdisnomcli_sel ,
                                          String AV109Pedidos_dis__wwds_28_tfdisnomcli ,
                                          int AV111Pedidos_dis__wwds_30_tfdisnumcli ,
                                          int AV112Pedidos_dis__wwds_31_tfdisnumcli_to ,
                                          String AV114Pedidos_dis__wwds_33_tfmaqcoddis_sel ,
                                          String AV113Pedidos_dis__wwds_32_tfmaqcoddis ,
                                          short AV115Pedidos_dis__wwds_34_tfdisnumpie ,
                                          short AV116Pedidos_dis__wwds_35_tfdisnumpie_to ,
                                          java.math.BigDecimal AV117Pedidos_dis__wwds_36_tfdisnumuni ,
                                          java.math.BigDecimal AV118Pedidos_dis__wwds_37_tfdisnumuni_to ,
                                          String AV120Pedidos_dis__wwds_39_tfdisunimed_sel ,
                                          String AV119Pedidos_dis__wwds_38_tfdisunimed ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
                                          int A361DisCod ,
                                          java.util.Date A370DisFecCli ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A371DisFecEnt ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A335DisArtCod ,
                                          String A337DisArtDsc ,
                                          String A362DisColNom ,
                                          int A363DisColNum ,
                                          byte A390DisTipCol ,
                                          String A1195DisNomCli ,
                                          int A1196DisNumCli ,
                                          String A1122MaqCodDis ,
                                          short A374DisNumPie ,
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV82Pedidos_dis__wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[37];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.DisUniMed, T1.DisNumUni, T1.DisNumPie, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom, T1.DisArtDsc, T1.DisArtCod," ;
      scmdbuf += " T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisFec, T1.DisFecCli, T1.DisCod, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst, T1.EmprCod FROM (TXPDISPOS T1 INNER" ;
      scmdbuf += " JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV84Pedidos_dis__wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV83Pedidos_dis__wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Pedidos_dis__wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( AV85Pedidos_dis__wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV85Pedidos_dis__wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV87Pedidos_dis__wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV86Pedidos_dis__wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Pedidos_dis__wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Pedidos_dis__wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV88Pedidos_dis__wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Pedidos_dis__wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! (0==AV90Pedidos_dis__wwds_9_tfdiscod) )
      {
         addWhere(sWhereString, "(T1.DisCod >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! (0==AV91Pedidos_dis__wwds_10_tfdiscod_to) )
      {
         addWhere(sWhereString, "(T1.DisCod <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Pedidos_dis__wwds_11_tfdisfeccli)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93Pedidos_dis__wwds_12_tfdisfec)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94Pedidos_dis__wwds_13_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (0==AV95Pedidos_dis__wwds_14_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( ! (0==AV96Pedidos_dis__wwds_15_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Pedidos_dis__wwds_17_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV97Pedidos_dis__wwds_16_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Pedidos_dis__wwds_17_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Pedidos_dis__wwds_19_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV99Pedidos_dis__wwds_18_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Pedidos_dis__wwds_19_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Pedidos_dis__wwds_21_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV101Pedidos_dis__wwds_20_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Pedidos_dis__wwds_21_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Pedidos_dis__wwds_23_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV103Pedidos_dis__wwds_22_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Pedidos_dis__wwds_23_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV105Pedidos_dis__wwds_24_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( ! (0==AV106Pedidos_dis__wwds_25_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (0==AV107Pedidos_dis__wwds_26_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis__wwds_27_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Pedidos_dis__wwds_29_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV109Pedidos_dis__wwds_28_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Pedidos_dis__wwds_29_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (0==AV111Pedidos_dis__wwds_30_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (0==AV112Pedidos_dis__wwds_31_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Pedidos_dis__wwds_33_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV113Pedidos_dis__wwds_32_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Pedidos_dis__wwds_33_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (0==AV115Pedidos_dis__wwds_34_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV116Pedidos_dis__wwds_35_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidos_dis__wwds_36_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Pedidos_dis__wwds_37_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Pedidos_dis__wwds_39_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV119Pedidos_dis__wwds_38_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Pedidos_dis__wwds_39_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV28OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.DisFec DESC, T1.DisCod DESC, T1.DisEst" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUsrCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEst" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEst DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCliNum" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCliNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisEncCli" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisEncCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecCli" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFec" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisFecEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtCod" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNom" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisColNum" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisTipCol" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisTipCol DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNomCli" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumCli" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCodDis DESC" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumPie" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumPie DESC" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumUni" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
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
                  return conditional_P09VG2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).shortValue() , ((Number) dynConstraints[35]).shortValue() , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (java.util.Date)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , ((Number) dynConstraints[55]).intValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (java.math.BigDecimal)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , ((Boolean) dynConstraints[61]).booleanValue() , (String)dynConstraints[62] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09VG2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((String[]) buf[14])[0] = rslt.getString(11, 16);
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(16);
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((String[]) buf[21])[0] = rslt.getString(18, 20);
               ((String[]) buf[22])[0] = rslt.getString(19, 8);
               ((String[]) buf[23])[0] = rslt.getString(20, 8);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 3);
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
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[68]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               return;
      }
   }

}

