package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadeproduccion_partesproduccionexportcsv_impl extends GXWebProcedure
{
   public consultadeproduccion_partesproduccionexportcsv_impl( com.genexus.internet.HttpContext context )
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
      AV65Var_Hdr = AV64WebSession.getValue("&Var_Hdr") ;
      AV60EmprCod = GXutil.substring( AV65Var_Hdr, 1, 3) ;
      AV61BarCod = (int)(GXutil.lval( GXutil.substring( AV65Var_Hdr, 4, 8))) ;
      AV62BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV65Var_Hdr, 12, 1))) ;
      AV63BarCodPar = GXutil.substring( AV65Var_Hdr, 13, 1) ;
      AV64WebSession.remove("&Var_Hdr");
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
      AV11Filename = "./PrivateTempStorage/" + "ConsultadeProduccion_PartesProduccionExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionColumnsSelector") ;
         AV15ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S141 ();
         if (returnInSub) return;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Orden", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fase", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Código Máquina", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Operario", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Nombre", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Kilos", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Metros", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Inicio", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Fin", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Paro", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Descripcion", "") : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV76Produccion_consultadeproduccion_partesproduccionds_1_emprcod = AV60EmprCod ;
      AV77Produccion_consultadeproduccion_partesproduccionds_2_barcod = AV61BarCod ;
      AV78Produccion_consultadeproduccion_partesproduccionds_3_barcodreo = AV62BarCodReo ;
      AV79Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = AV63BarCodPar ;
      AV80Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin = AV34TFBarOrdLin ;
      AV81Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to = AV35TFBarOrdLin_To ;
      AV82Produccion_consultadeproduccion_partesproduccionds_7_tffase = AV36TFFase ;
      AV83Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = AV37TFFase_Sel ;
      AV84Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = AV38TFFase_Dsc ;
      AV85Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = AV39TFFase_Dsc_Sel ;
      AV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = AV40TFMaqCod ;
      AV87Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = AV41TFMaqCod_Sel ;
      AV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = AV42TFMaqDsc ;
      AV89Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = AV43TFMaqDsc_Sel ;
      AV90Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod = AV46TFGruOpeCod ;
      AV91Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to = AV47TFGruOpeCod_To ;
      AV92Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = AV44TFGruopecod_Nombre ;
      AV93Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = AV45TFGruopecod_Nombre_Sel ;
      AV94Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = AV48TFHisProKgr ;
      AV95Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = AV49TFHisProKgr_To ;
      AV96Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = AV50TFHisProMtr ;
      AV97Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = AV51TFHisProMtr_To ;
      AV98Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = AV52TFHisProDTI ;
      AV99Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = AV54TFHisProDTF ;
      AV100Produccion_consultadeproduccion_partesproduccionds_25_tfparcod = AV56TFParCod ;
      AV101Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to = AV57TFParCod_To ;
      AV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = AV58TFParCodNom ;
      AV103Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = AV59TFParCodNom_Sel ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Short.valueOf(AV80Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) ,
                                           Short.valueOf(AV81Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) ,
                                           AV83Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                           AV82Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                           AV87Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                           AV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                           AV89Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                           AV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                           Integer.valueOf(AV90Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) ,
                                           Integer.valueOf(AV91Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) ,
                                           AV94Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                           AV95Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                           AV96Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                           AV97Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                           AV98Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                           AV99Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                           Short.valueOf(AV100Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) ,
                                           Short.valueOf(AV101Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) ,
                                           AV103Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                           AV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A461Fase ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           Integer.valueOf(A503GruOpeCod) ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A4440HisProDTI ,
                                           A4441HisProDTF ,
                                           Short.valueOf(A656ParCod) ,
                                           A867ParCodNom ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           AV85Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                           AV84Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                           A14027Fase_Dsc ,
                                           AV93Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                           AV92Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                           A14028Gruopecod_ ,
                                           AV76Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                           Integer.valueOf(AV77Produccion_consultadeproduccion_partesproduccionds_2_barcod) ,
                                           Byte.valueOf(AV78Produccion_consultadeproduccion_partesproduccionds_3_barcodreo) ,
                                           AV79Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV82Produccion_consultadeproduccion_partesproduccionds_7_tffase = GXutil.padr( GXutil.rtrim( AV82Produccion_consultadeproduccion_partesproduccionds_7_tffase), 8, "%") ;
      lV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = GXutil.padr( GXutil.rtrim( AV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod), 6, "%") ;
      lV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = GXutil.padr( GXutil.rtrim( AV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc), 16, "%") ;
      lV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = GXutil.padr( GXutil.rtrim( AV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom), 30, "%") ;
      /* Using cursor P09LK2 */
      pr_default.execute(0, new Object[] {AV76Produccion_consultadeproduccion_partesproduccionds_1_emprcod, Integer.valueOf(AV77Produccion_consultadeproduccion_partesproduccionds_2_barcod), Byte.valueOf(AV78Produccion_consultadeproduccion_partesproduccionds_3_barcodreo), AV79Produccion_consultadeproduccion_partesproduccionds_4_barcodpar, Short.valueOf(AV80Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin), Short.valueOf(AV81Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to), lV82Produccion_consultadeproduccion_partesproduccionds_7_tffase, AV83Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel, lV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod, AV87Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel, lV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc, AV89Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel, Integer.valueOf(AV90Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod), Integer.valueOf(AV91Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to), AV94Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr, AV95Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to, AV96Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr, AV97Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to, AV98Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti, AV99Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf, Short.valueOf(AV100Produccion_consultadeproduccion_partesproduccionds_25_tfparcod), Short.valueOf(AV101Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to), lV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom, AV103Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A867ParCodNom = P09LK2_A867ParCodNom[0] ;
         n867ParCodNom = P09LK2_n867ParCodNom[0] ;
         A656ParCod = P09LK2_A656ParCod[0] ;
         n656ParCod = P09LK2_n656ParCod[0] ;
         A4441HisProDTF = P09LK2_A4441HisProDTF[0] ;
         n4441HisProDTF = P09LK2_n4441HisProDTF[0] ;
         A4440HisProDTI = P09LK2_A4440HisProDTI[0] ;
         n4440HisProDTI = P09LK2_n4440HisProDTI[0] ;
         A1526HisProMtr = P09LK2_A1526HisProMtr[0] ;
         A1525HisProKgr = P09LK2_A1525HisProKgr[0] ;
         A606MaqDsc = P09LK2_A606MaqDsc[0] ;
         n606MaqDsc = P09LK2_n606MaqDsc[0] ;
         A602MaqCod = P09LK2_A602MaqCod[0] ;
         A194BarOrdLin = P09LK2_A194BarOrdLin[0] ;
         A130BarCodPar = P09LK2_A130BarCodPar[0] ;
         A132BarCodReo = P09LK2_A132BarCodReo[0] ;
         A129BarCod = P09LK2_A129BarCod[0] ;
         A461Fase = P09LK2_A461Fase[0] ;
         A503GruOpeCod = P09LK2_A503GruOpeCod[0] ;
         A396EmprCod = P09LK2_A396EmprCod[0] ;
         A558HisProFec = P09LK2_A558HisProFec[0] ;
         A561HisProLin = P09LK2_A561HisProLin[0] ;
         A606MaqDsc = P09LK2_A606MaqDsc[0] ;
         n606MaqDsc = P09LK2_n606MaqDsc[0] ;
         A867ParCodNom = P09LK2_A867ParCodNom[0] ;
         n867ParCodNom = P09LK2_n867ParCodNom[0] ;
         GXt_char2 = A14027Fase_Dsc ;
         GXv_char3[0] = GXt_char2 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char3) ;
         consultadeproduccion_partesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
         A14027Fase_Dsc = GXt_char2 ;
         if ( ! ( (GXutil.strcmp("", AV85Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) && ( ! (GXutil.strcmp("", AV84Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc)==0) ) ) || ( GXutil.like( GXutil.upper( A14027Fase_Dsc) , GXutil.padr( "%" + GXutil.upper( AV84Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV85Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel)==0) || ( ( GXutil.strcmp(A14027Fase_Dsc, AV85Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel) == 0 ) ) )
            {
               GXt_char2 = A14028Gruopecod_ ;
               GXv_char3[0] = GXt_char2 ;
               new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char3) ;
               consultadeproduccion_partesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
               A14028Gruopecod_ = GXt_char2 ;
               if ( ! ( (GXutil.strcmp("", AV93Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) && ( ! (GXutil.strcmp("", AV92Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre)==0) ) ) || ( GXutil.like( GXutil.upper( A14028Gruopecod_) , GXutil.padr( "%" + GXutil.upper( AV92Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre) , 255 , "%"),  ' ' ) ) )
               {
                  if ( (GXutil.strcmp("", AV93Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel)==0) || ( ( GXutil.strcmp(A14028Gruopecod_, AV93Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel) == 0 ) ) )
                  {
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
                        AV14TextFileLine += GXutil.str( A194BarOrdLin, 4, 0) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A461Fase, ";", ","), GXv_char3) ;
                        consultadeproduccion_partesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14027Fase_Dsc, ";", ","), GXv_char3) ;
                        consultadeproduccion_partesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A602MaqCod, ";", ","), GXv_char3) ;
                        consultadeproduccion_partesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A606MaqDsc, ";", ","), GXv_char3) ;
                        consultadeproduccion_partesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A14028Gruopecod_, ";", ","), GXv_char3) ;
                        consultadeproduccion_partesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
                        AV14TextFileLine += GXt_char2 ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A1525HisProKgr, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A1526HisProMtr, 9, 2) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += localUtil.ttoc( A4440HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += localUtil.ttoc( A4441HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        AV14TextFileLine += GXutil.str( A656ParCod, 4, 0) ;
                     }
                     if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
                     {
                        AV14TextFileLine += ";" ;
                        GXt_char2 = AV14TextFileLine ;
                        GXv_char3[0] = GXt_char2 ;
                        new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A867ParCodNom, ";", ","), GXv_char3) ;
                        consultadeproduccion_partesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=ConsultadeProduccion_PartesProduccionExportCSV.csv");
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "BarOrdLin", "", "Orden", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Fase", "", "Fase", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Fase_Dsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqCod", "", "Código Máquina", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "MaqDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "GruOpeCod", "", "Operario", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "Gruopecod_Nombre", "", "Nombre", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProKgr", "", "Kilos", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProMtr", "", "Metros", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTI", "", "Inicio", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "HisProDTF", "", "Fin", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParCod", "", "Paro", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXv_SdtWWPColumnsSelector4[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector4, "ParCodNom", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector4[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.ConsultadeProduccion_PartesProduccionColumnsSelector", GXv_char3) ;
      consultadeproduccion_partesproduccionexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
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
      if ( GXutil.strcmp(AV19Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "Produccion.ConsultadeProduccion_PartesProduccionGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("Produccion.ConsultadeProduccion_PartesProduccionGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV104GXV1 = 1 ;
      while ( AV104GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV104GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV34TFBarOrdLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV35TFBarOrdLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE") == 0 )
         {
            AV36TFFase = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_SEL") == 0 )
         {
            AV37TFFase_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_DSC") == 0 )
         {
            AV38TFFase_Dsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASE_DSC_SEL") == 0 )
         {
            AV39TFFase_Dsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV40TFMaqCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV41TFMaqCod_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC") == 0 )
         {
            AV42TFMaqDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQDSC_SEL") == 0 )
         {
            AV43TFMaqDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD") == 0 )
         {
            AV46TFGruOpeCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV47TFGruOpeCod_To = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD_NOMBRE") == 0 )
         {
            AV44TFGruopecod_Nombre = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGRUOPECOD_NOMBRE_SEL") == 0 )
         {
            AV45TFGruopecod_Nombre_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV48TFHisProKgr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV49TFHisProKgr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV50TFHisProMtr = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV51TFHisProMtr_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTI") == 0 )
         {
            AV52TFHisProDTI = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV54TFHisProDTF = localUtil.ctot( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCOD") == 0 )
         {
            AV56TFParCod = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV57TFParCod_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM") == 0 )
         {
            AV58TFParCodNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPARCODNOM_SEL") == 0 )
         {
            AV59TFParCodNom_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV60EmprCod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV61BarCod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV62BarCodReo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV63BarCodPar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLICOD") == 0 )
         {
            AV66Clicod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&CLINOM") == 0 )
         {
            AV67CliNom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&PEDIDOCLIENTE") == 0 )
         {
            AV68PedidoCliente = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSER") == 0 )
         {
            AV69Barser = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARSERDSC") == 0 )
         {
            AV70BarSerDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNOM") == 0 )
         {
            AV71Barcolnom = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOLNUM") == 0 )
         {
            AV72Barcolnum = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV104GXV1 = (int)(AV104GXV1+1) ;
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
      AV65Var_Hdr = "" ;
      AV64WebSession = httpContext.getWebSession();
      AV60EmprCod = "" ;
      AV63BarCodPar = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11Filename = "" ;
      AV10TextFile = new com.genexus.util.GXFile();
      AV14TextFileLine = "" ;
      AV19Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      AV15ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      A461Fase = "" ;
      A14027Fase_Dsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      A14028Gruopecod_ = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A867ParCodNom = "" ;
      AV76Produccion_consultadeproduccion_partesproduccionds_1_emprcod = "" ;
      AV79Produccion_consultadeproduccion_partesproduccionds_4_barcodpar = "" ;
      AV82Produccion_consultadeproduccion_partesproduccionds_7_tffase = "" ;
      AV36TFFase = "" ;
      AV83Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel = "" ;
      AV37TFFase_Sel = "" ;
      AV84Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc = "" ;
      AV38TFFase_Dsc = "" ;
      AV85Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel = "" ;
      AV39TFFase_Dsc_Sel = "" ;
      AV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = "" ;
      AV40TFMaqCod = "" ;
      AV87Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel = "" ;
      AV41TFMaqCod_Sel = "" ;
      AV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = "" ;
      AV42TFMaqDsc = "" ;
      AV89Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel = "" ;
      AV43TFMaqDsc_Sel = "" ;
      AV92Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre = "" ;
      AV44TFGruopecod_Nombre = "" ;
      AV93Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel = "" ;
      AV45TFGruopecod_Nombre_Sel = "" ;
      AV94Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV48TFHisProKgr = DecimalUtil.ZERO ;
      AV95Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV49TFHisProKgr_To = DecimalUtil.ZERO ;
      AV96Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV50TFHisProMtr = DecimalUtil.ZERO ;
      AV97Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV51TFHisProMtr_To = DecimalUtil.ZERO ;
      AV98Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV52TFHisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV99Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV54TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = "" ;
      AV58TFParCodNom = "" ;
      AV103Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel = "" ;
      AV59TFParCodNom_Sel = "" ;
      scmdbuf = "" ;
      lV82Produccion_consultadeproduccion_partesproduccionds_7_tffase = "" ;
      lV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod = "" ;
      lV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc = "" ;
      lV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09LK2_A867ParCodNom = new String[] {""} ;
      P09LK2_n867ParCodNom = new boolean[] {false} ;
      P09LK2_A656ParCod = new short[1] ;
      P09LK2_n656ParCod = new boolean[] {false} ;
      P09LK2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P09LK2_n4441HisProDTF = new boolean[] {false} ;
      P09LK2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P09LK2_n4440HisProDTI = new boolean[] {false} ;
      P09LK2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LK2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LK2_A606MaqDsc = new String[] {""} ;
      P09LK2_n606MaqDsc = new boolean[] {false} ;
      P09LK2_A602MaqCod = new String[] {""} ;
      P09LK2_A194BarOrdLin = new short[1] ;
      P09LK2_A130BarCodPar = new String[] {""} ;
      P09LK2_A132BarCodReo = new byte[1] ;
      P09LK2_A129BarCod = new int[1] ;
      P09LK2_A461Fase = new String[] {""} ;
      P09LK2_A503GruOpeCod = new int[1] ;
      P09LK2_A396EmprCod = new String[] {""} ;
      P09LK2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P09LK2_A561HisProLin = new int[1] ;
      A558HisProFec = GXutil.nullDate() ;
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
      AV67CliNom = "" ;
      AV68PedidoCliente = "" ;
      AV69Barser = "" ;
      AV70BarSerDsc = "" ;
      AV71Barcolnom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.consultadeproduccion_partesproduccionexportcsv__default(),
         new Object[] {
             new Object[] {
            P09LK2_A867ParCodNom, P09LK2_n867ParCodNom, P09LK2_A656ParCod, P09LK2_n656ParCod, P09LK2_A4441HisProDTF, P09LK2_n4441HisProDTF, P09LK2_A4440HisProDTI, P09LK2_n4440HisProDTI, P09LK2_A1526HisProMtr, P09LK2_A1525HisProKgr,
            P09LK2_A606MaqDsc, P09LK2_n606MaqDsc, P09LK2_A602MaqCod, P09LK2_A194BarOrdLin, P09LK2_A130BarCodPar, P09LK2_A132BarCodReo, P09LK2_A129BarCod, P09LK2_A461Fase, P09LK2_A503GruOpeCod, P09LK2_A396EmprCod,
            P09LK2_A558HisProFec, P09LK2_A561HisProLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV62BarCodReo ;
   private byte AV78Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short AV80Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ;
   private short AV34TFBarOrdLin ;
   private short AV81Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ;
   private short AV35TFBarOrdLin_To ;
   private short AV100Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ;
   private short AV56TFParCod ;
   private short AV101Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ;
   private short AV57TFParCod_To ;
   private short AV28OrderedBy ;
   private short Gx_err ;
   private int AV61BarCod ;
   private int AV13Random ;
   private int A503GruOpeCod ;
   private int AV77Produccion_consultadeproduccion_partesproduccionds_2_barcod ;
   private int AV90Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ;
   private int AV46TFGruOpeCod ;
   private int AV91Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ;
   private int AV47TFGruOpeCod_To ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int AV104GXV1 ;
   private int AV66Clicod ;
   private int AV72Barcolnum ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV94Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ;
   private java.math.BigDecimal AV48TFHisProKgr ;
   private java.math.BigDecimal AV95Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV49TFHisProKgr_To ;
   private java.math.BigDecimal AV96Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ;
   private java.math.BigDecimal AV50TFHisProMtr ;
   private java.math.BigDecimal AV97Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ;
   private java.math.BigDecimal AV51TFHisProMtr_To ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV65Var_Hdr ;
   private String AV60EmprCod ;
   private String AV63BarCodPar ;
   private String A461Fase ;
   private String A14027Fase_Dsc ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A14028Gruopecod_ ;
   private String A867ParCodNom ;
   private String AV76Produccion_consultadeproduccion_partesproduccionds_1_emprcod ;
   private String AV79Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ;
   private String AV82Produccion_consultadeproduccion_partesproduccionds_7_tffase ;
   private String AV36TFFase ;
   private String AV83Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ;
   private String AV37TFFase_Sel ;
   private String AV84Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ;
   private String AV38TFFase_Dsc ;
   private String AV85Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ;
   private String AV39TFFase_Dsc_Sel ;
   private String AV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ;
   private String AV40TFMaqCod ;
   private String AV87Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ;
   private String AV41TFMaqCod_Sel ;
   private String AV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ;
   private String AV42TFMaqDsc ;
   private String AV89Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ;
   private String AV43TFMaqDsc_Sel ;
   private String AV92Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ;
   private String AV44TFGruopecod_Nombre ;
   private String AV93Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ;
   private String AV45TFGruopecod_Nombre_Sel ;
   private String AV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ;
   private String AV58TFParCodNom ;
   private String AV103Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ;
   private String AV59TFParCodNom_Sel ;
   private String scmdbuf ;
   private String lV82Produccion_consultadeproduccion_partesproduccionds_7_tffase ;
   private String lV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ;
   private String lV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ;
   private String lV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String AV67CliNom ;
   private String AV68PedidoCliente ;
   private String AV69Barser ;
   private String AV70BarSerDsc ;
   private String AV71Barcolnom ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV98Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ;
   private java.util.Date AV52TFHisProDTI ;
   private java.util.Date AV99Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ;
   private java.util.Date AV54TFHisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV29OrderedDsc ;
   private boolean n867ParCodNom ;
   private boolean n656ParCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n606MaqDsc ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV64WebSession ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09LK2_A867ParCodNom ;
   private boolean[] P09LK2_n867ParCodNom ;
   private short[] P09LK2_A656ParCod ;
   private boolean[] P09LK2_n656ParCod ;
   private java.util.Date[] P09LK2_A4441HisProDTF ;
   private boolean[] P09LK2_n4441HisProDTF ;
   private java.util.Date[] P09LK2_A4440HisProDTI ;
   private boolean[] P09LK2_n4440HisProDTI ;
   private java.math.BigDecimal[] P09LK2_A1526HisProMtr ;
   private java.math.BigDecimal[] P09LK2_A1525HisProKgr ;
   private String[] P09LK2_A606MaqDsc ;
   private boolean[] P09LK2_n606MaqDsc ;
   private String[] P09LK2_A602MaqCod ;
   private short[] P09LK2_A194BarOrdLin ;
   private String[] P09LK2_A130BarCodPar ;
   private byte[] P09LK2_A132BarCodReo ;
   private int[] P09LK2_A129BarCod ;
   private String[] P09LK2_A461Fase ;
   private int[] P09LK2_A503GruOpeCod ;
   private String[] P09LK2_A396EmprCod ;
   private java.util.Date[] P09LK2_A558HisProFec ;
   private int[] P09LK2_A561HisProLin ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector4[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
}

final  class consultadeproduccion_partesproduccionexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LK2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV80Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin ,
                                          short AV81Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to ,
                                          String AV83Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel ,
                                          String AV82Produccion_consultadeproduccion_partesproduccionds_7_tffase ,
                                          String AV87Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel ,
                                          String AV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod ,
                                          String AV89Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel ,
                                          String AV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc ,
                                          int AV90Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod ,
                                          int AV91Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to ,
                                          java.math.BigDecimal AV94Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV95Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV96Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr ,
                                          java.math.BigDecimal AV97Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to ,
                                          java.util.Date AV98Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti ,
                                          java.util.Date AV99Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf ,
                                          short AV100Produccion_consultadeproduccion_partesproduccionds_25_tfparcod ,
                                          short AV101Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to ,
                                          String AV103Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel ,
                                          String AV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom ,
                                          short A194BarOrdLin ,
                                          String A461Fase ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          int A503GruOpeCod ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          java.util.Date A4440HisProDTI ,
                                          java.util.Date A4441HisProDTF ,
                                          short A656ParCod ,
                                          String A867ParCodNom ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String AV85Produccion_consultadeproduccion_partesproduccionds_10_tffase_dsc_sel ,
                                          String AV84Produccion_consultadeproduccion_partesproduccionds_9_tffase_dsc ,
                                          String A14027Fase_Dsc ,
                                          String AV93Produccion_consultadeproduccion_partesproduccionds_18_tfgruopecod_nombre_sel ,
                                          String AV92Produccion_consultadeproduccion_partesproduccionds_17_tfgruopecod_nombre ,
                                          String A14028Gruopecod_ ,
                                          String AV76Produccion_consultadeproduccion_partesproduccionds_1_emprcod ,
                                          int AV77Produccion_consultadeproduccion_partesproduccionds_2_barcod ,
                                          byte AV78Produccion_consultadeproduccion_partesproduccionds_3_barcodreo ,
                                          String AV79Produccion_consultadeproduccion_partesproduccionds_4_barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int6 = new byte[24];
      Object[] GXv_Object7 = new Object[2];
      scmdbuf = "SELECT T3.ParCodNom, T1.ParCod, T1.HisProDTF, T1.HisProDTI, T1.HisProMtr, T1.HisProKgr, T2.MaqDsc, T1.MaqCod, T1.BarOrdLin, T1.BarCodPar, T1.BarCodReo, T1.BarCod," ;
      scmdbuf += " T1.Fase, T1.GruOpeCod, T1.EmprCod, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod)" ;
      scmdbuf += " LEFT JOIN TXPCODPAR T3 ON T3.EmprCod = T1.EmprCod AND T3.ParCod = T1.ParCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( ! (0==AV80Produccion_consultadeproduccion_partesproduccionds_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int6[4] = (byte)(1) ;
      }
      if ( ! (0==AV81Produccion_consultadeproduccion_partesproduccionds_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int6[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) && ( ! (GXutil.strcmp("", AV82Produccion_consultadeproduccion_partesproduccionds_7_tffase)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Fase) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV83Produccion_consultadeproduccion_partesproduccionds_8_tffase_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Fase = ?)");
      }
      else
      {
         GXv_int6[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV86Produccion_consultadeproduccion_partesproduccionds_11_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Produccion_consultadeproduccion_partesproduccionds_12_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int6[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) && ( ! (GXutil.strcmp("", AV88Produccion_consultadeproduccion_partesproduccionds_13_tfmaqdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.MaqDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Produccion_consultadeproduccion_partesproduccionds_14_tfmaqdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.MaqDsc = ?)");
      }
      else
      {
         GXv_int6[11] = (byte)(1) ;
      }
      if ( ! (0==AV90Produccion_consultadeproduccion_partesproduccionds_15_tfgruopecod) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod >= ?)");
      }
      else
      {
         GXv_int6[12] = (byte)(1) ;
      }
      if ( ! (0==AV91Produccion_consultadeproduccion_partesproduccionds_16_tfgruopecod_to) )
      {
         addWhere(sWhereString, "(T1.GruOpeCod <= ?)");
      }
      else
      {
         GXv_int6[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Produccion_consultadeproduccion_partesproduccionds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int6[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Produccion_consultadeproduccion_partesproduccionds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int6[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Produccion_consultadeproduccion_partesproduccionds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int6[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Produccion_consultadeproduccion_partesproduccionds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int6[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV98Produccion_consultadeproduccion_partesproduccionds_23_tfhisprodti) )
      {
         addWhere(sWhereString, "(T1.HisProDTI >= ?)");
      }
      else
      {
         GXv_int6[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Produccion_consultadeproduccion_partesproduccionds_24_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int6[19] = (byte)(1) ;
      }
      if ( ! (0==AV100Produccion_consultadeproduccion_partesproduccionds_25_tfparcod) )
      {
         addWhere(sWhereString, "(T1.ParCod >= ?)");
      }
      else
      {
         GXv_int6[20] = (byte)(1) ;
      }
      if ( ! (0==AV101Produccion_consultadeproduccion_partesproduccionds_26_tfparcod_to) )
      {
         addWhere(sWhereString, "(T1.ParCod <= ?)");
      }
      else
      {
         GXv_int6[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) && ( ! (GXutil.strcmp("", AV102Produccion_consultadeproduccion_partesproduccionds_27_tfparcodnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ParCodNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int6[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Produccion_consultadeproduccion_partesproduccionds_28_tfparcodnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ParCodNom = ?)");
      }
      else
      {
         GXv_int6[23] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.BarOrdLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.Fase" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.Fase DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MaqCod" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MaqCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.MaqDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T2.MaqDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.GruOpeCod" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.GruOpeCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProKgr" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProKgr DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProMtr" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProMtr DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProDTI" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProDTI DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProDTF" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.HisProDTF DESC" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ParCod" ;
      }
      else if ( ( AV28OrderedBy == 10 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.ParCod DESC" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T3.ParCodNom" ;
      }
      else if ( ( AV28OrderedBy == 11 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T3.ParCodNom DESC" ;
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
                  return conditional_P09LK2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).shortValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (java.util.Date)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LK2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[10])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((int[]) buf[16])[0] = rslt.getInt(12);
               ((String[]) buf[17])[0] = rslt.getString(13, 8);
               ((int[]) buf[18])[0] = rslt.getInt(14);
               ((String[]) buf[19])[0] = rslt.getString(15, 3);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(16);
               ((int[]) buf[21])[0] = rslt.getInt(17);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[29]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[42], false);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[43], false);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 30);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 30);
               }
               return;
      }
   }

}

