package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadesdelcontiexportcsv_impl extends GXWebProcedure
{
   public consultadesdelcontiexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadesdeLcontiExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ConsultadesdeLcontiColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.ConsultadesdeLcontiColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "M", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "R", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "P", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre Cliente", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Articulo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tip. Art.", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Color", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Numero", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Tc", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs Tot", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts Tot", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Volumen", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Ensayo", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Disp Cli", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nº Adi", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicial", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Añadidas", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kg", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mt", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV125Formulaciontinte_consultadesdelcontids_1_tfestfeccier = AV61TFEstFecCier ;
      AV126Formulaciontinte_consultadesdelcontids_2_tfesttinnr = AV63TFEstTinNr ;
      AV127Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to = AV64TFEstTinNr_To ;
      AV128Formulaciontinte_consultadesdelcontids_4_tfbarcodtin = AV116TFBarCodTin ;
      AV129Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to = AV117TFBarCodTin_To ;
      AV130Formulaciontinte_consultadesdelcontids_6_tfbarreotin = AV118TFBarReoTin ;
      AV131Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to = AV119TFBarReoTin_To ;
      AV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin = AV120TFBarParTin ;
      AV133Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = AV121TFBarParTin_Sel ;
      AV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = AV67TFBarAgrLot ;
      AV135Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = AV68TFBarAgrLot_Sel ;
      AV136Formulaciontinte_consultadesdelcontids_12_tfclicod = AV69TFCliCod ;
      AV137Formulaciontinte_consultadesdelcontids_13_tfclicod_to = AV70TFCliCod_To ;
      AV138Formulaciontinte_consultadesdelcontids_14_tfclinom = AV71TFCliNom ;
      AV139Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = AV72TFCliNom_Sel ;
      AV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin = AV73TFBarSerTin ;
      AV141Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = AV74TFBarSerTin_Sel ;
      AV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin = AV75TFBarDscTin ;
      AV143Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = AV76TFBarDscTin_Sel ;
      AV144Formulaciontinte_consultadesdelcontids_20_tfbararttin = AV99TFBarArtTin ;
      AV145Formulaciontinte_consultadesdelcontids_21_tfbararttin_to = AV100TFBarArtTin_To ;
      AV146Formulaciontinte_consultadesdelcontids_22_tfbararttind = AV101TFBarArtTinD ;
      AV147Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = AV102TFBarArtTinD_Sel ;
      AV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = AV77TFBarColNoT ;
      AV149Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = AV78TFBarColNoT_Sel ;
      AV150Formulaciontinte_consultadesdelcontids_26_tfbarcolnut = AV79TFBarColNuT ;
      AV151Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to = AV80TFBarColNuT_To ;
      AV152Formulaciontinte_consultadesdelcontids_28_tfbartipcot = AV81TFBarTipCoT ;
      AV153Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to = AV82TFBarTipCoT_To ;
      AV154Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = AV83TFBarKgmTin ;
      AV155Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = AV84TFBarKgmTin_To ;
      AV156Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = AV85TFBarKgsTt ;
      AV157Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = AV86TFBarKgsTt_To ;
      AV158Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = AV87TFBarMtrTin ;
      AV159Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = AV88TFBarMtrTin_To ;
      AV160Formulaciontinte_consultadesdelcontids_36_tfbarnumtint = AV106TFBarNumtint ;
      AV161Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to = AV107TFBarNumtint_To ;
      AV162Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = AV89TFBarMtsTt ;
      AV163Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = AV90TFBarMtsTt_To ;
      AV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = AV91TFBarMaqTin ;
      AV165Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = AV92TFBarMaqTin_Sel ;
      AV166Formulaciontinte_consultadesdelcontids_42_tfbarvoltin = AV93TFBarVolTin ;
      AV167Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to = AV94TFBarVolTin_To ;
      AV168Formulaciontinte_consultadesdelcontids_44_tfbarnumeny = AV103TFBarNumEny ;
      AV169Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to = AV104TFBarNumEny_To ;
      AV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli = AV95TFBarDispCli ;
      AV171Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = AV96TFBarDispCli_Sel ;
      AV172Formulaciontinte_consultadesdelcontids_48_tfbarnumana = AV97TFBarNumAna ;
      AV173Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to = AV98TFBarNumAna_To ;
      AV174Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = AV112TFCosteInicial ;
      AV175Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = AV113TFCosteInicial_To ;
      AV176Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = AV114TFCosteAnyadidas ;
      AV177Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = AV115TFCosteAnyadidas_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV125Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                           Short.valueOf(AV126Formulaciontinte_consultadesdelcontids_2_tfesttinnr) ,
                                           Short.valueOf(AV127Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) ,
                                           Integer.valueOf(AV128Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) ,
                                           Integer.valueOf(AV129Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) ,
                                           Byte.valueOf(AV130Formulaciontinte_consultadesdelcontids_6_tfbarreotin) ,
                                           Byte.valueOf(AV131Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) ,
                                           AV133Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                           AV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                           AV135Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                           AV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                           Integer.valueOf(AV136Formulaciontinte_consultadesdelcontids_12_tfclicod) ,
                                           Integer.valueOf(AV137Formulaciontinte_consultadesdelcontids_13_tfclicod_to) ,
                                           AV139Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                           AV138Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                           AV141Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                           AV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                           AV143Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                           AV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                           Short.valueOf(AV144Formulaciontinte_consultadesdelcontids_20_tfbararttin) ,
                                           Short.valueOf(AV145Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) ,
                                           AV149Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                           AV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                           Integer.valueOf(AV150Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) ,
                                           Integer.valueOf(AV151Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) ,
                                           Byte.valueOf(AV152Formulaciontinte_consultadesdelcontids_28_tfbartipcot) ,
                                           Byte.valueOf(AV153Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) ,
                                           AV154Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                           AV155Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                           AV156Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                           AV157Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                           AV158Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                           AV159Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                           Short.valueOf(AV160Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) ,
                                           Short.valueOf(AV161Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) ,
                                           AV162Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                           AV163Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                           AV165Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                           AV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                           Integer.valueOf(AV166Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) ,
                                           Integer.valueOf(AV167Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) ,
                                           AV171Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                           AV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                           Short.valueOf(AV172Formulaciontinte_consultadesdelcontids_48_tfbarnumana) ,
                                           Short.valueOf(AV173Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) ,
                                           AV174Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                           AV175Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                           AV176Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                           AV177Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                           Byte.valueOf(AV36BarCodReoP) ,
                                           A13759EstFecCier ,
                                           Short.valueOf(A1929EstTinNr) ,
                                           Integer.valueOf(A1933BarCodTin) ,
                                           Byte.valueOf(A1934BarReoTin) ,
                                           A1935BarParTin ,
                                           A2316BarAgrLot ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A1936BarSerTin ,
                                           A1937BarDscTin ,
                                           Short.valueOf(A1939BarArtTin) ,
                                           A1940BarColNoT ,
                                           Integer.valueOf(A1941BarColNuT) ,
                                           Byte.valueOf(A1942BarTipCoT) ,
                                           A1947BarKgmTin ,
                                           A8563BarKgsTt ,
                                           A1948BarMtrTin ,
                                           A12993BarMtsTt ,
                                           A1945BarMaqTin ,
                                           Integer.valueOf(A1946BarVolTin) ,
                                           A11762BarDispCli ,
                                           Short.valueOf(A3650BarNumAna) ,
                                           A3654BarCosPD ,
                                           A3658BarCosPA ,
                                           A3705BarCosCol ,
                                           A3656BarCosAD ,
                                           A3657BarCosAA ,
                                           A3706BarCosAnc ,
                                           Short.valueOf(AV50OrderedBy) ,
                                           Boolean.valueOf(AV51OrderedDsc) ,
                                           AV147Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                           AV146Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                           A13962BarArtTinD ,
                                           Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_44_tfbarnumeny) ,
                                           Integer.valueOf(A13967BarNumEny) ,
                                           Integer.valueOf(AV169Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to) ,
                                           AV29Fec1 ,
                                           AV30Fec3 ,
                                           Integer.valueOf(AV31PCliCod) ,
                                           Integer.valueOf(AV32CliCodP) ,
                                           Integer.valueOf(AV33PBarCod) ,
                                           Integer.valueOf(AV34Barcodp) ,
                                           Byte.valueOf(AV35PBarCodReo) ,
                                           AV37PBarCodPar ,
                                           AV38BarCodParP ,
                                           AV39PSerie ,
                                           AV40SerieP ,
                                           AV41PColor ,
                                           AV42ColorP ,
                                           Integer.valueOf(AV43PColNum) ,
                                           Integer.valueOf(AV44ColNumP) ,
                                           AV45DispCli1 ,
                                           AV46DispCli3 ,
                                           A6634BarRecAcb ,
                                           AV47HreRacab ,
                                           AV48MaqCodi ,
                                           AV49MaqCod3 ,
                                           Short.valueOf(AV108TipArtCodfrom) ,
                                           Short.valueOf(AV109TipArtCodto) ,
                                           AV110SoloAd ,
                                           AV111CorAdi ,
                                           A14200CosteAnyad ,
                                           AV28Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV146Formulaciontinte_consultadesdelcontids_22_tfbararttind = GXutil.padr( GXutil.rtrim( AV146Formulaciontinte_consultadesdelcontids_22_tfbararttind), 30, "%") ;
      lV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin = GXutil.padr( GXutil.rtrim( AV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin), 1, "%") ;
      lV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = GXutil.padr( GXutil.rtrim( AV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot), 10, "%") ;
      lV138Formulaciontinte_consultadesdelcontids_14_tfclinom = GXutil.padr( GXutil.rtrim( AV138Formulaciontinte_consultadesdelcontids_14_tfclinom), 30, "%") ;
      lV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin = GXutil.padr( GXutil.rtrim( AV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin), 16, "%") ;
      lV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin = GXutil.padr( GXutil.rtrim( AV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin), 26, "%") ;
      lV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = GXutil.padr( GXutil.rtrim( AV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot), 13, "%") ;
      lV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = GXutil.padr( GXutil.rtrim( AV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin), 6, "%") ;
      lV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli = GXutil.padr( GXutil.rtrim( AV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli), 20, "%") ;
      /* Using cursor P08YJ2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, AV147Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV146Formulaciontinte_consultadesdelcontids_22_tfbararttind, lV146Formulaciontinte_consultadesdelcontids_22_tfbararttind, AV147Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, AV147Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel, Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV168Formulaciontinte_consultadesdelcontids_44_tfbarnumeny), Integer.valueOf(AV169Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), Integer.valueOf(AV169Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to), AV29Fec1, AV30Fec3, Integer.valueOf(AV31PCliCod), Integer.valueOf(AV32CliCodP), Integer.valueOf(AV33PBarCod), Integer.valueOf(AV34Barcodp), Byte.valueOf(AV35PBarCodReo), AV37PBarCodPar, AV38BarCodParP, AV39PSerie, AV40SerieP, AV41PColor, AV42ColorP, Integer.valueOf(AV43PColNum), Integer.valueOf(AV44ColNumP), AV45DispCli1, AV46DispCli3, AV47HreRacab, AV47HreRacab, AV48MaqCodi, AV49MaqCod3, Short.valueOf(AV108TipArtCodfrom), Short.valueOf(AV109TipArtCodto), AV110SoloAd, AV110SoloAd, AV111CorAdi, AV110SoloAd, AV111CorAdi, AV125Formulaciontinte_consultadesdelcontids_1_tfestfeccier, Short.valueOf(AV126Formulaciontinte_consultadesdelcontids_2_tfesttinnr), Short.valueOf(AV127Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to), Integer.valueOf(AV128Formulaciontinte_consultadesdelcontids_4_tfbarcodtin), Integer.valueOf(AV129Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to), Byte.valueOf(AV130Formulaciontinte_consultadesdelcontids_6_tfbarreotin), Byte.valueOf(AV131Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to), lV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin, AV133Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel, lV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot, AV135Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel, Integer.valueOf(AV136Formulaciontinte_consultadesdelcontids_12_tfclicod), Integer.valueOf(AV137Formulaciontinte_consultadesdelcontids_13_tfclicod_to), lV138Formulaciontinte_consultadesdelcontids_14_tfclinom, AV139Formulaciontinte_consultadesdelcontids_15_tfclinom_sel, lV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin, AV141Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel, lV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin, AV143Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel, Short.valueOf(AV144Formulaciontinte_consultadesdelcontids_20_tfbararttin), Short.valueOf(AV145Formulaciontinte_consultadesdelcontids_21_tfbararttin_to), lV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot, AV149Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel, Integer.valueOf(AV150Formulaciontinte_consultadesdelcontids_26_tfbarcolnut), Integer.valueOf(AV151Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to), Byte.valueOf(AV152Formulaciontinte_consultadesdelcontids_28_tfbartipcot), Byte.valueOf(AV153Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to), AV154Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin, AV155Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to, AV156Formulaciontinte_consultadesdelcontids_32_tfbarkgstt, AV157Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to, AV158Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin, AV159Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to, Short.valueOf(AV160Formulaciontinte_consultadesdelcontids_36_tfbarnumtint), Short.valueOf(AV161Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to), AV162Formulaciontinte_consultadesdelcontids_38_tfbarmtstt, AV163Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to, lV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin, AV165Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel, Integer.valueOf(AV166Formulaciontinte_consultadesdelcontids_42_tfbarvoltin), Integer.valueOf(AV167Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to), lV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli, AV171Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel, Short.valueOf(AV172Formulaciontinte_consultadesdelcontids_48_tfbarnumana), Short.valueOf(AV173Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to), AV174Formulaciontinte_consultadesdelcontids_50_tfcosteinicial, AV175Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to, AV176Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas, AV177Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to, Byte.valueOf(AV36BarCodReoP)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A6634BarRecAcb = P08YJ2_A6634BarRecAcb[0] ;
         n6634BarRecAcb = P08YJ2_n6634BarRecAcb[0] ;
         A396EmprCod = P08YJ2_A396EmprCod[0] ;
         A14200CosteAnyad = P08YJ2_A14200CosteAnyad[0] ;
         A3650BarNumAna = P08YJ2_A3650BarNumAna[0] ;
         n3650BarNumAna = P08YJ2_n3650BarNumAna[0] ;
         A11762BarDispCli = P08YJ2_A11762BarDispCli[0] ;
         n11762BarDispCli = P08YJ2_n11762BarDispCli[0] ;
         A1946BarVolTin = P08YJ2_A1946BarVolTin[0] ;
         n1946BarVolTin = P08YJ2_n1946BarVolTin[0] ;
         A1945BarMaqTin = P08YJ2_A1945BarMaqTin[0] ;
         n1945BarMaqTin = P08YJ2_n1945BarMaqTin[0] ;
         A12993BarMtsTt = P08YJ2_A12993BarMtsTt[0] ;
         n12993BarMtsTt = P08YJ2_n12993BarMtsTt[0] ;
         A1948BarMtrTin = P08YJ2_A1948BarMtrTin[0] ;
         n1948BarMtrTin = P08YJ2_n1948BarMtrTin[0] ;
         A8563BarKgsTt = P08YJ2_A8563BarKgsTt[0] ;
         n8563BarKgsTt = P08YJ2_n8563BarKgsTt[0] ;
         A1947BarKgmTin = P08YJ2_A1947BarKgmTin[0] ;
         n1947BarKgmTin = P08YJ2_n1947BarKgmTin[0] ;
         A1942BarTipCoT = P08YJ2_A1942BarTipCoT[0] ;
         n1942BarTipCoT = P08YJ2_n1942BarTipCoT[0] ;
         A1941BarColNuT = P08YJ2_A1941BarColNuT[0] ;
         n1941BarColNuT = P08YJ2_n1941BarColNuT[0] ;
         A1940BarColNoT = P08YJ2_A1940BarColNoT[0] ;
         n1940BarColNoT = P08YJ2_n1940BarColNoT[0] ;
         A1939BarArtTin = P08YJ2_A1939BarArtTin[0] ;
         n1939BarArtTin = P08YJ2_n1939BarArtTin[0] ;
         A1937BarDscTin = P08YJ2_A1937BarDscTin[0] ;
         n1937BarDscTin = P08YJ2_n1937BarDscTin[0] ;
         A1936BarSerTin = P08YJ2_A1936BarSerTin[0] ;
         n1936BarSerTin = P08YJ2_n1936BarSerTin[0] ;
         A279CliNom = P08YJ2_A279CliNom[0] ;
         A252CliCod = P08YJ2_A252CliCod[0] ;
         A1929EstTinNr = P08YJ2_A1929EstTinNr[0] ;
         A13759EstFecCier = P08YJ2_A13759EstFecCier[0] ;
         A3656BarCosAD = P08YJ2_A3656BarCosAD[0] ;
         n3656BarCosAD = P08YJ2_n3656BarCosAD[0] ;
         A3657BarCosAA = P08YJ2_A3657BarCosAA[0] ;
         n3657BarCosAA = P08YJ2_n3657BarCosAA[0] ;
         A3706BarCosAnc = P08YJ2_A3706BarCosAnc[0] ;
         n3706BarCosAnc = P08YJ2_n3706BarCosAnc[0] ;
         A13967BarNumEny = P08YJ2_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YJ2_n13967BarNumEny[0] ;
         A13962BarArtTinD = P08YJ2_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YJ2_n13962BarArtTinD[0] ;
         A1935BarParTin = P08YJ2_A1935BarParTin[0] ;
         n1935BarParTin = P08YJ2_n1935BarParTin[0] ;
         A1934BarReoTin = P08YJ2_A1934BarReoTin[0] ;
         n1934BarReoTin = P08YJ2_n1934BarReoTin[0] ;
         A1933BarCodTin = P08YJ2_A1933BarCodTin[0] ;
         n1933BarCodTin = P08YJ2_n1933BarCodTin[0] ;
         A2316BarAgrLot = P08YJ2_A2316BarAgrLot[0] ;
         n2316BarAgrLot = P08YJ2_n2316BarAgrLot[0] ;
         A3705BarCosCol = P08YJ2_A3705BarCosCol[0] ;
         n3705BarCosCol = P08YJ2_n3705BarCosCol[0] ;
         A3658BarCosPA = P08YJ2_A3658BarCosPA[0] ;
         n3658BarCosPA = P08YJ2_n3658BarCosPA[0] ;
         A3654BarCosPD = P08YJ2_A3654BarCosPD[0] ;
         n3654BarCosPD = P08YJ2_n3654BarCosPD[0] ;
         A3646EstTinAny = P08YJ2_A3646EstTinAny[0] ;
         A3647EstTinMes = P08YJ2_A3647EstTinMes[0] ;
         A3648EstTinDia = P08YJ2_A3648EstTinDia[0] ;
         A13962BarArtTinD = P08YJ2_A13962BarArtTinD[0] ;
         n13962BarArtTinD = P08YJ2_n13962BarArtTinD[0] ;
         A279CliNom = P08YJ2_A279CliNom[0] ;
         A13967BarNumEny = P08YJ2_A13967BarNumEny[0] ;
         n13967BarNumEny = P08YJ2_n13967BarNumEny[0] ;
         A14199CosteInici = A3654BarCosPD.add(A3658BarCosPA).add(A3705BarCosCol) ;
         if ( ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 1, 8), ".").doubleValue() == A1933BarCodTin ) && ( CommonUtil.decimalVal( GXutil.substring( A2316BarAgrLot, 9, 1), ".").doubleValue() == A1934BarReoTin ) && ( GXutil.strcmp(GXutil.substring( A2316BarAgrLot, 10, 1), A1935BarParTin) == 0 ) )
         {
            A13975BarNumtint = (short)(1) ;
         }
         else
         {
            if ( true )
            {
               A13975BarNumtint = (short)(0) ;
            }
            else
            {
               A13975BarNumtint = (short)(0) ;
            }
         }
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
            AV14TextFileLine += localUtil.dtoc( A13759EstFecCier, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1929EstTinNr, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV105Marca = ((A1933BarCodTin==AV178Barcod)&&(A1934BarReoTin==AV179Barcodreo)&&(GXutil.strcmp(A1935BarParTin, AV180Barcodpar)==0) ? "*" : " ") ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV105Marca, ";", ","), GXv_char3) ;
            consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1933BarCodTin, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1934BarReoTin, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1935BarParTin, ";", ","), GXv_char3) ;
            consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A2316BarAgrLot, ";", ","), GXv_char3) ;
            consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A252CliCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A279CliNom, ";", ","), GXv_char3) ;
            consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1936BarSerTin, ";", ","), GXv_char3) ;
            consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1937BarDscTin, ";", ","), GXv_char3) ;
            consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1939BarArtTin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13962BarArtTinD, ";", ","), GXv_char3) ;
            consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1940BarColNoT, ";", ","), GXv_char3) ;
            consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1941BarColNuT, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1942BarTipCoT, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1947BarKgmTin, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A8563BarKgsTt, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1948BarMtrTin, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13975BarNumtint, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A12993BarMtsTt, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A1945BarMaqTin, ";", ","), GXv_char3) ;
            consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1946BarVolTin, 5, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A13967BarNumEny, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A11762BarDispCli, ";", ","), GXv_char3) ;
            consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A3650BarNumAna, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14199CosteInici, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A14200CosteAnyad, 10, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV56CosteKg = ((A8563BarKgsTt.doubleValue()>0) ? (A14199CosteInici.add(A14200CosteAnyad)).divide(A8563BarKgsTt, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV56CosteKg, 11, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV57CosteMT = ((A1948BarMtrTin.doubleValue()>0) ? (A14199CosteInici.add(A14200CosteAnyad)).divide(A1948BarMtrTin, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV57CosteMT, 11, 5) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultadesdeLcontiExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstFecCier", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "EstTinNr", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Marca", "", "M", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarCodTin", "", "Nº Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarReoTin", "", "R", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarParTin", "", "P", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarAgrLot", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliCod", "", "Cliente", false, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CliNom", "", "Nombre Cliente", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarSerTin", "", "Articulo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarDscTin", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarArtTin", "", "Tip. Art.", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarArtTinD", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarColNoT", "", "Color", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarColNuT", "", "Numero", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarTipCoT", "", "Tc", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarKgmTin", "", "Kgs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarKgsTt", "", "Kgs Tot", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarMtrTin", "", "Mts", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNumtint", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarMtsTt", "", "Mts Tot", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarMaqTin", "", "Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarVolTin", "", "Volumen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNumEny", "", "Nº Ensayo", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarDispCli", "", "Disp Cli", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNumAna", "", "Nº Adi", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CosteInicial", "Coste", "Inicial", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "CosteAnyadidas", "Coste", "Añadidas", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&CosteKg", "Coste", "Kg", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&CosteMT", "Coste", "Mt", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.ConsultadesdeLcontiColumnsSelector", GXv_char3) ;
      consultadesdelcontiexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.ConsultadesdeLcontiGridState"), "") == 0 )
      {
         AV59GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.ConsultadesdeLcontiGridState"), null, null);
      }
      else
      {
         AV59GridState.fromxml(AV19Session.getValue("FormulacionTinte.ConsultadesdeLcontiGridState"), null, null);
      }
      AV50OrderedBy = AV59GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV51OrderedDsc = AV59GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV181GXV1 = 1 ;
      while ( AV181GXV1 <= AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV60GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV59GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV181GXV1));
         if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTFECCIER") == 0 )
         {
            AV61TFEstFecCier = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFESTTINNR") == 0 )
         {
            AV63TFEstTinNr = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFEstTinNr_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODTIN") == 0 )
         {
            AV116TFBarCodTin = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV117TFBarCodTin_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARREOTIN") == 0 )
         {
            AV118TFBarReoTin = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV119TFBarReoTin_To = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPARTIN") == 0 )
         {
            AV120TFBarParTin = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPARTIN_SEL") == 0 )
         {
            AV121TFBarParTin_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRLOT") == 0 )
         {
            AV67TFBarAgrLot = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARAGRLOT_SEL") == 0 )
         {
            AV68TFBarAgrLot_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV69TFCliCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV70TFCliCod_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV71TFCliNom = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV72TFCliNom_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERTIN") == 0 )
         {
            AV73TFBarSerTin = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERTIN_SEL") == 0 )
         {
            AV74TFBarSerTin_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDSCTIN") == 0 )
         {
            AV75TFBarDscTin = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDSCTIN_SEL") == 0 )
         {
            AV76TFBarDscTin_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIN") == 0 )
         {
            AV99TFBarArtTin = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV100TFBarArtTin_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIND") == 0 )
         {
            AV101TFBarArtTinD = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARARTTIND_SEL") == 0 )
         {
            AV102TFBarArtTinD_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOT") == 0 )
         {
            AV77TFBarColNoT = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOT_SEL") == 0 )
         {
            AV78TFBarColNoT_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUT") == 0 )
         {
            AV79TFBarColNuT = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV80TFBarColNuT_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIPCOT") == 0 )
         {
            AV81TFBarTipCoT = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV82TFBarTipCoT_To = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGMTIN") == 0 )
         {
            AV83TFBarKgmTin = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV84TFBarKgmTin_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGSTT") == 0 )
         {
            AV85TFBarKgsTt = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV86TFBarKgsTt_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTRTIN") == 0 )
         {
            AV87TFBarMtrTin = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV88TFBarMtrTin_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMTINT") == 0 )
         {
            AV106TFBarNumtint = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV107TFBarNumtint_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTSTT") == 0 )
         {
            AV89TFBarMtsTt = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV90TFBarMtsTt_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQTIN") == 0 )
         {
            AV91TFBarMaqTin = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMAQTIN_SEL") == 0 )
         {
            AV92TFBarMaqTin_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARVOLTIN") == 0 )
         {
            AV93TFBarVolTin = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV94TFBarVolTin_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMENY") == 0 )
         {
            AV103TFBarNumEny = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV104TFBarNumEny_To = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISPCLI") == 0 )
         {
            AV95TFBarDispCli = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISPCLI_SEL") == 0 )
         {
            AV96TFBarDispCli_Sel = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNUMANA") == 0 )
         {
            AV97TFBarNumAna = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV98TFBarNumAna_To = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTEINICIAL") == 0 )
         {
            AV112TFCosteInicial = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV113TFCosteInicial_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOSTEANYADIDAS") == 0 )
         {
            AV114TFCosteAnyadidas = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV115TFCosteAnyadidas_To = CommonUtil.decimalVal( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC1") == 0 )
         {
            AV29Fec1 = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&FEC3") == 0 )
         {
            AV30Fec3 = localUtil.ctod( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCLICOD") == 0 )
         {
            AV31PCliCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICODP") == 0 )
         {
            AV32CliCodP = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCOD") == 0 )
         {
            AV33PBarCod = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODP") == 0 )
         {
            AV34Barcodp = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODREO") == 0 )
         {
            AV35PBarCodReo = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREOP") == 0 )
         {
            AV36BarCodReoP = (byte)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PBARCODPAR") == 0 )
         {
            AV37PBarCodPar = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPARP") == 0 )
         {
            AV38BarCodParP = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PSERIE") == 0 )
         {
            AV39PSerie = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SERIEP") == 0 )
         {
            AV40SerieP = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLOR") == 0 )
         {
            AV41PColor = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLORP") == 0 )
         {
            AV42ColorP = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PCOLNUM") == 0 )
         {
            AV43PColNum = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&COLNUMP") == 0 )
         {
            AV44ColNumP = (int)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI1") == 0 )
         {
            AV45DispCli1 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&DISPCLI3") == 0 )
         {
            AV46DispCli3 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HRERACAB") == 0 )
         {
            AV47HreRacab = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCODI") == 0 )
         {
            AV48MaqCodi = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD3") == 0 )
         {
            AV49MaqCod3 = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCODFROM") == 0 )
         {
            AV108TipArtCodfrom = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&TIPARTCODTO") == 0 )
         {
            AV109TipArtCodto = (short)(GXutil.lval( AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&SOLOAD") == 0 )
         {
            AV110SoloAd = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CORADI") == 0 )
         {
            AV111CorAdi = AV60GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV181GXV1 = (int)(AV181GXV1+1) ;
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
      A13759EstFecCier = GXutil.nullDate() ;
      A1935BarParTin = "" ;
      A2316BarAgrLot = "" ;
      A279CliNom = "" ;
      A1936BarSerTin = "" ;
      A1937BarDscTin = "" ;
      A13962BarArtTinD = "" ;
      A1940BarColNoT = "" ;
      A1947BarKgmTin = DecimalUtil.ZERO ;
      A8563BarKgsTt = DecimalUtil.ZERO ;
      A1948BarMtrTin = DecimalUtil.ZERO ;
      A12993BarMtsTt = DecimalUtil.ZERO ;
      A1945BarMaqTin = "" ;
      A11762BarDispCli = "" ;
      A14199CosteInici = DecimalUtil.ZERO ;
      A14200CosteAnyad = DecimalUtil.ZERO ;
      AV125Formulaciontinte_consultadesdelcontids_1_tfestfeccier = GXutil.nullDate() ;
      AV61TFEstFecCier = GXutil.nullDate() ;
      AV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin = "" ;
      AV120TFBarParTin = "" ;
      AV133Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel = "" ;
      AV121TFBarParTin_Sel = "" ;
      AV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = "" ;
      AV67TFBarAgrLot = "" ;
      AV135Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel = "" ;
      AV68TFBarAgrLot_Sel = "" ;
      AV138Formulaciontinte_consultadesdelcontids_14_tfclinom = "" ;
      AV71TFCliNom = "" ;
      AV139Formulaciontinte_consultadesdelcontids_15_tfclinom_sel = "" ;
      AV72TFCliNom_Sel = "" ;
      AV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin = "" ;
      AV73TFBarSerTin = "" ;
      AV141Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel = "" ;
      AV74TFBarSerTin_Sel = "" ;
      AV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin = "" ;
      AV75TFBarDscTin = "" ;
      AV143Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel = "" ;
      AV76TFBarDscTin_Sel = "" ;
      AV146Formulaciontinte_consultadesdelcontids_22_tfbararttind = "" ;
      AV101TFBarArtTinD = "" ;
      AV147Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel = "" ;
      AV102TFBarArtTinD_Sel = "" ;
      AV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = "" ;
      AV77TFBarColNoT = "" ;
      AV149Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel = "" ;
      AV78TFBarColNoT_Sel = "" ;
      AV154Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin = DecimalUtil.ZERO ;
      AV83TFBarKgmTin = DecimalUtil.ZERO ;
      AV155Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to = DecimalUtil.ZERO ;
      AV84TFBarKgmTin_To = DecimalUtil.ZERO ;
      AV156Formulaciontinte_consultadesdelcontids_32_tfbarkgstt = DecimalUtil.ZERO ;
      AV85TFBarKgsTt = DecimalUtil.ZERO ;
      AV157Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to = DecimalUtil.ZERO ;
      AV86TFBarKgsTt_To = DecimalUtil.ZERO ;
      AV158Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin = DecimalUtil.ZERO ;
      AV87TFBarMtrTin = DecimalUtil.ZERO ;
      AV159Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to = DecimalUtil.ZERO ;
      AV88TFBarMtrTin_To = DecimalUtil.ZERO ;
      AV162Formulaciontinte_consultadesdelcontids_38_tfbarmtstt = DecimalUtil.ZERO ;
      AV89TFBarMtsTt = DecimalUtil.ZERO ;
      AV163Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to = DecimalUtil.ZERO ;
      AV90TFBarMtsTt_To = DecimalUtil.ZERO ;
      AV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = "" ;
      AV91TFBarMaqTin = "" ;
      AV165Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel = "" ;
      AV92TFBarMaqTin_Sel = "" ;
      AV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli = "" ;
      AV95TFBarDispCli = "" ;
      AV171Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel = "" ;
      AV96TFBarDispCli_Sel = "" ;
      AV174Formulaciontinte_consultadesdelcontids_50_tfcosteinicial = DecimalUtil.ZERO ;
      AV112TFCosteInicial = DecimalUtil.ZERO ;
      AV175Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to = DecimalUtil.ZERO ;
      AV113TFCosteInicial_To = DecimalUtil.ZERO ;
      AV176Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas = DecimalUtil.ZERO ;
      AV114TFCosteAnyadidas = DecimalUtil.ZERO ;
      AV177Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to = DecimalUtil.ZERO ;
      AV115TFCosteAnyadidas_To = DecimalUtil.ZERO ;
      lV146Formulaciontinte_consultadesdelcontids_22_tfbararttind = "" ;
      scmdbuf = "" ;
      lV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin = "" ;
      lV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot = "" ;
      lV138Formulaciontinte_consultadesdelcontids_14_tfclinom = "" ;
      lV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin = "" ;
      lV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin = "" ;
      lV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot = "" ;
      lV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin = "" ;
      lV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli = "" ;
      A3654BarCosPD = DecimalUtil.ZERO ;
      A3658BarCosPA = DecimalUtil.ZERO ;
      A3705BarCosCol = DecimalUtil.ZERO ;
      A3656BarCosAD = DecimalUtil.ZERO ;
      A3657BarCosAA = DecimalUtil.ZERO ;
      A3706BarCosAnc = DecimalUtil.ZERO ;
      AV29Fec1 = GXutil.nullDate() ;
      AV30Fec3 = GXutil.nullDate() ;
      AV37PBarCodPar = "" ;
      AV38BarCodParP = "" ;
      AV39PSerie = "" ;
      AV40SerieP = "" ;
      AV41PColor = "" ;
      AV42ColorP = "" ;
      AV45DispCli1 = "" ;
      AV46DispCli3 = "" ;
      A6634BarRecAcb = "" ;
      AV47HreRacab = "" ;
      AV48MaqCodi = "" ;
      AV49MaqCod3 = "" ;
      AV110SoloAd = "" ;
      AV111CorAdi = "" ;
      AV28Emprcod = "" ;
      A396EmprCod = "" ;
      P08YJ2_A494ForSer = new String[] {""} ;
      P08YJ2_A482ForColNom = new String[] {""} ;
      P08YJ2_A483ForColNum = new int[1] ;
      P08YJ2_A831TipColCod = new byte[1] ;
      P08YJ2_A829TipArtCod = new short[1] ;
      P08YJ2_A6634BarRecAcb = new String[] {""} ;
      P08YJ2_n6634BarRecAcb = new boolean[] {false} ;
      P08YJ2_A396EmprCod = new String[] {""} ;
      P08YJ2_A14200CosteAnyad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_A3650BarNumAna = new short[1] ;
      P08YJ2_n3650BarNumAna = new boolean[] {false} ;
      P08YJ2_A11762BarDispCli = new String[] {""} ;
      P08YJ2_n11762BarDispCli = new boolean[] {false} ;
      P08YJ2_A1946BarVolTin = new int[1] ;
      P08YJ2_n1946BarVolTin = new boolean[] {false} ;
      P08YJ2_A1945BarMaqTin = new String[] {""} ;
      P08YJ2_n1945BarMaqTin = new boolean[] {false} ;
      P08YJ2_A12993BarMtsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_n12993BarMtsTt = new boolean[] {false} ;
      P08YJ2_A1948BarMtrTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_n1948BarMtrTin = new boolean[] {false} ;
      P08YJ2_A8563BarKgsTt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_n8563BarKgsTt = new boolean[] {false} ;
      P08YJ2_A1947BarKgmTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_n1947BarKgmTin = new boolean[] {false} ;
      P08YJ2_A1942BarTipCoT = new byte[1] ;
      P08YJ2_n1942BarTipCoT = new boolean[] {false} ;
      P08YJ2_A1941BarColNuT = new int[1] ;
      P08YJ2_n1941BarColNuT = new boolean[] {false} ;
      P08YJ2_A1940BarColNoT = new String[] {""} ;
      P08YJ2_n1940BarColNoT = new boolean[] {false} ;
      P08YJ2_A1939BarArtTin = new short[1] ;
      P08YJ2_n1939BarArtTin = new boolean[] {false} ;
      P08YJ2_A1937BarDscTin = new String[] {""} ;
      P08YJ2_n1937BarDscTin = new boolean[] {false} ;
      P08YJ2_A1936BarSerTin = new String[] {""} ;
      P08YJ2_n1936BarSerTin = new boolean[] {false} ;
      P08YJ2_A279CliNom = new String[] {""} ;
      P08YJ2_A252CliCod = new int[1] ;
      P08YJ2_A1929EstTinNr = new short[1] ;
      P08YJ2_A13759EstFecCier = new java.util.Date[] {GXutil.nullDate()} ;
      P08YJ2_A3656BarCosAD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_n3656BarCosAD = new boolean[] {false} ;
      P08YJ2_A3657BarCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_n3657BarCosAA = new boolean[] {false} ;
      P08YJ2_A3706BarCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_n3706BarCosAnc = new boolean[] {false} ;
      P08YJ2_A13967BarNumEny = new int[1] ;
      P08YJ2_n13967BarNumEny = new boolean[] {false} ;
      P08YJ2_A13962BarArtTinD = new String[] {""} ;
      P08YJ2_n13962BarArtTinD = new boolean[] {false} ;
      P08YJ2_A1935BarParTin = new String[] {""} ;
      P08YJ2_n1935BarParTin = new boolean[] {false} ;
      P08YJ2_A1934BarReoTin = new byte[1] ;
      P08YJ2_n1934BarReoTin = new boolean[] {false} ;
      P08YJ2_A1933BarCodTin = new int[1] ;
      P08YJ2_n1933BarCodTin = new boolean[] {false} ;
      P08YJ2_A2316BarAgrLot = new String[] {""} ;
      P08YJ2_n2316BarAgrLot = new boolean[] {false} ;
      P08YJ2_A3705BarCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_n3705BarCosCol = new boolean[] {false} ;
      P08YJ2_A3658BarCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_n3658BarCosPA = new boolean[] {false} ;
      P08YJ2_A3654BarCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YJ2_n3654BarCosPD = new boolean[] {false} ;
      P08YJ2_A3646EstTinAny = new short[1] ;
      P08YJ2_A3647EstTinMes = new byte[1] ;
      P08YJ2_A3648EstTinDia = new byte[1] ;
      AV105Marca = "" ;
      AV180Barcodpar = "" ;
      AV56CosteKg = DecimalUtil.ZERO ;
      AV57CosteMT = DecimalUtil.ZERO ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV59GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV60GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consultadesdelcontiexportcsv__default(),
         new Object[] {
             new Object[] {
            P08YJ2_A494ForSer, P08YJ2_A482ForColNom, P08YJ2_A483ForColNum, P08YJ2_A831TipColCod, P08YJ2_A829TipArtCod, P08YJ2_A6634BarRecAcb, P08YJ2_n6634BarRecAcb, P08YJ2_A396EmprCod, P08YJ2_A14200CosteAnyad, P08YJ2_A3650BarNumAna,
            P08YJ2_n3650BarNumAna, P08YJ2_A11762BarDispCli, P08YJ2_n11762BarDispCli, P08YJ2_A1946BarVolTin, P08YJ2_n1946BarVolTin, P08YJ2_A1945BarMaqTin, P08YJ2_n1945BarMaqTin, P08YJ2_A12993BarMtsTt, P08YJ2_n12993BarMtsTt, P08YJ2_A1948BarMtrTin,
            P08YJ2_n1948BarMtrTin, P08YJ2_A8563BarKgsTt, P08YJ2_n8563BarKgsTt, P08YJ2_A1947BarKgmTin, P08YJ2_n1947BarKgmTin, P08YJ2_A1942BarTipCoT, P08YJ2_n1942BarTipCoT, P08YJ2_A1941BarColNuT, P08YJ2_n1941BarColNuT, P08YJ2_A1940BarColNoT,
            P08YJ2_n1940BarColNoT, P08YJ2_A1939BarArtTin, P08YJ2_n1939BarArtTin, P08YJ2_A1937BarDscTin, P08YJ2_n1937BarDscTin, P08YJ2_A1936BarSerTin, P08YJ2_n1936BarSerTin, P08YJ2_A279CliNom, P08YJ2_A252CliCod, P08YJ2_A1929EstTinNr,
            P08YJ2_A13759EstFecCier, P08YJ2_A3656BarCosAD, P08YJ2_n3656BarCosAD, P08YJ2_A3657BarCosAA, P08YJ2_n3657BarCosAA, P08YJ2_A3706BarCosAnc, P08YJ2_n3706BarCosAnc, P08YJ2_A13967BarNumEny, P08YJ2_n13967BarNumEny, P08YJ2_A13962BarArtTinD,
            P08YJ2_n13962BarArtTinD, P08YJ2_A1935BarParTin, P08YJ2_n1935BarParTin, P08YJ2_A1934BarReoTin, P08YJ2_n1934BarReoTin, P08YJ2_A1933BarCodTin, P08YJ2_n1933BarCodTin, P08YJ2_A2316BarAgrLot, P08YJ2_n2316BarAgrLot, P08YJ2_A3705BarCosCol,
            P08YJ2_n3705BarCosCol, P08YJ2_A3658BarCosPA, P08YJ2_n3658BarCosPA, P08YJ2_A3654BarCosPD, P08YJ2_n3654BarCosPD, P08YJ2_A3646EstTinAny, P08YJ2_A3647EstTinMes, P08YJ2_A3648EstTinDia
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1934BarReoTin ;
   private byte A1942BarTipCoT ;
   private byte AV130Formulaciontinte_consultadesdelcontids_6_tfbarreotin ;
   private byte AV118TFBarReoTin ;
   private byte AV131Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ;
   private byte AV119TFBarReoTin_To ;
   private byte AV152Formulaciontinte_consultadesdelcontids_28_tfbartipcot ;
   private byte AV81TFBarTipCoT ;
   private byte AV153Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ;
   private byte AV82TFBarTipCoT_To ;
   private byte AV36BarCodReoP ;
   private byte AV35PBarCodReo ;
   private byte A3647EstTinMes ;
   private byte A3648EstTinDia ;
   private byte AV179Barcodreo ;
   private short gxcookieaux ;
   private short A1929EstTinNr ;
   private short A1939BarArtTin ;
   private short A13975BarNumtint ;
   private short A3650BarNumAna ;
   private short AV126Formulaciontinte_consultadesdelcontids_2_tfesttinnr ;
   private short AV63TFEstTinNr ;
   private short AV127Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ;
   private short AV64TFEstTinNr_To ;
   private short AV144Formulaciontinte_consultadesdelcontids_20_tfbararttin ;
   private short AV99TFBarArtTin ;
   private short AV145Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ;
   private short AV100TFBarArtTin_To ;
   private short AV160Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ;
   private short AV106TFBarNumtint ;
   private short AV161Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ;
   private short AV107TFBarNumtint_To ;
   private short AV172Formulaciontinte_consultadesdelcontids_48_tfbarnumana ;
   private short AV97TFBarNumAna ;
   private short AV173Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ;
   private short AV98TFBarNumAna_To ;
   private short AV50OrderedBy ;
   private short AV108TipArtCodfrom ;
   private short AV109TipArtCodto ;
   private short A3646EstTinAny ;
   private short Gx_err ;
   private int AV13Random ;
   private int A1933BarCodTin ;
   private int A252CliCod ;
   private int A1941BarColNuT ;
   private int A1946BarVolTin ;
   private int A13967BarNumEny ;
   private int AV128Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ;
   private int AV116TFBarCodTin ;
   private int AV129Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ;
   private int AV117TFBarCodTin_To ;
   private int AV136Formulaciontinte_consultadesdelcontids_12_tfclicod ;
   private int AV69TFCliCod ;
   private int AV137Formulaciontinte_consultadesdelcontids_13_tfclicod_to ;
   private int AV70TFCliCod_To ;
   private int AV150Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ;
   private int AV79TFBarColNuT ;
   private int AV151Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ;
   private int AV80TFBarColNuT_To ;
   private int AV166Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ;
   private int AV93TFBarVolTin ;
   private int AV167Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ;
   private int AV94TFBarVolTin_To ;
   private int AV168Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ;
   private int AV103TFBarNumEny ;
   private int AV169Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ;
   private int AV104TFBarNumEny_To ;
   private int AV31PCliCod ;
   private int AV32CliCodP ;
   private int AV33PBarCod ;
   private int AV34Barcodp ;
   private int AV43PColNum ;
   private int AV44ColNumP ;
   private int AV178Barcod ;
   private int AV181GXV1 ;
   private java.math.BigDecimal A1947BarKgmTin ;
   private java.math.BigDecimal A8563BarKgsTt ;
   private java.math.BigDecimal A1948BarMtrTin ;
   private java.math.BigDecimal A12993BarMtsTt ;
   private java.math.BigDecimal A14199CosteInici ;
   private java.math.BigDecimal A14200CosteAnyad ;
   private java.math.BigDecimal AV154Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ;
   private java.math.BigDecimal AV83TFBarKgmTin ;
   private java.math.BigDecimal AV155Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ;
   private java.math.BigDecimal AV84TFBarKgmTin_To ;
   private java.math.BigDecimal AV156Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ;
   private java.math.BigDecimal AV85TFBarKgsTt ;
   private java.math.BigDecimal AV157Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ;
   private java.math.BigDecimal AV86TFBarKgsTt_To ;
   private java.math.BigDecimal AV158Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ;
   private java.math.BigDecimal AV87TFBarMtrTin ;
   private java.math.BigDecimal AV159Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ;
   private java.math.BigDecimal AV88TFBarMtrTin_To ;
   private java.math.BigDecimal AV162Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ;
   private java.math.BigDecimal AV89TFBarMtsTt ;
   private java.math.BigDecimal AV163Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ;
   private java.math.BigDecimal AV90TFBarMtsTt_To ;
   private java.math.BigDecimal AV174Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ;
   private java.math.BigDecimal AV112TFCosteInicial ;
   private java.math.BigDecimal AV175Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ;
   private java.math.BigDecimal AV113TFCosteInicial_To ;
   private java.math.BigDecimal AV176Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ;
   private java.math.BigDecimal AV114TFCosteAnyadidas ;
   private java.math.BigDecimal AV177Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ;
   private java.math.BigDecimal AV115TFCosteAnyadidas_To ;
   private java.math.BigDecimal A3654BarCosPD ;
   private java.math.BigDecimal A3658BarCosPA ;
   private java.math.BigDecimal A3705BarCosCol ;
   private java.math.BigDecimal A3656BarCosAD ;
   private java.math.BigDecimal A3657BarCosAA ;
   private java.math.BigDecimal A3706BarCosAnc ;
   private java.math.BigDecimal AV56CosteKg ;
   private java.math.BigDecimal AV57CosteMT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A1935BarParTin ;
   private String A2316BarAgrLot ;
   private String A279CliNom ;
   private String A1936BarSerTin ;
   private String A1937BarDscTin ;
   private String A13962BarArtTinD ;
   private String A1940BarColNoT ;
   private String A1945BarMaqTin ;
   private String A11762BarDispCli ;
   private String AV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin ;
   private String AV120TFBarParTin ;
   private String AV133Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ;
   private String AV121TFBarParTin_Sel ;
   private String AV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ;
   private String AV67TFBarAgrLot ;
   private String AV135Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ;
   private String AV68TFBarAgrLot_Sel ;
   private String AV138Formulaciontinte_consultadesdelcontids_14_tfclinom ;
   private String AV71TFCliNom ;
   private String AV139Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ;
   private String AV72TFCliNom_Sel ;
   private String AV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin ;
   private String AV73TFBarSerTin ;
   private String AV141Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ;
   private String AV74TFBarSerTin_Sel ;
   private String AV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin ;
   private String AV75TFBarDscTin ;
   private String AV143Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ;
   private String AV76TFBarDscTin_Sel ;
   private String AV146Formulaciontinte_consultadesdelcontids_22_tfbararttind ;
   private String AV101TFBarArtTinD ;
   private String AV147Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ;
   private String AV102TFBarArtTinD_Sel ;
   private String AV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ;
   private String AV77TFBarColNoT ;
   private String AV149Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ;
   private String AV78TFBarColNoT_Sel ;
   private String AV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ;
   private String AV91TFBarMaqTin ;
   private String AV165Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ;
   private String AV92TFBarMaqTin_Sel ;
   private String AV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli ;
   private String AV95TFBarDispCli ;
   private String AV171Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ;
   private String AV96TFBarDispCli_Sel ;
   private String lV146Formulaciontinte_consultadesdelcontids_22_tfbararttind ;
   private String scmdbuf ;
   private String lV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin ;
   private String lV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ;
   private String lV138Formulaciontinte_consultadesdelcontids_14_tfclinom ;
   private String lV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin ;
   private String lV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin ;
   private String lV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ;
   private String lV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ;
   private String lV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli ;
   private String AV37PBarCodPar ;
   private String AV38BarCodParP ;
   private String AV39PSerie ;
   private String AV40SerieP ;
   private String AV41PColor ;
   private String AV42ColorP ;
   private String AV45DispCli1 ;
   private String AV46DispCli3 ;
   private String A6634BarRecAcb ;
   private String AV47HreRacab ;
   private String AV48MaqCodi ;
   private String AV49MaqCod3 ;
   private String AV110SoloAd ;
   private String AV111CorAdi ;
   private String AV28Emprcod ;
   private String A396EmprCod ;
   private String AV105Marca ;
   private String AV180Barcodpar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A13759EstFecCier ;
   private java.util.Date AV125Formulaciontinte_consultadesdelcontids_1_tfestfeccier ;
   private java.util.Date AV61TFEstFecCier ;
   private java.util.Date AV29Fec1 ;
   private java.util.Date AV30Fec3 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV51OrderedDsc ;
   private boolean n6634BarRecAcb ;
   private boolean n3650BarNumAna ;
   private boolean n11762BarDispCli ;
   private boolean n1946BarVolTin ;
   private boolean n1945BarMaqTin ;
   private boolean n12993BarMtsTt ;
   private boolean n1948BarMtrTin ;
   private boolean n8563BarKgsTt ;
   private boolean n1947BarKgmTin ;
   private boolean n1942BarTipCoT ;
   private boolean n1941BarColNuT ;
   private boolean n1940BarColNoT ;
   private boolean n1939BarArtTin ;
   private boolean n1937BarDscTin ;
   private boolean n1936BarSerTin ;
   private boolean n3656BarCosAD ;
   private boolean n3657BarCosAA ;
   private boolean n3706BarCosAnc ;
   private boolean n13967BarNumEny ;
   private boolean n13962BarArtTinD ;
   private boolean n1935BarParTin ;
   private boolean n1934BarReoTin ;
   private boolean n1933BarCodTin ;
   private boolean n2316BarAgrLot ;
   private boolean n3705BarCosCol ;
   private boolean n3658BarCosPA ;
   private boolean n3654BarCosPD ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08YJ2_A494ForSer ;
   private String[] P08YJ2_A482ForColNom ;
   private int[] P08YJ2_A483ForColNum ;
   private byte[] P08YJ2_A831TipColCod ;
   private short[] P08YJ2_A829TipArtCod ;
   private String[] P08YJ2_A6634BarRecAcb ;
   private boolean[] P08YJ2_n6634BarRecAcb ;
   private String[] P08YJ2_A396EmprCod ;
   private java.math.BigDecimal[] P08YJ2_A14200CosteAnyad ;
   private short[] P08YJ2_A3650BarNumAna ;
   private boolean[] P08YJ2_n3650BarNumAna ;
   private String[] P08YJ2_A11762BarDispCli ;
   private boolean[] P08YJ2_n11762BarDispCli ;
   private int[] P08YJ2_A1946BarVolTin ;
   private boolean[] P08YJ2_n1946BarVolTin ;
   private String[] P08YJ2_A1945BarMaqTin ;
   private boolean[] P08YJ2_n1945BarMaqTin ;
   private java.math.BigDecimal[] P08YJ2_A12993BarMtsTt ;
   private boolean[] P08YJ2_n12993BarMtsTt ;
   private java.math.BigDecimal[] P08YJ2_A1948BarMtrTin ;
   private boolean[] P08YJ2_n1948BarMtrTin ;
   private java.math.BigDecimal[] P08YJ2_A8563BarKgsTt ;
   private boolean[] P08YJ2_n8563BarKgsTt ;
   private java.math.BigDecimal[] P08YJ2_A1947BarKgmTin ;
   private boolean[] P08YJ2_n1947BarKgmTin ;
   private byte[] P08YJ2_A1942BarTipCoT ;
   private boolean[] P08YJ2_n1942BarTipCoT ;
   private int[] P08YJ2_A1941BarColNuT ;
   private boolean[] P08YJ2_n1941BarColNuT ;
   private String[] P08YJ2_A1940BarColNoT ;
   private boolean[] P08YJ2_n1940BarColNoT ;
   private short[] P08YJ2_A1939BarArtTin ;
   private boolean[] P08YJ2_n1939BarArtTin ;
   private String[] P08YJ2_A1937BarDscTin ;
   private boolean[] P08YJ2_n1937BarDscTin ;
   private String[] P08YJ2_A1936BarSerTin ;
   private boolean[] P08YJ2_n1936BarSerTin ;
   private String[] P08YJ2_A279CliNom ;
   private int[] P08YJ2_A252CliCod ;
   private short[] P08YJ2_A1929EstTinNr ;
   private java.util.Date[] P08YJ2_A13759EstFecCier ;
   private java.math.BigDecimal[] P08YJ2_A3656BarCosAD ;
   private boolean[] P08YJ2_n3656BarCosAD ;
   private java.math.BigDecimal[] P08YJ2_A3657BarCosAA ;
   private boolean[] P08YJ2_n3657BarCosAA ;
   private java.math.BigDecimal[] P08YJ2_A3706BarCosAnc ;
   private boolean[] P08YJ2_n3706BarCosAnc ;
   private int[] P08YJ2_A13967BarNumEny ;
   private boolean[] P08YJ2_n13967BarNumEny ;
   private String[] P08YJ2_A13962BarArtTinD ;
   private boolean[] P08YJ2_n13962BarArtTinD ;
   private String[] P08YJ2_A1935BarParTin ;
   private boolean[] P08YJ2_n1935BarParTin ;
   private byte[] P08YJ2_A1934BarReoTin ;
   private boolean[] P08YJ2_n1934BarReoTin ;
   private int[] P08YJ2_A1933BarCodTin ;
   private boolean[] P08YJ2_n1933BarCodTin ;
   private String[] P08YJ2_A2316BarAgrLot ;
   private boolean[] P08YJ2_n2316BarAgrLot ;
   private java.math.BigDecimal[] P08YJ2_A3705BarCosCol ;
   private boolean[] P08YJ2_n3705BarCosCol ;
   private java.math.BigDecimal[] P08YJ2_A3658BarCosPA ;
   private boolean[] P08YJ2_n3658BarCosPA ;
   private java.math.BigDecimal[] P08YJ2_A3654BarCosPD ;
   private boolean[] P08YJ2_n3654BarCosPD ;
   private short[] P08YJ2_A3646EstTinAny ;
   private byte[] P08YJ2_A3647EstTinMes ;
   private byte[] P08YJ2_A3648EstTinDia ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV59GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV60GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class consultadesdelcontiexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08YJ2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV125Formulaciontinte_consultadesdelcontids_1_tfestfeccier ,
                                          short AV126Formulaciontinte_consultadesdelcontids_2_tfesttinnr ,
                                          short AV127Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to ,
                                          int AV128Formulaciontinte_consultadesdelcontids_4_tfbarcodtin ,
                                          int AV129Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to ,
                                          byte AV130Formulaciontinte_consultadesdelcontids_6_tfbarreotin ,
                                          byte AV131Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to ,
                                          String AV133Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel ,
                                          String AV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin ,
                                          String AV135Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel ,
                                          String AV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot ,
                                          int AV136Formulaciontinte_consultadesdelcontids_12_tfclicod ,
                                          int AV137Formulaciontinte_consultadesdelcontids_13_tfclicod_to ,
                                          String AV139Formulaciontinte_consultadesdelcontids_15_tfclinom_sel ,
                                          String AV138Formulaciontinte_consultadesdelcontids_14_tfclinom ,
                                          String AV141Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel ,
                                          String AV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin ,
                                          String AV143Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel ,
                                          String AV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin ,
                                          short AV144Formulaciontinte_consultadesdelcontids_20_tfbararttin ,
                                          short AV145Formulaciontinte_consultadesdelcontids_21_tfbararttin_to ,
                                          String AV149Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel ,
                                          String AV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot ,
                                          int AV150Formulaciontinte_consultadesdelcontids_26_tfbarcolnut ,
                                          int AV151Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to ,
                                          byte AV152Formulaciontinte_consultadesdelcontids_28_tfbartipcot ,
                                          byte AV153Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to ,
                                          java.math.BigDecimal AV154Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin ,
                                          java.math.BigDecimal AV155Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to ,
                                          java.math.BigDecimal AV156Formulaciontinte_consultadesdelcontids_32_tfbarkgstt ,
                                          java.math.BigDecimal AV157Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to ,
                                          java.math.BigDecimal AV158Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin ,
                                          java.math.BigDecimal AV159Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to ,
                                          short AV160Formulaciontinte_consultadesdelcontids_36_tfbarnumtint ,
                                          short AV161Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to ,
                                          java.math.BigDecimal AV162Formulaciontinte_consultadesdelcontids_38_tfbarmtstt ,
                                          java.math.BigDecimal AV163Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to ,
                                          String AV165Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel ,
                                          String AV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin ,
                                          int AV166Formulaciontinte_consultadesdelcontids_42_tfbarvoltin ,
                                          int AV167Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to ,
                                          String AV171Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel ,
                                          String AV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli ,
                                          short AV172Formulaciontinte_consultadesdelcontids_48_tfbarnumana ,
                                          short AV173Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to ,
                                          java.math.BigDecimal AV174Formulaciontinte_consultadesdelcontids_50_tfcosteinicial ,
                                          java.math.BigDecimal AV175Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to ,
                                          java.math.BigDecimal AV176Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas ,
                                          java.math.BigDecimal AV177Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to ,
                                          byte AV36BarCodReoP ,
                                          java.util.Date A13759EstFecCier ,
                                          short A1929EstTinNr ,
                                          int A1933BarCodTin ,
                                          byte A1934BarReoTin ,
                                          String A1935BarParTin ,
                                          String A2316BarAgrLot ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A1936BarSerTin ,
                                          String A1937BarDscTin ,
                                          short A1939BarArtTin ,
                                          String A1940BarColNoT ,
                                          int A1941BarColNuT ,
                                          byte A1942BarTipCoT ,
                                          java.math.BigDecimal A1947BarKgmTin ,
                                          java.math.BigDecimal A8563BarKgsTt ,
                                          java.math.BigDecimal A1948BarMtrTin ,
                                          java.math.BigDecimal A12993BarMtsTt ,
                                          String A1945BarMaqTin ,
                                          int A1946BarVolTin ,
                                          String A11762BarDispCli ,
                                          short A3650BarNumAna ,
                                          java.math.BigDecimal A3654BarCosPD ,
                                          java.math.BigDecimal A3658BarCosPA ,
                                          java.math.BigDecimal A3705BarCosCol ,
                                          java.math.BigDecimal A3656BarCosAD ,
                                          java.math.BigDecimal A3657BarCosAA ,
                                          java.math.BigDecimal A3706BarCosAnc ,
                                          short AV50OrderedBy ,
                                          boolean AV51OrderedDsc ,
                                          String AV147Formulaciontinte_consultadesdelcontids_23_tfbararttind_sel ,
                                          String AV146Formulaciontinte_consultadesdelcontids_22_tfbararttind ,
                                          String A13962BarArtTinD ,
                                          int AV168Formulaciontinte_consultadesdelcontids_44_tfbarnumeny ,
                                          int A13967BarNumEny ,
                                          int AV169Formulaciontinte_consultadesdelcontids_45_tfbarnumeny_to ,
                                          java.util.Date AV29Fec1 ,
                                          java.util.Date AV30Fec3 ,
                                          int AV31PCliCod ,
                                          int AV32CliCodP ,
                                          int AV33PBarCod ,
                                          int AV34Barcodp ,
                                          byte AV35PBarCodReo ,
                                          String AV37PBarCodPar ,
                                          String AV38BarCodParP ,
                                          String AV39PSerie ,
                                          String AV40SerieP ,
                                          String AV41PColor ,
                                          String AV42ColorP ,
                                          int AV43PColNum ,
                                          int AV44ColNumP ,
                                          String AV45DispCli1 ,
                                          String AV46DispCli3 ,
                                          String A6634BarRecAcb ,
                                          String AV47HreRacab ,
                                          String AV48MaqCodi ,
                                          String AV49MaqCod3 ,
                                          short AV108TipArtCodfrom ,
                                          short AV109TipArtCodto ,
                                          String AV110SoloAd ,
                                          String AV111CorAdi ,
                                          java.math.BigDecimal A14200CosteAnyad ,
                                          String AV28Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[88];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T4.ForSer, T4.ForColNom, T4.ForColNum, T4.TipColCod, T2.TipArtCod, T1.BarRecAcb, T1.EmprCod, COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE(" ;
      scmdbuf += " T1.BarCosAnc, 0) AS CosteAnyad, T1.BarNumAna, T1.BarDispCli, T1.BarVolTin, T1.BarMaqTin, T1.BarMtsTt, T1.BarMtrTin, T1.BarKgsTt, T1.BarKgmTin, T1.BarTipCoT, T1.BarColNuT," ;
      scmdbuf += " T1.BarColNoT, T1.BarArtTin, T1.BarDscTin, T1.BarSerTin, T3.CliNom, T1.CliCod, T1.EstTinNr, T1.EstFecCier, T1.BarCosAD, T1.BarCosAA, T1.BarCosAnc, COALESCE( T4.ForNumArc," ;
      scmdbuf += " 0) AS BarNumEny, COALESCE( T2.TipArtDsc, ' ') AS BarArtTinD, T1.BarParTin, T1.BarReoTin, T1.BarCodTin, T1.BarAgrLot, T1.BarCosCol, T1.BarCosPA, T1.BarCosPD, T1.EstTinAny," ;
      scmdbuf += " T1.EstTinMes, T1.EstTinDia FROM (((TXPLCONTI T1 LEFT JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.BarArtTin) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) LEFT JOIN TXPCFORMU T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod AND T4.ForSer = T1.BarSerTin AND T4.ForColNom" ;
      scmdbuf += " = T1.BarColNoT AND T4.ForColNum = T1.BarColNuT AND T4.TipColCod = T1.BarTipCoT)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T2.TipArtDsc, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T2.TipArtDsc, ' ') = ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.ForNumArc, 0) <= ?))");
      addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      addWhere(sWhereString, "(T1.EstFecCier <= ?)");
      addWhere(sWhereString, "(T1.CliCod >= ?)");
      addWhere(sWhereString, "(T1.CliCod <= ?)");
      addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin >= ?)");
      addWhere(sWhereString, "(T1.BarParTin <= ?)");
      addWhere(sWhereString, "(T1.BarSerTin >= ?)");
      addWhere(sWhereString, "(T1.BarSerTin <= ?)");
      addWhere(sWhereString, "(T1.BarColNoT >= ?)");
      addWhere(sWhereString, "(T1.BarColNoT <= ?)");
      addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      addWhere(sWhereString, "(T1.BarDispCli >= ?)");
      addWhere(sWhereString, "(T1.BarDispCli <= ?)");
      addWhere(sWhereString, "(T1.BarRecAcb = ? or ? = 'T')");
      addWhere(sWhereString, "(T1.BarMaqTin >= ?)");
      addWhere(sWhereString, "(T1.BarMaqTin <= ?)");
      addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      addWhere(sWhereString, "(( ? = 'N') or ( ? = 'S' and ? = 'N' and COALESCE( T1.BarCosAD, 0) + COALESCE( T1.BarCosAA, 0) + COALESCE( T1.BarCosAnc, 0) > 0) or ( ? = 'S' and ? = 'S' and T1.BarCosAnc > 0))");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV125Formulaciontinte_consultadesdelcontids_1_tfestfeccier)) )
      {
         addWhere(sWhereString, "(T1.EstFecCier >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV126Formulaciontinte_consultadesdelcontids_2_tfesttinnr) )
      {
         addWhere(sWhereString, "(T1.EstTinNr >= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( ! (0==AV127Formulaciontinte_consultadesdelcontids_3_tfesttinnr_to) )
      {
         addWhere(sWhereString, "(T1.EstTinNr <= ?)");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (0==AV128Formulaciontinte_consultadesdelcontids_4_tfbarcodtin) )
      {
         addWhere(sWhereString, "(T1.BarCodTin >= ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      if ( ! (0==AV129Formulaciontinte_consultadesdelcontids_5_tfbarcodtin_to) )
      {
         addWhere(sWhereString, "(T1.BarCodTin <= ?)");
      }
      else
      {
         GXv_int6[42] = (byte)(1) ;
      }
      if ( ! (0==AV130Formulaciontinte_consultadesdelcontids_6_tfbarreotin) )
      {
         addWhere(sWhereString, "(T1.BarReoTin >= ?)");
      }
      else
      {
         GXv_int6[43] = (byte)(1) ;
      }
      if ( ! (0==AV131Formulaciontinte_consultadesdelcontids_7_tfbarreotin_to) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int6[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) && ( ! (GXutil.strcmp("", AV132Formulaciontinte_consultadesdelcontids_8_tfbarpartin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarParTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV133Formulaciontinte_consultadesdelcontids_9_tfbarpartin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarParTin = ?)");
      }
      else
      {
         GXv_int6[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) && ( ! (GXutil.strcmp("", AV134Formulaciontinte_consultadesdelcontids_10_tfbaragrlot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarAgrLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Formulaciontinte_consultadesdelcontids_11_tfbaragrlot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarAgrLot = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! (0==AV136Formulaciontinte_consultadesdelcontids_12_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      if ( ! (0==AV137Formulaciontinte_consultadesdelcontids_13_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int6[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV138Formulaciontinte_consultadesdelcontids_14_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Formulaciontinte_consultadesdelcontids_15_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int6[52] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV141Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) && ( ! (GXutil.strcmp("", AV140Formulaciontinte_consultadesdelcontids_16_tfbarsertin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[53] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV141Formulaciontinte_consultadesdelcontids_17_tfbarsertin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerTin = ?)");
      }
      else
      {
         GXv_int6[54] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) && ( ! (GXutil.strcmp("", AV142Formulaciontinte_consultadesdelcontids_18_tfbardsctin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDscTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Formulaciontinte_consultadesdelcontids_19_tfbardsctin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDscTin = ?)");
      }
      else
      {
         GXv_int6[56] = (byte)(1) ;
      }
      if ( ! (0==AV144Formulaciontinte_consultadesdelcontids_20_tfbararttin) )
      {
         addWhere(sWhereString, "(T1.BarArtTin >= ?)");
      }
      else
      {
         GXv_int6[57] = (byte)(1) ;
      }
      if ( ! (0==AV145Formulaciontinte_consultadesdelcontids_21_tfbararttin_to) )
      {
         addWhere(sWhereString, "(T1.BarArtTin <= ?)");
      }
      else
      {
         GXv_int6[58] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV149Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) && ( ! (GXutil.strcmp("", AV148Formulaciontinte_consultadesdelcontids_24_tfbarcolnot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNoT) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[59] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV149Formulaciontinte_consultadesdelcontids_25_tfbarcolnot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNoT = ?)");
      }
      else
      {
         GXv_int6[60] = (byte)(1) ;
      }
      if ( ! (0==AV150Formulaciontinte_consultadesdelcontids_26_tfbarcolnut) )
      {
         addWhere(sWhereString, "(T1.BarColNuT >= ?)");
      }
      else
      {
         GXv_int6[61] = (byte)(1) ;
      }
      if ( ! (0==AV151Formulaciontinte_consultadesdelcontids_27_tfbarcolnut_to) )
      {
         addWhere(sWhereString, "(T1.BarColNuT <= ?)");
      }
      else
      {
         GXv_int6[62] = (byte)(1) ;
      }
      if ( ! (0==AV152Formulaciontinte_consultadesdelcontids_28_tfbartipcot) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT >= ?)");
      }
      else
      {
         GXv_int6[63] = (byte)(1) ;
      }
      if ( ! (0==AV153Formulaciontinte_consultadesdelcontids_29_tfbartipcot_to) )
      {
         addWhere(sWhereString, "(T1.BarTipCoT <= ?)");
      }
      else
      {
         GXv_int6[64] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV154Formulaciontinte_consultadesdelcontids_30_tfbarkgmtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin >= ?)");
      }
      else
      {
         GXv_int6[65] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV155Formulaciontinte_consultadesdelcontids_31_tfbarkgmtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgmTin <= ?)");
      }
      else
      {
         GXv_int6[66] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV156Formulaciontinte_consultadesdelcontids_32_tfbarkgstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt >= ?)");
      }
      else
      {
         GXv_int6[67] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Formulaciontinte_consultadesdelcontids_33_tfbarkgstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarKgsTt <= ?)");
      }
      else
      {
         GXv_int6[68] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158Formulaciontinte_consultadesdelcontids_34_tfbarmtrtin)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin >= ?)");
      }
      else
      {
         GXv_int6[69] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV159Formulaciontinte_consultadesdelcontids_35_tfbarmtrtin_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtrTin <= ?)");
      }
      else
      {
         GXv_int6[70] = (byte)(1) ;
      }
      if ( ! (0==AV160Formulaciontinte_consultadesdelcontids_36_tfbarnumtint) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int6[71] = (byte)(1) ;
      }
      if ( ! (0==AV161Formulaciontinte_consultadesdelcontids_37_tfbarnumtint_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 1, 8)), '0')) = T1.BarCodTin and TO_NUMBER(NVL(TRIM(SUBSTR(T1.BarAgrLot, 9, 1)), '0')) = T1.BarReoTin and SUBSTR(T1.BarAgrLot, 10, 1) = T1.BarParTin THEN 1 ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int6[72] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV162Formulaciontinte_consultadesdelcontids_38_tfbarmtstt)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt >= ?)");
      }
      else
      {
         GXv_int6[73] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV163Formulaciontinte_consultadesdelcontids_39_tfbarmtstt_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarMtsTt <= ?)");
      }
      else
      {
         GXv_int6[74] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV165Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) && ( ! (GXutil.strcmp("", AV164Formulaciontinte_consultadesdelcontids_40_tfbarmaqtin)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarMaqTin) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[75] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV165Formulaciontinte_consultadesdelcontids_41_tfbarmaqtin_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarMaqTin = ?)");
      }
      else
      {
         GXv_int6[76] = (byte)(1) ;
      }
      if ( ! (0==AV166Formulaciontinte_consultadesdelcontids_42_tfbarvoltin) )
      {
         addWhere(sWhereString, "(T1.BarVolTin >= ?)");
      }
      else
      {
         GXv_int6[77] = (byte)(1) ;
      }
      if ( ! (0==AV167Formulaciontinte_consultadesdelcontids_43_tfbarvoltin_to) )
      {
         addWhere(sWhereString, "(T1.BarVolTin <= ?)");
      }
      else
      {
         GXv_int6[78] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV171Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) && ( ! (GXutil.strcmp("", AV170Formulaciontinte_consultadesdelcontids_46_tfbardispcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDispCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[79] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV171Formulaciontinte_consultadesdelcontids_47_tfbardispcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDispCli = ?)");
      }
      else
      {
         GXv_int6[80] = (byte)(1) ;
      }
      if ( ! (0==AV172Formulaciontinte_consultadesdelcontids_48_tfbarnumana) )
      {
         addWhere(sWhereString, "(T1.BarNumAna >= ?)");
      }
      else
      {
         GXv_int6[81] = (byte)(1) ;
      }
      if ( ! (0==AV173Formulaciontinte_consultadesdelcontids_49_tfbarnumana_to) )
      {
         addWhere(sWhereString, "(T1.BarNumAna <= ?)");
      }
      else
      {
         GXv_int6[82] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV174Formulaciontinte_consultadesdelcontids_50_tfcosteinicial)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) >= ?)");
      }
      else
      {
         GXv_int6[83] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV175Formulaciontinte_consultadesdelcontids_51_tfcosteinicial_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosPD + T1.BarCosPA + T1.BarCosCol) <= ?)");
      }
      else
      {
         GXv_int6[84] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV176Formulaciontinte_consultadesdelcontids_52_tfcosteanyadidas)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) >= ?)");
      }
      else
      {
         GXv_int6[85] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV177Formulaciontinte_consultadesdelcontids_53_tfcosteanyadidas_to)==0) )
      {
         addWhere(sWhereString, "(( T1.BarCosAD + T1.BarCosAA + T1.BarCosAnc) <= ?)");
      }
      else
      {
         GXv_int6[86] = (byte)(1) ;
      }
      if ( ! (0==AV36BarCodReoP) )
      {
         addWhere(sWhereString, "(T1.BarReoTin <= ?)");
      }
      else
      {
         GXv_int6[87] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV50OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.EstFecCier, T1.EstTinNr" ;
      }
      else if ( ( AV50OrderedBy == 2 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstFecCier" ;
      }
      else if ( ( AV50OrderedBy == 2 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstFecCier DESC" ;
      }
      else if ( ( AV50OrderedBy == 3 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EstTinNr" ;
      }
      else if ( ( AV50OrderedBy == 3 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EstTinNr DESC" ;
      }
      else if ( ( AV50OrderedBy == 4 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodTin" ;
      }
      else if ( ( AV50OrderedBy == 4 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 5 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarReoTin" ;
      }
      else if ( ( AV50OrderedBy == 5 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarReoTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 6 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarParTin" ;
      }
      else if ( ( AV50OrderedBy == 6 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarParTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 7 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarAgrLot" ;
      }
      else if ( ( AV50OrderedBy == 7 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarAgrLot DESC" ;
      }
      else if ( ( AV50OrderedBy == 8 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV50OrderedBy == 8 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV50OrderedBy == 9 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV50OrderedBy == 9 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV50OrderedBy == 10 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarSerTin" ;
      }
      else if ( ( AV50OrderedBy == 10 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarSerTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 11 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarDscTin" ;
      }
      else if ( ( AV50OrderedBy == 11 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarDscTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 12 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarArtTin" ;
      }
      else if ( ( AV50OrderedBy == 12 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarArtTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 13 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNoT" ;
      }
      else if ( ( AV50OrderedBy == 13 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNoT DESC" ;
      }
      else if ( ( AV50OrderedBy == 14 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarColNuT" ;
      }
      else if ( ( AV50OrderedBy == 14 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarColNuT DESC" ;
      }
      else if ( ( AV50OrderedBy == 15 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarTipCoT" ;
      }
      else if ( ( AV50OrderedBy == 15 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarTipCoT DESC" ;
      }
      else if ( ( AV50OrderedBy == 16 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarKgmTin" ;
      }
      else if ( ( AV50OrderedBy == 16 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarKgmTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 17 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarKgsTt" ;
      }
      else if ( ( AV50OrderedBy == 17 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarKgsTt DESC" ;
      }
      else if ( ( AV50OrderedBy == 18 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMtrTin" ;
      }
      else if ( ( AV50OrderedBy == 18 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMtrTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 19 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMtsTt" ;
      }
      else if ( ( AV50OrderedBy == 19 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMtsTt DESC" ;
      }
      else if ( ( AV50OrderedBy == 20 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarMaqTin" ;
      }
      else if ( ( AV50OrderedBy == 20 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarMaqTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 21 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarVolTin" ;
      }
      else if ( ( AV50OrderedBy == 21 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarVolTin DESC" ;
      }
      else if ( ( AV50OrderedBy == 22 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarDispCli" ;
      }
      else if ( ( AV50OrderedBy == 22 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarDispCli DESC" ;
      }
      else if ( ( AV50OrderedBy == 23 ) && ! AV51OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarNumAna" ;
      }
      else if ( ( AV50OrderedBy == 23 ) && ( AV51OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarNumAna DESC" ;
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
                  return conditional_P08YJ2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Number) dynConstraints[34]).shortValue() , (java.math.BigDecimal)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (java.math.BigDecimal)dynConstraints[45] , (java.math.BigDecimal)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (java.math.BigDecimal)dynConstraints[48] , ((Number) dynConstraints[49]).byteValue() , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Number) dynConstraints[52]).intValue() , ((Number) dynConstraints[53]).byteValue() , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).shortValue() , (String)dynConstraints[61] , ((Number) dynConstraints[62]).intValue() , ((Number) dynConstraints[63]).byteValue() , (java.math.BigDecimal)dynConstraints[64] , (java.math.BigDecimal)dynConstraints[65] , (java.math.BigDecimal)dynConstraints[66] , (java.math.BigDecimal)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).shortValue() , (java.math.BigDecimal)dynConstraints[72] , (java.math.BigDecimal)dynConstraints[73] , (java.math.BigDecimal)dynConstraints[74] , (java.math.BigDecimal)dynConstraints[75] , (java.math.BigDecimal)dynConstraints[76] , (java.math.BigDecimal)dynConstraints[77] , ((Number) dynConstraints[78]).shortValue() , ((Boolean) dynConstraints[79]).booleanValue() , (String)dynConstraints[80] , (String)dynConstraints[81] , (String)dynConstraints[82] , ((Number) dynConstraints[83]).intValue() , ((Number) dynConstraints[84]).intValue() , ((Number) dynConstraints[85]).intValue() , (java.util.Date)dynConstraints[86] , (java.util.Date)dynConstraints[87] , ((Number) dynConstraints[88]).intValue() , ((Number) dynConstraints[89]).intValue() , ((Number) dynConstraints[90]).intValue() , ((Number) dynConstraints[91]).intValue() , ((Number) dynConstraints[92]).byteValue() , (String)dynConstraints[93] , (String)dynConstraints[94] , (String)dynConstraints[95] , (String)dynConstraints[96] , (String)dynConstraints[97] , (String)dynConstraints[98] , ((Number) dynConstraints[99]).intValue() , ((Number) dynConstraints[100]).intValue() , (String)dynConstraints[101] , (String)dynConstraints[102] , (String)dynConstraints[103] , (String)dynConstraints[104] , (String)dynConstraints[105] , (String)dynConstraints[106] , ((Number) dynConstraints[107]).shortValue() , ((Number) dynConstraints[108]).shortValue() , (String)dynConstraints[109] , (String)dynConstraints[110] , (java.math.BigDecimal)dynConstraints[111] , (String)dynConstraints[112] , (String)dynConstraints[113] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08YJ2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 20);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((int[]) buf[27])[0] = rslt.getInt(18);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(20);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(23, 30);
               ((int[]) buf[38])[0] = rslt.getInt(24);
               ((short[]) buf[39])[0] = rslt.getShort(25);
               ((java.util.Date[]) buf[40])[0] = rslt.getGXDate(26);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(30);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(32, 1);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(34);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(39);
               ((byte[]) buf[66])[0] = rslt.getByte(40);
               ((byte[]) buf[67])[0] = rslt.getByte(41);
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
                  stmt.setString(sIdx, (String)parms[88], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[96]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[102]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[103]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[104]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 1);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 1);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[111]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[113], 20);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[114], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 1);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 1);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[117], 6);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 6);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[119]).shortValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[120]).shortValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 1);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[122], 1);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[126]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[129]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[130]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[131]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[132]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[133], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[134], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[135], 10);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[136], 10);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[137]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[138]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[139], 30);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[140], 30);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[141], 16);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[142], 16);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[143], 26);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[144], 26);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[145]).shortValue());
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[146]).shortValue());
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[147], 13);
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[148], 13);
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[149]).intValue());
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[150]).intValue());
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[151]).byteValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[152]).byteValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[153], 2);
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[154], 2);
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[155], 2);
               }
               if ( ((Number) parms[68]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[156], 2);
               }
               if ( ((Number) parms[69]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[157], 2);
               }
               if ( ((Number) parms[70]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[158], 2);
               }
               if ( ((Number) parms[71]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[159]).shortValue());
               }
               if ( ((Number) parms[72]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[160]).shortValue());
               }
               if ( ((Number) parms[73]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[161], 2);
               }
               if ( ((Number) parms[74]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[162], 2);
               }
               if ( ((Number) parms[75]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[163], 6);
               }
               if ( ((Number) parms[76]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[164], 6);
               }
               if ( ((Number) parms[77]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[165]).intValue());
               }
               if ( ((Number) parms[78]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[166]).intValue());
               }
               if ( ((Number) parms[79]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[167], 20);
               }
               if ( ((Number) parms[80]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[168], 20);
               }
               if ( ((Number) parms[81]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[169]).shortValue());
               }
               if ( ((Number) parms[82]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[170]).shortValue());
               }
               if ( ((Number) parms[83]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[171], 2);
               }
               if ( ((Number) parms[84]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[172], 2);
               }
               if ( ((Number) parms[85]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[173], 2);
               }
               if ( ((Number) parms[86]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[174], 2);
               }
               if ( ((Number) parms[87]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[175]).byteValue());
               }
               return;
      }
   }

}

