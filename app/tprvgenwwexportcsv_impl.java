package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprvgenwwexportcsv_impl extends GXWebProcedure
{
   public tprvgenwwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TPRVGENWWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TPRVGENWWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TPRVGENWWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Direccion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Postal", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Poblacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N.I.F.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Telefonos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Prioridad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Telex", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Proveedor o Acreador", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Forma de Pago", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "No.Vencimientos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dias de Pago", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Periodicidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Banco", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Representante", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Dias Plazo Entrega", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metodo Transporte", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cuenta Contable", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Divisa Traspaso Contable", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Divisa", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Activo?", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV95Tprvgenwwds_1_filterfulltext = AV30FilterFullText ;
      AV96Tprvgenwwds_2_tfprvnum = AV36TFPrvNum ;
      AV97Tprvgenwwds_3_tfprvnum_to = AV37TFPrvNum_To ;
      AV98Tprvgenwwds_4_tfprvnom = AV38TFPrvNom ;
      AV99Tprvgenwwds_5_tfprvnom_sel = AV39TFPrvNom_Sel ;
      AV100Tprvgenwwds_6_tfprvdir = AV42TFPrvDir ;
      AV101Tprvgenwwds_7_tfprvdir_sel = AV43TFPrvDir_Sel ;
      AV102Tprvgenwwds_8_tfprvcpo = AV44TFPrvCpo ;
      AV103Tprvgenwwds_9_tfprvcpo_sel = AV45TFPrvCpo_Sel ;
      AV104Tprvgenwwds_10_tfprvpob = AV46TFPrvPob ;
      AV105Tprvgenwwds_11_tfprvpob_sel = AV47TFPrvPob_Sel ;
      AV106Tprvgenwwds_12_tfprvnif = AV48TFPrvNif ;
      AV107Tprvgenwwds_13_tfprvnif_sel = AV49TFPrvNif_Sel ;
      AV108Tprvgenwwds_14_tfprvtlf = AV50TFPrvTlf ;
      AV109Tprvgenwwds_15_tfprvtlf_sel = AV51TFPrvTlf_Sel ;
      AV110Tprvgenwwds_16_tfprvpri_sel = AV84TFPrvPri_Sel ;
      AV111Tprvgenwwds_17_tfprvtlx = AV54TFPrvTlx ;
      AV112Tprvgenwwds_18_tfprvtlx_sel = AV55TFPrvTlx_Sel ;
      AV113Tprvgenwwds_19_tfprvtip_sels = AV86TFPrvTip_Sels ;
      AV114Tprvgenwwds_20_tffpgcod = AV58TFFpgCod ;
      AV115Tprvgenwwds_21_tffpgcod_sel = AV59TFFpgCod_Sel ;
      AV116Tprvgenwwds_22_tfprvvto = AV62TFPrvVto ;
      AV117Tprvgenwwds_23_tfprvvto_to = AV63TFPrvVto_To ;
      AV118Tprvgenwwds_24_tfprvdiapag = AV64TFPrvDiaPag ;
      AV119Tprvgenwwds_25_tfprvdiapag_to = AV65TFPrvDiaPag_To ;
      AV120Tprvgenwwds_26_tfprvper = AV66TFPrvPer ;
      AV121Tprvgenwwds_27_tfprvper_to = AV67TFPrvPer_To ;
      AV122Tprvgenwwds_28_tfprvban = AV68TFPrvBan ;
      AV123Tprvgenwwds_29_tfprvban_to = AV69TFPrvBan_To ;
      AV124Tprvgenwwds_30_tfprvrep = AV70TFPrvRep ;
      AV125Tprvgenwwds_31_tfprvrep_sel = AV71TFPrvRep_Sel ;
      AV126Tprvgenwwds_32_tfprvplaent = AV72TFPrvPlaEnt ;
      AV127Tprvgenwwds_33_tfprvplaent_to = AV73TFPrvPlaEnt_To ;
      AV128Tprvgenwwds_34_tfprvmettra_sels = AV88TFPrvMetTra_Sels ;
      AV129Tprvgenwwds_35_tfprvcta = AV76TFPrvCta ;
      AV130Tprvgenwwds_36_tfprvcta_sel = AV77TFPrvCta_Sel ;
      AV131Tprvgenwwds_37_tfprvdivcod_sels = AV79TFPrvDivCod_Sels ;
      AV132Tprvgenwwds_38_tfprvdivco = AV80TFPrvDivCo ;
      AV133Tprvgenwwds_39_tfprvdivco_to = AV81TFPrvDivCo_To ;
      AV134Tprvgenwwds_40_tfprvact_sel = AV91TFPrvAct_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A802PrvTip ,
                                           AV113Tprvgenwwds_19_tfprvtip_sels ,
                                           A792PrvMetTra ,
                                           AV128Tprvgenwwds_34_tfprvmettra_sels ,
                                           A3092PrvDivCod ,
                                           AV131Tprvgenwwds_37_tfprvdivcod_sels ,
                                           Integer.valueOf(AV96Tprvgenwwds_2_tfprvnum) ,
                                           Integer.valueOf(AV97Tprvgenwwds_3_tfprvnum_to) ,
                                           AV99Tprvgenwwds_5_tfprvnom_sel ,
                                           AV98Tprvgenwwds_4_tfprvnom ,
                                           AV101Tprvgenwwds_7_tfprvdir_sel ,
                                           AV100Tprvgenwwds_6_tfprvdir ,
                                           AV103Tprvgenwwds_9_tfprvcpo_sel ,
                                           AV102Tprvgenwwds_8_tfprvcpo ,
                                           AV105Tprvgenwwds_11_tfprvpob_sel ,
                                           AV104Tprvgenwwds_10_tfprvpob ,
                                           AV107Tprvgenwwds_13_tfprvnif_sel ,
                                           AV106Tprvgenwwds_12_tfprvnif ,
                                           AV109Tprvgenwwds_15_tfprvtlf_sel ,
                                           AV108Tprvgenwwds_14_tfprvtlf ,
                                           Byte.valueOf(AV110Tprvgenwwds_16_tfprvpri_sel) ,
                                           AV112Tprvgenwwds_18_tfprvtlx_sel ,
                                           AV111Tprvgenwwds_17_tfprvtlx ,
                                           Integer.valueOf(AV113Tprvgenwwds_19_tfprvtip_sels.size()) ,
                                           AV115Tprvgenwwds_21_tffpgcod_sel ,
                                           AV114Tprvgenwwds_20_tffpgcod ,
                                           Byte.valueOf(AV116Tprvgenwwds_22_tfprvvto) ,
                                           Byte.valueOf(AV117Tprvgenwwds_23_tfprvvto_to) ,
                                           Integer.valueOf(AV118Tprvgenwwds_24_tfprvdiapag) ,
                                           Integer.valueOf(AV119Tprvgenwwds_25_tfprvdiapag_to) ,
                                           Integer.valueOf(AV120Tprvgenwwds_26_tfprvper) ,
                                           Integer.valueOf(AV121Tprvgenwwds_27_tfprvper_to) ,
                                           Integer.valueOf(AV122Tprvgenwwds_28_tfprvban) ,
                                           Integer.valueOf(AV123Tprvgenwwds_29_tfprvban_to) ,
                                           AV125Tprvgenwwds_31_tfprvrep_sel ,
                                           AV124Tprvgenwwds_30_tfprvrep ,
                                           Short.valueOf(AV126Tprvgenwwds_32_tfprvplaent) ,
                                           Short.valueOf(AV127Tprvgenwwds_33_tfprvplaent_to) ,
                                           Integer.valueOf(AV128Tprvgenwwds_34_tfprvmettra_sels.size()) ,
                                           AV130Tprvgenwwds_36_tfprvcta_sel ,
                                           AV129Tprvgenwwds_35_tfprvcta ,
                                           Integer.valueOf(AV131Tprvgenwwds_37_tfprvdivcod_sels.size()) ,
                                           Byte.valueOf(AV132Tprvgenwwds_38_tfprvdivco) ,
                                           Byte.valueOf(AV133Tprvgenwwds_39_tfprvdivco_to) ,
                                           AV134Tprvgenwwds_40_tfprvact_sel ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A786PrvDir ,
                                           A782PrvCpo ,
                                           A799PrvPob ,
                                           A793PrvNif ,
                                           A803PrvTlf ,
                                           Byte.valueOf(A800PrvPri) ,
                                           A804PrvTlx ,
                                           A497FpgCod ,
                                           Byte.valueOf(A805PrvVto) ,
                                           Integer.valueOf(A785PrvDiaPag) ,
                                           Integer.valueOf(A797PrvPer) ,
                                           Integer.valueOf(A780PrvBan) ,
                                           A801PrvRep ,
                                           Short.valueOf(A798PrvPlaEnt) ,
                                           A783PrvCta ,
                                           Byte.valueOf(A3143PrvDivCo) ,
                                           A14216PrvAct ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV95Tprvgenwwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV98Tprvgenwwds_4_tfprvnom = GXutil.padr( GXutil.rtrim( AV98Tprvgenwwds_4_tfprvnom), 30, "%") ;
      lV100Tprvgenwwds_6_tfprvdir = GXutil.padr( GXutil.rtrim( AV100Tprvgenwwds_6_tfprvdir), 30, "%") ;
      lV102Tprvgenwwds_8_tfprvcpo = GXutil.padr( GXutil.rtrim( AV102Tprvgenwwds_8_tfprvcpo), 6, "%") ;
      lV104Tprvgenwwds_10_tfprvpob = GXutil.padr( GXutil.rtrim( AV104Tprvgenwwds_10_tfprvpob), 30, "%") ;
      lV106Tprvgenwwds_12_tfprvnif = GXutil.padr( GXutil.rtrim( AV106Tprvgenwwds_12_tfprvnif), 20, "%") ;
      lV108Tprvgenwwds_14_tfprvtlf = GXutil.padr( GXutil.rtrim( AV108Tprvgenwwds_14_tfprvtlf), 18, "%") ;
      lV111Tprvgenwwds_17_tfprvtlx = GXutil.padr( GXutil.rtrim( AV111Tprvgenwwds_17_tfprvtlx), 14, "%") ;
      lV114Tprvgenwwds_20_tffpgcod = GXutil.padr( GXutil.rtrim( AV114Tprvgenwwds_20_tffpgcod), 2, "%") ;
      lV124Tprvgenwwds_30_tfprvrep = GXutil.padr( GXutil.rtrim( AV124Tprvgenwwds_30_tfprvrep), 20, "%") ;
      lV129Tprvgenwwds_35_tfprvcta = GXutil.padr( GXutil.rtrim( AV129Tprvgenwwds_35_tfprvcta), 12, "%") ;
      /* Using cursor P08AL2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV96Tprvgenwwds_2_tfprvnum), Integer.valueOf(AV97Tprvgenwwds_3_tfprvnum_to), lV98Tprvgenwwds_4_tfprvnom, AV99Tprvgenwwds_5_tfprvnom_sel, lV100Tprvgenwwds_6_tfprvdir, AV101Tprvgenwwds_7_tfprvdir_sel, lV102Tprvgenwwds_8_tfprvcpo, AV103Tprvgenwwds_9_tfprvcpo_sel, lV104Tprvgenwwds_10_tfprvpob, AV105Tprvgenwwds_11_tfprvpob_sel, lV106Tprvgenwwds_12_tfprvnif, AV107Tprvgenwwds_13_tfprvnif_sel, lV108Tprvgenwwds_14_tfprvtlf, AV109Tprvgenwwds_15_tfprvtlf_sel, lV111Tprvgenwwds_17_tfprvtlx, AV112Tprvgenwwds_18_tfprvtlx_sel, lV114Tprvgenwwds_20_tffpgcod, AV115Tprvgenwwds_21_tffpgcod_sel, Byte.valueOf(AV116Tprvgenwwds_22_tfprvvto), Byte.valueOf(AV117Tprvgenwwds_23_tfprvvto_to), Integer.valueOf(AV118Tprvgenwwds_24_tfprvdiapag), Integer.valueOf(AV119Tprvgenwwds_25_tfprvdiapag_to), Integer.valueOf(AV120Tprvgenwwds_26_tfprvper), Integer.valueOf(AV121Tprvgenwwds_27_tfprvper_to), Integer.valueOf(AV122Tprvgenwwds_28_tfprvban), Integer.valueOf(AV123Tprvgenwwds_29_tfprvban_to), lV124Tprvgenwwds_30_tfprvrep, AV125Tprvgenwwds_31_tfprvrep_sel, Short.valueOf(AV126Tprvgenwwds_32_tfprvplaent), Short.valueOf(AV127Tprvgenwwds_33_tfprvplaent_to), lV129Tprvgenwwds_35_tfprvcta, AV130Tprvgenwwds_36_tfprvcta_sel, Byte.valueOf(AV132Tprvgenwwds_38_tfprvdivco), Byte.valueOf(AV133Tprvgenwwds_39_tfprvdivco_to), AV134Tprvgenwwds_40_tfprvact_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14216PrvAct = P08AL2_A14216PrvAct[0] ;
         A3143PrvDivCo = P08AL2_A3143PrvDivCo[0] ;
         A783PrvCta = P08AL2_A783PrvCta[0] ;
         n783PrvCta = P08AL2_n783PrvCta[0] ;
         A798PrvPlaEnt = P08AL2_A798PrvPlaEnt[0] ;
         n798PrvPlaEnt = P08AL2_n798PrvPlaEnt[0] ;
         A801PrvRep = P08AL2_A801PrvRep[0] ;
         n801PrvRep = P08AL2_n801PrvRep[0] ;
         A780PrvBan = P08AL2_A780PrvBan[0] ;
         n780PrvBan = P08AL2_n780PrvBan[0] ;
         A797PrvPer = P08AL2_A797PrvPer[0] ;
         n797PrvPer = P08AL2_n797PrvPer[0] ;
         A785PrvDiaPag = P08AL2_A785PrvDiaPag[0] ;
         n785PrvDiaPag = P08AL2_n785PrvDiaPag[0] ;
         A805PrvVto = P08AL2_A805PrvVto[0] ;
         n805PrvVto = P08AL2_n805PrvVto[0] ;
         A497FpgCod = P08AL2_A497FpgCod[0] ;
         n497FpgCod = P08AL2_n497FpgCod[0] ;
         A804PrvTlx = P08AL2_A804PrvTlx[0] ;
         n804PrvTlx = P08AL2_n804PrvTlx[0] ;
         A800PrvPri = P08AL2_A800PrvPri[0] ;
         n800PrvPri = P08AL2_n800PrvPri[0] ;
         A803PrvTlf = P08AL2_A803PrvTlf[0] ;
         n803PrvTlf = P08AL2_n803PrvTlf[0] ;
         A793PrvNif = P08AL2_A793PrvNif[0] ;
         n793PrvNif = P08AL2_n793PrvNif[0] ;
         A799PrvPob = P08AL2_A799PrvPob[0] ;
         n799PrvPob = P08AL2_n799PrvPob[0] ;
         A782PrvCpo = P08AL2_A782PrvCpo[0] ;
         n782PrvCpo = P08AL2_n782PrvCpo[0] ;
         A786PrvDir = P08AL2_A786PrvDir[0] ;
         n786PrvDir = P08AL2_n786PrvDir[0] ;
         A794PrvNom = P08AL2_A794PrvNom[0] ;
         n794PrvNom = P08AL2_n794PrvNom[0] ;
         A795PrvNum = P08AL2_A795PrvNum[0] ;
         A3092PrvDivCod = P08AL2_A3092PrvDivCod[0] ;
         n3092PrvDivCod = P08AL2_n3092PrvDivCod[0] ;
         A792PrvMetTra = P08AL2_A792PrvMetTra[0] ;
         n792PrvMetTra = P08AL2_n792PrvMetTra[0] ;
         A802PrvTip = P08AL2_A802PrvTip[0] ;
         n802PrvTip = P08AL2_n802PrvTip[0] ;
         A396EmprCod = P08AL2_A396EmprCod[0] ;
         if ( (GXutil.strcmp("", AV95Tprvgenwwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV95Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A786PrvDir) , GXutil.padr( "%" + GXutil.upper( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A782PrvCpo) , GXutil.padr( "%" + GXutil.upper( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A799PrvPob) , GXutil.padr( "%" + GXutil.upper( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A793PrvNif) , GXutil.padr( "%" + GXutil.upper( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A803PrvTlf) , GXutil.padr( "%" + GXutil.upper( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A804PrvTlx) , GXutil.padr( "%" + GXutil.upper( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "p", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "a", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A802PrvTip, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A497FpgCod) , GXutil.padr( "%" + GXutil.upper( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A805PrvVto, 2, 0) , GXutil.padr( "%" + AV95Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A785PrvDiaPag, 6, 0) , GXutil.padr( "%" + AV95Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A797PrvPer, 6, 0) , GXutil.padr( "%" + AV95Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A780PrvBan, 6, 0) , GXutil.padr( "%" + AV95Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A801PrvRep) , GXutil.padr( "%" + GXutil.upper( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A798PrvPlaEnt, 3, 0) , GXutil.padr( "%" + AV95Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "su transporte", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "S", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "nuestro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "N", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "agencia", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A792PrvMetTra, httpContext.getMessage( "A", "")) == 0 ) ) || ( GXutil.like( GXutil.upper( A783PrvCta) , GXutil.padr( "%" + GXutil.upper( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "euro", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "E", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "peseta", ""), "") , GXutil.padr( "%" + GXutil.lower( AV95Tprvgenwwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A3092PrvDivCod, httpContext.getMessage( "P", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A3143PrvDivCo, 2, 0) , GXutil.padr( "%" + AV95Tprvgenwwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
         {
            AV14TextFileLine = "" ;
            /* Execute user subroutine: 'BEFOREWRITELINE' */
            S162 ();
            if ( returnInSub )
            {
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
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A786PrvDir, ";", ","), GXv_char3) ;
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A782PrvCpo, ";", ","), GXv_char3) ;
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A799PrvPob, ";", ","), GXv_char3) ;
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A793PrvNif, ";", ","), GXv_char3) ;
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A803PrvTlf, ";", ","), GXv_char3) ;
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A800PrvPri, 1, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A804PrvTlx, ";", ","), GXv_char3) ;
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A802PrvTip), "P") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "P", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A802PrvTip), "A") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "A", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A497FpgCod, ";", ","), GXv_char3) ;
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A805PrvVto, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A785PrvDiaPag, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A797PrvPer, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A780PrvBan, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A801PrvRep, ";", ","), GXv_char3) ;
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A798PrvPlaEnt, 3, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
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
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A783PrvCta, ";", ","), GXv_char3) ;
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A3092PrvDivCod), "E") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "EURO", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A3092PrvDivCod), "P") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "PESETA", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A3143PrvDivCo, 2, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14216PrvAct, ";", ","), GXv_char3) ;
               tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            /* Execute user subroutine: 'AFTERWRITELINE' */
            S172 ();
            if ( returnInSub )
            {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TPRVGENWWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNum", "", "Codigo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNom", "", "Proveedor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvDir", "", "Direccion", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvCpo", "", "Codigo Postal", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvPob", "", "Poblacion", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvNif", "", "N.I.F.", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvTlf", "", "Telefonos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvPri", "", "Prioridad", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvTlx", "", "Telex", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvTip", "", "Proveedor o Acreador", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FpgCod", "", "Forma de Pago", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvVto", "", "No.Vencimientos", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvDiaPag", "", "Dias de Pago", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvPer", "", "Periodicidad", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvBan", "", "Codigo Banco", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvRep", "", "Representante", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvPlaEnt", "", "Dias Plazo Entrega", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvMetTra", "", "Metodo Transporte", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvCta", "", "Cuenta Contable", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvDivCod", "", "Divisa Traspaso Contable", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvDivCo", "", "Divisa", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "PrvAct", "", "Activo?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TPRVGENWWColumnsSelector", GXv_char3) ;
      tprvgenwwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TPRVGENWWGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TPRVGENWWGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("TPRVGENWWGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV135GXV1 = 1 ;
      while ( AV135GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV135GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV36TFPrvNum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV37TFPrvNum_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV38TFPrvNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV39TFPrvNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR") == 0 )
         {
            AV42TFPrvDir = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIR_SEL") == 0 )
         {
            AV43TFPrvDir_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO") == 0 )
         {
            AV44TFPrvCpo = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCPO_SEL") == 0 )
         {
            AV45TFPrvCpo_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB") == 0 )
         {
            AV46TFPrvPob = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPOB_SEL") == 0 )
         {
            AV47TFPrvPob_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF") == 0 )
         {
            AV48TFPrvNif = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNIF_SEL") == 0 )
         {
            AV49TFPrvNif_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF") == 0 )
         {
            AV50TFPrvTlf = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLF_SEL") == 0 )
         {
            AV51TFPrvTlf_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPRI_SEL") == 0 )
         {
            AV84TFPrvPri_Sel = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX") == 0 )
         {
            AV54TFPrvTlx = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTLX_SEL") == 0 )
         {
            AV55TFPrvTlx_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVTIP_SEL") == 0 )
         {
            AV85TFPrvTip_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV86TFPrvTip_Sels.fromJSonString(AV85TFPrvTip_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD") == 0 )
         {
            AV58TFFpgCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFPGCOD_SEL") == 0 )
         {
            AV59TFFpgCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVVTO") == 0 )
         {
            AV62TFPrvVto = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV63TFPrvVto_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIAPAG") == 0 )
         {
            AV64TFPrvDiaPag = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV65TFPrvDiaPag_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPER") == 0 )
         {
            AV66TFPrvPer = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV67TFPrvPer_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVBAN") == 0 )
         {
            AV68TFPrvBan = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFPrvBan_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP") == 0 )
         {
            AV70TFPrvRep = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVREP_SEL") == 0 )
         {
            AV71TFPrvRep_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVPLAENT") == 0 )
         {
            AV72TFPrvPlaEnt = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFPrvPlaEnt_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVMETTRA_SEL") == 0 )
         {
            AV87TFPrvMetTra_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV88TFPrvMetTra_Sels.fromJSonString(AV87TFPrvMetTra_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA") == 0 )
         {
            AV76TFPrvCta = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVCTA_SEL") == 0 )
         {
            AV77TFPrvCta_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIVCOD_SEL") == 0 )
         {
            AV78TFPrvDivCod_SelsJson = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV79TFPrvDivCod_Sels.fromJSonString(AV78TFPrvDivCod_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVDIVCO") == 0 )
         {
            AV80TFPrvDivCo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV81TFPrvDivCo_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVACT_SEL") == 0 )
         {
            AV91TFPrvAct_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV135GXV1 = (int)(AV135GXV1+1) ;
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
      A782PrvCpo = "" ;
      A799PrvPob = "" ;
      A793PrvNif = "" ;
      A803PrvTlf = "" ;
      A804PrvTlx = "" ;
      A802PrvTip = "" ;
      A497FpgCod = "" ;
      A801PrvRep = "" ;
      A792PrvMetTra = "" ;
      A783PrvCta = "" ;
      A3092PrvDivCod = "" ;
      A14216PrvAct = "" ;
      AV95Tprvgenwwds_1_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV98Tprvgenwwds_4_tfprvnom = "" ;
      AV38TFPrvNom = "" ;
      AV99Tprvgenwwds_5_tfprvnom_sel = "" ;
      AV39TFPrvNom_Sel = "" ;
      AV100Tprvgenwwds_6_tfprvdir = "" ;
      AV42TFPrvDir = "" ;
      AV101Tprvgenwwds_7_tfprvdir_sel = "" ;
      AV43TFPrvDir_Sel = "" ;
      AV102Tprvgenwwds_8_tfprvcpo = "" ;
      AV44TFPrvCpo = "" ;
      AV103Tprvgenwwds_9_tfprvcpo_sel = "" ;
      AV45TFPrvCpo_Sel = "" ;
      AV104Tprvgenwwds_10_tfprvpob = "" ;
      AV46TFPrvPob = "" ;
      AV105Tprvgenwwds_11_tfprvpob_sel = "" ;
      AV47TFPrvPob_Sel = "" ;
      AV106Tprvgenwwds_12_tfprvnif = "" ;
      AV48TFPrvNif = "" ;
      AV107Tprvgenwwds_13_tfprvnif_sel = "" ;
      AV49TFPrvNif_Sel = "" ;
      AV108Tprvgenwwds_14_tfprvtlf = "" ;
      AV50TFPrvTlf = "" ;
      AV109Tprvgenwwds_15_tfprvtlf_sel = "" ;
      AV51TFPrvTlf_Sel = "" ;
      AV111Tprvgenwwds_17_tfprvtlx = "" ;
      AV54TFPrvTlx = "" ;
      AV112Tprvgenwwds_18_tfprvtlx_sel = "" ;
      AV55TFPrvTlx_Sel = "" ;
      AV113Tprvgenwwds_19_tfprvtip_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV86TFPrvTip_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV114Tprvgenwwds_20_tffpgcod = "" ;
      AV58TFFpgCod = "" ;
      AV115Tprvgenwwds_21_tffpgcod_sel = "" ;
      AV59TFFpgCod_Sel = "" ;
      AV124Tprvgenwwds_30_tfprvrep = "" ;
      AV70TFPrvRep = "" ;
      AV125Tprvgenwwds_31_tfprvrep_sel = "" ;
      AV71TFPrvRep_Sel = "" ;
      AV128Tprvgenwwds_34_tfprvmettra_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV88TFPrvMetTra_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV129Tprvgenwwds_35_tfprvcta = "" ;
      AV76TFPrvCta = "" ;
      AV130Tprvgenwwds_36_tfprvcta_sel = "" ;
      AV77TFPrvCta_Sel = "" ;
      AV131Tprvgenwwds_37_tfprvdivcod_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV79TFPrvDivCod_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV134Tprvgenwwds_40_tfprvact_sel = "" ;
      AV91TFPrvAct_Sel = "" ;
      lV95Tprvgenwwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV98Tprvgenwwds_4_tfprvnom = "" ;
      lV100Tprvgenwwds_6_tfprvdir = "" ;
      lV102Tprvgenwwds_8_tfprvcpo = "" ;
      lV104Tprvgenwwds_10_tfprvpob = "" ;
      lV106Tprvgenwwds_12_tfprvnif = "" ;
      lV108Tprvgenwwds_14_tfprvtlf = "" ;
      lV111Tprvgenwwds_17_tfprvtlx = "" ;
      lV114Tprvgenwwds_20_tffpgcod = "" ;
      lV124Tprvgenwwds_30_tfprvrep = "" ;
      lV129Tprvgenwwds_35_tfprvcta = "" ;
      P08AL2_A14216PrvAct = new String[] {""} ;
      P08AL2_A3143PrvDivCo = new byte[1] ;
      P08AL2_A783PrvCta = new String[] {""} ;
      P08AL2_n783PrvCta = new boolean[] {false} ;
      P08AL2_A798PrvPlaEnt = new short[1] ;
      P08AL2_n798PrvPlaEnt = new boolean[] {false} ;
      P08AL2_A801PrvRep = new String[] {""} ;
      P08AL2_n801PrvRep = new boolean[] {false} ;
      P08AL2_A780PrvBan = new int[1] ;
      P08AL2_n780PrvBan = new boolean[] {false} ;
      P08AL2_A797PrvPer = new int[1] ;
      P08AL2_n797PrvPer = new boolean[] {false} ;
      P08AL2_A785PrvDiaPag = new int[1] ;
      P08AL2_n785PrvDiaPag = new boolean[] {false} ;
      P08AL2_A805PrvVto = new byte[1] ;
      P08AL2_n805PrvVto = new boolean[] {false} ;
      P08AL2_A497FpgCod = new String[] {""} ;
      P08AL2_n497FpgCod = new boolean[] {false} ;
      P08AL2_A804PrvTlx = new String[] {""} ;
      P08AL2_n804PrvTlx = new boolean[] {false} ;
      P08AL2_A800PrvPri = new byte[1] ;
      P08AL2_n800PrvPri = new boolean[] {false} ;
      P08AL2_A803PrvTlf = new String[] {""} ;
      P08AL2_n803PrvTlf = new boolean[] {false} ;
      P08AL2_A793PrvNif = new String[] {""} ;
      P08AL2_n793PrvNif = new boolean[] {false} ;
      P08AL2_A799PrvPob = new String[] {""} ;
      P08AL2_n799PrvPob = new boolean[] {false} ;
      P08AL2_A782PrvCpo = new String[] {""} ;
      P08AL2_n782PrvCpo = new boolean[] {false} ;
      P08AL2_A786PrvDir = new String[] {""} ;
      P08AL2_n786PrvDir = new boolean[] {false} ;
      P08AL2_A794PrvNom = new String[] {""} ;
      P08AL2_n794PrvNom = new boolean[] {false} ;
      P08AL2_A795PrvNum = new int[1] ;
      P08AL2_A3092PrvDivCod = new String[] {""} ;
      P08AL2_n3092PrvDivCod = new boolean[] {false} ;
      P08AL2_A792PrvMetTra = new String[] {""} ;
      P08AL2_n792PrvMetTra = new boolean[] {false} ;
      P08AL2_A802PrvTip = new String[] {""} ;
      P08AL2_n802PrvTip = new boolean[] {false} ;
      P08AL2_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
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
      AV85TFPrvTip_SelsJson = "" ;
      AV87TFPrvMetTra_SelsJson = "" ;
      AV78TFPrvDivCod_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprvgenwwexportcsv__default(),
         new Object[] {
             new Object[] {
            P08AL2_A14216PrvAct, P08AL2_A3143PrvDivCo, P08AL2_A783PrvCta, P08AL2_n783PrvCta, P08AL2_A798PrvPlaEnt, P08AL2_n798PrvPlaEnt, P08AL2_A801PrvRep, P08AL2_n801PrvRep, P08AL2_A780PrvBan, P08AL2_n780PrvBan,
            P08AL2_A797PrvPer, P08AL2_n797PrvPer, P08AL2_A785PrvDiaPag, P08AL2_n785PrvDiaPag, P08AL2_A805PrvVto, P08AL2_n805PrvVto, P08AL2_A497FpgCod, P08AL2_n497FpgCod, P08AL2_A804PrvTlx, P08AL2_n804PrvTlx,
            P08AL2_A800PrvPri, P08AL2_n800PrvPri, P08AL2_A803PrvTlf, P08AL2_n803PrvTlf, P08AL2_A793PrvNif, P08AL2_n793PrvNif, P08AL2_A799PrvPob, P08AL2_n799PrvPob, P08AL2_A782PrvCpo, P08AL2_n782PrvCpo,
            P08AL2_A786PrvDir, P08AL2_n786PrvDir, P08AL2_A794PrvNom, P08AL2_n794PrvNom, P08AL2_A795PrvNum, P08AL2_A3092PrvDivCod, P08AL2_n3092PrvDivCod, P08AL2_A792PrvMetTra, P08AL2_n792PrvMetTra, P08AL2_A802PrvTip,
            P08AL2_n802PrvTip, P08AL2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A800PrvPri ;
   private byte A805PrvVto ;
   private byte A3143PrvDivCo ;
   private byte AV110Tprvgenwwds_16_tfprvpri_sel ;
   private byte AV84TFPrvPri_Sel ;
   private byte AV116Tprvgenwwds_22_tfprvvto ;
   private byte AV62TFPrvVto ;
   private byte AV117Tprvgenwwds_23_tfprvvto_to ;
   private byte AV63TFPrvVto_To ;
   private byte AV132Tprvgenwwds_38_tfprvdivco ;
   private byte AV80TFPrvDivCo ;
   private byte AV133Tprvgenwwds_39_tfprvdivco_to ;
   private byte AV81TFPrvDivCo_To ;
   private short gxcookieaux ;
   private short A798PrvPlaEnt ;
   private short AV126Tprvgenwwds_32_tfprvplaent ;
   private short AV72TFPrvPlaEnt ;
   private short AV127Tprvgenwwds_33_tfprvplaent_to ;
   private short AV73TFPrvPlaEnt_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A795PrvNum ;
   private int A785PrvDiaPag ;
   private int A797PrvPer ;
   private int A780PrvBan ;
   private int AV96Tprvgenwwds_2_tfprvnum ;
   private int AV36TFPrvNum ;
   private int AV97Tprvgenwwds_3_tfprvnum_to ;
   private int AV37TFPrvNum_To ;
   private int AV118Tprvgenwwds_24_tfprvdiapag ;
   private int AV64TFPrvDiaPag ;
   private int AV119Tprvgenwwds_25_tfprvdiapag_to ;
   private int AV65TFPrvDiaPag_To ;
   private int AV120Tprvgenwwds_26_tfprvper ;
   private int AV66TFPrvPer ;
   private int AV121Tprvgenwwds_27_tfprvper_to ;
   private int AV67TFPrvPer_To ;
   private int AV122Tprvgenwwds_28_tfprvban ;
   private int AV68TFPrvBan ;
   private int AV123Tprvgenwwds_29_tfprvban_to ;
   private int AV69TFPrvBan_To ;
   private int AV113Tprvgenwwds_19_tfprvtip_sels_size ;
   private int AV128Tprvgenwwds_34_tfprvmettra_sels_size ;
   private int AV131Tprvgenwwds_37_tfprvdivcod_sels_size ;
   private int AV135GXV1 ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A794PrvNom ;
   private String A786PrvDir ;
   private String A782PrvCpo ;
   private String A799PrvPob ;
   private String A793PrvNif ;
   private String A803PrvTlf ;
   private String A804PrvTlx ;
   private String A802PrvTip ;
   private String A497FpgCod ;
   private String A801PrvRep ;
   private String A792PrvMetTra ;
   private String A783PrvCta ;
   private String A3092PrvDivCod ;
   private String A14216PrvAct ;
   private String AV98Tprvgenwwds_4_tfprvnom ;
   private String AV38TFPrvNom ;
   private String AV99Tprvgenwwds_5_tfprvnom_sel ;
   private String AV39TFPrvNom_Sel ;
   private String AV100Tprvgenwwds_6_tfprvdir ;
   private String AV42TFPrvDir ;
   private String AV101Tprvgenwwds_7_tfprvdir_sel ;
   private String AV43TFPrvDir_Sel ;
   private String AV102Tprvgenwwds_8_tfprvcpo ;
   private String AV44TFPrvCpo ;
   private String AV103Tprvgenwwds_9_tfprvcpo_sel ;
   private String AV45TFPrvCpo_Sel ;
   private String AV104Tprvgenwwds_10_tfprvpob ;
   private String AV46TFPrvPob ;
   private String AV105Tprvgenwwds_11_tfprvpob_sel ;
   private String AV47TFPrvPob_Sel ;
   private String AV106Tprvgenwwds_12_tfprvnif ;
   private String AV48TFPrvNif ;
   private String AV107Tprvgenwwds_13_tfprvnif_sel ;
   private String AV49TFPrvNif_Sel ;
   private String AV108Tprvgenwwds_14_tfprvtlf ;
   private String AV50TFPrvTlf ;
   private String AV109Tprvgenwwds_15_tfprvtlf_sel ;
   private String AV51TFPrvTlf_Sel ;
   private String AV111Tprvgenwwds_17_tfprvtlx ;
   private String AV54TFPrvTlx ;
   private String AV112Tprvgenwwds_18_tfprvtlx_sel ;
   private String AV55TFPrvTlx_Sel ;
   private String AV114Tprvgenwwds_20_tffpgcod ;
   private String AV58TFFpgCod ;
   private String AV115Tprvgenwwds_21_tffpgcod_sel ;
   private String AV59TFFpgCod_Sel ;
   private String AV124Tprvgenwwds_30_tfprvrep ;
   private String AV70TFPrvRep ;
   private String AV125Tprvgenwwds_31_tfprvrep_sel ;
   private String AV71TFPrvRep_Sel ;
   private String AV129Tprvgenwwds_35_tfprvcta ;
   private String AV76TFPrvCta ;
   private String AV130Tprvgenwwds_36_tfprvcta_sel ;
   private String AV77TFPrvCta_Sel ;
   private String AV134Tprvgenwwds_40_tfprvact_sel ;
   private String AV91TFPrvAct_Sel ;
   private String scmdbuf ;
   private String lV98Tprvgenwwds_4_tfprvnom ;
   private String lV100Tprvgenwwds_6_tfprvdir ;
   private String lV102Tprvgenwwds_8_tfprvcpo ;
   private String lV104Tprvgenwwds_10_tfprvpob ;
   private String lV106Tprvgenwwds_12_tfprvnif ;
   private String lV108Tprvgenwwds_14_tfprvtlf ;
   private String lV111Tprvgenwwds_17_tfprvtlx ;
   private String lV114Tprvgenwwds_20_tffpgcod ;
   private String lV124Tprvgenwwds_30_tfprvrep ;
   private String lV129Tprvgenwwds_35_tfprvcta ;
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
   private boolean n780PrvBan ;
   private boolean n797PrvPer ;
   private boolean n785PrvDiaPag ;
   private boolean n805PrvVto ;
   private boolean n497FpgCod ;
   private boolean n804PrvTlx ;
   private boolean n800PrvPri ;
   private boolean n803PrvTlf ;
   private boolean n793PrvNif ;
   private boolean n799PrvPob ;
   private boolean n782PrvCpo ;
   private boolean n786PrvDir ;
   private boolean n794PrvNom ;
   private boolean n3092PrvDivCod ;
   private boolean n792PrvMetTra ;
   private boolean n802PrvTip ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV85TFPrvTip_SelsJson ;
   private String AV87TFPrvMetTra_SelsJson ;
   private String AV78TFPrvDivCod_SelsJson ;
   private String AV11Filename ;
   private String AV95Tprvgenwwds_1_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV95Tprvgenwwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08AL2_A14216PrvAct ;
   private byte[] P08AL2_A3143PrvDivCo ;
   private String[] P08AL2_A783PrvCta ;
   private boolean[] P08AL2_n783PrvCta ;
   private short[] P08AL2_A798PrvPlaEnt ;
   private boolean[] P08AL2_n798PrvPlaEnt ;
   private String[] P08AL2_A801PrvRep ;
   private boolean[] P08AL2_n801PrvRep ;
   private int[] P08AL2_A780PrvBan ;
   private boolean[] P08AL2_n780PrvBan ;
   private int[] P08AL2_A797PrvPer ;
   private boolean[] P08AL2_n797PrvPer ;
   private int[] P08AL2_A785PrvDiaPag ;
   private boolean[] P08AL2_n785PrvDiaPag ;
   private byte[] P08AL2_A805PrvVto ;
   private boolean[] P08AL2_n805PrvVto ;
   private String[] P08AL2_A497FpgCod ;
   private boolean[] P08AL2_n497FpgCod ;
   private String[] P08AL2_A804PrvTlx ;
   private boolean[] P08AL2_n804PrvTlx ;
   private byte[] P08AL2_A800PrvPri ;
   private boolean[] P08AL2_n800PrvPri ;
   private String[] P08AL2_A803PrvTlf ;
   private boolean[] P08AL2_n803PrvTlf ;
   private String[] P08AL2_A793PrvNif ;
   private boolean[] P08AL2_n793PrvNif ;
   private String[] P08AL2_A799PrvPob ;
   private boolean[] P08AL2_n799PrvPob ;
   private String[] P08AL2_A782PrvCpo ;
   private boolean[] P08AL2_n782PrvCpo ;
   private String[] P08AL2_A786PrvDir ;
   private boolean[] P08AL2_n786PrvDir ;
   private String[] P08AL2_A794PrvNom ;
   private boolean[] P08AL2_n794PrvNom ;
   private int[] P08AL2_A795PrvNum ;
   private String[] P08AL2_A3092PrvDivCod ;
   private boolean[] P08AL2_n3092PrvDivCod ;
   private String[] P08AL2_A792PrvMetTra ;
   private boolean[] P08AL2_n792PrvMetTra ;
   private String[] P08AL2_A802PrvTip ;
   private boolean[] P08AL2_n802PrvTip ;
   private String[] P08AL2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV113Tprvgenwwds_19_tfprvtip_sels ;
   private GXSimpleCollection<String> AV86TFPrvTip_Sels ;
   private GXSimpleCollection<String> AV128Tprvgenwwds_34_tfprvmettra_sels ;
   private GXSimpleCollection<String> AV88TFPrvMetTra_Sels ;
   private GXSimpleCollection<String> AV131Tprvgenwwds_37_tfprvdivcod_sels ;
   private GXSimpleCollection<String> AV79TFPrvDivCod_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class tprvgenwwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08AL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A802PrvTip ,
                                          GXSimpleCollection<String> AV113Tprvgenwwds_19_tfprvtip_sels ,
                                          String A792PrvMetTra ,
                                          GXSimpleCollection<String> AV128Tprvgenwwds_34_tfprvmettra_sels ,
                                          String A3092PrvDivCod ,
                                          GXSimpleCollection<String> AV131Tprvgenwwds_37_tfprvdivcod_sels ,
                                          int AV96Tprvgenwwds_2_tfprvnum ,
                                          int AV97Tprvgenwwds_3_tfprvnum_to ,
                                          String AV99Tprvgenwwds_5_tfprvnom_sel ,
                                          String AV98Tprvgenwwds_4_tfprvnom ,
                                          String AV101Tprvgenwwds_7_tfprvdir_sel ,
                                          String AV100Tprvgenwwds_6_tfprvdir ,
                                          String AV103Tprvgenwwds_9_tfprvcpo_sel ,
                                          String AV102Tprvgenwwds_8_tfprvcpo ,
                                          String AV105Tprvgenwwds_11_tfprvpob_sel ,
                                          String AV104Tprvgenwwds_10_tfprvpob ,
                                          String AV107Tprvgenwwds_13_tfprvnif_sel ,
                                          String AV106Tprvgenwwds_12_tfprvnif ,
                                          String AV109Tprvgenwwds_15_tfprvtlf_sel ,
                                          String AV108Tprvgenwwds_14_tfprvtlf ,
                                          byte AV110Tprvgenwwds_16_tfprvpri_sel ,
                                          String AV112Tprvgenwwds_18_tfprvtlx_sel ,
                                          String AV111Tprvgenwwds_17_tfprvtlx ,
                                          int AV113Tprvgenwwds_19_tfprvtip_sels_size ,
                                          String AV115Tprvgenwwds_21_tffpgcod_sel ,
                                          String AV114Tprvgenwwds_20_tffpgcod ,
                                          byte AV116Tprvgenwwds_22_tfprvvto ,
                                          byte AV117Tprvgenwwds_23_tfprvvto_to ,
                                          int AV118Tprvgenwwds_24_tfprvdiapag ,
                                          int AV119Tprvgenwwds_25_tfprvdiapag_to ,
                                          int AV120Tprvgenwwds_26_tfprvper ,
                                          int AV121Tprvgenwwds_27_tfprvper_to ,
                                          int AV122Tprvgenwwds_28_tfprvban ,
                                          int AV123Tprvgenwwds_29_tfprvban_to ,
                                          String AV125Tprvgenwwds_31_tfprvrep_sel ,
                                          String AV124Tprvgenwwds_30_tfprvrep ,
                                          short AV126Tprvgenwwds_32_tfprvplaent ,
                                          short AV127Tprvgenwwds_33_tfprvplaent_to ,
                                          int AV128Tprvgenwwds_34_tfprvmettra_sels_size ,
                                          String AV130Tprvgenwwds_36_tfprvcta_sel ,
                                          String AV129Tprvgenwwds_35_tfprvcta ,
                                          int AV131Tprvgenwwds_37_tfprvdivcod_sels_size ,
                                          byte AV132Tprvgenwwds_38_tfprvdivco ,
                                          byte AV133Tprvgenwwds_39_tfprvdivco_to ,
                                          String AV134Tprvgenwwds_40_tfprvact_sel ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          String A786PrvDir ,
                                          String A782PrvCpo ,
                                          String A799PrvPob ,
                                          String A793PrvNif ,
                                          String A803PrvTlf ,
                                          byte A800PrvPri ,
                                          String A804PrvTlx ,
                                          String A497FpgCod ,
                                          byte A805PrvVto ,
                                          int A785PrvDiaPag ,
                                          int A797PrvPer ,
                                          int A780PrvBan ,
                                          String A801PrvRep ,
                                          short A798PrvPlaEnt ,
                                          String A783PrvCta ,
                                          byte A3143PrvDivCo ,
                                          String A14216PrvAct ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV95Tprvgenwwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[35];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT PrvAct, PrvDivCo, PrvCta, PrvPlaEnt, PrvRep, PrvBan, PrvPer, PrvDiaPag, PrvVto, FpgCod, PrvTlx, PrvPri, PrvTlf, PrvNif, PrvPob, PrvCpo, PrvDir, PrvNom, PrvNum," ;
      scmdbuf += " PrvDivCod, PrvMetTra, PrvTip, EmprCod FROM TXPPRVGEN" ;
      if ( ! (0==AV96Tprvgenwwds_2_tfprvnum) )
      {
         addWhere(sWhereString, "(PrvNum >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV97Tprvgenwwds_3_tfprvnum_to) )
      {
         addWhere(sWhereString, "(PrvNum <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Tprvgenwwds_5_tfprvnom_sel)==0) && ( ! (GXutil.strcmp("", AV98Tprvgenwwds_4_tfprvnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Tprvgenwwds_5_tfprvnom_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNom = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Tprvgenwwds_7_tfprvdir_sel)==0) && ( ! (GXutil.strcmp("", AV100Tprvgenwwds_6_tfprvdir)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvDir) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Tprvgenwwds_7_tfprvdir_sel)==0) )
      {
         addWhere(sWhereString, "(PrvDir = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Tprvgenwwds_9_tfprvcpo_sel)==0) && ( ! (GXutil.strcmp("", AV102Tprvgenwwds_8_tfprvcpo)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCpo) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Tprvgenwwds_9_tfprvcpo_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCpo = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Tprvgenwwds_11_tfprvpob_sel)==0) && ( ! (GXutil.strcmp("", AV104Tprvgenwwds_10_tfprvpob)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvPob) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Tprvgenwwds_11_tfprvpob_sel)==0) )
      {
         addWhere(sWhereString, "(PrvPob = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Tprvgenwwds_13_tfprvnif_sel)==0) && ( ! (GXutil.strcmp("", AV106Tprvgenwwds_12_tfprvnif)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvNif) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Tprvgenwwds_13_tfprvnif_sel)==0) )
      {
         addWhere(sWhereString, "(PrvNif = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Tprvgenwwds_15_tfprvtlf_sel)==0) && ( ! (GXutil.strcmp("", AV108Tprvgenwwds_14_tfprvtlf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Tprvgenwwds_15_tfprvtlf_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlf = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( AV110Tprvgenwwds_16_tfprvpri_sel == 1 )
      {
         addWhere(sWhereString, "(PrvPri = 1)");
      }
      if ( AV110Tprvgenwwds_16_tfprvpri_sel == 2 )
      {
         addWhere(sWhereString, "(PrvPri = 0)");
      }
      if ( (GXutil.strcmp("", AV112Tprvgenwwds_18_tfprvtlx_sel)==0) && ( ! (GXutil.strcmp("", AV111Tprvgenwwds_17_tfprvtlx)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvTlx) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Tprvgenwwds_18_tfprvtlx_sel)==0) )
      {
         addWhere(sWhereString, "(PrvTlx = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( AV113Tprvgenwwds_19_tfprvtip_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV113Tprvgenwwds_19_tfprvtip_sels, "PrvTip IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV115Tprvgenwwds_21_tffpgcod_sel)==0) && ( ! (GXutil.strcmp("", AV114Tprvgenwwds_20_tffpgcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(FpgCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Tprvgenwwds_21_tffpgcod_sel)==0) )
      {
         addWhere(sWhereString, "(FpgCod = ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV116Tprvgenwwds_22_tfprvvto) )
      {
         addWhere(sWhereString, "(PrvVto >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV117Tprvgenwwds_23_tfprvvto_to) )
      {
         addWhere(sWhereString, "(PrvVto <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV118Tprvgenwwds_24_tfprvdiapag) )
      {
         addWhere(sWhereString, "(PrvDiaPag >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV119Tprvgenwwds_25_tfprvdiapag_to) )
      {
         addWhere(sWhereString, "(PrvDiaPag <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV120Tprvgenwwds_26_tfprvper) )
      {
         addWhere(sWhereString, "(PrvPer >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV121Tprvgenwwds_27_tfprvper_to) )
      {
         addWhere(sWhereString, "(PrvPer <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV122Tprvgenwwds_28_tfprvban) )
      {
         addWhere(sWhereString, "(PrvBan >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV123Tprvgenwwds_29_tfprvban_to) )
      {
         addWhere(sWhereString, "(PrvBan <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Tprvgenwwds_31_tfprvrep_sel)==0) && ( ! (GXutil.strcmp("", AV124Tprvgenwwds_30_tfprvrep)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvRep) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Tprvgenwwds_31_tfprvrep_sel)==0) )
      {
         addWhere(sWhereString, "(PrvRep = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (0==AV126Tprvgenwwds_32_tfprvplaent) )
      {
         addWhere(sWhereString, "(PrvPlaEnt >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV127Tprvgenwwds_33_tfprvplaent_to) )
      {
         addWhere(sWhereString, "(PrvPlaEnt <= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( AV128Tprvgenwwds_34_tfprvmettra_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV128Tprvgenwwds_34_tfprvmettra_sels, "PrvMetTra IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV130Tprvgenwwds_36_tfprvcta_sel)==0) && ( ! (GXutil.strcmp("", AV129Tprvgenwwds_35_tfprvcta)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrvCta) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Tprvgenwwds_36_tfprvcta_sel)==0) )
      {
         addWhere(sWhereString, "(PrvCta = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( AV131Tprvgenwwds_37_tfprvdivcod_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Tprvgenwwds_37_tfprvdivcod_sels, "PrvDivCod IN (", ")")+")");
      }
      if ( ! (0==AV132Tprvgenwwds_38_tfprvdivco) )
      {
         addWhere(sWhereString, "(PrvDivCo >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV133Tprvgenwwds_39_tfprvdivco_to) )
      {
         addWhere(sWhereString, "(PrvDivCo <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Tprvgenwwds_40_tfprvact_sel)==0) )
      {
         addWhere(sWhereString, "(PrvAct = ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNom" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNum" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDir" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDir DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvCpo" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvCpo DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPob" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPob DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvNif" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvNif DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTlf" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTlf DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPri" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPri DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTlx" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTlx DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvTip" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvTip DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY FpgCod" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY FpgCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvVto" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvVto DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDiaPag" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDiaPag DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPer" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPer DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvBan" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvBan DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvRep" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvRep DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvPlaEnt" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvPlaEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvMetTra" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvMetTra DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvCta" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvCta DESC" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDivCod" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDivCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvDivCo" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvDivCo DESC" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY PrvAct" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PrvAct DESC" ;
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
                  return conditional_P08AL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , ((Number) dynConstraints[43]).byteValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).byteValue() , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).intValue() , ((Number) dynConstraints[58]).intValue() , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).byteValue() , (String)dynConstraints[63] , ((Number) dynConstraints[64]).shortValue() , ((Boolean) dynConstraints[65]).booleanValue() , (String)dynConstraints[66] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08AL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 14);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(12);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 18);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(14, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((int[]) buf[34])[0] = rslt.getInt(19);
               ((String[]) buf[35])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 3);
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
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 18);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 18);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 14);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 14);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[63]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 12);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               return;
      }
   }

}

