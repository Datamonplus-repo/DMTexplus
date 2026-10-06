package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwcnsprodexportcsv_impl extends GXWebProcedure
{
   public webwcnsprodexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebWCnsProdExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebWCnsProdColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WebWCnsProdColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N° Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acc?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "S=Bar.Agrupada N=No Agrupada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disp Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Prev Ent", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Obs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero del Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "St", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ult fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Sig Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Doc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos Sal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros Sal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas Sal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Exportacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Marca", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Partida", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Enc Cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "4 decimales", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+35)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Gots", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+36)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Grs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+37)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ocs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+38)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rcs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+39)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Oeko", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+40)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acc?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+41)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Marca", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+42)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Macro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+43)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase Ult", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+44)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Desc Fase", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV153Webwcnsprodds_1_barnhdr = AV125BarNHdr ;
      AV154Webwcnsprodds_2_clinom = AV95CliNom ;
      AV155Webwcnsprodds_3_barfecgen = AV90BarFecGen ;
      AV156Webwcnsprodds_4_barfecgen_to = AV91BarFecGen_To ;
      AV157Webwcnsprodds_5_barenccli = AV53BarEncCli ;
      AV158Webwcnsprodds_6_barser = AV120BarSer ;
      AV159Webwcnsprodds_7_barcolnom = AV122BarColNom ;
      AV160Webwcnsprodds_8_barsit = AV92BarSit ;
      AV161Webwcnsprodds_9_barsit_to = AV93BarSit_To ;
      AV162Webwcnsprodds_10_tfclicod = AV54TFCliCod ;
      AV163Webwcnsprodds_11_tfclicod_to = AV55TFCliCod_To ;
      AV164Webwcnsprodds_12_tfclinom = AV56TFCliNom ;
      AV165Webwcnsprodds_13_tfclinom_sel = AV57TFCliNom_Sel ;
      AV166Webwcnsprodds_14_tfbarnhdr = AV49TFBarNHdr ;
      AV167Webwcnsprodds_15_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV168Webwcnsprodds_16_tfbaragrest = AV58TFBarAgrEst ;
      AV169Webwcnsprodds_17_tfbaragrest_sel = AV59TFBarAgrEst_Sel ;
      AV170Webwcnsprodds_18_tfbarser = AV60TFBarSer ;
      AV171Webwcnsprodds_19_tfbarser_sel = AV61TFBarSer_Sel ;
      AV172Webwcnsprodds_20_tfbarserdsc = AV62TFBarSerDsc ;
      AV173Webwcnsprodds_21_tfbarserdsc_sel = AV63TFBarSerDsc_Sel ;
      AV174Webwcnsprodds_22_tfbarfecgen = AV64TFBarFecGen ;
      AV175Webwcnsprodds_23_tfbarfecent = AV66TFBarFecEnt ;
      AV176Webwcnsprodds_24_tfbarcolnom = AV68TFBarColNom ;
      AV177Webwcnsprodds_25_tfbarcolnom_sel = AV69TFBarColNom_Sel ;
      AV178Webwcnsprodds_26_tfbarcolnum = AV70TFBarColNum ;
      AV179Webwcnsprodds_27_tfbarcolnum_to = AV71TFBarColNum_To ;
      AV180Webwcnsprodds_28_tfbarnomcli = AV72TFBarNomCli ;
      AV181Webwcnsprodds_29_tfbarnomcli_sel = AV73TFBarNomCli_Sel ;
      AV182Webwcnsprodds_30_tfbarnumcli = AV74TFBarNumCli ;
      AV183Webwcnsprodds_31_tfbarnumcli_to = AV75TFBarNumCli_To ;
      AV184Webwcnsprodds_32_tfbarkgm = AV76TFBarKgm ;
      AV185Webwcnsprodds_33_tfbarkgm_to = AV77TFBarKgm_To ;
      AV186Webwcnsprodds_34_tfbarmtr = AV78TFBarMtr ;
      AV187Webwcnsprodds_35_tfbarmtr_to = AV79TFBarMtr_To ;
      AV188Webwcnsprodds_36_tfbarpie = AV80TFBarPie ;
      AV189Webwcnsprodds_37_tfbarpie_to = AV81TFBarPie_To ;
      AV190Webwcnsprodds_38_tfbarsit = AV82TFBarSit ;
      AV191Webwcnsprodds_39_tfbarsit_to = AV83TFBarSit_To ;
      AV192Webwcnsprodds_40_tfbarfascod = AV98TFBarFasCod ;
      AV193Webwcnsprodds_41_tfbarfascod_sel = AV99TFBarFasCod_Sel ;
      AV194Webwcnsprodds_42_tfbarfassig = AV100TFBarFasSig ;
      AV195Webwcnsprodds_43_tfbarfassig_sel = AV101TFBarFasSig_Sel ;
      AV196Webwcnsprodds_44_tfbarpart = AV114TFBarPart ;
      AV197Webwcnsprodds_45_tfbarpart_to = AV115TFBarPart_To ;
      AV198Webwcnsprodds_46_tfbaritem3 = AV116TFBarItem3 ;
      AV199Webwcnsprodds_47_tfbaritem3_sel = AV117TFBarItem3_Sel ;
      AV200Webwcnsprodds_48_tfbarrdto4 = AV127TFBarRdto4 ;
      AV201Webwcnsprodds_49_tfbarrdto4_to = AV128TFBarRdto4_To ;
      AV202Webwcnsprodds_50_tfbargots = AV129TFBarGots ;
      AV203Webwcnsprodds_51_tfbargots_sel = AV130TFBarGots_Sel ;
      AV204Webwcnsprodds_52_tfbargrs = AV131TFBarGrs ;
      AV205Webwcnsprodds_53_tfbargrs_sel = AV132TFBarGrs_Sel ;
      AV206Webwcnsprodds_54_tfbarocs = AV133TFBarOcs ;
      AV207Webwcnsprodds_55_tfbarocs_sel = AV134TFBarOcs_Sel ;
      AV208Webwcnsprodds_56_tfbarrcs = AV135TFBarRcs ;
      AV209Webwcnsprodds_57_tfbarrcs_sel = AV136TFBarRcs_Sel ;
      AV210Webwcnsprodds_58_tfbaroeko = AV137TFBarOeko ;
      AV211Webwcnsprodds_59_tfbaroeko_sel = AV138TFBarOeko_Sel ;
      AV212Webwcnsprodds_60_tfbaraccesorios_sel = AV139TFBarAccesorios_Sel ;
      AV213Webwcnsprodds_61_tfbarmarca = AV140TFBarMarca ;
      AV214Webwcnsprodds_62_tfbarmarca_sel = AV141TFBarMarca_Sel ;
      AV215Webwcnsprodds_63_tfbar_maccod = AV142TFBar_MacCod ;
      AV216Webwcnsprodds_64_tfbar_maccod_to = AV143TFBar_MacCod_To ;
      AV217Webwcnsprodds_65_tfbarfascod2 = AV144TFBarFasCod2 ;
      AV218Webwcnsprodds_66_tfbarfascod2_sel = AV145TFBarFasCod2_Sel ;
      AV219Webwcnsprodds_67_tfbarfasdsc2 = AV146TFBarFasDsc2 ;
      AV220Webwcnsprodds_68_tfbarfasdsc2_sel = AV147TFBarFasDsc2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV153Webwcnsprodds_1_barnhdr ,
                                           AV154Webwcnsprodds_2_clinom ,
                                           AV155Webwcnsprodds_3_barfecgen ,
                                           AV156Webwcnsprodds_4_barfecgen_to ,
                                           AV157Webwcnsprodds_5_barenccli ,
                                           AV158Webwcnsprodds_6_barser ,
                                           AV159Webwcnsprodds_7_barcolnom ,
                                           Byte.valueOf(AV160Webwcnsprodds_8_barsit) ,
                                           Byte.valueOf(AV161Webwcnsprodds_9_barsit_to) ,
                                           Integer.valueOf(AV162Webwcnsprodds_10_tfclicod) ,
                                           Integer.valueOf(AV163Webwcnsprodds_11_tfclicod_to) ,
                                           AV165Webwcnsprodds_13_tfclinom_sel ,
                                           AV164Webwcnsprodds_12_tfclinom ,
                                           AV167Webwcnsprodds_15_tfbarnhdr_sel ,
                                           AV166Webwcnsprodds_14_tfbarnhdr ,
                                           AV169Webwcnsprodds_17_tfbaragrest_sel ,
                                           AV168Webwcnsprodds_16_tfbaragrest ,
                                           AV171Webwcnsprodds_19_tfbarser_sel ,
                                           AV170Webwcnsprodds_18_tfbarser ,
                                           AV173Webwcnsprodds_21_tfbarserdsc_sel ,
                                           AV172Webwcnsprodds_20_tfbarserdsc ,
                                           AV174Webwcnsprodds_22_tfbarfecgen ,
                                           AV175Webwcnsprodds_23_tfbarfecent ,
                                           AV177Webwcnsprodds_25_tfbarcolnom_sel ,
                                           AV176Webwcnsprodds_24_tfbarcolnom ,
                                           Integer.valueOf(AV178Webwcnsprodds_26_tfbarcolnum) ,
                                           Integer.valueOf(AV179Webwcnsprodds_27_tfbarcolnum_to) ,
                                           AV181Webwcnsprodds_29_tfbarnomcli_sel ,
                                           AV180Webwcnsprodds_28_tfbarnomcli ,
                                           Integer.valueOf(AV182Webwcnsprodds_30_tfbarnumcli) ,
                                           Integer.valueOf(AV183Webwcnsprodds_31_tfbarnumcli_to) ,
                                           AV184Webwcnsprodds_32_tfbarkgm ,
                                           AV185Webwcnsprodds_33_tfbarkgm_to ,
                                           AV186Webwcnsprodds_34_tfbarmtr ,
                                           AV187Webwcnsprodds_35_tfbarmtr_to ,
                                           Byte.valueOf(AV190Webwcnsprodds_38_tfbarsit) ,
                                           Byte.valueOf(AV191Webwcnsprodds_39_tfbarsit_to) ,
                                           Short.valueOf(AV196Webwcnsprodds_44_tfbarpart) ,
                                           Short.valueOf(AV197Webwcnsprodds_45_tfbarpart_to) ,
                                           AV199Webwcnsprodds_47_tfbaritem3_sel ,
                                           AV198Webwcnsprodds_46_tfbaritem3 ,
                                           Short.valueOf(AV200Webwcnsprodds_48_tfbarrdto4) ,
                                           Short.valueOf(AV201Webwcnsprodds_49_tfbarrdto4_to) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A279CliNom ,
                                           A159BarFecGen ,
                                           A4812BarEncCli ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Byte.valueOf(A213BarSit) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A120BarAgrEst ,
                                           A1652BarSerDsc ,
                                           A157BarFecEnt ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(A1503BarPart) ,
                                           A9777BarItem3 ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           Short.valueOf(AV51OrderedBy) ,
                                           Boolean.valueOf(AV52OrderedDsc) ,
                                           Integer.valueOf(AV188Webwcnsprodds_36_tfbarpie) ,
                                           Integer.valueOf(A198BarPie) ,
                                           Integer.valueOf(AV189Webwcnsprodds_37_tfbarpie_to) ,
                                           AV193Webwcnsprodds_41_tfbarfascod_sel ,
                                           AV192Webwcnsprodds_40_tfbarfascod ,
                                           A151BarFasCod ,
                                           AV195Webwcnsprodds_43_tfbarfassig_sel ,
                                           AV194Webwcnsprodds_42_tfbarfassig ,
                                           A1955BarFasSig ,
                                           AV203Webwcnsprodds_51_tfbargots_sel ,
                                           AV202Webwcnsprodds_50_tfbargots ,
                                           A13855BarGots ,
                                           AV205Webwcnsprodds_53_tfbargrs_sel ,
                                           AV204Webwcnsprodds_52_tfbargrs ,
                                           A13856BarGrs ,
                                           AV207Webwcnsprodds_55_tfbarocs_sel ,
                                           AV206Webwcnsprodds_54_tfbarocs ,
                                           A13857BarOcs ,
                                           AV209Webwcnsprodds_57_tfbarrcs_sel ,
                                           AV208Webwcnsprodds_56_tfbarrcs ,
                                           A13858BarRcs ,
                                           AV211Webwcnsprodds_59_tfbaroeko_sel ,
                                           AV210Webwcnsprodds_58_tfbaroeko ,
                                           A13859BarOeko ,
                                           AV212Webwcnsprodds_60_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV214Webwcnsprodds_62_tfbarmarca_sel ,
                                           AV213Webwcnsprodds_61_tfbarmarca ,
                                           A13861BarMarca ,
                                           Integer.valueOf(AV215Webwcnsprodds_63_tfbar_maccod) ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           Integer.valueOf(AV216Webwcnsprodds_64_tfbar_maccod_to) ,
                                           AV218Webwcnsprodds_66_tfbarfascod2_sel ,
                                           AV217Webwcnsprodds_65_tfbarfascod2 ,
                                           A13863BarFasCod2 ,
                                           AV220Webwcnsprodds_68_tfbarfasdsc2_sel ,
                                           AV219Webwcnsprodds_67_tfbarfasdsc2 ,
                                           A13864BarFasDsc2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV192Webwcnsprodds_40_tfbarfascod = GXutil.padr( GXutil.rtrim( AV192Webwcnsprodds_40_tfbarfascod), 8, "%") ;
      lV194Webwcnsprodds_42_tfbarfassig = GXutil.padr( GXutil.rtrim( AV194Webwcnsprodds_42_tfbarfassig), 8, "%") ;
      lV213Webwcnsprodds_61_tfbarmarca = GXutil.padr( GXutil.rtrim( AV213Webwcnsprodds_61_tfbarmarca), 30, "%") ;
      lV217Webwcnsprodds_65_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV217Webwcnsprodds_65_tfbarfascod2), 8, "%") ;
      lV153Webwcnsprodds_1_barnhdr = GXutil.padr( GXutil.rtrim( AV153Webwcnsprodds_1_barnhdr), 11, "%") ;
      lV154Webwcnsprodds_2_clinom = GXutil.padr( GXutil.rtrim( AV154Webwcnsprodds_2_clinom), 30, "%") ;
      lV157Webwcnsprodds_5_barenccli = GXutil.padr( GXutil.rtrim( AV157Webwcnsprodds_5_barenccli), 20, "%") ;
      lV158Webwcnsprodds_6_barser = GXutil.padr( GXutil.rtrim( AV158Webwcnsprodds_6_barser), 16, "%") ;
      lV159Webwcnsprodds_7_barcolnom = GXutil.padr( GXutil.rtrim( AV159Webwcnsprodds_7_barcolnom), 13, "%") ;
      lV164Webwcnsprodds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV164Webwcnsprodds_12_tfclinom), 30, "%") ;
      lV166Webwcnsprodds_14_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV166Webwcnsprodds_14_tfbarnhdr), 11, "%") ;
      lV168Webwcnsprodds_16_tfbaragrest = GXutil.padr( GXutil.rtrim( AV168Webwcnsprodds_16_tfbaragrest), 1, "%") ;
      lV170Webwcnsprodds_18_tfbarser = GXutil.padr( GXutil.rtrim( AV170Webwcnsprodds_18_tfbarser), 16, "%") ;
      lV172Webwcnsprodds_20_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV172Webwcnsprodds_20_tfbarserdsc), 26, "%") ;
      lV176Webwcnsprodds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV176Webwcnsprodds_24_tfbarcolnom), 13, "%") ;
      lV180Webwcnsprodds_28_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV180Webwcnsprodds_28_tfbarnomcli), 13, "%") ;
      lV198Webwcnsprodds_46_tfbaritem3 = GXutil.padr( GXutil.rtrim( AV198Webwcnsprodds_46_tfbaritem3), 20, "%") ;
      /* Using cursor P08CT14 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, AV193Webwcnsprodds_41_tfbarfascod_sel, AV192Webwcnsprodds_40_tfbarfascod, lV192Webwcnsprodds_40_tfbarfascod, AV193Webwcnsprodds_41_tfbarfascod_sel, AV193Webwcnsprodds_41_tfbarfascod_sel, AV195Webwcnsprodds_43_tfbarfassig_sel, AV194Webwcnsprodds_42_tfbarfassig, lV194Webwcnsprodds_42_tfbarfassig, AV195Webwcnsprodds_43_tfbarfassig_sel, AV195Webwcnsprodds_43_tfbarfassig_sel, AV212Webwcnsprodds_60_tfbaraccesorios_sel, AV212Webwcnsprodds_60_tfbaraccesorios_sel, AV214Webwcnsprodds_62_tfbarmarca_sel, AV213Webwcnsprodds_61_tfbarmarca, lV213Webwcnsprodds_61_tfbarmarca, AV214Webwcnsprodds_62_tfbarmarca_sel, AV214Webwcnsprodds_62_tfbarmarca_sel, Integer.valueOf(AV215Webwcnsprodds_63_tfbar_maccod), Integer.valueOf(AV215Webwcnsprodds_63_tfbar_maccod), Integer.valueOf(AV216Webwcnsprodds_64_tfbar_maccod_to), Integer.valueOf(AV216Webwcnsprodds_64_tfbar_maccod_to), AV218Webwcnsprodds_66_tfbarfascod2_sel, AV217Webwcnsprodds_65_tfbarfascod2, lV217Webwcnsprodds_65_tfbarfascod2, AV218Webwcnsprodds_66_tfbarfascod2_sel, AV218Webwcnsprodds_66_tfbarfascod2_sel, lV153Webwcnsprodds_1_barnhdr, lV154Webwcnsprodds_2_clinom, AV155Webwcnsprodds_3_barfecgen, AV156Webwcnsprodds_4_barfecgen_to, lV157Webwcnsprodds_5_barenccli, lV158Webwcnsprodds_6_barser, lV159Webwcnsprodds_7_barcolnom, Byte.valueOf(AV160Webwcnsprodds_8_barsit), Byte.valueOf(AV161Webwcnsprodds_9_barsit_to), Integer.valueOf(AV162Webwcnsprodds_10_tfclicod), Integer.valueOf(AV163Webwcnsprodds_11_tfclicod_to), lV164Webwcnsprodds_12_tfclinom, AV165Webwcnsprodds_13_tfclinom_sel, lV166Webwcnsprodds_14_tfbarnhdr, AV167Webwcnsprodds_15_tfbarnhdr_sel, lV168Webwcnsprodds_16_tfbaragrest, AV169Webwcnsprodds_17_tfbaragrest_sel, lV170Webwcnsprodds_18_tfbarser, AV171Webwcnsprodds_19_tfbarser_sel, lV172Webwcnsprodds_20_tfbarserdsc, AV173Webwcnsprodds_21_tfbarserdsc_sel, AV174Webwcnsprodds_22_tfbarfecgen, AV175Webwcnsprodds_23_tfbarfecent, lV176Webwcnsprodds_24_tfbarcolnom, AV177Webwcnsprodds_25_tfbarcolnom_sel, Integer.valueOf(AV178Webwcnsprodds_26_tfbarcolnum), Integer.valueOf(AV179Webwcnsprodds_27_tfbarcolnum_to), lV180Webwcnsprodds_28_tfbarnomcli, AV181Webwcnsprodds_29_tfbarnomcli_sel, Integer.valueOf(AV182Webwcnsprodds_30_tfbarnumcli), Integer.valueOf(AV183Webwcnsprodds_31_tfbarnumcli_to), AV184Webwcnsprodds_32_tfbarkgm, AV185Webwcnsprodds_33_tfbarkgm_to, AV186Webwcnsprodds_34_tfbarmtr, AV187Webwcnsprodds_35_tfbarmtr_to, Byte.valueOf(AV190Webwcnsprodds_38_tfbarsit), Byte.valueOf(AV191Webwcnsprodds_39_tfbarsit_to), Short.valueOf(AV196Webwcnsprodds_44_tfbarpart), Short.valueOf(AV197Webwcnsprodds_45_tfbarpart_to), lV198Webwcnsprodds_46_tfbaritem3, AV199Webwcnsprodds_47_tfbaritem3_sel, Short.valueOf(AV200Webwcnsprodds_48_tfbarrdto4), Short.valueOf(AV201Webwcnsprodds_49_tfbarrdto4_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13769BarRdto4 = P08CT14_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08CT14_n13769BarRdto4[0] ;
         A9777BarItem3 = P08CT14_A9777BarItem3[0] ;
         A1503BarPart = P08CT14_A1503BarPart[0] ;
         A1235BarNumCli = P08CT14_A1235BarNumCli[0] ;
         A1234BarNomCli = P08CT14_A1234BarNomCli[0] ;
         A136BarColNum = P08CT14_A136BarColNum[0] ;
         A157BarFecEnt = P08CT14_A157BarFecEnt[0] ;
         A1652BarSerDsc = P08CT14_A1652BarSerDsc[0] ;
         A120BarAgrEst = P08CT14_A120BarAgrEst[0] ;
         A252CliCod = P08CT14_A252CliCod[0] ;
         n252CliCod = P08CT14_n252CliCod[0] ;
         A213BarSit = P08CT14_A213BarSit[0] ;
         A135BarColNom = P08CT14_A135BarColNom[0] ;
         A212BarSer = P08CT14_A212BarSer[0] ;
         A4812BarEncCli = P08CT14_A4812BarEncCli[0] ;
         A159BarFecGen = P08CT14_A159BarFecGen[0] ;
         A279CliNom = P08CT14_A279CliNom[0] ;
         A3746BarNPed = P08CT14_A3746BarNPed[0] ;
         A143BarDisNum = P08CT14_A143BarDisNum[0] ;
         A11852Nxt_ArtCl2 = P08CT14_A11852Nxt_ArtCl2[0] ;
         A4466BarAcaAnh = P08CT14_A4466BarAcaAnh[0] ;
         A13862Bar_MacCod = P08CT14_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08CT14_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08CT14_A13861BarMarca[0] ;
         n13861BarMarca = P08CT14_n13861BarMarca[0] ;
         A13860BarAccesor = P08CT14_A13860BarAccesor[0] ;
         n13860BarAccesor = P08CT14_n13860BarAccesor[0] ;
         A1955BarFasSig = P08CT14_A1955BarFasSig[0] ;
         n1955BarFasSig = P08CT14_n1955BarFasSig[0] ;
         A151BarFasCod = P08CT14_A151BarFasCod[0] ;
         n151BarFasCod = P08CT14_n151BarFasCod[0] ;
         A184BarMtr = P08CT14_A184BarMtr[0] ;
         A166BarKgm = P08CT14_A166BarKgm[0] ;
         A130BarCodPar = P08CT14_A130BarCodPar[0] ;
         A132BarCodReo = P08CT14_A132BarCodReo[0] ;
         A129BarCod = P08CT14_A129BarCod[0] ;
         A199BarPie1 = P08CT14_A199BarPie1[0] ;
         A365DisDes = P08CT14_A365DisDes[0] ;
         A898BarPieNDes = P08CT14_A898BarPieNDes[0] ;
         A361DisCod = P08CT14_A361DisCod[0] ;
         A13863BarFasCod2 = P08CT14_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08CT14_n13863BarFasCod2[0] ;
         A396EmprCod = P08CT14_A396EmprCod[0] ;
         A13862Bar_MacCod = P08CT14_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08CT14_n13862Bar_MacCod[0] ;
         A279CliNom = P08CT14_A279CliNom[0] ;
         A13863BarFasCod2 = P08CT14_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08CT14_n13863BarFasCod2[0] ;
         A13861BarMarca = P08CT14_A13861BarMarca[0] ;
         n13861BarMarca = P08CT14_n13861BarMarca[0] ;
         A13860BarAccesor = P08CT14_A13860BarAccesor[0] ;
         n13860BarAccesor = P08CT14_n13860BarAccesor[0] ;
         A1955BarFasSig = P08CT14_A1955BarFasSig[0] ;
         n1955BarFasSig = P08CT14_n1955BarFasSig[0] ;
         A151BarFasCod = P08CT14_A151BarFasCod[0] ;
         n151BarFasCod = P08CT14_n151BarFasCod[0] ;
         A184BarMtr = P08CT14_A184BarMtr[0] ;
         A166BarKgm = P08CT14_A166BarKgm[0] ;
         A199BarPie1 = P08CT14_A199BarPie1[0] ;
         A898BarPieNDes = P08CT14_A898BarPieNDes[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV203Webwcnsprodds_51_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV202Webwcnsprodds_50_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV202Webwcnsprodds_50_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV203Webwcnsprodds_51_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV203Webwcnsprodds_51_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV205Webwcnsprodds_53_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV204Webwcnsprodds_52_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV204Webwcnsprodds_52_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV205Webwcnsprodds_53_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV205Webwcnsprodds_53_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV207Webwcnsprodds_55_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV206Webwcnsprodds_54_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV206Webwcnsprodds_54_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV207Webwcnsprodds_55_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV207Webwcnsprodds_55_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV209Webwcnsprodds_57_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV208Webwcnsprodds_56_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV208Webwcnsprodds_56_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV209Webwcnsprodds_57_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV209Webwcnsprodds_57_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV211Webwcnsprodds_59_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV210Webwcnsprodds_58_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV210Webwcnsprodds_58_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV211Webwcnsprodds_59_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV211Webwcnsprodds_59_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( ! ( (GXutil.strcmp("", AV220Webwcnsprodds_68_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV219Webwcnsprodds_67_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV219Webwcnsprodds_67_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                       {
                                          if ( (GXutil.strcmp("", AV220Webwcnsprodds_68_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV220Webwcnsprodds_68_tfbarfasdsc2_sel) == 0 ) ) )
                                          {
                                             if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                             {
                                                A198BarPie = A898BarPieNDes ;
                                             }
                                             else
                                             {
                                                A198BarPie = A199BarPie1 ;
                                             }
                                             if ( (0==AV188Webwcnsprodds_36_tfbarpie) || ( ( A198BarPie >= AV188Webwcnsprodds_36_tfbarpie ) ) )
                                             {
                                                if ( (0==AV189Webwcnsprodds_37_tfbarpie_to) || ( ( A198BarPie <= AV189Webwcnsprodds_37_tfbarpie_to ) ) )
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
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV113BarMacCod = GXutil.lval( A3746BarNPed) ;
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( AV113BarMacCod, 10, 0) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXv_int4[0] = AV148MacCod ;
                                                      new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int4) ;
                                                      webwcnsprodexportcsv_impl.this.AV148MacCod = GXv_int4[0] ;
                                                      AV109Accesorios = ((AV148MacCod>0) ? "S" : "N") ;
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV109Accesorios, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A120BarAgrEst, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV123BarEncCliGrid = ((GXutil.strcmp("", A143BarDisNum)==0) ? A4812BarEncCli : A143BarDisNum) ;
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV123BarEncCliGrid, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += localUtil.dtoc( A157BarFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV110ObsEnc = "" ;
                                                      /* Using cursor P08CT15 */
                                                      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                                                      while ( (pr_default.getStatus(1) != 101) )
                                                      {
                                                         A377DisObsTxt = P08CT15_A377DisObsTxt[0] ;
                                                         A376DisObsLin = P08CT15_A376DisObsLin[0] ;
                                                         if ( GXutil.strcmp(AV110ObsEnc, " ") == 0 )
                                                         {
                                                            AV110ObsEnc = GXutil.trim( A377DisObsTxt) ;
                                                         }
                                                         else
                                                         {
                                                            AV110ObsEnc += " " + GXutil.trim( A377DisObsTxt) ;
                                                         }
                                                         pr_default.readNext(1);
                                                      }
                                                      pr_default.close(1);
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV110ObsEnc, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( A1235BarNumCli, 6, 0) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( A166BarKgm, 9, 2) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( A184BarMtr, 9, 2) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( A198BarPie, 6, 0) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( A213BarSit, 2, 0) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A151BarFasCod, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = AV102FasDscUlt ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A151BarFasCod, GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV102FasDscUlt = GXt_char2 ;
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV102FasDscUlt, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1955BarFasSig, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXt_char2 = AV103FasDscSig ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A1955BarFasSig, GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV103FasDscSig = GXt_char2 ;
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV103FasDscSig, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      /* Using cursor P08CT16 */
                                                      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                      while ( (pr_default.getStatus(2) != 101) )
                                                      {
                                                         A34AlbProfch = P08CT16_A34AlbProfch[0] ;
                                                         A1261BarAlbKgmE = P08CT16_A1261BarAlbKgmE[0] ;
                                                         A1263BarAlbMtrE = P08CT16_A1263BarAlbMtrE[0] ;
                                                         A1265BarAlbPie = P08CT16_A1265BarAlbPie[0] ;
                                                         A30AlbProCod = P08CT16_A30AlbProCod[0] ;
                                                         A34AlbProfch = P08CT16_A34AlbProfch[0] ;
                                                         AV104AlbProcod = A30AlbProCod ;
                                                         AV105AlbProFec = A34AlbProfch ;
                                                         AV106BarAlbKgmE = AV106BarAlbKgmE.add(A1261BarAlbKgmE) ;
                                                         AV107BarAlbMtrE = AV107BarAlbMtrE.add(A1263BarAlbMtrE) ;
                                                         AV108BarAlbPie = (int)(AV108BarAlbPie+A1265BarAlbPie) ;
                                                         pr_default.readNext(2);
                                                      }
                                                      pr_default.close(2);
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( AV104AlbProcod, 10, 0) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      /* Using cursor P08CT17 */
                                                      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                                                      while ( (pr_default.getStatus(3) != 101) )
                                                      {
                                                         A1261BarAlbKgmE = P08CT17_A1261BarAlbKgmE[0] ;
                                                         A34AlbProfch = P08CT17_A34AlbProfch[0] ;
                                                         A30AlbProCod = P08CT17_A30AlbProCod[0] ;
                                                         A34AlbProfch = P08CT17_A34AlbProfch[0] ;
                                                         AV105AlbProFec = A34AlbProfch ;
                                                         pr_default.readNext(3);
                                                      }
                                                      pr_default.close(3);
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += localUtil.dtoc( AV105AlbProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( AV106BarAlbKgmE, 9, 2) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( AV107BarAlbMtrE, 9, 2) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( AV108BarAlbPie, 6, 0) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV111Exportacion = ((GXutil.strcmp(GXutil.trim( A11852Nxt_ArtCl2), httpContext.getMessage( "Sem Definir", ""))==0) ? " " : A11852Nxt_ArtCl2) ;
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char3[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV111Exportacion, ";", ","), GXv_char3) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      GXv_char3[0] = A396EmprCod ;
                                                      GXv_int4[0] = A252CliCod ;
                                                      GXv_int5[0] = A4466BarAcaAnh ;
                                                      GXv_char6[0] = AV149Tb1_dscfb ;
                                                      new app.pptable2(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
                                                      webwcnsprodexportcsv_impl.this.A252CliCod = GXv_int4[0] ;
                                                      webwcnsprodexportcsv_impl.this.A4466BarAcaAnh = GXv_int5[0] ;
                                                      webwcnsprodexportcsv_impl.this.AV149Tb1_dscfb = GXv_char6[0] ;
                                                      AV112Marca = GXutil.substring( AV149Tb1_dscfb, 1, 20) ;
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV112Marca, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( A1503BarPart, 4, 0) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9777BarItem3, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+34)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( A13769BarRdto4, 4, 0) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+35)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13855BarGots, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+36)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13856BarGrs, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+37)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13857BarOcs, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+38)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13858BarRcs, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+39)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13859BarOeko, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+40)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13860BarAccesor, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+41)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13861BarMarca, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+42)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      AV14TextFileLine += GXutil.str( A13862Bar_MacCod, 8, 0) ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+43)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13863BarFasCod2, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                                      AV14TextFileLine += GXt_char2 ;
                                                   }
                                                   if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+44)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                   {
                                                      AV14TextFileLine += ";" ;
                                                      GXt_char2 = AV14TextFileLine ;
                                                      GXv_char6[0] = GXt_char2 ;
                                                      new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13864BarFasDsc2, ";", ","), GXv_char6) ;
                                                      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
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
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebWCnsProdExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNHdr", "", "N° Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarMacCod", "", "Nº Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Accesorios", "", "Acc?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarAgrEst", "", "S=Bar.Agrupada N=No Agrupada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarEncCliGrid", "", "Disp Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSer", "", "Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFecGen", "", "Fecha Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFecEnt", "", "Fecha Prev Ent", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&ObsEnc", "", "Obs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNom", "", "Nombre Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarColNum", "", "Numero del Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarNumCli", "", "Numero ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarKgm", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarMtr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarPie", "", "Piezas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarSit", "", "St", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFasCod", "", "Ult fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&FasDscUlt", "", "Descripcion ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFasSig", "", "Sig Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&FasDscSig", "", "Descripcion ", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&AlbProcod", "", "Nº Doc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&AlbProFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarAlbKgmE", "", "Kilos Sal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarAlbMtrE", "", "Metros Sal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&BarAlbPie", "", "Piezas Sal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Exportacion", "", "Exportacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&Marca", "", "Marca", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarPart", "", "Nº Partida", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarItem3", "", "N Enc Cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarRdto4", "", "4 decimales", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarGots", "", "Gots", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarGrs", "", "Grs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarOcs", "", "Ocs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarRcs", "", "Rcs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarOeko", "", "Oeko", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarAccesorios", "", "Acc?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarMarca", "", "Marca", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "Bar_MacCod", "", "Macro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFasCod2", "", "Fase Ult", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "BarFasDsc2", "", "Desc Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char6[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWCnsProdColumnsSelector", GXv_char6) ;
      webwcnsprodexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebWCnsProdGridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWCnsProdGridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV19Session.getValue("WebWCnsProdGridState"), null, null);
      }
      AV51OrderedBy = AV47GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV52OrderedDsc = AV47GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV224GXV1 = 1 ;
      while ( AV224GXV1 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV224GXV1));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARNHDR") == 0 )
         {
            AV125BarNHdr = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLINOM") == 0 )
         {
            AV95CliNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARFECGEN") == 0 )
         {
            AV90BarFecGen = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV91BarFecGen_To = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARENCCLI") == 0 )
         {
            AV53BarEncCli = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSER") == 0 )
         {
            AV120BarSer = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNOM") == 0 )
         {
            AV122BarColNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSIT") == 0 )
         {
            AV92BarSit = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV93BarSit_To = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV54TFCliCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV55TFCliCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV56TFCliNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV57TFCliNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV49TFBarNHdr = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV50TFBarNHdr_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST") == 0 )
         {
            AV58TFBarAgrEst = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGREST_SEL") == 0 )
         {
            AV59TFBarAgrEst_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV60TFBarSer = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV61TFBarSer_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV62TFBarSerDsc = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV63TFBarSerDsc_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV64TFBarFecGen = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECENT") == 0 )
         {
            AV66TFBarFecEnt = localUtil.ctod( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV68TFBarColNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV69TFBarColNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV70TFBarColNum = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV71TFBarColNum_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV72TFBarNomCli = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV73TFBarNomCli_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMCLI") == 0 )
         {
            AV74TFBarNumCli = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFBarNumCli_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV76TFBarKgm = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV77TFBarKgm_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV78TFBarMtr = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV79TFBarMtr_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV80TFBarPie = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV81TFBarPie_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV82TFBarSit = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV83TFBarSit_To = (byte)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV98TFBarFasCod = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV99TFBarFasCod_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG") == 0 )
         {
            AV100TFBarFasSig = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASSIG_SEL") == 0 )
         {
            AV101TFBarFasSig_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPART") == 0 )
         {
            AV114TFBarPart = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV115TFBarPart_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARITEM3") == 0 )
         {
            AV116TFBarItem3 = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARITEM3_SEL") == 0 )
         {
            AV117TFBarItem3_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRDTO4") == 0 )
         {
            AV127TFBarRdto4 = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV128TFBarRdto4_To = (short)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS") == 0 )
         {
            AV129TFBarGots = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS_SEL") == 0 )
         {
            AV130TFBarGots_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS") == 0 )
         {
            AV131TFBarGrs = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS_SEL") == 0 )
         {
            AV132TFBarGrs_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS") == 0 )
         {
            AV133TFBarOcs = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS_SEL") == 0 )
         {
            AV134TFBarOcs_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS") == 0 )
         {
            AV135TFBarRcs = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS_SEL") == 0 )
         {
            AV136TFBarRcs_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO") == 0 )
         {
            AV137TFBarOeko = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO_SEL") == 0 )
         {
            AV138TFBarOeko_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACCESORIOS_SEL") == 0 )
         {
            AV139TFBarAccesorios_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA") == 0 )
         {
            AV140TFBarMarca = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA_SEL") == 0 )
         {
            AV141TFBarMarca_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAR_MACCOD") == 0 )
         {
            AV142TFBar_MacCod = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV143TFBar_MacCod_To = (int)(GXutil.lval( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2") == 0 )
         {
            AV144TFBarFasCod2 = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2_SEL") == 0 )
         {
            AV145TFBarFasCod2_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2") == 0 )
         {
            AV146TFBarFasDsc2 = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2_SEL") == 0 )
         {
            AV147TFBarFasDsc2_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV224GXV1 = (int)(AV224GXV1+1) ;
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
      A13696BarNHdr = "" ;
      A3746BarNPed = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A157BarFecEnt = GXutil.nullDate() ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      A1955BarFasSig = "" ;
      A11852Nxt_ArtCl2 = "" ;
      A9777BarItem3 = "" ;
      A13855BarGots = "" ;
      A13856BarGrs = "" ;
      A13857BarOcs = "" ;
      A13858BarRcs = "" ;
      A13859BarOeko = "" ;
      A13860BarAccesor = "" ;
      A13861BarMarca = "" ;
      A13863BarFasCod2 = "" ;
      A13864BarFasDsc2 = "" ;
      AV153Webwcnsprodds_1_barnhdr = "" ;
      AV125BarNHdr = "" ;
      AV154Webwcnsprodds_2_clinom = "" ;
      AV95CliNom = "" ;
      AV155Webwcnsprodds_3_barfecgen = GXutil.nullDate() ;
      AV90BarFecGen = GXutil.nullDate() ;
      AV156Webwcnsprodds_4_barfecgen_to = GXutil.nullDate() ;
      AV91BarFecGen_To = GXutil.nullDate() ;
      AV157Webwcnsprodds_5_barenccli = "" ;
      AV53BarEncCli = "" ;
      AV158Webwcnsprodds_6_barser = "" ;
      AV120BarSer = "" ;
      AV159Webwcnsprodds_7_barcolnom = "" ;
      AV122BarColNom = "" ;
      AV164Webwcnsprodds_12_tfclinom = "" ;
      AV56TFCliNom = "" ;
      AV165Webwcnsprodds_13_tfclinom_sel = "" ;
      AV57TFCliNom_Sel = "" ;
      AV166Webwcnsprodds_14_tfbarnhdr = "" ;
      AV49TFBarNHdr = "" ;
      AV167Webwcnsprodds_15_tfbarnhdr_sel = "" ;
      AV50TFBarNHdr_Sel = "" ;
      AV168Webwcnsprodds_16_tfbaragrest = "" ;
      AV58TFBarAgrEst = "" ;
      AV169Webwcnsprodds_17_tfbaragrest_sel = "" ;
      AV59TFBarAgrEst_Sel = "" ;
      AV170Webwcnsprodds_18_tfbarser = "" ;
      AV60TFBarSer = "" ;
      AV171Webwcnsprodds_19_tfbarser_sel = "" ;
      AV61TFBarSer_Sel = "" ;
      AV172Webwcnsprodds_20_tfbarserdsc = "" ;
      AV62TFBarSerDsc = "" ;
      AV173Webwcnsprodds_21_tfbarserdsc_sel = "" ;
      AV63TFBarSerDsc_Sel = "" ;
      AV174Webwcnsprodds_22_tfbarfecgen = GXutil.nullDate() ;
      AV64TFBarFecGen = GXutil.nullDate() ;
      AV175Webwcnsprodds_23_tfbarfecent = GXutil.nullDate() ;
      AV66TFBarFecEnt = GXutil.nullDate() ;
      AV176Webwcnsprodds_24_tfbarcolnom = "" ;
      AV68TFBarColNom = "" ;
      AV177Webwcnsprodds_25_tfbarcolnom_sel = "" ;
      AV69TFBarColNom_Sel = "" ;
      AV180Webwcnsprodds_28_tfbarnomcli = "" ;
      AV72TFBarNomCli = "" ;
      AV181Webwcnsprodds_29_tfbarnomcli_sel = "" ;
      AV73TFBarNomCli_Sel = "" ;
      AV184Webwcnsprodds_32_tfbarkgm = DecimalUtil.ZERO ;
      AV76TFBarKgm = DecimalUtil.ZERO ;
      AV185Webwcnsprodds_33_tfbarkgm_to = DecimalUtil.ZERO ;
      AV77TFBarKgm_To = DecimalUtil.ZERO ;
      AV186Webwcnsprodds_34_tfbarmtr = DecimalUtil.ZERO ;
      AV78TFBarMtr = DecimalUtil.ZERO ;
      AV187Webwcnsprodds_35_tfbarmtr_to = DecimalUtil.ZERO ;
      AV79TFBarMtr_To = DecimalUtil.ZERO ;
      AV192Webwcnsprodds_40_tfbarfascod = "" ;
      AV98TFBarFasCod = "" ;
      AV193Webwcnsprodds_41_tfbarfascod_sel = "" ;
      AV99TFBarFasCod_Sel = "" ;
      AV194Webwcnsprodds_42_tfbarfassig = "" ;
      AV100TFBarFasSig = "" ;
      AV195Webwcnsprodds_43_tfbarfassig_sel = "" ;
      AV101TFBarFasSig_Sel = "" ;
      AV198Webwcnsprodds_46_tfbaritem3 = "" ;
      AV116TFBarItem3 = "" ;
      AV199Webwcnsprodds_47_tfbaritem3_sel = "" ;
      AV117TFBarItem3_Sel = "" ;
      AV202Webwcnsprodds_50_tfbargots = "" ;
      AV129TFBarGots = "" ;
      AV203Webwcnsprodds_51_tfbargots_sel = "" ;
      AV130TFBarGots_Sel = "" ;
      AV204Webwcnsprodds_52_tfbargrs = "" ;
      AV131TFBarGrs = "" ;
      AV205Webwcnsprodds_53_tfbargrs_sel = "" ;
      AV132TFBarGrs_Sel = "" ;
      AV206Webwcnsprodds_54_tfbarocs = "" ;
      AV133TFBarOcs = "" ;
      AV207Webwcnsprodds_55_tfbarocs_sel = "" ;
      AV134TFBarOcs_Sel = "" ;
      AV208Webwcnsprodds_56_tfbarrcs = "" ;
      AV135TFBarRcs = "" ;
      AV209Webwcnsprodds_57_tfbarrcs_sel = "" ;
      AV136TFBarRcs_Sel = "" ;
      AV210Webwcnsprodds_58_tfbaroeko = "" ;
      AV137TFBarOeko = "" ;
      AV211Webwcnsprodds_59_tfbaroeko_sel = "" ;
      AV138TFBarOeko_Sel = "" ;
      AV212Webwcnsprodds_60_tfbaraccesorios_sel = "" ;
      AV139TFBarAccesorios_Sel = "" ;
      AV213Webwcnsprodds_61_tfbarmarca = "" ;
      AV140TFBarMarca = "" ;
      AV214Webwcnsprodds_62_tfbarmarca_sel = "" ;
      AV141TFBarMarca_Sel = "" ;
      AV217Webwcnsprodds_65_tfbarfascod2 = "" ;
      AV144TFBarFasCod2 = "" ;
      AV218Webwcnsprodds_66_tfbarfascod2_sel = "" ;
      AV145TFBarFasCod2_Sel = "" ;
      AV219Webwcnsprodds_67_tfbarfasdsc2 = "" ;
      AV146TFBarFasDsc2 = "" ;
      AV220Webwcnsprodds_68_tfbarfasdsc2_sel = "" ;
      AV147TFBarFasDsc2_Sel = "" ;
      scmdbuf = "" ;
      lV192Webwcnsprodds_40_tfbarfascod = "" ;
      lV194Webwcnsprodds_42_tfbarfassig = "" ;
      lV213Webwcnsprodds_61_tfbarmarca = "" ;
      lV217Webwcnsprodds_65_tfbarfascod2 = "" ;
      lV153Webwcnsprodds_1_barnhdr = "" ;
      lV154Webwcnsprodds_2_clinom = "" ;
      lV157Webwcnsprodds_5_barenccli = "" ;
      lV158Webwcnsprodds_6_barser = "" ;
      lV159Webwcnsprodds_7_barcolnom = "" ;
      lV164Webwcnsprodds_12_tfclinom = "" ;
      lV166Webwcnsprodds_14_tfbarnhdr = "" ;
      lV168Webwcnsprodds_16_tfbaragrest = "" ;
      lV170Webwcnsprodds_18_tfbarser = "" ;
      lV172Webwcnsprodds_20_tfbarserdsc = "" ;
      lV176Webwcnsprodds_24_tfbarcolnom = "" ;
      lV180Webwcnsprodds_28_tfbarnomcli = "" ;
      lV198Webwcnsprodds_46_tfbaritem3 = "" ;
      P08CT14_A9713Tb1_Cod = new short[1] ;
      P08CT14_A13769BarRdto4 = new short[1] ;
      P08CT14_n13769BarRdto4 = new boolean[] {false} ;
      P08CT14_A9777BarItem3 = new String[] {""} ;
      P08CT14_A1503BarPart = new short[1] ;
      P08CT14_A1235BarNumCli = new int[1] ;
      P08CT14_A1234BarNomCli = new String[] {""} ;
      P08CT14_A136BarColNum = new int[1] ;
      P08CT14_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P08CT14_A1652BarSerDsc = new String[] {""} ;
      P08CT14_A120BarAgrEst = new String[] {""} ;
      P08CT14_A252CliCod = new int[1] ;
      P08CT14_n252CliCod = new boolean[] {false} ;
      P08CT14_A213BarSit = new byte[1] ;
      P08CT14_A135BarColNom = new String[] {""} ;
      P08CT14_A212BarSer = new String[] {""} ;
      P08CT14_A4812BarEncCli = new String[] {""} ;
      P08CT14_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P08CT14_A279CliNom = new String[] {""} ;
      P08CT14_A3746BarNPed = new String[] {""} ;
      P08CT14_A143BarDisNum = new String[] {""} ;
      P08CT14_A11852Nxt_ArtCl2 = new String[] {""} ;
      P08CT14_A4466BarAcaAnh = new short[1] ;
      P08CT14_A13862Bar_MacCod = new int[1] ;
      P08CT14_n13862Bar_MacCod = new boolean[] {false} ;
      P08CT14_A13861BarMarca = new String[] {""} ;
      P08CT14_n13861BarMarca = new boolean[] {false} ;
      P08CT14_A13860BarAccesor = new String[] {""} ;
      P08CT14_n13860BarAccesor = new boolean[] {false} ;
      P08CT14_A1955BarFasSig = new String[] {""} ;
      P08CT14_n1955BarFasSig = new boolean[] {false} ;
      P08CT14_A151BarFasCod = new String[] {""} ;
      P08CT14_n151BarFasCod = new boolean[] {false} ;
      P08CT14_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08CT14_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08CT14_A130BarCodPar = new String[] {""} ;
      P08CT14_A132BarCodReo = new byte[1] ;
      P08CT14_A129BarCod = new int[1] ;
      P08CT14_A199BarPie1 = new short[1] ;
      P08CT14_A365DisDes = new String[] {""} ;
      P08CT14_A898BarPieNDes = new int[1] ;
      P08CT14_A361DisCod = new int[1] ;
      P08CT14_A13863BarFasCod2 = new String[] {""} ;
      P08CT14_n13863BarFasCod2 = new boolean[] {false} ;
      P08CT14_A396EmprCod = new String[] {""} ;
      A365DisDes = "" ;
      AV109Accesorios = "" ;
      AV123BarEncCliGrid = "" ;
      AV110ObsEnc = "" ;
      P08CT15_A396EmprCod = new String[] {""} ;
      P08CT15_A361DisCod = new int[1] ;
      P08CT15_A377DisObsTxt = new String[] {""} ;
      P08CT15_A376DisObsLin = new byte[1] ;
      A377DisObsTxt = "" ;
      AV102FasDscUlt = "" ;
      AV103FasDscSig = "" ;
      P08CT16_A396EmprCod = new String[] {""} ;
      P08CT16_A129BarCod = new int[1] ;
      P08CT16_A132BarCodReo = new byte[1] ;
      P08CT16_A130BarCodPar = new String[] {""} ;
      P08CT16_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08CT16_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08CT16_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08CT16_A1265BarAlbPie = new int[1] ;
      P08CT16_A30AlbProCod = new long[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV105AlbProFec = GXutil.nullDate() ;
      AV106BarAlbKgmE = DecimalUtil.ZERO ;
      AV107BarAlbMtrE = DecimalUtil.ZERO ;
      P08CT17_A396EmprCod = new String[] {""} ;
      P08CT17_A129BarCod = new int[1] ;
      P08CT17_A132BarCodReo = new byte[1] ;
      P08CT17_A130BarCodPar = new String[] {""} ;
      P08CT17_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08CT17_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08CT17_A30AlbProCod = new long[1] ;
      AV111Exportacion = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new short[1] ;
      AV149Tb1_dscfb = "" ;
      AV112Marca = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwcnsprodexportcsv__default(),
         new Object[] {
             new Object[] {
            P08CT14_A9713Tb1_Cod, P08CT14_A13769BarRdto4, P08CT14_n13769BarRdto4, P08CT14_A9777BarItem3, P08CT14_A1503BarPart, P08CT14_A1235BarNumCli, P08CT14_A1234BarNomCli, P08CT14_A136BarColNum, P08CT14_A157BarFecEnt, P08CT14_A1652BarSerDsc,
            P08CT14_A120BarAgrEst, P08CT14_A252CliCod, P08CT14_n252CliCod, P08CT14_A213BarSit, P08CT14_A135BarColNom, P08CT14_A212BarSer, P08CT14_A4812BarEncCli, P08CT14_A159BarFecGen, P08CT14_A279CliNom, P08CT14_A3746BarNPed,
            P08CT14_A143BarDisNum, P08CT14_A11852Nxt_ArtCl2, P08CT14_A4466BarAcaAnh, P08CT14_A13862Bar_MacCod, P08CT14_n13862Bar_MacCod, P08CT14_A13861BarMarca, P08CT14_n13861BarMarca, P08CT14_A13860BarAccesor, P08CT14_n13860BarAccesor, P08CT14_A1955BarFasSig,
            P08CT14_n1955BarFasSig, P08CT14_A151BarFasCod, P08CT14_n151BarFasCod, P08CT14_A184BarMtr, P08CT14_A166BarKgm, P08CT14_A130BarCodPar, P08CT14_A132BarCodReo, P08CT14_A129BarCod, P08CT14_A199BarPie1, P08CT14_A365DisDes,
            P08CT14_A898BarPieNDes, P08CT14_A361DisCod, P08CT14_A13863BarFasCod2, P08CT14_n13863BarFasCod2, P08CT14_A396EmprCod
            }
            , new Object[] {
            P08CT15_A396EmprCod, P08CT15_A361DisCod, P08CT15_A377DisObsTxt, P08CT15_A376DisObsLin
            }
            , new Object[] {
            P08CT16_A396EmprCod, P08CT16_A129BarCod, P08CT16_A132BarCodReo, P08CT16_A130BarCodPar, P08CT16_A34AlbProfch, P08CT16_A1261BarAlbKgmE, P08CT16_A1263BarAlbMtrE, P08CT16_A1265BarAlbPie, P08CT16_A30AlbProCod
            }
            , new Object[] {
            P08CT17_A396EmprCod, P08CT17_A129BarCod, P08CT17_A132BarCodReo, P08CT17_A130BarCodPar, P08CT17_A1261BarAlbKgmE, P08CT17_A34AlbProfch, P08CT17_A30AlbProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV160Webwcnsprodds_8_barsit ;
   private byte AV92BarSit ;
   private byte AV161Webwcnsprodds_9_barsit_to ;
   private byte AV93BarSit_To ;
   private byte AV190Webwcnsprodds_38_tfbarsit ;
   private byte AV82TFBarSit ;
   private byte AV191Webwcnsprodds_39_tfbarsit_to ;
   private byte AV83TFBarSit_To ;
   private byte A376DisObsLin ;
   private short gxcookieaux ;
   private short A4466BarAcaAnh ;
   private short A1503BarPart ;
   private short A13769BarRdto4 ;
   private short AV196Webwcnsprodds_44_tfbarpart ;
   private short AV114TFBarPart ;
   private short AV197Webwcnsprodds_45_tfbarpart_to ;
   private short AV115TFBarPart_To ;
   private short AV200Webwcnsprodds_48_tfbarrdto4 ;
   private short AV127TFBarRdto4 ;
   private short AV201Webwcnsprodds_49_tfbarrdto4_to ;
   private short AV128TFBarRdto4_To ;
   private short AV51OrderedBy ;
   private short A199BarPie1 ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int A198BarPie ;
   private int A13862Bar_MacCod ;
   private int AV162Webwcnsprodds_10_tfclicod ;
   private int AV54TFCliCod ;
   private int AV163Webwcnsprodds_11_tfclicod_to ;
   private int AV55TFCliCod_To ;
   private int AV178Webwcnsprodds_26_tfbarcolnum ;
   private int AV70TFBarColNum ;
   private int AV179Webwcnsprodds_27_tfbarcolnum_to ;
   private int AV71TFBarColNum_To ;
   private int AV182Webwcnsprodds_30_tfbarnumcli ;
   private int AV74TFBarNumCli ;
   private int AV183Webwcnsprodds_31_tfbarnumcli_to ;
   private int AV75TFBarNumCli_To ;
   private int AV188Webwcnsprodds_36_tfbarpie ;
   private int AV80TFBarPie ;
   private int AV189Webwcnsprodds_37_tfbarpie_to ;
   private int AV81TFBarPie_To ;
   private int AV215Webwcnsprodds_63_tfbar_maccod ;
   private int AV142TFBar_MacCod ;
   private int AV216Webwcnsprodds_64_tfbar_maccod_to ;
   private int AV143TFBar_MacCod_To ;
   private int A898BarPieNDes ;
   private int A361DisCod ;
   private int AV148MacCod ;
   private int A1265BarAlbPie ;
   private int AV108BarAlbPie ;
   private int GXv_int4[] ;
   private int AV224GXV1 ;
   private long AV113BarMacCod ;
   private long A30AlbProCod ;
   private long AV104AlbProcod ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV184Webwcnsprodds_32_tfbarkgm ;
   private java.math.BigDecimal AV76TFBarKgm ;
   private java.math.BigDecimal AV185Webwcnsprodds_33_tfbarkgm_to ;
   private java.math.BigDecimal AV77TFBarKgm_To ;
   private java.math.BigDecimal AV186Webwcnsprodds_34_tfbarmtr ;
   private java.math.BigDecimal AV78TFBarMtr ;
   private java.math.BigDecimal AV187Webwcnsprodds_35_tfbarmtr_to ;
   private java.math.BigDecimal AV79TFBarMtr_To ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV106BarAlbKgmE ;
   private java.math.BigDecimal AV107BarAlbMtrE ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A13696BarNHdr ;
   private String A3746BarNPed ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A151BarFasCod ;
   private String A1955BarFasSig ;
   private String A11852Nxt_ArtCl2 ;
   private String A9777BarItem3 ;
   private String A13855BarGots ;
   private String A13856BarGrs ;
   private String A13857BarOcs ;
   private String A13858BarRcs ;
   private String A13859BarOeko ;
   private String A13860BarAccesor ;
   private String A13861BarMarca ;
   private String A13863BarFasCod2 ;
   private String A13864BarFasDsc2 ;
   private String AV153Webwcnsprodds_1_barnhdr ;
   private String AV125BarNHdr ;
   private String AV154Webwcnsprodds_2_clinom ;
   private String AV95CliNom ;
   private String AV157Webwcnsprodds_5_barenccli ;
   private String AV53BarEncCli ;
   private String AV158Webwcnsprodds_6_barser ;
   private String AV120BarSer ;
   private String AV159Webwcnsprodds_7_barcolnom ;
   private String AV122BarColNom ;
   private String AV164Webwcnsprodds_12_tfclinom ;
   private String AV56TFCliNom ;
   private String AV165Webwcnsprodds_13_tfclinom_sel ;
   private String AV57TFCliNom_Sel ;
   private String AV166Webwcnsprodds_14_tfbarnhdr ;
   private String AV49TFBarNHdr ;
   private String AV167Webwcnsprodds_15_tfbarnhdr_sel ;
   private String AV50TFBarNHdr_Sel ;
   private String AV168Webwcnsprodds_16_tfbaragrest ;
   private String AV58TFBarAgrEst ;
   private String AV169Webwcnsprodds_17_tfbaragrest_sel ;
   private String AV59TFBarAgrEst_Sel ;
   private String AV170Webwcnsprodds_18_tfbarser ;
   private String AV60TFBarSer ;
   private String AV171Webwcnsprodds_19_tfbarser_sel ;
   private String AV61TFBarSer_Sel ;
   private String AV172Webwcnsprodds_20_tfbarserdsc ;
   private String AV62TFBarSerDsc ;
   private String AV173Webwcnsprodds_21_tfbarserdsc_sel ;
   private String AV63TFBarSerDsc_Sel ;
   private String AV176Webwcnsprodds_24_tfbarcolnom ;
   private String AV68TFBarColNom ;
   private String AV177Webwcnsprodds_25_tfbarcolnom_sel ;
   private String AV69TFBarColNom_Sel ;
   private String AV180Webwcnsprodds_28_tfbarnomcli ;
   private String AV72TFBarNomCli ;
   private String AV181Webwcnsprodds_29_tfbarnomcli_sel ;
   private String AV73TFBarNomCli_Sel ;
   private String AV192Webwcnsprodds_40_tfbarfascod ;
   private String AV98TFBarFasCod ;
   private String AV193Webwcnsprodds_41_tfbarfascod_sel ;
   private String AV99TFBarFasCod_Sel ;
   private String AV194Webwcnsprodds_42_tfbarfassig ;
   private String AV100TFBarFasSig ;
   private String AV195Webwcnsprodds_43_tfbarfassig_sel ;
   private String AV101TFBarFasSig_Sel ;
   private String AV198Webwcnsprodds_46_tfbaritem3 ;
   private String AV116TFBarItem3 ;
   private String AV199Webwcnsprodds_47_tfbaritem3_sel ;
   private String AV117TFBarItem3_Sel ;
   private String AV202Webwcnsprodds_50_tfbargots ;
   private String AV129TFBarGots ;
   private String AV203Webwcnsprodds_51_tfbargots_sel ;
   private String AV130TFBarGots_Sel ;
   private String AV204Webwcnsprodds_52_tfbargrs ;
   private String AV131TFBarGrs ;
   private String AV205Webwcnsprodds_53_tfbargrs_sel ;
   private String AV132TFBarGrs_Sel ;
   private String AV206Webwcnsprodds_54_tfbarocs ;
   private String AV133TFBarOcs ;
   private String AV207Webwcnsprodds_55_tfbarocs_sel ;
   private String AV134TFBarOcs_Sel ;
   private String AV208Webwcnsprodds_56_tfbarrcs ;
   private String AV135TFBarRcs ;
   private String AV209Webwcnsprodds_57_tfbarrcs_sel ;
   private String AV136TFBarRcs_Sel ;
   private String AV210Webwcnsprodds_58_tfbaroeko ;
   private String AV137TFBarOeko ;
   private String AV211Webwcnsprodds_59_tfbaroeko_sel ;
   private String AV138TFBarOeko_Sel ;
   private String AV212Webwcnsprodds_60_tfbaraccesorios_sel ;
   private String AV139TFBarAccesorios_Sel ;
   private String AV213Webwcnsprodds_61_tfbarmarca ;
   private String AV140TFBarMarca ;
   private String AV214Webwcnsprodds_62_tfbarmarca_sel ;
   private String AV141TFBarMarca_Sel ;
   private String AV217Webwcnsprodds_65_tfbarfascod2 ;
   private String AV144TFBarFasCod2 ;
   private String AV218Webwcnsprodds_66_tfbarfascod2_sel ;
   private String AV145TFBarFasCod2_Sel ;
   private String AV219Webwcnsprodds_67_tfbarfasdsc2 ;
   private String AV146TFBarFasDsc2 ;
   private String AV220Webwcnsprodds_68_tfbarfasdsc2_sel ;
   private String AV147TFBarFasDsc2_Sel ;
   private String scmdbuf ;
   private String lV192Webwcnsprodds_40_tfbarfascod ;
   private String lV194Webwcnsprodds_42_tfbarfassig ;
   private String lV213Webwcnsprodds_61_tfbarmarca ;
   private String lV217Webwcnsprodds_65_tfbarfascod2 ;
   private String lV153Webwcnsprodds_1_barnhdr ;
   private String lV154Webwcnsprodds_2_clinom ;
   private String lV157Webwcnsprodds_5_barenccli ;
   private String lV158Webwcnsprodds_6_barser ;
   private String lV159Webwcnsprodds_7_barcolnom ;
   private String lV164Webwcnsprodds_12_tfclinom ;
   private String lV166Webwcnsprodds_14_tfbarnhdr ;
   private String lV168Webwcnsprodds_16_tfbaragrest ;
   private String lV170Webwcnsprodds_18_tfbarser ;
   private String lV172Webwcnsprodds_20_tfbarserdsc ;
   private String lV176Webwcnsprodds_24_tfbarcolnom ;
   private String lV180Webwcnsprodds_28_tfbarnomcli ;
   private String lV198Webwcnsprodds_46_tfbaritem3 ;
   private String A365DisDes ;
   private String AV109Accesorios ;
   private String AV123BarEncCliGrid ;
   private String A377DisObsTxt ;
   private String AV102FasDscUlt ;
   private String AV103FasDscSig ;
   private String AV111Exportacion ;
   private String GXv_char3[] ;
   private String AV149Tb1_dscfb ;
   private String AV112Marca ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A157BarFecEnt ;
   private java.util.Date AV155Webwcnsprodds_3_barfecgen ;
   private java.util.Date AV90BarFecGen ;
   private java.util.Date AV156Webwcnsprodds_4_barfecgen_to ;
   private java.util.Date AV91BarFecGen_To ;
   private java.util.Date AV174Webwcnsprodds_22_tfbarfecgen ;
   private java.util.Date AV64TFBarFecGen ;
   private java.util.Date AV175Webwcnsprodds_23_tfbarfecent ;
   private java.util.Date AV66TFBarFecEnt ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV105AlbProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV52OrderedDsc ;
   private boolean n13769BarRdto4 ;
   private boolean n252CliCod ;
   private boolean n13862Bar_MacCod ;
   private boolean n13861BarMarca ;
   private boolean n13860BarAccesor ;
   private boolean n1955BarFasSig ;
   private boolean n151BarFasCod ;
   private boolean n13863BarFasCod2 ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV110ObsEnc ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P08CT14_A9713Tb1_Cod ;
   private short[] P08CT14_A13769BarRdto4 ;
   private boolean[] P08CT14_n13769BarRdto4 ;
   private String[] P08CT14_A9777BarItem3 ;
   private short[] P08CT14_A1503BarPart ;
   private int[] P08CT14_A1235BarNumCli ;
   private String[] P08CT14_A1234BarNomCli ;
   private int[] P08CT14_A136BarColNum ;
   private java.util.Date[] P08CT14_A157BarFecEnt ;
   private String[] P08CT14_A1652BarSerDsc ;
   private String[] P08CT14_A120BarAgrEst ;
   private int[] P08CT14_A252CliCod ;
   private boolean[] P08CT14_n252CliCod ;
   private byte[] P08CT14_A213BarSit ;
   private String[] P08CT14_A135BarColNom ;
   private String[] P08CT14_A212BarSer ;
   private String[] P08CT14_A4812BarEncCli ;
   private java.util.Date[] P08CT14_A159BarFecGen ;
   private String[] P08CT14_A279CliNom ;
   private String[] P08CT14_A3746BarNPed ;
   private String[] P08CT14_A143BarDisNum ;
   private String[] P08CT14_A11852Nxt_ArtCl2 ;
   private short[] P08CT14_A4466BarAcaAnh ;
   private int[] P08CT14_A13862Bar_MacCod ;
   private boolean[] P08CT14_n13862Bar_MacCod ;
   private String[] P08CT14_A13861BarMarca ;
   private boolean[] P08CT14_n13861BarMarca ;
   private String[] P08CT14_A13860BarAccesor ;
   private boolean[] P08CT14_n13860BarAccesor ;
   private String[] P08CT14_A1955BarFasSig ;
   private boolean[] P08CT14_n1955BarFasSig ;
   private String[] P08CT14_A151BarFasCod ;
   private boolean[] P08CT14_n151BarFasCod ;
   private java.math.BigDecimal[] P08CT14_A184BarMtr ;
   private java.math.BigDecimal[] P08CT14_A166BarKgm ;
   private String[] P08CT14_A130BarCodPar ;
   private byte[] P08CT14_A132BarCodReo ;
   private int[] P08CT14_A129BarCod ;
   private short[] P08CT14_A199BarPie1 ;
   private String[] P08CT14_A365DisDes ;
   private int[] P08CT14_A898BarPieNDes ;
   private int[] P08CT14_A361DisCod ;
   private String[] P08CT14_A13863BarFasCod2 ;
   private boolean[] P08CT14_n13863BarFasCod2 ;
   private String[] P08CT14_A396EmprCod ;
   private String[] P08CT15_A396EmprCod ;
   private int[] P08CT15_A361DisCod ;
   private String[] P08CT15_A377DisObsTxt ;
   private byte[] P08CT15_A376DisObsLin ;
   private String[] P08CT16_A396EmprCod ;
   private int[] P08CT16_A129BarCod ;
   private byte[] P08CT16_A132BarCodReo ;
   private String[] P08CT16_A130BarCodPar ;
   private java.util.Date[] P08CT16_A34AlbProfch ;
   private java.math.BigDecimal[] P08CT16_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P08CT16_A1263BarAlbMtrE ;
   private int[] P08CT16_A1265BarAlbPie ;
   private long[] P08CT16_A30AlbProCod ;
   private String[] P08CT17_A396EmprCod ;
   private int[] P08CT17_A129BarCod ;
   private byte[] P08CT17_A132BarCodReo ;
   private String[] P08CT17_A130BarCodPar ;
   private java.math.BigDecimal[] P08CT17_A1261BarAlbKgmE ;
   private java.util.Date[] P08CT17_A34AlbProfch ;
   private long[] P08CT17_A30AlbProCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
}

final  class webwcnsprodexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08CT14( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           String AV153Webwcnsprodds_1_barnhdr ,
                                           String AV154Webwcnsprodds_2_clinom ,
                                           java.util.Date AV155Webwcnsprodds_3_barfecgen ,
                                           java.util.Date AV156Webwcnsprodds_4_barfecgen_to ,
                                           String AV157Webwcnsprodds_5_barenccli ,
                                           String AV158Webwcnsprodds_6_barser ,
                                           String AV159Webwcnsprodds_7_barcolnom ,
                                           byte AV160Webwcnsprodds_8_barsit ,
                                           byte AV161Webwcnsprodds_9_barsit_to ,
                                           int AV162Webwcnsprodds_10_tfclicod ,
                                           int AV163Webwcnsprodds_11_tfclicod_to ,
                                           String AV165Webwcnsprodds_13_tfclinom_sel ,
                                           String AV164Webwcnsprodds_12_tfclinom ,
                                           String AV167Webwcnsprodds_15_tfbarnhdr_sel ,
                                           String AV166Webwcnsprodds_14_tfbarnhdr ,
                                           String AV169Webwcnsprodds_17_tfbaragrest_sel ,
                                           String AV168Webwcnsprodds_16_tfbaragrest ,
                                           String AV171Webwcnsprodds_19_tfbarser_sel ,
                                           String AV170Webwcnsprodds_18_tfbarser ,
                                           String AV173Webwcnsprodds_21_tfbarserdsc_sel ,
                                           String AV172Webwcnsprodds_20_tfbarserdsc ,
                                           java.util.Date AV174Webwcnsprodds_22_tfbarfecgen ,
                                           java.util.Date AV175Webwcnsprodds_23_tfbarfecent ,
                                           String AV177Webwcnsprodds_25_tfbarcolnom_sel ,
                                           String AV176Webwcnsprodds_24_tfbarcolnom ,
                                           int AV178Webwcnsprodds_26_tfbarcolnum ,
                                           int AV179Webwcnsprodds_27_tfbarcolnum_to ,
                                           String AV181Webwcnsprodds_29_tfbarnomcli_sel ,
                                           String AV180Webwcnsprodds_28_tfbarnomcli ,
                                           int AV182Webwcnsprodds_30_tfbarnumcli ,
                                           int AV183Webwcnsprodds_31_tfbarnumcli_to ,
                                           java.math.BigDecimal AV184Webwcnsprodds_32_tfbarkgm ,
                                           java.math.BigDecimal AV185Webwcnsprodds_33_tfbarkgm_to ,
                                           java.math.BigDecimal AV186Webwcnsprodds_34_tfbarmtr ,
                                           java.math.BigDecimal AV187Webwcnsprodds_35_tfbarmtr_to ,
                                           byte AV190Webwcnsprodds_38_tfbarsit ,
                                           byte AV191Webwcnsprodds_39_tfbarsit_to ,
                                           short AV196Webwcnsprodds_44_tfbarpart ,
                                           short AV197Webwcnsprodds_45_tfbarpart_to ,
                                           String AV199Webwcnsprodds_47_tfbaritem3_sel ,
                                           String AV198Webwcnsprodds_46_tfbaritem3 ,
                                           short AV200Webwcnsprodds_48_tfbarrdto4 ,
                                           short AV201Webwcnsprodds_49_tfbarrdto4_to ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A279CliNom ,
                                           java.util.Date A159BarFecGen ,
                                           String A4812BarEncCli ,
                                           String A212BarSer ,
                                           String A135BarColNom ,
                                           byte A213BarSit ,
                                           int A252CliCod ,
                                           String A120BarAgrEst ,
                                           String A1652BarSerDsc ,
                                           java.util.Date A157BarFecEnt ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           int A1235BarNumCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short A1503BarPart ,
                                           String A9777BarItem3 ,
                                           short A13769BarRdto4 ,
                                           short AV51OrderedBy ,
                                           boolean AV52OrderedDsc ,
                                           int AV188Webwcnsprodds_36_tfbarpie ,
                                           int A198BarPie ,
                                           int AV189Webwcnsprodds_37_tfbarpie_to ,
                                           String AV193Webwcnsprodds_41_tfbarfascod_sel ,
                                           String AV192Webwcnsprodds_40_tfbarfascod ,
                                           String A151BarFasCod ,
                                           String AV195Webwcnsprodds_43_tfbarfassig_sel ,
                                           String AV194Webwcnsprodds_42_tfbarfassig ,
                                           String A1955BarFasSig ,
                                           String AV203Webwcnsprodds_51_tfbargots_sel ,
                                           String AV202Webwcnsprodds_50_tfbargots ,
                                           String A13855BarGots ,
                                           String AV205Webwcnsprodds_53_tfbargrs_sel ,
                                           String AV204Webwcnsprodds_52_tfbargrs ,
                                           String A13856BarGrs ,
                                           String AV207Webwcnsprodds_55_tfbarocs_sel ,
                                           String AV206Webwcnsprodds_54_tfbarocs ,
                                           String A13857BarOcs ,
                                           String AV209Webwcnsprodds_57_tfbarrcs_sel ,
                                           String AV208Webwcnsprodds_56_tfbarrcs ,
                                           String A13858BarRcs ,
                                           String AV211Webwcnsprodds_59_tfbaroeko_sel ,
                                           String AV210Webwcnsprodds_58_tfbaroeko ,
                                           String A13859BarOeko ,
                                           String AV212Webwcnsprodds_60_tfbaraccesorios_sel ,
                                           String A13860BarAccesor ,
                                           String AV214Webwcnsprodds_62_tfbarmarca_sel ,
                                           String AV213Webwcnsprodds_61_tfbarmarca ,
                                           String A13861BarMarca ,
                                           int AV215Webwcnsprodds_63_tfbar_maccod ,
                                           int A13862Bar_MacCod ,
                                           int AV216Webwcnsprodds_64_tfbar_maccod_to ,
                                           String AV218Webwcnsprodds_66_tfbarfascod2_sel ,
                                           String AV217Webwcnsprodds_65_tfbarfascod2 ,
                                           String A13863BarFasCod2 ,
                                           String AV220Webwcnsprodds_68_tfbarfasdsc2_sel ,
                                           String AV219Webwcnsprodds_67_tfbarfasdsc2 ,
                                           String A13864BarFasDsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[71];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarRdto4, T1.BarItem3, T1.BarPart, T1.BarNumCli, T1.BarNomCli, T1.BarColNum, T1.BarFecEnt, T1.BarSerDsc, T1.BarAgrEst, T1.CliCod, T1.BarSit," ;
      scmdbuf += " T1.BarColNom, T1.BarSer, T1.BarEncCli, T1.BarFecGen, T3.CliNom, T1.BarNPed, T1.BarDisNum, T1.Nxt_ArtCl2, T1.BarAcaAnh, COALESCE( T2.Bar_MacCod, 0) AS Bar_MacCod," ;
      scmdbuf += " COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarFasCod2, ' ') AS BarFasSig, COALESCE( T8.BarFasCod2, ' ') AS" ;
      scmdbuf += " BarFasCod, COALESCE( T9.BarMtr, 0) AS BarMtr, COALESCE( T9.BarKgm, 0) AS BarKgm, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T9.BarPie1, 0) AS BarPie1, T1.DisDes," ;
      scmdbuf += " COALESCE( T9.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((((TXPBARCAD T1 LEFT JOIN (SELECT MIN(T10.MacCod)" ;
      scmdbuf += " AS Bar_MacCod, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod) WHERE T10.EmprCod = ? and T10.MacBarCod" ;
      scmdbuf += " = T11.BarCod and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar ) T2 ON T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN (SELECT" ;
      scmdbuf += " MIN(T10.FasCod) AS BarFasCod2, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM (TXPBARFAS T10 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod" ;
      scmdbuf += " AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin = T11.GXC1) AND (T10.BarFasEst = 2) GROUP BY T10.EmprCod, T10.BarCod," ;
      scmdbuf += " T10.BarCodReo, T10.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN" ;
      scmdbuf += " TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT COALESCE( T11.GXC2, 'N') AS BarAccesor, T10.EmprCod, T10.BarCod, T10.BarCodReo," ;
      scmdbuf += " T10.BarCodPar FROM (TXPBARCAD T10 LEFT JOIN (SELECT MIN('S') AS GXC2, T13.BarCod, T13.BarCodReo, T13.BarCodPar FROM (TXPLMACRO T12 INNER JOIN TXPBARCAD T13 ON T13.EmprCod" ;
      scmdbuf += " = T12.EmprCod) WHERE T12.EmprCod = ? and T12.MacBarCod = T13.BarCod and T12.MacBarReo = T13.BarCodReo and T12.MacBarPar = T13.BarCodPar GROUP BY T13.BarCod, T13.BarCodReo," ;
      scmdbuf += " T13.BarCodPar ) T11 ON T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod" ;
      scmdbuf += " = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2, COALESCE( T11.BarFasLin, 0) AS BarFasLin," ;
      scmdbuf += " T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM ((TXPBARFAS T10 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod AND T11.BarCod = T10.BarCod AND T11.BarCodReo" ;
      scmdbuf += " = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) INNER JOIN (SELECT MIN(T13.BarOrdLin) AS GXC4, COALESCE( T14.BarFasLin, 0) AS BarFasLin, T13.EmprCod, T13.BarCod," ;
      scmdbuf += " T13.BarCodReo, T13.BarCodPar FROM (TXPBARFAS T13 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T14 ON T14.EmprCod = T13.EmprCod AND T14.BarCod = T13.BarCod AND T14.BarCodReo = T13.BarCodReo AND T14.BarCodPar" ;
      scmdbuf += " = T13.BarCodPar) WHERE (T13.BarOrdLin >= 0) AND (T13.BarOrdLin > COALESCE( T14.BarFasLin, 0)) AND (T13.BarFasEst = 0) GROUP BY T14.BarFasLin, T13.EmprCod, T13.BarCod," ;
      scmdbuf += " T13.BarCodReo, T13.BarCodPar ) T12 ON T12.EmprCod = T10.EmprCod AND T12.BarCod = T10.BarCod AND T12.BarCodReo = T10.BarCodReo AND T12.BarCodPar = T10.BarCodPar)" ;
      scmdbuf += " WHERE (T10.BarOrdLin = T12.GXC4) AND (T10.BarOrdLin >= 0) AND (T10.BarOrdLin > COALESCE( T11.BarFasLin, 0)) AND (T10.BarFasEst = 0) GROUP BY T11.BarFasLin, T10.EmprCod," ;
      scmdbuf += " T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T10.FasCod) AS BarFasCod2, T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar FROM (TXPBARFAS T10 INNER JOIN (SELECT MAX(BarOrdLin) AS" ;
      scmdbuf += " GXC5, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T11 ON T11.EmprCod = T10.EmprCod" ;
      scmdbuf += " AND T11.BarCod = T10.BarCod AND T11.BarCodReo = T10.BarCodReo AND T11.BarCodPar = T10.BarCodPar) WHERE (T10.BarOrdLin = T11.GXC5) AND (T10.BarFasEst <> 0) GROUP" ;
      scmdbuf += " BY T10.EmprCod, T10.BarCod, T10.BarCodReo, T10.BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod = T1.BarCod AND T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T1.EmprCod AND T9.BarCod = T1.BarCod AND T9.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T9.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T8.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T8.BarFasCod2, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T7.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T7.BarFasCod2, ' ') = ?))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! (GXutil.strcmp("", AV153Webwcnsprodds_1_barnhdr)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Webwcnsprodds_2_clinom)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom like ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV155Webwcnsprodds_3_barfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV156Webwcnsprodds_4_barfecgen_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV157Webwcnsprodds_5_barenccli)==0) )
      {
         addWhere(sWhereString, "(T1.BarEncCli like ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV158Webwcnsprodds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer like ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV159Webwcnsprodds_7_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom like ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (0==AV160Webwcnsprodds_8_barsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (0==AV161Webwcnsprodds_9_barsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      if ( ! (0==AV162Webwcnsprodds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int9[37] = (byte)(1) ;
      }
      if ( ! (0==AV163Webwcnsprodds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int9[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Webwcnsprodds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV164Webwcnsprodds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Webwcnsprodds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int9[40] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV167Webwcnsprodds_15_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV166Webwcnsprodds_14_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[41] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV167Webwcnsprodds_15_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int9[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV169Webwcnsprodds_17_tfbaragrest_sel)==0) && ( ! (GXutil.strcmp("", AV168Webwcnsprodds_16_tfbaragrest)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrEst) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV169Webwcnsprodds_17_tfbaragrest_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrEst = ?)");
      }
      else
      {
         GXv_int9[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Webwcnsprodds_19_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV170Webwcnsprodds_18_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Webwcnsprodds_19_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int9[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV173Webwcnsprodds_21_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV172Webwcnsprodds_20_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV173Webwcnsprodds_21_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int9[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV174Webwcnsprodds_22_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int9[49] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV175Webwcnsprodds_23_tfbarfecent)) )
      {
         addWhere(sWhereString, "(T1.BarFecEnt >= ?)");
      }
      else
      {
         GXv_int9[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV177Webwcnsprodds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV176Webwcnsprodds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV177Webwcnsprodds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int9[52] = (byte)(1) ;
      }
      if ( ! (0==AV178Webwcnsprodds_26_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int9[53] = (byte)(1) ;
      }
      if ( ! (0==AV179Webwcnsprodds_27_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int9[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV181Webwcnsprodds_29_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV180Webwcnsprodds_28_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV181Webwcnsprodds_29_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int9[56] = (byte)(1) ;
      }
      if ( ! (0==AV182Webwcnsprodds_30_tfbarnumcli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int9[57] = (byte)(1) ;
      }
      if ( ! (0==AV183Webwcnsprodds_31_tfbarnumcli_to) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int9[58] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV184Webwcnsprodds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int9[59] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV185Webwcnsprodds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int9[60] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV186Webwcnsprodds_34_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int9[61] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV187Webwcnsprodds_35_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T9.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int9[62] = (byte)(1) ;
      }
      if ( ! (0==AV190Webwcnsprodds_38_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int9[63] = (byte)(1) ;
      }
      if ( ! (0==AV191Webwcnsprodds_39_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int9[64] = (byte)(1) ;
      }
      if ( ! (0==AV196Webwcnsprodds_44_tfbarpart) )
      {
         addWhere(sWhereString, "(T1.BarPart >= ?)");
      }
      else
      {
         GXv_int9[65] = (byte)(1) ;
      }
      if ( ! (0==AV197Webwcnsprodds_45_tfbarpart_to) )
      {
         addWhere(sWhereString, "(T1.BarPart <= ?)");
      }
      else
      {
         GXv_int9[66] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV199Webwcnsprodds_47_tfbaritem3_sel)==0) && ( ! (GXutil.strcmp("", AV198Webwcnsprodds_46_tfbaritem3)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarItem3) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[67] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV199Webwcnsprodds_47_tfbaritem3_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarItem3 = ?)");
      }
      else
      {
         GXv_int9[68] = (byte)(1) ;
      }
      if ( ! (0==AV200Webwcnsprodds_48_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int9[69] = (byte)(1) ;
      }
      if ( ! (0==AV201Webwcnsprodds_49_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int9[70] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV51OrderedBy == 1 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV51OrderedBy == 1 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV51OrderedBy == 2 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV51OrderedBy == 2 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV51OrderedBy == 3 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst" ;
      }
      else if ( ( AV51OrderedBy == 3 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrEst DESC" ;
      }
      else if ( ( AV51OrderedBy == 4 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV51OrderedBy == 4 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV51OrderedBy == 5 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV51OrderedBy == 5 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV51OrderedBy == 6 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV51OrderedBy == 6 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV51OrderedBy == 7 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecEnt" ;
      }
      else if ( ( AV51OrderedBy == 7 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecEnt DESC" ;
      }
      else if ( ( AV51OrderedBy == 8 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV51OrderedBy == 8 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV51OrderedBy == 9 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV51OrderedBy == 9 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV51OrderedBy == 10 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV51OrderedBy == 10 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV51OrderedBy == 11 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumCli" ;
      }
      else if ( ( AV51OrderedBy == 11 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumCli DESC" ;
      }
      else if ( ( AV51OrderedBy == 12 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV51OrderedBy == 12 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV51OrderedBy == 13 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarPart" ;
      }
      else if ( ( AV51OrderedBy == 13 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarPart DESC" ;
      }
      else if ( ( AV51OrderedBy == 14 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarItem3" ;
      }
      else if ( ( AV51OrderedBy == 14 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarItem3 DESC" ;
      }
      else if ( ( AV51OrderedBy == 15 ) && ! AV52OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarRdto4" ;
      }
      else if ( ( AV51OrderedBy == 15 ) && ( AV52OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarRdto4 DESC" ;
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
                  return conditional_P08CT14(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).byteValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).shortValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).intValue() , ((Number) dynConstraints[44]).byteValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.util.Date)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).intValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , (java.util.Date)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , ((Number) dynConstraints[58]).intValue() , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , ((Number) dynConstraints[61]).shortValue() , (String)dynConstraints[62] , ((Number) dynConstraints[63]).shortValue() , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , ((Number) dynConstraints[66]).intValue() , ((Number) dynConstraints[67]).intValue() , ((Number) dynConstraints[68]).intValue() , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , (String)dynConstraints[85] , (String)dynConstraints[86] , (String)dynConstraints[87] , (String)dynConstraints[88] , (String)dynConstraints[89] , (String)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] , (String)dynConstraints[93] , (String)dynConstraints[94] , ((Number) dynConstraints[95]).intValue() , ((Number) dynConstraints[96]).intValue() , ((Number) dynConstraints[97]).intValue() , (String)dynConstraints[98] , (String)dynConstraints[99] , (String)dynConstraints[100] , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08CT14", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CT15", "SELECT EmprCod, DisCod, DisObsTxt, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CT16", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbProfch, T1.BarAlbKgmE, T1.BarAlbMtrE, T1.BarAlbPie, T1.AlbProCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08CT17", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarAlbKgmE, T2.AlbProfch, T1.AlbProCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 20);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 13);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 20);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((String[]) buf[19])[0] = rslt.getString(18, 20);
               ((String[]) buf[20])[0] = rslt.getString(19, 8);
               ((String[]) buf[21])[0] = rslt.getString(20, 30);
               ((short[]) buf[22])[0] = rslt.getShort(21);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(24, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(26, 8);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(27,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(28,2);
               ((String[]) buf[35])[0] = rslt.getString(29, 1);
               ((byte[]) buf[36])[0] = rslt.getByte(30);
               ((int[]) buf[37])[0] = rslt.getInt(31);
               ((short[]) buf[38])[0] = rslt.getShort(32);
               ((String[]) buf[39])[0] = rslt.getString(33, 1);
               ((int[]) buf[40])[0] = rslt.getInt(34);
               ((int[]) buf[41])[0] = rslt.getInt(35);
               ((String[]) buf[42])[0] = rslt.getString(36, 8);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(37, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((long[]) buf[8])[0] = rslt.getLong(9);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((long[]) buf[6])[0] = rslt.getLong(7);
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
                  stmt.setString(sIdx, (String)parms[71], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 8);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[99], 11);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 20);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 16);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[106]).byteValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[107]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 11);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 11);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 1);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 16);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 16);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 26);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 26);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[120]);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[121]);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[124]).intValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[125]).intValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 13);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[127], 13);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[128]).intValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[130], 2);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[131], 2);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[132], 2);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[133], 2);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[134]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[135]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[136]).shortValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[137]).shortValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[138], 20);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 20);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[140]).shortValue());
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[141]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

