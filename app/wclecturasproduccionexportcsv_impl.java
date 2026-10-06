package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wclecturasproduccionexportcsv_impl extends GXWebProcedure
{
   public wclecturasproduccionexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV11Filename = "./PrivateTempStorage/" + "WCLecturasProduccionExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCLecturasProduccionColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("WCLecturasProduccionColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fecha", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Linea", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Turno", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "F?", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "kgs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "mts", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "pcs", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Paro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV74Wclecturasproduccionds_1_emprcod = AV28Emprcod ;
      AV75Wclecturasproduccionds_2_barcod = AV29Barcod ;
      AV76Wclecturasproduccionds_3_barcodreo = AV30Barcodreo ;
      AV77Wclecturasproduccionds_4_barcodpar = AV31BarCodpar ;
      AV78Wclecturasproduccionds_5_filterfulltext = AV34FilterFullText ;
      AV79Wclecturasproduccionds_6_tfmaqcod = AV39TFMaqCod ;
      AV80Wclecturasproduccionds_7_tfmaqcod_sel = AV40TFMaqCod_Sel ;
      AV81Wclecturasproduccionds_8_tfhisprofec = AV41TFHisProFec ;
      AV82Wclecturasproduccionds_9_tfhisprolin = AV43TFHisProLin ;
      AV83Wclecturasproduccionds_10_tfhisprolin_to = AV44TFHisProLin_To ;
      AV84Wclecturasproduccionds_11_tfbarordlin = AV45TFBarOrdLin ;
      AV85Wclecturasproduccionds_12_tfbarordlin_to = AV46TFBarOrdLin_To ;
      AV86Wclecturasproduccionds_13_tffase = AV47TFFase ;
      AV87Wclecturasproduccionds_14_tffase_sel = AV48TFFase_Sel ;
      AV88Wclecturasproduccionds_15_tffasedsc = AV49TFFaseDsc ;
      AV89Wclecturasproduccionds_16_tffasedsc_sel = AV50TFFaseDsc_Sel ;
      AV90Wclecturasproduccionds_17_tfhisprotur = AV51TFHisProTur ;
      AV91Wclecturasproduccionds_18_tfhisprotur_to = AV52TFHisProTur_To ;
      AV92Wclecturasproduccionds_19_tfhisprof = AV53TFHisProF ;
      AV93Wclecturasproduccionds_20_tfhisprof_sel = AV54TFHisProF_Sel ;
      AV94Wclecturasproduccionds_21_tfhisprodti = AV55TFHisProDTI ;
      AV95Wclecturasproduccionds_22_tfhisprodtf = AV57TFHisProDTF ;
      AV96Wclecturasproduccionds_23_tfhisprokgr = AV59TFHisProKgr ;
      AV97Wclecturasproduccionds_24_tfhisprokgr_to = AV60TFHisProKgr_To ;
      AV98Wclecturasproduccionds_25_tfhispromtr = AV61TFHisProMtr ;
      AV99Wclecturasproduccionds_26_tfhispromtr_to = AV62TFHisProMtr_To ;
      AV100Wclecturasproduccionds_27_tfhispronpzs = AV63TFHisProNpzs ;
      AV101Wclecturasproduccionds_28_tfhispronpzs_to = AV64TFHisProNpzs_To ;
      AV102Wclecturasproduccionds_29_tfgruopecod = AV65TFGruOpeCod ;
      AV103Wclecturasproduccionds_30_tfgruopecod_to = AV66TFGruOpeCod_To ;
      AV104Wclecturasproduccionds_31_tfparcod = AV67TFParCod ;
      AV105Wclecturasproduccionds_32_tfparcod_to = AV68TFParCod_To ;
      AV106Wclecturasproduccionds_33_tfparcodnom = AV69TFParCodNom ;
      AV107Wclecturasproduccionds_34_tfparcodnom_sel = AV70TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV80Wclecturasproduccionds_7_tfmaqcod_sel ,
                                           AV79Wclecturasproduccionds_6_tfmaqcod ,
                                           AV81Wclecturasproduccionds_8_tfhisprofec ,
                                           Integer.valueOf(AV82Wclecturasproduccionds_9_tfhisprolin) ,
                                           Integer.valueOf(AV83Wclecturasproduccionds_10_tfhisprolin_to) ,
                                           Short.valueOf(AV84Wclecturasproduccionds_11_tfbarordlin) ,
                                           Short.valueOf(AV85Wclecturasproduccionds_12_tfbarordlin_to) ,
                                           AV87Wclecturasproduccionds_14_tffase_sel ,
                                           AV86Wclecturasproduccionds_13_tffase ,
                                           Byte.valueOf(AV90Wclecturasproduccionds_17_tfhisprotur) ,
                                           Byte.valueOf(AV91Wclecturasproduccionds_18_tfhisprotur_to) ,
                                           AV93Wclecturasproduccionds_20_tfhisprof_sel ,
                                           AV92Wclecturasproduccionds_19_tfhisprof ,
                                           AV94Wclecturasproduccionds_21_tfhisprodti ,
                                           AV95Wclecturasproduccionds_22_tfhisprodtf ,
                                           AV96Wclecturasproduccionds_23_tfhisprokgr ,
                                           AV97Wclecturasproduccionds_24_tfhisprokgr_to ,
                                           AV98Wclecturasproduccionds_25_tfhispromtr ,
                                           AV99Wclecturasproduccionds_26_tfhispromtr_to ,
                                           Short.valueOf(AV100Wclecturasproduccionds_27_tfhispronpzs) ,
                                           Short.valueOf(AV101Wclecturasproduccionds_28_tfhispronpzs_to) ,
                                           Integer.valueOf(AV102Wclecturasproduccionds_29_tfgruopecod) ,
                                           Integer.valueOf(AV103Wclecturasproduccionds_30_tfgruopecod_to) ,
                                           Short.valueOf(AV104Wclecturasproduccionds_31_tfparcod) ,
                                           Short.valueOf(AV105Wclecturasproduccionds_32_tfparcod_to) ,
                                           AV107Wclecturasproduccionds_34_tfparcodnom_sel ,
                                           AV106Wclecturasproduccionds_33_tfparcodnom ,
                                           A602MaqCod ,
                                           A558HisProFec ,
                                           Integer.valueOf(A561HisProLin) ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           Byte.valueOf(A566HisProTur) ,
                                           A557HisProF ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           Short.valueOf(A4714HisProNpzs) ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV32OrderedBy) ,
                                           Boolean.valueOf(AV33OrderedDsc) ,
                                           AV78Wclecturasproduccionds_5_filterfulltext ,
                                           A7258FaseDsc ,
                                           AV89Wclecturasproduccionds_16_tffasedsc_sel ,
                                           AV88Wclecturasproduccionds_15_tffasedsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV75Wclecturasproduccionds_2_barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV76Wclecturasproduccionds_3_barcodreo) ,
                                           A130BarCodPar ,
                                           AV77Wclecturasproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           AV28Emprcod ,
                                           Integer.valueOf(AV29Barcod) ,
                                           Byte.valueOf(AV30Barcodreo) ,
                                           AV31BarCodpar ,
                                           AV74Wclecturasproduccionds_1_emprcod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV78Wclecturasproduccionds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV78Wclecturasproduccionds_5_filterfulltext), "%", "") ;
      lV88Wclecturasproduccionds_15_tffasedsc = GXutil.padr( GXutil.rtrim( AV88Wclecturasproduccionds_15_tffasedsc), 28, "%") ;
      lV79Wclecturasproduccionds_6_tfmaqcod = GXutil.padr( GXutil.rtrim( AV79Wclecturasproduccionds_6_tfmaqcod), 6, "%") ;
      /* Using cursor P08UP2 */
      pr_default.execute(0, new Object[] {AV74Wclecturasproduccionds_1_emprcod, AV78Wclecturasproduccionds_5_filterfulltext, lV78Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A561HisProLin), lV78Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A194BarOrdLin), lV78Wclecturasproduccionds_5_filterfulltext, A461Fase, lV78Wclecturasproduccionds_5_filterfulltext, A7258FaseDsc, lV78Wclecturasproduccionds_5_filterfulltext, Byte.valueOf(A566HisProTur), lV78Wclecturasproduccionds_5_filterfulltext, A557HisProF, lV78Wclecturasproduccionds_5_filterfulltext, A1525HisProKgr, lV78Wclecturasproduccionds_5_filterfulltext, A1526HisProMtr, lV78Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A4714HisProNpzs), lV78Wclecturasproduccionds_5_filterfulltext, Integer.valueOf(A503GruOpeCod), lV78Wclecturasproduccionds_5_filterfulltext, Short.valueOf(A656ParCod), lV78Wclecturasproduccionds_5_filterfulltext, A867ParCodNom, lV78Wclecturasproduccionds_5_filterfulltext, AV89Wclecturasproduccionds_16_tffasedsc_sel, AV88Wclecturasproduccionds_15_tffasedsc, A7258FaseDsc, lV88Wclecturasproduccionds_15_tffasedsc, AV89Wclecturasproduccionds_16_tffasedsc_sel, A7258FaseDsc, AV89Wclecturasproduccionds_16_tffasedsc_sel, Integer.valueOf(A129BarCod), Integer.valueOf(AV75Wclecturasproduccionds_2_barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV76Wclecturasproduccionds_3_barcodreo), A130BarCodPar, AV77Wclecturasproduccionds_4_barcodpar, AV28Emprcod, Integer.valueOf(A129BarCod), Integer.valueOf(AV29Barcod), Byte.valueOf(A132BarCodReo), Byte.valueOf(AV30Barcodreo), A130BarCodPar, AV31BarCodpar, lV79Wclecturasproduccionds_6_tfmaqcod, AV80Wclecturasproduccionds_7_tfmaqcod_sel, AV81Wclecturasproduccionds_8_tfhisprofec});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A558HisProFec = P08UP2_A558HisProFec[0] ;
         A602MaqCod = P08UP2_A602MaqCod[0] ;
         A396EmprCod = P08UP2_A396EmprCod[0] ;
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
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char3) ;
            wclecturasproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += localUtil.dtoc( A558HisProFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A561HisProLin, 8, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A194BarOrdLin, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A461Fase, ";", ","), GXv_char3) ;
            wclecturasproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A7258FaseDsc, ";", ","), GXv_char3) ;
            wclecturasproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A566HisProTur, 1, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A557HisProF, ";", ","), GXv_char3) ;
            wclecturasproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV14TextFileLine += GXutil.str( A1525HisProKgr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1526HisProMtr, 9, 2) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A4714HisProNpzs, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A503GruOpeCod, 6, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            GXt_char2 = AV35OpeNom ;
            GXv_char3[0] = GXt_char2 ;
            new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char3) ;
            wclecturasproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV35OpeNom = GXt_char2 ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV35OpeNom, ";", ","), GXv_char3) ;
            wclecturasproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A656ParCod, 4, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A867ParCodNom, ";", ","), GXv_char3) ;
            wclecturasproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=WCLecturasProduccionExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProFec", "", "Fecha", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProLin", "", "Linea", true, "") ;
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProTur", "", "Turno", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProF", "", "F?", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTI", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTF", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProKgr", "", "kgs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProMtr", "", "mts", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProNpzs", "", "pcs", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GruOpeCod", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "&OpeNom", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParCod", "", "Paro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParCodNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCLecturasProduccionColumnsSelector", GXv_char3) ;
      wclecturasproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("WCLecturasProduccionGridState"), "") == 0 )
      {
         AV37GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "WCLecturasProduccionGridState"), null, null);
      }
      else
      {
         AV37GridState.fromxml(AV19Session.getValue("WCLecturasProduccionGridState"), null, null);
      }
      AV32OrderedBy = AV37GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV33OrderedDsc = AV37GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV108GXV1 = 1 ;
      while ( AV108GXV1 <= AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV38GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV37GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV108GXV1));
         if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV39TFMaqCod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV40TFMaqCod_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROFEC") == 0 )
         {
            AV41TFHisProFec = localUtil.ctod( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROLIN") == 0 )
         {
            AV43TFHisProLin = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV44TFHisProLin_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV45TFBarOrdLin = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV46TFBarOrdLin_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV47TFFase = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV48TFFase_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC") == 0 )
         {
            AV49TFFaseDsc = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASEDSC_SEL") == 0 )
         {
            AV50TFFaseDsc_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROTUR") == 0 )
         {
            AV51TFHisProTur = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFHisProTur_To = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF") == 0 )
         {
            AV53TFHisProF = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROF_SEL") == 0 )
         {
            AV54TFHisProF_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV55TFHisProDTI = localUtil.ctot( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV57TFHisProDTF = localUtil.ctot( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV59TFHisProKgr = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFHisProKgr_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV61TFHisProMtr = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFHisProMtr_To = CommonUtil.decimalVal( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRONPZS") == 0 )
         {
            AV63TFHisProNpzs = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV64TFHisProNpzs_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV65TFGruOpeCod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV66TFGruOpeCod_To = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV67TFParCod = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV68TFParCod_To = (short)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV69TFParCodNom = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV70TFParCodNom_Sel = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV28Emprcod = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV29Barcod = (int)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV30Barcodreo = (byte)(GXutil.lval( AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV31BarCodpar = AV38GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         AV108GXV1 = (int)(AV108GXV1+1) ;
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
      A558HisProFec = GXutil.nullDate() ;
      A461Fase = "" ;
      A7258FaseDsc = "" ;
      A557HisProF = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A867ParCodNom = "" ;
      AV74Wclecturasproduccionds_1_emprcod = "" ;
      AV28Emprcod = "" ;
      AV77Wclecturasproduccionds_4_barcodpar = "" ;
      AV31BarCodpar = "" ;
      AV78Wclecturasproduccionds_5_filterfulltext = "" ;
      AV34FilterFullText = "" ;
      AV79Wclecturasproduccionds_6_tfmaqcod = "" ;
      AV39TFMaqCod = "" ;
      AV80Wclecturasproduccionds_7_tfmaqcod_sel = "" ;
      AV40TFMaqCod_Sel = "" ;
      AV81Wclecturasproduccionds_8_tfhisprofec = GXutil.nullDate() ;
      AV41TFHisProFec = GXutil.nullDate() ;
      AV86Wclecturasproduccionds_13_tffase = "" ;
      AV47TFFase = "" ;
      AV87Wclecturasproduccionds_14_tffase_sel = "" ;
      AV48TFFase_Sel = "" ;
      AV88Wclecturasproduccionds_15_tffasedsc = "" ;
      AV49TFFaseDsc = "" ;
      AV89Wclecturasproduccionds_16_tffasedsc_sel = "" ;
      AV50TFFaseDsc_Sel = "" ;
      AV92Wclecturasproduccionds_19_tfhisprof = "" ;
      AV53TFHisProF = "" ;
      AV93Wclecturasproduccionds_20_tfhisprof_sel = "" ;
      AV54TFHisProF_Sel = "" ;
      AV94Wclecturasproduccionds_21_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV55TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV95Wclecturasproduccionds_22_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV57TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV96Wclecturasproduccionds_23_tfhisprokgr = DecimalUtil.ZERO ;
      AV59TFHisProKgr = DecimalUtil.ZERO ;
      AV97Wclecturasproduccionds_24_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV60TFHisProKgr_To = DecimalUtil.ZERO ;
      AV98Wclecturasproduccionds_25_tfhispromtr = DecimalUtil.ZERO ;
      AV61TFHisProMtr = DecimalUtil.ZERO ;
      AV99Wclecturasproduccionds_26_tfhispromtr_to = DecimalUtil.ZERO ;
      AV62TFHisProMtr_To = DecimalUtil.ZERO ;
      AV106Wclecturasproduccionds_33_tfparcodnom = "" ;
      AV69TFParCodNom = "" ;
      AV107Wclecturasproduccionds_34_tfparcodnom_sel = "" ;
      AV70TFParCodNom_Sel = "" ;
      lV78Wclecturasproduccionds_5_filterfulltext = "" ;
      lV88Wclecturasproduccionds_15_tffasedsc = "" ;
      scmdbuf = "" ;
      lV79Wclecturasproduccionds_6_tfmaqcod = "" ;
      A130BarCodPar = "" ;
      P08UP2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08UP2_A602MaqCod = new String[] {""} ;
      P08UP2_A396EmprCod = new String[] {""} ;
      AV35OpeNom = "" ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector4 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector5 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV37GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV38GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wclecturasproduccionexportcsv__default(),
         new Object[] {
             new Object[] {
            P08UP2_A558HisProFec, P08UP2_A602MaqCod, P08UP2_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A566HisProTur ;
   private byte AV76Wclecturasproduccionds_3_barcodreo ;
   private byte AV30Barcodreo ;
   private byte AV90Wclecturasproduccionds_17_tfhisprotur ;
   private byte AV51TFHisProTur ;
   private byte AV91Wclecturasproduccionds_18_tfhisprotur_to ;
   private byte AV52TFHisProTur_To ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short A4714HisProNpzs ;
   private short A656ParCod ;
   private short AV84Wclecturasproduccionds_11_tfbarordlin ;
   private short AV45TFBarOrdLin ;
   private short AV85Wclecturasproduccionds_12_tfbarordlin_to ;
   private short AV46TFBarOrdLin_To ;
   private short AV100Wclecturasproduccionds_27_tfhispronpzs ;
   private short AV63TFHisProNpzs ;
   private short AV101Wclecturasproduccionds_28_tfhispronpzs_to ;
   private short AV64TFHisProNpzs_To ;
   private short AV104Wclecturasproduccionds_31_tfparcod ;
   private short AV67TFParCod ;
   private short AV105Wclecturasproduccionds_32_tfparcod_to ;
   private short AV68TFParCod_To ;
   private short AV32OrderedBy ;
   private short Gx_err ;
   private int AV13Random ;
   private int A561HisProLin ;
   private int A503GruOpeCod ;
   private int AV75Wclecturasproduccionds_2_barcod ;
   private int AV29Barcod ;
   private int AV82Wclecturasproduccionds_9_tfhisprolin ;
   private int AV43TFHisProLin ;
   private int AV83Wclecturasproduccionds_10_tfhisprolin_to ;
   private int AV44TFHisProLin_To ;
   private int AV102Wclecturasproduccionds_29_tfgruopecod ;
   private int AV65TFGruOpeCod ;
   private int AV103Wclecturasproduccionds_30_tfgruopecod_to ;
   private int AV66TFGruOpeCod_To ;
   private int A129BarCod ;
   private int AV108GXV1 ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV96Wclecturasproduccionds_23_tfhisprokgr ;
   private java.math.BigDecimal AV59TFHisProKgr ;
   private java.math.BigDecimal AV97Wclecturasproduccionds_24_tfhisprokgr_to ;
   private java.math.BigDecimal AV60TFHisProKgr_To ;
   private java.math.BigDecimal AV98Wclecturasproduccionds_25_tfhispromtr ;
   private java.math.BigDecimal AV61TFHisProMtr ;
   private java.math.BigDecimal AV99Wclecturasproduccionds_26_tfhispromtr_to ;
   private java.math.BigDecimal AV62TFHisProMtr_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String A7258FaseDsc ;
   private String A557HisProF ;
   private String A396EmprCod ;
   private String A867ParCodNom ;
   private String AV74Wclecturasproduccionds_1_emprcod ;
   private String AV28Emprcod ;
   private String AV77Wclecturasproduccionds_4_barcodpar ;
   private String AV31BarCodpar ;
   private String AV79Wclecturasproduccionds_6_tfmaqcod ;
   private String AV39TFMaqCod ;
   private String AV80Wclecturasproduccionds_7_tfmaqcod_sel ;
   private String AV40TFMaqCod_Sel ;
   private String AV86Wclecturasproduccionds_13_tffase ;
   private String AV47TFFase ;
   private String AV87Wclecturasproduccionds_14_tffase_sel ;
   private String AV48TFFase_Sel ;
   private String AV88Wclecturasproduccionds_15_tffasedsc ;
   private String AV49TFFaseDsc ;
   private String AV89Wclecturasproduccionds_16_tffasedsc_sel ;
   private String AV50TFFaseDsc_Sel ;
   private String AV92Wclecturasproduccionds_19_tfhisprof ;
   private String AV53TFHisProF ;
   private String AV93Wclecturasproduccionds_20_tfhisprof_sel ;
   private String AV54TFHisProF_Sel ;
   private String AV106Wclecturasproduccionds_33_tfparcodnom ;
   private String AV69TFParCodNom ;
   private String AV107Wclecturasproduccionds_34_tfparcodnom_sel ;
   private String AV70TFParCodNom_Sel ;
   private String lV88Wclecturasproduccionds_15_tffasedsc ;
   private String scmdbuf ;
   private String lV79Wclecturasproduccionds_6_tfmaqcod ;
   private String A130BarCodPar ;
   private String AV35OpeNom ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV94Wclecturasproduccionds_21_tfhisprodti ;
   private java.util.Date AV55TFHisProDTI ;
   private java.util.Date AV95Wclecturasproduccionds_22_tfhisprodtf ;
   private java.util.Date AV57TFHisProDTF ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV81Wclecturasproduccionds_8_tfhisprofec ;
   private java.util.Date AV41TFHisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV33OrderedDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV78Wclecturasproduccionds_5_filterfulltext ;
   private String AV34FilterFullText ;
   private String lV78Wclecturasproduccionds_5_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] P08UP2_A558HisProFec ;
   private String[] P08UP2_A602MaqCod ;
   private String[] P08UP2_A396EmprCod ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV37GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV38GridStateFilterValue ;
}

final  class wclecturasproduccionexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P08UP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Wclecturasproduccionds_7_tfmaqcod_sel ,
                                          String AV79Wclecturasproduccionds_6_tfmaqcod ,
                                          java.util.Date AV81Wclecturasproduccionds_8_tfhisprofec ,
                                          int AV82Wclecturasproduccionds_9_tfhisprolin ,
                                          int AV83Wclecturasproduccionds_10_tfhisprolin_to ,
                                          short AV84Wclecturasproduccionds_11_tfbarordlin ,
                                          short AV85Wclecturasproduccionds_12_tfbarordlin_to ,
                                          String AV87Wclecturasproduccionds_14_tffase_sel ,
                                          String AV86Wclecturasproduccionds_13_tffase ,
                                          byte AV90Wclecturasproduccionds_17_tfhisprotur ,
                                          byte AV91Wclecturasproduccionds_18_tfhisprotur_to ,
                                          String AV93Wclecturasproduccionds_20_tfhisprof_sel ,
                                          String AV92Wclecturasproduccionds_19_tfhisprof ,
                                          java.util.Date AV94Wclecturasproduccionds_21_tfhisprodti ,
                                          java.util.Date AV95Wclecturasproduccionds_22_tfhisprodtf ,
                                          java.math.BigDecimal AV96Wclecturasproduccionds_23_tfhisprokgr ,
                                          java.math.BigDecimal AV97Wclecturasproduccionds_24_tfhisprokgr_to ,
                                          java.math.BigDecimal AV98Wclecturasproduccionds_25_tfhispromtr ,
                                          java.math.BigDecimal AV99Wclecturasproduccionds_26_tfhispromtr_to ,
                                          short AV100Wclecturasproduccionds_27_tfhispronpzs ,
                                          short AV101Wclecturasproduccionds_28_tfhispronpzs_to ,
                                          int AV102Wclecturasproduccionds_29_tfgruopecod ,
                                          int AV103Wclecturasproduccionds_30_tfgruopecod_to ,
                                          short AV104Wclecturasproduccionds_31_tfparcod ,
                                          short AV105Wclecturasproduccionds_32_tfparcod_to ,
                                          String AV107Wclecturasproduccionds_34_tfparcodnom_sel ,
                                          String AV106Wclecturasproduccionds_33_tfparcodnom ,
                                          String A602MaqCod ,
                                          java.util.Date A558HisProFec ,
                                          int A561HisProLin ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          byte A566HisProTur ,
                                          String A557HisProF ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          short A4714HisProNpzs ,
                                          int A503GruOpeCod ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV32OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          String AV78Wclecturasproduccionds_5_filterfulltext ,
                                          String A7258FaseDsc ,
                                          String AV89Wclecturasproduccionds_16_tffasedsc_sel ,
                                          String AV88Wclecturasproduccionds_15_tffasedsc ,
                                          int A129BarCod ,
                                          int AV75Wclecturasproduccionds_2_barcod ,
                                          byte A132BarCodReo ,
                                          byte AV76Wclecturasproduccionds_3_barcodreo ,
                                          String A130BarCodPar ,
                                          String AV77Wclecturasproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          String AV28Emprcod ,
                                          int AV29Barcod ,
                                          byte AV30Barcodreo ,
                                          String AV31BarCodpar ,
                                          String AV74Wclecturasproduccionds_1_emprcod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[50];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT HisProFec, MaqCod, EmprCod FROM TXPCHIPRO" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( UPPER(MaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'90'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(?,'9990'), 2) like '%' || ?) or ( UPPER(?) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(?) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ? = ?))");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      addWhere(sWhereString, "(? = ?)");
      if ( (GXutil.strcmp("", AV80Wclecturasproduccionds_7_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV79Wclecturasproduccionds_6_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Wclecturasproduccionds_7_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(MaqCod = ?)");
      }
      else
      {
         GXv_int6[48] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Wclecturasproduccionds_8_tfhisprofec)) )
      {
         addWhere(sWhereString, "(HisProFec >= ?)");
      }
      else
      {
         GXv_int6[49] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV32OrderedBy == 1 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 1 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, MaqCod" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, MaqCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod, HisProFec" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC, HisProFec DESC" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 5 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 6 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 7 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 8 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 9 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 10 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 11 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 12 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 13 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 13 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 14 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 14 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
      }
      else if ( ( AV32OrderedBy == 15 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY EmprCod" ;
      }
      else if ( ( AV32OrderedBy == 15 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY EmprCod DESC" ;
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
                  return conditional_P08UP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).shortValue() , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).shortValue() , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.math.BigDecimal)dynConstraints[36] , (java.math.BigDecimal)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).shortValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).intValue() , ((Number) dynConstraints[57]).byteValue() , (String)dynConstraints[58] , (String)dynConstraints[59] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08UP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
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
                  stmt.setString(sIdx, (String)parms[50], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 28);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[69]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 30);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[76], 100);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 28);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 28);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 28);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 28);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 28);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 28);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 28);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 1);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 3);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[95], 1);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 6);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[98], 6);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               return;
      }
   }

}

