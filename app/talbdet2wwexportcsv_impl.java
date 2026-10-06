package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbdet2wwexportcsv_impl extends GXWebProcedure
{
   public talbdet2wwexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "TALBDET2WWExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TALBDET2WWColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("TALBDET2WWColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Recepcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Albaran Entrega", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Albaran Entrega", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Hora de entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Referencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Referencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Codigo Procedencia", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cod Transp", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Transportista", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tipo Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Destino", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Entrada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas Entregadas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Localizacion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reclamacion?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Piezas Utilizadas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Unidades Utilizadas", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV103Talbdet2wwds_1_filterfulltext = AV97FilterFullText ;
      AV104Talbdet2wwds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV105Talbdet2wwds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV106Talbdet2wwds_4_tfalbrent = AV53TFAlbREnt ;
      AV107Talbdet2wwds_5_tfalbrent_sel = AV54TFAlbREnt_Sel ;
      AV108Talbdet2wwds_6_tfalbrent2 = AV55TFAlbREnt2 ;
      AV109Talbdet2wwds_7_tfalbrent2_sel = AV56TFAlbREnt2_Sel ;
      AV110Talbdet2wwds_8_tfalbrfen = AV57TFAlbRFen ;
      AV111Talbdet2wwds_9_tfalbrhen = AV59TFAlbRHEn ;
      AV112Talbdet2wwds_10_tfclicod = AV61TFCliCod ;
      AV113Talbdet2wwds_11_tfclicod_to = AV62TFCliCod_To ;
      AV114Talbdet2wwds_12_tfclinom = AV63TFCliNom ;
      AV115Talbdet2wwds_13_tfclinom_sel = AV64TFCliNom_Sel ;
      AV116Talbdet2wwds_14_tfalbref = AV65TFAlbRef ;
      AV117Talbdet2wwds_15_tfalbref_sel = AV66TFAlbRef_Sel ;
      AV118Talbdet2wwds_16_tfalbrefdsc = AV67TFAlbRefDsc ;
      AV119Talbdet2wwds_17_tfalbrefdsc_sel = AV68TFAlbRefDsc_Sel ;
      AV120Talbdet2wwds_18_tfprocecod = AV69TFProceCod ;
      AV121Talbdet2wwds_19_tfprocecod_to = AV70TFProceCod_To ;
      AV122Talbdet2wwds_20_tfprocenom = AV71TFProceNom ;
      AV123Talbdet2wwds_21_tfprocenom_sel = AV72TFProceNom_Sel ;
      AV124Talbdet2wwds_22_tftrncod = AV73TFTrnCod ;
      AV125Talbdet2wwds_23_tftrncod_to = AV74TFTrnCod_To ;
      AV126Talbdet2wwds_24_tftrnnom = AV75TFTrnNom ;
      AV127Talbdet2wwds_25_tftrnnom_sel = AV76TFTrnNom_Sel ;
      AV128Talbdet2wwds_26_tftipentcod = AV77TFTipEntCod ;
      AV129Talbdet2wwds_27_tftipentcod_to = AV78TFTipEntCod_To ;
      AV130Talbdet2wwds_28_tftipentnom = AV79TFTipEntNom ;
      AV131Talbdet2wwds_29_tftipentnom_sel = AV80TFTipEntNom_Sel ;
      AV132Talbdet2wwds_30_tfalbrdes = AV81TFAlbRDes ;
      AV133Talbdet2wwds_31_tfalbrdes_sel = AV82TFAlbRDes_Sel ;
      AV134Talbdet2wwds_32_tfalbrunient = AV83TFAlbRUniEnt ;
      AV135Talbdet2wwds_33_tfalbrunient_to = AV84TFAlbRUniEnt_To ;
      AV136Talbdet2wwds_34_tfalbruni_sels = AV99TFAlbRUni_Sels ;
      AV137Talbdet2wwds_35_tfalbrpieent = AV87TFAlbRPieEnt ;
      AV138Talbdet2wwds_36_tfalbrpieent_to = AV88TFAlbRPieEnt_To ;
      AV139Talbdet2wwds_37_tfalbrloc = AV89TFAlbRLoc ;
      AV140Talbdet2wwds_38_tfalbrloc_sel = AV90TFAlbRLoc_Sel ;
      AV141Talbdet2wwds_39_tfalbrreo_sels = AV92TFAlbRReo_Sels ;
      AV142Talbdet2wwds_40_tfalbrpieuti = AV93TFAlbRPieUti ;
      AV143Talbdet2wwds_41_tfalbrpieuti_to = AV94TFAlbRPieUti_To ;
      AV144Talbdet2wwds_42_tfalbruniuti = AV95TFAlbRUniUti ;
      AV145Talbdet2wwds_43_tfalbruniuti_to = AV96TFAlbRUniUti_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV136Talbdet2wwds_34_tfalbruni_sels ,
                                           A55AlbRReo ,
                                           AV141Talbdet2wwds_39_tfalbrreo_sels ,
                                           Integer.valueOf(AV104Talbdet2wwds_2_tfalbreccod) ,
                                           Integer.valueOf(AV105Talbdet2wwds_3_tfalbreccod_to) ,
                                           AV107Talbdet2wwds_5_tfalbrent_sel ,
                                           AV106Talbdet2wwds_4_tfalbrent ,
                                           AV109Talbdet2wwds_7_tfalbrent2_sel ,
                                           AV108Talbdet2wwds_6_tfalbrent2 ,
                                           AV110Talbdet2wwds_8_tfalbrfen ,
                                           AV111Talbdet2wwds_9_tfalbrhen ,
                                           Integer.valueOf(AV112Talbdet2wwds_10_tfclicod) ,
                                           Integer.valueOf(AV113Talbdet2wwds_11_tfclicod_to) ,
                                           AV115Talbdet2wwds_13_tfclinom_sel ,
                                           AV114Talbdet2wwds_12_tfclinom ,
                                           AV117Talbdet2wwds_15_tfalbref_sel ,
                                           AV116Talbdet2wwds_14_tfalbref ,
                                           AV119Talbdet2wwds_17_tfalbrefdsc_sel ,
                                           AV118Talbdet2wwds_16_tfalbrefdsc ,
                                           Short.valueOf(AV120Talbdet2wwds_18_tfprocecod) ,
                                           Short.valueOf(AV121Talbdet2wwds_19_tfprocecod_to) ,
                                           AV123Talbdet2wwds_21_tfprocenom_sel ,
                                           AV122Talbdet2wwds_20_tfprocenom ,
                                           Short.valueOf(AV124Talbdet2wwds_22_tftrncod) ,
                                           Short.valueOf(AV125Talbdet2wwds_23_tftrncod_to) ,
                                           AV127Talbdet2wwds_25_tftrnnom_sel ,
                                           AV126Talbdet2wwds_24_tftrnnom ,
                                           Short.valueOf(AV128Talbdet2wwds_26_tftipentcod) ,
                                           Short.valueOf(AV129Talbdet2wwds_27_tftipentcod_to) ,
                                           AV131Talbdet2wwds_29_tftipentnom_sel ,
                                           AV130Talbdet2wwds_28_tftipentnom ,
                                           AV133Talbdet2wwds_31_tfalbrdes_sel ,
                                           AV132Talbdet2wwds_30_tfalbrdes ,
                                           AV134Talbdet2wwds_32_tfalbrunient ,
                                           AV135Talbdet2wwds_33_tfalbrunient_to ,
                                           Integer.valueOf(AV136Talbdet2wwds_34_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV137Talbdet2wwds_35_tfalbrpieent) ,
                                           Integer.valueOf(AV138Talbdet2wwds_36_tfalbrpieent_to) ,
                                           AV140Talbdet2wwds_38_tfalbrloc_sel ,
                                           AV139Talbdet2wwds_37_tfalbrloc ,
                                           Integer.valueOf(AV141Talbdet2wwds_39_tfalbrreo_sels.size()) ,
                                           Integer.valueOf(AV142Talbdet2wwds_40_tfalbrpieuti) ,
                                           Integer.valueOf(AV143Talbdet2wwds_41_tfalbrpieuti_to) ,
                                           AV144Talbdet2wwds_42_tfalbruniuti ,
                                           AV145Talbdet2wwds_43_tfalbruniuti_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A5806AlbREnt2 ,
                                           A49AlbRFen ,
                                           A4606AlbRHEn ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Short.valueOf(A970ProceCod) ,
                                           A971ProceNom ,
                                           Short.valueOf(A840TrnCod) ,
                                           A841TrnNom ,
                                           Short.valueOf(A1211TipEntCod) ,
                                           A1212TipEntNom ,
                                           A1291AlbRDes ,
                                           A58AlbRUniEnt ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           A50AlbRLoc ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A60AlbRUniUti ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV103Talbdet2wwds_1_filterfulltext } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV106Talbdet2wwds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV106Talbdet2wwds_4_tfalbrent), 8, "%") ;
      lV108Talbdet2wwds_6_tfalbrent2 = GXutil.padr( GXutil.rtrim( AV108Talbdet2wwds_6_tfalbrent2), 20, "%") ;
      lV114Talbdet2wwds_12_tfclinom = GXutil.padr( GXutil.rtrim( AV114Talbdet2wwds_12_tfclinom), 30, "%") ;
      lV116Talbdet2wwds_14_tfalbref = GXutil.padr( GXutil.rtrim( AV116Talbdet2wwds_14_tfalbref), 16, "%") ;
      lV118Talbdet2wwds_16_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV118Talbdet2wwds_16_tfalbrefdsc), 26, "%") ;
      lV122Talbdet2wwds_20_tfprocenom = GXutil.padr( GXutil.rtrim( AV122Talbdet2wwds_20_tfprocenom), 30, "%") ;
      lV126Talbdet2wwds_24_tftrnnom = GXutil.padr( GXutil.rtrim( AV126Talbdet2wwds_24_tftrnnom), 30, "%") ;
      lV130Talbdet2wwds_28_tftipentnom = GXutil.padr( GXutil.rtrim( AV130Talbdet2wwds_28_tftipentnom), 25, "%") ;
      lV132Talbdet2wwds_30_tfalbrdes = GXutil.padr( GXutil.rtrim( AV132Talbdet2wwds_30_tfalbrdes), 20, "%") ;
      lV139Talbdet2wwds_37_tfalbrloc = GXutil.padr( GXutil.rtrim( AV139Talbdet2wwds_37_tfalbrloc), 10, "%") ;
      /* Using cursor P086G2 */
      pr_default.execute(0, new Object[] {Integer.valueOf(AV104Talbdet2wwds_2_tfalbreccod), Integer.valueOf(AV105Talbdet2wwds_3_tfalbreccod_to), lV106Talbdet2wwds_4_tfalbrent, AV107Talbdet2wwds_5_tfalbrent_sel, lV108Talbdet2wwds_6_tfalbrent2, AV109Talbdet2wwds_7_tfalbrent2_sel, AV110Talbdet2wwds_8_tfalbrfen, AV111Talbdet2wwds_9_tfalbrhen, Integer.valueOf(AV112Talbdet2wwds_10_tfclicod), Integer.valueOf(AV113Talbdet2wwds_11_tfclicod_to), lV114Talbdet2wwds_12_tfclinom, AV115Talbdet2wwds_13_tfclinom_sel, lV116Talbdet2wwds_14_tfalbref, AV117Talbdet2wwds_15_tfalbref_sel, lV118Talbdet2wwds_16_tfalbrefdsc, AV119Talbdet2wwds_17_tfalbrefdsc_sel, Short.valueOf(AV120Talbdet2wwds_18_tfprocecod), Short.valueOf(AV121Talbdet2wwds_19_tfprocecod_to), lV122Talbdet2wwds_20_tfprocenom, AV123Talbdet2wwds_21_tfprocenom_sel, Short.valueOf(AV124Talbdet2wwds_22_tftrncod), Short.valueOf(AV125Talbdet2wwds_23_tftrncod_to), lV126Talbdet2wwds_24_tftrnnom, AV127Talbdet2wwds_25_tftrnnom_sel, Short.valueOf(AV128Talbdet2wwds_26_tftipentcod), Short.valueOf(AV129Talbdet2wwds_27_tftipentcod_to), lV130Talbdet2wwds_28_tftipentnom, AV131Talbdet2wwds_29_tftipentnom_sel, lV132Talbdet2wwds_30_tfalbrdes, AV133Talbdet2wwds_31_tfalbrdes_sel, AV134Talbdet2wwds_32_tfalbrunient, AV135Talbdet2wwds_33_tfalbrunient_to, Integer.valueOf(AV137Talbdet2wwds_35_tfalbrpieent), Integer.valueOf(AV138Talbdet2wwds_36_tfalbrpieent_to), lV139Talbdet2wwds_37_tfalbrloc, AV140Talbdet2wwds_38_tfalbrloc_sel, Integer.valueOf(AV142Talbdet2wwds_40_tfalbrpieuti), Integer.valueOf(AV143Talbdet2wwds_41_tfalbrpieuti_to), AV144Talbdet2wwds_42_tfalbruniuti, AV145Talbdet2wwds_43_tfalbruniuti_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P086G2_A396EmprCod[0] ;
         A60AlbRUniUti = P086G2_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P086G2_A54AlbRPieUti[0] ;
         A50AlbRLoc = P086G2_A50AlbRLoc[0] ;
         A52AlbRPieEnt = P086G2_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = P086G2_A58AlbRUniEnt[0] ;
         A1291AlbRDes = P086G2_A1291AlbRDes[0] ;
         A1212TipEntNom = P086G2_A1212TipEntNom[0] ;
         n1212TipEntNom = P086G2_n1212TipEntNom[0] ;
         A1211TipEntCod = P086G2_A1211TipEntCod[0] ;
         n1211TipEntCod = P086G2_n1211TipEntCod[0] ;
         A841TrnNom = P086G2_A841TrnNom[0] ;
         n841TrnNom = P086G2_n841TrnNom[0] ;
         A840TrnCod = P086G2_A840TrnCod[0] ;
         n840TrnCod = P086G2_n840TrnCod[0] ;
         A971ProceNom = P086G2_A971ProceNom[0] ;
         n971ProceNom = P086G2_n971ProceNom[0] ;
         A970ProceCod = P086G2_A970ProceCod[0] ;
         n970ProceCod = P086G2_n970ProceCod[0] ;
         A3613AlbRefDsc = P086G2_A3613AlbRefDsc[0] ;
         A45AlbRef = P086G2_A45AlbRef[0] ;
         A279CliNom = P086G2_A279CliNom[0] ;
         A252CliCod = P086G2_A252CliCod[0] ;
         A4606AlbRHEn = P086G2_A4606AlbRHEn[0] ;
         n4606AlbRHEn = P086G2_n4606AlbRHEn[0] ;
         A49AlbRFen = P086G2_A49AlbRFen[0] ;
         A5806AlbREnt2 = P086G2_A5806AlbREnt2[0] ;
         A46AlbREnt = P086G2_A46AlbREnt[0] ;
         A44AlbRecCod = P086G2_A44AlbRecCod[0] ;
         A55AlbRReo = P086G2_A55AlbRReo[0] ;
         A56AlbRUni = P086G2_A56AlbRUni[0] ;
         A1212TipEntNom = P086G2_A1212TipEntNom[0] ;
         n1212TipEntNom = P086G2_n1212TipEntNom[0] ;
         A841TrnNom = P086G2_A841TrnNom[0] ;
         n841TrnNom = P086G2_n841TrnNom[0] ;
         A971ProceNom = P086G2_A971ProceNom[0] ;
         n971ProceNom = P086G2_n971ProceNom[0] ;
         A279CliNom = P086G2_A279CliNom[0] ;
         if ( (GXutil.strcmp("", AV103Talbdet2wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A44AlbRecCod, 8, 0) , GXutil.padr( "%" + AV103Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A46AlbREnt) , GXutil.padr( "%" + GXutil.upper( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A5806AlbREnt2) , GXutil.padr( "%" + GXutil.upper( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV103Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A279CliNom) , GXutil.padr( "%" + GXutil.upper( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A45AlbRef) , GXutil.padr( "%" + GXutil.upper( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A3613AlbRefDsc) , GXutil.padr( "%" + GXutil.upper( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A970ProceCod, 4, 0) , GXutil.padr( "%" + AV103Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A971ProceNom) , GXutil.padr( "%" + GXutil.upper( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A840TrnCod, 4, 0) , GXutil.padr( "%" + AV103Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A841TrnNom) , GXutil.padr( "%" + GXutil.upper( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1211TipEntCod, 4, 0) , GXutil.padr( "%" + AV103Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1212TipEntNom) , GXutil.padr( "%" + GXutil.upper( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1291AlbRDes) , GXutil.padr( "%" + GXutil.upper( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A58AlbRUniEnt, 9, 2) , GXutil.padr( "%" + AV103Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "k", ""), "") , GXutil.padr( "%" + GXutil.lower( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "m", ""), "") , GXutil.padr( "%" + GXutil.lower( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A52AlbRPieEnt, 6, 0) , GXutil.padr( "%" + AV103Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A50AlbRLoc) , GXutil.padr( "%" + GXutil.upper( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "no", ""), "") , GXutil.padr( "%" + GXutil.lower( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "NO", "")) == 0 ) ) || ( GXutil.like( httpContext.getMessage( httpContext.getMessage( "si", ""), "") , GXutil.padr( "%" + GXutil.lower( AV103Talbdet2wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A55AlbRReo, httpContext.getMessage( "SI", "")) == 0 ) ) || ( GXutil.like( GXutil.str( A54AlbRPieUti, 6, 0) , GXutil.padr( "%" + AV103Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A60AlbRUniUti, 9, 2) , GXutil.padr( "%" + AV103Talbdet2wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) ) )
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
               returnInSub = true;
               if (true) return;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A44AlbRecCod, 8, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A46AlbREnt, ";", ","), GXv_char3) ;
               talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5806AlbREnt2, ";", ","), GXv_char3) ;
               talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.dtoc( A49AlbRFen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += localUtil.ttoc( A4606AlbRHEn, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
               talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A45AlbRef, ";", ","), GXv_char3) ;
               talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3613AlbRefDsc, ";", ","), GXv_char3) ;
               talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A970ProceCod, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A971ProceNom, ";", ","), GXv_char3) ;
               talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A840TrnCod, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A841TrnNom, ";", ","), GXv_char3) ;
               talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A1211TipEntCod, 4, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1212TipEntNom, ";", ","), GXv_char3) ;
               talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1291AlbRDes, ";", ","), GXv_char3) ;
               talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A58AlbRUniEnt, 9, 2) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "K") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "K", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A56AlbRUni), "M") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "M", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A52AlbRPieEnt, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               GXt_char2 = AV14TextFileLine ;
               GXv_char3[0] = GXt_char2 ;
               new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A50AlbRLoc, ";", ","), GXv_char3) ;
               talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               AV14TextFileLine += GXt_char2 ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "NO") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "NO", "") ;
               }
               else if ( GXutil.strcmp(GXutil.trim( A55AlbRReo), "SI") == 0 )
               {
                  AV14TextFileLine += httpContext.getMessage( "SI", "") ;
               }
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A54AlbRPieUti, 6, 0) ;
            }
            if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
            {
               AV14TextFileLine += ";" ;
               AV14TextFileLine += GXutil.str( A60AlbRUniUti, 9, 2) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=TALBDET2WWExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbREnt", "", "Albaran Entrega", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbREnt2", "", "Nº Albaran Entrega", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRFen", "", "Fecha Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRHEn", "", "Hora de entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRef", "", "Codigo Referencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRefDsc", "", "Descripcion Referencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceCod", "", "Codigo Procedencia", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ProceNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnCod", "", "Cod Transp", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TrnNom", "", "Transportista", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipEntCod", "", "Tipo Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "TipEntNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRDes", "", "Destino", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUniEnt", "", "Unidades Entrada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUni", "", "Unidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRPieEnt", "", "Piezas Entregadas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRLoc", "", "Localizacion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRReo", "", "Reclamacion?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRPieUti", "", "Piezas Utilizadas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "AlbRUniUti", "", "Unidades Utilizadas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "TALBDET2WWColumnsSelector", GXv_char3) ;
      talbdet2wwexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("TALBDET2WWGridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "TALBDET2WWGridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV19Session.getValue("TALBDET2WWGridState"), null, null);
      }
      AV28OrderedBy = AV49GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV49GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV146GXV1 = 1 ;
      while ( AV146GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV50GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV146GXV1));
         if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV97FilterFullText = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV51TFAlbRecCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFAlbRecCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV53TFAlbREnt = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV54TFAlbREnt_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2") == 0 )
         {
            AV55TFAlbREnt2 = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT2_SEL") == 0 )
         {
            AV56TFAlbREnt2_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRFEN") == 0 )
         {
            AV57TFAlbRFen = localUtil.ctod( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHEN") == 0 )
         {
            AV59TFAlbRHEn = localUtil.ctot( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV61TFCliCod = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV62TFCliCod_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV63TFCliNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV64TFCliNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV65TFAlbRef = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV66TFAlbRef_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV67TFAlbRefDsc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV68TFAlbRefDsc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCECOD") == 0 )
         {
            AV69TFProceCod = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFProceCod_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM") == 0 )
         {
            AV71TFProceNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCENOM_SEL") == 0 )
         {
            AV72TFProceNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNCOD") == 0 )
         {
            AV73TFTrnCod = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFTrnCod_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM") == 0 )
         {
            AV75TFTrnNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTRNNOM_SEL") == 0 )
         {
            AV76TFTrnNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTCOD") == 0 )
         {
            AV77TFTipEntCod = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV78TFTipEntCod_To = (short)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM") == 0 )
         {
            AV79TFTipEntNom = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFTIPENTNOM_SEL") == 0 )
         {
            AV80TFTipEntNom_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES") == 0 )
         {
            AV81TFAlbRDes = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRDES_SEL") == 0 )
         {
            AV82TFAlbRDes_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV83TFAlbRUniEnt = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV84TFAlbRUniEnt_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV98TFAlbRUni_SelsJson = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV99TFAlbRUni_Sels.fromJSonString(AV98TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV87TFAlbRPieEnt = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV88TFAlbRPieEnt_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC") == 0 )
         {
            AV89TFAlbRLoc = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOC_SEL") == 0 )
         {
            AV90TFAlbRLoc_Sel = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV91TFAlbRReo_SelsJson = AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            AV92TFAlbRReo_Sels.fromJSonString(AV91TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV93TFAlbRPieUti = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV94TFAlbRPieUti_To = (int)(GXutil.lval( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV95TFAlbRUniUti = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV96TFAlbRUniUti_To = CommonUtil.decimalVal( AV50GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         AV146GXV1 = (int)(AV146GXV1+1) ;
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
      A46AlbREnt = "" ;
      A5806AlbREnt2 = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A4606AlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A971ProceNom = "" ;
      A841TrnNom = "" ;
      A1212TipEntNom = "" ;
      A1291AlbRDes = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A50AlbRLoc = "" ;
      A55AlbRReo = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      AV103Talbdet2wwds_1_filterfulltext = "" ;
      AV97FilterFullText = "" ;
      AV106Talbdet2wwds_4_tfalbrent = "" ;
      AV53TFAlbREnt = "" ;
      AV107Talbdet2wwds_5_tfalbrent_sel = "" ;
      AV54TFAlbREnt_Sel = "" ;
      AV108Talbdet2wwds_6_tfalbrent2 = "" ;
      AV55TFAlbREnt2 = "" ;
      AV109Talbdet2wwds_7_tfalbrent2_sel = "" ;
      AV56TFAlbREnt2_Sel = "" ;
      AV110Talbdet2wwds_8_tfalbrfen = GXutil.nullDate() ;
      AV57TFAlbRFen = GXutil.nullDate() ;
      AV111Talbdet2wwds_9_tfalbrhen = GXutil.resetTime( GXutil.nullDate() );
      AV59TFAlbRHEn = GXutil.resetTime( GXutil.nullDate() );
      AV114Talbdet2wwds_12_tfclinom = "" ;
      AV63TFCliNom = "" ;
      AV115Talbdet2wwds_13_tfclinom_sel = "" ;
      AV64TFCliNom_Sel = "" ;
      AV116Talbdet2wwds_14_tfalbref = "" ;
      AV65TFAlbRef = "" ;
      AV117Talbdet2wwds_15_tfalbref_sel = "" ;
      AV66TFAlbRef_Sel = "" ;
      AV118Talbdet2wwds_16_tfalbrefdsc = "" ;
      AV67TFAlbRefDsc = "" ;
      AV119Talbdet2wwds_17_tfalbrefdsc_sel = "" ;
      AV68TFAlbRefDsc_Sel = "" ;
      AV122Talbdet2wwds_20_tfprocenom = "" ;
      AV71TFProceNom = "" ;
      AV123Talbdet2wwds_21_tfprocenom_sel = "" ;
      AV72TFProceNom_Sel = "" ;
      AV126Talbdet2wwds_24_tftrnnom = "" ;
      AV75TFTrnNom = "" ;
      AV127Talbdet2wwds_25_tftrnnom_sel = "" ;
      AV76TFTrnNom_Sel = "" ;
      AV130Talbdet2wwds_28_tftipentnom = "" ;
      AV79TFTipEntNom = "" ;
      AV131Talbdet2wwds_29_tftipentnom_sel = "" ;
      AV80TFTipEntNom_Sel = "" ;
      AV132Talbdet2wwds_30_tfalbrdes = "" ;
      AV81TFAlbRDes = "" ;
      AV133Talbdet2wwds_31_tfalbrdes_sel = "" ;
      AV82TFAlbRDes_Sel = "" ;
      AV134Talbdet2wwds_32_tfalbrunient = DecimalUtil.ZERO ;
      AV83TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV135Talbdet2wwds_33_tfalbrunient_to = DecimalUtil.ZERO ;
      AV84TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV136Talbdet2wwds_34_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV99TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV139Talbdet2wwds_37_tfalbrloc = "" ;
      AV89TFAlbRLoc = "" ;
      AV140Talbdet2wwds_38_tfalbrloc_sel = "" ;
      AV90TFAlbRLoc_Sel = "" ;
      AV141Talbdet2wwds_39_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV92TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV144Talbdet2wwds_42_tfalbruniuti = DecimalUtil.ZERO ;
      AV95TFAlbRUniUti = DecimalUtil.ZERO ;
      AV145Talbdet2wwds_43_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV96TFAlbRUniUti_To = DecimalUtil.ZERO ;
      lV103Talbdet2wwds_1_filterfulltext = "" ;
      scmdbuf = "" ;
      lV106Talbdet2wwds_4_tfalbrent = "" ;
      lV108Talbdet2wwds_6_tfalbrent2 = "" ;
      lV114Talbdet2wwds_12_tfclinom = "" ;
      lV116Talbdet2wwds_14_tfalbref = "" ;
      lV118Talbdet2wwds_16_tfalbrefdsc = "" ;
      lV122Talbdet2wwds_20_tfprocenom = "" ;
      lV126Talbdet2wwds_24_tftrnnom = "" ;
      lV130Talbdet2wwds_28_tftipentnom = "" ;
      lV132Talbdet2wwds_30_tfalbrdes = "" ;
      lV139Talbdet2wwds_37_tfalbrloc = "" ;
      P086G2_A396EmprCod = new String[] {""} ;
      P086G2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086G2_A54AlbRPieUti = new int[1] ;
      P086G2_A50AlbRLoc = new String[] {""} ;
      P086G2_A52AlbRPieEnt = new int[1] ;
      P086G2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P086G2_A1291AlbRDes = new String[] {""} ;
      P086G2_A1212TipEntNom = new String[] {""} ;
      P086G2_n1212TipEntNom = new boolean[] {false} ;
      P086G2_A1211TipEntCod = new short[1] ;
      P086G2_n1211TipEntCod = new boolean[] {false} ;
      P086G2_A841TrnNom = new String[] {""} ;
      P086G2_n841TrnNom = new boolean[] {false} ;
      P086G2_A840TrnCod = new short[1] ;
      P086G2_n840TrnCod = new boolean[] {false} ;
      P086G2_A971ProceNom = new String[] {""} ;
      P086G2_n971ProceNom = new boolean[] {false} ;
      P086G2_A970ProceCod = new short[1] ;
      P086G2_n970ProceCod = new boolean[] {false} ;
      P086G2_A3613AlbRefDsc = new String[] {""} ;
      P086G2_A45AlbRef = new String[] {""} ;
      P086G2_A279CliNom = new String[] {""} ;
      P086G2_A252CliCod = new int[1] ;
      P086G2_A4606AlbRHEn = new java.util.Date[] {GXutil.nullDate()} ;
      P086G2_n4606AlbRHEn = new boolean[] {false} ;
      P086G2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      P086G2_A5806AlbREnt2 = new String[] {""} ;
      P086G2_A46AlbREnt = new String[] {""} ;
      P086G2_A44AlbRecCod = new int[1] ;
      P086G2_A55AlbRReo = new String[] {""} ;
      P086G2_A56AlbRUni = new String[] {""} ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV50GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV98TFAlbRUni_SelsJson = "" ;
      AV91TFAlbRReo_SelsJson = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbdet2wwexportcsv__default(),
         new Object[] {
             new Object[] {
            P086G2_A396EmprCod, P086G2_A60AlbRUniUti, P086G2_A54AlbRPieUti, P086G2_A50AlbRLoc, P086G2_A52AlbRPieEnt, P086G2_A58AlbRUniEnt, P086G2_A1291AlbRDes, P086G2_A1212TipEntNom, P086G2_n1212TipEntNom, P086G2_A1211TipEntCod,
            P086G2_n1211TipEntCod, P086G2_A841TrnNom, P086G2_n841TrnNom, P086G2_A840TrnCod, P086G2_n840TrnCod, P086G2_A971ProceNom, P086G2_n971ProceNom, P086G2_A970ProceCod, P086G2_n970ProceCod, P086G2_A3613AlbRefDsc,
            P086G2_A45AlbRef, P086G2_A279CliNom, P086G2_A252CliCod, P086G2_A4606AlbRHEn, P086G2_n4606AlbRHEn, P086G2_A49AlbRFen, P086G2_A5806AlbREnt2, P086G2_A46AlbREnt, P086G2_A44AlbRecCod, P086G2_A55AlbRReo,
            P086G2_A56AlbRUni
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short A970ProceCod ;
   private short A840TrnCod ;
   private short A1211TipEntCod ;
   private short AV120Talbdet2wwds_18_tfprocecod ;
   private short AV69TFProceCod ;
   private short AV121Talbdet2wwds_19_tfprocecod_to ;
   private short AV70TFProceCod_To ;
   private short AV124Talbdet2wwds_22_tftrncod ;
   private short AV73TFTrnCod ;
   private short AV125Talbdet2wwds_23_tftrncod_to ;
   private short AV74TFTrnCod_To ;
   private short AV128Talbdet2wwds_26_tftipentcod ;
   private short AV77TFTipEntCod ;
   private short AV129Talbdet2wwds_27_tftipentcod_to ;
   private short AV78TFTipEntCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int AV104Talbdet2wwds_2_tfalbreccod ;
   private int AV51TFAlbRecCod ;
   private int AV105Talbdet2wwds_3_tfalbreccod_to ;
   private int AV52TFAlbRecCod_To ;
   private int AV112Talbdet2wwds_10_tfclicod ;
   private int AV61TFCliCod ;
   private int AV113Talbdet2wwds_11_tfclicod_to ;
   private int AV62TFCliCod_To ;
   private int AV137Talbdet2wwds_35_tfalbrpieent ;
   private int AV87TFAlbRPieEnt ;
   private int AV138Talbdet2wwds_36_tfalbrpieent_to ;
   private int AV88TFAlbRPieEnt_To ;
   private int AV142Talbdet2wwds_40_tfalbrpieuti ;
   private int AV93TFAlbRPieUti ;
   private int AV143Talbdet2wwds_41_tfalbrpieuti_to ;
   private int AV94TFAlbRPieUti_To ;
   private int AV136Talbdet2wwds_34_tfalbruni_sels_size ;
   private int AV141Talbdet2wwds_39_tfalbrreo_sels_size ;
   private int AV146GXV1 ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV134Talbdet2wwds_32_tfalbrunient ;
   private java.math.BigDecimal AV83TFAlbRUniEnt ;
   private java.math.BigDecimal AV135Talbdet2wwds_33_tfalbrunient_to ;
   private java.math.BigDecimal AV84TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV144Talbdet2wwds_42_tfalbruniuti ;
   private java.math.BigDecimal AV95TFAlbRUniUti ;
   private java.math.BigDecimal AV145Talbdet2wwds_43_tfalbruniuti_to ;
   private java.math.BigDecimal AV96TFAlbRUniUti_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A46AlbREnt ;
   private String A5806AlbREnt2 ;
   private String A279CliNom ;
   private String A45AlbRef ;
   private String A3613AlbRefDsc ;
   private String A971ProceNom ;
   private String A841TrnNom ;
   private String A1212TipEntNom ;
   private String A1291AlbRDes ;
   private String A56AlbRUni ;
   private String A50AlbRLoc ;
   private String A55AlbRReo ;
   private String AV106Talbdet2wwds_4_tfalbrent ;
   private String AV53TFAlbREnt ;
   private String AV107Talbdet2wwds_5_tfalbrent_sel ;
   private String AV54TFAlbREnt_Sel ;
   private String AV108Talbdet2wwds_6_tfalbrent2 ;
   private String AV55TFAlbREnt2 ;
   private String AV109Talbdet2wwds_7_tfalbrent2_sel ;
   private String AV56TFAlbREnt2_Sel ;
   private String AV114Talbdet2wwds_12_tfclinom ;
   private String AV63TFCliNom ;
   private String AV115Talbdet2wwds_13_tfclinom_sel ;
   private String AV64TFCliNom_Sel ;
   private String AV116Talbdet2wwds_14_tfalbref ;
   private String AV65TFAlbRef ;
   private String AV117Talbdet2wwds_15_tfalbref_sel ;
   private String AV66TFAlbRef_Sel ;
   private String AV118Talbdet2wwds_16_tfalbrefdsc ;
   private String AV67TFAlbRefDsc ;
   private String AV119Talbdet2wwds_17_tfalbrefdsc_sel ;
   private String AV68TFAlbRefDsc_Sel ;
   private String AV122Talbdet2wwds_20_tfprocenom ;
   private String AV71TFProceNom ;
   private String AV123Talbdet2wwds_21_tfprocenom_sel ;
   private String AV72TFProceNom_Sel ;
   private String AV126Talbdet2wwds_24_tftrnnom ;
   private String AV75TFTrnNom ;
   private String AV127Talbdet2wwds_25_tftrnnom_sel ;
   private String AV76TFTrnNom_Sel ;
   private String AV130Talbdet2wwds_28_tftipentnom ;
   private String AV79TFTipEntNom ;
   private String AV131Talbdet2wwds_29_tftipentnom_sel ;
   private String AV80TFTipEntNom_Sel ;
   private String AV132Talbdet2wwds_30_tfalbrdes ;
   private String AV81TFAlbRDes ;
   private String AV133Talbdet2wwds_31_tfalbrdes_sel ;
   private String AV82TFAlbRDes_Sel ;
   private String AV139Talbdet2wwds_37_tfalbrloc ;
   private String AV89TFAlbRLoc ;
   private String AV140Talbdet2wwds_38_tfalbrloc_sel ;
   private String AV90TFAlbRLoc_Sel ;
   private String scmdbuf ;
   private String lV106Talbdet2wwds_4_tfalbrent ;
   private String lV108Talbdet2wwds_6_tfalbrent2 ;
   private String lV114Talbdet2wwds_12_tfclinom ;
   private String lV116Talbdet2wwds_14_tfalbref ;
   private String lV118Talbdet2wwds_16_tfalbrefdsc ;
   private String lV122Talbdet2wwds_20_tfprocenom ;
   private String lV126Talbdet2wwds_24_tftrnnom ;
   private String lV130Talbdet2wwds_28_tftipentnom ;
   private String lV132Talbdet2wwds_30_tfalbrdes ;
   private String lV139Talbdet2wwds_37_tfalbrloc ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4606AlbRHEn ;
   private java.util.Date AV111Talbdet2wwds_9_tfalbrhen ;
   private java.util.Date AV59TFAlbRHEn ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV110Talbdet2wwds_8_tfalbrfen ;
   private java.util.Date AV57TFAlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n1212TipEntNom ;
   private boolean n1211TipEntCod ;
   private boolean n841TrnNom ;
   private boolean n840TrnCod ;
   private boolean n971ProceNom ;
   private boolean n970ProceCod ;
   private boolean n4606AlbRHEn ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV98TFAlbRUni_SelsJson ;
   private String AV91TFAlbRReo_SelsJson ;
   private String AV11Filename ;
   private String AV103Talbdet2wwds_1_filterfulltext ;
   private String AV97FilterFullText ;
   private String lV103Talbdet2wwds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P086G2_A396EmprCod ;
   private java.math.BigDecimal[] P086G2_A60AlbRUniUti ;
   private int[] P086G2_A54AlbRPieUti ;
   private String[] P086G2_A50AlbRLoc ;
   private int[] P086G2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] P086G2_A58AlbRUniEnt ;
   private String[] P086G2_A1291AlbRDes ;
   private String[] P086G2_A1212TipEntNom ;
   private boolean[] P086G2_n1212TipEntNom ;
   private short[] P086G2_A1211TipEntCod ;
   private boolean[] P086G2_n1211TipEntCod ;
   private String[] P086G2_A841TrnNom ;
   private boolean[] P086G2_n841TrnNom ;
   private short[] P086G2_A840TrnCod ;
   private boolean[] P086G2_n840TrnCod ;
   private String[] P086G2_A971ProceNom ;
   private boolean[] P086G2_n971ProceNom ;
   private short[] P086G2_A970ProceCod ;
   private boolean[] P086G2_n970ProceCod ;
   private String[] P086G2_A3613AlbRefDsc ;
   private String[] P086G2_A45AlbRef ;
   private String[] P086G2_A279CliNom ;
   private int[] P086G2_A252CliCod ;
   private java.util.Date[] P086G2_A4606AlbRHEn ;
   private boolean[] P086G2_n4606AlbRHEn ;
   private java.util.Date[] P086G2_A49AlbRFen ;
   private String[] P086G2_A5806AlbREnt2 ;
   private String[] P086G2_A46AlbREnt ;
   private int[] P086G2_A44AlbRecCod ;
   private String[] P086G2_A55AlbRReo ;
   private String[] P086G2_A56AlbRUni ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private GXSimpleCollection<String> AV136Talbdet2wwds_34_tfalbruni_sels ;
   private GXSimpleCollection<String> AV99TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV141Talbdet2wwds_39_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV92TFAlbRReo_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV50GridStateFilterValue ;
}

final  class talbdet2wwexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P086G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV136Talbdet2wwds_34_tfalbruni_sels ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV141Talbdet2wwds_39_tfalbrreo_sels ,
                                          int AV104Talbdet2wwds_2_tfalbreccod ,
                                          int AV105Talbdet2wwds_3_tfalbreccod_to ,
                                          String AV107Talbdet2wwds_5_tfalbrent_sel ,
                                          String AV106Talbdet2wwds_4_tfalbrent ,
                                          String AV109Talbdet2wwds_7_tfalbrent2_sel ,
                                          String AV108Talbdet2wwds_6_tfalbrent2 ,
                                          java.util.Date AV110Talbdet2wwds_8_tfalbrfen ,
                                          java.util.Date AV111Talbdet2wwds_9_tfalbrhen ,
                                          int AV112Talbdet2wwds_10_tfclicod ,
                                          int AV113Talbdet2wwds_11_tfclicod_to ,
                                          String AV115Talbdet2wwds_13_tfclinom_sel ,
                                          String AV114Talbdet2wwds_12_tfclinom ,
                                          String AV117Talbdet2wwds_15_tfalbref_sel ,
                                          String AV116Talbdet2wwds_14_tfalbref ,
                                          String AV119Talbdet2wwds_17_tfalbrefdsc_sel ,
                                          String AV118Talbdet2wwds_16_tfalbrefdsc ,
                                          short AV120Talbdet2wwds_18_tfprocecod ,
                                          short AV121Talbdet2wwds_19_tfprocecod_to ,
                                          String AV123Talbdet2wwds_21_tfprocenom_sel ,
                                          String AV122Talbdet2wwds_20_tfprocenom ,
                                          short AV124Talbdet2wwds_22_tftrncod ,
                                          short AV125Talbdet2wwds_23_tftrncod_to ,
                                          String AV127Talbdet2wwds_25_tftrnnom_sel ,
                                          String AV126Talbdet2wwds_24_tftrnnom ,
                                          short AV128Talbdet2wwds_26_tftipentcod ,
                                          short AV129Talbdet2wwds_27_tftipentcod_to ,
                                          String AV131Talbdet2wwds_29_tftipentnom_sel ,
                                          String AV130Talbdet2wwds_28_tftipentnom ,
                                          String AV133Talbdet2wwds_31_tfalbrdes_sel ,
                                          String AV132Talbdet2wwds_30_tfalbrdes ,
                                          java.math.BigDecimal AV134Talbdet2wwds_32_tfalbrunient ,
                                          java.math.BigDecimal AV135Talbdet2wwds_33_tfalbrunient_to ,
                                          int AV136Talbdet2wwds_34_tfalbruni_sels_size ,
                                          int AV137Talbdet2wwds_35_tfalbrpieent ,
                                          int AV138Talbdet2wwds_36_tfalbrpieent_to ,
                                          String AV140Talbdet2wwds_38_tfalbrloc_sel ,
                                          String AV139Talbdet2wwds_37_tfalbrloc ,
                                          int AV141Talbdet2wwds_39_tfalbrreo_sels_size ,
                                          int AV142Talbdet2wwds_40_tfalbrpieuti ,
                                          int AV143Talbdet2wwds_41_tfalbrpieuti_to ,
                                          java.math.BigDecimal AV144Talbdet2wwds_42_tfalbruniuti ,
                                          java.math.BigDecimal AV145Talbdet2wwds_43_tfalbruniuti_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A5806AlbREnt2 ,
                                          java.util.Date A49AlbRFen ,
                                          java.util.Date A4606AlbRHEn ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          short A970ProceCod ,
                                          String A971ProceNom ,
                                          short A840TrnCod ,
                                          String A841TrnNom ,
                                          short A1211TipEntCod ,
                                          String A1212TipEntNom ,
                                          String A1291AlbRDes ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          int A52AlbRPieEnt ,
                                          String A50AlbRLoc ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV103Talbdet2wwds_1_filterfulltext )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[40];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.AlbRUniUti, T1.AlbRPieUti, T1.AlbRLoc, T1.AlbRPieEnt, T1.AlbRUniEnt, T1.AlbRDes, T2.TipEntNom, T1.TipEntCod, T3.TrnNom, T1.TrnCod, T4.ProceNom," ;
      scmdbuf += " T1.ProceCod, T1.AlbRefDsc, T1.AlbRef, T5.CliNom, T1.CliCod, T1.AlbRHEn, T1.AlbRFen, T1.AlbREnt2, T1.AlbREnt, T1.AlbRecCod, T1.AlbRReo, T1.AlbRUni FROM ((((TXPALBREC" ;
      scmdbuf += " T1 LEFT JOIN TXPENTRAD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipEntCod = T1.TipEntCod) LEFT JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod)" ;
      scmdbuf += " LEFT JOIN TXPPROCED T4 ON T4.EmprCod = T1.EmprCod AND T4.ProceCod = T1.ProceCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod)" ;
      if ( ! (0==AV104Talbdet2wwds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
      }
      if ( ! (0==AV105Talbdet2wwds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int6[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Talbdet2wwds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV106Talbdet2wwds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Talbdet2wwds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt = ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV109Talbdet2wwds_7_tfalbrent2_sel)==0) && ( ! (GXutil.strcmp("", AV108Talbdet2wwds_6_tfalbrent2)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbREnt2) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV109Talbdet2wwds_7_tfalbrent2_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbREnt2 = ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV110Talbdet2wwds_8_tfalbrfen)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV111Talbdet2wwds_9_tfalbrhen) )
      {
         addWhere(sWhereString, "(T1.AlbRHEn >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV112Talbdet2wwds_10_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV113Talbdet2wwds_11_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Talbdet2wwds_13_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV114Talbdet2wwds_12_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Talbdet2wwds_13_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T5.CliNom = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Talbdet2wwds_15_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV116Talbdet2wwds_14_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Talbdet2wwds_15_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Talbdet2wwds_17_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV118Talbdet2wwds_16_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Talbdet2wwds_17_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (0==AV120Talbdet2wwds_18_tfprocecod) )
      {
         addWhere(sWhereString, "(T1.ProceCod >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV121Talbdet2wwds_19_tfprocecod_to) )
      {
         addWhere(sWhereString, "(T1.ProceCod <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Talbdet2wwds_21_tfprocenom_sel)==0) && ( ! (GXutil.strcmp("", AV122Talbdet2wwds_20_tfprocenom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProceNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Talbdet2wwds_21_tfprocenom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProceNom = ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV124Talbdet2wwds_22_tftrncod) )
      {
         addWhere(sWhereString, "(T1.TrnCod >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV125Talbdet2wwds_23_tftrncod_to) )
      {
         addWhere(sWhereString, "(T1.TrnCod <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Talbdet2wwds_25_tftrnnom_sel)==0) && ( ! (GXutil.strcmp("", AV126Talbdet2wwds_24_tftrnnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.TrnNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Talbdet2wwds_25_tftrnnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.TrnNom = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV128Talbdet2wwds_26_tftipentcod) )
      {
         addWhere(sWhereString, "(T1.TipEntCod >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV129Talbdet2wwds_27_tftipentcod_to) )
      {
         addWhere(sWhereString, "(T1.TipEntCod <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Talbdet2wwds_29_tftipentnom_sel)==0) && ( ! (GXutil.strcmp("", AV130Talbdet2wwds_28_tftipentnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.TipEntNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Talbdet2wwds_29_tftipentnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.TipEntNom = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Talbdet2wwds_31_tfalbrdes_sel)==0) && ( ! (GXutil.strcmp("", AV132Talbdet2wwds_30_tfalbrdes)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRDes) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Talbdet2wwds_31_tfalbrdes_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRDes = ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV134Talbdet2wwds_32_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Talbdet2wwds_33_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( AV136Talbdet2wwds_34_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV136Talbdet2wwds_34_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV137Talbdet2wwds_35_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV138Talbdet2wwds_36_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Talbdet2wwds_38_tfalbrloc_sel)==0) && ( ! (GXutil.strcmp("", AV139Talbdet2wwds_37_tfalbrloc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRLoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Talbdet2wwds_38_tfalbrloc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRLoc = ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( AV141Talbdet2wwds_39_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV141Talbdet2wwds_39_tfalbrreo_sels, "T1.AlbRReo IN (", ")")+")");
      }
      if ( ! (0==AV142Talbdet2wwds_40_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (0==AV143Talbdet2wwds_41_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV144Talbdet2wwds_42_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV145Talbdet2wwds_43_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbREnt2 DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRHEn DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T5.CliNom" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T5.CliNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.ProceCod" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.ProceCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T4.ProceNom" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T4.ProceNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TrnCod" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TrnCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.TrnNom" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.TrnNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipEntCod" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipEntCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.TipEntNom" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.TipEntNom DESC" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRDes" ;
      }
      else if ( ( AV28OrderedBy == 16 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRDes DESC" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV28OrderedBy == 17 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV28OrderedBy == 18 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV28OrderedBy == 19 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc" ;
      }
      else if ( ( AV28OrderedBy == 20 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRLoc DESC" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRReo" ;
      }
      else if ( ( AV28OrderedBy == 21 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRReo DESC" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV28OrderedBy == 22 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV28OrderedBy == 23 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV28OrderedBy == 23 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbRUniUti DESC" ;
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
                  return conditional_P086G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , (java.math.BigDecimal)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (java.math.BigDecimal)dynConstraints[44] , (java.math.BigDecimal)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).intValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , ((Number) dynConstraints[55]).shortValue() , (String)dynConstraints[56] , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , ((Number) dynConstraints[59]).shortValue() , (String)dynConstraints[60] , (String)dynConstraints[61] , (java.math.BigDecimal)dynConstraints[62] , ((Number) dynConstraints[63]).intValue() , (String)dynConstraints[64] , ((Number) dynConstraints[65]).intValue() , (java.math.BigDecimal)dynConstraints[66] , ((Number) dynConstraints[67]).shortValue() , ((Boolean) dynConstraints[68]).booleanValue() , (String)dynConstraints[69] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P086G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 25);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 26);
               ((String[]) buf[20])[0] = rslt.getString(15, 16);
               ((String[]) buf[21])[0] = rslt.getString(16, 30);
               ((int[]) buf[22])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(19);
               ((String[]) buf[26])[0] = rslt.getString(20, 20);
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
               ((int[]) buf[28])[0] = rslt.getInt(22);
               ((String[]) buf[29])[0] = rslt.getString(23, 2);
               ((String[]) buf[30])[0] = rslt.getString(24, 1);
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
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[47], false);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[57]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 25);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 25);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 20);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 20);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 10);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 10);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               return;
      }
   }

}

