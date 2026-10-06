package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class listadodeproveedores_wcexportcsv_impl extends GXWebProcedure
{
   public listadodeproveedores_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ListadodeProveedores_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.ListadodeProveedores_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("StocksQuimicos.ListadodeProveedores_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Direccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Poblacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Postal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "C. Postal 2", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N.I.F.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Telefonos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Telex", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fax", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mail", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Forma Pago", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Vtos.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dias Pago", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Periodicidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Representante", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dias Plazo Entrega", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metodo Transporte", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cuenta Contable", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = AV30FilterFullText ;
      AV81Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum = AV34TFPrvNum ;
      AV82Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to = AV35TFPrvNum_To ;
      AV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = AV36TFPrvNom ;
      AV84Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = AV37TFPrvNom_Sel ;
      AV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = AV38TFPrvDir ;
      AV86Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = AV39TFPrvDir_Sel ;
      AV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = AV40TFPrvPob ;
      AV88Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = AV41TFPrvPob_Sel ;
      AV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = AV42TFPrvCpo ;
      AV90Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = AV43TFPrvCpo_Sel ;
      AV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = AV44TFPrvCp2 ;
      AV92Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = AV45TFPrvCp2_Sel ;
      AV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = AV46TFPrvNif ;
      AV94Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = AV47TFPrvNif_Sel ;
      AV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = AV48TFPrvTlf ;
      AV96Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = AV49TFPrvTlf_Sel ;
      AV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = AV50TFPrvTlx ;
      AV98Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = AV51TFPrvTlx_Sel ;
      AV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = AV52TFPrvFax ;
      AV100Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = AV53TFPrvFax_Sel ;
      AV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = AV54TFPrvMail ;
      AV102Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = AV55TFPrvMail_Sel ;
      AV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = AV56TFFpgCod ;
      AV104Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = AV57TFFpgCod_Sel ;
      AV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = AV58TFFpgDsc ;
      AV106Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = AV59TFFpgDsc_Sel ;
      AV107Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto = AV60TFPrvVto ;
      AV108Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to = AV61TFPrvVto_To ;
      AV109Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag = AV62TFPrvDiaPag ;
      AV110Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to = AV63TFPrvDiaPag_To ;
      AV111Stocksquimicos_listadodeproveedores_wcds_32_tfprvper = AV64TFPrvPer ;
      AV112Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to = AV65TFPrvPer_To ;
      AV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = AV66TFPrvRep ;
      AV114Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = AV67TFPrvRep_Sel ;
      AV115Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent = AV68TFPrvPlaEnt ;
      AV116Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to = AV69TFPrvPlaEnt_To ;
      AV117Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = AV71TFPrvMetTra_Sels ;
      AV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = AV72TFPrvCta ;
      AV119Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = AV73TFPrvCta_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A792PrvMetTra ,
                                           AV117Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                           Integer.valueOf(AV81Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) ,
                                           Integer.valueOf(AV82Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) ,
                                           AV84Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                           AV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                           AV86Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                           AV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                           AV88Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                           AV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                           AV90Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                           AV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                           AV92Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                           AV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                           AV94Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                           AV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                           AV96Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                           AV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                           AV98Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                           AV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                           AV100Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                           AV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                           AV102Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                           AV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                           AV104Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                           AV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                           AV106Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                           AV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                           Byte.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) ,
                                           Byte.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) ,
                                           Integer.valueOf(AV109Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) ,
                                           Integer.valueOf(AV110Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) ,
                                           Integer.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) ,
                                           Integer.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) ,
                                           AV114Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                           AV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                           Short.valueOf(AV115Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) ,
                                           Short.valueOf(AV116Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) ,
                                           Integer.valueOf(AV117Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels.size()) ,
                                           AV119Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                           AV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                           Short.valueOf(AV75PrvNumFrom) ,
                                           Short.valueOf(AV76PrvNumTo) ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A799PrvPob ,
                                           A782PrvCpo ,
                                           A6075PrvCp2 ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           A804PrvTlx ,
                                           A6076PrvFax ,
                                           A6077PrvMail ,
                                           A497FpgCod ,
                                           A498FpgDsc ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                           AV74Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom), 30, "%") ;
      lV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir), 30, "%") ;
      lV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = GXutil.padr( GXutil.rtrim( AV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob), 30, "%") ;
      lV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = GXutil.padr( GXutil.rtrim( AV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo), 6, "%") ;
      lV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = GXutil.padr( GXutil.rtrim( AV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2), 6, "%") ;
      lV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = GXutil.padr( GXutil.rtrim( AV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif), 20, "%") ;
      lV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = GXutil.padr( GXutil.rtrim( AV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf), 18, "%") ;
      lV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = GXutil.padr( GXutil.rtrim( AV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx), 14, "%") ;
      lV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = GXutil.padr( GXutil.rtrim( AV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax), 15, "%") ;
      lV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = GXutil.padr( GXutil.rtrim( AV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail), 40, "%") ;
      lV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = GXutil.padr( GXutil.rtrim( AV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod), 2, "%") ;
      lV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = GXutil.padr( GXutil.rtrim( AV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc), 30, "%") ;
      lV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = GXutil.padr( GXutil.rtrim( AV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep), 20, "%") ;
      lV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = GXutil.padr( GXutil.rtrim( AV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta), 12, "%") ;
      /* Using cursor P09L92 */
      pr_default.execute(0, new Object[] {AV74Emprcod, Integer.valueOf(AV81Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum), Integer.valueOf(AV82Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to), lV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom, AV84Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel, lV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir, AV86Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel, lV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob, AV88Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel, lV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo, AV90Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel, lV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2, AV92Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel, lV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif, AV94Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel, lV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf, AV96Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel, lV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx, AV98Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel, lV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax, AV100Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel, lV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail, AV102Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel, lV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod, AV104Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel, lV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc, AV106Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel, Byte.valueOf(AV107Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto), Byte.valueOf(AV108Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to), Integer.valueOf(AV109Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag), Integer.valueOf(AV110Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to), Integer.valueOf(AV111Stocksquimicos_listadodeproveedores_wcds_32_tfprvper), Integer.valueOf(AV112Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to), lV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep, AV114Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel, Short.valueOf(AV115Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent), Short.valueOf(AV116Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to), lV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta, AV119Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel, Short.valueOf(AV75PrvNumFrom), Short.valueOf(AV76PrvNumTo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09L92_A396EmprCod[0] ;
         A783PrvCta = P09L92_A783PrvCta[0] ;
         n783PrvCta = P09L92_n783PrvCta[0] ;
         A798PrvPlaEnt = P09L92_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P09L92_n798PrvPlaEnt[0] ;
         A801PrvRep = P09L92_A801PrvRep[0] ;
         n801PrvRep = P09L92_n801PrvRep[0] ;
         A797PrvPer = P09L92_A797PrvPer[0] ;
         n797PrvPer = P09L92_n797PrvPer[0] ;
         A785PrvDiaPag = P09L92_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P09L92_n785PrvDiaPag[0] ;
         A805PrvVto = P09L92_A805PrvVto[0] ;
         n805PrvVto = P09L92_n805PrvVto[0] ;
         A498FpgDsc = P09L92_A498FpgDsc[0] ;
         n498FpgDsc = P09L92_n498FpgDsc[0] ;
         A497FpgCod = P09L92_A497FpgCod[0] ;
         n497FpgCod = P09L92_n497FpgCod[0] ;
         A6077PrvMail = P09L92_A6077PrvMail[0] ;
         n6077PrvMail = P09L92_n6077PrvMail[0] ;
         A6076PrvFax = P09L92_A6076PrvFax[0] ;
         n6076PrvFax = P09L92_n6076PrvFax[0] ;
         A804PrvTlx = P09L92_A804PrvTlx[0] ;
         n804PrvTlx = P09L92_n804PrvTlx[0] ;
         A803PrvTlf = P09L92_A803PrvTlf[0] ;
         n803PrvTlf = P09L92_n803PrvTlf[0] ;
         A793PrvNif = P09L92_A793PrvNif[0] ;
         n793PrvNif = P09L92_n793PrvNif[0] ;
         A6075PrvCp2 = P09L92_A6075PrvCp2[0] ;
         n6075PrvCp2 = P09L92_n6075PrvCp2[0] ;
         A782PrvCpo = P09L92_A782PrvCpo[0] ;
         n782PrvCpo = P09L92_n782PrvCpo[0] ;
         A799PrvPob = P09L92_A799PrvPob[0] ;
         n799PrvPob = P09L92_n799PrvPob[0] ;
         A786PrvDir = P09L92_A786PrvDir[0] ;
         n786PrvDir = P09L92_n786PrvDir[0] ;
         A794PrvNom = P09L92_A794PrvNom[0] ;
         n794PrvNom = P09L92_n794PrvNom[0] ;
         A795PrvNum = P09L92_A795PrvNum[0] ;
         A792PrvMetTra = P09L92_A792PrvMetTra[0] ;
         n792PrvMetTra = P09L92_n792PrvMetTra[0] ;
         A498FpgDsc = P09L92_A498FpgDsc[0] ;
         n498FpgDsc = P09L92_n498FpgDsc[0] ;
         if ( (GXutil.strcmp("", AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6075PrvCp2) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6076PrvFax) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A6077PrvMail) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A498FpgDsc) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
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
               AV14TextFileLine += GXutil.str( A795PrvNum, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A794PrvNom, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A786PrvDir, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A799PrvPob, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A782PrvCpo, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6075PrvCp2, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A793PrvNif, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A803PrvTlf, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A804PrvTlx, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6076PrvFax, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A6077PrvMail, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A497FpgCod, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A498FpgDsc, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A805PrvVto, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A785PrvDiaPag, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A797PrvPer, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A801PrvRep, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A798PrvPlaEnt, 3, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), "S") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Su Transporte", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), "N") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Nuestro", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A792PrvMetTra), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "Agencia", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A783PrvCta, ";", ","), GXv_char3) ;
               listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ListadodeProveedores_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNum", "", "Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvDir", "", "Direccion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvPob", "", "Poblacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvCpo", "", "Codigo Postal", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvCp2", "", "C. Postal 2", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNif", "", "N.I.F.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvTlf", "", "Telefonos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvTlx", "", "Telex", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvFax", "", "Fax", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvMail", "", "Mail", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FpgCod", "", "Forma Pago", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FpgDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvVto", "", "Nº Vtos.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvDiaPag", "", "Dias Pago", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvPer", "", "Periodicidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvRep", "", "Representante", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvPlaEnt", "", "Dias Plazo Entrega", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvMetTra", "", "Metodo Transporte", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvCta", "", "Cuenta Contable", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "StocksQuimicos.ListadodeProveedores_WCColumnsSelector", GXv_char3) ;
      listadodeproveedores_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("StocksQuimicos.ListadodeProveedores_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "StocksQuimicos.ListadodeProveedores_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("StocksQuimicos.ListadodeProveedores_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV120GXV1 = 1 ;
      while ( AV120GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV120GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV34TFPrvNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFPrvNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV36TFPrvNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV37TFPrvNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR") == 0 )
         {
            AV38TFPrvDir = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR_SEL") == 0 )
         {
            AV39TFPrvDir_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB") == 0 )
         {
            AV40TFPrvPob = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB_SEL") == 0 )
         {
            AV41TFPrvPob_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO") == 0 )
         {
            AV42TFPrvCpo = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO_SEL") == 0 )
         {
            AV43TFPrvCpo_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCP2") == 0 )
         {
            AV44TFPrvCp2 = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCP2_SEL") == 0 )
         {
            AV45TFPrvCp2_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV46TFPrvNif = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV47TFPrvNif_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF") == 0 )
         {
            AV48TFPrvTlf = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF_SEL") == 0 )
         {
            AV49TFPrvTlf_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX") == 0 )
         {
            AV50TFPrvTlx = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX_SEL") == 0 )
         {
            AV51TFPrvTlx_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVFAX") == 0 )
         {
            AV52TFPrvFax = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVFAX_SEL") == 0 )
         {
            AV53TFPrvFax_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMAIL") == 0 )
         {
            AV54TFPrvMail = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMAIL_SEL") == 0 )
         {
            AV55TFPrvMail_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV56TFFpgCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV57TFFpgCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC") == 0 )
         {
            AV58TFFpgDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGDSC_SEL") == 0 )
         {
            AV59TFFpgDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVVTO") == 0 )
         {
            AV60TFPrvVto = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV61TFPrvVto_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIAPAG") == 0 )
         {
            AV62TFPrvDiaPag = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFPrvDiaPag_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPER") == 0 )
         {
            AV64TFPrvPer = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFPrvPer_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP") == 0 )
         {
            AV66TFPrvRep = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP_SEL") == 0 )
         {
            AV67TFPrvRep_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPLAENT") == 0 )
         {
            AV68TFPrvPlaEnt = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFPrvPlaEnt_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMETTRA_SEL") == 0 )
         {
            AV70TFPrvMetTra_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV71TFPrvMetTra_Sels.fromJSonString(AV70TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA") == 0 )
         {
            AV72TFPrvCta = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA_SEL") == 0 )
         {
            AV73TFPrvCta_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV74Emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUMFROM") == 0 )
         {
            AV75PrvNumFrom = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PRVNUMTO") == 0 )
         {
            AV76PrvNumTo = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV120GXV1 = (int)(AV120GXV1+1) ;
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
      A794PrvNom = "" ;
      A786PrvDir = "" ;
      A799PrvPob = "" ;
      A782PrvCpo = "" ;
      A6075PrvCp2 = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A6076PrvFax = "" ;
      A6077PrvMail = "" ;
      A497FpgCod = "" ;
      A498FpgDsc = "" ;
      A801PrvRep = "" ;
      A792PrvMetTra = "" ;
      A783PrvCta = "" ;
      AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = "" ;
      AV36TFPrvNom = "" ;
      AV84Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel = "" ;
      AV37TFPrvNom_Sel = "" ;
      AV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = "" ;
      AV38TFPrvDir = "" ;
      AV86Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel = "" ;
      AV39TFPrvDir_Sel = "" ;
      AV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = "" ;
      AV40TFPrvPob = "" ;
      AV88Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel = "" ;
      AV41TFPrvPob_Sel = "" ;
      AV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = "" ;
      AV42TFPrvCpo = "" ;
      AV90Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel = "" ;
      AV43TFPrvCpo_Sel = "" ;
      AV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = "" ;
      AV44TFPrvCp2 = "" ;
      AV92Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel = "" ;
      AV45TFPrvCp2_Sel = "" ;
      AV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = "" ;
      AV46TFPrvNif = "" ;
      AV94Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel = "" ;
      AV47TFPrvNif_Sel = "" ;
      AV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = "" ;
      AV48TFPrvTlf = "" ;
      AV96Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel = "" ;
      AV49TFPrvTlf_Sel = "" ;
      AV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = "" ;
      AV50TFPrvTlx = "" ;
      AV98Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel = "" ;
      AV51TFPrvTlx_Sel = "" ;
      AV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = "" ;
      AV52TFPrvFax = "" ;
      AV100Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel = "" ;
      AV53TFPrvFax_Sel = "" ;
      AV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = "" ;
      AV54TFPrvMail = "" ;
      AV102Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel = "" ;
      AV55TFPrvMail_Sel = "" ;
      AV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = "" ;
      AV56TFFpgCod = "" ;
      AV104Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel = "" ;
      AV57TFFpgCod_Sel = "" ;
      AV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = "" ;
      AV58TFFpgDsc = "" ;
      AV106Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel = "" ;
      AV59TFFpgDsc_Sel = "" ;
      AV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = "" ;
      AV66TFPrvRep = "" ;
      AV114Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel = "" ;
      AV67TFPrvRep_Sel = "" ;
      AV117Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV71TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = "" ;
      AV72TFPrvCta = "" ;
      AV119Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel = "" ;
      AV73TFPrvCta_Sel = "" ;
      lV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom = "" ;
      lV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir = "" ;
      lV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob = "" ;
      lV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo = "" ;
      lV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 = "" ;
      lV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif = "" ;
      lV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf = "" ;
      lV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx = "" ;
      lV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax = "" ;
      lV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail = "" ;
      lV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod = "" ;
      lV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc = "" ;
      lV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep = "" ;
      lV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta = "" ;
      AV74Emprcod = "" ;
      A396EmprCod = "" ;
      P09L92_A396EmprCod = new String[] {""} ;
      P09L92_A783PrvCta = new String[] {""} ;
      P09L92_n783PrvCta = new boolean[] {false} ;
      P09L92_A798PrvPlaEnt = new short[1] ;
      P09L92_n798PrvPlaEnt = new boolean[] {false} ;
      P09L92_A801PrvRep = new String[] {""} ;
      P09L92_n801PrvRep = new boolean[] {false} ;
      P09L92_A797PrvPer = new int[1] ;
      P09L92_n797PrvPer = new boolean[] {false} ;
      P09L92_A785PrvDiaPag = new int[1] ;
      P09L92_n785PrvDiaPag = new boolean[] {false} ;
      P09L92_A805PrvVto = new byte[1] ;
      P09L92_n805PrvVto = new boolean[] {false} ;
      P09L92_A498FpgDsc = new String[] {""} ;
      P09L92_n498FpgDsc = new boolean[] {false} ;
      P09L92_A497FpgCod = new String[] {""} ;
      P09L92_n497FpgCod = new boolean[] {false} ;
      P09L92_A6077PrvMail = new String[] {""} ;
      P09L92_n6077PrvMail = new boolean[] {false} ;
      P09L92_A6076PrvFax = new String[] {""} ;
      P09L92_n6076PrvFax = new boolean[] {false} ;
      P09L92_A804PrvTlx = new String[] {""} ;
      P09L92_n804PrvTlx = new boolean[] {false} ;
      P09L92_A803PrvTlf = new String[] {""} ;
      P09L92_n803PrvTlf = new boolean[] {false} ;
      P09L92_A793PrvNif = new String[] {""} ;
      P09L92_n793PrvNif = new boolean[] {false} ;
      P09L92_A6075PrvCp2 = new String[] {""} ;
      P09L92_n6075PrvCp2 = new boolean[] {false} ;
      P09L92_A782PrvCpo = new String[] {""} ;
      P09L92_n782PrvCpo = new boolean[] {false} ;
      P09L92_A799PrvPob = new String[] {""} ;
      P09L92_n799PrvPob = new boolean[] {false} ;
      P09L92_A786PrvDir = new String[] {""} ;
      P09L92_n786PrvDir = new boolean[] {false} ;
      P09L92_A794PrvNom = new String[] {""} ;
      P09L92_n794PrvNom = new boolean[] {false} ;
      P09L92_A795PrvNum = new int[1] ;
      P09L92_A792PrvMetTra = new String[] {""} ;
      P09L92_n792PrvMetTra = new boolean[] {false} ;
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
      AV70TFPrvMetTra_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.listadodeproveedores_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09L92_A396EmprCod, P09L92_A783PrvCta, P09L92_n783PrvCta, P09L92_A798PrvPlaEnt, P09L92_n798PrvPlaEnt, P09L92_A801PrvRep, P09L92_n801PrvRep, P09L92_A797PrvPer, P09L92_n797PrvPer, P09L92_A785PrvDiaPag,
            P09L92_n785PrvDiaPag, P09L92_A805PrvVto, P09L92_n805PrvVto, P09L92_A498FpgDsc, P09L92_n498FpgDsc, P09L92_A497FpgCod, P09L92_n497FpgCod, P09L92_A6077PrvMail, P09L92_n6077PrvMail, P09L92_A6076PrvFax,
            P09L92_n6076PrvFax, P09L92_A804PrvTlx, P09L92_n804PrvTlx, P09L92_A803PrvTlf, P09L92_n803PrvTlf, P09L92_A793PrvNif, P09L92_n793PrvNif, P09L92_A6075PrvCp2, P09L92_n6075PrvCp2, P09L92_A782PrvCpo,
            P09L92_n782PrvCpo, P09L92_A799PrvPob, P09L92_n799PrvPob, P09L92_A786PrvDir, P09L92_n786PrvDir, P09L92_A794PrvNom, P09L92_n794PrvNom, P09L92_A795PrvNum, P09L92_A792PrvMetTra, P09L92_n792PrvMetTra
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A805PrvVto ;
   private byte AV107Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ;
   private byte AV60TFPrvVto ;
   private byte AV108Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ;
   private byte AV61TFPrvVto_To ;
   private short gxcookieaux ;
   private short A798PrvPlaEnt ;
   private short AV115Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ;
   private short AV68TFPrvPlaEnt ;
   private short AV116Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ;
   private short AV69TFPrvPlaEnt_To ;
   private short AV75PrvNumFrom ;
   private short AV76PrvNumTo ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A795PrvNum ;
   private int A785PrvDiaPag ;
   private int A797PrvPer ;
   private int AV81Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ;
   private int AV34TFPrvNum ;
   private int AV82Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ;
   private int AV35TFPrvNum_To ;
   private int AV109Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ;
   private int AV62TFPrvDiaPag ;
   private int AV110Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ;
   private int AV63TFPrvDiaPag_To ;
   private int AV111Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ;
   private int AV64TFPrvPer ;
   private int AV112Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ;
   private int AV65TFPrvPer_To ;
   private int AV117Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ;
   private int AV120GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A799PrvPob ;
   private String A782PrvCpo ;
   private String A6075PrvCp2 ;
   private String A793PrvNif ;
   private String A803PrvTlf ;
   private String A804PrvTlx ;
   private String A6076PrvFax ;
   private String A6077PrvMail ;
   private String A497FpgCod ;
   private String A498FpgDsc ;
   private String A801PrvRep ;
   private String A792PrvMetTra ;
   private String A783PrvCta ;
   private String AV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ;
   private String AV36TFPrvNom ;
   private String AV84Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ;
   private String AV37TFPrvNom_Sel ;
   private String AV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ;
   private String AV38TFPrvDir ;
   private String AV86Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ;
   private String AV39TFPrvDir_Sel ;
   private String AV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ;
   private String AV40TFPrvPob ;
   private String AV88Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ;
   private String AV41TFPrvPob_Sel ;
   private String AV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ;
   private String AV42TFPrvCpo ;
   private String AV90Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ;
   private String AV43TFPrvCpo_Sel ;
   private String AV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ;
   private String AV44TFPrvCp2 ;
   private String AV92Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ;
   private String AV45TFPrvCp2_Sel ;
   private String AV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ;
   private String AV46TFPrvNif ;
   private String AV94Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ;
   private String AV47TFPrvNif_Sel ;
   private String AV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ;
   private String AV48TFPrvTlf ;
   private String AV96Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ;
   private String AV49TFPrvTlf_Sel ;
   private String AV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ;
   private String AV50TFPrvTlx ;
   private String AV98Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ;
   private String AV51TFPrvTlx_Sel ;
   private String AV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ;
   private String AV52TFPrvFax ;
   private String AV100Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ;
   private String AV53TFPrvFax_Sel ;
   private String AV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ;
   private String AV54TFPrvMail ;
   private String AV102Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ;
   private String AV55TFPrvMail_Sel ;
   private String AV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ;
   private String AV56TFFpgCod ;
   private String AV104Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ;
   private String AV57TFFpgCod_Sel ;
   private String AV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ;
   private String AV58TFFpgDsc ;
   private String AV106Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ;
   private String AV59TFFpgDsc_Sel ;
   private String AV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ;
   private String AV66TFPrvRep ;
   private String AV114Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ;
   private String AV67TFPrvRep_Sel ;
   private String AV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ;
   private String AV72TFPrvCta ;
   private String AV119Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ;
   private String AV73TFPrvCta_Sel ;
   private String scmdbuf ;
   private String lV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ;
   private String lV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ;
   private String lV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ;
   private String lV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ;
   private String lV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ;
   private String lV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ;
   private String lV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ;
   private String lV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ;
   private String lV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ;
   private String lV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ;
   private String lV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ;
   private String lV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ;
   private String lV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ;
   private String lV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ;
   private String AV74Emprcod ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n783PrvCta ;
   private boolean n798PrvPlaEnt ;
   private boolean n801PrvRep ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n805PrvVto ;
   private boolean n498FpgDsc ;
   private boolean n497FpgCod ;
   private boolean n6077PrvMail ;
   private boolean n6076PrvFax ;
   private boolean n804PrvTlx ;
   private boolean n803PrvTlf ;
   private boolean n793PrvNif ;
   private boolean n6075PrvCp2 ;
   private boolean n782PrvCpo ;
   private boolean n799PrvPob ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private boolean n792PrvMetTra ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV70TFPrvMetTra_SelsJson ;
   private String AV11Filename ;
   private String AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09L92_A396EmprCod ;
   private String[] P09L92_A783PrvCta ;
   private boolean[] P09L92_n783PrvCta ;
   private short[] P09L92_A798PrvPlaEnt ;
   private boolean[] P09L92_n798PrvPlaEnt ;
   private String[] P09L92_A801PrvRep ;
   private boolean[] P09L92_n801PrvRep ;
   private int[] P09L92_A797PrvPer ;
   private boolean[] P09L92_n797PrvPer ;
   private int[] P09L92_A785PrvDiaPag ;
   private boolean[] P09L92_n785PrvDiaPag ;
   private byte[] P09L92_A805PrvVto ;
   private boolean[] P09L92_n805PrvVto ;
   private String[] P09L92_A498FpgDsc ;
   private boolean[] P09L92_n498FpgDsc ;
   private String[] P09L92_A497FpgCod ;
   private boolean[] P09L92_n497FpgCod ;
   private String[] P09L92_A6077PrvMail ;
   private boolean[] P09L92_n6077PrvMail ;
   private String[] P09L92_A6076PrvFax ;
   private boolean[] P09L92_n6076PrvFax ;
   private String[] P09L92_A804PrvTlx ;
   private boolean[] P09L92_n804PrvTlx ;
   private String[] P09L92_A803PrvTlf ;
   private boolean[] P09L92_n803PrvTlf ;
   private String[] P09L92_A793PrvNif ;
   private boolean[] P09L92_n793PrvNif ;
   private String[] P09L92_A6075PrvCp2 ;
   private boolean[] P09L92_n6075PrvCp2 ;
   private String[] P09L92_A782PrvCpo ;
   private boolean[] P09L92_n782PrvCpo ;
   private String[] P09L92_A799PrvPob ;
   private boolean[] P09L92_n799PrvPob ;
   private String[] P09L92_A786PrvDir ;
   private boolean[] P09L92_n786PrvDir ;
   private String[] P09L92_A794PrvNom ;
   private boolean[] P09L92_n794PrvNom ;
   private int[] P09L92_A795PrvNum ;
   private String[] P09L92_A792PrvMetTra ;
   private boolean[] P09L92_n792PrvMetTra ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV117Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ;
   private GXSimpleCollection<String> AV71TFPrvMetTra_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class listadodeproveedores_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09L92( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV117Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels ,
                                          int AV81Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum ,
                                          int AV82Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to ,
                                          String AV84Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel ,
                                          String AV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom ,
                                          String AV86Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel ,
                                          String AV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir ,
                                          String AV88Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel ,
                                          String AV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob ,
                                          String AV90Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel ,
                                          String AV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo ,
                                          String AV92Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel ,
                                          String AV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2 ,
                                          String AV94Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel ,
                                          String AV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif ,
                                          String AV96Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel ,
                                          String AV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf ,
                                          String AV98Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel ,
                                          String AV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx ,
                                          String AV100Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel ,
                                          String AV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax ,
                                          String AV102Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel ,
                                          String AV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail ,
                                          String AV104Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel ,
                                          String AV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod ,
                                          String AV106Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel ,
                                          String AV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc ,
                                          byte AV107Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto ,
                                          byte AV108Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to ,
                                          int AV109Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag ,
                                          int AV110Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to ,
                                          int AV111Stocksquimicos_listadodeproveedores_wcds_32_tfprvper ,
                                          int AV112Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to ,
                                          String AV114Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel ,
                                          String AV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep ,
                                          short AV115Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent ,
                                          short AV116Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to ,
                                          int AV117Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size ,
                                          String AV119Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel ,
                                          String AV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta ,
                                          short AV75PrvNumFrom ,
                                          short AV76PrvNumTo ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A799PrvPob ,
                                          String A782PrvCpo ,
                                          String A6075PrvCp2 ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          String A804PrvTlx ,
                                          String A6076PrvFax ,
                                          String A6077PrvMail ,
                                          String A497FpgCod ,
                                          String A498FpgDsc ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV80Stocksquimicos_listadodeproveedores_wcds_1_filterfulltext ,
                                          String AV74Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[41];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.PrvCta, T1.PrvPlaEnt, T1.PrvRep, T1.PrvPer, T1.PrvDiaPag, T1.PrvVto, T2.FpgDsc, T1.FpgCod, T1.PrvMail, T1.PrvFax, T1.PrvTlx, T1.PrvTlf, T1.PrvNif," ;
      scmdbuf += " T1.PrvCp2, T1.PrvCpo, T1.PrvPob, T1.PrvDir, T1.PrvNom, T1.PrvNum, T1.PrvMetTra FROM (TXPPRVGEN T1 LEFT JOIN TXPFORPAG T2 ON T2.EmprCod = T1.EmprCod AND T2.FpgCod" ;
      scmdbuf += " = T1.FpgCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV81Stocksquimicos_listadodeproveedores_wcds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( ! (0==AV82Stocksquimicos_listadodeproveedores_wcds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Stocksquimicos_listadodeproveedores_wcds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Stocksquimicos_listadodeproveedores_wcds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNom = ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV85Stocksquimicos_listadodeproveedores_wcds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Stocksquimicos_listadodeproveedores_wcds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvDir = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV87Stocksquimicos_listadodeproveedores_wcds_8_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Stocksquimicos_listadodeproveedores_wcds_9_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvPob = ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV89Stocksquimicos_listadodeproveedores_wcds_10_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Stocksquimicos_listadodeproveedores_wcds_11_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCpo = ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) && ( ! (GXutil.strcmp("", AV91Stocksquimicos_listadodeproveedores_wcds_12_tfprvcp2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCp2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Stocksquimicos_listadodeproveedores_wcds_13_tfprvcp2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCp2 = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV93Stocksquimicos_listadodeproveedores_wcds_14_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Stocksquimicos_listadodeproveedores_wcds_15_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvNif = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV95Stocksquimicos_listadodeproveedores_wcds_16_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Stocksquimicos_listadodeproveedores_wcds_17_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlf = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV97Stocksquimicos_listadodeproveedores_wcds_18_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Stocksquimicos_listadodeproveedores_wcds_19_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvTlx = ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) && ( ! (GXutil.strcmp("", AV99Stocksquimicos_listadodeproveedores_wcds_20_tfprvfax)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvFax) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Stocksquimicos_listadodeproveedores_wcds_21_tfprvfax_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvFax = ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) && ( ! (GXutil.strcmp("", AV101Stocksquimicos_listadodeproveedores_wcds_22_tfprvmail)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvMail) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Stocksquimicos_listadodeproveedores_wcds_23_tfprvmail_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvMail = ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV103Stocksquimicos_listadodeproveedores_wcds_24_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Stocksquimicos_listadodeproveedores_wcds_25_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FpgCod = ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) && ( ! (GXutil.strcmp("", AV105Stocksquimicos_listadodeproveedores_wcds_26_tffpgdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FpgDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Stocksquimicos_listadodeproveedores_wcds_27_tffpgdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FpgDsc = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (0==AV107Stocksquimicos_listadodeproveedores_wcds_28_tfprvvto) )
      {
         addWhere(sWhereString, "(T1.PrvVto >= ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV108Stocksquimicos_listadodeproveedores_wcds_29_tfprvvto_to) )
      {
         addWhere(sWhereString, "(T1.PrvVto <= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV109Stocksquimicos_listadodeproveedores_wcds_30_tfprvdiapag) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV110Stocksquimicos_listadodeproveedores_wcds_31_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(T1.PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (0==AV111Stocksquimicos_listadodeproveedores_wcds_32_tfprvper) )
      {
         addWhere(sWhereString, "(T1.PrvPer >= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV112Stocksquimicos_listadodeproveedores_wcds_33_tfprvper_to) )
      {
         addWhere(sWhereString, "(T1.PrvPer <= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV113Stocksquimicos_listadodeproveedores_wcds_34_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Stocksquimicos_listadodeproveedores_wcds_35_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvRep = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (0==AV115Stocksquimicos_listadodeproveedores_wcds_36_tfprvplaent) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (0==AV116Stocksquimicos_listadodeproveedores_wcds_37_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(T1.PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( AV117Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV117Stocksquimicos_listadodeproveedores_wcds_38_tfprvmettra_sels, "T1.PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV119Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV118Stocksquimicos_listadodeproveedores_wcds_39_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Stocksquimicos_listadodeproveedores_wcds_40_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrvCta = ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV75PrvNumFrom) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV76PrvNumTo) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvDir" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvDir DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPob" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPob DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCpo" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCpo DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCp2" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCp2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNif" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNif DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvTlf" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvTlf DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvTlx" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvTlx DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvFax" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvFax DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvMail" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvMail DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FpgCod" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FpgCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.FpgDsc" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.FpgDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvVto" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvVto DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvDiaPag" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvDiaPag DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPer" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPer DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvRep" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvRep DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvPlaEnt" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvPlaEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvMetTra" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvMetTra DESC" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvCta" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvCta DESC" ;
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
                  return conditional_P09L92(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Number) dynConstraints[42]).shortValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).byteValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).shortValue() , ((Boolean) dynConstraints[63]).booleanValue() , (String)dynConstraints[64] , (String)dynConstraints[65] , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09L92", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((int[]) buf[9])[0] = rslt.getInt(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 40);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 15);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((String[]) buf[38])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[41], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 18);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 18);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 14);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 14);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 15);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 15);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 30);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 20);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[76]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[77]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 12);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 12);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               return;
      }
   }

}

