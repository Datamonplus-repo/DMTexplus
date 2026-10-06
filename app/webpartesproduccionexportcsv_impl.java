package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webpartesproduccionexportcsv_impl extends GXWebProcedure
{
   public webpartesproduccionexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WebPartesProduccionExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebPartesProduccionColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WebPartesProduccionColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion Maquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "N Hdr", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "F?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "T", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kgs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Mts", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Pcs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Paro", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV106Webpartesproduccionds_1_filterfulltext = AV102FilterFullText ;
      AV107Webpartesproduccionds_2_tfmaqcod = AV47TFMaqCod ;
      AV108Webpartesproduccionds_3_tfmaqcod_sel = AV48TFMaqCod_Sel ;
      AV109Webpartesproduccionds_4_tfmaqdsc = AV98TFMaqDsc ;
      AV110Webpartesproduccionds_5_tfmaqdsc_sel = AV99TFMaqDsc_Sel ;
      AV111Webpartesproduccionds_6_tfhisprofec = AV49TFHisProFec ;
      AV112Webpartesproduccionds_7_tfhisprolin = AV68TFHisProLin ;
      AV113Webpartesproduccionds_8_tfhisprolin_to = AV69TFHisProLin_To ;
      AV114Webpartesproduccionds_9_tfbarnhdr = AV70TFBarNHdr ;
      AV115Webpartesproduccionds_10_tfbarnhdr_sel = AV71TFBarNHdr_Sel ;
      AV116Webpartesproduccionds_11_tfgruopecod = AV72TFGruOpeCod ;
      AV117Webpartesproduccionds_12_tfgruopecod_to = AV73TFGruOpeCod_To ;
      AV118Webpartesproduccionds_13_tfbarordlin = AV74TFBarOrdLin ;
      AV119Webpartesproduccionds_14_tfbarordlin_to = AV75TFBarOrdLin_To ;
      AV120Webpartesproduccionds_15_tffase = AV76TFFase ;
      AV121Webpartesproduccionds_16_tffase_sel = AV77TFFase_Sel ;
      AV122Webpartesproduccionds_17_tfhisprodti = AV80TFHisProDTI ;
      AV123Webpartesproduccionds_18_tfhisprodtf = AV82TFHisProDTF ;
      AV124Webpartesproduccionds_19_tfhisprof = AV84TFHisProF ;
      AV125Webpartesproduccionds_20_tfhisprof_sel = AV85TFHisProF_Sel ;
      AV126Webpartesproduccionds_21_tfhisprotur = AV86TFHisProTur ;
      AV127Webpartesproduccionds_22_tfhisprotur_to = AV87TFHisProTur_To ;
      AV128Webpartesproduccionds_23_tfhisprokgr = AV88TFHisProKgr ;
      AV129Webpartesproduccionds_24_tfhisprokgr_to = AV89TFHisProKgr_To ;
      AV130Webpartesproduccionds_25_tfhispromtr = AV90TFHisProMtr ;
      AV131Webpartesproduccionds_26_tfhispromtr_to = AV91TFHisProMtr_To ;
      AV132Webpartesproduccionds_27_tfhispronpzs = AV92TFHisProNpzs ;
      AV133Webpartesproduccionds_28_tfhispronpzs_to = AV93TFHisProNpzs_To ;
      AV134Webpartesproduccionds_29_tfparcodnom = AV96TFParCodNom ;
      AV135Webpartesproduccionds_30_tfparcodnom_sel = AV97TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV106Webpartesproduccionds_1_filterfulltext ,
                                           AV108Webpartesproduccionds_3_tfmaqcod_sel ,
                                           AV107Webpartesproduccionds_2_tfmaqcod ,
                                           AV110Webpartesproduccionds_5_tfmaqdsc_sel ,
                                           AV109Webpartesproduccionds_4_tfmaqdsc ,
                                           AV111Webpartesproduccionds_6_tfhisprofec ,
                                           Integer.valueOf(AV112Webpartesproduccionds_7_tfhisprolin) ,
                                           Integer.valueOf(AV113Webpartesproduccionds_8_tfhisprolin_to) ,
                                           AV115Webpartesproduccionds_10_tfbarnhdr_sel ,
                                           AV114Webpartesproduccionds_9_tfbarnhdr ,
                                           Integer.valueOf(AV116Webpartesproduccionds_11_tfgruopecod) ,
                                           Integer.valueOf(AV117Webpartesproduccionds_12_tfgruopecod_to) ,
                                           Short.valueOf(AV118Webpartesproduccionds_13_tfbarordlin) ,
                                           Short.valueOf(AV119Webpartesproduccionds_14_tfbarordlin_to) ,
                                           AV121Webpartesproduccionds_16_tffase_sel ,
                                           AV120Webpartesproduccionds_15_tffase ,
                                           AV122Webpartesproduccionds_17_tfhisprodti ,
                                           AV123Webpartesproduccionds_18_tfhisprodtf ,
                                           AV125Webpartesproduccionds_20_tfhisprof_sel ,
                                           AV124Webpartesproduccionds_19_tfhisprof ,
                                           Byte.valueOf(AV126Webpartesproduccionds_21_tfhisprotur) ,
                                           Byte.valueOf(AV127Webpartesproduccionds_22_tfhisprotur_to) ,
                                           AV128Webpartesproduccionds_23_tfhisprokgr ,
                                           AV129Webpartesproduccionds_24_tfhisprokgr_to ,
                                           AV130Webpartesproduccionds_25_tfhispromtr ,
                                           AV131Webpartesproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV132Webpartesproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV133Webpartesproduccionds_28_tfhispronpzs_to) ,
                                           AV135Webpartesproduccionds_30_tfparcodnom_sel ,
                                           AV134Webpartesproduccionds_29_tfparcodnom ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A557HisProF ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           A867ParCodNom ,
                                           A558HisProFec ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV106Webpartesproduccionds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV106Webpartesproduccionds_1_filterfulltext), "%", "") ;
      lV107Webpartesproduccionds_2_tfmaqcod = GXutil.padr( GXutil.rtrim( AV107Webpartesproduccionds_2_tfmaqcod), 6, "%") ;
      lV109Webpartesproduccionds_4_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV109Webpartesproduccionds_4_tfmaqdsc), 16, "%") ;
      lV114Webpartesproduccionds_9_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV114Webpartesproduccionds_9_tfbarnhdr), 11, "%") ;
      lV120Webpartesproduccionds_15_tffase = GXutil.padr( GXutil.rtrim( AV120Webpartesproduccionds_15_tffase), 8, "%") ;
      lV124Webpartesproduccionds_19_tfhisprof = GXutil.padr( GXutil.rtrim( AV124Webpartesproduccionds_19_tfhisprof), 1, "%") ;
      lV134Webpartesproduccionds_29_tfparcodnom = GXutil.padr( GXutil.rtrim( AV134Webpartesproduccionds_29_tfparcodnom), 30, "%") ;
      /* Using cursor P08BD2 */
      pr_default.execute(0, new Object[] {lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV106Webpartesproduccionds_1_filterfulltext, lV107Webpartesproduccionds_2_tfmaqcod, AV108Webpartesproduccionds_3_tfmaqcod_sel, lV109Webpartesproduccionds_4_tfmaqdsc, AV110Webpartesproduccionds_5_tfmaqdsc_sel, AV111Webpartesproduccionds_6_tfhisprofec, Integer.valueOf(AV112Webpartesproduccionds_7_tfhisprolin), Integer.valueOf(AV113Webpartesproduccionds_8_tfhisprolin_to), lV114Webpartesproduccionds_9_tfbarnhdr, AV115Webpartesproduccionds_10_tfbarnhdr_sel, Integer.valueOf(AV116Webpartesproduccionds_11_tfgruopecod), Integer.valueOf(AV117Webpartesproduccionds_12_tfgruopecod_to), Short.valueOf(AV118Webpartesproduccionds_13_tfbarordlin), Short.valueOf(AV119Webpartesproduccionds_14_tfbarordlin_to), lV120Webpartesproduccionds_15_tffase, AV121Webpartesproduccionds_16_tffase_sel, AV122Webpartesproduccionds_17_tfhisprodti, AV123Webpartesproduccionds_18_tfhisprodtf, lV124Webpartesproduccionds_19_tfhisprof, AV125Webpartesproduccionds_20_tfhisprof_sel, Byte.valueOf(AV126Webpartesproduccionds_21_tfhisprotur), Byte.valueOf(AV127Webpartesproduccionds_22_tfhisprotur_to), AV128Webpartesproduccionds_23_tfhisprokgr, AV129Webpartesproduccionds_24_tfhisprokgr_to, AV130Webpartesproduccionds_25_tfhispromtr, AV131Webpartesproduccionds_26_tfhispromtr_to, Short.valueOf(AV132Webpartesproduccionds_27_tfhispronpzs), Short.valueOf(AV133Webpartesproduccionds_28_tfhispronpzs_to), lV134Webpartesproduccionds_29_tfparcodnom, AV135Webpartesproduccionds_30_tfparcodnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P08BD2_A396EmprCod[0] ;
         A656ParCod = P08BD2_A656ParCod[0] ;
         n656ParCod = P08BD2_n656ParCod[0] ;
         A867ParCodNom = P08BD2_A867ParCodNom[0] ;
         n867ParCodNom = P08BD2_n867ParCodNom[0] ;
         A4714HisProNpzs = P08BD2_A4714HisProNpzs[0] ;
         A1526HisProMtr = P08BD2_A1526HisProMtr[0] ;
         A1525HisProKgr = P08BD2_A1525HisProKgr[0] ;
         A566HisProTur = P08BD2_A566HisProTur[0] ;
         A557HisProF = P08BD2_A557HisProF[0] ;
         A4441HisProDTF = P08BD2_A4441HisProDTF[0] ;
         n4441HisProDTF = P08BD2_n4441HisProDTF[0] ;
         A4440HisProDTI = P08BD2_A4440HisProDTI[0] ;
         n4440HisProDTI = P08BD2_n4440HisProDTI[0] ;
         A461Fase = P08BD2_A461Fase[0] ;
         A194BarOrdLin = P08BD2_A194BarOrdLin[0] ;
         A503GruOpeCod = P08BD2_A503GruOpeCod[0] ;
         A561HisProLin = P08BD2_A561HisProLin[0] ;
         A558HisProFec = P08BD2_A558HisProFec[0] ;
         A606MaqDsc = P08BD2_A606MaqDsc[0] ;
         n606MaqDsc = P08BD2_n606MaqDsc[0] ;
         A602MaqCod = P08BD2_A602MaqCod[0] ;
         A130BarCodPar = P08BD2_A130BarCodPar[0] ;
         A132BarCodReo = P08BD2_A132BarCodReo[0] ;
         A129BarCod = P08BD2_A129BarCod[0] ;
         A867ParCodNom = P08BD2_A867ParCodNom[0] ;
         n867ParCodNom = P08BD2_n867ParCodNom[0] ;
         A606MaqDsc = P08BD2_A606MaqDsc[0] ;
         n606MaqDsc = P08BD2_n606MaqDsc[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV14TextFileLine = "" ;
         /* Execute user subroutine: 'BEFOREWRITELINE' */
         S162 ();
         if ( returnInSub )
         {
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char3) ;
            webpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A606MaqDsc, ";", ","), GXv_char3) ;
            webpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A558HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A561HisProLin, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A13696BarNHdr, ";", ","), GXv_char3) ;
            webpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A503GruOpeCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A194BarOrdLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A461Fase, ";", ","), GXv_char3) ;
            webpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            webpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A867ParCodNom, ";", ","), GXv_char3) ;
            webpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         /* Execute user subroutine: 'AFTERWRITELINE' */
         S172 ();
         if ( returnInSub )
         {
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WebPartesProduccionExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCod", "", "Código Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqDsc", "", "Descripcion Maquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProLin", "", "#", true, "") ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParCodNom", "", "Paro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebPartesProduccionColumnsSelector", GXv_char3) ;
      webpartesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WebPartesProduccionGridState"), "") == 0 )
      {
         AV43GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WebPartesProduccionGridState"), null, null);
      }
      else
      {
         AV43GridState.fromxml(AV19Session.getValue("WebPartesProduccionGridState"), null, null);
      }
      AV28OrderedBy = AV43GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV43GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV136GXV1 = 1 ;
      while ( AV136GXV1 <= AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV44GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV43GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV136GXV1));
         if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV102FilterFullText = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV47TFMaqCod = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV48TFMaqCod_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV98TFMaqDsc = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV99TFMaqDsc_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV49TFHisProFec = localUtil.ctod( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV68TFHisProLin = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV69TFHisProLin_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV70TFBarNHdr = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV71TFBarNHdr_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV72TFGruOpeCod = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV73TFGruOpeCod_To = (int)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV74TFBarOrdLin = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV75TFBarOrdLin_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV76TFFase = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV77TFFase_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV80TFHisProDTI = localUtil.ctot( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV82TFHisProDTF = localUtil.ctot( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV84TFHisProF = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV85TFHisProF_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV86TFHisProTur = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV87TFHisProTur_To = (byte)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV88TFHisProKgr = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV89TFHisProKgr_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV90TFHisProMtr = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV91TFHisProMtr_To = CommonUtil.decimalVal( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV92TFHisProNpzs = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV93TFHisProNpzs_To = (short)(GXutil.lval( AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV96TFParCodNom = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV97TFParCodNom_Sel = AV44GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV136GXV1 = (int)(AV136GXV1+1) ;
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
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A461Fase = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A867ParCodNom = "" ;
      AV106Webpartesproduccionds_1_filterfulltext = "" ;
      AV102FilterFullText = "" ;
      AV107Webpartesproduccionds_2_tfmaqcod = "" ;
      AV47TFMaqCod = "" ;
      AV108Webpartesproduccionds_3_tfmaqcod_sel = "" ;
      AV48TFMaqCod_Sel = "" ;
      AV109Webpartesproduccionds_4_tfmaqdsc = "" ;
      AV98TFMaqDsc = "" ;
      AV110Webpartesproduccionds_5_tfmaqdsc_sel = "" ;
      AV99TFMaqDsc_Sel = "" ;
      AV111Webpartesproduccionds_6_tfhisprofec = GXutil.nullDate() ;
      AV49TFHisProFec = GXutil.nullDate() ;
      AV114Webpartesproduccionds_9_tfbarnhdr = "" ;
      AV70TFBarNHdr = "" ;
      AV115Webpartesproduccionds_10_tfbarnhdr_sel = "" ;
      AV71TFBarNHdr_Sel = "" ;
      AV120Webpartesproduccionds_15_tffase = "" ;
      AV76TFFase = "" ;
      AV121Webpartesproduccionds_16_tffase_sel = "" ;
      AV77TFFase_Sel = "" ;
      AV122Webpartesproduccionds_17_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV80TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV123Webpartesproduccionds_18_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV82TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV124Webpartesproduccionds_19_tfhisprof = "" ;
      AV84TFHisProF = "" ;
      AV125Webpartesproduccionds_20_tfhisprof_sel = "" ;
      AV85TFHisProF_Sel = "" ;
      AV128Webpartesproduccionds_23_tfhisprokgr = DecimalUtil.ZERO ;
      AV88TFHisProKgr = DecimalUtil.ZERO ;
      AV129Webpartesproduccionds_24_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV89TFHisProKgr_To = DecimalUtil.ZERO ;
      AV130Webpartesproduccionds_25_tfhispromtr = DecimalUtil.ZERO ;
      AV90TFHisProMtr = DecimalUtil.ZERO ;
      AV131Webpartesproduccionds_26_tfhispromtr_to = DecimalUtil.ZERO ;
      AV91TFHisProMtr_To = DecimalUtil.ZERO ;
      AV134Webpartesproduccionds_29_tfparcodnom = "" ;
      AV96TFParCodNom = "" ;
      AV135Webpartesproduccionds_30_tfparcodnom_sel = "" ;
      AV97TFParCodNom_Sel = "" ;
      scmdbuf = "" ;
      lV106Webpartesproduccionds_1_filterfulltext = "" ;
      lV107Webpartesproduccionds_2_tfmaqcod = "" ;
      lV109Webpartesproduccionds_4_tfmaqdsc = "" ;
      lV114Webpartesproduccionds_9_tfbarnhdr = "" ;
      lV120Webpartesproduccionds_15_tffase = "" ;
      lV124Webpartesproduccionds_19_tfhisprof = "" ;
      lV134Webpartesproduccionds_29_tfparcodnom = "" ;
      A130BarCodPar = "" ;
      P08BD2_A396EmprCod = new String[] {""} ;
      P08BD2_A656ParCod = new short[1] ;
      P08BD2_n656ParCod = new boolean[] {false} ;
      P08BD2_A867ParCodNom = new String[] {""} ;
      P08BD2_n867ParCodNom = new boolean[] {false} ;
      P08BD2_A4714HisProNpzs = new short[1] ;
      P08BD2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BD2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08BD2_A566HisProTur = new byte[1] ;
      P08BD2_A557HisProF = new String[] {""} ;
      P08BD2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08BD2_n4441HisProDTF = new boolean[] {false} ;
      P08BD2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08BD2_n4440HisProDTI = new boolean[] {false} ;
      P08BD2_A461Fase = new String[] {""} ;
      P08BD2_A194BarOrdLin = new short[1] ;
      P08BD2_A503GruOpeCod = new int[1] ;
      P08BD2_A561HisProLin = new int[1] ;
      P08BD2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08BD2_A606MaqDsc = new String[] {""} ;
      P08BD2_n606MaqDsc = new boolean[] {false} ;
      P08BD2_A602MaqCod = new String[] {""} ;
      P08BD2_A130BarCodPar = new String[] {""} ;
      P08BD2_A132BarCodReo = new byte[1] ;
      P08BD2_A129BarCod = new int[1] ;
      A396EmprCod = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV43GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV44GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webpartesproduccionexportcsv__default(),
         new Object[] {
             new Object[] {
            P08BD2_A396EmprCod, P08BD2_A656ParCod, P08BD2_n656ParCod, P08BD2_A867ParCodNom, P08BD2_n867ParCodNom, P08BD2_A4714HisProNpzs, P08BD2_A1526HisProMtr, P08BD2_A1525HisProKgr, P08BD2_A566HisProTur, P08BD2_A557HisProF,
            P08BD2_A4441HisProDTF, P08BD2_n4441HisProDTF, P08BD2_A4440HisProDTI, P08BD2_n4440HisProDTI, P08BD2_A461Fase, P08BD2_A194BarOrdLin, P08BD2_A503GruOpeCod, P08BD2_A561HisProLin, P08BD2_A558HisProFec, P08BD2_A606MaqDsc,
            P08BD2_n606MaqDsc, P08BD2_A602MaqCod, P08BD2_A130BarCodPar, P08BD2_A132BarCodReo, P08BD2_A129BarCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A566HisProTur ;
   private byte AV126Webpartesproduccionds_21_tfhisprotur ;
   private byte AV86TFHisProTur ;
   private byte AV127Webpartesproduccionds_22_tfhisprotur_to ;
   private byte AV87TFHisProTur_To ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short AV118Webpartesproduccionds_13_tfbarordlin ;
   private short AV74TFBarOrdLin ;
   private short AV119Webpartesproduccionds_14_tfbarordlin_to ;
   private short AV75TFBarOrdLin_To ;
   private short AV132Webpartesproduccionds_27_tfhispronpzs ;
   private short AV92TFHisProNpzs ;
   private short AV133Webpartesproduccionds_28_tfhispronpzs_to ;
   private short AV93TFHisProNpzs_To ;
   private short AV28OrderedBy ;
   private short A656ParCod ;
   private short Gx_err ;
   private int AV13Random ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int AV112Webpartesproduccionds_7_tfhisprolin ;
   private int AV68TFHisProLin ;
   private int AV113Webpartesproduccionds_8_tfhisprolin_to ;
   private int AV69TFHisProLin_To ;
   private int AV116Webpartesproduccionds_11_tfgruopecod ;
   private int AV72TFGruOpeCod ;
   private int AV117Webpartesproduccionds_12_tfgruopecod_to ;
   private int AV73TFGruOpeCod_To ;
   private int A129BarCod ;
   private int AV136GXV1 ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV128Webpartesproduccionds_23_tfhisprokgr ;
   private java.math.BigDecimal AV88TFHisProKgr ;
   private java.math.BigDecimal AV129Webpartesproduccionds_24_tfhisprokgr_to ;
   private java.math.BigDecimal AV89TFHisProKgr_To ;
   private java.math.BigDecimal AV130Webpartesproduccionds_25_tfhispromtr ;
   private java.math.BigDecimal AV90TFHisProMtr ;
   private java.math.BigDecimal AV131Webpartesproduccionds_26_tfhispromtr_to ;
   private java.math.BigDecimal AV91TFHisProMtr_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A13696BarNHdr ;
   private String A461Fase ;
   private String A557HisProF ;
   private String A867ParCodNom ;
   private String AV107Webpartesproduccionds_2_tfmaqcod ;
   private String AV47TFMaqCod ;
   private String AV108Webpartesproduccionds_3_tfmaqcod_sel ;
   private String AV48TFMaqCod_Sel ;
   private String AV109Webpartesproduccionds_4_tfmaqdsc ;
   private String AV98TFMaqDsc ;
   private String AV110Webpartesproduccionds_5_tfmaqdsc_sel ;
   private String AV99TFMaqDsc_Sel ;
   private String AV114Webpartesproduccionds_9_tfbarnhdr ;
   private String AV70TFBarNHdr ;
   private String AV115Webpartesproduccionds_10_tfbarnhdr_sel ;
   private String AV71TFBarNHdr_Sel ;
   private String AV120Webpartesproduccionds_15_tffase ;
   private String AV76TFFase ;
   private String AV121Webpartesproduccionds_16_tffase_sel ;
   private String AV77TFFase_Sel ;
   private String AV124Webpartesproduccionds_19_tfhisprof ;
   private String AV84TFHisProF ;
   private String AV125Webpartesproduccionds_20_tfhisprof_sel ;
   private String AV85TFHisProF_Sel ;
   private String AV134Webpartesproduccionds_29_tfparcodnom ;
   private String AV96TFParCodNom ;
   private String AV135Webpartesproduccionds_30_tfparcodnom_sel ;
   private String AV97TFParCodNom_Sel ;
   private String scmdbuf ;
   private String lV107Webpartesproduccionds_2_tfmaqcod ;
   private String lV109Webpartesproduccionds_4_tfmaqdsc ;
   private String lV114Webpartesproduccionds_9_tfbarnhdr ;
   private String lV120Webpartesproduccionds_15_tffase ;
   private String lV124Webpartesproduccionds_19_tfhisprof ;
   private String lV134Webpartesproduccionds_29_tfparcodnom ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV122Webpartesproduccionds_17_tfhisprodti ;
   private java.util.Date AV80TFHisProDTI ;
   private java.util.Date AV123Webpartesproduccionds_18_tfhisprodtf ;
   private java.util.Date AV82TFHisProDTF ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV111Webpartesproduccionds_6_tfhisprofec ;
   private java.util.Date AV49TFHisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n656ParCod ;
   private boolean n867ParCodNom ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n606MaqDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV106Webpartesproduccionds_1_filterfulltext ;
   private String AV102FilterFullText ;
   private String lV106Webpartesproduccionds_1_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P08BD2_A396EmprCod ;
   private short[] P08BD2_A656ParCod ;
   private boolean[] P08BD2_n656ParCod ;
   private String[] P08BD2_A867ParCodNom ;
   private boolean[] P08BD2_n867ParCodNom ;
   private short[] P08BD2_A4714HisProNpzs ;
   private java.math.BigDecimal[] P08BD2_A1526HisProMtr ;
   private java.math.BigDecimal[] P08BD2_A1525HisProKgr ;
   private byte[] P08BD2_A566HisProTur ;
   private String[] P08BD2_A557HisProF ;
   private java.util.Date[] P08BD2_A4441HisProDTF ;
   private boolean[] P08BD2_n4441HisProDTF ;
   private java.util.Date[] P08BD2_A4440HisProDTI ;
   private boolean[] P08BD2_n4440HisProDTI ;
   private String[] P08BD2_A461Fase ;
   private short[] P08BD2_A194BarOrdLin ;
   private int[] P08BD2_A503GruOpeCod ;
   private int[] P08BD2_A561HisProLin ;
   private java.util.Date[] P08BD2_A558HisProFec ;
   private String[] P08BD2_A606MaqDsc ;
   private boolean[] P08BD2_n606MaqDsc ;
   private String[] P08BD2_A602MaqCod ;
   private String[] P08BD2_A130BarCodPar ;
   private byte[] P08BD2_A132BarCodReo ;
   private int[] P08BD2_A129BarCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV43GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV44GridStateFilterValue ;
}

final  class webpartesproduccionexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08BD2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV106Webpartesproduccionds_1_filterfulltext ,
                                          String AV108Webpartesproduccionds_3_tfmaqcod_sel ,
                                          String AV107Webpartesproduccionds_2_tfmaqcod ,
                                          String AV110Webpartesproduccionds_5_tfmaqdsc_sel ,
                                          String AV109Webpartesproduccionds_4_tfmaqdsc ,
                                          java.util.Date AV111Webpartesproduccionds_6_tfhisprofec ,
                                          int AV112Webpartesproduccionds_7_tfhisprolin ,
                                          int AV113Webpartesproduccionds_8_tfhisprolin_to ,
                                          String AV115Webpartesproduccionds_10_tfbarnhdr_sel ,
                                          String AV114Webpartesproduccionds_9_tfbarnhdr ,
                                          int AV116Webpartesproduccionds_11_tfgruopecod ,
                                          int AV117Webpartesproduccionds_12_tfgruopecod_to ,
                                          short AV118Webpartesproduccionds_13_tfbarordlin ,
                                          short AV119Webpartesproduccionds_14_tfbarordlin_to ,
                                          String AV121Webpartesproduccionds_16_tffase_sel ,
                                          String AV120Webpartesproduccionds_15_tffase ,
                                          java.util.Date AV122Webpartesproduccionds_17_tfhisprodti ,
                                          java.util.Date AV123Webpartesproduccionds_18_tfhisprodtf ,
                                          String AV125Webpartesproduccionds_20_tfhisprof_sel ,
                                          String AV124Webpartesproduccionds_19_tfhisprof ,
                                          byte AV126Webpartesproduccionds_21_tfhisprotur ,
                                          byte AV127Webpartesproduccionds_22_tfhisprotur_to ,
                                          java.math.BigDecimal AV128Webpartesproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV129Webpartesproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV130Webpartesproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV131Webpartesproduccionds_26_tfhispromtr_to ,
                                          short AV132Webpartesproduccionds_27_tfhispronpzs ,
                                          short AV133Webpartesproduccionds_28_tfhispronpzs_to ,
                                          String AV135Webpartesproduccionds_30_tfparcodnom_sel ,
                                          String AV134Webpartesproduccionds_29_tfparcodnom ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A561HisProLin ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A503GruOpeCod ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A557HisProF ,
                                          byte A566HisProTur ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          String A867ParCodNom ,
                                          java.util.Date A558HisProFec ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[42];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.ParCod, T2.ParCodNom, T1.HisProNpzs, T1.HisProMtr, T1.HisProKgr, T1.HisProTur, T1.HisProF, T1.HisProDTF, T1.HisProDTI, T1.Fase, T1.BarOrdLin," ;
      scmdbuf += " T1.GruOpeCod, T1.HisProLin, T1.HisProFec, T3.MaqDsc, T1.MaqCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPLHIPRO T1 LEFT JOIN TXPCODPAR T2 ON T2.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T2.ParCod = T1.ParCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = T1.EmprCod AND T3.MaqCod = T1.MaqCod)" ;
      if ( ! (GXutil.strcmp("", AV106Webpartesproduccionds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(T3.MaqDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProLin,'99999990'), 2) like '%' || ?) or ( UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.GruOpeCod,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarOrdLin,'9990'), 2) like '%' || ?) or ( UPPER(T1.Fase) like '%' || UPPER(?)) or ( UPPER(T1.HisProF) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProTur,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProNpzs,'9990'), 2) like '%' || ?) or ( UPPER(T2.ParCodNom) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int6[0] = (byte)(1) ;
         GXv_int6[1] = (byte)(1) ;
         GXv_int6[2] = (byte)(1) ;
         GXv_int6[3] = (byte)(1) ;
         GXv_int6[4] = (byte)(1) ;
         GXv_int6[5] = (byte)(1) ;
         GXv_int6[6] = (byte)(1) ;
         GXv_int6[7] = (byte)(1) ;
         GXv_int6[8] = (byte)(1) ;
         GXv_int6[9] = (byte)(1) ;
         GXv_int6[10] = (byte)(1) ;
         GXv_int6[11] = (byte)(1) ;
         GXv_int6[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Webpartesproduccionds_3_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV107Webpartesproduccionds_2_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Webpartesproduccionds_3_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Webpartesproduccionds_5_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV109Webpartesproduccionds_4_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Webpartesproduccionds_5_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111Webpartesproduccionds_6_tfhisprofec)) )
      {
         addWhere(sWhereString, "(T1.HisProFec >= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Webpartesproduccionds_7_tfhisprolin) )
      {
         addWhere(sWhereString, "(T1.HisProLin >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Webpartesproduccionds_8_tfhisprolin_to) )
      {
         addWhere(sWhereString, "(T1.HisProLin <= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Webpartesproduccionds_10_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV114Webpartesproduccionds_9_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Webpartesproduccionds_10_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( ! (0==AV116Webpartesproduccionds_11_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (0==AV117Webpartesproduccionds_12_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      if ( ! (0==AV118Webpartesproduccionds_13_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[24] = (byte)(1) ;
      }
      if ( ! (0==AV119Webpartesproduccionds_14_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Webpartesproduccionds_16_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV120Webpartesproduccionds_15_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Webpartesproduccionds_16_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int6[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV122Webpartesproduccionds_17_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int6[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV123Webpartesproduccionds_18_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Webpartesproduccionds_20_tfhisprof_sel)==0) && ( ! (GXutil.strcmp("", AV124Webpartesproduccionds_19_tfhisprof)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Webpartesproduccionds_20_tfhisprof_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProF = ?)");
      }
      else
      {
         GXv_int6[31] = (byte)(1) ;
      }
      if ( ! (0==AV126Webpartesproduccionds_21_tfhisprotur) )
      {
         addWhere(sWhereString, "(T1.HisProTur >= ?)");
      }
      else
      {
         GXv_int6[32] = (byte)(1) ;
      }
      if ( ! (0==AV127Webpartesproduccionds_22_tfhisprotur_to) )
      {
         addWhere(sWhereString, "(T1.HisProTur <= ?)");
      }
      else
      {
         GXv_int6[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Webpartesproduccionds_23_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int6[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Webpartesproduccionds_24_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int6[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Webpartesproduccionds_25_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int6[36] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Webpartesproduccionds_26_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int6[37] = (byte)(1) ;
      }
      if ( ! (0==AV132Webpartesproduccionds_27_tfhispronpzs) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs >= ?)");
      }
      else
      {
         GXv_int6[38] = (byte)(1) ;
      }
      if ( ! (0==AV133Webpartesproduccionds_28_tfhispronpzs_to) )
      {
         addWhere(sWhereString, "(T1.HisProNpzs <= ?)");
      }
      else
      {
         GXv_int6[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Webpartesproduccionds_30_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV134Webpartesproduccionds_29_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Webpartesproduccionds_30_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ParCodNom = ?)");
      }
      else
      {
         GXv_int6[41] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProFec" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProFec DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProLin" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GruOpeCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.Fase" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.Fase DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTI" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTI DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProF" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProF DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProTur" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProTur DESC" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV28OrderedBy == 12 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV28OrderedBy == 13 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs" ;
      }
      else if ( ( AV28OrderedBy == 14 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.HisProNpzs DESC" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.ParCodNom" ;
      }
      else if ( ( AV28OrderedBy == 15 ) && ( AV29OrderedDsc ) )
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
                  return conditional_P08BD2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).shortValue() , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).byteValue() , (java.math.BigDecimal)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , (String)dynConstraints[44] , (java.util.Date)dynConstraints[45] , (java.util.Date)dynConstraints[46] , (java.util.Date)dynConstraints[47] , ((Number) dynConstraints[48]).shortValue() , ((Boolean) dynConstraints[49]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08BD2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 8);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((int[]) buf[16])[0] = rslt.getInt(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(17, 6);
               ((String[]) buf[22])[0] = rslt.getString(18, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(19);
               ((int[]) buf[24])[0] = rslt.getInt(20);
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
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[59]);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 11);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 11);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 8);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 8);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[70], false);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[71], false);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 1);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[75]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[76], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[78], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 30);
               }
               return;
      }
   }

}

