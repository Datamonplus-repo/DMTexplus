package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_incidencias_wcexportcsv_impl extends GXWebProcedure
{
   public cierrerecetastinte_incidencias_wcexportcsv_impl( com.genexus.internet.HttpContext context )
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
      S201 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S181 ();
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
      S191 ();
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
      AV11Filename = "./PrivateTempStorage/" + "CierreRecetasTinte_Incidencias_WCExportCSV-" + GXutil.trim( GXutil.str( AV13Random, 8, 0)) + ".csv" ;
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
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCColumnsSelector") ;
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
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Factor", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Cantidad", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Und", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Almacen", "") : "") ;
      if ( AV50IsAuthorizedPrdExiCC )
      {
         AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "C.C.", "") : "") ;
      }
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Reservada", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+httpContext.getMessage( "Lote", "") : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"##" : "") ;
      AV14TextFileLine += ((((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible()) ? ";"+"#" : "") ;
      if ( GXutil.len( AV14TextFileLine) > 0 )
      {
         AV10TextFile.writeLine(GXutil.substring( AV14TextFileLine, 2, -1));
      }
   }

   public void S151( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = AV67emprcod ;
      AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod = AV68barcod ;
      AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo = AV69barcodreo ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = AV70barcodpar ;
      AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq = AV71reclinmaq ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = AV30FilterFullText ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = AV53TFRecPrdNum ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = AV54TFRecPrdNum_Sel ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = AV55TFRecPrdDsc ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = AV56TFRecPrdDsc_Sel ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = AV57TFFacCon ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = AV58TFFacCon_To ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = AV59TFPrdExiAlm ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = AV60TFPrdExiAlm_To ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = AV61TFPrdExiCC ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = AV62TFPrdExiCC_To ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = AV63TFPrdCanRes ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = AV64TFPrdCanRes_To ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = AV65TFRecLote ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = AV66TFRecLote_Sel ;
      AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro = AV44TFRecLinPro ;
      AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to = AV45TFRecLinPro_To ;
      AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin = AV51TFRecLin ;
      AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to = AV52TFRecLin_To ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                           AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                           AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                           AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                           AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                           AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                           AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                           AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                           AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                           AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                           AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                           AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                           AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                           AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                           AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                           Byte.valueOf(AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) ,
                                           Byte.valueOf(AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) ,
                                           Short.valueOf(AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) ,
                                           Short.valueOf(AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           A685PrdCanRes ,
                                           A5725RecLote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           Short.valueOf(AV28OrderedBy) ,
                                           Boolean.valueOf(AV29OrderedDsc) ,
                                           A396EmprCod ,
                                           AV67emprcod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV68barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV69barcodreo) ,
                                           A130BarCodPar ,
                                           AV70barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV71reclinmaq) ,
                                           AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo) ,
                                           AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = GXutil.concat( GXutil.rtrim( AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext), "%", "") ;
      lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum), 6, "%") ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc), 26, "%") ;
      lV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote), 26, "%") ;
      /* Using cursor P09EX2 */
      pr_default.execute(0, new Object[] {AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod, Integer.valueOf(AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod), Byte.valueOf(AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo), AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar, Short.valueOf(AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq), AV67emprcod, Integer.valueOf(AV68barcod), Byte.valueOf(AV69barcodreo), AV70barcodpar, Short.valueOf(AV71reclinmaq), lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext, lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum, AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel, lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc, AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel, AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon, AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to, AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm, AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to, AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc, AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to, AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres, AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to, lV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote, AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel, Byte.valueOf(AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro), Byte.valueOf(AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to), Short.valueOf(AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin), Short.valueOf(AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P09EX2_A719PrdNum[0] ;
         n719PrdNum = P09EX2_n719PrdNum[0] ;
         A811RecLin = P09EX2_A811RecLin[0] ;
         A1273RecLinPro = P09EX2_A1273RecLinPro[0] ;
         A5725RecLote = P09EX2_A5725RecLote[0] ;
         A685PrdCanRes = P09EX2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EX2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EX2_A704PrdExiAlm[0] ;
         A431FacCon = P09EX2_A431FacCon[0] ;
         A875RecPrdDsc = P09EX2_A875RecPrdDsc[0] ;
         A872RecPrdNum = P09EX2_A872RecPrdNum[0] ;
         A2804RecLinMaq = P09EX2_A2804RecLinMaq[0] ;
         A130BarCodPar = P09EX2_A130BarCodPar[0] ;
         A132BarCodReo = P09EX2_A132BarCodReo[0] ;
         A129BarCod = P09EX2_A129BarCod[0] ;
         A396EmprCod = P09EX2_A396EmprCod[0] ;
         A686PrdCant = P09EX2_A686PrdCant[0] ;
         A490ForPrdUMe = P09EX2_A490ForPrdUMe[0] ;
         n490ForPrdUMe = P09EX2_n490ForPrdUMe[0] ;
         A488ForPrdDsc = P09EX2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EX2_n488ForPrdDsc[0] ;
         A707PrdFacCon = P09EX2_A707PrdFacCon[0] ;
         A1797PrdCanAny = P09EX2_A1797PrdCanAny[0] ;
         A685PrdCanRes = P09EX2_A685PrdCanRes[0] ;
         A705PrdExiCC = P09EX2_A705PrdExiCC[0] ;
         A704PrdExiAlm = P09EX2_A704PrdExiAlm[0] ;
         A707PrdFacCon = P09EX2_A707PrdFacCon[0] ;
         A488ForPrdDsc = P09EX2_A488ForPrdDsc[0] ;
         n488ForPrdDsc = P09EX2_n488ForPrdDsc[0] ;
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
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A872RecPrdNum, ";", ","), GXv_char3) ;
            cierrerecetastinte_incidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A875RecPrdDsc, ";", ","), GXv_char3) ;
            cierrerecetastinte_incidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A431FacCon, 11, 5) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV48PrdCant = ((AV74todosproductos==0) ? A686PrdCant : A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( AV48PrdCant, 11, 3) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV49ForPrdDsc = ((AV74todosproductos==0) ? A488ForPrdDsc : ((A490ForPrdUMe==2) ? httpContext.getMessage( "Lt", "") : ((A490ForPrdUMe==1) ? httpContext.getMessage( "Kg", "") : httpContext.getMessage( "Kg", "")))) ;
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( AV49ForPrdDsc, ";", ","), GXv_char3) ;
            cierrerecetastinte_incidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV46Existencias = DecimalUtil.doubleToDec(0) ;
            if ( ( GXutil.strcmp(A872RecPrdNum, "100000") >= 0 ) && ( GXutil.strcmp(A872RecPrdNum, "999999") <= 0 ) )
            {
               AV46Existencias = ((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon) ;
            }
            Gx_err = (short)(0) ;
            if ( ( GXutil.strcmp(A872RecPrdNum, "100000") >= 0 ) && ( GXutil.strcmp(A872RecPrdNum, "999999") <= 0 ) )
            {
               if ( AV73consumos == 1 )
               {
                  Gx_err = (short)(((DecimalUtil.compareTo(AV46Existencias, A704PrdExiAlm)>0) ? 1 : 0)) ;
               }
               else
               {
                  Gx_err = (short)(((DecimalUtil.compareTo(AV46Existencias, A705PrdExiCC)>0) ? 1 : 0)) ;
               }
            }
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( Gx_err, 3, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A704PrdExiAlm, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A705PrdExiCC, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A685PrdCanRes, 12, 4) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            GXt_char2 = AV14TextFileLine ;
            GXv_char3[0] = GXt_char2 ;
            new app.wwpbaseobjects.wwp_export_securetext(remoteHandle, context).execute( GXutil.strReplace( A5725RecLote, ";", ","), GXv_char3) ;
            cierrerecetastinte_incidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char3[0] ;
            AV14TextFileLine += GXt_char2 ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A1273RecLinPro, 2, 0) ;
         }
         if ( ((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV15ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() )
         {
            AV14TextFileLine += ";" ;
            AV14TextFileLine += GXutil.str( A811RecLin, 4, 0) ;
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
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      GXt_int4 = 0 ;
      GXv_char3[0] = AV67emprcod ;
      GXv_char5[0] = "011100" ;
      GXv_int6[0] = GXt_int4 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char3, GXv_char5, GXv_int6) ;
      cierrerecetastinte_incidencias_wcexportcsv_impl.this.AV67emprcod = GXv_char3[0] ;
      cierrerecetastinte_incidencias_wcexportcsv_impl.this.GXt_int4 = GXv_int6[0] ;
      AV50IsAuthorizedPrdExiCC = (boolean)(((GXt_int4!=1))) ;
   }

   public void S191( )
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
            AV27HttpResponse.addHeader("Content-Disposition", "attachment;filename=CierreRecetasTinte_Incidencias_WCExportCSV.csv");
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
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecPrdNum", "", "Producto", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecPrdDsc", "", "Descripcion", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "FacCon", "", "Factor", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&PrdCant", "", "Cantidad", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&ForPrdDsc", "", "Und", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "&err", "", "", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdExiAlm", "Existencias", "Almacen", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_char5[0] = AV67emprcod ;
      GXv_char3[0] = "011100" ;
      if ( new app.pbuscou(remoteHandle, context).executeUdp( GXv_char5, GXv_char3) != 1 )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      cierrerecetastinte_incidencias_wcexportcsv_impl.this.AV67emprcod = GXv_char5[0] ;
      if ( Cond_result )
      {
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdExiCC", "Existencias", "C.C.", true, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "", "", "", false, "") ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      }
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "PrdCanRes", "", "Reservada", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecLote", "", "Lote", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecLinPro", "", "##", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXv_SdtWWPColumnsSelector7[0] = AV15ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, "RecLin", "", "#", true, "") ;
      AV15ColumnsSelector = GXv_SdtWWPColumnsSelector7[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.CierreRecetasTinte_Incidencias_WCColumnsSelector", GXv_char5) ;
      cierrerecetastinte_incidencias_wcexportcsv_impl.this.GXt_char2 = GXv_char5[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV16ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector7[0] = AV16ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector8[0] = AV15ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector7, GXv_SdtWWPColumnsSelector8) ;
         AV16ColumnsSelectorAux = GXv_SdtWWPColumnsSelector7[0] ;
         AV15ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      }
   }

   public void S201( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCGridState"), "") == 0 )
      {
         AV32GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( "FormulacionTinte.CierreRecetasTinte_Incidencias_WCGridState"), null, null);
      }
      else
      {
         AV32GridState.fromxml(AV19Session.getValue("FormulacionTinte.CierreRecetasTinte_Incidencias_WCGridState"), null, null);
      }
      AV28OrderedBy = AV32GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      AV29OrderedDsc = AV32GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      AV102GXV1 = 1 ;
      while ( AV102GXV1 <= AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV33GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV32GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV102GXV1));
         if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV53TFRecPrdNum = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV54TFRecPrdNum_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV55TFRecPrdDsc = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV56TFRecPrdDsc_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV57TFFacCon = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV58TFFacCon_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV59TFPrdExiAlm = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV60TFPrdExiAlm_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXICC") == 0 )
         {
            AV61TFPrdExiCC = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV62TFPrdExiCC_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV63TFPrdCanRes = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            AV64TFPrdCanRes_To = CommonUtil.decimalVal( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV65TFRecLote = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV66TFRecLote_Sel = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV44TFRecLinPro = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV45TFRecLinPro_To = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV51TFRecLin = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            AV52TFRecLin_To = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&EMPRCOD") == 0 )
         {
            AV67emprcod = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCOD") == 0 )
         {
            AV68barcod = (int)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODREO") == 0 )
         {
            AV69barcodreo = (byte)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&BARCODPAR") == 0 )
         {
            AV70barcodpar = AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
         }
         else if ( GXutil.strcmp(AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "PARM_&RECLINMAQ") == 0 )
         {
            AV71reclinmaq = (short)(GXutil.lval( AV33GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
         }
         AV102GXV1 = (int)(AV102GXV1+1) ;
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
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A5725RecLote = "" ;
      AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod = "" ;
      AV67emprcod = "" ;
      AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar = "" ;
      AV70barcodpar = "" ;
      AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = "" ;
      AV30FilterFullText = "" ;
      AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = "" ;
      AV53TFRecPrdNum = "" ;
      AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel = "" ;
      AV54TFRecPrdNum_Sel = "" ;
      AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = "" ;
      AV55TFRecPrdDsc = "" ;
      AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel = "" ;
      AV56TFRecPrdDsc_Sel = "" ;
      AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon = DecimalUtil.ZERO ;
      AV57TFFacCon = DecimalUtil.ZERO ;
      AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to = DecimalUtil.ZERO ;
      AV58TFFacCon_To = DecimalUtil.ZERO ;
      AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm = DecimalUtil.ZERO ;
      AV59TFPrdExiAlm = DecimalUtil.ZERO ;
      AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to = DecimalUtil.ZERO ;
      AV60TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc = DecimalUtil.ZERO ;
      AV61TFPrdExiCC = DecimalUtil.ZERO ;
      AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to = DecimalUtil.ZERO ;
      AV62TFPrdExiCC_To = DecimalUtil.ZERO ;
      AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres = DecimalUtil.ZERO ;
      AV63TFPrdCanRes = DecimalUtil.ZERO ;
      AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to = DecimalUtil.ZERO ;
      AV64TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = "" ;
      AV65TFRecLote = "" ;
      AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel = "" ;
      AV66TFRecLote_Sel = "" ;
      scmdbuf = "" ;
      lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext = "" ;
      lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum = "" ;
      lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc = "" ;
      lV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      P09EX2_A719PrdNum = new String[] {""} ;
      P09EX2_n719PrdNum = new boolean[] {false} ;
      P09EX2_A811RecLin = new short[1] ;
      P09EX2_A1273RecLinPro = new byte[1] ;
      P09EX2_A5725RecLote = new String[] {""} ;
      P09EX2_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EX2_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EX2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EX2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EX2_A875RecPrdDsc = new String[] {""} ;
      P09EX2_A872RecPrdNum = new String[] {""} ;
      P09EX2_A2804RecLinMaq = new short[1] ;
      P09EX2_A130BarCodPar = new String[] {""} ;
      P09EX2_A132BarCodReo = new byte[1] ;
      P09EX2_A129BarCod = new int[1] ;
      P09EX2_A396EmprCod = new String[] {""} ;
      P09EX2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EX2_A490ForPrdUMe = new byte[1] ;
      P09EX2_n490ForPrdUMe = new boolean[] {false} ;
      P09EX2_A488ForPrdDsc = new String[] {""} ;
      P09EX2_n488ForPrdDsc = new boolean[] {false} ;
      P09EX2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09EX2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A719PrdNum = "" ;
      AV48PrdCant = DecimalUtil.ZERO ;
      AV49ForPrdDsc = "" ;
      AV46Existencias = DecimalUtil.ZERO ;
      GXv_int6 = new int[1] ;
      AV27HttpResponse = httpContext.getHttpResponse();
      AV12ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV20UserCustomValue = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      AV16ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector7 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV32GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV33GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_incidencias_wcexportcsv__default(),
         new Object[] {
             new Object[] {
            P09EX2_A719PrdNum, P09EX2_n719PrdNum, P09EX2_A811RecLin, P09EX2_A1273RecLinPro, P09EX2_A5725RecLote, P09EX2_A685PrdCanRes, P09EX2_A705PrdExiCC, P09EX2_A704PrdExiAlm, P09EX2_A431FacCon, P09EX2_A875RecPrdDsc,
            P09EX2_A872RecPrdNum, P09EX2_A2804RecLinMaq, P09EX2_A130BarCodPar, P09EX2_A132BarCodReo, P09EX2_A129BarCod, P09EX2_A396EmprCod, P09EX2_A686PrdCant, P09EX2_A490ForPrdUMe, P09EX2_n490ForPrdUMe, P09EX2_A488ForPrdDsc,
            P09EX2_n488ForPrdDsc, P09EX2_A707PrdFacCon, P09EX2_A1797PrdCanAny
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A490ForPrdUMe ;
   private byte A1273RecLinPro ;
   private byte AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ;
   private byte AV69barcodreo ;
   private byte AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ;
   private byte AV44TFRecLinPro ;
   private byte AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ;
   private byte AV45TFRecLinPro_To ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short A811RecLin ;
   private short AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq ;
   private short AV71reclinmaq ;
   private short AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ;
   private short AV51TFRecLin ;
   private short AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ;
   private short AV52TFRecLin_To ;
   private short AV28OrderedBy ;
   private short A2804RecLinMaq ;
   private short AV74todosproductos ;
   private short Gx_err ;
   private short AV73consumos ;
   private int AV13Random ;
   private int AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ;
   private int AV68barcod ;
   private int A129BarCod ;
   private int GXt_int4 ;
   private int GXv_int6[] ;
   private int AV102GXV1 ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ;
   private java.math.BigDecimal AV57TFFacCon ;
   private java.math.BigDecimal AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ;
   private java.math.BigDecimal AV58TFFacCon_To ;
   private java.math.BigDecimal AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ;
   private java.math.BigDecimal AV59TFPrdExiAlm ;
   private java.math.BigDecimal AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ;
   private java.math.BigDecimal AV60TFPrdExiAlm_To ;
   private java.math.BigDecimal AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ;
   private java.math.BigDecimal AV61TFPrdExiCC ;
   private java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ;
   private java.math.BigDecimal AV62TFPrdExiCC_To ;
   private java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ;
   private java.math.BigDecimal AV63TFPrdCanRes ;
   private java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ;
   private java.math.BigDecimal AV64TFPrdCanRes_To ;
   private java.math.BigDecimal AV48PrdCant ;
   private java.math.BigDecimal AV46Existencias ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String A872RecPrdNum ;
   private String A875RecPrdDsc ;
   private String A488ForPrdDsc ;
   private String A5725RecLote ;
   private String AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ;
   private String AV67emprcod ;
   private String AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ;
   private String AV70barcodpar ;
   private String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ;
   private String AV53TFRecPrdNum ;
   private String AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ;
   private String AV54TFRecPrdNum_Sel ;
   private String AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ;
   private String AV55TFRecPrdDsc ;
   private String AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ;
   private String AV56TFRecPrdDsc_Sel ;
   private String AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ;
   private String AV65TFRecLote ;
   private String AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ;
   private String AV66TFRecLote_Sel ;
   private String scmdbuf ;
   private String lV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ;
   private String lV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ;
   private String lV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A719PrdNum ;
   private String AV49ForPrdDsc ;
   private String GXv_char3[] ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean returnInSub ;
   private boolean AV50IsAuthorizedPrdExiCC ;
   private boolean AV29OrderedDsc ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean Cond_result ;
   private String AV14TextFileLine ;
   private String AV18ColumnsSelectorXML ;
   private String AV20UserCustomValue ;
   private String AV11Filename ;
   private String AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ;
   private String AV30FilterFullText ;
   private String lV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.util.GXFile AV10TextFile ;
   private IDataStoreProvider pr_default ;
   private String[] P09EX2_A719PrdNum ;
   private boolean[] P09EX2_n719PrdNum ;
   private short[] P09EX2_A811RecLin ;
   private byte[] P09EX2_A1273RecLinPro ;
   private String[] P09EX2_A5725RecLote ;
   private java.math.BigDecimal[] P09EX2_A685PrdCanRes ;
   private java.math.BigDecimal[] P09EX2_A705PrdExiCC ;
   private java.math.BigDecimal[] P09EX2_A704PrdExiAlm ;
   private java.math.BigDecimal[] P09EX2_A431FacCon ;
   private String[] P09EX2_A875RecPrdDsc ;
   private String[] P09EX2_A872RecPrdNum ;
   private short[] P09EX2_A2804RecLinMaq ;
   private String[] P09EX2_A130BarCodPar ;
   private byte[] P09EX2_A132BarCodReo ;
   private int[] P09EX2_A129BarCod ;
   private String[] P09EX2_A396EmprCod ;
   private java.math.BigDecimal[] P09EX2_A686PrdCant ;
   private byte[] P09EX2_A490ForPrdUMe ;
   private boolean[] P09EX2_n490ForPrdUMe ;
   private String[] P09EX2_A488ForPrdDsc ;
   private boolean[] P09EX2_n488ForPrdDsc ;
   private java.math.BigDecimal[] P09EX2_A707PrdFacCon ;
   private java.math.BigDecimal[] P09EX2_A1797PrdCanAny ;
   private com.genexus.internet.HttpResponse AV27HttpResponse ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV15ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector7[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV32GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV33GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class cierrerecetastinte_incidencias_wcexportcsv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09EX2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext ,
                                          String AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel ,
                                          String AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum ,
                                          String AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel ,
                                          String AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc ,
                                          java.math.BigDecimal AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon ,
                                          java.math.BigDecimal AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to ,
                                          java.math.BigDecimal AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm ,
                                          java.math.BigDecimal AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to ,
                                          java.math.BigDecimal AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc ,
                                          java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to ,
                                          java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres ,
                                          java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to ,
                                          String AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel ,
                                          String AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote ,
                                          byte AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro ,
                                          byte AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to ,
                                          short AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin ,
                                          short AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          String A5725RecLote ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          short AV28OrderedBy ,
                                          boolean AV29OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV67emprcod ,
                                          int A129BarCod ,
                                          int AV68barcod ,
                                          byte A132BarCodReo ,
                                          byte AV69barcodreo ,
                                          String A130BarCodPar ,
                                          String AV70barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV71reclinmaq ,
                                          String AV78Formulaciontinte_cierrerecetastinte_incidencias_wcds_1_emprcod ,
                                          int AV79Formulaciontinte_cierrerecetastinte_incidencias_wcds_2_barcod ,
                                          byte AV80Formulaciontinte_cierrerecetastinte_incidencias_wcds_3_barcodreo ,
                                          String AV81Formulaciontinte_cierrerecetastinte_incidencias_wcds_4_barcodpar ,
                                          short AV82Formulaciontinte_cierrerecetastinte_incidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[37];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT T1.PrdNum, T1.RecLin, T1.RecLinPro, T1.RecLote, T2.PrdCanRes, T2.PrdExiCC, T2.PrdExiAlm, T1.FacCon, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLinMaq, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.PrdCant, T1.ForPrdUMe, T3.ForPrdDsc, T2.PrdFacCon, T1.PrdCanAny FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (GXutil.strcmp("", AV83Formulaciontinte_cierrerecetastinte_incidencias_wcds_6_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.RecPrdNum) like '%' || UPPER(?)) or ( UPPER(T1.RecPrdDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.FacCon,'99990.99999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiAlm,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdExiCC,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.PrdCanRes,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T1.RecLote) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecLinPro,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecLin,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
         GXv_int9[11] = (byte)(1) ;
         GXv_int9[12] = (byte)(1) ;
         GXv_int9[13] = (byte)(1) ;
         GXv_int9[14] = (byte)(1) ;
         GXv_int9[15] = (byte)(1) ;
         GXv_int9[16] = (byte)(1) ;
         GXv_int9[17] = (byte)(1) ;
         GXv_int9[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV84Formulaciontinte_cierrerecetastinte_incidencias_wcds_7_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85Formulaciontinte_cierrerecetastinte_incidencias_wcds_8_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV86Formulaciontinte_cierrerecetastinte_incidencias_wcds_9_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV87Formulaciontinte_cierrerecetastinte_incidencias_wcds_10_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_cierrerecetastinte_incidencias_wcds_11_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV89Formulaciontinte_cierrerecetastinte_incidencias_wcds_12_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV90Formulaciontinte_cierrerecetastinte_incidencias_wcds_13_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Formulaciontinte_cierrerecetastinte_incidencias_wcds_14_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_cierrerecetastinte_incidencias_wcds_15_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_cierrerecetastinte_incidencias_wcds_16_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_cierrerecetastinte_incidencias_wcds_17_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_cierrerecetastinte_incidencias_wcds_18_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_cierrerecetastinte_incidencias_wcds_19_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_cierrerecetastinte_incidencias_wcds_20_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_cierrerecetastinte_incidencias_wcds_21_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_cierrerecetastinte_incidencias_wcds_22_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_cierrerecetastinte_incidencias_wcds_23_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      if ( ! (0==AV101Formulaciontinte_cierrerecetastinte_incidencias_wcds_24_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int9[36] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV28OrderedBy == 1 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro" ;
      }
      else if ( ( AV28OrderedBy == 1 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLinPro DESC" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLin" ;
      }
      else if ( ( AV28OrderedBy == 2 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLin DESC" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum" ;
      }
      else if ( ( AV28OrderedBy == 3 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdNum DESC" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc" ;
      }
      else if ( ( AV28OrderedBy == 4 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.FacCon" ;
      }
      else if ( ( AV28OrderedBy == 5 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.FacCon DESC" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiAlm" ;
      }
      else if ( ( AV28OrderedBy == 6 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiCC" ;
      }
      else if ( ( AV28OrderedBy == 7 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiCC DESC" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdCanRes" ;
      }
      else if ( ( AV28OrderedBy == 8 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdCanRes DESC" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ! AV29OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote" ;
      }
      else if ( ( AV28OrderedBy == 9 ) && ( AV29OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLote DESC" ;
      }
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
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
                  return conditional_P09EX2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).shortValue() , ((Number) dynConstraints[28]).shortValue() , ((Boolean) dynConstraints[29]).booleanValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] , ((Number) dynConstraints[38]).shortValue() , ((Number) dynConstraints[39]).shortValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09EX2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,5);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,3);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,4);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,3);
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 6);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 6);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 5);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 5);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 4);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               return;
      }
   }

}

