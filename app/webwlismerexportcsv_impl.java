package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwlismerexportcsv_impl extends GXWebProcedure
{
   public webwlismerexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebWlismerExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebWlismerColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WebWlismerColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Tipo Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disp Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero del Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Salida en Albaran", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Disposicion Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "4 decimales", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Gots", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Grs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ocs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Rcs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Oeko", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Acc?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Marca", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Macro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase Ult", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Desc Fase", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV104Webwlismerds_1_filterfulltext = AV79FilterFullText ;
      AV105Webwlismerds_2_barfecsal = AV64BarFecSal ;
      AV106Webwlismerds_3_barfecsal_to = AV65BarFecSal_To ;
      AV107Webwlismerds_4_clicod = AV66CliCod ;
      AV108Webwlismerds_5_clicod_to = AV67CliCod_To ;
      AV109Webwlismerds_6_barser = AV68BarSer ;
      AV110Webwlismerds_7_barser_to = AV69BarSer_To ;
      AV111Webwlismerds_8_barcolnom = AV70BarColNom ;
      AV112Webwlismerds_9_barcolnom_to = AV71BarColNom_To ;
      AV113Webwlismerds_10_barcolnum = AV72BarColNum ;
      AV114Webwlismerds_11_barcolnum_to = AV73BarColNum_To ;
      AV115Webwlismerds_12_tfclicod = AV38TFCliCod ;
      AV116Webwlismerds_13_tfclicod_to = AV39TFCliCod_To ;
      AV117Webwlismerds_14_tfclinom = AV40TFCliNom ;
      AV118Webwlismerds_15_tfclinom_sel = AV41TFCliNom_Sel ;
      AV119Webwlismerds_16_tfbarnhdr = AV42TFBarNHdr ;
      AV120Webwlismerds_17_tfbarnhdr_sel = AV43TFBarNHdr_Sel ;
      AV121Webwlismerds_18_tfbartipart = AV44TFBarTipArt ;
      AV122Webwlismerds_19_tfbartipart_to = AV45TFBarTipArt_To ;
      AV123Webwlismerds_20_tfbarser = AV48TFBarSer ;
      AV124Webwlismerds_21_tfbarser_sel = AV49TFBarSer_Sel ;
      AV125Webwlismerds_22_tfbarserdsc = AV50TFBarSerDsc ;
      AV126Webwlismerds_23_tfbarserdsc_sel = AV51TFBarSerDsc_Sel ;
      AV127Webwlismerds_24_tfbarcolnom = AV52TFBarColNom ;
      AV128Webwlismerds_25_tfbarcolnom_sel = AV53TFBarColNom_Sel ;
      AV129Webwlismerds_26_tfbarnomcli = AV54TFBarNomCli ;
      AV130Webwlismerds_27_tfbarnomcli_sel = AV55TFBarNomCli_Sel ;
      AV131Webwlismerds_28_tfbarcolnum = AV56TFBarColNum ;
      AV132Webwlismerds_29_tfbarcolnum_to = AV57TFBarColNum_To ;
      AV133Webwlismerds_30_tfbarfecsal = AV76TFBarFecSal ;
      AV134Webwlismerds_31_tfbarfeccli = AV58TFBarFecCli ;
      AV135Webwlismerds_32_tfbarkgm = AV60TFBarKgm ;
      AV136Webwlismerds_33_tfbarkgm_to = AV61TFBarKgm_To ;
      AV137Webwlismerds_34_tfbarrdto4 = AV80TFBarRdto4 ;
      AV138Webwlismerds_35_tfbarrdto4_to = AV81TFBarRdto4_To ;
      AV139Webwlismerds_36_tfbargots = AV82TFBarGots ;
      AV140Webwlismerds_37_tfbargots_sel = AV83TFBarGots_Sel ;
      AV141Webwlismerds_38_tfbargrs = AV84TFBarGrs ;
      AV142Webwlismerds_39_tfbargrs_sel = AV85TFBarGrs_Sel ;
      AV143Webwlismerds_40_tfbarocs = AV86TFBarOcs ;
      AV144Webwlismerds_41_tfbarocs_sel = AV87TFBarOcs_Sel ;
      AV145Webwlismerds_42_tfbarrcs = AV88TFBarRcs ;
      AV146Webwlismerds_43_tfbarrcs_sel = AV89TFBarRcs_Sel ;
      AV147Webwlismerds_44_tfbaroeko = AV90TFBarOeko ;
      AV148Webwlismerds_45_tfbaroeko_sel = AV91TFBarOeko_Sel ;
      AV149Webwlismerds_46_tfbaraccesorios_sel = AV92TFBarAccesorios_Sel ;
      AV150Webwlismerds_47_tfbarmarca = AV93TFBarMarca ;
      AV151Webwlismerds_48_tfbarmarca_sel = AV94TFBarMarca_Sel ;
      AV152Webwlismerds_49_tfbar_maccod = AV95TFBar_MacCod ;
      AV153Webwlismerds_50_tfbar_maccod_to = AV96TFBar_MacCod_To ;
      AV154Webwlismerds_51_tfbarfascod2 = AV97TFBarFasCod2 ;
      AV155Webwlismerds_52_tfbarfascod2_sel = AV98TFBarFasCod2_Sel ;
      AV156Webwlismerds_53_tfbarfasdsc2 = AV99TFBarFasDsc2 ;
      AV157Webwlismerds_54_tfbarfasdsc2_sel = AV100TFBarFasDsc2_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV105Webwlismerds_2_barfecsal ,
                                           AV106Webwlismerds_3_barfecsal_to ,
                                           Integer.valueOf(AV107Webwlismerds_4_clicod) ,
                                           Integer.valueOf(AV108Webwlismerds_5_clicod_to) ,
                                           AV109Webwlismerds_6_barser ,
                                           AV110Webwlismerds_7_barser_to ,
                                           AV111Webwlismerds_8_barcolnom ,
                                           AV112Webwlismerds_9_barcolnom_to ,
                                           Integer.valueOf(AV113Webwlismerds_10_barcolnum) ,
                                           Integer.valueOf(AV114Webwlismerds_11_barcolnum_to) ,
                                           Integer.valueOf(AV115Webwlismerds_12_tfclicod) ,
                                           Integer.valueOf(AV116Webwlismerds_13_tfclicod_to) ,
                                           AV118Webwlismerds_15_tfclinom_sel ,
                                           AV117Webwlismerds_14_tfclinom ,
                                           AV120Webwlismerds_17_tfbarnhdr_sel ,
                                           AV119Webwlismerds_16_tfbarnhdr ,
                                           Short.valueOf(AV121Webwlismerds_18_tfbartipart) ,
                                           Short.valueOf(AV122Webwlismerds_19_tfbartipart_to) ,
                                           AV124Webwlismerds_21_tfbarser_sel ,
                                           AV123Webwlismerds_20_tfbarser ,
                                           AV126Webwlismerds_23_tfbarserdsc_sel ,
                                           AV125Webwlismerds_22_tfbarserdsc ,
                                           AV128Webwlismerds_25_tfbarcolnom_sel ,
                                           AV127Webwlismerds_24_tfbarcolnom ,
                                           AV130Webwlismerds_27_tfbarnomcli_sel ,
                                           AV129Webwlismerds_26_tfbarnomcli ,
                                           Integer.valueOf(AV131Webwlismerds_28_tfbarcolnum) ,
                                           Integer.valueOf(AV132Webwlismerds_29_tfbarcolnum_to) ,
                                           AV133Webwlismerds_30_tfbarfecsal ,
                                           AV134Webwlismerds_31_tfbarfeccli ,
                                           AV135Webwlismerds_32_tfbarkgm ,
                                           AV136Webwlismerds_33_tfbarkgm_to ,
                                           Short.valueOf(AV137Webwlismerds_34_tfbarrdto4) ,
                                           Short.valueOf(AV138Webwlismerds_35_tfbarrdto4_to) ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A155BarFecCli ,
                                           A166BarKgm ,
                                           Short.valueOf(A13769BarRdto4) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV104Webwlismerds_1_filterfulltext ,
                                           A13696BarNHdr ,
                                           A13855BarGots ,
                                           A13856BarGrs ,
                                           A13857BarOcs ,
                                           A13858BarRcs ,
                                           A13859BarOeko ,
                                           A13861BarMarca ,
                                           Integer.valueOf(A13862Bar_MacCod) ,
                                           A13863BarFasCod2 ,
                                           A13864BarFasDsc2 ,
                                           AV140Webwlismerds_37_tfbargots_sel ,
                                           AV139Webwlismerds_36_tfbargots ,
                                           AV142Webwlismerds_39_tfbargrs_sel ,
                                           AV141Webwlismerds_38_tfbargrs ,
                                           AV144Webwlismerds_41_tfbarocs_sel ,
                                           AV143Webwlismerds_40_tfbarocs ,
                                           AV146Webwlismerds_43_tfbarrcs_sel ,
                                           AV145Webwlismerds_42_tfbarrcs ,
                                           AV148Webwlismerds_45_tfbaroeko_sel ,
                                           AV147Webwlismerds_44_tfbaroeko ,
                                           AV149Webwlismerds_46_tfbaraccesorios_sel ,
                                           A13860BarAccesor ,
                                           AV151Webwlismerds_48_tfbarmarca_sel ,
                                           AV150Webwlismerds_47_tfbarmarca ,
                                           Integer.valueOf(AV152Webwlismerds_49_tfbar_maccod) ,
                                           Integer.valueOf(AV153Webwlismerds_50_tfbar_maccod_to) ,
                                           AV155Webwlismerds_52_tfbarfascod2_sel ,
                                           AV154Webwlismerds_51_tfbarfascod2 ,
                                           AV157Webwlismerds_54_tfbarfasdsc2_sel ,
                                           AV156Webwlismerds_53_tfbarfasdsc2 } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV150Webwlismerds_47_tfbarmarca = GXutil.padr( GXutil.rtrim( AV150Webwlismerds_47_tfbarmarca), 30, "%") ;
      lV154Webwlismerds_51_tfbarfascod2 = GXutil.padr( GXutil.rtrim( AV154Webwlismerds_51_tfbarfascod2), 8, "%") ;
      lV117Webwlismerds_14_tfclinom = GXutil.padr( GXutil.rtrim( AV117Webwlismerds_14_tfclinom), 30, "%") ;
      lV119Webwlismerds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV119Webwlismerds_16_tfbarnhdr), 11, "%") ;
      lV123Webwlismerds_20_tfbarser = GXutil.padr( GXutil.rtrim( AV123Webwlismerds_20_tfbarser), 16, "%") ;
      lV125Webwlismerds_22_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV125Webwlismerds_22_tfbarserdsc), 26, "%") ;
      lV127Webwlismerds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV127Webwlismerds_24_tfbarcolnom), 13, "%") ;
      lV129Webwlismerds_26_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV129Webwlismerds_26_tfbarnomcli), 13, "%") ;
      /* Using cursor P08FK8 */
      pr_default.execute(0, new Object[] {A396EmprCod, A396EmprCod, AV149Webwlismerds_46_tfbaraccesorios_sel, AV149Webwlismerds_46_tfbaraccesorios_sel, AV151Webwlismerds_48_tfbarmarca_sel, AV150Webwlismerds_47_tfbarmarca, lV150Webwlismerds_47_tfbarmarca, AV151Webwlismerds_48_tfbarmarca_sel, AV151Webwlismerds_48_tfbarmarca_sel, Integer.valueOf(AV152Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV152Webwlismerds_49_tfbar_maccod), Integer.valueOf(AV153Webwlismerds_50_tfbar_maccod_to), Integer.valueOf(AV153Webwlismerds_50_tfbar_maccod_to), AV155Webwlismerds_52_tfbarfascod2_sel, AV154Webwlismerds_51_tfbarfascod2, lV154Webwlismerds_51_tfbarfascod2, AV155Webwlismerds_52_tfbarfascod2_sel, AV155Webwlismerds_52_tfbarfascod2_sel, AV105Webwlismerds_2_barfecsal, AV106Webwlismerds_3_barfecsal_to, Integer.valueOf(AV107Webwlismerds_4_clicod), Integer.valueOf(AV108Webwlismerds_5_clicod_to), AV109Webwlismerds_6_barser, AV110Webwlismerds_7_barser_to, AV111Webwlismerds_8_barcolnom, AV112Webwlismerds_9_barcolnom_to, Integer.valueOf(AV113Webwlismerds_10_barcolnum), Integer.valueOf(AV114Webwlismerds_11_barcolnum_to), Integer.valueOf(AV115Webwlismerds_12_tfclicod), Integer.valueOf(AV116Webwlismerds_13_tfclicod_to), lV117Webwlismerds_14_tfclinom, AV118Webwlismerds_15_tfclinom_sel, lV119Webwlismerds_16_tfbarnhdr, AV120Webwlismerds_17_tfbarnhdr_sel, Short.valueOf(AV121Webwlismerds_18_tfbartipart), Short.valueOf(AV122Webwlismerds_19_tfbartipart_to), lV123Webwlismerds_20_tfbarser, AV124Webwlismerds_21_tfbarser_sel, lV125Webwlismerds_22_tfbarserdsc, AV126Webwlismerds_23_tfbarserdsc_sel, lV127Webwlismerds_24_tfbarcolnom, AV128Webwlismerds_25_tfbarcolnom_sel, lV129Webwlismerds_26_tfbarnomcli, AV130Webwlismerds_27_tfbarnomcli_sel, Integer.valueOf(AV131Webwlismerds_28_tfbarcolnum), Integer.valueOf(AV132Webwlismerds_29_tfbarcolnum_to), AV133Webwlismerds_30_tfbarfecsal, AV134Webwlismerds_31_tfbarfeccli, AV135Webwlismerds_32_tfbarkgm, AV136Webwlismerds_33_tfbarkgm_to, Short.valueOf(AV137Webwlismerds_34_tfbarrdto4), Short.valueOf(AV138Webwlismerds_35_tfbarrdto4_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4466BarAcaAnh = P08FK8_A4466BarAcaAnh[0] ;
         A13769BarRdto4 = P08FK8_A13769BarRdto4[0] ;
         n13769BarRdto4 = P08FK8_n13769BarRdto4[0] ;
         A155BarFecCli = P08FK8_A155BarFecCli[0] ;
         A1234BarNomCli = P08FK8_A1234BarNomCli[0] ;
         A1652BarSerDsc = P08FK8_A1652BarSerDsc[0] ;
         A217BarTipArt = P08FK8_A217BarTipArt[0] ;
         n217BarTipArt = P08FK8_n217BarTipArt[0] ;
         A13696BarNHdr = P08FK8_A13696BarNHdr[0] ;
         A279CliNom = P08FK8_A279CliNom[0] ;
         A136BarColNum = P08FK8_A136BarColNum[0] ;
         A135BarColNom = P08FK8_A135BarColNom[0] ;
         A212BarSer = P08FK8_A212BarSer[0] ;
         A252CliCod = P08FK8_A252CliCod[0] ;
         n252CliCod = P08FK8_n252CliCod[0] ;
         A161BarFecSal = P08FK8_A161BarFecSal[0] ;
         A143BarDisNum = P08FK8_A143BarDisNum[0] ;
         A4812BarEncCli = P08FK8_A4812BarEncCli[0] ;
         A13862Bar_MacCod = P08FK8_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FK8_n13862Bar_MacCod[0] ;
         A13861BarMarca = P08FK8_A13861BarMarca[0] ;
         n13861BarMarca = P08FK8_n13861BarMarca[0] ;
         A13860BarAccesor = P08FK8_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FK8_n13860BarAccesor[0] ;
         A166BarKgm = P08FK8_A166BarKgm[0] ;
         n166BarKgm = P08FK8_n166BarKgm[0] ;
         A129BarCod = P08FK8_A129BarCod[0] ;
         A132BarCodReo = P08FK8_A132BarCodReo[0] ;
         A130BarCodPar = P08FK8_A130BarCodPar[0] ;
         A361DisCod = P08FK8_A361DisCod[0] ;
         A13863BarFasCod2 = P08FK8_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FK8_n13863BarFasCod2[0] ;
         A396EmprCod = P08FK8_A396EmprCod[0] ;
         A13862Bar_MacCod = P08FK8_A13862Bar_MacCod[0] ;
         n13862Bar_MacCod = P08FK8_n13862Bar_MacCod[0] ;
         A279CliNom = P08FK8_A279CliNom[0] ;
         A13863BarFasCod2 = P08FK8_A13863BarFasCod2[0] ;
         n13863BarFasCod2 = P08FK8_n13863BarFasCod2[0] ;
         A13861BarMarca = P08FK8_A13861BarMarca[0] ;
         n13861BarMarca = P08FK8_n13861BarMarca[0] ;
         A13860BarAccesor = P08FK8_A13860BarAccesor[0] ;
         n13860BarAccesor = P08FK8_n13860BarAccesor[0] ;
         A166BarKgm = P08FK8_A166BarKgm[0] ;
         n166BarKgm = P08FK8_n166BarKgm[0] ;
         GXt_char2 = A13855BarGots ;
         GXv_char3[0] = GXt_char2 ;
         new app.recuperonormagots(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
         webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         A13855BarGots = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV140Webwlismerds_37_tfbargots_sel)==0) && ( ! (GXutil.strcmp("", AV139Webwlismerds_36_tfbargots)==0) ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV139Webwlismerds_36_tfbargots) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV140Webwlismerds_37_tfbargots_sel)==0) || ( ( GXutil.strcmp(A13855BarGots, AV140Webwlismerds_37_tfbargots_sel) == 0 ) ) )
            {
               GXt_char2 = A13856BarGrs ;
               GXv_char3[0] = GXt_char2 ;
               new app.recuperonormagrs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
               webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               A13856BarGrs = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV142Webwlismerds_39_tfbargrs_sel)==0) && ( ! (GXutil.strcmp("", AV141Webwlismerds_38_tfbargrs)==0) ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV141Webwlismerds_38_tfbargrs) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV142Webwlismerds_39_tfbargrs_sel)==0) || ( ( GXutil.strcmp(A13856BarGrs, AV142Webwlismerds_39_tfbargrs_sel) == 0 ) ) )
                  {
                     GXt_char2 = A13857BarOcs ;
                     GXv_char3[0] = GXt_char2 ;
                     new app.recuperonormaocs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                     webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                     A13857BarOcs = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV144Webwlismerds_41_tfbarocs_sel)==0) && ( ! (GXutil.strcmp("", AV143Webwlismerds_40_tfbarocs)==0) ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV143Webwlismerds_40_tfbarocs) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV144Webwlismerds_41_tfbarocs_sel)==0) || ( ( GXutil.strcmp(A13857BarOcs, AV144Webwlismerds_41_tfbarocs_sel) == 0 ) ) )
                        {
                           GXt_char2 = A13858BarRcs ;
                           GXv_char3[0] = GXt_char2 ;
                           new app.recuperonormarcs(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                           webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                           A13858BarRcs = GXt_char2 ;
                           if ( ! ( (GXutil.strcmp("", AV146Webwlismerds_43_tfbarrcs_sel)==0) && ( ! (GXutil.strcmp("", AV145Webwlismerds_42_tfbarrcs)==0) ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV145Webwlismerds_42_tfbarrcs) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV146Webwlismerds_43_tfbarrcs_sel)==0) || ( ( GXutil.strcmp(A13858BarRcs, AV146Webwlismerds_43_tfbarrcs_sel) == 0 ) ) )
                              {
                                 GXt_char2 = A13859BarOeko ;
                                 GXv_char3[0] = GXt_char2 ;
                                 new app.recuperonormaoeko(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char3) ;
                                 webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                 A13859BarOeko = GXt_char2 ;
                                 if ( ! ( (GXutil.strcmp("", AV148Webwlismerds_45_tfbaroeko_sel)==0) && ( ! (GXutil.strcmp("", AV147Webwlismerds_44_tfbaroeko)==0) ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV147Webwlismerds_44_tfbaroeko) , 255 , "%"),  ' ' ) ) )
                                 {
                                    if ( (GXutil.strcmp("", AV148Webwlismerds_45_tfbaroeko_sel)==0) || ( ( GXutil.strcmp(A13859BarOeko, AV148Webwlismerds_45_tfbaroeko_sel) == 0 ) ) )
                                    {
                                       GXt_char2 = A13864BarFasDsc2 ;
                                       GXv_char3[0] = GXt_char2 ;
                                       new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A13863BarFasCod2, GXv_char3) ;
                                       webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                       A13864BarFasDsc2 = GXt_char2 ;
                                       if ( (GXutil.strcmp("", AV104Webwlismerds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV104Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV104Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV104Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV104Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13769BarRdto4, 4, 0) , GXutil.padr( "%" + AV104Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13855BarGots) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13856BarGrs) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13857BarOcs) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13858BarRcs) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13859BarOeko) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13861BarMarca) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13862Bar_MacCod, 8, 0) , GXutil.padr( "%" + AV104Webwlismerds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13863BarFasCod2) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV104Webwlismerds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
                                       {
                                          if ( ! ( (GXutil.strcmp("", AV157Webwlismerds_54_tfbarfasdsc2_sel)==0) && ( ! (GXutil.strcmp("", AV156Webwlismerds_53_tfbarfasdsc2)==0) ) ) || ( GXutil.like( GXutil.upper( A13864BarFasDsc2) , GXutil.padr( "%" + GXutil.upper( AV156Webwlismerds_53_tfbarfasdsc2) , 255 , "%"),  ' ' ) ) )
                                          {
                                             if ( (GXutil.strcmp("", AV157Webwlismerds_54_tfbarfasdsc2_sel)==0) || ( ( GXutil.strcmp(A13864BarFasDsc2, AV157Webwlismerds_54_tfbarfasdsc2_sel) == 0 ) ) )
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
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   AV14TextFileLine += GXutil.str( A217BarTipArt, 4, 0) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   GXt_char2 = AV78TipArtDsc ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV78TipArtDsc = GXt_char2 ;
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV78TipArtDsc, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV30BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30BarEncCli, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   AV14TextFileLine += localUtil.dtoc( A161BarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   AV14TextFileLine += localUtil.dtoc( A155BarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   AV14TextFileLine += GXutil.str( A166BarKgm, 9, 2) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   AV14TextFileLine += GXutil.str( A13769BarRdto4, 4, 0) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13855BarGots, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13856BarGrs, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13857BarOcs, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13858BarRcs, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13859BarOeko, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13860BarAccesor, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13861BarMarca, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   AV14TextFileLine += GXutil.str( A13862Bar_MacCod, 8, 0) ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13863BarFasCod2, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                                                   AV14TextFileLine += GXt_char2 ;
                                                }
                                                if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                                {
                                                   AV14TextFileLine += ";" ;
                                                   GXt_char2 = AV14TextFileLine ;
                                                   GXv_char3[0] = GXt_char2 ;
                                                   new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13864BarFasDsc2, ";", ","), GXv_char3) ;
                                                   webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebWlismerExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNHdr", "", "N° Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarTipArt", "", "Codigo Tipo Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&TipArtDsc", "", "Descripción", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&BarEncCli", "", "Disp Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSer", "", "Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarColNom", "", "Nombre Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarColNum", "", "Numero del Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarFecSal", "", "Fecha Salida en Albaran", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarFecCli", "", "Fecha Disposicion Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarKgm", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarRdto4", "", "4 decimales", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarGots", "", "Gots", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarGrs", "", "Grs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarOcs", "", "Ocs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarRcs", "", "Rcs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarOeko", "", "Oeko", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarAccesorios", "", "Acc?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarMarca", "", "Marca", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Bar_MacCod", "", "Macro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarFasCod2", "", "Fase Ult", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarFasDsc2", "", "Desc Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWlismerColumnsSelector", GXv_char3) ;
      webwlismerexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebWlismerGridState"), "") == 0 )
      {
         AV36GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWlismerGridState"), null, null);
      }
      else
      {
         AV36GridState.fromxml(AV19Session.getValue("WebWlismerGridState"), null, null);
      }
      AV28OrderedBy = AV36GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV36GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV158GXV1 = 1 ;
      while ( AV158GXV1 <= AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV37GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV36GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV158GXV1));
         if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV79FilterFullText = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARFECSAL") == 0 )
         {
            AV64BarFecSal = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV65BarFecSal_To = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "CLICOD") == 0 )
         {
            AV66CliCod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67CliCod_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSER") == 0 )
         {
            AV68BarSer = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV69BarSer_To = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNOM") == 0 )
         {
            AV70BarColNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV71BarColNom_To = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNUM") == 0 )
         {
            AV72BarColNum = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73BarColNum_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV38TFCliCod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV39TFCliCod_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV40TFCliNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV41TFCliNom_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV42TFBarNHdr = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV43TFBarNHdr_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV44TFBarTipArt = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFBarTipArt_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV48TFBarSer = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV49TFBarSer_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV50TFBarSerDsc = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV51TFBarSerDsc_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV52TFBarColNom = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV53TFBarColNom_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV54TFBarNomCli = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV55TFBarNomCli_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV56TFBarColNum = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFBarColNum_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV76TFBarFecSal = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV58TFBarFecCli = localUtil.ctod( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV60TFBarKgm = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV61TFBarKgm_To = CommonUtil.decimalVal( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRDTO4") == 0 )
         {
            AV80TFBarRdto4 = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV81TFBarRdto4_To = (short)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS") == 0 )
         {
            AV82TFBarGots = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGOTS_SEL") == 0 )
         {
            AV83TFBarGots_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS") == 0 )
         {
            AV84TFBarGrs = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARGRS_SEL") == 0 )
         {
            AV85TFBarGrs_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS") == 0 )
         {
            AV86TFBarOcs = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROCS_SEL") == 0 )
         {
            AV87TFBarOcs_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS") == 0 )
         {
            AV88TFBarRcs = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARRCS_SEL") == 0 )
         {
            AV89TFBarRcs_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO") == 0 )
         {
            AV90TFBarOeko = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAROEKO_SEL") == 0 )
         {
            AV91TFBarOeko_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARACCESORIOS_SEL") == 0 )
         {
            AV92TFBarAccesorios_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA") == 0 )
         {
            AV93TFBarMarca = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMARCA_SEL") == 0 )
         {
            AV94TFBarMarca_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBAR_MACCOD") == 0 )
         {
            AV95TFBar_MacCod = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV96TFBar_MacCod_To = (int)(GXutil.lval( AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2") == 0 )
         {
            AV97TFBarFasCod2 = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD2_SEL") == 0 )
         {
            AV98TFBarFasCod2_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2") == 0 )
         {
            AV99TFBarFasDsc2 = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASDSC2_SEL") == 0 )
         {
            AV100TFBarFasDsc2_Sel = AV37GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV158GXV1 = (int)(AV158GXV1+1) ;
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
      A396EmprCod = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A13855BarGots = "" ;
      A13856BarGrs = "" ;
      A13857BarOcs = "" ;
      A13858BarRcs = "" ;
      A13859BarOeko = "" ;
      A13860BarAccesor = "" ;
      A13861BarMarca = "" ;
      A13863BarFasCod2 = "" ;
      A13864BarFasDsc2 = "" ;
      AV104Webwlismerds_1_filterfulltext = "" ;
      AV79FilterFullText = "" ;
      AV105Webwlismerds_2_barfecsal = GXutil.nullDate() ;
      AV64BarFecSal = GXutil.nullDate() ;
      AV106Webwlismerds_3_barfecsal_to = GXutil.nullDate() ;
      AV65BarFecSal_To = GXutil.nullDate() ;
      AV109Webwlismerds_6_barser = "" ;
      AV68BarSer = "" ;
      AV110Webwlismerds_7_barser_to = "" ;
      AV69BarSer_To = "" ;
      AV111Webwlismerds_8_barcolnom = "" ;
      AV70BarColNom = "" ;
      AV112Webwlismerds_9_barcolnom_to = "" ;
      AV71BarColNom_To = "" ;
      AV117Webwlismerds_14_tfclinom = "" ;
      AV40TFCliNom = "" ;
      AV118Webwlismerds_15_tfclinom_sel = "" ;
      AV41TFCliNom_Sel = "" ;
      AV119Webwlismerds_16_tfbarnhdr = "" ;
      AV42TFBarNHdr = "" ;
      AV120Webwlismerds_17_tfbarnhdr_sel = "" ;
      AV43TFBarNHdr_Sel = "" ;
      AV123Webwlismerds_20_tfbarser = "" ;
      AV48TFBarSer = "" ;
      AV124Webwlismerds_21_tfbarser_sel = "" ;
      AV49TFBarSer_Sel = "" ;
      AV125Webwlismerds_22_tfbarserdsc = "" ;
      AV50TFBarSerDsc = "" ;
      AV126Webwlismerds_23_tfbarserdsc_sel = "" ;
      AV51TFBarSerDsc_Sel = "" ;
      AV127Webwlismerds_24_tfbarcolnom = "" ;
      AV52TFBarColNom = "" ;
      AV128Webwlismerds_25_tfbarcolnom_sel = "" ;
      AV53TFBarColNom_Sel = "" ;
      AV129Webwlismerds_26_tfbarnomcli = "" ;
      AV54TFBarNomCli = "" ;
      AV130Webwlismerds_27_tfbarnomcli_sel = "" ;
      AV55TFBarNomCli_Sel = "" ;
      AV133Webwlismerds_30_tfbarfecsal = GXutil.nullDate() ;
      AV76TFBarFecSal = GXutil.nullDate() ;
      AV134Webwlismerds_31_tfbarfeccli = GXutil.nullDate() ;
      AV58TFBarFecCli = GXutil.nullDate() ;
      AV135Webwlismerds_32_tfbarkgm = DecimalUtil.ZERO ;
      AV60TFBarKgm = DecimalUtil.ZERO ;
      AV136Webwlismerds_33_tfbarkgm_to = DecimalUtil.ZERO ;
      AV61TFBarKgm_To = DecimalUtil.ZERO ;
      AV139Webwlismerds_36_tfbargots = "" ;
      AV82TFBarGots = "" ;
      AV140Webwlismerds_37_tfbargots_sel = "" ;
      AV83TFBarGots_Sel = "" ;
      AV141Webwlismerds_38_tfbargrs = "" ;
      AV84TFBarGrs = "" ;
      AV142Webwlismerds_39_tfbargrs_sel = "" ;
      AV85TFBarGrs_Sel = "" ;
      AV143Webwlismerds_40_tfbarocs = "" ;
      AV86TFBarOcs = "" ;
      AV144Webwlismerds_41_tfbarocs_sel = "" ;
      AV87TFBarOcs_Sel = "" ;
      AV145Webwlismerds_42_tfbarrcs = "" ;
      AV88TFBarRcs = "" ;
      AV146Webwlismerds_43_tfbarrcs_sel = "" ;
      AV89TFBarRcs_Sel = "" ;
      AV147Webwlismerds_44_tfbaroeko = "" ;
      AV90TFBarOeko = "" ;
      AV148Webwlismerds_45_tfbaroeko_sel = "" ;
      AV91TFBarOeko_Sel = "" ;
      AV149Webwlismerds_46_tfbaraccesorios_sel = "" ;
      AV92TFBarAccesorios_Sel = "" ;
      AV150Webwlismerds_47_tfbarmarca = "" ;
      AV93TFBarMarca = "" ;
      AV151Webwlismerds_48_tfbarmarca_sel = "" ;
      AV94TFBarMarca_Sel = "" ;
      AV154Webwlismerds_51_tfbarfascod2 = "" ;
      AV97TFBarFasCod2 = "" ;
      AV155Webwlismerds_52_tfbarfascod2_sel = "" ;
      AV98TFBarFasCod2_Sel = "" ;
      AV156Webwlismerds_53_tfbarfasdsc2 = "" ;
      AV99TFBarFasDsc2 = "" ;
      AV157Webwlismerds_54_tfbarfasdsc2_sel = "" ;
      AV100TFBarFasDsc2_Sel = "" ;
      scmdbuf = "" ;
      lV150Webwlismerds_47_tfbarmarca = "" ;
      lV154Webwlismerds_51_tfbarfascod2 = "" ;
      lV117Webwlismerds_14_tfclinom = "" ;
      lV119Webwlismerds_16_tfbarnhdr = "" ;
      lV123Webwlismerds_20_tfbarser = "" ;
      lV125Webwlismerds_22_tfbarserdsc = "" ;
      lV127Webwlismerds_24_tfbarcolnom = "" ;
      lV129Webwlismerds_26_tfbarnomcli = "" ;
      A130BarCodPar = "" ;
      P08FK8_A9713Tb1_Cod = new short[1] ;
      P08FK8_A4466BarAcaAnh = new short[1] ;
      P08FK8_A13769BarRdto4 = new short[1] ;
      P08FK8_n13769BarRdto4 = new boolean[] {false} ;
      P08FK8_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P08FK8_A1234BarNomCli = new String[] {""} ;
      P08FK8_A1652BarSerDsc = new String[] {""} ;
      P08FK8_A217BarTipArt = new short[1] ;
      P08FK8_n217BarTipArt = new boolean[] {false} ;
      P08FK8_A13696BarNHdr = new String[] {""} ;
      P08FK8_A279CliNom = new String[] {""} ;
      P08FK8_A136BarColNum = new int[1] ;
      P08FK8_A135BarColNom = new String[] {""} ;
      P08FK8_A212BarSer = new String[] {""} ;
      P08FK8_A252CliCod = new int[1] ;
      P08FK8_n252CliCod = new boolean[] {false} ;
      P08FK8_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P08FK8_A143BarDisNum = new String[] {""} ;
      P08FK8_A4812BarEncCli = new String[] {""} ;
      P08FK8_A13862Bar_MacCod = new int[1] ;
      P08FK8_n13862Bar_MacCod = new boolean[] {false} ;
      P08FK8_A13861BarMarca = new String[] {""} ;
      P08FK8_n13861BarMarca = new boolean[] {false} ;
      P08FK8_A13860BarAccesor = new String[] {""} ;
      P08FK8_n13860BarAccesor = new boolean[] {false} ;
      P08FK8_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08FK8_n166BarKgm = new boolean[] {false} ;
      P08FK8_A129BarCod = new int[1] ;
      P08FK8_A132BarCodReo = new byte[1] ;
      P08FK8_A130BarCodPar = new String[] {""} ;
      P08FK8_A361DisCod = new int[1] ;
      P08FK8_A13863BarFasCod2 = new String[] {""} ;
      P08FK8_n13863BarFasCod2 = new boolean[] {false} ;
      P08FK8_A396EmprCod = new String[] {""} ;
      AV78TipArtDsc = "" ;
      AV30BarEncCli = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV36GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV37GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwlismerexportcsv__default(),
         new Object[] {
             new Object[] {
            P08FK8_A9713Tb1_Cod, P08FK8_A4466BarAcaAnh, P08FK8_A13769BarRdto4, P08FK8_n13769BarRdto4, P08FK8_A155BarFecCli, P08FK8_A1234BarNomCli, P08FK8_A1652BarSerDsc, P08FK8_A217BarTipArt, P08FK8_n217BarTipArt, P08FK8_A13696BarNHdr,
            P08FK8_A279CliNom, P08FK8_A136BarColNum, P08FK8_A135BarColNom, P08FK8_A212BarSer, P08FK8_A252CliCod, P08FK8_n252CliCod, P08FK8_A161BarFecSal, P08FK8_A143BarDisNum, P08FK8_A4812BarEncCli, P08FK8_A13862Bar_MacCod,
            P08FK8_n13862Bar_MacCod, P08FK8_A13861BarMarca, P08FK8_n13861BarMarca, P08FK8_A13860BarAccesor, P08FK8_n13860BarAccesor, P08FK8_A166BarKgm, P08FK8_n166BarKgm, P08FK8_A129BarCod, P08FK8_A132BarCodReo, P08FK8_A130BarCodPar,
            P08FK8_A361DisCod, P08FK8_A13863BarFasCod2, P08FK8_n13863BarFasCod2, P08FK8_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A217BarTipArt ;
   private short A13769BarRdto4 ;
   private short AV121Webwlismerds_18_tfbartipart ;
   private short AV44TFBarTipArt ;
   private short AV122Webwlismerds_19_tfbartipart_to ;
   private short AV45TFBarTipArt_To ;
   private short AV137Webwlismerds_34_tfbarrdto4 ;
   private short AV80TFBarRdto4 ;
   private short AV138Webwlismerds_35_tfbarrdto4_to ;
   private short AV81TFBarRdto4_To ;
   private short AV28OrderedBy ;
   private short A4466BarAcaAnh ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A13862Bar_MacCod ;
   private int AV107Webwlismerds_4_clicod ;
   private int AV66CliCod ;
   private int AV108Webwlismerds_5_clicod_to ;
   private int AV67CliCod_To ;
   private int AV113Webwlismerds_10_barcolnum ;
   private int AV72BarColNum ;
   private int AV114Webwlismerds_11_barcolnum_to ;
   private int AV73BarColNum_To ;
   private int AV115Webwlismerds_12_tfclicod ;
   private int AV38TFCliCod ;
   private int AV116Webwlismerds_13_tfclicod_to ;
   private int AV39TFCliCod_To ;
   private int AV131Webwlismerds_28_tfbarcolnum ;
   private int AV56TFBarColNum ;
   private int AV132Webwlismerds_29_tfbarcolnum_to ;
   private int AV57TFBarColNum_To ;
   private int AV152Webwlismerds_49_tfbar_maccod ;
   private int AV95TFBar_MacCod ;
   private int AV153Webwlismerds_50_tfbar_maccod_to ;
   private int AV96TFBar_MacCod_To ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV158GXV1 ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal AV135Webwlismerds_32_tfbarkgm ;
   private java.math.BigDecimal AV60TFBarKgm ;
   private java.math.BigDecimal AV136Webwlismerds_33_tfbarkgm_to ;
   private java.math.BigDecimal AV61TFBarKgm_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A13696BarNHdr ;
   private String A396EmprCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A13855BarGots ;
   private String A13856BarGrs ;
   private String A13857BarOcs ;
   private String A13858BarRcs ;
   private String A13859BarOeko ;
   private String A13860BarAccesor ;
   private String A13861BarMarca ;
   private String A13863BarFasCod2 ;
   private String A13864BarFasDsc2 ;
   private String AV109Webwlismerds_6_barser ;
   private String AV68BarSer ;
   private String AV110Webwlismerds_7_barser_to ;
   private String AV69BarSer_To ;
   private String AV111Webwlismerds_8_barcolnom ;
   private String AV70BarColNom ;
   private String AV112Webwlismerds_9_barcolnom_to ;
   private String AV71BarColNom_To ;
   private String AV117Webwlismerds_14_tfclinom ;
   private String AV40TFCliNom ;
   private String AV118Webwlismerds_15_tfclinom_sel ;
   private String AV41TFCliNom_Sel ;
   private String AV119Webwlismerds_16_tfbarnhdr ;
   private String AV42TFBarNHdr ;
   private String AV120Webwlismerds_17_tfbarnhdr_sel ;
   private String AV43TFBarNHdr_Sel ;
   private String AV123Webwlismerds_20_tfbarser ;
   private String AV48TFBarSer ;
   private String AV124Webwlismerds_21_tfbarser_sel ;
   private String AV49TFBarSer_Sel ;
   private String AV125Webwlismerds_22_tfbarserdsc ;
   private String AV50TFBarSerDsc ;
   private String AV126Webwlismerds_23_tfbarserdsc_sel ;
   private String AV51TFBarSerDsc_Sel ;
   private String AV127Webwlismerds_24_tfbarcolnom ;
   private String AV52TFBarColNom ;
   private String AV128Webwlismerds_25_tfbarcolnom_sel ;
   private String AV53TFBarColNom_Sel ;
   private String AV129Webwlismerds_26_tfbarnomcli ;
   private String AV54TFBarNomCli ;
   private String AV130Webwlismerds_27_tfbarnomcli_sel ;
   private String AV55TFBarNomCli_Sel ;
   private String AV139Webwlismerds_36_tfbargots ;
   private String AV82TFBarGots ;
   private String AV140Webwlismerds_37_tfbargots_sel ;
   private String AV83TFBarGots_Sel ;
   private String AV141Webwlismerds_38_tfbargrs ;
   private String AV84TFBarGrs ;
   private String AV142Webwlismerds_39_tfbargrs_sel ;
   private String AV85TFBarGrs_Sel ;
   private String AV143Webwlismerds_40_tfbarocs ;
   private String AV86TFBarOcs ;
   private String AV144Webwlismerds_41_tfbarocs_sel ;
   private String AV87TFBarOcs_Sel ;
   private String AV145Webwlismerds_42_tfbarrcs ;
   private String AV88TFBarRcs ;
   private String AV146Webwlismerds_43_tfbarrcs_sel ;
   private String AV89TFBarRcs_Sel ;
   private String AV147Webwlismerds_44_tfbaroeko ;
   private String AV90TFBarOeko ;
   private String AV148Webwlismerds_45_tfbaroeko_sel ;
   private String AV91TFBarOeko_Sel ;
   private String AV149Webwlismerds_46_tfbaraccesorios_sel ;
   private String AV92TFBarAccesorios_Sel ;
   private String AV150Webwlismerds_47_tfbarmarca ;
   private String AV93TFBarMarca ;
   private String AV151Webwlismerds_48_tfbarmarca_sel ;
   private String AV94TFBarMarca_Sel ;
   private String AV154Webwlismerds_51_tfbarfascod2 ;
   private String AV97TFBarFasCod2 ;
   private String AV155Webwlismerds_52_tfbarfascod2_sel ;
   private String AV98TFBarFasCod2_Sel ;
   private String AV156Webwlismerds_53_tfbarfasdsc2 ;
   private String AV99TFBarFasDsc2 ;
   private String AV157Webwlismerds_54_tfbarfasdsc2_sel ;
   private String AV100TFBarFasDsc2_Sel ;
   private String scmdbuf ;
   private String lV150Webwlismerds_47_tfbarmarca ;
   private String lV154Webwlismerds_51_tfbarfascod2 ;
   private String lV117Webwlismerds_14_tfclinom ;
   private String lV119Webwlismerds_16_tfbarnhdr ;
   private String lV123Webwlismerds_20_tfbarser ;
   private String lV125Webwlismerds_22_tfbarserdsc ;
   private String lV127Webwlismerds_24_tfbarcolnom ;
   private String lV129Webwlismerds_26_tfbarnomcli ;
   private String A130BarCodPar ;
   private String AV78TipArtDsc ;
   private String AV30BarEncCli ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date AV105Webwlismerds_2_barfecsal ;
   private java.util.Date AV64BarFecSal ;
   private java.util.Date AV106Webwlismerds_3_barfecsal_to ;
   private java.util.Date AV65BarFecSal_To ;
   private java.util.Date AV133Webwlismerds_30_tfbarfecsal ;
   private java.util.Date AV76TFBarFecSal ;
   private java.util.Date AV134Webwlismerds_31_tfbarfeccli ;
   private java.util.Date AV58TFBarFecCli ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n13769BarRdto4 ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13862Bar_MacCod ;
   private boolean n13861BarMarca ;
   private boolean n13860BarAccesor ;
   private boolean n166BarKgm ;
   private boolean n13863BarFasCod2 ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV104Webwlismerds_1_filterfulltext ;
   private String AV79FilterFullText ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P08FK8_A9713Tb1_Cod ;
   private short[] P08FK8_A4466BarAcaAnh ;
   private short[] P08FK8_A13769BarRdto4 ;
   private boolean[] P08FK8_n13769BarRdto4 ;
   private java.util.Date[] P08FK8_A155BarFecCli ;
   private String[] P08FK8_A1234BarNomCli ;
   private String[] P08FK8_A1652BarSerDsc ;
   private short[] P08FK8_A217BarTipArt ;
   private boolean[] P08FK8_n217BarTipArt ;
   private String[] P08FK8_A13696BarNHdr ;
   private String[] P08FK8_A279CliNom ;
   private int[] P08FK8_A136BarColNum ;
   private String[] P08FK8_A135BarColNom ;
   private String[] P08FK8_A212BarSer ;
   private int[] P08FK8_A252CliCod ;
   private boolean[] P08FK8_n252CliCod ;
   private java.util.Date[] P08FK8_A161BarFecSal ;
   private String[] P08FK8_A143BarDisNum ;
   private String[] P08FK8_A4812BarEncCli ;
   private int[] P08FK8_A13862Bar_MacCod ;
   private boolean[] P08FK8_n13862Bar_MacCod ;
   private String[] P08FK8_A13861BarMarca ;
   private boolean[] P08FK8_n13861BarMarca ;
   private String[] P08FK8_A13860BarAccesor ;
   private boolean[] P08FK8_n13860BarAccesor ;
   private java.math.BigDecimal[] P08FK8_A166BarKgm ;
   private boolean[] P08FK8_n166BarKgm ;
   private int[] P08FK8_A129BarCod ;
   private byte[] P08FK8_A132BarCodReo ;
   private String[] P08FK8_A130BarCodPar ;
   private int[] P08FK8_A361DisCod ;
   private String[] P08FK8_A13863BarFasCod2 ;
   private boolean[] P08FK8_n13863BarFasCod2 ;
   private String[] P08FK8_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV36GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV37GridStateFilterValue ;
}

final  class webwlismerexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FK8( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV105Webwlismerds_2_barfecsal ,
                                          java.util.Date AV106Webwlismerds_3_barfecsal_to ,
                                          int AV107Webwlismerds_4_clicod ,
                                          int AV108Webwlismerds_5_clicod_to ,
                                          String AV109Webwlismerds_6_barser ,
                                          String AV110Webwlismerds_7_barser_to ,
                                          String AV111Webwlismerds_8_barcolnom ,
                                          String AV112Webwlismerds_9_barcolnom_to ,
                                          int AV113Webwlismerds_10_barcolnum ,
                                          int AV114Webwlismerds_11_barcolnum_to ,
                                          int AV115Webwlismerds_12_tfclicod ,
                                          int AV116Webwlismerds_13_tfclicod_to ,
                                          String AV118Webwlismerds_15_tfclinom_sel ,
                                          String AV117Webwlismerds_14_tfclinom ,
                                          String AV120Webwlismerds_17_tfbarnhdr_sel ,
                                          String AV119Webwlismerds_16_tfbarnhdr ,
                                          short AV121Webwlismerds_18_tfbartipart ,
                                          short AV122Webwlismerds_19_tfbartipart_to ,
                                          String AV124Webwlismerds_21_tfbarser_sel ,
                                          String AV123Webwlismerds_20_tfbarser ,
                                          String AV126Webwlismerds_23_tfbarserdsc_sel ,
                                          String AV125Webwlismerds_22_tfbarserdsc ,
                                          String AV128Webwlismerds_25_tfbarcolnom_sel ,
                                          String AV127Webwlismerds_24_tfbarcolnom ,
                                          String AV130Webwlismerds_27_tfbarnomcli_sel ,
                                          String AV129Webwlismerds_26_tfbarnomcli ,
                                          int AV131Webwlismerds_28_tfbarcolnum ,
                                          int AV132Webwlismerds_29_tfbarcolnum_to ,
                                          java.util.Date AV133Webwlismerds_30_tfbarfecsal ,
                                          java.util.Date AV134Webwlismerds_31_tfbarfeccli ,
                                          java.math.BigDecimal AV135Webwlismerds_32_tfbarkgm ,
                                          java.math.BigDecimal AV136Webwlismerds_33_tfbarkgm_to ,
                                          short AV137Webwlismerds_34_tfbarrdto4 ,
                                          short AV138Webwlismerds_35_tfbarrdto4_to ,
                                          java.util.Date A161BarFecSal ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A217BarTipArt ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.util.Date A155BarFecCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          short A13769BarRdto4 ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV104Webwlismerds_1_filterfulltext ,
                                          String A13696BarNHdr ,
                                          String A13855BarGots ,
                                          String A13856BarGrs ,
                                          String A13857BarOcs ,
                                          String A13858BarRcs ,
                                          String A13859BarOeko ,
                                          String A13861BarMarca ,
                                          int A13862Bar_MacCod ,
                                          String A13863BarFasCod2 ,
                                          String A13864BarFasDsc2 ,
                                          String AV140Webwlismerds_37_tfbargots_sel ,
                                          String AV139Webwlismerds_36_tfbargots ,
                                          String AV142Webwlismerds_39_tfbargrs_sel ,
                                          String AV141Webwlismerds_38_tfbargrs ,
                                          String AV144Webwlismerds_41_tfbarocs_sel ,
                                          String AV143Webwlismerds_40_tfbarocs ,
                                          String AV146Webwlismerds_43_tfbarrcs_sel ,
                                          String AV145Webwlismerds_42_tfbarrcs ,
                                          String AV148Webwlismerds_45_tfbaroeko_sel ,
                                          String AV147Webwlismerds_44_tfbaroeko ,
                                          String AV149Webwlismerds_46_tfbaraccesorios_sel ,
                                          String A13860BarAccesor ,
                                          String AV151Webwlismerds_48_tfbarmarca_sel ,
                                          String AV150Webwlismerds_47_tfbarmarca ,
                                          int AV152Webwlismerds_49_tfbar_maccod ,
                                          int AV153Webwlismerds_50_tfbar_maccod_to ,
                                          String AV155Webwlismerds_52_tfbarfascod2_sel ,
                                          String AV154Webwlismerds_51_tfbarfascod2 ,
                                          String AV157Webwlismerds_54_tfbarfasdsc2_sel ,
                                          String AV156Webwlismerds_53_tfbarfasdsc2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[52];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T5.Tb1_Cod, T1.BarAcaAnh, T1.BarRdto4, T1.BarFecCli, T1.BarNomCli, T1.BarSerDsc, T1.BarTipArt, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-'" ;
      scmdbuf += " || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.CliCod, T1.BarFecSal, T1.BarDisNum," ;
      scmdbuf += " T1.BarEncCli, COALESCE( T2.Bar_MacCod, 0) AS Bar_MacCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarMarca, COALESCE( T6.BarAccesor, '') AS BarAccesor, COALESCE( T7.BarKgm," ;
      scmdbuf += " 0) AS BarKgm, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.DisCod, COALESCE( T4.BarFasCod2, ' ') AS BarFasCod2, T1.EmprCod FROM ((((((TXPBARCAD T1 LEFT JOIN (SELECT" ;
      scmdbuf += " MIN(T8.MacCod) AS Bar_MacCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPLMACRO T8 INNER JOIN TXPBARCAD T9 ON T9.EmprCod = T8.EmprCod) WHERE T8.EmprCod = ?" ;
      scmdbuf += " and T8.MacBarCod = T9.BarCod and T8.MacBarReo = T9.BarCodReo and T8.MacBarPar = T9.BarCodPar GROUP BY T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T2 ON T2.BarCod =" ;
      scmdbuf += " T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN" ;
      scmdbuf += " (SELECT MIN(T8.FasCod) AS BarFasCod2, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst = 2 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod" ;
      scmdbuf += " AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst = 2) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo," ;
      scmdbuf += " T8.BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN TXPTABLE1 T5 ON" ;
      scmdbuf += " T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT COALESCE( T9.GXC2, 'N') AS BarAccesor, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar" ;
      scmdbuf += " FROM (TXPBARCAD T8 LEFT JOIN (SELECT MIN('S') AS GXC2, T11.BarCod, T11.BarCodReo, T11.BarCodPar FROM (TXPLMACRO T10 INNER JOIN TXPBARCAD T11 ON T11.EmprCod = T10.EmprCod)" ;
      scmdbuf += " WHERE T10.EmprCod = ? and T10.MacBarCod = T11.BarCod and T10.MacBarReo = T11.BarCodReo and T10.MacBarPar = T11.BarCodPar GROUP BY T11.BarCod, T11.BarCodReo, T11.BarCodPar" ;
      scmdbuf += " ) T9 ON T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarAccesor, '') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T2.Bar_MacCod, 0) <= ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.BarFasCod2, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.BarFasCod2, ' ') = ?))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV105Webwlismerds_2_barfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV106Webwlismerds_3_barfecsal_to)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlismerds_4_clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlismerds_5_clicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Webwlismerds_6_barser)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlismerds_7_barser_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Webwlismerds_8_barcolnom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Webwlismerds_9_barcolnom_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Webwlismerds_10_barcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV114Webwlismerds_11_barcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV115Webwlismerds_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV116Webwlismerds_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Webwlismerds_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV117Webwlismerds_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Webwlismerds_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Webwlismerds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV119Webwlismerds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Webwlismerds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (0==AV121Webwlismerds_18_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV122Webwlismerds_19_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Webwlismerds_21_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV123Webwlismerds_20_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Webwlismerds_21_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Webwlismerds_23_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV125Webwlismerds_22_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Webwlismerds_23_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Webwlismerds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV127Webwlismerds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Webwlismerds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Webwlismerds_27_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV129Webwlismerds_26_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Webwlismerds_27_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (0==AV131Webwlismerds_28_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (0==AV132Webwlismerds_29_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Webwlismerds_30_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Webwlismerds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Webwlismerds_32_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Webwlismerds_33_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (0==AV137Webwlismerds_34_tfbarrdto4) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 >= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (0==AV138Webwlismerds_35_tfbarrdto4_to) )
      {
         addWhere(sWhereString, "(T1.BarRdto4 <= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
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
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarRdto4" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarRdto4 DESC" ;
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
                  return conditional_P08FK8(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).shortValue() , (java.util.Date)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Number) dynConstraints[49]).shortValue() , ((Boolean) dynConstraints[50]).booleanValue() , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , ((Number) dynConstraints[59]).intValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (String)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , ((Number) dynConstraints[77]).intValue() , (String)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FK8", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 11);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 13);
               ((String[]) buf[13])[0] = rslt.getString(12, 16);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((String[]) buf[17])[0] = rslt.getString(15, 8);
               ((String[]) buf[18])[0] = rslt.getString(16, 20);
               ((int[]) buf[19])[0] = rslt.getInt(17);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(21);
               ((byte[]) buf[28])[0] = rslt.getByte(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 1);
               ((int[]) buf[30])[0] = rslt.getInt(24);
               ((String[]) buf[31])[0] = rslt.getString(25, 8);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(26, 3);
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
                  stmt.setString(sIdx, (String)parms[52], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 3);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 8);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 8);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[71]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[78]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 11);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[87]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 16);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 16);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 26);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 26);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[100], 2);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[101], 2);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[102]).shortValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[103]).shortValue());
               }
               return;
      }
   }

}

