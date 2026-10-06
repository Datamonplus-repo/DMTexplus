package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class dis___wwexportcsv_impl extends GXWebProcedure
{
   public dis___wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      gxfirstwebparm = httpContext.GetFirstPar( "DisCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV82DisCod = (int)(GXutil.lval( gxfirstwebparm)) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV83DisFeccliFrom = localUtil.parseDateParm( httpContext.GetPar( "DisFeccliFrom")) ;
            AV84DisFecclito = localUtil.parseDateParm( httpContext.GetPar( "DisFecclito")) ;
            AV80DisFecFrom = localUtil.parseDateParm( httpContext.GetPar( "DisFecFrom")) ;
            AV81DisFecto = localUtil.parseDateParm( httpContext.GetPar( "DisFecto")) ;
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
      AV11Filename = "./PrivateTempStorage/" + "Dis___WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Pedidos.Dis___WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Pedidos.Dis___WWColumnsSelector") ;
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
      if ( AV31IsAuthorizedDisCliNum )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ped. Cli.", "") : "") ;
      }
      if ( AV32IsAuthorizedDisEncCli )
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV88Pedidos_dis___wwds_1_filterfulltext = AV30FilterFullText ;
      AV89Pedidos_dis___wwds_2_tfdisusrcod = AV36TFDisUsrCod ;
      AV90Pedidos_dis___wwds_3_tfdisusrcod_sel = AV37TFDisUsrCod_Sel ;
      AV91Pedidos_dis___wwds_4_tfdisest_sels = AV39TFDisEst_Sels ;
      AV92Pedidos_dis___wwds_5_tfdisclinum = AV40TFDisCliNum ;
      AV93Pedidos_dis___wwds_6_tfdisclinum_sel = AV41TFDisCliNum_Sel ;
      AV94Pedidos_dis___wwds_7_tfdisenccli = AV42TFDisEncCli ;
      AV95Pedidos_dis___wwds_8_tfdisenccli_sel = AV43TFDisEncCli_Sel ;
      AV96Pedidos_dis___wwds_9_tfdisfecent = AV50TFDisFecEnt ;
      AV97Pedidos_dis___wwds_10_tfdisfecent_to = AV51TFDisFecEnt_To ;
      AV98Pedidos_dis___wwds_11_tfclicod = AV52TFCliCod ;
      AV99Pedidos_dis___wwds_12_tfclicod_to = AV53TFCliCod_To ;
      AV100Pedidos_dis___wwds_13_tfclinom = AV54TFCliNom ;
      AV101Pedidos_dis___wwds_14_tfclinom_sel = AV55TFCliNom_Sel ;
      AV102Pedidos_dis___wwds_15_tfdisartcod = AV56TFDisArtCod ;
      AV103Pedidos_dis___wwds_16_tfdisartcod_sel = AV57TFDisArtCod_Sel ;
      AV104Pedidos_dis___wwds_17_tfdisartdsc = AV58TFDisArtDsc ;
      AV105Pedidos_dis___wwds_18_tfdisartdsc_sel = AV59TFDisArtDsc_Sel ;
      AV106Pedidos_dis___wwds_19_tfdiscolnom = AV60TFDisColNom ;
      AV107Pedidos_dis___wwds_20_tfdiscolnom_sel = AV61TFDisColNom_Sel ;
      AV108Pedidos_dis___wwds_21_tfdiscolnum = AV62TFDisColNum ;
      AV109Pedidos_dis___wwds_22_tfdiscolnum_to = AV63TFDisColNum_To ;
      AV110Pedidos_dis___wwds_23_tfdistipcol = AV64TFDisTipCol ;
      AV111Pedidos_dis___wwds_24_tfdistipcol_to = AV65TFDisTipCol_To ;
      AV112Pedidos_dis___wwds_25_tfdisnomcli = AV66TFDisNomCli ;
      AV113Pedidos_dis___wwds_26_tfdisnomcli_sel = AV67TFDisNomCli_Sel ;
      AV114Pedidos_dis___wwds_27_tfdisnumcli = AV68TFDisNumCli ;
      AV115Pedidos_dis___wwds_28_tfdisnumcli_to = AV69TFDisNumCli_To ;
      AV116Pedidos_dis___wwds_29_tfmaqcoddis = AV70TFMaqCodDis ;
      AV117Pedidos_dis___wwds_30_tfmaqcoddis_sel = AV71TFMaqCodDis_Sel ;
      AV118Pedidos_dis___wwds_31_tfdisnumuni = AV74TFDisNumUni ;
      AV119Pedidos_dis___wwds_32_tfdisnumuni_to = AV75TFDisNumUni_To ;
      AV120Pedidos_dis___wwds_33_tfdisunimed = AV76TFDisUniMed ;
      AV121Pedidos_dis___wwds_34_tfdisunimed_sel = AV77TFDisUniMed_Sel ;
      AV122Pedidos_dis___wwds_35_tfdisnumpie = AV72TFDisNumPie ;
      AV123Pedidos_dis___wwds_36_tfdisnumpie_to = AV73TFDisNumPie_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A367DisEst) ,
                                           AV91Pedidos_dis___wwds_4_tfdisest_sels ,
                                           AV90Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                           AV89Pedidos_dis___wwds_2_tfdisusrcod ,
                                           Integer.valueOf(AV91Pedidos_dis___wwds_4_tfdisest_sels.size()) ,
                                           AV93Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                           AV92Pedidos_dis___wwds_5_tfdisclinum ,
                                           AV95Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                           AV94Pedidos_dis___wwds_7_tfdisenccli ,
                                           AV96Pedidos_dis___wwds_9_tfdisfecent ,
                                           AV97Pedidos_dis___wwds_10_tfdisfecent_to ,
                                           Integer.valueOf(AV98Pedidos_dis___wwds_11_tfclicod) ,
                                           Integer.valueOf(AV99Pedidos_dis___wwds_12_tfclicod_to) ,
                                           AV101Pedidos_dis___wwds_14_tfclinom_sel ,
                                           AV100Pedidos_dis___wwds_13_tfclinom ,
                                           AV103Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                           AV102Pedidos_dis___wwds_15_tfdisartcod ,
                                           AV105Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                           AV104Pedidos_dis___wwds_17_tfdisartdsc ,
                                           AV107Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                           AV106Pedidos_dis___wwds_19_tfdiscolnom ,
                                           Integer.valueOf(AV108Pedidos_dis___wwds_21_tfdiscolnum) ,
                                           Integer.valueOf(AV109Pedidos_dis___wwds_22_tfdiscolnum_to) ,
                                           Byte.valueOf(AV110Pedidos_dis___wwds_23_tfdistipcol) ,
                                           Byte.valueOf(AV111Pedidos_dis___wwds_24_tfdistipcol_to) ,
                                           AV113Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                           AV112Pedidos_dis___wwds_25_tfdisnomcli ,
                                           Integer.valueOf(AV114Pedidos_dis___wwds_27_tfdisnumcli) ,
                                           Integer.valueOf(AV115Pedidos_dis___wwds_28_tfdisnumcli_to) ,
                                           AV117Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                           AV116Pedidos_dis___wwds_29_tfmaqcoddis ,
                                           AV118Pedidos_dis___wwds_31_tfdisnumuni ,
                                           AV119Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                           AV121Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                           AV120Pedidos_dis___wwds_33_tfdisunimed ,
                                           Short.valueOf(AV122Pedidos_dis___wwds_35_tfdisnumpie) ,
                                           Short.valueOf(AV123Pedidos_dis___wwds_36_tfdisnumpie_to) ,
                                           Integer.valueOf(AV82DisCod) ,
                                           AV80DisFecFrom ,
                                           AV81DisFecto ,
                                           AV83DisFeccliFrom ,
                                           AV84DisFecclito ,
                                           A4348DisUsrCod ,
                                           A360DisCliNum ,
                                           A4813DisEncCli ,
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
                                           A375DisNumUni ,
                                           A392DisUniMed ,
                                           Short.valueOf(A374DisNumPie) ,
                                           Integer.valueOf(A361DisCod) ,
                                           A369DisFec ,
                                           A370DisFecCli ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV88Pedidos_dis___wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV89Pedidos_dis___wwds_2_tfdisusrcod = GXutil.padr( GXutil.rtrim( AV89Pedidos_dis___wwds_2_tfdisusrcod), 8, "%") ;
      lV92Pedidos_dis___wwds_5_tfdisclinum = GXutil.padr( GXutil.rtrim( AV92Pedidos_dis___wwds_5_tfdisclinum), 8, "%") ;
      lV94Pedidos_dis___wwds_7_tfdisenccli = GXutil.padr( GXutil.rtrim( AV94Pedidos_dis___wwds_7_tfdisenccli), 20, "%") ;
      lV100Pedidos_dis___wwds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV100Pedidos_dis___wwds_13_tfclinom), 30, "%") ;
      lV102Pedidos_dis___wwds_15_tfdisartcod = GXutil.padr( GXutil.rtrim( AV102Pedidos_dis___wwds_15_tfdisartcod), 16, "%") ;
      lV104Pedidos_dis___wwds_17_tfdisartdsc = GXutil.padr( GXutil.rtrim( AV104Pedidos_dis___wwds_17_tfdisartdsc), 26, "%") ;
      lV106Pedidos_dis___wwds_19_tfdiscolnom = GXutil.padr( GXutil.rtrim( AV106Pedidos_dis___wwds_19_tfdiscolnom), 13, "%") ;
      lV112Pedidos_dis___wwds_25_tfdisnomcli = GXutil.padr( GXutil.rtrim( AV112Pedidos_dis___wwds_25_tfdisnomcli), 13, "%") ;
      lV116Pedidos_dis___wwds_29_tfmaqcoddis = GXutil.padr( GXutil.rtrim( AV116Pedidos_dis___wwds_29_tfmaqcoddis), 6, "%") ;
      lV120Pedidos_dis___wwds_33_tfdisunimed = GXutil.padr( GXutil.rtrim( AV120Pedidos_dis___wwds_33_tfdisunimed), 1, "%") ;
      /* Using cursor P0A202 */
      pr_default.execute(0, new Object[] {lV89Pedidos_dis___wwds_2_tfdisusrcod, AV90Pedidos_dis___wwds_3_tfdisusrcod_sel, lV92Pedidos_dis___wwds_5_tfdisclinum, AV93Pedidos_dis___wwds_6_tfdisclinum_sel, lV94Pedidos_dis___wwds_7_tfdisenccli, AV95Pedidos_dis___wwds_8_tfdisenccli_sel, AV96Pedidos_dis___wwds_9_tfdisfecent, AV97Pedidos_dis___wwds_10_tfdisfecent_to, Integer.valueOf(AV98Pedidos_dis___wwds_11_tfclicod), Integer.valueOf(AV99Pedidos_dis___wwds_12_tfclicod_to), lV100Pedidos_dis___wwds_13_tfclinom, AV101Pedidos_dis___wwds_14_tfclinom_sel, lV102Pedidos_dis___wwds_15_tfdisartcod, AV103Pedidos_dis___wwds_16_tfdisartcod_sel, lV104Pedidos_dis___wwds_17_tfdisartdsc, AV105Pedidos_dis___wwds_18_tfdisartdsc_sel, lV106Pedidos_dis___wwds_19_tfdiscolnom, AV107Pedidos_dis___wwds_20_tfdiscolnom_sel, Integer.valueOf(AV108Pedidos_dis___wwds_21_tfdiscolnum), Integer.valueOf(AV109Pedidos_dis___wwds_22_tfdiscolnum_to), Byte.valueOf(AV110Pedidos_dis___wwds_23_tfdistipcol), Byte.valueOf(AV111Pedidos_dis___wwds_24_tfdistipcol_to), lV112Pedidos_dis___wwds_25_tfdisnomcli, AV113Pedidos_dis___wwds_26_tfdisnomcli_sel, Integer.valueOf(AV114Pedidos_dis___wwds_27_tfdisnumcli), Integer.valueOf(AV115Pedidos_dis___wwds_28_tfdisnumcli_to), lV116Pedidos_dis___wwds_29_tfmaqcoddis, AV117Pedidos_dis___wwds_30_tfmaqcoddis_sel, AV118Pedidos_dis___wwds_31_tfdisnumuni, AV119Pedidos_dis___wwds_32_tfdisnumuni_to, lV120Pedidos_dis___wwds_33_tfdisunimed, AV121Pedidos_dis___wwds_34_tfdisunimed_sel, Short.valueOf(AV122Pedidos_dis___wwds_35_tfdisnumpie), Short.valueOf(AV123Pedidos_dis___wwds_36_tfdisnumpie_to), Integer.valueOf(AV82DisCod), AV80DisFecFrom, AV81DisFecto, AV83DisFeccliFrom, AV84DisFecclito});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A370DisFecCli = P0A202_A370DisFecCli[0] ;
         A369DisFec = P0A202_A369DisFec[0] ;
         A361DisCod = P0A202_A361DisCod[0] ;
         A374DisNumPie = P0A202_A374DisNumPie[0] ;
         A392DisUniMed = P0A202_A392DisUniMed[0] ;
         A375DisNumUni = P0A202_A375DisNumUni[0] ;
         A1122MaqCodDis = P0A202_A1122MaqCodDis[0] ;
         n1122MaqCodDis = P0A202_n1122MaqCodDis[0] ;
         A1196DisNumCli = P0A202_A1196DisNumCli[0] ;
         A1195DisNomCli = P0A202_A1195DisNomCli[0] ;
         A390DisTipCol = P0A202_A390DisTipCol[0] ;
         n390DisTipCol = P0A202_n390DisTipCol[0] ;
         A363DisColNum = P0A202_A363DisColNum[0] ;
         n363DisColNum = P0A202_n363DisColNum[0] ;
         A362DisColNom = P0A202_A362DisColNom[0] ;
         n362DisColNom = P0A202_n362DisColNom[0] ;
         A337DisArtDsc = P0A202_A337DisArtDsc[0] ;
         A335DisArtCod = P0A202_A335DisArtCod[0] ;
         A279CliNom = P0A202_A279CliNom[0] ;
         A252CliCod = P0A202_A252CliCod[0] ;
         A371DisFecEnt = P0A202_A371DisFecEnt[0] ;
         A4813DisEncCli = P0A202_A4813DisEncCli[0] ;
         A360DisCliNum = P0A202_A360DisCliNum[0] ;
         A4348DisUsrCod = P0A202_A4348DisUsrCod[0] ;
         A367DisEst = P0A202_A367DisEst[0] ;
         A396EmprCod = P0A202_A396EmprCod[0] ;
         A279CliNom = P0A202_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV88Pedidos_dis___wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A4348DisUsrCod) , GXutil.padr( "%" + GXutil.upper( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en pedido", ""), "") , GXutil.padr( "%" + GXutil.lower( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 1 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "en produccion", ""), "") , GXutil.padr( "%" + GXutil.lower( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( A367DisEst == 3 ) ) || ( GXutil.like( GXutil.upper( A360DisCliNum) , GXutil.padr( "%" + GXutil.upper( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4813DisEncCli) , GXutil.padr( "%" + GXutil.upper( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A361DisCod, 8, 0) , GXutil.padr( "%" + AV88Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV88Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A335DisArtCod) , GXutil.padr( "%" + GXutil.upper( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A337DisArtDsc) , GXutil.padr( "%" + GXutil.upper( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A362DisColNom) , GXutil.padr( "%" + GXutil.upper( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A363DisColNum, 6, 0) , GXutil.padr( "%" + AV88Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A390DisTipCol, 2, 0) , GXutil.padr( "%" + AV88Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1195DisNomCli) , GXutil.padr( "%" + GXutil.upper( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1196DisNumCli, 6, 0) , GXutil.padr( "%" + AV88Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1122MaqCodDis) , GXutil.padr( "%" + GXutil.upper( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A375DisNumUni, 9, 2) , GXutil.padr( "%" + AV88Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A392DisUniMed) , GXutil.padr( "%" + GXutil.upper( AV88Pedidos_dis___wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A374DisNumPie, 4, 0) , GXutil.padr( "%" + AV88Pedidos_dis___wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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
               dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
               dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4813DisEncCli, ";", ","), GXv_char3) ;
               dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
               dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A335DisArtCod, ";", ","), GXv_char3) ;
               dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A337DisArtDsc, ";", ","), GXv_char3) ;
               dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A362DisColNom, ";", ","), GXv_char3) ;
               dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
               dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
               dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A375DisNumUni, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A392DisUniMed, ";", ","), GXv_char3) ;
               dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A374DisNumPie, 4, 0) ;
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
      dis___wwexportcsv_impl.this.GXt_int4 = GXv_int5[0] ;
      AV31IsAuthorizedDisCliNum = (boolean)(((GXt_int4==0))) ;
      GXt_int4 = (byte)(0) ;
      GXv_int5[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int5) ;
      dis___wwexportcsv_impl.this.GXt_int4 = GXv_int5[0] ;
      AV32IsAuthorizedDisEncCli = (boolean)(((GXt_int4==1))) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=Dis___WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisNumUni", "", "Unidades", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisUniMed", "", "Und.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXv_SdtWWPColumnsSelector6[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector6, "DisNumPie", "", "Piezas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector6[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Pedidos.Dis___WWColumnsSelector", GXv_char3) ;
      dis___wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Pedidos.Dis___WWGridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Pedidos.Dis___WWGridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV19Session.getValue("Pedidos.Dis___WWGridState"), null, null);
      }
      AV28OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV124GXV1 = 1 ;
      while ( AV124GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV124GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD") == 0 )
         {
            AV36TFDisUsrCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUSRCOD_SEL") == 0 )
         {
            AV37TFDisUsrCod_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISEST_SEL") == 0 )
         {
            AV38TFDisEst_SelsJson = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV39TFDisEst_Sels.fromJSonString(AV38TFDisEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM") == 0 )
         {
            AV40TFDisCliNum = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCLINUM_SEL") == 0 )
         {
            AV41TFDisCliNum_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI") == 0 )
         {
            AV42TFDisEncCli = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISENCCLI_SEL") == 0 )
         {
            AV43TFDisEncCli_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISFECENT") == 0 )
         {
            AV50TFDisFecEnt = localUtil.ctod( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV51TFDisFecEnt_To = localUtil.ctod( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV52TFCliCod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV53TFCliCod_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV54TFCliNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV55TFCliNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD") == 0 )
         {
            AV56TFDisArtCod = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTCOD_SEL") == 0 )
         {
            AV57TFDisArtCod_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC") == 0 )
         {
            AV58TFDisArtDsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISARTDSC_SEL") == 0 )
         {
            AV59TFDisArtDsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM") == 0 )
         {
            AV60TFDisColNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNOM_SEL") == 0 )
         {
            AV61TFDisColNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISCOLNUM") == 0 )
         {
            AV62TFDisColNum = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFDisColNum_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISTIPCOL") == 0 )
         {
            AV64TFDisTipCol = (byte)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFDisTipCol_To = (byte)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI") == 0 )
         {
            AV66TFDisNomCli = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNOMCLI_SEL") == 0 )
         {
            AV67TFDisNomCli_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMCLI") == 0 )
         {
            AV68TFDisNumCli = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFDisNumCli_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS") == 0 )
         {
            AV70TFMaqCodDis = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODDIS_SEL") == 0 )
         {
            AV71TFMaqCodDis_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMUNI") == 0 )
         {
            AV74TFDisNumUni = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV75TFDisNumUni_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED") == 0 )
         {
            AV76TFDisUniMed = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISUNIMED_SEL") == 0 )
         {
            AV77TFDisUniMed_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDISNUMPIE") == 0 )
         {
            AV72TFDisNumPie = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFDisNumPie_To = (short)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV124GXV1 = (int)(AV124GXV1+1) ;
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
      AV83DisFeccliFrom = GXutil.nullDate() ;
      AV84DisFecclito = GXutil.nullDate() ;
      AV80DisFecFrom = GXutil.nullDate() ;
      AV81DisFecto = GXutil.nullDate() ;
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
      AV88Pedidos_dis___wwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV89Pedidos_dis___wwds_2_tfdisusrcod = "" ;
      AV36TFDisUsrCod = "" ;
      AV90Pedidos_dis___wwds_3_tfdisusrcod_sel = "" ;
      AV37TFDisUsrCod_Sel = "" ;
      AV91Pedidos_dis___wwds_4_tfdisest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV39TFDisEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV92Pedidos_dis___wwds_5_tfdisclinum = "" ;
      AV40TFDisCliNum = "" ;
      AV93Pedidos_dis___wwds_6_tfdisclinum_sel = "" ;
      AV41TFDisCliNum_Sel = "" ;
      AV94Pedidos_dis___wwds_7_tfdisenccli = "" ;
      AV42TFDisEncCli = "" ;
      AV95Pedidos_dis___wwds_8_tfdisenccli_sel = "" ;
      AV43TFDisEncCli_Sel = "" ;
      AV96Pedidos_dis___wwds_9_tfdisfecent = GXutil.nullDate() ;
      AV50TFDisFecEnt = GXutil.nullDate() ;
      AV97Pedidos_dis___wwds_10_tfdisfecent_to = GXutil.nullDate() ;
      AV51TFDisFecEnt_To = GXutil.nullDate() ;
      AV100Pedidos_dis___wwds_13_tfclinom = "" ;
      AV54TFCliNom = "" ;
      AV101Pedidos_dis___wwds_14_tfclinom_sel = "" ;
      AV55TFCliNom_Sel = "" ;
      AV102Pedidos_dis___wwds_15_tfdisartcod = "" ;
      AV56TFDisArtCod = "" ;
      AV103Pedidos_dis___wwds_16_tfdisartcod_sel = "" ;
      AV57TFDisArtCod_Sel = "" ;
      AV104Pedidos_dis___wwds_17_tfdisartdsc = "" ;
      AV58TFDisArtDsc = "" ;
      AV105Pedidos_dis___wwds_18_tfdisartdsc_sel = "" ;
      AV59TFDisArtDsc_Sel = "" ;
      AV106Pedidos_dis___wwds_19_tfdiscolnom = "" ;
      AV60TFDisColNom = "" ;
      AV107Pedidos_dis___wwds_20_tfdiscolnom_sel = "" ;
      AV61TFDisColNom_Sel = "" ;
      AV112Pedidos_dis___wwds_25_tfdisnomcli = "" ;
      AV66TFDisNomCli = "" ;
      AV113Pedidos_dis___wwds_26_tfdisnomcli_sel = "" ;
      AV67TFDisNomCli_Sel = "" ;
      AV116Pedidos_dis___wwds_29_tfmaqcoddis = "" ;
      AV70TFMaqCodDis = "" ;
      AV117Pedidos_dis___wwds_30_tfmaqcoddis_sel = "" ;
      AV71TFMaqCodDis_Sel = "" ;
      AV118Pedidos_dis___wwds_31_tfdisnumuni = DecimalUtil.ZERO ;
      AV74TFDisNumUni = DecimalUtil.ZERO ;
      AV119Pedidos_dis___wwds_32_tfdisnumuni_to = DecimalUtil.ZERO ;
      AV75TFDisNumUni_To = DecimalUtil.ZERO ;
      AV120Pedidos_dis___wwds_33_tfdisunimed = "" ;
      AV76TFDisUniMed = "" ;
      AV121Pedidos_dis___wwds_34_tfdisunimed_sel = "" ;
      AV77TFDisUniMed_Sel = "" ;
      lV88Pedidos_dis___wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV89Pedidos_dis___wwds_2_tfdisusrcod = "" ;
      lV92Pedidos_dis___wwds_5_tfdisclinum = "" ;
      lV94Pedidos_dis___wwds_7_tfdisenccli = "" ;
      lV100Pedidos_dis___wwds_13_tfclinom = "" ;
      lV102Pedidos_dis___wwds_15_tfdisartcod = "" ;
      lV104Pedidos_dis___wwds_17_tfdisartdsc = "" ;
      lV106Pedidos_dis___wwds_19_tfdiscolnom = "" ;
      lV112Pedidos_dis___wwds_25_tfdisnomcli = "" ;
      lV116Pedidos_dis___wwds_29_tfmaqcoddis = "" ;
      lV120Pedidos_dis___wwds_33_tfdisunimed = "" ;
      P0A202_A370DisFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P0A202_A369DisFec = new java.util.Date[] {GXutil.nullDate()} ;
      P0A202_A361DisCod = new int[1] ;
      P0A202_A374DisNumPie = new short[1] ;
      P0A202_A392DisUniMed = new String[] {""} ;
      P0A202_A375DisNumUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A202_A1122MaqCodDis = new String[] {""} ;
      P0A202_n1122MaqCodDis = new boolean[] {false} ;
      P0A202_A1196DisNumCli = new int[1] ;
      P0A202_A1195DisNomCli = new String[] {""} ;
      P0A202_A390DisTipCol = new byte[1] ;
      P0A202_n390DisTipCol = new boolean[] {false} ;
      P0A202_A363DisColNum = new int[1] ;
      P0A202_n363DisColNum = new boolean[] {false} ;
      P0A202_A362DisColNom = new String[] {""} ;
      P0A202_n362DisColNom = new boolean[] {false} ;
      P0A202_A337DisArtDsc = new String[] {""} ;
      P0A202_A335DisArtCod = new String[] {""} ;
      P0A202_A279CliNom = new String[] {""} ;
      P0A202_A252CliCod = new int[1] ;
      P0A202_A371DisFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P0A202_A4813DisEncCli = new String[] {""} ;
      P0A202_A360DisCliNum = new String[] {""} ;
      P0A202_A4348DisUsrCod = new String[] {""} ;
      P0A202_A367DisEst = new byte[1] ;
      P0A202_A396EmprCod = new String[] {""} ;
      GXv_int5 = new byte[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector6 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV38TFDisEst_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.dis___wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P0A202_A370DisFecCli, P0A202_A369DisFec, P0A202_A361DisCod, P0A202_A374DisNumPie, P0A202_A392DisUniMed, P0A202_A375DisNumUni, P0A202_A1122MaqCodDis, P0A202_n1122MaqCodDis, P0A202_A1196DisNumCli, P0A202_A1195DisNomCli,
            P0A202_A390DisTipCol, P0A202_n390DisTipCol, P0A202_A363DisColNum, P0A202_n363DisColNum, P0A202_A362DisColNom, P0A202_n362DisColNom, P0A202_A337DisArtDsc, P0A202_A335DisArtCod, P0A202_A279CliNom, P0A202_A252CliCod,
            P0A202_A371DisFecEnt, P0A202_A4813DisEncCli, P0A202_A360DisCliNum, P0A202_A4348DisUsrCod, P0A202_A367DisEst, P0A202_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A367DisEst ;
   private byte A390DisTipCol ;
   private byte AV110Pedidos_dis___wwds_23_tfdistipcol ;
   private byte AV64TFDisTipCol ;
   private byte AV111Pedidos_dis___wwds_24_tfdistipcol_to ;
   private byte AV65TFDisTipCol_To ;
   private byte GXt_int4 ;
   private byte GXv_int5[] ;
   private short gxcookieaux ;
   private short A374DisNumPie ;
   private short AV122Pedidos_dis___wwds_35_tfdisnumpie ;
   private short AV72TFDisNumPie ;
   private short AV123Pedidos_dis___wwds_36_tfdisnumpie_to ;
   private short AV73TFDisNumPie_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV82DisCod ;
   private int AV13Random ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A363DisColNum ;
   private int A1196DisNumCli ;
   private int AV98Pedidos_dis___wwds_11_tfclicod ;
   private int AV52TFCliCod ;
   private int AV99Pedidos_dis___wwds_12_tfclicod_to ;
   private int AV53TFCliCod_To ;
   private int AV108Pedidos_dis___wwds_21_tfdiscolnum ;
   private int AV62TFDisColNum ;
   private int AV109Pedidos_dis___wwds_22_tfdiscolnum_to ;
   private int AV63TFDisColNum_To ;
   private int AV114Pedidos_dis___wwds_27_tfdisnumcli ;
   private int AV68TFDisNumCli ;
   private int AV115Pedidos_dis___wwds_28_tfdisnumcli_to ;
   private int AV69TFDisNumCli_To ;
   private int AV91Pedidos_dis___wwds_4_tfdisest_sels_size ;
   private int AV124GXV1 ;
   private java.math.BigDecimal A375DisNumUni ;
   private java.math.BigDecimal AV118Pedidos_dis___wwds_31_tfdisnumuni ;
   private java.math.BigDecimal AV74TFDisNumUni ;
   private java.math.BigDecimal AV119Pedidos_dis___wwds_32_tfdisnumuni_to ;
   private java.math.BigDecimal AV75TFDisNumUni_To ;
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
   private String AV89Pedidos_dis___wwds_2_tfdisusrcod ;
   private String AV36TFDisUsrCod ;
   private String AV90Pedidos_dis___wwds_3_tfdisusrcod_sel ;
   private String AV37TFDisUsrCod_Sel ;
   private String AV92Pedidos_dis___wwds_5_tfdisclinum ;
   private String AV40TFDisCliNum ;
   private String AV93Pedidos_dis___wwds_6_tfdisclinum_sel ;
   private String AV41TFDisCliNum_Sel ;
   private String AV94Pedidos_dis___wwds_7_tfdisenccli ;
   private String AV42TFDisEncCli ;
   private String AV95Pedidos_dis___wwds_8_tfdisenccli_sel ;
   private String AV43TFDisEncCli_Sel ;
   private String AV100Pedidos_dis___wwds_13_tfclinom ;
   private String AV54TFCliNom ;
   private String AV101Pedidos_dis___wwds_14_tfclinom_sel ;
   private String AV55TFCliNom_Sel ;
   private String AV102Pedidos_dis___wwds_15_tfdisartcod ;
   private String AV56TFDisArtCod ;
   private String AV103Pedidos_dis___wwds_16_tfdisartcod_sel ;
   private String AV57TFDisArtCod_Sel ;
   private String AV104Pedidos_dis___wwds_17_tfdisartdsc ;
   private String AV58TFDisArtDsc ;
   private String AV105Pedidos_dis___wwds_18_tfdisartdsc_sel ;
   private String AV59TFDisArtDsc_Sel ;
   private String AV106Pedidos_dis___wwds_19_tfdiscolnom ;
   private String AV60TFDisColNom ;
   private String AV107Pedidos_dis___wwds_20_tfdiscolnom_sel ;
   private String AV61TFDisColNom_Sel ;
   private String AV112Pedidos_dis___wwds_25_tfdisnomcli ;
   private String AV66TFDisNomCli ;
   private String AV113Pedidos_dis___wwds_26_tfdisnomcli_sel ;
   private String AV67TFDisNomCli_Sel ;
   private String AV116Pedidos_dis___wwds_29_tfmaqcoddis ;
   private String AV70TFMaqCodDis ;
   private String AV117Pedidos_dis___wwds_30_tfmaqcoddis_sel ;
   private String AV71TFMaqCodDis_Sel ;
   private String AV120Pedidos_dis___wwds_33_tfdisunimed ;
   private String AV76TFDisUniMed ;
   private String AV121Pedidos_dis___wwds_34_tfdisunimed_sel ;
   private String AV77TFDisUniMed_Sel ;
   private String scmdbuf ;
   private String lV89Pedidos_dis___wwds_2_tfdisusrcod ;
   private String lV92Pedidos_dis___wwds_5_tfdisclinum ;
   private String lV94Pedidos_dis___wwds_7_tfdisenccli ;
   private String lV100Pedidos_dis___wwds_13_tfclinom ;
   private String lV102Pedidos_dis___wwds_15_tfdisartcod ;
   private String lV104Pedidos_dis___wwds_17_tfdisartdsc ;
   private String lV106Pedidos_dis___wwds_19_tfdiscolnom ;
   private String lV112Pedidos_dis___wwds_25_tfdisnomcli ;
   private String lV116Pedidos_dis___wwds_29_tfmaqcoddis ;
   private String lV120Pedidos_dis___wwds_33_tfdisunimed ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date AV83DisFeccliFrom ;
   private java.util.Date AV84DisFecclito ;
   private java.util.Date AV80DisFecFrom ;
   private java.util.Date AV81DisFecto ;
   private java.util.Date A370DisFecCli ;
   private java.util.Date A369DisFec ;
   private java.util.Date A371DisFecEnt ;
   private java.util.Date AV96Pedidos_dis___wwds_9_tfdisfecent ;
   private java.util.Date AV50TFDisFecEnt ;
   private java.util.Date AV97Pedidos_dis___wwds_10_tfdisfecent_to ;
   private java.util.Date AV51TFDisFecEnt_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV31IsAuthorizedDisCliNum ;
   private boolean AV32IsAuthorizedDisEncCli ;
   private boolean AV29OrderedDsc ;
   private boolean n1122MaqCodDis ;
   private boolean n390DisTipCol ;
   private boolean n363DisColNum ;
   private boolean n362DisColNom ;
   private boolean Cond_result ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV38TFDisEst_SelsJson ;
   private String AV11Filename ;
   private String AV88Pedidos_dis___wwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV88Pedidos_dis___wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private GXSimpleCollection<Byte> AV91Pedidos_dis___wwds_4_tfdisest_sels ;
   private GXSimpleCollection<Byte> AV39TFDisEst_Sels ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P0A202_A370DisFecCli ;
   private java.util.Date[] P0A202_A369DisFec ;
   private int[] P0A202_A361DisCod ;
   private short[] P0A202_A374DisNumPie ;
   private String[] P0A202_A392DisUniMed ;
   private java.math.BigDecimal[] P0A202_A375DisNumUni ;
   private String[] P0A202_A1122MaqCodDis ;
   private boolean[] P0A202_n1122MaqCodDis ;
   private int[] P0A202_A1196DisNumCli ;
   private String[] P0A202_A1195DisNomCli ;
   private byte[] P0A202_A390DisTipCol ;
   private boolean[] P0A202_n390DisTipCol ;
   private int[] P0A202_A363DisColNum ;
   private boolean[] P0A202_n363DisColNum ;
   private String[] P0A202_A362DisColNom ;
   private boolean[] P0A202_n362DisColNom ;
   private String[] P0A202_A337DisArtDsc ;
   private String[] P0A202_A335DisArtCod ;
   private String[] P0A202_A279CliNom ;
   private int[] P0A202_A252CliCod ;
   private java.util.Date[] P0A202_A371DisFecEnt ;
   private String[] P0A202_A4813DisEncCli ;
   private String[] P0A202_A360DisCliNum ;
   private String[] P0A202_A4348DisUsrCod ;
   private byte[] P0A202_A367DisEst ;
   private String[] P0A202_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
}

final  class dis___wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0A202( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A367DisEst ,
                                          GXSimpleCollection<Byte> AV91Pedidos_dis___wwds_4_tfdisest_sels ,
                                          String AV90Pedidos_dis___wwds_3_tfdisusrcod_sel ,
                                          String AV89Pedidos_dis___wwds_2_tfdisusrcod ,
                                          int AV91Pedidos_dis___wwds_4_tfdisest_sels_size ,
                                          String AV93Pedidos_dis___wwds_6_tfdisclinum_sel ,
                                          String AV92Pedidos_dis___wwds_5_tfdisclinum ,
                                          String AV95Pedidos_dis___wwds_8_tfdisenccli_sel ,
                                          String AV94Pedidos_dis___wwds_7_tfdisenccli ,
                                          java.util.Date AV96Pedidos_dis___wwds_9_tfdisfecent ,
                                          java.util.Date AV97Pedidos_dis___wwds_10_tfdisfecent_to ,
                                          int AV98Pedidos_dis___wwds_11_tfclicod ,
                                          int AV99Pedidos_dis___wwds_12_tfclicod_to ,
                                          String AV101Pedidos_dis___wwds_14_tfclinom_sel ,
                                          String AV100Pedidos_dis___wwds_13_tfclinom ,
                                          String AV103Pedidos_dis___wwds_16_tfdisartcod_sel ,
                                          String AV102Pedidos_dis___wwds_15_tfdisartcod ,
                                          String AV105Pedidos_dis___wwds_18_tfdisartdsc_sel ,
                                          String AV104Pedidos_dis___wwds_17_tfdisartdsc ,
                                          String AV107Pedidos_dis___wwds_20_tfdiscolnom_sel ,
                                          String AV106Pedidos_dis___wwds_19_tfdiscolnom ,
                                          int AV108Pedidos_dis___wwds_21_tfdiscolnum ,
                                          int AV109Pedidos_dis___wwds_22_tfdiscolnum_to ,
                                          byte AV110Pedidos_dis___wwds_23_tfdistipcol ,
                                          byte AV111Pedidos_dis___wwds_24_tfdistipcol_to ,
                                          String AV113Pedidos_dis___wwds_26_tfdisnomcli_sel ,
                                          String AV112Pedidos_dis___wwds_25_tfdisnomcli ,
                                          int AV114Pedidos_dis___wwds_27_tfdisnumcli ,
                                          int AV115Pedidos_dis___wwds_28_tfdisnumcli_to ,
                                          String AV117Pedidos_dis___wwds_30_tfmaqcoddis_sel ,
                                          String AV116Pedidos_dis___wwds_29_tfmaqcoddis ,
                                          java.math.BigDecimal AV118Pedidos_dis___wwds_31_tfdisnumuni ,
                                          java.math.BigDecimal AV119Pedidos_dis___wwds_32_tfdisnumuni_to ,
                                          String AV121Pedidos_dis___wwds_34_tfdisunimed_sel ,
                                          String AV120Pedidos_dis___wwds_33_tfdisunimed ,
                                          short AV122Pedidos_dis___wwds_35_tfdisnumpie ,
                                          short AV123Pedidos_dis___wwds_36_tfdisnumpie_to ,
                                          int AV82DisCod ,
                                          java.util.Date AV80DisFecFrom ,
                                          java.util.Date AV81DisFecto ,
                                          java.util.Date AV83DisFeccliFrom ,
                                          java.util.Date AV84DisFecclito ,
                                          String A4348DisUsrCod ,
                                          String A360DisCliNum ,
                                          String A4813DisEncCli ,
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
                                          java.math.BigDecimal A375DisNumUni ,
                                          String A392DisUniMed ,
                                          short A374DisNumPie ,
                                          int A361DisCod ,
                                          java.util.Date A369DisFec ,
                                          java.util.Date A370DisFecCli ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV88Pedidos_dis___wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[39];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T1.DisFecCli, T1.DisFec, T1.DisCod, T1.DisNumPie, T1.DisUniMed, T1.DisNumUni, T1.MaqCodDis, T1.DisNumCli, T1.DisNomCli, T1.DisTipCol, T1.DisColNum, T1.DisColNom," ;
      scmdbuf += " T1.DisArtDsc, T1.DisArtCod, T2.CliNom, T1.CliCod, T1.DisFecEnt, T1.DisEncCli, T1.DisCliNum, T1.DisUsrCod, T1.DisEst, T1.EmprCod FROM (TXPDISPOS T1 INNER JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV90Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) && ( ! (GXutil.strcmp("", AV89Pedidos_dis___wwds_2_tfdisusrcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUsrCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Pedidos_dis___wwds_3_tfdisusrcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUsrCod = ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( AV91Pedidos_dis___wwds_4_tfdisest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV91Pedidos_dis___wwds_4_tfdisest_sels, "T1.DisEst IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV93Pedidos_dis___wwds_6_tfdisclinum_sel)==0) && ( ! (GXutil.strcmp("", AV92Pedidos_dis___wwds_5_tfdisclinum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisCliNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Pedidos_dis___wwds_6_tfdisclinum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisCliNum = ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Pedidos_dis___wwds_8_tfdisenccli_sel)==0) && ( ! (GXutil.strcmp("", AV94Pedidos_dis___wwds_7_tfdisenccli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisEncCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Pedidos_dis___wwds_8_tfdisenccli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisEncCli = ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Pedidos_dis___wwds_9_tfdisfecent)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt >= ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Pedidos_dis___wwds_10_tfdisfecent_to)) )
      {
         addWhere(sWhereString, "(T1.DisFecEnt <= ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( ! (0==AV98Pedidos_dis___wwds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( ! (0==AV99Pedidos_dis___wwds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Pedidos_dis___wwds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV100Pedidos_dis___wwds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Pedidos_dis___wwds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Pedidos_dis___wwds_16_tfdisartcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Pedidos_dis___wwds_15_tfdisartcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Pedidos_dis___wwds_16_tfdisartcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtCod = ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Pedidos_dis___wwds_17_tfdisartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Pedidos_dis___wwds_18_tfdisartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisArtDsc = ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) && ( ! (GXutil.strcmp("", AV106Pedidos_dis___wwds_19_tfdiscolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Pedidos_dis___wwds_20_tfdiscolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisColNom = ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV108Pedidos_dis___wwds_21_tfdiscolnum) )
      {
         addWhere(sWhereString, "(T1.DisColNum >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_dis___wwds_22_tfdiscolnum_to) )
      {
         addWhere(sWhereString, "(T1.DisColNum <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidos_dis___wwds_23_tfdistipcol) )
      {
         addWhere(sWhereString, "(T1.DisTipCol >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV111Pedidos_dis___wwds_24_tfdistipcol_to) )
      {
         addWhere(sWhereString, "(T1.DisTipCol <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV113Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV112Pedidos_dis___wwds_25_tfdisnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV113Pedidos_dis___wwds_26_tfdisnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisNomCli = ?)");
      }
      else
      {
         GXv_int8[23] = (byte)(1) ;
      }
      if ( ! (0==AV114Pedidos_dis___wwds_27_tfdisnumcli) )
      {
         addWhere(sWhereString, "(T1.DisNumCli >= ?)");
      }
      else
      {
         GXv_int8[24] = (byte)(1) ;
      }
      if ( ! (0==AV115Pedidos_dis___wwds_28_tfdisnumcli_to) )
      {
         addWhere(sWhereString, "(T1.DisNumCli <= ?)");
      }
      else
      {
         GXv_int8[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) && ( ! (GXutil.strcmp("", AV116Pedidos_dis___wwds_29_tfmaqcoddis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodDis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Pedidos_dis___wwds_30_tfmaqcoddis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodDis = ?)");
      }
      else
      {
         GXv_int8[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Pedidos_dis___wwds_31_tfdisnumuni)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni >= ?)");
      }
      else
      {
         GXv_int8[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Pedidos_dis___wwds_32_tfdisnumuni_to)==0) )
      {
         addWhere(sWhereString, "(T1.DisNumUni <= ?)");
      }
      else
      {
         GXv_int8[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Pedidos_dis___wwds_34_tfdisunimed_sel)==0) && ( ! (GXutil.strcmp("", AV120Pedidos_dis___wwds_33_tfdisunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.DisUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int8[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Pedidos_dis___wwds_34_tfdisunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T1.DisUniMed = ?)");
      }
      else
      {
         GXv_int8[31] = (byte)(1) ;
      }
      if ( ! (0==AV122Pedidos_dis___wwds_35_tfdisnumpie) )
      {
         addWhere(sWhereString, "(T1.DisNumPie >= ?)");
      }
      else
      {
         GXv_int8[32] = (byte)(1) ;
      }
      if ( ! (0==AV123Pedidos_dis___wwds_36_tfdisnumpie_to) )
      {
         addWhere(sWhereString, "(T1.DisNumPie <= ?)");
      }
      else
      {
         GXv_int8[33] = (byte)(1) ;
      }
      if ( ! (0==AV82DisCod) )
      {
         addWhere(sWhereString, "(T1.DisCod = ?)");
      }
      else
      {
         GXv_int8[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80DisFecFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFec >= ?)");
      }
      else
      {
         GXv_int8[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81DisFecto)) )
      {
         addWhere(sWhereString, "(T1.DisFec <= ?)");
      }
      else
      {
         GXv_int8[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV83DisFeccliFrom)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli >= ?)");
      }
      else
      {
         GXv_int8[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84DisFecclito)) )
      {
         addWhere(sWhereString, "(T1.DisFecCli <= ?)");
      }
      else
      {
         GXv_int8[38] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.DisNumUni" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisUniMed" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisUniMed DESC" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DisNumPie" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DisNumPie DESC" ;
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
                  return conditional_P0A202(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).shortValue() , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).intValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() , (String)dynConstraints[55] , (java.math.BigDecimal)dynConstraints[56] , (String)dynConstraints[57] , ((Number) dynConstraints[58]).shortValue() , ((Number) dynConstraints[59]).intValue() , (java.util.Date)dynConstraints[60] , (java.util.Date)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A202", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 26);
               ((String[]) buf[17])[0] = rslt.getString(14, 16);
               ((String[]) buf[18])[0] = rslt.getString(15, 30);
               ((int[]) buf[19])[0] = rslt.getInt(16);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(17);
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
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 6);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 6);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[71]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[74]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[75]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[76]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[77]);
               }
               return;
      }
   }

}

