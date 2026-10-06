package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwlisalpexportcsv_impl extends GXWebProcedure
{
   public webwlisalpexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebWLISALPExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebWLISALPColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WebWLISALPColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero Albaran Produccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ped Cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Disposicion Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripción Serie", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo de Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero del Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Intensidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos Ent", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros Ent", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas Ent", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Ancho", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Trozos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente Destino", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV97Webwlisalpds_1_albprofch = AV70AlbProFch ;
      AV98Webwlisalpds_2_albprofch_to = AV71AlbProFch_To ;
      AV99Webwlisalpds_3_guiremcli = AV72GuiRemCli ;
      AV100Webwlisalpds_4_guiremcli_to = AV73GuiRemCli_To ;
      AV101Webwlisalpds_5_barser = AV76BarSer ;
      AV102Webwlisalpds_6_barser_to = AV77BarSer_To ;
      AV103Webwlisalpds_7_barcolnom = AV78BarColNom ;
      AV104Webwlisalpds_8_barcolnom_to = AV79BarColNom_To ;
      AV105Webwlisalpds_9_barcolnum = AV80BarColNum ;
      AV106Webwlisalpds_10_barcolnum_to = AV81BarColNum_To ;
      AV107Webwlisalpds_11_tfguiremcli = AV34TFGuiRemCli ;
      AV108Webwlisalpds_12_tfguiremcli_to = AV35TFGuiRemCli_To ;
      AV109Webwlisalpds_13_tfguiremcln = AV36TFGuiRemCln ;
      AV110Webwlisalpds_14_tfguiremcln_sel = AV37TFGuiRemCln_Sel ;
      AV111Webwlisalpds_15_tfalbprocod = AV38TFAlbProCod ;
      AV112Webwlisalpds_16_tfalbprocod_to = AV39TFAlbProCod_To ;
      AV113Webwlisalpds_17_tfalbprofch = AV40TFAlbProfch ;
      AV114Webwlisalpds_18_tfbarfeccli = AV45TFBarFecCli ;
      AV115Webwlisalpds_19_tfbarnhdr = AV47TFBarNHdr ;
      AV116Webwlisalpds_20_tfbarnhdr_sel = AV48TFBarNHdr_Sel ;
      AV117Webwlisalpds_21_tfbarser = AV49TFBarSer ;
      AV118Webwlisalpds_22_tfbarser_sel = AV50TFBarSer_Sel ;
      AV119Webwlisalpds_23_tfbarserdsc = AV51TFBarSerDsc ;
      AV120Webwlisalpds_24_tfbarserdsc_sel = AV52TFBarSerDsc_Sel ;
      AV121Webwlisalpds_25_tfbarnomcli = AV53TFBarNomCli ;
      AV122Webwlisalpds_26_tfbarnomcli_sel = AV54TFBarNomCli_Sel ;
      AV123Webwlisalpds_27_tfbarcolnom = AV55TFBarColNom ;
      AV124Webwlisalpds_28_tfbarcolnom_sel = AV56TFBarColNom_Sel ;
      AV125Webwlisalpds_29_tfbarcolnum = AV57TFBarColNum ;
      AV126Webwlisalpds_30_tfbarcolnum_to = AV58TFBarColNum_To ;
      AV127Webwlisalpds_31_tfbarkgm = AV59TFBarKgm ;
      AV128Webwlisalpds_32_tfbarkgm_to = AV60TFBarKgm_To ;
      AV129Webwlisalpds_33_tfbarmtr = AV92TFBarMtr ;
      AV130Webwlisalpds_34_tfbarmtr_to = AV93TFBarMtr_To ;
      AV131Webwlisalpds_35_tfbaralbkgme = AV61TFBarAlbKgmE ;
      AV132Webwlisalpds_36_tfbaralbkgme_to = AV62TFBarAlbKgmE_To ;
      AV133Webwlisalpds_37_tfbaralbmtre = AV63TFBarAlbMtrE ;
      AV134Webwlisalpds_38_tfbaralbmtre_to = AV64TFBarAlbMtrE_To ;
      AV135Webwlisalpds_39_tfbaralbpie = AV65TFBarAlbPie ;
      AV136Webwlisalpds_40_tfbaralbpie_to = AV66TFBarAlbPie_To ;
      AV137Webwlisalpds_41_tfbarancaca1 = AV68TFBarAncAca1 ;
      AV138Webwlisalpds_42_tfbarancaca1_to = AV69TFBarAncAca1_To ;
      AV139Webwlisalpds_43_tftrncod = AV83TFTrnCod ;
      AV140Webwlisalpds_44_tftrncod_to = AV84TFTrnCod_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV97Webwlisalpds_1_albprofch ,
                                           AV98Webwlisalpds_2_albprofch_to ,
                                           Integer.valueOf(AV99Webwlisalpds_3_guiremcli) ,
                                           Integer.valueOf(AV100Webwlisalpds_4_guiremcli_to) ,
                                           AV101Webwlisalpds_5_barser ,
                                           AV102Webwlisalpds_6_barser_to ,
                                           AV103Webwlisalpds_7_barcolnom ,
                                           AV104Webwlisalpds_8_barcolnom_to ,
                                           Integer.valueOf(AV105Webwlisalpds_9_barcolnum) ,
                                           Integer.valueOf(AV106Webwlisalpds_10_barcolnum_to) ,
                                           Integer.valueOf(AV107Webwlisalpds_11_tfguiremcli) ,
                                           Integer.valueOf(AV108Webwlisalpds_12_tfguiremcli_to) ,
                                           AV110Webwlisalpds_14_tfguiremcln_sel ,
                                           AV109Webwlisalpds_13_tfguiremcln ,
                                           Long.valueOf(AV111Webwlisalpds_15_tfalbprocod) ,
                                           Long.valueOf(AV112Webwlisalpds_16_tfalbprocod_to) ,
                                           AV113Webwlisalpds_17_tfalbprofch ,
                                           AV114Webwlisalpds_18_tfbarfeccli ,
                                           AV116Webwlisalpds_20_tfbarnhdr_sel ,
                                           AV115Webwlisalpds_19_tfbarnhdr ,
                                           AV118Webwlisalpds_22_tfbarser_sel ,
                                           AV117Webwlisalpds_21_tfbarser ,
                                           AV120Webwlisalpds_24_tfbarserdsc_sel ,
                                           AV119Webwlisalpds_23_tfbarserdsc ,
                                           AV122Webwlisalpds_26_tfbarnomcli_sel ,
                                           AV121Webwlisalpds_25_tfbarnomcli ,
                                           AV124Webwlisalpds_28_tfbarcolnom_sel ,
                                           AV123Webwlisalpds_27_tfbarcolnom ,
                                           Integer.valueOf(AV125Webwlisalpds_29_tfbarcolnum) ,
                                           Integer.valueOf(AV126Webwlisalpds_30_tfbarcolnum_to) ,
                                           AV127Webwlisalpds_31_tfbarkgm ,
                                           AV128Webwlisalpds_32_tfbarkgm_to ,
                                           AV129Webwlisalpds_33_tfbarmtr ,
                                           AV130Webwlisalpds_34_tfbarmtr_to ,
                                           AV131Webwlisalpds_35_tfbaralbkgme ,
                                           AV132Webwlisalpds_36_tfbaralbkgme_to ,
                                           AV133Webwlisalpds_37_tfbaralbmtre ,
                                           AV134Webwlisalpds_38_tfbaralbmtre_to ,
                                           Integer.valueOf(AV135Webwlisalpds_39_tfbaralbpie) ,
                                           Integer.valueOf(AV136Webwlisalpds_40_tfbaralbpie_to) ,
                                           Short.valueOf(AV137Webwlisalpds_41_tfbarancaca1) ,
                                           Short.valueOf(AV138Webwlisalpds_42_tfbarancaca1_to) ,
                                           Short.valueOf(AV139Webwlisalpds_43_tftrncod) ,
                                           Short.valueOf(AV140Webwlisalpds_44_tftrncod_to) ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1244GuiRemCln ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A155BarFecCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A1652BarSerDsc ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A1261BarAlbKgmE ,
                                           A1263BarAlbMtrE ,
                                           Integer.valueOf(A1265BarAlbPie) ,
                                           Short.valueOf(A125BarAncAca1) ,
                                           Short.valueOf(A840TrnCod) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV109Webwlisalpds_13_tfguiremcln = GXutil.padr( GXutil.rtrim( AV109Webwlisalpds_13_tfguiremcln), 30, "%") ;
      /* Using cursor P08FH2 */
      pr_default.execute(0, new Object[] {AV97Webwlisalpds_1_albprofch, AV98Webwlisalpds_2_albprofch_to, Integer.valueOf(AV99Webwlisalpds_3_guiremcli), Integer.valueOf(AV100Webwlisalpds_4_guiremcli_to), Integer.valueOf(AV107Webwlisalpds_11_tfguiremcli), Integer.valueOf(AV108Webwlisalpds_12_tfguiremcli_to), lV109Webwlisalpds_13_tfguiremcln, AV110Webwlisalpds_14_tfguiremcln_sel, Long.valueOf(AV111Webwlisalpds_15_tfalbprocod), Long.valueOf(AV112Webwlisalpds_16_tfalbprocod_to), AV113Webwlisalpds_17_tfalbprofch, Short.valueOf(AV139Webwlisalpds_43_tftrncod), Short.valueOf(AV140Webwlisalpds_44_tftrncod_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1253EmprGuiRem = P08FH2_A1253EmprGuiRem[0] ;
         A30AlbProCod = P08FH2_A30AlbProCod[0] ;
         A396EmprCod = P08FH2_A396EmprCod[0] ;
         A840TrnCod = P08FH2_A840TrnCod[0] ;
         A1244GuiRemCln = P08FH2_A1244GuiRemCln[0] ;
         A1243GuiRemCli = P08FH2_A1243GuiRemCli[0] ;
         A34AlbProfch = P08FH2_A34AlbProfch[0] ;
         A3869AlbCliDes = P08FH2_A3869AlbCliDes[0] ;
         A1244GuiRemCln = P08FH2_A1244GuiRemCln[0] ;
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
            AV14TextFileLine += GXutil.str( A1243GuiRemCli, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1244GuiRemCln, ";", ","), GXv_char3) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A30AlbProCod, 10, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A34AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV30BarEncCli = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV30BarEncCli, ";", ","), GXv_char3) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A155BarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char3) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char3) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV42TipArtDsc ;
            GXv_char3[0] = GXt_char2 ;
            new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char3) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV42TipArtDsc = GXt_char2 ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV42TipArtDsc, ";", ","), GXv_char3) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char3) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char3) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV43TipColDsc ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A218BarTipCol ;
            GXv_char5[0] = GXt_char2 ;
            new app.pfcoldsc(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_char5) ;
            webwlisalpexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
            webwlisalpexportcsv_impl.this.A218BarTipCol = GXv_int4[0] ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV43TipColDsc = GXt_char2 ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char5[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV43TipColDsc, ";", ","), GXv_char5) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXv_char5[0] = AV44IntDsc ;
            GXv_char3[0] = " " ;
            GXv_int6[0] = (short)(0) ;
            GXv_int4[0] = (byte)(0) ;
            GXv_char7[0] = "" ;
            GXv_char8[0] = " " ;
            GXv_int9[0] = 0 ;
            GXv_char10[0] = " " ;
            GXv_char11[0] = " " ;
            GXv_int12[0] = (short)(0) ;
            GXv_char13[0] = " " ;
            GXv_char14[0] = " " ;
            new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char5, GXv_char3, GXv_int6, GXv_int4, GXv_char7, GXv_char8, GXv_int9, GXv_char10, GXv_char11, GXv_int12, GXv_char13, GXv_char14) ;
            webwlisalpexportcsv_impl.this.AV44IntDsc = GXv_char5[0] ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char14[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV44IntDsc, ";", ","), GXv_char14) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char14[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A166BarKgm, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A184BarMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1261BarAlbKgmE, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1263BarAlbMtrE, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1265BarAlbPie, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A125BarAncAca1, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV67Trozos = (short)(0) ;
            /* Optimized group. */
            /* Using cursor P08FH3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
            cV67Trozos = P08FH3_AV67Trozos[0] ;
            pr_default.close(1);
            AV67Trozos = (short)(AV67Trozos+cV67Trozos*1) ;
            /* End optimized group. */
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV67Trozos, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A840TrnCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV82CliNom ;
            GXv_char14[0] = GXt_char2 ;
            new app.pclinom(remoteHandle, context).execute( A396EmprCod, A3869AlbCliDes, GXv_char14) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char14[0] ;
            AV82CliNom = GXt_char2 ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char14[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV82CliNom, ";", ","), GXv_char14) ;
            webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char14[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebWLISALPExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "GuiRemCli", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "GuiRemCln", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "AlbProCod", "", "Numero Albaran Produccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "AlbProfch", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&BarEncCli", "", "Ped Cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarFecCli", "", "Fecha Disposicion Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNHdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSer", "", "Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&TipArtDsc", "", "Tipo de Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarColNom", "", "Nombre Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarColNum", "", "Numero del Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&TipColDsc", "", "Tc", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&IntDsc", "", "Intensidad", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarKgm", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarMtr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAlbKgmE", "", "Kilos Ent", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAlbMtrE", "", "Metros Ent", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAlbPie", "", "Piezas Ent", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "BarAncAca1", "", "Ancho", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&Trozos", "", "N Trozos", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "TrnCod", "", "Transportista", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXv_SdtWWPColumnsSelector15[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, "&CliNom", "", "Cliente Destino", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector15[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char14[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWLISALPColumnsSelector", GXv_char14) ;
      webwlisalpexportcsv_impl.this.GXt_char2 = GXv_char14[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector15[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector16[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector15, GXv_SdtWWPColumnsSelector16) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector15[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector16[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("WebWLISALPGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebWLISALPGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("WebWLISALPGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV142GXV1 = 1 ;
      while ( AV142GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV142GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROFCH") == 0 )
         {
            AV70AlbProFch = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            AV71AlbProFch_To = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "GUIREMCLI") == 0 )
         {
            AV72GuiRemCli = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73GuiRemCli_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARSER") == 0 )
         {
            AV76BarSer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV77BarSer_To = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNOM") == 0 )
         {
            AV78BarColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV79BarColNom_To = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "BARCOLNUM") == 0 )
         {
            AV80BarColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV81BarColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV34TFGuiRemCli = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFGuiRemCli_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV36TFGuiRemCln = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV37TFGuiRemCln_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV38TFAlbProCod = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV39TFAlbProCod_To = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV40TFAlbProfch = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV45TFBarFecCli = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV47TFBarNHdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV48TFBarNHdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV49TFBarSer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV50TFBarSer_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV51TFBarSerDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV52TFBarSerDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV53TFBarNomCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV54TFBarNomCli_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV55TFBarColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV56TFBarColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV57TFBarColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV58TFBarColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV59TFBarKgm = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFBarKgm_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV92TFBarMtr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV93TFBarMtr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGME") == 0 )
         {
            AV61TFBarAlbKgmE = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFBarAlbKgmE_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTRE") == 0 )
         {
            AV63TFBarAlbMtrE = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFBarAlbMtrE_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBPIE") == 0 )
         {
            AV65TFBarAlbPie = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFBarAlbPie_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARANCACA1") == 0 )
         {
            AV68TFBarAncAca1 = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFBarAncAca1_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV83TFTrnCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV84TFTrnCod_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         AV142GXV1 = (int)(AV142GXV1+1) ;
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
      A1244GuiRemCln = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A155BarFecCli = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A396EmprCod = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      AV97Webwlisalpds_1_albprofch = GXutil.nullDate() ;
      AV70AlbProFch = GXutil.nullDate() ;
      AV98Webwlisalpds_2_albprofch_to = GXutil.nullDate() ;
      AV71AlbProFch_To = GXutil.nullDate() ;
      AV101Webwlisalpds_5_barser = "" ;
      AV76BarSer = "" ;
      AV102Webwlisalpds_6_barser_to = "" ;
      AV77BarSer_To = "" ;
      AV103Webwlisalpds_7_barcolnom = "" ;
      AV78BarColNom = "" ;
      AV104Webwlisalpds_8_barcolnom_to = "" ;
      AV79BarColNom_To = "" ;
      AV109Webwlisalpds_13_tfguiremcln = "" ;
      AV36TFGuiRemCln = "" ;
      AV110Webwlisalpds_14_tfguiremcln_sel = "" ;
      AV37TFGuiRemCln_Sel = "" ;
      AV113Webwlisalpds_17_tfalbprofch = GXutil.nullDate() ;
      AV40TFAlbProfch = GXutil.nullDate() ;
      AV114Webwlisalpds_18_tfbarfeccli = GXutil.nullDate() ;
      AV45TFBarFecCli = GXutil.nullDate() ;
      AV115Webwlisalpds_19_tfbarnhdr = "" ;
      AV47TFBarNHdr = "" ;
      AV116Webwlisalpds_20_tfbarnhdr_sel = "" ;
      AV48TFBarNHdr_Sel = "" ;
      AV117Webwlisalpds_21_tfbarser = "" ;
      AV49TFBarSer = "" ;
      AV118Webwlisalpds_22_tfbarser_sel = "" ;
      AV50TFBarSer_Sel = "" ;
      AV119Webwlisalpds_23_tfbarserdsc = "" ;
      AV51TFBarSerDsc = "" ;
      AV120Webwlisalpds_24_tfbarserdsc_sel = "" ;
      AV52TFBarSerDsc_Sel = "" ;
      AV121Webwlisalpds_25_tfbarnomcli = "" ;
      AV53TFBarNomCli = "" ;
      AV122Webwlisalpds_26_tfbarnomcli_sel = "" ;
      AV54TFBarNomCli_Sel = "" ;
      AV123Webwlisalpds_27_tfbarcolnom = "" ;
      AV55TFBarColNom = "" ;
      AV124Webwlisalpds_28_tfbarcolnom_sel = "" ;
      AV56TFBarColNom_Sel = "" ;
      AV127Webwlisalpds_31_tfbarkgm = DecimalUtil.ZERO ;
      AV59TFBarKgm = DecimalUtil.ZERO ;
      AV128Webwlisalpds_32_tfbarkgm_to = DecimalUtil.ZERO ;
      AV60TFBarKgm_To = DecimalUtil.ZERO ;
      AV129Webwlisalpds_33_tfbarmtr = DecimalUtil.ZERO ;
      AV92TFBarMtr = DecimalUtil.ZERO ;
      AV130Webwlisalpds_34_tfbarmtr_to = DecimalUtil.ZERO ;
      AV93TFBarMtr_To = DecimalUtil.ZERO ;
      AV131Webwlisalpds_35_tfbaralbkgme = DecimalUtil.ZERO ;
      AV61TFBarAlbKgmE = DecimalUtil.ZERO ;
      AV132Webwlisalpds_36_tfbaralbkgme_to = DecimalUtil.ZERO ;
      AV62TFBarAlbKgmE_To = DecimalUtil.ZERO ;
      AV133Webwlisalpds_37_tfbaralbmtre = DecimalUtil.ZERO ;
      AV63TFBarAlbMtrE = DecimalUtil.ZERO ;
      AV134Webwlisalpds_38_tfbaralbmtre_to = DecimalUtil.ZERO ;
      AV64TFBarAlbMtrE_To = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV109Webwlisalpds_13_tfguiremcln = "" ;
      A130BarCodPar = "" ;
      P08FH2_A1253EmprGuiRem = new String[] {""} ;
      P08FH2_A30AlbProCod = new long[1] ;
      P08FH2_A396EmprCod = new String[] {""} ;
      P08FH2_A840TrnCod = new short[1] ;
      P08FH2_A1244GuiRemCln = new String[] {""} ;
      P08FH2_A1243GuiRemCli = new int[1] ;
      P08FH2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P08FH2_A3869AlbCliDes = new int[1] ;
      A1253EmprGuiRem = "" ;
      AV30BarEncCli = "" ;
      AV42TipArtDsc = "" ;
      AV43TipColDsc = "" ;
      AV44IntDsc = "" ;
      GXv_char5 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_char13 = new String[1] ;
      P08FH3_AV67Trozos = new short[1] ;
      AV82CliNom = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char14 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector15 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector16 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwlisalpexportcsv__default(),
         new Object[] {
             new Object[] {
            P08FH2_A1253EmprGuiRem, P08FH2_A30AlbProCod, P08FH2_A396EmprCod, P08FH2_A840TrnCod, P08FH2_A1244GuiRemCln, P08FH2_A1243GuiRemCli, P08FH2_A34AlbProfch, P08FH2_A3869AlbCliDes
            }
            , new Object[] {
            P08FH3_AV67Trozos
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte GXv_int4[] ;
   private short gxcookieaux ;
   private short A217BarTipArt ;
   private short A125BarAncAca1 ;
   private short A840TrnCod ;
   private short AV137Webwlisalpds_41_tfbarancaca1 ;
   private short AV68TFBarAncAca1 ;
   private short AV138Webwlisalpds_42_tfbarancaca1_to ;
   private short AV69TFBarAncAca1_To ;
   private short AV139Webwlisalpds_43_tftrncod ;
   private short AV83TFTrnCod ;
   private short AV140Webwlisalpds_44_tftrncod_to ;
   private short AV84TFTrnCod_To ;
   private short AV28OrderedBy ;
   private short GXv_int6[] ;
   private short GXv_int12[] ;
   private short AV67Trozos ;
   private short cV67Trozos ;
   private short Gx_err ;
   private int AV13Random ;
   private int A1243GuiRemCli ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A1265BarAlbPie ;
   private int A3869AlbCliDes ;
   private int AV99Webwlisalpds_3_guiremcli ;
   private int AV72GuiRemCli ;
   private int AV100Webwlisalpds_4_guiremcli_to ;
   private int AV73GuiRemCli_To ;
   private int AV105Webwlisalpds_9_barcolnum ;
   private int AV80BarColNum ;
   private int AV106Webwlisalpds_10_barcolnum_to ;
   private int AV81BarColNum_To ;
   private int AV107Webwlisalpds_11_tfguiremcli ;
   private int AV34TFGuiRemCli ;
   private int AV108Webwlisalpds_12_tfguiremcli_to ;
   private int AV35TFGuiRemCli_To ;
   private int AV125Webwlisalpds_29_tfbarcolnum ;
   private int AV57TFBarColNum ;
   private int AV126Webwlisalpds_30_tfbarcolnum_to ;
   private int AV58TFBarColNum_To ;
   private int AV135Webwlisalpds_39_tfbaralbpie ;
   private int AV65TFBarAlbPie ;
   private int AV136Webwlisalpds_40_tfbaralbpie_to ;
   private int AV66TFBarAlbPie_To ;
   private int A129BarCod ;
   private int GXv_int9[] ;
   private int AV142GXV1 ;
   private long A30AlbProCod ;
   private long AV111Webwlisalpds_15_tfalbprocod ;
   private long AV38TFAlbProCod ;
   private long AV112Webwlisalpds_16_tfalbprocod_to ;
   private long AV39TFAlbProCod_To ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV127Webwlisalpds_31_tfbarkgm ;
   private java.math.BigDecimal AV59TFBarKgm ;
   private java.math.BigDecimal AV128Webwlisalpds_32_tfbarkgm_to ;
   private java.math.BigDecimal AV60TFBarKgm_To ;
   private java.math.BigDecimal AV129Webwlisalpds_33_tfbarmtr ;
   private java.math.BigDecimal AV92TFBarMtr ;
   private java.math.BigDecimal AV130Webwlisalpds_34_tfbarmtr_to ;
   private java.math.BigDecimal AV93TFBarMtr_To ;
   private java.math.BigDecimal AV131Webwlisalpds_35_tfbaralbkgme ;
   private java.math.BigDecimal AV61TFBarAlbKgmE ;
   private java.math.BigDecimal AV132Webwlisalpds_36_tfbaralbkgme_to ;
   private java.math.BigDecimal AV62TFBarAlbKgmE_To ;
   private java.math.BigDecimal AV133Webwlisalpds_37_tfbaralbmtre ;
   private java.math.BigDecimal AV63TFBarAlbMtrE ;
   private java.math.BigDecimal AV134Webwlisalpds_38_tfbaralbmtre_to ;
   private java.math.BigDecimal AV64TFBarAlbMtrE_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A1244GuiRemCln ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A396EmprCod ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String AV101Webwlisalpds_5_barser ;
   private String AV76BarSer ;
   private String AV102Webwlisalpds_6_barser_to ;
   private String AV77BarSer_To ;
   private String AV103Webwlisalpds_7_barcolnom ;
   private String AV78BarColNom ;
   private String AV104Webwlisalpds_8_barcolnom_to ;
   private String AV79BarColNom_To ;
   private String AV109Webwlisalpds_13_tfguiremcln ;
   private String AV36TFGuiRemCln ;
   private String AV110Webwlisalpds_14_tfguiremcln_sel ;
   private String AV37TFGuiRemCln_Sel ;
   private String AV115Webwlisalpds_19_tfbarnhdr ;
   private String AV47TFBarNHdr ;
   private String AV116Webwlisalpds_20_tfbarnhdr_sel ;
   private String AV48TFBarNHdr_Sel ;
   private String AV117Webwlisalpds_21_tfbarser ;
   private String AV49TFBarSer ;
   private String AV118Webwlisalpds_22_tfbarser_sel ;
   private String AV50TFBarSer_Sel ;
   private String AV119Webwlisalpds_23_tfbarserdsc ;
   private String AV51TFBarSerDsc ;
   private String AV120Webwlisalpds_24_tfbarserdsc_sel ;
   private String AV52TFBarSerDsc_Sel ;
   private String AV121Webwlisalpds_25_tfbarnomcli ;
   private String AV53TFBarNomCli ;
   private String AV122Webwlisalpds_26_tfbarnomcli_sel ;
   private String AV54TFBarNomCli_Sel ;
   private String AV123Webwlisalpds_27_tfbarcolnom ;
   private String AV55TFBarColNom ;
   private String AV124Webwlisalpds_28_tfbarcolnom_sel ;
   private String AV56TFBarColNom_Sel ;
   private String scmdbuf ;
   private String lV109Webwlisalpds_13_tfguiremcln ;
   private String A130BarCodPar ;
   private String A1253EmprGuiRem ;
   private String AV30BarEncCli ;
   private String AV42TipArtDsc ;
   private String AV43TipColDsc ;
   private String AV44IntDsc ;
   private String GXv_char5[] ;
   private String GXv_char3[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char13[] ;
   private String AV82CliNom ;
   private String GXt_char2 ;
   private String GXv_char14[] ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date AV97Webwlisalpds_1_albprofch ;
   private java.util.Date AV70AlbProFch ;
   private java.util.Date AV98Webwlisalpds_2_albprofch_to ;
   private java.util.Date AV71AlbProFch_To ;
   private java.util.Date AV113Webwlisalpds_17_tfalbprofch ;
   private java.util.Date AV40TFAlbProfch ;
   private java.util.Date AV114Webwlisalpds_18_tfbarfeccli ;
   private java.util.Date AV45TFBarFecCli ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08FH2_A1253EmprGuiRem ;
   private long[] P08FH2_A30AlbProCod ;
   private String[] P08FH2_A396EmprCod ;
   private short[] P08FH2_A840TrnCod ;
   private String[] P08FH2_A1244GuiRemCln ;
   private int[] P08FH2_A1243GuiRemCli ;
   private java.util.Date[] P08FH2_A34AlbProfch ;
   private int[] P08FH2_A3869AlbCliDes ;
   private short[] P08FH3_AV67Trozos ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector15[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector16[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class webwlisalpexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08FH2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV97Webwlisalpds_1_albprofch ,
                                          java.util.Date AV98Webwlisalpds_2_albprofch_to ,
                                          int AV99Webwlisalpds_3_guiremcli ,
                                          int AV100Webwlisalpds_4_guiremcli_to ,
                                          String AV101Webwlisalpds_5_barser ,
                                          String AV102Webwlisalpds_6_barser_to ,
                                          String AV103Webwlisalpds_7_barcolnom ,
                                          String AV104Webwlisalpds_8_barcolnom_to ,
                                          int AV105Webwlisalpds_9_barcolnum ,
                                          int AV106Webwlisalpds_10_barcolnum_to ,
                                          int AV107Webwlisalpds_11_tfguiremcli ,
                                          int AV108Webwlisalpds_12_tfguiremcli_to ,
                                          String AV110Webwlisalpds_14_tfguiremcln_sel ,
                                          String AV109Webwlisalpds_13_tfguiremcln ,
                                          long AV111Webwlisalpds_15_tfalbprocod ,
                                          long AV112Webwlisalpds_16_tfalbprocod_to ,
                                          java.util.Date AV113Webwlisalpds_17_tfalbprofch ,
                                          java.util.Date AV114Webwlisalpds_18_tfbarfeccli ,
                                          String AV116Webwlisalpds_20_tfbarnhdr_sel ,
                                          String AV115Webwlisalpds_19_tfbarnhdr ,
                                          String AV118Webwlisalpds_22_tfbarser_sel ,
                                          String AV117Webwlisalpds_21_tfbarser ,
                                          String AV120Webwlisalpds_24_tfbarserdsc_sel ,
                                          String AV119Webwlisalpds_23_tfbarserdsc ,
                                          String AV122Webwlisalpds_26_tfbarnomcli_sel ,
                                          String AV121Webwlisalpds_25_tfbarnomcli ,
                                          String AV124Webwlisalpds_28_tfbarcolnom_sel ,
                                          String AV123Webwlisalpds_27_tfbarcolnom ,
                                          int AV125Webwlisalpds_29_tfbarcolnum ,
                                          int AV126Webwlisalpds_30_tfbarcolnum_to ,
                                          java.math.BigDecimal AV127Webwlisalpds_31_tfbarkgm ,
                                          java.math.BigDecimal AV128Webwlisalpds_32_tfbarkgm_to ,
                                          java.math.BigDecimal AV129Webwlisalpds_33_tfbarmtr ,
                                          java.math.BigDecimal AV130Webwlisalpds_34_tfbarmtr_to ,
                                          java.math.BigDecimal AV131Webwlisalpds_35_tfbaralbkgme ,
                                          java.math.BigDecimal AV132Webwlisalpds_36_tfbaralbkgme_to ,
                                          java.math.BigDecimal AV133Webwlisalpds_37_tfbaralbmtre ,
                                          java.math.BigDecimal AV134Webwlisalpds_38_tfbaralbmtre_to ,
                                          int AV135Webwlisalpds_39_tfbaralbpie ,
                                          int AV136Webwlisalpds_40_tfbaralbpie_to ,
                                          short AV137Webwlisalpds_41_tfbarancaca1 ,
                                          short AV138Webwlisalpds_42_tfbarancaca1_to ,
                                          short AV139Webwlisalpds_43_tftrncod ,
                                          short AV140Webwlisalpds_44_tftrncod_to ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1244GuiRemCln ,
                                          long A30AlbProCod ,
                                          java.util.Date A155BarFecCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A1652BarSerDsc ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.math.BigDecimal A1261BarAlbKgmE ,
                                          java.math.BigDecimal A1263BarAlbMtrE ,
                                          int A1265BarAlbPie ,
                                          short A125BarAncAca1 ,
                                          short A840TrnCod ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[13];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProCod, T1.EmprCod, T1.TrnCod, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch, T1.AlbCliDes FROM (TXPCALPRD" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV97Webwlisalpds_1_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Webwlisalpds_2_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (0==AV99Webwlisalpds_3_guiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! (0==AV100Webwlisalpds_4_guiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! (0==AV107Webwlisalpds_11_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (0==AV108Webwlisalpds_12_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webwlisalpds_14_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV109Webwlisalpds_13_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webwlisalpds_14_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV111Webwlisalpds_15_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV112Webwlisalpds_16_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV113Webwlisalpds_17_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV139Webwlisalpds_43_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (0==AV140Webwlisalpds_44_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProfch" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProfch DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli DESC" ;
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
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
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
                  return conditional_P08FH2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).longValue() , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).shortValue() , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).longValue() , (java.util.Date)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , (java.math.BigDecimal)dynConstraints[57] , (java.math.BigDecimal)dynConstraints[58] , (java.math.BigDecimal)dynConstraints[59] , (java.math.BigDecimal)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , ((Number) dynConstraints[62]).shortValue() , ((Number) dynConstraints[63]).shortValue() , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08FH2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08FH3", "SELECT COUNT(*) FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[25]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

