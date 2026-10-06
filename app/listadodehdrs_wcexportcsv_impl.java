package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodehdrs_wcexportcsv_impl extends GXWebProcedure
{
   public listadodehdrs_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeHDRs_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("ListadodeHDRs_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("ListadodeHDRs_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pedido Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N° Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tip. Art.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Generacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Entrega Prevista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Situacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Albaran", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts Sal.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs Sal.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cuaderno", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Normas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Factura", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV106Listadodehdrs_wcds_1_filterfulltext = AV30FilterFullText ;
      AV107Listadodehdrs_wcds_2_tfclicod = AV34TFCliCod ;
      AV108Listadodehdrs_wcds_3_tfclicod_to = AV35TFCliCod_To ;
      AV109Listadodehdrs_wcds_4_tfclinom = AV36TFCliNom ;
      AV110Listadodehdrs_wcds_5_tfclinom_sel = AV37TFCliNom_Sel ;
      AV111Listadodehdrs_wcds_6_tfpedidocliente = AV89TFPedidoCliente ;
      AV112Listadodehdrs_wcds_7_tfpedidocliente_sel = AV90TFPedidoCliente_Sel ;
      AV113Listadodehdrs_wcds_8_tfbarnhdr = AV79TFBarNHdr ;
      AV114Listadodehdrs_wcds_9_tfbarnhdr_sel = AV80TFBarNHdr_Sel ;
      AV115Listadodehdrs_wcds_10_tfbarser = AV38TFBarSer ;
      AV116Listadodehdrs_wcds_11_tfbarser_sel = AV39TFBarSer_Sel ;
      AV117Listadodehdrs_wcds_12_tfbarserdsc = AV40TFBarSerDsc ;
      AV118Listadodehdrs_wcds_13_tfbarserdsc_sel = AV41TFBarSerDsc_Sel ;
      AV119Listadodehdrs_wcds_14_tfbartipart = AV42TFBarTipArt ;
      AV120Listadodehdrs_wcds_15_tfbartipart_to = AV43TFBarTipArt_To ;
      AV121Listadodehdrs_wcds_16_tfbartipartdsc = AV44TFBarTipArtDsc ;
      AV122Listadodehdrs_wcds_17_tfbartipartdsc_sel = AV45TFBarTipArtDsc_Sel ;
      AV123Listadodehdrs_wcds_18_tfbarcolnom = AV46TFBarColNom ;
      AV124Listadodehdrs_wcds_19_tfbarcolnom_sel = AV47TFBarColNom_Sel ;
      AV125Listadodehdrs_wcds_20_tfbarcolnum = AV48TFBarColNum ;
      AV126Listadodehdrs_wcds_21_tfbarcolnum_to = AV49TFBarColNum_To ;
      AV127Listadodehdrs_wcds_22_tfbarnomcli = AV54TFBarNomCli ;
      AV128Listadodehdrs_wcds_23_tfbarnomcli_sel = AV55TFBarNomCli_Sel ;
      AV129Listadodehdrs_wcds_24_tfbarkgm = AV56TFBarKgm ;
      AV130Listadodehdrs_wcds_25_tfbarkgm_to = AV57TFBarKgm_To ;
      AV131Listadodehdrs_wcds_26_tfbarmtr = AV58TFBarMtr ;
      AV132Listadodehdrs_wcds_27_tfbarmtr_to = AV59TFBarMtr_To ;
      AV133Listadodehdrs_wcds_28_tfbarpie = AV60TFBarPie ;
      AV134Listadodehdrs_wcds_29_tfbarpie_to = AV61TFBarPie_To ;
      AV135Listadodehdrs_wcds_30_tfbarfecgen = AV62TFBarFecGen ;
      AV136Listadodehdrs_wcds_31_tfbarfeccli = AV64TFBarFecCli ;
      AV137Listadodehdrs_wcds_32_tfbarfecfpr = AV66TFBarFecFpr ;
      AV138Listadodehdrs_wcds_33_tfbarfascod = AV68TFBarFasCod ;
      AV139Listadodehdrs_wcds_34_tfbarfascod_sel = AV69TFBarFasCod_Sel ;
      AV140Listadodehdrs_wcds_35_tfbarmaqcod = AV81TFBarMaqCod ;
      AV141Listadodehdrs_wcds_36_tfbarmaqcod_sel = AV82TFBarMaqCod_Sel ;
      AV142Listadodehdrs_wcds_37_tfbarsit = AV83TFBarSit ;
      AV143Listadodehdrs_wcds_38_tfbarsit_to = AV84TFBarSit_To ;
      AV144Listadodehdrs_wcds_39_tfbaralbultimo = AV91TFBarAlbUltimo ;
      AV145Listadodehdrs_wcds_40_tfbaralbultimo_to = AV92TFBarAlbUltimo_To ;
      AV146Listadodehdrs_wcds_41_tfbaralbmts = AV93TFBarAlbMts ;
      AV147Listadodehdrs_wcds_42_tfbaralbmts_to = AV94TFBarAlbMts_To ;
      AV148Listadodehdrs_wcds_43_tfbaralbkgs = AV95TFBarAlbKgs ;
      AV149Listadodehdrs_wcds_44_tfbaralbkgs_to = AV96TFBarAlbKgs_To ;
      AV150Listadodehdrs_wcds_45_tfbarcuaderno = AV97TFBarCuaderno ;
      AV151Listadodehdrs_wcds_46_tfbarcuaderno_sel = AV98TFBarCuaderno_Sel ;
      AV152Listadodehdrs_wcds_47_tfbarnormas = AV99TFBarNormas ;
      AV153Listadodehdrs_wcds_48_tfbarnormas_sel = AV100TFBarNormas_Sel ;
      AV154Listadodehdrs_wcds_49_tfbaralbfact = AV101TFBarAlbFact ;
      AV155Listadodehdrs_wcds_50_tfbaralbfact_to = AV102TFBarAlbFact_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV107Listadodehdrs_wcds_2_tfclicod) ,
                                           Integer.valueOf(AV108Listadodehdrs_wcds_3_tfclicod_to) ,
                                           AV110Listadodehdrs_wcds_5_tfclinom_sel ,
                                           AV109Listadodehdrs_wcds_4_tfclinom ,
                                           AV114Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                           AV113Listadodehdrs_wcds_8_tfbarnhdr ,
                                           AV116Listadodehdrs_wcds_11_tfbarser_sel ,
                                           AV115Listadodehdrs_wcds_10_tfbarser ,
                                           AV118Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                           AV117Listadodehdrs_wcds_12_tfbarserdsc ,
                                           Short.valueOf(AV119Listadodehdrs_wcds_14_tfbartipart) ,
                                           Short.valueOf(AV120Listadodehdrs_wcds_15_tfbartipart_to) ,
                                           AV122Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                           AV121Listadodehdrs_wcds_16_tfbartipartdsc ,
                                           AV124Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                           AV123Listadodehdrs_wcds_18_tfbarcolnom ,
                                           Integer.valueOf(AV125Listadodehdrs_wcds_20_tfbarcolnum) ,
                                           Integer.valueOf(AV126Listadodehdrs_wcds_21_tfbarcolnum_to) ,
                                           AV128Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                           AV127Listadodehdrs_wcds_22_tfbarnomcli ,
                                           AV129Listadodehdrs_wcds_24_tfbarkgm ,
                                           AV130Listadodehdrs_wcds_25_tfbarkgm_to ,
                                           AV131Listadodehdrs_wcds_26_tfbarmtr ,
                                           AV132Listadodehdrs_wcds_27_tfbarmtr_to ,
                                           AV135Listadodehdrs_wcds_30_tfbarfecgen ,
                                           AV136Listadodehdrs_wcds_31_tfbarfeccli ,
                                           AV137Listadodehdrs_wcds_32_tfbarfecfpr ,
                                           AV141Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                           AV140Listadodehdrs_wcds_35_tfbarmaqcod ,
                                           Byte.valueOf(AV142Listadodehdrs_wcds_37_tfbarsit) ,
                                           Byte.valueOf(AV143Listadodehdrs_wcds_38_tfbarsit_to) ,
                                           AV146Listadodehdrs_wcds_41_tfbaralbmts ,
                                           AV147Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                           AV148Listadodehdrs_wcds_43_tfbaralbkgs ,
                                           AV149Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A13711BarTipArtD ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A180BarMaqCod ,
                                           Byte.valueOf(A213BarSit) ,
                                           A13931BarAlbMts ,
                                           A13932BarAlbKgs ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV106Listadodehdrs_wcds_1_filterfulltext ,
                                           A13878PedidoClie ,
                                           A13696BarNHdr ,
                                           Integer.valueOf(A198BarPie) ,
                                           A151BarFasCod ,
                                           Long.valueOf(A13930BarAlbUlti) ,
                                           A13933BarCuadern ,
                                           A13934BarNormas ,
                                           Integer.valueOf(A13935BarAlbFact) ,
                                           AV112Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                           AV111Listadodehdrs_wcds_6_tfpedidocliente ,
                                           Integer.valueOf(AV133Listadodehdrs_wcds_28_tfbarpie) ,
                                           Integer.valueOf(AV134Listadodehdrs_wcds_29_tfbarpie_to) ,
                                           AV139Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                           AV138Listadodehdrs_wcds_33_tfbarfascod ,
                                           Long.valueOf(AV144Listadodehdrs_wcds_39_tfbaralbultimo) ,
                                           Long.valueOf(AV145Listadodehdrs_wcds_40_tfbaralbultimo_to) ,
                                           AV151Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                           AV150Listadodehdrs_wcds_45_tfbarcuaderno ,
                                           AV153Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                           AV152Listadodehdrs_wcds_47_tfbarnormas ,
                                           Integer.valueOf(AV154Listadodehdrs_wcds_49_tfbaralbfact) ,
                                           Integer.valueOf(AV155Listadodehdrs_wcds_50_tfbaralbfact_to) ,
                                           AV73BarFecGen ,
                                           AV74BarFecGen_to ,
                                           AV77BarFecCli ,
                                           AV78BarFecCli_to ,
                                           Integer.valueOf(AV75Clicod) ,
                                           Integer.valueOf(AV76Clicod_to) ,
                                           Byte.valueOf(AV71BarSit) ,
                                           Byte.valueOf(AV72BarSit_to) ,
                                           AV70Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV138Listadodehdrs_wcds_33_tfbarfascod = GXutil.padr( GXutil.rtrim( AV138Listadodehdrs_wcds_33_tfbarfascod), 8, "%") ;
      lV150Listadodehdrs_wcds_45_tfbarcuaderno = GXutil.padr( GXutil.rtrim( AV150Listadodehdrs_wcds_45_tfbarcuaderno), 20, "%") ;
      lV109Listadodehdrs_wcds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV109Listadodehdrs_wcds_4_tfclinom), 30, "%") ;
      lV113Listadodehdrs_wcds_8_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV113Listadodehdrs_wcds_8_tfbarnhdr), 11, "%") ;
      lV115Listadodehdrs_wcds_10_tfbarser = GXutil.padr( GXutil.rtrim( AV115Listadodehdrs_wcds_10_tfbarser), 16, "%") ;
      lV117Listadodehdrs_wcds_12_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV117Listadodehdrs_wcds_12_tfbarserdsc), 26, "%") ;
      lV121Listadodehdrs_wcds_16_tfbartipartdsc = GXutil.padr( GXutil.rtrim( AV121Listadodehdrs_wcds_16_tfbartipartdsc), 30, "%") ;
      lV123Listadodehdrs_wcds_18_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV123Listadodehdrs_wcds_18_tfbarcolnom), 13, "%") ;
      lV127Listadodehdrs_wcds_22_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV127Listadodehdrs_wcds_22_tfbarnomcli), 13, "%") ;
      lV140Listadodehdrs_wcds_35_tfbarmaqcod = GXutil.padr( GXutil.rtrim( AV140Listadodehdrs_wcds_35_tfbarmaqcod), 6, "%") ;
      /* Using cursor P097T6 */
      pr_default.execute(0, new Object[] {AV70Emprcod, AV139Listadodehdrs_wcds_34_tfbarfascod_sel, AV138Listadodehdrs_wcds_33_tfbarfascod, lV138Listadodehdrs_wcds_33_tfbarfascod, AV139Listadodehdrs_wcds_34_tfbarfascod_sel, AV139Listadodehdrs_wcds_34_tfbarfascod_sel, AV151Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV150Listadodehdrs_wcds_45_tfbarcuaderno, lV150Listadodehdrs_wcds_45_tfbarcuaderno, AV151Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV151Listadodehdrs_wcds_46_tfbarcuaderno_sel, AV73BarFecGen, AV74BarFecGen_to, AV77BarFecCli, AV78BarFecCli_to, AV78BarFecCli_to, Integer.valueOf(AV75Clicod), Integer.valueOf(AV76Clicod_to), Byte.valueOf(AV71BarSit), Byte.valueOf(AV72BarSit_to), Integer.valueOf(AV107Listadodehdrs_wcds_2_tfclicod), Integer.valueOf(AV108Listadodehdrs_wcds_3_tfclicod_to), lV109Listadodehdrs_wcds_4_tfclinom, AV110Listadodehdrs_wcds_5_tfclinom_sel, lV113Listadodehdrs_wcds_8_tfbarnhdr, AV114Listadodehdrs_wcds_9_tfbarnhdr_sel, lV115Listadodehdrs_wcds_10_tfbarser, AV116Listadodehdrs_wcds_11_tfbarser_sel, lV117Listadodehdrs_wcds_12_tfbarserdsc, AV118Listadodehdrs_wcds_13_tfbarserdsc_sel, Short.valueOf(AV119Listadodehdrs_wcds_14_tfbartipart), Short.valueOf(AV120Listadodehdrs_wcds_15_tfbartipart_to), lV121Listadodehdrs_wcds_16_tfbartipartdsc, AV122Listadodehdrs_wcds_17_tfbartipartdsc_sel, lV123Listadodehdrs_wcds_18_tfbarcolnom, AV124Listadodehdrs_wcds_19_tfbarcolnom_sel, Integer.valueOf(AV125Listadodehdrs_wcds_20_tfbarcolnum), Integer.valueOf(AV126Listadodehdrs_wcds_21_tfbarcolnum_to), lV127Listadodehdrs_wcds_22_tfbarnomcli, AV128Listadodehdrs_wcds_23_tfbarnomcli_sel, AV129Listadodehdrs_wcds_24_tfbarkgm, AV130Listadodehdrs_wcds_25_tfbarkgm_to, AV131Listadodehdrs_wcds_26_tfbarmtr, AV132Listadodehdrs_wcds_27_tfbarmtr_to, AV135Listadodehdrs_wcds_30_tfbarfecgen, AV136Listadodehdrs_wcds_31_tfbarfeccli, AV137Listadodehdrs_wcds_32_tfbarfecfpr, lV140Listadodehdrs_wcds_35_tfbarmaqcod, AV141Listadodehdrs_wcds_36_tfbarmaqcod_sel, Byte.valueOf(AV142Listadodehdrs_wcds_37_tfbarsit), Byte.valueOf(AV143Listadodehdrs_wcds_38_tfbarsit_to), AV146Listadodehdrs_wcds_41_tfbaralbmts, AV147Listadodehdrs_wcds_42_tfbaralbmts_to, AV148Listadodehdrs_wcds_43_tfbaralbkgs, AV149Listadodehdrs_wcds_44_tfbaralbkgs_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4466BarAcaAnh = P097T6_A4466BarAcaAnh[0] ;
         A213BarSit = P097T6_A213BarSit[0] ;
         A180BarMaqCod = P097T6_A180BarMaqCod[0] ;
         A158BarFecFpr = P097T6_A158BarFecFpr[0] ;
         A155BarFecCli = P097T6_A155BarFecCli[0] ;
         A159BarFecGen = P097T6_A159BarFecGen[0] ;
         A1234BarNomCli = P097T6_A1234BarNomCli[0] ;
         A136BarColNum = P097T6_A136BarColNum[0] ;
         A135BarColNom = P097T6_A135BarColNom[0] ;
         A13711BarTipArtD = P097T6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097T6_n13711BarTipArtD[0] ;
         A217BarTipArt = P097T6_A217BarTipArt[0] ;
         n217BarTipArt = P097T6_n217BarTipArt[0] ;
         A1652BarSerDsc = P097T6_A1652BarSerDsc[0] ;
         A212BarSer = P097T6_A212BarSer[0] ;
         A13696BarNHdr = P097T6_A13696BarNHdr[0] ;
         A279CliNom = P097T6_A279CliNom[0] ;
         A252CliCod = P097T6_A252CliCod[0] ;
         n252CliCod = P097T6_n252CliCod[0] ;
         A13933BarCuadern = P097T6_A13933BarCuadern[0] ;
         n13933BarCuadern = P097T6_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097T6_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097T6_A13931BarAlbMts[0] ;
         A151BarFasCod = P097T6_A151BarFasCod[0] ;
         n151BarFasCod = P097T6_n151BarFasCod[0] ;
         A184BarMtr = P097T6_A184BarMtr[0] ;
         A166BarKgm = P097T6_A166BarKgm[0] ;
         A143BarDisNum = P097T6_A143BarDisNum[0] ;
         A4812BarEncCli = P097T6_A4812BarEncCli[0] ;
         A199BarPie1 = P097T6_A199BarPie1[0] ;
         A365DisDes = P097T6_A365DisDes[0] ;
         A898BarPieNDes = P097T6_A898BarPieNDes[0] ;
         A361DisCod = P097T6_A361DisCod[0] ;
         A130BarCodPar = P097T6_A130BarCodPar[0] ;
         A132BarCodReo = P097T6_A132BarCodReo[0] ;
         A129BarCod = P097T6_A129BarCod[0] ;
         A396EmprCod = P097T6_A396EmprCod[0] ;
         A13711BarTipArtD = P097T6_A13711BarTipArtD[0] ;
         n13711BarTipArtD = P097T6_n13711BarTipArtD[0] ;
         A279CliNom = P097T6_A279CliNom[0] ;
         A13933BarCuadern = P097T6_A13933BarCuadern[0] ;
         n13933BarCuadern = P097T6_n13933BarCuadern[0] ;
         A13932BarAlbKgs = P097T6_A13932BarAlbKgs[0] ;
         A13931BarAlbMts = P097T6_A13931BarAlbMts[0] ;
         A151BarFasCod = P097T6_A151BarFasCod[0] ;
         n151BarFasCod = P097T6_n151BarFasCod[0] ;
         A184BarMtr = P097T6_A184BarMtr[0] ;
         A166BarKgm = P097T6_A166BarKgm[0] ;
         A199BarPie1 = P097T6_A199BarPie1[0] ;
         A898BarPieNDes = P097T6_A898BarPieNDes[0] ;
         GXt_char2 = A13878PedidoClie ;
         GXv_char3[0] = A396EmprCod ;
         GXv_char4[0] = A4812BarEncCli ;
         GXv_char5[0] = A143BarDisNum ;
         GXv_char6[0] = GXt_char2 ;
         new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_char5, GXv_char6) ;
         listadodehdrs_wcexportcsv_impl.this.A396EmprCod = GXv_char3[0] ;
         listadodehdrs_wcexportcsv_impl.this.A4812BarEncCli = GXv_char4[0] ;
         listadodehdrs_wcexportcsv_impl.this.A143BarDisNum = GXv_char5[0] ;
         listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
         A13878PedidoClie = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) && ( ! (GXutil.strcmp("", AV111Listadodehdrs_wcds_6_tfpedidocliente)==0) ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV111Listadodehdrs_wcds_6_tfpedidocliente) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV112Listadodehdrs_wcds_7_tfpedidocliente_sel)==0) || ( ( GXutil.strcmp(A13878PedidoClie, AV112Listadodehdrs_wcds_7_tfpedidocliente_sel) == 0 ) ) )
            {
               GXt_int7 = A13930BarAlbUlti ;
               GXv_int8[0] = GXt_int7 ;
               new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int8) ;
               listadodehdrs_wcexportcsv_impl.this.GXt_int7 = GXv_int8[0] ;
               A13930BarAlbUlti = GXt_int7 ;
               if ( (0==AV144Listadodehdrs_wcds_39_tfbaralbultimo) || ( ( A13930BarAlbUlti >= AV144Listadodehdrs_wcds_39_tfbaralbultimo ) ) )
               {
                  if ( (0==AV145Listadodehdrs_wcds_40_tfbaralbultimo_to) || ( ( A13930BarAlbUlti <= AV145Listadodehdrs_wcds_40_tfbaralbultimo_to ) ) )
                  {
                     GXt_char2 = A13934BarNormas ;
                     GXv_char6[0] = GXt_char2 ;
                     new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
                     listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                     A13934BarNormas = GXt_char2 ;
                     if ( ! ( (GXutil.strcmp("", AV153Listadodehdrs_wcds_48_tfbarnormas_sel)==0) && ( ! (GXutil.strcmp("", AV152Listadodehdrs_wcds_47_tfbarnormas)==0) ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV152Listadodehdrs_wcds_47_tfbarnormas) , 255 , "%"),  ' ' ) ) )
                     {
                        if ( (GXutil.strcmp("", AV153Listadodehdrs_wcds_48_tfbarnormas_sel)==0) || ( ( GXutil.strcmp(A13934BarNormas, AV153Listadodehdrs_wcds_48_tfbarnormas_sel) == 0 ) ) )
                        {
                           GXt_int9 = A13935BarAlbFact ;
                           GXv_int10[0] = GXt_int9 ;
                           new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int10) ;
                           listadodehdrs_wcexportcsv_impl.this.GXt_int9 = GXv_int10[0] ;
                           A13935BarAlbFact = GXt_int9 ;
                           if ( (0==AV154Listadodehdrs_wcds_49_tfbaralbfact) || ( ( A13935BarAlbFact >= AV154Listadodehdrs_wcds_49_tfbaralbfact ) ) )
                           {
                              if ( (0==AV155Listadodehdrs_wcds_50_tfbaralbfact_to) || ( ( A13935BarAlbFact <= AV155Listadodehdrs_wcds_50_tfbaralbfact_to ) ) )
                              {
                                 if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
                                 {
                                    A198BarPie = A898BarPieNDes ;
                                 }
                                 else
                                 {
                                    A198BarPie = A199BarPie1 ;
                                 }
                                 if ( (GXutil.strcmp("", AV106Listadodehdrs_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13878PedidoClie) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13696BarNHdr) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A212BarSer) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1652BarSerDsc) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A217BarTipArt, 4, 0) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13711BarTipArtD) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A135BarColNom) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A136BarColNum, 6, 0) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1234BarNomCli) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A166BarKgm, 9, 2) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A184BarMtr, 9, 2) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A198BarPie, 6, 0) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A151BarFasCod) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A180BarMaqCod) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A213BarSit, 2, 0) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13930BarAlbUlti, 10, 0) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13931BarAlbMts, 9, 2) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13932BarAlbKgs, 9, 2) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13933BarCuadern) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13934BarNormas) , GXutil.padr( "%" + GXutil.upper( AV106Listadodehdrs_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13935BarAlbFact, 8, 0) , GXutil.padr( "%" + AV106Listadodehdrs_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
                                 {
                                    if ( (0==AV133Listadodehdrs_wcds_28_tfbarpie) || ( ( A198BarPie >= AV133Listadodehdrs_wcds_28_tfbarpie ) ) )
                                    {
                                       if ( (0==AV134Listadodehdrs_wcds_29_tfbarpie_to) || ( ( A198BarPie <= AV134Listadodehdrs_wcds_29_tfbarpie_to ) ) )
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
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13878PedidoClie, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A212BarSer, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1652BarSerDsc, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += GXutil.str( A217BarTipArt, 4, 0) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13711BarTipArtD, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A135BarColNom, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += GXutil.str( A136BarColNum, 6, 0) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1234BarNomCli, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += GXutil.str( A166BarKgm, 9, 2) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += GXutil.str( A184BarMtr, 9, 2) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += GXutil.str( A198BarPie, 6, 0) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += localUtil.dtoc( A159BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += localUtil.dtoc( A155BarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += localUtil.dtoc( A158BarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A151BarFasCod, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A180BarMaqCod, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += GXutil.str( A213BarSit, 2, 0) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += GXutil.str( A13930BarAlbUlti, 10, 0) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += GXutil.str( A13931BarAlbMts, 9, 2) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += GXutil.str( A13932BarAlbKgs, 9, 2) ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13933BarCuadern, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             GXt_char2 = AV14TextFileLine ;
                                             GXv_char6[0] = GXt_char2 ;
                                             new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13934BarNormas, ";", ","), GXv_char6) ;
                                             listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
                                             AV14TextFileLine += GXt_char2 ;
                                          }
                                          if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                                          {
                                             AV14TextFileLine += ";" ;
                                             AV14TextFileLine += GXutil.str( A13935BarAlbFact, 8, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ListadodeHDRs_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "CliCod", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "CliNom", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "PedidoCliente", "", "Pedido Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarNHdr", "", "N° Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarSer", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarSerDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarTipArt", "", "Tip. Art.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarTipArtDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarColNom", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarColNum", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarNomCli", "", "Color Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarKgm", "Entradas", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarMtr", "Entradas", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarPie", "Entradas", "Piezas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarFecGen", "Fecha", "Generacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarFecCli", "Fecha", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarFecFpr", "Fecha", "Entrega Prevista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarFasCod", "", "Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarMaqCod", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarSit", "", "Situacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarAlbUltimo", "", "Albaran", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarAlbMts", "", "Mts Sal.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarAlbKgs", "", "Kgs Sal.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarCuaderno", "", "Cuaderno", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarNormas", "", "Normas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXv_SdtWWPColumnsSelector11[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, "BarAlbFact", "", "Factura", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char6[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ListadodeHDRs_WCColumnsSelector", GXv_char6) ;
      listadodehdrs_wcexportcsv_impl.this.GXt_char2 = GXv_char6[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector11[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector12[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector11, GXv_SdtWWPColumnsSelector12) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector11[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      }
   }

   public void S191( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("ListadodeHDRs_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "ListadodeHDRs_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("ListadodeHDRs_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV156GXV1 = 1 ;
      while ( AV156GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV156GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFCliCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV36TFCliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV37TFCliNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE") == 0 )
         {
            AV89TFPedidoCliente = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDIDOCLIENTE_SEL") == 0 )
         {
            AV90TFPedidoCliente_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV79TFBarNHdr = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV80TFBarNHdr_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV38TFBarSer = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV39TFBarSer_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV40TFBarSerDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV41TFBarSerDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPART") == 0 )
         {
            AV42TFBarTipArt = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV43TFBarTipArt_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC") == 0 )
         {
            AV44TFBarTipArtDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPARTDSC_SEL") == 0 )
         {
            AV45TFBarTipArtDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV46TFBarColNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV47TFBarColNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV48TFBarColNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV49TFBarColNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV54TFBarNomCli = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV55TFBarNomCli_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV56TFBarKgm = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV57TFBarKgm_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV58TFBarMtr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV59TFBarMtr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIE") == 0 )
         {
            AV60TFBarPie = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFBarPie_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV62TFBarFecGen = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV64TFBarFecCli = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV66TFBarFecFpr = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV68TFBarFasCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV69TFBarFasCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD") == 0 )
         {
            AV81TFBarMaqCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQCOD_SEL") == 0 )
         {
            AV82TFBarMaqCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV83TFBarSit = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV84TFBarSit_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBULTIMO") == 0 )
         {
            AV91TFBarAlbUltimo = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            AV92TFBarAlbUltimo_To = GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBMTS") == 0 )
         {
            AV93TFBarAlbMts = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV94TFBarAlbMts_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBKGS") == 0 )
         {
            AV95TFBarAlbKgs = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV96TFBarAlbKgs_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCUADERNO") == 0 )
         {
            AV97TFBarCuaderno = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCUADERNO_SEL") == 0 )
         {
            AV98TFBarCuaderno_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS") == 0 )
         {
            AV99TFBarNormas = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNORMAS_SEL") == 0 )
         {
            AV100TFBarNormas_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARALBFACT") == 0 )
         {
            AV101TFBarAlbFact = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV102TFBarAlbFact_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV70Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT") == 0 )
         {
            AV71BarSit = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSIT_TO") == 0 )
         {
            AV72BarSit_to = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN") == 0 )
         {
            AV73BarFecGen = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECGEN_TO") == 0 )
         {
            AV74BarFecGen_to = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV75Clicod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD_TO") == 0 )
         {
            AV76Clicod_to = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLI") == 0 )
         {
            AV77BarFecCli = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARFECCLI_TO") == 0 )
         {
            AV78BarFecCli_to = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV156GXV1 = (int)(AV156GXV1+1) ;
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
      A13878PedidoClie = "" ;
      A13696BarNHdr = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A151BarFasCod = "" ;
      A180BarMaqCod = "" ;
      A13931BarAlbMts = DecimalUtil.ZERO ;
      A13932BarAlbKgs = DecimalUtil.ZERO ;
      A13933BarCuadern = "" ;
      A13934BarNormas = "" ;
      AV106Listadodehdrs_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV109Listadodehdrs_wcds_4_tfclinom = "" ;
      AV36TFCliNom = "" ;
      AV110Listadodehdrs_wcds_5_tfclinom_sel = "" ;
      AV37TFCliNom_Sel = "" ;
      AV111Listadodehdrs_wcds_6_tfpedidocliente = "" ;
      AV89TFPedidoCliente = "" ;
      AV112Listadodehdrs_wcds_7_tfpedidocliente_sel = "" ;
      AV90TFPedidoCliente_Sel = "" ;
      AV113Listadodehdrs_wcds_8_tfbarnhdr = "" ;
      AV79TFBarNHdr = "" ;
      AV114Listadodehdrs_wcds_9_tfbarnhdr_sel = "" ;
      AV80TFBarNHdr_Sel = "" ;
      AV115Listadodehdrs_wcds_10_tfbarser = "" ;
      AV38TFBarSer = "" ;
      AV116Listadodehdrs_wcds_11_tfbarser_sel = "" ;
      AV39TFBarSer_Sel = "" ;
      AV117Listadodehdrs_wcds_12_tfbarserdsc = "" ;
      AV40TFBarSerDsc = "" ;
      AV118Listadodehdrs_wcds_13_tfbarserdsc_sel = "" ;
      AV41TFBarSerDsc_Sel = "" ;
      AV121Listadodehdrs_wcds_16_tfbartipartdsc = "" ;
      AV44TFBarTipArtDsc = "" ;
      AV122Listadodehdrs_wcds_17_tfbartipartdsc_sel = "" ;
      AV45TFBarTipArtDsc_Sel = "" ;
      AV123Listadodehdrs_wcds_18_tfbarcolnom = "" ;
      AV46TFBarColNom = "" ;
      AV124Listadodehdrs_wcds_19_tfbarcolnom_sel = "" ;
      AV47TFBarColNom_Sel = "" ;
      AV127Listadodehdrs_wcds_22_tfbarnomcli = "" ;
      AV54TFBarNomCli = "" ;
      AV128Listadodehdrs_wcds_23_tfbarnomcli_sel = "" ;
      AV55TFBarNomCli_Sel = "" ;
      AV129Listadodehdrs_wcds_24_tfbarkgm = DecimalUtil.ZERO ;
      AV56TFBarKgm = DecimalUtil.ZERO ;
      AV130Listadodehdrs_wcds_25_tfbarkgm_to = DecimalUtil.ZERO ;
      AV57TFBarKgm_To = DecimalUtil.ZERO ;
      AV131Listadodehdrs_wcds_26_tfbarmtr = DecimalUtil.ZERO ;
      AV58TFBarMtr = DecimalUtil.ZERO ;
      AV132Listadodehdrs_wcds_27_tfbarmtr_to = DecimalUtil.ZERO ;
      AV59TFBarMtr_To = DecimalUtil.ZERO ;
      AV135Listadodehdrs_wcds_30_tfbarfecgen = GXutil.nullDate() ;
      AV62TFBarFecGen = GXutil.nullDate() ;
      AV136Listadodehdrs_wcds_31_tfbarfeccli = GXutil.nullDate() ;
      AV64TFBarFecCli = GXutil.nullDate() ;
      AV137Listadodehdrs_wcds_32_tfbarfecfpr = GXutil.nullDate() ;
      AV66TFBarFecFpr = GXutil.nullDate() ;
      AV138Listadodehdrs_wcds_33_tfbarfascod = "" ;
      AV68TFBarFasCod = "" ;
      AV139Listadodehdrs_wcds_34_tfbarfascod_sel = "" ;
      AV69TFBarFasCod_Sel = "" ;
      AV140Listadodehdrs_wcds_35_tfbarmaqcod = "" ;
      AV81TFBarMaqCod = "" ;
      AV141Listadodehdrs_wcds_36_tfbarmaqcod_sel = "" ;
      AV82TFBarMaqCod_Sel = "" ;
      AV146Listadodehdrs_wcds_41_tfbaralbmts = DecimalUtil.ZERO ;
      AV93TFBarAlbMts = DecimalUtil.ZERO ;
      AV147Listadodehdrs_wcds_42_tfbaralbmts_to = DecimalUtil.ZERO ;
      AV94TFBarAlbMts_To = DecimalUtil.ZERO ;
      AV148Listadodehdrs_wcds_43_tfbaralbkgs = DecimalUtil.ZERO ;
      AV95TFBarAlbKgs = DecimalUtil.ZERO ;
      AV149Listadodehdrs_wcds_44_tfbaralbkgs_to = DecimalUtil.ZERO ;
      AV96TFBarAlbKgs_To = DecimalUtil.ZERO ;
      AV150Listadodehdrs_wcds_45_tfbarcuaderno = "" ;
      AV97TFBarCuaderno = "" ;
      AV151Listadodehdrs_wcds_46_tfbarcuaderno_sel = "" ;
      AV98TFBarCuaderno_Sel = "" ;
      AV152Listadodehdrs_wcds_47_tfbarnormas = "" ;
      AV99TFBarNormas = "" ;
      AV153Listadodehdrs_wcds_48_tfbarnormas_sel = "" ;
      AV100TFBarNormas_Sel = "" ;
      scmdbuf = "" ;
      lV138Listadodehdrs_wcds_33_tfbarfascod = "" ;
      lV150Listadodehdrs_wcds_45_tfbarcuaderno = "" ;
      lV109Listadodehdrs_wcds_4_tfclinom = "" ;
      lV113Listadodehdrs_wcds_8_tfbarnhdr = "" ;
      lV115Listadodehdrs_wcds_10_tfbarser = "" ;
      lV117Listadodehdrs_wcds_12_tfbarserdsc = "" ;
      lV121Listadodehdrs_wcds_16_tfbartipartdsc = "" ;
      lV123Listadodehdrs_wcds_18_tfbarcolnom = "" ;
      lV127Listadodehdrs_wcds_22_tfbarnomcli = "" ;
      lV140Listadodehdrs_wcds_35_tfbarmaqcod = "" ;
      A130BarCodPar = "" ;
      AV73BarFecGen = GXutil.nullDate() ;
      AV74BarFecGen_to = GXutil.nullDate() ;
      AV77BarFecCli = GXutil.nullDate() ;
      AV78BarFecCli_to = GXutil.nullDate() ;
      AV70Emprcod = "" ;
      A396EmprCod = "" ;
      P097T6_A9713Tb1_Cod = new short[1] ;
      P097T6_A4466BarAcaAnh = new short[1] ;
      P097T6_A213BarSit = new byte[1] ;
      P097T6_A180BarMaqCod = new String[] {""} ;
      P097T6_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      P097T6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P097T6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P097T6_A1234BarNomCli = new String[] {""} ;
      P097T6_A136BarColNum = new int[1] ;
      P097T6_A135BarColNom = new String[] {""} ;
      P097T6_A13711BarTipArtD = new String[] {""} ;
      P097T6_n13711BarTipArtD = new boolean[] {false} ;
      P097T6_A217BarTipArt = new short[1] ;
      P097T6_n217BarTipArt = new boolean[] {false} ;
      P097T6_A1652BarSerDsc = new String[] {""} ;
      P097T6_A212BarSer = new String[] {""} ;
      P097T6_A13696BarNHdr = new String[] {""} ;
      P097T6_A279CliNom = new String[] {""} ;
      P097T6_A252CliCod = new int[1] ;
      P097T6_n252CliCod = new boolean[] {false} ;
      P097T6_A13933BarCuadern = new String[] {""} ;
      P097T6_n13933BarCuadern = new boolean[] {false} ;
      P097T6_A13932BarAlbKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097T6_A13931BarAlbMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097T6_A151BarFasCod = new String[] {""} ;
      P097T6_n151BarFasCod = new boolean[] {false} ;
      P097T6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097T6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P097T6_A143BarDisNum = new String[] {""} ;
      P097T6_A4812BarEncCli = new String[] {""} ;
      P097T6_A199BarPie1 = new short[1] ;
      P097T6_A365DisDes = new String[] {""} ;
      P097T6_A898BarPieNDes = new int[1] ;
      P097T6_A361DisCod = new int[1] ;
      P097T6_A130BarCodPar = new String[] {""} ;
      P097T6_A132BarCodReo = new byte[1] ;
      P097T6_A129BarCod = new int[1] ;
      P097T6_A396EmprCod = new String[] {""} ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A365DisDes = "" ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int8 = new long[1] ;
      GXv_int10 = new int[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char6 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.listadodehdrs_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P097T6_A9713Tb1_Cod, P097T6_A4466BarAcaAnh, P097T6_A213BarSit, P097T6_A180BarMaqCod, P097T6_A158BarFecFpr, P097T6_A155BarFecCli, P097T6_A159BarFecGen, P097T6_A1234BarNomCli, P097T6_A136BarColNum, P097T6_A135BarColNom,
            P097T6_A13711BarTipArtD, P097T6_n13711BarTipArtD, P097T6_A217BarTipArt, P097T6_n217BarTipArt, P097T6_A1652BarSerDsc, P097T6_A212BarSer, P097T6_A13696BarNHdr, P097T6_A279CliNom, P097T6_A252CliCod, P097T6_n252CliCod,
            P097T6_A13933BarCuadern, P097T6_n13933BarCuadern, P097T6_A13932BarAlbKgs, P097T6_A13931BarAlbMts, P097T6_A151BarFasCod, P097T6_n151BarFasCod, P097T6_A184BarMtr, P097T6_A166BarKgm, P097T6_A143BarDisNum, P097T6_A4812BarEncCli,
            P097T6_A199BarPie1, P097T6_A365DisDes, P097T6_A898BarPieNDes, P097T6_A361DisCod, P097T6_A130BarCodPar, P097T6_A132BarCodReo, P097T6_A129BarCod, P097T6_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A213BarSit ;
   private byte AV142Listadodehdrs_wcds_37_tfbarsit ;
   private byte AV83TFBarSit ;
   private byte AV143Listadodehdrs_wcds_38_tfbarsit_to ;
   private byte AV84TFBarSit_To ;
   private byte A132BarCodReo ;
   private byte AV71BarSit ;
   private byte AV72BarSit_to ;
   private short gxcookieaux ;
   private short A217BarTipArt ;
   private short AV119Listadodehdrs_wcds_14_tfbartipart ;
   private short AV42TFBarTipArt ;
   private short AV120Listadodehdrs_wcds_15_tfbartipart_to ;
   private short AV43TFBarTipArt_To ;
   private short AV28OrderedBy ;
   private short A4466BarAcaAnh ;
   private short A199BarPie1 ;
   private short Gx_err ;
   private int AV13Random ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int A13935BarAlbFact ;
   private int AV107Listadodehdrs_wcds_2_tfclicod ;
   private int AV34TFCliCod ;
   private int AV108Listadodehdrs_wcds_3_tfclicod_to ;
   private int AV35TFCliCod_To ;
   private int AV125Listadodehdrs_wcds_20_tfbarcolnum ;
   private int AV48TFBarColNum ;
   private int AV126Listadodehdrs_wcds_21_tfbarcolnum_to ;
   private int AV49TFBarColNum_To ;
   private int AV133Listadodehdrs_wcds_28_tfbarpie ;
   private int AV60TFBarPie ;
   private int AV134Listadodehdrs_wcds_29_tfbarpie_to ;
   private int AV61TFBarPie_To ;
   private int AV154Listadodehdrs_wcds_49_tfbaralbfact ;
   private int AV101TFBarAlbFact ;
   private int AV155Listadodehdrs_wcds_50_tfbaralbfact_to ;
   private int AV102TFBarAlbFact_To ;
   private int A129BarCod ;
   private int AV75Clicod ;
   private int AV76Clicod_to ;
   private int A898BarPieNDes ;
   private int A361DisCod ;
   private int GXt_int9 ;
   private int GXv_int10[] ;
   private int AV156GXV1 ;
   private long A13930BarAlbUlti ;
   private long AV144Listadodehdrs_wcds_39_tfbaralbultimo ;
   private long AV91TFBarAlbUltimo ;
   private long AV145Listadodehdrs_wcds_40_tfbaralbultimo_to ;
   private long AV92TFBarAlbUltimo_To ;
   private long GXt_int7 ;
   private long GXv_int8[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A13931BarAlbMts ;
   private java.math.BigDecimal A13932BarAlbKgs ;
   private java.math.BigDecimal AV129Listadodehdrs_wcds_24_tfbarkgm ;
   private java.math.BigDecimal AV56TFBarKgm ;
   private java.math.BigDecimal AV130Listadodehdrs_wcds_25_tfbarkgm_to ;
   private java.math.BigDecimal AV57TFBarKgm_To ;
   private java.math.BigDecimal AV131Listadodehdrs_wcds_26_tfbarmtr ;
   private java.math.BigDecimal AV58TFBarMtr ;
   private java.math.BigDecimal AV132Listadodehdrs_wcds_27_tfbarmtr_to ;
   private java.math.BigDecimal AV59TFBarMtr_To ;
   private java.math.BigDecimal AV146Listadodehdrs_wcds_41_tfbaralbmts ;
   private java.math.BigDecimal AV93TFBarAlbMts ;
   private java.math.BigDecimal AV147Listadodehdrs_wcds_42_tfbaralbmts_to ;
   private java.math.BigDecimal AV94TFBarAlbMts_To ;
   private java.math.BigDecimal AV148Listadodehdrs_wcds_43_tfbaralbkgs ;
   private java.math.BigDecimal AV95TFBarAlbKgs ;
   private java.math.BigDecimal AV149Listadodehdrs_wcds_44_tfbaralbkgs_to ;
   private java.math.BigDecimal AV96TFBarAlbKgs_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A279CliNom ;
   private String A13878PedidoClie ;
   private String A13696BarNHdr ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A13711BarTipArtD ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A151BarFasCod ;
   private String A180BarMaqCod ;
   private String A13933BarCuadern ;
   private String AV109Listadodehdrs_wcds_4_tfclinom ;
   private String AV36TFCliNom ;
   private String AV110Listadodehdrs_wcds_5_tfclinom_sel ;
   private String AV37TFCliNom_Sel ;
   private String AV111Listadodehdrs_wcds_6_tfpedidocliente ;
   private String AV89TFPedidoCliente ;
   private String AV112Listadodehdrs_wcds_7_tfpedidocliente_sel ;
   private String AV90TFPedidoCliente_Sel ;
   private String AV113Listadodehdrs_wcds_8_tfbarnhdr ;
   private String AV79TFBarNHdr ;
   private String AV114Listadodehdrs_wcds_9_tfbarnhdr_sel ;
   private String AV80TFBarNHdr_Sel ;
   private String AV115Listadodehdrs_wcds_10_tfbarser ;
   private String AV38TFBarSer ;
   private String AV116Listadodehdrs_wcds_11_tfbarser_sel ;
   private String AV39TFBarSer_Sel ;
   private String AV117Listadodehdrs_wcds_12_tfbarserdsc ;
   private String AV40TFBarSerDsc ;
   private String AV118Listadodehdrs_wcds_13_tfbarserdsc_sel ;
   private String AV41TFBarSerDsc_Sel ;
   private String AV121Listadodehdrs_wcds_16_tfbartipartdsc ;
   private String AV44TFBarTipArtDsc ;
   private String AV122Listadodehdrs_wcds_17_tfbartipartdsc_sel ;
   private String AV45TFBarTipArtDsc_Sel ;
   private String AV123Listadodehdrs_wcds_18_tfbarcolnom ;
   private String AV46TFBarColNom ;
   private String AV124Listadodehdrs_wcds_19_tfbarcolnom_sel ;
   private String AV47TFBarColNom_Sel ;
   private String AV127Listadodehdrs_wcds_22_tfbarnomcli ;
   private String AV54TFBarNomCli ;
   private String AV128Listadodehdrs_wcds_23_tfbarnomcli_sel ;
   private String AV55TFBarNomCli_Sel ;
   private String AV138Listadodehdrs_wcds_33_tfbarfascod ;
   private String AV68TFBarFasCod ;
   private String AV139Listadodehdrs_wcds_34_tfbarfascod_sel ;
   private String AV69TFBarFasCod_Sel ;
   private String AV140Listadodehdrs_wcds_35_tfbarmaqcod ;
   private String AV81TFBarMaqCod ;
   private String AV141Listadodehdrs_wcds_36_tfbarmaqcod_sel ;
   private String AV82TFBarMaqCod_Sel ;
   private String AV150Listadodehdrs_wcds_45_tfbarcuaderno ;
   private String AV97TFBarCuaderno ;
   private String AV151Listadodehdrs_wcds_46_tfbarcuaderno_sel ;
   private String AV98TFBarCuaderno_Sel ;
   private String scmdbuf ;
   private String lV138Listadodehdrs_wcds_33_tfbarfascod ;
   private String lV150Listadodehdrs_wcds_45_tfbarcuaderno ;
   private String lV109Listadodehdrs_wcds_4_tfclinom ;
   private String lV113Listadodehdrs_wcds_8_tfbarnhdr ;
   private String lV115Listadodehdrs_wcds_10_tfbarser ;
   private String lV117Listadodehdrs_wcds_12_tfbarserdsc ;
   private String lV121Listadodehdrs_wcds_16_tfbartipartdsc ;
   private String lV123Listadodehdrs_wcds_18_tfbarcolnom ;
   private String lV127Listadodehdrs_wcds_22_tfbarnomcli ;
   private String lV140Listadodehdrs_wcds_35_tfbarmaqcod ;
   private String A130BarCodPar ;
   private String AV70Emprcod ;
   private String A396EmprCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A365DisDes ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String GXt_char2 ;
   private String GXv_char6[] ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV135Listadodehdrs_wcds_30_tfbarfecgen ;
   private java.util.Date AV62TFBarFecGen ;
   private java.util.Date AV136Listadodehdrs_wcds_31_tfbarfeccli ;
   private java.util.Date AV64TFBarFecCli ;
   private java.util.Date AV137Listadodehdrs_wcds_32_tfbarfecfpr ;
   private java.util.Date AV66TFBarFecFpr ;
   private java.util.Date AV73BarFecGen ;
   private java.util.Date AV74BarFecGen_to ;
   private java.util.Date AV77BarFecCli ;
   private java.util.Date AV78BarFecCli_to ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n13711BarTipArtD ;
   private boolean n217BarTipArt ;
   private boolean n252CliCod ;
   private boolean n13933BarCuadern ;
   private boolean n151BarFasCod ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String A13934BarNormas ;
   private String AV106Listadodehdrs_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String AV152Listadodehdrs_wcds_47_tfbarnormas ;
   private String AV99TFBarNormas ;
   private String AV153Listadodehdrs_wcds_48_tfbarnormas_sel ;
   private String AV100TFBarNormas_Sel ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P097T6_A9713Tb1_Cod ;
   private short[] P097T6_A4466BarAcaAnh ;
   private byte[] P097T6_A213BarSit ;
   private String[] P097T6_A180BarMaqCod ;
   private java.util.Date[] P097T6_A158BarFecFpr ;
   private java.util.Date[] P097T6_A155BarFecCli ;
   private java.util.Date[] P097T6_A159BarFecGen ;
   private String[] P097T6_A1234BarNomCli ;
   private int[] P097T6_A136BarColNum ;
   private String[] P097T6_A135BarColNom ;
   private String[] P097T6_A13711BarTipArtD ;
   private boolean[] P097T6_n13711BarTipArtD ;
   private short[] P097T6_A217BarTipArt ;
   private boolean[] P097T6_n217BarTipArt ;
   private String[] P097T6_A1652BarSerDsc ;
   private String[] P097T6_A212BarSer ;
   private String[] P097T6_A13696BarNHdr ;
   private String[] P097T6_A279CliNom ;
   private int[] P097T6_A252CliCod ;
   private boolean[] P097T6_n252CliCod ;
   private String[] P097T6_A13933BarCuadern ;
   private boolean[] P097T6_n13933BarCuadern ;
   private java.math.BigDecimal[] P097T6_A13932BarAlbKgs ;
   private java.math.BigDecimal[] P097T6_A13931BarAlbMts ;
   private String[] P097T6_A151BarFasCod ;
   private boolean[] P097T6_n151BarFasCod ;
   private java.math.BigDecimal[] P097T6_A184BarMtr ;
   private java.math.BigDecimal[] P097T6_A166BarKgm ;
   private String[] P097T6_A143BarDisNum ;
   private String[] P097T6_A4812BarEncCli ;
   private short[] P097T6_A199BarPie1 ;
   private String[] P097T6_A365DisDes ;
   private int[] P097T6_A898BarPieNDes ;
   private int[] P097T6_A361DisCod ;
   private String[] P097T6_A130BarCodPar ;
   private byte[] P097T6_A132BarCodReo ;
   private int[] P097T6_A129BarCod ;
   private String[] P097T6_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodehdrs_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P097T6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV107Listadodehdrs_wcds_2_tfclicod ,
                                          int AV108Listadodehdrs_wcds_3_tfclicod_to ,
                                          String AV110Listadodehdrs_wcds_5_tfclinom_sel ,
                                          String AV109Listadodehdrs_wcds_4_tfclinom ,
                                          String AV114Listadodehdrs_wcds_9_tfbarnhdr_sel ,
                                          String AV113Listadodehdrs_wcds_8_tfbarnhdr ,
                                          String AV116Listadodehdrs_wcds_11_tfbarser_sel ,
                                          String AV115Listadodehdrs_wcds_10_tfbarser ,
                                          String AV118Listadodehdrs_wcds_13_tfbarserdsc_sel ,
                                          String AV117Listadodehdrs_wcds_12_tfbarserdsc ,
                                          short AV119Listadodehdrs_wcds_14_tfbartipart ,
                                          short AV120Listadodehdrs_wcds_15_tfbartipart_to ,
                                          String AV122Listadodehdrs_wcds_17_tfbartipartdsc_sel ,
                                          String AV121Listadodehdrs_wcds_16_tfbartipartdsc ,
                                          String AV124Listadodehdrs_wcds_19_tfbarcolnom_sel ,
                                          String AV123Listadodehdrs_wcds_18_tfbarcolnom ,
                                          int AV125Listadodehdrs_wcds_20_tfbarcolnum ,
                                          int AV126Listadodehdrs_wcds_21_tfbarcolnum_to ,
                                          String AV128Listadodehdrs_wcds_23_tfbarnomcli_sel ,
                                          String AV127Listadodehdrs_wcds_22_tfbarnomcli ,
                                          java.math.BigDecimal AV129Listadodehdrs_wcds_24_tfbarkgm ,
                                          java.math.BigDecimal AV130Listadodehdrs_wcds_25_tfbarkgm_to ,
                                          java.math.BigDecimal AV131Listadodehdrs_wcds_26_tfbarmtr ,
                                          java.math.BigDecimal AV132Listadodehdrs_wcds_27_tfbarmtr_to ,
                                          java.util.Date AV135Listadodehdrs_wcds_30_tfbarfecgen ,
                                          java.util.Date AV136Listadodehdrs_wcds_31_tfbarfeccli ,
                                          java.util.Date AV137Listadodehdrs_wcds_32_tfbarfecfpr ,
                                          String AV141Listadodehdrs_wcds_36_tfbarmaqcod_sel ,
                                          String AV140Listadodehdrs_wcds_35_tfbarmaqcod ,
                                          byte AV142Listadodehdrs_wcds_37_tfbarsit ,
                                          byte AV143Listadodehdrs_wcds_38_tfbarsit_to ,
                                          java.math.BigDecimal AV146Listadodehdrs_wcds_41_tfbaralbmts ,
                                          java.math.BigDecimal AV147Listadodehdrs_wcds_42_tfbaralbmts_to ,
                                          java.math.BigDecimal AV148Listadodehdrs_wcds_43_tfbaralbkgs ,
                                          java.math.BigDecimal AV149Listadodehdrs_wcds_44_tfbaralbkgs_to ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          short A217BarTipArt ,
                                          String A13711BarTipArtD ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          String A180BarMaqCod ,
                                          byte A213BarSit ,
                                          java.math.BigDecimal A13931BarAlbMts ,
                                          java.math.BigDecimal A13932BarAlbKgs ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV106Listadodehdrs_wcds_1_filterfulltext ,
                                          String A13878PedidoClie ,
                                          String A13696BarNHdr ,
                                          int A198BarPie ,
                                          String A151BarFasCod ,
                                          long A13930BarAlbUlti ,
                                          String A13933BarCuadern ,
                                          String A13934BarNormas ,
                                          int A13935BarAlbFact ,
                                          String AV112Listadodehdrs_wcds_7_tfpedidocliente_sel ,
                                          String AV111Listadodehdrs_wcds_6_tfpedidocliente ,
                                          int AV133Listadodehdrs_wcds_28_tfbarpie ,
                                          int AV134Listadodehdrs_wcds_29_tfbarpie_to ,
                                          String AV139Listadodehdrs_wcds_34_tfbarfascod_sel ,
                                          String AV138Listadodehdrs_wcds_33_tfbarfascod ,
                                          long AV144Listadodehdrs_wcds_39_tfbaralbultimo ,
                                          long AV145Listadodehdrs_wcds_40_tfbaralbultimo_to ,
                                          String AV151Listadodehdrs_wcds_46_tfbarcuaderno_sel ,
                                          String AV150Listadodehdrs_wcds_45_tfbarcuaderno ,
                                          String AV153Listadodehdrs_wcds_48_tfbarnormas_sel ,
                                          String AV152Listadodehdrs_wcds_47_tfbarnormas ,
                                          int AV154Listadodehdrs_wcds_49_tfbaralbfact ,
                                          int AV155Listadodehdrs_wcds_50_tfbaralbfact_to ,
                                          java.util.Date AV73BarFecGen ,
                                          java.util.Date AV74BarFecGen_to ,
                                          java.util.Date AV77BarFecCli ,
                                          java.util.Date AV78BarFecCli_to ,
                                          int AV75Clicod ,
                                          int AV76Clicod_to ,
                                          byte AV71BarSit ,
                                          byte AV72BarSit_to ,
                                          String AV70Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[55];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT T4.Tb1_Cod, T1.BarAcaAnh, T1.BarSit, T1.BarMaqCod, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T2.TipArtDsc AS BarTipArtD," ;
      scmdbuf += " T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90')," ;
      scmdbuf += " 2))) || T1.BarCodPar AS BarNHdr, T3.CliNom, T1.CliCod, COALESCE( T4.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T5.BarAlbKgs, 0) AS BarAlbKgs, COALESCE( T5.BarAlbMts," ;
      scmdbuf += " 0) AS BarAlbMts, COALESCE( T6.BarFasCod, ' ') AS BarFasCod, COALESCE( T7.BarMtr, 0) AS BarMtr, COALESCE( T7.BarKgm, 0) AS BarKgm, T1.BarDisNum, T1.BarEncCli, COALESCE(" ;
      scmdbuf += " T7.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T7.BarPieNDes, 0) AS BarPieNDes, T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod)" ;
      scmdbuf += " LEFT JOIN TXPTABLE1 T4 ON T4.EmprCod = T1.EmprCod AND T4.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarAlbKgmE) AS BarAlbKgs, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarAlbMtrE) AS BarAlbMts FROM TXPALBBAR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS" ;
      scmdbuf += " T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst" ;
      scmdbuf += " <> 0) GROUP BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      scmdbuf += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T7.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T6.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T6.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T4.Tb1_Dsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T4.Tb1_Dsc, ' ') = ?))");
      addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      addWhere(sWhereString, "(T1.BarFecCli <= ? or (? = TO_DATE('0001-01-01', 'YYYY-MM-DD')))");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV107Listadodehdrs_wcds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (0==AV108Listadodehdrs_wcds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Listadodehdrs_wcds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV109Listadodehdrs_wcds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Listadodehdrs_wcds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int13[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV113Listadodehdrs_wcds_8_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Listadodehdrs_wcds_9_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int13[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Listadodehdrs_wcds_11_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV115Listadodehdrs_wcds_10_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Listadodehdrs_wcds_11_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int13[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV117Listadodehdrs_wcds_12_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Listadodehdrs_wcds_13_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int13[29] = (byte)(1) ;
      }
      if ( ! (0==AV119Listadodehdrs_wcds_14_tfbartipart) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int13[30] = (byte)(1) ;
      }
      if ( ! (0==AV120Listadodehdrs_wcds_15_tfbartipart_to) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int13[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) && ( ! (GXutil.strcmp("", AV121Listadodehdrs_wcds_16_tfbartipartdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipArtDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Listadodehdrs_wcds_17_tfbartipartdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipArtDsc = ?)");
      }
      else
      {
         GXv_int13[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV123Listadodehdrs_wcds_18_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Listadodehdrs_wcds_19_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int13[35] = (byte)(1) ;
      }
      if ( ! (0==AV125Listadodehdrs_wcds_20_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int13[36] = (byte)(1) ;
      }
      if ( ! (0==AV126Listadodehdrs_wcds_21_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int13[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV128Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV127Listadodehdrs_wcds_22_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV128Listadodehdrs_wcds_23_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int13[39] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Listadodehdrs_wcds_24_tfbarkgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int13[40] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Listadodehdrs_wcds_25_tfbarkgm_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int13[41] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Listadodehdrs_wcds_26_tfbarmtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int13[42] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Listadodehdrs_wcds_27_tfbarmtr_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T7.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int13[43] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Listadodehdrs_wcds_30_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int13[44] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV136Listadodehdrs_wcds_31_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int13[45] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV137Listadodehdrs_wcds_32_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int13[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV140Listadodehdrs_wcds_35_tfbarmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Listadodehdrs_wcds_36_tfbarmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqCod = ?)");
      }
      else
      {
         GXv_int13[48] = (byte)(1) ;
      }
      if ( ! (0==AV142Listadodehdrs_wcds_37_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int13[49] = (byte)(1) ;
      }
      if ( ! (0==AV143Listadodehdrs_wcds_38_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int13[50] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV146Listadodehdrs_wcds_41_tfbaralbmts)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) >= ?)");
      }
      else
      {
         GXv_int13[51] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV147Listadodehdrs_wcds_42_tfbaralbmts_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbMts, 0) <= ?)");
      }
      else
      {
         GXv_int13[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV148Listadodehdrs_wcds_43_tfbaralbkgs)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) >= ?)");
      }
      else
      {
         GXv_int13[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV149Listadodehdrs_wcds_44_tfbaralbkgs_to)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T5.BarAlbKgs, 0) <= ?)");
      }
      else
      {
         GXv_int13[54] = (byte)(1) ;
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
         scmdbuf += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipArt" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipArt DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipArtDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNom DESC" ;
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
         scmdbuf += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarFecFpr DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSit DESC" ;
      }
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
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
                  return conditional_P097T6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).byteValue() , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , (java.math.BigDecimal)dynConstraints[54] , (java.math.BigDecimal)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Boolean) dynConstraints[57]).booleanValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] , ((Number) dynConstraints[61]).intValue() , (String)dynConstraints[62] , ((Number) dynConstraints[63]).longValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , ((Number) dynConstraints[66]).intValue() , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , ((Number) dynConstraints[70]).intValue() , (String)dynConstraints[71] , (String)dynConstraints[72] , ((Number) dynConstraints[73]).longValue() , ((Number) dynConstraints[74]).longValue() , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).intValue() , ((Number) dynConstraints[80]).intValue() , (java.util.Date)dynConstraints[81] , (java.util.Date)dynConstraints[82] , (java.util.Date)dynConstraints[83] , (java.util.Date)dynConstraints[84] , ((Number) dynConstraints[85]).intValue() , ((Number) dynConstraints[86]).intValue() , ((Number) dynConstraints[87]).byteValue() , ((Number) dynConstraints[88]).byteValue() , (String)dynConstraints[89] , (String)dynConstraints[90] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P097T6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 26);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((String[]) buf[16])[0] = rslt.getString(15, 11);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((String[]) buf[24])[0] = rslt.getString(21, 8);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,2);
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((String[]) buf[29])[0] = rslt.getString(25, 20);
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((int[]) buf[32])[0] = rslt.getInt(28);
               ((int[]) buf[33])[0] = rslt.getInt(29);
               ((String[]) buf[34])[0] = rslt.getString(30, 1);
               ((byte[]) buf[35])[0] = rslt.getByte(31);
               ((int[]) buf[36])[0] = rslt.getInt(32);
               ((String[]) buf[37])[0] = rslt.getString(33, 3);
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
                  stmt.setString(sIdx, (String)parms[55], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 8);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 8);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[66]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[67]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[68]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[69]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[70]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 11);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 11);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 16);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 26);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[85]).shortValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[86]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 30);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[97], 2);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[98], 2);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[105]).byteValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[106], 2);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[107], 2);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[108], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[109], 2);
               }
               return;
      }
   }

}

