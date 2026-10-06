package app.lectoroptico ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class partesdeproduccionlector_wcexportcsv_impl extends GXWebProcedure
{
   public partesdeproduccionlector_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "PartesdeProduccionLector_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("LectorOptico.PartesdeProduccionLector_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("LectorOptico.PartesdeProduccionLector_WCColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Op", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "M", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "F?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pcs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Paro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T. real(m)", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV80Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin = AV43TFHisProLin ;
      AV81Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to = AV44TFHisProLin_To ;
      AV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = AV45TFBarNHdr ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = AV46TFBarNHdr_Sel ;
      AV84Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod = AV47TFGruOpeCod ;
      AV85Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to = AV48TFGruOpeCod_To ;
      AV86Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin = AV49TFBarOrdLin ;
      AV87Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to = AV50TFBarOrdLin_To ;
      AV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase = AV51TFFase ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = AV52TFFase_Sel ;
      AV90Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = AV69TFFaseDsc ;
      AV91Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = AV70TFFaseDsc_Sel ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = AV53TFHisProDTI ;
      AV93Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = AV55TFHisProDTF ;
      AV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = AV57TFHisProF ;
      AV95Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = AV58TFHisProF_Sel ;
      AV96Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur = AV59TFHisProTur ;
      AV97Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to = AV60TFHisProTur_To ;
      AV98Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = AV61TFHisProKgr ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = AV62TFHisProKgr_To ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = AV63TFHisProMtr ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = AV64TFHisProMtr_To ;
      AV102Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs = AV65TFHisProNpzs ;
      AV103Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to = AV66TFHisProNpzs_To ;
      AV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = AV71TFHisProLot ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = AV72TFHisProLot_Sel ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = AV67TFParCodNom ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = AV68TFParCodNom_Sel ;
      AV108Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 = AV73TFHisProTr2 ;
      AV109Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to = AV74TFHisProTr2_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) ,
                                           Integer.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) ,
                                           AV83Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                           AV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                           Integer.valueOf(AV84Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) ,
                                           Integer.valueOf(AV85Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) ,
                                           Short.valueOf(AV86Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) ,
                                           Short.valueOf(AV87Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) ,
                                           AV89Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                           AV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                           AV92Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                           AV93Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                           AV95Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                           AV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                           Byte.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) ,
                                           Byte.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) ,
                                           AV98Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                           AV99Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                           AV100Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                           AV101Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                           Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) ,
                                           Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) ,
                                           AV105Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                           AV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                           AV107Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                           AV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                           Short.valueOf(AV108Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) ,
                                           Short.valueOf(AV109Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A3610HisProLot ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV32OrderedDsc) ,
                                           AV91Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                           AV90Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                           A7258FaseDsc ,
                                           AV28Emprcod ,
                                           AV29Maqcod ,
                                           AV30HisProfec ,
                                           A396EmprCod ,
                                           A602MaqCod ,
                                           A558HisProFec } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr), 11, "%") ;
      lV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase = GXutil.padr( GXutil.rtrim( AV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase), 8, "%") ;
      lV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = GXutil.padr( GXutil.rtrim( AV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof), 1, "%") ;
      lV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = GXutil.padr( GXutil.rtrim( AV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot), 10, "%") ;
      lV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P096K2 */
      pr_default.execute(0, new Object[] {AV28Emprcod, AV29Maqcod, AV30HisProfec, Integer.valueOf(AV80Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin), Integer.valueOf(AV81Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to), lV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr, AV83Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel, Integer.valueOf(AV84Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod), Integer.valueOf(AV85Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to), Short.valueOf(AV86Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin), Short.valueOf(AV87Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to), lV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase, AV89Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel, AV92Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti, AV93Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf, lV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof, AV95Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel, Byte.valueOf(AV96Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur), Byte.valueOf(AV97Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to), AV98Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr, AV99Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to, AV100Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr, AV101Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to, Short.valueOf(AV102Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs), Short.valueOf(AV103Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to), lV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot, AV105Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel, lV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom, AV107Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel, Short.valueOf(AV108Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2), Short.valueOf(AV109Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A656ParCod = P096K2_A656ParCod[0] ;
         n656ParCod = P096K2_n656ParCod[0] ;
         A558HisProFec = P096K2_A558HisProFec[0] ;
         A602MaqCod = P096K2_A602MaqCod[0] ;
         A867ParCodNom = P096K2_A867ParCodNom[0] ;
         n867ParCodNom = P096K2_n867ParCodNom[0] ;
         A3610HisProLot = P096K2_A3610HisProLot[0] ;
         A4714HisProNpzs = P096K2_A4714HisProNpzs[0] ;
         A1526HisProMtr = P096K2_A1526HisProMtr[0] ;
         A1525HisProKgr = P096K2_A1525HisProKgr[0] ;
         A566HisProTur = P096K2_A566HisProTur[0] ;
         A557HisProF = P096K2_A557HisProF[0] ;
         A194BarOrdLin = P096K2_A194BarOrdLin[0] ;
         A503GruOpeCod = P096K2_A503GruOpeCod[0] ;
         A561HisProLin = P096K2_A561HisProLin[0] ;
         A130BarCodPar = P096K2_A130BarCodPar[0] ;
         A132BarCodReo = P096K2_A132BarCodReo[0] ;
         A129BarCod = P096K2_A129BarCod[0] ;
         A461Fase = P096K2_A461Fase[0] ;
         A396EmprCod = P096K2_A396EmprCod[0] ;
         A4440HisProDTI = P096K2_A4440HisProDTI[0] ;
         n4440HisProDTI = P096K2_n4440HisProDTI[0] ;
         A4441HisProDTF = P096K2_A4441HisProDTF[0] ;
         n4441HisProDTF = P096K2_n4441HisProDTF[0] ;
         A867ParCodNom = P096K2_A867ParCodNom[0] ;
         n867ParCodNom = P096K2_n867ParCodNom[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         GXt_char2 = A7258FaseDsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         partesdeproduccionlector_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         A7258FaseDsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV91Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc)==0) ) ) || ( GXutil.like( GXutil.upper( A7258FaseDsc) , GXutil.padr( "%" + GXutil.upper( AV90Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV91Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel)==0) || ( ( GXutil.strcmp(A7258FaseDsc, AV91Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel) == 0 ) ) )
            {
               A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
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
                  AV14TextFileLine += GXutil.booltostr( AV76Seleccionar) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A561HisProLin, 8, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV75M = "" ;
                  if ( GXutil.strcmp(A3610HisProLot, GXutil.str( A129BarCod, 8, 0)+GXutil.str( A132BarCodReo, 1, 0)+A130BarCodPar) == 0 )
                  {
                     AV75M = "*" ;
                  }
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV75M, ";", ","), GXv_char3) ;
                  partesdeproduccionlector_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
                  partesdeproduccionlector_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A503GruOpeCod, 6, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A194BarOrdLin, 4, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A461Fase, ";", ","), GXv_char3) ;
                  partesdeproduccionlector_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A7258FaseDsc, ";", ","), GXv_char3) ;
                  partesdeproduccionlector_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += localUtil.ttoc( A4440HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += localUtil.ttoc( A4441HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A557HisProF, ";", ","), GXv_char3) ;
                  partesdeproduccionlector_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A566HisProTur, 1, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A1525HisProKgr, 9, 2) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A1526HisProMtr, 9, 2) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A4714HisProNpzs, 4, 0) ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A3610HisProLot, ";", ","), GXv_char3) ;
                  partesdeproduccionlector_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  GXt_char2 = AV14TextFileLine ;
                  GXv_char3[0] = GXt_char2 ;
                  new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A867ParCodNom, ";", ","), GXv_char3) ;
                  partesdeproduccionlector_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                  AV14TextFileLine += GXt_char2 ;
               }
               if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
               {
                  AV14TextFileLine += ";" ;
                  AV14TextFileLine += GXutil.str( A5605HisProTr2, 4, 0) ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=PartesdeProduccionLector_WCExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&Seleccionar", "", "Op", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProLin", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&M", "", "M", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarNHdr", "", "N Hdr", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GruOpeCod", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarOrdLin", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Fase", "", "Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "FaseDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTI", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTF", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProF", "", "F?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProTur", "", "T", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProKgr", "", "Kgs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProMtr", "", "Mts", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProNpzs", "", "Pcs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProLot", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParCodNom", "", "Paro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProTr2", "", "T. real(m)", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "LectorOptico.PartesdeProduccionLector_WCColumnsSelector", GXv_char3) ;
      partesdeproduccionlector_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("LectorOptico.PartesdeProduccionLector_WCGridState"), "") == 0 )
      {
         AV35GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "LectorOptico.PartesdeProduccionLector_WCGridState"), null, null);
      }
      else
      {
         AV35GridState.fromxml(AV19Session.getValue("LectorOptico.PartesdeProduccionLector_WCGridState"), null, null);
      }
      AV31OrderedBy = AV35GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV32OrderedDsc = AV35GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV110GXV1 = 1 ;
      while ( AV110GXV1 <= AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV36GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV35GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV110GXV1));
         if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV43TFHisProLin = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFHisProLin_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV45TFBarNHdr = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV46TFBarNHdr_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV47TFGruOpeCod = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV48TFGruOpeCod_To = (int)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV49TFBarOrdLin = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV50TFBarOrdLin_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV51TFFase = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV52TFFase_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV69TFFaseDsc = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV70TFFaseDsc_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV53TFHisProDTI = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV55TFHisProDTF = localUtil.ctot( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV57TFHisProF = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV58TFHisProF_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV59TFHisProTur = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV60TFHisProTur_To = (byte)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV61TFHisProKgr = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFHisProKgr_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV63TFHisProMtr = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFHisProMtr_To = CommonUtil.decimalVal( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV65TFHisProNpzs = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFHisProNpzs_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT") == 0 )
         {
            AV71TFHisProLot = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLOT_SEL") == 0 )
         {
            AV72TFHisProLot_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV67TFParCodNom = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV68TFParCodNom_Sel = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTR2") == 0 )
         {
            AV73TFHisProTr2 = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV74TFHisProTr2_To = (short)(GXutil.lval( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&MAQCOD") == 0 )
         {
            AV29Maqcod = AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&HISPROFEC") == 0 )
         {
            AV30HisProfec = localUtil.ctod( AV36GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         AV110GXV1 = (int)(AV110GXV1+1) ;
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
      A3610HisProLot = "" ;
      A130BarCodPar = "" ;
      A13696BarNHdr = "" ;
      A461Fase = "" ;
      A7258FaseDsc = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      AV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = "" ;
      AV45TFBarNHdr = "" ;
      AV83Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel = "" ;
      AV46TFBarNHdr_Sel = "" ;
      AV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase = "" ;
      AV51TFFase = "" ;
      AV89Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel = "" ;
      AV52TFFase_Sel = "" ;
      AV90Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc = "" ;
      AV69TFFaseDsc = "" ;
      AV91Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel = "" ;
      AV70TFFaseDsc_Sel = "" ;
      AV92Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV53TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV93Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV55TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = "" ;
      AV57TFHisProF = "" ;
      AV95Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel = "" ;
      AV58TFHisProF_Sel = "" ;
      AV98Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV61TFHisProKgr = DecimalUtil.ZERO ;
      AV99Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV62TFHisProKgr_To = DecimalUtil.ZERO ;
      AV100Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV63TFHisProMtr = DecimalUtil.ZERO ;
      AV101Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV64TFHisProMtr_To = DecimalUtil.ZERO ;
      AV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = "" ;
      AV71TFHisProLot = "" ;
      AV105Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel = "" ;
      AV72TFHisProLot_Sel = "" ;
      AV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = "" ;
      AV67TFParCodNom = "" ;
      AV107Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel = "" ;
      AV68TFParCodNom_Sel = "" ;
      scmdbuf = "" ;
      lV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr = "" ;
      lV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase = "" ;
      lV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof = "" ;
      lV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot = "" ;
      lV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom = "" ;
      AV28Emprcod = "" ;
      AV29Maqcod = "" ;
      AV30HisProfec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      P096K2_A656ParCod = new short[1] ;
      P096K2_n656ParCod = new boolean[] {false} ;
      P096K2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P096K2_A602MaqCod = new String[] {""} ;
      P096K2_A867ParCodNom = new String[] {""} ;
      P096K2_n867ParCodNom = new boolean[] {false} ;
      P096K2_A3610HisProLot = new String[] {""} ;
      P096K2_A4714HisProNpzs = new short[1] ;
      P096K2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096K2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P096K2_A566HisProTur = new byte[1] ;
      P096K2_A557HisProF = new String[] {""} ;
      P096K2_A194BarOrdLin = new short[1] ;
      P096K2_A503GruOpeCod = new int[1] ;
      P096K2_A561HisProLin = new int[1] ;
      P096K2_A130BarCodPar = new String[] {""} ;
      P096K2_A132BarCodReo = new byte[1] ;
      P096K2_A129BarCod = new int[1] ;
      P096K2_A461Fase = new String[] {""} ;
      P096K2_A396EmprCod = new String[] {""} ;
      P096K2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P096K2_n4440HisProDTI = new boolean[] {false} ;
      P096K2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P096K2_n4441HisProDTF = new boolean[] {false} ;
      AV75M = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV35GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV36GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.partesdeproduccionlector_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P096K2_A656ParCod, P096K2_n656ParCod, P096K2_A558HisProFec, P096K2_A602MaqCod, P096K2_A867ParCodNom, P096K2_n867ParCodNom, P096K2_A3610HisProLot, P096K2_A4714HisProNpzs, P096K2_A1526HisProMtr, P096K2_A1525HisProKgr,
            P096K2_A566HisProTur, P096K2_A557HisProF, P096K2_A194BarOrdLin, P096K2_A503GruOpeCod, P096K2_A561HisProLin, P096K2_A130BarCodPar, P096K2_A132BarCodReo, P096K2_A129BarCod, P096K2_A461Fase, P096K2_A396EmprCod,
            P096K2_A4440HisProDTI, P096K2_n4440HisProDTI, P096K2_A4441HisProDTF, P096K2_n4441HisProDTF
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A566HisProTur ;
   private byte AV96Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ;
   private byte AV59TFHisProTur ;
   private byte AV97Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ;
   private byte AV60TFHisProTur_To ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A5605HisProTr2 ;
   private short AV86Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ;
   private short AV49TFBarOrdLin ;
   private short AV87Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ;
   private short AV50TFBarOrdLin_To ;
   private short AV102Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ;
   private short AV65TFHisProNpzs ;
   private short AV103Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ;
   private short AV66TFHisProNpzs_To ;
   private short AV108Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ;
   private short AV73TFHisProTr2 ;
   private short AV109Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ;
   private short AV74TFHisProTr2_To ;
   private short AV31OrderedBy ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV13Random ;
   private int A561HisProLin ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int AV80Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ;
   private int AV43TFHisProLin ;
   private int AV81Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ;
   private int AV44TFHisProLin_To ;
   private int AV84Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ;
   private int AV47TFGruOpeCod ;
   private int AV85Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ;
   private int AV48TFGruOpeCod_To ;
   private int AV110GXV1 ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV98Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ;
   private java.math.BigDecimal AV61TFHisProKgr ;
   private java.math.BigDecimal AV99Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV62TFHisProKgr_To ;
   private java.math.BigDecimal AV100Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ;
   private java.math.BigDecimal AV63TFHisProMtr ;
   private java.math.BigDecimal AV101Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ;
   private java.math.BigDecimal AV64TFHisProMtr_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A3610HisProLot ;
   private String A130BarCodPar ;
   private String A13696BarNHdr ;
   private String A461Fase ;
   private String A7258FaseDsc ;
   private String A557HisProF ;
   private String A867ParCodNom ;
   private String AV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ;
   private String AV45TFBarNHdr ;
   private String AV83Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ;
   private String AV46TFBarNHdr_Sel ;
   private String AV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase ;
   private String AV51TFFase ;
   private String AV89Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ;
   private String AV52TFFase_Sel ;
   private String AV90Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ;
   private String AV69TFFaseDsc ;
   private String AV91Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ;
   private String AV70TFFaseDsc_Sel ;
   private String AV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ;
   private String AV57TFHisProF ;
   private String AV95Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ;
   private String AV58TFHisProF_Sel ;
   private String AV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ;
   private String AV71TFHisProLot ;
   private String AV105Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ;
   private String AV72TFHisProLot_Sel ;
   private String AV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ;
   private String AV67TFParCodNom ;
   private String AV107Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ;
   private String AV68TFParCodNom_Sel ;
   private String scmdbuf ;
   private String lV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ;
   private String lV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase ;
   private String lV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ;
   private String lV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ;
   private String lV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ;
   private String AV28Emprcod ;
   private String AV29Maqcod ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV75M ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV92Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ;
   private java.util.Date AV53TFHisProDTI ;
   private java.util.Date AV93Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ;
   private java.util.Date AV55TFHisProDTF ;
   private java.util.Date AV30HisProfec ;
   private java.util.Date A558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV32OrderedDsc ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean AV76Seleccionar ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private short[] P096K2_A656ParCod ;
   private boolean[] P096K2_n656ParCod ;
   private java.util.Date[] P096K2_A558HisProFec ;
   private String[] P096K2_A602MaqCod ;
   private String[] P096K2_A867ParCodNom ;
   private boolean[] P096K2_n867ParCodNom ;
   private String[] P096K2_A3610HisProLot ;
   private short[] P096K2_A4714HisProNpzs ;
   private java.math.BigDecimal[] P096K2_A1526HisProMtr ;
   private java.math.BigDecimal[] P096K2_A1525HisProKgr ;
   private byte[] P096K2_A566HisProTur ;
   private String[] P096K2_A557HisProF ;
   private short[] P096K2_A194BarOrdLin ;
   private int[] P096K2_A503GruOpeCod ;
   private int[] P096K2_A561HisProLin ;
   private String[] P096K2_A130BarCodPar ;
   private byte[] P096K2_A132BarCodReo ;
   private int[] P096K2_A129BarCod ;
   private String[] P096K2_A461Fase ;
   private String[] P096K2_A396EmprCod ;
   private java.util.Date[] P096K2_A4440HisProDTI ;
   private boolean[] P096K2_n4440HisProDTI ;
   private java.util.Date[] P096K2_A4441HisProDTF ;
   private boolean[] P096K2_n4441HisProDTF ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV35GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV36GridStateFilterValue ;
}

final  class partesdeproduccionlector_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P096K2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV80Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin ,
                                          int AV81Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to ,
                                          String AV83Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel ,
                                          String AV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr ,
                                          int AV84Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod ,
                                          int AV85Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to ,
                                          short AV86Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin ,
                                          short AV87Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to ,
                                          String AV89Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel ,
                                          String AV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase ,
                                          java.util.Date AV92Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti ,
                                          java.util.Date AV93Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf ,
                                          String AV95Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel ,
                                          String AV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof ,
                                          byte AV96Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur ,
                                          byte AV97Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to ,
                                          java.math.BigDecimal AV98Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV99Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV100Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr ,
                                          java.math.BigDecimal AV101Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to ,
                                          short AV102Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs ,
                                          short AV103Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to ,
                                          String AV105Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel ,
                                          String AV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot ,
                                          String AV107Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel ,
                                          String AV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom ,
                                          short AV108Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2 ,
                                          short AV109Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A3610HisProLot ,
                                          String A867ParCodNom ,
                                          short AV31OrderedBy ,
                                          boolean AV32OrderedDsc ,
                                          String AV91Lectoroptico_partesdeproduccionlector_wcds_12_tffasedsc_sel ,
                                          String AV90Lectoroptico_partesdeproduccionlector_wcds_11_tffasedsc ,
                                          String A7258FaseDsc ,
                                          String AV28Emprcod ,
                                          String AV29Maqcod ,
                                          java.util.Date AV30HisProfec ,
                                          String A396EmprCod ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[31];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.ParCod, T1.HisProFec, T1.MaqCod, T2.ParCodNom, T1.HisProLot, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.BarOrdLin, T1.GruOpeCod," ;
      scmdbuf += " T1.HisProLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.Fase, T1.EmprCod, T1.HisProDTI, T1.HisProDTF FROM (TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod = ? and T1.HisProFec = ?)");
      if ( ! (0==AV80Lectoroptico_partesdeproduccionlector_wcds_1_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int6[3] = (byte)(1) ;
      }
      if ( ! (0==AV81Lectoroptico_partesdeproduccionlector_wcds_2_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV82Lectoroptico_partesdeproduccionlector_wcds_3_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Lectoroptico_partesdeproduccionlector_wcds_4_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (0==AV84Lectoroptico_partesdeproduccionlector_wcds_5_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( ! (0==AV85Lectoroptico_partesdeproduccionlector_wcds_6_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (0==AV86Lectoroptico_partesdeproduccionlector_wcds_7_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( ! (0==AV87Lectoroptico_partesdeproduccionlector_wcds_8_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV88Lectoroptico_partesdeproduccionlector_wcds_9_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Lectoroptico_partesdeproduccionlector_wcds_10_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV92Lectoroptico_partesdeproduccionlector_wcds_13_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV93Lectoroptico_partesdeproduccionlector_wcds_14_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV95Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV94Lectoroptico_partesdeproduccionlector_wcds_15_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV95Lectoroptico_partesdeproduccionlector_wcds_16_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (0==AV96Lectoroptico_partesdeproduccionlector_wcds_17_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV97Lectoroptico_partesdeproduccionlector_wcds_18_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Lectoroptico_partesdeproduccionlector_wcds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV99Lectoroptico_partesdeproduccionlector_wcds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV100Lectoroptico_partesdeproduccionlector_wcds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV101Lectoroptico_partesdeproduccionlector_wcds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV102Lectoroptico_partesdeproduccionlector_wcds_23_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV103Lectoroptico_partesdeproduccionlector_wcds_24_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) && ( ! (GXutil.strcmp("", AV104Lectoroptico_partesdeproduccionlector_wcds_25_tfhisprolot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProLot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Lectoroptico_partesdeproduccionlector_wcds_26_tfhisprolot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProLot = ?)");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV106Lectoroptico_partesdeproduccionlector_wcds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Lectoroptico_partesdeproduccionlector_wcds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! (0==AV108Lectoroptico_partesdeproduccionlector_wcds_29_tfhisprotr2) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( ! (0==AV109Lectoroptico_partesdeproduccionlector_wcds_30_tfhisprotr2_to) )
      {
         addWhere(sWhereString, "(( CASE  WHEN Not (T1.HisProDTF = TO_DATE('0001-01-01', 'YYYY-MM-DD')) and T1.HisProDTF > T1.HisProDTI and ( CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10))) <= 9999 THEN ROUND(CAST(FLOOR((T1.HisProDTF - CAST(T1.HisProDTI AS DATE)) * 86400) / 60 AS NUMERIC(19,10)), 0) ELSE 0 END) <= ?)");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV31OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec DESC, T1.HisProLin DESC" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLin" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLin DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProF" ;
      }
      else if ( ( AV31OrderedBy == 8 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProF DESC" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV31OrderedBy == 9 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV31OrderedBy == 10 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV31OrderedBy == 11 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV31OrderedBy == 11 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV31OrderedBy == 12 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs" ;
      }
      else if ( ( AV31OrderedBy == 12 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs DESC" ;
      }
      else if ( ( AV31OrderedBy == 13 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLot" ;
      }
      else if ( ( AV31OrderedBy == 13 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLot DESC" ;
      }
      else if ( ( AV31OrderedBy == 14 ) && ! AV32OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ParCodNom" ;
      }
      else if ( ( AV31OrderedBy == 14 ) && ( AV32OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.ParCodNom DESC" ;
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
                  return conditional_P096K2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).byteValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() , ((Boolean) dynConstraints[45]).booleanValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] , (String)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (java.util.Date)dynConstraints[54] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P096K2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((short[]) buf[12])[0] = rslt.getShort(11);
               ((int[]) buf[13])[0] = rslt.getInt(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 8);
               ((String[]) buf[19])[0] = rslt.getString(18, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(20);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[31], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[44], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[45], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[48]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[49]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               return;
      }
   }

}

