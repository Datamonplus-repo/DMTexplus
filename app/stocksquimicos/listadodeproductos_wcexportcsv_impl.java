package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeproductos_wcexportcsv_impl extends GXWebProcedure
{
   public listadodeproductos_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeProductos_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.ListadodeProductos_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("StocksQuimicos.ListadodeProductos_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Existencias Almacen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad Reservada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disponible", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pdte. Recibir", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Precio Actual", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Validez", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "R?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "AOX", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "GOTS", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "REACH", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Oeko Tex", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "HM", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "ZDHC", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "List by Inditex ", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "THELIST", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "GRS", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hoja?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Producto", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "NOmbre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Referencia Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Funcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N EINECS", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº CAS", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = AV34TFPrdNum ;
      AV100Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = AV36TFPrdNom ;
      AV102Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV103Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = AV41TFPrdExiAlm ;
      AV104Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = AV42TFPrdExiAlm_To ;
      AV105Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = AV43TFPrdCanRes ;
      AV106Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = AV44TFPrdCanRes_To ;
      AV107Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = AV93TFPrdDisponible ;
      AV108Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = AV94TFPrdDisponible_To ;
      AV109Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = AV45TFPrdCanPen ;
      AV110Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = AV46TFPrdCanPen_To ;
      AV111Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = AV47TFPrdPreAct ;
      AV112Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = AV48TFPrdPreAct_To ;
      AV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = AV49TFTipPrdDsc ;
      AV114Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = AV50TFTipPrdDsc_Sel ;
      AV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = AV51TFValDsc ;
      AV116Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = AV52TFValDsc_Sel ;
      AV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = AV53TFPrdRec ;
      AV118Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = AV54TFPrdRec_Sel ;
      AV119Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = AV55TFPrdAox ;
      AV120Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = AV56TFPrdAox_To ;
      AV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = AV57TFPrdGots ;
      AV122Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = AV58TFPrdGots_Sel ;
      AV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = AV59TFPrdReach ;
      AV124Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = AV60TFPrdReach_Sel ;
      AV125Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = AV62TFPrdOkotex_Sels ;
      AV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = AV63TFPrdHm ;
      AV127Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = AV64TFPrdHm_Sel ;
      AV128Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = AV66TFPrdZDHC_Sels ;
      AV129Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = AV68TFPrdList_Sels ;
      AV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = AV69TFPrdTHELIST ;
      AV131Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = AV70TFPrdTHELIST_Sel ;
      AV132Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = AV72TFPrdGRS_Sels ;
      AV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = AV73TFPrdHS ;
      AV134Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = AV74TFPrdHS_Sel ;
      AV135Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = AV75TFPrdFHS ;
      AV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = AV77TFPrdNum2 ;
      AV137Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = AV78TFPrdNum2_Sel ;
      AV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = AV79TFPrdNom2 ;
      AV139Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = AV80TFPrdNom2_Sel ;
      AV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = AV81TFPrdRefPrv ;
      AV141Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = AV82TFPrdRefPrv_Sel ;
      AV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = AV83TFPrdFuncion ;
      AV143Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = AV84TFPrdFuncion_Sel ;
      AV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = AV85TFPrdEINECS ;
      AV145Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = AV86TFPrdEINECS_Sel ;
      AV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = AV87TFPrdNCAS ;
      AV147Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = AV88TFPrdNCAS_Sel ;
      AV148Stocksquimicos_listadodeproductos_wcds_51_tfprvnum = AV89TFPrvNum ;
      AV149Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to = AV90TFPrvNum_To ;
      AV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = AV91TFPrvNom ;
      AV151Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = AV92TFPrvNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A5888PrdOkotex ,
                                           AV125Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ,
                                           A13301PrdZDHC ,
                                           AV128Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ,
                                           A11687PrdList ,
                                           AV129Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ,
                                           A13974PrdGRS ,
                                           AV132Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ,
                                           AV100Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ,
                                           AV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ,
                                           AV102Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ,
                                           AV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ,
                                           AV103Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ,
                                           AV104Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ,
                                           AV105Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ,
                                           AV106Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ,
                                           AV107Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ,
                                           AV108Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ,
                                           AV109Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ,
                                           AV110Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ,
                                           AV111Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ,
                                           AV112Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ,
                                           AV114Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ,
                                           AV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ,
                                           AV116Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ,
                                           AV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ,
                                           AV118Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ,
                                           AV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ,
                                           AV119Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ,
                                           AV120Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ,
                                           AV122Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ,
                                           AV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ,
                                           AV124Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ,
                                           AV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ,
                                           Integer.valueOf(AV125Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels.size()) ,
                                           AV127Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ,
                                           AV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ,
                                           Integer.valueOf(AV128Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels.size()) ,
                                           Integer.valueOf(AV129Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels.size()) ,
                                           AV131Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ,
                                           AV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ,
                                           Integer.valueOf(AV132Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels.size()) ,
                                           AV134Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ,
                                           AV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ,
                                           AV135Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ,
                                           AV137Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ,
                                           AV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ,
                                           AV139Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ,
                                           AV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ,
                                           AV141Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ,
                                           AV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ,
                                           AV143Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ,
                                           AV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ,
                                           AV145Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ,
                                           AV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ,
                                           AV147Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ,
                                           AV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ,
                                           Integer.valueOf(AV148Stocksquimicos_listadodeproductos_wcds_51_tfprvnum) ,
                                           Integer.valueOf(AV149Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to) ,
                                           AV151Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ,
                                           AV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ,
                                           AV39PrdNumfrom ,
                                           AV40PrdnumTo ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A724PrdPreAct ,
                                           A6302TipPrdDsc ,
                                           A857ValDsc ,
                                           A727PrdRec ,
                                           A9733PrdAox ,
                                           A11363PrdGots ,
                                           A5887PrdReach ,
                                           A11364PrdHm ,
                                           A13302PrdTHELIST ,
                                           A9741PrdHS ,
                                           A9742PrdFHS ,
                                           A4693PrdNum2 ,
                                           A4692PrdNom2 ,
                                           A728PrdRefPrv ,
                                           A11615PrdFuncion ,
                                           A11614PrdEINECS ,
                                           A9734PrdNCAS ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ,
                                           A13831PrdDisponi ,
                                           AV38emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum), 6, "%") ;
      lV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom), 26, "%") ;
      lV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = GXutil.padr( GXutil.rtrim( AV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc), 40, "%") ;
      lV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = GXutil.padr( GXutil.rtrim( AV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc), 16, "%") ;
      lV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = GXutil.padr( GXutil.rtrim( AV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec), 1, "%") ;
      lV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = GXutil.padr( GXutil.rtrim( AV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots), 1, "%") ;
      lV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = GXutil.padr( GXutil.rtrim( AV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach), 1, "%") ;
      lV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = GXutil.padr( GXutil.rtrim( AV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm), 1, "%") ;
      lV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = GXutil.padr( GXutil.rtrim( AV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist), 4, "%") ;
      lV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = GXutil.padr( GXutil.rtrim( AV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs), 1, "%") ;
      lV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = GXutil.padr( GXutil.rtrim( AV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2), 16, "%") ;
      lV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = GXutil.padr( GXutil.rtrim( AV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2), 40, "%") ;
      lV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = GXutil.padr( GXutil.rtrim( AV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv), 30, "%") ;
      lV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = GXutil.padr( GXutil.rtrim( AV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion), 50, "%") ;
      lV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = GXutil.padr( GXutil.rtrim( AV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs), 40, "%") ;
      lV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = GXutil.padr( GXutil.rtrim( AV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas), 30, "%") ;
      lV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = GXutil.padr( GXutil.rtrim( AV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom), 30, "%") ;
      /* Using cursor P09DV2 */
      pr_default.execute(0, new Object[] {AV38emprcod, lV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum, AV100Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel, lV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom, AV102Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel, AV103Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm, AV104Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to, AV105Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres, AV106Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to, AV107Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible, AV108Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to, AV109Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen, AV110Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to, AV111Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact, AV112Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to, lV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc, AV114Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel, lV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc, AV116Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel, lV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec, AV118Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel, AV119Stocksquimicos_listadodeproductos_wcds_22_tfprdaox, AV120Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to, lV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots, AV122Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel, lV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach, AV124Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel, lV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm, AV127Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel, lV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist, AV131Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel, lV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs, AV134Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel, AV135Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs, lV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2, AV137Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel, lV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2, AV139Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel, lV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv, AV141Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel, lV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion, AV143Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel, lV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs, AV145Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel, lV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas, AV147Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel, Integer.valueOf(AV148Stocksquimicos_listadodeproductos_wcds_51_tfprvnum), Integer.valueOf(AV149Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to), lV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom, AV151Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel, AV39PrdNumfrom, AV40PrdnumTo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A856ValCod = P09DV2_A856ValCod[0] ;
         A6301TipPrdCod = P09DV2_A6301TipPrdCod[0] ;
         n6301TipPrdCod = P09DV2_n6301TipPrdCod[0] ;
         A396EmprCod = P09DV2_A396EmprCod[0] ;
         A794PrvNom = P09DV2_A794PrvNom[0] ;
         n794PrvNom = P09DV2_n794PrvNom[0] ;
         A795PrvNum = P09DV2_A795PrvNum[0] ;
         A9734PrdNCAS = P09DV2_A9734PrdNCAS[0] ;
         A11614PrdEINECS = P09DV2_A11614PrdEINECS[0] ;
         A11615PrdFuncion = P09DV2_A11615PrdFuncion[0] ;
         A728PrdRefPrv = P09DV2_A728PrdRefPrv[0] ;
         A4692PrdNom2 = P09DV2_A4692PrdNom2[0] ;
         A4693PrdNum2 = P09DV2_A4693PrdNum2[0] ;
         A9742PrdFHS = P09DV2_A9742PrdFHS[0] ;
         A9741PrdHS = P09DV2_A9741PrdHS[0] ;
         A13302PrdTHELIST = P09DV2_A13302PrdTHELIST[0] ;
         n13302PrdTHELIST = P09DV2_n13302PrdTHELIST[0] ;
         A11364PrdHm = P09DV2_A11364PrdHm[0] ;
         A5887PrdReach = P09DV2_A5887PrdReach[0] ;
         A11363PrdGots = P09DV2_A11363PrdGots[0] ;
         A9733PrdAox = P09DV2_A9733PrdAox[0] ;
         A727PrdRec = P09DV2_A727PrdRec[0] ;
         A857ValDsc = P09DV2_A857ValDsc[0] ;
         n857ValDsc = P09DV2_n857ValDsc[0] ;
         A6302TipPrdDsc = P09DV2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09DV2_n6302TipPrdDsc[0] ;
         A724PrdPreAct = P09DV2_A724PrdPreAct[0] ;
         A684PrdCanPen = P09DV2_A684PrdCanPen[0] ;
         A13831PrdDisponi = P09DV2_A13831PrdDisponi[0] ;
         A718PrdNom = P09DV2_A718PrdNom[0] ;
         A719PrdNum = P09DV2_A719PrdNum[0] ;
         A13974PrdGRS = P09DV2_A13974PrdGRS[0] ;
         n13974PrdGRS = P09DV2_n13974PrdGRS[0] ;
         A11687PrdList = P09DV2_A11687PrdList[0] ;
         A13301PrdZDHC = P09DV2_A13301PrdZDHC[0] ;
         A5888PrdOkotex = P09DV2_A5888PrdOkotex[0] ;
         A704PrdExiAlm = P09DV2_A704PrdExiAlm[0] ;
         A685PrdCanRes = P09DV2_A685PrdCanRes[0] ;
         A857ValDsc = P09DV2_A857ValDsc[0] ;
         n857ValDsc = P09DV2_n857ValDsc[0] ;
         A6302TipPrdDsc = P09DV2_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = P09DV2_n6302TipPrdDsc[0] ;
         A794PrvNom = P09DV2_A794PrvNom[0] ;
         n794PrvNom = P09DV2_n794PrvNom[0] ;
         if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A685PrdCanRes, 12, 4) , GXutil.padr( "%" + AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13831PrdDisponi, 12, 4) , GXutil.padr( "%" + AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A684PrdCanPen, 12, 4) , GXutil.padr( "%" + AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6302TipPrdDsc) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A857ValDsc) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A727PrdRec) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A9733PrdAox, 6, 2) , GXutil.padr( "%" + AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11363PrdGots) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5887PrdReach) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5888PrdOkotex, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A11364PrdHm) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 1", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "1") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 2", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "2") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nivel 3", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13301PrdZDHC, "3") == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A11687PrdList, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A13302PrdTHELIST) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "n", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "s", ""), "") , GXutil.padr( "%" + GXutil.lower( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A13974PrdGRS, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A9741PrdHS) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4693PrdNum2) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4692PrdNom2) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A728PrdRefPrv) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11615PrdFuncion) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A11614PrdEINECS) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A9734PrdNCAS) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
               returnInSub = true;
               if (true) return;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A719PrdNum, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A718PrdNom, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A704PrdExiAlm, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A685PrdCanRes, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A13831PrdDisponi, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A684PrdCanPen, 12, 4) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A724PrdPreAct, 14, 5) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6302TipPrdDsc, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A857ValDsc, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A727PrdRec, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A9733PrdAox, 6, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11363PrdGots, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5887PrdReach, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11364PrdHm, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13302PrdTHELIST, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A13974PrdGRS), "N") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "N", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A13974PrdGRS), "S") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "S", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9741PrdHS, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A9742PrdFHS, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4693PrdNum2, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A4692PrdNom2, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A728PrdRefPrv, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11615PrdFuncion, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11614PrdEINECS, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A9734PrdNCAS, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A795PrvNum, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A794PrvNom, ";", ","), GXv_char3) ;
               listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ListadodeProductos_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdExiAlm", "", "Existencias Almacen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCanRes", "", "Cantidad Reservada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdDisponible", "", "Disponible", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdCanPen", "", "Pdte. Recibir", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdPreAct", "", "Precio Actual", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipPrdDsc", "", "Tipo Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ValDsc", "", "Validez", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdRec", "", "R?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdAox", "", "AOX", true, "") ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdGRS", "", "GRS", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdHS", "Seguridad", "Hoja?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFHS", "Seguridad", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNum2", "Auxiliar", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNom2", "Auxiliar", "NOmbre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdRefPrv", "", "Referencia Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdFuncion", "", "Funcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdEINECS", "", "N EINECS", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrdNCAS", "", "Nº CAS", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNum", "", "Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadodeProductos_WCColumnsSelector", GXv_char3) ;
      listadodeproductos_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.ListadodeProductos_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.ListadodeProductos_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("StocksQuimicos.ListadodeProductos_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV152GXV1 = 1 ;
      while ( AV152GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV152GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV34TFPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV35TFPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV36TFPrdNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV37TFPrdNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV41TFPrdExiAlm = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV42TFPrdExiAlm_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV43TFPrdCanRes = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV44TFPrdCanRes_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDISPONIBLE") == 0 )
         {
            AV93TFPrdDisponible = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV94TFPrdDisponible_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV45TFPrdCanPen = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV46TFPrdCanPen_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV47TFPrdPreAct = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV48TFPrdPreAct_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC") == 0 )
         {
            AV49TFTipPrdDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPPRDDSC_SEL") == 0 )
         {
            AV50TFTipPrdDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV51TFValDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV52TFValDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV53TFPrdRec = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV54TFPrdRec_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDAOX") == 0 )
         {
            AV55TFPrdAox = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV56TFPrdAox_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS") == 0 )
         {
            AV57TFPrdGots = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGOTS_SEL") == 0 )
         {
            AV58TFPrdGots_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH") == 0 )
         {
            AV59TFPrdReach = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREACH_SEL") == 0 )
         {
            AV60TFPrdReach_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDOKOTEX_SEL") == 0 )
         {
            AV61TFPrdOkotex_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV62TFPrdOkotex_Sels.fromJSonString(AV61TFPrdOkotex_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM") == 0 )
         {
            AV63TFPrdHm = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHM_SEL") == 0 )
         {
            AV64TFPrdHm_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDZDHC_SEL") == 0 )
         {
            AV65TFPrdZDHC_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV66TFPrdZDHC_Sels.fromJSonString(AV65TFPrdZDHC_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIST_SEL") == 0 )
         {
            AV67TFPrdList_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV68TFPrdList_Sels.fromJSonString(AV67TFPrdList_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST") == 0 )
         {
            AV69TFPrdTHELIST = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDTHELIST_SEL") == 0 )
         {
            AV70TFPrdTHELIST_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDGRS_SEL") == 0 )
         {
            AV71TFPrdGRS_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV72TFPrdGRS_Sels.fromJSonString(AV71TFPrdGRS_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS") == 0 )
         {
            AV73TFPrdHS = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDHS_SEL") == 0 )
         {
            AV74TFPrdHS_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFHS") == 0 )
         {
            AV75TFPrdFHS = localUtil.ctod( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2") == 0 )
         {
            AV77TFPrdNum2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM2_SEL") == 0 )
         {
            AV78TFPrdNum2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM2") == 0 )
         {
            AV79TFPrdNom2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM2_SEL") == 0 )
         {
            AV80TFPrdNom2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV") == 0 )
         {
            AV81TFPrdRefPrv = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREFPRV_SEL") == 0 )
         {
            AV82TFPrdRefPrv_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFUNCION") == 0 )
         {
            AV83TFPrdFuncion = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFUNCION_SEL") == 0 )
         {
            AV84TFPrdFuncion_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEINECS") == 0 )
         {
            AV85TFPrdEINECS = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEINECS_SEL") == 0 )
         {
            AV86TFPrdEINECS_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCAS") == 0 )
         {
            AV87TFPrdNCAS = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNCAS_SEL") == 0 )
         {
            AV88TFPrdNCAS_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV89TFPrvNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV90TFPrvNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV91TFPrvNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV92TFPrvNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV38emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMFROM") == 0 )
         {
            AV39PrdNumfrom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRDNUMTO") == 0 )
         {
            AV40PrdnumTo = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV152GXV1 = (int)(AV152GXV1+1) ;
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
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A13831PrdDisponi = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A6302TipPrdDsc = "" ;
      A857ValDsc = "" ;
      A727PrdRec = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A11363PrdGots = "" ;
      A5887PrdReach = "" ;
      A5888PrdOkotex = "" ;
      A11364PrdHm = "" ;
      A13301PrdZDHC = "" ;
      A11687PrdList = "" ;
      A13302PrdTHELIST = "" ;
      A13974PrdGRS = "" ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A4693PrdNum2 = "" ;
      A4692PrdNom2 = "" ;
      A728PrdRefPrv = "" ;
      A11615PrdFuncion = "" ;
      A11614PrdEINECS = "" ;
      A9734PrdNCAS = "" ;
      A794PrvNom = "" ;
      AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = "" ;
      AV34TFPrdNum = "" ;
      AV100Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel = "" ;
      AV35TFPrdNum_Sel = "" ;
      AV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = "" ;
      AV36TFPrdNom = "" ;
      AV102Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel = "" ;
      AV37TFPrdNom_Sel = "" ;
      AV103Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm = DecimalUtil.ZERO ;
      AV41TFPrdExiAlm = DecimalUtil.ZERO ;
      AV104Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to = DecimalUtil.ZERO ;
      AV42TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV105Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres = DecimalUtil.ZERO ;
      AV43TFPrdCanRes = DecimalUtil.ZERO ;
      AV106Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to = DecimalUtil.ZERO ;
      AV44TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV107Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible = DecimalUtil.ZERO ;
      AV93TFPrdDisponible = DecimalUtil.ZERO ;
      AV108Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to = DecimalUtil.ZERO ;
      AV94TFPrdDisponible_To = DecimalUtil.ZERO ;
      AV109Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen = DecimalUtil.ZERO ;
      AV45TFPrdCanPen = DecimalUtil.ZERO ;
      AV110Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV46TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV111Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact = DecimalUtil.ZERO ;
      AV47TFPrdPreAct = DecimalUtil.ZERO ;
      AV112Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to = DecimalUtil.ZERO ;
      AV48TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = "" ;
      AV49TFTipPrdDsc = "" ;
      AV114Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel = "" ;
      AV50TFTipPrdDsc_Sel = "" ;
      AV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = "" ;
      AV51TFValDsc = "" ;
      AV116Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel = "" ;
      AV52TFValDsc_Sel = "" ;
      AV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = "" ;
      AV53TFPrdRec = "" ;
      AV118Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel = "" ;
      AV54TFPrdRec_Sel = "" ;
      AV119Stocksquimicos_listadodeproductos_wcds_22_tfprdaox = DecimalUtil.ZERO ;
      AV55TFPrdAox = DecimalUtil.ZERO ;
      AV120Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to = DecimalUtil.ZERO ;
      AV56TFPrdAox_To = DecimalUtil.ZERO ;
      AV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = "" ;
      AV57TFPrdGots = "" ;
      AV122Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel = "" ;
      AV58TFPrdGots_Sel = "" ;
      AV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = "" ;
      AV59TFPrdReach = "" ;
      AV124Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel = "" ;
      AV60TFPrdReach_Sel = "" ;
      AV125Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV62TFPrdOkotex_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = "" ;
      AV63TFPrdHm = "" ;
      AV127Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel = "" ;
      AV64TFPrdHm_Sel = "" ;
      AV128Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66TFPrdZDHC_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV129Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV68TFPrdList_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = "" ;
      AV69TFPrdTHELIST = "" ;
      AV131Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel = "" ;
      AV70TFPrdTHELIST_Sel = "" ;
      AV132Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV72TFPrdGRS_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = "" ;
      AV73TFPrdHS = "" ;
      AV134Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel = "" ;
      AV74TFPrdHS_Sel = "" ;
      AV135Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs = GXutil.nullDate() ;
      AV75TFPrdFHS = GXutil.nullDate() ;
      AV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = "" ;
      AV77TFPrdNum2 = "" ;
      AV137Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel = "" ;
      AV78TFPrdNum2_Sel = "" ;
      AV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = "" ;
      AV79TFPrdNom2 = "" ;
      AV139Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel = "" ;
      AV80TFPrdNom2_Sel = "" ;
      AV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = "" ;
      AV81TFPrdRefPrv = "" ;
      AV141Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel = "" ;
      AV82TFPrdRefPrv_Sel = "" ;
      AV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = "" ;
      AV83TFPrdFuncion = "" ;
      AV143Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel = "" ;
      AV84TFPrdFuncion_Sel = "" ;
      AV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = "" ;
      AV85TFPrdEINECS = "" ;
      AV145Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel = "" ;
      AV86TFPrdEINECS_Sel = "" ;
      AV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = "" ;
      AV87TFPrdNCAS = "" ;
      AV147Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel = "" ;
      AV88TFPrdNCAS_Sel = "" ;
      AV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = "" ;
      AV91TFPrvNom = "" ;
      AV151Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel = "" ;
      AV92TFPrvNom_Sel = "" ;
      lV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum = "" ;
      lV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom = "" ;
      lV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc = "" ;
      lV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc = "" ;
      lV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec = "" ;
      lV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots = "" ;
      lV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach = "" ;
      lV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm = "" ;
      lV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist = "" ;
      lV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs = "" ;
      lV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 = "" ;
      lV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 = "" ;
      lV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv = "" ;
      lV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion = "" ;
      lV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs = "" ;
      lV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas = "" ;
      lV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom = "" ;
      AV39PrdNumfrom = "" ;
      AV40PrdnumTo = "" ;
      AV38emprcod = "" ;
      A396EmprCod = "" ;
      P09DV2_A856ValCod = new byte[1] ;
      P09DV2_A6301TipPrdCod = new short[1] ;
      P09DV2_n6301TipPrdCod = new boolean[] {false} ;
      P09DV2_A396EmprCod = new String[] {""} ;
      P09DV2_A794PrvNom = new String[] {""} ;
      P09DV2_n794PrvNom = new boolean[] {false} ;
      P09DV2_A795PrvNum = new int[1] ;
      P09DV2_A9734PrdNCAS = new String[] {""} ;
      P09DV2_A11614PrdEINECS = new String[] {""} ;
      P09DV2_A11615PrdFuncion = new String[] {""} ;
      P09DV2_A728PrdRefPrv = new String[] {""} ;
      P09DV2_A4692PrdNom2 = new String[] {""} ;
      P09DV2_A4693PrdNum2 = new String[] {""} ;
      P09DV2_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      P09DV2_A9741PrdHS = new String[] {""} ;
      P09DV2_A13302PrdTHELIST = new String[] {""} ;
      P09DV2_n13302PrdTHELIST = new boolean[] {false} ;
      P09DV2_A11364PrdHm = new String[] {""} ;
      P09DV2_A5887PrdReach = new String[] {""} ;
      P09DV2_A11363PrdGots = new String[] {""} ;
      P09DV2_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DV2_A727PrdRec = new String[] {""} ;
      P09DV2_A857ValDsc = new String[] {""} ;
      P09DV2_n857ValDsc = new boolean[] {false} ;
      P09DV2_A6302TipPrdDsc = new String[] {""} ;
      P09DV2_n6302TipPrdDsc = new boolean[] {false} ;
      P09DV2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DV2_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DV2_A13831PrdDisponi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DV2_A718PrdNom = new String[] {""} ;
      P09DV2_A719PrdNum = new String[] {""} ;
      P09DV2_A13974PrdGRS = new String[] {""} ;
      P09DV2_n13974PrdGRS = new boolean[] {false} ;
      P09DV2_A11687PrdList = new String[] {""} ;
      P09DV2_A13301PrdZDHC = new String[] {""} ;
      P09DV2_A5888PrdOkotex = new String[] {""} ;
      P09DV2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09DV2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      AV61TFPrdOkotex_SelsJson = "" ;
      AV65TFPrdZDHC_SelsJson = "" ;
      AV67TFPrdList_SelsJson = "" ;
      AV71TFPrdGRS_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodeproductos_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09DV2_A856ValCod, P09DV2_A6301TipPrdCod, P09DV2_n6301TipPrdCod, P09DV2_A396EmprCod, P09DV2_A794PrvNom, P09DV2_n794PrvNom, P09DV2_A795PrvNum, P09DV2_A9734PrdNCAS, P09DV2_A11614PrdEINECS, P09DV2_A11615PrdFuncion,
            P09DV2_A728PrdRefPrv, P09DV2_A4692PrdNom2, P09DV2_A4693PrdNum2, P09DV2_A9742PrdFHS, P09DV2_A9741PrdHS, P09DV2_A13302PrdTHELIST, P09DV2_n13302PrdTHELIST, P09DV2_A11364PrdHm, P09DV2_A5887PrdReach, P09DV2_A11363PrdGots,
            P09DV2_A9733PrdAox, P09DV2_A727PrdRec, P09DV2_A857ValDsc, P09DV2_n857ValDsc, P09DV2_A6302TipPrdDsc, P09DV2_n6302TipPrdDsc, P09DV2_A724PrdPreAct, P09DV2_A684PrdCanPen, P09DV2_A13831PrdDisponi, P09DV2_A718PrdNom,
            P09DV2_A719PrdNum, P09DV2_A13974PrdGRS, P09DV2_n13974PrdGRS, P09DV2_A11687PrdList, P09DV2_A13301PrdZDHC, P09DV2_A5888PrdOkotex, P09DV2_A704PrdExiAlm, P09DV2_A685PrdCanRes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A856ValCod ;
   private short gxcookieaux ;
   private short AV28OrderedBy ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int AV13Random ;
   private int A795PrvNum ;
   private int AV148Stocksquimicos_listadodeproductos_wcds_51_tfprvnum ;
   private int AV89TFPrvNum ;
   private int AV149Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to ;
   private int AV90TFPrvNum_To ;
   private int AV125Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size ;
   private int AV128Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size ;
   private int AV129Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size ;
   private int AV132Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size ;
   private int AV152GXV1 ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A13831PrdDisponi ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal AV103Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ;
   private java.math.BigDecimal AV41TFPrdExiAlm ;
   private java.math.BigDecimal AV104Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ;
   private java.math.BigDecimal AV42TFPrdExiAlm_To ;
   private java.math.BigDecimal AV105Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ;
   private java.math.BigDecimal AV43TFPrdCanRes ;
   private java.math.BigDecimal AV106Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ;
   private java.math.BigDecimal AV44TFPrdCanRes_To ;
   private java.math.BigDecimal AV107Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ;
   private java.math.BigDecimal AV93TFPrdDisponible ;
   private java.math.BigDecimal AV108Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ;
   private java.math.BigDecimal AV94TFPrdDisponible_To ;
   private java.math.BigDecimal AV109Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ;
   private java.math.BigDecimal AV45TFPrdCanPen ;
   private java.math.BigDecimal AV110Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ;
   private java.math.BigDecimal AV46TFPrdCanPen_To ;
   private java.math.BigDecimal AV111Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ;
   private java.math.BigDecimal AV47TFPrdPreAct ;
   private java.math.BigDecimal AV112Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ;
   private java.math.BigDecimal AV48TFPrdPreAct_To ;
   private java.math.BigDecimal AV119Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ;
   private java.math.BigDecimal AV55TFPrdAox ;
   private java.math.BigDecimal AV120Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ;
   private java.math.BigDecimal AV56TFPrdAox_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String A6302TipPrdDsc ;
   private String A857ValDsc ;
   private String A727PrdRec ;
   private String A11363PrdGots ;
   private String A5887PrdReach ;
   private String A5888PrdOkotex ;
   private String A11364PrdHm ;
   private String A13301PrdZDHC ;
   private String A11687PrdList ;
   private String A13302PrdTHELIST ;
   private String A13974PrdGRS ;
   private String A9741PrdHS ;
   private String A4693PrdNum2 ;
   private String A4692PrdNom2 ;
   private String A728PrdRefPrv ;
   private String A11615PrdFuncion ;
   private String A11614PrdEINECS ;
   private String A9734PrdNCAS ;
   private String A794PrvNom ;
   private String AV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ;
   private String AV34TFPrdNum ;
   private String AV100Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ;
   private String AV35TFPrdNum_Sel ;
   private String AV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ;
   private String AV36TFPrdNom ;
   private String AV102Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ;
   private String AV37TFPrdNom_Sel ;
   private String AV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ;
   private String AV49TFTipPrdDsc ;
   private String AV114Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ;
   private String AV50TFTipPrdDsc_Sel ;
   private String AV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ;
   private String AV51TFValDsc ;
   private String AV116Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ;
   private String AV52TFValDsc_Sel ;
   private String AV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ;
   private String AV53TFPrdRec ;
   private String AV118Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ;
   private String AV54TFPrdRec_Sel ;
   private String AV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ;
   private String AV57TFPrdGots ;
   private String AV122Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ;
   private String AV58TFPrdGots_Sel ;
   private String AV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ;
   private String AV59TFPrdReach ;
   private String AV124Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ;
   private String AV60TFPrdReach_Sel ;
   private String AV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ;
   private String AV63TFPrdHm ;
   private String AV127Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ;
   private String AV64TFPrdHm_Sel ;
   private String AV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ;
   private String AV69TFPrdTHELIST ;
   private String AV131Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ;
   private String AV70TFPrdTHELIST_Sel ;
   private String AV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ;
   private String AV73TFPrdHS ;
   private String AV134Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ;
   private String AV74TFPrdHS_Sel ;
   private String AV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ;
   private String AV77TFPrdNum2 ;
   private String AV137Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ;
   private String AV78TFPrdNum2_Sel ;
   private String AV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ;
   private String AV79TFPrdNom2 ;
   private String AV139Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ;
   private String AV80TFPrdNom2_Sel ;
   private String AV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ;
   private String AV81TFPrdRefPrv ;
   private String AV141Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ;
   private String AV82TFPrdRefPrv_Sel ;
   private String AV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ;
   private String AV83TFPrdFuncion ;
   private String AV143Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ;
   private String AV84TFPrdFuncion_Sel ;
   private String AV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ;
   private String AV85TFPrdEINECS ;
   private String AV145Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ;
   private String AV86TFPrdEINECS_Sel ;
   private String AV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ;
   private String AV87TFPrdNCAS ;
   private String AV147Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ;
   private String AV88TFPrdNCAS_Sel ;
   private String AV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ;
   private String AV91TFPrvNom ;
   private String AV151Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ;
   private String AV92TFPrvNom_Sel ;
   private String scmdbuf ;
   private String lV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ;
   private String lV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ;
   private String lV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ;
   private String lV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ;
   private String lV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ;
   private String lV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ;
   private String lV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ;
   private String lV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ;
   private String lV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ;
   private String lV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ;
   private String lV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ;
   private String lV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ;
   private String lV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ;
   private String lV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ;
   private String lV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ;
   private String lV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ;
   private String lV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ;
   private String AV39PrdNumfrom ;
   private String AV40PrdnumTo ;
   private String AV38emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date AV135Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ;
   private java.util.Date AV75TFPrdFHS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n6301TipPrdCod ;
   private boolean n794PrvNom ;
   private boolean n13302PrdTHELIST ;
   private boolean n857ValDsc ;
   private boolean n6302TipPrdDsc ;
   private boolean n13974PrdGRS ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV61TFPrdOkotex_SelsJson ;
   private String AV65TFPrdZDHC_SelsJson ;
   private String AV67TFPrdList_SelsJson ;
   private String AV71TFPrdGRS_SelsJson ;
   private String AV11Filename ;
   private String AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private byte[] P09DV2_A856ValCod ;
   private short[] P09DV2_A6301TipPrdCod ;
   private boolean[] P09DV2_n6301TipPrdCod ;
   private String[] P09DV2_A396EmprCod ;
   private String[] P09DV2_A794PrvNom ;
   private boolean[] P09DV2_n794PrvNom ;
   private int[] P09DV2_A795PrvNum ;
   private String[] P09DV2_A9734PrdNCAS ;
   private String[] P09DV2_A11614PrdEINECS ;
   private String[] P09DV2_A11615PrdFuncion ;
   private String[] P09DV2_A728PrdRefPrv ;
   private String[] P09DV2_A4692PrdNom2 ;
   private String[] P09DV2_A4693PrdNum2 ;
   private java.util.Date[] P09DV2_A9742PrdFHS ;
   private String[] P09DV2_A9741PrdHS ;
   private String[] P09DV2_A13302PrdTHELIST ;
   private boolean[] P09DV2_n13302PrdTHELIST ;
   private String[] P09DV2_A11364PrdHm ;
   private String[] P09DV2_A5887PrdReach ;
   private String[] P09DV2_A11363PrdGots ;
   private java.math.BigDecimal[] P09DV2_A9733PrdAox ;
   private String[] P09DV2_A727PrdRec ;
   private String[] P09DV2_A857ValDsc ;
   private boolean[] P09DV2_n857ValDsc ;
   private String[] P09DV2_A6302TipPrdDsc ;
   private boolean[] P09DV2_n6302TipPrdDsc ;
   private java.math.BigDecimal[] P09DV2_A724PrdPreAct ;
   private java.math.BigDecimal[] P09DV2_A684PrdCanPen ;
   private java.math.BigDecimal[] P09DV2_A13831PrdDisponi ;
   private String[] P09DV2_A718PrdNom ;
   private String[] P09DV2_A719PrdNum ;
   private String[] P09DV2_A13974PrdGRS ;
   private boolean[] P09DV2_n13974PrdGRS ;
   private String[] P09DV2_A11687PrdList ;
   private String[] P09DV2_A13301PrdZDHC ;
   private String[] P09DV2_A5888PrdOkotex ;
   private java.math.BigDecimal[] P09DV2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09DV2_A685PrdCanRes ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV125Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ;
   private GXSimpleCollection<String> AV62TFPrdOkotex_Sels ;
   private GXSimpleCollection<String> AV128Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ;
   private GXSimpleCollection<String> AV66TFPrdZDHC_Sels ;
   private GXSimpleCollection<String> AV129Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ;
   private GXSimpleCollection<String> AV68TFPrdList_Sels ;
   private GXSimpleCollection<String> AV132Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ;
   private GXSimpleCollection<String> AV72TFPrdGRS_Sels ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class listadodeproductos_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09DV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A5888PrdOkotex ,
                                          GXSimpleCollection<String> AV125Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels ,
                                          String A13301PrdZDHC ,
                                          GXSimpleCollection<String> AV128Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels ,
                                          String A11687PrdList ,
                                          GXSimpleCollection<String> AV129Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels ,
                                          String A13974PrdGRS ,
                                          GXSimpleCollection<String> AV132Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels ,
                                          String AV100Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel ,
                                          String AV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum ,
                                          String AV102Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel ,
                                          String AV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV103Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm ,
                                          java.math.BigDecimal AV104Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to ,
                                          java.math.BigDecimal AV105Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres ,
                                          java.math.BigDecimal AV106Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to ,
                                          java.math.BigDecimal AV107Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible ,
                                          java.math.BigDecimal AV108Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to ,
                                          java.math.BigDecimal AV109Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen ,
                                          java.math.BigDecimal AV110Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to ,
                                          java.math.BigDecimal AV111Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact ,
                                          java.math.BigDecimal AV112Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to ,
                                          String AV114Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel ,
                                          String AV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc ,
                                          String AV116Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel ,
                                          String AV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc ,
                                          String AV118Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel ,
                                          String AV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec ,
                                          java.math.BigDecimal AV119Stocksquimicos_listadodeproductos_wcds_22_tfprdaox ,
                                          java.math.BigDecimal AV120Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to ,
                                          String AV122Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel ,
                                          String AV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots ,
                                          String AV124Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel ,
                                          String AV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach ,
                                          int AV125Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size ,
                                          String AV127Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel ,
                                          String AV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm ,
                                          int AV128Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size ,
                                          int AV129Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size ,
                                          String AV131Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel ,
                                          String AV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist ,
                                          int AV132Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size ,
                                          String AV134Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel ,
                                          String AV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs ,
                                          java.util.Date AV135Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs ,
                                          String AV137Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel ,
                                          String AV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2 ,
                                          String AV139Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel ,
                                          String AV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2 ,
                                          String AV141Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel ,
                                          String AV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv ,
                                          String AV143Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel ,
                                          String AV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion ,
                                          String AV145Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel ,
                                          String AV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs ,
                                          String AV147Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel ,
                                          String AV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas ,
                                          int AV148Stocksquimicos_listadodeproductos_wcds_51_tfprvnum ,
                                          int AV149Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to ,
                                          String AV151Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel ,
                                          String AV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom ,
                                          String AV39PrdNumfrom ,
                                          String AV40PrdnumTo ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          String A6302TipPrdDsc ,
                                          String A857ValDsc ,
                                          String A727PrdRec ,
                                          java.math.BigDecimal A9733PrdAox ,
                                          String A11363PrdGots ,
                                          String A5887PrdReach ,
                                          String A11364PrdHm ,
                                          String A13302PrdTHELIST ,
                                          String A9741PrdHS ,
                                          java.util.Date A9742PrdFHS ,
                                          String A4693PrdNum2 ,
                                          String A4692PrdNom2 ,
                                          String A728PrdRefPrv ,
                                          String A11615PrdFuncion ,
                                          String A11614PrdEINECS ,
                                          String A9734PrdNCAS ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV98Stocksquimicos_listadodeproductos_wcds_1_filterfulltext ,
                                          java.math.BigDecimal A13831PrdDisponi ,
                                          String AV38emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[52];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ValCod, T1.TipPrdCod, T1.EmprCod, T4.PrvNom, T1.PrvNum, T1.PrdNCAS, T1.PrdEINECS, T1.PrdFuncion, T1.PrdRefPrv, T1.PrdNom2, T1.PrdNum2, T1.PrdFHS, T1.PrdHS," ;
      scmdbuf += " T1.PrdTHELIST, T1.PrdHm, T1.PrdReach, T1.PrdGots, T1.PrdAox, T1.PrdRec, T2.ValDsc, T3.TipPrdDsc, T1.PrdPreAct, T1.PrdCanPen, T1.PrdExiAlm - T1.PrdCanRes AS PrdDisponi," ;
      scmdbuf += " T1.PrdNom, T1.PrdNum, T1.PrdGRS, T1.PrdList, T1.PrdZDHC, T1.PrdOkotex, T1.PrdExiAlm, T1.PrdCanRes FROM (((TXPPRODUC T1 INNER JOIN TXPTIPVAL T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ValCod = T1.ValCod) LEFT JOIN TXPTIPPRD T3 ON T3.EmprCod = T1.EmprCod AND T3.TipPrdCod = T1.TipPrdCod) INNER JOIN TXPPRVGEN T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.PrvNum = T1.PrvNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproductos_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproductos_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproductos_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproductos_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV103Stocksquimicos_listadodeproductos_wcds_6_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Stocksquimicos_listadodeproductos_wcds_7_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Stocksquimicos_listadodeproductos_wcds_8_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Stocksquimicos_listadodeproductos_wcds_9_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Stocksquimicos_listadodeproductos_wcds_10_tfprddisponible)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Stocksquimicos_listadodeproductos_wcds_11_tfprddisponible_to)==0) )
      {
         addWhere(sWhereString, "(( T1.PrdExiAlm - T1.PrdCanRes) <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Stocksquimicos_listadodeproductos_wcds_12_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Stocksquimicos_listadodeproductos_wcds_13_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Stocksquimicos_listadodeproductos_wcds_14_tfprdpreact)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Stocksquimicos_listadodeproductos_wcds_15_tfprdpreact_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Stocksquimicos_listadodeproductos_wcds_16_tftipprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TipPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproductos_wcds_17_tftipprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TipPrdDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV115Stocksquimicos_listadodeproductos_wcds_18_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Stocksquimicos_listadodeproductos_wcds_19_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ValDsc = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV118Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV117Stocksquimicos_listadodeproductos_wcds_20_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV118Stocksquimicos_listadodeproductos_wcds_21_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRec = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Stocksquimicos_listadodeproductos_wcds_22_tfprdaox)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Stocksquimicos_listadodeproductos_wcds_23_tfprdaox_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdAox <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV122Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel)==0) && ( ! (GXutil.strcmp("", AV121Stocksquimicos_listadodeproductos_wcds_24_tfprdgots)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdGots) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Stocksquimicos_listadodeproductos_wcds_25_tfprdgots_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdGots = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel)==0) && ( ! (GXutil.strcmp("", AV123Stocksquimicos_listadodeproductos_wcds_26_tfprdreach)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdReach) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Stocksquimicos_listadodeproductos_wcds_27_tfprdreach_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdReach = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( AV125Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV125Stocksquimicos_listadodeproductos_wcds_28_tfprdokotex_sels, "T1.PrdOkotex IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV127Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel)==0) && ( ! (GXutil.strcmp("", AV126Stocksquimicos_listadodeproductos_wcds_29_tfprdhm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Stocksquimicos_listadodeproductos_wcds_30_tfprdhm_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHm = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( AV128Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Stocksquimicos_listadodeproductos_wcds_31_tfprdzdhc_sels, "T1.PrdZDHC IN (", ")")+")");
      }
      if ( AV129Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV129Stocksquimicos_listadodeproductos_wcds_32_tfprdlist_sels, "T1.PrdList IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV131Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel)==0) && ( ! (GXutil.strcmp("", AV130Stocksquimicos_listadodeproductos_wcds_33_tfprdthelist)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdTHELIST) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Stocksquimicos_listadodeproductos_wcds_34_tfprdthelist_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdTHELIST = ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( AV132Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV132Stocksquimicos_listadodeproductos_wcds_35_tfprdgrs_sels, "T1.PrdGRS IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV134Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel)==0) && ( ! (GXutil.strcmp("", AV133Stocksquimicos_listadodeproductos_wcds_36_tfprdhs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdHS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Stocksquimicos_listadodeproductos_wcds_37_tfprdhs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdHS = ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Stocksquimicos_listadodeproductos_wcds_38_tfprdfhs)) )
      {
         addWhere(sWhereString, "(T1.PrdFHS >= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV137Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel)==0) && ( ! (GXutil.strcmp("", AV136Stocksquimicos_listadodeproductos_wcds_39_tfprdnum2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV137Stocksquimicos_listadodeproductos_wcds_40_tfprdnum2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum2 = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel)==0) && ( ! (GXutil.strcmp("", AV138Stocksquimicos_listadodeproductos_wcds_41_tfprdnom2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Stocksquimicos_listadodeproductos_wcds_42_tfprdnom2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom2 = ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel)==0) && ( ! (GXutil.strcmp("", AV140Stocksquimicos_listadodeproductos_wcds_43_tfprdrefprv)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdRefPrv) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Stocksquimicos_listadodeproductos_wcds_44_tfprdrefprv_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdRefPrv = ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel)==0) && ( ! (GXutil.strcmp("", AV142Stocksquimicos_listadodeproductos_wcds_45_tfprdfuncion)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdFuncion) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Stocksquimicos_listadodeproductos_wcds_46_tfprdfuncion_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdFuncion = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV145Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel)==0) && ( ! (GXutil.strcmp("", AV144Stocksquimicos_listadodeproductos_wcds_47_tfprdeinecs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdEINECS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV145Stocksquimicos_listadodeproductos_wcds_48_tfprdeinecs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdEINECS = ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV147Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel)==0) && ( ! (GXutil.strcmp("", AV146Stocksquimicos_listadodeproductos_wcds_49_tfprdncas)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNCAS) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV147Stocksquimicos_listadodeproductos_wcds_50_tfprdncas_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNCAS = ?)");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (0==AV148Stocksquimicos_listadodeproductos_wcds_51_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( ! (0==AV149Stocksquimicos_listadodeproductos_wcds_52_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV151Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV150Stocksquimicos_listadodeproductos_wcds_53_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV151Stocksquimicos_listadodeproductos_wcds_54_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.PrvNom = ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39PrdNumfrom)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum >= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV40PrdnumTo)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum <= ?)");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanRes DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdCanPen DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TipPrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TipPrdDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ValDsc" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ValDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRec" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRec DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGots" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGots DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdGRS" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdGRS DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum2" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom2" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdRefPrv DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdFuncion DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdEINECS DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNCAS DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.PrvNom" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.PrvNom DESC" ;
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
                  return conditional_P09DV2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , (String)dynConstraints[56] , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , (String)dynConstraints[60] , (String)dynConstraints[61] , (String)dynConstraints[62] , (String)dynConstraints[63] , (String)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (java.math.BigDecimal)dynConstraints[68] , (String)dynConstraints[69] , (String)dynConstraints[70] , (String)dynConstraints[71] , (java.math.BigDecimal)dynConstraints[72] , (String)dynConstraints[73] , (String)dynConstraints[74] , (String)dynConstraints[75] , (String)dynConstraints[76] , (String)dynConstraints[77] , (java.util.Date)dynConstraints[78] , (String)dynConstraints[79] , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , (String)dynConstraints[83] , (String)dynConstraints[84] , ((Number) dynConstraints[85]).intValue() , (String)dynConstraints[86] , ((Number) dynConstraints[87]).shortValue() , ((Boolean) dynConstraints[88]).booleanValue() , (String)dynConstraints[89] , (java.math.BigDecimal)dynConstraints[90] , (String)dynConstraints[91] , (String)dynConstraints[92] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09DV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((String[]) buf[8])[0] = rslt.getString(7, 40);
               ((String[]) buf[9])[0] = rslt.getString(8, 50);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 40);
               ((String[]) buf[12])[0] = rslt.getString(11, 16);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(12);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((String[]) buf[15])[0] = rslt.getString(14, 4);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 1);
               ((String[]) buf[18])[0] = rslt.getString(16, 1);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,2);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((String[]) buf[22])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(21, 40);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,5);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(23,4);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(24,4);
               ((String[]) buf[29])[0] = rslt.getString(25, 26);
               ((String[]) buf[30])[0] = rslt.getString(26, 6);
               ((String[]) buf[31])[0] = rslt.getString(27, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(28, 1);
               ((String[]) buf[34])[0] = rslt.getString(29, 1);
               ((String[]) buf[35])[0] = rslt.getString(30, 1);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(31,4);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(32,4);
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
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 4);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 40);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 40);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 16);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[85]);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 16);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 16);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 40);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 40);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 50);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 50);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 40);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 40);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 30);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 30);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 30);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 30);
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 6);
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 6);
               }
               return;
      }
   }

}

